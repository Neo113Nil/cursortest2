package g5;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

/* renamed from: g5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1150e implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.e f13246a = new android.support.v4.media.session.e(this);

    /* renamed from: b, reason: collision with root package name */
    public android.support.v4.media.session.f f13247b;

    /* renamed from: c, reason: collision with root package name */
    public android.support.v4.media.session.g f13248c;

    public final void a(int i7, Object obj, Bundle bundle) {
        android.support.v4.media.session.f fVar = this.f13247b;
        if (fVar != null) {
            Message obtainMessage = fVar.obtainMessage(i7, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void b(Handler handler) {
        if (handler != null) {
            android.support.v4.media.session.f fVar = new android.support.v4.media.session.f(this, handler.getLooper());
            this.f13247b = fVar;
            fVar.f8044a = true;
        } else {
            android.support.v4.media.session.f fVar2 = this.f13247b;
            if (fVar2 != null) {
                fVar2.f8044a = false;
                fVar2.removeCallbacksAndMessages(null);
                this.f13247b = null;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a(8, null, null);
    }
}
