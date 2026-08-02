package com.plaid.internal;

/* renamed from: com.plaid.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0505d4 implements com.plaid.internal.M5 {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.M5 f6392a;

    @Override // com.plaid.internal.M5
    public final boolean a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.plaid.internal.M5 m5 = this.f6392a;
        if (m5 != null) {
            return m5.a(str);
        }
        return false;
    }

    @Override // com.plaid.internal.M5
    public final void a(com.plaid.internal.AbstractC0639s4 abstractC0639s4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0639s4, "");
        com.plaid.internal.M5 m5 = this.f6392a;
        if (m5 != null) {
            m5.a(abstractC0639s4);
        }
    }
}
