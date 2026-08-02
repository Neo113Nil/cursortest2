package com.plaid.internal;

/* renamed from: com.plaid.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0537h0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0551i5 f6424a;
    public final com.plaid.internal.C0456b0 b;
    public final com.google.gson.Gson c;
    public final java.lang.reflect.Type d;

    public C0537h0(com.plaid.internal.C0551i5 c0551i5, com.plaid.internal.C0456b0 c0456b0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0551i5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0456b0, "");
        this.f6424a = c0551i5;
        this.b = c0456b0;
        this.c = new com.google.gson.Gson();
        this.d = new com.plaid.internal.C0466c0().getType();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.plaid.internal.C0537h0 c0537h0, java.lang.String str, java.lang.reflect.Type type, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0519f0 c0519f0;
        int i;
        if (continuationImpl instanceof com.plaid.internal.C0519f0) {
            c0519f0 = (com.plaid.internal.C0519f0) continuationImpl;
            int i2 = c0519f0.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0519f0.e = i2 - 2147483648;
                java.lang.Object obj = c0519f0.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0519f0.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0551i5 c0551i5 = c0537h0.f6424a;
                    c0519f0.f6406a = c0537h0;
                    c0519f0.b = type;
                    c0519f0.e = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.C0524f5(c0551i5, str, null), c0519f0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    type = c0519f0.b;
                    c0537h0 = c0519f0.f6406a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Object fromJson = c0537h0.c.fromJson((java.lang.String) obj, type);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "");
                return fromJson;
            }
        }
        c0519f0 = new com.plaid.internal.C0519f0(c0537h0, continuationImpl);
        java.lang.Object obj2 = c0519f0.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0519f0.e;
        if (i != 0) {
        }
        java.lang.Object fromJson2 = c0537h0.c.fromJson((java.lang.String) obj2, type);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson2, "");
        return fromJson2;
    }

    public static java.lang.String a() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(randomUUID);
        sb.append(".txt");
        return sb.toString();
    }
}
