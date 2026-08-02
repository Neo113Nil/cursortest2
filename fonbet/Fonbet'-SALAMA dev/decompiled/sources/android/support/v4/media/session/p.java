package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class p extends o {
    @Override // android.support.v4.media.session.o
    public final q0.t c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo;
        String packageName;
        String packageName2;
        int pid;
        int uid;
        currentControllerInfo = this.f8060a.getCurrentControllerInfo();
        q0.t tVar = new q0.t();
        packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        packageName2 = currentControllerInfo.getPackageName();
        pid = currentControllerInfo.getPid();
        uid = currentControllerInfo.getUid();
        tVar.f15784a = new q0.u(packageName2, pid, uid);
        return tVar;
    }

    @Override // android.support.v4.media.session.o
    public final void f(q0.t tVar) {
    }
}
