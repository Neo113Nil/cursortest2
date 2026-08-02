package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileReadScope$readData$2", f = "FileStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class FileReadScope$readData$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.content.core.FileReadScope<T> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r8 != r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.Closeable closeable;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.Camera2StreamConfigurationMap;
        try {
            try {
                try {
                } catch (java.io.FileNotFoundException unused) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.getFile().exists()) {
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.getHighResolutionOutputSizeshNQ4ISI.getFile());
                        try {
                            this.getHighSpeedVideoSizes = fileInputStream;
                            this.Camera2StreamConfigurationMap = 2;
                            java.lang.Object readFrom = this.getHighResolutionOutputSizeshNQ4ISI.getSerializer().readFrom(fileInputStream, this);
                            if (readFrom != coroutine_suspended) {
                                closeable = fileInputStream;
                                obj = readFrom;
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th2) {
                            closeable = fileInputStream;
                            th = th2;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th3) {
                                kotlin.io.CloseableKt.closeFinally(closeable, th);
                                throw th3;
                            }
                        }
                    }
                    return this.getHighResolutionOutputSizeshNQ4ISI.getSerializer().getDefaultValue();
                }
                if (r1 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(this.getHighResolutionOutputSizeshNQ4ISI.getFile());
                    this.getHighSpeedVideoSizes = fileInputStream2;
                    this.Camera2StreamConfigurationMap = 1;
                    obj = this.getHighResolutionOutputSizeshNQ4ISI.getSerializer().readFrom(fileInputStream2, this);
                    r1 = fileInputStream2;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (java.io.Closeable) this.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.io.CloseableKt.closeFinally(closeable, null);
                            return obj;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                    java.io.Closeable closeable2 = (java.io.Closeable) this.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r1 = closeable2;
                }
                kotlin.io.CloseableKt.closeFinally(r1, null);
                return obj;
            } catch (java.lang.Exception e) {
                if (e instanceof java.io.FileNotFoundException) {
                    throw androidx.content.core.DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(this.getHighResolutionOutputSizeshNQ4ISI.getFile().getParent(), e);
                }
                throw e;
            }
        } catch (java.lang.Throwable th5) {
            try {
                throw th5;
            } catch (java.lang.Throwable th6) {
                kotlin.io.CloseableKt.closeFinally(r1, th5);
                throw th6;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return ((androidx.content.core.FileReadScope$readData$2) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.FileReadScope$readData$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileReadScope$readData$2(androidx.content.core.FileReadScope<T> fileReadScope, kotlin.coroutines.Continuation<? super androidx.content.core.FileReadScope$readData$2> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = fileReadScope;
    }
}
