package com.izettle.android.auth.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/izettle/android/auth/model/ServiceUrls;", "", "Lcom/izettle/android/net/HttpUrl;", "httpUrl", "invalidateAndGetNextUrl", "(Lcom/izettle/android/net/HttpUrl;)Lcom/izettle/android/net/HttpUrl;", "", "invalidateUrl", "(Lcom/izettle/android/net/HttpUrl;)V", "getCurrent", "()Lcom/izettle/android/net/HttpUrl;", "current", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ServiceUrls {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.model.ServiceUrls.Companion INSTANCE = com.izettle.android.auth.model.ServiceUrls.Companion.$$INSTANCE;

    com.izettle.android.net.HttpUrl getCurrent();

    int getSize();

    com.izettle.android.net.HttpUrl invalidateAndGetNextUrl(com.izettle.android.net.HttpUrl httpUrl);

    void invalidateUrl(com.izettle.android.net.HttpUrl httpUrl);

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/izettle/android/auth/model/ServiceUrls$Companion;", "", "<init>", "()V", "", "Lcom/izettle/android/net/HttpUrl;", "urls", "Lcom/izettle/android/auth/model/ServiceUrls;", "create", "(Ljava/util/List;)Lcom/izettle/android/auth/model/ServiceUrls;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.model.ServiceUrls.Companion $$INSTANCE = new com.izettle.android.auth.model.ServiceUrls.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.model.ServiceUrls create(java.util.List<com.izettle.android.net.HttpUrl> urls) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urls, "");
            return new com.izettle.android.auth.model.ServiceUrlsImpl(urls);
        }
    }
}
