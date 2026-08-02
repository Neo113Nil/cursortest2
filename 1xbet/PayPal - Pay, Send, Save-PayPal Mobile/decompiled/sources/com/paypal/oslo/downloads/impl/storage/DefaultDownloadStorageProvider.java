package com.paypal.oslo.downloads.impl.storage;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/downloads/impl/storage/DefaultDownloadStorageProvider;", "Lcom/paypal/oslo/downloads/api/DownloadStorageProvider;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "dispatchers", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;)V", "", "getDefaultStorageDirectory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "category", "getStorageDirectory", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultDownloadStorageProvider implements com.paypal.oslo.downloads.api.DownloadStorageProvider {
    private static final com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider.Companion Companion = new com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String DOWNLOADS_DIR_NAME = "downloads";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.di.DownloadDispatchers getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DefaultDownloadStorageProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.downloads.impl.di.DownloadDispatchers downloadDispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadDispatchers, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = downloadDispatchers;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.downloads.api.DownloadStorageProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDefaultStorageDirectory(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$1 defaultDownloadStorageProvider$getDefaultStorageDirectory$1;
        int i;
        if (continuation instanceof com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$1) {
            defaultDownloadStorageProvider$getDefaultStorageDirectory$1 = (com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$1) continuation;
            if ((defaultDownloadStorageProvider$getDefaultStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                defaultDownloadStorageProvider$getDefaultStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = defaultDownloadStorageProvider$getDefaultStorageDirectory$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultDownloadStorageProvider$getDefaultStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher dispatcher = this.getHighSpeedVideoSizes.getDispatcher();
                    com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$2 defaultDownloadStorageProvider$getDefaultStorageDirectory$2 = new com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$2(this, null);
                    defaultDownloadStorageProvider$getDefaultStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(dispatcher, defaultDownloadStorageProvider$getDefaultStorageDirectory$2, defaultDownloadStorageProvider$getDefaultStorageDirectory$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        defaultDownloadStorageProvider$getDefaultStorageDirectory$1 = new com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$1(this, continuation);
        java.lang.Object obj2 = defaultDownloadStorageProvider$getDefaultStorageDirectory$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultDownloadStorageProvider$getDefaultStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.downloads.api.DownloadStorageProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getStorageDirectory(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$1 defaultDownloadStorageProvider$getStorageDirectory$1;
        int i;
        if (continuation instanceof com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$1) {
            defaultDownloadStorageProvider$getStorageDirectory$1 = (com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$1) continuation;
            if ((defaultDownloadStorageProvider$getStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                defaultDownloadStorageProvider$getStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = defaultDownloadStorageProvider$getStorageDirectory$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultDownloadStorageProvider$getStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher dispatcher = this.getHighSpeedVideoSizes.getDispatcher();
                    com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$2 defaultDownloadStorageProvider$getStorageDirectory$2 = new com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$2(this, str, null);
                    defaultDownloadStorageProvider$getStorageDirectory$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    defaultDownloadStorageProvider$getStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(dispatcher, defaultDownloadStorageProvider$getStorageDirectory$2, defaultDownloadStorageProvider$getStorageDirectory$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        defaultDownloadStorageProvider$getStorageDirectory$1 = new com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$1(this, continuation);
        java.lang.Object obj2 = defaultDownloadStorageProvider$getStorageDirectory$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultDownloadStorageProvider$getStorageDirectory$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/storage/DefaultDownloadStorageProvider$Companion;", "", "<init>", "()V", "", "DOWNLOADS_DIR_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$ensureDirectoryExists(com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider defaultDownloadStorageProvider, java.io.File file) {
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            throw new java.lang.IllegalStateException("Failed to create directory: ".concat(java.lang.String.valueOf(file.getAbsolutePath())).toString());
        }
    }

    public static final /* synthetic */ void access$validateCategory(com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider defaultDownloadStorageProvider, java.lang.String str) {
        java.lang.String str2 = str;
        if (kotlin.text.StringsKt.isBlank(str2)) {
            throw new java.lang.IllegalArgumentException("Category cannot be blank".toString());
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "..", false, 2, (java.lang.Object) null)) {
            throw new java.lang.IllegalArgumentException("Category cannot contain path traversal sequences".toString());
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "\\", false, 2, (java.lang.Object) null)) {
            throw new java.lang.IllegalArgumentException("Category cannot contain path separators".toString());
        }
    }
}
