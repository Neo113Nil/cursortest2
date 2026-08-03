package com.vungle.ads.internal.session;

/* compiled from: UnclosedAdDetector.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\u001e\u0010\u001b\u001a\u0002H\u001c\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0082\b¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 H\u0002J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170 J\u0016\u0010#\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/session/UnclosedAdDetector;", "", "context", "Landroid/content/Context;", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "file", "Ljava/io/File;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", com.ironsource.X3.i.s, "", "unclosedAdList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/vungle/ads/internal/model/UnclosedAd;", "addUnclosedAd", "", "ad", "decodeJson", "T", "jsonString", "(Ljava/lang/String;)Ljava/lang/Object;", "readUnclosedAdFromFile", "", "removeUnclosedAd", "retrieveUnclosedAd", "writeUnclosedAdToFile", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class UnclosedAdDetector {
    private static final java.lang.String FILENAME = "unclosed_ad";
    private final android.content.Context context;
    private final com.vungle.ads.internal.executor.Executors executors;
    private java.io.File file;
    private final com.vungle.ads.internal.util.PathProvider pathProvider;
    private boolean ready;
    private final java.lang.String sessionId;
    private final java.util.concurrent.CopyOnWriteArrayList<com.vungle.ads.internal.model.UnclosedAd> unclosedAdList;
    private static final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(kotlinx.serialization.json.JsonBuilder Json) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
            Json.setAllowStructuredMapKeys(true);
        }
    }, 1, null);

    public UnclosedAdDetector(android.content.Context context, java.lang.String sessionId, com.vungle.ads.internal.executor.Executors executors, com.vungle.ads.internal.util.PathProvider pathProvider) {
        java.lang.Object m10798constructorimpl;
        boolean m10805isSuccessimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executors, "executors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new java.util.concurrent.CopyOnWriteArrayList<>();
        if (this.file.exists()) {
            m10805isSuccessimpl = true;
        } else {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.vungle.ads.internal.session.UnclosedAdDetector unclosedAdDetector = this;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Boolean.valueOf(this.file.createNewFile()));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
            if (m10801exceptionOrNullimpl != null) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + m10801exceptionOrNullimpl.getMessage());
            }
            m10805isSuccessimpl = kotlin.Result.m10805isSuccessimpl(m10798constructorimpl);
        }
        this.ready = m10805isSuccessimpl;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.executor.Executors getExecutors() {
        return this.executors;
    }

    public final com.vungle.ads.internal.util.PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final void addUnclosedAd(com.vungle.ads.internal.model.UnclosedAd ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.ready) {
            ad.setSessionId(this.sessionId);
            this.unclosedAdList.add(ad);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final void removeUnclosedAd(com.vungle.ads.internal.model.UnclosedAd ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.ready && this.unclosedAdList.contains(ad)) {
            this.unclosedAdList.remove(ad);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final java.util.List<com.vungle.ads.internal.model.UnclosedAd> retrieveUnclosedAd() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        java.util.List<com.vungle.ads.internal.model.UnclosedAd> readUnclosedAdFromFile = readUnclosedAdFromFile();
        if (readUnclosedAdFromFile != null) {
            arrayList.addAll(readUnclosedAdFromFile);
        }
        this.executors.getIO_EXECUTOR().execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.session.UnclosedAdDetector.m10465retrieveUnclosedAd$lambda3(com.vungle.ads.internal.session.UnclosedAdDetector.this);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m10465retrieveUnclosedAd$lambda3(com.vungle.ads.internal.session.UnclosedAdDetector this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            com.vungle.ads.internal.util.FileUtility.deleteAndLogIfFailed(this$0.file);
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e("UnclosedAdDetector", "Fail to delete file " + e.getMessage());
        }
    }

    private final /* synthetic */ <T> T decodeJson(java.lang.String jsonString) {
        kotlinx.serialization.json.Json json2 = json;
        kotlinx.serialization.modules.SerializersModule serializersModule = json2.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) json2.decodeFromString(serializer, jsonString);
    }

    private final java.util.List<com.vungle.ads.internal.model.UnclosedAd> readUnclosedAdFromFile() {
        if (!this.ready) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return (java.util.List) new com.vungle.ads.internal.executor.FutureResult(this.executors.getIO_EXECUTOR().submit(new java.util.concurrent.Callable() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.util.List m10464readUnclosedAdFromFile$lambda4;
                m10464readUnclosedAdFromFile$lambda4 = com.vungle.ads.internal.session.UnclosedAdDetector.m10464readUnclosedAdFromFile$lambda4(com.vungle.ads.internal.session.UnclosedAdDetector.this);
                return m10464readUnclosedAdFromFile$lambda4;
            }
        })).get(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final java.util.List m10464readUnclosedAdFromFile$lambda4(com.vungle.ads.internal.session.UnclosedAdDetector this$0) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            java.lang.String readString = com.vungle.ads.internal.util.FileUtility.INSTANCE.readString(this$0.file);
            java.lang.String str = readString;
            if (str != null && str.length() != 0) {
                kotlinx.serialization.json.Json json2 = json;
                kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json2.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.UnclosedAd.class))));
                kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                arrayList = (java.util.List) json2.decodeFromString(serializer, readString);
                return arrayList;
            }
            arrayList = new java.util.ArrayList();
            return arrayList;
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e.getMessage());
            return new java.util.ArrayList();
        }
    }

    private final void writeUnclosedAdToFile(java.util.List<com.vungle.ads.internal.model.UnclosedAd> unclosedAdList) {
        if (this.ready) {
            try {
                kotlinx.serialization.json.Json json2 = json;
                kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json2.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.UnclosedAd.class))));
                kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                final java.lang.String encodeToString = json2.encodeToString(serializer, unclosedAdList);
                this.executors.getIO_EXECUTOR().execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.vungle.ads.internal.session.UnclosedAdDetector.m10466writeUnclosedAdToFile$lambda5(com.vungle.ads.internal.session.UnclosedAdDetector.this, encodeToString);
                    }
                });
            } catch (java.lang.Throwable th) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m10466writeUnclosedAdToFile$lambda5(com.vungle.ads.internal.session.UnclosedAdDetector this$0, java.lang.String jsonContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonContent, "$jsonContent");
        com.vungle.ads.internal.util.FileUtility.INSTANCE.writeString(this$0.file, jsonContent);
    }
}
