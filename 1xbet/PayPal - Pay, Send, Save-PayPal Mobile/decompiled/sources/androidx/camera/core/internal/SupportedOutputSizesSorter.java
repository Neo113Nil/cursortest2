package androidx.camera.core.internal;

/* loaded from: classes6.dex */
public class SupportedOutputSizesSorter {
    private final androidx.camera.core.impl.CameraInfoInternal Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.internal.SupportedOutputSizesSorterLegacy getHighSpeedVideoFpsRangesFor;
    private final android.util.Rational getHighSpeedVideoSizes;

    public SupportedOutputSizesSorter(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, android.util.Size size) {
        android.util.Rational rational;
        this.Camera2StreamConfigurationMap = cameraInfoInternal;
        this.getHighSpeedVideoFpsRanges = cameraInfoInternal.getSensorRotationDegrees();
        this.getHighResolutionOutputSizeshNQ4ISI = cameraInfoInternal.getLensFacing();
        if (size != null) {
            rational = new android.util.Rational(size.getWidth(), size.getHeight());
        } else {
            java.util.List<android.util.Size> supportedResolutions = cameraInfoInternal.getSupportedResolutions(256);
            if (supportedResolutions.isEmpty()) {
                rational = null;
            } else {
                android.util.Size size2 = (android.util.Size) java.util.Collections.max(supportedResolutions, new androidx.camera.core.impl.utils.CompareSizesByArea());
                rational = new android.util.Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.getHighSpeedVideoSizes = rational;
        this.getHighSpeedVideoFpsRangesFor = new androidx.camera.core.internal.SupportedOutputSizesSorterLegacy(cameraInfoInternal, rational);
    }

    public java.util.List<android.util.Size> getSortedSupportedOutputSizes(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        android.util.Size[] sizeArr;
        android.util.Rational Camera2StreamConfigurationMap;
        androidx.camera.core.impl.ImageOutputConfig imageOutputConfig = (androidx.camera.core.impl.ImageOutputConfig) useCaseConfig;
        java.util.List<android.util.Size> customOrderedResolutions = imageOutputConfig.getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null) {
            return customOrderedResolutions;
        }
        androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector = imageOutputConfig.getResolutionSelector(null);
        java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> supportedResolutions = imageOutputConfig.getSupportedResolutions(null);
        int inputFormat = useCaseConfig.getInputFormat();
        if (supportedResolutions != null) {
            for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : supportedResolutions) {
                if (((java.lang.Integer) pair.first).intValue() == inputFormat) {
                    sizeArr = (android.util.Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        java.util.List<android.util.Size> asList = sizeArr == null ? null : java.util.Arrays.asList(sizeArr);
        if (asList == null) {
            asList = this.Camera2StreamConfigurationMap.getSupportedResolutions(inputFormat);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(asList);
        java.util.Collections.sort(arrayList, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
        if (arrayList.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The retrieved supported resolutions from camera info internal is empty. Format is ");
            sb.append(inputFormat);
            sb.append(".");
            androidx.camera.core.Logger.w("SupportedOutputSizesCollector", sb.toString());
        }
        if (resolutionSelector == null) {
            androidx.camera.core.internal.SupportedOutputSizesSorterLegacy supportedOutputSizesSorterLegacy = this.getHighSpeedVideoFpsRangesFor;
            if (arrayList.isEmpty()) {
                return arrayList;
            }
            java.util.ArrayList<android.util.Size> arrayList2 = new java.util.ArrayList(arrayList);
            java.util.Collections.sort(arrayList2, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            android.util.Size maxResolution = imageOutputConfig.getMaxResolution(null);
            android.util.Size size = (android.util.Size) arrayList2.get(0);
            if (maxResolution == null || androidx.camera.core.internal.utils.SizeUtil.getArea(size) < androidx.camera.core.internal.utils.SizeUtil.getArea(maxResolution)) {
                maxResolution = size;
            }
            android.util.Size highSpeedVideoFpsRanges = androidx.camera.core.internal.SupportedOutputSizesSorterLegacy.getHighSpeedVideoFpsRanges(imageOutputConfig.getTargetResolution(null), imageOutputConfig.getTargetRotation(0), supportedOutputSizesSorterLegacy.Camera2StreamConfigurationMap, supportedOutputSizesSorterLegacy.getHighSpeedVideoFpsRangesFor);
            android.util.Size size2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA;
            int area = androidx.camera.core.internal.utils.SizeUtil.getArea(androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA);
            if (androidx.camera.core.internal.utils.SizeUtil.getArea(maxResolution) < area) {
                size2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_ZERO;
            } else if (highSpeedVideoFpsRanges != null && androidx.camera.core.internal.utils.SizeUtil.getArea(highSpeedVideoFpsRanges) < area) {
                size2 = highSpeedVideoFpsRanges;
            }
            for (android.util.Size size3 : arrayList2) {
                if (androidx.camera.core.internal.utils.SizeUtil.getArea(size3) <= androidx.camera.core.internal.utils.SizeUtil.getArea(maxResolution) && androidx.camera.core.internal.utils.SizeUtil.getArea(size3) >= androidx.camera.core.internal.utils.SizeUtil.getArea(size2) && !arrayList3.contains(size3)) {
                    arrayList3.add(size3);
                }
            }
            if (arrayList3.isEmpty()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = ");
                sb2.append(size2);
                sb2.append("\nmaxSize = ");
                sb2.append(maxResolution);
                sb2.append("\ninitial size list: ");
                sb2.append(arrayList2);
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            if (imageOutputConfig.hasTargetAspectRatio()) {
                Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(imageOutputConfig.getTargetAspectRatio(), supportedOutputSizesSorterLegacy.getHighResolutionOutputSizeshNQ4ISI);
            } else {
                android.util.Size highSpeedVideoFpsRanges2 = androidx.camera.core.internal.SupportedOutputSizesSorterLegacy.getHighSpeedVideoFpsRanges(imageOutputConfig.getTargetResolution(null), imageOutputConfig.getTargetRotation(0), supportedOutputSizesSorterLegacy.Camera2StreamConfigurationMap, supportedOutputSizesSorterLegacy.getHighSpeedVideoFpsRangesFor);
                Camera2StreamConfigurationMap = highSpeedVideoFpsRanges2 != null ? androidx.camera.core.internal.SupportedOutputSizesSorterLegacy.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges2, arrayList3) : null;
            }
            if (highSpeedVideoFpsRanges == null) {
                highSpeedVideoFpsRanges = imageOutputConfig.getDefaultResolution(null);
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            new java.util.HashMap();
            if (Camera2StreamConfigurationMap == null) {
                arrayList4.addAll(arrayList3);
                if (highSpeedVideoFpsRanges != null) {
                    getHighSpeedVideoFpsRangesFor(arrayList4, highSpeedVideoFpsRanges, true);
                    return arrayList4;
                }
            } else {
                java.util.Map<android.util.Rational, java.util.List<android.util.Size>> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(arrayList3);
                if (highSpeedVideoFpsRanges != null) {
                    java.util.Iterator<android.util.Rational> it = Camera2StreamConfigurationMap2.keySet().iterator();
                    while (it.hasNext()) {
                        getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap2.get(it.next()), highSpeedVideoFpsRanges, true);
                    }
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList(Camera2StreamConfigurationMap2.keySet());
                java.util.Collections.sort(arrayList5, new androidx.camera.core.impl.utils.AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(Camera2StreamConfigurationMap, supportedOutputSizesSorterLegacy.getHighSpeedVideoFpsRanges));
                java.util.Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    for (android.util.Size size4 : Camera2StreamConfigurationMap2.get((android.util.Rational) it2.next())) {
                        if (!arrayList4.contains(size4)) {
                            arrayList4.add(size4);
                        }
                    }
                }
            }
            return arrayList4;
        }
        android.util.Size maxResolution2 = imageOutputConfig.getMaxResolution(null);
        int targetRotation = imageOutputConfig.getTargetRotation(0);
        if (!useCaseConfig.isHighResolutionDisabled(false)) {
            int inputFormat2 = useCaseConfig.getInputFormat();
            if (resolutionSelector.getAllowedResolutionMode() == 1) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.addAll(arrayList);
                arrayList6.addAll(this.Camera2StreamConfigurationMap.getSupportedHighResolutions(inputFormat2));
                java.util.Collections.sort(arrayList6, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
                arrayList = arrayList6;
            }
        }
        java.util.ArrayList arrayList7 = arrayList;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("useCaseConfig = ");
        sb3.append(useCaseConfig);
        sb3.append(", candidateSizes = ");
        sb3.append(arrayList7);
        androidx.camera.core.Logger.d("SupportedOutputSizesCollector", sb3.toString());
        return sortSupportedOutputSizesByResolutionSelector(imageOutputConfig.getResolutionSelector(), arrayList7, maxResolution2, targetRotation, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static java.util.List<android.util.Size> sortSupportedOutputSizesByResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector, java.util.List<android.util.Size> list, android.util.Size size, int i, android.util.Rational rational, int i2, int i3) {
        androidx.camera.core.resolutionselector.AspectRatioStrategy aspectRatioStrategy = resolutionSelector.getAspectRatioStrategy();
        java.util.Map<android.util.Rational, java.util.List<android.util.Size>> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(list);
        boolean z = rational == null || rational.getNumerator() >= rational.getDenominator();
        android.util.Rational highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(aspectRatioStrategy.getPreferredAspectRatio(), z);
        if (aspectRatioStrategy.getFallbackRule() == 0) {
            android.util.Rational highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(aspectRatioStrategy.getPreferredAspectRatio(), z);
            java.util.Iterator it = new java.util.ArrayList(Camera2StreamConfigurationMap.keySet()).iterator();
            while (it.hasNext()) {
                android.util.Rational rational2 = (android.util.Rational) it.next();
                if (!rational2.equals(highResolutionOutputSizeshNQ4ISI2)) {
                    Camera2StreamConfigurationMap.remove(rational2);
                }
            }
        }
        java.util.ArrayList<android.util.Rational> arrayList = new java.util.ArrayList(Camera2StreamConfigurationMap.keySet());
        java.util.Collections.sort(arrayList, new androidx.camera.core.impl.utils.AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(highResolutionOutputSizeshNQ4ISI, rational));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (android.util.Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, Camera2StreamConfigurationMap.get(rational3));
        }
        if (size != null) {
            int area = androidx.camera.core.internal.utils.SizeUtil.getArea(size);
            java.util.Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                java.util.List<android.util.Size> list2 = (java.util.List) linkedHashMap.get((android.util.Rational) it2.next());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (android.util.Size size2 : list2) {
                    if (androidx.camera.core.internal.utils.SizeUtil.getArea(size2) <= area) {
                        arrayList2.add(size2);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        androidx.camera.core.resolutionselector.ResolutionStrategy resolutionStrategy = resolutionSelector.getResolutionStrategy();
        if (resolutionStrategy != null) {
            java.util.Iterator it3 = linkedHashMap.keySet().iterator();
            while (it3.hasNext()) {
                java.util.List list3 = (java.util.List) linkedHashMap.get((android.util.Rational) it3.next());
                if (!list3.isEmpty()) {
                    int fallbackRule = resolutionStrategy.getFallbackRule();
                    if (!resolutionStrategy.equals(androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY)) {
                        android.util.Size boundSize = resolutionStrategy.getBoundSize();
                        if (fallbackRule == 0) {
                            boolean contains = list3.contains(boundSize);
                            list3.clear();
                            if (contains) {
                                list3.add(boundSize);
                            }
                        } else if (fallbackRule == 1) {
                            getHighSpeedVideoFpsRangesFor(list3, boundSize, true);
                        } else if (fallbackRule == 2) {
                            getHighSpeedVideoFpsRangesFor(list3, boundSize, false);
                        } else if (fallbackRule == 3) {
                            getHighResolutionOutputSizeshNQ4ISI(list3, boundSize, true);
                        } else if (fallbackRule == 4) {
                            getHighResolutionOutputSizeshNQ4ISI(list3, boundSize, false);
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it4 = linkedHashMap.values().iterator();
        while (it4.hasNext()) {
            for (android.util.Size size3 : (java.util.List) it4.next()) {
                if (!arrayList3.contains(size3)) {
                    arrayList3.add(size3);
                }
            }
        }
        androidx.camera.core.resolutionselector.ResolutionFilter resolutionFilter = resolutionSelector.getResolutionFilter();
        if (resolutionFilter == null) {
            return arrayList3;
        }
        java.util.List<android.util.Size> filter = resolutionFilter.filter(new java.util.ArrayList(arrayList3), androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i), i2, i3 == 1));
        if (arrayList3.containsAll(filter)) {
            return filter;
        }
        throw new java.lang.IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void getHighSpeedVideoFpsRangesFor(java.util.List<android.util.Size> list, android.util.Size size, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            android.util.Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        java.util.Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.util.List<android.util.Size> list, android.util.Size size, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            android.util.Size size2 = list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    private static android.util.Rational getHighResolutionOutputSizeshNQ4ISI(int i, boolean z) {
        if (i == -1 || i == 0) {
            if (z) {
                return androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
            }
            return androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_3_4;
        }
        if (i != 1) {
            androidx.camera.core.Logger.e("SupportedOutputSizesCollector", "Undefined target aspect ratio: ".concat(java.lang.String.valueOf(i)));
            return null;
        }
        if (z) {
            return androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9;
        }
        return androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_9_16;
    }

    static java.util.List<android.util.Rational> getHighSpeedVideoSizes(java.util.List<android.util.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3);
        arrayList.add(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9);
        for (android.util.Size size : list) {
            android.util.Rational rational = new android.util.Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, (android.util.Rational) it.next())) {
                            break;
                        }
                    } else {
                        arrayList.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private static java.util.Map<android.util.Rational, java.util.List<android.util.Size>> Camera2StreamConfigurationMap(java.util.List<android.util.Size> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<android.util.Rational> it = getHighSpeedVideoSizes(list).iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), new java.util.ArrayList());
        }
        for (android.util.Size size : list) {
            for (android.util.Rational rational : hashMap.keySet()) {
                if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    ((java.util.List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }
}
