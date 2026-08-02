package com.google.zxing.pdf417;

/* loaded from: classes9.dex */
public final class PDF417ResultMetadata {
    private java.lang.String addressee;
    private java.lang.String fileId;
    private java.lang.String fileName;
    private boolean lastSegment;
    private int[] optionalData;
    private int segmentIndex;
    private java.lang.String sender;
    private int segmentCount = -1;
    private long fileSize = -1;
    private long timestamp = -1;
    private int checksum = -1;

    public final int getSegmentIndex() {
        return this.segmentIndex;
    }

    public final void setSegmentIndex(int i) {
        this.segmentIndex = i;
    }

    public final java.lang.String getFileId() {
        return this.fileId;
    }

    public final void setFileId(java.lang.String str) {
        this.fileId = str;
    }

    @java.lang.Deprecated
    public final int[] getOptionalData() {
        return this.optionalData;
    }

    @java.lang.Deprecated
    public final void setOptionalData(int[] iArr) {
        this.optionalData = iArr;
    }

    public final boolean isLastSegment() {
        return this.lastSegment;
    }

    public final void setLastSegment(boolean z) {
        this.lastSegment = z;
    }

    public final int getSegmentCount() {
        return this.segmentCount;
    }

    public final void setSegmentCount(int i) {
        this.segmentCount = i;
    }

    public final java.lang.String getSender() {
        return this.sender;
    }

    public final void setSender(java.lang.String str) {
        this.sender = str;
    }

    public final java.lang.String getAddressee() {
        return this.addressee;
    }

    public final void setAddressee(java.lang.String str) {
        this.addressee = str;
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final void setFileName(java.lang.String str) {
        this.fileName = str;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final int getChecksum() {
        return this.checksum;
    }

    public final void setChecksum(int i) {
        this.checksum = i;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }
}
