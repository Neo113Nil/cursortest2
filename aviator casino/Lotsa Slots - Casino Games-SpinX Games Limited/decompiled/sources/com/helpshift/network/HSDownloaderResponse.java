package com.helpshift.network;

/* loaded from: classes2.dex */
public class HSDownloaderResponse {
    public final java.lang.String encoding;
    public final java.lang.String etag;
    public final org.json.JSONObject headers;
    public final boolean isSuccess;
    public final java.lang.String mimetype;
    public final int status;

    public HSDownloaderResponse(int i, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        this.status = i;
        this.headers = jSONObject;
        this.etag = str;
        this.mimetype = str2;
        this.encoding = str3;
        this.isSuccess = z;
    }
}
