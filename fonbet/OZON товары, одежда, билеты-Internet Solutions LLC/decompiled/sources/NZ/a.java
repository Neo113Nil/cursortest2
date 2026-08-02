package NZ;

import AZ.a;
import OZ.c;
import Sc.o;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import androidx.lifecycle.InterfaceC5431s;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sZ.AbstractC9643a;
import tZ.C9786a;

/* loaded from: classes3.dex */
public class a extends EZ.g {
    private final OZ.f destination;

    @NotNull
    private NZ.e fragmentFactory;

    @NotNull
    private Map<String, Integer> pathConfig;

    @NotNull
    private final xZ.h<C0369a> tabBackStack;

    @NotNull
    private NZ.c tabChangeListener;

    @NotNull
    private h tabConfig;

    /* renamed from: NZ.a$a, reason: collision with other inner class name */
    public static final class C0369a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<C0369a> CREATOR = new C0370a();

        /* renamed from: a, reason: collision with root package name */
        private final int f18850a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f18851b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f18852c;

        /* renamed from: NZ.a$a$a, reason: collision with other inner class name */
        public static final class C0370a implements Parcelable.Creator<C0369a> {
            @Override // android.os.Parcelable.Creator
            public final C0369a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0369a(parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final C0369a[] newArray(int i11) {
                return new C0369a[i11];
            }
        }

        public C0369a(int i11, boolean z11) {
            this.f18850a = i11;
            this.f18851b = z11;
            this.f18852c = String.valueOf(i11);
        }

        public final int a() {
            return this.f18850a;
        }

        @NotNull
        public final String b() {
            return this.f18852c;
        }

        public final boolean c() {
            return this.f18851b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0369a) {
                return this.f18850a == ((C0369a) obj).f18850a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18850a);
        }

