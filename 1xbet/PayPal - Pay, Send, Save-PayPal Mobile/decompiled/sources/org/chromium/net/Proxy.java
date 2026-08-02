package org.chromium.net;

/* loaded from: classes18.dex */
public final class Proxy {
    public static final int HTTP = 0;
    public static final int HTTPS = 1;
    private final org.chromium.net.Proxy.Callback mCallback;
    private final java.util.concurrent.Executor mExecutor;
    private final java.lang.String mHost;
    private final int mPort;
    private final int mScheme;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Scheme {
    }

    public static abstract class Callback {

        public static abstract class Request implements java.lang.AutoCloseable {
            @Override // java.lang.AutoCloseable
            public abstract void close();

            public abstract void proceed(java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list);
        }

        public abstract boolean onTunnelHeadersReceived(java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list, int i);

        public void onBeforeTunnelRequest(org.chromium.net.Proxy.Callback.Request request) {
            try {
                java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> onBeforeTunnelRequest = onBeforeTunnelRequest();
                if (onBeforeTunnelRequest != null) {
                    request.proceed(onBeforeTunnelRequest);
                }
                if (request != null) {
                    request.close();
                }
            } catch (java.lang.Throwable th) {
                if (request != null) {
                    try {
                        request.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @java.lang.Deprecated
        public java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> onBeforeTunnelRequest() {
            throw new java.lang.UnsupportedOperationException("At least one overload of onBeforeTunnelRequest must be overridden");
        }
    }

    public Proxy(int i, java.lang.String str, int i2, java.util.concurrent.Executor executor, org.chromium.net.Proxy.Callback callback) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Unknown scheme %s", java.lang.Integer.valueOf(i)));
        }
        this.mScheme = i;
        this.mHost = (java.lang.String) java.util.Objects.requireNonNull(str);
        this.mPort = i2;
        this.mExecutor = (java.util.concurrent.Executor) java.util.Objects.requireNonNull(executor);
        this.mCallback = (org.chromium.net.Proxy.Callback) java.util.Objects.requireNonNull(callback);
    }

    @java.lang.Deprecated
    public Proxy(int i, java.lang.String str, int i2, org.chromium.net.Proxy.Callback callback) {
        this(i, str, i2, new java.util.concurrent.Executor() { // from class: org.chromium.net.Proxy$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                runnable.run();
            }
        }, callback);
    }

    public final int getScheme() {
        return this.mScheme;
    }

    public final java.lang.String getHost() {
        return this.mHost;
    }

    public final int getPort() {
        return this.mPort;
    }

    public final java.util.concurrent.Executor getExecutor() {
        return this.mExecutor;
    }

    public final org.chromium.net.Proxy.Callback getCallback() {
        return this.mCallback;
    }
}
