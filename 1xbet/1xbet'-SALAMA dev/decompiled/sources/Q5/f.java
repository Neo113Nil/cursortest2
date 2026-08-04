package Q5;

import Q3.o;
import android.util.Log;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements p159w5.c, p164x5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1050x1 f5851a;

    @Override // p164x5.a
    public final void onAttachedToActivity(p164x5.b bVar) {
        C1050x1 c1050x1 = this.f5851a;
        if (c1050x1 == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c1050x1.f17933d = (p121q5.c) ((o) bVar).f5822a;
        }
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        C1050x1 c1050x1 = new C1050x1(bVar.f18081a);
        this.f5851a = c1050x1;
        C1050x1.f0(bVar.f18083c, c1050x1);
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        C1050x1 c1050x1 = this.f5851a;
        if (c1050x1 == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c1050x1.f17933d = null;
        }
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        if (this.f5851a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            C1050x1.f0(bVar.f18083c, null);
            this.f5851a = null;
        }
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(p164x5.b bVar) {
        onAttachedToActivity(bVar);
    }
}
