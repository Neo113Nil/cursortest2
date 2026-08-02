package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0011\u0010/\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b-\u0010.\u0088\u0001\u0005\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004"}, d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "backing", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "push-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", com.adjust.sdk.Constants.PUSH, "pop-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "peek-impl", "peek", "", "index", "(Ljava/util/ArrayList;I)Ljava/lang/Object;", "isEmpty-impl", "(Ljava/util/ArrayList;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "", "clear-impl", "(Ljava/util/ArrayList;)V", "clear", "", "toArray-impl", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "toArray", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/util/ArrayList;", "getHighResolutionOutputSizeshNQ4ISI", "getSize-impl", "(Ljava/util/ArrayList;)I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class Stack<T> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.ArrayList<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.util.ArrayList<T> m5281constructorimpl(java.util.ArrayList<T> arrayList) {
        return arrayList;
    }

    private /* synthetic */ Stack(java.util.ArrayList arrayList) {
        this.getHighResolutionOutputSizeshNQ4ISI = arrayList;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ java.util.ArrayList m5282constructorimpl$default(java.util.ArrayList arrayList, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new java.util.ArrayList();
        }
        return m5281constructorimpl(arrayList);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m5285getSizeimpl(java.util.ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m5292pushimpl(java.util.ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final T m5291popimpl(java.util.ArrayList<T> arrayList) {
        return arrayList.remove(m5285getSizeimpl(arrayList) - 1);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m5289peekimpl(java.util.ArrayList<T> arrayList) {
        return arrayList.get(m5285getSizeimpl(arrayList) - 1);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m5290peekimpl(java.util.ArrayList<T> arrayList, int i) {
        return arrayList.get(i);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m5287isEmptyimpl(java.util.ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m5288isNotEmptyimpl(java.util.ArrayList<T> arrayList) {
        return !m5287isEmptyimpl(arrayList);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m5280clearimpl(java.util.ArrayList<T> arrayList) {
        arrayList.clear();
    }

    /* renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m5293toArrayimpl(java.util.ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new java.lang.Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = arrayList.get(i);
        }
        return tArr;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.util.ArrayList getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return m5294toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return m5286hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m5283equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5294toStringimpl(java.util.ArrayList<T> arrayList) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Stack(backing=");
        sb.append(arrayList);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5286hashCodeimpl(java.util.ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5284equalsimpl0(java.util.ArrayList<java.lang.Object> arrayList, java.util.ArrayList<java.lang.Object> arrayList2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(arrayList, arrayList2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5283equalsimpl(java.util.ArrayList<T> arrayList, java.lang.Object obj) {
        return (obj instanceof androidx.compose.runtime.Stack) && kotlin.jvm.internal.Intrinsics.areEqual(arrayList, ((androidx.compose.runtime.Stack) obj).getGetHighResolutionOutputSizeshNQ4ISI());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.Stack m5279boximpl(java.util.ArrayList arrayList) {
        return new androidx.compose.runtime.Stack(arrayList);
    }
}
