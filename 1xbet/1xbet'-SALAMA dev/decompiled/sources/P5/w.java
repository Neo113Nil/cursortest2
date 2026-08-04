package P5;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L f5701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f5702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f5703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f5704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p030e0.e f5705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5706f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ L f5707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5708y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(L l7, p077k6.c cVar) {
        super(cVar);
        this.f5707x = l7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f5706f = obj;
        this.f5708y |= Integer.MIN_VALUE;
        return L.b(this.f5707x, null, this);
    }
}
