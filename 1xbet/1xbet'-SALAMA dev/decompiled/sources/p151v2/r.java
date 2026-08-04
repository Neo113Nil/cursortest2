package p151v2;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f17153b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f17154a;

    public r(Handler handler) {
        this.f17154a = handler;
    }

    public static q b() {
        q qVar;
        ArrayList arrayList = f17153b;
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
        q qVarB = b();
        qVarB.f17152a = this.f17154a.obtainMessage(i7, obj);
        return qVarB;
    }

    public final boolean c(int i7) {
        return this.f17154a.sendEmptyMessage(i7);
    }
}
