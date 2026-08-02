package F4;

import F4.F;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class S extends F.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f8850a = new ArrayList();

    @Override // F4.F.b
    public final void a(int i11, int i12) {
        ArrayList arrayList = this.f8850a;
        arrayList.add(0);
        arrayList.add(Integer.valueOf(i11));
        arrayList.add(Integer.valueOf(i12));
    }

    @Override // F4.F.b
    public final void b(int i11, int i12) {
        ArrayList arrayList = this.f8850a;
        arrayList.add(1);
        arrayList.add(Integer.valueOf(i11));
        arrayList.add(Integer.valueOf(i12));
    }

    @Override // F4.F.b
    public final void c(int i11, int i12) {
        ArrayList arrayList = this.f8850a;
        arrayList.add(2);
        arrayList.add(Integer.valueOf(i11));
        arrayList.add(Integer.valueOf(i12));
    }

    public final void d(@NotNull C3024d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        ArrayList arrayList = this.f8850a;
        kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, arrayList.size()), 3);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
            while (true) {
                int i11 = f71842a + f71844c;
                int intValue = ((Number) arrayList.get(f71842a)).intValue();
                if (intValue == 0) {
                    other.a(((Number) arrayList.get(f71842a + 1)).intValue(), ((Number) arrayList.get(f71842a + 2)).intValue());
                } else if (intValue == 1) {
                    other.b(((Number) arrayList.get(f71842a + 1)).intValue(), ((Number) arrayList.get(f71842a + 2)).intValue());
                } else {
                    if (intValue != 2) {
                        throw new IllegalStateException("Unexpected recording value");
                    }
                    other.c(((Number) arrayList.get(f71842a + 1)).intValue(), ((Number) arrayList.get(f71842a + 2)).intValue());
                }
                if (f71842a == f71843b) {
                    break;
                } else {
                    f71842a = i11;
                }
            }
        }
        arrayList.clear();
    }
}
