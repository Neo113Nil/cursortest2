package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zi implements io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final java.lang.Object apply(java.lang.Object obj) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.Display) obj).getRealMetrics(displayMetrics);
        return new android.graphics.Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
