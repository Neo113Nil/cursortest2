package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIIlIlIll {
    public final java.net.URL IllIIIllII;
    public javax.net.ssl.HttpsURLConnection llIIlIlIIl = null;
    public java.io.BufferedOutputStream IlIllIlIIl = null;
    public boolean llIIIlllll = false;

    public IIIIlIlIll(java.net.URL url) {
        this.IllIIIllII = url;
    }

    public final int IlIllIlIIl() {
        if (!this.llIIIlllll) {
            this.llIIIlllll = true;
            try {
                this.IlIllIlIIl.close();
            } catch (java.lang.Exception e) {
                throw new com.microblink.blinkid.secured.llllIIIllI(e);
            }
        }
        try {
            return llIIlIlIIl().getResponseCode();
        } catch (java.lang.Exception e2) {
            throw new com.microblink.blinkid.secured.llllIIIllI(e2);
        }
    }

    public final void IllIIIllII() {
        if (this.IlIllIlIIl == null) {
            try {
                llIIlIlIIl();
                this.llIIlIlIIl.setDoOutput(true);
                this.IlIllIlIIl = new java.io.BufferedOutputStream(llIIlIlIIl().getOutputStream(), 8192);
            } catch (java.lang.Exception e) {
                throw new com.microblink.blinkid.secured.llllIIIllI(e);
            }
        }
    }

    public final void llIIlIlIIl(java.lang.String str, byte[] bArr, java.util.Set set) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("--dVUeXyt6HFiJzCMc4h\nContent-Disposition: form-data; name=\"key\"\nContent-Length: ");
        sb.append(str.length());
        sb.append("\n\n");
        sb.append(str);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.lang.String str3 = (java.lang.String) entry.getValue();
            sb.append("--dVUeXyt6HFiJzCMc4h\nContent-Disposition: form-data; name=\"");
            sb.append(str2);
            sb.append("\"\nContent-Length: ");
            sb.append(str3.length());
            sb.append("\n\n");
            sb.append(str3);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        sb.append("--dVUeXyt6HFiJzCMc4h\nContent-Disposition: form-data; name=\"data\"; filename=\"enc-");
        sb.append(java.lang.System.currentTimeMillis());
        sb.append("\"\nContent-Type: application/octet-stream\nContent-Length: ");
        sb.append(bArr.length);
        sb.append("\n\n");
        java.lang.String obj = sb.toString();
        llIIlIlIIl().setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, com.statsig.androidsdk.HttpUtils.ENCODING_GZIP);
        llIIlIlIIl().setRequestProperty(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.KEEP_ALIVE);
        llIIlIlIIl().setDoOutput(true);
        llIIlIlIIl().setRequestProperty("Content-Type", "multipart/form-data; boundary=dVUeXyt6HFiJzCMc4h; charset=UTF-8");
        IllIIIllII();
        if (this.IlIllIlIIl == null) {
            throw new com.microblink.blinkid.secured.llllIIIllI(new java.lang.NullPointerException("outputStream == null"));
        }
        try {
            byte[] bytes = obj.getBytes("UTF-8");
            this.IlIllIlIIl.write(bytes, 0, bytes.length);
            this.IlIllIlIIl.write(bArr, 0, bArr.length);
            this.IlIllIlIIl.write("\n--dVUeXyt6HFiJzCMc4h--".getBytes("UTF-8"), 0, 23);
        } catch (java.lang.Exception e) {
            throw new com.microblink.blinkid.secured.llllIIIllI(e);
        }
    }

    public static com.microblink.blinkid.secured.IIIIlIlIll llIIlIlIIl(java.lang.String str) {
        try {
            return new com.microblink.blinkid.secured.IIIIlIlIll(new java.net.URL(str));
        } catch (java.lang.Exception e) {
            throw new com.microblink.blinkid.secured.llllIIIllI(e);
        }
    }

    public final void llIIlIlIIl(org.json.JSONObject jSONObject) {
        llIIlIlIIl().setRequestProperty("Content-Type", com.statsig.androidsdk.HttpUtils.CONTENT_TYPE_HEADER_VALUE);
        llIIlIlIIl().setRequestProperty("Accept", "application/json");
        IllIIIllII();
        if (this.IlIllIlIIl != null) {
            try {
                byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                this.IlIllIlIIl.write(bytes, 0, bytes.length);
                return;
            } catch (java.lang.Exception e) {
                throw new com.microblink.blinkid.secured.llllIIIllI(e);
            }
        }
        throw new com.microblink.blinkid.secured.llllIIIllI(new java.lang.NullPointerException("outputStream == null"));
    }

    public final javax.net.ssl.HttpsURLConnection llIIlIlIIl() {
        if (this.llIIlIlIIl == null) {
            try {
                javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) this.IllIIIllII.openConnection();
                this.llIIlIlIIl = httpsURLConnection;
                httpsURLConnection.setRequestMethod("POST");
                javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                this.llIIlIlIIl.setSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (java.lang.Exception e) {
                throw new com.microblink.blinkid.secured.llllIIIllI(e);
            }
        }
        return this.llIIlIlIIl;
    }
}
