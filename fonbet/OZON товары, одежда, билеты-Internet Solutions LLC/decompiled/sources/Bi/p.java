package Bi;

import Bi.k;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.os.Build;
import g.AbstractC6592d;
import g.C6601m;
import g.C6602n;
import h.C6761g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;

/* loaded from: classes6.dex */
final class p extends AbstractC7737t implements Function1<Ci.k, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M<Ci.k> f3841b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6592d<Ci.k> f3842c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC6592d<C6601m> f3843d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC6592d<C6601m> f3844e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f3845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(M<Ci.k> m11, AbstractC6592d<Ci.k> abstractC6592d, AbstractC6592d<C6601m> abstractC6592d2, AbstractC6592d<C6601m> abstractC6592d3, InterfaceC4008j<? extends Context> interfaceC4008j) {
        super(1);
        this.f3841b = m11;
        this.f3842c = abstractC6592d;
        this.f3843d = abstractC6592d2;
        this.f3844e = abstractC6592d3;
        this.f3845f = interfaceC4008j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (h.C6761g.a.a(r0) != null) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Ci.k, T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit invoke(Ci.k kVar) {
        Ci.k config = kVar;
        Intrinsics.checkNotNullParameter(config, "config");
        this.f3841b.f71787a = config;
        Context context = (Context) this.f3845f.getValue();
        Set j02 = C7705l.j0(Li.a.b());
        if (!(j02 instanceof Collection) || !j02.isEmpty()) {
            Iterator it = j02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!Li.a.a(context, (String) it.next())) {
                    if (Build.VERSION.SDK_INT < 33) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (!C6761g.a.d()) {
                            Intrinsics.checkNotNullParameter(context, "context");
                            if (C6761g.a.b(context) == null) {
                                Intrinsics.checkNotNullParameter(context, "context");
                            }
                        }
                    }
                    C6761g.f e11 = k.a.e(config);
                    if (config.d().h() > 1) {
                        this.f3843d.a(C6602n.a(e11));
                    } else {
                        this.f3844e.a(C6602n.a(e11));
                    }
                }
            }
            return Unit.f71690a;
        }
        this.f3842c.a(config);
        return Unit.f71690a;
    }
}
