package p098n4;

import p083l4.a;

/* JADX INFO: renamed from: n4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0931d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f15404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15405c;

    public /* synthetic */ RunnableC0931d(a aVar, String str, int i7) {
        this.f15403a = i7;
        this.f15404b = aVar;
        this.f15405c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15403a) {
            case 0:
                this.f15404b.Q(this.f15405c);
                break;
            default:
                this.f15404b.W(this.f15405c);
                break;
        }
    }
}
