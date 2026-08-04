package p109p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f15643f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f15644x;

    public e(f fVar, int i7, int i8, int i9, int i10, int i11, Bundle bundle) {
        this.f15644x = fVar;
        this.f15638a = i7;
        this.f15639b = i8;
        this.f15640c = i9;
        this.f15641d = i10;
        this.f15642e = i11;
        this.f15643f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15644x.f15646b.onActivityLayout(this.f15638a, this.f15639b, this.f15640c, this.f15641d, this.f15642e, this.f15643f);
    }
}
