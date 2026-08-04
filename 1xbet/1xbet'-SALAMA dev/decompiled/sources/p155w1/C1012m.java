package p155w1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: w1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1012m extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f17795c;

    public /* synthetic */ C1012m(String str, List list, int i7) {
        this.f17793a = i7;
        this.f17794b = str;
        this.f17795c = list;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17793a) {
            case 0:
                A2.d(this.f17794b, this.f17795c, 1);
                synchronized (AbstractC0997i0.class) {
                    break;
                }
                break;
            case 1:
                String str = this.f17794b;
                List list = this.f17795c;
                AtomicInteger atomicInteger = A2.f17286e;
                if (list != null && !list.isEmpty()) {
                    A2.d(str, list, 2);
                }
                synchronized (AbstractC0997i0.class) {
                    break;
                }
                break;
            default:
                String str2 = this.f17794b;
                List list2 = this.f17795c;
                AtomicInteger atomicInteger2 = A2.f17286e;
                if (list2 != null && !list2.isEmpty()) {
                    A2.d(str2, list2, 3);
                }
                synchronized (AbstractC0997i0.class) {
                    break;
                }
                break;
        }
    }
}
