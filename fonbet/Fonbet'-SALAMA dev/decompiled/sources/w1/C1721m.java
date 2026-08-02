package w1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1721m extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f17789c;

    public /* synthetic */ C1721m(String str, List list, int i7) {
        this.f17787a = i7;
        this.f17788b = str;
        this.f17789c = list;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17787a) {
            case 0:
                A2.d(this.f17788b, this.f17789c, 1);
                synchronized (AbstractC1706i0.class) {
                    break;
                }
            case 1:
                String str = this.f17788b;
                List list = this.f17789c;
                AtomicInteger atomicInteger = A2.f17280e;
                if (list != null && !list.isEmpty()) {
                    A2.d(str, list, 2);
                }
                synchronized (AbstractC1706i0.class) {
                    break;
                }
                break;
            default:
                String str2 = this.f17788b;
                List list2 = this.f17789c;
                AtomicInteger atomicInteger2 = A2.f17280e;
                if (list2 != null && !list2.isEmpty()) {
                    A2.d(str2, list2, 3);
                }
                synchronized (AbstractC1706i0.class) {
                    break;
                }
                break;
        }
    }
}
