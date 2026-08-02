package org.apache.commons.imaging.icc;

/* loaded from: classes17.dex */
interface IccTagDataType {
    void dump(java.lang.String str, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    java.lang.String getName();

    int getSignature();
}
