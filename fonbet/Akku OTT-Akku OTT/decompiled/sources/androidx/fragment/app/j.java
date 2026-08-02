package androidx.fragment.app;

import androidx.media3.common.C0333r;
import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((Fragment) this.b).lambda$performCreateView$0();
                break;
            case 1:
                ((DelayMetCommandHandler) this.b).stopWork();
                break;
            default:
                com.google.android.datatransport.runtime.scheduling.jobscheduling.o oVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.o) this.b;
                oVar.d.l(new C0333r(oVar, 1));
                break;
        }
    }
}
