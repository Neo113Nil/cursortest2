package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class ScreenshotHelper {
    private static final java.lang.String TAG = "ScreenshotHelper";
    private static java.lang.String blurScreenshotsJsCode;

    public static void captureAndMaskScreenshot(final android.webkit.WebView webView, final com.knotapi.knot.interfaces.ScreenshotCallback screenshotCallback) {
        try {
            java.lang.String str = blurScreenshotsJsCode;
            if (str == null || str.isEmpty()) {
                blurScreenshotsJsCode = com.knotapi.knot.utilities.JsScripts.blurScreenshotsJsCode;
            }
            webView.evaluateJavascript(blurScreenshotsJsCode, new android.webkit.ValueCallback<java.lang.String>() { // from class: com.knotapi.knot.utilities.ScreenshotHelper.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(java.lang.String str2) {
                    try {
                        java.lang.String trim = str2.trim();
                        if (trim.startsWith("\"") && trim.endsWith("\"")) {
                            trim = trim.substring(1, trim.length() - 1);
                        }
                        org.json.JSONObject jSONObject = new org.json.JSONObject(trim.replace("\\\"", "\""));
                        final org.json.JSONArray jSONArray = jSONObject.getJSONArray("positions");
                        final double d = jSONObject.getDouble("devicePixelRatio");
                        webView.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.knotapi.knot.utilities.ScreenshotHelper.2.1
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public void onGlobalLayout() {
                                webView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                try {
                                    int scrollX = webView.getScrollX();
                                    int scrollY = webView.getScrollY();
                                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                                    android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                                    webView.draw(canvas);
                                    android.graphics.Paint paint = new android.graphics.Paint();
                                    paint.setColor(-16777216);
                                    paint.setAlpha(255);
                                    int i = 0;
                                    while (i < jSONArray.length()) {
                                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                        double d2 = jSONObject2.getDouble(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT);
                                        double d3 = d;
                                        double d4 = jSONObject2.getDouble(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP);
                                        double d5 = d;
                                        android.graphics.Bitmap bitmap = createBitmap;
                                        double d6 = jSONObject2.getDouble("width");
                                        android.graphics.Canvas canvas2 = canvas;
                                        double d7 = d;
                                        int i2 = i;
                                        double d8 = jSONObject2.getDouble("height");
                                        android.graphics.Paint paint2 = paint;
                                        double d9 = d;
                                        float f = (float) ((d2 * d3) - (scrollX * d9));
                                        float f2 = (float) ((d4 * d5) - (scrollY * d9));
                                        canvas2.drawRect(new android.graphics.RectF(f, f2, ((float) (d7 * d6)) + f, ((float) (d8 * d9)) + f2), paint2);
                                        i = i2 + 1;
                                        paint = paint2;
                                        canvas = canvas2;
                                        createBitmap = bitmap;
                                    }
                                    screenshotCallback.onScreenshotReady(com.knotapi.knot.utilities.Helper.encodeImage(createBitmap));
                                } catch (java.lang.Exception unused) {
                                    screenshotCallback.onScreenshotReady("");
                                }
                            }
                        });
                        webView.requestLayout();
                    } catch (org.json.JSONException unused) {
                        screenshotCallback.onScreenshotReady("");
                    }
                }
            });
        } catch (java.lang.Exception unused) {
            screenshotCallback.onScreenshotReady("");
        }
    }

    public static void fetchScreenshotJS(com.google.gson.JsonObject jsonObject, com.knotapi.knot.utilities.WebAppJSFetcher webAppJSFetcher) {
        if (jsonObject == null || !jsonObject.has("blur_screenshots_js_path")) {
            blurScreenshotsJsCode = com.knotapi.knot.utilities.JsScripts.blurScreenshotsJsCode;
            return;
        }
        com.google.gson.JsonElement jsonElement = jsonObject.get("blur_screenshots_js_path");
        if (jsonElement == null) {
            blurScreenshotsJsCode = com.knotapi.knot.utilities.JsScripts.blurScreenshotsJsCode;
            return;
        }
        java.lang.String trim = jsonElement.toString().trim();
        if (trim.startsWith("\"") && trim.endsWith("\"")) {
            trim = trim.substring(1, trim.length() - 1);
        }
        try {
            com.google.gson.JsonElement jsonElement2 = com.google.gson.JsonParser.parseString(trim.replace("\\\"", "\"")).getAsJsonObject().get("blurScreenshotsJS");
            if (jsonElement2 == null || !jsonElement2.isJsonPrimitive()) {
                blurScreenshotsJsCode = com.knotapi.knot.utilities.JsScripts.blurScreenshotsJsCode;
            } else {
                webAppJSFetcher.fetchJS(jsonElement2.getAsString(), new com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback() { // from class: com.knotapi.knot.utilities.ScreenshotHelper.1
                    @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
                    public void onFetchFailed(java.lang.Exception exc) {
                        java.lang.String unused = com.knotapi.knot.utilities.ScreenshotHelper.blurScreenshotsJsCode = com.knotapi.knot.utilities.JsScripts.blurScreenshotsJsCode;
                    }

                    @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
                    public void onJSCodeFetched(java.lang.String str) {
                        java.lang.String unused = com.knotapi.knot.utilities.ScreenshotHelper.blurScreenshotsJsCode = str;
                    }
                });
            }
        } catch (java.lang.Exception unused) {
            blurScreenshotsJsCode = com.knotapi.knot.utilities.JsScripts.blurScreenshotsJsCode;
        }
    }

    public static void startScreenshotFlow(final android.webkit.WebView webView, final com.knotapi.knot.webview.KnotView knotView, final java.lang.String str) {
        try {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.ScreenshotHelper$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.knotapi.knot.utilities.ScreenshotHelper.captureAndMaskScreenshot(r0, new com.knotapi.knot.interfaces.ScreenshotCallback() { // from class: com.knotapi.knot.utilities.ScreenshotHelper$$ExternalSyntheticLambda0
                        @Override // com.knotapi.knot.interfaces.ScreenshotCallback
                        public final void onScreenshotReady(java.lang.String str2) {
                            com.knotapi.knot.utilities.WebViewDataProcessor.processWebViewData(r1, r1, str2, r3, com.knotapi.knot.utilities.Constants.META_SCREENSHOT, new com.knotapi.knot.utilities.WebViewDataProcessor.DataProcessingCallback() { // from class: com.knotapi.knot.utilities.ScreenshotHelper$$ExternalSyntheticLambda2
                                @Override // com.knotapi.knot.utilities.WebViewDataProcessor.DataProcessingCallback
                                public final void onDataProcessed(com.knotapi.knot.models.MerchantWebViewData merchantWebViewData) {
                                    com.knotapi.knot.webview.KnotView.this.getWebViewDelegate().sendNativeLogEvent(merchantWebViewData);
                                }
                            });
                        }
                    });
                }
            });
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "ScreenshotHelper startScreenshotFlow error occurred");
        }
    }
}
