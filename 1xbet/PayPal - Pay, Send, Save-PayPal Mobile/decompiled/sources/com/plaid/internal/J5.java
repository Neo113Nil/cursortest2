package com.plaid.internal;

/* loaded from: classes3.dex */
public final class J5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0471c5 f5818a;

    public J5(com.plaid.internal.C0471c5 c0471c5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0471c5, "");
        this.f5818a = c0471c5;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.plaid.internal.C0471c5 c0471c5 = this.f5818a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0451a5(c0471c5, str, null), 3, null);
    }
}
