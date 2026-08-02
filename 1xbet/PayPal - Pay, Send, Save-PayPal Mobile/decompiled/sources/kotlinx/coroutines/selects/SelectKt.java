package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\"E\u0010\u000e\u001a3\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010\"\u0014\u0010\f\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u001a\u0010\u0014\u001a\u00020\u000f8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016*d\u0010\u0018\"/\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0017¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00030\b2/\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0017¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00030\b*d\u0010\u0019\"/\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2/\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b*\u009c\u0001\u0010\u001c\"K\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0017¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\b0\b2K\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0017¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\n\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\b0\b"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "select", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function3;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlinx/coroutines/internal/Symbol;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "PARAM_CLAUSE_0", "getPARAM_CLAUSE_0", "()Lkotlinx/coroutines/internal/Symbol;", "Lkotlinx/coroutines/selects/SelectInstance;", "RegistrationFunction", "ProcessResultFunction", "", "Lkotlin/coroutines/CoroutineContext;", "OnCancellationConstructor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectKt {
    private static final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return null;
        }
    };
    private static final kotlinx.coroutines.internal.Symbol getHighResolutionOutputSizeshNQ4ISI = new kotlinx.coroutines.internal.Symbol("STATE_REG");
    private static final kotlinx.coroutines.internal.Symbol Camera2StreamConfigurationMap = new kotlinx.coroutines.internal.Symbol("STATE_COMPLETED");
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoFpsRanges = new kotlinx.coroutines.internal.Symbol("STATE_CANCELLED");
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoFpsRangesFor = new kotlinx.coroutines.internal.Symbol("NO_RESULT");
    private static final kotlinx.coroutines.internal.Symbol PARAM_CLAUSE_0 = new kotlinx.coroutines.internal.Symbol("PARAM_CLAUSE_0");

    public static /* synthetic */ void OnCancellationConstructor$annotations() {
    }

    public static /* synthetic */ void ProcessResultFunction$annotations() {
    }

    public static /* synthetic */ void RegistrationFunction$annotations() {
    }

    public static final <R> java.lang.Object select(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.selects.SelectImplementation selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(continuation.getContext());
        function1.invoke(selectImplementation);
        return selectImplementation.doSelect(continuation);
    }

    public static final kotlinx.coroutines.internal.Symbol getPARAM_CLAUSE_0() {
        return PARAM_CLAUSE_0;
    }

    public static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult access$TrySelectDetailedResult(int i) {
        if (i == 0) {
            return kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i == 1) {
            return kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER;
        }
        if (i == 2) {
            return kotlinx.coroutines.selects.TrySelectDetailedResult.CANCELLED;
        }
        if (i == 3) {
            return kotlinx.coroutines.selects.TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new java.lang.IllegalStateException("Unexpected internal result: ".concat(java.lang.String.valueOf(i)).toString());
    }

    public static final /* synthetic */ boolean access$tryResume(kotlinx.coroutines.CancellableContinuation cancellableContinuation, kotlin.jvm.functions.Function3 function3) {
        java.lang.Object tryResume = cancellableContinuation.tryResume(kotlin.Unit.INSTANCE, null, function3);
        if (tryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(tryResume);
        return true;
    }
}
