package j1;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f6050a;

    public a(String str, Object... objArr) {
        byte[] bArr = d.f6053a;
        this.f6050a = String.format(Locale.US, str, objArr);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f6050a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
