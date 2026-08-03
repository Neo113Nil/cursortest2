package com.inmobi.media;

/* loaded from: classes5.dex */
public final class E7 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4678a;
    public final /* synthetic */ com.inmobi.media.R7 b;

    public E7(android.view.View view, com.inmobi.media.R7 r7) {
        this.f4678a = view;
        this.b = r7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.f4678a.removeOnAttachStateChangeListener(this);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
        }
        this.b.a(com.inmobi.media.C2798u8.f5483a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
    }
}
