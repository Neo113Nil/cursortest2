package androidx.webkit;

/* loaded from: classes7.dex */
public abstract class ServiceWorkerWebSettingsCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CacheMode {
    }

    public abstract boolean getAllowContentAccess();

    public abstract boolean getAllowFileAccess();

    public abstract boolean getBlockNetworkLoads();

    public abstract int getCacheMode();

    @java.lang.Deprecated(forRemoval = true)
    public abstract java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList();

    public abstract boolean isIncludeCookiesOnShouldInterceptRequestEnabled();

    public abstract void setAllowContentAccess(boolean z);

    public abstract void setAllowFileAccess(boolean z);

    public abstract void setBlockNetworkLoads(boolean z);

    public abstract void setCacheMode(int i);

    public abstract void setIncludeCookiesOnShouldInterceptRequestEnabled(boolean z);

    @java.lang.Deprecated(forRemoval = true)
    public abstract void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> set);
}
