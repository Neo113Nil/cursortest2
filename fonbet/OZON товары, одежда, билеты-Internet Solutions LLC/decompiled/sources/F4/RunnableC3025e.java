package F4;

import androidx.recyclerview.widget.i;
import java.util.Collection;
import kd.C7665d;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F4.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class RunnableC3025e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F<Object> f8869a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F<Object> f8870b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3021a<Object> f8871c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f8872d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ F<Object> f8873e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ S f8874f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Ui.n f8875g;

    /* renamed from: F4.e$a */
    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3021a<Object> f8876a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8877b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ F<Object> f8878c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F<Object> f8879d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z f8880e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S f8881f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ F<Object> f8882g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ui.n f8883h;

        a(C3021a c3021a, int i11, F f7, F f11, z zVar, S s11, F f12, Ui.n nVar) {
            this.f8876a = c3021a;
            this.f8877b = i11;
            this.f8878c = f7;
            this.f8879d = f11;
            this.f8880e = zVar;
            this.f8881f = s11;
            this.f8882g = f12;
            this.f8883h = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f8876a.g() == this.f8877b) {
                int s11 = this.f8882g.s();
                Ui.n nVar = this.f8883h;
                this.f8876a.i(this.f8878c, this.f8879d, this.f8880e, this.f8881f, s11, nVar);
            }
        }
    }

    RunnableC3025e(F f7, F f11, C3021a c3021a, int i11, F f12, S s11, Ui.n nVar) {
        this.f8869a = f7;
        this.f8870b = f11;
        this.f8871c = c3021a;
        this.f8872d = i11;
        this.f8873e = f12;
        this.f8874f = s11;
        this.f8875g = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K l11 = this.f8869a.l();
        F<Object> f7 = this.f8870b;
        K newList = f7.l();
        C3021a<Object> c3021a = this.f8871c;
        i.d<Object> diffCallback = c3021a.b().b();
        Intrinsics.checkNotNullExpressionValue(diffCallback, "config.diffCallback");
        Intrinsics.checkNotNullParameter(l11, "<this>");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        A a11 = new A(l11, newList, diffCallback, l11.n(), newList.n());
        boolean z11 = true;
        i.c a12 = androidx.recyclerview.widget.i.a(a11, true);
        Intrinsics.checkNotNullExpressionValue(a12, "NullPaddedList<T>.comput…    },\n        true\n    )");
        Iterable o11 = kotlin.ranges.h.o(0, l11.n());
        if (!(o11 instanceof Collection) || !((Collection) o11).isEmpty()) {
            C7665d it = o11.iterator();
            while (it.hasNext()) {
                if (a12.a(it.b()) != -1) {
                    break;
                }
            }
        }
        z11 = false;
        z zVar = new z(a12, z11);
        c3021a.f().execute(new a(this.f8871c, this.f8872d, this.f8873e, f7, zVar, this.f8874f, this.f8869a, this.f8875g));
    }
}
