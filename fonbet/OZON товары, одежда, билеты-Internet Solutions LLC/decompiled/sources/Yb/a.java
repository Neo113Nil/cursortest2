package Yb;

import Af.C2426a;
import Af.C2427b;
import Hf.u;
import If.c;
import Ub.f;
import Ub.j;
import Ub.l;
import Ub.r;
import Ub.t;
import android.text.style.StrikethroughSpan;
import androidx.annotation.NonNull;
import java.util.Collections;

/* loaded from: classes.dex */
public final class a extends Ub.a {

    /* renamed from: Yb.a$a, reason: collision with other inner class name */
    final class C0646a implements t {
        @Override // Ub.t
        public final Object a(@NonNull f fVar, @NonNull r rVar) {
            return new StrikethroughSpan();
        }
    }

    final class b implements l.b<C2426a> {
        @Override // Ub.l.b
        public final void a(@NonNull u uVar, @NonNull l lVar) {
            C2426a c2426a = (C2426a) uVar;
            int length = lVar.length();
            lVar.b(c2426a);
            lVar.E(c2426a, length);
        }
    }

    @Override // Ub.a, Ub.h
    public final void configureParser(@NonNull c.a aVar) {
        aVar.h(Collections.singleton(new C2427b()));
    }

    @Override // Ub.a, Ub.h
    public final void configureSpansFactory(@NonNull j.a aVar) {
        aVar.b(C2426a.class, new C0646a());
    }

    @Override // Ub.a, Ub.h
    public final void configureVisitor(@NonNull l.a aVar) {
        aVar.a(C2426a.class, new b());
    }
}
