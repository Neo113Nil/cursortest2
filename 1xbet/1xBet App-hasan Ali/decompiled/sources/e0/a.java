package e0;

import A.B;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import b0.o;
import e0.a;
import e2.C1930k;
import kotlin.jvm.internal.s;
import r.C2323a;
import r.C2328f;
import z0.AbstractC2749f;
import z0.Z;
import z0.z0;

/* loaded from: classes.dex */
public final class a implements View.OnDragListener, c {

    /* renamed from: a, reason: collision with root package name */
    public final f f16889a;

    /* renamed from: b, reason: collision with root package name */
    public final C2328f f16890b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f16891c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a() {
        f fVar = new f();
        fVar.f16898A = 0L;
        this.f16889a = fVar;
        this.f16890b = new C2328f(0);
        this.f16891c = new Z() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return a.this.f16889a.hashCode();
            }

            @Override // z0.Z
            public final o i() {
                return a.this.f16889a;
            }

            @Override // z0.Z
            public final /* bridge */ /* synthetic */ void k(o oVar) {
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C1930k c1930k = new C1930k(23, dragEvent);
        int action = dragEvent.getAction();
        f fVar = this.f16889a;
        z0 z0Var = z0.f21876k;
        C2328f c2328f = this.f16890b;
        switch (action) {
            case 1:
                s sVar = new s();
                e eVar = new e(c1930k, fVar, sVar);
                if (eVar.c(fVar) == z0Var) {
                    AbstractC2749f.z(fVar, eVar);
                }
                boolean z3 = sVar.f17620k;
                c2328f.getClass();
                C2323a c2323a = new C2323a(c2328f);
                while (c2323a.hasNext()) {
                    ((f) c2323a.next()).C0(c1930k);
                }
                break;
            case 2:
                fVar.B0(c1930k);
                break;
            case 4:
                B b3 = new B(21, c1930k);
                if (b3.c(fVar) == z0Var) {
                    AbstractC2749f.z(fVar, b3);
                }
                c2328f.clear();
                break;
            case 5:
                fVar.z0(c1930k);
                break;
            case 6:
                fVar.A0(c1930k);
                break;
        }
        return false;
    }
}
