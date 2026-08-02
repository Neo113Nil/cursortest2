package com.datadog.android.api.instrumentation.network;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\b"}, d2 = {"Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;", "", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "", "getContentType", "()Ljava/lang/String;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "", "getHeaders", "()Ljava/util/Map;", "headers", "", "getStatusCode", "()I", "statusCode", "getUrl", "url"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface HttpResponseInfo {
    java.lang.Long getContentLength();

    java.lang.String getContentType();

    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders();

    int getStatusCode();

    java.lang.String getUrl();
}
