package v2;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public Message f17146a;

    public final void a() {
        this.f17146a = null;
        ArrayList arrayList = r.f17147b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f17146a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
