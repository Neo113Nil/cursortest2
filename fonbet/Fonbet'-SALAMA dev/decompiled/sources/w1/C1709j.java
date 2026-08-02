package w1;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1709j extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17748c;

    public /* synthetic */ C1709j(int i7, String str, String str2) {
        this.f17746a = i7;
        this.f17747b = str;
        this.f17748c = str2;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17746a) {
            case 0:
                C1759x1.z().A(new R1(new C1684c2(1, this.f17747b, this.f17748c), 9));
                break;
            case 1:
                C1759x1.z().A(new R1(new C1696f2(this.f17747b, this.f17748c), 10));
                break;
            case 2:
                A2.c(5, this.f17747b, this.f17748c);
                synchronized (AbstractC1706i0.class) {
                    break;
                }
            case 3:
                String str = this.f17747b;
                String str2 = this.f17748c;
                if (str2 == null) {
                    AtomicInteger atomicInteger = A2.f17280e;
                } else {
                    A2.c(2, str, str2);
                }
                synchronized (AbstractC1706i0.class) {
                    break;
                }
            default:
                String str3 = this.f17747b;
                String str4 = this.f17748c;
                if (str4 == null) {
                    AtomicInteger atomicInteger2 = A2.f17280e;
                } else {
                    A2.c(3, str3, str4);
                }
                synchronized (AbstractC1706i0.class) {
                    break;
                }
        }
    }
}
