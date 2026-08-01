package com.inmobi.media;

import kotlin.Lazy;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: com.inmobi.media.o8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3959o8 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f7282a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3959o8(CoroutineExceptionHandler.Companion companion, C4043r8 c4043r8) {
        super(companion);
        this.f7282a = c4043r8;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        Y9 y9 = this.f7282a.b;
        if (y9 != null) {
            ((Z9) y9).b("HtmlMediaPlayer", "Unhandled exception: " + th.getMessage());
        }
        Lazy lazy = Ba.f6473a;
        Ba.a(new C3810j3(th));
    }
}
