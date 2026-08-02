package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/constraintlayout/compose/DslConstraintSet;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "", "Lkotlin/ExtensionFunctionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/constraintlayout/compose/ConstraintSet;)V", "Landroidx/constraintlayout/compose/State;", "state", "applyToState", "(Landroidx/constraintlayout/compose/State;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "name", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "override", "(Ljava/lang/String;F)Landroidx/constraintlayout/compose/ConstraintSet;", "Lkotlin/jvm/functions/Function1;", "getDescription", "()Lkotlin/jvm/functions/Function1;", "Landroidx/constraintlayout/compose/ConstraintSet;", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Landroidx/constraintlayout/compose/ConstraintSetScope;", "getScope$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/ConstraintSetScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DslConstraintSet implements androidx.constraintlayout.compose.DerivedConstraintSet {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<androidx.constraintlayout.compose.ConstraintSetScope, kotlin.Unit> description;
    private final androidx.constraintlayout.compose.ConstraintSet extendFrom;
    private final androidx.constraintlayout.compose.ConstraintSetScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public DslConstraintSet(kotlin.jvm.functions.Function1<? super androidx.constraintlayout.compose.ConstraintSetScope, kotlin.Unit> function1, androidx.constraintlayout.compose.ConstraintSet constraintSet) {
        androidx.constraintlayout.compose.ConstraintSetScope constraintSetScope;
        this.description = function1;
        androidx.constraintlayout.core.parser.CLObject cLObject = null;
        androidx.constraintlayout.compose.DslConstraintSet dslConstraintSet = constraintSet instanceof androidx.constraintlayout.compose.DslConstraintSet ? (androidx.constraintlayout.compose.DslConstraintSet) constraintSet : null;
        if (dslConstraintSet != null && (constraintSetScope = dslConstraintSet.scope) != null) {
            cLObject = constraintSetScope.getContainerObject();
        }
        androidx.constraintlayout.compose.ConstraintSetScope constraintSetScope2 = new androidx.constraintlayout.compose.ConstraintSetScope(cLObject);
        function1.invoke(constraintSetScope2);
        this.scope = constraintSetScope2;
    }

    public /* synthetic */ DslConstraintSet(kotlin.jvm.functions.Function1 function1, androidx.constraintlayout.compose.ConstraintSet constraintSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : constraintSet);
    }

    public final kotlin.jvm.functions.Function1<androidx.constraintlayout.compose.ConstraintSetScope, kotlin.Unit> getDescription() {
        return this.description;
    }

    /* renamed from: getScope$constraintlayout_compose_release, reason: from getter */
    public final androidx.constraintlayout.compose.ConstraintSetScope getScope() {
        return this.scope;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public final androidx.constraintlayout.compose.ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public final void applyToState(androidx.constraintlayout.compose.State state) {
        this.scope.applyTo(state);
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final androidx.constraintlayout.compose.ConstraintSet override(java.lang.String name2, float value) {
        return this;
    }

    public final boolean equals(java.lang.Object other) {
        if (other instanceof androidx.constraintlayout.compose.DslConstraintSet) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.scope, ((androidx.constraintlayout.compose.DslConstraintSet) other).scope);
        }
        return false;
    }

    public final int hashCode() {
        return this.scope.hashCode();
    }
}
