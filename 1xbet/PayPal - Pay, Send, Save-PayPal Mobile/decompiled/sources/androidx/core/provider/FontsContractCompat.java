package androidx.core.provider;

/* loaded from: classes3.dex */
public class FontsContractCompat {

    @java.lang.Deprecated
    public static final java.lang.String PARCEL_FONT_RESULTS = "font_results";

    /* loaded from: classes7.dex */
    public static final class Columns implements android.provider.BaseColumns {
        public static final java.lang.String FILE_ID = "file_id";
        public static final java.lang.String ITALIC = "font_italic";
        public static final java.lang.String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final java.lang.String TTC_INDEX = "font_ttc_index";
        public static final java.lang.String VARIATION_SETTINGS = "font_variation_settings";
        public static final java.lang.String WEIGHT = "font_weight";
    }

    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @java.lang.Deprecated
        public static final int RESULT_OK = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i) {
        }

        public void onTypefaceRetrieved(android.graphics.Typeface typeface) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TypefaceStyle {
    }

    private FontsContractCompat() {
    }

    public static android.graphics.Typeface buildTypeface(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr) {
        return androidx.core.graphics.TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    public static androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontRequest fontRequest) throws android.content.pm.PackageManager.NameNotFoundException {
        java.util.List m;
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{fontRequest});
        return androidx.core.provider.FontProvider.Camera2StreamConfigurationMap(context, (java.util.List<androidx.core.provider.FontRequest>) m, cancellationSignal);
    }

    @java.lang.Deprecated
    public static void requestFont(android.content.Context context, androidx.core.provider.FontRequest fontRequest, androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback, android.os.Handler handler) {
        java.util.List m;
        androidx.core.provider.CallbackWrapper callbackWrapper = new androidx.core.provider.CallbackWrapper(fontRequestCallback);
        java.util.concurrent.Executor highSpeedVideoSizes = androidx.core.provider.RequestExecutor.getHighSpeedVideoSizes(handler);
        android.content.Context applicationContext = context.getApplicationContext();
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{fontRequest});
        androidx.core.provider.FontRequestWorker.getHighSpeedVideoFpsRanges(applicationContext, (java.util.List<androidx.core.provider.FontRequest>) m, 0, highSpeedVideoSizes, callbackWrapper);
    }

    public static void requestFont(android.content.Context context, androidx.core.provider.FontRequest fontRequest, int i, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback) {
        java.util.List m;
        androidx.core.provider.CallbackWrapper callbackWrapper = new androidx.core.provider.CallbackWrapper(fontRequestCallback, executor2);
        android.content.Context applicationContext = context.getApplicationContext();
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{fontRequest});
        androidx.core.provider.FontRequestWorker.getHighSpeedVideoFpsRanges(applicationContext, (java.util.List<androidx.core.provider.FontRequest>) m, i, executor, callbackWrapper);
    }

    public static void requestFontWithFallbackChain(android.content.Context context, java.util.List<androidx.core.provider.FontRequest> list, int i, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback) {
        androidx.core.provider.FontRequestWorker.getHighSpeedVideoFpsRanges(context.getApplicationContext(), list, i, executor, new androidx.core.provider.CallbackWrapper(fontRequestCallback, executor2));
    }

    public static android.graphics.Typeface requestFont(android.content.Context context, java.util.List<androidx.core.provider.FontRequest> list, int i, boolean z, int i2, android.os.Handler handler, androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback) {
        androidx.core.provider.CallbackWrapper callbackWrapper = new androidx.core.provider.CallbackWrapper(fontRequestCallback, androidx.core.provider.RequestExecutor.getHighSpeedVideoSizes(handler));
        if (z) {
            if (list.size() > 1) {
                throw new java.lang.IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            return androidx.core.provider.FontRequestWorker.getHighSpeedVideoFpsRanges(context, list.get(0), callbackWrapper, i, i2);
        }
        return androidx.core.provider.FontRequestWorker.getHighSpeedVideoFpsRanges(context, list, i, (java.util.concurrent.Executor) null, callbackWrapper);
    }

    public static android.graphics.Typeface requestFont(android.content.Context context, androidx.core.provider.FontRequest fontRequest, int i, boolean z, int i2, android.os.Handler handler, androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback) {
        java.util.List m;
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{fontRequest});
        return requestFont(context, (java.util.List<androidx.core.provider.FontRequest>) m, i, z, i2, handler, fontRequestCallback);
    }

    public static void resetTypefaceCache() {
        androidx.core.provider.FontRequestWorker.getHighSpeedVideoFpsRanges();
    }

    public static class FontInfo {
        private final int Camera2StreamConfigurationMap;
        private final android.net.Uri getHighResolutionOutputSizeshNQ4ISI;
        private final boolean getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private final java.lang.String getHighSpeedVideoSizes;
        private final int getOutputFormats;

        @java.lang.Deprecated
        public FontInfo(android.net.Uri uri, int i, int i2, boolean z, int i3) {
            this(uri, i, i2, z, null, i3);
        }

        public FontInfo(android.net.Uri uri, int i, int i2, boolean z, java.lang.String str, int i3) {
            this.getHighResolutionOutputSizeshNQ4ISI = (android.net.Uri) androidx.core.util.Preconditions.checkNotNull(uri);
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getOutputFormats = i2;
            this.getHighSpeedVideoFpsRanges = z;
            this.getHighSpeedVideoSizes = str;
            this.Camera2StreamConfigurationMap = i3;
        }

        public FontInfo(java.lang.String str, java.lang.String str2) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.net.Uri.Builder().scheme("systemfont").authority(str).build();
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getOutputFormats = 400;
            this.getHighSpeedVideoFpsRanges = false;
            this.getHighSpeedVideoSizes = str2;
            this.Camera2StreamConfigurationMap = 0;
        }

        public android.net.Uri getUri() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public int getTtcIndex() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public int getWeight() {
            return this.getOutputFormats;
        }

        public boolean isItalic() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public java.lang.String getVariationSettings() {
            return this.getHighSpeedVideoSizes;
        }

        public java.lang.String getSystemFont() {
            if (isSystemFont()) {
                return this.getHighResolutionOutputSizeshNQ4ISI.getAuthority();
            }
            return null;
        }

        public boolean isSystemFont() {
            return java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI.getScheme(), "systemfont");
        }

        public int getResultCode() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoSizes;

        @java.lang.Deprecated
        public FontFamilyResult(int i, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr) {
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.singletonList(fontInfoArr);
        }

        FontFamilyResult(int i, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> list) {
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = list;
        }

        public int getStatusCode() {
            return this.getHighSpeedVideoSizes;
        }

        public androidx.core.provider.FontsContractCompat.FontInfo[] getFonts() {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(0);
        }

        boolean getHighSpeedVideoSizes() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size() > 1;
        }

        public java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> getFontsWithFallbacks() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        static androidx.core.provider.FontsContractCompat.FontFamilyResult getHighSpeedVideoFpsRanges(int i, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr) {
            return new androidx.core.provider.FontsContractCompat.FontFamilyResult(i, fontInfoArr);
        }

        static androidx.core.provider.FontsContractCompat.FontFamilyResult getHighSpeedVideoSizes(int i, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> list) {
            return new androidx.core.provider.FontsContractCompat.FontFamilyResult(i, list);
        }
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface getFontSync(android.content.Context context, androidx.core.provider.FontRequest fontRequest, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z, int i, int i2) {
        java.util.List m;
        androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter = new androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter(fontCallback);
        android.os.Handler handler2 = androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(handler);
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{fontRequest});
        return requestFont(context, (java.util.List<androidx.core.provider.FontRequest>) m, i2, z, i, handler2, resourcesCallbackAdapter);
    }

    @java.lang.Deprecated
    public static void resetCache() {
        androidx.core.provider.FontRequestWorker.getHighSpeedVideoFpsRanges();
    }

    @java.lang.Deprecated
    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> prepareFontData(android.content.Context context, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, android.os.CancellationSignal cancellationSignal) {
        return androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
    }

    @java.lang.Deprecated
    public static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager packageManager, androidx.core.provider.FontRequest fontRequest, android.content.res.Resources resources) throws android.content.pm.PackageManager.NameNotFoundException {
        return androidx.core.provider.FontProvider.Camera2StreamConfigurationMap(packageManager, fontRequest, resources);
    }
}
