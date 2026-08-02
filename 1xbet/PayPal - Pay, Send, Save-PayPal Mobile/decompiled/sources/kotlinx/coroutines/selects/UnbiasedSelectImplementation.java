package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\r\u001a\u00020\f*\u00020\u00072\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJD\u0010\r\u001a\u00020\f\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00010\u00102\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011H\u0096\u0002¢\u0006\u0004\b\r\u0010\u0012JX\u0010\r\u001a\u00020\f\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011H\u0096\u0002¢\u0006\u0004\b\r\u0010\u0016J\u0010\u0010\u0017\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0012\u0012\u000e\u0012\f0\u001aR\b\u0012\u0004\u0012\u00028\u00000\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lkotlinx/coroutines/selects/UnbiasedSelectImplementation;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/selects/SelectImplementation;", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", com.visa.cbp.getEncExpo.updateVisuals, "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "doSelect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "Camera2StreamConfigurationMap", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class UnbiasedSelectImplementation<R> extends kotlinx.coroutines.selects.SelectImplementation<R> {
    private final java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> Camera2StreamConfigurationMap;

    public UnbiasedSelectImplementation(kotlin.coroutines.CoroutineContext coroutineContext) {
        super(coroutineContext);
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public void invoke(kotlinx.coroutines.selects.SelectClause0 selectClause0, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        this.Camera2StreamConfigurationMap.add(new kotlinx.coroutines.selects.SelectImplementation.ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), kotlinx.coroutines.selects.SelectKt.getPARAM_CLAUSE_0(), function1, selectClause0.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(kotlinx.coroutines.selects.SelectClause1<? extends Q> selectClause1, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        this.Camera2StreamConfigurationMap.add(new kotlinx.coroutines.selects.SelectImplementation.ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, function2, selectClause1.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> selectClause2, P p, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        this.Camera2StreamConfigurationMap.add(new kotlinx.coroutines.selects.SelectImplementation.ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p, function2, selectClause2.getOnCancellationConstructor()));
    }

    private static /* synthetic */ <R> java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.selects.UnbiasedSelectImplementation<R> unbiasedSelectImplementation, kotlin.coroutines.Continuation<? super R> continuation) {
        try {
            java.util.Collections.shuffle(((kotlinx.coroutines.selects.UnbiasedSelectImplementation) unbiasedSelectImplementation).Camera2StreamConfigurationMap);
            java.util.Iterator<T> it = ((kotlinx.coroutines.selects.UnbiasedSelectImplementation) unbiasedSelectImplementation).Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.selects.SelectImplementation.register$default(unbiasedSelectImplementation, (kotlinx.coroutines.selects.SelectImplementation.ClauseData) it.next(), false, 1, null);
            }
            ((kotlinx.coroutines.selects.UnbiasedSelectImplementation) unbiasedSelectImplementation).Camera2StreamConfigurationMap.clear();
            return super.doSelect(continuation);
        } catch (java.lang.Throwable th) {
            ((kotlinx.coroutines.selects.UnbiasedSelectImplementation) unbiasedSelectImplementation).Camera2StreamConfigurationMap.clear();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    public java.lang.Object doSelect(kotlin.coroutines.Continuation<? super R> continuation) {
        return getHighSpeedVideoSizes(this, continuation);
    }
}
