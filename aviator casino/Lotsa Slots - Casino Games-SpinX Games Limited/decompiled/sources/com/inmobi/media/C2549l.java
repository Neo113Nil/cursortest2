package com.inmobi.media;

/* renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2549l extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 f5303a;
    public final /* synthetic */ com.inmobi.media.InterfaceC2496j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2549l(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, com.inmobi.media.InterfaceC2496j interfaceC2496j, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5303a = interfaceC2772t9;
        this.b = interfaceC2496j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2549l(this.f5303a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2549l(this.f5303a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5303a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + com.inmobi.media.C2682q.h.size());
        }
        java.util.Iterator it = com.inmobi.media.C2682q.h.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() == null) {
                com.inmobi.media.C2682q.h.remove(weakReference);
            }
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = com.inmobi.media.C2682q.h;
        boolean isEmpty = copyOnWriteArraySet.isEmpty();
        copyOnWriteArraySet.add(new java.lang.ref.WeakReference(this.b));
        com.inmobi.media.InterfaceC2496j interfaceC2496j = this.b;
        java.lang.Float f = (java.lang.Float) com.inmobi.media.C2682q.e.get();
        ((com.inmobi.media.Yh) interfaceC2496j).a(f != null ? kotlin.coroutines.jvm.internal.Boxing.boxFloat(com.inmobi.media.J3.a(f.floatValue() * 100.0f)) : null);
        if (isEmpty) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f5303a;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c("AdAudioTracker", "Starting audio volume change listener");
            }
            com.inmobi.media.C2682q c2682q = com.inmobi.media.C2682q.f5400a;
            com.inmobi.media.C2682q.a(this.f5303a);
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f5303a;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).c("AdAudioTracker", "Resuming audio volume change listener");
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
