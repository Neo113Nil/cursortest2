package org.bouncycastle.jce;

/* loaded from: classes17.dex */
public class ECNamedCurveTable {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        r0 = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.bouncycastle.jce.spec.ECNamedCurveParameterSpec getParameterSpec(java.lang.String str) {
        org.bouncycastle.asn1.x9.X9ECParameters byName = org.bouncycastle.crypto.ec.CustomNamedCurves.getByName(str);
        if (byName == null) {
            try {
                byName = org.bouncycastle.crypto.ec.CustomNamedCurves.getByOID(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str));
            } catch (java.lang.IllegalArgumentException unused) {
            }
            if (byName == null && byName == null) {
                try {
                    byName = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str));
                } catch (java.lang.IllegalArgumentException unused2) {
                }
            }
        }
        if (byName == null) {
            return null;
        }
        return new org.bouncycastle.jce.spec.ECNamedCurveParameterSpec(str, byName.getCurve(), byName.getG(), byName.getN(), byName.getH(), byName.getSeed());
    }

    public static java.util.Enumeration getNames() {
        return org.bouncycastle.asn1.x9.ECNamedCurveTable.getNames();
    }
}
