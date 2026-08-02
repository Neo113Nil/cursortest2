package com.plaid.internal;

/* renamed from: com.plaid.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0682x2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<android.view.View> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0691y2 f6621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0682x2(com.plaid.internal.C0691y2 c0691y2) {
        super(0);
        this.f6621a = c0691y2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final android.view.View invoke() {
        return this.f6621a.findViewById(com.plaid.link.R.id.retry_container);
    }
}
