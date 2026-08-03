package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

/* compiled from: TrieNode.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a7\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\"\u0004\b\u0000\u0010\u000b*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\f\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\r\u001aL\u0010\u000e\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00130\u0012H\u0082\b¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"LOG_MAX_BRANCHING_FACTOR", "", "MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "indexSegment", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "shift", "addElementAtIndex", "", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "element", "([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;", "filterTo", "newArray", "newArrayOffset", "predicate", "Lkotlin/Function1;", "", "([Ljava/lang/Object;[Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)I", "removeCellAtIndex", "cellIndex", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> java.lang.Object[] addElementAtIndex(java.lang.Object[] objArr, int i, E e) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 1];
        kotlin.collections.ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i + 1, i, objArr.length);
        objArr2[i] = e;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object[] removeCellAtIndex(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        kotlin.collections.ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    static /* synthetic */ int filterTo$default(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt$filterTo$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(obj2 != androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.INSTANCE.getEMPTY$runtime_release());
                }
            };
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < objArr.length) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i4 <= i3);
            if (((java.lang.Boolean) function1.invoke(objArr[i3])).booleanValue()) {
                objArr2[i + i4] = objArr[i3];
                i4++;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i + i4 <= objArr2.length);
            }
            i3++;
        }
        return i4;
    }

    private static final int filterTo(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> function1) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i3 <= i2);
            if (function1.invoke(objArr[i2]).booleanValue()) {
                objArr2[i + i3] = objArr[i2];
                i3++;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i + i3 <= objArr2.length);
            }
            i2++;
        }
        return i3;
    }
}
