package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import g5.C1150e;

/* loaded from: classes.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1150e f8045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1150e c1150e, Looper looper) {
        super(looper);
        this.f8045b = c1150e;
        this.f8044a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f8044a) {
            int i7 = message.what;
            C1150e c1150e = this.f8045b;
            switch (i7) {
                case 1:
                    t.Z(message.getData());
                    c1150e.getClass();
                    break;
                case 2:
                    c1150e.getClass();
                    break;
                case 3:
                    c1150e.getClass();
                    break;
                case 4:
                    c1150e.getClass();
                    break;
                case 5:
                    c1150e.getClass();
                    break;
                case 6:
                    c1150e.getClass();
                    break;
                case 7:
                    t.Z((Bundle) message.obj);
                    c1150e.getClass();
                    break;
                case 8:
                    c1150e.getClass();
                    break;
                case 9:
                    ((Integer) message.obj).getClass();
                    c1150e.getClass();
                    break;
                case 11:
                    ((Boolean) message.obj).getClass();
                    c1150e.getClass();
                    break;
                case 12:
                    ((Integer) message.obj).getClass();
                    c1150e.getClass();
                    break;
                case 13:
                    c1150e.getClass();
                    break;
            }
        }
    }
}
