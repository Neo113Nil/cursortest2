package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BÜ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00127\u0010\n\u001a3\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0006\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t\u00127\u0010\f\u001a3\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u000b\u0012Y\b\u0002\u0010\u0010\u001aS\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015RK\u0010\n\u001a3\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0006\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018RK\u0010\f\u001a3\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018Rk\u0010\u0010\u001aS\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause1Impl;", com.visa.cbp.getEncExpo.updateVisuals, "Lkotlinx/coroutines/selects/SelectClause1;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "Lkotlinx/coroutines/selects/SelectInstance;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "Ljava/lang/Object;", "getClauseObject", "()Ljava/lang/Object;", "Lkotlin/jvm/functions/Function3;", "getRegFunc", "()Lkotlin/jvm/functions/Function3;", "getProcessResFunc", "getOnCancellationConstructor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectClause1Impl<Q> implements kotlinx.coroutines.selects.SelectClause1<Q> {
    private final java.lang.Object clauseObject;
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit>> onCancellationConstructor;
    private final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> processResFunc;
    private final kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> regFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectClause1Impl(java.lang.Object obj, kotlin.jvm.functions.Function3<java.lang.Object, ? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> function3, kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, ? extends java.lang.Object> function32, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, ? extends kotlin.jvm.functions.Function3<? super java.lang.Throwable, java.lang.Object, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>> function33) {
        this.clauseObject = obj;
        this.regFunc = function3;
        this.processResFunc = function32;
        this.onCancellationConstructor = function33;
    }

    public /* synthetic */ SelectClause1Impl(java.lang.Object obj, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function3 function33, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, function32, (i & 8) != 0 ? null : function33);
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public final java.lang.Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public final kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> getRegFunc() {
        return this.regFunc;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit>> getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }
}
