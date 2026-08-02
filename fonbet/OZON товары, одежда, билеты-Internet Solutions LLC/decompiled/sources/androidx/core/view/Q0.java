package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final e f42241a;

    /* loaded from: classes8.dex */
    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        protected final Window f42242a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private final I f42243b;

        a(@NonNull Window window, @NonNull I i11) {
            this.f42242a = window;
            this.f42243b = i11;
        }

        @Override // androidx.core.view.Q0.e
        final void a(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    if (i12 == 1) {
                        h(4);
                    } else if (i12 == 2) {
                        h(2);
                    } else if (i12 == 8) {
                        this.f42243b.a();
                    }
                }
            }
        }

        @Override // androidx.core.view.Q0.e
        final void f() {
            i(2048);
            h(4096);
        }

        @Override // androidx.core.view.Q0.e
        final void g(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    if (i12 == 1) {
                        i(4);
                        this.f42242a.clearFlags(UserVerificationMethods.USER_VERIFY_ALL);
                    } else if (i12 == 2) {
                        i(2);
                    } else if (i12 == 8) {
                        this.f42243b.b();
                    }
                }
            }
        }

        protected final void h(int i11) {
            View decorView = this.f42242a.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        protected final void i(int i11) {
            View decorView = this.f42242a.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }
    }

    /* loaded from: classes8.dex */
    private static class b extends a {
        @Override // androidx.core.view.Q0.e
        public final boolean c() {
            return (this.f42242a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.Q0.e
        public final void e(boolean z11) {
            if (!z11) {
                i(8192);
                return;
            }
            Window window = this.f42242a;
            window.clearFlags(67108864);
            window.addFlags(LinearLayoutManager.INVALID_OFFSET);
            h(8192);
        }
    }

    /* loaded from: classes8.dex */
    private static class c extends b {
        c(@NonNull Window window, @NonNull I i11) {
            super(window, i11);
        }

        @Override // androidx.core.view.Q0.e
        public final boolean b() {
            return (this.f42242a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.Q0.e
        public final void d(boolean z11) {
            if (!z11) {
                i(16);
                return;
            }
            Window window = this.f42242a;
            window.clearFlags(134217728);
            window.addFlags(LinearLayoutManager.INVALID_OFFSET);
            h(16);
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final WindowInsetsController f42244a;

        /* renamed from: b, reason: collision with root package name */
        final I f42245b;

        /* renamed from: c, reason: collision with root package name */
        protected Window f42246c;

        d(@NonNull Window window, @NonNull I i11) {
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            new androidx.collection.Z();
            this.f42244a = insetsController;
            this.f42245b = i11;
            this.f42246c = window;
        }

        @Override // androidx.core.view.Q0.e
        final void a(int i11) {
            if ((i11 & 8) != 0) {
                this.f42245b.a();
            }
            this.f42244a.hide(i11 & (-9));
        }

        @Override // androidx.core.view.Q0.e
        public final boolean b() {
            int systemBarsAppearance;
            this.f42244a.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.f42244a.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // androidx.core.view.Q0.e
        public final boolean c() {
            int systemBarsAppearance;
            this.f42244a.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.f42244a.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // androidx.core.view.Q0.e
        public final void d(boolean z11) {
            Window window = this.f42246c;
            if (z11) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                this.f42244a.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            this.f42244a.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.Q0.e
        public final void e(boolean z11) {
            Window window = this.f42246c;
            if (z11) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                this.f42244a.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            this.f42244a.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.Q0.e
        final void f() {
            this.f42244a.setSystemBarsBehavior(2);
        }

        @Override // androidx.core.view.Q0.e
        final void g(int i11) {
            if ((i11 & 8) != 0) {
                this.f42245b.b();
            }
            this.f42244a.show(i11 & (-9));
        }
    }

    private static class e {
        void a(int i11) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public boolean c() {
            throw null;
        }

        public void d(boolean z11) {
            throw null;
        }

        public void e(boolean z11) {
            throw null;
        }

        void f() {
            throw null;
        }

        void g(int i11) {
            throw null;
        }
    }

    public Q0(@NonNull View view, @NonNull Window window) {
        I i11 = new I(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f42241a = new d(window, i11);
        } else {
            this.f42241a = new c(window, i11);
        }
    }

    public final void a(int i11) {
        this.f42241a.a(i11);
    }

    public final boolean b() {
        return this.f42241a.b();
    }

    public final boolean c() {
        return this.f42241a.c();
    }

    public final void d(boolean z11) {
        this.f42241a.d(z11);
    }

    public final void e(boolean z11) {
        this.f42241a.e(z11);
    }

    public final void f() {
        this.f42241a.f();
    }

    public final void g(int i11) {
        this.f42241a.g(i11);
    }
}
