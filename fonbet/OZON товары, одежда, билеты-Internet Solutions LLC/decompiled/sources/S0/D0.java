package S0;

import java.util.ArrayList;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f25194a = new ArrayList();

    public D0(int i11) {
    }

    public final void a(int i11) {
        ArrayList arrayList = this.f25194a;
        if (arrayList.isEmpty() || !(((Number) arrayList.get(0)).intValue() == i11 || ((Number) C.o0.b(1, arrayList)).intValue() == i11)) {
            int size = arrayList.size();
            arrayList.add(Integer.valueOf(i11));
            while (size > 0) {
                int i12 = ((size + 1) >>> 1) - 1;
                int intValue = ((Number) arrayList.get(i12)).intValue();
                if (i11 <= intValue) {
                    break;
                }
                arrayList.set(size, Integer.valueOf(intValue));
                size = i12;
            }
            arrayList.set(size, Integer.valueOf(i11));
        }
    }

    public final boolean b() {
        return !this.f25194a.isEmpty();
    }

    public final int c() {
        return ((Number) C7714v.K(this.f25194a)).intValue();
    }

    public final int d() {
        int intValue;
        ArrayList arrayList = this.f25194a;
        if (arrayList.size() <= 0) {
            r.j("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) arrayList.get(0)).intValue();
        while (!arrayList.isEmpty() && ((Number) arrayList.get(0)).intValue() == intValue2) {
            arrayList.set(0, C7714v.X(arrayList));
            arrayList.remove(arrayList.size() - 1);
            int size = arrayList.size();
            int size2 = arrayList.size() >>> 1;
            int i11 = 0;
            while (i11 < size2) {
                int intValue3 = ((Number) arrayList.get(i11)).intValue();
                int i12 = (i11 + 1) * 2;
                int i13 = i12 - 1;
                int intValue4 = ((Number) arrayList.get(i13)).intValue();
                if (i12 >= size || (intValue = ((Number) arrayList.get(i12)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        arrayList.set(i11, Integer.valueOf(intValue4));
                        arrayList.set(i13, Integer.valueOf(intValue3));
                        i11 = i13;
                    }
                } else if (intValue > intValue3) {
                    arrayList.set(i11, Integer.valueOf(intValue));
                    arrayList.set(i12, Integer.valueOf(intValue3));
                    i11 = i12;
                }
            }
        }
        return intValue2;
    }
}
