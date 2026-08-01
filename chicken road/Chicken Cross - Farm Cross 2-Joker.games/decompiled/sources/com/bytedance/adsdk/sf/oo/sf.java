package com.bytedance.adsdk.sf.oo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes4.dex */
public class sf implements wh {
    @Override // com.bytedance.adsdk.sf.oo.wh
    public oo pcc(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new pcc(httpURLConnection);
    }
}
