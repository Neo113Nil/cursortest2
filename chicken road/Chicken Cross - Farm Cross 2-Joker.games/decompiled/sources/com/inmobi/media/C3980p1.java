package com.inmobi.media;

import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: com.inmobi.media.p1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3980p1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4008q1 f7297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3980p1(CoroutineExceptionHandler.Companion companion, C4008q1 c4008q1) {
        super(companion);
        this.f7297a = c4008q1;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        Z9 z9 = this.f7297a.c;
        if (z9 != null) {
            z9.b("AdUnitManager", "Exception: " + ExceptionsKt.stackTraceToString(th));
        }
        Lazy lazy = Ba.f6473a;
        Ba.a(new C3810j3(th));
    }
}
