package com.paypal.oslo.core.persistence.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0012J(\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/core/persistence/data/repository/FileOperationsRepositoryImpl;", "Lcom/paypal/oslo/core/persistence/domain/repository/FileOperationsRepository;", "Landroid/content/Context;", "applicationContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "temp", "", "", "listFiles", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileName", "content", "Ljava/io/File;", "createTextFile", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readTextFile", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "appendToTextFile", "", "createBinaryFile", "(Ljava/lang/String;[BZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readBinaryFile", "deleteFile", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRangesFor", "Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FileOperationsRepositoryImpl implements com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoSizes;

    @javax.inject.Inject
    public FileOperationsRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl.AnonymousClass1(null), 3, null);
    }

    public /* synthetic */ FileOperationsRepositoryImpl(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$1", f = "FileOperationsRepositoryImpl.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, nl = {36}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl.access$cleanUp(com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl.this, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @Override // com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository
    public final java.lang.Object listFiles(boolean z, kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$listFiles$2(z, this, null), continuation);
    }

    @Override // com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository
    public final java.lang.Object deleteFile(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$deleteFile$2(z, this, str, null), continuation);
    }

    public static final /* synthetic */ java.lang.Object access$cleanUp(com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl fileOperationsRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(fileOperationsRepositoryImpl.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$cleanUp$2(fileOperationsRepositoryImpl, null), continuation);
    }

    @Override // com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository
    public final java.lang.Object appendToTextFile(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!new kotlin.text.Regex("^(?=.*[A-Za-z0-9])[A-Za-z0-9.]+$").matches(str)) {
            throw new java.lang.IllegalArgumentException("Invalid file name: ".concat(java.lang.String.valueOf(str)).toString());
        }
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$appendToTextFile$3(z, this, str, str2, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository
    public final java.lang.Object createBinaryFile(java.lang.String str, byte[] bArr, boolean z, kotlin.coroutines.Continuation<? super java.io.File> continuation) {
        if (!new kotlin.text.Regex("^(?=.*[A-Za-z0-9])[A-Za-z0-9.]+$").matches(str)) {
            throw new java.lang.IllegalArgumentException("Invalid file name: ".concat(java.lang.String.valueOf(str)).toString());
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$createBinaryFile$3(z, this, str, bArr, null), continuation);
    }

    @Override // com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository
    public final java.lang.Object createTextFile(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super java.io.File> continuation) {
        if (!new kotlin.text.Regex("^(?=.*[A-Za-z0-9])[A-Za-z0-9.]+$").matches(str)) {
            throw new java.lang.IllegalArgumentException("Invalid file name: ".concat(java.lang.String.valueOf(str)).toString());
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$createTextFile$3(z, this, str, str2, null), continuation);
    }

    @Override // com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository
    public final java.lang.Object readBinaryFile(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        if (!new kotlin.text.Regex("^(?=.*[A-Za-z0-9])[A-Za-z0-9.]+$").matches(str)) {
            throw new java.lang.IllegalArgumentException("Invalid file name: ".concat(java.lang.String.valueOf(str)).toString());
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$readBinaryFile$3(z, this, str, null), continuation);
    }

    @Override // com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository
    public final java.lang.Object readTextFile(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        if (!new kotlin.text.Regex("^(?=.*[A-Za-z0-9])[A-Za-z0-9.]+$").matches(str)) {
            throw new java.lang.IllegalArgumentException("Invalid file name: ".concat(java.lang.String.valueOf(str)).toString());
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$readTextFile$3(z, this, str, null), continuation);
    }
}
