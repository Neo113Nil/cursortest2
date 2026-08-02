package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "", "Landroidx/compose/runtime/MutableState;", "", "state", "constructor-impl", "(Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/MutableState;", "attachToScope-impl", "(Landroidx/compose/runtime/MutableState;)V", "attachToScope", "invalidateScope-impl", "invalidateScope", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ObservableScopeInvalidator {
    private final androidx.compose.runtime.MutableState<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static androidx.compose.runtime.MutableState<kotlin.Unit> m1871constructorimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        return mutableState;
    }

    private /* synthetic */ ObservableScopeInvalidator(androidx.compose.runtime.MutableState mutableState) {
        this.getHighSpeedVideoFpsRanges = mutableState;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.MutableState m1872constructorimpl$default(androidx.compose.runtime.MutableState mutableState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            mutableState = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(kotlin.Unit.INSTANCE, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        }
        return m1871constructorimpl(mutableState);
    }

    /* renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m1869attachToScopeimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m1876invalidateScopeimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        mutableState.setValue(kotlin.Unit.INSTANCE);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ androidx.compose.runtime.MutableState getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m1877toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return m1875hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m1873equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1877toStringimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ObservableScopeInvalidator(state=");
        sb.append(mutableState);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1875hashCodeimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1874equalsimpl0(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, androidx.compose.runtime.MutableState<kotlin.Unit> mutableState2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(mutableState, mutableState2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1873equalsimpl(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator) && kotlin.jvm.internal.Intrinsics.areEqual(mutableState, ((androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator) obj).getGetHighSpeedVideoFpsRanges());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator m1870boximpl(androidx.compose.runtime.MutableState mutableState) {
        return new androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator(mutableState);
    }
}
