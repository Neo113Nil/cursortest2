package a2;

import i2.AbstractC0343b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public C0100J f1877d;

    /* renamed from: e, reason: collision with root package name */
    public Set f1878e;
    public Map f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f1879g;

    /* renamed from: h, reason: collision with root package name */
    public N.d f1880h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1881i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0100J f1882j;

    /* renamed from: k, reason: collision with root package name */
    public int f1883k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C0100J c0100j, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f1882j = c0100j;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f1881i = obj;
        this.f1883k |= Integer.MIN_VALUE;
        return C0100J.o(this.f1882j, null, this);
    }
}
