package K;

import i2.AbstractC0343b;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class Y extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public FileOutputStream f819d;

    /* renamed from: e, reason: collision with root package name */
    public FileOutputStream f820e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z f821g;

    /* renamed from: h, reason: collision with root package name */
    public int f822h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z3, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f821g = z3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f = obj;
        this.f822h |= Integer.MIN_VALUE;
        return this.f821g.b(null, this);
    }
}
