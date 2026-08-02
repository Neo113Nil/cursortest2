package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
public abstract class RedirectStrategy {
    abstract boolean followRedirects();

    abstract int numberOfRedirectsToFollow();

    public static com.google.net.cronet.okhttptransport.RedirectStrategy withoutRedirects() {
        return com.google.net.cronet.okhttptransport.RedirectStrategy.WithoutRedirectsHolder.INSTANCE;
    }

    public static com.google.net.cronet.okhttptransport.RedirectStrategy defaultStrategy() {
        return com.google.net.cronet.okhttptransport.RedirectStrategy.DefaultRedirectsHolder.INSTANCE;
    }

    private RedirectStrategy() {
    }

    static class DefaultRedirectsHolder {
        private static final com.google.net.cronet.okhttptransport.RedirectStrategy INSTANCE = new com.google.net.cronet.okhttptransport.RedirectStrategy() { // from class: com.google.net.cronet.okhttptransport.RedirectStrategy.DefaultRedirectsHolder.1
            @Override // com.google.net.cronet.okhttptransport.RedirectStrategy
            boolean followRedirects() {
                return true;
            }

            @Override // com.google.net.cronet.okhttptransport.RedirectStrategy
            int numberOfRedirectsToFollow() {
                return 16;
            }
        };
    }

    /* loaded from: classes9.dex */
    static class WithoutRedirectsHolder {
        private static final com.google.net.cronet.okhttptransport.RedirectStrategy INSTANCE = new com.google.net.cronet.okhttptransport.RedirectStrategy() { // from class: com.google.net.cronet.okhttptransport.RedirectStrategy.WithoutRedirectsHolder.1
            @Override // com.google.net.cronet.okhttptransport.RedirectStrategy
            boolean followRedirects() {
                return false;
            }

            @Override // com.google.net.cronet.okhttptransport.RedirectStrategy
            int numberOfRedirectsToFollow() {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    /* synthetic */ RedirectStrategy(byte[] bArr) {
        this();
    }
}
