package com.inmobi.media;

import kotlin.Lazy;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: com.inmobi.media.a9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3563a9 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3591b9 f7007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3563a9(CoroutineExceptionHandler.Companion companion, C3591b9 c3591b9) {
        super(companion);
        this.f7007a = c3591b9;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        Y9 y9 = this.f7007a.c;
        if (y9 != null) {
            ((Z9) y9).b("HybridVideoPlayerHandler", "Unhandled exception: " + th.getMessage());
        }
        Lazy lazy = Ba.f6473a;
        Ba.a(new C3810j3(th));
    }
}
