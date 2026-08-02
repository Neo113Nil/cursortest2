package P5;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class w extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public L f5701a;

    /* renamed from: b, reason: collision with root package name */
    public Set f5702b;

    /* renamed from: c, reason: collision with root package name */
    public Map f5703c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f5704d;

    /* renamed from: e, reason: collision with root package name */
    public e0.e f5705e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5706f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ L f5707x;

    /* renamed from: y, reason: collision with root package name */
    public int f5708y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(L l7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f5707x = l7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f5706f = obj;
        this.f5708y |= Integer.MIN_VALUE;
        return L.b(this.f5707x, null, this);
    }
}
