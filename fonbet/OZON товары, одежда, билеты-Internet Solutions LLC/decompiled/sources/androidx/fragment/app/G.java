package androidx.fragment.app;

import Bk.C2638a;
import C.o0;
import M4.c;
import a3.C4929c;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C5035b;
import androidx.annotation.NonNull;
import androidx.core.view.InterfaceC5348w;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.AbstractC6595g;
import g.C6589a;
import g.C6594f;
import g.C6598j;
import g.C6600l;
import g.InterfaceC6590b;
import g.InterfaceC6599k;
import h.AbstractC6755a;
import h.C6762h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import x2.InterfaceC10646a;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: A, reason: collision with root package name */
    ComponentCallbacksC5392m f42853A;

    /* renamed from: D, reason: collision with root package name */
    private C6598j f42856D;

    /* renamed from: E, reason: collision with root package name */
    private C6598j f42857E;

    /* renamed from: F, reason: collision with root package name */
    private C6598j f42858F;

    /* renamed from: H, reason: collision with root package name */
    private boolean f42860H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f42861I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f42862J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f42863K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f42864L;

    /* renamed from: M, reason: collision with root package name */
    private ArrayList<C5380a> f42865M;

    /* renamed from: N, reason: collision with root package name */
    private ArrayList<Boolean> f42866N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList<ComponentCallbacksC5392m> f42867O;

    /* renamed from: P, reason: collision with root package name */
    private J f42868P;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42871b;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<ComponentCallbacksC5392m> f42874e;

    /* renamed from: g, reason: collision with root package name */
    private androidx.activity.J f42876g;

    /* renamed from: x, reason: collision with root package name */
    private AbstractC5401w<?> f42893x;

    /* renamed from: y, reason: collision with root package name */
    private AbstractC5398t f42894y;

    /* renamed from: z, reason: collision with root package name */
    private ComponentCallbacksC5392m f42895z;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<q> f42870a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final P f42872c = new P();

    /* renamed from: d, reason: collision with root package name */
    ArrayList<C5380a> f42873d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final LayoutInflaterFactory2C5403y f42875f = new LayoutInflaterFactory2C5403y(this);

    /* renamed from: h, reason: collision with root package name */
    C5380a f42877h = null;

    /* renamed from: i, reason: collision with root package name */
    boolean f42878i = false;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.activity.C f42879j = new b();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f42880k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, C5382c> f42881l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    private final Map<String, Bundle> f42882m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final Map<String, o> f42883n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o, reason: collision with root package name */
    ArrayList<p> f42884o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    private final C5404z f42885p = new C5404z(this);

    /* renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList<K> f42886q = new CopyOnWriteArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    private final A f42887r = new InterfaceC10646a() { // from class: androidx.fragment.app.A
        @Override // x2.InterfaceC10646a
        public final void accept(Object obj) {
            G.d(G.this, (Configuration) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final B f42888s = new InterfaceC10646a() { // from class: androidx.fragment.app.B
        @Override // x2.InterfaceC10646a
        public final void accept(Object obj) {
            G.a(G.this, (Integer) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final C f42889t = new InterfaceC10646a() { // from class: androidx.fragment.app.C
        @Override // x2.InterfaceC10646a
        public final void accept(Object obj) {
            G.c(G.this, (androidx.core.app.i) obj);
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private final D f42890u = new InterfaceC10646a() { // from class: androidx.fragment.app.D
        @Override // x2.InterfaceC10646a
        public final void accept(Object obj) {
            G.b(G.this, (androidx.core.app.r) obj);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC5348w f42891v = new c();

    /* renamed from: w, reason: collision with root package name */
    int f42892w = -1;

    /* renamed from: B, reason: collision with root package name */
    private C5400v f42854B = new d();

    /* renamed from: C, reason: collision with root package name */
    private e f42855C = new e();

    /* renamed from: G, reason: collision with root package name */
    ArrayDeque<n> f42859G = new ArrayDeque<>();

    /* renamed from: Q, reason: collision with root package name */
    private Runnable f42869Q = new f();

    final class a implements InterfaceC6590b<Map<String, Boolean>> {
        a() {
        }

        @Override // g.InterfaceC6590b
        public final void onActivityResult(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Boolean) arrayList.get(i11)).booleanValue() ? 0 : -1;
            }
            G g10 = G.this;
            n pollFirst = g10.f42859G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            P p11 = g10.f42872c;
            String str = pollFirst.f42908a;
            ComponentCallbacksC5392m i12 = p11.i(str);
            if (i12 != null) {
                i12.onRequestPermissionsResult(pollFirst.f42909b, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    final class b extends androidx.activity.C {
        b() {
            super(false);
        }

        @Override // androidx.activity.C
        public final void handleOnBackCancelled() {
            boolean D02 = G.D0(3);
            final G g10 = G.this;
            if (D02) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + g10);
            }
            if (G.D0(3)) {
                Log.d("FragmentManager", "cancelBackStackTransition for transition " + g10.f42877h);
            }
            C5380a c5380a = g10.f42877h;
            if (c5380a != null) {
                c5380a.f43014s = false;
                c5380a.A();
                C5380a c5380a2 = g10.f42877h;
                Runnable runnable = new Runnable() { // from class: androidx.fragment.app.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<G.p> it = G.this.f42884o.iterator();
                        while (it.hasNext()) {
                            it.next().getClass();
                        }
                    }
                };
                if (c5380a2.f42979q == null) {
                    c5380a2.f42979q = new ArrayList<>();
                }
                c5380a2.f42979q.add(runnable);
                g10.f42877h.i();
                g10.f42878i = true;
                g10.c0();
                g10.f42878i = false;
                g10.f42877h = null;
            }
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            boolean D02 = G.D0(3);
            G g10 = G.this;
            if (D02) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + g10);
            }
            g10.z0();
        }

        @Override // androidx.activity.C
        public final void handleOnBackProgressed(@NonNull C5035b c5035b) {
            boolean D02 = G.D0(2);
            G g10 = G.this;
            if (D02) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + g10);
            }
            if (g10.f42877h != null) {
                Iterator it = g10.u(new ArrayList(Collections.singletonList(g10.f42877h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((f0) it.next()).w(c5035b);
                }
                Iterator<p> it2 = g10.f42884o.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        }

        @Override // androidx.activity.C
        public final void handleOnBackStarted(@NonNull C5035b c5035b) {
            boolean D02 = G.D0(3);
            G g10 = G.this;
            if (D02) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + g10);
            }
            g10.W();
            g10.X(g10.new s(), false);
        }
    }

    final class c implements InterfaceC5348w {
        c() {
        }

        @Override // androidx.core.view.InterfaceC5348w
        public final void a(@NonNull Menu menu) {
            G.this.K(menu);
        }

        @Override // androidx.core.view.InterfaceC5348w
        public final void b(@NonNull Menu menu) {
            G.this.O(menu);
        }

        @Override // androidx.core.view.InterfaceC5348w
        public final void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            G.this.C(menu, menuInflater);
        }

        @Override // androidx.core.view.InterfaceC5348w
        public final boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
            return G.this.J(menuItem);
        }
    }

    final class d extends C5400v {
        d() {
        }

        @Override // androidx.fragment.app.C5400v
        @NonNull
        public final ComponentCallbacksC5392m a(@NonNull ClassLoader classLoader, @NonNull String str) {
            G g10 = G.this;
            AbstractC5401w<?> s02 = g10.s0();
            Context e11 = g10.s0().e();
            s02.getClass();
            return ComponentCallbacksC5392m.instantiate(e11, str, null);
        }
    }

    final class e implements g0 {
    }

    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            G.this.Z(true);
        }
    }

    /* loaded from: classes8.dex */
    final class g implements androidx.lifecycle.G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f42902b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v f42903c;

        g(String str, M m11, AbstractC5434v abstractC5434v) {
            this.f42901a = str;
            this.f42902b = m11;
            this.f42903c = abstractC5434v;
        }

        @Override // androidx.lifecycle.G
        public final void onStateChanged(@NonNull androidx.lifecycle.J j11, @NonNull AbstractC5434v.a aVar) {
            Bundle bundle;
            AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_START;
            G g10 = G.this;
            String str = this.f42901a;
            if (aVar == aVar2 && (bundle = (Bundle) g10.f42882m.get(str)) != null) {
                this.f42902b.f(bundle, str);
                g10.r(str);
            }
            if (aVar == AbstractC5434v.a.ON_DESTROY) {
                this.f42903c.e(this);
                g10.f42883n.remove(str);
            }
        }
    }

    final class h implements K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f42905a;

        h(ComponentCallbacksC5392m componentCallbacksC5392m) {
            this.f42905a = componentCallbacksC5392m;
        }

        @Override // androidx.fragment.app.K
        public final void a(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
            this.f42905a.onAttachFragment(componentCallbacksC5392m);
        }
    }

    final class i implements InterfaceC6590b<C6589a> {
        i() {
        }

        @Override // g.InterfaceC6590b
        public final void onActivityResult(C6589a c6589a) {
            C6589a c6589a2 = c6589a;
            G g10 = G.this;
            n pollLast = g10.f42859G.pollLast();
            if (pollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            P p11 = g10.f42872c;
            String str = pollLast.f42908a;
            ComponentCallbacksC5392m i11 = p11.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            } else {
                i11.onActivityResult(pollLast.f42909b, c6589a2.b(), c6589a2.a());
            }
        }
    }

    final class j implements InterfaceC6590b<C6589a> {
        j() {
        }

        @Override // g.InterfaceC6590b
        public final void onActivityResult(C6589a c6589a) {
            C6589a c6589a2 = c6589a;
            G g10 = G.this;
            n pollFirst = g10.f42859G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            P p11 = g10.f42872c;
            String str = pollFirst.f42908a;
            ComponentCallbacksC5392m i11 = p11.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            } else {
                i11.onActivityResult(pollFirst.f42909b, c6589a2.b(), c6589a2.a());
            }
        }
    }

    public interface k {
        int getId();

        String getName();
    }

    static class l extends AbstractC6755a<C6600l, C6589a> {
        @Override // h.AbstractC6755a
        @NonNull
        public final Intent a(@NonNull Context context, C6600l c6600l) {
            Bundle bundleExtra;
            C6600l c6600l2 = c6600l;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a11 = c6600l2.a();
            if (a11 != null && (bundleExtra = a11.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a11.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a11.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    C6600l.a aVar = new C6600l.a(c6600l2.d());
                    aVar.b(null);
                    aVar.c(c6600l2.c(), c6600l2.b());
                    c6600l2 = aVar.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c6600l2);
            if (G.D0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // h.AbstractC6755a
        @NonNull
        public final C6589a c(int i11, Intent intent) {
            return new C6589a(i11, intent);
        }
    }

    public static abstract class m {
        @Deprecated
        public void onFragmentActivityCreated(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, Bundle bundle) {
        }

        public void onFragmentAttached(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull Context context) {
        }

        public void onFragmentCreated(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, Bundle bundle) {
        }

        public void onFragmentDestroyed(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        }

        public void onFragmentDetached(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        }

        public void onFragmentPaused(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        }

        public void onFragmentPreAttached(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull Context context) {
        }

        public void onFragmentPreCreated(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, Bundle bundle) {
        }

        public void onFragmentResumed(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        }

        public void onFragmentSaveInstanceState(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull Bundle bundle) {
        }

        public void onFragmentStarted(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        }

        public void onFragmentStopped(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        }

        public void onFragmentViewCreated(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes8.dex */
    static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        String f42908a;

        /* renamed from: b, reason: collision with root package name */
        int f42909b;

        final class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            public final n createFromParcel(Parcel parcel) {
                n nVar = new n();
                nVar.f42908a = parcel.readString();
                nVar.f42909b = parcel.readInt();
                return nVar;
            }

            @Override // android.os.Parcelable.Creator
            public final n[] newArray(int i11) {
                return new n[i11];
            }
        }

        n(@NonNull String str, int i11) {
            this.f42908a = str;
            this.f42909b = i11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f42908a);
            parcel.writeInt(this.f42909b);
        }
    }

    /* loaded from: classes8.dex */
    private static class o implements M {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5434v f42910a;

        /* renamed from: b, reason: collision with root package name */
        private final M f42911b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.lifecycle.G f42912c;

        o(@NonNull AbstractC5434v abstractC5434v, @NonNull M m11, @NonNull androidx.lifecycle.G g10) {
            this.f42910a = abstractC5434v;
            this.f42911b = m11;
            this.f42912c = g10;
        }

        public final boolean a(AbstractC5434v.b bVar) {
            return this.f42910a.b().a(bVar);
        }

        public final void b() {
            this.f42910a.e(this.f42912c);
        }

        @Override // androidx.fragment.app.M
        public final void f(@NonNull Bundle bundle, @NonNull String str) {
            this.f42911b.f(bundle, str);
        }
    }

    public interface p {
        default void a(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11) {
        }

        default void onBackStackChangeStarted(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11) {
        }

        void onBackStackChanged();
    }

    interface q {
        boolean a(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    class r implements q {

        /* renamed from: a, reason: collision with root package name */
        final String f42913a;

        /* renamed from: b, reason: collision with root package name */
        final int f42914b;

        /* renamed from: c, reason: collision with root package name */
        final int f42915c;

        r(String str, int i11, int i12) {
            this.f42913a = str;
            this.f42914b = i11;
            this.f42915c = i12;
        }

        @Override // androidx.fragment.app.G.q
        public final boolean a(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            ComponentCallbacksC5392m componentCallbacksC5392m = G.this.f42853A;
            if (componentCallbacksC5392m == null || this.f42914b >= 0 || this.f42913a != null || !componentCallbacksC5392m.getChildFragmentManager().S0()) {
                return G.this.V0(arrayList, arrayList2, this.f42913a, this.f42914b, this.f42915c);
            }
            return false;
        }
    }

    /* loaded from: classes8.dex */
    class s implements q {
        s() {
        }

        @Override // androidx.fragment.app.G.q
        public final boolean a(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            G g10 = G.this;
            boolean W02 = g10.W0(arrayList, arrayList2);
            if (!g10.f42884o.isEmpty() && arrayList.size() > 0) {
                boolean booleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<C5380a> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(G.j0(it.next()));
                }
                Iterator<p> it2 = g10.f42884o.iterator();
                while (it2.hasNext()) {
                    p next = it2.next();
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        next.onBackStackChangeStarted((ComponentCallbacksC5392m) it3.next(), booleanValue);
                    }
                }
            }
            return W02;
        }
    }

    /* loaded from: classes8.dex */
    private class t implements q {

        /* renamed from: a, reason: collision with root package name */
        private final String f42918a;

        t(@NonNull String str) {
            this.f42918a = str;
        }

        @Override // androidx.fragment.app.G.q
        public final boolean a(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return G.this.e1(arrayList, arrayList2, this.f42918a);
        }
    }

    /* loaded from: classes8.dex */
    private class u implements q {

        /* renamed from: a, reason: collision with root package name */
        private final String f42920a;

        u(@NonNull String str) {
            this.f42920a = str;
        }

        @Override // androidx.fragment.app.G.q
        public final boolean a(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return G.this.i1(arrayList, arrayList2, this.f42920a);
        }
    }

    public static boolean D0(int i11) {
        return Log.isLoggable("FragmentManager", i11);
    }

    private static boolean E0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (componentCallbacksC5392m.mHasMenu && componentCallbacksC5392m.mMenuVisible) {
            return true;
        }
        Iterator it = componentCallbacksC5392m.mChildFragmentManager.f42872c.l().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            ComponentCallbacksC5392m componentCallbacksC5392m2 = (ComponentCallbacksC5392m) it.next();
            if (componentCallbacksC5392m2 != null) {
                z11 = E0(componentCallbacksC5392m2);
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    private boolean F0() {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42895z;
        if (componentCallbacksC5392m == null) {
            return true;
        }
        return componentCallbacksC5392m.isAdded() && this.f42895z.getParentFragmentManager().F0();
    }

    static boolean G0(ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (componentCallbacksC5392m == null) {
            return true;
        }
        G g10 = componentCallbacksC5392m.mFragmentManager;
        return componentCallbacksC5392m.equals(g10.f42853A) && G0(g10.f42895z);
    }

    private void L(ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (componentCallbacksC5392m != null) {
            if (componentCallbacksC5392m.equals(this.f42872c.f(componentCallbacksC5392m.mWho))) {
                componentCallbacksC5392m.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    private void S(int i11) {
        try {
            this.f42871b = true;
            this.f42872c.d(i11);
            L0(i11, false);
            Iterator it = t().iterator();
            while (it.hasNext()) {
                ((f0) it.next()).o();
            }
            this.f42871b = false;
            Z(true);
        } catch (Throwable th2) {
            this.f42871b = false;
            throw th2;
        }
    }

    private boolean T0(int i11, int i12, String str) {
        Z(false);
        Y(true);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42853A;
        if (componentCallbacksC5392m != null && i11 < 0 && str == null && componentCallbacksC5392m.getChildFragmentManager().S0()) {
            return true;
        }
        boolean V02 = V0(this.f42865M, this.f42866N, str, i11, i12);
        if (V02) {
            this.f42871b = true;
            try {
                b1(this.f42865M, this.f42866N);
            } finally {
                q();
            }
        }
        u1();
        boolean z11 = this.f42864L;
        P p11 = this.f42872c;
        if (z11) {
            this.f42864L = false;
            Iterator it = p11.k().iterator();
            while (it.hasNext()) {
                O0((O) it.next());
            }
        }
        p11.b();
        return V02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).o();
        }
    }

    private void Y(boolean z11) {
        if (this.f42871b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f42893x == null) {
            if (!this.f42863K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f42893x.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z11 && H0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f42865M == null) {
            this.f42865M = new ArrayList<>();
            this.f42866N = new ArrayList<>();
        }
    }

    public static /* synthetic */ void a(G g10, Integer num) {
        if (g10.F0() && num.intValue() == 80) {
            g10.F(false);
        }
    }

    public static /* synthetic */ void b(G g10, androidx.core.app.r rVar) {
        if (g10.F0()) {
            g10.N(rVar.a(), false);
        }
    }

    private void b0(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i11, int i12) {
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        int i15;
        int i16;
        boolean z13;
        int i17;
        int i18;
        int i19 = i11;
        boolean z14 = arrayList.get(i19).f42978p;
        ArrayList<ComponentCallbacksC5392m> arrayList3 = this.f42867O;
        if (arrayList3 == null) {
            this.f42867O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        ArrayList<ComponentCallbacksC5392m> arrayList4 = this.f42867O;
        P p11 = this.f42872c;
        arrayList4.addAll(p11.o());
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42853A;
        int i21 = i19;
        boolean z15 = false;
        while (true) {
            int i22 = 1;
            if (i21 >= i12) {
                boolean z16 = z14;
                boolean z17 = z15;
                this.f42867O.clear();
                if (!z16 && this.f42892w >= 1) {
                    for (int i23 = i19; i23 < i12; i23++) {
                        Iterator<Q.a> it = arrayList.get(i23).f42963a.iterator();
                        while (it.hasNext()) {
                            ComponentCallbacksC5392m componentCallbacksC5392m2 = it.next().f42981b;
                            if (componentCallbacksC5392m2 != null && componentCallbacksC5392m2.mFragmentManager != null) {
                                p11.r(v(componentCallbacksC5392m2));
                            }
                        }
                    }
                }
                int i24 = i19;
                while (i24 < i12) {
                    C5380a c5380a = arrayList.get(i24);
                    if (arrayList2.get(i24).booleanValue()) {
                        c5380a.z(-1);
                        ArrayList<Q.a> arrayList5 = c5380a.f42963a;
                        boolean z18 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            Q.a aVar = arrayList5.get(size);
                            ComponentCallbacksC5392m componentCallbacksC5392m3 = aVar.f42981b;
                            if (componentCallbacksC5392m3 != null) {
                                componentCallbacksC5392m3.mBeingSaved = c5380a.f43016u;
                                componentCallbacksC5392m3.setPopDirection(z18);
                                int i25 = c5380a.f42968f;
                                int i26 = 8194;
                                int i27 = 4097;
                                if (i25 != 4097) {
                                    if (i25 != 8194) {
                                        i26 = 4100;
                                        i27 = 8197;
                                        if (i25 != 8197) {
                                            if (i25 == 4099) {
                                                i26 = 4099;
                                            } else if (i25 != 4100) {
                                                i26 = 0;
                                            }
                                        }
                                    }
                                    i26 = i27;
                                }
                                componentCallbacksC5392m3.setNextTransition(i26);
                                componentCallbacksC5392m3.setSharedElementNames(c5380a.f42977o, c5380a.f42976n);
                            }
                            int i28 = aVar.f42980a;
                            G g10 = c5380a.f43013r;
                            switch (i28) {
                                case 1:
                                    componentCallbacksC5392m3.setAnimations(aVar.f42983d, aVar.f42984e, aVar.f42985f, aVar.f42986g);
                                    z18 = true;
                                    g10.l1(componentCallbacksC5392m3, true);
                                    g10.Z0(componentCallbacksC5392m3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f42980a);
                                case 3:
                                    componentCallbacksC5392m3.setAnimations(aVar.f42983d, aVar.f42984e, aVar.f42985f, aVar.f42986g);
                                    g10.i(componentCallbacksC5392m3);
                                    z18 = true;
                                case 4:
                                    componentCallbacksC5392m3.setAnimations(aVar.f42983d, aVar.f42984e, aVar.f42985f, aVar.f42986g);
                                    g10.getClass();
                                    r1(componentCallbacksC5392m3);
                                    z18 = true;
                                case 5:
                                    componentCallbacksC5392m3.setAnimations(aVar.f42983d, aVar.f42984e, aVar.f42985f, aVar.f42986g);
                                    g10.l1(componentCallbacksC5392m3, true);
                                    g10.A0(componentCallbacksC5392m3);
                                    z18 = true;
                                case 6:
                                    componentCallbacksC5392m3.setAnimations(aVar.f42983d, aVar.f42984e, aVar.f42985f, aVar.f42986g);
                                    g10.o(componentCallbacksC5392m3);
                                    z18 = true;
                                case 7:
                                    componentCallbacksC5392m3.setAnimations(aVar.f42983d, aVar.f42984e, aVar.f42985f, aVar.f42986g);
                                    g10.l1(componentCallbacksC5392m3, true);
                                    g10.w(componentCallbacksC5392m3);
                                    z18 = true;
                                case 8:
                                    g10.p1(null);
                                    z18 = true;
                                case 9:
                                    g10.p1(componentCallbacksC5392m3);
                                    z18 = true;
                                case 10:
                                    aVar.f42988i = componentCallbacksC5392m3.mMaxState;
                                    g10.o1(componentCallbacksC5392m3, aVar.f42987h);
                                    z18 = true;
                            }
                        }
                    } else {
                        c5380a.z(1);
                        ArrayList<Q.a> arrayList6 = c5380a.f42963a;
                        int size2 = arrayList6.size();
                        int i29 = 0;
                        while (i29 < size2) {
                            Q.a aVar2 = arrayList6.get(i29);
                            ComponentCallbacksC5392m componentCallbacksC5392m4 = aVar2.f42981b;
                            if (componentCallbacksC5392m4 != null) {
                                componentCallbacksC5392m4.mBeingSaved = c5380a.f43016u;
                                componentCallbacksC5392m4.setPopDirection(false);
                                componentCallbacksC5392m4.setNextTransition(c5380a.f42968f);
                                componentCallbacksC5392m4.setSharedElementNames(c5380a.f42976n, c5380a.f42977o);
                            }
                            int i31 = aVar2.f42980a;
                            G g11 = c5380a.f43013r;
                            switch (i31) {
                                case 1:
                                    i13 = i24;
                                    componentCallbacksC5392m4.setAnimations(aVar2.f42983d, aVar2.f42984e, aVar2.f42985f, aVar2.f42986g);
                                    g11.l1(componentCallbacksC5392m4, false);
                                    g11.i(componentCallbacksC5392m4);
                                    i29++;
                                    i24 = i13;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar2.f42980a);
                                case 3:
                                    i13 = i24;
                                    componentCallbacksC5392m4.setAnimations(aVar2.f42983d, aVar2.f42984e, aVar2.f42985f, aVar2.f42986g);
                                    g11.Z0(componentCallbacksC5392m4);
                                    i29++;
                                    i24 = i13;
                                case 4:
                                    i13 = i24;
                                    componentCallbacksC5392m4.setAnimations(aVar2.f42983d, aVar2.f42984e, aVar2.f42985f, aVar2.f42986g);
                                    g11.A0(componentCallbacksC5392m4);
                                    i29++;
                                    i24 = i13;
                                case 5:
                                    i13 = i24;
                                    componentCallbacksC5392m4.setAnimations(aVar2.f42983d, aVar2.f42984e, aVar2.f42985f, aVar2.f42986g);
                                    g11.l1(componentCallbacksC5392m4, false);
                                    r1(componentCallbacksC5392m4);
                                    i29++;
                                    i24 = i13;
                                case 6:
                                    i13 = i24;
                                    componentCallbacksC5392m4.setAnimations(aVar2.f42983d, aVar2.f42984e, aVar2.f42985f, aVar2.f42986g);
                                    g11.w(componentCallbacksC5392m4);
                                    i29++;
                                    i24 = i13;
                                case 7:
                                    i13 = i24;
                                    componentCallbacksC5392m4.setAnimations(aVar2.f42983d, aVar2.f42984e, aVar2.f42985f, aVar2.f42986g);
                                    g11.l1(componentCallbacksC5392m4, false);
                                    g11.o(componentCallbacksC5392m4);
                                    i29++;
                                    i24 = i13;
                                case 8:
                                    g11.p1(componentCallbacksC5392m4);
                                    i13 = i24;
                                    i29++;
                                    i24 = i13;
                                case 9:
                                    g11.p1(null);
                                    i13 = i24;
                                    i29++;
                                    i24 = i13;
                                case 10:
                                    aVar2.f42987h = componentCallbacksC5392m4.mMaxState;
                                    g11.o1(componentCallbacksC5392m4, aVar2.f42988i);
                                    i13 = i24;
                                    i29++;
                                    i24 = i13;
                            }
                        }
                    }
                    i24++;
                }
                boolean booleanValue = arrayList2.get(i12 - 1).booleanValue();
                ArrayList<p> arrayList7 = this.f42884o;
                if (z17 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator<C5380a> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(j0(it2.next()));
                    }
                    if (this.f42877h == null) {
                        Iterator<p> it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            p next = it3.next();
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                next.onBackStackChangeStarted((ComponentCallbacksC5392m) it4.next(), booleanValue);
                            }
                        }
                        Iterator<p> it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            p next2 = it5.next();
                            Iterator it6 = linkedHashSet.iterator();
                            while (it6.hasNext()) {
                                next2.a((ComponentCallbacksC5392m) it6.next(), booleanValue);
                            }
                        }
                    }
                }
                for (int i32 = i19; i32 < i12; i32++) {
                    C5380a c5380a2 = arrayList.get(i32);
                    if (booleanValue) {
                        for (int size3 = c5380a2.f42963a.size() - 1; size3 >= 0; size3--) {
                            ComponentCallbacksC5392m componentCallbacksC5392m5 = c5380a2.f42963a.get(size3).f42981b;
                            if (componentCallbacksC5392m5 != null) {
                                v(componentCallbacksC5392m5).l();
                            }
                        }
                    } else {
                        Iterator<Q.a> it7 = c5380a2.f42963a.iterator();
                        while (it7.hasNext()) {
                            ComponentCallbacksC5392m componentCallbacksC5392m6 = it7.next().f42981b;
                            if (componentCallbacksC5392m6 != null) {
                                v(componentCallbacksC5392m6).l();
                            }
                        }
                    }
                }
                L0(this.f42892w, true);
                Iterator it8 = u(arrayList, i19, i12).iterator();
                while (it8.hasNext()) {
                    f0 f0Var = (f0) it8.next();
                    f0Var.z(booleanValue);
                    f0Var.v();
                    f0Var.l();
                }
                while (i19 < i12) {
                    C5380a c5380a3 = arrayList.get(i19);
                    if (arrayList2.get(i19).booleanValue() && c5380a3.f43015t >= 0) {
                        c5380a3.f43015t = -1;
                    }
                    if (c5380a3.f42979q != null) {
                        for (int i33 = 0; i33 < c5380a3.f42979q.size(); i33++) {
                            c5380a3.f42979q.get(i33).run();
                        }
                        c5380a3.f42979q = null;
                    }
                    i19++;
                }
                if (z17) {
                    for (int i34 = 0; i34 < arrayList7.size(); i34++) {
                        arrayList7.get(i34).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            C5380a c5380a4 = arrayList.get(i21);
            if (arrayList2.get(i21).booleanValue()) {
                z11 = z14;
                i14 = i21;
                z12 = z15;
                int i35 = 1;
                ArrayList<ComponentCallbacksC5392m> arrayList8 = this.f42867O;
                ArrayList<Q.a> arrayList9 = c5380a4.f42963a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    Q.a aVar3 = arrayList9.get(size4);
                    int i36 = aVar3.f42980a;
                    if (i36 != i35) {
                        if (i36 != 3) {
                            switch (i36) {
                                case 8:
                                    componentCallbacksC5392m = null;
                                    break;
                                case 9:
                                    componentCallbacksC5392m = aVar3.f42981b;
                                    break;
                                case 10:
                                    aVar3.f42988i = aVar3.f42987h;
                                    break;
                            }
                            size4--;
                            i35 = 1;
                        }
                        arrayList8.add(aVar3.f42981b);
                        size4--;
                        i35 = 1;
                    }
                    arrayList8.remove(aVar3.f42981b);
                    size4--;
                    i35 = 1;
                }
            } else {
                ArrayList<ComponentCallbacksC5392m> arrayList10 = this.f42867O;
                int i37 = 0;
                while (true) {
                    ArrayList<Q.a> arrayList11 = c5380a4.f42963a;
                    if (i37 < arrayList11.size()) {
                        Q.a aVar4 = arrayList11.get(i37);
                        boolean z19 = z14;
                        int i38 = aVar4.f42980a;
                        if (i38 != i22) {
                            i15 = i21;
                            if (i38 != 2) {
                                if (i38 == 3 || i38 == 6) {
                                    arrayList10.remove(aVar4.f42981b);
                                    ComponentCallbacksC5392m componentCallbacksC5392m7 = aVar4.f42981b;
                                    if (componentCallbacksC5392m7 == componentCallbacksC5392m) {
                                        arrayList11.add(i37, new Q.a(componentCallbacksC5392m7, 9));
                                        i37++;
                                        z13 = z15;
                                        componentCallbacksC5392m = null;
                                        i16 = 1;
                                    }
                                } else if (i38 == 7) {
                                    i16 = 1;
                                } else if (i38 == 8) {
                                    arrayList11.add(i37, new Q.a(componentCallbacksC5392m, 9, 0));
                                    aVar4.f42982c = true;
                                    i37++;
                                    componentCallbacksC5392m = aVar4.f42981b;
                                }
                                z13 = z15;
                                i16 = 1;
                            } else {
                                ComponentCallbacksC5392m componentCallbacksC5392m8 = aVar4.f42981b;
                                int i39 = componentCallbacksC5392m8.mContainerId;
                                int size5 = arrayList10.size() - 1;
                                boolean z21 = false;
                                while (size5 >= 0) {
                                    int i41 = size5;
                                    ComponentCallbacksC5392m componentCallbacksC5392m9 = arrayList10.get(size5);
                                    boolean z22 = z15;
                                    if (componentCallbacksC5392m9.mContainerId != i39) {
                                        i17 = i39;
                                    } else if (componentCallbacksC5392m9 == componentCallbacksC5392m8) {
                                        i17 = i39;
                                        z21 = true;
                                    } else {
                                        if (componentCallbacksC5392m9 == componentCallbacksC5392m) {
                                            i17 = i39;
                                            i18 = 0;
                                            arrayList11.add(i37, new Q.a(componentCallbacksC5392m9, 9, 0));
                                            i37++;
                                            componentCallbacksC5392m = null;
                                        } else {
                                            i17 = i39;
                                            i18 = 0;
                                        }
                                        Q.a aVar5 = new Q.a(componentCallbacksC5392m9, 3, i18);
                                        aVar5.f42983d = aVar4.f42983d;
                                        aVar5.f42985f = aVar4.f42985f;
                                        aVar5.f42984e = aVar4.f42984e;
                                        aVar5.f42986g = aVar4.f42986g;
                                        arrayList11.add(i37, aVar5);
                                        arrayList10.remove(componentCallbacksC5392m9);
                                        i37++;
                                        componentCallbacksC5392m = componentCallbacksC5392m;
                                    }
                                    size5 = i41 - 1;
                                    i39 = i17;
                                    z15 = z22;
                                }
                                z13 = z15;
                                i16 = 1;
                                if (z21) {
                                    arrayList11.remove(i37);
                                    i37--;
                                } else {
                                    aVar4.f42980a = 1;
                                    aVar4.f42982c = true;
                                    arrayList10.add(componentCallbacksC5392m8);
                                }
                            }
                            i37 += i16;
                            i22 = i16;
                            z14 = z19;
                            i21 = i15;
                            z15 = z13;
                        } else {
                            i15 = i21;
                            i16 = i22;
                        }
                        z13 = z15;
                        arrayList10.add(aVar4.f42981b);
                        i37 += i16;
                        i22 = i16;
                        z14 = z19;
                        i21 = i15;
                        z15 = z13;
                    } else {
                        z11 = z14;
                        i14 = i21;
                        z12 = z15;
                    }
                }
            }
            z15 = z12 || c5380a4.f42969g;
            i21 = i14 + 1;
            z14 = z11;
        }
    }

    private void b1(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (!arrayList.get(i11).f42978p) {
                if (i12 != i11) {
                    b0(arrayList, arrayList2, i12, i11);
                }
                i12 = i11 + 1;
                if (arrayList2.get(i11).booleanValue()) {
                    while (i12 < size && arrayList2.get(i12).booleanValue() && !arrayList.get(i12).f42978p) {
                        i12++;
                    }
                }
                b0(arrayList, arrayList2, i11, i12);
                i11 = i12 - 1;
            }
            i11++;
        }
        if (i12 != size) {
            b0(arrayList, arrayList2, i12, size);
        }
    }

    public static /* synthetic */ void c(G g10, androidx.core.app.i iVar) {
        if (g10.F0()) {
            g10.G(iVar.a(), false);
        }
    }

    public static /* synthetic */ void d(G g10, Configuration configuration) {
        if (g10.F0()) {
            g10.z(false, configuration);
        }
    }

    private int e0(int i11, String str, boolean z11) {
        if (this.f42873d.isEmpty()) {
            return -1;
        }
        if (str == null && i11 < 0) {
            if (z11) {
                return 0;
            }
            return this.f42873d.size() - 1;
        }
        int size = this.f42873d.size() - 1;
        while (size >= 0) {
            C5380a c5380a = this.f42873d.get(size);
            if ((str != null && str.equals(c5380a.f42971i)) || (i11 >= 0 && i11 == c5380a.f43015t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z11) {
            if (size == this.f42873d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C5380a c5380a2 = this.f42873d.get(size - 1);
            if ((str == null || !str.equals(c5380a2.f42971i)) && (i11 < 0 || i11 != c5380a2.f43015t)) {
                break;
            }
            size--;
        }
        return size;
    }

    static ComponentCallbacksC5392m i0(@NonNull View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            ComponentCallbacksC5392m componentCallbacksC5392m = tag instanceof ComponentCallbacksC5392m ? (ComponentCallbacksC5392m) tag : null;
            if (componentCallbacksC5392m != null) {
                return componentCallbacksC5392m;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    static HashSet j0(@NonNull C5380a c5380a) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < c5380a.f42963a.size(); i11++) {
            ComponentCallbacksC5392m componentCallbacksC5392m = c5380a.f42963a.get(i11).f42981b;
            if (componentCallbacksC5392m != null && c5380a.f42969g) {
                hashSet.add(componentCallbacksC5392m);
            }
        }
        return hashSet;
    }

    private ViewGroup o0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        ViewGroup viewGroup = componentCallbacksC5392m.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC5392m.mContainerId <= 0 || !this.f42894y.c()) {
            return null;
        }
        View b11 = this.f42894y.b(componentCallbacksC5392m.mContainerId);
        if (b11 instanceof ViewGroup) {
            return (ViewGroup) b11;
        }
        return null;
    }

    private void q() {
        this.f42871b = false;
        this.f42866N.clear();
        this.f42865M.clear();
    }

    private void q1(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        ViewGroup o02 = o0(componentCallbacksC5392m);
        if (o02 == null || componentCallbacksC5392m.getEnterAnim() + componentCallbacksC5392m.getExitAnim() + componentCallbacksC5392m.getPopEnterAnim() + componentCallbacksC5392m.getPopExitAnim() <= 0) {
            return;
        }
        if (o02.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            o02.setTag(R.id.visible_removing_fragment_view_tag, componentCallbacksC5392m);
        }
        ((ComponentCallbacksC5392m) o02.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(componentCallbacksC5392m.getPopDirection());
    }

    static void r1(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (D0(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC5392m);
        }
        if (componentCallbacksC5392m.mHidden) {
            componentCallbacksC5392m.mHidden = false;
            componentCallbacksC5392m.mHiddenChanged = !componentCallbacksC5392m.mHiddenChanged;
        }
    }

    private void s1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new c0());
        AbstractC5401w<?> abstractC5401w = this.f42893x;
        if (abstractC5401w != null) {
            try {
                abstractC5401w.h(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
                throw runtimeException;
            }
        }
        try {
            V("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e12) {
            Log.e("FragmentManager", "Failed dumping state", e12);
            throw runtimeException;
        }
    }

    private HashSet t() {
        Object c5385f;
        HashSet hashSet = new HashSet();
        Iterator it = this.f42872c.k().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((O) it.next()).k().mContainer;
            if (container != null) {
                g0 factory = x0();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof f0) {
                    c5385f = (f0) tag;
                } else {
                    ((e) factory).getClass();
                    Intrinsics.checkNotNullParameter(container, "container");
                    c5385f = new C5385f(container);
                    Intrinsics.checkNotNullExpressionValue(c5385f, "factory.createController(container)");
                    container.setTag(R.id.special_effects_controller_view_tag, c5385f);
                }
                hashSet.add(c5385f);
            }
        }
        return hashSet;
    }

    private void u1() {
        synchronized (this.f42870a) {
            try {
                if (!this.f42870a.isEmpty()) {
                    this.f42879j.setEnabled(true);
                    if (D0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z11 = l0() > 0 && G0(this.f42895z);
                if (D0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z11);
                }
                this.f42879j.setEnabled(z11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean A(@NonNull MenuItem menuItem) {
        if (this.f42892w < 1) {
            return false;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null && componentCallbacksC5392m.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final void A0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (D0(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC5392m);
        }
        if (componentCallbacksC5392m.mHidden) {
            return;
        }
        componentCallbacksC5392m.mHidden = true;
        componentCallbacksC5392m.mHiddenChanged = true ^ componentCallbacksC5392m.mHiddenChanged;
        q1(componentCallbacksC5392m);
    }

    final void B() {
        this.f42861I = false;
        this.f42862J = false;
        this.f42868P.p0(false);
        S(1);
    }

    final void B0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (componentCallbacksC5392m.mAdded && E0(componentCallbacksC5392m)) {
            this.f42860H = true;
        }
    }

    final boolean C(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f42892w < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC5392m> arrayList = null;
        boolean z11 = false;
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null && componentCallbacksC5392m.isMenuVisible() && componentCallbacksC5392m.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(componentCallbacksC5392m);
                z11 = true;
            }
        }
        if (this.f42874e != null) {
            for (int i11 = 0; i11 < this.f42874e.size(); i11++) {
                ComponentCallbacksC5392m componentCallbacksC5392m2 = this.f42874e.get(i11);
                if (arrayList == null || !arrayList.contains(componentCallbacksC5392m2)) {
                    componentCallbacksC5392m2.onDestroyOptionsMenu();
                }
            }
        }
        this.f42874e = arrayList;
        return z11;
    }

    public final boolean C0() {
        return this.f42863K;
    }

    final void D() {
        boolean z11 = true;
        this.f42863K = true;
        Z(true);
        W();
        AbstractC5401w<?> abstractC5401w = this.f42893x;
        boolean z12 = abstractC5401w instanceof B0;
        P p11 = this.f42872c;
        if (z12) {
            z11 = p11.p().m0();
        } else if (abstractC5401w.e() != null) {
            z11 = true ^ ((Activity) this.f42893x.e()).isChangingConfigurations();
        }
        if (z11) {
            Iterator<C5382c> it = this.f42881l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = it.next().f43032a.iterator();
                while (it2.hasNext()) {
                    p11.p().f0((String) it2.next(), false);
                }
            }
        }
        S(-1);
        Object obj = this.f42893x;
        if (obj instanceof androidx.core.content.d) {
            ((androidx.core.content.d) obj).removeOnTrimMemoryListener(this.f42888s);
        }
        Object obj2 = this.f42893x;
        if (obj2 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj2).removeOnConfigurationChangedListener(this.f42887r);
        }
        Object obj3 = this.f42893x;
        if (obj3 instanceof androidx.core.app.o) {
            ((androidx.core.app.o) obj3).removeOnMultiWindowModeChangedListener(this.f42889t);
        }
        Object obj4 = this.f42893x;
        if (obj4 instanceof androidx.core.app.p) {
            ((androidx.core.app.p) obj4).removeOnPictureInPictureModeChangedListener(this.f42890u);
        }
        Object obj5 = this.f42893x;
        if ((obj5 instanceof androidx.core.view.r) && this.f42895z == null) {
            ((androidx.core.view.r) obj5).removeMenuProvider(this.f42891v);
        }
        this.f42893x = null;
        this.f42894y = null;
        this.f42895z = null;
        if (this.f42876g != null) {
            this.f42879j.remove();
            this.f42876g = null;
        }
        C6598j c6598j = this.f42856D;
        if (c6598j != null) {
            c6598j.b();
            this.f42857E.b();
            this.f42858F.b();
        }
    }

    final void E() {
        S(1);
    }

    final void F(boolean z11) {
        if (z11 && (this.f42893x instanceof androidx.core.content.d)) {
            s1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null) {
                componentCallbacksC5392m.performLowMemory();
                if (z11) {
                    componentCallbacksC5392m.mChildFragmentManager.F(true);
                }
            }
        }
    }

    final void G(boolean z11, boolean z12) {
        if (z12 && (this.f42893x instanceof androidx.core.app.o)) {
            s1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null) {
                componentCallbacksC5392m.performMultiWindowModeChanged(z11);
                if (z12) {
                    componentCallbacksC5392m.mChildFragmentManager.G(z11, true);
                }
            }
        }
    }

    final void H(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        Iterator<K> it = this.f42886q.iterator();
        while (it.hasNext()) {
            it.next().a(this, componentCallbacksC5392m);
        }
    }

    public final boolean H0() {
        return this.f42861I || this.f42862J;
    }

    final void I() {
        Iterator it = this.f42872c.l().iterator();
        while (it.hasNext()) {
            ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) it.next();
            if (componentCallbacksC5392m != null) {
                componentCallbacksC5392m.onHiddenChanged(componentCallbacksC5392m.isHidden());
                componentCallbacksC5392m.mChildFragmentManager.I();
            }
        }
    }

    final void I0(@NonNull ComponentCallbacksC5392m fragment, @NonNull String[] permissions, int i11) {
        if (this.f42858F != null) {
            this.f42859G.addLast(new n(fragment.mWho, i11));
            this.f42858F.a(permissions);
        } else {
            this.f42893x.getClass();
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
        }
    }

    final boolean J(@NonNull MenuItem menuItem) {
        if (this.f42892w < 1) {
            return false;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null && componentCallbacksC5392m.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final void J0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull Intent intent, int i11, Bundle bundle) {
        if (this.f42856D == null) {
            this.f42893x.l(componentCallbacksC5392m, intent, i11, bundle);
            return;
        }
        this.f42859G.addLast(new n(componentCallbacksC5392m.mWho, i11));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f42856D.a(intent);
    }

    final void K(@NonNull Menu menu) {
        if (this.f42892w < 1) {
            return;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null) {
                componentCallbacksC5392m.performOptionsMenuClosed(menu);
            }
        }
    }

    final void K0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f42857E == null) {
            this.f42893x.m(componentCallbacksC5392m, intentSender, i11, intent, i12, i13, i14, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (D0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + componentCallbacksC5392m);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C6600l.a aVar = new C6600l.a(intentSender);
        aVar.b(intent);
        aVar.c(i13, i12);
        C6600l a11 = aVar.a();
        this.f42859G.addLast(new n(componentCallbacksC5392m.mWho, i11));
        if (D0(2)) {
            Log.v("FragmentManager", "Fragment " + componentCallbacksC5392m + "is launching an IntentSender for result ");
        }
        this.f42857E.a(a11);
    }

    final void L0(int i11, boolean z11) {
        AbstractC5401w<?> abstractC5401w;
        if (this.f42893x == null && i11 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z11 || i11 != this.f42892w) {
            this.f42892w = i11;
            P p11 = this.f42872c;
            p11.t();
            Iterator it = p11.k().iterator();
            while (it.hasNext()) {
                O0((O) it.next());
            }
            if (this.f42860H && (abstractC5401w = this.f42893x) != null && this.f42892w == 7) {
                abstractC5401w.n();
                this.f42860H = false;
            }
        }
    }

    final void M() {
        S(5);
    }

    final void M0() {
        if (this.f42893x == null) {
            return;
        }
        this.f42861I = false;
        this.f42862J = false;
        this.f42868P.p0(false);
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null) {
                componentCallbacksC5392m.noteStateNotSaved();
            }
        }
    }

    final void N(boolean z11, boolean z12) {
        if (z12 && (this.f42893x instanceof androidx.core.app.p)) {
            s1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null) {
                componentCallbacksC5392m.performPictureInPictureModeChanged(z11);
                if (z12) {
                    componentCallbacksC5392m.mChildFragmentManager.N(z11, true);
                }
            }
        }
    }

    public final void N0(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        Iterator it = this.f42872c.k().iterator();
        while (it.hasNext()) {
            O o11 = (O) it.next();
            ComponentCallbacksC5392m k11 = o11.k();
            if (k11.mContainerId == fragmentContainerView.getId() && (view = k11.mView) != null && view.getParent() == null) {
                k11.mContainer = fragmentContainerView;
                o11.b();
                o11.l();
            }
        }
    }

    final boolean O(@NonNull Menu menu) {
        boolean z11 = false;
        if (this.f42892w < 1) {
            return false;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null && componentCallbacksC5392m.isMenuVisible() && componentCallbacksC5392m.performPrepareOptionsMenu(menu)) {
                z11 = true;
            }
        }
        return z11;
    }

    final void O0(@NonNull O o11) {
        ComponentCallbacksC5392m k11 = o11.k();
        if (k11.mDeferStart) {
            if (this.f42871b) {
                this.f42864L = true;
            } else {
                k11.mDeferStart = false;
                o11.l();
            }
        }
    }

    final void P() {
        u1();
        L(this.f42853A);
    }

    public final void P0() {
        X(new r(null, -1, 0), false);
    }

    final void Q() {
        this.f42861I = false;
        this.f42862J = false;
        this.f42868P.p0(false);
        S(7);
    }

    public final void Q0(String str) {
        X(new r(str, -1, 1), false);
    }

    final void R() {
        this.f42861I = false;
        this.f42862J = false;
        this.f42868P.p0(false);
        S(5);
    }

    public final void R0(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Bad id: "));
        }
        T0(i11, i12, null);
    }

    public final boolean S0() {
        return T0(-1, 0, null);
    }

    final void T() {
        this.f42862J = true;
        this.f42868P.p0(true);
        S(4);
    }

    final void U() {
        S(2);
    }

    public final boolean U0(int i11, String str) {
        return T0(-1, i11, str);
    }

    public final void V(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        int size;
        String e11 = U7.d.e(str, "    ");
        this.f42872c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<ComponentCallbacksC5392m> arrayList = this.f42874e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                ComponentCallbacksC5392m componentCallbacksC5392m = this.f42874e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC5392m.toString());
            }
        }
        int size2 = this.f42873d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size2; i12++) {
                C5380a c5380a = this.f42873d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(c5380a.toString());
                c5380a.C(e11, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f42880k.get());
        synchronized (this.f42870a) {
            try {
                int size3 = this.f42870a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size3; i13++) {
                        q qVar = this.f42870a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(qVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f42893x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f42894y);
        if (this.f42895z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f42895z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f42892w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f42861I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f42862J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f42863K);
        if (this.f42860H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f42860H);
        }
    }

    final boolean V0(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2, String str, int i11, int i12) {
        int e02 = e0(i11, str, (i12 & 1) != 0);
        if (e02 < 0) {
            return false;
        }
        for (int size = this.f42873d.size() - 1; size >= e02; size--) {
            arrayList.add(this.f42873d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    final boolean W0(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (D0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f42870a);
        }
        if (this.f42873d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        C5380a c5380a = (C5380a) o0.b(1, this.f42873d);
        this.f42877h = c5380a;
        Iterator<Q.a> it = c5380a.f42963a.iterator();
        while (it.hasNext()) {
            ComponentCallbacksC5392m componentCallbacksC5392m = it.next().f42981b;
            if (componentCallbacksC5392m != null) {
                componentCallbacksC5392m.mTransitioning = true;
            }
        }
        return V0(arrayList, arrayList2, null, -1, 0);
    }

    final void X(@NonNull q qVar, boolean z11) {
        if (!z11) {
            if (this.f42893x == null) {
                if (!this.f42863K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (H0()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f42870a) {
            try {
                if (this.f42893x == null) {
                    if (!z11) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f42870a.add(qVar);
                    k1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void X0(@NonNull Bundle bundle, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull String str) {
        if (componentCallbacksC5392m.mFragmentManager == this) {
            bundle.putString(str, componentCallbacksC5392m.mWho);
        } else {
            s1(new IllegalStateException(C2638a.d("Fragment ", componentCallbacksC5392m, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void Y0(@NonNull m mVar, boolean z11) {
        this.f42885p.o(mVar, z11);
    }

    final boolean Z(boolean z11) {
        boolean z12;
        C5380a c5380a;
        Y(z11);
        if (!this.f42878i && (c5380a = this.f42877h) != null) {
            c5380a.f43014s = false;
            c5380a.A();
            if (D0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f42877h + " as part of execPendingActions for actions " + this.f42870a);
            }
            this.f42877h.B(false, false);
            this.f42870a.add(0, this.f42877h);
            Iterator<Q.a> it = this.f42877h.f42963a.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC5392m componentCallbacksC5392m = it.next().f42981b;
                if (componentCallbacksC5392m != null) {
                    componentCallbacksC5392m.mTransitioning = false;
                }
            }
            this.f42877h = null;
        }
        boolean z13 = false;
        while (true) {
            ArrayList<C5380a> arrayList = this.f42865M;
            ArrayList<Boolean> arrayList2 = this.f42866N;
            synchronized (this.f42870a) {
                if (this.f42870a.isEmpty()) {
                    z12 = false;
                } else {
                    try {
                        int size = this.f42870a.size();
                        z12 = false;
                        for (int i11 = 0; i11 < size; i11++) {
                            z12 |= this.f42870a.get(i11).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z12) {
                break;
            }
            z13 = true;
            this.f42871b = true;
            try {
                b1(this.f42865M, this.f42866N);
            } finally {
                q();
            }
        }
        u1();
        if (this.f42864L) {
            this.f42864L = false;
            Iterator it2 = this.f42872c.k().iterator();
            while (it2.hasNext()) {
                O0((O) it2.next());
            }
        }
        this.f42872c.b();
        return z13;
    }

    final void Z0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (D0(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC5392m + " nesting=" + componentCallbacksC5392m.mBackStackNesting);
        }
        boolean isInBackStack = componentCallbacksC5392m.isInBackStack();
        if (componentCallbacksC5392m.mDetached && isInBackStack) {
            return;
        }
        this.f42872c.u(componentCallbacksC5392m);
        if (E0(componentCallbacksC5392m)) {
            this.f42860H = true;
        }
        componentCallbacksC5392m.mRemoving = true;
        q1(componentCallbacksC5392m);
    }

    final void a0(@NonNull C5380a c5380a, boolean z11) {
        if (z11 && (this.f42893x == null || this.f42863K)) {
            return;
        }
        Y(z11);
        C5380a c5380a2 = this.f42877h;
        if (c5380a2 != null) {
            c5380a2.f43014s = false;
            c5380a2.A();
            if (D0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f42877h + " as part of execSingleAction for action " + c5380a);
            }
            this.f42877h.B(false, false);
            this.f42877h.a(this.f42865M, this.f42866N);
            Iterator<Q.a> it = this.f42877h.f42963a.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC5392m componentCallbacksC5392m = it.next().f42981b;
                if (componentCallbacksC5392m != null) {
                    componentCallbacksC5392m.mTransitioning = false;
                }
            }
            this.f42877h = null;
        }
        c5380a.a(this.f42865M, this.f42866N);
        this.f42871b = true;
        try {
            b1(this.f42865M, this.f42866N);
            q();
            u1();
            boolean z12 = this.f42864L;
            P p11 = this.f42872c;
            if (z12) {
                this.f42864L = false;
                Iterator it2 = p11.k().iterator();
                while (it2.hasNext()) {
                    O0((O) it2.next());
                }
            }
            p11.b();
        } catch (Throwable th2) {
            q();
            throw th2;
        }
    }

    public final void a1(@NonNull p pVar) {
        this.f42884o.remove(pVar);
    }

    public final void c0() {
        Z(true);
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).p();
        }
    }

    final void c1(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        this.f42868P.n0(componentCallbacksC5392m);
    }

    final ComponentCallbacksC5392m d0(@NonNull String str) {
        return this.f42872c.f(str);
    }

    public final void d1(@NonNull String str) {
        X(new t(str), false);
    }

    final boolean e1(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        C5382c remove = this.f42881l.remove(str);
        boolean z11 = false;
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<C5380a> it = arrayList.iterator();
        while (it.hasNext()) {
            C5380a next = it.next();
            if (next.f43016u) {
                Iterator<Q.a> it2 = next.f42963a.iterator();
                while (it2.hasNext()) {
                    ComponentCallbacksC5392m componentCallbacksC5392m = it2.next().f42981b;
                    if (componentCallbacksC5392m != null) {
                        hashMap.put(componentCallbacksC5392m.mWho, componentCallbacksC5392m);
                    }
                }
            }
        }
        Iterator it3 = remove.a(this, hashMap).iterator();
        while (it3.hasNext()) {
            ((C5380a) it3.next()).a(arrayList, arrayList2);
            z11 = true;
        }
        return z11;
    }

    public final ComponentCallbacksC5392m f0(int i11) {
        return this.f42872c.g(i11);
    }

    final void f1(Bundle bundle) {
        C5404z c5404z;
        O o11;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f42893x.e().getClassLoader());
                this.f42882m.put(str.substring(7), bundle3);
            }
        }
        HashMap<String, Bundle> hashMap = new HashMap<>();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f42893x.e().getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        P p11 = this.f42872c;
        p11.x(hashMap);
        I i11 = (I) bundle.getParcelable("state");
        if (i11 == null) {
            return;
        }
        p11.v();
        Iterator<String> it = i11.f42922a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c5404z = this.f42885p;
            if (!hasNext) {
                break;
            }
            Bundle B11 = p11.B(null, it.next());
            if (B11 != null) {
                ComponentCallbacksC5392m h02 = this.f42868P.h0(((N) B11.getParcelable("state")).f42938b);
                if (h02 != null) {
                    if (D0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h02);
                    }
                    o11 = new O(c5404z, p11, h02, B11);
                } else {
                    o11 = new O(this.f42885p, this.f42872c, this.f42893x.e().getClassLoader(), p0(), B11);
                }
                ComponentCallbacksC5392m k11 = o11.k();
                k11.mSavedFragmentState = B11;
                k11.mFragmentManager = this;
                if (D0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k11.mWho + "): " + k11);
                }
                o11.m(this.f42893x.e().getClassLoader());
                p11.r(o11);
                o11.r(this.f42892w);
            }
        }
        Iterator it2 = this.f42868P.k0().iterator();
        while (it2.hasNext()) {
            ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) it2.next();
            if (!p11.c(componentCallbacksC5392m.mWho)) {
                if (D0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC5392m + " that was not found in the set of active Fragments " + i11.f42922a);
                }
                this.f42868P.n0(componentCallbacksC5392m);
                componentCallbacksC5392m.mFragmentManager = this;
                O o12 = new O(c5404z, p11, componentCallbacksC5392m);
                o12.r(1);
                o12.l();
                componentCallbacksC5392m.mRemoving = true;
                o12.l();
            }
        }
        p11.w(i11.f42923b);
        if (i11.f42924c != null) {
            this.f42873d = new ArrayList<>(i11.f42924c.length);
            int i12 = 0;
            while (true) {
                C5381b[] c5381bArr = i11.f42924c;
                if (i12 >= c5381bArr.length) {
                    break;
                }
                C5380a b11 = c5381bArr[i12].b(this);
                if (D0(2)) {
                    StringBuilder f7 = P4.f.f(i12, "restoreAllState: back stack #", " (index ");
                    f7.append(b11.f43015t);
                    f7.append("): ");
                    f7.append(b11);
                    Log.v("FragmentManager", f7.toString());
                    PrintWriter printWriter = new PrintWriter(new c0());
                    b11.C("  ", printWriter, false);
                    printWriter.close();
                }
                this.f42873d.add(b11);
                i12++;
            }
        } else {
            this.f42873d = new ArrayList<>();
        }
        this.f42880k.set(i11.f42925d);
        String str3 = i11.f42926e;
        if (str3 != null) {
            ComponentCallbacksC5392m f11 = p11.f(str3);
            this.f42853A = f11;
            L(f11);
        }
        ArrayList<String> arrayList = i11.f42927f;
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                this.f42881l.put(arrayList.get(i13), i11.f42928g.get(i13));
            }
        }
        this.f42859G = new ArrayDeque<>(i11.f42929h);
    }

    public final ComponentCallbacksC5392m g0(String str) {
        return this.f42872c.h(str);
    }

    @NonNull
    final Bundle g1() {
        C5381b[] c5381bArr;
        Bundle bundle = new Bundle();
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).p();
        }
        W();
        Z(true);
        this.f42861I = true;
        this.f42868P.p0(true);
        P p11 = this.f42872c;
        ArrayList<String> y11 = p11.y();
        HashMap<String, Bundle> m11 = p11.m();
        if (!m11.isEmpty()) {
            ArrayList<String> z11 = p11.z();
            int size = this.f42873d.size();
            if (size > 0) {
                c5381bArr = new C5381b[size];
                for (int i11 = 0; i11 < size; i11++) {
                    c5381bArr[i11] = new C5381b(this.f42873d.get(i11));
                    if (D0(2)) {
                        StringBuilder f7 = P4.f.f(i11, "saveAllState: adding back stack #", ": ");
                        f7.append(this.f42873d.get(i11));
                        Log.v("FragmentManager", f7.toString());
                    }
                }
            } else {
                c5381bArr = null;
            }
            I i12 = new I();
            i12.f42922a = y11;
            i12.f42923b = z11;
            i12.f42924c = c5381bArr;
            i12.f42925d = this.f42880k.get();
            ComponentCallbacksC5392m componentCallbacksC5392m = this.f42853A;
            if (componentCallbacksC5392m != null) {
                i12.f42926e = componentCallbacksC5392m.mWho;
            }
            ArrayList<String> arrayList = i12.f42927f;
            Map<String, C5382c> map = this.f42881l;
            arrayList.addAll(map.keySet());
            i12.f42928g.addAll(map.values());
            i12.f42929h = new ArrayList<>(this.f42859G);
            bundle.putParcelable("state", i12);
            Map<String, Bundle> map2 = this.f42882m;
            for (String str : map2.keySet()) {
                bundle.putBundle(Nk.a.b("result_", str), map2.get(str));
            }
            for (String str2 : m11.keySet()) {
                bundle.putBundle(Nk.a.b("fragment_", str2), m11.get(str2));
            }
        } else if (D0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    final ComponentCallbacksC5392m h0(@NonNull String str) {
        return this.f42872c.i(str);
    }

    public final void h1(@NonNull String str) {
        X(new u(str), false);
    }

    final O i(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        String str = componentCallbacksC5392m.mPreviousWho;
        if (str != null) {
            C4929c.d(componentCallbacksC5392m, str);
        }
        if (D0(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC5392m);
        }
        O v11 = v(componentCallbacksC5392m);
        componentCallbacksC5392m.mFragmentManager = this;
        P p11 = this.f42872c;
        p11.r(v11);
        if (!componentCallbacksC5392m.mDetached) {
            p11.a(componentCallbacksC5392m);
            componentCallbacksC5392m.mRemoving = false;
            if (componentCallbacksC5392m.mView == null) {
                componentCallbacksC5392m.mHiddenChanged = false;
            }
            if (E0(componentCallbacksC5392m)) {
                this.f42860H = true;
            }
        }
        return v11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r14 == 8) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean i1(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        Throwable th2;
        int i11;
        int e02 = e0(-1, str, true);
        if (e02 < 0) {
            return false;
        }
        int i12 = e02;
        while (true) {
            Throwable th3 = null;
            if (i12 >= this.f42873d.size()) {
                HashSet hashSet = new HashSet();
                int i13 = e02;
                while (i13 < this.f42873d.size()) {
                    C5380a c5380a = this.f42873d.get(i13);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator<Q.a> it = c5380a.f42963a.iterator();
                    while (it.hasNext()) {
                        Q.a next = it.next();
                        ComponentCallbacksC5392m componentCallbacksC5392m = next.f42981b;
                        if (componentCallbacksC5392m != null) {
                            if (!next.f42982c || (i11 = next.f42980a) == 1 || i11 == 2) {
                                th2 = th3;
                            } else {
                                th2 = th3;
                            }
                            hashSet.add(componentCallbacksC5392m);
                            hashSet2.add(componentCallbacksC5392m);
                            int i14 = next.f42980a;
                            if (i14 == 1 || i14 == 2) {
                                hashSet3.add(componentCallbacksC5392m);
                            }
                            th3 = th2;
                        }
                    }
                    Throwable th4 = th3;
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder b11 = C6594f.b("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        b11.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        b11.append(" in ");
                        b11.append(c5380a);
                        b11.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        s1(new IllegalArgumentException(b11.toString()));
                        throw th4;
                    }
                    i13++;
                    th3 = th4;
                }
                Throwable th5 = th3;
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    ComponentCallbacksC5392m componentCallbacksC5392m2 = (ComponentCallbacksC5392m) arrayDeque.removeFirst();
                    if (componentCallbacksC5392m2.mRetainInstance) {
                        StringBuilder b12 = C6594f.b("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                        b12.append(hashSet.contains(componentCallbacksC5392m2) ? "direct reference to retained " : "retained child ");
                        b12.append("fragment ");
                        b12.append(componentCallbacksC5392m2);
                        s1(new IllegalArgumentException(b12.toString()));
                        throw th5;
                    }
                    Iterator it2 = componentCallbacksC5392m2.mChildFragmentManager.f42872c.l().iterator();
                    while (it2.hasNext()) {
                        ComponentCallbacksC5392m componentCallbacksC5392m3 = (ComponentCallbacksC5392m) it2.next();
                        if (componentCallbacksC5392m3 != null) {
                            arrayDeque.addLast(componentCallbacksC5392m3);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((ComponentCallbacksC5392m) it3.next()).mWho);
                }
                ArrayList arrayList4 = new ArrayList(this.f42873d.size() - e02);
                for (int i15 = e02; i15 < this.f42873d.size(); i15++) {
                    arrayList4.add(th5);
                }
                C5382c c5382c = new C5382c(arrayList3, arrayList4);
                for (int size = this.f42873d.size() - 1; size >= e02; size--) {
                    C5380a remove = this.f42873d.remove(size);
                    C5380a c5380a2 = new C5380a(remove);
                    c5380a2.A();
                    arrayList4.set(size - e02, new C5381b(c5380a2));
                    remove.f43016u = true;
                    arrayList.add(remove);
                    arrayList2.add(Boolean.TRUE);
                }
                this.f42881l.put(str, c5382c);
                return true;
            }
            C5380a c5380a3 = this.f42873d.get(i12);
            if (!c5380a3.f42978p) {
                s1(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c5380a3 + " that did not use setReorderingAllowed(true)."));
                throw null;
            }
            i12++;
        }
    }

    public final void j(@NonNull K k11) {
        this.f42886q.add(k11);
    }

    public final ComponentCallbacksC5392m.n j1(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        O n11 = this.f42872c.n(componentCallbacksC5392m.mWho);
        if (n11 != null && n11.k().equals(componentCallbacksC5392m)) {
            return n11.o();
        }
        s1(new IllegalStateException(C2638a.d("Fragment ", componentCallbacksC5392m, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void k(@NonNull p pVar) {
        this.f42884o.add(pVar);
    }

    @NonNull
    public final k k0(int i11) {
        if (i11 != this.f42873d.size()) {
            return this.f42873d.get(i11);
        }
        C5380a c5380a = this.f42877h;
        if (c5380a != null) {
            return c5380a;
        }
        throw new IndexOutOfBoundsException();
    }

    final void k1() {
        synchronized (this.f42870a) {
            try {
                if (this.f42870a.size() == 1) {
                    this.f42893x.g().removeCallbacks(this.f42869Q);
                    this.f42893x.g().post(this.f42869Q);
                    u1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void l(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        this.f42868P.d0(componentCallbacksC5392m);
    }

    public final int l0() {
        return this.f42873d.size() + (this.f42877h != null ? 1 : 0);
    }

    final void l1(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11) {
        ViewGroup o02 = o0(componentCallbacksC5392m);
        if (o02 == null || !(o02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) o02).c(!z11);
    }

    final int m() {
        return this.f42880k.getAndIncrement();
    }

    @NonNull
    final AbstractC5398t m0() {
        return this.f42894y;
    }

    public final void m1(@NonNull Bundle bundle, @NonNull String str) {
        o oVar = this.f42883n.get(str);
        if (oVar == null || !oVar.a(AbstractC5434v.b.STARTED)) {
            this.f42882m.put(str, bundle);
        } else {
            oVar.f(bundle, str);
        }
        if (D0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void n(@NonNull AbstractC5401w<?> abstractC5401w, @NonNull AbstractC5398t abstractC5398t, ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (this.f42893x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f42893x = abstractC5401w;
        this.f42894y = abstractC5398t;
        this.f42895z = componentCallbacksC5392m;
        if (componentCallbacksC5392m != null) {
            j(new h(componentCallbacksC5392m));
        } else if (abstractC5401w instanceof K) {
            j((K) abstractC5401w);
        }
        if (this.f42895z != null) {
            u1();
        }
        if (abstractC5401w instanceof androidx.activity.M) {
            androidx.activity.M m11 = (androidx.activity.M) abstractC5401w;
            androidx.activity.J onBackPressedDispatcher = m11.getOnBackPressedDispatcher();
            this.f42876g = onBackPressedDispatcher;
            androidx.lifecycle.J j11 = m11;
            if (componentCallbacksC5392m != null) {
                j11 = componentCallbacksC5392m;
            }
            onBackPressedDispatcher.h(j11, this.f42879j);
        }
        if (componentCallbacksC5392m != null) {
            this.f42868P = componentCallbacksC5392m.mFragmentManager.f42868P.i0(componentCallbacksC5392m);
        } else if (abstractC5401w instanceof B0) {
            this.f42868P = J.j0(((B0) abstractC5401w).getViewModelStore());
        } else {
            this.f42868P = new J(false);
        }
        this.f42868P.p0(H0());
        this.f42872c.A(this.f42868P);
        Object obj = this.f42893x;
        if ((obj instanceof M4.e) && componentCallbacksC5392m == null) {
            M4.c savedStateRegistry = ((M4.e) obj).getSavedStateRegistry();
            savedStateRegistry.g("android:support:fragments", new c.b() { // from class: androidx.fragment.app.E
                @Override // M4.c.b
                public final Bundle saveState() {
                    return G.this.g1();
                }
            });
            Bundle b11 = savedStateRegistry.b("android:support:fragments");
            if (b11 != null) {
                f1(b11);
            }
        }
        Object obj2 = this.f42893x;
        if (obj2 instanceof InterfaceC6599k) {
            AbstractC6595g activityResultRegistry = ((InterfaceC6599k) obj2).getActivityResultRegistry();
            String b12 = Nk.a.b("FragmentManager:", componentCallbacksC5392m != null ? o0.c(new StringBuilder(), componentCallbacksC5392m.mWho, ProductContainerDTO.RATIO_DELIMITER) : "");
            this.f42856D = activityResultRegistry.j(U7.d.e(b12, "StartActivityForResult"), new h.j(), new i());
            this.f42857E = activityResultRegistry.j(U7.d.e(b12, "StartIntentSenderForResult"), new l(), new j());
            this.f42858F = activityResultRegistry.j(U7.d.e(b12, "RequestPermissions"), new C6762h(), new a());
        }
        Object obj3 = this.f42893x;
        if (obj3 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj3).addOnConfigurationChangedListener(this.f42887r);
        }
        Object obj4 = this.f42893x;
        if (obj4 instanceof androidx.core.content.d) {
            ((androidx.core.content.d) obj4).addOnTrimMemoryListener(this.f42888s);
        }
        Object obj5 = this.f42893x;
        if (obj5 instanceof androidx.core.app.o) {
            ((androidx.core.app.o) obj5).addOnMultiWindowModeChangedListener(this.f42889t);
        }
        Object obj6 = this.f42893x;
        if (obj6 instanceof androidx.core.app.p) {
            ((androidx.core.app.p) obj6).addOnPictureInPictureModeChangedListener(this.f42890u);
        }
        Object obj7 = this.f42893x;
        if ((obj7 instanceof androidx.core.view.r) && componentCallbacksC5392m == null) {
            ((androidx.core.view.r) obj7).addMenuProvider(this.f42891v);
        }
    }

    public final ComponentCallbacksC5392m n0(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        ComponentCallbacksC5392m f7 = this.f42872c.f(string);
        if (f7 != null) {
            return f7;
        }
        s1(new IllegalStateException(Sh.b.c("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final void n1(@NonNull String str, @NonNull androidx.lifecycle.J j11, @NonNull M m11) {
        AbstractC5434v lifecycle = j11.getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            return;
        }
        g gVar = new g(str, m11, lifecycle);
        o put = this.f42883n.put(str, new o(lifecycle, m11, gVar));
        if (put != null) {
            put.b();
        }
        if (D0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + m11);
        }
        lifecycle.a(gVar);
    }

    final void o(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (D0(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC5392m);
        }
        if (componentCallbacksC5392m.mDetached) {
            componentCallbacksC5392m.mDetached = false;
            if (componentCallbacksC5392m.mAdded) {
                return;
            }
            this.f42872c.a(componentCallbacksC5392m);
            if (D0(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC5392m);
            }
            if (E0(componentCallbacksC5392m)) {
                this.f42860H = true;
            }
        }
    }

    final void o1(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull AbstractC5434v.b bVar) {
        if (componentCallbacksC5392m.equals(this.f42872c.f(componentCallbacksC5392m.mWho)) && (componentCallbacksC5392m.mHost == null || componentCallbacksC5392m.mFragmentManager == this)) {
            componentCallbacksC5392m.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC5392m + " is not an active fragment of FragmentManager " + this);
    }

    @NonNull
    public final Q p() {
        return new C5380a(this);
    }

    @NonNull
    public final C5400v p0() {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42895z;
        return componentCallbacksC5392m != null ? componentCallbacksC5392m.mFragmentManager.p0() : this.f42854B;
    }

    final void p1(ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (componentCallbacksC5392m != null) {
            if (!componentCallbacksC5392m.equals(this.f42872c.f(componentCallbacksC5392m.mWho)) || (componentCallbacksC5392m.mHost != null && componentCallbacksC5392m.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC5392m + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC5392m componentCallbacksC5392m2 = this.f42853A;
        this.f42853A = componentCallbacksC5392m;
        L(componentCallbacksC5392m2);
        L(this.f42853A);
    }

    @NonNull
    final P q0() {
        return this.f42872c;
    }

    public final void r(@NonNull String str) {
        this.f42882m.remove(str);
        if (D0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    @NonNull
    public final List<ComponentCallbacksC5392m> r0() {
        return this.f42872c.o();
    }

    public final void s(@NonNull String str) {
        o remove = this.f42883n.remove(str);
        if (remove != null) {
            remove.b();
        }
        if (D0(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + str);
        }
    }

    @NonNull
    public final AbstractC5401w<?> s0() {
        return this.f42893x;
    }

    @NonNull
    final LayoutInflater.Factory2 t0() {
        return this.f42875f;
    }

    public final void t1(@NonNull m mVar) {
        this.f42885p.p(mVar);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42895z;
        if (componentCallbacksC5392m != null) {
            sb2.append(componentCallbacksC5392m.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f42895z)));
            sb2.append("}");
        } else {
            AbstractC5401w<?> abstractC5401w = this.f42893x;
            if (abstractC5401w != null) {
                sb2.append(abstractC5401w.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f42893x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    final HashSet u(@NonNull ArrayList arrayList, int i11, int i12) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i11 < i12) {
            Iterator<Q.a> it = ((C5380a) arrayList.get(i11)).f42963a.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC5392m componentCallbacksC5392m = it.next().f42981b;
                if (componentCallbacksC5392m != null && (viewGroup = componentCallbacksC5392m.mContainer) != null) {
                    hashSet.add(f0.s(viewGroup, this));
                }
            }
            i11++;
        }
        return hashSet;
    }

    @NonNull
    final C5404z u0() {
        return this.f42885p;
    }

    @NonNull
    final O v(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        String str = componentCallbacksC5392m.mWho;
        P p11 = this.f42872c;
        O n11 = p11.n(str);
        if (n11 != null) {
            return n11;
        }
        O o11 = new O(this.f42885p, p11, componentCallbacksC5392m);
        o11.m(this.f42893x.e().getClassLoader());
        o11.r(this.f42892w);
        return o11;
    }

    final ComponentCallbacksC5392m v0() {
        return this.f42895z;
    }

    final void w(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (D0(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC5392m);
        }
        if (componentCallbacksC5392m.mDetached) {
            return;
        }
        componentCallbacksC5392m.mDetached = true;
        if (componentCallbacksC5392m.mAdded) {
            if (D0(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC5392m);
            }
            this.f42872c.u(componentCallbacksC5392m);
            if (E0(componentCallbacksC5392m)) {
                this.f42860H = true;
            }
            q1(componentCallbacksC5392m);
        }
    }

    public final ComponentCallbacksC5392m w0() {
        return this.f42853A;
    }

    final void x() {
        this.f42861I = false;
        this.f42862J = false;
        this.f42868P.p0(false);
        S(4);
    }

    @NonNull
    final g0 x0() {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42895z;
        return componentCallbacksC5392m != null ? componentCallbacksC5392m.mFragmentManager.x0() : this.f42855C;
    }

    final void y() {
        this.f42861I = false;
        this.f42862J = false;
        this.f42868P.p0(false);
        S(0);
    }

    @NonNull
    final A0 y0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        return this.f42868P.l0(componentCallbacksC5392m);
    }

    final void z(boolean z11, @NonNull Configuration configuration) {
        if (z11 && (this.f42893x instanceof androidx.core.content.c)) {
            s1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m : this.f42872c.o()) {
            if (componentCallbacksC5392m != null) {
                componentCallbacksC5392m.performConfigurationChanged(configuration);
                if (z11) {
                    componentCallbacksC5392m.mChildFragmentManager.z(true, configuration);
                }
            }
        }
    }

    final void z0() {
        this.f42878i = true;
        Z(true);
        this.f42878i = false;
        C5380a c5380a = this.f42877h;
        androidx.activity.C c11 = this.f42879j;
        if (c5380a == null) {
            if (c11.getIsEnabled()) {
                if (D0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                S0();
                return;
            } else {
                if (D0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f42876g.l();
                return;
            }
        }
        ArrayList<p> arrayList = this.f42884o;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(j0(this.f42877h));
            Iterator<p> it = arrayList.iterator();
            while (it.hasNext()) {
                p next = it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    next.a((ComponentCallbacksC5392m) it2.next(), true);
                }
            }
        }
        Iterator<Q.a> it3 = this.f42877h.f42963a.iterator();
        while (it3.hasNext()) {
            ComponentCallbacksC5392m componentCallbacksC5392m = it3.next().f42981b;
            if (componentCallbacksC5392m != null) {
                componentCallbacksC5392m.mTransitioning = false;
            }
        }
        Iterator it4 = u(new ArrayList(Collections.singletonList(this.f42877h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((f0) it4.next()).f();
        }
        Iterator<Q.a> it5 = this.f42877h.f42963a.iterator();
        while (it5.hasNext()) {
            ComponentCallbacksC5392m componentCallbacksC5392m2 = it5.next().f42981b;
            if (componentCallbacksC5392m2 != null && componentCallbacksC5392m2.mContainer == null) {
                v(componentCallbacksC5392m2).l();
            }
        }
        this.f42877h = null;
        u1();
        if (D0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + c11.getIsEnabled() + " for  FragmentManager " + this);
        }
    }
}
