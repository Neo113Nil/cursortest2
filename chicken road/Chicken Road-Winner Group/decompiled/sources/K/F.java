package K;

import i2.AbstractC0343b;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public Object f746d;

    /* renamed from: e, reason: collision with root package name */
    public Object f747e;
    public Serializable f;

    /* renamed from: g, reason: collision with root package name */
    public kotlin.jvm.internal.q f748g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f749h;

    /* renamed from: i, reason: collision with root package name */
    public int f750i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f751j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O f752k;

    /* renamed from: l, reason: collision with root package name */
    public int f753l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(O o3, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f752k = o3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f751j = obj;
        this.f753l |= Integer.MIN_VALUE;
        return O.f(this.f752k, false, this);
    }
}
