package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Lkotlin/coroutines/jvm/internal/TailCallBaseContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "", "declaringClass", "methodName", "fileName", "", "lineNumber", "", "", "spilledVariables", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Ljava/lang/String;", "getDeclaringClass", "()Ljava/lang/String;", "getMethodName", "getFileName", com.visa.cbp.getEncExpo.warmup, "getLineNumber", "()I", "[Ljava/lang/Object;", "getSpilledVariables", "()[Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/Continuation;", "Camera2StreamConfigurationMap", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TailCallBaseContinuationImpl extends kotlin.coroutines.jvm.internal.BaseContinuationImpl {
    private final java.lang.String declaringClass;
    private final java.lang.String fileName;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.coroutines.Continuation<java.lang.Object> Camera2StreamConfigurationMap;
    private final int lineNumber;
    private final java.lang.String methodName;
    private final java.lang.Object[] spilledVariables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TailCallBaseContinuationImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        super(continuation);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        this.declaringClass = str;
        this.methodName = str2;
        this.fileName = str3;
        this.lineNumber = i;
        this.spilledVariables = objArr;
        this.Camera2StreamConfigurationMap = continuation;
    }

    public final java.lang.String getDeclaringClass() {
        return this.declaringClass;
    }

    public final java.lang.String getMethodName() {
        return this.methodName;
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final java.lang.Object[] getSpilledVariables() {
        return this.spilledVariables;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected final java.lang.Object invokeSuspend(java.lang.Object result) {
        kotlin.ResultKt.throwOnFailure(result);
        return result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* renamed from: getStackTraceElement */
    public final java.lang.StackTraceElement getGetHighResolutionOutputSizeshNQ4ISI() {
        java.lang.String obj;
        java.lang.String moduleName = kotlin.coroutines.jvm.internal.ModuleNameRetriever.INSTANCE.getModuleName(this);
        if (moduleName == null) {
            obj = this.declaringClass;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(moduleName);
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            sb.append(this.declaringClass);
            obj = sb.toString();
        }
        return new java.lang.StackTraceElement(obj, this.methodName, this.fileName, this.lineNumber);
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap.getGetHighSpeedVideoSizes();
    }
}
