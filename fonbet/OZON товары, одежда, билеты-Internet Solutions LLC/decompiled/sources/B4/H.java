package B4;

import B4.A;
import B4.C2572a;
import B4.d0;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import g.C6594f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public class H {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f2506k = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f2507a;

    /* renamed from: b, reason: collision with root package name */
    private L f2508b;

    /* renamed from: c, reason: collision with root package name */
    private String f2509c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f2510d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f2511e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.collection.a0<C2577f> f2512f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f2513g;

    /* renamed from: h, reason: collision with root package name */
    private int f2514h;

    /* renamed from: i, reason: collision with root package name */
    private String f2515i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC4008j<A> f2516j;

    public static final class a {

        /* renamed from: B4.H$a$a, reason: collision with other inner class name */
        static final class C0062a extends AbstractC7737t implements Function1<H, H> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0062a f2517b = new C0062a(1);

            @Override // kotlin.jvm.functions.Function1
            public final H invoke(H h11) {
                H it = h11;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.o();
            }
        }

        @NotNull
        public static String a(int i11, @NotNull Context context) {
            String valueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i11 <= 16777215) {
                return String.valueOf(i11);
            }
            try {
                valueOf = context.getResources().getResourceName(i11);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i11);
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                  …tring()\n                }");
            return valueOf;
        }

        @NotNull
        public static Sequence b(@NotNull H h11) {
            Intrinsics.checkNotNullParameter(h11, "<this>");
            return kotlin.sequences.l.q(h11, C0062a.f2517b);
        }
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final H f2518a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f2519b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2520c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2521d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f2522e;

        /* renamed from: f, reason: collision with root package name */
        private final int f2523f;

        public b(@NotNull H destination, Bundle bundle, boolean z11, int i11, boolean z12, int i12) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f2518a = destination;
            this.f2519b = bundle;
            this.f2520c = z11;
            this.f2521d = i11;
            this.f2522e = z12;
            this.f2523f = i12;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(@NotNull b other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z11 = this.f2520c;
            if (z11 && !other.f2520c) {
                return 1;
            }
            if (!z11 && other.f2520c) {
                return -1;
            }
            int i11 = this.f2521d - other.f2521d;
            if (i11 > 0) {
                return 1;
            }
            if (i11 < 0) {
                return -1;
            }
            Bundle bundle = other.f2519b;
            Bundle bundle2 = this.f2519b;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size();
                Intrinsics.f(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z12 = other.f2522e;
            boolean z13 = this.f2522e;
            if (z13 && !z12) {
                return 1;
            }
            if (z13 || !z12) {
                return this.f2523f - other.f2523f;
            }
            return -1;
        }

        @NotNull
        public final H b() {
            return this.f2518a;
        }

        public final Bundle c() {
            return this.f2519b;
        }
    }

    static final class c extends AbstractC7737t implements Function1<String, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f2524b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(A a11) {
            super(1);
            this.f2524b = a11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String key = str;
            Intrinsics.checkNotNullParameter(key, "key");
            return Boolean.valueOf(!this.f2524b.j().contains(key));
        }
    }

    static final class d extends AbstractC7737t implements Function0<A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f2525b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.f2525b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final A invoke() {
            A.a aVar = new A.a();
            aVar.d(this.f2525b);
            return aVar.a();
        }
    }

    static final class e extends AbstractC7737t implements Function1<String, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f2526b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(A a11) {
            super(1);
            this.f2526b = a11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String key = str;
            Intrinsics.checkNotNullParameter(key, "key");
            return Boolean.valueOf(!this.f2526b.j().contains(key));
        }
    }

    static {
        new LinkedHashMap();
    }

    public H(@NotNull b0<? extends H> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        int i11 = d0.f2612c;
        String navigatorName = d0.a.a(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f2507a = navigatorName;
        this.f2511e = new ArrayList();
        this.f2512f = new androidx.collection.a0<>(0);
        this.f2513g = new LinkedHashMap();
    }

    public final void b(@NotNull String argumentName, @NotNull C2578g argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f2513g.put(argumentName, argument);
    }

    public final void c(@NotNull A navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        ArrayList a11 = C2580i.a(this.f2513g, new c(navDeepLink));
        if (a11.isEmpty()) {
            this.f2511e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.q() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + a11).toString());
    }

    public final Bundle e(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f2513g;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((C2578g) entry.getValue()).d(bundle2, (String) entry.getKey());
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                C2578g c2578g = (C2578g) entry2.getValue();
                c2578g.getClass();
                if (!c2578g.e(bundle2, str)) {
                    StringBuilder b11 = C6594f.b("Wrong argument type for '", str, "' in argument bundle. ");
                    b11.append(c2578g.a().b());
                    b11.append(" expected.");
                    throw new IllegalArgumentException(b11.toString().toString());
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z11;
        int size;
        LinkedHashMap linkedHashMap;
        boolean z12;
        if (this != obj) {
            if (obj != null && (obj instanceof H)) {
                H h11 = (H) obj;
                boolean d11 = Intrinsics.d(this.f2511e, h11.f2511e);
                androidx.collection.a0<C2577f> a0Var = this.f2512f;
                int e11 = a0Var.e();
                androidx.collection.a0<C2577f> a0Var2 = h11.f2512f;
                if (e11 == a0Var2.e()) {
                    Iterator it = kotlin.sequences.l.b(androidx.collection.e0.a(a0Var)).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!Intrinsics.d(androidx.collection.b0.c(a0Var, intValue), androidx.collection.b0.c(a0Var2, intValue))) {
                        }
                    }
                    z11 = true;
                    LinkedHashMap linkedHashMap2 = this.f2513g;
                    size = linkedHashMap2.size();
                    linkedHashMap = h11.f2513g;
                    if (size == linkedHashMap.size()) {
                        Intrinsics.checkNotNullParameter(linkedHashMap2, "<this>");
                        Iterator<Object> it2 = C7714v.w(linkedHashMap2.entrySet()).iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            if (linkedHashMap.containsKey(entry.getKey()) && Intrinsics.d(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z12 = true;
                        if (this.f2514h == h11.f2514h || !Intrinsics.d(this.f2515i, h11.f2515i) || !d11 || !z11 || !z12) {
                        }
                    }
                    z12 = false;
                    if (this.f2514h == h11.f2514h) {
                    }
                }
                z11 = false;
                LinkedHashMap linkedHashMap22 = this.f2513g;
                size = linkedHashMap22.size();
                linkedHashMap = h11.f2513g;
                if (size == linkedHashMap.size()) {
                }
                z12 = false;
                if (this.f2514h == h11.f2514h) {
                }
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final int[] h(H h11) {
        C7704k c7704k = new C7704k();
        H h12 = this;
        while (true) {
            L l11 = h12.f2508b;
            if ((h11 != null ? h11.f2508b : null) != null) {
                L l12 = h11.f2508b;
                Intrinsics.f(l12);
                if (l12.C(h12.f2514h, l12, false) == h12) {
                    c7704k.addFirst(h12);
                    break;
                }
            }
            if (l11 == null || l11.F() != h12.f2514h) {
                c7704k.addFirst(h12);
            }
            if (Intrinsics.d(l11, h11) || l11 == null) {
                break;
            }
            h12 = l11;
        }
        List U02 = C7714v.U0(c7704k);
        ArrayList arrayList = new ArrayList(C7714v.z(U02, 10));
        Iterator it = U02.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((H) it.next()).f2514h));
        }
        return C7714v.T0(arrayList);
    }

    public int hashCode() {
        Set<String> keySet;
        int i11 = this.f2514h * 31;
        String str = this.f2515i;
        int hashCode = i11 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f2511e.iterator();
        while (it.hasNext()) {
            A a11 = (A) it.next();
            int i12 = hashCode * 31;
            String q11 = a11.q();
            int hashCode2 = (i12 + (q11 != null ? q11.hashCode() : 0)) * 31;
            String i13 = a11.i();
            int hashCode3 = (hashCode2 + (i13 != null ? i13.hashCode() : 0)) * 31;
            String o11 = a11.o();
            hashCode = hashCode3 + (o11 != null ? o11.hashCode() : 0);
        }
        androidx.collection.d0 b11 = androidx.collection.e0.b(this.f2512f);
        while (b11.hasNext()) {
            C2577f c2577f = (C2577f) b11.next();
            int b12 = (c2577f.b() + (hashCode * 31)) * 31;
            S c11 = c2577f.c();
            int hashCode4 = b12 + (c11 != null ? c11.hashCode() : 0);
            Bundle a12 = c2577f.a();
            if (a12 != null && (keySet = a12.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i14 = hashCode4 * 31;
                    Bundle a13 = c2577f.a();
                    Intrinsics.f(a13);
                    Object obj = a13.get(str2);
                    hashCode4 = i14 + (obj != null ? obj.hashCode() : 0);
                }
            }
            hashCode = hashCode4;
        }
        LinkedHashMap linkedHashMap = this.f2513g;
        for (String str3 : linkedHashMap.keySet()) {
            int a14 = G.g.a(hashCode * 31, 31, str3);
            Object obj2 = linkedHashMap.get(str3);
            hashCode = a14 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public final C2577f i(int i11) {
        C2577f c2577f;
        androidx.collection.a0<C2577f> a0Var = this.f2512f;
        if (a0Var.e() == 0) {
            c2577f = null;
        } else {
            a0Var.getClass();
            c2577f = (C2577f) androidx.collection.b0.c(a0Var, i11);
        }
        if (c2577f != null) {
            return c2577f;
        }
        L l11 = this.f2508b;
        if (l11 != null) {
            return l11.i(i11);
        }
        return null;
    }

    @NotNull
    public final Map<String, C2578g> k() {
        return kotlin.collections.U.t(this.f2513g);
    }

    @NotNull
    public String l() {
        String str = this.f2509c;
        return str == null ? String.valueOf(this.f2514h) : str;
    }

    public final int m() {
        return this.f2514h;
    }

    @NotNull
    public final String n() {
        return this.f2507a;
    }

    public final L o() {
        return this.f2508b;
    }

    public final String q() {
        return this.f2515i;
    }

    public b r(@NotNull G navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        ArrayList arrayList = this.f2511e;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        b bVar = null;
        while (it.hasNext()) {
            A a11 = (A) it.next();
            Uri c11 = navDeepLinkRequest.c();
            LinkedHashMap linkedHashMap = this.f2513g;
            Bundle k11 = c11 != null ? a11.k(c11, linkedHashMap) : null;
            int h11 = a11.h(c11);
            String a12 = navDeepLinkRequest.a();
            boolean z11 = a12 != null && a12.equals(a11.i());
            String b11 = navDeepLinkRequest.b();
            int p11 = b11 != null ? a11.p(b11) : -1;
            if (k11 == null) {
                if (z11 || p11 > -1) {
                    if (C2580i.a(linkedHashMap, new I(a11.l(c11, linkedHashMap))).isEmpty()) {
                    }
                }
            }
            b bVar2 = new b(this, k11, a11.r(), h11, z11, p11);
            if (bVar == null || bVar2.compareTo(bVar) > 0) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public final b s(@NotNull String route) {
        A value;
        Intrinsics.checkNotNullParameter(route, "route");
        InterfaceC4008j<A> interfaceC4008j = this.f2516j;
        if (interfaceC4008j == null || (value = interfaceC4008j.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(route != null ? "android-app://androidx.navigation/".concat(route) : "");
        Intrinsics.e(parse, "Uri.parse(this)");
        Bundle k11 = value.k(parse, this.f2513g);
        if (k11 == null) {
            return null;
        }
        return new b(this, k11, value.r(), value.h(parse), false, -1);
    }

    public void t(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, C4.a.f4395e);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        z(obtainAttributes.getString(2));
        if (obtainAttributes.hasValue(1)) {
            v(obtainAttributes.getResourceId(1, 0));
            this.f2509c = a.a(this.f2514h, context);
        }
        this.f2510d = obtainAttributes.getText(0);
        Unit unit = Unit.f71690a;
        obtainAttributes.recycle();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f2509c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f2514h));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f2515i;
        if (str2 != null && !kotlin.text.h.K(str2)) {
            sb2.append(" route=");
            sb2.append(this.f2515i);
        }
        if (this.f2510d != null) {
            sb2.append(" label=");
            sb2.append(this.f2510d);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }

    public final void u(int i11, @NotNull C2577f action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(this instanceof C2572a.C0063a)) {
            if (i11 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f2512f.d(i11, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i11 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void v(int i11) {
        this.f2514h = i11;
        this.f2509c = null;
    }

    public final void w(CharSequence charSequence) {
        this.f2510d = null;
    }

    public final void x(L l11) {
        this.f2508b = l11;
    }

    public final void z(String str) {
        if (str == null) {
            v(0);
        } else {
            if (kotlin.text.h.K(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String concat = "android-app://androidx.navigation/".concat(str);
            A.a aVar = new A.a();
            aVar.d(concat);
            ArrayList a11 = C2580i.a(this.f2513g, new e(aVar.a()));
            if (!a11.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + a11).toString());
            }
            this.f2516j = Sc.k.b(new d(concat));
            v(concat.hashCode());
        }
        this.f2515i = str;
    }
}
