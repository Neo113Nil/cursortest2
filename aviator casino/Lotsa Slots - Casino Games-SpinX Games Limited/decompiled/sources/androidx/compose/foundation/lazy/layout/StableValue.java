package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutItemContentFactory.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0003¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StableValue;", "T", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "equals", "", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
final class StableValue<T> {
    private final T value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.lazy.layout.StableValue m754boximpl(java.lang.Object obj) {
        return new androidx.compose.foundation.lazy.layout.StableValue(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.lang.Object m755constructorimpl(T t) {
        return t;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m756equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof androidx.compose.foundation.lazy.layout.StableValue) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((androidx.compose.foundation.lazy.layout.StableValue) obj2).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m757equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m758hashCodeimpl(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m759toStringimpl(java.lang.Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m756equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m758hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m759toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.Object getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ StableValue(java.lang.Object obj) {
        this.value = obj;
    }

    public final T getValue() {
        return this.value;
    }
}
