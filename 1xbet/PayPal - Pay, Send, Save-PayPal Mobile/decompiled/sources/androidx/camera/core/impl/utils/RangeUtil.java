package androidx.camera.core.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/core/impl/utils/RangeUtil;", "", "<init>", "()V", "", "Landroid/util/Range;", "", "filterFixedRanges", "(Ljava/util/Set;)Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RangeUtil {
    public static final androidx.camera.core.impl.utils.RangeUtil INSTANCE = new androidx.camera.core.impl.utils.RangeUtil();

    private RangeUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<android.util.Range<java.lang.Integer>> filterFixedRanges(java.util.Set<android.util.Range<java.lang.Integer>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : set) {
            android.util.Range range = (android.util.Range) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(range.getUpper(), range.getLower())) {
                arrayList.add(obj);
            }
        }
        return new java.util.LinkedHashSet(arrayList);
    }
}
