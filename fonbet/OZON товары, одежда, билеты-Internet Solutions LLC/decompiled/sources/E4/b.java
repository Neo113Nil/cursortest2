package E4;

import B4.C2581j;
import B4.H;
import B4.InterfaceC2575d;
import B4.S;
import B4.b0;
import B4.e0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.K;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

@b0.a("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LE4/b;", "LB4/b0;", "LE4/b$a;", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b extends b0<a> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f7429c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final G f7430d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f7431e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C0166b f7432f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f7433g;

    public static class a extends H implements InterfaceC2575d {

        /* renamed from: l, reason: collision with root package name */
        private String f7434l;

        public a() {
            throw null;
        }

        @NotNull
        public final String A() {
            String str = this.f7434l;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @Override // B4.H
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof a) && super.equals(obj) && Intrinsics.d(this.f7434l, ((a) obj).f7434l);
        }

        @Override // B4.H
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f7434l;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // B4.H
        public final void t(@NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.t(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, l.f7472a);
            Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
            String className = obtainAttributes.getString(0);
            if (className != null) {
                Intrinsics.checkNotNullParameter(className, "className");
                this.f7434l = className;
            }
            obtainAttributes.recycle();
        }
    }

    /* renamed from: E4.b$b, reason: collision with other inner class name */
    public static final class C0166b implements androidx.lifecycle.G {

        /* renamed from: E4.b$b$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7436a;

            static {
                int[] iArr = new int[AbstractC5434v.a.values().length];
                try {
                    iArr[AbstractC5434v.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f7436a = iArr;
            }
        }

        C0166b() {
        }

        @Override // androidx.lifecycle.G
        public final void onStateChanged(J source, AbstractC5434v.a event) {
            int i11;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            int i12 = a.f7436a[event.ordinal()];
            b bVar = b.this;
            if (i12 == 1) {
                DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k = (DialogInterfaceOnCancelListenerC5390k) source;
                List<C2581j> value = bVar.b().b().getValue();
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.d(((C2581j) it.next()).e(), dialogInterfaceOnCancelListenerC5390k.getTag())) {
                            return;
                        }
                    }
                }
                dialogInterfaceOnCancelListenerC5390k.dismiss();
                return;
            }
            Object obj = null;
            if (i12 == 2) {
                DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k2 = (DialogInterfaceOnCancelListenerC5390k) source;
                for (Object obj2 : bVar.b().c().getValue()) {
                    if (Intrinsics.d(((C2581j) obj2).e(), dialogInterfaceOnCancelListenerC5390k2.getTag())) {
                        obj = obj2;
                    }
                }
                C2581j c2581j = (C2581j) obj;
                if (c2581j != null) {
                    bVar.b().e(c2581j);
                    return;
                }
                return;
            }
            if (i12 != 3) {
                if (i12 != 4) {
                    return;
                }
                DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k3 = (DialogInterfaceOnCancelListenerC5390k) source;
                for (Object obj3 : bVar.b().c().getValue()) {
                    if (Intrinsics.d(((C2581j) obj3).e(), dialogInterfaceOnCancelListenerC5390k3.getTag())) {
                        obj = obj3;
                    }
                }
                C2581j c2581j2 = (C2581j) obj;
                if (c2581j2 != null) {
                    bVar.b().e(c2581j2);
                }
                dialogInterfaceOnCancelListenerC5390k3.getLifecycle().e(this);
                return;
            }
            DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k4 = (DialogInterfaceOnCancelListenerC5390k) source;
            if (dialogInterfaceOnCancelListenerC5390k4.requireDialog().isShowing()) {
                return;
            }
            List<C2581j> value2 = bVar.b().b().getValue();
            ListIterator<C2581j> listIterator = value2.listIterator(value2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (Intrinsics.d(listIterator.previous().e(), dialogInterfaceOnCancelListenerC5390k4.getTag())) {
                        i11 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            C2581j c2581j3 = (C2581j) C7714v.Q(i11, value2);
            if (!Intrinsics.d(C7714v.Z(value2), c2581j3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC5390k4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (c2581j3 != null) {
                bVar.p(i11, c2581j3, false);
            }
        }
    }

    public b(@NotNull Context context, @NotNull G fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f7429c = context;
        this.f7430d = fragmentManager;
        this.f7431e = new LinkedHashSet();
        this.f7432f = new C0166b();
        this.f7433g = new LinkedHashMap();
    }

    public static void l(b this$0, G g10, ComponentCallbacksC5392m childFragment) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(g10, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(childFragment, "childFragment");
        LinkedHashSet linkedHashSet = this$0.f7431e;
        String tag = childFragment.getTag();
        U.a(linkedHashSet);
        if (linkedHashSet.remove(tag)) {
            childFragment.getLifecycle().a(this$0.f7432f);
        }
        LinkedHashMap linkedHashMap = this$0.f7433g;
        U.d(linkedHashMap).remove(childFragment.getTag());
    }

    private final DialogInterfaceOnCancelListenerC5390k o(C2581j c2581j) {
        H d11 = c2581j.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        a aVar = (a) d11;
        String A11 = aVar.A();
        char charAt = A11.charAt(0);
        Context context = this.f7429c;
        if (charAt == '.') {
            A11 = context.getPackageName() + A11;
        }
        ComponentCallbacksC5392m a11 = this.f7430d.p0().a(context.getClassLoader(), A11);
        Intrinsics.checkNotNullExpressionValue(a11, "fragmentManager.fragment…t.classLoader, className)");
        if (!DialogInterfaceOnCancelListenerC5390k.class.isAssignableFrom(a11.getClass())) {
            throw new IllegalArgumentException(("Dialog destination " + aVar.A() + " is not an instance of DialogFragment").toString());
        }
        DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k = (DialogInterfaceOnCancelListenerC5390k) a11;
        dialogInterfaceOnCancelListenerC5390k.setArguments(c2581j.c());
        dialogInterfaceOnCancelListenerC5390k.getLifecycle().a(this.f7432f);
        this.f7433g.put(c2581j.e(), dialogInterfaceOnCancelListenerC5390k);
        return dialogInterfaceOnCancelListenerC5390k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(int i11, C2581j c2581j, boolean z11) {
        C2581j c2581j2 = (C2581j) C7714v.Q(i11 - 1, b().b().getValue());
        boolean A11 = C7714v.A(b().c().getValue(), c2581j2);
        b().i(c2581j, z11);
        if (c2581j2 == null || A11) {
            return;
        }
        b().e(c2581j2);
    }

    @Override // B4.b0
    public final a a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new a(this);
    }

    @Override // B4.b0
    public final void e(@NotNull List entries, S s11) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        G g10 = this.f7430d;
        if (g10.H0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C2581j c2581j = (C2581j) it.next();
            o(c2581j).show(g10, c2581j.e());
            C2581j c2581j2 = (C2581j) C7714v.Z(b().b().getValue());
            boolean A11 = C7714v.A(b().c().getValue(), c2581j2);
            b().l(c2581j);
            if (c2581j2 != null && !A11) {
                b().e(c2581j2);
            }
        }
    }

    @Override // B4.b0
    public final void f(@NotNull e0 state) {
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(state, "state");
        super.f(state);
        Iterator<C2581j> it = state.b().getValue().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            G g10 = this.f7430d;
            if (!hasNext) {
                g10.j(new K() { // from class: E4.a
                    @Override // androidx.fragment.app.K
                    public final void a(G g11, ComponentCallbacksC5392m componentCallbacksC5392m) {
                        b.l(b.this, g11, componentCallbacksC5392m);
                    }
                });
                return;
            }
            C2581j next = it.next();
            DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k = (DialogInterfaceOnCancelListenerC5390k) g10.g0(next.e());
            if (dialogInterfaceOnCancelListenerC5390k == null || (lifecycle = dialogInterfaceOnCancelListenerC5390k.getLifecycle()) == null) {
                this.f7431e.add(next.e());
            } else {
                lifecycle.a(this.f7432f);
            }
        }
    }

    @Override // B4.b0
    public final void g(@NotNull C2581j backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        G g10 = this.f7430d;
        if (g10.H0()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k = (DialogInterfaceOnCancelListenerC5390k) this.f7433g.get(backStackEntry.e());
        if (dialogInterfaceOnCancelListenerC5390k == null) {
            ComponentCallbacksC5392m g02 = g10.g0(backStackEntry.e());
            dialogInterfaceOnCancelListenerC5390k = g02 instanceof DialogInterfaceOnCancelListenerC5390k ? (DialogInterfaceOnCancelListenerC5390k) g02 : null;
        }
        if (dialogInterfaceOnCancelListenerC5390k != null) {
            dialogInterfaceOnCancelListenerC5390k.getLifecycle().e(this.f7432f);
            dialogInterfaceOnCancelListenerC5390k.dismiss();
        }
        o(backStackEntry).show(g10, backStackEntry.e());
        b().g(backStackEntry);
    }

    @Override // B4.b0
    public final void j(@NotNull C2581j popUpTo, boolean z11) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        G g10 = this.f7430d;
        if (g10.H0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<C2581j> value = b().b().getValue();
        int indexOf = value.indexOf(popUpTo);
        Iterator it = C7714v.z0(value.subList(indexOf, value.size())).iterator();
        while (it.hasNext()) {
            ComponentCallbacksC5392m g02 = g10.g0(((C2581j) it.next()).e());
            if (g02 != null) {
                ((DialogInterfaceOnCancelListenerC5390k) g02).dismiss();
            }
        }
        p(indexOf, popUpTo, z11);
    }
}
