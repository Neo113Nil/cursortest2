package com.plaid.internal;

/* loaded from: classes16.dex */
public abstract class u8 extends androidx.view.ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.r8 f6593a;
    public final com.plaid.internal.J4 b;

    @javax.inject.Inject
    public com.plaid.internal.InterfaceC0655u2 c;

    @javax.inject.Inject
    public com.plaid.internal.InterfaceC0695y6 d;

    @javax.inject.Inject
    public com.plaid.internal.C0683x3 e;

    public u8(com.plaid.internal.r8 r8Var, com.plaid.internal.J4 j4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j4, "");
        this.f6593a = r8Var;
        this.b = j4;
    }

    public final com.plaid.internal.C0683x3 a() {
        com.plaid.internal.C0683x3 c0683x3 = this.e;
        if (c0683x3 != null) {
            return c0683x3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final com.plaid.internal.InterfaceC0695y6 b() {
        com.plaid.internal.InterfaceC0695y6 interfaceC0695y6 = this.d;
        if (interfaceC0695y6 != null) {
            return interfaceC0695y6;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final java.lang.Object a(com.plaid.internal.r8 r8Var, com.plaid.internal.C0574l1.a aVar) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.s8(this, r8Var, null), aVar);
    }
}
