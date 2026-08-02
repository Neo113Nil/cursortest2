package Q1;

import B90.RunnableC2599a;
import Sc.InterfaceC3999a;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import hd.C6915b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7837o0;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes.dex */
public final class N implements F {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f22840a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3850t f22841b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final T f22842c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22843d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f22844e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f22845f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private K f22846g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private r f22847h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private ArrayList f22848i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f22849j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f22850k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C3836e f22851l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final U0.b<a> f22852m;

    /* renamed from: n, reason: collision with root package name */
    private RunnableC2599a f22853n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a HideKeyboard;
        public static final a ShowKeyboard;
        public static final a StartInput;
        public static final a StopInput;

        static {
            a aVar = new a("StartInput", 0);
            StartInput = aVar;
            a aVar2 = new a("StopInput", 1);
            StopInput = aVar2;
            a aVar3 = new a("ShowKeyboard", 2);
            ShowKeyboard = aVar3;
            a aVar4 = new a("HideKeyboard", 3);
            HideKeyboard = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
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

    /* loaded from: classes8.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22854a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22854a = iArr;
        }
    }

    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function1<List<? extends InterfaceC3841j>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f22855b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC3841j> list) {
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class d extends AbstractC7737t implements Function1<C3848q, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f22856b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(C3848q c3848q) {
            c3848q.c();
            return Unit.f71690a;
        }
    }

    public N(@NotNull AndroidComposeView androidComposeView, @NotNull AndroidComposeView androidComposeView2) {
        long j11;
        r rVar;
        C3850t c3850t = new C3850t(androidComposeView);
        T t2 = new T(Choreographer.getInstance());
        this.f22840a = androidComposeView;
        this.f22841b = c3850t;
        this.f22842c = t2;
        this.f22844e = Q.f22859b;
        this.f22845f = S.f22860b;
        j11 = K1.Q.f15009b;
        this.f22846g = new K(4, j11, "");
        rVar = r.f22908g;
        this.f22847h = rVar;
        this.f22848i = new ArrayList();
        this.f22849j = Sc.k.a(Sc.n.NONE, new O(this));
        this.f22851l = new C3836e(androidComposeView2, c3850t);
        this.f22852m = new U0.b<>(new a[16]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Boolean] */
    public static void i(N n11) {
        n11.f22853n = null;
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
        U0.b<a> bVar = n11.f22852m;
        int m13 = bVar.m();
        if (m13 > 0) {
            a[] l11 = bVar.l();
            int i11 = 0;
            do {
                a aVar = l11[i11];
                int i12 = b.f22854a[aVar.ordinal()];
                if (i12 == 1) {
                    ?? r72 = Boolean.TRUE;
                    m11.f71787a = r72;
                    m12.f71787a = r72;
                } else if (i12 == 2) {
                    ?? r73 = Boolean.FALSE;
                    m11.f71787a = r73;
                    m12.f71787a = r73;
                } else if ((i12 == 3 || i12 == 4) && !Intrinsics.d(m11.f71787a, Boolean.FALSE)) {
                    m12.f71787a = Boolean.valueOf(aVar == a.ShowKeyboard);
                }
                i11++;
            } while (i11 < m13);
        }
        bVar.h();
        boolean d11 = Intrinsics.d(m11.f71787a, Boolean.TRUE);
        C3850t c3850t = n11.f22841b;
        if (d11) {
            c3850t.d();
        }
        Boolean bool = (Boolean) m12.f71787a;
        if (bool != null) {
            if (bool.booleanValue()) {
                c3850t.e();
            } else {
                c3850t.b();
            }
        }
        if (Intrinsics.d(m11.f71787a, Boolean.FALSE)) {
            c3850t.d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final BaseInputConnection j(N n11) {
        return (BaseInputConnection) n11.f22849j.getValue();
    }

    private final void r(a aVar) {
        this.f22852m.b(aVar);
        if (this.f22853n == null) {
            RunnableC2599a runnableC2599a = new RunnableC2599a(this, 4);
            this.f22842c.execute(runnableC2599a);
            this.f22853n = runnableC2599a;
        }
    }

    @Override // Q1.F
    public final void a(K k11, @NotNull K k12) {
        boolean z11 = (K1.Q.d(this.f22846g.e(), k12.e()) && Intrinsics.d(this.f22846g.d(), k12.d())) ? false : true;
        this.f22846g = k12;
        ArrayList arrayList = this.f22848i;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            G g10 = (G) ((WeakReference) arrayList.get(i11)).get();
            if (g10 != null) {
                g10.e(k12);
            }
        }
        this.f22851l.a();
        boolean d11 = Intrinsics.d(k11, k12);
        C3850t c3850t = this.f22841b;
        if (d11) {
            if (z11) {
                int h11 = K1.Q.h(k12.e());
                int g11 = K1.Q.g(k12.e());
                K1.Q d12 = this.f22846g.d();
                int h12 = d12 != null ? K1.Q.h(d12.k()) : -1;
                K1.Q d13 = this.f22846g.d();
                c3850t.h(h11, g11, h12, d13 != null ? K1.Q.g(d13.k()) : -1);
                return;
            }
            return;
        }
        if (k11 != null && (!Intrinsics.d(k11.f(), k12.f()) || (K1.Q.d(k11.e(), k12.e()) && !Intrinsics.d(k11.d(), k12.d())))) {
            c3850t.d();
            return;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            G g12 = (G) ((WeakReference) arrayList.get(i12)).get();
            if (g12 != null) {
                g12.f(this.f22846g, c3850t);
            }
        }
    }

    @Override // Q1.F
    public final void b() {
        this.f22843d = false;
        this.f22844e = c.f22855b;
        this.f22845f = d.f22856b;
        this.f22850k = null;
        r(a.StopInput);
    }

    @Override // Q1.F
    public final void c(@NotNull K k11, @NotNull D d11, @NotNull K1.K k12, @NotNull Function1<? super C7837o0, Unit> function1, @NotNull C7460f c7460f, @NotNull C7460f c7460f2) {
        this.f22851l.d(k11, d11, k12, function1, c7460f, c7460f2);
    }

    @Override // Q1.F
    public final void d() {
        r(a.StartInput);
    }

    @Override // Q1.F
    public final void e() {
        r(a.HideKeyboard);
    }

    @Override // Q1.F
    @InterfaceC3999a
    public final void f(@NotNull C7460f c7460f) {
        Rect rect;
        this.f22850k = new Rect(C6915b.c(c7460f.n()), C6915b.c(c7460f.q()), C6915b.c(c7460f.o()), C6915b.c(c7460f.h()));
        if (!this.f22848i.isEmpty() || (rect = this.f22850k) == null) {
            return;
        }
        this.f22840a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q1.F
    public final void g(@NotNull K k11, @NotNull r rVar, @NotNull Function1<? super List<? extends InterfaceC3841j>, Unit> function1, @NotNull Function1<? super C3848q, Unit> function12) {
        this.f22843d = true;
        this.f22846g = k11;
        this.f22847h = rVar;
        this.f22844e = (AbstractC7737t) function1;
        this.f22845f = (AbstractC7737t) function12;
        r(a.StartInput);
    }

    @Override // Q1.F
    public final void h() {
        r(a.ShowKeyboard);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final G o(@NotNull EditorInfo editorInfo) {
        int i11;
        int f7;
        if (!this.f22843d) {
            return null;
        }
        r rVar = this.f22847h;
        K k11 = this.f22846g;
        int e11 = rVar.e();
        if (e11 != 1) {
            if (e11 == 0) {
                i11 = 1;
            } else if (e11 == 2) {
                i11 = 2;
            } else if (e11 == 6) {
                i11 = 5;
            } else if (e11 == 5) {
                i11 = 7;
            } else if (e11 == 3) {
                i11 = 3;
            } else if (e11 == 4) {
                i11 = 4;
            } else {
                if (e11 != 7) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i11 = 6;
            }
            editorInfo.imeOptions = i11;
            f7 = rVar.f();
            if (f7 == 1) {
            }
            if (!rVar.g()) {
            }
            if ((editorInfo.inputType & 1) == 1) {
            }
            long e12 = k11.e();
            int i12 = K1.Q.f15010c;
            editorInfo.initialSelStart = (int) (e12 >> 32);
            editorInfo.initialSelEnd = (int) (k11.e() & 4294967295L);
            B2.a.b(editorInfo, k11.f());
            editorInfo.imeOptions |= 33554432;
            if (androidx.emoji2.text.j.j()) {
            }
            G g10 = new G(this.f22846g, new P(this), this.f22847h.b());
            this.f22848i.add(new WeakReference(g10));
            return g10;
        }
        if (!rVar.g()) {
            i11 = 0;
            editorInfo.imeOptions = i11;
            f7 = rVar.f();
            if (f7 == 1) {
                editorInfo.inputType = 1;
            } else if (f7 == 2) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions |= LinearLayoutManager.INVALID_OFFSET;
            } else if (f7 == 3) {
                editorInfo.inputType = 2;
            } else if (f7 == 4) {
                editorInfo.inputType = 3;
            } else if (f7 == 5) {
                editorInfo.inputType = 17;
            } else if (f7 == 6) {
                editorInfo.inputType = 33;
            } else if (f7 == 7) {
                editorInfo.inputType = 129;
            } else if (f7 == 8) {
                editorInfo.inputType = 18;
            } else {
                if (f7 != 9) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                editorInfo.inputType = 8194;
            }
            if (!rVar.g()) {
                int i13 = editorInfo.inputType;
                if ((i13 & 1) == 1) {
                    editorInfo.inputType = i13 | 131072;
                    if (rVar.e() == 1) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
            }
            if ((editorInfo.inputType & 1) == 1) {
                int c11 = rVar.c();
                if (c11 == 1) {
                    editorInfo.inputType |= 4096;
                } else if (c11 == 2) {
                    editorInfo.inputType |= 8192;
                } else if (c11 == 3) {
                    editorInfo.inputType |= 16384;
                }
                if (rVar.b()) {
                    editorInfo.inputType |= 32768;
                }
            }
            long e122 = k11.e();
            int i122 = K1.Q.f15010c;
            editorInfo.initialSelStart = (int) (e122 >> 32);
            editorInfo.initialSelEnd = (int) (k11.e() & 4294967295L);
            B2.a.b(editorInfo, k11.f());
            editorInfo.imeOptions |= 33554432;
            if (androidx.emoji2.text.j.j()) {
                androidx.emoji2.text.j.c().q(editorInfo);
            }
            G g102 = new G(this.f22846g, new P(this), this.f22847h.b());
            this.f22848i.add(new WeakReference(g102));
            return g102;
        }
        i11 = 6;
        editorInfo.imeOptions = i11;
        f7 = rVar.f();
        if (f7 == 1) {
        }
        if (!rVar.g()) {
        }
        if ((editorInfo.inputType & 1) == 1) {
        }
        long e1222 = k11.e();
        int i1222 = K1.Q.f15010c;
        editorInfo.initialSelStart = (int) (e1222 >> 32);
        editorInfo.initialSelEnd = (int) (k11.e() & 4294967295L);
        B2.a.b(editorInfo, k11.f());
        editorInfo.imeOptions |= 33554432;
        if (androidx.emoji2.text.j.j()) {
        }
        G g1022 = new G(this.f22846g, new P(this), this.f22847h.b());
        this.f22848i.add(new WeakReference(g1022));
        return g1022;
    }

    @NotNull
    public final View p() {
        return this.f22840a;
    }

    public final boolean q() {
        return this.f22843d;
    }
}
