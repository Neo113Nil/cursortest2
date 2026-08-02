package androidx.compose.ui.platform;

import M4.c;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import b1.C5514q;
import b1.InterfaceC5512o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"LS0/G0;", "Landroidx/lifecycle/J;", "getLocalLifecycleOwner", "()LS0/G0;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.O f40593a = new S0.O(a.f40600b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f40594b = new S0.B1(b.f40601b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f40595c = new S0.B1(c.f40602b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f40596d = new S0.B1(d.f40603b);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f40597e = new S0.B1(e.f40604b);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f40598f = new S0.B1(f.f40605b);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f40599g = 0;

    static final class a extends AbstractC7737t implements Function0<Configuration> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40600b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.b("LocalConfiguration");
            throw null;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Context> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f40601b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.b("LocalContext");
            throw null;
        }
    }

    static final class c extends AbstractC7737t implements Function0<G1.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f40602b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final G1.d invoke() {
            AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
            throw null;
        }
    }

    static final class d extends AbstractC7737t implements Function0<G1.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f40603b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final G1.f invoke() {
            AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
            throw null;
        }
    }

    static final class e extends AbstractC7737t implements Function0<M4.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f40604b = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final M4.e invoke() {
            AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
            throw null;
        }
    }

    static final class f extends AbstractC7737t implements Function0<View> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f40605b = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            AndroidCompositionLocals_androidKt.b("LocalView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@NotNull AndroidComposeView androidComposeView, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        boolean z11;
        C3969l u11 = interfaceC3967k.u(1396852028);
        if ((((u11.F(androidComposeView) ? 4 : 2) | i11 | (u11.F(c4912a) ? 32 : 16)) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Context context = androidComposeView.getContext();
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = S0.n1.f(new Configuration(context.getResources().getConfiguration()), S0.D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new V(interfaceC3978p0);
                u11.x(C12);
            }
            androidComposeView.S0((Function1) C12);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = new C5279r0(context);
                u11.x(C13);
            }
            C5279r0 c5279r0 = (C5279r0) C13;
            AndroidComposeView.b n02 = androidComposeView.n0();
            if (n02 == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                M4.e b11 = n02.b();
                Object parent = androidComposeView.getParent();
                Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = InterfaceC5512o.class.getSimpleName() + ':' + str;
                M4.c savedStateRegistry = b11.getSavedStateRegistry();
                Bundle b12 = savedStateRegistry.b(str2);
                if (b12 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : b12.keySet()) {
                        ArrayList parcelableArrayList = b12.getParcelableArrayList(str3);
                        Intrinsics.g(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                }
                final InterfaceC5512o a11 = C5514q.a(linkedHashMap, S0.f40736b);
                try {
                    savedStateRegistry.g(str2, new c.b() { // from class: androidx.compose.ui.platform.Q0
                        @Override // M4.c.b
                        public final Bundle saveState() {
                            Map<String, List<Object>> d11 = InterfaceC5512o.this.d();
                            Bundle bundle = new Bundle();
                            for (Map.Entry<String, List<Object>> entry : d11.entrySet()) {
                                String key = entry.getKey();
                                List<Object> value = entry.getValue();
                                bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                            }
                            return bundle;
                        }
                    });
                    z11 = true;
                } catch (IllegalArgumentException unused) {
                    z11 = false;
                }
                P0 p02 = new P0(a11, new R0(z11, savedStateRegistry, str2));
                u11.x(p02);
                C14 = p02;
            }
            P0 p03 = (P0) C14;
            Unit unit = Unit.f71690a;
            boolean F11 = u11.F(p03);
            Object C15 = u11.C();
            if (F11 || C15 == InterfaceC3967k.a.a()) {
                C15 = new X(p03);
                u11.x(C15);
            }
            S0.Q.c(unit, (Function1) C15, u11);
            Configuration configuration = (Configuration) interfaceC3978p0.getValue();
            Object C16 = u11.C();
            if (C16 == InterfaceC3967k.a.a()) {
                C16 = new G1.d();
                u11.x(C16);
            }
            G1.d dVar = (G1.d) C16;
            Object C17 = u11.C();
            Object obj = C17;
            if (C17 == InterfaceC3967k.a.a()) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                u11.x(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object C18 = u11.C();
            if (C18 == InterfaceC3967k.a.a()) {
                C18 = new ComponentCallbacks2C5235c0(configuration3, dVar);
                u11.x(C18);
            }
            ComponentCallbacks2C5235c0 componentCallbacks2C5235c0 = (ComponentCallbacks2C5235c0) C18;
            boolean F12 = u11.F(context);
            Object C19 = u11.C();
            if (F12 || C19 == InterfaceC3967k.a.a()) {
                C19 = new C5232b0(context, componentCallbacks2C5235c0);
                u11.x(C19);
            }
            S0.Q.c(dVar, (Function1) C19, u11);
            Object C21 = u11.C();
            if (C21 == InterfaceC3967k.a.a()) {
                C21 = new G1.f();
                u11.x(C21);
            }
            G1.f fVar = (G1.f) C21;
            Object C22 = u11.C();
            if (C22 == InterfaceC3967k.a.a()) {
                C22 = new ComponentCallbacks2C5244f0(fVar);
                u11.x(C22);
            }
            ComponentCallbacks2C5244f0 componentCallbacks2C5244f0 = (ComponentCallbacks2C5244f0) C22;
            boolean F13 = u11.F(context);
            Object C23 = u11.C();
            if (F13 || C23 == InterfaceC3967k.a.a()) {
                C23 = new C5241e0(context, componentCallbacks2C5244f0);
                u11.x(C23);
            }
            S0.Q.c(fVar, (Function1) C23, u11);
            C3996z.b(new S0.H0[]{f40593a.c((Configuration) interfaceC3978p0.getValue()), f40594b.c(context), e3.r.a().c(n02.a()), f40597e.c(n02.b()), C5514q.b().c(p03), f40598f.c(androidComposeView), f40595c.c(dVar), f40596d.c(fVar), K0.m().c(Boolean.valueOf(((Boolean) u11.m(K0.n())).booleanValue() | androidComposeView.j0()))}, a1.c.c(1471621628, new Y(androidComposeView, c5279r0, c4912a), u11), u11, 56);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Z(androidComposeView, c4912a, i11));
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final S0.O c() {
        return f40593a;
    }

    @NotNull
    public static final S0.B1 d() {
        return f40594b;
    }

    @NotNull
    public static final S0.B1 e() {
        return f40595c;
    }

    @NotNull
    public static final S0.B1 f() {
        return f40596d;
    }

    @NotNull
    public static final S0.B1 g() {
        return f40597e;
    }

    @NotNull
    public static final S0.G0<androidx.lifecycle.J> getLocalLifecycleOwner() {
        return e3.r.a();
    }

    @NotNull
    public static final S0.B1 h() {
        return f40598f;
    }
}
