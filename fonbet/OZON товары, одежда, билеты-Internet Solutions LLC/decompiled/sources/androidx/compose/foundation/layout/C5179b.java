package androidx.compose.foundation.layout;

import Kk.C3532b;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.foundation.layout.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5179b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final j f39447a = new j();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final d f39448b = new d();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final k f39449c = new k();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C0731b f39450d = new C0731b();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final c f39451e = new c();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final h f39452f = new h();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final g f39453g = new g();

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f39454h = 0;

    /* renamed from: androidx.compose.foundation.layout.b$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0729a f39455a = new C0729a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final C0730b f39456b = new C0730b();

        /* renamed from: androidx.compose.foundation.layout.b$a$a, reason: collision with other inner class name */
        public static final class C0729a implements e {
            @Override // androidx.compose.foundation.layout.C5179b.e
            public final void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2) {
                C5179b.i(iArr, iArr2, false);
            }

            @NotNull
            public final String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* renamed from: androidx.compose.foundation.layout.b$a$b, reason: collision with other inner class name */
        public static final class C0730b implements e {
            @Override // androidx.compose.foundation.layout.C5179b.e
            public final void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2) {
                C5179b.j(i11, iArr, iArr2, false);
            }

            @NotNull
            public final String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        @NotNull
        public static C0729a a() {
            return f39455a;
        }

        @NotNull
        public static C0730b b() {
            return f39456b;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$b, reason: collision with other inner class name */
    public static final class C0731b implements l {
        @Override // androidx.compose.foundation.layout.C5179b.l
        public final void b(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2) {
            C5179b.j(i11, iArr, iArr2, false);
        }

        @NotNull
        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$c */
    public static final class c implements e, l {

        /* renamed from: a, reason: collision with root package name */
        private final float f39457a = 0;

        c() {
        }

        @Override // androidx.compose.foundation.layout.C5179b.e, androidx.compose.foundation.layout.C5179b.l
        public final float a() {
            return this.f39457a;
        }

        @Override // androidx.compose.foundation.layout.C5179b.l
        public final void b(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2) {
            C5179b.h(i11, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C5179b.e
        public final void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2) {
            if (sVar == Z1.s.Ltr) {
                C5179b.h(i11, iArr, iArr2, false);
            } else {
                C5179b.h(i11, iArr, iArr2, true);
            }
        }

        @NotNull
        public final String toString() {
            return "Arrangement#Center";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$d */
    public static final class d implements e {
        @Override // androidx.compose.foundation.layout.C5179b.e
        public final void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2) {
            if (sVar == Z1.s.Ltr) {
                C5179b.j(i11, iArr, iArr2, false);
            } else {
                C5179b.i(iArr, iArr2, true);
            }
        }

        @NotNull
        public final String toString() {
            return "Arrangement#End";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$e */
    public interface e {
        default float a() {
            return 0;
        }

        void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2);
    }

    /* renamed from: androidx.compose.foundation.layout.b$f */
    public static final class f implements e, l {

        /* renamed from: a, reason: collision with root package name */
        private final float f39458a = 0;

        f() {
        }

        @Override // androidx.compose.foundation.layout.C5179b.e, androidx.compose.foundation.layout.C5179b.l
        public final float a() {
            return this.f39458a;
        }

        @Override // androidx.compose.foundation.layout.C5179b.l
        public final void b(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2) {
            C5179b.k(i11, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C5179b.e
        public final void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2) {
            if (sVar == Z1.s.Ltr) {
                C5179b.k(i11, iArr, iArr2, false);
            } else {
                C5179b.k(i11, iArr, iArr2, true);
            }
        }

        @NotNull
        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$g */
    public static final class g implements e, l {

        /* renamed from: a, reason: collision with root package name */
        private final float f39459a = 0;

        g() {
        }

        @Override // androidx.compose.foundation.layout.C5179b.e, androidx.compose.foundation.layout.C5179b.l
        public final float a() {
            return this.f39459a;
        }

        @Override // androidx.compose.foundation.layout.C5179b.l
        public final void b(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2) {
            C5179b.l(i11, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C5179b.e
        public final void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2) {
            if (sVar == Z1.s.Ltr) {
                C5179b.l(i11, iArr, iArr2, false);
            } else {
                C5179b.l(i11, iArr, iArr2, true);
            }
        }

        @NotNull
        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$h */
    public static final class h implements e, l {

        /* renamed from: a, reason: collision with root package name */
        private final float f39460a = 0;

        h() {
        }

        @Override // androidx.compose.foundation.layout.C5179b.e, androidx.compose.foundation.layout.C5179b.l
        public final float a() {
            return this.f39460a;
        }

        @Override // androidx.compose.foundation.layout.C5179b.l
        public final void b(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2) {
            C5179b.m(i11, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C5179b.e
        public final void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2) {
            if (sVar == Z1.s.Ltr) {
                C5179b.m(i11, iArr, iArr2, false);
            } else {
                C5179b.m(i11, iArr, iArr2, true);
            }
        }

        @NotNull
        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$i */
    public static final class i implements e, l {

        /* renamed from: a, reason: collision with root package name */
        private final float f39461a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f39462b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC7737t f39463c;

        /* renamed from: d, reason: collision with root package name */
        private final float f39464d;

        private i() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(float f7, boolean z11, Function2 function2) {
            this.f39461a = f7;
            this.f39462b = z11;
            this.f39463c = (AbstractC7737t) function2;
            this.f39464d = f7;
        }

        @Override // androidx.compose.foundation.layout.C5179b.e, androidx.compose.foundation.layout.C5179b.l
        public final float a() {
            return this.f39464d;
        }

        @Override // androidx.compose.foundation.layout.C5179b.l
        public final void b(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2) {
            c(y11, i11, iArr, Z1.s.Ltr, iArr2);
        }

        /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
        @Override // androidx.compose.foundation.layout.C5179b.e
        public final void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2) {
            int i12;
            int i13;
            if (iArr.length == 0) {
                return;
            }
            int Y02 = dVar.Y0(this.f39461a);
            boolean z11 = this.f39462b && sVar == Z1.s.Rtl;
            int i14 = C5179b.f39454h;
            if (z11) {
                int length = iArr.length - 1;
                i12 = 0;
                i13 = 0;
                while (-1 < length) {
                    int i15 = iArr[length];
                    int min = Math.min(i12, i11 - i15);
                    iArr2[length] = min;
                    int min2 = Math.min(Y02, (i11 - min) - i15);
                    int i16 = iArr2[length] + i15 + min2;
                    length--;
                    i13 = min2;
                    i12 = i16;
                }
            } else {
                int length2 = iArr.length;
                int i17 = 0;
                i12 = 0;
                i13 = 0;
                int i18 = 0;
                while (i17 < length2) {
                    int i19 = iArr[i17];
                    int min3 = Math.min(i12, i11 - i19);
                    iArr2[i18] = min3;
                    int min4 = Math.min(Y02, (i11 - min3) - i19);
                    int i21 = iArr2[i18] + i19 + min4;
                    i17++;
                    i13 = min4;
                    i12 = i21;
                    i18++;
                }
            }
            int i22 = i12 - i13;
            ?? r11 = this.f39463c;
            if (r11 == 0 || i22 >= i11) {
                return;
            }
            int intValue = ((Number) r11.invoke(Integer.valueOf(i11 - i22), sVar)).intValue();
            int length3 = iArr2.length;
            for (int i23 = 0; i23 < length3; i23++) {
                iArr2[i23] = iArr2[i23] + intValue;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Z1.h.b(this.f39461a, iVar.f39461a) && this.f39462b == iVar.f39462b && Intrinsics.d(this.f39463c, iVar.f39463c);
        }

        public final int hashCode() {
            int a11 = C3532b.a(Float.hashCode(this.f39461a) * 31, 31, this.f39462b);
            AbstractC7737t abstractC7737t = this.f39463c;
            return a11 + (abstractC7737t == null ? 0 : abstractC7737t.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f39462b ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) Z1.h.c(this.f39461a));
            sb2.append(", ");
            sb2.append(this.f39463c);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$j */
    public static final class j implements e {
        @Override // androidx.compose.foundation.layout.C5179b.e
        public final void c(@NotNull Z1.d dVar, int i11, @NotNull int[] iArr, @NotNull Z1.s sVar, @NotNull int[] iArr2) {
            if (sVar == Z1.s.Ltr) {
                C5179b.i(iArr, iArr2, false);
            } else {
                C5179b.j(i11, iArr, iArr2, true);
            }
        }

        @NotNull
        public final String toString() {
            return "Arrangement#Start";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$k */
    public static final class k implements l {
        @Override // androidx.compose.foundation.layout.C5179b.l
        public final void b(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2) {
            C5179b.i(iArr, iArr2, false);
        }

        @NotNull
        public final String toString() {
            return "Arrangement#Top";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$l */
    public interface l {
        default float a() {
            return 0;
        }

        void b(int i11, @NotNull B1.Y y11, @NotNull int[] iArr, @NotNull int[] iArr2);
    }

    static {
        new f();
    }

    @NotNull
    public static C0731b a() {
        return f39450d;
    }

    @NotNull
    public static c b() {
        return f39451e;
    }

    @NotNull
    public static d c() {
        return f39448b;
    }

    @NotNull
    public static g d() {
        return f39453g;
    }

    @NotNull
    public static h e() {
        return f39452f;
    }

    @NotNull
    public static j f() {
        return f39447a;
    }

    @NotNull
    public static k g() {
        return f39449c;
    }

    public static void h(int i11, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float f7 = (i11 - i13) / 2;
        if (!z11) {
            int length = iArr.length;
            int i15 = 0;
            while (i12 < length) {
                int i16 = iArr[i12];
                iArr2[i15] = Math.round(f7);
                f7 += i16;
                i12++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = Math.round(f7);
            f7 += i17;
        }
    }

    public static void i(@NotNull int[] iArr, @NotNull int[] iArr2, boolean z11) {
        int i11 = 0;
        if (!z11) {
            int length = iArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int i14 = iArr[i11];
                iArr2[i12] = i13;
                i13 += i14;
                i11++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = iArr[length2];
            iArr2[length2] = i11;
            i11 += i15;
        }
    }

    public static void j(int i11, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        int i15 = i11 - i13;
        if (!z11) {
            int length = iArr.length;
            int i16 = 0;
            while (i12 < length) {
                int i17 = iArr[i12];
                iArr2[i16] = i15;
                i15 += i17;
                i12++;
                i16++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i18 = iArr[length2];
            iArr2[length2] = i15;
            i15 += i18;
        }
    }

    public static void k(int i11, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float length = iArr.length == 0 ? 0.0f : (i11 - i13) / iArr.length;
        float f7 = length / 2;
        if (!z11) {
            int length2 = iArr.length;
            int i15 = 0;
            while (i12 < length2) {
                int i16 = iArr[i12];
                iArr2[i15] = Math.round(f7);
                f7 += i16 + length;
                i12++;
                i15++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i17 = iArr[length3];
            iArr2[length3] = Math.round(f7);
            f7 += i17 + length;
        }
    }

    public static void l(int i11, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z11) {
        if (iArr.length == 0) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        float max = (i11 - i13) / Math.max(iArr.length - 1, 1);
        float f7 = (z11 && iArr.length == 1) ? max : 0.0f;
        if (z11) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i15 = iArr[length];
                iArr2[length] = Math.round(f7);
                f7 += i15 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i16 = 0;
        while (i12 < length2) {
            int i17 = iArr[i12];
            iArr2[i16] = Math.round(f7);
            f7 += i17 + max;
            i12++;
            i16++;
        }
    }

    public static void m(int i11, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float length = (i11 - i13) / (iArr.length + 1);
        if (z11) {
            float f7 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i15 = iArr[length2];
                iArr2[length2] = Math.round(f7);
                f7 += i15 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i16 = 0;
        while (i12 < length3) {
            int i17 = iArr[i12];
            iArr2[i16] = Math.round(f11);
            f11 += i17 + length;
            i12++;
            i16++;
        }
    }

    @NotNull
    public static i n(float f7) {
        return new i(f7, true, C5180c.f39471b);
    }

    @NotNull
    public static i o(float f7, @NotNull InterfaceC6250b.InterfaceC0966b interfaceC0966b) {
        return new i(f7, true, new C5181d(interfaceC0966b));
    }
}
