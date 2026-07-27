package w2;

import g2.InterfaceC0322f;

/* renamed from: w2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237p extends kotlin.jvm.internal.k implements o2.p {
    public static final C1237p f = new C1237p(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1237p f10518g = new C1237p(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1237p(int i3, int i4) {
        super(i3);
        this.f10519e = i4;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10519e) {
            case 0:
                return ((g2.h) obj).h((InterfaceC0322f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((g2.h) obj).h((InterfaceC0322f) obj2);
        }
    }
}
