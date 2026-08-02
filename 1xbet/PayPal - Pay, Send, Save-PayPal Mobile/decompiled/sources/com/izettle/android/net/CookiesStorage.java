package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/izettle/android/net/CookiesStorage;", "", "", "key", "", "Lcom/izettle/android/net/HttpCookie;", "get", "(Ljava/lang/String;)Ljava/util/List;", "cookies", "", "save", "(Ljava/lang/String;Ljava/util/List;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface CookiesStorage {
    java.util.List<com.izettle.android.net.HttpCookie> get(java.lang.String key);

    void save(java.lang.String key, java.util.List<com.izettle.android.net.HttpCookie> cookies);
}
