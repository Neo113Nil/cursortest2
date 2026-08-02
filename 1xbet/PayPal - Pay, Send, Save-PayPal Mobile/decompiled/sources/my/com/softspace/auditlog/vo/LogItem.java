package my.com.softspace.auditlog.vo;

/* loaded from: classes17.dex */
public class LogItem {
    private long Camera2StreamConfigurationMap;
    private my.com.softspace.auditlog.service.intf.AuditLogger.Originator getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private int getInputSizeshNQ4ISI;
    private java.lang.Throwable getOutputMinFrameDuration;

    private LogItem(long j, java.lang.String str, java.lang.String str2, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str3, java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getInputSizeshNQ4ISI = i;
        this.getHighResolutionOutputSizeshNQ4ISI = originator;
        this.getHighSpeedVideoSizes = str3;
        this.getOutputMinFrameDuration = th;
    }

    public long getDateTime() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setDateTime(long j) {
        this.Camera2StreamConfigurationMap = j;
    }

    public java.lang.String getAttestID() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setAttestID(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public java.lang.String getEvent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setEvent(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public int getStatus() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setStatus(int i) {
        this.getInputSizeshNQ4ISI = i;
    }

    public my.com.softspace.auditlog.service.intf.AuditLogger.Originator getOrigination() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setOrigination(my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator) {
        this.getHighResolutionOutputSizeshNQ4ISI = originator;
    }

    public java.lang.String getLog() {
        return this.getHighSpeedVideoSizes;
    }

    public void setLog(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public java.lang.Throwable getThrowable() {
        return this.getOutputMinFrameDuration;
    }

    public void setThrowable(java.lang.Throwable th) {
        this.getOutputMinFrameDuration = th;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogItem{dateTime=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", attestID='");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("', event='");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("', status=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", origination=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", log='");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("', throwable=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public static class Builder {
        private java.lang.String Camera2StreamConfigurationMap;
        private my.com.softspace.auditlog.service.intf.AuditLogger.Originator getHighResolutionOutputSizeshNQ4ISI;
        private long getHighSpeedVideoFpsRanges;
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private java.lang.String getHighSpeedVideoSizes;
        private int getInputSizeshNQ4ISI;
        private java.lang.Throwable getOutputMinFrameDuration;

        public Builder(java.lang.String str, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator) {
            this.Camera2StreamConfigurationMap = str;
            this.getInputSizeshNQ4ISI = i;
            this.getHighResolutionOutputSizeshNQ4ISI = originator;
        }

        public my.com.softspace.auditlog.vo.LogItem.Builder setDateTime(long j) {
            this.getHighSpeedVideoFpsRanges = j;
            return this;
        }

        public my.com.softspace.auditlog.vo.LogItem.Builder setEvent(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
            return this;
        }

        public my.com.softspace.auditlog.vo.LogItem.Builder setStatus(int i) {
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public my.com.softspace.auditlog.vo.LogItem.Builder setOrigination(my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator) {
            this.getHighResolutionOutputSizeshNQ4ISI = originator;
            return this;
        }

        public my.com.softspace.auditlog.vo.LogItem.Builder setLog(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
            return this;
        }

        public my.com.softspace.auditlog.vo.LogItem.Builder setThrowable(java.lang.Throwable th) {
            this.getOutputMinFrameDuration = th;
            return this;
        }

        public my.com.softspace.auditlog.vo.LogItem.Builder setAttestID(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public long getDateTime() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public java.lang.String getEvent() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getStatus() {
            return this.getInputSizeshNQ4ISI;
        }

        public my.com.softspace.auditlog.service.intf.AuditLogger.Originator getOrigination() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public java.lang.String getLog() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public java.lang.Throwable getThrowable() {
            return this.getOutputMinFrameDuration;
        }

        public java.lang.String getAttestID() {
            return this.getHighSpeedVideoSizes;
        }

        public my.com.softspace.auditlog.vo.LogItem build() {
            java.lang.String str = this.Camera2StreamConfigurationMap;
            if (str == null || str.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Event shouldn't be null");
            }
            my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator = this.getHighResolutionOutputSizeshNQ4ISI;
            if (originator == null) {
                throw new java.lang.IllegalArgumentException("Origination shouldn't be null");
            }
            return new my.com.softspace.auditlog.vo.LogItem(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, originator, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, (byte) 0);
        }
    }

    /* synthetic */ LogItem(long j, java.lang.String str, java.lang.String str2, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str3, java.lang.Throwable th, byte b) {
        this(j, str, str2, i, originator, str3, th);
    }
}
