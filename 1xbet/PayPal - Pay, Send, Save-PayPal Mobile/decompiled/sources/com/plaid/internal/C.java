package com.plaid.internal;

/* loaded from: classes16.dex */
public final class C implements com.plaid.internal.InterfaceC0677w6, com.plaid.internal.x8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.T3 f5759a;
    public final kotlinx.serialization.json.Json b;

    public C(com.plaid.internal.T3 t3, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.f5759a = t3;
        this.b = json;
    }

    @Override // com.plaid.internal.x8
    public final java.lang.Object a(com.plaid.internal.A a2, com.plaid.internal.C0637s2 c0637s2) {
        java.lang.Object a3 = this.f5759a.a("channel_state", "Channel_info", this.b.encodeToString(com.plaid.internal.A.a.f5745a, a2), c0637s2);
        return a3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.InterfaceC0677w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.B b;
        int i;
        com.plaid.internal.C c;
        java.lang.String str;
        if (continuationImpl instanceof com.plaid.internal.B) {
            b = (com.plaid.internal.B) continuationImpl;
            int i2 = b.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b.d = i2 - 2147483648;
                java.lang.Object obj = b.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = b.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.T3 t3 = this.f5759a;
                    b.f5754a = this;
                    b.d = 1;
                    obj = t3.a("channel_state", "Channel_info", b);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c = b.f5754a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    return (com.plaid.internal.A) c.b.decodeFromString(com.plaid.internal.A.a.f5745a, str);
                }
                return null;
            }
        }
        b = new com.plaid.internal.B(this, continuationImpl);
        java.lang.Object obj2 = b.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = b.d;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
    }

    @Override // com.plaid.internal.InterfaceC0677w6
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.Object a2 = this.f5759a.a("channel_state", continuationImpl);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    @Override // com.plaid.internal.x8
    public final java.lang.Object a(com.plaid.internal.C0637s2 c0637s2) {
        java.lang.Object a2 = a((kotlin.coroutines.jvm.internal.ContinuationImpl) c0637s2);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
