package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class Surface implements java.io.Serializable {
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public Surface(java.lang.String str) {
        this(false, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Surface() {
        this(true, r0);
        java.lang.String str;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName())) {
            str = null;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("mobileapp://");
            sb.append(com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName());
            str = sb.toString();
        }
    }

    private Surface(boolean z, java.lang.String str) {
        java.lang.String str2 = "unknown";
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) ? "unknown" : str;
            return;
        }
        java.lang.String applicationPackageName = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName();
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(applicationPackageName)) {
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
                str2 = "mobileapp://".concat(java.lang.String.valueOf(applicationPackageName));
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("mobileapp://");
                sb.append(applicationPackageName);
                sb.append(java.io.File.separator);
                sb.append(str);
                str2 = sb.toString();
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }

    public java.lang.String getUri() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isValid() {
        try {
            new java.net.URI(this.getHighResolutionOutputSizeshNQ4ISI);
            return this.getHighResolutionOutputSizeshNQ4ISI.startsWith("mobileapp://");
        } catch (java.net.URISyntaxException unused) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Surface", "Invalid surface URI found: %s", this.getHighResolutionOutputSizeshNQ4ISI);
            return false;
        }
    }

    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.adobe.marketing.mobile.messaging.Surface) {
            return ((com.adobe.marketing.mobile.messaging.Surface) obj).getUri().equals(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    public java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    static com.adobe.marketing.mobile.messaging.Surface Camera2StreamConfigurationMap(java.lang.String str) {
        com.adobe.marketing.mobile.messaging.Surface surface = new com.adobe.marketing.mobile.messaging.Surface(true, str);
        if (surface.isValid()) {
            return surface;
        }
        return null;
    }

    public java.util.Map<java.lang.String, java.lang.Object> toEventData() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("uri", this.getHighResolutionOutputSizeshNQ4ISI);
        return hashMap;
    }

    public static com.adobe.marketing.mobile.messaging.Surface fromEventData(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map) || !map.containsKey("uri")) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Surface", "Cannot create Surface object, provided data Map is empty or null.", new java.lang.Object[0]);
            return null;
        }
        java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(map, "uri", null);
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Surface", "Cannot create Surface object, provided data does not contain a valid uri.", new java.lang.Object[0]);
            return null;
        }
        com.adobe.marketing.mobile.messaging.Surface surface = new com.adobe.marketing.mobile.messaging.Surface(true, optString);
        if (surface.isValid()) {
            return surface;
        }
        return null;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = objectInputStream.readUTF();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeUTF(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
