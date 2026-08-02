package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", i = {}, l = {105}, m = "onBackPressed", n = {}, s = {})
/* renamed from: com.plaid.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0548i2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6436a;
    public final /* synthetic */ com.plaid.internal.C0557j2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0548i2(com.plaid.internal.C0557j2 c0557j2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0557j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6436a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
