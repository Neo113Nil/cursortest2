package com.google.android.datatransport.runtime.backends;

@javax.inject.Singleton
/* loaded from: classes3.dex */
class MetadataBackendRegistry implements com.google.android.datatransport.runtime.backends.BackendRegistry {
    private static final java.lang.String BACKEND_KEY_PREFIX = "backend:";
    private static final java.lang.String TAG = "BackendRegistry";
    private final com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider backendFactoryProvider;
    private final java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> backends;
    private final com.google.android.datatransport.runtime.backends.CreationContextFactory creationContextFactory;

    @javax.inject.Inject
    MetadataBackendRegistry(android.content.Context context, com.google.android.datatransport.runtime.backends.CreationContextFactory creationContextFactory) {
        this(new com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider(context), creationContextFactory);
    }

    MetadataBackendRegistry(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider backendFactoryProvider, com.google.android.datatransport.runtime.backends.CreationContextFactory creationContextFactory) {
        this.backends = new java.util.HashMap();
        this.backendFactoryProvider = backendFactoryProvider;
        this.creationContextFactory = creationContextFactory;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public com.google.android.datatransport.runtime.backends.TransportBackend get(java.lang.String str) {
        synchronized (this) {
            if (this.backends.containsKey(str)) {
                return this.backends.get(str);
            }
            com.google.android.datatransport.runtime.backends.BackendFactory backendFactory = this.backendFactoryProvider.get(str);
            if (backendFactory == null) {
                return null;
            }
            com.google.android.datatransport.runtime.backends.TransportBackend create = backendFactory.create(this.creationContextFactory.create(str));
            this.backends.put(str, create);
            return create;
        }
    }

    static class BackendFactoryProvider {
        private final android.content.Context applicationContext;
        private java.util.Map<java.lang.String, java.lang.String> backendProviders = null;

        BackendFactoryProvider(android.content.Context context) {
            this.applicationContext = context;
        }

        com.google.android.datatransport.runtime.backends.BackendFactory get(java.lang.String str) {
            java.lang.String str2 = getBackendProviders().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (com.google.android.datatransport.runtime.backends.BackendFactory) java.lang.Class.forName(str2).asSubclass(com.google.android.datatransport.runtime.backends.BackendFactory.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.ClassNotFoundException unused) {
                new java.lang.Object[]{str2};
                return null;
            } catch (java.lang.IllegalAccessException unused2) {
                new java.lang.Object[]{str2};
                return null;
            } catch (java.lang.InstantiationException unused3) {
                new java.lang.Object[]{str2};
                return null;
            } catch (java.lang.NoSuchMethodException unused4) {
                new java.lang.Object[]{str2};
                return null;
            } catch (java.lang.reflect.InvocationTargetException unused5) {
                new java.lang.Object[]{str2};
                return null;
            }
        }

        private java.util.Map<java.lang.String, java.lang.String> getBackendProviders() {
            if (this.backendProviders == null) {
                this.backendProviders = discover(this.applicationContext);
            }
            return this.backendProviders;
        }

        private java.util.Map<java.lang.String, java.lang.String> discover(android.content.Context context) {
            android.os.Bundle metadata = getMetadata(context);
            if (metadata == null) {
                return java.util.Collections.emptyMap();
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str : metadata.keySet()) {
                java.lang.Object obj = metadata.get(str);
                if ((obj instanceof java.lang.String) && str.startsWith(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BACKEND_KEY_PREFIX)) {
                    for (java.lang.String str2 : ((java.lang.String) obj).split(",", -1)) {
                        java.lang.String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private static android.os.Bundle getMetadata(android.content.Context context) {
            android.content.pm.ServiceInfo serviceInfo;
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }
}
