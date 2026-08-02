package androidx.compose.ui.platform;

import D1.AbstractC2810k0;
import D1.C2809k;
import D1.C2822w;
import I1.C3222a;
import K1.C3422b;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.AbstractC5144m;
import androidx.collection.C5133b;
import androidx.collection.C5143l;
import androidx.collection.C5145n;
import androidx.collection.C5147p;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.C5234c;
import androidx.compose.ui.platform.C5237d;
import androidx.compose.ui.platform.C5240e;
import androidx.compose.ui.platform.C5243f;
import androidx.compose.ui.platform.C5246g;
import androidx.core.view.C5305a;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
import b2.C5520a;
import c2.C5728b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$Edition;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k0.C7445a;
import k1.C7459e;
import k1.C7460f;
import k1.C7461g;
import k1.C7464j;
import kd.InterfaceC7663b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y2.q;
import ze.C11115c;

/* renamed from: androidx.compose.ui.platform.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5299y extends C5305a {

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.B f41051K;

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private androidx.collection.A f41052A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final String f41053B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final String f41054C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final S1.r f41055D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private androidx.collection.C<L1> f41056E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private L1 f41057F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f41058G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final RunnableC5296x f41059H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final ArrayList f41060I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final Function1<K1, Unit> f41061J;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f41062a;

    /* renamed from: b, reason: collision with root package name */
    private int f41063b = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Function1<? super AccessibilityEvent, Boolean> f41064c = new k();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AccessibilityManager f41065d;

    /* renamed from: e, reason: collision with root package name */
    private long f41066e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AccessibilityManagerAccessibilityStateChangeListenerC5290v f41067f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AccessibilityManagerTouchExplorationStateChangeListenerC5293w f41068g;

    /* renamed from: h, reason: collision with root package name */
    private List<AccessibilityServiceInfo> f41069h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Handler f41070i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private d f41071j;

    /* renamed from: k, reason: collision with root package name */
    private int f41072k;

    /* renamed from: l, reason: collision with root package name */
    private y2.q f41073l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f41074m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.collection.C<I1.j> f41075n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.collection.C<I1.j> f41076o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private androidx.collection.a0<androidx.collection.a0<CharSequence>> f41077p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private androidx.collection.a0<androidx.collection.I<CharSequence>> f41078q;

    /* renamed from: r, reason: collision with root package name */
    private int f41079r;

    /* renamed from: s, reason: collision with root package name */
    private Integer f41080s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C5133b<D1.H> f41081t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final C11115c f41082u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f41083v;

    /* renamed from: w, reason: collision with root package name */
    private f f41084w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private androidx.collection.C f41085x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private androidx.collection.D f41086y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private androidx.collection.A f41087z;

    /* renamed from: androidx.compose.ui.platform.y$a */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NotNull View view) {
            C5299y c5299y = C5299y.this;
            AccessibilityManager accessibilityManager = c5299y.f41065d;
            accessibilityManager.addAccessibilityStateChangeListener(c5299y.f41067f);
            accessibilityManager.addTouchExplorationStateChangeListener(c5299y.f41068g);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View view) {
            C5299y c5299y = C5299y.this;
            c5299y.f41070i.removeCallbacks(c5299y.f41059H);
            AccessibilityManager accessibilityManager = c5299y.f41065d;
            accessibilityManager.removeAccessibilityStateChangeListener(c5299y.f41067f);
            accessibilityManager.removeTouchExplorationStateChangeListener(c5299y.f41068g);
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$b */
    private static final class b {
        public static final void a(@NotNull y2.q qVar, @NotNull I1.r rVar) {
            C3222a c3222a;
            if (!H.a(rVar) || (c3222a = (C3222a) I1.m.a(rVar.q(), I1.k.w())) == null) {
                return;
            }
            qVar.b(new q.a(R.id.accessibilityActionSetProgress, c3222a.b()));
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$c */
    private static final class c {
        public static final void a(@NotNull y2.q qVar, @NotNull I1.r rVar) {
            if (H.a(rVar)) {
                C3222a c3222a = (C3222a) I1.m.a(rVar.q(), I1.k.q());
                if (c3222a != null) {
                    qVar.b(new q.a(R.id.accessibilityActionPageUp, c3222a.b()));
                }
                C3222a c3222a2 = (C3222a) I1.m.a(rVar.q(), I1.k.n());
                if (c3222a2 != null) {
                    qVar.b(new q.a(R.id.accessibilityActionPageDown, c3222a2.b()));
                }
                C3222a c3222a3 = (C3222a) I1.m.a(rVar.q(), I1.k.o());
                if (c3222a3 != null) {
                    qVar.b(new q.a(R.id.accessibilityActionPageLeft, c3222a3.b()));
                }
                C3222a c3222a4 = (C3222a) I1.m.a(rVar.q(), I1.k.p());
                if (c3222a4 != null) {
                    qVar.b(new q.a(R.id.accessibilityActionPageRight, c3222a4.b()));
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$d */
    private final class d extends y2.r {
        public d() {
        }

        @Override // y2.r
        public final void a(int i11, @NotNull y2.q qVar, @NotNull String str, Bundle bundle) {
            C5299y.this.w(i11, qVar, str, bundle);
        }

        @Override // y2.r
        public final y2.q b(int i11) {
            C5299y c5299y = C5299y.this;
            y2.q f7 = C5299y.f(c5299y, i11);
            if (c5299y.f41074m && i11 == c5299y.f41072k) {
                c5299y.f41073l = f7;
            }
            return f7;
        }

        @Override // y2.r
        public final y2.q c(int i11) {
            return b(C5299y.this.f41072k);
        }

        @Override // y2.r
        public final boolean e(int i11, int i12, Bundle bundle) {
            return C5299y.s(C5299y.this, i11, i12, bundle);
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$e */
    /* loaded from: classes8.dex */
    private static final class e implements Comparator<I1.r> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f41090a = new e();

        @Override // java.util.Comparator
        public final int compare(I1.r rVar, I1.r rVar2) {
            C7460f h11 = rVar.h();
            C7460f h12 = rVar2.h();
            int compare = Float.compare(h11.n(), h12.n());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(h11.q(), h12.q());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(h11.h(), h12.h());
            return compare3 != 0 ? compare3 : Float.compare(h11.o(), h12.o());
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$f */
    /* loaded from: classes8.dex */
    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final I1.r f41091a;

        /* renamed from: b, reason: collision with root package name */
        private final int f41092b;

        /* renamed from: c, reason: collision with root package name */
        private final int f41093c;

        /* renamed from: d, reason: collision with root package name */
        private final int f41094d;

        /* renamed from: e, reason: collision with root package name */
        private final int f41095e;

        /* renamed from: f, reason: collision with root package name */
        private final long f41096f;

        public f(@NotNull I1.r rVar, int i11, int i12, int i13, int i14, long j11) {
            this.f41091a = rVar;
            this.f41092b = i11;
            this.f41093c = i12;
            this.f41094d = i13;
            this.f41095e = i14;
            this.f41096f = j11;
        }

        public final int a() {
            return this.f41092b;
        }

        public final int b() {
            return this.f41094d;
        }

        public final int c() {
            return this.f41093c;
        }

        @NotNull
        public final I1.r d() {
            return this.f41091a;
        }

        public final int e() {
            return this.f41095e;
        }

        public final long f() {
            return this.f41096f;
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$g */
    /* loaded from: classes8.dex */
    private static final class g implements Comparator<I1.r> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final g f41097a = new g();

        @Override // java.util.Comparator
        public final int compare(I1.r rVar, I1.r rVar2) {
            C7460f h11 = rVar.h();
            C7460f h12 = rVar2.h();
            int compare = Float.compare(h12.o(), h11.o());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(h11.q(), h12.q());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(h11.h(), h12.h());
            return compare3 != 0 ? compare3 : Float.compare(h12.n(), h11.n());
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$h */
    /* loaded from: classes8.dex */
    private static final class h implements Comparator<Pair<? extends C7460f, ? extends List<I1.r>>> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final h f41098a = new h();

        @Override // java.util.Comparator
        public final int compare(Pair<? extends C7460f, ? extends List<I1.r>> pair, Pair<? extends C7460f, ? extends List<I1.r>> pair2) {
            Pair<? extends C7460f, ? extends List<I1.r>> pair3 = pair;
            Pair<? extends C7460f, ? extends List<I1.r>> pair4 = pair2;
            int compare = Float.compare(pair3.e().q(), pair4.e().q());
            return compare != 0 ? compare : Float.compare(pair3.e().h(), pair4.e().h());
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$i */
    public /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41099a;

        static {
            int[] iArr = new int[J1.a.values().length];
            try {
                iArr[J1.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[J1.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[J1.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41099a = iArr;
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$j */
    /* loaded from: classes8.dex */
    static final class j extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f41100b = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$k */
    static final class k extends AbstractC7737t implements Function1<AccessibilityEvent, Boolean> {
        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            C5299y c5299y = C5299y.this;
            return Boolean.valueOf(c5299y.Q().getParent().requestSendAccessibilityEvent(c5299y.Q(), accessibilityEvent));
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$l */
    static final class l extends AbstractC7737t implements Function1<K1, Unit> {
        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(K1 k12) {
            C5299y.t(C5299y.this, k12);
            return Unit.f71690a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$m */
    /* loaded from: classes8.dex */
    static final class m extends AbstractC7737t implements Function1<D1.H, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f41103b = new m(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(D1.H h11) {
            I1.l B11 = h11.B();
            boolean z11 = false;
            if (B11 != null && B11.o()) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: androidx.compose.ui.platform.y$n */
    /* loaded from: classes8.dex */
    static final class n extends AbstractC7737t implements Function1<D1.H, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f41104b = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(D1.H h11) {
            return Boolean.valueOf(h11.c0().o(8));
        }
    }

    static {
        int i11;
        int[] elements = {ru.ozon.app.android.R.id.accessibility_custom_action_0, ru.ozon.app.android.R.id.accessibility_custom_action_1, ru.ozon.app.android.R.id.accessibility_custom_action_2, ru.ozon.app.android.R.id.accessibility_custom_action_3, ru.ozon.app.android.R.id.accessibility_custom_action_4, ru.ozon.app.android.R.id.accessibility_custom_action_5, ru.ozon.app.android.R.id.accessibility_custom_action_6, ru.ozon.app.android.R.id.accessibility_custom_action_7, ru.ozon.app.android.R.id.accessibility_custom_action_8, ru.ozon.app.android.R.id.accessibility_custom_action_9, ru.ozon.app.android.R.id.accessibility_custom_action_10, ru.ozon.app.android.R.id.accessibility_custom_action_11, ru.ozon.app.android.R.id.accessibility_custom_action_12, ru.ozon.app.android.R.id.accessibility_custom_action_13, ru.ozon.app.android.R.id.accessibility_custom_action_14, ru.ozon.app.android.R.id.accessibility_custom_action_15, ru.ozon.app.android.R.id.accessibility_custom_action_16, ru.ozon.app.android.R.id.accessibility_custom_action_17, ru.ozon.app.android.R.id.accessibility_custom_action_18, ru.ozon.app.android.R.id.accessibility_custom_action_19, ru.ozon.app.android.R.id.accessibility_custom_action_20, ru.ozon.app.android.R.id.accessibility_custom_action_21, ru.ozon.app.android.R.id.accessibility_custom_action_22, ru.ozon.app.android.R.id.accessibility_custom_action_23, ru.ozon.app.android.R.id.accessibility_custom_action_24, ru.ozon.app.android.R.id.accessibility_custom_action_25, ru.ozon.app.android.R.id.accessibility_custom_action_26, ru.ozon.app.android.R.id.accessibility_custom_action_27, ru.ozon.app.android.R.id.accessibility_custom_action_28, ru.ozon.app.android.R.id.accessibility_custom_action_29, ru.ozon.app.android.R.id.accessibility_custom_action_30, ru.ozon.app.android.R.id.accessibility_custom_action_31};
        int i12 = C5143l.f38716a;
        Intrinsics.checkNotNullParameter(elements, "elements");
        androidx.collection.B b11 = new androidx.collection.B(32);
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i13 = b11.f38715b;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i13 < 0 || i13 > (i11 = b11.f38715b)) {
            StringBuilder f7 = P4.f.f(i13, "Index ", " must be in 0..");
            f7.append(b11.f38715b);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        b11.c(i11 + 32);
        int[] iArr = b11.f38714a;
        int i14 = b11.f38715b;
        if (i13 != i14) {
            C7705l.p(i13 + 32, i13, iArr, iArr, i14);
        }
        C7705l.t(i13, 0, elements, iArr, 12);
        b11.f38715b += 32;
        f41051K = b11;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.v] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.platform.w] */
    public C5299y(@NotNull AndroidComposeView androidComposeView) {
        this.f41062a = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f41065d = accessibilityManager;
        this.f41066e = 100L;
        this.f41067f = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.v
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z11) {
                C5299y.c(C5299y.this, z11);
            }
        };
        this.f41068g = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.w
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z11) {
                C5299y.a(C5299y.this);
            }
        };
        this.f41069h = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f41070i = new Handler(Looper.getMainLooper());
        this.f41071j = new d();
        this.f41072k = LinearLayoutManager.INVALID_OFFSET;
        this.f41075n = new androidx.collection.C<>();
        this.f41076o = new androidx.collection.C<>();
        this.f41077p = new androidx.collection.a0<>(0);
        this.f41078q = new androidx.collection.a0<>(0);
        this.f41079r = -1;
        this.f41081t = new C5133b<>(0);
        this.f41082u = ze.k.a(1, 6, null);
        this.f41083v = true;
        this.f41085x = C5145n.a();
        this.f41086y = new androidx.collection.D((Object) null);
        this.f41087z = new androidx.collection.A();
        this.f41052A = new androidx.collection.A();
        this.f41053B = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f41054C = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f41055D = new S1.r();
        this.f41056E = new androidx.collection.C<>();
        this.f41057F = new L1(androidComposeView.getF40549m().a(), C5145n.a());
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.f41059H = new RunnableC5296x(this, 0);
        this.f41060I = new ArrayList();
        this.f41061J = new l();
    }

    private final AccessibilityEvent A(int i11, int i12) {
        M1 c11;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i12);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f41062a;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i11);
        if (R() && (c11 = G().c(i11)) != null) {
            I1.l q11 = c11.b().q();
            int i13 = I1.u.f11751H;
            obtain.setPassword(q11.e(I1.u.u()));
        }
        return obtain;
    }

    private final AccessibilityEvent B(int i11, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent A11 = A(i11, 8192);
        if (num != null) {
            A11.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            A11.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            A11.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            A11.getText().add(charSequence);
        }
        return A11;
    }

    private final void D(I1.r rVar, ArrayList<I1.r> arrayList, androidx.collection.C<List<I1.r>> c11) {
        boolean c12 = H.c(rVar);
        I1.l q11 = rVar.q();
        int i11 = I1.u.f11751H;
        boolean booleanValue = ((Boolean) q11.l(I1.u.q(), j.f41100b)).booleanValue();
        if ((booleanValue || S(rVar)) && G().b(rVar.l())) {
            arrayList.add(rVar);
        }
        if (booleanValue) {
            c11.j(rVar.l(), j0(C7714v.W0(I1.r.j(rVar, 7)), c12));
            return;
        }
        List j11 = I1.r.j(rVar, 7);
        int size = j11.size();
        for (int i12 = 0; i12 < size; i12++) {
            D((I1.r) j11.get(i12), arrayList, c11);
        }
    }

    private final int E(I1.r rVar) {
        I1.l q11 = rVar.q();
        int i11 = I1.u.f11751H;
        return (q11.e(I1.u.c()) || !rVar.q().e(I1.u.C())) ? this.f41079r : (int) (((K1.Q) rVar.q().k(I1.u.C())).k() & 4294967295L);
    }

    private final int F(I1.r rVar) {
        I1.l q11 = rVar.q();
        int i11 = I1.u.f11751H;
        return (q11.e(I1.u.c()) || !rVar.q().e(I1.u.C())) ? this.f41079r : (int) (((K1.Q) rVar.q().k(I1.u.C())).k() >> 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5144m<M1> G() {
        if (this.f41083v) {
            this.f41083v = false;
            this.f41085x = N1.b(this.f41062a.getF40549m());
            if (R()) {
                androidx.collection.A a11 = this.f41087z;
                a11.d();
                androidx.collection.A a12 = this.f41052A;
                a12.d();
                M1 c11 = G().c(-1);
                I1.r b11 = c11 != null ? c11.b() : null;
                Intrinsics.f(b11);
                ArrayList j02 = j0(C7714v.m0(b11), H.c(b11));
                int P11 = C7714v.P(j02);
                int i11 = 1;
                if (1 <= P11) {
                    while (true) {
                        int l11 = ((I1.r) j02.get(i11 - 1)).l();
                        int l12 = ((I1.r) j02.get(i11)).l();
                        a11.g(l11, l12);
                        a12.g(l12, l11);
                        if (i11 == P11) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return this.f41085x;
    }

    private static boolean L(I1.r rVar) {
        I1.l q11 = rVar.q();
        int i11 = I1.u.f11751H;
        J1.a aVar = (J1.a) I1.m.a(q11, I1.u.E());
        I1.i iVar = (I1.i) I1.m.a(rVar.q(), I1.u.w());
        boolean z11 = aVar != null;
        if (((Boolean) I1.m.a(rVar.q(), I1.u.y())) == null || (iVar != null && iVar.b() == 4)) {
            return z11;
        }
        return true;
    }

    private final String M(I1.r rVar) {
        Collection collection;
        CharSequence charSequence;
        I1.h hVar;
        I1.l q11 = rVar.q();
        int i11 = I1.u.f11751H;
        Object a11 = I1.m.a(q11, I1.u.z());
        J1.a aVar = (J1.a) I1.m.a(rVar.q(), I1.u.E());
        I1.i iVar = (I1.i) I1.m.a(rVar.q(), I1.u.w());
        AndroidComposeView androidComposeView = this.f41062a;
        if (aVar != null) {
            int i12 = i.f41099a[aVar.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3 && a11 == null) {
                        a11 = androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.indeterminate);
                    }
                } else if (iVar != null && iVar.b() == 2 && a11 == null) {
                    a11 = androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.state_off);
                }
            } else if (iVar != null && iVar.b() == 2 && a11 == null) {
                a11 = androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.state_on);
            }
        }
        Boolean bool = (Boolean) I1.m.a(rVar.q(), I1.u.y());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((iVar == null || iVar.b() != 4) && a11 == null) {
                a11 = booleanValue ? androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.selected) : androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.not_selected);
            }
        }
        I1.h hVar2 = (I1.h) I1.m.a(rVar.q(), I1.u.v());
        if (hVar2 != null) {
            hVar = I1.h.f11689c;
            if (hVar2 != hVar) {
                if (a11 == null) {
                    InterfaceC7663b<Float> c11 = hVar2.c();
                    float b11 = c11.e().floatValue() - c11.getStart().floatValue() == 0.0f ? 0.0f : (hVar2.b() - c11.getStart().floatValue()) / (c11.e().floatValue() - c11.getStart().floatValue());
                    if (b11 < 0.0f) {
                        b11 = 0.0f;
                    }
                    if (b11 > 1.0f) {
                        b11 = 1.0f;
                    }
                    a11 = androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.template_percent, Integer.valueOf(b11 == 0.0f ? 0 : b11 == 1.0f ? 100 : kotlin.ranges.h.e(Math.round(b11 * 100), 1, 99)));
                }
            } else if (a11 == null) {
                a11 = androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.in_progress);
            }
        }
        if (rVar.q().e(I1.u.e())) {
            I1.l k11 = rVar.a().k();
            Collection collection2 = (Collection) I1.m.a(k11, I1.u.c());
            a11 = ((collection2 == null || collection2.isEmpty()) && ((collection = (Collection) I1.m.a(k11, I1.u.B())) == null || collection.isEmpty()) && ((charSequence = (CharSequence) I1.m.a(k11, I1.u.e())) == null || charSequence.length() == 0)) ? androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.state_empty) : null;
        }
        return (String) a11;
    }

    private static C3422b N(I1.r rVar) {
        C3422b P11 = P(rVar.q());
        I1.l q11 = rVar.q();
        int i11 = I1.u.f11751H;
        List list = (List) I1.m.a(q11, I1.u.B());
        return P11 == null ? list != null ? (C3422b) C7714v.M(list) : null : P11;
    }

    private static String O(I1.r rVar) {
        C3422b c3422b;
        if (rVar != null) {
            I1.l q11 = rVar.q();
            int i11 = I1.u.f11751H;
            if (q11.e(I1.u.c())) {
                return C5520a.b((List) rVar.q().k(I1.u.c()), ",", null, 62);
            }
            if (rVar.q().e(I1.u.e())) {
                C3422b P11 = P(rVar.q());
                if (P11 != null) {
                    return P11.h();
                }
            } else {
                List list = (List) I1.m.a(rVar.q(), I1.u.B());
                if (list != null && (c3422b = (C3422b) C7714v.M(list)) != null) {
                    return c3422b.h();
                }
            }
        }
        return null;
    }

    private static C3422b P(I1.l lVar) {
        int i11 = I1.u.f11751H;
        return (C3422b) I1.m.a(lVar, I1.u.e());
    }

    private final boolean S(I1.r rVar) {
        I1.l q11 = rVar.q();
        int i11 = I1.u.f11751H;
        List list = (List) I1.m.a(q11, I1.u.c());
        return N1.f(rVar) && (rVar.q().o() || (rVar.t() && ((list != null ? (String) C7714v.M(list) : null) != null || N(rVar) != null || M(rVar) != null || L(rVar))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(D1.H h11) {
        if (this.f41081t.add(h11)) {
            this.f41082u.b(Unit.f71690a);
        }
    }

    private static final boolean W(I1.j jVar, float f7) {
        if (f7 >= 0.0f || jVar.c().invoke().floatValue() <= 0.0f) {
            return f7 > 0.0f && jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue();
        }
        return true;
    }

    private static final boolean X(I1.j jVar) {
        if (jVar.c().invoke().floatValue() <= 0.0f || jVar.b()) {
            return jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue() && jVar.b();
        }
        return true;
    }

    private static final boolean Y(I1.j jVar) {
        if (jVar.c().invoke().floatValue() >= jVar.a().invoke().floatValue() || jVar.b()) {
            return jVar.c().invoke().floatValue() > 0.0f && jVar.b();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Z(int i11) {
        if (i11 == this.f41062a.getF40549m().a().l()) {
            return -1;
        }
        return i11;
    }

    public static void a(C5299y c5299y) {
        c5299y.f41069h = c5299y.f41065d.getEnabledAccessibilityServiceList(-1);
    }

    private final void a0(I1.r rVar, L1 l12) {
        int i11 = C5147p.f38729b;
        androidx.collection.D d11 = new androidx.collection.D((Object) null);
        List j11 = I1.r.j(rVar, 4);
        int size = j11.size();
        for (int i12 = 0; i12 < size; i12++) {
            I1.r rVar2 = (I1.r) j11.get(i12);
            if (G().a(rVar2.l())) {
                if (!l12.a().a(rVar2.l())) {
                    T(rVar.n());
                    return;
                }
                d11.b(rVar2.l());
            }
        }
        androidx.collection.D a11 = l12.a();
        int[] iArr = a11.f38725b;
        long[] jArr = a11.f38724a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j12 = jArr[i13];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j12) < 128 && !d11.a(iArr[(i13 << 3) + i15])) {
                            T(rVar.n());
                            return;
                        }
                        j12 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        List j13 = I1.r.j(rVar, 4);
        int size2 = j13.size();
        for (int i16 = 0; i16 < size2; i16++) {
            I1.r rVar3 = (I1.r) j13.get(i16);
            if (G().a(rVar3.l())) {
                L1 c11 = this.f41056E.c(rVar3.l());
                Intrinsics.f(c11);
                a0(rVar3, c11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0540, code lost:
    
        if (r1.containsAll(r3) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0543, code lost:
    
        r32 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05a7, code lost:
    
        if (r2.a() != null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05b4, code lost:
    
        if (r2.a() == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05bb, code lost:
    
        if (r4 != false) goto L178;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [K1.b] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(C5299y c5299y) {
        int i11;
        AndroidComposeView androidComposeView;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        I1.l b11;
        AbstractC5144m<M1> abstractC5144m;
        int i17;
        int i18;
        int i19;
        AbstractC5144m<M1> abstractC5144m2;
        int i21;
        int i22;
        int i23;
        int i24;
        L1 c11;
        boolean z11;
        boolean z12;
        int i25;
        String str;
        int i26;
        AbstractC5144m<M1> abstractC5144m3;
        int i27;
        int i28;
        int i29;
        boolean z13;
        String h11;
        int i31;
        int i32;
        boolean z14;
        char c12;
        AccessibilityEvent B11;
        boolean z15 = true;
        c5299y.f41062a.x0(true);
        Unit unit = Unit.f71690a;
        boolean R11 = c5299y.R();
        AndroidComposeView androidComposeView2 = c5299y.f41062a;
        if (R11) {
            c5299y.a0(androidComposeView2.getF40549m().a(), c5299y.f41057F);
        }
        AbstractC5144m<M1> G11 = c5299y.G();
        ArrayList arrayList = c5299y.f41060I;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int[] iArr = G11.f38718b;
        long[] jArr = G11.f38717a;
        int i33 = 2;
        int length = jArr.length - 2;
        int i34 = 8;
        if (length >= 0) {
            i12 = 0;
            int i35 = 0;
            while (true) {
                long j11 = jArr[i35];
                boolean z16 = z15;
                androidComposeView = androidComposeView2;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i36 = 8 - ((~(i35 - length)) >>> 31);
                    long j12 = j11;
                    int i37 = 0;
                    while (i37 < i36) {
                        if ((j12 & 255) >= 128 || (c11 = c5299y.f41056E.c((i24 = iArr[(i35 << 3) + i37]))) == null) {
                            i19 = i37;
                            abstractC5144m2 = G11;
                            i21 = i33;
                            i22 = i35;
                            i23 = i34;
                        } else {
                            M1 c13 = G11.c(i24);
                            I1.r b12 = c13 != null ? c13.b() : null;
                            if (b12 == null) {
                                A1.a.c("no value for specified key");
                                throw null;
                            }
                            Iterator<Map.Entry<? extends I1.C<?>, ? extends Object>> it = b12.q().iterator();
                            boolean z17 = false;
                            while (it.hasNext()) {
                                Map.Entry<? extends I1.C<?>, ? extends Object> next = it.next();
                                int i38 = i33;
                                if (Intrinsics.d(next.getKey(), I1.u.i()) || Intrinsics.d(next.getKey(), I1.u.G())) {
                                    K1 a11 = N1.a(i24, arrayList2);
                                    if (a11 != null) {
                                        z12 = false;
                                    } else {
                                        a11 = new K1(i24, arrayList);
                                        z12 = z16;
                                    }
                                    arrayList.add(a11);
                                } else {
                                    z12 = false;
                                }
                                if (z12 || !Intrinsics.d(next.getValue(), I1.m.a(c11.b(), next.getKey()))) {
                                    I1.C<?> key = next.getKey();
                                    if (Intrinsics.d(key, I1.u.t())) {
                                        Object value = next.getValue();
                                        Intrinsics.g(value, "null cannot be cast to non-null type kotlin.String");
                                        String str2 = (String) value;
                                        if (c11.b().e(I1.u.t())) {
                                            c5299y.e0(i24, i34, str2);
                                        }
                                    } else if (Intrinsics.d(key, I1.u.z()) ? z16 : Intrinsics.d(key, I1.u.E())) {
                                        d0(c5299y, c5299y.Z(i24), 2048, 64, i34);
                                        d0(c5299y, c5299y.Z(i24), 2048, 0, i34);
                                    } else if (Intrinsics.d(key, I1.u.v())) {
                                        d0(c5299y, c5299y.Z(i24), 2048, 64, i34);
                                        d0(c5299y, c5299y.Z(i24), 2048, 0, i34);
                                    } else {
                                        if (Intrinsics.d(key, I1.u.y())) {
                                            I1.i iVar = (I1.i) I1.m.a(b12.q(), I1.u.w());
                                            if (!((iVar != null && iVar.b() == 4) ? z16 : false)) {
                                                i25 = i34;
                                                d0(c5299y, c5299y.Z(i24), 2048, 64, i25);
                                                d0(c5299y, c5299y.Z(i24), 2048, 0, i25);
                                            } else if (Intrinsics.d(I1.m.a(b12.q(), I1.u.y()), Boolean.TRUE)) {
                                                AccessibilityEvent A11 = c5299y.A(c5299y.Z(i24), 4);
                                                I1.r a12 = b12.a();
                                                List list = (List) I1.m.a(a12.k(), I1.u.c());
                                                String b13 = list != null ? C5520a.b(list, ",", null, 62) : null;
                                                List list2 = (List) I1.m.a(a12.k(), I1.u.B());
                                                String b14 = list2 != null ? C5520a.b(list2, ",", null, 62) : null;
                                                if (b13 != null) {
                                                    A11.setContentDescription(b13);
                                                    Unit unit2 = Unit.f71690a;
                                                }
                                                if (b14 != null) {
                                                    A11.getText().add(b14);
                                                }
                                                c5299y.b0(A11);
                                                i26 = i37;
                                                abstractC5144m3 = G11;
                                                i28 = i35;
                                                i27 = 8;
                                                i29 = i24;
                                                i24 = i29;
                                                i34 = i27;
                                                i35 = i28;
                                                i33 = i38;
                                                G11 = abstractC5144m3;
                                                i37 = i26;
                                            } else {
                                                i25 = 8;
                                                d0(c5299y, c5299y.Z(i24), 2048, 0, 8);
                                            }
                                        } else {
                                            i25 = i34;
                                            if (Intrinsics.d(key, I1.u.c())) {
                                                int Z11 = c5299y.Z(i24);
                                                Object value2 = next.getValue();
                                                Intrinsics.g(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                c5299y.c0(Z11, 2048, 4, (List) value2);
                                            } else {
                                                str = "";
                                                if (!Intrinsics.d(key, I1.u.e())) {
                                                    i26 = i37;
                                                    abstractC5144m3 = G11;
                                                    i27 = i25;
                                                    i28 = i35;
                                                    i29 = i24;
                                                    if (Intrinsics.d(key, I1.u.C())) {
                                                        C3422b P11 = P(b12.q());
                                                        if (P11 != null && (h11 = P11.h()) != null) {
                                                            str = h11;
                                                        }
                                                        long k11 = ((K1.Q) b12.q().k(I1.u.C())).k();
                                                        c5299y.b0(c5299y.B(c5299y.Z(i29), Integer.valueOf((int) (k11 >> 32)), Integer.valueOf((int) (k11 & 4294967295L)), Integer.valueOf(str.length()), k0(str)));
                                                        c5299y.f0(b12.l());
                                                    } else if (Intrinsics.d(key, I1.u.i()) ? z16 : Intrinsics.d(key, I1.u.G())) {
                                                        c5299y.T(b12.n());
                                                        K1 a13 = N1.a(i29, arrayList);
                                                        Intrinsics.f(a13);
                                                        a13.f((I1.j) I1.m.a(b12.q(), I1.u.i()));
                                                        a13.i((I1.j) I1.m.a(b12.q(), I1.u.G()));
                                                        if (a13.m0()) {
                                                            androidComposeView.getF40501C().f(a13, c5299y.f41061J, new A(c5299y, a13));
                                                        }
                                                    } else if (Intrinsics.d(key, I1.u.g())) {
                                                        Object value3 = next.getValue();
                                                        Intrinsics.g(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                        if (((Boolean) value3).booleanValue()) {
                                                            c5299y.b0(c5299y.A(c5299y.Z(b12.l()), i27));
                                                        }
                                                        d0(c5299y, c5299y.Z(b12.l()), 2048, 0, i27);
                                                    } else if (Intrinsics.d(key, I1.k.d())) {
                                                        List list3 = (List) b12.q().k(I1.k.d());
                                                        List list4 = (List) I1.m.a(c11.b(), I1.k.d());
                                                        if (list4 != null) {
                                                            ?? linkedHashSet = new LinkedHashSet();
                                                            int size = list3.size();
                                                            for (int i39 = 0; i39 < size; i39++) {
                                                                ((I1.e) list3.get(i39)).getClass();
                                                                linkedHashSet.add(null);
                                                            }
                                                            boolean z18 = false;
                                                            ?? linkedHashSet2 = new LinkedHashSet();
                                                            int size2 = list4.size();
                                                            int i41 = 0;
                                                            while (i41 < size2) {
                                                                ((I1.e) list4.get(i41)).getClass();
                                                                linkedHashSet2.add(z18);
                                                                i41++;
                                                                z18 = false;
                                                            }
                                                            if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                            }
                                                            z17 = z16;
                                                        } else if (!list3.isEmpty()) {
                                                            i24 = i29;
                                                            i34 = i27;
                                                            i35 = i28;
                                                            z17 = z16;
                                                            i33 = i38;
                                                            G11 = abstractC5144m3;
                                                            i37 = i26;
                                                        }
                                                    } else {
                                                        if (next.getValue() instanceof C3222a) {
                                                            Object value4 = next.getValue();
                                                            Intrinsics.g(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                            C3222a c3222a = (C3222a) value4;
                                                            Object a14 = I1.m.a(c11.b(), next.getKey());
                                                            if (c3222a != a14) {
                                                                if (a14 instanceof C3222a) {
                                                                    C3222a c3222a2 = (C3222a) a14;
                                                                    if (Intrinsics.d(c3222a.b(), c3222a2.b())) {
                                                                        if (c3222a.a() == null) {
                                                                        }
                                                                        if (c3222a.a() != null) {
                                                                        }
                                                                    }
                                                                }
                                                                z13 = false;
                                                            }
                                                            z13 = z16;
                                                        }
                                                        z17 = z16;
                                                    }
                                                } else if (b12.q().e(I1.k.y())) {
                                                    C3422b P12 = P(c11.b());
                                                    if (P12 == null) {
                                                        P12 = "";
                                                    }
                                                    ?? P13 = P(b12.q());
                                                    str = P13 != 0 ? P13 : "";
                                                    CharSequence k02 = k0(str);
                                                    int length2 = P12.length();
                                                    int length3 = str.length();
                                                    int i42 = length2 > length3 ? length3 : length2;
                                                    int i43 = 0;
                                                    while (true) {
                                                        i31 = length3;
                                                        if (i43 >= i42) {
                                                            i26 = i37;
                                                            break;
                                                        }
                                                        i26 = i37;
                                                        if (P12.charAt(i43) != str.charAt(i43)) {
                                                            break;
                                                        }
                                                        i43++;
                                                        length3 = i31;
                                                        i37 = i26;
                                                    }
                                                    int i44 = 0;
                                                    while (true) {
                                                        if (i44 >= i42 - i43) {
                                                            i32 = i44;
                                                            break;
                                                        }
                                                        i32 = i44;
                                                        if (P12.charAt((length2 - 1) - i44) != str.charAt((i31 - 1) - i32)) {
                                                            break;
                                                        } else {
                                                            i44 = i32 + 1;
                                                        }
                                                    }
                                                    int i45 = (length2 - i32) - i43;
                                                    int i46 = (i31 - i32) - i43;
                                                    boolean e11 = c11.b().e(I1.u.u());
                                                    abstractC5144m3 = G11;
                                                    boolean e12 = b12.q().e(I1.u.u());
                                                    boolean e13 = c11.b().e(I1.u.e());
                                                    boolean z19 = (e13 && !e11 && e12) ? z16 : false;
                                                    boolean z21 = (e13 && e11 && !e12) ? z16 : false;
                                                    if (z19 || z21) {
                                                        z14 = z21;
                                                        i29 = i24;
                                                        i28 = i35;
                                                        i27 = 8;
                                                        c12 = ' ';
                                                        B11 = c5299y.B(c5299y.Z(i24), 0, 0, Integer.valueOf(i31), k02);
                                                    } else {
                                                        z14 = z21;
                                                        AccessibilityEvent A12 = c5299y.A(c5299y.Z(i24), 16);
                                                        A12.setFromIndex(i43);
                                                        A12.setRemovedCount(i45);
                                                        A12.setAddedCount(i46);
                                                        A12.setBeforeText(P12);
                                                        A12.getText().add(k02);
                                                        i29 = i24;
                                                        B11 = A12;
                                                        i28 = i35;
                                                        i27 = 8;
                                                        c12 = ' ';
                                                    }
                                                    B11.setClassName("android.widget.EditText");
                                                    c5299y.b0(B11);
                                                    if (z19 || z14) {
                                                        long k12 = ((K1.Q) b12.q().k(I1.u.C())).k();
                                                        B11.setFromIndex((int) (k12 >> c12));
                                                        B11.setToIndex((int) (k12 & 4294967295L));
                                                        c5299y.b0(B11);
                                                    }
                                                } else {
                                                    i26 = i37;
                                                    abstractC5144m3 = G11;
                                                    i27 = i25;
                                                    i28 = i35;
                                                    i29 = i24;
                                                    d0(c5299y, c5299y.Z(i29), 2048, Integer.valueOf(i38), i27);
                                                }
                                                i24 = i29;
                                                i34 = i27;
                                                i35 = i28;
                                                i33 = i38;
                                                G11 = abstractC5144m3;
                                                i37 = i26;
                                            }
                                        }
                                        i26 = i37;
                                        abstractC5144m3 = G11;
                                        i27 = i25;
                                        i28 = i35;
                                        i29 = i24;
                                        i24 = i29;
                                        i34 = i27;
                                        i35 = i28;
                                        i33 = i38;
                                        G11 = abstractC5144m3;
                                        i37 = i26;
                                    }
                                }
                                i26 = i37;
                                abstractC5144m3 = G11;
                                i28 = i35;
                                i27 = i34;
                                i29 = i24;
                                i24 = i29;
                                i34 = i27;
                                i35 = i28;
                                i33 = i38;
                                G11 = abstractC5144m3;
                                i37 = i26;
                            }
                            i19 = i37;
                            abstractC5144m2 = G11;
                            i21 = i33;
                            i22 = i35;
                            i23 = i34;
                            int i47 = i24;
                            if (!z17) {
                                Iterator<Map.Entry<? extends I1.C<?>, ? extends Object>> it2 = c11.b().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (!b12.k().e(it2.next().getKey())) {
                                            z11 = z16;
                                            break;
                                        }
                                    } else {
                                        z11 = false;
                                        break;
                                    }
                                }
                                z17 = z11;
                            }
                            if (z17) {
                                d0(c5299y, c5299y.Z(i47), 2048, 0, i23);
                            }
                        }
                        j12 >>= i23;
                        i37 = i19 + 1;
                        i34 = i23;
                        i35 = i22;
                        i33 = i21;
                        G11 = abstractC5144m2;
                    }
                    abstractC5144m = G11;
                    i17 = i33;
                    i18 = i35;
                    i13 = 32;
                    i11 = i34;
                    if (i36 != i11) {
                        break;
                    }
                } else {
                    abstractC5144m = G11;
                    i17 = i33;
                    i18 = i35;
                    i13 = 32;
                    i11 = i34;
                }
                if (i18 == length) {
                    break;
                }
                i35 = i18 + 1;
                i34 = i11;
                z15 = z16;
                androidComposeView2 = androidComposeView;
                i33 = i17;
                G11 = abstractC5144m;
            }
        } else {
            i11 = 8;
            androidComposeView = androidComposeView2;
            i12 = 0;
            i13 = 32;
        }
        I1.r rVar = null;
        androidx.collection.D d11 = new androidx.collection.D((Object) null);
        androidx.collection.D d12 = c5299y.f41086y;
        int[] iArr2 = d12.f38725b;
        long[] jArr2 = d12.f38724a;
        int length4 = jArr2.length - 2;
        androidx.collection.C<L1> c14 = c5299y.f41056E;
        if (length4 >= 0) {
            int i48 = i12;
            while (true) {
                long j13 = jArr2[i48];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i49 = 8 - ((~(i48 - length4)) >>> 31);
                    long j14 = j13;
                    int i51 = i12;
                    while (i51 < i49) {
                        if ((j14 & 255) < 128) {
                            int i52 = iArr2[(i48 << 3) + i51];
                            M1 c15 = c5299y.G().c(i52);
                            I1.r b15 = c15 != null ? c15.b() : rVar;
                            if (b15 == null || !b15.q().e(I1.u.t())) {
                                d11.b(i52);
                                L1 c16 = c14.c(i52);
                                i16 = i13;
                                c5299y.e0(i52, i16, (c16 == null || (b11 = c16.b()) == null) ? null : (String) I1.m.a(b11, I1.u.t()));
                                j14 >>= i11;
                                i51++;
                                i13 = i16;
                                rVar = null;
                            }
                        }
                        i16 = i13;
                        j14 >>= i11;
                        i51++;
                        i13 = i16;
                        rVar = null;
                    }
                    i15 = i13;
                    if (i49 != i11) {
                        break;
                    }
                } else {
                    i15 = i13;
                }
                if (i48 == length4) {
                    break;
                }
                i48++;
                i13 = i15;
                rVar = null;
            }
        }
        d12.g(d11);
        c14.d();
        AbstractC5144m<M1> G12 = c5299y.G();
        int[] iArr3 = G12.f38718b;
        Object[] objArr = G12.f38719c;
        long[] jArr3 = G12.f38717a;
        int length5 = jArr3.length - 2;
        if (length5 >= 0) {
            int i53 = i12;
            while (true) {
                long j15 = jArr3[i53];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i54 = 8 - ((~(i53 - length5)) >>> 31);
                    long j16 = j15;
                    int i55 = i12;
                    while (i55 < i54) {
                        if ((j16 & 255) < 128) {
                            int i56 = (i53 << 3) + i55;
                            int i57 = iArr3[i56];
                            M1 m12 = (M1) objArr[i56];
                            i14 = i11;
                            if (m12.b().q().e(I1.u.t()) && d12.b(i57)) {
                                c5299y.e0(i57, 16, (String) m12.b().q().k(I1.u.t()));
                            }
                            c14.j(i57, new L1(m12.b(), c5299y.G()));
                        } else {
                            i14 = i11;
                        }
                        j16 >>= i14;
                        i55++;
                        i11 = i14;
                    }
                    if (i54 != i11) {
                        break;
                    }
                }
                if (i53 == length5) {
                    break;
                } else {
                    i53++;
                }
            }
        }
        c5299y.f41057F = new L1(androidComposeView.getF40549m().a(), c5299y.G());
        c5299y.f41058G = i12;
    }

    private final boolean b0(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f41074m = true;
        }
        try {
            return ((Boolean) ((k) this.f41064c).invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f41074m = false;
        }
    }

    public static void c(C5299y c5299y, boolean z11) {
        c5299y.f41069h = z11 ? c5299y.f41065d.getEnabledAccessibilityServiceList(-1) : kotlin.collections.K.f71697a;
    }

    private final boolean c0(int i11, int i12, Integer num, List<String> list) {
        if (i11 == Integer.MIN_VALUE || !R()) {
            return false;
        }
        AccessibilityEvent A11 = A(i11, i12);
        if (num != null) {
            A11.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            A11.setContentDescription(C5520a.b(list, ",", null, 62));
        }
        return b0(A11);
    }

    static /* synthetic */ void d0(C5299y c5299y, int i11, int i12, Integer num, int i13) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        c5299y.c0(i11, i12, num, null);
    }

    private final void e0(int i11, int i12, String str) {
        AccessibilityEvent A11 = A(Z(i11), 32);
        A11.setContentChangeTypes(i12);
        if (str != null) {
            A11.getText().add(str);
        }
        b0(A11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0567, code lost:
    
        if ((r5 != null ? kotlin.jvm.internal.Intrinsics.d(I1.m.a(r5, I1.u.g()), java.lang.Boolean.TRUE) : false) == false) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x056e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final y2.q f(C5299y c5299y, int i11) {
        Bundle bundle;
        View g10;
        int i12;
        I1.h hVar;
        boolean z11;
        boolean z12;
        boolean z13;
        androidx.lifecycle.J a11;
        AbstractC5434v lifecycle;
        AndroidComposeView androidComposeView = c5299y.f41062a;
        AndroidComposeView.b n02 = androidComposeView.n0();
        if (((n02 == null || (a11 = n02.a()) == null || (lifecycle = a11.getLifecycle()) == null) ? null : lifecycle.b()) != AbstractC5434v.b.DESTROYED) {
            y2.q z14 = y2.q.z();
            M1 c11 = c5299y.G().c(i11);
            if (c11 != null) {
                I1.r b11 = c11.b();
                if (i11 == -1) {
                    Object parentForAccessibility = androidComposeView.getParentForAccessibility();
                    z14.h0(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
                } else {
                    I1.r o11 = b11.o();
                    Integer valueOf = o11 != null ? Integer.valueOf(o11.l()) : null;
                    if (valueOf == null) {
                        A1.a.c("semanticsNode " + i11 + " has null parent");
                        throw null;
                    }
                    int intValue = valueOf.intValue();
                    if (intValue == androidComposeView.getF40549m().a().l()) {
                        intValue = -1;
                    }
                    z14.g0(intValue, androidComposeView);
                }
                z14.p0(i11, androidComposeView);
                z14.H(c5299y.x(c11));
                z14.K("android.view.View");
                I1.l q11 = b11.q();
                int i13 = I1.u.f11751H;
                if (q11.e(I1.u.e())) {
                    z14.K("android.widget.EditText");
                }
                if (b11.q().e(I1.u.B())) {
                    z14.K("android.widget.TextView");
                }
                I1.i iVar = (I1.i) I1.m.a(b11.q(), I1.u.w());
                if (iVar != null) {
                    if (b11.r() || I1.r.j(b11, 4).isEmpty()) {
                        if (iVar.b() == 4) {
                            z14.k0(androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.tab));
                        } else if (iVar.b() == 2) {
                            z14.k0(androidComposeView.getContext().getResources().getString(ru.ozon.app.android.R.string.switch_role));
                        } else {
                            CharSequence h11 = N1.h(iVar.b());
                            if (iVar.b() != 5 || b11.t() || b11.q().o()) {
                                z14.K(h11);
                            }
                        }
                    }
                    Unit unit = Unit.f71690a;
                }
                z14.e0(androidComposeView.getContext().getPackageName());
                z14.Y(N1.e(b11));
                List j11 = I1.r.j(b11, 4);
                int size = j11.size();
                for (int i14 = 0; i14 < size; i14++) {
                    I1.r rVar = (I1.r) j11.get(i14);
                    if (c5299y.G().a(rVar.l())) {
                        C5728b c5728b = androidComposeView.d0().b().get(rVar.n());
                        if (rVar.l() != -1) {
                            if (c5728b != null) {
                                z14.d(c5728b);
                            } else {
                                z14.c(rVar.l(), androidComposeView);
                            }
                        }
                    }
                }
                if (i11 == c5299y.f41072k) {
                    z14.E(true);
                    z14.b(q.a.f105944g);
                } else {
                    z14.E(false);
                    z14.b(q.a.f105943f);
                }
                C3422b N11 = N(b11);
                z14.r0(N11 != null ? (SpannableString) k0(S1.a.a(N11, androidComposeView.g(), androidComposeView.v(), c5299y.f41055D)) : null);
                I1.l q12 = b11.q();
                int i15 = I1.u.f11751H;
                if (q12.e(I1.u.f())) {
                    z14.P();
                    z14.T((CharSequence) I1.m.a(b11.q(), I1.u.f()));
                }
                z14.q0(c5299y.M(b11));
                z14.I(L(b11));
                J1.a aVar = (J1.a) I1.m.a(b11.q(), I1.u.E());
                if (aVar != null) {
                    if (aVar == J1.a.On) {
                        z14.J(true);
                    } else if (aVar == J1.a.Off) {
                        z14.J(false);
                    }
                    Unit unit2 = Unit.f71690a;
                }
                Boolean bool = (Boolean) I1.m.a(b11.q(), I1.u.y());
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (iVar != null && iVar.b() == 4) {
                        z14.n0(booleanValue);
                    } else {
                        z14.J(booleanValue);
                    }
                    Unit unit3 = Unit.f71690a;
                }
                if (!b11.q().o() || I1.r.j(b11, 4).isEmpty()) {
                    List list = (List) I1.m.a(b11.q(), I1.u.c());
                    z14.O(list != null ? (String) C7714v.M(list) : null);
                }
                String str = (String) I1.m.a(b11.q(), I1.u.A());
                if (str != null) {
                    I1.r rVar2 = b11;
                    while (true) {
                        if (rVar2 == null) {
                            z13 = false;
                            break;
                        }
                        if (rVar2.q().e(I1.v.a())) {
                            z13 = ((Boolean) rVar2.q().k(I1.v.a())).booleanValue();
                            break;
                        }
                        rVar2 = rVar2.o();
                    }
                    if (z13) {
                        z14.x0(str);
                    }
                }
                I1.l q13 = b11.q();
                int i16 = I1.u.f11751H;
                if (((Unit) I1.m.a(q13, I1.u.h())) != null) {
                    z14.W(true);
                    Unit unit4 = Unit.f71690a;
                }
                z14.i0(b11.q().e(I1.u.u()));
                z14.R(b11.q().e(I1.u.n()));
                Integer num = (Integer) I1.m.a(b11.q(), I1.u.s());
                z14.c0(num != null ? num.intValue() : -1);
                z14.S(H.a(b11));
                z14.U(b11.q().e(I1.u.g()));
                if (z14.u()) {
                    z14.V(((Boolean) b11.q().k(I1.u.g())).booleanValue());
                    if (z14.v()) {
                        z14.a(2);
                    } else {
                        z14.a(1);
                    }
                }
                z14.y0(N1.f(b11));
                if (((I1.g) I1.m.a(b11.q(), I1.u.r())) != null) {
                    z14.a0(1);
                    Unit unit5 = Unit.f71690a;
                }
                z14.L(false);
                C3222a c3222a = (C3222a) I1.m.a(b11.q(), I1.k.k());
                if (c3222a != null) {
                    boolean d11 = Intrinsics.d(I1.m.a(b11.q(), I1.u.y()), Boolean.TRUE);
                    if (!(iVar != null && iVar.b() == 4)) {
                        if (!(iVar != null && iVar.b() == 3)) {
                            z12 = false;
                            z14.L(z12 || (z12 && !d11));
                            if (H.a(b11) && z14.s()) {
                                z14.b(new q.a(16, c3222a.b()));
                            }
                            Unit unit6 = Unit.f71690a;
                        }
                    }
                    z12 = true;
                    z14.L(z12 || (z12 && !d11));
                    if (H.a(b11)) {
                        z14.b(new q.a(16, c3222a.b()));
                    }
                    Unit unit62 = Unit.f71690a;
                }
                z14.b0(false);
                C3222a c3222a2 = (C3222a) I1.m.a(b11.q(), I1.k.m());
                if (c3222a2 != null) {
                    z14.b0(true);
                    if (H.a(b11)) {
                        z14.b(new q.a(32, c3222a2.b()));
                    }
                    Unit unit7 = Unit.f71690a;
                }
                C3222a c3222a3 = (C3222a) I1.m.a(b11.q(), I1.k.c());
                if (c3222a3 != null) {
                    z14.b(new q.a(16384, c3222a3.b()));
                    Unit unit8 = Unit.f71690a;
                }
                if (H.a(b11)) {
                    C3222a c3222a4 = (C3222a) I1.m.a(b11.q(), I1.k.y());
                    if (c3222a4 != null) {
                        z14.b(new q.a(2097152, c3222a4.b()));
                        Unit unit9 = Unit.f71690a;
                    }
                    C3222a c3222a5 = (C3222a) I1.m.a(b11.q(), I1.k.l());
                    if (c3222a5 != null) {
                        z14.b(new q.a(R.id.accessibilityActionImeEnter, c3222a5.b()));
                        Unit unit10 = Unit.f71690a;
                    }
                    C3222a c3222a6 = (C3222a) I1.m.a(b11.q(), I1.k.e());
                    if (c3222a6 != null) {
                        z14.b(new q.a(65536, c3222a6.b()));
                        Unit unit11 = Unit.f71690a;
                    }
                    C3222a c3222a7 = (C3222a) I1.m.a(b11.q(), I1.k.r());
                    if (c3222a7 != null) {
                        if (z14.v() && androidComposeView.getF40499B().b()) {
                            z14.b(new q.a(32768, c3222a7.b()));
                        }
                        Unit unit12 = Unit.f71690a;
                    }
                }
                String O11 = O(b11);
                if (!(O11 == null || O11.length() == 0)) {
                    z14.s0(c5299y.F(b11), c5299y.E(b11));
                    C3222a c3222a8 = (C3222a) I1.m.a(b11.q(), I1.k.x());
                    z14.b(new q.a(131072, c3222a8 != null ? c3222a8.b() : null));
                    z14.a(256);
                    z14.a(UserVerificationMethods.USER_VERIFY_NONE);
                    z14.d0(11);
                    List list2 = (List) I1.m.a(b11.q(), I1.u.c());
                    if ((list2 == null || list2.isEmpty()) && b11.q().e(I1.k.i())) {
                        if (!b11.q().e(I1.u.e()) || Intrinsics.d(I1.m.a(b11.q(), I1.u.g()), Boolean.TRUE)) {
                            D1.H g02 = b11.n().g0();
                            while (true) {
                                if (g02 == null) {
                                    g02 = null;
                                    break;
                                }
                                if (((Boolean) G.f40644b.invoke(g02)).booleanValue()) {
                                    break;
                                }
                                g02 = g02.g0();
                            }
                            if (g02 != null) {
                                I1.l B11 = g02.B();
                            }
                            z11 = false;
                            if (!z11) {
                                z14.d0(z14.p() | 20);
                            }
                        }
                        z11 = true;
                        if (!z11) {
                        }
                    }
                }
                int i17 = Build.VERSION.SDK_INT;
                ArrayList arrayList = new ArrayList();
                arrayList.add("androidx.compose.ui.semantics.id");
                CharSequence q14 = z14.q();
                if (!(q14 == null || q14.length() == 0) && b11.q().e(I1.k.i())) {
                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                }
                if (b11.q().e(I1.u.A())) {
                    arrayList.add("androidx.compose.ui.semantics.testTag");
                }
                z14.F(arrayList);
                I1.h hVar2 = (I1.h) I1.m.a(b11.q(), I1.u.v());
                if (hVar2 != null) {
                    if (b11.q().e(I1.k.w())) {
                        z14.K("android.widget.SeekBar");
                    } else {
                        z14.K("android.widget.ProgressBar");
                    }
                    hVar = I1.h.f11689c;
                    if (hVar2 != hVar) {
                        z14.j0(q.g.a(hVar2.c().getStart().floatValue(), hVar2.c().e().floatValue(), hVar2.b()));
                    }
                    if (b11.q().e(I1.k.w()) && H.a(b11)) {
                        float b12 = hVar2.b();
                        float floatValue = hVar2.c().e().floatValue();
                        float floatValue2 = hVar2.c().getStart().floatValue();
                        if (floatValue < floatValue2) {
                            floatValue = floatValue2;
                        }
                        if (b12 < floatValue) {
                            z14.b(q.a.f105945h);
                        }
                        float b13 = hVar2.b();
                        float floatValue3 = hVar2.c().getStart().floatValue();
                        float floatValue4 = hVar2.c().e().floatValue();
                        if (floatValue3 > floatValue4) {
                            floatValue3 = floatValue4;
                        }
                        if (b13 > floatValue3) {
                            z14.b(q.a.f105946i);
                        }
                    }
                }
                b.a(z14, b11);
                E1.a.b(z14, b11);
                E1.a.c(z14, b11);
                I1.j jVar = (I1.j) I1.m.a(b11.q(), I1.u.i());
                C3222a c3222a9 = (C3222a) I1.m.a(b11.q(), I1.k.t());
                if (jVar != null && c3222a9 != null) {
                    if (!((I1.m.a(b11.k(), I1.u.a()) == null && I1.m.a(b11.k(), I1.u.x()) == null) ? false : true)) {
                        z14.K("android.widget.HorizontalScrollView");
                    }
                    if (jVar.a().invoke().floatValue() > 0.0f) {
                        z14.m0(true);
                    }
                    if (H.a(b11)) {
                        if (Y(jVar)) {
                            z14.b(q.a.f105945h);
                            z14.b(!H.c(b11) ? q.a.f105953p : q.a.f105951n);
                        }
                        if (X(jVar)) {
                            z14.b(q.a.f105946i);
                            z14.b(!H.c(b11) ? q.a.f105951n : q.a.f105953p);
                        }
                    }
                }
                I1.j jVar2 = (I1.j) I1.m.a(b11.q(), I1.u.G());
                if (jVar2 != null && c3222a9 != null) {
                    if (!((I1.m.a(b11.k(), I1.u.a()) == null && I1.m.a(b11.k(), I1.u.x()) == null) ? false : true)) {
                        z14.K("android.widget.ScrollView");
                    }
                    if (jVar2.a().invoke().floatValue() > 0.0f) {
                        z14.m0(true);
                    }
                    if (H.a(b11)) {
                        if (Y(jVar2)) {
                            z14.b(q.a.f105945h);
                            z14.b(q.a.f105952o);
                        }
                        if (X(jVar2)) {
                            z14.b(q.a.f105946i);
                            z14.b(q.a.f105950m);
                        }
                    }
                }
                if (i17 >= 29) {
                    c.a(z14, b11);
                }
                z14.f0((CharSequence) I1.m.a(b11.q(), I1.u.t()));
                if (H.a(b11)) {
                    C3222a c3222a10 = (C3222a) I1.m.a(b11.q(), I1.k.g());
                    if (c3222a10 != null) {
                        z14.b(new q.a(262144, c3222a10.b()));
                        Unit unit13 = Unit.f71690a;
                    }
                    C3222a c3222a11 = (C3222a) I1.m.a(b11.q(), I1.k.b());
                    if (c3222a11 != null) {
                        z14.b(new q.a(524288, c3222a11.b()));
                        Unit unit14 = Unit.f71690a;
                    }
                    C3222a c3222a12 = (C3222a) I1.m.a(b11.q(), I1.k.f());
                    if (c3222a12 != null) {
                        z14.b(new q.a(1048576, c3222a12.b()));
                        Unit unit15 = Unit.f71690a;
                    }
                    if (b11.q().e(I1.k.d())) {
                        List list3 = (List) b11.q().k(I1.k.d());
                        int size2 = list3.size();
                        androidx.collection.B b14 = f41051K;
                        if (size2 >= b14.f38715b) {
                            throw new IllegalStateException(K00.b.e(b14.f38715b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                        }
                        androidx.collection.a0<CharSequence> a0Var = new androidx.collection.a0<>(0);
                        int i18 = androidx.collection.P.f38645b;
                        androidx.collection.I<CharSequence> i19 = new androidx.collection.I<>((Object) null);
                        androidx.collection.a0<androidx.collection.I<CharSequence>> a0Var2 = c5299y.f41078q;
                        if (a0Var2.f38684a) {
                            androidx.collection.b0.a(a0Var2);
                        }
                        if (C7445a.a(a0Var2.f38687d, i11, a0Var2.f38685b) >= 0) {
                            androidx.collection.I i21 = (androidx.collection.I) androidx.collection.b0.c(a0Var2, i11);
                            androidx.collection.B b15 = new androidx.collection.B();
                            int[] iArr = b14.f38714a;
                            int i22 = b14.f38715b;
                            for (int i23 = 0; i23 < i22; i23++) {
                                b15.b(iArr[i23]);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size3 = list3.size();
                            int i24 = 0;
                            while (i24 < size3) {
                                I1.e eVar = (I1.e) list3.get(i24);
                                Intrinsics.f(i21);
                                eVar.getClass();
                                if (i21.a(null) >= 0) {
                                    int b16 = i21.b(null);
                                    a0Var.d(b16, null);
                                    i19.h(b16, null);
                                    int[] iArr2 = b15.f38714a;
                                    int i25 = b15.f38715b;
                                    i12 = size3;
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 >= i25) {
                                            i26 = -1;
                                            break;
                                        }
                                        int i27 = i25;
                                        if (b16 == iArr2[i26]) {
                                            break;
                                        }
                                        i26++;
                                        i25 = i27;
                                    }
                                    if (i26 >= 0) {
                                        b15.d(i26);
                                    }
                                    z14.b(new q.a(b16, (String) null));
                                } else {
                                    i12 = size3;
                                    arrayList2.add(eVar);
                                }
                                i24++;
                                size3 = i12;
                            }
                            int size4 = arrayList2.size();
                            for (int i28 = 0; i28 < size4; i28++) {
                                I1.e eVar2 = (I1.e) arrayList2.get(i28);
                                int a12 = b15.a(i28);
                                eVar2.getClass();
                                a0Var.d(a12, null);
                                i19.h(a12, null);
                                z14.b(new q.a(a12, (String) null));
                            }
                        } else {
                            int size5 = list3.size();
                            for (int i29 = 0; i29 < size5; i29++) {
                                I1.e eVar3 = (I1.e) list3.get(i29);
                                int a13 = b14.a(i29);
                                eVar3.getClass();
                                a0Var.d(a13, null);
                                i19.h(a13, null);
                                z14.b(new q.a(a13, (String) null));
                            }
                        }
                        c5299y.f41077p.d(i11, a0Var);
                        a0Var2.d(i11, i19);
                    }
                }
                z14.l0(c5299y.S(b11));
                int c12 = c5299y.f41087z.c(i11);
                if (c12 != -1) {
                    C5728b g11 = N1.g(androidComposeView.d0(), c12);
                    if (g11 != null) {
                        z14.w0(g11);
                    } else {
                        z14.v0(c12, androidComposeView);
                    }
                    bundle = null;
                    c5299y.w(i11, z14, c5299y.f41053B, null);
                } else {
                    bundle = null;
                }
                int c13 = c5299y.f41052A.c(i11);
                if (c13 != -1 && (g10 = N1.g(androidComposeView.d0(), c13)) != null) {
                    z14.u0(g10);
                    c5299y.w(i11, z14, c5299y.f41054C, bundle);
                }
                return z14;
            }
        }
        return null;
    }

    private final void f0(int i11) {
        f fVar = this.f41084w;
        if (fVar != null) {
            if (i11 != fVar.d().l()) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.f() <= 1000) {
                AccessibilityEvent A11 = A(Z(fVar.d().l()), 131072);
                A11.setFromIndex(fVar.b());
                A11.setToIndex(fVar.e());
                A11.setAction(fVar.a());
                A11.setMovementGranularity(fVar.c());
                A11.getText().add(O(fVar.d()));
                b0(A11);
            }
        }
        this.f41084w = null;
    }

    private final void g0(D1.H h11, androidx.collection.D d11) {
        I1.l B11;
        D1.H b11;
        if (h11.z0() && !this.f41062a.d0().b().containsKey(h11)) {
            if (!h11.c0().o(8)) {
                h11 = H.b(h11, n.f41104b);
            }
            if (h11 == null || (B11 = h11.B()) == null) {
                return;
            }
            if (!B11.o() && (b11 = H.b(h11, m.f41103b)) != null) {
                h11 = b11;
            }
            int i02 = h11.i0();
            if (d11.b(i02)) {
                d0(this, Z(i02), 2048, 1, 8);
            }
        }
    }

    private final void h0(D1.H h11) {
        if (h11.z0() && !this.f41062a.d0().b().containsKey(h11)) {
            int i02 = h11.i0();
            I1.j c11 = this.f41075n.c(i02);
            I1.j c12 = this.f41076o.c(i02);
            if (c11 == null && c12 == null) {
                return;
            }
            AccessibilityEvent A11 = A(i02, 4096);
            if (c11 != null) {
                A11.setScrollX((int) c11.c().invoke().floatValue());
                A11.setMaxScrollX((int) c11.a().invoke().floatValue());
            }
            if (c12 != null) {
                A11.setScrollY((int) c12.c().invoke().floatValue());
                A11.setMaxScrollY((int) c12.a().invoke().floatValue());
            }
            b0(A11);
        }
    }

    private final boolean i0(I1.r rVar, int i11, int i12, boolean z11) {
        String O11;
        if (rVar.q().e(I1.k.x()) && H.a(rVar)) {
            InterfaceC6511n interfaceC6511n = (InterfaceC6511n) ((C3222a) rVar.q().k(I1.k.x())).a();
            if (interfaceC6511n != null) {
                return ((Boolean) interfaceC6511n.invoke(Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11))).booleanValue();
            }
        } else if ((i11 != i12 || i12 != this.f41079r) && (O11 = O(rVar)) != null) {
            if (i11 < 0 || i11 != i12 || i12 > O11.length()) {
                i11 = -1;
            }
            this.f41079r = i11;
            boolean z12 = O11.length() > 0;
            b0(B(Z(rVar.l()), z12 ? Integer.valueOf(this.f41079r) : null, z12 ? Integer.valueOf(this.f41079r) : null, z12 ? Integer.valueOf(O11.length()) : null, O11));
            f0(rVar.l());
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2 A[LOOP:1: B:8:0x0030->B:28:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da A[EDGE_INSN: B:29:0x00da->B:30:0x00da BREAK  A[LOOP:1: B:8:0x0030->B:28:0x00d2], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ArrayList j0(ArrayList arrayList, boolean z11) {
        D1.G g10;
        boolean z12;
        boolean z13 = true;
        int i11 = C5145n.f38723b;
        androidx.collection.C<List<I1.r>> c11 = new androidx.collection.C<>();
        ArrayList<I1.r> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            D((I1.r) arrayList.get(i13), arrayList2, c11);
        }
        ArrayList arrayList3 = new ArrayList();
        int P11 = C7714v.P(arrayList2);
        if (P11 >= 0) {
            int i14 = 0;
            while (true) {
                I1.r rVar = arrayList2.get(i14);
                if (i14 != 0) {
                    float q11 = rVar.h().q();
                    float h11 = rVar.h().h();
                    boolean z14 = q11 >= h11 ? z13 : false;
                    int P12 = C7714v.P(arrayList3);
                    if (P12 >= 0) {
                        int i15 = 0;
                        while (true) {
                            C7460f c7460f = (C7460f) ((Pair) arrayList3.get(i15)).e();
                            boolean z15 = c7460f.q() >= c7460f.h() ? z13 : false;
                            if (!z14 && !z15) {
                                z12 = z13;
                                if (Math.max(q11, c7460f.q()) < Math.min(h11, c7460f.h())) {
                                    arrayList3.set(i15, new Pair(c7460f.v(q11, h11), ((Pair) arrayList3.get(i15)).f()));
                                    ((List) ((Pair) arrayList3.get(i15)).f()).add(rVar);
                                    break;
                                }
                            } else {
                                z12 = z13;
                            }
                            if (i15 == P12) {
                                break;
                            }
                            i15++;
                            z13 = z12;
                        }
                        if (i14 != P11) {
                            break;
                        }
                        i14++;
                        z13 = z12;
                    }
                }
                z12 = z13;
                arrayList3.add(new Pair(rVar.h(), C7714v.m0(rVar)));
                if (i14 != P11) {
                }
            }
        }
        C7714v.G0(h.f41098a, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i16 = 0; i16 < size2; i16++) {
            Pair pair = (Pair) arrayList3.get(i16);
            List list = (List) pair.f();
            Comparator comparator = z11 ? g.f41097a : e.f41090a;
            g10 = D1.H.f5236M;
            C7714v.G0(new C(new B(comparator, g10)), list);
            arrayList4.addAll((Collection) pair.f());
        }
        final F f7 = F.f40642b;
        C7714v.G0(new Comparator() { // from class: androidx.compose.ui.platform.u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) Function2.this.invoke(obj, obj2)).intValue();
            }
        }, arrayList4);
        while (i12 <= C7714v.P(arrayList4)) {
            List<I1.r> c12 = c11.c(((I1.r) arrayList4.get(i12)).l());
            if (c12 != null) {
                if (S((I1.r) arrayList4.get(i12))) {
                    i12++;
                } else {
                    arrayList4.remove(i12);
                }
                arrayList4.addAll(i12, c12);
                i12 += c12.size();
            } else {
                i12++;
            }
        }
        return arrayList4;
    }

    private static CharSequence k0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i11 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(DescriptorProtos$Edition.EDITION_99999_TEST_ONLY_VALUE)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i11 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i11);
                Intrinsics.g(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x072d, code lost:
    
        if (r1 != 16) goto L396;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0191 -> B:78:0x0192). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean s(C5299y c5299y, int i11, int i12, Bundle bundle) {
        I1.r b11;
        int i13;
        int i14;
        int i15;
        K1.K d11;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        Function1 function1;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function1 function12;
        C3222a c3222a;
        long j11;
        I1.j jVar;
        I1.j jVar2;
        float n11;
        float o11;
        float f7;
        Function2 function2;
        I1.l q11;
        I1.l q12;
        C3222a c3222a2;
        Function1 function13;
        Function0 function012;
        Function0 function013;
        Function0 function014;
        Function0 function015;
        Function0 function016;
        List list;
        boolean z11 = true;
        M1 c11 = c5299y.G().c(i11);
        if (c11 != null && (b11 = c11.b()) != null) {
            AbstractC5231b abstractC5231b = null;
            r9 = null;
            r9 = null;
            Float f11 = null;
            abstractC5231b = null;
            abstractC5231b = null;
            abstractC5231b = null;
            abstractC5231b = null;
            AndroidComposeView androidComposeView = c5299y.f41062a;
            if (i12 == 64) {
                AccessibilityManager accessibilityManager = c5299y.f41065d;
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i13 = c5299y.f41072k) == i11) {
                    return false;
                }
                if (i13 != Integer.MIN_VALUE) {
                    d0(c5299y, i13, 65536, null, 12);
                }
                c5299y.f41072k = i11;
                androidComposeView.invalidate();
                d0(c5299y, i11, 32768, null, 12);
                return true;
            }
            if (i12 == 128) {
                if (c5299y.f41072k != i11) {
                    return false;
                }
                c5299y.f41072k = LinearLayoutManager.INVALID_OFFSET;
                c5299y.f41073l = null;
                androidComposeView.invalidate();
                d0(c5299y, i11, 65536, null, 12);
                return true;
            }
            if (i12 == 256 || i12 == 512) {
                if (bundle != null) {
                    int i16 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z12 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z13 = i12 == 256;
                    int l11 = b11.l();
                    Integer num = c5299y.f41080s;
                    if (num == null || l11 != num.intValue()) {
                        c5299y.f41079r = -1;
                        c5299y.f41080s = Integer.valueOf(b11.l());
                    }
                    String O11 = O(b11);
                    if (O11 != null && O11.length() != 0) {
                        String O12 = O(b11);
                        if (O12 != null && O12.length() != 0) {
                            if (i16 == 1) {
                                C5234c a11 = C5234c.a.a(androidComposeView.getContext().getResources().getConfiguration().locale);
                                a11.d(O12);
                                abstractC5231b = a11;
                            } else if (i16 != 2) {
                                if (i16 != 4) {
                                    if (i16 == 8) {
                                        C5243f a12 = C5243f.a.a();
                                        a12.d(O12);
                                        abstractC5231b = a12;
                                    }
                                }
                                if (b11.q().e(I1.k.i()) && (d11 = N1.d(b11.q())) != null) {
                                    if (i16 == 4) {
                                        int i17 = C5237d.f40834g;
                                        C5237d a13 = C5237d.a.a();
                                        a13.i(O12, d11);
                                        abstractC5231b = a13;
                                    } else {
                                        int i18 = C5240e.f40865h;
                                        C5240e a14 = C5240e.a.a();
                                        a14.i(O12, d11, b11);
                                        abstractC5231b = a14;
                                    }
                                }
                            } else {
                                C5246g a15 = C5246g.a.a(androidComposeView.getContext().getResources().getConfiguration().locale);
                                a15.d(O12);
                                abstractC5231b = a15;
                            }
                        }
                        if (abstractC5231b != null) {
                            int E11 = c5299y.E(b11);
                            if (E11 == -1) {
                                E11 = z13 ? 0 : O11.length();
                            }
                            int[] a16 = z13 ? abstractC5231b.a(E11) : abstractC5231b.e(E11);
                            if (a16 != null) {
                                int i19 = a16[0];
                                int i21 = a16[1];
                                if (z12) {
                                    I1.l q13 = b11.q();
                                    int i22 = I1.u.f11751H;
                                    if (!q13.e(I1.u.c()) && b11.q().e(I1.u.e())) {
                                        i14 = c5299y.F(b11);
                                        if (i14 == -1) {
                                            i14 = z13 ? i19 : i21;
                                        }
                                        i15 = z13 ? i21 : i19;
                                        c5299y.f41084w = new f(b11, !z13 ? 256 : 512, i16, i19, i21, SystemClock.uptimeMillis());
                                        c5299y.i0(b11, i14, i15, true);
                                        return true;
                                    }
                                }
                                i14 = z13 ? i21 : i19;
                                i15 = i14;
                                c5299y.f41084w = new f(b11, !z13 ? 256 : 512, i16, i19, i21, SystemClock.uptimeMillis());
                                c5299y.i0(b11, i14, i15, true);
                                return true;
                            }
                        }
                    }
                }
            } else if (i12 == 16384) {
                C3222a c3222a3 = (C3222a) I1.m.a(b11.q(), I1.k.c());
                if (c3222a3 != null && (function0 = (Function0) c3222a3.a()) != null) {
                    return ((Boolean) function0.invoke()).booleanValue();
                }
            } else {
                if (i12 == 131072) {
                    boolean i02 = c5299y.i0(b11, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (i02) {
                        d0(c5299y, c5299y.Z(b11.l()), 0, null, 12);
                    }
                    return i02;
                }
                if (H.a(b11)) {
                    if (i12 == 1) {
                        C3222a c3222a4 = (C3222a) I1.m.a(b11.q(), I1.k.s());
                        if (c3222a4 != null && (function02 = (Function0) c3222a4.a()) != null) {
                            return ((Boolean) function02.invoke()).booleanValue();
                        }
                    } else if (i12 != 2) {
                        switch (i12) {
                            case 16:
                                C3222a c3222a5 = (C3222a) I1.m.a(b11.q(), I1.k.k());
                                Boolean bool = (c3222a5 == null || (function03 = (Function0) c3222a5.a()) == null) ? null : (Boolean) function03.invoke();
                                d0(c5299y, i11, 1, null, 12);
                                if (bool != null) {
                                    return bool.booleanValue();
                                }
                                break;
                            case 32:
                                C3222a c3222a6 = (C3222a) I1.m.a(b11.q(), I1.k.m());
                                if (c3222a6 != null && (function04 = (Function0) c3222a6.a()) != null) {
                                    return ((Boolean) function04.invoke()).booleanValue();
                                }
                                break;
                            case 4096:
                            case 8192:
                                boolean z14 = i12 == 4096;
                                boolean z15 = i12 == 8192;
                                boolean z16 = i12 == 16908345;
                                boolean z17 = i12 == 16908347;
                                boolean z18 = i12 == 16908344;
                                boolean z19 = i12 == 16908346;
                                boolean z21 = z16 || z17 || z14 || z15;
                                if (!z18 && !z19 && !z14 && !z15) {
                                    z11 = false;
                                }
                                if (z14 || z15) {
                                    I1.l q14 = b11.q();
                                    int i23 = I1.u.f11751H;
                                    I1.h hVar = (I1.h) I1.m.a(q14, I1.u.v());
                                    C3222a c3222a7 = (C3222a) I1.m.a(b11.q(), I1.k.w());
                                    if (hVar != null && c3222a7 != null) {
                                        float floatValue = hVar.c().e().floatValue();
                                        float floatValue2 = hVar.c().getStart().floatValue();
                                        if (floatValue < floatValue2) {
                                            floatValue = floatValue2;
                                        }
                                        float floatValue3 = hVar.c().getStart().floatValue();
                                        float floatValue4 = hVar.c().e().floatValue();
                                        if (floatValue3 > floatValue4) {
                                            floatValue3 = floatValue4;
                                        }
                                        float f12 = (floatValue - floatValue3) / 20;
                                        if (z15) {
                                            f12 = -f12;
                                        }
                                        Function1 function14 = (Function1) c3222a7.a();
                                        if (function14 != null) {
                                            return ((Boolean) function14.invoke(Float.valueOf(hVar.b() + f12))).booleanValue();
                                        }
                                    }
                                }
                                long p11 = B1.C.a(b11.m().D()).p();
                                I1.l q15 = b11.q();
                                ArrayList arrayList = new ArrayList();
                                C3222a c3222a8 = (C3222a) I1.m.a(q15, I1.k.h());
                                if (c3222a8 != null && (function1 = (Function1) c3222a8.a()) != null && ((Boolean) function1.invoke(arrayList)).booleanValue()) {
                                    f11 = (Float) arrayList.get(0);
                                }
                                C3222a c3222a9 = (C3222a) I1.m.a(b11.q(), I1.k.t());
                                if (c3222a9 != null) {
                                    I1.l q16 = b11.q();
                                    int i24 = I1.u.f11751H;
                                    I1.j jVar3 = (I1.j) I1.m.a(q16, I1.u.i());
                                    if (jVar3 != null && z21) {
                                        float floatValue5 = f11 != null ? f11.floatValue() : C7464j.f(p11);
                                        if (z16 || z15) {
                                            floatValue5 = -floatValue5;
                                        }
                                        if (jVar3.b()) {
                                            floatValue5 = -floatValue5;
                                        }
                                        if (H.c(b11) && (z16 || z17)) {
                                            floatValue5 = -floatValue5;
                                        }
                                        if (W(jVar3, floatValue5)) {
                                            if (b11.q().e(I1.k.o()) || b11.q().e(I1.k.p())) {
                                                C3222a c3222a10 = floatValue5 > 0.0f ? (C3222a) I1.m.a(b11.q(), I1.k.p()) : (C3222a) I1.m.a(b11.q(), I1.k.o());
                                                if (c3222a10 != null && (function06 = (Function0) c3222a10.a()) != null) {
                                                    return ((Boolean) function06.invoke()).booleanValue();
                                                }
                                            } else {
                                                Function2 function22 = (Function2) c3222a9.a();
                                                if (function22 != null) {
                                                    return ((Boolean) function22.invoke(Float.valueOf(floatValue5), Float.valueOf(0.0f))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    I1.j jVar4 = (I1.j) I1.m.a(b11.q(), I1.u.G());
                                    if (jVar4 != null && z11) {
                                        float floatValue6 = f11 != null ? f11.floatValue() : C7464j.d(p11);
                                        if (z18 || z15) {
                                            floatValue6 = -floatValue6;
                                        }
                                        if (jVar4.b()) {
                                            floatValue6 = -floatValue6;
                                        }
                                        if (W(jVar4, floatValue6)) {
                                            if (b11.q().e(I1.k.q()) || b11.q().e(I1.k.n())) {
                                                C3222a c3222a11 = floatValue6 > 0.0f ? (C3222a) I1.m.a(b11.q(), I1.k.n()) : (C3222a) I1.m.a(b11.q(), I1.k.q());
                                                if (c3222a11 != null && (function05 = (Function0) c3222a11.a()) != null) {
                                                    return ((Boolean) function05.invoke()).booleanValue();
                                                }
                                            } else {
                                                Function2 function23 = (Function2) c3222a9.a();
                                                if (function23 != null) {
                                                    return ((Boolean) function23.invoke(Float.valueOf(0.0f), Float.valueOf(floatValue6))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 32768:
                                C3222a c3222a12 = (C3222a) I1.m.a(b11.q(), I1.k.r());
                                if (c3222a12 != null && (function07 = (Function0) c3222a12.a()) != null) {
                                    return ((Boolean) function07.invoke()).booleanValue();
                                }
                                break;
                            case 65536:
                                C3222a c3222a13 = (C3222a) I1.m.a(b11.q(), I1.k.e());
                                if (c3222a13 != null && (function08 = (Function0) c3222a13.a()) != null) {
                                    return ((Boolean) function08.invoke()).booleanValue();
                                }
                                break;
                            case 262144:
                                C3222a c3222a14 = (C3222a) I1.m.a(b11.q(), I1.k.g());
                                if (c3222a14 != null && (function09 = (Function0) c3222a14.a()) != null) {
                                    return ((Boolean) function09.invoke()).booleanValue();
                                }
                                break;
                            case 524288:
                                C3222a c3222a15 = (C3222a) I1.m.a(b11.q(), I1.k.b());
                                if (c3222a15 != null && (function010 = (Function0) c3222a15.a()) != null) {
                                    return ((Boolean) function010.invoke()).booleanValue();
                                }
                                break;
                            case 1048576:
                                C3222a c3222a16 = (C3222a) I1.m.a(b11.q(), I1.k.f());
                                if (c3222a16 != null && (function011 = (Function0) c3222a16.a()) != null) {
                                    return ((Boolean) function011.invoke()).booleanValue();
                                }
                                break;
                            case 2097152:
                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                C3222a c3222a17 = (C3222a) I1.m.a(b11.q(), I1.k.y());
                                if (c3222a17 != null && (function12 = (Function1) c3222a17.a()) != null) {
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) function12.invoke(new C3422b(6, string, null))).booleanValue();
                                }
                                break;
                            case R.id.accessibilityActionShowOnScreen:
                                I1.r o12 = b11.o();
                                if (o12 != null && (q12 = o12.q()) != null) {
                                    c3222a = (C3222a) I1.m.a(q12, I1.k.t());
                                    while (o12 != null && c3222a == null) {
                                        o12 = o12.o();
                                        if (o12 != null && (q11 = o12.q()) != null) {
                                            c3222a = (C3222a) I1.m.a(q11, I1.k.t());
                                        }
                                    }
                                    if (o12 != null) {
                                        C7460f a17 = B1.C.a(o12.m().D());
                                        B1.B w11 = ((AbstractC2810k0) o12.m().D()).w();
                                        C7460f A11 = a17.A(w11 != null ? ((AbstractC2810k0) w11).y(0L) : 0L);
                                        AbstractC2810k0 d12 = b11.d();
                                        if (d12 != null) {
                                            AbstractC2810k0 abstractC2810k0 = d12.I() ? d12 : null;
                                            if (abstractC2810k0 != null) {
                                                j11 = abstractC2810k0.y(0L);
                                                AbstractC2810k0 d13 = b11.d();
                                                C7460f a18 = C7461g.a(j11, Z1.r.b(d13 != null ? d13.a() : 0L));
                                                I1.l q17 = o12.q();
                                                int i25 = I1.u.f11751H;
                                                jVar = (I1.j) I1.m.a(q17, I1.u.i());
                                                jVar2 = (I1.j) I1.m.a(o12.q(), I1.u.G());
                                                n11 = a18.n() - A11.n();
                                                o11 = a18.o() - A11.o();
                                                if (Math.signum(n11) == Math.signum(o11)) {
                                                    n11 = 0.0f;
                                                } else if (Math.abs(n11) >= Math.abs(o11)) {
                                                    n11 = o11;
                                                }
                                                if (jVar != null && jVar.b()) {
                                                    n11 = -n11;
                                                }
                                                if (H.c(b11)) {
                                                    n11 = -n11;
                                                }
                                                float q18 = a18.q() - A11.q();
                                                float h11 = a18.h() - A11.h();
                                                f7 = Math.signum(q18) == Math.signum(h11) ? Math.abs(q18) < Math.abs(h11) ? q18 : h11 : 0.0f;
                                                if (jVar2 != null && jVar2.b()) {
                                                    f7 = -f7;
                                                }
                                                if (c3222a != null && (function2 = (Function2) c3222a.a()) != null) {
                                                    return ((Boolean) function2.invoke(Float.valueOf(n11), Float.valueOf(f7))).booleanValue();
                                                }
                                            }
                                        }
                                        j11 = 0;
                                        AbstractC2810k0 d132 = b11.d();
                                        C7460f a182 = C7461g.a(j11, Z1.r.b(d132 != null ? d132.a() : 0L));
                                        I1.l q172 = o12.q();
                                        int i252 = I1.u.f11751H;
                                        jVar = (I1.j) I1.m.a(q172, I1.u.i());
                                        jVar2 = (I1.j) I1.m.a(o12.q(), I1.u.G());
                                        n11 = a182.n() - A11.n();
                                        o11 = a182.o() - A11.o();
                                        if (Math.signum(n11) == Math.signum(o11)) {
                                        }
                                        if (jVar != null) {
                                            n11 = -n11;
                                        }
                                        if (H.c(b11)) {
                                        }
                                        float q182 = a182.q() - A11.q();
                                        float h112 = a182.h() - A11.h();
                                        if (Math.signum(q182) == Math.signum(h112)) {
                                        }
                                        if (jVar2 != null) {
                                            f7 = -f7;
                                        }
                                        if (c3222a != null) {
                                            return ((Boolean) function2.invoke(Float.valueOf(n11), Float.valueOf(f7))).booleanValue();
                                        }
                                    }
                                }
                                c3222a = null;
                                while (o12 != null) {
                                    o12 = o12.o();
                                    if (o12 != null) {
                                        c3222a = (C3222a) I1.m.a(q11, I1.k.t());
                                    }
                                    c3222a = null;
                                    while (o12 != null) {
                                    }
                                }
                                if (o12 != null) {
                                }
                                break;
                            case R.id.accessibilityActionSetProgress:
                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && (c3222a2 = (C3222a) I1.m.a(b11.q(), I1.k.w())) != null && (function13 = (Function1) c3222a2.a()) != null) {
                                    return ((Boolean) function13.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                }
                                break;
                            case R.id.accessibilityActionImeEnter:
                                C3222a c3222a18 = (C3222a) I1.m.a(b11.q(), I1.k.l());
                                if (c3222a18 != null && (function012 = (Function0) c3222a18.a()) != null) {
                                    return ((Boolean) function012.invoke()).booleanValue();
                                }
                                break;
                            default:
                                switch (i12) {
                                    case R.id.accessibilityActionScrollUp:
                                    case R.id.accessibilityActionScrollLeft:
                                    case R.id.accessibilityActionScrollDown:
                                    case R.id.accessibilityActionScrollRight:
                                        break;
                                    default:
                                        switch (i12) {
                                            case R.id.accessibilityActionPageUp:
                                                C3222a c3222a19 = (C3222a) I1.m.a(b11.q(), I1.k.q());
                                                if (c3222a19 != null && (function013 = (Function0) c3222a19.a()) != null) {
                                                    return ((Boolean) function013.invoke()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageDown:
                                                C3222a c3222a20 = (C3222a) I1.m.a(b11.q(), I1.k.n());
                                                if (c3222a20 != null && (function014 = (Function0) c3222a20.a()) != null) {
                                                    return ((Boolean) function014.invoke()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageLeft:
                                                C3222a c3222a21 = (C3222a) I1.m.a(b11.q(), I1.k.o());
                                                if (c3222a21 != null && (function015 = (Function0) c3222a21.a()) != null) {
                                                    return ((Boolean) function015.invoke()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageRight:
                                                C3222a c3222a22 = (C3222a) I1.m.a(b11.q(), I1.k.p());
                                                if (c3222a22 != null && (function016 = (Function0) c3222a22.a()) != null) {
                                                    return ((Boolean) function016.invoke()).booleanValue();
                                                }
                                                break;
                                            default:
                                                androidx.collection.a0<androidx.collection.a0<CharSequence>> a0Var = c5299y.f41077p;
                                                a0Var.getClass();
                                                androidx.collection.a0 a0Var2 = (androidx.collection.a0) androidx.collection.b0.c(a0Var, i11);
                                                if (a0Var2 != null && ((CharSequence) androidx.collection.b0.c(a0Var2, i12)) != null && (list = (List) I1.m.a(b11.q(), I1.k.d())) != null) {
                                                    int size = list.size();
                                                    for (int i26 = 0; i26 < size; i26++) {
                                                        ((I1.e) list.get(i26)).getClass();
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                }
                        }
                    } else {
                        I1.l q19 = b11.q();
                        int i27 = I1.u.f11751H;
                        if (Intrinsics.d(I1.m.a(q19, I1.u.g()), Boolean.TRUE)) {
                            ((FocusOwnerImpl) androidComposeView.q()).e(8, false, true);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final void t(C5299y c5299y, K1 k12) {
        c5299y.getClass();
        if (k12.m0()) {
            c5299y.f41062a.getF40501C().f(k12, c5299y.f41061J, new A(c5299y, k12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int i11, y2.q qVar, String str, Bundle bundle) {
        I1.r b11;
        M1 c11 = G().c(i11);
        if (c11 == null || (b11 = c11.b()) == null) {
            return;
        }
        String O11 = O(b11);
        if (Intrinsics.d(str, this.f41053B)) {
            int c12 = this.f41087z.c(i11);
            if (c12 != -1) {
                qVar.o().putInt(str, c12);
                return;
            }
            return;
        }
        if (Intrinsics.d(str, this.f41054C)) {
            int c13 = this.f41052A.c(i11);
            if (c13 != -1) {
                qVar.o().putInt(str, c13);
                return;
            }
            return;
        }
        if (!b11.q().e(I1.k.i()) || bundle == null || !Intrinsics.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            I1.l q11 = b11.q();
            int i12 = I1.u.f11751H;
            if (!q11.e(I1.u.A()) || bundle == null || !Intrinsics.d(str, "androidx.compose.ui.semantics.testTag")) {
                if (Intrinsics.d(str, "androidx.compose.ui.semantics.id")) {
                    qVar.o().putInt(str, b11.l());
                    return;
                }
                return;
            } else {
                String str2 = (String) I1.m.a(b11.q(), I1.u.A());
                if (str2 != null) {
                    qVar.o().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i14 > 0 && i13 >= 0) {
            if (i13 < (O11 != null ? O11.length() : Integer.MAX_VALUE)) {
                K1.K d11 = N1.d(b11.q());
                if (d11 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = i13 + i15;
                    RectF rectF = null;
                    if (i16 >= d11.k().j().length()) {
                        arrayList.add(null);
                    } else {
                        C7460f d12 = d11.d(i16);
                        AbstractC2810k0 d13 = b11.d();
                        long j11 = 0;
                        if (d13 != null) {
                            if (!d13.I()) {
                                d13 = null;
                            }
                            if (d13 != null) {
                                j11 = d13.y(0L);
                            }
                        }
                        C7460f A11 = d12.A(j11);
                        C7460f g10 = b11.g();
                        C7460f w11 = A11.y(g10) ? A11.w(g10) : null;
                        if (w11 != null) {
                            long a11 = P9.a.a(w11.n(), w11.q());
                            AndroidComposeView androidComposeView = this.f41062a;
                            long w02 = androidComposeView.w0(a11);
                            long w03 = androidComposeView.w0(P9.a.a(w11.o(), w11.h()));
                            rectF = new RectF(C7459e.g(w02), C7459e.h(w02), C7459e.g(w03), C7459e.h(w03));
                        }
                        arrayList.add(rectF);
                    }
                }
                qVar.o().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect x(M1 m12) {
        Rect a11 = m12.a();
        long a12 = P9.a.a(a11.left, a11.top);
        AndroidComposeView androidComposeView = this.f41062a;
        long w02 = androidComposeView.w0(a12);
        long w03 = androidComposeView.w0(P9.a.a(a11.right, a11.bottom));
        return new Rect((int) Math.floor(C7459e.g(w02)), (int) Math.floor(C7459e.h(w02)), (int) Math.ceil(C7459e.g(w03)), (int) Math.ceil(C7459e.h(w03)));
    }

    public final void C(@NotNull MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.f41065d;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            AndroidComposeView androidComposeView = this.f41062a;
            int i11 = LinearLayoutManager.INVALID_OFFSET;
            if (action != 7 && action != 9) {
                if (action != 10) {
                    return;
                }
                int i12 = this.f41063b;
                if (i12 == Integer.MIN_VALUE) {
                    androidComposeView.d0().dispatchGenericMotionEvent(motionEvent);
                    return;
                } else {
                    if (i12 == Integer.MIN_VALUE) {
                        return;
                    }
                    this.f41063b = LinearLayoutManager.INVALID_OFFSET;
                    d0(this, LinearLayoutManager.INVALID_OFFSET, UserVerificationMethods.USER_VERIFY_PATTERN, null, 12);
                    d0(this, i12, 256, null, 12);
                    return;
                }
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            androidComposeView.x0(true);
            C2822w c2822w = new C2822w();
            D1.H f40548l = androidComposeView.getF40548l();
            long a11 = P9.a.a(x11, y11);
            int i13 = D1.H.f5237N;
            f40548l.q0(a11, c2822w, true);
            int P11 = C7714v.P(c2822w);
            while (true) {
                if (-1 >= P11) {
                    break;
                }
                D1.H f7 = C2809k.f(c2822w.get(P11));
                if (androidComposeView.d0().b().get(f7) != null) {
                    break;
                }
                if (f7.c0().o(8)) {
                    int Z11 = Z(f7.i0());
                    if (N1.e(I1.s.a(f7, false))) {
                        i11 = Z11;
                        break;
                    }
                }
                P11--;
            }
            androidComposeView.d0().dispatchGenericMotionEvent(motionEvent);
            int i14 = this.f41063b;
            if (i14 == i11) {
                return;
            }
            this.f41063b = i11;
            d0(this, i11, UserVerificationMethods.USER_VERIFY_PATTERN, null, 12);
            d0(this, i14, 256, null, 12);
        }
    }

    @NotNull
    public final String H() {
        return this.f41054C;
    }

    @NotNull
    public final String I() {
        return this.f41053B;
    }

    @NotNull
    public final androidx.collection.A J() {
        return this.f41052A;
    }

    @NotNull
    public final androidx.collection.A K() {
        return this.f41087z;
    }

    @NotNull
    public final AndroidComposeView Q() {
        return this.f41062a;
    }

    public final boolean R() {
        return this.f41065d.isEnabled() && !this.f41069h.isEmpty();
    }

    public final void U(@NotNull D1.H h11) {
        this.f41083v = true;
        if (R()) {
            T(h11);
        }
    }

    public final void V() {
        this.f41083v = true;
        if (!R() || this.f41058G) {
            return;
        }
        this.f41058G = true;
        this.f41070i.post(this.f41059H);
    }

    @Override // androidx.core.view.C5305a
    @NotNull
    public final y2.r getAccessibilityNodeProvider(@NotNull View view) {
        return this.f41071j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (xe.Y.b(r7, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:14:0x0056, B:20:0x0068, B:22:0x0070, B:25:0x007b, B:27:0x0082, B:29:0x0091, B:31:0x0098, B:32:0x00a1, B:40:0x0042), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0079 -> B:13:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bc -> B:13:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5302z c5302z;
        int i11;
        C5299y c5299y;
        androidx.collection.D d11;
        ze.j it;
        androidx.collection.D d12;
        Object b11;
        try {
            if (cVar instanceof C5302z) {
                c5302z = (C5302z) cVar;
                int i12 = c5302z.f41111i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c5302z.f41111i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c5302z.f41109g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c5302z.f41111i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        try {
                            d11 = new androidx.collection.D((Object) null);
                            it = this.f41082u.iterator();
                            c5299y = this;
                            c5302z.f41106d = c5299y;
                            c5302z.f41107e = d11;
                            c5302z.f41108f = it;
                            c5302z.f41111i = 1;
                            b11 = it.b(c5302z);
                            if (b11 == aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c5299y = this;
                            c5299y.f41081t.clear();
                            throw th;
                        }
                    } else if (i11 == 1) {
                        it = c5302z.f41108f;
                        d12 = c5302z.f41107e;
                        c5299y = c5302z.f41106d;
                        Sc.s.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c5302z.f41108f;
                        d12 = c5302z.f41107e;
                        c5299y = c5302z.f41106d;
                        Sc.s.b(obj);
                        d11 = d12;
                        c5302z.f41106d = c5299y;
                        c5302z.f41107e = d11;
                        c5302z.f41108f = it;
                        c5302z.f41111i = 1;
                        b11 = it.b(c5302z);
                        if (b11 == aVar) {
                            return aVar;
                        }
                        d12 = d11;
                        obj = b11;
                        if (((Boolean) obj).booleanValue()) {
                            c5299y.f41081t.clear();
                            return Unit.f71690a;
                        }
                        it.next();
                        boolean R11 = c5299y.R();
                        C5133b<D1.H> c5133b = c5299y.f41081t;
                        if (R11) {
                            int size = c5133b.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                D1.H l11 = c5133b.l(i13);
                                c5299y.g0(l11, d12);
                                c5299y.h0(l11);
                            }
                            d12.c();
                            if (!c5299y.f41058G) {
                                c5299y.f41058G = true;
                                c5299y.f41070i.post(c5299y.f41059H);
                            }
                            c5133b.clear();
                            c5299y.f41075n.d();
                            c5299y.f41076o.d();
                            long j11 = c5299y.f41066e;
                            c5302z.f41106d = c5299y;
                            c5302z.f41107e = d12;
                            c5302z.f41108f = it;
                            c5302z.f41111i = 2;
                        }
                        d11 = d12;
                        c5302z.f41106d = c5299y;
                        c5302z.f41107e = d11;
                        c5302z.f41108f = it;
                        c5302z.f41111i = 1;
                        b11 = it.b(c5302z);
                        if (b11 == aVar) {
                        }
                    }
                }
            }
            if (i11 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c5302z = new C5302z(this, cVar);
        Object obj2 = c5302z.f41109g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5302z.f41111i;
    }

    public final boolean z(long j11, int i11, boolean z11) {
        I1.C i12;
        boolean z12;
        boolean z13;
        I1.j jVar;
        boolean z14 = true;
        if (!Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC5144m<M1> G11 = G();
        if (C7459e.d(j11, 9205357640488583168L) || !C7459e.i(j11)) {
            return false;
        }
        if (z11) {
            int i13 = I1.u.f11751H;
            i12 = I1.u.G();
        } else {
            if (z11) {
                throw new Sc.o();
            }
            int i14 = I1.u.f11751H;
            i12 = I1.u.i();
        }
        Object[] objArr = G11.f38719c;
        long[] jArr = G11.f38717a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i15 = 0;
        boolean z15 = false;
        while (true) {
            long j12 = jArr[i15];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j12 & 255) < 128) {
                        M1 m12 = (M1) objArr[(i15 << 3) + i17];
                        z13 = z14;
                        if (l1.x0.d(m12.a()).f(j11) && (jVar = (I1.j) I1.m.a(m12.b().q(), i12)) != null) {
                            int i18 = jVar.b() ? -i11 : i11;
                            if (i11 == 0 && jVar.b()) {
                                i18 = -1;
                            }
                            if (i18 < 0) {
                                if (jVar.c().invoke().floatValue() <= 0.0f) {
                                    j12 >>= 8;
                                    i17++;
                                    z14 = z13;
                                }
                                z15 = z13;
                                j12 >>= 8;
                                i17++;
                                z14 = z13;
                            } else {
                                if (jVar.c().invoke().floatValue() >= jVar.a().invoke().floatValue()) {
                                    j12 >>= 8;
                                    i17++;
                                    z14 = z13;
                                }
                                z15 = z13;
                                j12 >>= 8;
                                i17++;
                                z14 = z13;
                            }
                        }
                    } else {
                        z13 = z14;
                    }
                    j12 >>= 8;
                    i17++;
                    z14 = z13;
                }
                z12 = z14;
                if (i16 != 8) {
                    return z15;
                }
            } else {
                z12 = z14;
            }
            if (i15 == length) {
                return z15;
            }
            i15++;
            z14 = z12;
        }
    }
}
