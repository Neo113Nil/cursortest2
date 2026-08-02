package androidx.camera.video;

/* loaded from: classes6.dex */
class QualityRatioToResolutionsTable {
    private static final java.util.Map<java.lang.Integer, android.util.Rational> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<androidx.camera.video.Quality, android.util.Range<java.lang.Integer>> getHighSpeedVideoSizes;
    final java.util.Map<androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio, java.util.List<android.util.Size>> getHighSpeedVideoFpsRanges = new java.util.HashMap();

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        hashMap.put(androidx.camera.video.Quality.UHD, android.util.Range.create(2160, 4319));
        hashMap.put(androidx.camera.video.Quality.FHD, android.util.Range.create(1080, 1439));
        hashMap.put(androidx.camera.video.Quality.HD, android.util.Range.create(java.lang.Integer.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT), 1079));
        hashMap.put(androidx.camera.video.Quality.SD, android.util.Range.create(241, 719));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap2;
        hashMap2.put(0, androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3);
        hashMap2.put(1, androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9);
    }

    QualityRatioToResolutionsTable(java.util.List<android.util.Size> list, java.util.Map<androidx.camera.video.Quality, android.util.Size> map) {
        java.lang.Integer num;
        androidx.camera.video.Quality quality;
        for (androidx.camera.video.Quality quality2 : getHighSpeedVideoSizes.keySet()) {
            this.getHighSpeedVideoFpsRanges.put(androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio.Camera2StreamConfigurationMap(quality2, -1), new java.util.ArrayList());
            java.util.Iterator<java.lang.Integer> it = getHighResolutionOutputSizeshNQ4ISI.keySet().iterator();
            while (it.hasNext()) {
                this.getHighSpeedVideoFpsRanges.put(androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio.Camera2StreamConfigurationMap(quality2, it.next().intValue()), new java.util.ArrayList());
            }
        }
        for (java.util.Map.Entry<androidx.camera.video.Quality, android.util.Size> entry : map.entrySet()) {
            ((java.util.List) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRanges.get(androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio.Camera2StreamConfigurationMap(entry.getKey(), -1)))).add(entry.getValue());
        }
        for (android.util.Size size : list) {
            java.util.Iterator<java.util.Map.Entry<androidx.camera.video.Quality, android.util.Range<java.lang.Integer>>> it2 = getHighSpeedVideoSizes.entrySet().iterator();
            while (true) {
                num = null;
                if (!it2.hasNext()) {
                    quality = null;
                    break;
                }
                java.util.Map.Entry<androidx.camera.video.Quality, android.util.Range<java.lang.Integer>> next = it2.next();
                if (next.getValue().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(size.getHeight()))) {
                    quality = next.getKey();
                    break;
                }
            }
            if (quality != null) {
                java.util.Iterator<java.util.Map.Entry<java.lang.Integer, android.util.Rational>> it3 = getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    java.util.Map.Entry<java.lang.Integer, android.util.Rational> next2 = it3.next();
                    if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, next2.getValue(), androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_QVGA)) {
                        num = next2.getKey();
                        break;
                    }
                }
                if (num != null) {
                    ((java.util.List) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRanges.get(androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio.Camera2StreamConfigurationMap(quality, num.intValue())))).add(size);
                }
            }
        }
        for (java.util.Map.Entry<androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio, java.util.List<android.util.Size>> entry2 : this.getHighSpeedVideoFpsRanges.entrySet()) {
            android.util.Size size2 = map.get(entry2.getKey().getHighResolutionOutputSizeshNQ4ISI());
            if (size2 != null) {
                final int area = androidx.camera.core.internal.utils.SizeUtil.getArea(size2);
                java.util.Collections.sort(entry2.getValue(), new java.util.Comparator() { // from class: androidx.camera.video.QualityRatioToResolutionsTable$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.camera.video.QualityRatioToResolutionsTable.Camera2StreamConfigurationMap(area, (android.util.Size) obj, (android.util.Size) obj2);
                    }
                });
            }
        }
    }

    static /* synthetic */ int Camera2StreamConfigurationMap(int i, android.util.Size size, android.util.Size size2) {
        return java.lang.Math.abs(androidx.camera.core.internal.utils.SizeUtil.getArea(size) - i) - java.lang.Math.abs(androidx.camera.core.internal.utils.SizeUtil.getArea(size2) - i);
    }

    static abstract class QualityRatio {
        abstract androidx.camera.video.Quality getHighResolutionOutputSizeshNQ4ISI();

        abstract int getHighSpeedVideoFpsRangesFor();

        QualityRatio() {
        }

        static androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio Camera2StreamConfigurationMap(androidx.camera.video.Quality quality, int i) {
            return new androidx.camera.video.AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality, i);
        }
    }
}
