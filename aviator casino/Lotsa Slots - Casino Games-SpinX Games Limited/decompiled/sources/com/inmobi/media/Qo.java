package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Qo implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope f4926a;

    public Qo(kotlinx.coroutines.channels.ProducerScope producerScope) {
        this.f4926a = producerScope;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        this.f4926a.mo10716trySendJP2dKIU(java.lang.Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        this.f4926a.mo10716trySendJP2dKIU(java.lang.Boolean.FALSE);
    }
}
