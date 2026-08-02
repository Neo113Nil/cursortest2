package androidx.lifecycle;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.appevents.C0691c;
import com.facebook.w;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ComputableLiveData.invalidationRunnable$lambda$1((ComputableLiveData) this.b);
                return;
            default:
                String str = (String) this.b;
                ReentrantReadWriteLock reentrantReadWriteLock = C0691c.b;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    C0691c.c = str;
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(w.a()).edit();
                    edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", C0691c.c);
                    edit.apply();
                    return;
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
        }
    }
}
