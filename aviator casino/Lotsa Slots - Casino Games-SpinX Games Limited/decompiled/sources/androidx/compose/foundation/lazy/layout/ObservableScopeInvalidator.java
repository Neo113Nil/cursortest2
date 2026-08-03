package androidx.compose.foundation.lazy.layout;

/* compiled from: ObservableScopeInvalidator.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "", "state", "Landroidx/compose/runtime/MutableState;", "", "constructor-impl", "(Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/MutableState;", "attachToScope", "attachToScope-impl", "(Landroidx/compose/runtime/MutableState;)V", "equals", "", "other", "equals-impl", "(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroidx/compose/runtime/MutableState;)I", "invalidateScope", "invalidateScope-impl", "toString", "", "toString-impl", "(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {
    private final androidx.compose.runtime.MutableState<kotlin.Unit> state;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator m745boximpl(androidx.compose.runtime.MutableState mutableState) {
        return new androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator(mutableState);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static androidx.compose.runtime.MutableState<kotlin.Unit> m746constructorimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        return mutableState;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m748equalsimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator) && kotlin.jvm.internal.Intrinsics.areEqual(mutableState, ((androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator) obj).getState());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m749equalsimpl0(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, androidx.compose.runtime.MutableState<kotlin.Unit> mutableState2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(mutableState, mutableState2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m750hashCodeimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m752toStringimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m748equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m750hashCodeimpl(this.state);
    }

    public java.lang.String toString() {
        return m752toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ androidx.compose.runtime.MutableState getState() {
        return this.state;
    }

    private /* synthetic */ ObservableScopeInvalidator(androidx.compose.runtime.MutableState mutableState) {
        this.state = mutableState;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.MutableState m747constructorimpl$default(androidx.compose.runtime.MutableState mutableState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            mutableState = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(kotlin.Unit.INSTANCE, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        }
        return m746constructorimpl(mutableState);
    }

    /* renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m744attachToScopeimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m751invalidateScopeimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        mutableState.setValue(kotlin.Unit.INSTANCE);
    }
}
