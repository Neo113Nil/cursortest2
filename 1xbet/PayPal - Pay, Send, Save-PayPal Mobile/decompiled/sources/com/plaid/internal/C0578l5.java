package com.plaid.internal;

/* renamed from: com.plaid.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0578l5 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<android.content.SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0587m5 f6477a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0578l5(com.plaid.internal.C0587m5 c0587m5) {
        super(0);
        this.f6477a = c0587m5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final android.content.SharedPreferences invoke() {
        return this.f6477a.f6494a.getApplicationContext().getSharedPreferences("plaid_environment_values", 0);
    }
}
