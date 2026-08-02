package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
public class ResolutionsMerger {
    private static final double getHighResolutionOutputSizeshNQ4ISI = java.lang.Math.sqrt(2.3703703703703702d);
    final java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> Camera2StreamConfigurationMap;
    final androidx.camera.core.impl.CameraInfoInternal getHighSpeedVideoFpsRanges;
    final android.util.Rational getHighSpeedVideoFpsRangesFor;
    final android.util.Rational getHighSpeedVideoSizes;
    private final java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> getInputSizeshNQ4ISI;
    private final androidx.camera.core.internal.SupportedOutputSizesSorter getOutputFormats;
    private final android.util.Size getOutputMinFrameDuration;

    private static boolean Camera2StreamConfigurationMap(float f, float f2, float f3) {
        if (f != f2 && f2 != f3) {
            if (f > f2) {
                return f2 < f3;
            }
            if (f2 > f3) {
                return true;
            }
        }
        return false;
    }

    ResolutionsMerger(androidx.camera.core.impl.CameraInternal cameraInternal, java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set) {
        this(androidx.camera.core.impl.utils.TransformUtils.rectToSize(cameraInternal.getCamera2StreamConfigurationMap().getSensorRect()), cameraInternal.getCamera2StreamConfigurationMap(), set);
    }

    private ResolutionsMerger(android.util.Size size, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set) {
        this(size, cameraInfoInternal, set, new androidx.camera.core.internal.SupportedOutputSizesSorter(cameraInfoInternal, size));
    }

    private ResolutionsMerger(android.util.Size size, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set, androidx.camera.core.internal.SupportedOutputSizesSorter supportedOutputSizesSorter) {
        android.util.Rational rational;
        android.util.Rational rational2;
        this.getInputSizeshNQ4ISI = new java.util.HashMap();
        this.getOutputMinFrameDuration = size;
        if (size.getWidth() / size.getHeight() > getHighResolutionOutputSizeshNQ4ISI) {
            rational = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9;
        } else {
            rational = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The closer aspect ratio to the sensor size (");
        sb.append(size);
        sb.append(") is ");
        sb.append(rational);
        sb.append(".");
        androidx.camera.core.Logger.d("ResolutionsMerger", sb.toString());
        this.getHighSpeedVideoSizes = rational;
        if (rational.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3)) {
            rational2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9;
        } else if (rational.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9)) {
            rational2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
        } else {
            throw new java.lang.IllegalArgumentException("Invalid sensor aspect-ratio: ".concat(java.lang.String.valueOf(rational)));
        }
        this.getHighSpeedVideoFpsRangesFor = rational2;
        this.getHighSpeedVideoFpsRanges = cameraInfoInternal;
        this.Camera2StreamConfigurationMap = set;
        this.getOutputFormats = supportedOutputSizesSorter;
    }

