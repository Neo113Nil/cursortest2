package W5;

import U5.AbstractC0438e;
import java.util.Map;

/* JADX INFO: renamed from: W5.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0536r1 extends U5.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7322a;

    static {
        f7322a = !P6.b.x(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // U5.O
    public String a() {
        return "pick_first";
    }

    @Override // U5.O
    public int b() {
        return 5;
    }

    @Override // U5.O
    public boolean c() {
        return true;
    }

    @Override // U5.O
    public final U5.N d(AbstractC0438e abstractC0438e) {
        return f7322a ? new C0522m1(abstractC0438e) : new C0534q1(abstractC0438e);
    }

    @Override // U5.O
    public U5.e0 e(Map map) {
        try {
            return new U5.e0(new C0528o1(AbstractC0547v0.b("shuffleAddressList", map)));
        } catch (RuntimeException e7) {
            return new U5.e0(U5.l0.f6544n.f(e7).g("Failed parsing configuration for " + a()));
        }
    }
}
