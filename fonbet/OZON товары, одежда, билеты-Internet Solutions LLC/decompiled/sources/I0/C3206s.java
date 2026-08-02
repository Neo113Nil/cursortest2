package I0;

import androidx.collection.AbstractC5148q;
import androidx.collection.C5150t;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3206s implements InterfaceC3198n0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC5148q f11593a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f11594b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11595c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11596d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11597e;

    /* renamed from: f, reason: collision with root package name */
    private final C3220z f11598f;

    /* renamed from: I0.s$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11599a;

        static {
            int[] iArr = new int[EnumC3195m.values().length];
            try {
                iArr[EnumC3195m.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3195m.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3195m.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11599a = iArr;
        }
    }

    public C3206s(@NotNull AbstractC5148q abstractC5148q, @NotNull ArrayList arrayList, int i11, int i12, boolean z11, C3220z c3220z) {
        this.f11593a = abstractC5148q;
        this.f11594b = arrayList;
        this.f11595c = i11;
        this.f11596d = i12;
        this.f11597e = z11;
        this.f11598f = c3220z;
        if (arrayList.size() > 1) {
            return;
        }
        throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList.size() + '.').toString());
    }

    public static final /* synthetic */ void m(C3206s c3206s, androidx.collection.F f7, C3220z c3220z, C3218y c3218y, int i11) {
        c3206s.getClass();
        n(f7, c3220z, c3218y, 0, i11);
    }

    private static void n(androidx.collection.F f7, C3220z c3220z, C3218y c3218y, int i11, int i12) {
        C3220z c3220z2;
        if (c3220z.c()) {
            c3220z2 = new C3220z(c3218y.a(i12), c3218y.a(i11), i12 > i11);
        } else {
            c3220z2 = new C3220z(c3218y.a(i11), c3218y.a(i12), i11 > i12);
        }
        if (i11 <= i12) {
            f7.h(c3218y.g(), c3220z2);
        } else {
            throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + c3220z2).toString());
        }
    }

    private final int o(long j11) {
        try {
            return this.f11593a.a(j11);
        } catch (NoSuchElementException e11) {
            throw new IllegalStateException(C3173b.b(j11, "Invalid selectableId: "), e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int p(int i11, boolean z11) {
        int i12 = a.f11599a[c().ordinal()];
        int i13 = z11;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new Sc.o();
                }
                if (z11 != 0) {
                    i13 = 0;
                }
            }
            return (i11 - (i13 ^ 1)) / 2;
        }
        i13 = 1;
        return (i11 - (i13 ^ 1)) / 2;
    }

    @Override // I0.InterfaceC3198n0
    public final boolean a() {
        return this.f11597e;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final C3218y b() {
        return this.f11597e ? g() : f();
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final EnumC3195m c() {
        int i11 = this.f11595c;
        int i12 = this.f11596d;
        if (i11 < i12) {
            return EnumC3195m.NOT_CROSSED;
        }
        if (i11 > i12) {
            return EnumC3195m.CROSSED;
        }
        return ((C3218y) this.f11594b.get(i11 / 2)).c();
    }

    @Override // I0.InterfaceC3198n0
    public final boolean d(InterfaceC3198n0 interfaceC3198n0) {
        if (this.f11598f == null || interfaceC3198n0 == null || !(interfaceC3198n0 instanceof C3206s)) {
            return true;
        }
        C3206s c3206s = (C3206s) interfaceC3198n0;
        if (this.f11597e != c3206s.f11597e || this.f11595c != c3206s.f11595c || this.f11596d != c3206s.f11596d) {
            return true;
        }
        ArrayList arrayList = this.f11594b;
        int size = arrayList.size();
        ArrayList arrayList2 = c3206s.f11594b;
        if (size != arrayList2.size()) {
            return true;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((C3218y) arrayList.get(i11)).j((C3218y) arrayList2.get(i11))) {
                return true;
            }
        }
        return false;
    }

    @Override // I0.InterfaceC3198n0
    public final C3220z e() {
        return this.f11598f;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final C3218y f() {
        return (C3218y) this.f11594b.get(p(this.f11596d, false));
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final C3218y g() {
        return (C3218y) this.f11594b.get(p(this.f11595c, true));
    }

    @Override // I0.InterfaceC3198n0
    public final int getSize() {
        return this.f11594b.size();
    }

    @Override // I0.InterfaceC3198n0
    public final int h() {
        return this.f11595c;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final androidx.collection.F i(@NotNull C3220z c3220z) {
        if (c3220z.d().d() != c3220z.b().d()) {
            int i11 = C5150t.f38742b;
            androidx.collection.F f7 = new androidx.collection.F((Object) null);
            n(f7, c3220z, j(), (c3220z.c() ? c3220z.b() : c3220z.d()).c(), j().b().length());
            l(new C3208t(this, f7, c3220z));
            n(f7, c3220z, c() == EnumC3195m.CROSSED ? g() : f(), 0, (c3220z.c() ? c3220z.d() : c3220z.b()).c());
            return f7;
        }
        if ((!c3220z.c() || c3220z.d().c() < c3220z.b().c()) && (c3220z.c() || c3220z.d().c() > c3220z.b().c())) {
            throw new IllegalStateException(("unexpectedly miss-crossed selection: " + c3220z).toString());
        }
        long d11 = c3220z.d().d();
        int i12 = C5150t.f38742b;
        androidx.collection.F f11 = new androidx.collection.F((Object) null);
        f11.j(d11, c3220z);
        return f11;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final C3218y j() {
        return c() == EnumC3195m.CROSSED ? f() : g();
    }

    @Override // I0.InterfaceC3198n0
    public final int k() {
        return this.f11596d;
    }

    @Override // I0.InterfaceC3198n0
    public final void l(@NotNull Function1<? super C3218y, Unit> function1) {
        int o11 = o(j().g());
        int o12 = o((c() == EnumC3195m.CROSSED ? g() : f()).g());
        int i11 = o11 + 1;
        if (i11 >= o12) {
            return;
        }
        while (i11 < o12) {
            function1.invoke(this.f11594b.get(i11));
            i11++;
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(this.f11597e);
        sb2.append(", startPosition=");
        boolean z11 = true;
        float f7 = 2;
        sb2.append((this.f11595c + 1) / f7);
        sb2.append(", endPosition=");
        sb2.append((this.f11596d + 1) / f7);
        sb2.append(", crossed=");
        sb2.append(c());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder("[\n\t");
        ArrayList arrayList = this.f11594b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            C3218y c3218y = (C3218y) arrayList.get(i11);
            if (z11) {
                z11 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i11++;
            sb4.append(i11);
            sb4.append(" -> ");
            sb4.append(c3218y);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        String sb5 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb5);
        sb2.append(')');
        return sb2.toString();
    }
}
