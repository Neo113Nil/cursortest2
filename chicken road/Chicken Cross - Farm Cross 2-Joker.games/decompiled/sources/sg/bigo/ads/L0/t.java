package sg.bigo.ads.L0;

import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes3.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewFlow f12415a;

    public t(ViewFlow viewFlow) {
        this.f12415a = viewFlow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewFlow.a(this.f12415a);
    }
}
