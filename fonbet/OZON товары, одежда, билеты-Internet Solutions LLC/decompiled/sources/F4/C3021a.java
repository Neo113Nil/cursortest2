package F4;

import F4.F;
import F4.x;
import Sc.InterfaceC3999a;
import androidx.recyclerview.widget.C5468b;
import androidx.recyclerview.widget.C5469c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n.C8358c;
import n.ExecutorC8356a;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* renamed from: F4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3021a<T> {

    /* renamed from: a, reason: collision with root package name */
    public C5468b f8855a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5469c<T> f8856b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private ExecutorC8356a f8857c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<b<T>> f8858d;

    /* renamed from: e, reason: collision with root package name */
    private F<T> f8859e;

    /* renamed from: f, reason: collision with root package name */
    private F<T> f8860f;

    /* renamed from: g, reason: collision with root package name */
    private int f8861g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C3023c f8862h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.h<Unit> f8863i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList f8864j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C3024d f8865k;

    /* renamed from: F4.a$a, reason: collision with other inner class name */
    private static final class C0188a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function2<F<T>, F<T>, Unit> f8866a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0188a(@NotNull Function2<? super F<T>, ? super F<T>, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f8866a = callback;
        }

        @Override // F4.C3021a.b
        public final void a(F<T> f7, F<T> f11) {
            this.f8866a.invoke(f7, f11);
        }
    }

    @InterfaceC3999a
    /* renamed from: F4.a$b */
    public interface b<T> {
        void a(F<T> f7, F<T> f11);
    }

    @InterfaceC3999a
    public C3021a(@NotNull J adapter, @NotNull Vi.a diffCallback) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        ExecutorC8356a f7 = C8358c.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getMainThreadExecutor()");
        this.f8857c = f7;
        this.f8858d = new CopyOnWriteArrayList<>();
        C3023c c3023c = new C3023c(this);
        this.f8862h = c3023c;
        this.f8863i = new C3022b(2, c3023c, F.d.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
        this.f8864j = new CopyOnWriteArrayList();
        this.f8865k = new C3024d(this);
        C5468b c5468b = new C5468b(adapter);
        Intrinsics.checkNotNullParameter(c5468b, "<set-?>");
        this.f8855a = c5468b;
        C5469c<T> a11 = new C5469c.a(diffCallback).a();
        Intrinsics.checkNotNullExpressionValue(a11, "Builder(diffCallback).build()");
        this.f8856b = a11;
    }

    private final void j(F f7, F f11, Ui.n nVar) {
        Iterator<b<T>> it = this.f8858d.iterator();
        while (it.hasNext()) {
            it.next().a(f7, f11);
        }
        nVar.run();
    }

    public final void a(@NotNull Function2<? super F<T>, ? super F<T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8858d.add(new C0188a(callback));
    }

    @NotNull
    public final C5469c<T> b() {
        return this.f8856b;
    }

    public final F<T> c() {
        F<T> f7 = this.f8860f;
        return f7 == null ? this.f8859e : f7;
    }

    public final T d(int i11) {
        F<T> f7 = this.f8860f;
        F<T> f11 = this.f8859e;
        if (f7 != null) {
            return f7.get(i11);
        }
        if (f11 == null) {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        f11.t(i11);
        return f11.get(i11);
    }

    @NotNull
    public final CopyOnWriteArrayList e() {
        return this.f8864j;
    }

    @NotNull
    public final ExecutorC8356a f() {
        return this.f8857c;
    }

    public final int g() {
        return this.f8861g;
    }

    @NotNull
    public final androidx.recyclerview.widget.u h() {
        C5468b c5468b = this.f8855a;
        if (c5468b != null) {
            return c5468b;
        }
        Intrinsics.n("updateCallback");
        throw null;
    }

    public final void i(@NotNull F newList, @NotNull F diffSnapshot, @NotNull z diffResult, @NotNull S recordingCallback, int i11, Ui.n nVar) {
        int f7;
        int a11;
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffSnapshot, "diffSnapshot");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(recordingCallback, "recordingCallback");
        F<T> f11 = this.f8860f;
        if (f11 == null || this.f8859e != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.f8859e = newList;
        newList.c((Function2) this.f8863i);
        this.f8860f = null;
        K oldList = f11.l();
        androidx.recyclerview.widget.u callback = h();
        K newList2 = diffSnapshot.l();
        Intrinsics.checkNotNullParameter(oldList, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(newList2, "newList");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        if (diffResult.b()) {
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList2, "newList");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(diffResult, "diffResult");
            B b11 = new B(oldList, newList2, callback);
            diffResult.a().b(b11);
            b11.a();
        } else {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList2, "newList");
            int max = Math.max(oldList.k(), newList2.k());
            int min = Math.min(oldList.n() + oldList.k(), newList2.n() + newList2.k());
            int i12 = min - max;
            if (i12 > 0) {
                C5468b c5468b = (C5468b) callback;
                c5468b.onRemoved(max, i12);
                c5468b.onInserted(max, i12);
            }
            int min2 = Math.min(max, min);
            int max2 = Math.max(max, min);
            int k11 = oldList.k();
            int size = newList2.getSize();
            if (k11 > size) {
                k11 = size;
            }
            int n11 = oldList.n() + oldList.k();
            int size2 = newList2.getSize();
            if (n11 > size2) {
                n11 = size2;
            }
            EnumC3030j enumC3030j = EnumC3030j.ITEM_TO_PLACEHOLDER;
            int i13 = min2 - k11;
            if (i13 > 0) {
                ((C5468b) callback).onChanged(k11, i13, enumC3030j);
            }
            int i14 = n11 - max2;
            if (i14 > 0) {
                ((C5468b) callback).onChanged(max2, i14, enumC3030j);
            }
            int k12 = newList2.k();
            int size3 = oldList.getSize();
            if (k12 > size3) {
                k12 = size3;
            }
            int n12 = newList2.n() + newList2.k();
            int size4 = oldList.getSize();
            if (n12 > size4) {
                n12 = size4;
            }
            EnumC3030j enumC3030j2 = EnumC3030j.PLACEHOLDER_TO_ITEM;
            int i15 = min2 - k12;
            if (i15 > 0) {
                ((C5468b) callback).onChanged(k12, i15, enumC3030j2);
            }
            int i16 = n12 - max2;
            if (i16 > 0) {
                ((C5468b) callback).onChanged(max2, i16, enumC3030j2);
            }
            int size5 = newList2.getSize() - oldList.getSize();
            if (size5 > 0) {
                ((C5468b) callback).onInserted(oldList.getSize(), size5);
            } else if (size5 < 0) {
                ((C5468b) callback).onRemoved(oldList.getSize() + size5, -size5);
            }
        }
        C3024d c3024d = this.f8865k;
        recordingCallback.d(c3024d);
        newList.b(c3024d);
        if (!newList.isEmpty()) {
            K l11 = f11.l();
            K newList3 = diffSnapshot.l();
            Intrinsics.checkNotNullParameter(l11, "<this>");
            Intrinsics.checkNotNullParameter(diffResult, "diffResult");
            Intrinsics.checkNotNullParameter(newList3, "newList");
            if (diffResult.b()) {
                int k13 = i11 - l11.k();
                int n13 = l11.n();
                if (k13 >= 0 && k13 < n13) {
                    int i17 = 0;
                    while (true) {
                        int i18 = i17 + 1;
                        int i19 = ((i17 / 2) * (i17 % 2 == 1 ? -1 : 1)) + k13;
                        if (i19 >= 0 && i19 < l11.n() && (a11 = diffResult.a().a(i19)) != -1) {
                            f7 = newList3.k() + a11;
                            break;
                        } else if (i18 > 29) {
                            break;
                        } else {
                            i17 = i18;
                        }
                    }
                }
                f7 = kotlin.ranges.h.f(i11, kotlin.ranges.h.o(0, newList3.getSize()));
            } else {
                f7 = kotlin.ranges.h.f(i11, kotlin.ranges.h.o(0, newList3.getSize()));
            }
            newList.t(kotlin.ranges.h.e(f7, 0, newList.size() - 1));
        }
        j(f11, this.f8859e, nVar);
    }

    public final void k(F f7, Ui.n nVar) {
        int i11 = this.f8861g + 1;
        this.f8861g = i11;
        F f11 = this.f8859e;
        if (f7 == f11) {
            nVar.run();
            return;
        }
        kotlin.reflect.h<Unit> hVar = this.f8863i;
        C3024d c3024d = this.f8865k;
        if (f11 != null && (f7 instanceof C3032l)) {
            f11.z(c3024d);
            f11.A((Function2) hVar);
            y yVar = y.REFRESH;
            x.b bVar = x.b.f8976b;
            C3023c c3023c = this.f8862h;
            c3023c.e(yVar, bVar);
            c3023c.e(y.PREPEND, new x.c(false));
            c3023c.e(y.APPEND, new x.c(false));
            nVar.run();
            return;
        }
        F<T> c11 = c();
        if (f7 == null) {
            F<T> c12 = c();
            int size = c12 == null ? 0 : c12.size();
            if (f11 != null) {
                f11.z(c3024d);
                f11.A((Function2) hVar);
                this.f8859e = null;
            } else if (this.f8860f != null) {
                this.f8860f = null;
            }
            ((C5468b) h()).onRemoved(0, size);
            j(c11, null, nVar);
            return;
        }
        if (c() == null) {
            this.f8859e = f7;
            f7.c((Function2) hVar);
            f7.b(c3024d);
            ((C5468b) h()).onInserted(0, f7.size());
            j(null, f7, nVar);
            return;
        }
        F<T> f12 = this.f8859e;
        if (f12 != null) {
            f12.z(c3024d);
            f12.A((Function2) hVar);
            if (!f12.r()) {
                f12 = new T(f12);
            }
            this.f8860f = f12;
            this.f8859e = null;
        }
        F<T> f13 = this.f8860f;
        if (f13 == null || this.f8859e != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        F t2 = f7.r() ? f7 : new T(f7);
        S s11 = new S();
        f7.b(s11);
        this.f8856b.a().execute(new RunnableC3025e(f13, t2, this, i11, f7, s11, nVar));
    }
}
