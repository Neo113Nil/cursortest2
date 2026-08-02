package I0;

import java.util.ArrayList;
import java.util.Comparator;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3200o0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f11566a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11567b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final B1.B f11568c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11569d;

    /* renamed from: e, reason: collision with root package name */
    private final C3220z f11570e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3219y0 f11571f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.collection.E f11572g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f11573h;

    /* renamed from: i, reason: collision with root package name */
    private int f11574i;

    /* renamed from: j, reason: collision with root package name */
    private int f11575j;

    /* renamed from: k, reason: collision with root package name */
    private int f11576k;

    /* renamed from: I0.o0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11577a;

        static {
            int[] iArr = new int[EnumC3197n.values().length];
            try {
                iArr[EnumC3197n.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3197n.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3197n.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11577a = iArr;
        }
    }

    public C3200o0(long j11, long j12, B1.B b11, boolean z11, C3220z c3220z, C3219y0 c3219y0) {
        this.f11566a = j11;
        this.f11567b = j12;
        this.f11568c = b11;
        this.f11569d = z11;
        this.f11570e = c3220z;
        this.f11571f = c3219y0;
        int i11 = androidx.collection.r.f38735a;
        this.f11572g = new androidx.collection.E(6);
        this.f11573h = new ArrayList();
        this.f11574i = -1;
        this.f11575j = -1;
        this.f11576k = -1;
    }

    private final int i(int i11, EnumC3197n enumC3197n, EnumC3197n enumC3197n2) {
        if (i11 == -1) {
            int i12 = a.f11577a[C3202p0.d(enumC3197n, enumC3197n2).ordinal()];
            if (i12 == 1) {
                return this.f11576k - 1;
            }
            if (i12 == 2) {
                return this.f11576k;
            }
            if (i12 != 3) {
                throw new Sc.o();
            }
        }
        return i11;
    }

    @NotNull
    public final void a(long j11, int i11, @NotNull EnumC3197n enumC3197n, @NotNull EnumC3197n enumC3197n2, int i12, @NotNull EnumC3197n enumC3197n3, @NotNull EnumC3197n enumC3197n4, int i13, @NotNull K1.K k11) {
        int i14 = this.f11576k + 2;
        this.f11576k = i14;
        C3218y c3218y = new C3218y(j11, i14, i11, i12, i13, k11);
        this.f11574i = i(this.f11574i, enumC3197n, enumC3197n2);
        this.f11575j = i(this.f11575j, enumC3197n3, enumC3197n4);
        ArrayList arrayList = this.f11573h;
        this.f11572g.d(arrayList.size(), j11);
        arrayList.add(c3218y);
    }

    @NotNull
    public final InterfaceC3198n0 b() {
        int i11 = this.f11576k + 1;
        ArrayList arrayList = this.f11573h;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("SelectionLayout must not be empty.");
        }
        if (size != 1) {
            int i12 = this.f11574i;
            int i13 = i12 == -1 ? i11 : i12;
            int i14 = this.f11575j;
            return new C3206s(this.f11572g, arrayList, i13, i14 == -1 ? i11 : i14, this.f11569d, this.f11570e);
        }
        C3218y c3218y = (C3218y) C7714v.B0(arrayList);
        int i15 = this.f11574i;
        int i16 = i15 == -1 ? i11 : i15;
        int i17 = this.f11575j;
        return new S0(this.f11569d, i16, i17 == -1 ? i11 : i17, this.f11570e, c3218y);
    }

    @NotNull
    public final B1.B c() {
        return this.f11568c;
    }

    public final long d() {
        return this.f11566a;
    }

    public final long e() {
        return this.f11567b;
    }

    public final C3220z f() {
        return this.f11570e;
    }

    @NotNull
    public final Comparator<Long> g() {
        return this.f11571f;
    }

    public final boolean h() {
        return this.f11569d;
    }
}
