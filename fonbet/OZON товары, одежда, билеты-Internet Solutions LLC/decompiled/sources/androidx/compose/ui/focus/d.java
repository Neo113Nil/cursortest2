package androidx.compose.ui.focus;

import D1.AbstractC2813m;
import D1.C2809k;
import D1.InterfaceC2807j;
import androidx.collection.M;
import androidx.collection.Y;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j1.o;
import j1.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Function0<Unit>, Unit> f40393a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f40394b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M<FocusTargetNode> f40395c = Y.a();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M<j1.e> f40396d = Y.a();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final M<o> f40397e = Y.a();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M<FocusTargetNode> f40398f = Y.a();

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Function1<? super Function0<Unit>, Unit> function1, @NotNull Function0<Unit> function0) {
        this.f40393a = function1;
        this.f40394b = function0;
    }

    public static final void a(d dVar) {
        M<o> m11;
        char c11;
        long j11;
        long j12;
        M<j1.e> m12;
        Object[] objArr;
        long[] jArr;
        M<j1.e> m13;
        Object[] objArr2;
        long[] jArr2;
        long j13;
        w wVar;
        U0.b bVar;
        U0.b bVar2;
        Object[] objArr3;
        long[] jArr3;
        long j14;
        long j15;
        int i11;
        U0.b bVar3;
        Object[] objArr4;
        M<o> m14;
        Object[] objArr5;
        int i12;
        char c12;
        U0.b bVar4;
        U0.b bVar5;
        M<o> m15;
        Object[] objArr6;
        M<o> m16;
        Object[] objArr7;
        U0.b bVar6;
        M<o> m17 = dVar.f40397e;
        Object[] objArr8 = m17.f38663b;
        long[] jArr4 = m17.f38662a;
        int length = jArr4.length - 2;
        char c13 = 7;
        M<FocusTargetNode> m18 = dVar.f40395c;
        int i13 = 8;
        if (length >= 0) {
            int i14 = 0;
            j11 = 255;
            while (true) {
                long j16 = jArr4[i14];
                j12 = -9187201950435737472L;
                if ((((~j16) << c13) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j16 & 255) < 128) {
                            o oVar = (o) objArr8[(i14 << 3) + i16];
                            if (oVar.getNode().isAttached()) {
                                c12 = c13;
                                e.c node = oVar.getNode();
                                U0.b bVar7 = null;
                                while (node != null) {
                                    int i17 = i13;
                                    if (node instanceof FocusTargetNode) {
                                        m18.d((FocusTargetNode) node);
                                    } else if ((node.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (node instanceof AbstractC2813m)) {
                                        e.c J12 = ((AbstractC2813m) node).J1();
                                        int i18 = 0;
                                        while (J12 != null) {
                                            if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                i18++;
                                                if (i18 == 1) {
                                                    m16 = m17;
                                                    objArr7 = objArr8;
                                                    node = J12;
                                                } else {
                                                    if (bVar7 == null) {
                                                        m16 = m17;
                                                        objArr7 = objArr8;
                                                        bVar6 = new U0.b(new e.c[16]);
                                                    } else {
                                                        m16 = m17;
                                                        objArr7 = objArr8;
                                                        bVar6 = bVar7;
                                                    }
                                                    if (node != null) {
                                                        bVar6.b(node);
                                                        node = null;
                                                    }
                                                    bVar6.b(J12);
                                                    bVar7 = bVar6;
                                                }
                                            } else {
                                                m16 = m17;
                                                objArr7 = objArr8;
                                            }
                                            J12 = J12.getChild$ui_release();
                                            m17 = m16;
                                            objArr8 = objArr7;
                                        }
                                        m15 = m17;
                                        objArr6 = objArr8;
                                        if (i18 == 1) {
                                            i13 = i17;
                                            m17 = m15;
                                            objArr8 = objArr6;
                                        }
                                        node = C2809k.b(bVar7);
                                        i13 = i17;
                                        m17 = m15;
                                        objArr8 = objArr6;
                                    }
                                    m15 = m17;
                                    objArr6 = objArr8;
                                    node = C2809k.b(bVar7);
                                    i13 = i17;
                                    m17 = m15;
                                    objArr8 = objArr6;
                                }
                                m14 = m17;
                                objArr5 = objArr8;
                                i12 = i13;
                                if (!oVar.getNode().isAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                U0.b bVar8 = new U0.b(new e.c[16]);
                                e.c child$ui_release = oVar.getNode().getChild$ui_release();
                                if (child$ui_release == null) {
                                    C2809k.a(bVar8, oVar.getNode());
                                } else {
                                    bVar8.b(child$ui_release);
                                }
                                while (bVar8.p()) {
                                    e.c cVar = (e.c) Pk0.b.b(1, bVar8);
                                    if ((cVar.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                                        C2809k.a(bVar8, cVar);
                                    } else {
                                        while (true) {
                                            if (cVar == null) {
                                                break;
                                            }
                                            if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                U0.b bVar9 = null;
                                                while (cVar != null) {
                                                    if (cVar instanceof FocusTargetNode) {
                                                        m18.d((FocusTargetNode) cVar);
                                                    } else if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                                                        e.c J13 = ((AbstractC2813m) cVar).J1();
                                                        int i19 = 0;
                                                        while (J13 != null) {
                                                            if ((J13.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                                i19++;
                                                                if (i19 == 1) {
                                                                    bVar5 = bVar8;
                                                                    cVar = J13;
                                                                } else {
                                                                    if (bVar9 == null) {
                                                                        bVar5 = bVar8;
                                                                        bVar9 = new U0.b(new e.c[16]);
                                                                    } else {
                                                                        bVar5 = bVar8;
                                                                    }
                                                                    if (cVar != null) {
                                                                        bVar9.b(cVar);
                                                                        cVar = null;
                                                                    }
                                                                    bVar9.b(J13);
                                                                }
                                                            } else {
                                                                bVar5 = bVar8;
                                                            }
                                                            J13 = J13.getChild$ui_release();
                                                            bVar8 = bVar5;
                                                        }
                                                        bVar4 = bVar8;
                                                        if (i19 == 1) {
                                                            bVar8 = bVar4;
                                                        }
                                                        cVar = C2809k.b(bVar9);
                                                        bVar8 = bVar4;
                                                    }
                                                    bVar4 = bVar8;
                                                    cVar = C2809k.b(bVar9);
                                                    bVar8 = bVar4;
                                                }
                                            } else {
                                                cVar = cVar.getChild$ui_release();
                                            }
                                        }
                                    }
                                }
                                j16 >>= i12;
                                i16++;
                                c13 = c12;
                                i13 = i12;
                                m17 = m14;
                                objArr8 = objArr5;
                            }
                        }
                        m14 = m17;
                        objArr5 = objArr8;
                        i12 = i13;
                        c12 = c13;
                        j16 >>= i12;
                        i16++;
                        c13 = c12;
                        i13 = i12;
                        m17 = m14;
                        objArr8 = objArr5;
                    }
                    m11 = m17;
                    objArr4 = objArr8;
                    c11 = c13;
                    if (i15 != i13) {
                        break;
                    }
                } else {
                    m11 = m17;
                    objArr4 = objArr8;
                    c11 = c13;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                c13 = c11;
                m17 = m11;
                objArr8 = objArr4;
                i13 = 8;
            }
        } else {
            m11 = m17;
            c11 = 7;
            j11 = 255;
            j12 = -9187201950435737472L;
        }
        m11.f();
        M<j1.e> m19 = dVar.f40396d;
        Object[] objArr9 = m19.f38663b;
        long[] jArr5 = m19.f38662a;
        int length2 = jArr5.length - 2;
        M<FocusTargetNode> m21 = dVar.f40398f;
        if (length2 >= 0) {
            int i21 = 0;
            while (true) {
                long j17 = jArr5[i21];
                if ((((~j17) << c11) & j17 & j12) != j12) {
                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j17 & j11) < 128) {
                            j1.e eVar = (j1.e) objArr9[(i21 << 3) + i23];
                            if (eVar.getNode().isAttached()) {
                                e.c node2 = eVar.getNode();
                                FocusTargetNode focusTargetNode = null;
                                U0.b bVar10 = null;
                                boolean z11 = true;
                                boolean z12 = false;
                                while (node2 != null) {
                                    M<j1.e> m22 = m19;
                                    if (node2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node2;
                                        if (focusTargetNode != null) {
                                            z12 = true;
                                        }
                                        if (m18.a(focusTargetNode2)) {
                                            m21.d(focusTargetNode2);
                                            z11 = false;
                                        }
                                        objArr3 = objArr9;
                                        jArr3 = jArr5;
                                        j14 = j17;
                                        focusTargetNode = focusTargetNode2;
                                    } else if ((node2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0 || !(node2 instanceof AbstractC2813m)) {
                                        objArr3 = objArr9;
                                        jArr3 = jArr5;
                                        j14 = j17;
                                    } else {
                                        e.c J14 = ((AbstractC2813m) node2).J1();
                                        objArr3 = objArr9;
                                        int i24 = 0;
                                        while (J14 != null) {
                                            long[] jArr6 = jArr5;
                                            if ((J14.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                i24++;
                                                if (i24 == 1) {
                                                    node2 = J14;
                                                } else {
                                                    if (bVar10 == null) {
                                                        i11 = i24;
                                                        j15 = j17;
                                                        bVar3 = new U0.b(new e.c[16]);
                                                    } else {
                                                        i11 = i24;
                                                        j15 = j17;
                                                        bVar3 = bVar10;
                                                    }
                                                    if (node2 != null) {
                                                        bVar3.b(node2);
                                                        node2 = null;
                                                    }
                                                    bVar3.b(J14);
                                                    bVar10 = bVar3;
                                                    i24 = i11;
                                                    J14 = J14.getChild$ui_release();
                                                    jArr5 = jArr6;
                                                    j17 = j15;
                                                }
                                            }
                                            j15 = j17;
                                            J14 = J14.getChild$ui_release();
                                            jArr5 = jArr6;
                                            j17 = j15;
                                        }
                                        jArr3 = jArr5;
                                        j14 = j17;
                                        if (i24 == 1) {
                                            m19 = m22;
                                            objArr9 = objArr3;
                                            jArr5 = jArr3;
                                            j17 = j14;
                                        }
                                    }
                                    node2 = C2809k.b(bVar10);
                                    m19 = m22;
                                    objArr9 = objArr3;
                                    jArr5 = jArr3;
                                    j17 = j14;
                                }
                                m13 = m19;
                                objArr2 = objArr9;
                                jArr2 = jArr5;
                                j13 = j17;
                                if (!eVar.getNode().isAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                U0.b bVar11 = new U0.b(new e.c[16]);
                                e.c child$ui_release2 = eVar.getNode().getChild$ui_release();
                                if (child$ui_release2 == null) {
                                    C2809k.a(bVar11, eVar.getNode());
                                } else {
                                    bVar11.b(child$ui_release2);
                                }
                                while (bVar11.p()) {
                                    e.c cVar2 = (e.c) Pk0.b.b(1, bVar11);
                                    if ((cVar2.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                                        C2809k.a(bVar11, cVar2);
                                    } else {
                                        while (cVar2 != null) {
                                            if ((cVar2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                U0.b bVar12 = null;
                                                while (cVar2 != null) {
                                                    if (cVar2 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar2;
                                                        if (focusTargetNode != null) {
                                                            z12 = true;
                                                        }
                                                        if (m18.a(focusTargetNode3)) {
                                                            m21.d(focusTargetNode3);
                                                            z11 = false;
                                                        }
                                                        bVar = bVar11;
                                                        focusTargetNode = focusTargetNode3;
                                                    } else if ((cVar2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0 || !(cVar2 instanceof AbstractC2813m)) {
                                                        bVar = bVar11;
                                                    } else {
                                                        e.c J15 = ((AbstractC2813m) cVar2).J1();
                                                        int i25 = 0;
                                                        while (J15 != null) {
                                                            if ((J15.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                                i25++;
                                                                if (i25 == 1) {
                                                                    bVar2 = bVar11;
                                                                    cVar2 = J15;
                                                                } else {
                                                                    if (bVar12 == null) {
                                                                        bVar2 = bVar11;
                                                                        bVar12 = new U0.b(new e.c[16]);
                                                                    } else {
                                                                        bVar2 = bVar11;
                                                                    }
                                                                    if (cVar2 != null) {
                                                                        bVar12.b(cVar2);
                                                                        cVar2 = null;
                                                                    }
                                                                    bVar12.b(J15);
                                                                    J15 = J15.getChild$ui_release();
                                                                    bVar11 = bVar2;
                                                                }
                                                            } else {
                                                                bVar2 = bVar11;
                                                            }
                                                            J15 = J15.getChild$ui_release();
                                                            bVar11 = bVar2;
                                                        }
                                                        bVar = bVar11;
                                                        if (i25 == 1) {
                                                            bVar11 = bVar;
                                                        }
                                                        cVar2 = C2809k.b(bVar12);
                                                        bVar11 = bVar;
                                                    }
                                                    cVar2 = C2809k.b(bVar12);
                                                    bVar11 = bVar;
                                                }
                                            } else {
                                                cVar2 = cVar2.getChild$ui_release();
                                                bVar11 = bVar11;
                                            }
                                        }
                                    }
                                    bVar11 = bVar11;
                                }
                                if (z11) {
                                    if (z12) {
                                        wVar = j1.f.a(eVar);
                                    } else if (focusTargetNode == null || (wVar = focusTargetNode.O1()) == null) {
                                        wVar = w.Inactive;
                                    }
                                    eVar.L(wVar);
                                }
                                j17 = j13 >> 8;
                                i23++;
                                m19 = m13;
                                objArr9 = objArr2;
                                jArr5 = jArr2;
                            } else {
                                eVar.L(w.Inactive);
                            }
                        }
                        m13 = m19;
                        objArr2 = objArr9;
                        jArr2 = jArr5;
                        j13 = j17;
                        j17 = j13 >> 8;
                        i23++;
                        m19 = m13;
                        objArr9 = objArr2;
                        jArr5 = jArr2;
                    }
                    m12 = m19;
                    objArr = objArr9;
                    jArr = jArr5;
                    if (i22 != 8) {
                        break;
                    }
                } else {
                    m12 = m19;
                    objArr = objArr9;
                    jArr = jArr5;
                }
                if (i21 == length2) {
                    break;
                }
                i21++;
                m19 = m12;
                objArr9 = objArr;
                jArr5 = jArr;
            }
        } else {
            m12 = m19;
        }
        m12.f();
        Object[] objArr10 = m18.f38663b;
        long[] jArr7 = m18.f38662a;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i26 = 0;
            while (true) {
                long j18 = jArr7[i26];
                if ((((~j18) << c11) & j18 & j12) != j12) {
                    int i27 = 8 - ((~(i26 - length3)) >>> 31);
                    for (int i28 = 0; i28 < i27; i28++) {
                        if ((j18 & j11) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr10[(i26 << 3) + i28];
                            if (focusTargetNode4.isAttached()) {
                                w O12 = focusTargetNode4.O1();
                                focusTargetNode4.R1();
                                if (O12 != focusTargetNode4.O1() || m21.a(focusTargetNode4)) {
                                    j1.f.b(focusTargetNode4);
                                }
                            }
                        }
                        j18 >>= 8;
                    }
                    if (i27 != 8) {
                        break;
                    }
                }
                if (i26 == length3) {
                    break;
                } else {
                    i26++;
                }
            }
        }
        m18.f();
        m21.f();
        ((FocusOwnerImpl.b) dVar.f40394b).invoke();
        if (!m11.b()) {
            A1.a.b("Unprocessed FocusProperties nodes");
            throw null;
        }
        if (!m12.b()) {
            A1.a.b("Unprocessed FocusEvent nodes");
            throw null;
        }
        if (m18.b()) {
            return;
        }
        A1.a.b("Unprocessed FocusTarget nodes");
        throw null;
    }

    private final void c(M m11, InterfaceC2807j interfaceC2807j) {
        if (m11.d(interfaceC2807j) && this.f40395c.f38665d + this.f40396d.f38665d + this.f40397e.f38665d == 1) {
            this.f40393a.invoke(new c(0, this, d.class, "invalidateNodes", "invalidateNodes()V", 0));
        }
    }

    public final boolean b() {
        return this.f40395c.c() || this.f40397e.c() || this.f40396d.c();
    }

    public final void d(@NotNull FocusTargetNode focusTargetNode) {
        c(this.f40395c, focusTargetNode);
    }

    public final void e(@NotNull j1.e eVar) {
        c(this.f40396d, eVar);
    }

    public final void f(@NotNull o oVar) {
        c(this.f40397e, oVar);
    }
}
