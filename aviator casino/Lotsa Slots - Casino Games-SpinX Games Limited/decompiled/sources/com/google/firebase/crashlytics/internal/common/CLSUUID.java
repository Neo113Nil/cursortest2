package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
class CLSUUID {
    private static final java.lang.String ID_SHA = com.google.firebase.crashlytics.internal.common.CommonUtils.sha1(java.util.UUID.randomUUID().toString() + java.lang.System.currentTimeMillis());
    private static final java.util.concurrent.atomic.AtomicLong sequenceNumber = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.lang.String sessionId;

    CLSUUID() {
        byte[] bArr = new byte[10];
        populateTime(bArr);
        populateSequenceNumber(bArr);
        populatePID(bArr);
        java.lang.String hexify = com.google.firebase.crashlytics.internal.common.CommonUtils.hexify(bArr);
        this.sessionId = java.lang.String.format(java.util.Locale.US, "%s%s%s%s", hexify.substring(0, 12), hexify.substring(12, 16), hexify.subSequence(16, 20), ID_SHA.substring(0, 12)).toUpperCase(java.util.Locale.US);
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    private void populateTime(byte[] bArr) {
        long time = new java.util.Date().getTime();
        byte[] convertLongToFourByteBuffer = convertLongToFourByteBuffer(time / 1000);
        bArr[0] = convertLongToFourByteBuffer[0];
        bArr[1] = convertLongToFourByteBuffer[1];
        bArr[2] = convertLongToFourByteBuffer[2];
        bArr[3] = convertLongToFourByteBuffer[3];
        byte[] convertLongToTwoByteBuffer = convertLongToTwoByteBuffer(time % 1000);
        bArr[4] = convertLongToTwoByteBuffer[0];
        bArr[5] = convertLongToTwoByteBuffer[1];
    }

    private void populateSequenceNumber(byte[] bArr) {
        byte[] convertLongToTwoByteBuffer = convertLongToTwoByteBuffer(sequenceNumber.incrementAndGet());
        bArr[6] = convertLongToTwoByteBuffer[0];
        bArr[7] = convertLongToTwoByteBuffer[1];
    }

    private void populatePID(byte[] bArr) {
        byte[] convertLongToTwoByteBuffer = convertLongToTwoByteBuffer(java.lang.Integer.valueOf(android.os.Process.myPid()).shortValue());
        bArr[8] = convertLongToTwoByteBuffer[0];
        bArr[9] = convertLongToTwoByteBuffer[1];
    }

    private static byte[] convertLongToFourByteBuffer(long j) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] convertLongToTwoByteBuffer(long j) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public java.lang.String toString() {
        return this.sessionId;
    }
}
