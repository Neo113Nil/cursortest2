package E4;

import B4.C2581j;
import B4.H;
import B4.S;
import B4.b0;
import B4.e0;
import Bk.C2638a;
import Sc.InterfaceC4003e;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.K;
import androidx.fragment.app.Q;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import f3.C6411c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.sequences.I;
import org.jetbrains.annotations.NotNull;

@b0.a("fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LE4/e;", "LB4/b0;", "LE4/e$b;", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class e extends b0<b> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f7441c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final G f7442d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7443e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f7444f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f7445g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final E4.c f7446h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Function1<C2581j, androidx.lifecycle.G> f7447i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE4/e$a;", "Landroidx/lifecycle/w0;", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends w0 {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<Function0<Unit>> f7448a;

        @Override // androidx.lifecycle.w0
        protected final void onCleared() {
            super.onCleared();
            WeakReference<Function0<Unit>> weakReference = this.f7448a;
            if (weakReference == null) {
                Intrinsics.n("completeTransition");
                throw null;
            }
            Function0<Unit> function0 = weakReference.get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static class b extends H {

        /* renamed from: l, reason: collision with root package name */
        private String f7449l;

        public b() {
            throw null;
        }

        @NotNull
        public final String A() {
            String str = this.f7449l;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @Override // B4.H
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof b) && super.equals(obj) && Intrinsics.d(this.f7449l, ((b) obj).f7449l);
        }

        @Override // B4.H
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f7449l;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // B4.H
        public final void t(@NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.t(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, l.f7473b);
            Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String className = obtainAttributes.getString(0);
            if (className != null) {
                Intrinsics.checkNotNullParameter(className, "className");
                this.f7449l = className;
            }
            Unit unit = Unit.f71690a;
            obtainAttributes.recycle();
        }

        @Override // B4.H
        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f7449l;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
            return sb3;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f7450b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f7451c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f7452d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2581j c2581j, e0 e0Var, e eVar, ComponentCallbacksC5392m componentCallbacksC5392m) {
            super(0);
            this.f7450b = e0Var;
            this.f7451c = eVar;
            this.f7452d = componentCallbacksC5392m;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            e0 e0Var = this.f7450b;
            for (C2581j c2581j : e0Var.c().getValue()) {
                if (e.p(this.f7451c)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + c2581j + " due to fragment " + this.f7452d + " viewmodel being cleared");
                }
                e0Var.e(c2581j);
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<AbstractC6409a, a> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f7453b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final a invoke(AbstractC6409a abstractC6409a) {
            AbstractC6409a initializer = abstractC6409a;
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new a();
        }
    }

    /* renamed from: E4.e$e, reason: collision with other inner class name */
    static final class C0167e extends AbstractC7737t implements Function1<C2581j, androidx.lifecycle.G> {
        C0167e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final androidx.lifecycle.G invoke(C2581j c2581j) {
            final C2581j entry = c2581j;
            Intrinsics.checkNotNullParameter(entry, "entry");
            final e eVar = e.this;
            return new androidx.lifecycle.G() { // from class: E4.h
                @Override // androidx.lifecycle.G
                public final void onStateChanged(J owner, AbstractC5434v.a event) {
                    e0 b11;
                    e0 b12;
                    e0 b13;
                    e this$0 = e.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    C2581j entry2 = entry;
                    Intrinsics.checkNotNullParameter(entry2, "$entry");
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == AbstractC5434v.a.ON_RESUME) {
                        b12 = this$0.b();
                        if (b12.b().getValue().contains(entry2)) {
                            if (e.p(this$0)) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry2 + " due to fragment " + owner + " view lifecycle reaching RESUMED");
                            }
                            b13 = this$0.b();
                            b13.e(entry2);
                        }
                    }
                    if (event == AbstractC5434v.a.ON_DESTROY) {
                        if (e.p(this$0)) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + entry2 + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
                        }
                        b11 = this$0.b();
                        b11.e(entry2);
                    }
                }
            };
        }
    }

    public static final class f implements G.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0 f7455a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f7456b;

        f(e0 e0Var, e eVar) {
            this.f7455a = e0Var;
            this.f7456b = eVar;
        }

        @Override // androidx.fragment.app.G.p
        public final void a(ComponentCallbacksC5392m fragment, boolean z11) {
            Object obj;
            Object obj2;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            e0 e0Var = this.f7455a;
            ArrayList p02 = C7714v.p0(e0Var.c().getValue(), e0Var.b().getValue());
            ListIterator listIterator = p02.listIterator(p02.size());
            while (true) {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = listIterator.previous();
                    if (Intrinsics.d(((C2581j) obj2).e(), fragment.getTag())) {
                        break;
                    }
                }
            }
            C2581j c2581j = (C2581j) obj2;
            e eVar = this.f7456b;
            boolean z12 = z11 && eVar.getF7445g().isEmpty() && fragment.isRemoving();
            Iterator it = eVar.getF7445g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(((Pair) next).e(), fragment.getTag())) {
                    obj = next;
                    break;
                }
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                eVar.getF7445g().remove(pair);
            }
            if (!z12 && e.p(eVar)) {
                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + c2581j);
            }
            boolean z13 = pair != null && ((Boolean) pair.f()).booleanValue();
            if (!z11 && !z13 && c2581j == null) {
                throw new IllegalArgumentException(C2638a.d("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (c2581j != null) {
                eVar.r(fragment, c2581j, e0Var);
                if (z12) {
                    if (e.p(eVar)) {
                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + c2581j + " via system back");
                    }
                    e0Var.i(c2581j, false);
                }
            }
        }

        @Override // androidx.fragment.app.G.p
        public final void onBackStackChangeStarted(ComponentCallbacksC5392m fragment, boolean z11) {
            C2581j c2581j;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            if (z11) {
                e0 e0Var = this.f7455a;
                List<C2581j> value = e0Var.b().getValue();
                ListIterator<C2581j> listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        c2581j = null;
                        break;
                    } else {
                        c2581j = listIterator.previous();
                        if (Intrinsics.d(c2581j.e(), fragment.getTag())) {
                            break;
                        }
                    }
                }
                C2581j c2581j2 = c2581j;
                if (e.p(this.f7456b)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + c2581j2);
                }
                if (c2581j2 != null) {
                    e0Var.j(c2581j2);
                }
            }
        }

        @Override // androidx.fragment.app.G.p
        public final void onBackStackChanged() {
        }
    }

    static final class g extends AbstractC7737t implements Function1<Pair<? extends String, ? extends Boolean>, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f7457b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Pair<? extends String, ? extends Boolean> pair) {
            Pair<? extends String, ? extends Boolean> it = pair;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.e();
        }
    }

    static final class h implements W, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f7458a;

        h(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f7458a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return this.f7458a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.W
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7458a.invoke(obj);
        }
    }

    public e(@NotNull Context context, @NotNull G fragmentManager, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f7441c = context;
        this.f7442d = fragmentManager;
        this.f7443e = i11;
        this.f7444f = new LinkedHashSet();
        this.f7445g = new ArrayList();
        this.f7446h = new E4.c(this, 0);
        this.f7447i = new C0167e();
    }

    public static void l(e0 state, e this$0, G g10, ComponentCallbacksC5392m fragment) {
        C2581j c2581j;
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(g10, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        List<C2581j> value = state.b().getValue();
        ListIterator<C2581j> listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c2581j = null;
                break;
            } else {
                c2581j = listIterator.previous();
                if (Intrinsics.d(c2581j.e(), fragment.getTag())) {
                    break;
                }
            }
        }
        C2581j c2581j2 = c2581j;
        this$0.getClass();
        if (u()) {
            Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + c2581j2 + " to FragmentManager " + this$0.f7442d);
        }
        if (c2581j2 != null) {
            fragment.getViewLifecycleOwnerLiveData().observe(fragment, new h(new E4.g(this$0, fragment, c2581j2)));
            fragment.getLifecycle().a(this$0.f7446h);
            this$0.r(fragment, c2581j2, state);
        }
    }

    public static void m(e this$0, J source, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_DESTROY) {
            ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) source;
            Object obj = null;
            for (Object obj2 : this$0.b().c().getValue()) {
                if (Intrinsics.d(((C2581j) obj2).e(), componentCallbacksC5392m.getTag())) {
                    obj = obj2;
                }
            }
            C2581j c2581j = (C2581j) obj;
            if (c2581j != null) {
                if (u()) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + c2581j + " due to fragment " + source + " lifecycle reaching DESTROYED");
                }
                this$0.b().e(c2581j);
            }
        }
    }

    public static final /* synthetic */ boolean p(e eVar) {
        eVar.getClass();
        return u();
    }

    static void q(e eVar, String str, int i11) {
        boolean z11 = (i11 & 2) == 0;
        boolean z12 = (i11 & 4) != 0;
        ArrayList arrayList = eVar.f7445g;
        if (z12) {
            C.h(arrayList, new E4.f(str));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z11)));
    }

    private final Q s(C2581j c2581j, S s11) {
        H d11 = c2581j.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle c11 = c2581j.c();
        String A11 = ((b) d11).A();
        char charAt = A11.charAt(0);
        Context context = this.f7441c;
        if (charAt == '.') {
            A11 = context.getPackageName() + A11;
        }
        G g10 = this.f7442d;
        ComponentCallbacksC5392m a11 = g10.p0().a(context.getClassLoader(), A11);
        Intrinsics.checkNotNullExpressionValue(a11, "fragmentManager.fragment…t.classLoader, className)");
        a11.setArguments(c11);
        Q p11 = g10.p();
        Intrinsics.checkNotNullExpressionValue(p11, "fragmentManager.beginTransaction()");
        int a12 = s11 != null ? s11.a() : -1;
        int b11 = s11 != null ? s11.b() : -1;
        int c12 = s11 != null ? s11.c() : -1;
        int d12 = s11 != null ? s11.d() : -1;
        if (a12 != -1 || b11 != -1 || c12 != -1 || d12 != -1) {
            if (a12 == -1) {
                a12 = 0;
            }
            if (b11 == -1) {
                b11 = 0;
            }
            if (c12 == -1) {
                c12 = 0;
            }
            p11.t(a12, b11, c12, d12 != -1 ? d12 : 0);
        }
        p11.r(this.f7443e, a11, c2581j.e());
        p11.v(a11);
        p11.w();
        return p11;
    }

    private static boolean u() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // B4.b0
    public final b a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new b(this);
    }

    @Override // B4.b0
    public final void e(@NotNull List entries, S s11) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        G g10 = this.f7442d;
        if (g10.H0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C2581j c2581j = (C2581j) it.next();
            boolean isEmpty = b().b().getValue().isEmpty();
            if (s11 == null || isEmpty || !s11.i() || !this.f7444f.remove(c2581j.e())) {
                Q s12 = s(c2581j, s11);
                if (!isEmpty) {
                    C2581j c2581j2 = (C2581j) C7714v.Z(b().b().getValue());
                    if (c2581j2 != null) {
                        q(this, c2581j2.e(), 6);
                    }
                    q(this, c2581j.e(), 6);
                    s12.g(c2581j.e());
                }
                s12.i();
                if (u()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + c2581j);
                }
                b().l(c2581j);
            } else {
                g10.d1(c2581j.e());
                b().l(c2581j);
            }
        }
    }

    @Override // B4.b0
    public final void f(@NotNull final e0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.f(state);
        if (u()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        K k11 = new K() { // from class: E4.d
            @Override // androidx.fragment.app.K
            public final void a(G g10, ComponentCallbacksC5392m componentCallbacksC5392m) {
                e.l(e0.this, this, g10, componentCallbacksC5392m);
            }
        };
        G g10 = this.f7442d;
        g10.j(k11);
        g10.k(new f(state, this));
    }

    @Override // B4.b0
    public final void g(@NotNull C2581j backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        G g10 = this.f7442d;
        if (g10.H0()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        Q s11 = s(backStackEntry, null);
        List<C2581j> value = b().b().getValue();
        if (value.size() > 1) {
            C2581j c2581j = (C2581j) C7714v.Q(C7714v.P(value) - 1, value);
            if (c2581j != null) {
                q(this, c2581j.e(), 6);
            }
            q(this, backStackEntry.e(), 4);
            g10.Q0(backStackEntry.e());
            q(this, backStackEntry.e(), 2);
            s11.g(backStackEntry.e());
        }
        s11.i();
        b().f(backStackEntry);
    }

    @Override // B4.b0
    public final void h(@NotNull Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f7444f;
            linkedHashSet.clear();
            C7714v.p(stringArrayList, linkedHashSet);
        }
    }

    @Override // B4.b0
    public final Bundle i() {
        LinkedHashSet linkedHashSet = this.f7444f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return androidx.core.os.d.b(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // B4.b0
    public final void j(@NotNull C2581j popUpTo, boolean z11) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        G g10 = this.f7442d;
        if (g10.H0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<C2581j> value = b().b().getValue();
        int indexOf = value.indexOf(popUpTo);
        List<C2581j> subList = value.subList(indexOf, value.size());
        C2581j c2581j = (C2581j) C7714v.K(value);
        C2581j c2581j2 = (C2581j) C7714v.Q(indexOf - 1, value);
        if (c2581j2 != null) {
            q(this, c2581j2.e(), 6);
        }
        List<C2581j> list = subList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C2581j c2581j3 = (C2581j) obj;
            I v11 = kotlin.sequences.l.v(C7714v.w(this.f7445g), g.f7457b);
            String e11 = c2581j3.e();
            Intrinsics.checkNotNullParameter(v11, "<this>");
            Intrinsics.checkNotNullParameter(v11, "<this>");
            Iterator it = v11.iterator();
            int i11 = 0;
            while (true) {
                I.a aVar = (I.a) it;
                if (!aVar.hasNext()) {
                    i11 = -1;
                    break;
                }
                Object next = aVar.next();
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                if (Intrinsics.d(e11, next)) {
                    break;
                } else {
                    i11++;
                }
            }
            if ((i11 >= 0) || !Intrinsics.d(c2581j3.e(), c2581j.e())) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            q(this, ((C2581j) it2.next()).e(), 4);
        }
        if (z11) {
            for (C2581j c2581j4 : C7714v.z0(list)) {
                if (Intrinsics.d(c2581j4, c2581j)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c2581j4);
                } else {
                    g10.h1(c2581j4.e());
                    this.f7444f.add(c2581j4.e());
                }
            }
        } else {
            g10.Q0(popUpTo.e());
        }
        if (u()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + z11);
        }
        b().i(popUpTo, z11);
    }

    public final void r(@NotNull ComponentCallbacksC5392m fragment, @NotNull C2581j entry, @NotNull e0 state) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        A0 viewModelStore = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "fragment.viewModelStore");
        C6411c c6411c = new C6411c();
        c6411c.a(N.b(a.class), d.f7453b);
        a aVar = (a) new z0(viewModelStore, c6411c.b(), AbstractC6409a.C0988a.f62496b).a(a.class);
        WeakReference<Function0<Unit>> weakReference = new WeakReference<>(new c(entry, state, this, fragment));
        aVar.getClass();
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        aVar.f7448a = weakReference;
    }

    @NotNull
    /* renamed from: t, reason: from getter */
    public final ArrayList getF7445g() {
        return this.f7445g;
    }
}
