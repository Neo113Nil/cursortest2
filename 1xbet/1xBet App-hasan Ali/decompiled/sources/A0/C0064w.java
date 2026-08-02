package A0;

import android.os.Bundle;
import java.util.List;

/* renamed from: A0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064w extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f586m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0064w(kotlin.jvm.internal.w wVar, int i) {
        super(1);
        this.f585l = i;
        this.f586m = wVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        boolean z3 = true;
        kotlin.jvm.internal.w wVar = this.f586m;
        switch (this.f585l) {
            case 0:
                wVar.f17624k = (g0.s) obj;
                return Boolean.TRUE;
            case 1:
                z0.A0 a02 = (z0.A0) obj;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", a02);
                B.A a5 = ((B.O) a02).f657y;
                List list = (List) wVar.f17624k;
                if (list != null) {
                    list.add(a5);
                } else {
                    list = X3.n.P(a5);
                }
                wVar.f17624k = list;
                return z0.z0.f21877l;
            case 2:
                String str = (String) obj;
                kotlin.jvm.internal.l.f("key", str);
                Object obj2 = wVar.f17624k;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 3:
                Object obj3 = (z0.A0) obj;
                if (((b0.o) obj3).f7162k.f7175x) {
                    wVar.f17624k = obj3;
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                t0.m mVar = (t0.m) obj;
                Object obj4 = wVar.f17624k;
                if (obj4 == null && mVar.f19494z) {
                    wVar.f17624k = mVar;
                } else if (obj4 != null) {
                    mVar.getClass();
                }
                return Boolean.TRUE;
        }
    }
}
