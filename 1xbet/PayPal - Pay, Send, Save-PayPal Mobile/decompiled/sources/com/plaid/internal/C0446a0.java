package com.plaid.internal;

/* renamed from: com.plaid.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0446a0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.text.SimpleDateFormat> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0456b0 f5992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0446a0(com.plaid.internal.C0456b0 c0456b0) {
        super(0);
        this.f5992a = c0456b0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.text.SimpleDateFormat invoke() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZ", java.util.Locale.ENGLISH);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("gmt"));
        return simpleDateFormat;
    }
}
