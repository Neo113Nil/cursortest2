package com.vungle.ads.internal.persistence;

/* compiled from: FilePreferences.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0002\u0010\u0012J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u0016\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007J6\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001aj\b\u0012\u0004\u0012\u00020\u0007`\u001b2\u0006\u0010\u0011\u001a\u00020\u00072\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001aj\b\u0012\u0004\u0012\u00020\u0007`\u001bJ\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0010J\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0015J\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0017J\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007J*\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00072\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u001bJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/persistence/FilePreferences;", "", "ioExecutor", "Ljava/util/concurrent/Executor;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", io.ktor.http.ContentDisposition.Parameters.FileName, "", "(Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/PathProvider;Ljava/lang/String;)V", "file", "Ljava/io/File;", "values", "Ljava/util/concurrent/ConcurrentHashMap;", "apply", "", "getBoolean", "", com.ironsource.X3.i.W, "(Ljava/lang/String;)Ljava/lang/Boolean;", "defaultValue", "getInt", "", "getLong", "", "getString", "getStringSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "put", "value", "remove", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class FilePreferences {
    public static final java.lang.String FILENAME = "settings_vungle";
    public static final java.lang.String TPAT_FAILED_FILENAME = "vngFailedTpats";
    private final java.io.File file;
    private final java.util.concurrent.Executor ioExecutor;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> values;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.persistence.FilePreferences.Companion INSTANCE = new com.vungle.ads.internal.persistence.FilePreferences.Companion(null);
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.vungle.ads.internal.persistence.FilePreferences> filePreferenceMap = new java.util.concurrent.ConcurrentHashMap<>();

    public /* synthetic */ FilePreferences(java.util.concurrent.Executor executor, com.vungle.ads.internal.util.PathProvider pathProvider, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, pathProvider, str);
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized com.vungle.ads.internal.persistence.FilePreferences get(java.util.concurrent.Executor executor, com.vungle.ads.internal.util.PathProvider pathProvider, java.lang.String str) {
        com.vungle.ads.internal.persistence.FilePreferences filePreferences;
        synchronized (com.vungle.ads.internal.persistence.FilePreferences.class) {
            filePreferences = INSTANCE.get(executor, pathProvider, str);
        }
        return filePreferences;
    }

    private FilePreferences(java.util.concurrent.Executor executor, com.vungle.ads.internal.util.PathProvider pathProvider, java.lang.String str) {
        this.ioExecutor = executor;
        java.io.File file = new java.io.File(pathProvider.getSharedPrefsDir(), str);
        this.file = file;
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        java.lang.Object readSerializable = com.vungle.ads.internal.util.FileUtility.readSerializable(file);
        if (readSerializable instanceof java.util.HashMap) {
            concurrentHashMap.putAll((java.util.HashMap) readSerializable);
        }
    }

    /* synthetic */ FilePreferences(java.util.concurrent.Executor executor, com.vungle.ads.internal.util.PathProvider pathProvider, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, pathProvider, (i & 4) != 0 ? FILENAME : str);
    }

    public final void apply() {
        final java.util.HashMap hashMap = new java.util.HashMap(this.values);
        this.ioExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.persistence.FilePreferences$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.persistence.FilePreferences.m10449apply$lambda0(com.vungle.ads.internal.persistence.FilePreferences.this, hashMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m10449apply$lambda0(com.vungle.ads.internal.persistence.FilePreferences this$0, java.io.Serializable serializable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializable, "$serializable");
        com.vungle.ads.internal.util.FileUtility.writeSerializable(this$0.file, serializable);
    }

    public final com.vungle.ads.internal.persistence.FilePreferences put(java.lang.String key, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, java.lang.Boolean.valueOf(value));
        return this;
    }

    public final boolean getBoolean(java.lang.String key, boolean defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.lang.Object obj = this.values.get(key);
        return obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : defaultValue;
    }

    public final java.lang.Boolean getBoolean(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.lang.Object obj = this.values.get(key);
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        return null;
    }

    public final com.vungle.ads.internal.persistence.FilePreferences put(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.values.put(key, value);
        return this;
    }

    public final com.vungle.ads.internal.persistence.FilePreferences remove(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    public final java.lang.String getString(java.lang.String key, java.lang.String defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        java.lang.Object obj = this.values.get(key);
        return obj instanceof java.lang.String ? (java.lang.String) obj : defaultValue;
    }

    public final java.lang.String getString(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.lang.Object obj = this.values.get(key);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public final com.vungle.ads.internal.persistence.FilePreferences put(java.lang.String key, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, java.lang.Integer.valueOf(value));
        return this;
    }

    public final int getInt(java.lang.String key, int defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.lang.Object obj = this.values.get(key);
        return obj instanceof java.lang.Integer ? ((java.lang.Number) obj).intValue() : defaultValue;
    }

    public final com.vungle.ads.internal.persistence.FilePreferences put(java.lang.String key, java.util.HashSet<java.lang.String> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, com.vungle.ads.internal.util.CollectionsConcurrencyUtil.getNewHashSet(value));
        return this;
    }

    public final java.util.HashSet<java.lang.String> getStringSet(java.lang.String key, java.util.HashSet<java.lang.String> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        java.lang.Object obj = this.values.get(key);
        return obj instanceof java.util.HashSet ? com.vungle.ads.internal.util.CollectionsConcurrencyUtil.getNewHashSet((java.util.HashSet) obj) : defaultValue;
    }

    public final com.vungle.ads.internal.persistence.FilePreferences put(java.lang.String key, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, java.lang.Long.valueOf(value));
        return this;
    }

    public final long getLong(java.lang.String key, long defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.lang.Object obj = this.values.get(key);
        return obj instanceof java.lang.Long ? ((java.lang.Number) obj).longValue() : defaultValue;
    }

    /* compiled from: FilePreferences.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/persistence/FilePreferences$Companion;", "", "()V", "FILENAME", "", "getFILENAME$annotations", "TPAT_FAILED_FILENAME", "filePreferenceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "get", "ioExecutor", "Ljava/util/concurrent/Executor;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", io.ktor.http.ContentDisposition.Parameters.FileName, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getFILENAME$annotations() {
        }

        private Companion() {
        }

        public static /* synthetic */ com.vungle.ads.internal.persistence.FilePreferences get$default(com.vungle.ads.internal.persistence.FilePreferences.Companion companion, java.util.concurrent.Executor executor, com.vungle.ads.internal.util.PathProvider pathProvider, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str = com.vungle.ads.internal.persistence.FilePreferences.FILENAME;
            }
            return companion.get(executor, pathProvider, str);
        }

        @kotlin.jvm.JvmStatic
        public final synchronized com.vungle.ads.internal.persistence.FilePreferences get(java.util.concurrent.Executor ioExecutor, com.vungle.ads.internal.util.PathProvider pathProvider, java.lang.String filename) {
            java.lang.Object obj;
            java.lang.Object putIfAbsent;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filename, "filename");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.vungle.ads.internal.persistence.FilePreferences.filePreferenceMap;
            obj = concurrentHashMap.get(filename);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(filename, (obj = new com.vungle.ads.internal.persistence.FilePreferences(ioExecutor, pathProvider, filename, null)))) != null) {
                obj = putIfAbsent;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "filePreferenceMap.getOrP…, filename)\n            }");
            return (com.vungle.ads.internal.persistence.FilePreferences) obj;
        }
    }
}
