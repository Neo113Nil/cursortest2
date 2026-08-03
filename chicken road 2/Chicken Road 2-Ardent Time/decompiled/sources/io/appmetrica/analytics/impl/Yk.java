package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yk {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0474k2 f5354a;

    public Yk(io.appmetrica.analytics.impl.InterfaceC0474k2 interfaceC0474k2) {
        this.f5354a = interfaceC0474k2;
    }

    public final java.util.ArrayList a(java.lang.Iterable iterable) {
        java.lang.String str;
        java.lang.String a2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            try {
                a2 = this.f5354a.a(str2);
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
            if (a2 == null || (str = io.appmetrica.analytics.coreutils.internal.StringUtils.toHexString(java.security.MessageDigest.getInstance("SHA-256").digest(a2.getBytes(y1.a.f8486a)))) == null) {
                io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.Companion.getAnonymousInstance().info("Input " + str2 + " is not a valid data", new java.lang.Object[0]);
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
