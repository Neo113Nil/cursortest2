package p;

import android.os.Bundle;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1518e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15634c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f15637f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BinderC1519f f15638x;

    public RunnableC1518e(BinderC1519f binderC1519f, int i7, int i8, int i9, int i10, int i11, Bundle bundle) {
        this.f15638x = binderC1519f;
        this.f15632a = i7;
        this.f15633b = i8;
        this.f15634c = i9;
        this.f15635d = i10;
        this.f15636e = i11;
        this.f15637f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15638x.f15640b.onActivityLayout(this.f15632a, this.f15633b, this.f15634c, this.f15635d, this.f15636e, this.f15637f);
    }
}
