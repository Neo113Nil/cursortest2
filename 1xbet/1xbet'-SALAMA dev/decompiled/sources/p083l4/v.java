package p083l4;

import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.w;
import p158w4.c;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f15019b;

    public /* synthetic */ v(y yVar, int i7) {
        this.f15018a = i7;
        this.f15019b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15018a) {
            case 0:
                y yVar = this.f15019b;
                if (!yVar.f15027b && !yVar.f15028c) {
                    t tVar = yVar.j;
                    if (tVar.r0()) {
                        tVar.W(null, "timed out on connect", new Object[0]);
                    }
                    ((c) yVar.f15026a.f11335b).a();
                    break;
                }
                break;
            default:
                y yVar2 = this.f15019b;
                w wVar = yVar2.f15026a;
                if (wVar != null) {
                    wVar.K("0");
                    yVar2.e();
                }
                break;
        }
    }
}
