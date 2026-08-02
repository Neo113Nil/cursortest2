package Pd;

import Od.C3680a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f22209a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22210b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22211c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22212d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Integer> f22213e;

    public a(@NotNull int... numbers) {
        List<Integer> list;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.f22209a = numbers;
        Integer J11 = C7705l.J(numbers, 0);
        this.f22210b = J11 != null ? J11.intValue() : -1;
        Integer J12 = C7705l.J(numbers, 1);
        this.f22211c = J12 != null ? J12.intValue() : -1;
        Integer J13 = C7705l.J(numbers, 2);
        this.f22212d = J13 != null ? J13.intValue() : -1;
        if (numbers.length <= 3) {
            list = K.f71697a;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(Ek.a.d(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            list = C7714v.U0(C7705l.f(numbers).subList(3, numbers.length));
        }
        this.f22213e = list;
    }

    public final int a() {
        return this.f22210b;
    }

    public final int b() {
        return this.f22211c;
    }

    public final boolean c(int i11, int i12, int i13) {
        int i14 = this.f22210b;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        int i15 = this.f22211c;
        if (i15 > i12) {
            return true;
        }
        return i15 >= i12 && this.f22212d >= i13;
    }

    public final boolean d(@NotNull Rd.e version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return c(version.f22210b, version.f22211c, version.f22212d);
    }

    public final boolean e() {
        int i11 = this.f22210b;
        if (i11 >= 1) {
            if (i11 > 1) {
                return false;
            }
            int i12 = this.f22211c;
            if (i12 >= 4 && (i12 > 4 || this.f22212d > 1)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22210b == aVar.f22210b && this.f22211c == aVar.f22211c && this.f22212d == aVar.f22212d && Intrinsics.d(this.f22213e, aVar.f22213e);
    }

    protected final boolean f(@NotNull C3680a ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i11 = this.f22211c;
        int i12 = this.f22210b;
        return i12 == 0 ? ourVersion.f22210b == 0 && i11 == ourVersion.f22211c : i12 == ourVersion.f22210b && i11 <= ourVersion.f22211c;
    }

    public final int hashCode() {
        int i11 = this.f22210b;
        int i12 = (i11 * 31) + this.f22211c + i11;
        int i13 = (i12 * 31) + this.f22212d + i12;
        return this.f22213e.hashCode() + (i13 * 31) + i13;
    }

    @NotNull
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i11 : this.f22209a) {
            if (i11 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList.isEmpty() ? "unknown" : C7714v.V(arrayList, ".", null, null, null, 62);
    }
}
