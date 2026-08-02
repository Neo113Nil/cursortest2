package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashWorkManager", f = "CrashWorkManager.kt", i = {0}, l = {30}, m = "storeCrashAndScheduleUpload", n = {"this"}, s = {"L$0"})
/* renamed from: com.plaid.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0555j0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0564k0 f6446a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.C0564k0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0555j0(com.plaid.internal.C0564k0 c0564k0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c0564k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
