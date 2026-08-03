package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2177pz extends java.lang.Exception implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public final int A00;
    public final long A01;
    public static final java.lang.String A03 = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final java.lang.String A04 = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final java.lang.String A07 = com.facebook.ads.redexgen.core.C5C.A0h(2);
    public static final java.lang.String A05 = com.facebook.ads.redexgen.core.C5C.A0h(3);
    public static final java.lang.String A06 = com.facebook.ads.redexgen.core.C5C.A0h(4);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2177pz> A02 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.q0
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            return new com.facebook.ads.redexgen.core.C2177pz(bundle);
        }
    };

    public C2177pz(android.os.Bundle bundle) {
        this(bundle.getString(A07), A09(bundle), bundle.getInt(A03, 1000), bundle.getLong(A04, android.os.SystemClock.elapsedRealtime()));
    }

    public C2177pz(java.lang.String str, java.lang.Throwable th, int i, long j) {
        super(str, th);
        this.A00 = i;
        this.A01 = j;
    }

    public static android.os.RemoteException A08(java.lang.String str) {
        return new android.os.RemoteException(str);
    }

    public static java.lang.Throwable A09(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(A05);
        java.lang.String causeClassName = A06;
        java.lang.String string2 = bundle.getString(causeClassName);
        java.lang.Throwable th = null;
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(string, true, com.facebook.ads.redexgen.core.C2177pz.class.getClassLoader());
            if (java.lang.Throwable.class.isAssignableFrom(cls)) {
                th = A0A(cls, string2);
            }
        } catch (java.lang.Throwable unused) {
            if (th != null) {
                return th;
            }
        }
        if (th == null) {
            return A08(string2);
        }
        return th;
    }

    public static java.lang.Throwable A0A(java.lang.Class<?> clazz, java.lang.String str) throws java.lang.Exception {
        return (java.lang.Throwable) clazz.getConstructor(java.lang.String.class).newInstance(str);
    }
}
