package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 {

    /* JADX INFO: renamed from: c */
    public static final ReentrantLock f5680c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static oa1 f5681d;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f5682a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f5683b;

    public oa1(Context context) {
        this.f5683b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: a */
    public final String m3653a(String str) {
        ReentrantLock reentrantLock = this.f5682a;
        reentrantLock.lock();
        try {
            return this.f5683b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
