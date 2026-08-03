package com.inmobi.media;

/* renamed from: com.inmobi.media.y8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2901y8 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2926z8 f5566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2901y8(kotlinx.coroutines.CoroutineExceptionHandler.Companion companion, com.inmobi.media.C2926z8 c2926z8) {
        super(companion);
        this.f5566a = c2926z8;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5566a.c;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HybridVideoPlayerHandler", "Unhandled exception: " + th.getMessage());
        }
        kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
        com.inmobi.media.W9.a(new com.inmobi.media.M2(th));
    }
}
