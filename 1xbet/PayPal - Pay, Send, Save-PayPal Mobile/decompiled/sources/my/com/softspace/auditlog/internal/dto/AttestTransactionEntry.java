package my.com.softspace.auditlog.internal.dto;

/* loaded from: classes17.dex */
public class AttestTransactionEntry {
    private java.lang.Long Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.Long getHighSpeedVideoSizes;

    public AttestTransactionEntry(java.lang.Long l, java.lang.String str, java.lang.Long l2) {
        this.Camera2StreamConfigurationMap = l;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = l2;
    }

    public java.lang.Long getAttestId() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setAttestId(java.lang.Long l) {
        this.Camera2StreamConfigurationMap = l;
    }

    public java.lang.String getKsn() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setKsn(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public java.lang.Long getTimestamp() {
        return this.getHighSpeedVideoSizes;
    }

    public void setTimestamp(java.lang.Long l) {
        this.getHighSpeedVideoSizes = l;
    }
}
