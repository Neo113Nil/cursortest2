package com.inmobi.media;

/* loaded from: classes5.dex */
public final class O7 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f4871a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O7(kotlinx.coroutines.CoroutineExceptionHandler.Companion companion, com.inmobi.media.R7 r7) {
        super(companion);
        this.f4871a = r7;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4871a.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlMediaPlayer", "Unhandled exception: " + th.getMessage());
        }
        kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
        com.inmobi.media.W9.a(new com.inmobi.media.M2(th));
    }
}
