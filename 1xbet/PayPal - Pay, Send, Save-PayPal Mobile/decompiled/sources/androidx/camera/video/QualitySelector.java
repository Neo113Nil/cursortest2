package androidx.camera.video;

/* loaded from: classes.dex */
public final class QualitySelector {
    public static final androidx.camera.video.QualitySelector NONE = new androidx.camera.video.QualitySelector(java.util.Collections.emptyList(), androidx.camera.video.FallbackStrategy.getHighSpeedVideoSizes);
    private final java.util.List<androidx.camera.video.Quality> Camera2StreamConfigurationMap;
    private final androidx.camera.video.FallbackStrategy getHighSpeedVideoSizes;

    @java.lang.Deprecated
    public static java.util.List<androidx.camera.video.Quality> getSupportedQualities(androidx.camera.core.CameraInfo cameraInfo) {
        return androidx.camera.video.Recorder.getVideoCapabilities(cameraInfo).getSupportedQualities(androidx.camera.core.DynamicRange.SDR);
    }

    @java.lang.Deprecated
    public static boolean isQualitySupported(androidx.camera.core.CameraInfo cameraInfo, androidx.camera.video.Quality quality) {
        return androidx.camera.video.Recorder.getVideoCapabilities(cameraInfo).isQualitySupported(quality, androidx.camera.core.DynamicRange.SDR);
    }

