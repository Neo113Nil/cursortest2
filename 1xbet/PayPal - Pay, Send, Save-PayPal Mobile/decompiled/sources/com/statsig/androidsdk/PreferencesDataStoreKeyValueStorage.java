package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0012\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u001e\u0010\u0015J\"\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b \u0010!J \u0010\"\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\"\u0010!J(\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b$\u0010%J,\u0010'\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001dH\u0096@¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010."}, d2 = {"Lcom/statsig/androidsdk/PreferencesDataStoreKeyValueStorage;", "Lcom/statsig/androidsdk/KeyValueStorage;", "", "Landroid/app/Application;", "application", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Landroid/app/Application;Lkotlinx/coroutines/CoroutineScope;)V", "storeName", "", "multiprocess", "compressed", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "buildStore", "(Ljava/lang/String;ZZ)Landroidx/datastore/core/DataStore;", "", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearStore", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "getCorruptionHandler", "(Ljava/lang/String;)Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "getData", "(Ljava/lang/String;)Landroidx/datastore/core/DataStore;", "maybeBuildStore", "(Ljava/lang/String;)V", "", "readAll", "key", "readValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "writeValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entries", "writeValues", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PreferencesDataStoreKeyValueStorage implements com.statsig.androidsdk.KeyValueStorage<java.lang.String> {
    private static final int BUFFER_SIZE;
    private static final java.lang.String DATA_STORE_FILE_PATH = "com.statsig.androidsdk.prefs";
    private static final int FOUR_KB = 4096;
    private static final int SIXTEEN_KB = 16384;
    private static final java.lang.String TAG = "statsig::PrefsDataStore";
    private final android.app.Application application;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion INSTANCE = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion(null);
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, androidx.content.core.DataStore<androidx.content.preferences.core.Preferences>> storeMap = new java.util.concurrent.ConcurrentHashMap<>();
    private static final kotlin.Lazy<com.statsig.androidsdk.CoroutineDispatcherProvider> dispatcherProvider$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.statsig.androidsdk.CoroutineDispatcherProvider>() { // from class: com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$dispatcherProvider$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.statsig.androidsdk.CoroutineDispatcherProvider invoke() {
            return new com.statsig.androidsdk.CoroutineDispatcherProvider(null, null, null, 7, null);
        }
    });

    public PreferencesDataStoreKeyValueStorage(android.app.Application application, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.application = application;
        this.coroutineScope = coroutineScope;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final /* bridge */ /* synthetic */ java.lang.Object writeValue(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        return writeValue2(str, str2, str3, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    public final android.app.Application getApplication() {
        return this.application;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001b\u0010\u0016\u001a\u00020\u00118CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/statsig/androidsdk/PreferencesDataStoreKeyValueStorage$Companion;", "", "<init>", "()V", "", "clearAllStoresForTesting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetForTesting", "", "BUFFER_SIZE", com.visa.cbp.getEncExpo.warmup, "", "DATA_STORE_FILE_PATH", "Ljava/lang/String;", "FOUR_KB", "SIXTEEN_KB", "TAG", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider$delegate", "Lkotlin/Lazy;", "getDispatcherProvider", "()Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "storeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "BufferedPreferencesSerializer", "GzipPreferencesSerializer"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.statsig.androidsdk.CoroutineDispatcherProvider getDispatcherProvider() {
            return (com.statsig.androidsdk.CoroutineDispatcherProvider) com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.dispatcherProvider$delegate.getValue();
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/statsig/androidsdk/PreferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "writeTo", "(Landroidx/datastore/preferences/core/Preferences;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultValue", "()Landroidx/datastore/preferences/core/Preferences;", "defaultValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
        static final class GzipPreferencesSerializer implements androidx.content.core.Serializer<androidx.content.preferences.core.Preferences> {
            public static final com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.GzipPreferencesSerializer INSTANCE = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.GzipPreferencesSerializer();

            private GzipPreferencesSerializer() {
            }

            @Override // androidx.content.core.Serializer
            public final /* bridge */ /* synthetic */ java.lang.Object writeTo(androidx.content.preferences.core.Preferences preferences, java.io.OutputStream outputStream, kotlin.coroutines.Continuation continuation) {
                return writeTo2(preferences, outputStream, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.content.core.Serializer
            public final androidx.content.preferences.core.Preferences getDefaultValue() {
                return androidx.content.preferences.core.PreferencesFactory.createEmpty();
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // androidx.content.core.Serializer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object readFrom(java.io.InputStream inputStream, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
                com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1 preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1;
                int i;
                java.util.zip.GZIPInputStream gZIPInputStream;
                java.util.zip.ZipException e;
                java.util.zip.GZIPInputStream gZIPInputStream2;
                if (continuation instanceof com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1) {
                    preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1 = (com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1) continuation;
                    if ((preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1.label & Integer.MIN_VALUE) != 0) {
                        preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1.label -= 2147483648;
                        java.lang.Object obj = preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1.result;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1.label;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            gZIPInputStream = new java.util.zip.GZIPInputStream(inputStream, com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.BUFFER_SIZE);
                            try {
                                preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1.L$0 = gZIPInputStream;
                                preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1.label = 1;
                                java.lang.Object readFrom = com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.BufferedPreferencesSerializer.INSTANCE.readFrom(gZIPInputStream, preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1);
                                if (readFrom == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = readFrom;
                                gZIPInputStream2 = gZIPInputStream;
                            } catch (java.util.zip.ZipException e2) {
                                e = e2;
                                gZIPInputStream2 = gZIPInputStream;
                                throw new androidx.content.core.CorruptionException("Bad zip file!", e);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                gZIPInputStream.close();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            gZIPInputStream2 = (java.util.zip.GZIPInputStream) preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1.L$0;
                            try {
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                } catch (java.util.zip.ZipException e3) {
                                    e = e3;
                                    throw new androidx.content.core.CorruptionException("Bad zip file!", e);
                                }
                            } catch (java.lang.Throwable th2) {
                                gZIPInputStream = gZIPInputStream2;
                                th = th2;
                                gZIPInputStream.close();
                                throw th;
                            }
                        }
                        gZIPInputStream2.close();
                        return obj;
                    }
                }
                preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1 = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1(this, continuation);
                java.lang.Object obj2 = preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1.result;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = preferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1.label;
                if (i != 0) {
                }
                gZIPInputStream2.close();
                return obj2;
            }

            /* renamed from: writeTo, reason: avoid collision after fix types in other method */
            public final java.lang.Object writeTo2(androidx.content.preferences.core.Preferences preferences, java.io.OutputStream outputStream, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object writeTo2 = com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.BufferedPreferencesSerializer.INSTANCE.writeTo2(preferences, (java.io.OutputStream) new java.util.zip.GZIPOutputStream(outputStream, com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.BUFFER_SIZE), continuation);
                return writeTo2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writeTo2 : kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/statsig/androidsdk/PreferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "writeTo", "(Landroidx/datastore/preferences/core/Preferences;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultValue", "()Landroidx/datastore/preferences/core/Preferences;", "defaultValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
        static final class BufferedPreferencesSerializer implements androidx.content.core.Serializer<androidx.content.preferences.core.Preferences> {
            public static final com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.BufferedPreferencesSerializer INSTANCE = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.BufferedPreferencesSerializer();

            private BufferedPreferencesSerializer() {
            }

            @Override // androidx.content.core.Serializer
            public final /* bridge */ /* synthetic */ java.lang.Object writeTo(androidx.content.preferences.core.Preferences preferences, java.io.OutputStream outputStream, kotlin.coroutines.Continuation continuation) {
                return writeTo2(preferences, outputStream, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.content.core.Serializer
            public final androidx.content.preferences.core.Preferences getDefaultValue() {
                return androidx.content.preferences.core.PreferencesFactory.createEmpty();
            }

            @Override // androidx.content.core.Serializer
            public final java.lang.Object readFrom(java.io.InputStream inputStream, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
                return androidx.content.preferences.core.PreferencesFileSerializer.INSTANCE.readFrom(new java.io.BufferedInputStream(inputStream, com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.BUFFER_SIZE), continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
            /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Closeable] */
            /* renamed from: writeTo, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object writeTo2(androidx.content.preferences.core.Preferences preferences, java.io.OutputStream outputStream, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1 preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1;
                int i;
                java.io.BufferedOutputStream bufferedOutputStream;
                try {
                    if (continuation instanceof com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1) {
                        preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1 = (com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1) continuation;
                        if ((preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.label & Integer.MIN_VALUE) != 0) {
                            preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.label -= 2147483648;
                            java.lang.Object obj = preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                java.io.BufferedOutputStream bufferedOutputStream2 = new java.io.BufferedOutputStream(outputStream, com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.BUFFER_SIZE);
                                java.io.BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream2;
                                preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.L$0 = bufferedOutputStream2;
                                preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.L$1 = bufferedOutputStream3;
                                preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.label = 1;
                                if (androidx.content.preferences.core.PreferencesFileSerializer.INSTANCE.writeTo2(preferences, (java.io.OutputStream) bufferedOutputStream3, (kotlin.coroutines.Continuation<? super kotlin.Unit>) preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                bufferedOutputStream = bufferedOutputStream3;
                                outputStream = bufferedOutputStream2;
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bufferedOutputStream = (java.io.BufferedOutputStream) preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.L$1;
                                ?? r7 = (java.io.Closeable) preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                outputStream = r7;
                            }
                            bufferedOutputStream.flush();
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(outputStream, null);
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    if (i != 0) {
                    }
                    bufferedOutputStream.flush();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(outputStream, null);
                    return kotlin.Unit.INSTANCE;
                } finally {
                }
                preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1 = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1(this, continuation);
                java.lang.Object obj2 = preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.result;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = preferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1.label;
            }
        }

        public final void resetForTesting() {
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$resetForTesting$1(null), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.Object clearAllStoresForTesting(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(new com.statsig.androidsdk.CoroutineDispatcherProvider(null, null, null, 7, null).getIo(), new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2(null), continuation);
            return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        BUFFER_SIZE = android.os.Build.VERSION.SDK_INT > 34 ? 16384 : 4096;
    }

    private final androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> getCorruptionHandler(final java.lang.String storeName) {
        return new androidx.content.core.handlers.ReplaceFileCorruptionHandler<>(new kotlin.jvm.functions.Function1<androidx.content.core.CorruptionException, androidx.content.preferences.core.Preferences>() { // from class: com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$getCorruptionHandler$1
            @Override // kotlin.jvm.functions.Function1
            public final androidx.content.preferences.core.Preferences invoke(androidx.content.core.CorruptionException corruptionException) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(corruptionException, "");
                return androidx.content.preferences.core.PreferencesFactory.createEmpty();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    /* renamed from: writeValue, reason: avoid collision after fix types in other method */
    public final java.lang.Object writeValue2(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(INSTANCE.getDispatcherProvider().getIo(), new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValue$2(this, str, str2, str3, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object writeValues(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.String> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(INSTANCE.getDispatcherProvider().getIo(), new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2(this, str, map, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object readValue(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(INSTANCE.getDispatcherProvider().getIo(), new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readValue$2(this, str, str2, null), continuation);
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object removeValue(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(INSTANCE.getDispatcherProvider().getIo(), new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2(this, str, str2, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object clearStore(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(INSTANCE.getDispatcherProvider().getIo(), new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$clearStore$2(this, str, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.statsig.androidsdk.KeyValueStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$clearAll$1 preferencesDataStoreKeyValueStorage$clearAll$1;
        int i;
        java.util.Iterator it;
        com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage preferencesDataStoreKeyValueStorage;
        if (continuation instanceof com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$clearAll$1) {
            preferencesDataStoreKeyValueStorage$clearAll$1 = (com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$clearAll$1) continuation;
            if ((preferencesDataStoreKeyValueStorage$clearAll$1.label & Integer.MIN_VALUE) != 0) {
                preferencesDataStoreKeyValueStorage$clearAll$1.label -= 2147483648;
                java.lang.Object obj = preferencesDataStoreKeyValueStorage$clearAll$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = preferencesDataStoreKeyValueStorage$clearAll$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Set<java.lang.String> keySet = storeMap.keySet();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
                    it = keySet.iterator();
                    preferencesDataStoreKeyValueStorage = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) preferencesDataStoreKeyValueStorage$clearAll$1.L$1;
                    preferencesDataStoreKeyValueStorage = (com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage) preferencesDataStoreKeyValueStorage$clearAll$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                    androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> data = preferencesDataStoreKeyValueStorage.getData(str);
                    com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$clearAll$2$1 preferencesDataStoreKeyValueStorage$clearAll$2$1 = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$clearAll$2$1(null);
                    preferencesDataStoreKeyValueStorage$clearAll$1.L$0 = preferencesDataStoreKeyValueStorage;
                    preferencesDataStoreKeyValueStorage$clearAll$1.L$1 = it;
                    preferencesDataStoreKeyValueStorage$clearAll$1.label = 1;
                    if (androidx.content.preferences.core.PreferencesKt.edit(data, preferencesDataStoreKeyValueStorage$clearAll$2$1, preferencesDataStoreKeyValueStorage$clearAll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        preferencesDataStoreKeyValueStorage$clearAll$1 = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$clearAll$1(this, continuation);
        java.lang.Object obj2 = preferencesDataStoreKeyValueStorage$clearAll$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = preferencesDataStoreKeyValueStorage$clearAll$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object readAll(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.String>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(INSTANCE.getDispatcherProvider().getIo(), new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readAll$2(this, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> getData(java.lang.String storeName) {
        maybeBuildStore(storeName);
        androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> dataStore = storeMap.get(storeName);
        kotlin.jvm.internal.Intrinsics.checkNotNull(dataStore);
        return dataStore;
    }

    private final void maybeBuildStore(java.lang.String storeName) {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, androidx.content.core.DataStore<androidx.content.preferences.core.Preferences>> concurrentHashMap = storeMap;
        if (concurrentHashMap.containsKey(storeName)) {
            return;
        }
        concurrentHashMap.putIfAbsent(storeName, buildStore(storeName, false, false));
    }

    private final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> buildStore(final java.lang.String storeName, boolean multiprocess, boolean compressed) {
        androidx.content.core.Serializer serializer = compressed ? com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.GzipPreferencesSerializer.INSTANCE : com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.BufferedPreferencesSerializer.INSTANCE;
        final java.lang.String str = compressed ? "_gz" : "_unc";
        kotlin.jvm.functions.Function0<java.io.File> function0 = new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$buildStore$produceFileLambda$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.io.File invoke() {
                android.app.Application application = com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.this.getApplication();
                java.lang.String str2 = storeName;
                java.lang.String str3 = str;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("com.statsig.androidsdk.prefs/");
                sb.append(str2);
                sb.append(str3);
                return androidx.content.Context.dataStoreFile(application, sb.toString());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        };
        if (multiprocess) {
            return androidx.content.core.MultiProcessDataStoreFactory.INSTANCE.create(serializer, getCorruptionHandler(storeName), new java.util.ArrayList(), this.coroutineScope, function0);
        }
        return androidx.content.core.DataStoreFactory.INSTANCE.create(serializer, getCorruptionHandler(storeName), new java.util.ArrayList(), this.coroutineScope, function0);
    }
}
