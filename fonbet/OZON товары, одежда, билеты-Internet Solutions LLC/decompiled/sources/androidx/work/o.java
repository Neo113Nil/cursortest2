package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f45546a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f45547b;

    public static class a extends o {

        /* renamed from: c, reason: collision with root package name */
        private final int f45548c;

        public a(int i11) {
            this.f45548c = i11;
        }

        @Override // androidx.work.o
        public final void a(@NonNull String str, @NonNull String str2) {
            if (this.f45548c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.o
        public final void b(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
            if (this.f45548c <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // androidx.work.o
        public final void c(@NonNull String str, @NonNull String str2) {
            if (this.f45548c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.o
        public final void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
            if (this.f45548c <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // androidx.work.o
        public final void f(@NonNull String str, @NonNull String str2) {
            if (this.f45548c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.o
        public final void g(@NonNull String str, @NonNull String str2, @NonNull CancellationException cancellationException) {
            if (this.f45548c <= 4) {
                Log.i(str, str2, cancellationException);
            }
        }

        @Override // androidx.work.o
        public final void j(@NonNull String str) {
            if (this.f45548c <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
        }

        @Override // androidx.work.o
        public final void k(@NonNull String str, @NonNull String str2) {
            if (this.f45548c <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.o
        public final void l(@NonNull String str, @NonNull String str2, @NonNull RuntimeException runtimeException) {
            if (this.f45548c <= 5) {
                Log.w(str, str2, runtimeException);
            }
        }
    }

    @NonNull
    public static o e() {
        a aVar;
        synchronized (f45546a) {
            try {
                if (f45547b == null) {
                    f45547b = new a(3);
                }
                aVar = f45547b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static void h(@NonNull a aVar) {
        synchronized (f45546a) {
            f45547b = aVar;
        }
    }

    @NonNull
    public static String i(@NonNull String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(@NonNull String str, @NonNull String str2);

    public abstract void b(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void c(@NonNull String str, @NonNull String str2);

    public abstract void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void f(@NonNull String str, @NonNull String str2);

    public abstract void g(@NonNull String str, @NonNull String str2, @NonNull CancellationException cancellationException);

    public abstract void j(@NonNull String str);

    public abstract void k(@NonNull String str, @NonNull String str2);

    public abstract void l(@NonNull String str, @NonNull String str2, @NonNull RuntimeException runtimeException);
}
