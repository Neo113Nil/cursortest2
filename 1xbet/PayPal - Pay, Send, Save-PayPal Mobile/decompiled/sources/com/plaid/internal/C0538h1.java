package com.plaid.internal;

/* renamed from: com.plaid.internal.h1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0538h1 implements com.plaid.internal.InterfaceC0529g1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6425a;
    public final long b;
    public final java.lang.String c;

    public C0538h1(long j, java.lang.String str, java.lang.String str2) {
        this.f6425a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // com.plaid.internal.InterfaceC0529g1
    public final java.lang.String a(com.plaid.internal.InterfaceC0627r1 interfaceC0627r1, com.plaid.internal.C0608p c0608p) {
        c0608p.d = "test";
        c0608p.e = this.c;
        long j = this.b;
        if (j > 0) {
            try {
                java.lang.Thread.sleep(j);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        return this.f6425a;
    }
}
