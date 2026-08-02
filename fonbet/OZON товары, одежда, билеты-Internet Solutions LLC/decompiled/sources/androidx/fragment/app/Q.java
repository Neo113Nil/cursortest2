package androidx.fragment.app;

import B0.A0;
import a3.C4929c;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import g.C6594f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: b, reason: collision with root package name */
    int f42964b;

    /* renamed from: c, reason: collision with root package name */
    int f42965c;

    /* renamed from: d, reason: collision with root package name */
    int f42966d;

    /* renamed from: e, reason: collision with root package name */
    int f42967e;

    /* renamed from: f, reason: collision with root package name */
    int f42968f;

    /* renamed from: g, reason: collision with root package name */
    boolean f42969g;

    /* renamed from: i, reason: collision with root package name */
    String f42971i;

    /* renamed from: j, reason: collision with root package name */
    int f42972j;

    /* renamed from: k, reason: collision with root package name */
    CharSequence f42973k;

    /* renamed from: l, reason: collision with root package name */
    int f42974l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f42975m;

    /* renamed from: n, reason: collision with root package name */
    ArrayList<String> f42976n;

    /* renamed from: o, reason: collision with root package name */
    ArrayList<String> f42977o;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<Runnable> f42979q;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<a> f42963a = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    boolean f42970h = true;

    /* renamed from: p, reason: collision with root package name */
    boolean f42978p = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f42980a;

        /* renamed from: b, reason: collision with root package name */
        ComponentCallbacksC5392m f42981b;

        /* renamed from: c, reason: collision with root package name */
        boolean f42982c;

        /* renamed from: d, reason: collision with root package name */
        int f42983d;

        /* renamed from: e, reason: collision with root package name */
        int f42984e;

        /* renamed from: f, reason: collision with root package name */
        int f42985f;

        /* renamed from: g, reason: collision with root package name */
        int f42986g;

        /* renamed from: h, reason: collision with root package name */
        AbstractC5434v.b f42987h;

        /* renamed from: i, reason: collision with root package name */
        AbstractC5434v.b f42988i;

        a() {
        }

        a(ComponentCallbacksC5392m componentCallbacksC5392m, int i11) {
            this.f42980a = i11;
            this.f42981b = componentCallbacksC5392m;
            this.f42982c = false;
            AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
            this.f42987h = bVar;
            this.f42988i = bVar;
        }

        a(ComponentCallbacksC5392m componentCallbacksC5392m, int i11, int i12) {
            this.f42980a = i11;
            this.f42981b = componentCallbacksC5392m;
            this.f42982c = true;
            AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
            this.f42987h = bVar;
            this.f42988i = bVar;
        }
    }

    @Deprecated
    public Q() {
    }

    @NonNull
    public final void b(int i11, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, String str) {
        n(i11, componentCallbacksC5392m, str, 1);
    }

    @NonNull
    public final void c(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, int i11) {
        n(i11, componentCallbacksC5392m, null, 1);
    }

    @NonNull
    public final void d(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, String str) {
        n(0, componentCallbacksC5392m, str, 1);
    }

    final void e(a aVar) {
        this.f42963a.add(aVar);
        aVar.f42983d = this.f42964b;
        aVar.f42984e = this.f42965c;
        aVar.f42985f = this.f42966d;
        aVar.f42986g = this.f42967e;
    }

    @NonNull
    public final void f(@NonNull View view, @NonNull String str) {
        if (S.e()) {
            String o11 = androidx.core.view.Y.o(view);
            if (o11 == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f42976n == null) {
                this.f42976n = new ArrayList<>();
                this.f42977o = new ArrayList<>();
            } else {
                if (this.f42977o.contains(str)) {
                    throw new IllegalArgumentException(A0.b("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                if (this.f42976n.contains(o11)) {
                    throw new IllegalArgumentException(A0.b("A shared element with the source name '", o11, "' has already been added to the transaction."));
                }
            }
            this.f42976n.add(o11);
            this.f42977o.add(str);
        }
    }

    @NonNull
    public final void g(String str) {
        if (!this.f42970h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f42969g = true;
        this.f42971i = str;
    }

    @NonNull
    public final void h(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        e(new a(componentCallbacksC5392m, 7));
    }

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract void l();

    @NonNull
    public void m(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        e(new a(componentCallbacksC5392m, 6));
    }

    void n(int i11, ComponentCallbacksC5392m componentCallbacksC5392m, String str, int i12) {
        String str2 = componentCallbacksC5392m.mPreviousWho;
        if (str2 != null) {
            C4929c.d(componentCallbacksC5392m, str2);
        }
        Class<?> cls = componentCallbacksC5392m.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC5392m.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(componentCallbacksC5392m);
                sb2.append(": was ");
                throw new IllegalStateException(C6594f.a(componentCallbacksC5392m.mTag, " now ", str, sb2));
            }
            componentCallbacksC5392m.mTag = str;
        }
        if (i11 != 0) {
            if (i11 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC5392m + " with tag " + str + " to container view with no id");
            }
            int i13 = componentCallbacksC5392m.mFragmentId;
            if (i13 != 0 && i13 != i11) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC5392m + ": was " + componentCallbacksC5392m.mFragmentId + " now " + i11);
            }
            componentCallbacksC5392m.mFragmentId = i11;
            componentCallbacksC5392m.mContainerId = i11;
        }
        e(new a(componentCallbacksC5392m, i12));
    }

    @NonNull
    public void o(@NonNull ComposerFragment composerFragment) {
        e(new a(composerFragment, 4));
    }

    public abstract boolean p();

    @NonNull
    public void q(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        e(new a(componentCallbacksC5392m, 3));
    }

    @NonNull
    public final void r(int i11, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, String str) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        n(i11, componentCallbacksC5392m, str, 2);
    }

    @NonNull
    public final void s(@NonNull Runnable runnable) {
        if (this.f42969g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f42970h = false;
        if (this.f42979q == null) {
            this.f42979q = new ArrayList<>();
        }
        this.f42979q.add(runnable);
    }

    @NonNull
    public final void t(int i11, int i12, int i13, int i14) {
        this.f42964b = i11;
        this.f42965c = i12;
        this.f42966d = i13;
        this.f42967e = i14;
    }

    @NonNull
    public void u(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull AbstractC5434v.b bVar) {
        a aVar = new a();
        aVar.f42980a = 10;
        aVar.f42981b = componentCallbacksC5392m;
        aVar.f42982c = false;
        aVar.f42987h = componentCallbacksC5392m.mMaxState;
        aVar.f42988i = bVar;
        e(aVar);
    }

    @NonNull
    public void v(ComponentCallbacksC5392m componentCallbacksC5392m) {
        e(new a(componentCallbacksC5392m, 8));
    }

    @NonNull
    public final void w() {
        this.f42978p = true;
    }

    @NonNull
    public final void x() {
        this.f42968f = 4099;
    }

    @NonNull
    public void y(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        e(new a(componentCallbacksC5392m, 5));
    }

    Q(int i11) {
    }
}
