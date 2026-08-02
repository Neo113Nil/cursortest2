package my.com.softspace.auditlog.internal.dto;

/* loaded from: classes17.dex */
public class LogEntry {
    private java.lang.Long Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.Long getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getInputFormats;
    private java.lang.Integer getInputSizeshNQ4ISI;
    private java.lang.Integer getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;

    public java.lang.Long getId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setId(java.lang.Long l) {
        this.getHighSpeedVideoFpsRangesFor = l;
    }

    public java.lang.String getAttestID() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setAttestID(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public java.lang.Long getDateTime() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setDateTime(java.lang.Long l) {
        this.Camera2StreamConfigurationMap = l;
    }

    public java.lang.String getUserUuid() {
        return this.getInputFormats;
    }

    public void setUserUuid(java.lang.String str) {
        this.getInputFormats = str;
    }

    public java.lang.String getEvent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setEvent(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public java.lang.Integer getStatus() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setStatus(java.lang.Integer num) {
        this.getInputSizeshNQ4ISI = num;
    }

    public java.lang.Integer getOrigination() {
        return this.getOutputFormats;
    }

    public void setOrigination(java.lang.Integer num) {
        this.getOutputFormats = num;
    }

    public java.lang.String getLog() {
        return this.getHighSpeedVideoSizes;
    }

    public void setLog(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public java.lang.String getThrowable() {
        return this.getOutputMinFrameDuration;
    }

    public void setThrowable(java.lang.String str) {
        this.getOutputMinFrameDuration = str;
    }
}
