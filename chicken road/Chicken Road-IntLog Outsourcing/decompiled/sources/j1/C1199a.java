package j1;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f10463c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static C1199a f10464d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f10465a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f10466b;

    public C1199a(Context context) {
        this.f10466b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f10465a;
        reentrantLock.lock();
        try {
            return this.f10466b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
