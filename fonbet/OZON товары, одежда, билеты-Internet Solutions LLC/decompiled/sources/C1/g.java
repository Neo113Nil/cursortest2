package C1;

import D1.AbstractC2813m;
import D1.C2793c;
import D1.C2809k;
import D1.H;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f4301a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U0.b<C2793c> f4302b = new U0.b<>(new C2793c[16]);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final U0.b<c<?>> f4303c = new U0.b<>(new c[16]);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final U0.b<H> f4304d = new U0.b<>(new H[16]);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final U0.b<c<?>> f4305e = new U0.b<>(new c[16]);

    /* renamed from: f, reason: collision with root package name */
    private boolean f4306f;

    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            g.this.e();
            return Unit.f71690a;
        }
    }

    public g(@NotNull AndroidComposeView androidComposeView) {
        this.f4301a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static void c(e.c cVar, c cVar2, HashSet hashSet) {
        if (!cVar.getNode().isAttached()) {
            A1.a.b("visitSubtreeIf called on an unattached node");
            throw null;
        }
        U0.b bVar = new U0.b(new e.c[16]);
        e.c child$ui_release = cVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            C2809k.a(bVar, cVar.getNode());
        } else {
            bVar.b(child$ui_release);
        }
        while (bVar.p()) {
            e.c cVar3 = (e.c) Pk0.b.b(1, bVar);
            if ((cVar3.getAggregateChildKindSet$ui_release() & 32) != 0) {
                for (e.c cVar4 = cVar3; cVar4 != null; cVar4 = cVar4.getChild$ui_release()) {
                    if ((cVar4.getKindSet$ui_release() & 32) != 0) {
                        ?? r62 = 0;
                        AbstractC2813m abstractC2813m = cVar4;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof i) {
                                i iVar = (i) abstractC2813m;
                                if (iVar instanceof C2793c) {
                                    C2793c c2793c = (C2793c) iVar;
                                    if ((c2793c.J1() instanceof d) && c2793c.K1().contains(cVar2)) {
                                        hashSet.add(iVar);
                                    }
                                }
                                if (iVar.getProvidedValues().a(cVar2)) {
                                    break;
                                }
                            } else if ((abstractC2813m.getKindSet$ui_release() & 32) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r62 = r62;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 32) != 0) {
                                        i11++;
                                        r62 = r62;
                                        if (i11 == 1) {
                                            abstractC2813m = J12;
                                        } else {
                                            if (r62 == 0) {
                                                r62 = new U0.b(new e.c[16]);
                                            }
                                            if (abstractC2813m != 0) {
                                                r62.b(abstractC2813m);
                                                abstractC2813m = 0;
                                            }
                                            r62.b(J12);
                                        }
                                    }
                                    J12 = J12.getChild$ui_release();
                                    abstractC2813m = abstractC2813m;
                                    r62 = r62;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC2813m = C2809k.b(r62);
                        }
                    }
                }
            }
            C2809k.a(bVar, cVar3);
        }
    }

    public final void a(@NotNull C2793c c2793c, @NotNull m mVar) {
        this.f4302b.b(c2793c);
        this.f4303c.b(mVar);
        b();
    }

    public final void b() {
        if (this.f4306f) {
            return;
        }
        this.f4306f = true;
        this.f4301a.J0(new a());
    }

    public final void d(@NotNull C2793c c2793c, @NotNull m mVar) {
        this.f4304d.b(C2809k.f(c2793c));
        this.f4305e.b(mVar);
        b();
    }

    public final void e() {
        int i11 = 0;
        this.f4306f = false;
        HashSet hashSet = new HashSet();
        U0.b<H> bVar = this.f4304d;
        int m11 = bVar.m();
        U0.b<c<?>> bVar2 = this.f4305e;
        if (m11 > 0) {
            H[] l11 = bVar.l();
            int i12 = 0;
            do {
                H h11 = l11[i12];
                c<?> cVar = bVar2.l()[i12];
                if (h11.c0().h().isAttached()) {
                    c(h11.c0().h(), cVar, hashSet);
                }
                i12++;
            } while (i12 < m11);
        }
        bVar.h();
        bVar2.h();
        U0.b<C2793c> bVar3 = this.f4302b;
        int m12 = bVar3.m();
        U0.b<c<?>> bVar4 = this.f4303c;
        if (m12 > 0) {
            C2793c[] l12 = bVar3.l();
            do {
                C2793c c2793c = l12[i11];
                c<?> cVar2 = bVar4.l()[i11];
                if (c2793c.isAttached()) {
                    c(c2793c, cVar2, hashSet);
                }
                i11++;
            } while (i11 < m12);
        }
        bVar3.h();
        bVar4.h();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C2793c) it.next()).P1();
        }
    }

    public final void f(@NotNull C2793c c2793c, @NotNull m mVar) {
        this.f4302b.b(c2793c);
        this.f4303c.b(mVar);
        b();
    }
}