    final androidx.camera.core.streamsharing.PreferredChildSize getHighSpeedVideoFpsRanges(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, android.graphics.Rect rect, int i, boolean z) {
        boolean z2;
        android.util.Size size;
        android.util.Size size2;
        android.util.Pair create;
        if (androidx.camera.core.impl.utils.TransformUtils.is90or270(i)) {
            z2 = true;
            rect = new android.graphics.Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            android.util.Size rectToSize = androidx.camera.core.impl.utils.TransformUtils.rectToSize(rect);
            java.util.Iterator<android.util.Size> it = getHighSpeedVideoFpsRanges(useCaseConfig).iterator();
            while (true) {
                if (it.hasNext()) {
                    android.util.Size next = it.next();
                    android.util.Size rectToSize2 = androidx.camera.core.impl.utils.TransformUtils.rectToSize(getHighSpeedVideoFpsRangesFor(next, rectToSize));
                    if (rectToSize2.getHeight() <= rectToSize.getHeight() && rectToSize2.getWidth() <= rectToSize.getWidth()) {
                        create = android.util.Pair.create(next, rectToSize2);
                        break;
                    }
                } else {
                    create = android.util.Pair.create(rectToSize, rectToSize);
                    break;
                }
            }
            size = (android.util.Size) create.first;
            size2 = (android.util.Size) create.second;
        } else {
            android.util.Size rectToSize3 = androidx.camera.core.impl.utils.TransformUtils.rectToSize(rect);
            java.util.List<android.util.Size> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(useCaseConfig);
            java.util.Iterator<android.util.Size> it2 = highSpeedVideoFpsRanges.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    java.util.Iterator<android.util.Size> it3 = highSpeedVideoFpsRanges.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = rectToSize3;
                            break;
                        }
                        size = it3.next();
                        if (size.getHeight() <= rectToSize3.getHeight() && size.getWidth() <= rectToSize3.getWidth()) {
                            break;
                        }
                    }
                } else {
                    android.util.Size next2 = it2.next();
                    if (!getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(rectToSize3), next2) && next2.getHeight() <= rectToSize3.getHeight() && next2.getWidth() <= rectToSize3.getWidth()) {
                        size = next2;
                        break;
                    }
                }
            }
            rect = getHighSpeedVideoFpsRangesFor(rectToSize3, size);
            size2 = size;
        }
        androidx.camera.core.streamsharing.PreferredChildSize preferredChildSize = new androidx.camera.core.streamsharing.PreferredChildSize(rect, size2, size);
        if (!z2) {
            return preferredChildSize;
        }
        android.graphics.Rect cropRectBeforeScaling = preferredChildSize.getCropRectBeforeScaling();
        return new androidx.camera.core.streamsharing.PreferredChildSize(new android.graphics.Rect(cropRectBeforeScaling.top, cropRectBeforeScaling.left, cropRectBeforeScaling.bottom, cropRectBeforeScaling.right), androidx.camera.core.impl.utils.TransformUtils.reverseSize(preferredChildSize.getChildSizeToScale()), preferredChildSize.getOriginalSelectedChildSize());
    }

    final java.util.List<android.util.Size> getHighResolutionOutputSizeshNQ4ISI(android.util.Rational rational, java.util.List<android.util.Size> list, boolean z) {
        java.util.List<android.util.Size> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(rational, list);
        java.util.Collections.sort(highResolutionOutputSizeshNQ4ISI, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
        java.util.HashSet hashSet = new java.util.HashSet(highResolutionOutputSizeshNQ4ISI);
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            java.util.List<android.util.Size> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(it.next());
            if (!z) {
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(rational, highSpeedVideoFpsRanges);
            }
            if (highSpeedVideoFpsRanges.isEmpty()) {
                return new java.util.ArrayList();
            }
            highResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI);
            hashSet.retainAll(getHighSpeedVideoSizes(highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : highResolutionOutputSizeshNQ4ISI) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    final java.util.List<android.util.Size> getHighSpeedVideoFpsRanges(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        android.util.Rational rational;
        if (!this.Camera2StreamConfigurationMap.contains(useCaseConfig)) {
            throw new java.lang.IllegalArgumentException("Invalid child config: ".concat(java.lang.String.valueOf(useCaseConfig)));
        }
        if (this.getInputSizeshNQ4ISI.containsKey(useCaseConfig)) {
            return (java.util.List) java.util.Objects.requireNonNull(this.getInputSizeshNQ4ISI.get(useCaseConfig));
        }
        java.util.List<android.util.Size> sortedSupportedOutputSizes = this.getOutputFormats.getSortedSupportedOutputSizes(useCaseConfig);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : sortedSupportedOutputSizes) {
            java.util.Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (android.util.Rational) it.next();
                if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    break;
                }
            }
            if (rational != null) {
                android.util.Size size2 = (android.util.Size) java.util.Objects.requireNonNull((android.util.Size) hashMap.get(rational));
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = new android.util.Rational(size.getWidth(), size.getHeight());
            }
            arrayList.add(size);
            hashMap.put(rational, size);
        }
        this.getInputSizeshNQ4ISI.put(useCaseConfig, arrayList);
        return arrayList;
    }

    private java.util.List<android.util.Size> getHighSpeedVideoFpsRanges(android.util.Rational rational, java.util.List<android.util.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            if (!getHighSpeedVideoSizes(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private boolean getHighSpeedVideoSizes(android.util.Rational rational, android.util.Size size) {
        if (this.getHighSpeedVideoSizes.equals(rational) || androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
            return false;
        }
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes.floatValue(), rational.floatValue(), getHighSpeedVideoFpsRangesFor(size).floatValue());
    }

    private static java.util.List<android.util.Size> getHighResolutionOutputSizeshNQ4ISI(android.util.Rational rational, java.util.List<android.util.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static java.util.List<android.util.Size> getHighSpeedVideoFpsRangesFor(java.util.Collection<android.util.Size> collection, java.util.List<android.util.Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            java.util.Iterator<android.util.Size> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    android.util.Size next = it.next();
                    if (next.getHeight() <= size.getHeight() && next.getWidth() <= size.getWidth()) {
                        arrayList.add(size);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private static java.util.List<android.util.Size> getHighSpeedVideoSizes(java.util.Collection<android.util.Size> collection, java.util.List<android.util.Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        if (!list.isEmpty()) {
            list = new java.util.ArrayList(new java.util.LinkedHashSet(list));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            java.util.Iterator<android.util.Size> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(size);
                    break;
                }
                android.util.Size next = it.next();
                if (next.getHeight() <= size.getHeight() && next.getWidth() <= size.getWidth()) {
                }
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    private static android.util.Rational getHighSpeedVideoFpsRangesFor(android.util.Size size) {
        if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3)) {
            return androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
        }
        if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9)) {
            return androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9;
        }
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    static class CompareAspectRatioByOverlappingAreaToReference implements java.util.Comparator<android.util.Rational> {
        private final boolean getHighSpeedVideoFpsRanges = true;
        private final android.util.Rational getHighSpeedVideoFpsRangesFor;

        @Override // java.util.Comparator
        public /* synthetic */ int compare(android.util.Rational rational, android.util.Rational rational2) {
            float highSpeedVideoFpsRanges = androidx.camera.core.streamsharing.ResolutionsMerger.getHighSpeedVideoFpsRanges(rational, this.getHighSpeedVideoFpsRangesFor);
            float highSpeedVideoFpsRanges2 = androidx.camera.core.streamsharing.ResolutionsMerger.getHighSpeedVideoFpsRanges(rational2, this.getHighSpeedVideoFpsRangesFor);
            if (this.getHighSpeedVideoFpsRanges) {
                return java.lang.Float.compare(highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges);
            }
            return java.lang.Float.compare(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2);
        }

        CompareAspectRatioByOverlappingAreaToReference(android.util.Rational rational) {
            this.getHighSpeedVideoFpsRangesFor = rational;
        }
    }

    static /* synthetic */ float getHighSpeedVideoFpsRanges(android.util.Rational rational, android.util.Rational rational2) {
        float floatValue = rational.floatValue();
        float floatValue2 = rational2.floatValue();
        return floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
    }

    private static android.graphics.Rect getHighSpeedVideoFpsRangesFor(android.util.Size size, android.util.Size size2) {
        android.graphics.RectF rectF;
        android.graphics.RectF rectF2;
        android.util.Rational rational = new android.util.Rational(size2.getWidth(), size2.getHeight());
        int width = size.getWidth();
        int height = size.getHeight();
        android.util.Rational rational2 = new android.util.Rational(size.getWidth(), size.getHeight());
        if (rational.floatValue() == rational2.floatValue()) {
            rectF2 = new android.graphics.RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rational2.floatValue()) {
                float f = width;
                float floatValue = f / rational.floatValue();
                float f2 = (height - floatValue) / 2.0f;
                rectF = new android.graphics.RectF(0.0f, f2, f, floatValue + f2);
            } else {
                float f3 = height;
                float floatValue2 = rational.floatValue() * f3;
                float f4 = (width - floatValue2) / 2.0f;
                rectF = new android.graphics.RectF(f4, 0.0f, floatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF2.round(rect);
        return rect;
    }

    final java.util.List<android.util.Size> getHighSpeedVideoFpsRanges(java.util.List<android.util.Size> list, boolean z) {
        java.util.List list2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3, new java.util.ArrayList());
        hashMap.put(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9, new java.util.ArrayList());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3);
        arrayList.add(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9);
        for (android.util.Size size : list) {
            if (size.getHeight() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list2 = null;
                        break;
                    }
                    android.util.Rational rational = (android.util.Rational) it.next();
                    if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                        list2 = (java.util.List) hashMap.get(rational);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new java.util.ArrayList();
                    android.util.Rational rational2 = new android.util.Rational(size.getWidth(), size.getHeight());
                    arrayList.add(rational2);
                    hashMap.put(rational2, list2);
                }
                ((java.util.List) java.util.Objects.requireNonNull(list2)).add(size);
            }
        }
        java.util.ArrayList<android.util.Rational> arrayList2 = new java.util.ArrayList(hashMap.keySet());
        android.util.Size size2 = this.getOutputMinFrameDuration;
        java.util.Collections.sort(arrayList2, new androidx.camera.core.streamsharing.ResolutionsMerger.CompareAspectRatioByOverlappingAreaToReference(new android.util.Rational(size2.getWidth(), size2.getHeight())));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (android.util.Rational rational3 : arrayList2) {
            if (!rational3.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9) && !rational3.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3)) {
                arrayList3.addAll(getHighResolutionOutputSizeshNQ4ISI(rational3, (java.util.List) java.util.Objects.requireNonNull((java.util.List) hashMap.get(rational3)), z));
            }
        }
        return arrayList3;
    }
}
