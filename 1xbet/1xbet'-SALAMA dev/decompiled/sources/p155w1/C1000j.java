package p155w1;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: w1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1000j extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17754c;

    public /* synthetic */ C1000j(int i7, String str, String str2) {
        this.f17752a = i7;
        this.f17753b = str;
        this.f17754c = str2;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17752a) {
            case 0:
                C1050x1.z().A(new R1(new C0975c2(1, this.f17753b, this.f17754c), 9));
                break;
            case 1:
                C1050x1.z().A(new R1(new C0987f2(this.f17753b, this.f17754c), 10));
                break;
            case 2:
                A2.c(5, this.f17753b, this.f17754c);
                synchronized (AbstractC0997i0.class) {
                    break;
                }
                break;
            case 3:
                String str = this.f17753b;
                String str2 = this.f17754c;
                if (str2 == null) {
                    AtomicInteger atomicInteger = A2.f17286e;
                } else {
                    A2.c(2, str, str2);
                }
                synchronized (AbstractC0997i0.class) {
                    break;
                }
                break;
            default:
                String str3 = this.f17753b;
                String str4 = this.f17754c;
                if (str4 == null) {
                    AtomicInteger atomicInteger2 = A2.f17286e;
                } else {
                    A2.c(3, str3, str4);
                }
                synchronized (AbstractC0997i0.class) {
                    break;
                }
                break;
        }
    }
}
