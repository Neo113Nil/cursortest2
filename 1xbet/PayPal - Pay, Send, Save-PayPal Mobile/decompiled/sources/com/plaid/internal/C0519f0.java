package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage", f = "CrashStorage.kt", i = {0, 0}, l = {53}, m = "loadEvents", n = {"this", "eventType"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0519f0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0537h0 f6406a;
    public java.lang.reflect.Type b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.plaid.internal.C0537h0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519f0(com.plaid.internal.C0537h0 c0537h0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0537h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return com.plaid.internal.C0537h0.a(this.d, null, null, this);
    }
}
