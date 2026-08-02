package com.plaid.internal;

/* renamed from: com.plaid.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0673w2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<android.view.View> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0691y2 f6606a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0673w2(com.plaid.internal.C0691y2 c0691y2) {
        super(0);
        this.f6606a = c0691y2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final android.view.View invoke() {
        return this.f6606a.findViewById(com.plaid.link.R.id.retry_button);
    }
}
