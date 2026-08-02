package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0994fq implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13506k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BinderC1084hq f13507l;

    public /* synthetic */ RunnableC0994fq(BinderC1084hq binderC1084hq, int i) {
        this.f13506k = i;
        this.f13507l = binderC1084hq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13506k) {
            case 0:
                this.f13507l.u3(5);
                break;
            default:
                BinderC1084hq binderC1084hq = this.f13507l;
                binderC1084hq.f13799k.a().execute(new RunnableC0994fq(binderC1084hq, 0));
                break;
        }
    }
}
