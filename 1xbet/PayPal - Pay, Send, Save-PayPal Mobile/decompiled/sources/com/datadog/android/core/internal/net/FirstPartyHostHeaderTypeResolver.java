package com.datadog.android.core.internal.net;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0011"}, d2 = {"Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "", "", "Lcom/datadog/android/trace/TracingHeaderType;", "getAllHeaderTypes", "()Ljava/util/Set;", "", "url", "headerTypesForUrl", "(Ljava/lang/String;)Ljava/util/Set;", "Lokhttp3/HttpUrl;", "(Lokhttp3/HttpUrl;)Ljava/util/Set;", "", "isEmpty", "()Z", "isFirstPartyUrl", "(Ljava/lang/String;)Z", "(Lokhttp3/HttpUrl;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FirstPartyHostHeaderTypeResolver {
    java.util.Set<com.datadog.android.trace.TracingHeaderType> getAllHeaderTypes();

    java.util.Set<com.datadog.android.trace.TracingHeaderType> headerTypesForUrl(java.lang.String url);

    java.util.Set<com.datadog.android.trace.TracingHeaderType> headerTypesForUrl(okhttp3.HttpUrl url);

    boolean isEmpty();

    boolean isFirstPartyUrl(java.lang.String url);

    boolean isFirstPartyUrl(okhttp3.HttpUrl url);
}
