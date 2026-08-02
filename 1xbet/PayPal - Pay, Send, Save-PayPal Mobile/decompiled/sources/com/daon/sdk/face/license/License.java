package com.daon.sdk.face.license;

/* loaded from: classes7.dex */
public class License {
    public static final java.lang.String FEATURE_BLINK = "blink";
    public static final java.lang.String FEATURE_CLR = "clr";
    public static final java.lang.String FEATURE_HMD = "hmd";
    public static final java.lang.String FEATURE_LIVENESS = "liveness";
    public static final java.lang.String FEATURE_MASK = "mask";
    public static final java.lang.String FEATURE_POSITION = "position";
    public static final java.lang.String FEATURE_QUALITY = "quality";
    public static final java.lang.String FEATURE_VERIFICATION = "verification";
    byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private boolean getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private java.lang.String getOutputMinFrameDuration;
    private final android.os.Bundle getHighSpeedVideoSizesFor = new android.os.Bundle();
    private final java.text.SimpleDateFormat getOutputFormats = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public License(java.io.InputStream inputStream) {
        this.getInputFormats = false;
        if (inputStream != null) {
            byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(inputStream);
            this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
            if (getHighSpeedVideoSizes(new java.lang.String(Camera2StreamConfigurationMap))) {
                java.lang.String lowerCase = this.getHighSpeedVideoFpsRanges.toLowerCase();
                int i = 0;
                for (int i2 = 0; i2 < lowerCase.length(); i2++) {
                    i = (i * 31) + lowerCase.charAt(i2);
                }
                if (-2038717326 == i) {
                    this.getInputFormats = getHighSpeedVideoFpsRanges("MIIFaDCCA1CgAwIBAgIQQeF+WvTRdk6rayiwb2yAdDANBgkqhkiG9w0BAQsFADCBuDETMBEGCgmSJomT8ixkARkWA2NvbTEaMBgGCgmSJomT8ixkARkWCm1hc3RlcmNhcmQxCzAJBgNVBAYTAkJFMR0wGwYDVQQKExRNYXN0ZXJDYXJkIFdvcmxkd2lkZTEbMBkGA1UECxMSQ29ycG9yYXRlIFNlY3VyaXR5MTwwOgYDVQQDEzNNYXN0ZXJDYXJkIFRTVCBBcHBsaWNhdGlvbiBJbmZyYXN0cnVjdHVyZSBTdWIgQ0EgRzIwHhcNMTYwNTI0MjE1MDA5WhcNMjAwNTIzMjEyNzI5WjCBrzELMAkGA1UEBhMCVVMxETAPBgNVBAgTCE1pc3NvdXJpMRQwEgYDVQQHEwtTYWludCBMb3VpczE0MDIGA1UEChMrTWFzdGVyQ2FyZCBXb3JsZFdpZGUgLSBDb21tb24gUHJvZEluZnJhIFNTTDEYMBYGA1UECxMPSURYIEZhY2VMaWNlbnNlMScwJQYDVQQDEx5JZGVudGl0eSBYIEZhY2VTREsgTGljZW5zZSBLZXkwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDv6+q9DYExiSWuch4x303R59D19x82LzoZDYcCD2qzxiNtVBhggboXett4e5sVawUMkUxuJ3QChurQh7p8k/UBQnK3DyYp+2uK+/Zk3Bt8gXoOebZimw8Z2+iwqf1WbcnUzTcKnVRo1U5oWzFhmr6Mso6t0DGtT4mpLPidOL7QKeYpl7DMAThpw7Lx7vkvf0pmkWTHpHb2THMJlzeK+0HJioNO5VWpCjIFNXLCH9DvvHvb0FIprVMeJhzxeS99jp5yNx+bdauyAQmvLb5MVnbCJwbq+WpoxI0i491rc+aIJPEqB1fmGZSK+OJGM6epwTKhPCkrg/WoW2pZZSQCcJuvAgMBAAGjdTBzMB8GA1UdIwQYMBaAFK9QBv8UgkLIVjG06bTbivOwcrxSMAwGA1UdEwEB/wQCMAAwEwYDVR0lBAwwCgYIKwYBBQUHAwEwDgYDVR0PAQH/BAQDAgWgMB0GA1UdDgQWBBSKBNEuS7GuJYOoJzzQd8XTmiNs6jANBgkqhkiG9w0BAQsFAAOCAgEARSgCEePBjypr5LkaBu1+NO+2fEZWYpcKK3tiSbjk+wb1q+tznieUy4lXWYTVWgvrV+liq/cT/PJDBHzDZpIhcU6ARwRieam/hKWaResWyGsK556V8M59L6VKAx8SHhS9sgVolxPVZk+qxRSY+cNgl4qqQoi1oBstn3P+SJFXA8nxH6s3x1qIHNjD02W+UVDJI0IdfSnJ34ts8JKqu2Q5A63EwtJKcXyx2rkyUjKF1qA8b5R4RRNWP7jkdJI46m+PXZGipl1TBnuhSmv1ZDzXipaehvu5LcPcw/4MKA5e6OrDTKm5/laGNG9BLlQlN4PqTQiHz07luFoEBgxf/vet5CtnT9OQjHC1b30SdkXRFTTzoVazi3gzziIJScNh6o85a77NJiQpEftjYZUBlkye6LEcstWObVzvsRBr/dFhx4eCE/bW1xzzaxwTSeZt2yCENTgaDyuYIRxmJlHMi+Idh8ZQZe121+3LmWQAm0Mp0qVGfyvKjnme1GxI9pm3ScdNJzD3WRz3B1hxPYjdVtX31b2TXZ9+3NZ/gzbhj1O7FI+UBT1Afs+HBZTLd9fzqxd9AlU+m2P1rxCdFbdl0XYrj2dATQEudKK8nXY+tOY1yuxygmArP0jy0KJ1cBPwVJzwaCHe8XMeF/iaF2ZgfMZmLZPmQOBZ2y5ENstDmMucfms=");
                } else {
                    this.getInputFormats = getHighSpeedVideoFpsRanges("MIIDwjCCAqoCCQC4QPdtJ4W3pzANBgkqhkiG9w0BAQUFADCBojELMAkGA1UEBhMCVVMxETAPBgNVBAgTCFZpcmdpbmlhMQ8wDQYDVQQHEwZSZXN0b24xEjAQBgNVBAoTCUlkZW50aXR5WDEbMBkGA1UECxMSUHJvZHVjdCBNYW5hZ2VtZW50MRwwGgYDVQQDExNMaWNlbnNlIEtleSBNYW5hZ2VyMSAwHgYJKoZIhvcNAQkBFhFsaWNlbnNlc0BkYW9uLmNvbTAeFw0xMzExMjExNTU1MTBaFw0yNzA3MzExNTU1MTBaMIGiMQswCQYDVQQGEwJVUzERMA8GA1UECBMIVmlyZ2luaWExDzANBgNVBAcTBlJlc3RvbjESMBAGA1UEChMJSWRlbnRpdHlYMRswGQYDVQQLExJQcm9kdWN0IE1hbmFnZW1lbnQxHDAaBgNVBAMTE0xpY2Vuc2UgS2V5IE1hbmFnZXIxIDAeBgkqhkiG9w0BCQEWEWxpY2Vuc2VzQGRhb24uY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxnwJ6AoT17JRcGTpMX6oySy+K09/EUNOIDVEasSkWhXlJTLzBf1PqWHhxFU9ry0mswRbjEW+cgsG4xQpu9SUt8+LEQ21vVJ30aEboxtE5YMYooFWfojnkM9wBfhNcubOM7xIXsb6nyCrGKn6gdS97cerXv4tILid4zg6fchqAhDIlkoDx8yYc/K15+W+oWdoqu23xJ2gqwpHBZAOlr+vbOwqxfmDXGo3UbIgfAedgR0QJjAwm8nKpZZijOU+m1YS6kriz9zms9iiVP+YGETXYmnVdwuOYw7SFhjCzXypzC/BsnOJVeB7R2TKBWjba/tTZdmflR2QlLxGYNpAH9pqzwIDAQABMA0GCSqGSIb3DQEBBQUAA4IBAQAoyBTqQaHYp7ey20q3GRpPmeoLnqp5AcRfHXJMqGFa+TYmFGemcpgmUWxGYcISUJ1iaBTbRFoLza6pB5mD/I1Uj4Ix5Ri0P2jFPUeeHphrh3dBy3RiLB0bgwEh8nD4k61K4+hPSjJ29Wh1sFF8quMTCvDE0hCe8yR/ZUHnWSDZxKP7BWw3MO4hUblgFZc5bDOWL/yKdG47e9+ihpqR4t6iZiEIOeSk3YpCNye4HqPXhFSUmywghU0/GfoU765GjhJQmCW/XNy47sDV5zMNy1WuVTs8Z9WJ/LJZPGzUdo2mnWWu8KOSqwbGEQGDCePDLUENDHeQHJyvBs9fCe0liLZT");
                }
            }
        }
    }

