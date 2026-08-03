package com.inmobi.media;

/* renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2826va implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f5506a;
    public final com.inmobi.media.InterfaceC2772t9 b;
    public int c;
    public int d;
    public final kotlinx.coroutines.CompletableDeferred e;

    public ViewTreeObserverOnGlobalLayoutListenerC2826va(android.widget.FrameLayout view, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.f5506a = view;
        this.b = interfaceC2772t9;
        this.e = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(kotlin.Unit.INSTANCE);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                java.lang.String str = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "close called");
            }
            this.c = com.inmobi.media.J3.b(this.f5506a.getWidth() / com.inmobi.media.N5.b());
            this.d = com.inmobi.media.J3.b(this.f5506a.getHeight() / com.inmobi.media.N5.b());
            this.f5506a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2800ua(this, null), 3, null);
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str2, "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); " + e.getMessage());
            }
        }
    }
}
