package B4;

import B4.H;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import gd.InterfaceC6712a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public class L extends H implements Iterable<H>, InterfaceC6712a {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f2535p = 0;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.collection.a0<H> f2536l;

    /* renamed from: m, reason: collision with root package name */
    private int f2537m;

    /* renamed from: n, reason: collision with root package name */
    private String f2538n;

    /* renamed from: o, reason: collision with root package name */
    private String f2539o;

    public static final class a implements Iterator<H>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private int f2540a = -1;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2541b;

        a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f2540a + 1 < L.this.D().e();
        }

        @Override // java.util.Iterator
        public final H next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f2541b = true;
            androidx.collection.a0<H> D11 = L.this.D();
            int i11 = this.f2540a + 1;
            this.f2540a = i11;
            return D11.f(i11);
        }

        @Override // java.util.Iterator
        public final void remove() {
            Object obj;
            Object obj2;
            if (!this.f2541b) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            androidx.collection.a0<H> D11 = L.this.D();
            D11.f(this.f2540a).x(null);
            int i11 = this.f2540a;
            Object obj3 = D11.f38686c[i11];
            obj = androidx.collection.b0.f38692a;
            if (obj3 != obj) {
                Object[] objArr = D11.f38686c;
                obj2 = androidx.collection.b0.f38692a;
                objArr[i11] = obj2;
                D11.f38684a = true;
            }
            this.f2540a--;
            this.f2541b = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(@NotNull O navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f2536l = new androidx.collection.a0<>(0);
    }

    private final void L(int i11) {
        if (i11 != m()) {
            if (this.f2539o != null) {
                M(null);
            }
            this.f2537m = i11;
            this.f2538n = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i11 + " cannot use the same id as the graph " + this).toString());
    }

    private final void M(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else {
            if (str.equals(q())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (kotlin.text.h.K(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.f2537m = hashCode;
        this.f2539o = str;
    }

    public final void A(@NotNull H node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int m11 = node.m();
        String q11 = node.q();
        if (m11 == 0 && q11 == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (q() != null && Intrinsics.d(q11, q())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (m11 == m()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        androidx.collection.a0<H> a0Var = this.f2536l;
        a0Var.getClass();
        H h11 = (H) androidx.collection.b0.c(a0Var, m11);
        if (h11 == node) {
            return;
        }
        if (node.o() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (h11 != null) {
            h11.x(null);
        }
        node.x(this);
        a0Var.d(node.m(), node);
    }

    public final H B(@NotNull String route, boolean z11) {
        Object obj;
        Intrinsics.checkNotNullParameter(route, "route");
        Iterator it = kotlin.sequences.l.b(androidx.collection.e0.b(this.f2536l)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            H h11 = (H) obj;
            if (kotlin.text.h.D(h11.q(), route, false) || h11.s(route) != null) {
                break;
            }
        }
        H h12 = (H) obj;
        if (h12 != null) {
            return h12;
        }
        if (z11 && o() != null) {
            L o11 = o();
            Intrinsics.f(o11);
            if (route != null && !kotlin.text.h.K(route)) {
                return o11.B(route, true);
            }
        }
        return null;
    }

    public final H C(int i11, H h11, boolean z11) {
        androidx.collection.a0<H> a0Var = this.f2536l;
        a0Var.getClass();
        H h12 = (H) androidx.collection.b0.c(a0Var, i11);
        if (h12 != null) {
            return h12;
        }
        if (z11) {
            Iterator it = kotlin.sequences.l.b(androidx.collection.e0.b(a0Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    h12 = null;
                    break;
                }
                H h13 = (H) it.next();
                h12 = (!(h13 instanceof L) || Intrinsics.d(h13, h11)) ? null : ((L) h13).C(i11, this, true);
                if (h12 != null) {
                    break;
                }
            }
        }
        if (h12 != null) {
            return h12;
        }
        if (o() == null || Intrinsics.d(o(), h11)) {
            return null;
        }
        L o11 = o();
        Intrinsics.f(o11);
        return o11.C(i11, this, z11);
    }

    @NotNull
    public final androidx.collection.a0<H> D() {
        return this.f2536l;
    }

    @NotNull
    public final String E() {
        if (this.f2538n == null) {
            String str = this.f2539o;
            if (str == null) {
                str = String.valueOf(this.f2537m);
            }
            this.f2538n = str;
        }
        String str2 = this.f2538n;
        Intrinsics.f(str2);
        return str2;
    }

    public final int F() {
        return this.f2537m;
    }

    public final String G() {
        return this.f2539o;
    }

    public final H.b H(@NotNull G navDeepLinkRequest, boolean z11, @NotNull L lastVisited) {
        H.b bVar;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        H.b r11 = super.r(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            H h11 = (H) aVar.next();
            bVar = Intrinsics.d(h11, lastVisited) ? null : h11.r(navDeepLinkRequest);
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        H.b bVar2 = (H.b) C7714v.d0(arrayList);
        L o11 = o();
        if (o11 != null && z11 && !o11.equals(lastVisited)) {
            bVar = o11.H(navDeepLinkRequest, true, this);
        }
        H.b[] elements = {r11, bVar2, bVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (H.b) C7714v.d0(C7705l.B(elements));
    }

    public final H.b I(@NotNull String route, boolean z11, @NotNull L lastVisited) {
        H.b bVar;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        H.b s11 = s(route);
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            H h11 = (H) aVar.next();
            bVar = Intrinsics.d(h11, lastVisited) ? null : h11 instanceof L ? ((L) h11).I(route, false, this) : h11.s(route);
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        H.b bVar2 = (H.b) C7714v.d0(arrayList);
        L o11 = o();
        if (o11 != null && z11 && !o11.equals(lastVisited)) {
            bVar = o11.I(route, true, this);
        }
        H.b[] elements = {s11, bVar2, bVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (H.b) C7714v.d0(C7705l.B(elements));
    }

    public final void J(int i11) {
        L(i11);
    }

    public final void K(@NotNull String startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        M(startDestRoute);
    }

    @Override // B4.H
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof L) || !super.equals(obj)) {
            return false;
        }
        androidx.collection.a0<H> a0Var = this.f2536l;
        int e11 = a0Var.e();
        L l11 = (L) obj;
        androidx.collection.a0<H> a0Var2 = l11.f2536l;
        if (e11 != a0Var2.e() || this.f2537m != l11.f2537m) {
            return false;
        }
        Iterator it = kotlin.sequences.l.b(androidx.collection.e0.b(a0Var)).iterator();
        while (it.hasNext()) {
            H h11 = (H) it.next();
            if (!h11.equals(androidx.collection.b0.c(a0Var2, h11.m()))) {
                return false;
            }
        }
        return true;
    }

    @Override // B4.H
    public final int hashCode() {
        int i11 = this.f2537m;
        androidx.collection.a0<H> a0Var = this.f2536l;
        int e11 = a0Var.e();
        for (int i12 = 0; i12 < e11; i12++) {
            i11 = (((i11 * 31) + a0Var.c(i12)) * 31) + a0Var.f(i12).hashCode();
        }
        return i11;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<H> iterator() {
        return new a();
    }

    @Override // B4.H
    @NotNull
    public final String l() {
        return m() != 0 ? super.l() : "the root navigation";
    }

    @Override // B4.H
    public final H.b r(@NotNull G navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return H(navDeepLinkRequest, false, this);
    }

    @Override // B4.H
    public final void t(@NotNull Context context, @NotNull AttributeSet attrs) {
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.t(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, C4.a.f4394d);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        L(obtainAttributes.getResourceId(0, 0));
        int i11 = this.f2537m;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i11 <= 16777215) {
            valueOf = String.valueOf(i11);
        } else {
            try {
                valueOf = context.getResources().getResourceName(i11);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i11);
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                  …tring()\n                }");
        }
        this.f2538n = valueOf;
        Unit unit = Unit.f71690a;
        obtainAttributes.recycle();
    }

    @Override // B4.H
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str = this.f2539o;
        H B11 = (str == null || kotlin.text.h.K(str)) ? null : B(str, true);
        if (B11 == null) {
            B11 = C(this.f2537m, this, false);
        }
        sb2.append(" startDestination=");
        if (B11 == null) {
            String str2 = this.f2539o;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = this.f2538n;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f2537m));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(B11.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
