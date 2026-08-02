package com.google.android.datatransport.cct.internal;

/* loaded from: classes8.dex */
final class AutoValue_AndroidClientInfo extends com.google.android.datatransport.cct.internal.AndroidClientInfo {
    private final java.lang.String applicationBuild;
    private final java.lang.String country;
    private final java.lang.String device;
    private final java.lang.String fingerprint;
    private final java.lang.String hardware;
    private final java.lang.String locale;
    private final java.lang.String manufacturer;
    private final java.lang.String mccMnc;
    private final java.lang.String model;
    private final java.lang.String osBuild;
    private final java.lang.String product;
    private final java.lang.Integer sdkVersion;

    private AutoValue_AndroidClientInfo(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
        this.sdkVersion = num;
        this.model = str;
        this.hardware = str2;
        this.device = str3;
        this.product = str4;
        this.osBuild = str5;
        this.manufacturer = str6;
        this.fingerprint = str7;
        this.locale = str8;
        this.country = str9;
        this.mccMnc = str10;
        this.applicationBuild = str11;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.Integer getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getModel() {
        return this.model;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getHardware() {
        return this.hardware;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getDevice() {
        return this.device;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getProduct() {
        return this.product;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getOsBuild() {
        return this.osBuild;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getManufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getFingerprint() {
        return this.fingerprint;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getLocale() {
        return this.locale;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getCountry() {
        return this.country;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getMccMnc() {
        return this.mccMnc;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final java.lang.String getApplicationBuild() {
        return this.applicationBuild;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", hardware=");
        sb.append(this.hardware);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(", osBuild=");
        sb.append(this.osBuild);
        sb.append(", manufacturer=");
        sb.append(this.manufacturer);
        sb.append(", fingerprint=");
        sb.append(this.fingerprint);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", mccMnc=");
        sb.append(this.mccMnc);
        sb.append(", applicationBuild=");
        sb.append(this.applicationBuild);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.AndroidClientInfo)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo = (com.google.android.datatransport.cct.internal.AndroidClientInfo) obj;
        java.lang.Integer num = this.sdkVersion;
        if (num == null) {
            if (androidClientInfo.getSdkVersion() != null) {
                return false;
            }
        } else if (!num.equals(androidClientInfo.getSdkVersion())) {
            return false;
        }
        java.lang.String str = this.model;
        if (str == null) {
            if (androidClientInfo.getModel() != null) {
                return false;
            }
        } else if (!str.equals(androidClientInfo.getModel())) {
            return false;
        }
        java.lang.String str2 = this.hardware;
        if (str2 == null) {
            if (androidClientInfo.getHardware() != null) {
                return false;
            }
        } else if (!str2.equals(androidClientInfo.getHardware())) {
            return false;
        }
        java.lang.String str3 = this.device;
        if (str3 == null) {
            if (androidClientInfo.getDevice() != null) {
                return false;
            }
        } else if (!str3.equals(androidClientInfo.getDevice())) {
            return false;
        }
        java.lang.String str4 = this.product;
        if (str4 == null) {
            if (androidClientInfo.getProduct() != null) {
                return false;
            }
        } else if (!str4.equals(androidClientInfo.getProduct())) {
            return false;
        }
        java.lang.String str5 = this.osBuild;
        if (str5 == null) {
            if (androidClientInfo.getOsBuild() != null) {
                return false;
            }
        } else if (!str5.equals(androidClientInfo.getOsBuild())) {
            return false;
        }
        java.lang.String str6 = this.manufacturer;
        if (str6 == null) {
            if (androidClientInfo.getManufacturer() != null) {
                return false;
            }
        } else if (!str6.equals(androidClientInfo.getManufacturer())) {
            return false;
        }
        java.lang.String str7 = this.fingerprint;
        if (str7 == null) {
            if (androidClientInfo.getFingerprint() != null) {
                return false;
            }
        } else if (!str7.equals(androidClientInfo.getFingerprint())) {
            return false;
        }
        java.lang.String str8 = this.locale;
        if (str8 == null) {
            if (androidClientInfo.getLocale() != null) {
                return false;
            }
        } else if (!str8.equals(androidClientInfo.getLocale())) {
            return false;
        }
        java.lang.String str9 = this.country;
        if (str9 == null) {
            if (androidClientInfo.getCountry() != null) {
                return false;
            }
        } else if (!str9.equals(androidClientInfo.getCountry())) {
            return false;
        }
        java.lang.String str10 = this.mccMnc;
        if (str10 == null) {
            if (androidClientInfo.getMccMnc() != null) {
                return false;
            }
        } else if (!str10.equals(androidClientInfo.getMccMnc())) {
            return false;
        }
        java.lang.String str11 = this.applicationBuild;
        if (str11 == null) {
            if (androidClientInfo.getApplicationBuild() != null) {
                return false;
            }
        } else if (!str11.equals(androidClientInfo.getApplicationBuild())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        java.lang.Integer num = this.sdkVersion;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.String str = this.model;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.hardware;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.device;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.product;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.osBuild;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.manufacturer;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.fingerprint;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.locale;
        int hashCode9 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.country;
        int hashCode10 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.mccMnc;
        int hashCode11 = str10 == null ? 0 : str10.hashCode();
        java.lang.String str11 = this.applicationBuild;
        return ((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ (str11 != null ? str11.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder {
        private java.lang.String applicationBuild;
        private java.lang.String country;
        private java.lang.String device;
        private java.lang.String fingerprint;
        private java.lang.String hardware;
        private java.lang.String locale;
        private java.lang.String manufacturer;
        private java.lang.String mccMnc;
        private java.lang.String model;
        private java.lang.String osBuild;
        private java.lang.String product;
        private java.lang.Integer sdkVersion;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setSdkVersion(java.lang.Integer num) {
            this.sdkVersion = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setModel(java.lang.String str) {
            this.model = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setHardware(java.lang.String str) {
            this.hardware = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setDevice(java.lang.String str) {
            this.device = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setProduct(java.lang.String str) {
            this.product = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setOsBuild(java.lang.String str) {
            this.osBuild = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setManufacturer(java.lang.String str) {
            this.manufacturer = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setFingerprint(java.lang.String str) {
            this.fingerprint = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setLocale(java.lang.String str) {
            this.locale = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setCountry(java.lang.String str) {
            this.country = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setMccMnc(java.lang.String str) {
            this.mccMnc = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setApplicationBuild(java.lang.String str) {
            this.applicationBuild = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.AndroidClientInfo build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo(this.sdkVersion, this.model, this.hardware, this.device, this.product, this.osBuild, this.manufacturer, this.fingerprint, this.locale, this.country, this.mccMnc, this.applicationBuild);
        }
    }
}
