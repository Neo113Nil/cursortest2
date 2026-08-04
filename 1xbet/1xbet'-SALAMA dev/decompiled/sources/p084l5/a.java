package p084l5;

import io.sentry.MeasurementUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f15036b;

    public /* synthetic */ a(b bVar, int i7) {
        this.f15035a = i7;
        this.f15036b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15035a) {
            case 0:
                b bVar = this.f15036b;
                bVar.f15038b.c(bVar.f15037a.h());
                break;
            default:
                this.f15036b.f15038b.c(MeasurementUnit.NONE);
                break;
        }
    }
}
