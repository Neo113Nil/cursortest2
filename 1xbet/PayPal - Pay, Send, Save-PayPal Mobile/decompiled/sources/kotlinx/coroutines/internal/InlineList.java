package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002"}, d2 = {"Lkotlinx/coroutines/internal/InlineList;", "E", "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "element", "plus-FjFbRPM", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "plus", "Lkotlin/Function1;", "", "action", "forEachReversed-impl", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachReversed", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class InlineList<E> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> java.lang.Object m24110constructorimpl(java.lang.Object obj) {
        return obj;
    }

    private /* synthetic */ InlineList(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m24111constructorimpl$default(java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m24110constructorimpl(obj);
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final java.lang.Object m24116plusFjFbRPM(java.lang.Object obj, E e) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && (e instanceof java.util.List)) {
            throw new java.lang.AssertionError();
        }
        if (obj == null) {
            return m24110constructorimpl(e);
        }
        if (obj instanceof java.util.ArrayList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            ((java.util.ArrayList) obj).add(e);
            return m24110constructorimpl(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m24110constructorimpl(arrayList);
    }

    /* renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m24114forEachReversedimpl(java.lang.Object obj, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1) {
        if (obj != null) {
            if (!(obj instanceof java.util.ArrayList)) {
                function1.invoke(obj);
                return;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                function1.invoke((java.lang.Object) arrayList.get(size));
            }
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.Object getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m24117toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return m24115hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m24112equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m24117toStringimpl(java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InlineList(holder=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24115hashCodeimpl(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24113equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24112equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof kotlinx.coroutines.internal.InlineList) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((kotlinx.coroutines.internal.InlineList) obj2).getGetHighSpeedVideoFpsRanges());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.coroutines.internal.InlineList m24109boximpl(java.lang.Object obj) {
        return new kotlinx.coroutines.internal.InlineList(obj);
    }
}
