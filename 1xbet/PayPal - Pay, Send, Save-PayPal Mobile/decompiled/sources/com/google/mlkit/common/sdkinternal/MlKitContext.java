package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class MlKitContext {
    private static final java.lang.Object zza = new java.lang.Object();
    private static com.google.mlkit.common.sdkinternal.MlKitContext zzb;
    private com.google.firebase.components.ComponentRuntime zzc;

    public static com.google.mlkit.common.sdkinternal.MlKitContext getInstance() {
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext;
        synchronized (zza) {
            com.google.android.gms.common.internal.Preconditions.checkState(zzb != null, "MlKitContext has not been initialized");
            mlKitContext = (com.google.mlkit.common.sdkinternal.MlKitContext) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb);
        }
        return mlKitContext;
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext initialize(android.content.Context context, java.util.List<com.google.firebase.components.ComponentRegistrar> list) {
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext;
        synchronized (zza) {
            com.google.android.gms.common.internal.Preconditions.checkState(zzb == null, "MlKitContext is already initialized");
            com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext2 = new com.google.mlkit.common.sdkinternal.MlKitContext();
            zzb = mlKitContext2;
            android.content.Context zzc = zzc(context);
            java.util.HashMap hashMap = new java.util.HashMap();
            for (com.google.firebase.components.ComponentRegistrar componentRegistrar : list) {
                hashMap.put(componentRegistrar.getClass(), componentRegistrar);
            }
            com.google.firebase.components.ComponentRuntime componentRuntime = new com.google.firebase.components.ComponentRuntime(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, new java.util.ArrayList(hashMap.values()), com.google.firebase.components.Component.of(zzc, (java.lang.Class<android.content.Context>) android.content.Context.class, (java.lang.Class<? super android.content.Context>[]) new java.lang.Class[0]), com.google.firebase.components.Component.of(mlKitContext2, (java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext>) com.google.mlkit.common.sdkinternal.MlKitContext.class, (java.lang.Class<? super com.google.mlkit.common.sdkinternal.MlKitContext>[]) new java.lang.Class[0]));
            mlKitContext2.zzc = componentRuntime;
            componentRuntime.initializeEagerComponents(true);
            mlKitContext = zzb;
        }
        return mlKitContext;
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext initializeIfNeeded(android.content.Context context) {
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zza(context);
            }
        }
        return mlKitContext;
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext zza(android.content.Context context) {
        com.google.mlkit.common.sdkinternal.MlKitContext zzb2;
        synchronized (zza) {
            zzb2 = zzb(context, com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD);
        }
        return zzb2;
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext zzb(android.content.Context context, java.util.concurrent.Executor executor) {
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext;
        synchronized (zza) {
            com.google.android.gms.common.internal.Preconditions.checkState(zzb == null, "MlKitContext is already initialized");
            com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext2 = new com.google.mlkit.common.sdkinternal.MlKitContext();
            zzb = mlKitContext2;
            android.content.Context zzc = zzc(context);
            com.google.firebase.components.ComponentRuntime build = com.google.firebase.components.ComponentRuntime.builder(executor).addLazyComponentRegistrars(com.google.firebase.components.ComponentDiscovery.forContext(zzc, com.google.mlkit.common.internal.MlKitComponentDiscoveryService.class).discoverLazy()).addComponent(com.google.firebase.components.Component.of(zzc, (java.lang.Class<android.content.Context>) android.content.Context.class, (java.lang.Class<? super android.content.Context>[]) new java.lang.Class[0])).addComponent(com.google.firebase.components.Component.of(mlKitContext2, (java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext>) com.google.mlkit.common.sdkinternal.MlKitContext.class, (java.lang.Class<? super com.google.mlkit.common.sdkinternal.MlKitContext>[]) new java.lang.Class[0])).build();
            mlKitContext2.zzc = build;
            build.initializeEagerComponents(true);
            mlKitContext = zzb;
        }
        return mlKitContext;
    }

    private static android.content.Context zzc(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public <T> T get(java.lang.Class<T> cls) {
        com.google.android.gms.common.internal.Preconditions.checkState(zzb == this, "MlKitContext has been deleted");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
        return (T) this.zzc.get(cls);
    }

    public android.content.Context getApplicationContext() {
        return (android.content.Context) get(android.content.Context.class);
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext initializeIfNeeded(android.content.Context context, java.util.List<com.google.firebase.components.ComponentRegistrar> list) {
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = initialize(context, list);
            }
        }
        return mlKitContext;
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext initializeIfNeeded(android.content.Context context, java.util.concurrent.Executor executor) {
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zzb(context, executor);
            }
        }
        return mlKitContext;
    }

    private MlKitContext() {
    }
}
