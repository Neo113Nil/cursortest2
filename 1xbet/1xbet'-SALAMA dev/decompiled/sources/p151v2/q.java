package p151v2;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f17152a;

    public final void a() {
        this.f17152a = null;
        ArrayList arrayList = r.f17153b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f17152a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
