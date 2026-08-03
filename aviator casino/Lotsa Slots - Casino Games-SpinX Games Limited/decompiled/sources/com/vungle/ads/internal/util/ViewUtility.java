package com.vungle.ads.internal.util;

/* compiled from: ViewUtility.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/util/ViewUtility;", "", "()V", "dpToPixels", "", "context", "Landroid/content/Context;", "dp", "getDeviceWidthAndHeightWithOrientation", "Lkotlin/Pair;", "orientation", "getWebView", "Landroid/webkit/WebView;", "eventId", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewUtility {
    public static final com.vungle.ads.internal.util.ViewUtility INSTANCE = new com.vungle.ads.internal.util.ViewUtility();

    private ViewUtility() {
    }

    public final int dpToPixels(android.content.Context context, int dp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((dp * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final android.webkit.WebView getWebView(android.content.Context context, java.lang.String eventId) throws java.lang.InstantiationException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            return com.vungle.ads.internal.presenter.WebViewManager.INSTANCE.getOrCreateWebView(context, eventId);
        } catch (android.content.res.Resources.NotFoundException e) {
            throw new java.lang.InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e + ".message");
        } catch (java.lang.Exception e2) {
            throw new java.lang.InstantiationException(e2.getMessage());
        }
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getDeviceWidthAndHeightWithOrientation(android.content.Context context, int orientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.res.Resources resources = context.getApplicationContext().getResources();
        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = resources.getConfiguration().orientation;
        if (orientation == 0) {
            orientation = i;
        }
        if (orientation == i) {
            return new kotlin.Pair<>(java.lang.Integer.valueOf(java.lang.Math.round(displayMetrics.widthPixels / displayMetrics.density)), java.lang.Integer.valueOf(java.lang.Math.round(displayMetrics.heightPixels / displayMetrics.density)));
        }
        return new kotlin.Pair<>(java.lang.Integer.valueOf(java.lang.Math.round(displayMetrics.heightPixels / displayMetrics.density)), java.lang.Integer.valueOf(java.lang.Math.round(displayMetrics.widthPixels / displayMetrics.density)));
    }
}
