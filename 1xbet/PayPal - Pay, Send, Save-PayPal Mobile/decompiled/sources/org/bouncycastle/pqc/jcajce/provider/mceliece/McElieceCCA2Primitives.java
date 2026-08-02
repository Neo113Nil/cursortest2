package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public final class McElieceCCA2Primitives {
    public static org.bouncycastle.pqc.math.linearalgebra.GF2Vector encryptionPrimitive(org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey, org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector, org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector2) {
        return (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) bCMcElieceCCA2PublicKey.getG().leftMultiplyLeftCompactForm(gF2Vector).add(gF2Vector2);
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2Vector encryptionPrimitive(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters, org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector, org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector2) {
        return (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) mcElieceCCA2PublicKeyParameters.getG().leftMultiplyLeftCompactForm(gF2Vector).add(gF2Vector2);
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2Vector[] decryptionPrimitive(org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey, org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector) {
        int k = bCMcElieceCCA2PrivateKey.getK();
        org.bouncycastle.pqc.math.linearalgebra.Permutation p = bCMcElieceCCA2PrivateKey.getP();
        org.bouncycastle.pqc.math.linearalgebra.GF2mField field = bCMcElieceCCA2PrivateKey.getField();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM goppaPoly = bCMcElieceCCA2PrivateKey.getGoppaPoly();
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix h = bCMcElieceCCA2PrivateKey.getH();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] qInv = bCMcElieceCCA2PrivateKey.getQInv();
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector2 = (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) gF2Vector.multiply(p.computeInverse());
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector syndromeDecode = org.bouncycastle.pqc.math.linearalgebra.GoppaCode.syndromeDecode((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) h.rightMultiply(gF2Vector2), field, goppaPoly, qInv);
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector3 = (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) ((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) gF2Vector2.add(syndromeDecode)).multiply(p);
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector[]{gF2Vector3.extractRightVector(k), (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) syndromeDecode.multiply(p)};
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2Vector[] decryptionPrimitive(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters, org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector) {
        int k = mcElieceCCA2PrivateKeyParameters.getK();
        org.bouncycastle.pqc.math.linearalgebra.Permutation p = mcElieceCCA2PrivateKeyParameters.getP();
        org.bouncycastle.pqc.math.linearalgebra.GF2mField field = mcElieceCCA2PrivateKeyParameters.getField();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM goppaPoly = mcElieceCCA2PrivateKeyParameters.getGoppaPoly();
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix h = mcElieceCCA2PrivateKeyParameters.getH();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] qInv = mcElieceCCA2PrivateKeyParameters.getQInv();
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector2 = (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) gF2Vector.multiply(p.computeInverse());
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector syndromeDecode = org.bouncycastle.pqc.math.linearalgebra.GoppaCode.syndromeDecode((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) h.rightMultiply(gF2Vector2), field, goppaPoly, qInv);
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector3 = (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) ((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) gF2Vector2.add(syndromeDecode)).multiply(p);
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector[]{gF2Vector3.extractRightVector(k), (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) syndromeDecode.multiply(p)};
    }

    private McElieceCCA2Primitives() {
    }
}
