package com.amazon.device.iap.internal.b;

/* compiled from: ReceiptParsingException.java */
/* loaded from: classes2.dex */
public class a extends java.lang.RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3465a;
    private final java.lang.String b;

    public a(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        super(th);
        this.f3465a = str;
        this.b = str2;
    }

    public java.lang.String a() {
        return this.f3465a;
    }
}
