package v2;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f17147b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f17148a;

    public r(Handler handler) {
        this.f17148a = handler;
    }

    public static q b() {
        q qVar;
        ArrayList arrayList = f17147b;
        synchronized (arrayList) {
            try {
                qVar = arrayList.isEmpty() ? new q() : (q) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public final q a(int i7, Object obj) {
        q b7 = b();
        b7.f17146a = this.f17148a.obtainMessage(i7, obj);
        return b7;
    }

    public final boolean c(int i7) {
        return this.f17148a.sendEmptyMessage(i7);
    }
}
