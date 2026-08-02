package my.com.softspace.auditlog.service;

/* loaded from: classes17.dex */
public class AuditLogProperties {
    private final long getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;

    public AuditLogProperties(java.util.Properties properties) {
        this.getHighSpeedVideoSizes = my.com.softspace.common.util.PropertiesUtil.getString(properties, "ssmobile.host");
        this.getHighSpeedVideoFpsRanges = my.com.softspace.common.util.PropertiesUtil.getLong(properties, "ssmobile.refresh-interval").longValue();
    }

    public java.lang.String getHost() {
        return this.getHighSpeedVideoSizes;
    }

    public long getRefreshInterval() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
