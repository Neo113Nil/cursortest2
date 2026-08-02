package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C5035b;
import androidx.fragment.app.C5385f;
import androidx.fragment.app.G;
import g.C6594f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewGroup f43084a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f43085b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f43086c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43087d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f43088e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f43089f;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f43090a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f43091b;

        public final void a(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.f43091b) {
                c(container);
            }
            this.f43091b = true;
        }

        public boolean b() {
            return this instanceof C5385f.c;
        }

        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void e(@NotNull C5035b backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void f(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public final void g(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.f43090a) {
                f(container);
            }
            this.f43090a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends c {

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final O f43092l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(@NotNull c.b finalState, @NotNull c.a lifecycleImpact, @NotNull O fragmentStateManager) {
            super(finalState, lifecycleImpact, r0);
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            ComponentCallbacksC5392m k11 = fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(k11, "fragmentStateManager.fragment");
            this.f43092l = fragmentStateManager;
        }

        @Override // androidx.fragment.app.f0.c
        public final void d() {
            super.d();
            h().mTransitioning = false;
            this.f43092l.l();
        }

        @Override // androidx.fragment.app.f0.c
        public final void p() {
            if (n()) {
                return;
            }
            super.p();
            c.a i11 = i();
            c.a aVar = c.a.ADDING;
            O o11 = this.f43092l;
            if (i11 != aVar) {
                if (i() == c.a.REMOVING) {
                    ComponentCallbacksC5392m k11 = o11.k();
                    Intrinsics.checkNotNullExpressionValue(k11, "fragmentStateManager.fragment");
                    View requireView = k11.requireView();
                    Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + k11);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            ComponentCallbacksC5392m k12 = o11.k();
            Intrinsics.checkNotNullExpressionValue(k12, "fragmentStateManager.fragment");
            View findFocus = k12.mView.findFocus();
            if (findFocus != null) {
                k12.setFocusedView(findFocus);
                if (G.D0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k12);
                }
            }
            View requireView2 = h().requireView();
            Intrinsics.checkNotNullExpressionValue(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                if (G.D0(2)) {
                    Log.v("FragmentManager", "Adding fragment " + k12 + " view " + requireView2 + " to container in onStart");
                }
                o11.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                if (G.D0(2)) {
                    Log.v("FragmentManager", "Making view " + requireView2 + " INVISIBLE in onStart");
                }
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k12.getPostOnViewCreatedAlpha());
            if (G.D0(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + k12.getPostOnViewCreatedAlpha() + " in onStart");
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private b f43093a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private a f43094b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ComponentCallbacksC5392m f43095c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList f43096d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f43097e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f43098f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f43099g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f43100h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f43101i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final ArrayList f43102j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final ArrayList f43103k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ a[] $VALUES;
            public static final a ADDING;
            public static final a NONE;
            public static final a REMOVING;

            static {
                a aVar = new a("NONE", 0);
                NONE = aVar;
                a aVar2 = new a("ADDING", 1);
                ADDING = aVar2;
                a aVar3 = new a("REMOVING", 2);
                REMOVING = aVar3;
                $VALUES = new a[]{aVar, aVar2, aVar3};
            }

            private a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            private static final /* synthetic */ b[] $VALUES;

            @NotNull
            public static final a Companion;
            public static final b GONE;
            public static final b INVISIBLE;
            public static final b REMOVED;
            public static final b VISIBLE;

            public static final class a {
                @NotNull
                public static b a(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                @NotNull
                public static b b(int i11) {
                    if (i11 == 0) {
                        return b.VISIBLE;
                    }
                    if (i11 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i11 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException(Ej.b.a(i11, "Unknown visibility "));
                }
            }

            /* renamed from: androidx.fragment.app.f0$c$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0788b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f43104a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f43104a = iArr;
                }
            }

            static {
                b bVar = new b("REMOVED", 0);
                REMOVED = bVar;
                b bVar2 = new b("VISIBLE", 1);
                VISIBLE = bVar2;
                b bVar3 = new b("GONE", 2);
                GONE = bVar3;
                b bVar4 = new b("INVISIBLE", 3);
                INVISIBLE = bVar4;
                $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
                Companion = new a();
            }

            private b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }

            public final void a(@NotNull View view, @NotNull ViewGroup container) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(container, "container");
                if (G.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int i11 = C0788b.f43104a[ordinal()];
                if (i11 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (G.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (G.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i11 == 3) {
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i11 != 4) {
                    return;
                }
                if (G.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* renamed from: androidx.fragment.app.f0$c$c, reason: collision with other inner class name */
        public /* synthetic */ class C0789c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43105a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f43105a = iArr;
            }
        }

        public c(@NotNull b finalState, @NotNull a lifecycleImpact, @NotNull ComponentCallbacksC5392m fragment) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f43093a = finalState;
            this.f43094b = lifecycleImpact;
            this.f43095c = fragment;
            this.f43096d = new ArrayList();
            this.f43101i = true;
            ArrayList arrayList = new ArrayList();
            this.f43102j = arrayList;
            this.f43103k = arrayList;
        }

        public final void a(@NotNull Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f43096d.add(listener);
        }

        public final void b(@NotNull a effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.f43102j.add(effect);
        }

        public final void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f43100h = false;
            if (this.f43097e) {
                return;
            }
            this.f43097e = true;
            if (this.f43102j.isEmpty()) {
                d();
                return;
            }
            Iterator it = C7714v.U0(this.f43103k).iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(container);
            }
        }

        public void d() {
            this.f43100h = false;
            if (this.f43098f) {
                return;
            }
            if (G.D0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f43098f = true;
            Iterator it = this.f43096d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(@NotNull a effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            ArrayList arrayList = this.f43102j;
            if (arrayList.remove(effect) && arrayList.isEmpty()) {
                d();
            }
        }

        @NotNull
        public final ArrayList f() {
            return this.f43103k;
        }

        @NotNull
        public final b g() {
            return this.f43093a;
        }

        @NotNull
        public final ComponentCallbacksC5392m h() {
            return this.f43095c;
        }

        @NotNull
        public final a i() {
            return this.f43094b;
        }

        public final boolean j() {
            return this.f43101i;
        }

        public final boolean k() {
            return this.f43097e;
        }

        public final boolean l() {
            return this.f43098f;
        }

        public final boolean m() {
            return this.f43099g;
        }

        public final boolean n() {
            return this.f43100h;
        }

        public final void o(@NotNull b finalState, @NotNull a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i11 = C0789c.f43105a[lifecycleImpact.ordinal()];
            ComponentCallbacksC5392m componentCallbacksC5392m = this.f43095c;
            if (i11 == 1) {
                if (this.f43093a == b.REMOVED) {
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC5392m + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f43094b + " to ADDING.");
                    }
                    this.f43093a = b.VISIBLE;
                    this.f43094b = a.ADDING;
                    this.f43101i = true;
                    return;
                }
                return;
            }
            if (i11 == 2) {
                if (G.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC5392m + " mFinalState = " + this.f43093a + " -> REMOVED. mLifecycleImpact  = " + this.f43094b + " to REMOVING.");
                }
                this.f43093a = b.REMOVED;
                this.f43094b = a.REMOVING;
                this.f43101i = true;
                return;
            }
            if (i11 == 3 && this.f43093a != b.REMOVED) {
                if (G.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC5392m + " mFinalState = " + this.f43093a + " -> " + finalState + '.');
                }
                this.f43093a = finalState;
            }
        }

        public void p() {
            this.f43100h = true;
        }

        public final void q() {
            this.f43101i = false;
        }

        public final void r(boolean z11) {
            this.f43099g = z11;
        }

        @NotNull
        public final String toString() {
            StringBuilder b11 = C6594f.b("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            b11.append(this.f43093a);
            b11.append(" lifecycleImpact = ");
            b11.append(this.f43094b);
            b11.append(" fragment = ");
            b11.append(this.f43095c);
            b11.append('}');
            return b11.toString();
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43106a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f43106a = iArr;
        }
    }

    public f0(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f43084a = container;
        this.f43085b = new ArrayList();
        this.f43086c = new ArrayList();
    }

    public static void a(f0 this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.f43085b.contains(operation)) {
            c.b g10 = operation.g();
            View view = operation.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            g10.a(view, this$0.f43084a);
        }
    }

    public static void b(f0 this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.f43085b.remove(operation);
        this$0.f43086c.remove(operation);
    }

    private final void g(c.b bVar, c.a aVar, O o11) {
        synchronized (this.f43085b) {
            try {
                ComponentCallbacksC5392m k11 = o11.k();
                Intrinsics.checkNotNullExpressionValue(k11, "fragmentStateManager.fragment");
                c m11 = m(k11);
                if (m11 == null) {
                    if (!o11.k().mTransitioning && !o11.k().mRemoving) {
                        m11 = null;
                    }
                    ComponentCallbacksC5392m k12 = o11.k();
                    Intrinsics.checkNotNullExpressionValue(k12, "fragmentStateManager.fragment");
                    m11 = n(k12);
                }
                if (m11 != null) {
                    m11.o(bVar, aVar);
                    return;
                }
                final b bVar2 = new b(bVar, aVar, o11);
                this.f43085b.add(bVar2);
                bVar2.a(new Runnable() { // from class: androidx.fragment.app.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0.a(f0.this, bVar2);
                    }
                });
                bVar2.a(new Runnable() { // from class: androidx.fragment.app.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0.b(f0.this, bVar2);
                    }
                });
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final c m(ComponentCallbacksC5392m componentCallbacksC5392m) {
        Object obj;
        Iterator it = this.f43085b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (Intrinsics.d(cVar.h(), componentCallbacksC5392m) && !cVar.k()) {
                break;
            }
        }
        return (c) obj;
    }

    private final c n(ComponentCallbacksC5392m componentCallbacksC5392m) {
        Object obj;
        Iterator it = this.f43086c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (Intrinsics.d(cVar.h(), componentCallbacksC5392m) && !cVar.k()) {
                break;
            }
        }
        return (c) obj;
    }

    @NotNull
    public static final f0 s(@NotNull ViewGroup container, @NotNull G fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        g0 factory = fragmentManager.x0();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof f0) {
            return (f0) tag;
        }
        ((G.e) factory).getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        C5385f c5385f = new C5385f(container);
        Intrinsics.checkNotNullExpressionValue(c5385f, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, c5385f);
        return c5385f;
    }

    private static boolean t(ArrayList arrayList) {
        boolean z11;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z11 = true;
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (!cVar.f().isEmpty()) {
                    ArrayList f7 = cVar.f();
                    if (f7 == null || !f7.isEmpty()) {
                        Iterator it2 = f7.iterator();
                        while (it2.hasNext()) {
                            if (!((a) it2.next()).b()) {
                                break;
                            }
                        }
                    }
                }
                z11 = false;
            }
            break loop0;
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C7714v.p(((c) it3.next()).f(), arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final void x(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((c) arrayList.get(i11)).p();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7714v.p(((c) it.next()).f(), arrayList2);
        }
        List U02 = C7714v.U0(C7714v.Y0(arrayList2));
        int size2 = U02.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((a) U02.get(i12)).g(this.f43084a);
        }
    }

    private final void y() {
        Iterator it = this.f43085b.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.i() == c.a.ADDING) {
                View requireView = cVar.h().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                c.b.a aVar = c.b.Companion;
                int visibility = requireView.getVisibility();
                aVar.getClass();
                cVar.o(c.b.a.b(visibility), c.a.NONE);
            }
        }
    }

    public final void c(@NotNull c operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.j()) {
            c.b g10 = operation.g();
            View requireView = operation.h().requireView();
            Intrinsics.checkNotNullExpressionValue(requireView, "operation.fragment.requireView()");
            g10.a(requireView, this.f43084a);
            operation.q();
        }
    }

    public abstract void d(@NotNull ArrayList arrayList, boolean z11);

    public final void e(@NotNull ArrayList operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            C7714v.p(((c) it.next()).f(), arrayList);
        }
        List U02 = C7714v.U0(C7714v.Y0(arrayList));
        int size = U02.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((a) U02.get(i11)).d(this.f43084a);
        }
        int size2 = operations.size();
        for (int i12 = 0; i12 < size2; i12++) {
            c((c) operations.get(i12));
        }
        List U03 = C7714v.U0(operations);
        int size3 = U03.size();
        for (int i13 = 0; i13 < size3; i13++) {
            c cVar = (c) U03.get(i13);
            if (cVar.f().isEmpty()) {
                cVar.d();
            }
        }
    }

    public final void f() {
        if (G.D0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        ArrayList arrayList = this.f43086c;
        x(arrayList);
        e(arrayList);
    }

    public final void h(@NotNull c.b finalState, @NotNull O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, c.a.ADDING, fragmentStateManager);
    }

    public final void i(@NotNull O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(c.b.GONE, c.a.NONE, fragmentStateManager);
    }

    public final void j(@NotNull O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(c.b.REMOVED, c.a.REMOVING, fragmentStateManager);
    }

    public final void k(@NotNull O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(c.b.VISIBLE, c.a.NONE, fragmentStateManager);
    }

    public final void l() {
        if (this.f43089f) {
            return;
        }
        if (!this.f43084a.isAttachedToWindow()) {
            o();
            this.f43088e = false;
            return;
        }
        synchronized (this.f43085b) {
            try {
                ArrayList W02 = C7714v.W0(this.f43086c);
                this.f43086c.clear();
                Iterator it = W02.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    cVar.r(!this.f43085b.isEmpty() && cVar.h().mTransitioning);
                }
                Iterator it2 = W02.iterator();
                while (it2.hasNext()) {
                    c cVar2 = (c) it2.next();
                    if (this.f43087d) {
                        if (G.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + cVar2);
                        }
                        cVar2.d();
                    } else {
                        if (G.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar2);
                        }
                        cVar2.c(this.f43084a);
                    }
                    this.f43087d = false;
                    if (!cVar2.l()) {
                        this.f43086c.add(cVar2);
                    }
                }
                if (!this.f43085b.isEmpty()) {
                    y();
                    ArrayList W03 = C7714v.W0(this.f43085b);
                    if (W03.isEmpty()) {
                        return;
                    }
                    this.f43085b.clear();
                    this.f43086c.addAll(W03);
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    d(W03, this.f43088e);
                    boolean t2 = t(W03);
                    Iterator it3 = W03.iterator();
                    boolean z11 = true;
                    while (it3.hasNext()) {
                        if (!((c) it3.next()).h().mTransitioning) {
                            z11 = false;
                        }
                    }
                    this.f43087d = z11 && !t2;
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + t2 + " \ntransition = " + z11);
                    }
                    if (!z11) {
                        x(W03);
                        e(W03);
                    } else if (t2) {
                        x(W03);
                        int size = W03.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            c((c) W03.get(i11));
                        }
                    }
                    this.f43088e = false;
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        String str;
        String str2;
        if (G.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f43084a.isAttachedToWindow();
        synchronized (this.f43085b) {
            try {
                y();
                x(this.f43085b);
                ArrayList W02 = C7714v.W0(this.f43086c);
                Iterator it = W02.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).r(false);
                }
                Iterator it2 = W02.iterator();
                while (it2.hasNext()) {
                    c cVar = (c) it2.next();
                    if (G.D0(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f43084a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + cVar);
                    }
                    cVar.c(this.f43084a);
                }
                ArrayList W03 = C7714v.W0(this.f43085b);
                Iterator it3 = W03.iterator();
                while (it3.hasNext()) {
                    ((c) it3.next()).r(false);
                }
                Iterator it4 = W03.iterator();
                while (it4.hasNext()) {
                    c cVar2 = (c) it4.next();
                    if (G.D0(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f43084a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.c(this.f43084a);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p() {
        if (this.f43089f) {
            if (G.D0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f43089f = false;
            l();
        }
    }

    public final c.a q(@NotNull O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        ComponentCallbacksC5392m k11 = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(k11, "fragmentStateManager.fragment");
        c m11 = m(k11);
        c.a i11 = m11 != null ? m11.i() : null;
        c n11 = n(k11);
        c.a i12 = n11 != null ? n11.i() : null;
        int i13 = i11 == null ? -1 : d.f43106a[i11.ordinal()];
        return (i13 == -1 || i13 == 1) ? i12 : i11;
    }

    @NotNull
    public final ViewGroup r() {
        return this.f43084a;
    }

    public final boolean u() {
        return !this.f43085b.isEmpty();
    }

    public final void v() {
        Object obj;
        synchronized (this.f43085b) {
            try {
                y();
                ArrayList arrayList = this.f43085b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    c cVar = (c) obj;
                    c.b.a aVar = c.b.Companion;
                    View view = cVar.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    aVar.getClass();
                    c.b a11 = c.b.a.a(view);
                    c.b g10 = cVar.g();
                    c.b bVar = c.b.VISIBLE;
                    if (g10 == bVar && a11 != bVar) {
                        break;
                    }
                }
                c cVar2 = (c) obj;
                ComponentCallbacksC5392m h11 = cVar2 != null ? cVar2.h() : null;
                this.f43089f = h11 != null ? h11.isPostponed() : false;
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void w(@NotNull C5035b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        if (G.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.a());
        }
        ArrayList arrayList = this.f43086c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7714v.p(((c) it.next()).f(), arrayList2);
        }
        List U02 = C7714v.U0(C7714v.Y0(arrayList2));
        int size = U02.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((a) U02.get(i11)).e(backEvent, this.f43084a);
        }
    }

    public final void z(boolean z11) {
        this.f43088e = z11;
    }
}
