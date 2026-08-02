package i3;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f17341c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static C2014a f17342d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f17343a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f17344b;

    public C2014a(Context context) {
        this.f17344b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f17343a;
        reentrantLock.lock();
        try {
            return this.f17344b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
