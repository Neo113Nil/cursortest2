package Q1;

/* loaded from: classes.dex */
public final class k extends Q1.n {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f1633c;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0077, code lost:
    
        if (r1.intValue() >= 9) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0071  */
    static {
        int i2;
        int i3;
        java.lang.Integer valueOf;
        int i4;
        boolean z2 = true;
        java.lang.String property = java.lang.System.getProperty("java.specification.version");
        if (property != null) {
            u0.AbstractC0995a.b(10);
            int length = property.length();
            if (length != 0) {
                char charAt = property.charAt(0);
                int i5 = -2147483647;
                if (kotlin.jvm.internal.i.f(charAt, 48) >= 0) {
                    i2 = 0;
                } else if (length != 1) {
                    if (charAt == '+') {
                        i2 = 1;
                        i3 = 0;
                        int i6 = 0;
                        int i7 = -59652323;
                        while (i2 < length) {
                            int digit = java.lang.Character.digit((int) property.charAt(i2), 10);
                            if (digit >= 0 && ((i6 >= i7 || (i7 == -59652323 && i6 >= (i7 = i5 / 10))) && (i4 = i6 * 10) >= i5 + digit)) {
                                i6 = i4 - digit;
                                i2++;
                            }
                        }
                        valueOf = i3 == 0 ? java.lang.Integer.valueOf(i6) : java.lang.Integer.valueOf(-i6);
                        if (valueOf == null) {
                            try {
                                javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", null);
                            } catch (java.lang.NoSuchMethodException unused) {
                                z2 = false;
                                f1633c = z2;
                            }
                        }
                        f1633c = z2;
                    }
                    if (charAt == '-') {
                        i5 = Integer.MIN_VALUE;
                        i2 = 1;
                    }
                }
                i3 = i2;
                int i62 = 0;
                int i72 = -59652323;
                while (i2 < length) {
                }
                if (i3 == 0) {
                }
                if (valueOf == null) {
                }
                f1633c = z2;
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
        f1633c = z2;
    }

    @Override // Q1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : protocols) {
            if (((I1.t) obj) != I1.t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((I1.t) it.next()).f827a);
        }
        java.lang.Object[] array = arrayList2.toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((java.lang.String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // Q1.n
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }
}
