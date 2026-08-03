package com.ironsource;

/* loaded from: classes5.dex */
public final class Cg {
    public static final boolean a(android.view.View view, android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
