package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/google/maps/android/compose/NoDrawContainerView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", util.h.xy.cb.b.f1091, "", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
final class NoDrawContainerView extends android.view.ViewGroup {
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoDrawContainerView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "");
    }
}
