package com.airbnb.lottie;

/* loaded from: classes.dex */
public class LottieComposition {
    private android.graphics.Rect Camera2StreamConfigurationMap;
    private java.util.Map<java.lang.String, com.airbnb.lottie.model.Font> getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private androidx.collection.SparseArrayCompat<com.airbnb.lottie.model.FontCharacter> getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private java.util.List<com.airbnb.lottie.model.layer.Layer> getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private androidx.collection.LongSparseArray<com.airbnb.lottie.model.layer.Layer> getOutputFormats;
    private java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> getOutputMinFrameDuration;
    private java.util.Map<java.lang.String, java.util.List<com.airbnb.lottie.model.layer.Layer>> getOutputMinFrameDurationlomOqCM;
    private java.util.List<com.airbnb.lottie.model.Marker> getOutputSizeshNQ4ISI;
    private float getOutputStallDurationlomOqCM;
    private int isOutputSupportedFor;
    private int unwrapAs;
    private final com.airbnb.lottie.PerformanceTracker getOutputSizes = new com.airbnb.lottie.PerformanceTracker();
    private final java.util.HashSet<java.lang.String> getValidOutputFormatsForInputhNQ4ISI = new java.util.HashSet<>();
    private int getOutputStallDuration = 0;

    public void init(android.graphics.Rect rect, float f, float f2, float f3, java.util.List<com.airbnb.lottie.model.layer.Layer> list, androidx.collection.LongSparseArray<com.airbnb.lottie.model.layer.Layer> longSparseArray, java.util.Map<java.lang.String, java.util.List<com.airbnb.lottie.model.layer.Layer>> map, java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> map2, float f4, androidx.collection.SparseArrayCompat<com.airbnb.lottie.model.FontCharacter> sparseArrayCompat, java.util.Map<java.lang.String, com.airbnb.lottie.model.Font> map3, java.util.List<com.airbnb.lottie.model.Marker> list2, int i, int i2) {
        this.Camera2StreamConfigurationMap = rect;
        this.getOutputStallDurationlomOqCM = f;
        this.getHighSpeedVideoSizes = f2;
        this.getHighSpeedVideoFpsRanges = f3;
        this.getInputFormats = list;
        this.getOutputFormats = longSparseArray;
        this.getOutputMinFrameDurationlomOqCM = map;
        this.getOutputMinFrameDuration = map2;
        this.getHighSpeedVideoSizesFor = f4;
        this.getHighSpeedVideoFpsRangesFor = sparseArrayCompat;
        this.getHighResolutionOutputSizeshNQ4ISI = map3;
        this.getOutputSizeshNQ4ISI = list2;
        this.isOutputSupportedFor = i;
        this.unwrapAs = i2;
    }

    public void addWarning(java.lang.String str) {
        com.airbnb.lottie.utils.Logger.warning(str);
        this.getValidOutputFormatsForInputhNQ4ISI.add(str);
    }

