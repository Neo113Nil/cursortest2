package n4;

import l4.InterfaceC1390a;

/* renamed from: n4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1470d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1390a f15398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15399c;

    public /* synthetic */ RunnableC1470d(InterfaceC1390a interfaceC1390a, String str, int i7) {
        this.f15397a = i7;
        this.f15398b = interfaceC1390a;
        this.f15399c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15397a) {
            case 0:
                this.f15398b.Q(this.f15399c);
                break;
            default:
                this.f15398b.W(this.f15399c);
                break;
        }
    }
}
