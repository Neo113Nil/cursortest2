package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/constraintlayout/compose/TransitionImpl;", "Landroidx/constraintlayout/compose/Transition;", "Landroidx/constraintlayout/core/parser/CLObject;", "parsedTransition", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "applyAllTo", "(Landroidx/constraintlayout/core/state/Transition;)V", "applyKeyFramesTo", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "getEndConstraintSetId", "()Ljava/lang/String;", "getStartConstraintSetId", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Landroidx/constraintlayout/core/parser/CLObject;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitionImpl implements androidx.constraintlayout.compose.Transition {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.TransitionImpl.Companion INSTANCE = new androidx.constraintlayout.compose.TransitionImpl.Companion(null);
    private static final androidx.constraintlayout.compose.TransitionImpl EMPTY = new androidx.constraintlayout.compose.TransitionImpl(new androidx.constraintlayout.core.parser.CLObject(new char[0]));

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.constraintlayout.core.parser.CLObject Camera2StreamConfigurationMap;

    public TransitionImpl(androidx.constraintlayout.core.parser.CLObject cLObject) {
        this.Camera2StreamConfigurationMap = cLObject;
    }

    public final void applyAllTo(androidx.constraintlayout.core.state.Transition transition) {
        try {
            androidx.constraintlayout.core.state.TransitionParser.parse(this.Camera2StreamConfigurationMap, transition);
        } catch (androidx.constraintlayout.core.parser.CLParsingException unused) {
        }
    }

    public final void applyKeyFramesTo(androidx.constraintlayout.core.state.Transition transition) {
        try {
            androidx.constraintlayout.core.state.TransitionParser.parseKeyFrames(this.Camera2StreamConfigurationMap, transition);
        } catch (androidx.constraintlayout.core.parser.CLParsingException unused) {
        }
    }

    @Override // androidx.constraintlayout.compose.Transition
    public final java.lang.String getStartConstraintSetId() {
        java.lang.String stringOrNull = this.Camera2StreamConfigurationMap.getStringOrNull("from");
        return stringOrNull == null ? com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START : stringOrNull;
    }

    @Override // androidx.constraintlayout.compose.Transition
    public final java.lang.String getEndConstraintSetId() {
        java.lang.String stringOrNull = this.Camera2StreamConfigurationMap.getStringOrNull(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO);
        return stringOrNull == null ? "end" : stringOrNull;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.constraintlayout.compose.TransitionImpl) other).Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/TransitionImpl$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/TransitionImpl;", "EMPTY", "Landroidx/constraintlayout/compose/TransitionImpl;", "getEMPTY$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/TransitionImpl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.constraintlayout.compose.TransitionImpl getEMPTY$constraintlayout_compose_release() {
            return androidx.constraintlayout.compose.TransitionImpl.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
