package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Sd implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2275ae f4956a;

    public Sd(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.C2275ae c2275ae) {
        this.f4956a = c2275ae;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.Xd(this.f4956a, null), continuation);
        if (withContext != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            withContext = kotlin.Unit.INSTANCE;
        }
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
