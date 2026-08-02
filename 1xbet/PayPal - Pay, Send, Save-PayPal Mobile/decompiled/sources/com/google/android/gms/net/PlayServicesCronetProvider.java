package com.google.android.gms.net;

/* loaded from: classes8.dex */
public class PlayServicesCronetProvider extends org.chromium.net.CronetProvider {
    private static final java.lang.String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final java.lang.String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(android.content.Context context) {
        super(context);
    }

    private static java.lang.Class<? extends org.chromium.net.ICronetEngineBuilder> subclassNativeCronetEngine(java.lang.ClassLoader classLoader) throws java.lang.ClassNotFoundException {
        try {
            return classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(org.chromium.net.ICronetEngineBuilder.class);
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Failed to subclass native cronet engine!, NativeCronetEngineBuilderImpl Classloader: %s, ICronetEngineBuilder Classloader: %s", classLoader, org.chromium.net.ICronetEngineBuilder.class.getClassLoader()), e);
        }
    }

    private void tryToInstallCronetProvider() {
        try {
            com.google.android.gms.net.CronetProviderInstaller.zza(this.mContext);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
            android.util.Log.isLoggable(TAG, 4);
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException unused2) {
        }
    }

    @Override // org.chromium.net.CronetProvider
    public org.chromium.net.CronetEngine.Builder createBuilder() {
        org.chromium.net.CronetEngine.Builder builder;
        new com.google.android.gms.net.zze("GMS PlayServicesCronetProvider#createBuilder");
        try {
            try {
                try {
                    com.google.android.gms.net.CronetProviderInstaller.zza(this.mContext);
                    try {
                        com.google.android.gms.net.zzd zzdVar = new com.google.android.gms.net.zzd(this.mContext, 37402, 0.01f);
                        try {
                            com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton = com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(this.mContext);
                            if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
                                builder = httpEngineProviderSingleton.getHttpEngineProvider().createBuilder();
                                zzdVar.zza();
                                zzdVar.close();
                            } else {
                                org.chromium.net.ExperimentalCronetEngine.Builder builder2 = new org.chromium.net.ExperimentalCronetEngine.Builder(subclassNativeCronetEngine((java.lang.ClassLoader) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.dynamite.DynamiteModule) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.net.CronetProviderInstaller.zzb())).getModuleContext().getClassLoader())).getConstructor(android.content.Context.class).newInstance(this.mContext));
                                zzdVar.zza();
                                zzdVar.close();
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(builder2, "The value of the constructed builder should never be null");
                                builder = builder2;
                            }
                            android.os.Trace.endSection();
                            return builder;
                        } catch (java.lang.Throwable th) {
                            try {
                                zzdVar.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (java.lang.ReflectiveOperationException e) {
                        throw new java.lang.RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e2) {
                throw new java.lang.IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
            }
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e3) {
            throw new java.lang.IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.net.PlayServicesCronetProvider) && this.mContext.equals(((com.google.android.gms.net.PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public java.lang.String getVersion() {
        com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton = com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(this.mContext);
        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
            return httpEngineProviderSingleton.getHttpEngineProvider().getVersion();
        }
        tryToInstallCronetProvider();
        return com.google.android.gms.net.CronetProviderInstaller.zzc();
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{com.google.android.gms.net.PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        if (com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(this.mContext).shouldUseHttpEngine()) {
            return true;
        }
        tryToInstallCronetProvider();
        return com.google.android.gms.net.CronetProviderInstaller.isInstalled();
    }

    @Override // org.chromium.net.CronetProvider
    public java.lang.String getName() {
        return com.google.android.gms.net.CronetProviderInstaller.PROVIDER_NAME;
    }
}
