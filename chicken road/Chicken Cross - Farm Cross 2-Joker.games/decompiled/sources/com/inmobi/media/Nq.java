package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes6.dex */
public final class Nq implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f6752a;

    public Nq(ProducerScope producerScope) {
        this.f6752a = producerScope;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f6752a.mo7997trySendJP2dKIU(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f6752a.mo7997trySendJP2dKIU(Boolean.FALSE);
    }
}
