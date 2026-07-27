package K;

import i2.AbstractC0343b;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class P extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public Object f791d;

    /* renamed from: e, reason: collision with root package name */
    public FileInputStream f792e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q f793g;

    /* renamed from: h, reason: collision with root package name */
    public int f794h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q3, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f793g = q3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f = obj;
        this.f794h |= Integer.MIN_VALUE;
        return Q.a(this.f793g, this);
    }
}
