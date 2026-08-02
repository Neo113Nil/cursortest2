package K1;

import K1.C3422b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3424d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C3422b f15045a = new C3422b(6, "", null);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15046b = 0;

    public static final ArrayList a(int i11, int i12, List list) {
        if (i11 > i12) {
            throw new IllegalArgumentException(("start (" + i11 + ") should be less than or equal to end (" + i12 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            C3422b.C0288b c0288b = (C3422b.C0288b) obj;
            if (f(i11, i12, c0288b.g(), c0288b.e())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C3422b.C0288b c0288b2 = (C3422b.C0288b) arrayList.get(i14);
            arrayList2.add(new C3422b.C0288b(c0288b2.f(), Math.max(i11, c0288b2.g()) - i11, Math.min(i12, c0288b2.e()) - i11, c0288b2.h()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final C3422b c(C3422b c3422b, int i11, int i12) {
        String str;
        if (i11 != i12) {
            str = c3422b.h().substring(i11, i12);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new C3422b(str, e(c3422b, i11, i12), null, null);
    }

    @NotNull
    public static final C3422b d() {
        return f15045a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C3422b.C0288b<D>> e(C3422b c3422b, int i11, int i12) {
        List<C3422b.C0288b<D>> f7;
        if (i11 == i12 || (f7 = c3422b.f()) == null) {
            return null;
        }
        if (i11 == 0 && i12 >= c3422b.h().length()) {
            return f7;
        }
        ArrayList arrayList = new ArrayList(f7.size());
        int size = f7.size();
        for (int i13 = 0; i13 < size; i13++) {
            C3422b.C0288b<D> c0288b = f7.get(i13);
            C3422b.C0288b<D> c0288b2 = c0288b;
            if (f(i11, i12, c0288b2.g(), c0288b2.e())) {
                arrayList.add(c0288b);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C3422b.C0288b c0288b3 = (C3422b.C0288b) arrayList.get(i14);
            arrayList2.add(new C3422b.C0288b(kotlin.ranges.h.e(c0288b3.g(), i11, i12) - i11, kotlin.ranges.h.e(c0288b3.e(), i11, i12) - i11, c0288b3.f()));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if ((r6 == r7) == (r4 == r5)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f(int i11, int i12, int i13, int i14) {
        if (Math.max(i11, i13) >= Math.min(i12, i14)) {
            if (i11 <= i13 && i14 <= i12) {
                if (i12 == i14) {
                }
            }
            if (i13 <= i11 && i12 <= i14) {
                if (i14 == i12) {
                    if ((i11 == i12) == (i13 == i14)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static C3422b g(C3422b c3422b) {
        int i11 = R1.c.f24234d;
        return C3428h.b(c3422b, new C3423c(R1.d.a().a()));
    }
}
