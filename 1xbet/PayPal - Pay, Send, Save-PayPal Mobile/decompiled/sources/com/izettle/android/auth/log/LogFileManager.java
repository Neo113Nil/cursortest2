package com.izettle.android.auth.log;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u001b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00162 \b\u0002\u0010 \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u00110\u001f¢\u0006\u0004\b!\u0010\"J7\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010#\u001a\u00020\u00162\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010/\u001a\u00020,8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010."}, d2 = {"Lcom/izettle/android/auth/log/LogFileManager;", "", "Landroid/content/Context;", "context", "Lcom/izettle/android/auth/executor/Executor;", "executor", "Lcom/izettle/android/auth/log/UploadFile;", "uploadFile", "Lcom/izettle/android/auth/log/GetCurrentTime;", "getCurrentTime", "Ljava/io/File;", "logFile", "fileCreationTimeFile", "<init>", "(Landroid/content/Context;Lcom/izettle/android/auth/executor/Executor;Lcom/izettle/android/auth/log/UploadFile;Lcom/izettle/android/auth/log/GetCurrentTime;Ljava/io/File;Ljava/io/File;)V", "", "line", "", "appendLine", "(Ljava/lang/String;)V", "deleteLogFile", "()V", "", "force", "shouldSync", "(Z)Z", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "Lcom/izettle/android/core/data/result/Result;", "", "syncLogFile", "(Ljava/lang/String;Z)Lcom/izettle/android/core/data/result/Result;", "Lkotlin/Function1;", "onResult", "syncLogFileAsync", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "deleteOnFail", "", "attempt", "syncLogFileInternal", "(Ljava/lang/String;ZI)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/executor/Executor;", "Ljava/io/File;", "Lcom/izettle/android/auth/log/GetCurrentTime;", "Lcom/izettle/android/auth/log/UploadFile;", "Ljava/io/FileWriter;", "getWriter", "()Ljava/io/FileWriter;", "writer"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LogFileManager {
    private final com.izettle.android.auth.executor.Executor executor;
    private final java.io.File fileCreationTimeFile;
    private final com.izettle.android.auth.log.GetCurrentTime getCurrentTime;
    private final java.io.File logFile;
    private final com.izettle.android.auth.log.UploadFile uploadFile;

    public LogFileManager(android.content.Context context, com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.log.UploadFile uploadFile, com.izettle.android.auth.log.GetCurrentTime getCurrentTime, java.io.File file, java.io.File file2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadFile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCurrentTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        this.executor = executor;
        this.uploadFile = uploadFile;
        this.getCurrentTime = getCurrentTime;
        this.logFile = file;
        this.fileCreationTimeFile = file2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.izettle.android.auth.log.LogFileManager$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements com.izettle.android.auth.log.GetCurrentTime, kotlin.jvm.internal.FunctionAdapter {
        public static final com.izettle.android.auth.log.LogFileManager.AnonymousClass1 Camera2StreamConfigurationMap = new com.izettle.android.auth.log.LogFileManager.AnonymousClass1();

        @Override // com.izettle.android.auth.log.GetCurrentTime
        public final long invoke() {
            return java.lang.System.currentTimeMillis();
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final kotlin.Function<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.FunctionReferenceImpl(0, java.lang.System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof com.izettle.android.auth.log.GetCurrentTime) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        AnonymousClass1() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LogFileManager(android.content.Context context, com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.log.UploadFile uploadFile, com.izettle.android.auth.log.LogFileManager.AnonymousClass1 anonymousClass1, java.io.File file, java.io.File file2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, executor, uploadFile, r4, r5, file2);
        com.izettle.android.auth.log.GetCurrentTime getCurrentTime = (i & 8) != 0 ? com.izettle.android.auth.log.LogFileManager.AnonymousClass1.Camera2StreamConfigurationMap : anonymousClass1;
        if ((i & 16) != 0) {
            java.io.File filesDir = context.getFilesDir();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filesDir, "");
            file = kotlin.io.FilesKt.resolve(filesDir, "auth.log");
        }
        java.io.File file3 = file;
        if ((i & 32) != 0) {
            java.io.File filesDir2 = context.getFilesDir();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filesDir2, "");
            file2 = kotlin.io.FilesKt.resolve(filesDir2, "auth.log.creation_time");
        }
    }

    private final java.io.FileWriter getWriter() {
        return new java.io.FileWriter(this.logFile, true);
    }

    private final void deleteLogFile() {
        this.logFile.delete();
        this.fileCreationTimeFile.delete();
    }

    static /* synthetic */ com.izettle.android.core.data.result.Result syncLogFileInternal$default(com.izettle.android.auth.log.LogFileManager logFileManager, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return logFileManager.syncLogFileInternal(str, z, i);
    }

    private final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> syncLogFileInternal(java.lang.String accessToken, boolean deleteOnFail, int attempt) {
        deleteLogFile();
        return com.izettle.android.core.data.result.ResultKt.asSuccess(kotlin.Unit.INSTANCE);
    }

    private final boolean shouldSync(boolean force) {
        java.lang.Long readAsLongOrNull;
        boolean is24HoursBefore;
        readAsLongOrNull = com.izettle.android.auth.log.LogFileManagerKt.readAsLongOrNull(this.fileCreationTimeFile);
        if (readAsLongOrNull == null) {
            return false;
        }
        long longValue = readAsLongOrNull.longValue();
        if (force) {
            return true;
        }
        is24HoursBefore = com.izettle.android.auth.log.LogFileManagerKt.is24HoursBefore(longValue, this.getCurrentTime.invoke());
        return is24HoursBefore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void syncLogFileAsync$default(com.izettle.android.auth.log.LogFileManager logFileManager, java.lang.String str, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends kotlin.Unit, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.izettle.android.auth.log.LogFileManager$syncLogFileAsync$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends kotlin.Unit, ? extends java.lang.Throwable> result) {
                    getHighSpeedVideoFpsRangesFor(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(com.izettle.android.core.data.result.Result<kotlin.Unit, ? extends java.lang.Throwable> result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                }
            };
        }
        logFileManager.syncLogFileAsync(str, z, function1);
    }

    public final void syncLogFileAsync(final java.lang.String accessToken, final boolean force, final kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<kotlin.Unit, ? extends java.lang.Throwable>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
        this.executor.execute(new kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends kotlin.Unit, ? extends java.lang.Throwable>>() { // from class: com.izettle.android.auth.log.LogFileManager$syncLogFileAsync$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> invoke() {
                return com.izettle.android.auth.log.LogFileManager.this.syncLogFile(accessToken, force);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, onResult, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.izettle.android.auth.log.LogFileManager$syncLogFileAsync$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighSpeedVideoFpsRangesFor(th);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                onResult.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(th));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public static /* synthetic */ com.izettle.android.core.data.result.Result syncLogFile$default(com.izettle.android.auth.log.LogFileManager logFileManager, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return logFileManager.syncLogFile(str, z);
    }

    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> syncLogFile(java.lang.String accessToken, boolean force) {
        return !shouldSync(force) ? com.izettle.android.core.data.result.ResultKt.asSuccess(kotlin.Unit.INSTANCE) : syncLogFileInternal$default(this, accessToken, force, 0, 4, null);
    }

    public final void appendLine(java.lang.String line) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "");
        if (!this.logFile.exists()) {
            kotlin.io.FilesKt.writeText$default(this.fileCreationTimeFile, java.lang.String.valueOf(new java.util.Date().getTime()), null, 2, null);
        }
        java.io.FileWriter writer = getWriter();
        try {
            java.io.FileWriter fileWriter = writer;
            java.lang.Appendable append = fileWriter.append((java.lang.CharSequence) line);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append.append('\n'), "");
            fileWriter.flush();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(writer, null);
        } finally {
        }
    }
}
