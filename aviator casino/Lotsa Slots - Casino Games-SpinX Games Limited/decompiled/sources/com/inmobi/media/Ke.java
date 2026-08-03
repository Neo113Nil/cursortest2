package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ke implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function1 f4798a;

    public Ke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1 function1) {
        this.f4798a = function1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f4798a.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) obj).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }
}
