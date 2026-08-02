package my.com.softspace.auditlog.vo;

/* loaded from: classes17.dex */
public class AttestTransactionLogEntry {
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Long getHighSpeedVideoFpsRangesFor;
    private java.lang.Long getHighSpeedVideoSizes;

    public AttestTransactionLogEntry(java.lang.Long l, java.lang.String str, java.lang.Long l2) {
        this.getHighSpeedVideoSizes = l;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = l2;
    }

    public java.lang.Long getAttestId() {
        return this.getHighSpeedVideoSizes;
    }

    public void setAttestId(java.lang.Long l) {
        this.getHighSpeedVideoSizes = l;
    }

    public java.lang.String getKsn() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setKsn(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public java.lang.Long getTimestamp() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setTimestamp(java.lang.Long l) {
        this.getHighSpeedVideoFpsRangesFor = l;
    }
}
