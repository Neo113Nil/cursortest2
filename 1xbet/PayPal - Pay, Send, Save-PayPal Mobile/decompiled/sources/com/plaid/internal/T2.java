package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m = io.ktor.http.LinkHeader.Rel.Next, n = {"this", "state", "backstack", "continuationToken"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes16.dex */
public final class T2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.Y2 f5924a;
    public com.plaid.internal.N2 b;
    public java.util.List c;
    public java.lang.String d;
    public /* synthetic */ java.lang.Object e;
    public final /* synthetic */ com.plaid.internal.Y2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(com.plaid.internal.Y2 y2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((com.plaid.internal.N2) null, (java.util.List) null, this);
    }
}