        @NotNull
        public final String toString() {
            return "TabBackStackEntry(id=" + this.f18850a + ", isFake=" + this.f18851b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f18850a);
            dest.writeInt(this.f18851b ? 1 : 0);
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EZ.e<?> f18854c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18855d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EZ.e<?> eVar, int i11) {
            super(0);
            this.f18854c = eVar;
            this.f18855d = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.this.navigateBack(this.f18854c, this.f18855d);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EZ.e<?> f18857c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18858d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EZ.e<?> eVar, int i11) {
            super(0);
            this.f18857c = eVar;
            this.f18858d = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.this.navigateBack(this.f18857c.e(new C9786a()), this.f18858d);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EZ.e<?> f18860c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OZ.c f18861d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18862e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(EZ.e eVar, OZ.c cVar, int i11) {
            super(0);
            this.f18860c = eVar;
            this.f18861d = cVar;
            this.f18862e = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            while (true) {
                a aVar = a.this;
                if (aVar.getTabBackStack$compass_release().isEmpty()) {
                    aVar.getFragmentManager().c0();
                    aVar.navigate(this.f18860c.e(new OZ.e(aVar.getTabConfig().c(), this.f18861d.b())), this.f18862e);
                    return Unit.f71690a;
                }
                G fragmentManager = aVar.getFragmentManager();
                C0369a removeLast = aVar.getTabBackStack$compass_release().removeLast();
                Intrinsics.checkNotNullExpressionValue(removeLast, "removeLast(...)");
                aVar.closeTab(fragmentManager, removeLast);
            }
        }
    }

    static final class e extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EZ.e<?> f18864c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18865d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(EZ.e<?> eVar, int i11) {
            super(0);
            this.f18864c = eVar;
            this.f18865d = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = a.this;
            g activeTabOrNull = aVar.activeTabOrNull();
            int i11 = this.f18865d;
            EZ.e<?> eVar = this.f18864c;
            if (activeTabOrNull != null && activeTabOrNull.canHandleBackStack()) {
                aVar.redirect(eVar.e(new C9786a()), i11);
            } else if (aVar.getTabBackStack$compass_release().size() > 1) {
                aVar.navigateBack(eVar.e(new C9786a()), i11);
            }
            aVar.next(eVar, i11);
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0369a f18866b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f18867c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OZ.f f18868d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18869e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EZ.e<?> f18870f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f18871g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f18872h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C0369a c0369a, a aVar, OZ.f fVar, int i11, EZ.e<?> eVar, int i12, String str) {
            super(0);
            this.f18866b = c0369a;
            this.f18867c = aVar;
            this.f18868d = fVar;
            this.f18869e = i11;
            this.f18870f = eVar;
            this.f18871g = i12;
            this.f18872h = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = this.f18867c;
            C0369a c0369a = this.f18866b;
            if (c0369a != null) {
                aVar.saveTab(aVar.getFragmentManager(), c0369a);
            }
            OZ.f fVar = this.f18868d;
            pZ.f a11 = fVar.a();
            C0369a c0369a2 = new C0369a(this.f18869e, fVar instanceof OZ.d);
            boolean contains = aVar.getTabBackStack$compass_release().contains(c0369a2);
            int i11 = this.f18871g;
            EZ.e<?> eVar = this.f18870f;
            if (contains) {
                xZ.h<C0369a> tabBackStack$compass_release = aVar.getTabBackStack$compass_release();
                tabBackStack$compass_release.remove(c0369a2);
                tabBackStack$compass_release.add(c0369a2);
                aVar.restoreTab(aVar.getFragmentManager(), c0369a2);
                aVar.getFragmentManager().c0();
                aVar.tabChangeListener.onTabChanged(c0369a2.a());
                if (a11 != null) {
                    aVar.redirect(eVar.e(a11), i11);
                }
            } else {
                aVar.getTabBackStack$compass_release().addLast(c0369a2);
                Q p11 = aVar.getFragmentManager().p();
                NZ.e eVar2 = aVar.fragmentFactory;
                String str = this.f18872h;
                ComponentCallbacksC5392m create = eVar2.create(str);
                p11.b(aVar.requireContainerId$compass_release(), create, c0369a2.b());
                p11.w();
                p11.v(create);
                p11.i();
                aVar.getFragmentManager().c0();
                aVar.tabChangeListener.onTabChanged(c0369a2.a());
                if (a11 == null) {
                    aVar.redirect(eVar.e(new pZ.e(str)), i11);
                } else {
                    GZ.j c11 = eVar.c();
                    if (c11 == null || !aVar.isRootTabPage(c11)) {
                        aVar.redirect(eVar.e(new pZ.e(str)), i11);
                        aVar.redirect(eVar.e(a11), i11);
                    } else {
                        aVar.redirect(eVar.e(a11), i11);
                    }
                }
            }
            return Unit.f71690a;
        }
    }

    public /* synthetic */ a(ComponentCallbacksC5392m componentCallbacksC5392m, G g10, int i11, h hVar, OZ.f fVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentCallbacksC5392m, g10, i11, hVar, (i12 & 16) != 0 ? null : fVar);
    }

    private final Map<String, Integer> buildPathConfig(h hVar) {
        Tc.d builder = new Tc.d();
        Iterator<T> it = hVar.b().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.put(PZ.a.b((String) entry.getValue(), true), entry.getKey());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    private final void clearBackStack(EZ.e<?> eVar, int i11) {
        this.tabBackStack.clear();
        next(eVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeTab(G g10, C0369a c0369a) {
        ComponentCallbacksC5392m g02 = g10.g0(c0369a.b());
        if (g02 == null) {
            return;
        }
        Q p11 = g10.p();
        p11.q(g02);
        p11.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRootTabPage(GZ.j jVar) {
        return this.pathConfig.containsKey(PZ.a.a(jVar.b(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateBack(EZ.e<?> eVar, int i11) {
        if (this.tabBackStack.size() <= 1) {
            clearBackStack(eVar, i11);
            return;
        }
        C0369a removeLast = this.tabBackStack.removeLast();
        if (removeLast.c()) {
            clearBackStack(eVar, i11);
            return;
        }
        if (removeLast.a() == this.tabConfig.c()) {
            this.tabBackStack.addFirst(removeLast);
            saveTab(getFragmentManager(), removeLast);
        } else {
            closeTab(getFragmentManager(), removeLast);
        }
        C0369a last = this.tabBackStack.getLast();
        G fragmentManager = getFragmentManager();
        Intrinsics.f(last);
        restoreTab(fragmentManager, last);
        getFragmentManager().c0();
        this.tabChangeListener.onTabChanged(last.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreTab(G g10, C0369a c0369a) {
        ComponentCallbacksC5392m g02 = g10.g0(c0369a.b());
        if (g02 != null && g02.isDetached()) {
            Q p11 = g10.p();
            p11.h(g02);
            p11.v(g02);
            p11.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTab(G g10, C0369a c0369a) {
        ComponentCallbacksC5392m g02 = g10.g0(c0369a.b());
        if (g02 == null || g02.isDetached()) {
            return;
        }
        Q p11 = g10.p();
        p11.m(g02);
        p11.i();
    }

    private final void switchTab(EZ.e<?> eVar, OZ.f fVar, int i11) {
        int b11 = fVar.b();
        String deeplink = fVar instanceof OZ.d ? ((OZ.d) fVar).getDeeplink() : this.tabConfig.b().get(Integer.valueOf(b11));
        if (deeplink != null) {
            C0369a c0369a = (C0369a) C7714v.Y(this.tabBackStack);
            if (c0369a == null || c0369a.a() != b11) {
                safeTransaction(new f(c0369a, this, fVar, b11, eVar, i11, deeplink));
                return;
            }
            pZ.f a11 = fVar.a();
            if (a11 != null) {
                redirect(eVar.e(a11), i11);
                return;
            }
            return;
        }
        int i12 = AZ.b.f679a;
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.WARNING;
        AZ.b.b();
        AZ.a a12 = AZ.b.a();
        if (a12 != AZ.d.a()) {
            cVar.getClass();
            a12.a(new a.C0019a("Not found deeplink for tab id = " + fVar.b() + " in config " + this.tabConfig.b()));
        }
        pZ.f a13 = fVar.a();
        if (a13 != null) {
            redirect(eVar.e(a13), i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tabChangeListener$lambda$0(int i11) {
    }

    public final g activeTabOrNull() {
        InterfaceC5431s f02 = getFragmentManager().f0(requireContainerId$compass_release());
        if (f02 instanceof g) {
            return (g) f02;
        }
        return null;
    }

    @Override // EZ.g
    protected void attachToHolder() {
        if (activeTabOrNull() == null) {
            pZ.f fVar = this.destination;
            if (fVar == null) {
                fVar = new OZ.e(this.tabConfig.c(), null);
            }
            EZ.g.redirect$default(this, EZ.f.a(fVar), 0, 2, null);
        }
    }

    @NotNull
    public final Map<String, Integer> getPathConfig() {
        return this.pathConfig;
    }

    @NotNull
    public final xZ.h<C0369a> getTabBackStack$compass_release() {
        return this.tabBackStack;
    }

    @NotNull
    public final h getTabConfig() {
        return this.tabConfig;
    }

    @Override // EZ.g
    public void navigate(@NotNull EZ.e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        if (b11 instanceof OZ.f) {
            switchTab(response, (OZ.f) b11, i11);
            return;
        }
        if (b11 instanceof C9786a) {
            safeTransaction(new b(response, i11));
            return;
        }
        if (b11 instanceof OZ.c) {
            c.a a11 = ((OZ.c) b11).a();
            if (Intrinsics.d(a11, c.a.b.f20165a)) {
                safeTransaction(new c(response, i11));
                return;
            } else {
                if (!Intrinsics.d(a11, c.a.C0403a.f20164a)) {
                    throw new o();
                }
                safeTransaction(new d(response, (OZ.c) b11, i11));
                return;
            }
        }
        if (b11 instanceof CZ.a) {
            safeTransaction(new e(response, i11));
        } else if (b11 instanceof AbstractC9643a) {
            next(response, i11);
        } else {
            super.navigate(response, i11);
        }
    }

    public final void setFragmentFactory(@NotNull NZ.e tabFragmentFactory) {
        Intrinsics.checkNotNullParameter(tabFragmentFactory, "tabFragmentFactory");
        this.fragmentFactory = tabFragmentFactory;
    }

    public final void setOnTabChangeListener(@NotNull NZ.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.tabChangeListener = listener;
    }

    public final void setTabConfig(@NotNull h value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.d(value, this.tabConfig)) {
            this.pathConfig = buildPathConfig(value);
        }
        this.tabConfig = value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(@NotNull ComponentCallbacksC5392m fragment, @NotNull G fragmentManager, int i11, @NotNull h config, OZ.f fVar) {
        super(r0, Integer.valueOf(i11), fragmentManager, fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(config, "config");
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.destination = fVar;
        this.tabConfig = config;
        this.pathConfig = buildPathConfig(config);
        this.tabBackStack = new xZ.h<>(fragment);
        this.fragmentFactory = NZ.b.f18873a;
        this.tabChangeListener = new Bi.b();
    }
}
