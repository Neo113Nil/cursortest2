package com.plaid.internal;

/* renamed from: com.plaid.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0551i5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f6442a;

    public C0551i5(java.io.File file, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f6442a = new java.io.File(file, str);
    }

    public final java.lang.Object a(kotlin.coroutines.jvm.internal.SuspendLambda suspendLambda) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.C0515e5(this, null), suspendLambda);
    }

    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.SuspendLambda suspendLambda) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.C0533g5(this, str, null), suspendLambda);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
