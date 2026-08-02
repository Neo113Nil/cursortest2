package E0;

import E0.AbstractC2923g0;
import Q1.C3848q;
import Q1.InterfaceC3841j;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.InterfaceC5272o1;
import androidx.compose.ui.platform.c2;
import hd.C6915b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2935m0 implements InterfaceC5272o1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f7264a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2913b0 f7265b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f7266c = C2931k0.f7258b;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f7267d = C2933l0.f7260b;

    /* renamed from: e, reason: collision with root package name */
    private B0.O0 f7268e;

    /* renamed from: f, reason: collision with root package name */
    private I0.W0 f7269f;

    /* renamed from: g, reason: collision with root package name */
    private c2 f7270g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private Q1.K f7271h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private Q1.r f7272i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private ArrayList f7273j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f7274k;

    /* renamed from: l, reason: collision with root package name */
    private Rect f7275l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C2921f0 f7276m;

    public C2935m0(@NotNull View view, @NotNull Function1 function1, @NotNull C2913b0 c2913b0) {
        long j11;
        Q1.r rVar;
        this.f7264a = view;
        this.f7265b = c2913b0;
        j11 = K1.Q.f15009b;
        this.f7271h = new Q1.K(4, j11, "");
        rVar = Q1.r.f22908g;
        this.f7272i = rVar;
        this.f7273j = new ArrayList();
        this.f7274k = Sc.k.a(Sc.n.NONE, new C2927i0(this));
        this.f7276m = new C2921f0(function1, c2913b0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final BaseInputConnection b(C2935m0 c2935m0) {
        return (BaseInputConnection) c2935m0.f7274k.getValue();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5272o1
    public final InputConnection a(EditorInfo editorInfo) {
        L.a(editorInfo, this.f7271h.f(), this.f7271h.e(), this.f7272i, null);
        int i11 = C2925h0.f7249b;
        if (androidx.emoji2.text.j.j()) {
            androidx.emoji2.text.j.c().q(editorInfo);
        }
        InputConnectionC2944r0 inputConnectionC2944r0 = new InputConnectionC2944r0(this.f7271h, new C2929j0(this), this.f7272i.b(), this.f7268e, this.f7269f, this.f7270g);
        this.f7273j.add(new WeakReference(inputConnectionC2944r0));
        return inputConnectionC2944r0;
    }

    @NotNull
    public final View g() {
        return this.f7264a;
    }

    public final void h(@NotNull C7460f c7460f) {
        Rect rect;
        this.f7275l = new Rect(C6915b.c(c7460f.n()), C6915b.c(c7460f.q()), C6915b.c(c7460f.o()), C6915b.c(c7460f.h()));
        if (!this.f7273j.isEmpty() || (rect = this.f7275l) == null) {
            return;
        }
        this.f7264a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(@NotNull Q1.K k11, AbstractC2923g0.a aVar, @NotNull Q1.r rVar, @NotNull Function1<? super List<? extends InterfaceC3841j>, Unit> function1, @NotNull Function1<? super C3848q, Unit> function12) {
        this.f7271h = k11;
        this.f7272i = rVar;
        this.f7266c = (AbstractC7737t) function1;
        this.f7267d = (AbstractC7737t) function12;
        this.f7268e = aVar != null ? aVar.E0() : null;
        this.f7269f = aVar != null ? aVar.q0() : null;
        this.f7270g = aVar != null ? aVar.b() : null;
    }

    public final void j(Q1.K k11, @NotNull Q1.K k12) {
        boolean z11 = (K1.Q.d(this.f7271h.e(), k12.e()) && Intrinsics.d(this.f7271h.d(), k12.d())) ? false : true;
        this.f7271h = k12;
        ArrayList arrayList = this.f7273j;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            InputConnectionC2944r0 inputConnectionC2944r0 = (InputConnectionC2944r0) ((WeakReference) arrayList.get(i11)).get();
            if (inputConnectionC2944r0 != null) {
                inputConnectionC2944r0.f(k12);
            }
        }
        this.f7276m.a();
        boolean d11 = Intrinsics.d(k11, k12);
        C2913b0 c2913b0 = this.f7265b;
        if (d11) {
            if (z11) {
                int h11 = K1.Q.h(k12.e());
                int g10 = K1.Q.g(k12.e());
                K1.Q d12 = this.f7271h.d();
                int h12 = d12 != null ? K1.Q.h(d12.k()) : -1;
                K1.Q d13 = this.f7271h.d();
                c2913b0.h(h11, g10, h12, d13 != null ? K1.Q.g(d13.k()) : -1);
                return;
            }
            return;
        }
        if (k11 != null && (!Intrinsics.d(k11.f(), k12.f()) || (K1.Q.d(k11.e(), k12.e()) && !Intrinsics.d(k11.d(), k12.d())))) {
            c2913b0.d();
            return;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InputConnectionC2944r0 inputConnectionC2944r02 = (InputConnectionC2944r0) ((WeakReference) arrayList.get(i12)).get();
            if (inputConnectionC2944r02 != null) {
                inputConnectionC2944r02.g(this.f7271h, c2913b0);
            }
        }
    }

    public final void k(@NotNull Q1.K k11, @NotNull Q1.D d11, @NotNull K1.K k12, @NotNull C7460f c7460f, @NotNull C7460f c7460f2) {
        this.f7276m.d(k11, d11, k12, c7460f, c7460f2);
    }
}
