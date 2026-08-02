package com.datadog.android.api.instrumentation.network;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007"}, d2 = {"Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "", "", "contentLength", "()Ljava/lang/Long;", "", "getContentType", "()Ljava/lang/String;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "", "getHeaders", "()Ljava/util/Map;", "headers", "getMethod", "method", "getUrl", "url"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface HttpRequestInfo {
    java.lang.Long contentLength();

    java.lang.String getContentType();

    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders();

    java.lang.String getMethod();

    java.lang.String getUrl();
}
