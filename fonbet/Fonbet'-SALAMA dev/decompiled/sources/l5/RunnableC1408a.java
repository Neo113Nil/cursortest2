package l5;

import io.sentry.MeasurementUnit;

/* renamed from: l5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1408a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1409b f15030b;

    public /* synthetic */ RunnableC1408a(C1409b c1409b, int i7) {
        this.f15029a = i7;
        this.f15030b = c1409b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15029a) {
            case 0:
                C1409b c1409b = this.f15030b;
                c1409b.f15032b.c(c1409b.f15031a.h());
                break;
            default:
                this.f15030b.f15032b.c(MeasurementUnit.NONE);
                break;
        }
    }
}
