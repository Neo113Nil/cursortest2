package kotlinx.coroutines.selects;

/* compiled from: OnTimeout.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\u00020\u00078F¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/selects/OnTimeout;", "", "timeMillis", "", "<init>", "(J)V", "selectClause", "Lkotlinx/coroutines/selects/SelectClause0;", "getSelectClause$annotations", "()V", "getSelectClause", "()Lkotlinx/coroutines/selects/SelectClause0;", "register", "", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnTimeout {
    private final long timeMillis;

    public static /* synthetic */ void getSelectClause$annotations() {
    }

    public OnTimeout(long j) {
        this.timeMillis = j;
    }

    public final kotlinx.coroutines.selects.SelectClause0 getSelectClause() {
        kotlinx.coroutines.selects.OnTimeout$selectClause$1 onTimeout$selectClause$1 = kotlinx.coroutines.selects.OnTimeout$selectClause$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new kotlinx.coroutines.selects.SelectClause0Impl(this, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(onTimeout$selectClause$1, 3), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void register(final kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        if (this.timeMillis <= 0) {
            select.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: kotlinx.coroutines.selects.OnTimeout$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                kotlinx.coroutines.selects.OnTimeout.register$lambda$0(kotlinx.coroutines.selects.SelectInstance.this, this);
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        kotlinx.coroutines.selects.SelectImplementation selectImplementation = (kotlinx.coroutines.selects.SelectImplementation) select;
        kotlin.coroutines.CoroutineContext context = selectImplementation.getContext();
        selectImplementation.disposeOnCompletion(kotlinx.coroutines.DelayKt.getDelay(context).invokeOnTimeout(this.timeMillis, runnable, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$0(kotlinx.coroutines.selects.SelectInstance selectInstance, kotlinx.coroutines.selects.OnTimeout onTimeout) {
        selectInstance.trySelect(onTimeout, kotlin.Unit.INSTANCE);
    }
}
