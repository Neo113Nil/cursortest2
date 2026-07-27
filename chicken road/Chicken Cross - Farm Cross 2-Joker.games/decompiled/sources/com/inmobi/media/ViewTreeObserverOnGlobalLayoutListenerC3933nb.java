package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* renamed from: com.inmobi.media.nb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3933nb implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f7263a;
    public final Y9 b;
    public int c;
    public int d;
    public final CompletableDeferred e;

    public ViewTreeObserverOnGlobalLayoutListenerC3933nb(FrameLayout view, Y9 y9) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f7263a = view;
        this.b = y9;
        this.e = CompletableDeferredKt.CompletableDeferred(Unit.INSTANCE);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            Y9 y9 = this.b;
            if (y9 != null) {
                String str = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((Z9) y9).a(str, "close called");
            }
            this.c = AbstractC3727g4.b(this.f7263a.getWidth() / AbstractC3841k6.b());
            this.d = AbstractC3727g4.b(this.f7263a.getHeight() / AbstractC3841k6.b());
            this.f7263a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C3905mb(this, null), 3, null);
        } catch (Exception e) {
            Y9 y92 = this.b;
            if (y92 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y92).b(str2, "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); " + e.getMessage());
            }
        }
    }
}
