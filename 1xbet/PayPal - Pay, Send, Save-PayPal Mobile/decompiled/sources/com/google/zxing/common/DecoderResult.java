package com.google.zxing.common;

/* loaded from: classes9.dex */
public final class DecoderResult {
    private final java.util.List<byte[]> byteSegments;
    private final java.lang.String ecLevel;
    private java.lang.Integer erasures;
    private java.lang.Integer errorsCorrected;
    private int numBits;
    private java.lang.Object other;
    private final byte[] rawBytes;
    private final int structuredAppendParity;
    private final int structuredAppendSequenceNumber;
    private final int symbologyModifier;
    private final java.lang.String text;

    public DecoderResult(byte[] bArr, java.lang.String str, java.util.List<byte[]> list, java.lang.String str2) {
        this(bArr, str, list, str2, -1, -1, 0);
    }

    public DecoderResult(byte[] bArr, java.lang.String str, java.util.List<byte[]> list, java.lang.String str2, int i) {
        this(bArr, str, list, str2, -1, -1, i);
    }

    public DecoderResult(byte[] bArr, java.lang.String str, java.util.List<byte[]> list, java.lang.String str2, int i, int i2) {
        this(bArr, str, list, str2, i, i2, 0);
    }

    public DecoderResult(byte[] bArr, java.lang.String str, java.util.List<byte[]> list, java.lang.String str2, int i, int i2, int i3) {
        this.rawBytes = bArr;
        this.numBits = bArr == null ? 0 : bArr.length * 8;
        this.text = str;
        this.byteSegments = list;
        this.ecLevel = str2;
        this.structuredAppendParity = i2;
        this.structuredAppendSequenceNumber = i;
        this.symbologyModifier = i3;
    }

    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    public final int getNumBits() {
        return this.numBits;
    }

    public final void setNumBits(int i) {
        this.numBits = i;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.util.List<byte[]> getByteSegments() {
        return this.byteSegments;
    }

    public final java.lang.String getECLevel() {
        return this.ecLevel;
    }

    public final java.lang.Integer getErrorsCorrected() {
        return this.errorsCorrected;
    }

    public final void setErrorsCorrected(java.lang.Integer num) {
        this.errorsCorrected = num;
    }

    public final java.lang.Integer getErasures() {
        return this.erasures;
    }

    public final void setErasures(java.lang.Integer num) {
        this.erasures = num;
    }

    public final java.lang.Object getOther() {
        return this.other;
    }

    public final void setOther(java.lang.Object obj) {
        this.other = obj;
    }

    public final boolean hasStructuredAppend() {
        return this.structuredAppendParity >= 0 && this.structuredAppendSequenceNumber >= 0;
    }

    public final int getStructuredAppendParity() {
        return this.structuredAppendParity;
    }

    public final int getStructuredAppendSequenceNumber() {
        return this.structuredAppendSequenceNumber;
    }

    public final int getSymbologyModifier() {
        return this.symbologyModifier;
    }
}
