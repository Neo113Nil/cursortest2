package com.inmobi.media;

/* renamed from: com.inmobi.media.n1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2603n1 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2631o1 f5346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2603n1(kotlinx.coroutines.CoroutineExceptionHandler.Companion companion, com.inmobi.media.C2631o1 c2631o1) {
        super(companion);
        this.f5346a = c2631o1;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        com.inmobi.media.C2799u9 c2799u9 = this.f5346a.c;
        if (c2799u9 != null) {
            c2799u9.b("AdUnitManager", "Exception: " + kotlin.ExceptionsKt.stackTraceToString(th));
        }
        kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
        com.inmobi.media.W9.a(new com.inmobi.media.M2(th));
    }
}
