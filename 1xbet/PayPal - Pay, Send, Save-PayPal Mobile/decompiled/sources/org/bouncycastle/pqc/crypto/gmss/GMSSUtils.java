package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
class GMSSUtils {
    static byte[][] getHighSpeedVideoFpsRangesFor(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i != bArr.length; i++) {
            bArr2[i] = org.bouncycastle.util.Arrays.clone(bArr[i]);
        }
        return bArr2;
    }

    static org.bouncycastle.pqc.crypto.gmss.Treehash[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.gmss.Treehash[] treehashArr) {
        if (treehashArr == null) {
            return null;
        }
        org.bouncycastle.pqc.crypto.gmss.Treehash[] treehashArr2 = new org.bouncycastle.pqc.crypto.gmss.Treehash[treehashArr.length];
        java.lang.System.arraycopy(treehashArr, 0, treehashArr2, 0, treehashArr.length);
        return treehashArr2;
    }

    static java.util.Vector[] getHighResolutionOutputSizeshNQ4ISI(java.util.Vector[] vectorArr) {
        if (vectorArr == null) {
            return null;
        }
        java.util.Vector[] vectorArr2 = new java.util.Vector[vectorArr.length];
        for (int i = 0; i != vectorArr.length; i++) {
            vectorArr2[i] = new java.util.Vector();
            java.util.Enumeration elements = vectorArr[i].elements();
            while (elements.hasMoreElements()) {
                vectorArr2[i].addElement(elements.nextElement());
            }
        }
        return vectorArr2;
    }

    GMSSUtils() {
    }
}
