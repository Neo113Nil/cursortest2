package androidx.activity;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.media3.common.util.ListenerSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0((ComponentActivity$activityResultRegistry$1) this.c, this.b, (ActivityResultContract.SynchronousResult) this.d);
                break;
            default:
                ListenerSet.lambda$queueEvent$0((CopyOnWriteArraySet) this.c, this.b, (ListenerSet.Event) this.d);
                break;
        }
    }
}
