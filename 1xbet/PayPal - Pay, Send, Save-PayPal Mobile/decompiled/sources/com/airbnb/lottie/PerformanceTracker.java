package com.airbnb.lottie;

/* loaded from: classes7.dex */
public class PerformanceTracker {
    boolean getHighSpeedVideoSizes = false;
    private final java.util.Set<com.airbnb.lottie.PerformanceTracker.FrameListener> getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.ArraySet();
    private final java.util.Map<java.lang.String, com.airbnb.lottie.utils.MeanCalculator> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    private final java.util.Comparator<androidx.core.util.Pair<java.lang.String, java.lang.Float>> Camera2StreamConfigurationMap = new java.util.Comparator<androidx.core.util.Pair<java.lang.String, java.lang.Float>>() { // from class: com.airbnb.lottie.PerformanceTracker.1
        @Override // java.util.Comparator
        public /* synthetic */ int compare(androidx.core.util.Pair<java.lang.String, java.lang.Float> pair, androidx.core.util.Pair<java.lang.String, java.lang.Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    public interface FrameListener {
        void onFrameRendered(float f);
    }

    public void recordRenderTime(java.lang.String str, float f) {
        if (this.getHighSpeedVideoSizes) {
            com.airbnb.lottie.utils.MeanCalculator meanCalculator = this.getHighSpeedVideoFpsRangesFor.get(str);
            if (meanCalculator == null) {
                meanCalculator = new com.airbnb.lottie.utils.MeanCalculator();
                this.getHighSpeedVideoFpsRangesFor.put(str, meanCalculator);
            }
            meanCalculator.add(f);
            if (str.equals("__container")) {
                java.util.Iterator<com.airbnb.lottie.PerformanceTracker.FrameListener> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                while (it.hasNext()) {
                    it.next().onFrameRendered(f);
                }
            }
        }
    }

    public void addFrameListener(com.airbnb.lottie.PerformanceTracker.FrameListener frameListener) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(frameListener);
    }

    public void removeFrameListener(com.airbnb.lottie.PerformanceTracker.FrameListener frameListener) {
        this.getHighResolutionOutputSizeshNQ4ISI.remove(frameListener);
    }

    public void clearRenderTimes() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    public void logRenderTimes() {
        if (this.getHighSpeedVideoSizes) {
            java.util.List<androidx.core.util.Pair<java.lang.String, java.lang.Float>> sortedRenderTimes = getSortedRenderTimes();
            for (int i = 0; i < sortedRenderTimes.size(); i++) {
                androidx.core.util.Pair<java.lang.String, java.lang.Float> pair = sortedRenderTimes.get(i);
                new java.lang.Object[]{pair.first, pair.second};
            }
        }
    }

    public java.util.List<androidx.core.util.Pair<java.lang.String, java.lang.Float>> getSortedRenderTimes() {
        if (!this.getHighSpeedVideoSizes) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor.size());
        for (java.util.Map.Entry<java.lang.String, com.airbnb.lottie.utils.MeanCalculator> entry : this.getHighSpeedVideoFpsRangesFor.entrySet()) {
            arrayList.add(new androidx.core.util.Pair(entry.getKey(), java.lang.Float.valueOf(entry.getValue().getMean())));
        }
        java.util.Collections.sort(arrayList, this.Camera2StreamConfigurationMap);
        return arrayList;
    }
}
