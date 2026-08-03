package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.rB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2234rB {
    public static java.lang.String[] A02 = {"FI4CSn5g4hVI", "oUnbtikCS", "OTKcg3hD6eE6nFWotwGGZ5F", "qSmHeLCnLYm7Z6Tg4tQ0z3dsx", "SCLx27yKxe6yDyiZK0iEJT9ptP", "bFFCI01IIFvt0fl9DXgL6XUawg", "6J2GgEdIUlJLk3yvVentjGe1dkRWCLvM", "KM6GnpQ6vjKv"};
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C2245rN> A00;
    public final java.util.Set<com.facebook.ads.redexgen.core.C2245rN> A01;

    public C2234rB() {
        this.A00 = new java.util.HashMap();
        this.A01 = new java.util.HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Collection<com.facebook.ads.redexgen.core.C2245rN> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Collection<com.facebook.ads.redexgen.core.C2245rN> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        java.util.Iterator<com.facebook.ads.redexgen.core.C2245rN> it = this.A01.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String[] strArr = A02;
            if (strArr[5].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[6] = "aJOeJxsM87dt105FXzNZlrhAEbJ2aQd4";
            if (hasNext) {
                com.facebook.ads.redexgen.core.C2245rN next = it.next();
                this.A00.put(next.A02, next);
            } else {
                this.A01.clear();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(com.facebook.ads.redexgen.core.C2245rN c2245rN) {
        if (this.A01.add(c2245rN)) {
            this.A00.remove(c2245rN.A02);
            return true;
        }
        return false;
    }
}
