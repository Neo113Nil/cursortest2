package Z0;

import androidx.lifecycle.InterfaceC0491u;
import z0.C2731G;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: m, reason: collision with root package name */
    public static final l f6311m = new l(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final l f6312n = new l(2, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final l f6313o = new l(2, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final l f6314p = new l(2, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final l f6315q = new l(2, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final l f6316r = new l(2, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final l f6317s = new l(2, 6);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6318l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i5) {
        super(i);
        this.f6318l = i5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.f6318l) {
            case 0:
                androidx.compose.ui.viewinterop.a.c((C2731G) obj).setUpdateBlock((i4.c) obj2);
                return W3.o.f6046a;
            case 1:
                androidx.compose.ui.viewinterop.a.c((C2731G) obj).setReleaseBlock((i4.c) obj2);
                return W3.o.f6046a;
            case 2:
                androidx.compose.ui.viewinterop.a.c((C2731G) obj).setModifier((b0.p) obj2);
                return W3.o.f6046a;
            case 3:
                androidx.compose.ui.viewinterop.a.c((C2731G) obj).setDensity((W0.c) obj2);
                return W3.o.f6046a;
            case 4:
                androidx.compose.ui.viewinterop.a.c((C2731G) obj).setLifecycleOwner((InterfaceC0491u) obj2);
                return W3.o.f6046a;
            case 5:
                androidx.compose.ui.viewinterop.a.c((C2731G) obj).setSavedStateRegistryOwner((U1.e) obj2);
                return W3.o.f6046a;
            default:
                q c5 = androidx.compose.ui.viewinterop.a.c((C2731G) obj);
                int ordinal = ((W0.m) obj2).ordinal();
                if (ordinal != 0) {
                    i = 1;
                    if (ordinal != 1) {
                        throw new D2.e();
                    }
                } else {
                    i = 0;
                }
                c5.setLayoutDirection(i);
                return W3.o.f6046a;
        }
    }
}
