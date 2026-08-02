package org.bouncycastle.jce;

/* loaded from: classes17.dex */
public class ECGOST3410NamedCurveTable {
    public static org.bouncycastle.jce.spec.ECNamedCurveParameterSpec getParameterSpec(java.lang.String str) {
        org.bouncycastle.asn1.x9.X9ECParameters byNameX9 = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByNameX9(str);
        if (byNameX9 == null) {
            try {
                byNameX9 = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOIDX9(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str));
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        if (byNameX9 == null) {
            return null;
        }
        return new org.bouncycastle.jce.spec.ECNamedCurveParameterSpec(str, byNameX9.getCurve(), byNameX9.getG(), byNameX9.getN(), byNameX9.getH(), byNameX9.getSeed());
    }

    public static java.util.Enumeration getNames() {
        return org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getNames();
    }
}