    private static byte[] Camera2StreamConfigurationMap(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    private boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        try {
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(android.util.Base64.decode(str, 0)));
            java.security.Signature signature = java.security.Signature.getInstance("SHA1withRSA");
            x509Certificate.getPublicKey();
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(this.getHighResolutionOutputSizeshNQ4ISI);
            return signature.verify(this.getHighSpeedVideoSizes);
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    private boolean getHighSpeedVideoSizes(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.getHighSpeedVideoFpsRanges = jSONObject.getString("organization");
            this.getHighSpeedVideoSizes = android.util.Base64.decode(jSONObject.getString("signature"), 0);
            jSONObject.getString("version");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS);
            if (optJSONObject != null) {
                java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    this.getHighSpeedVideoSizesFor.putString(next, optJSONObject.getString(next));
                }
            }
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("signed");
            this.getOutputMinFrameDuration = jSONObject2.getString("applicationIdentifier");
            this.getInputSizeshNQ4ISI = jSONObject2.getString("expiry");
            org.json.JSONArray optJSONArray = jSONObject2.optJSONArray("features");
            if (optJSONArray != null) {
                this.getHighSpeedVideoFpsRangesFor = new java.lang.String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.getHighSpeedVideoFpsRangesFor[i] = (java.lang.String) optJSONArray.get(i);
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getOutputMinFrameDuration);
            sb.append(" ");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append(" ");
            java.util.List asList = java.util.Arrays.asList(this.getHighSpeedVideoFpsRangesFor);
            java.util.Collections.sort(asList);
            if (asList.size() != 0) {
                sb.append((java.lang.String) asList.get(0));
                for (int i2 = 1; i2 < asList.size(); i2++) {
                    sb.append(", ");
                    sb.append((java.lang.String) asList.get(i2));
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = sb.toString().getBytes();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public android.os.Bundle getExtensions() {
        return this.getHighSpeedVideoSizesFor;
    }

    public byte[] getLicense() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getOrganization() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getPackageName() {
        int indexOf = this.getOutputMinFrameDuration.indexOf(42);
        return indexOf < 0 ? this.getOutputMinFrameDuration : this.getOutputMinFrameDuration.substring(0, indexOf - 1);
    }

    public boolean hasExpired() {
        try {
            return new java.util.Date(java.lang.System.currentTimeMillis() - 86400000).after(this.getOutputFormats.parse(this.getInputSizeshNQ4ISI));
        } catch (java.text.ParseException unused) {
            return true;
        }
    }

    public boolean isVerified() {
        return this.getInputFormats;
    }

    public boolean supportsFeature(java.lang.String str) {
        if (isVerified() && !hasExpired()) {
            for (java.lang.String str2 : this.getHighSpeedVideoFpsRangesFor) {
                if (str2.equalsIgnoreCase(str) || str2.equalsIgnoreCase("ALL")) {
                    return true;
                }
            }
        }
        return false;
    }
}
