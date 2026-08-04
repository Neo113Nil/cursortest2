package p049g5;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.session.f;
import android.support.v4.media.session.g;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.e f13252a = new android.support.v4.media.session.e(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f13253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f13254c;

    public final void a(int i7, Object obj, Bundle bundle) {
        f fVar = this.f13253b;
        if (fVar != null) {
            Message messageObtainMessage = fVar.obtainMessage(i7, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    public final void b(Handler handler) {
        if (handler != null) {
            f fVar = new f(this, handler.getLooper());
            this.f13253b = fVar;
            fVar.f8044a = true;
        } else {
            f fVar2 = this.f13253b;
            if (fVar2 != null) {
                fVar2.f8044a = false;
                fVar2.removeCallbacksAndMessages(null);
                this.f13253b = null;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a(8, null, null);
    }
}
