package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    @Override // android.support.v4.media.session.o
    public final p117q0.t c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f8060a.getCurrentControllerInfo();
        p117q0.t tVar = new p117q0.t();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        tVar.f15790a = new p117q0.u(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return tVar;
    }

    @Override // android.support.v4.media.session.o
    public final void f(p117q0.t tVar) {
    }
}
