package sg.bigo.ads.L0;

import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes3.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewFlow f12414a;

    public s(ViewFlow viewFlow) {
        this.f12414a = viewFlow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewFlow.a(this.f12414a);
    }
}
