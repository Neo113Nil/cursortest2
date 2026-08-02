package com.plaid.internal;

/* loaded from: classes16.dex */
public final class T5<T> implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.P5 f5926a;

    public T5(com.plaid.internal.P5 p5) {
        this.f5926a = p5;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.plaid.internal.P5 p5 = this.f5926a;
        if (androidx.core.view.ViewCompat.isAttachedToWindow(p5)) {
            p5.post(new com.plaid.internal.R5(p5));
        } else {
            p5.addOnAttachStateChangeListener(new com.plaid.internal.S5(p5, p5));
        }
        return kotlin.Unit.INSTANCE;
    }
}
