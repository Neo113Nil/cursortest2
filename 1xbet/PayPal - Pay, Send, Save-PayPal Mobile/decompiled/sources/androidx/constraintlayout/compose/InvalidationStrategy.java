package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBJ\u00121\b\u0002\u0010\b\u001a+\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002¢\u0006\u0002\b\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rRC\u0010\b\u001a+\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002¢\u0006\u0002\b\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/constraintlayout/compose/InvalidationStrategy;", "", "Lkotlin/Function3;", "Landroidx/constraintlayout/compose/InvalidationStrategySpecification;", "Landroidx/compose/ui/unit/Constraints;", "Lkotlin/ParameterName;", "", "Lkotlin/ExtensionFunctionType;", "onIncomingConstraints", "Lkotlin/Function0;", "", "onObservedStateChange", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function3;", "getOnIncomingConstraints", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function0;", "getOnObservedStateChange", "()Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Landroidx/constraintlayout/compose/InvalidationStrategySpecification;", "Landroidx/constraintlayout/compose/ShouldInvalidateCallback;", "shouldInvalidate", "Landroidx/constraintlayout/compose/ShouldInvalidateCallback;", "getShouldInvalidate$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/ShouldInvalidateCallback;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InvalidationStrategy {
    private final androidx.constraintlayout.compose.InvalidationStrategySpecification getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function3<androidx.constraintlayout.compose.InvalidationStrategySpecification, androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints, java.lang.Boolean> onIncomingConstraints;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onObservedStateChange;
    private final androidx.constraintlayout.compose.ShouldInvalidateCallback shouldInvalidate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.InvalidationStrategy.Companion INSTANCE = new androidx.constraintlayout.compose.InvalidationStrategy.Companion(null);
    public static final int $stable = 8;
    private static final androidx.constraintlayout.compose.InvalidationStrategy DefaultInvalidationStrategy = new androidx.constraintlayout.compose.InvalidationStrategy(null, null);

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidationStrategy(kotlin.jvm.functions.Function3<? super androidx.constraintlayout.compose.InvalidationStrategySpecification, ? super androidx.compose.ui.unit.Constraints, ? super androidx.compose.ui.unit.Constraints, java.lang.Boolean> function3, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onIncomingConstraints = function3;
        this.onObservedStateChange = function0;
        this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.compose.InvalidationStrategySpecification();
        this.shouldInvalidate = function3 == 0 ? null : new androidx.constraintlayout.compose.ShouldInvalidateCallback() { // from class: androidx.constraintlayout.compose.InvalidationStrategy$shouldInvalidate$1$1
            @Override // androidx.constraintlayout.compose.ShouldInvalidateCallback
            /* renamed from: invoke-N9IONVI, reason: not valid java name */
            public final boolean mo8967invokeN9IONVI(long j, long j2) {
                androidx.constraintlayout.compose.InvalidationStrategySpecification invalidationStrategySpecification;
                kotlin.jvm.functions.Function3<androidx.constraintlayout.compose.InvalidationStrategySpecification, androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints, java.lang.Boolean> onIncomingConstraints = androidx.constraintlayout.compose.InvalidationStrategy.this.getOnIncomingConstraints();
                invalidationStrategySpecification = androidx.constraintlayout.compose.InvalidationStrategy.this.getHighSpeedVideoFpsRanges;
                return onIncomingConstraints.invoke(invalidationStrategySpecification, androidx.compose.ui.unit.Constraints.m8542boximpl(j), androidx.compose.ui.unit.Constraints.m8542boximpl(j2)).booleanValue();
            }
        };
    }

    public /* synthetic */ InvalidationStrategy(kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function3, function0);
    }

    public final kotlin.jvm.functions.Function3<androidx.constraintlayout.compose.InvalidationStrategySpecification, androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints, java.lang.Boolean> getOnIncomingConstraints() {
        return this.onIncomingConstraints;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnObservedStateChange() {
        return this.onObservedStateChange;
    }

    /* renamed from: getShouldInvalidate$constraintlayout_compose_release, reason: from getter */
    public final androidx.constraintlayout.compose.ShouldInvalidateCallback getShouldInvalidate() {
        return this.shouldInvalidate;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/InvalidationStrategy$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/InvalidationStrategy;", "DefaultInvalidationStrategy", "Landroidx/constraintlayout/compose/InvalidationStrategy;", "getDefaultInvalidationStrategy", "()Landroidx/constraintlayout/compose/InvalidationStrategy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.constraintlayout.compose.InvalidationStrategy getDefaultInvalidationStrategy() {
            return androidx.constraintlayout.compose.InvalidationStrategy.DefaultInvalidationStrategy;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
