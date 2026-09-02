package l0;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926a {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f8013c = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static l0.C0926a f8014d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f8015a = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f8016b;

    public C0926a(android.content.Context context) {
        this.f8016b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final java.lang.String a(java.lang.String str) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f8015a;
        reentrantLock.lock();
        try {
            return this.f8016b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
