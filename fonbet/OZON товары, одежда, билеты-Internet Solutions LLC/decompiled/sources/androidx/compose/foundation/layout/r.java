package androidx.compose.foundation.layout;

import B1.m0;
import androidx.compose.foundation.layout.AbstractC5178a;
import e1.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f39536a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends r {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AbstractC5178a.C0728a f39537b;

        public a(@NotNull AbstractC5178a.C0728a c0728a) {
            super(0);
            this.f39537b = c0728a;
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i11, @NotNull Z1.s sVar, @NotNull m0 m0Var, int i12) {
            int a11 = this.f39537b.a(m0Var);
            if (a11 == Integer.MIN_VALUE) {
                return 0;
            }
            int i13 = i12 - a11;
            return sVar == Z1.s.Rtl ? i11 - i13 : i13;
        }

        @Override // androidx.compose.foundation.layout.r
        @NotNull
        public final Integer b(@NotNull m0 m0Var) {
            return Integer.valueOf(this.f39537b.a(m0Var));
        }
    }

    private static final class b extends r {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f39538b = 0;

        static {
            new b(0);
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i11, @NotNull Z1.s sVar, @NotNull m0 m0Var, int i12) {
            return i11 / 2;
        }
    }

    private static final class c extends r {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f39539b = 0;

        static {
            new c(0);
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i11, @NotNull Z1.s sVar, @NotNull m0 m0Var, int i12) {
            if (sVar == Z1.s.Ltr) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    static final class d extends r {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final d.a f39540b;

        public d(@NotNull d.a aVar) {
            super(0);
            this.f39540b = aVar;
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i11, @NotNull Z1.s sVar, @NotNull m0 m0Var, int i12) {
            return this.f39540b.a(0, i11, sVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f39540b, ((d) obj).f39540b);
        }

        public final int hashCode() {
            return this.f39540b.hashCode();
        }

        @NotNull
        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f39540b + ')';
        }
    }

    private static final class e extends r {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f39541b = 0;

        static {
            new e(0);
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i11, @NotNull Z1.s sVar, @NotNull m0 m0Var, int i12) {
            if (sVar == Z1.s.Ltr) {
                return 0;
            }
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f extends r {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final d.b f39542b;

        public f(@NotNull d.b bVar) {
            super(0);
            this.f39542b = bVar;
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i11, @NotNull Z1.s sVar, @NotNull m0 m0Var, int i12) {
            return this.f39542b.a(0, i11);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.d(this.f39542b, ((f) obj).f39542b);
        }

        public final int hashCode() {
            return this.f39542b.hashCode();
        }

        @NotNull
        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f39542b + ')';
        }
    }

    static {
        int i11 = b.f39538b;
        int i12 = e.f39541b;
        int i13 = c.f39539b;
    }

    public r(int i11) {
    }

    public abstract int a(int i11, @NotNull Z1.s sVar, @NotNull m0 m0Var, int i12);

    public Integer b(@NotNull m0 m0Var) {
        return null;
    }
}
