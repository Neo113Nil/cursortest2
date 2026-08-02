package a3;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.J;
import kotlin.collections.M;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4929c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static b f36224a = b.f36225c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: a3.c$a */
    /* loaded from: classes8.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a DETECT_FRAGMENT_REUSE;
        public static final a DETECT_FRAGMENT_TAG_USAGE;
        public static final a DETECT_RETAIN_INSTANCE_USAGE;
        public static final a DETECT_SET_USER_VISIBLE_HINT;
        public static final a DETECT_TARGET_FRAGMENT_USAGE;
        public static final a DETECT_WRONG_FRAGMENT_CONTAINER;
        public static final a DETECT_WRONG_NESTED_HIERARCHY;
        public static final a PENALTY_DEATH;
        public static final a PENALTY_LOG;

        static {
            a aVar = new a("PENALTY_LOG", 0);
            PENALTY_LOG = aVar;
            a aVar2 = new a("PENALTY_DEATH", 1);
            PENALTY_DEATH = aVar2;
            a aVar3 = new a("DETECT_FRAGMENT_REUSE", 2);
            DETECT_FRAGMENT_REUSE = aVar3;
            a aVar4 = new a("DETECT_FRAGMENT_TAG_USAGE", 3);
            DETECT_FRAGMENT_TAG_USAGE = aVar4;
            a aVar5 = new a("DETECT_WRONG_NESTED_HIERARCHY", 4);
            DETECT_WRONG_NESTED_HIERARCHY = aVar5;
            a aVar6 = new a("DETECT_RETAIN_INSTANCE_USAGE", 5);
            DETECT_RETAIN_INSTANCE_USAGE = aVar6;
            a aVar7 = new a("DETECT_SET_USER_VISIBLE_HINT", 6);
            DETECT_SET_USER_VISIBLE_HINT = aVar7;
            a aVar8 = new a("DETECT_TARGET_FRAGMENT_USAGE", 7);
            DETECT_TARGET_FRAGMENT_USAGE = aVar8;
            a aVar9 = new a("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            DETECT_WRONG_FRAGMENT_CONTAINER = aVar9;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
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

    /* renamed from: a3.c$b */
    /* loaded from: classes8.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f36225c = new b(M.f71699a, U.c());

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final M f36226a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap f36227b;

        public b(@NotNull M flags, @NotNull Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f36226a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ((M) allowedViolations.entrySet()).getClass();
            J.f71696a.getClass();
            this.f36227b = linkedHashMap;
        }

        @NotNull
        public final Set<a> a() {
            return this.f36226a;
        }

        @NotNull
        public final LinkedHashMap b() {
            return this.f36227b;
        }
    }

    private static b a(ComponentCallbacksC5392m componentCallbacksC5392m) {
        while (componentCallbacksC5392m != null) {
            if (componentCallbacksC5392m.isAdded()) {
                G parentFragmentManager = componentCallbacksC5392m.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                parentFragmentManager.getClass();
            }
            componentCallbacksC5392m = componentCallbacksC5392m.getParentFragment();
        }
        return f36224a;
    }

    private static void b(b bVar, m mVar) {
        ComponentCallbacksC5392m a11 = mVar.a();
        String name = a11.getClass().getName();
        if (((M) bVar.a()).contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), mVar);
        }
        if (((M) bVar.a()).contains(a.PENALTY_DEATH)) {
            RunnableC4928b runnableC4928b = new RunnableC4928b(0, name, mVar);
            if (!a11.isAdded()) {
                runnableC4928b.run();
                throw null;
            }
            Handler g10 = a11.getParentFragmentManager().s0().g();
            if (Intrinsics.d(g10.getLooper(), Looper.myLooper())) {
                runnableC4928b.run();
                throw null;
            }
            g10.post(runnableC4928b);
        }
    }

    private static void c(m mVar) {
        if (G.D0(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(mVar.a().getClass().getName()), mVar);
        }
    }

    public static final void d(@NotNull ComponentCallbacksC5392m fragment, @NotNull String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        C4927a c4927a = new C4927a(fragment, previousFragmentId);
        c(c4927a);
        b a11 = a(fragment);
        if (((M) a11.a()).contains(a.DETECT_FRAGMENT_REUSE) && n(a11, fragment.getClass(), C4927a.class)) {
            b(a11, c4927a);
        }
    }

    public static final void e(@NotNull ComponentCallbacksC5392m fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C4930d c4930d = new C4930d(fragment, viewGroup);
        c(c4930d);
        b a11 = a(fragment);
        if (((M) a11.a()).contains(a.DETECT_FRAGMENT_TAG_USAGE) && n(a11, fragment.getClass(), C4930d.class)) {
            b(a11, c4930d);
        }
    }

    public static final void f(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C4931e c4931e = new C4931e(fragment);
        c(c4931e);
        b a11 = a(fragment);
        if (((M) a11.a()).contains(a.DETECT_RETAIN_INSTANCE_USAGE) && n(a11, fragment.getClass(), C4931e.class)) {
            b(a11, c4931e);
        }
    }

    public static final void g(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C4932f c4932f = new C4932f(fragment);
        c(c4932f);
        b a11 = a(fragment);
        if (((M) a11.a()).contains(a.DETECT_TARGET_FRAGMENT_USAGE) && n(a11, fragment.getClass(), C4932f.class)) {
            b(a11, c4932f);
        }
    }

    public static final void h(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        g gVar = new g(fragment);
        c(gVar);
        b a11 = a(fragment);
        if (((M) a11.a()).contains(a.DETECT_TARGET_FRAGMENT_USAGE) && n(a11, fragment.getClass(), g.class)) {
            b(a11, gVar);
        }
    }

    public static final void i(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        i iVar = new i(fragment);
        c(iVar);
        b a11 = a(fragment);
        if (((M) a11.a()).contains(a.DETECT_RETAIN_INSTANCE_USAGE) && n(a11, fragment.getClass(), i.class)) {
            b(a11, iVar);
        }
    }

    public static final void j(@NotNull ComponentCallbacksC5392m violatingFragment, @NotNull ComponentCallbacksC5392m targetFragment, int i11) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        j jVar = new j(violatingFragment, targetFragment, i11);
        c(jVar);
        b a11 = a(violatingFragment);
        if (((M) a11.a()).contains(a.DETECT_TARGET_FRAGMENT_USAGE) && n(a11, violatingFragment.getClass(), j.class)) {
            b(a11, jVar);
        }
    }

    public static final void k(@NotNull ComponentCallbacksC5392m fragment, boolean z11) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        k kVar = new k(fragment, z11);
        c(kVar);
        b a11 = a(fragment);
        if (((M) a11.a()).contains(a.DETECT_SET_USER_VISIBLE_HINT) && n(a11, fragment.getClass(), k.class)) {
            b(a11, kVar);
        }
    }

    public static final void l(@NotNull ComponentCallbacksC5392m fragment, @NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        n nVar = new n(fragment, container);
        c(nVar);
        b a11 = a(fragment);
        if (((M) a11.a()).contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && n(a11, fragment.getClass(), n.class)) {
            b(a11, nVar);
        }
    }

    public static final void m(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComponentCallbacksC5392m expectedParentFragment, int i11) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        o oVar = new o(fragment, expectedParentFragment, i11);
        c(oVar);
        b a11 = a(fragment);
        if (((M) a11.a()).contains(a.DETECT_WRONG_NESTED_HIERARCHY) && n(a11, fragment.getClass(), o.class)) {
            b(a11, oVar);
        }
    }

    private static boolean n(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.b().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.d(cls2.getSuperclass(), m.class) || !C7714v.A(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
