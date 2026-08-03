package com.inmobi.media;

/* renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2601n extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 f5344a;
    public final /* synthetic */ com.inmobi.media.InterfaceC2496j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2601n(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, com.inmobi.media.InterfaceC2496j interfaceC2496j, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5344a = interfaceC2772t9;
        this.b = interfaceC2496j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2601n(this.f5344a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2601n(this.f5344a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5344a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AdAudioTracker", "Removing audio volume change listener");
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = com.inmobi.media.C2682q.h;
        com.inmobi.media.InterfaceC2496j interfaceC2496j = this.b;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(weakReference.get(), interfaceC2496j)) {
                com.inmobi.media.C2682q.h.remove(weakReference);
            }
        }
        if (com.inmobi.media.C2682q.h.isEmpty()) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f5344a;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            com.inmobi.media.C2682q c2682q = com.inmobi.media.C2682q.f5400a;
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f5344a;
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context == null) {
                if (interfaceC2772t93 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                com.inmobi.media.C2682q.a((java.lang.Float) null);
            } else if (com.inmobi.media.C2682q.d.compareAndSet(true, false)) {
                if (interfaceC2772t93 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                com.inmobi.media.C2682q.a(context, interfaceC2772t93);
            } else if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).c("AdAudioTracker", "Audio volume tracking is already stopped");
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
