package androidx.media3.session;

import android.os.ResultReceiver;
import androidx.media3.session.MediaControllerImplLegacy;

/* loaded from: classes3.dex */
public final /* synthetic */ class X1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ X1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaControllerImplLegacy) this.b).lambda$updateControllerInfo$7((MediaControllerImplLegacy.ControllerInfo) this.c);
                break;
            default:
                MediaSessionLegacyStub.lambda$sendCustomCommandResultWhenReady$27((com.google.common.util.concurrent.u) this.b, (ResultReceiver) this.c);
                break;
        }
    }
}
