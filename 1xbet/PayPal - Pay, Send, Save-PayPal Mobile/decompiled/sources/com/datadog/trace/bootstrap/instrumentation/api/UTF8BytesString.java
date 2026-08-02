package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public final class UTF8BytesString implements java.lang.CharSequence {
    public static final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString EMPTY = create("");
    private byte[] getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;

    public static com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString create(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence instanceof com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString) {
            return (com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString) charSequence;
        }
        return new com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString(java.lang.String.valueOf(charSequence));
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString create(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString(bArr);
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString create(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString(str, bArr);
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString create(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString(bArr);
    }

    private UTF8BytesString(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    private UTF8BytesString(byte[] bArr) {
        this(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), bArr);
    }

    private UTF8BytesString(java.lang.String str, byte[] bArr) {
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return this.getHighSpeedVideoSizes.equals(obj instanceof com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString ? ((com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString) obj).getHighSpeedVideoSizes : null);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.getHighSpeedVideoSizes.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.getHighSpeedVideoSizes.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return this.getHighSpeedVideoSizes.subSequence(i, i2);
    }

    public final int encodedLength() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        return this.getHighSpeedVideoFpsRanges.length;
    }

    public final byte[] getUtf8Bytes() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void transferTo(java.nio.ByteBuffer byteBuffer) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        byteBuffer.put(this.getHighSpeedVideoFpsRanges);
    }
}
