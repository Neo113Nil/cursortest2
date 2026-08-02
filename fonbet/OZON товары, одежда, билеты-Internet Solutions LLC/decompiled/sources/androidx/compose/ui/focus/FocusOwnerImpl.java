package androidx.compose.ui.focus;

import D1.AbstractC2794c0;
import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.H;
import J0.C3349u1;
import Z1.s;
import android.view.KeyEvent;
import androidx.collection.G;
import androidx.compose.ui.e;
import androidx.core.view.C5330m0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j1.o;
import j1.r;
import j1.w;
import j1.x;
import j1.y;
import java.util.ArrayList;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import v1.C10178c;
import v1.C10179d;
import v1.InterfaceC10180e;
import v1.InterfaceC10182g;
import z1.C10972b;
import z1.InterfaceC10971a;

/* loaded from: classes.dex */
public final class FocusOwnerImpl implements j1.l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<j1.c, C7460f, Boolean> f40364a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<j1.c, Boolean> f40365b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f40366c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<C7460f> f40367d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<s> f40368e;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.focus.d f40370g;

    /* renamed from: j, reason: collision with root package name */
    private G f40373j;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private FocusTargetNode f40369f = new FocusTargetNode();

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x f40371h = new x();

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f40372i = g.a(androidx.compose.ui.e.f40358c0, d.f40378b).l0(new AbstractC2794c0<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // D1.AbstractC2794c0
        /* renamed from: create */
        public final FocusTargetNode getF41119a() {
            return FocusOwnerImpl.this.n();
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return FocusOwnerImpl.this.n().hashCode();
        }

        @Override // D1.AbstractC2794c0
        public final /* bridge */ /* synthetic */ void update(FocusTargetNode focusTargetNode) {
        }
    });

    /* loaded from: classes8.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40374a;

        static {
            int[] iArr = new int[j1.b.values().length];
            try {
                iArr[j1.b.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.b.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.b.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j1.b.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40374a = iArr;
        }
    }

    /* synthetic */ class b extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FocusOwnerImpl.h((FocusOwnerImpl) this.receiver);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function1<FocusTargetNode, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f40375b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f40376c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f40377d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f40375b = focusTargetNode;
            this.f40376c = focusOwnerImpl;
            this.f40377d = (AbstractC7737t) function1;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean booleanValue;
            FocusTargetNode focusTargetNode2 = focusTargetNode;
            if (Intrinsics.d(focusTargetNode2, this.f40375b)) {
                booleanValue = false;
            } else {
                if (Intrinsics.d(focusTargetNode2, this.f40376c.n())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                booleanValue = ((Boolean) this.f40377d.invoke(focusTargetNode2)).booleanValue();
            }
            return Boolean.valueOf(booleanValue);
        }
    }

    static final class d extends AbstractC7737t implements Function1<j1.m, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f40378b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(j1.m mVar) {
            mVar.a(false);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class e extends AbstractC7737t implements Function1<FocusTargetNode, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M<Boolean> f40379b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40380c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, M m11) {
            super(1);
            this.f40379b = m11;
            this.f40380c = i11;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Boolean] */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            ?? i11 = y.i(focusTargetNode, this.f40380c);
            this.f40379b.f71787a = i11;
            return Boolean.valueOf(i11 != 0 ? i11.booleanValue() : false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(@NotNull Function1<? super Function0<Unit>, Unit> function1, @NotNull Function2<? super j1.c, ? super C7460f, Boolean> function2, @NotNull Function1<? super j1.c, Boolean> function12, @NotNull Function0<Unit> function0, @NotNull Function0<C7460f> function02, @NotNull Function0<? extends s> function03) {
        this.f40364a = function2;
        this.f40365b = function12;
        this.f40366c = function0;
        this.f40367d = function02;
        this.f40368e = function03;
        this.f40370g = new androidx.compose.ui.focus.d(function1, new b(0, this, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0));
    }

    public static final void h(FocusOwnerImpl focusOwnerImpl) {
        if (focusOwnerImpl.f40369f.O1() == w.Inactive) {
            focusOwnerImpl.f40366c.invoke();
        }
    }

    @Override // j1.l
    public final void a(@NotNull o oVar) {
        this.f40370g.f(oVar);
    }

    @Override // j1.l
    @NotNull
    public final x b() {
        return this.f40371h;
    }

    @Override // j1.l
    public final void c(@NotNull j1.e eVar) {
        this.f40370g.e(eVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    @Override // j1.i
    public final boolean d(int i11) {
        M m11 = new M();
        m11.f71787a = Boolean.FALSE;
        Boolean l11 = l(i11, this.f40367d.invoke(), new e(i11, m11));
        if (l11 != null && m11.f71787a != 0) {
            Boolean bool = Boolean.TRUE;
            if (l11.equals(bool) && Intrinsics.d(m11.f71787a, bool)) {
                return true;
            }
            if (!C5330m0.c(i11)) {
                return this.f40365b.invoke(j1.c.a(i11)).booleanValue();
            }
            if (e(i11, false, false)) {
                Boolean l12 = l(i11, null, new f(i11));
                if (l12 != null ? l12.booleanValue() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j1.l
    public final boolean e(int i11, boolean z11, boolean z12) {
        boolean z13;
        boolean b11;
        U0.b bVar;
        x xVar = this.f40371h;
        try {
            z13 = xVar.f68745c;
            if (z13) {
                x.b(xVar);
            }
            x.a(xVar);
            androidx.compose.ui.focus.e eVar = androidx.compose.ui.focus.e.f40399b;
            if (eVar != null) {
                bVar = xVar.f68744b;
                bVar.b(eVar);
            }
            FocusTargetNode focusTargetNode = this.f40369f;
            if (!z11) {
                int i12 = a.f40374a[y.e(focusTargetNode, i11).ordinal()];
                if (i12 == 1 || i12 == 2 || i12 == 3) {
                    b11 = false;
                    if (b11 && z12) {
                        this.f40366c.invoke();
                    }
                    return b11;
                }
            }
            b11 = y.b(focusTargetNode, z11);
            if (b11) {
                this.f40366c.invoke();
            }
            return b11;
        } finally {
            x.c(xVar);
        }
    }

    @Override // j1.i
    public final void g(boolean z11) {
        e(8, z11, true);
    }

    @Override // j1.l
    public final C7460f getFocusRect() {
        FocusTargetNode b11 = k.b(this.f40369f);
        if (b11 != null) {
            return k.c(b11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v13, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v14, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    public final boolean i(@NotNull KeyEvent keyEvent) {
        InterfaceC10182g interfaceC10182g;
        int size;
        C2804h0 c02;
        AbstractC2813m abstractC2813m;
        C2804h0 c03;
        if (this.f40370g.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode b11 = k.b(this.f40369f);
        if (b11 == null) {
            interfaceC10182g = null;
        } else {
            if (!b11.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            e.c node = b11.getNode();
            H f7 = C2809k.f(b11);
            loop0: while (true) {
                if (f7 == null) {
                    abstractC2813m = 0;
                    break;
                }
                if ((C3349u1.c(f7) & 131072) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & 131072) != 0) {
                            ?? r82 = 0;
                            abstractC2813m = node;
                            while (abstractC2813m != 0) {
                                if (abstractC2813m instanceof InterfaceC10182g) {
                                    break loop0;
                                }
                                if ((abstractC2813m.getKindSet$ui_release() & 131072) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                    e.c J12 = abstractC2813m.J1();
                                    int i11 = 0;
                                    abstractC2813m = abstractC2813m;
                                    r82 = r82;
                                    while (J12 != null) {
                                        if ((J12.getKindSet$ui_release() & 131072) != 0) {
                                            i11++;
                                            r82 = r82;
                                            if (i11 == 1) {
                                                abstractC2813m = J12;
                                            } else {
                                                if (r82 == 0) {
                                                    r82 = new U0.b(new e.c[16]);
                                                }
                                                if (abstractC2813m != 0) {
                                                    r82.b(abstractC2813m);
                                                    abstractC2813m = 0;
                                                }
                                                r82.b(J12);
                                            }
                                        }
                                        J12 = J12.getChild$ui_release();
                                        abstractC2813m = abstractC2813m;
                                        r82 = r82;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC2813m = C2809k.b(r82);
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                f7 = f7.g0();
                node = (f7 == null || (c03 = f7.c0()) == null) ? null : c03.m();
            }
            interfaceC10182g = (InterfaceC10182g) abstractC2813m;
        }
        if (interfaceC10182g != null) {
            if (!interfaceC10182g.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            e.c parent$ui_release = interfaceC10182g.getNode().getParent$ui_release();
            H f11 = C2809k.f(interfaceC10182g);
            ArrayList arrayList = null;
            while (f11 != null) {
                if ((C3349u1.c(f11) & 131072) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & 131072) != 0) {
                            e.c cVar = parent$ui_release;
                            U0.b bVar = null;
                            while (cVar != null) {
                                if (cVar instanceof InterfaceC10182g) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVar);
                                } else if ((cVar.getKindSet$ui_release() & 131072) != 0 && (cVar instanceof AbstractC2813m)) {
                                    int i12 = 0;
                                    for (e.c J13 = ((AbstractC2813m) cVar).J1(); J13 != null; J13 = J13.getChild$ui_release()) {
                                        if ((J13.getKindSet$ui_release() & 131072) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                cVar = J13;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new U0.b(new e.c[16]);
                                                }
                                                if (cVar != null) {
                                                    bVar.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar.b(J13);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                cVar = C2809k.b(bVar);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                f11 = f11.g0();
                parent$ui_release = (f11 == null || (c02 = f11.c0()) == null) ? null : c02.m();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i13 = size - 1;
                    if (((InterfaceC10182g) arrayList.get(size)).P()) {
                        break;
                    }
                    if (i13 < 0) {
                        break;
                    }
                    size = i13;
                }
                return true;
            }
            AbstractC2813m node2 = interfaceC10182g.getNode();
            ?? r22 = 0;
            while (true) {
                if (node2 != 0) {
                    if (node2 instanceof InterfaceC10182g) {
                        if (((InterfaceC10182g) node2).P()) {
                            break;
                        }
                    } else if ((node2.getKindSet$ui_release() & 131072) != 0 && (node2 instanceof AbstractC2813m)) {
                        e.c J14 = node2.J1();
                        int i14 = 0;
                        r22 = r22;
                        node2 = node2;
                        while (J14 != null) {
                            if ((J14.getKindSet$ui_release() & 131072) != 0) {
                                i14++;
                                r22 = r22;
                                if (i14 == 1) {
                                    node2 = J14;
                                } else {
                                    if (r22 == 0) {
                                        r22 = new U0.b(new e.c[16]);
                                    }
                                    if (node2 != 0) {
                                        r22.b(node2);
                                        node2 = 0;
                                    }
                                    r22.b(J14);
                                }
                            }
                            J14 = J14.getChild$ui_release();
                            r22 = r22;
                            node2 = node2;
                        }
                        if (i14 == 1) {
                        }
                    }
                    node2 = C2809k.b(r22);
                } else {
                    AbstractC2813m node3 = interfaceC10182g.getNode();
                    ?? r23 = 0;
                    while (true) {
                        if (node3 != 0) {
                            if (node3 instanceof InterfaceC10182g) {
                                if (((InterfaceC10182g) node3).B1()) {
                                    break;
                                }
                            } else if ((node3.getKindSet$ui_release() & 131072) != 0 && (node3 instanceof AbstractC2813m)) {
                                e.c J15 = node3.J1();
                                int i15 = 0;
                                r23 = r23;
                                node3 = node3;
                                while (J15 != null) {
                                    if ((J15.getKindSet$ui_release() & 131072) != 0) {
                                        i15++;
                                        r23 = r23;
                                        if (i15 == 1) {
                                            node3 = J15;
                                        } else {
                                            if (r23 == 0) {
                                                r23 = new U0.b(new e.c[16]);
                                            }
                                            if (node3 != 0) {
                                                r23.b(node3);
                                                node3 = 0;
                                            }
                                            r23.b(J15);
                                        }
                                    }
                                    J15 = J15.getChild$ui_release();
                                    r23 = r23;
                                    node3 = node3;
                                }
                                if (i15 == 1) {
                                }
                            }
                            node3 = C2809k.b(r23);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                if (!((InterfaceC10182g) arrayList.get(i16)).B1()) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0138, code lost:
    
        if (r9 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x00be, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x00c0, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0418  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33, types: [int] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35, types: [int] */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v10, types: [int] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [int] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r3v24, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v25, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v29, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v30, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r9v10, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34, types: [int] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36, types: [int] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(@NotNull KeyEvent keyEvent, @NotNull Function0<Boolean> function0) {
        boolean z11;
        int i11;
        FocusTargetNode focusTargetNode;
        FocusTargetNode b11;
        AbstractC2813m abstractC2813m;
        e.c node;
        C2804h0 c02;
        AbstractC2813m abstractC2813m2;
        C2804h0 c03;
        C2804h0 c04;
        boolean z12 = false;
        if (this.f40370g.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
            return false;
        }
        long a11 = C10179d.a(keyEvent);
        int b12 = C10179d.b(keyEvent);
        if (C10178c.a(b12, 2)) {
            G g10 = this.f40373j;
            if (g10 == null) {
                g10 = new G(3);
                this.f40373j = g10;
            }
            g10.d(a11);
        } else if (C10178c.a(b12, 1)) {
            G g11 = this.f40373j;
            if (g11 == null || !g11.a(a11)) {
                return false;
            }
            G g12 = this.f40373j;
            if (g12 != null) {
                int hashCode = Long.hashCode(a11) * (-862048943);
                int i12 = hashCode ^ (hashCode << 16);
                int i13 = i12 & 127;
                int i14 = g12.f38745c;
                int i15 = (i12 >>> 7) & i14;
                int i16 = 0;
                loop19: while (true) {
                    long[] jArr = g12.f38743a;
                    int i17 = i15 >> 3;
                    int i18 = (i15 & 7) << 3;
                    z11 = z12;
                    long j11 = a11;
                    long j12 = (jArr[i17] >>> i18) | (((-i18) >> 63) & (jArr[i17 + 1] << (64 - i18)));
                    long j13 = (i13 * 72340172838076673L) ^ j12;
                    long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
                    while (true) {
                        if (j14 == 0) {
                            break;
                        }
                        i11 = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                        if (g12.f38744b[i11] == j11) {
                            break loop19;
                        }
                        j14 &= j14 - 1;
                    }
                    i16 += 8;
                    i15 = (i15 + i16) & i14;
                    z12 = z11;
                    a11 = j11;
                }
                if (i11 >= 0) {
                    g12.f38746d--;
                    long[] jArr2 = g12.f38743a;
                    int i19 = g12.f38745c;
                    int i21 = i11 >> 3;
                    int i22 = (i11 & 7) << 3;
                    long j15 = (jArr2[i21] & (~(255 << i22))) | (254 << i22);
                    jArr2[i21] = j15;
                    jArr2[(((i11 - 7) & i19) + (i19 & 7)) >> 3] = j15;
                }
                focusTargetNode = this.f40369f;
                b11 = k.b(focusTargetNode);
                if (b11 != null) {
                    if (!b11.getNode().isAttached()) {
                        A1.a.b("visitLocalDescendants called on an unattached node");
                        throw null;
                    }
                    e.c node2 = b11.getNode();
                    if ((node2.getAggregateChildKindSet$ui_release() & 9216) != 0) {
                        node = null;
                        for (e.c child$ui_release = node2.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                            if ((child$ui_release.getKindSet$ui_release() & 9216) != 0) {
                                if ((child$ui_release.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                    break;
                                }
                                node = child$ui_release;
                            }
                        }
                    } else {
                        node = null;
                    }
                }
                if (b11 != null) {
                    if (!b11.getNode().isAttached()) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    e.c node3 = b11.getNode();
                    H f7 = C2809k.f(b11);
                    loop11: while (true) {
                        if (f7 == null) {
                            abstractC2813m2 = 0;
                            break;
                        }
                        if ((C3349u1.c(f7) & 8192) != 0) {
                            while (node3 != null) {
                                if ((node3.getKindSet$ui_release() & 8192) != 0) {
                                    ?? r102 = 0;
                                    abstractC2813m2 = node3;
                                    while (abstractC2813m2 != 0) {
                                        if (abstractC2813m2 instanceof InterfaceC10180e) {
                                            break loop11;
                                        }
                                        if ((abstractC2813m2.getKindSet$ui_release() & 8192) != 0 && (abstractC2813m2 instanceof AbstractC2813m)) {
                                            e.c J12 = abstractC2813m2.J1();
                                            ?? r12 = z11;
                                            abstractC2813m2 = abstractC2813m2;
                                            r102 = r102;
                                            while (J12 != null) {
                                                if ((J12.getKindSet$ui_release() & 8192) != 0) {
                                                    r12++;
                                                    r102 = r102;
                                                    if (r12 == 1) {
                                                        abstractC2813m2 = J12;
                                                    } else {
                                                        if (r102 == 0) {
                                                            r102 = new U0.b(new e.c[16]);
                                                        }
                                                        if (abstractC2813m2 != 0) {
                                                            r102.b(abstractC2813m2);
                                                            abstractC2813m2 = 0;
                                                        }
                                                        r102.b(J12);
                                                    }
                                                }
                                                J12 = J12.getChild$ui_release();
                                                abstractC2813m2 = abstractC2813m2;
                                                r102 = r102;
                                                r12 = r12;
                                            }
                                            if (r12 == 1) {
                                            }
                                        }
                                        abstractC2813m2 = C2809k.b(r102);
                                    }
                                }
                                node3 = node3.getParent$ui_release();
                            }
                        }
                        f7 = f7.g0();
                        node3 = (f7 == null || (c03 = f7.c0()) == null) ? null : c03.m();
                    }
                    InterfaceC10180e interfaceC10180e = (InterfaceC10180e) abstractC2813m2;
                    if (interfaceC10180e != null) {
                        node = interfaceC10180e.getNode();
                        if (node != null) {
                            return z11;
                        }
                        if (!node.getNode().isAttached()) {
                            throw new IllegalStateException("visitAncestors called on an unattached node");
                        }
                        e.c parent$ui_release = node.getNode().getParent$ui_release();
                        H f11 = C2809k.f(node);
                        ?? r72 = 0;
                        while (f11 != null) {
                            r72 = r72;
                            if ((C3349u1.c(f11) & 8192) != 0) {
                                while (parent$ui_release != null) {
                                    if ((parent$ui_release.getKindSet$ui_release() & 8192) != 0) {
                                        e.c cVar = parent$ui_release;
                                        U0.b bVar = null;
                                        while (cVar != null) {
                                            if (cVar instanceof InterfaceC10180e) {
                                                if (r72 == 0) {
                                                    r72 = new ArrayList();
                                                }
                                                r72.add(cVar);
                                            } else if ((cVar.getKindSet$ui_release() & 8192) != 0 && (cVar instanceof AbstractC2813m)) {
                                                e.c J13 = ((AbstractC2813m) cVar).J1();
                                                ?? r122 = z11;
                                                while (J13 != null) {
                                                    if ((J13.getKindSet$ui_release() & 8192) != 0) {
                                                        r122++;
                                                        if (r122 == 1) {
                                                            cVar = J13;
                                                        } else {
                                                            if (bVar == null) {
                                                                bVar = new U0.b(new e.c[16]);
                                                            }
                                                            if (cVar != null) {
                                                                bVar.b(cVar);
                                                                cVar = null;
                                                            }
                                                            bVar.b(J13);
                                                        }
                                                    }
                                                    J13 = J13.getChild$ui_release();
                                                    r122 = r122;
                                                }
                                                if (r122 == 1) {
                                                }
                                            }
                                            cVar = C2809k.b(bVar);
                                        }
                                    }
                                    parent$ui_release = parent$ui_release.getParent$ui_release();
                                    r72 = r72;
                                }
                            }
                            f11 = f11.g0();
                            parent$ui_release = (f11 == null || (c04 = f11.c0()) == null) ? null : c04.m();
                        }
                        if (r72 != 0) {
                            int size = r72.size() - 1;
                            if (size >= 0) {
                                while (true) {
                                    int i23 = size - 1;
                                    if (((InterfaceC10180e) r72.get(size)).j0(keyEvent)) {
                                        break;
                                    }
                                    if (i23 < 0) {
                                        break;
                                    }
                                    size = i23;
                                }
                            }
                            Unit unit = Unit.f71690a;
                        }
                        AbstractC2813m node4 = node.getNode();
                        ?? r42 = 0;
                        while (true) {
                            if (node4 != 0) {
                                if (node4 instanceof InterfaceC10180e) {
                                    if (((InterfaceC10180e) node4).j0(keyEvent)) {
                                        break;
                                    }
                                } else if ((node4.getKindSet$ui_release() & 8192) != 0 && (node4 instanceof AbstractC2813m)) {
                                    e.c J14 = node4.J1();
                                    ?? r103 = z11;
                                    node4 = node4;
                                    r42 = r42;
                                    while (J14 != null) {
                                        if ((J14.getKindSet$ui_release() & 8192) != 0) {
                                            r103++;
                                            r42 = r42;
                                            if (r103 == 1) {
                                                node4 = J14;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new U0.b(new e.c[16]);
                                                }
                                                if (node4 != 0) {
                                                    r42.b(node4);
                                                    node4 = 0;
                                                }
                                                r42.b(J14);
                                            }
                                        }
                                        J14 = J14.getChild$ui_release();
                                        node4 = node4;
                                        r42 = r42;
                                        r103 = r103;
                                    }
                                    if (r103 == 1) {
                                    }
                                }
                                node4 = C2809k.b(r42);
                            } else if (!function0.invoke().booleanValue()) {
                                AbstractC2813m node5 = node.getNode();
                                ?? r43 = 0;
                                while (true) {
                                    if (node5 == 0) {
                                        if (r72 != 0) {
                                            int size2 = r72.size();
                                            for (?? r32 = z11; r32 < size2; r32++) {
                                                if (!((InterfaceC10180e) r72.get(r32)).g1(keyEvent)) {
                                                }
                                            }
                                            Unit unit2 = Unit.f71690a;
                                        }
                                        Unit unit3 = Unit.f71690a;
                                        return z11;
                                    }
                                    if (node5 instanceof InterfaceC10180e) {
                                        if (((InterfaceC10180e) node5).g1(keyEvent)) {
                                            break;
                                        }
                                    } else if ((node5.getKindSet$ui_release() & 8192) != 0 && (node5 instanceof AbstractC2813m)) {
                                        e.c J15 = node5.J1();
                                        ?? r92 = z11;
                                        node5 = node5;
                                        r43 = r43;
                                        while (J15 != null) {
                                            if ((J15.getKindSet$ui_release() & 8192) != 0) {
                                                r92++;
                                                r43 = r43;
                                                if (r92 == 1) {
                                                    node5 = J15;
                                                } else {
                                                    if (r43 == 0) {
                                                        r43 = new U0.b(new e.c[16]);
                                                    }
                                                    if (node5 != 0) {
                                                        r43.b(node5);
                                                        node5 = 0;
                                                    }
                                                    r43.b(J15);
                                                }
                                            }
                                            J15 = J15.getChild$ui_release();
                                            node5 = node5;
                                            r43 = r43;
                                            r92 = r92;
                                        }
                                        if (r92 == 1) {
                                        }
                                    }
                                    node5 = C2809k.b(r43);
                                }
                            }
                        }
                        return true;
                    }
                }
                if (focusTargetNode.getNode().isAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                e.c parent$ui_release2 = focusTargetNode.getNode().getParent$ui_release();
                H f12 = C2809k.f(focusTargetNode);
                loop15: while (true) {
                    if (f12 == null) {
                        abstractC2813m = 0;
                        break;
                    }
                    if ((C3349u1.c(f12) & 8192) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & 8192) != 0) {
                                abstractC2813m = parent$ui_release2;
                                ?? r93 = 0;
                                while (abstractC2813m != 0) {
                                    if (abstractC2813m instanceof InterfaceC10180e) {
                                        break loop15;
                                    }
                                    if ((abstractC2813m.getKindSet$ui_release() & 8192) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                        e.c J16 = abstractC2813m.J1();
                                        ?? r11 = z11;
                                        abstractC2813m = abstractC2813m;
                                        r93 = r93;
                                        while (J16 != null) {
                                            if ((J16.getKindSet$ui_release() & 8192) != 0) {
                                                r11++;
                                                r93 = r93;
                                                if (r11 == 1) {
                                                    abstractC2813m = J16;
                                                } else {
                                                    if (r93 == 0) {
                                                        r93 = new U0.b(new e.c[16]);
                                                    }
                                                    if (abstractC2813m != 0) {
                                                        r93.b(abstractC2813m);
                                                        abstractC2813m = 0;
                                                    }
                                                    r93.b(J16);
                                                }
                                            }
                                            J16 = J16.getChild$ui_release();
                                            abstractC2813m = abstractC2813m;
                                            r93 = r93;
                                            r11 = r11;
                                        }
                                        if (r11 == 1) {
                                        }
                                    }
                                    abstractC2813m = C2809k.b(r93);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    f12 = f12.g0();
                    parent$ui_release2 = (f12 == null || (c02 = f12.c0()) == null) ? null : c02.m();
                }
                InterfaceC10180e interfaceC10180e2 = (InterfaceC10180e) abstractC2813m;
                node = interfaceC10180e2 != null ? interfaceC10180e2.getNode() : null;
                if (node != null) {
                }
            }
        }
        z11 = false;
        focusTargetNode = this.f40369f;
        b11 = k.b(focusTargetNode);
        if (b11 != null) {
        }
        if (b11 != null) {
        }
        if (focusTargetNode.getNode().isAttached()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    public final boolean k(@NotNull C10972b c10972b) {
        InterfaceC10971a interfaceC10971a;
        int size;
        C2804h0 c02;
        AbstractC2813m abstractC2813m;
        C2804h0 c03;
        if (this.f40370g.b()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        FocusTargetNode b11 = k.b(this.f40369f);
        if (b11 == null) {
            interfaceC10971a = null;
        } else {
            if (!b11.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            e.c node = b11.getNode();
            H f7 = C2809k.f(b11);
            loop0: while (true) {
                if (f7 == null) {
                    abstractC2813m = 0;
                    break;
                }
                if ((C3349u1.c(f7) & 16384) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & 16384) != 0) {
                            ?? r82 = 0;
                            abstractC2813m = node;
                            while (abstractC2813m != 0) {
                                if (abstractC2813m instanceof InterfaceC10971a) {
                                    break loop0;
                                }
                                if ((abstractC2813m.getKindSet$ui_release() & 16384) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                    e.c J12 = abstractC2813m.J1();
                                    int i11 = 0;
                                    abstractC2813m = abstractC2813m;
                                    r82 = r82;
                                    while (J12 != null) {
                                        if ((J12.getKindSet$ui_release() & 16384) != 0) {
                                            i11++;
                                            r82 = r82;
                                            if (i11 == 1) {
                                                abstractC2813m = J12;
                                            } else {
                                                if (r82 == 0) {
                                                    r82 = new U0.b(new e.c[16]);
                                                }
                                                if (abstractC2813m != 0) {
                                                    r82.b(abstractC2813m);
                                                    abstractC2813m = 0;
                                                }
                                                r82.b(J12);
                                            }
                                        }
                                        J12 = J12.getChild$ui_release();
                                        abstractC2813m = abstractC2813m;
                                        r82 = r82;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC2813m = C2809k.b(r82);
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                f7 = f7.g0();
                node = (f7 == null || (c03 = f7.c0()) == null) ? null : c03.m();
            }
            interfaceC10971a = (InterfaceC10971a) abstractC2813m;
        }
        if (interfaceC10971a != null) {
            if (!interfaceC10971a.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            e.c parent$ui_release = interfaceC10971a.getNode().getParent$ui_release();
            H f11 = C2809k.f(interfaceC10971a);
            ArrayList arrayList = null;
            while (f11 != null) {
                if ((C3349u1.c(f11) & 16384) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & 16384) != 0) {
                            e.c cVar = parent$ui_release;
                            U0.b bVar = null;
                            while (cVar != null) {
                                if (cVar instanceof InterfaceC10971a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVar);
                                } else if ((cVar.getKindSet$ui_release() & 16384) != 0 && (cVar instanceof AbstractC2813m)) {
                                    int i12 = 0;
                                    for (e.c J13 = ((AbstractC2813m) cVar).J1(); J13 != null; J13 = J13.getChild$ui_release()) {
                                        if ((J13.getKindSet$ui_release() & 16384) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                cVar = J13;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new U0.b(new e.c[16]);
                                                }
                                                if (cVar != null) {
                                                    bVar.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar.b(J13);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                cVar = C2809k.b(bVar);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                f11 = f11.g0();
                parent$ui_release = (f11 == null || (c02 = f11.c0()) == null) ? null : c02.m();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i13 = size - 1;
                    if (((InterfaceC10971a) arrayList.get(size)).a0(c10972b)) {
                        break;
                    }
                    if (i13 < 0) {
                        break;
                    }
                    size = i13;
                }
                return true;
            }
            AbstractC2813m node2 = interfaceC10971a.getNode();
            ?? r22 = 0;
            while (true) {
                if (node2 != 0) {
                    if (node2 instanceof InterfaceC10971a) {
                        if (((InterfaceC10971a) node2).a0(c10972b)) {
                            break;
                        }
                    } else if ((node2.getKindSet$ui_release() & 16384) != 0 && (node2 instanceof AbstractC2813m)) {
                        e.c J14 = node2.J1();
                        int i14 = 0;
                        node2 = node2;
                        r22 = r22;
                        while (J14 != null) {
                            if ((J14.getKindSet$ui_release() & 16384) != 0) {
                                i14++;
                                r22 = r22;
                                if (i14 == 1) {
                                    node2 = J14;
                                } else {
                                    if (r22 == 0) {
                                        r22 = new U0.b(new e.c[16]);
                                    }
                                    if (node2 != 0) {
                                        r22.b(node2);
                                        node2 = 0;
                                    }
                                    r22.b(J14);
                                }
                            }
                            J14 = J14.getChild$ui_release();
                            node2 = node2;
                            r22 = r22;
                        }
                        if (i14 == 1) {
                        }
                    }
                    node2 = C2809k.b(r22);
                } else {
                    AbstractC2813m node3 = interfaceC10971a.getNode();
                    ?? r23 = 0;
                    while (true) {
                        if (node3 != 0) {
                            if (node3 instanceof InterfaceC10971a) {
                                if (((InterfaceC10971a) node3).X0(c10972b)) {
                                    break;
                                }
                            } else if ((node3.getKindSet$ui_release() & 16384) != 0 && (node3 instanceof AbstractC2813m)) {
                                e.c J15 = node3.J1();
                                int i15 = 0;
                                node3 = node3;
                                r23 = r23;
                                while (J15 != null) {
                                    if ((J15.getKindSet$ui_release() & 16384) != 0) {
                                        i15++;
                                        r23 = r23;
                                        if (i15 == 1) {
                                            node3 = J15;
                                        } else {
                                            if (r23 == 0) {
                                                r23 = new U0.b(new e.c[16]);
                                            }
                                            if (node3 != 0) {
                                                r23.b(node3);
                                                node3 = 0;
                                            }
                                            r23.b(J15);
                                        }
                                    }
                                    J15 = J15.getChild$ui_release();
                                    node3 = node3;
                                    r23 = r23;
                                }
                                if (i15 == 1) {
                                }
                            }
                            node3 = C2809k.b(r23);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                if (!((InterfaceC10971a) arrayList.get(i16)).X0(c10972b)) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final Boolean l(int i11, C7460f c7460f, @NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        r rVar;
        r rVar2;
        FocusTargetNode focusTargetNode = this.f40369f;
        FocusTargetNode b11 = k.b(focusTargetNode);
        Function0<s> function0 = this.f40368e;
        if (b11 != null) {
            r a11 = k.a(b11, i11, function0.invoke());
            rVar = r.f68739c;
            if (Intrinsics.d(a11, rVar)) {
                return null;
            }
            rVar2 = r.f68738b;
            if (!Intrinsics.d(a11, rVar2)) {
                return Boolean.valueOf(a11.c(function1));
            }
        } else {
            b11 = null;
        }
        return k.d(focusTargetNode, i11, function0.invoke(), c7460f, new c(b11, this, function1));
    }

    @NotNull
    public final androidx.compose.ui.e m() {
        return this.f40372i;
    }

    @NotNull
    public final FocusTargetNode n() {
        return this.f40369f;
    }

    @NotNull
    public final w o() {
        return this.f40369f.O1();
    }

    public final void p() {
        boolean z11;
        x xVar = this.f40371h;
        z11 = xVar.f68745c;
        FocusTargetNode focusTargetNode = this.f40369f;
        if (z11) {
            y.b(focusTargetNode, true);
            return;
        }
        try {
            x.a(xVar);
            y.b(focusTargetNode, true);
        } finally {
            x.c(xVar);
        }
    }

    public final boolean q() {
        return this.f40364a.invoke(null, null).booleanValue();
    }

    public final void r(@NotNull FocusTargetNode focusTargetNode) {
        this.f40370g.d(focusTargetNode);
    }
}
