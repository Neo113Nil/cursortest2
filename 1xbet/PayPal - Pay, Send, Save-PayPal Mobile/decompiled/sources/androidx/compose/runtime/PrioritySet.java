package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "Landroidx/collection/MutableIntList;", "list", "constructor-impl", "(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "add-impl", "(Landroidx/collection/MutableIntList;I)V", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "", "isEmpty-impl", "(Landroidx/collection/MutableIntList;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "peek-impl", "(Landroidx/collection/MutableIntList;)I", "peek", "takeMax-impl", "takeMax", "validateHeap-impl", "(Landroidx/collection/MutableIntList;)V", "validateHeap", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/collection/MutableIntList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class PrioritySet {
    private final androidx.collection.MutableIntList getHighSpeedVideoSizes;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static androidx.collection.MutableIntList m5255constructorimpl(androidx.collection.MutableIntList mutableIntList) {
        return mutableIntList;
    }

    private /* synthetic */ PrioritySet(androidx.collection.MutableIntList mutableIntList) {
        this.getHighSpeedVideoSizes = mutableIntList;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m5253addimpl(androidx.collection.MutableIntList mutableIntList, int i) {
        androidx.collection.MutableIntList mutableIntList2 = mutableIntList;
        if (mutableIntList2._size == 0 || !(mutableIntList.get(0) == i || mutableIntList.get(mutableIntList2._size - 1) == i)) {
            int i2 = mutableIntList2._size;
            mutableIntList.add(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int i4 = mutableIntList.get(i3);
                if (i <= i4) {
                    break;
                }
                mutableIntList.set(i2, i4);
                i2 = i3;
            }
            mutableIntList.set(i2, i);
        }
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m5260isEmptyimpl(androidx.collection.MutableIntList mutableIntList) {
        return mutableIntList._size == 0;
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m5261isNotEmptyimpl(androidx.collection.MutableIntList mutableIntList) {
        return mutableIntList._size != 0;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m5262peekimpl(androidx.collection.MutableIntList mutableIntList) {
        return mutableIntList.first();
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m5263takeMaximpl(androidx.collection.MutableIntList mutableIntList) {
        int i;
        androidx.collection.MutableIntList mutableIntList2 = mutableIntList;
        int i2 = mutableIntList2._size;
        int i3 = mutableIntList.get(0);
        while (mutableIntList2._size != 0 && mutableIntList.get(0) == i3) {
            mutableIntList.set(0, mutableIntList.last());
            mutableIntList.removeAt(mutableIntList2._size - 1);
            int i4 = mutableIntList2._size;
            int i5 = mutableIntList2._size;
            int i6 = 0;
            while (i6 < (i5 >>> 1)) {
                int i7 = mutableIntList.get(i6);
                int i8 = (i6 + 1) * 2;
                int i9 = i8 - 1;
                int i10 = mutableIntList.get(i9);
                if (i8 >= i4 || (i = mutableIntList.get(i8)) <= i10) {
                    if (i10 > i7) {
                        mutableIntList.set(i6, i10);
                        mutableIntList.set(i9, i7);
                        i6 = i9;
                    }
                } else if (i > i7) {
                    mutableIntList.set(i6, i);
                    mutableIntList.set(i8, i7);
                    i6 = i8;
                }
            }
        }
        return i3;
    }

    /* renamed from: validateHeap-impl, reason: not valid java name */
    public static final void m5265validateHeapimpl(androidx.collection.MutableIntList mutableIntList) {
        int i = mutableIntList._size;
        int i2 = i / 2;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            int i5 = i4 * 2;
            if (mutableIntList.get(i3) < mutableIntList.get(i5 - 1)) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if (i5 < i && mutableIntList.get(i3) < mutableIntList.get(i5)) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            i3 = i4;
        }
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ androidx.collection.MutableIntList m5256constructorimpl$default(androidx.collection.MutableIntList mutableIntList, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            mutableIntList = new androidx.collection.MutableIntList(0, i2, null);
        }
        return m5255constructorimpl(mutableIntList);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ androidx.collection.MutableIntList getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return m5264toStringimpl(this.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return m5259hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m5257equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5264toStringimpl(androidx.collection.MutableIntList mutableIntList) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrioritySet(list=");
        sb.append(mutableIntList);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5259hashCodeimpl(androidx.collection.MutableIntList mutableIntList) {
        return mutableIntList.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5258equalsimpl0(androidx.collection.MutableIntList mutableIntList, androidx.collection.MutableIntList mutableIntList2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(mutableIntList, mutableIntList2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5257equalsimpl(androidx.collection.MutableIntList mutableIntList, java.lang.Object obj) {
        return (obj instanceof androidx.compose.runtime.PrioritySet) && kotlin.jvm.internal.Intrinsics.areEqual(mutableIntList, ((androidx.compose.runtime.PrioritySet) obj).getGetHighSpeedVideoSizes());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.PrioritySet m5254boximpl(androidx.collection.MutableIntList mutableIntList) {
        return new androidx.compose.runtime.PrioritySet(mutableIntList);
    }
}
