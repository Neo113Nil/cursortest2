package O0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f1060c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f1061d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1062a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f1063b;

    public a(Context context) {
        this.f1063b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f1062a;
        reentrantLock.lock();
        try {
            return this.f1063b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
