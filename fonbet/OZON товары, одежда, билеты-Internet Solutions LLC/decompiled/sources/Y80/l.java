package Y80;

import B4.C2584m;
import android.app.Activity;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B;
import java.util.List;
import java.util.Map;
import kotlin.collections.K;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface l {

    /* renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final a f34852b0 = a.f34853a;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f34853a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final C0641a f34854b = new C0641a();

        /* renamed from: Y80.l$a$a, reason: collision with other inner class name */
        public static final class C0641a implements l {

            /* renamed from: a, reason: collision with root package name */
            private final K f34855a = K.f71697a;

            C0641a() {
            }

            @Override // Y80.l
            public final void b() {
            }

            @Override // Y80.l
            public final Activity c() {
                return null;
            }

            @Override // Y80.l
            public final Map<Integer, List<ComponentCallbacksC5392m>> d() {
                return U.c();
            }

            @Override // Y80.l
            public final Integer e() {
                return null;
            }

            @Override // Y80.l
            public final B f() {
                return null;
            }

            @Override // Y80.l
            /* renamed from: g */
            public final int getF72988Q() {
                return 0;
            }

            @Override // Y80.l
            public final AbstractC5434v m() {
                return null;
            }

            @Override // Y80.l
            public final G n() {
                return null;
            }

            @Override // Y80.l
            /* renamed from: o */
            public final Integer getF72990S() {
                return null;
            }

            @Override // Y80.l
            public final List<Integer> q() {
                return this.f34855a;
            }

            @Override // Y80.l
            public final com.google.android.material.bottomnavigation.c t() {
                return null;
            }

            @Override // Y80.l
            public final G v() {
                return null;
            }

            @Override // Y80.l
            /* renamed from: x */
            public final C2584m getF72996o() {
                return null;
            }

            @Override // Y80.l
            /* renamed from: y */
            public final k getF72987P() {
                return null;
            }
        }

        @NotNull
        public static C0641a a() {
            return f34854b;
        }
    }

    void b();

    Activity c();

    @NotNull
    Map<Integer, List<ComponentCallbacksC5392m>> d();

    Integer e();

    B f();

    /* renamed from: g */
    int getF72988Q();

    AbstractC5434v m();

    G n();

    /* renamed from: o */
    Integer getF72990S();

    @NotNull
    List<Integer> q();

    com.google.android.material.bottomnavigation.c t();

    G v();

    /* renamed from: x */
    C2584m getF72996o();

    /* renamed from: y */
    k getF72987P();
}
