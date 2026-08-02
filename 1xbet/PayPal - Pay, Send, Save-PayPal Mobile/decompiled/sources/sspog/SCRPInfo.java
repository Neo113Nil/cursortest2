package sspog;

/* loaded from: classes18.dex */
public class SCRPInfo {
    private java.lang.String appName;
    private java.lang.String cpuid;
    private java.lang.String firmwareName;
    private java.lang.String firmwareVersion;
    private java.lang.String hardwareVersion;
    private java.lang.String loaderName;
    private java.lang.String loaderVersion;
    private java.lang.String model;
    private java.lang.String pkaaVersion;
    private java.lang.String pkfaVersion;
    private java.lang.String pkkaVersion;
    private java.lang.String promptVersion;
    private java.lang.String serialNumber;
    private boolean tamper;
    private java.lang.String versionName;

    public boolean getTamper() {
        return this.tamper;
    }

    public void setTamper(boolean z) {
        this.tamper = z;
    }

    public java.lang.String getCpuid() {
        return this.cpuid;
    }

    public void setCpuid(java.lang.String str) {
        this.cpuid = str;
    }

    public java.lang.String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(java.lang.String str) {
        this.serialNumber = str;
    }

    public java.lang.String getModel() {
        return this.model;
    }

    public void setModel(java.lang.String str) {
        this.model = str;
    }

    public java.lang.String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(java.lang.String str) {
        this.versionName = str;
    }

    public java.lang.String getFirmwareName() {
        return this.firmwareName;
    }

    public void setFirmwareName(java.lang.String str) {
        this.firmwareName = str;
    }

    public java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public void setFirmwareVersion(java.lang.String str) {
        this.firmwareVersion = str;
    }

    public java.lang.String getAppName() {
        return this.appName;
    }

    public void setAppName(java.lang.String str) {
        this.appName = str;
    }

    public java.lang.String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public void setHardwareVersion(java.lang.String str) {
        this.hardwareVersion = str;
    }

    public java.lang.String getLoaderName() {
        return this.loaderName;
    }

    public void setLoaderName(java.lang.String str) {
        this.loaderName = str;
    }

    public java.lang.String getLoaderVersion() {
        return this.loaderVersion;
    }

    public void setLoaderVersion(java.lang.String str) {
        this.loaderVersion = str;
    }

    public java.lang.String getPromptVersion() {
        return this.promptVersion;
    }

    public void setPromptVersion(java.lang.String str) {
        this.promptVersion = str;
    }

    public java.lang.String getPkfaVersion() {
        return this.pkfaVersion;
    }

    public void setPkfaVersion(java.lang.String str) {
        this.pkfaVersion = str;
    }

    public java.lang.String getPkaaVersion() {
        return this.pkaaVersion;
    }

    public void setPkaaVersion(java.lang.String str) {
        this.pkaaVersion = str;
    }

    public java.lang.String getPkkaVersion() {
        return this.pkkaVersion;
    }

    public void setPkkaVersion(java.lang.String str) {
        this.pkkaVersion = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sspog.SCRPInfo sCRPInfo = (sspog.SCRPInfo) obj;
        return this.tamper == sCRPInfo.tamper && java.util.Objects.equals(this.cpuid, sCRPInfo.cpuid) && java.util.Objects.equals(this.serialNumber, sCRPInfo.serialNumber) && java.util.Objects.equals(this.model, sCRPInfo.model) && java.util.Objects.equals(this.appName, sCRPInfo.appName) && java.util.Objects.equals(this.versionName, sCRPInfo.versionName) && java.util.Objects.equals(this.firmwareName, sCRPInfo.firmwareName) && java.util.Objects.equals(this.firmwareVersion, sCRPInfo.firmwareVersion) && java.util.Objects.equals(this.hardwareVersion, sCRPInfo.hardwareVersion) && java.util.Objects.equals(this.loaderName, sCRPInfo.loaderName) && java.util.Objects.equals(this.loaderVersion, sCRPInfo.loaderVersion) && java.util.Objects.equals(this.promptVersion, sCRPInfo.promptVersion) && java.util.Objects.equals(this.pkfaVersion, sCRPInfo.pkfaVersion) && java.util.Objects.equals(this.pkaaVersion, sCRPInfo.pkaaVersion) && java.util.Objects.equals(this.pkkaVersion, sCRPInfo.pkkaVersion);
    }

    public int hashCode() {
        boolean z = this.tamper;
        return java.util.Objects.hash(java.lang.Boolean.valueOf(z), this.cpuid, this.serialNumber, this.model, this.appName, this.versionName, this.firmwareName, this.firmwareVersion, this.hardwareVersion, this.loaderName, this.loaderVersion, this.promptVersion, this.pkfaVersion, this.pkaaVersion, this.pkkaVersion);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SCRPInfo{tamper=");
        sb.append(this.tamper);
        sb.append(", cpuid='");
        sb.append(this.cpuid);
        sb.append("', serialNumber='");
        sb.append(this.serialNumber);
        sb.append("', model='");
        sb.append(this.model);
        sb.append("', versionName='");
        sb.append(this.versionName);
        sb.append("', appName='");
        sb.append(this.appName);
        sb.append("', firmwareName='");
        sb.append(this.firmwareName);
        sb.append("', firmwareVersion='");
        sb.append(this.firmwareVersion);
        sb.append("', hardwareVersion='");
        sb.append(this.hardwareVersion);
        sb.append("', loaderName='");
        sb.append(this.loaderName);
        sb.append("', loaderVersion='");
        sb.append(this.loaderVersion);
        sb.append("', promptVersion='");
        sb.append(this.promptVersion);
        sb.append("', pkfaVersion='");
        sb.append(this.pkfaVersion);
        sb.append("', pkaaVersion='");
        sb.append(this.pkaaVersion);
        sb.append("', pkkaVersion='");
        sb.append(this.pkkaVersion);
        sb.append("'}");
        return sb.toString();
    }
}
