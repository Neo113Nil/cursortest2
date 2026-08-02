package com.izettle.android.auth.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016"}, d2 = {"Lcom/izettle/android/auth/model/ServiceUrlsImpl;", "Lcom/izettle/android/auth/model/ServiceUrls;", "", "Lcom/izettle/android/net/HttpUrl;", "urls", "<init>", "(Ljava/util/List;)V", "httpUrl", "invalidateAndGetNextUrl", "(Lcom/izettle/android/net/HttpUrl;)Lcom/izettle/android/net/HttpUrl;", "", "invalidateUrl", "(Lcom/izettle/android/net/HttpUrl;)V", "getCurrent", "()Lcom/izettle/android/net/HttpUrl;", "current", "", "indexOfCurrent", com.visa.cbp.getEncExpo.warmup, "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Ljava/util/List;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ServiceUrlsImpl implements com.izettle.android.auth.model.ServiceUrls {
    private int indexOfCurrent;
    private final java.util.List<com.izettle.android.net.HttpUrl> urls;

    public ServiceUrlsImpl(java.util.List<com.izettle.android.net.HttpUrl> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.urls = list;
    }

    @Override // com.izettle.android.auth.model.ServiceUrls
    public final com.izettle.android.net.HttpUrl getCurrent() {
        java.util.List<com.izettle.android.net.HttpUrl> list = this.urls;
        return list.get(this.indexOfCurrent % list.size());
    }

    @Override // com.izettle.android.auth.model.ServiceUrls
    public final int getSize() {
        return this.urls.size();
    }

    @Override // com.izettle.android.auth.model.ServiceUrls
    public final void invalidateUrl(com.izettle.android.net.HttpUrl httpUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(getCurrent().getScheme(), httpUrl.getScheme()) && kotlin.jvm.internal.Intrinsics.areEqual(getCurrent().getHost(), httpUrl.getHost()) && getCurrent().getPort() == httpUrl.getPort()) {
            this.indexOfCurrent++;
        }
    }

    @Override // com.izettle.android.auth.model.ServiceUrls
    public final com.izettle.android.net.HttpUrl invalidateAndGetNextUrl(com.izettle.android.net.HttpUrl httpUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
        invalidateUrl(httpUrl);
        return getCurrent();
    }
}
