package com.google.android.gms.net;

/* loaded from: classes4.dex */
final class HttpEngineProviderSingleton {
    private static final java.lang.String TAG = "com.google.android.gms.net.HttpEngineProviderSingleton";
    private static com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton;
    private org.chromium.net.CronetProvider httpEngineProvider;

    private HttpEngineProviderSingleton(android.content.Context context) {
        try {
            if (shouldOverrideWithHttpEngine(context)) {
                org.chromium.net.CronetProvider cronetProvider = (org.chromium.net.CronetProvider) java.lang.Class.forName("org.chromium.net.impl.HttpEngineNativeProvider").asSubclass(org.chromium.net.CronetProvider.class).getConstructor(android.content.Context.class).newInstance(context);
                if (cronetProvider.isEnabled()) {
                    this.httpEngineProvider = cronetProvider;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    static com.google.android.gms.net.HttpEngineProviderSingleton getInstance(android.content.Context context) {
        synchronized (com.google.android.gms.net.HttpEngineProviderSingleton.class) {
            com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton2 = httpEngineProviderSingleton;
            if (httpEngineProviderSingleton2 != null) {
                return httpEngineProviderSingleton2;
            }
            com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton3 = new com.google.android.gms.net.HttpEngineProviderSingleton(context);
            httpEngineProviderSingleton = httpEngineProviderSingleton3;
            return httpEngineProviderSingleton3;
        }
    }

    private boolean getReflectionValueAsBool(java.lang.Object obj) {
        return obj != null && ((java.lang.Boolean) obj).booleanValue();
    }

    private boolean shouldOverrideWithHttpEngine(android.content.Context context) {
        try {
            return getReflectionValueAsBool(org.chromium.net.ExperimentalCronetEngine.class.getDeclaredMethod("shouldOverrideWithHttpEngine", com.google.android.gms.internal.cronet.zza.zza(android.content.Context.class, context)).invoke(null, com.google.android.gms.internal.cronet.zza.zzb(android.content.Context.class, context)));
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    final boolean shouldUseHttpEngine() {
        return this.httpEngineProvider != null;
    }

    final org.chromium.net.CronetProvider getHttpEngineProvider() {
        return this.httpEngineProvider;
    }
}
