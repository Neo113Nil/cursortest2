package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p049g5.e f8045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p049g5.e eVar, Looper looper) {
        super(looper);
        this.f8045b = eVar;
        this.f8044a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f8044a) {
            int i7 = message.what;
            p049g5.e eVar = this.f8045b;
            switch (i7) {
                case 1:
                    t.Z(message.getData());
                    eVar.getClass();
                    break;
                case 2:
                    eVar.getClass();
                    break;
                case 3:
                    eVar.getClass();
                    break;
                case 4:
                    eVar.getClass();
                    break;
                case 5:
                    eVar.getClass();
                    break;
                case 6:
                    eVar.getClass();
                    break;
                case 7:
                    t.Z((Bundle) message.obj);
                    eVar.getClass();
                    break;
                case 8:
                    eVar.getClass();
                    break;
                case 9:
                    ((Integer) message.obj).getClass();
                    eVar.getClass();
                    break;
                case 11:
                    ((Boolean) message.obj).getClass();
                    eVar.getClass();
                    break;
                case 12:
                    ((Integer) message.obj).getClass();
                    eVar.getClass();
                    break;
                case 13:
                    eVar.getClass();
                    break;
            }
        }
    }
}
