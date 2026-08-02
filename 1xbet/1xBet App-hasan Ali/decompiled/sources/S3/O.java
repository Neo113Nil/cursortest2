package S3;

import P.InterfaceC0289e0;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class O implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5400k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f5401l;

    public O(int i, InterfaceC0289e0 interfaceC0289e0) {
        this.f5400k = i;
        this.f5401l = interfaceC0289e0;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        this.f5401l.setValue(Integer.valueOf(this.f5400k));
        return W3.o.f6046a;
    }
}
