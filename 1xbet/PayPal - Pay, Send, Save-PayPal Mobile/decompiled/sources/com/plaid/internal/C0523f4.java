package com.plaid.internal;

/* renamed from: com.plaid.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0523f4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.EnumC0559j4 f6409a;
    public final com.plaid.internal.EnumC0697z b;
    public final com.plaid.internal.EnumC0697z c;
    public final com.plaid.internal.EnumC0697z d;

    public C0523f4(android.net.NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(0)) {
            this.f6409a = com.plaid.internal.EnumC0559j4.CELLULAR;
        } else if (networkCapabilities.hasTransport(1)) {
            this.f6409a = com.plaid.internal.EnumC0559j4.WIFI;
        } else if (networkCapabilities.hasTransport(3)) {
            this.f6409a = com.plaid.internal.EnumC0559j4.WIRED;
        } else {
            this.f6409a = com.plaid.internal.EnumC0559j4.OTHER;
        }
        this.c = networkCapabilities.hasCapability(12) ? com.plaid.internal.EnumC0697z.YES : com.plaid.internal.EnumC0697z.NO;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.b = networkCapabilities.hasCapability(19) ? com.plaid.internal.EnumC0697z.YES : com.plaid.internal.EnumC0697z.NO;
        } else {
            this.b = com.plaid.internal.EnumC0697z.UNKNOWN;
        }
        this.d = networkCapabilities.hasCapability(16) ? com.plaid.internal.EnumC0697z.YES : com.plaid.internal.EnumC0697z.NO;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("type=");
        sb.append(this.f6409a.name());
        sb.append(", foreground=");
        sb.append(this.b);
        sb.append(", internet capable=");
        sb.append(this.c);
        sb.append(", validated=");
        sb.append(this.d);
        return sb.toString();
    }
}
