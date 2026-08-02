package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.c f45549a = new a.c(0);

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.b f45550b = new a.b();

    public static abstract class a {

        /* renamed from: androidx.work.r$a$a, reason: collision with other inner class name */
        public static final class C0824a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f45551a;

            public C0824a(@NonNull Throwable th2) {
                this.f45551a = th2;
            }

            @NonNull
            public final Throwable a() {
                return this.f45551a;
            }

            @NonNull
            public final String toString() {
                return "FAILURE (" + this.f45551a.getMessage() + ")";
            }
        }

        public static final class b extends a {
            @NonNull
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends a {
            /* synthetic */ c(int i11) {
                this();
            }

            @NonNull
            public final String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        a() {
        }
    }
}