    public static java.util.Map<androidx.camera.video.Quality, android.util.Size> getQualityToResolutionMap(androidx.camera.video.VideoCapabilities videoCapabilities, androidx.camera.core.DynamicRange dynamicRange) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.video.Quality quality : videoCapabilities.getSupportedQualities(dynamicRange)) {
            hashMap.put(quality, (android.util.Size) java.util.Objects.requireNonNull(videoCapabilities.getResolution(quality, dynamicRange)));
        }
        return hashMap;
    }

    private QualitySelector(java.util.List<androidx.camera.video.Quality> list, androidx.camera.video.FallbackStrategy fallbackStrategy) {
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.getHighSpeedVideoSizes = fallbackStrategy;
    }

    public static androidx.camera.video.QualitySelector from(androidx.camera.video.Quality quality) {
        return from(quality, androidx.camera.video.FallbackStrategy.getHighSpeedVideoSizes);
    }

    public static androidx.camera.video.QualitySelector from(androidx.camera.video.Quality quality, androidx.camera.video.FallbackStrategy fallbackStrategy) {
        androidx.core.util.Preconditions.checkNotNull(quality, "quality cannot be null");
        androidx.core.util.Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        androidx.core.util.Preconditions.checkArgument(androidx.camera.video.Quality.getHighSpeedVideoFpsRangesFor(quality), "Invalid quality: ".concat(java.lang.String.valueOf(quality)));
        return new androidx.camera.video.QualitySelector(java.util.Collections.singletonList(quality), fallbackStrategy);
    }

    public static androidx.camera.video.QualitySelector fromOrderedList(java.util.List<androidx.camera.video.Quality> list) {
        return fromOrderedList(list, androidx.camera.video.FallbackStrategy.getHighSpeedVideoSizes);
    }

    public static androidx.camera.video.QualitySelector fromOrderedList(java.util.List<androidx.camera.video.Quality> list, androidx.camera.video.FallbackStrategy fallbackStrategy) {
        androidx.core.util.Preconditions.checkNotNull(list, "qualities cannot be null");
        androidx.core.util.Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        androidx.core.util.Preconditions.checkArgument(!list.isEmpty(), "qualities cannot be empty");
        for (androidx.camera.video.Quality quality : list) {
            androidx.core.util.Preconditions.checkArgument(androidx.camera.video.Quality.getHighSpeedVideoFpsRangesFor(quality), "qualities contain invalid quality: ".concat(java.lang.String.valueOf(quality)));
        }
        return new androidx.camera.video.QualitySelector(list, fallbackStrategy);
    }

    public final java.util.List<androidx.camera.video.Quality> getPrioritizedQualities(java.util.List<androidx.camera.video.Quality> list) {
        androidx.camera.video.Quality highSpeedVideoFpsRangesFor;
        if (list.isEmpty()) {
            androidx.camera.core.Logger.w("QualitySelector", "No supported quality on the device.");
            return new java.util.ArrayList();
        }
        androidx.camera.core.Logger.d("QualitySelector", "supportedQualities = ".concat(java.lang.String.valueOf(list)));
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<androidx.camera.video.Quality> it = this.Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.camera.video.Quality next = it.next();
            if (next == androidx.camera.video.Quality.HIGHEST) {
                linkedHashSet.addAll(list);
                break;
            }
            if (next == androidx.camera.video.Quality.LOWEST) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list);
                java.util.Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(next)) {
                linkedHashSet.add(next);
            } else {
                androidx.camera.core.Logger.w("QualitySelector", "quality is not supported and will be ignored: ".concat(java.lang.String.valueOf(next)));
            }
        }
        if (!list.isEmpty() && !linkedHashSet.containsAll(list)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Select quality by fallbackStrategy = ");
            sb.append(this.getHighSpeedVideoSizes);
            androidx.camera.core.Logger.d("QualitySelector", sb.toString());
            if (this.getHighSpeedVideoSizes != androidx.camera.video.FallbackStrategy.getHighSpeedVideoSizes) {
                androidx.core.util.Preconditions.checkState(this.getHighSpeedVideoSizes instanceof androidx.camera.video.FallbackStrategy.RuleStrategy, "Currently only support type RuleStrategy");
                androidx.camera.video.FallbackStrategy.RuleStrategy ruleStrategy = (androidx.camera.video.FallbackStrategy.RuleStrategy) this.getHighSpeedVideoSizes;
                java.util.List<androidx.camera.video.Quality> sortedQualities = androidx.camera.video.Quality.getSortedQualities();
                if (ruleStrategy.getHighSpeedVideoFpsRangesFor() == androidx.camera.video.Quality.HIGHEST) {
                    highSpeedVideoFpsRangesFor = sortedQualities.get(0);
                } else if (ruleStrategy.getHighSpeedVideoFpsRangesFor() == androidx.camera.video.Quality.LOWEST) {
                    highSpeedVideoFpsRangesFor = sortedQualities.get(sortedQualities.size() - 1);
                } else {
                    highSpeedVideoFpsRangesFor = ruleStrategy.getHighSpeedVideoFpsRangesFor();
                }
                int indexOf = sortedQualities.indexOf(highSpeedVideoFpsRangesFor);
                androidx.core.util.Preconditions.checkState(indexOf != -1);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i = indexOf - 1; i >= 0; i--) {
                    androidx.camera.video.Quality quality = sortedQualities.get(i);
                    if (list.contains(quality)) {
                        arrayList2.add(quality);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (int i2 = indexOf + 1; i2 < sortedQualities.size(); i2++) {
                    androidx.camera.video.Quality quality2 = sortedQualities.get(i2);
                    if (list.contains(quality2)) {
                        arrayList3.add(quality2);
                    }
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("sizeSortedQualities = ");
                sb2.append(sortedQualities);
                sb2.append(", fallback quality = ");
                sb2.append(highSpeedVideoFpsRangesFor);
                sb2.append(", largerQualities = ");
                sb2.append(arrayList2);
                sb2.append(", smallerQualities = ");
                sb2.append(arrayList3);
                androidx.camera.core.Logger.d("QualitySelector", sb2.toString());
                int highSpeedVideoSizes = ruleStrategy.getHighSpeedVideoSizes();
                if (highSpeedVideoSizes != 0) {
                    if (highSpeedVideoSizes == 1) {
                        linkedHashSet.addAll(arrayList2);
                        linkedHashSet.addAll(arrayList3);
                    } else if (highSpeedVideoSizes == 2) {
                        linkedHashSet.addAll(arrayList2);
                    } else if (highSpeedVideoSizes == 3) {
                        linkedHashSet.addAll(arrayList3);
                        linkedHashSet.addAll(arrayList2);
                    } else if (highSpeedVideoSizes == 4) {
                        linkedHashSet.addAll(arrayList3);
                    } else {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unhandled fallback strategy: ");
                        sb3.append(this.getHighSpeedVideoSizes);
                        throw new java.lang.AssertionError(sb3.toString());
                    }
                }
            }
        }
        return new java.util.ArrayList(linkedHashSet);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QualitySelector{preferredQualities=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", fallbackStrategy=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public static android.util.Size getResolution(androidx.camera.core.CameraInfo cameraInfo, androidx.camera.video.Quality quality) {
        androidx.core.util.Preconditions.checkArgument(androidx.camera.video.Quality.getHighSpeedVideoFpsRangesFor(quality), "Invalid quality: ".concat(java.lang.String.valueOf(quality)));
        return androidx.camera.video.Recorder.getVideoCapabilities(cameraInfo).getResolution(quality, androidx.camera.core.DynamicRange.SDR);
    }
}
