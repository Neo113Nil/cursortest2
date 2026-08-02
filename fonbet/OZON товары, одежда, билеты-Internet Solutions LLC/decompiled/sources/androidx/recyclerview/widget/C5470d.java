package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C5469c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5470d<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Executor f44845h = new c();

    /* renamed from: a, reason: collision with root package name */
    private final u f44846a;

    /* renamed from: b, reason: collision with root package name */
    final C5469c<T> f44847b;

    /* renamed from: c, reason: collision with root package name */
    Executor f44848c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList f44849d;

    /* renamed from: e, reason: collision with root package name */
    private List<T> f44850e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private List<T> f44851f;

    /* renamed from: g, reason: collision with root package name */
    int f44852g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes8.dex */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f44853a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f44854b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f44855c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f44856d;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        final class C0816a extends i.b {
            C0816a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.i.b
            public final boolean areContentsTheSame(int i11, int i12) {
                a aVar = a.this;
                Object obj = aVar.f44853a.get(i11);
                Object obj2 = aVar.f44854b.get(i12);
                if (obj != null && obj2 != null) {
                    return C5470d.this.f44847b.b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.i.b
            public final boolean areItemsTheSame(int i11, int i12) {
                a aVar = a.this;
                Object obj = aVar.f44853a.get(i11);
                Object obj2 = aVar.f44854b.get(i12);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : C5470d.this.f44847b.b().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.i.b
            public final Object getChangePayload(int i11, int i12) {
                a aVar = a.this;
                Object obj = aVar.f44853a.get(i11);
                Object obj2 = aVar.f44854b.get(i12);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return C5470d.this.f44847b.b().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.i.b
            public final int getNewListSize() {
                return a.this.f44854b.size();
            }

            @Override // androidx.recyclerview.widget.i.b
            public final int getOldListSize() {
                return a.this.f44853a.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i.c f44859a;

            b(i.c cVar) {
                this.f44859a = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                C5470d c5470d = C5470d.this;
                if (c5470d.f44852g == aVar.f44855c) {
                    c5470d.c(aVar.f44854b, this.f44859a, aVar.f44856d);
                }
            }
        }

        a(List list, List list2, int i11, Runnable runnable) {
            this.f44853a = list;
            this.f44854b = list2;
            this.f44855c = i11;
            this.f44856d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5470d.this.f44848c.execute(new b(i.a(new C0816a(), true)));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    public interface b<T> {
        void a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    private static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final Handler f44861a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            this.f44861a.post(runnable);
        }
    }

    public C5470d(@NonNull RecyclerView.g gVar, @NonNull i.d<T> dVar) {
        this(new C5468b(gVar), new C5469c.a(dVar).a());
    }

    private void d(@NonNull List<T> list, Runnable runnable) {
        Iterator it = this.f44849d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(list, this.f44851f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void a(@NonNull b<T> bVar) {
        this.f44849d.add(bVar);
    }

    @NonNull
    public final List<T> b() {
        return this.f44851f;
    }

    final void c(@NonNull List<T> list, @NonNull i.c cVar, Runnable runnable) {
        List<T> list2 = this.f44851f;
        this.f44850e = list;
        this.f44851f = Collections.unmodifiableList(list);
        cVar.b(this.f44846a);
        d(list2, runnable);
    }

    public final void e(List<T> list, Runnable runnable) {
        int i11 = this.f44852g + 1;
        this.f44852g = i11;
        List<T> list2 = this.f44850e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f44851f;
        u uVar = this.f44846a;
        if (list == null) {
            int size = list2.size();
            this.f44850e = null;
            this.f44851f = Collections.EMPTY_LIST;
            uVar.onRemoved(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f44847b.a().execute(new a(list2, list, i11, runnable));
            return;
        }
        this.f44850e = list;
        this.f44851f = Collections.unmodifiableList(list);
        uVar.onInserted(0, list.size());
        d(list3, runnable);
    }

    public C5470d(@NonNull u uVar, @NonNull C5469c<T> c5469c) {
        this.f44849d = new CopyOnWriteArrayList();
        this.f44851f = Collections.EMPTY_LIST;
        this.f44846a = uVar;
        this.f44847b = c5469c;
        this.f44848c = f44845h;
    }
}
