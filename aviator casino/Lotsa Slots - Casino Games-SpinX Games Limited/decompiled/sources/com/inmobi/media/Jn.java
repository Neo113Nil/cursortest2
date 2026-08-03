package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Jn implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope f4789a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ android.view.ViewGroup c;

    public Jn(kotlinx.coroutines.channels.ProducerScope producerScope, android.view.View view, android.view.ViewGroup viewGroup) {
        this.f4789a = producerScope;
        this.b = view;
        this.c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        this.f4789a.mo10716trySendJP2dKIU(java.lang.Boolean.valueOf(com.inmobi.media.Mn.a(this.b, this.c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        this.f4789a.mo10716trySendJP2dKIU(java.lang.Boolean.FALSE);
    }
}
