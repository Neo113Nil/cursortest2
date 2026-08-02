package G1;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: G1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131b extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final C0131b f1878m = new C0131b(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0131b f1879n = new C0131b(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0131b f1880o = new C0131b(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0131b f1881p = new C0131b(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C0131b f1882q = new C0131b(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final C0131b f1883r = new C0131b(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final C0131b f1884s = new C0131b(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final C0131b f1885t = new C0131b(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final C0131b f1886u = new C0131b(1, 8);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1887l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0131b(int i, int i5) {
        super(i);
        this.f1887l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1887l) {
            case 0:
                Context context = (Context) obj;
                kotlin.jvm.internal.l.f("it", context);
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                kotlin.jvm.internal.l.f("it", context2);
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                I i = (I) obj;
                kotlin.jvm.internal.l.f("$this$navOptions", i);
                i.f1865c = true;
                return W3.o.f6046a;
            case 3:
                y yVar = (y) obj;
                kotlin.jvm.internal.l.f("destination", yVar);
                B b3 = yVar.f1965l;
                if (b3 == null || b3.f1817u != yVar.f1969p) {
                    return null;
                }
                return b3;
            case 4:
                y yVar2 = (y) obj;
                kotlin.jvm.internal.l.f("destination", yVar2);
                B b5 = yVar2.f1965l;
                if (b5 == null || b5.f1817u != yVar2.f1969p) {
                    return null;
                }
                return b5;
            case 5:
                y yVar3 = (y) obj;
                kotlin.jvm.internal.l.f("it", yVar3);
                return Integer.valueOf(yVar3.f1969p);
            case 6:
                y yVar4 = (y) obj;
                kotlin.jvm.internal.l.f("it", yVar4);
                return yVar4.f1965l;
            case 7:
                y yVar5 = (y) obj;
                kotlin.jvm.internal.l.f("it", yVar5);
                if (!(yVar5 instanceof B)) {
                    return null;
                }
                B b6 = (B) yVar5;
                return b6.g(b6.f1817u, b6, false, null);
            default:
                I i5 = (I) obj;
                kotlin.jvm.internal.l.f("$this$navOptions", i5);
                i5.f1864b = true;
                return W3.o.f6046a;
        }
    }
}
