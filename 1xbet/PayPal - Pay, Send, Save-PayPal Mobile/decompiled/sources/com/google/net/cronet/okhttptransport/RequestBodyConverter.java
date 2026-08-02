package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
interface RequestBodyConverter {
    org.chromium.net.UploadDataProvider convertRequestBody(okhttp3.RequestBody requestBody, int i) throws java.io.IOException;
}
