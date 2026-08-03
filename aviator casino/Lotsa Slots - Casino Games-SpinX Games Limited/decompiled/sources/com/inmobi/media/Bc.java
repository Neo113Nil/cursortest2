package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Bc extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Cc f4621a;
    public final /* synthetic */ com.inmobi.media.Ec b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bc(com.inmobi.media.Cc cc, com.inmobi.media.Ec ec, boolean z, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4621a = cc;
        this.b = ec;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Bc(this.f4621a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Bc) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = this.f4621a.b;
        if (context != null) {
            android.media.AudioManager audioManager = null;
            try {
                java.lang.Object systemService = context.getSystemService("audio");
                if (!(systemService instanceof android.media.AudioManager)) {
                    systemService = null;
                }
                audioManager = (android.media.AudioManager) systemService;
            } catch (java.lang.Throwable unused) {
            }
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    com.inmobi.media.Cc cc = this.f4621a;
                    if (streamVolume != cc.c) {
                        cc.c = streamVolume;
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b.b;
                        if (interfaceC2772t9 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MraidMediaProcessor", "volume change detected - " + this.c);
                        }
                        this.b.a(this.f4621a.f4640a, streamVolume);
                    }
                } catch (java.lang.Exception e) {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b.b;
                    if (interfaceC2772t92 != null) {
                        ((com.inmobi.media.C2799u9) interfaceC2772t92).a("MraidMediaProcessor", "Unexpected error in volume listener", e);
                    }
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
