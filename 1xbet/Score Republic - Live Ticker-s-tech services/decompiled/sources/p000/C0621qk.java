package p000;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: qk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0621qk extends t22 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6513j;

    /* JADX INFO: renamed from: k */
    public final Object f6514k;

    public /* synthetic */ C0621qk(int i, Object obj) {
        this.f6513j = i;
        this.f6514k = obj;
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: d */
    public final void mo4105d(String str) {
        int i = this.f6513j;
        Object obj = this.f6514k;
        switch (i) {
            case 0:
                ((PrintStream) obj).println((Object) str);
                break;
            default:
                ((PrintWriter) obj).println((Object) str);
                break;
        }
    }
}