    public void setHasDashPattern(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    public void incrementMatteOrMaskCount(int i) {
        this.getOutputStallDuration += i;
    }

    public boolean hasDashPattern() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getMaskAndMatteCount() {
        return this.getOutputStallDuration;
    }

    public java.util.ArrayList<java.lang.String> getWarnings() {
        java.util.HashSet<java.lang.String> hashSet = this.getValidOutputFormatsForInputhNQ4ISI;
        return new java.util.ArrayList<>(java.util.Arrays.asList((java.lang.String[]) hashSet.toArray(new java.lang.String[hashSet.size()])));
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.getOutputSizes.getHighSpeedVideoSizes = z;
    }

    public com.airbnb.lottie.PerformanceTracker getPerformanceTracker() {
        return this.getOutputSizes;
    }

    public com.airbnb.lottie.model.layer.Layer layerModelForId(long j) {
        return this.getOutputFormats.get(j);
    }

    public android.graphics.Rect getBounds() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getDuration() {
        return (long) ((getDurationFrames() / this.getHighSpeedVideoFpsRanges) * 1000.0f);
    }

    public float getStartFrame() {
        return this.getOutputStallDurationlomOqCM;
    }

    public float getEndFrame() {
        return this.getHighSpeedVideoSizes;
    }

    public float getFrameForProgress(float f) {
        return com.airbnb.lottie.utils.MiscUtils.lerp(this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoSizes, f);
    }

    public float getProgressForFrame(float f) {
        float f2 = this.getOutputStallDurationlomOqCM;
        return (f - f2) / (this.getHighSpeedVideoSizes - f2);
    }

    public float getFrameRate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.List<com.airbnb.lottie.model.layer.Layer> getLayers() {
        return this.getInputFormats;
    }

    public java.util.List<com.airbnb.lottie.model.layer.Layer> getPrecomps(java.lang.String str) {
        return this.getOutputMinFrameDurationlomOqCM.get(str);
    }

    public androidx.collection.SparseArrayCompat<com.airbnb.lottie.model.FontCharacter> getCharacters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.Map<java.lang.String, com.airbnb.lottie.model.Font> getFonts() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.List<com.airbnb.lottie.model.Marker> getMarkers() {
        return this.getOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.Marker getMarker(java.lang.String str) {
        int size = this.getOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            com.airbnb.lottie.model.Marker marker = this.getOutputSizeshNQ4ISI.get(i);
            if (marker.matchesName(str)) {
                return marker;
            }
        }
        return null;
    }

    public boolean hasImages() {
        return !this.getOutputMinFrameDuration.isEmpty();
    }

    public java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> getImages() {
        float dpScale = com.airbnb.lottie.utils.Utils.dpScale();
        if (dpScale != this.getHighSpeedVideoSizesFor) {
            for (java.util.Map.Entry<java.lang.String, com.airbnb.lottie.LottieImageAsset> entry : this.getOutputMinFrameDuration.entrySet()) {
                this.getOutputMinFrameDuration.put(entry.getKey(), entry.getValue().copyWithScale(this.getHighSpeedVideoSizesFor / dpScale));
            }
        }
        this.getHighSpeedVideoSizesFor = dpScale;
        return this.getOutputMinFrameDuration;
    }

    public float getDurationFrames() {
        return this.getHighSpeedVideoSizes - this.getOutputStallDurationlomOqCM;
    }

    public int getUnscaledWidth() {
        return this.isOutputSupportedFor;
    }

    public int getUnscaledHeight() {
        return this.unwrapAs;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LottieComposition:\n");
        java.util.Iterator<com.airbnb.lottie.model.layer.Layer> it = this.getInputFormats.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString("\t"));
        }
        return sb.toString();
    }

    @java.lang.Deprecated
    /* loaded from: classes7.dex */
    public static class Factory {
        private Factory() {
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromAssetFileName(android.content.Context context, java.lang.String str, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener, (byte) 0);
            com.airbnb.lottie.LottieCompositionFactory.fromAsset(context, str).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromRawFile(android.content.Context context, int i, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener, (byte) 0);
            com.airbnb.lottie.LottieCompositionFactory.fromRawRes(context, i).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromInputStream(java.io.InputStream inputStream, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener, (byte) 0);
            com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStream(inputStream, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromJsonString(java.lang.String str, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener, (byte) 0);
            com.airbnb.lottie.LottieCompositionFactory.fromJsonString(str, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromJsonReader(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener, (byte) 0);
            com.airbnb.lottie.LottieCompositionFactory.fromJsonReader(jsonReader, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromFileSync(android.content.Context context, java.lang.String str) {
            return com.airbnb.lottie.LottieCompositionFactory.fromAssetSync(context, str).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromInputStreamSync(java.io.InputStream inputStream) {
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromInputStreamSync(java.io.InputStream inputStream, boolean z) {
            if (z) {
                com.airbnb.lottie.utils.Logger.warning("Lottie now auto-closes input stream!");
            }
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromJsonSync(android.content.res.Resources resources, org.json.JSONObject jSONObject) {
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonSync(jSONObject, null).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromJsonSync(java.lang.String str) {
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonStringSync(str, null).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromJsonSync(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) {
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonReaderSync(jsonReader, null).getValue();
        }

        static final class ListenerAdapter implements com.airbnb.lottie.LottieListener<com.airbnb.lottie.LottieComposition>, com.airbnb.lottie.Cancellable {
            private boolean getHighSpeedVideoFpsRanges;
            private final com.airbnb.lottie.OnCompositionLoadedListener getHighSpeedVideoSizes;

            @Override // com.airbnb.lottie.LottieListener
            public final /* synthetic */ void onResult(com.airbnb.lottie.LottieComposition lottieComposition) {
                com.airbnb.lottie.LottieComposition lottieComposition2 = lottieComposition;
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                this.getHighSpeedVideoSizes.onCompositionLoaded(lottieComposition2);
            }

            /* synthetic */ ListenerAdapter(com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener, byte b) {
                this(onCompositionLoadedListener);
            }

            private ListenerAdapter(com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
                this.getHighSpeedVideoFpsRanges = false;
                this.getHighSpeedVideoSizes = onCompositionLoadedListener;
            }

            @Override // com.airbnb.lottie.Cancellable
            public final void cancel() {
                this.getHighSpeedVideoFpsRanges = true;
            }
        }
    }
}
