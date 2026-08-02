package P1;

import S0.A1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface Z extends A1<Object> {

    /* loaded from: classes8.dex */
    public static final class a implements Z, A1<Object> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C3804k f21537a;

        public a(@NotNull C3804k c3804k) {
            this.f21537a = c3804k;
        }

        @Override // P1.Z
        public final boolean c() {
            return this.f21537a.k();
        }

        @Override // S0.A1
        @NotNull
        public final Object getValue() {
            return this.f21537a.getValue();
        }
    }

    public static final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f21538a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f21539b;

        public b(@NotNull Object obj, boolean z11) {
            this.f21538a = obj;
            this.f21539b = z11;
        }

        @Override // P1.Z
        public final boolean c() {
            return this.f21539b;
        }

        @Override // S0.A1
        @NotNull
        public final Object getValue() {
            return this.f21538a;
        }
    }

    boolean c();
}
