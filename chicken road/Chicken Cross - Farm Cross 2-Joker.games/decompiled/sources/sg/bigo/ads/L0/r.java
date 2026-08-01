package sg.bigo.ads.L0;

import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewFlow f12413a;

    public r(ViewFlow viewFlow) {
        this.f12413a = viewFlow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12413a.setScrollState(0);
    }
}
