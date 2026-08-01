package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes6.dex */
public final class Gp implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f6589a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;

    public Gp(ProducerScope producerScope, View view, ViewGroup viewGroup) {
        this.f6589a = producerScope;
        this.b = view;
        this.c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f6589a.mo7997trySendJP2dKIU(Boolean.valueOf(Jp.a(this.b, this.c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f6589a.mo7997trySendJP2dKIU(Boolean.FALSE);
    }
}
