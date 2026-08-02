package T5;

import C.o0;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final b<Object> f26664e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final T f26665a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f26666b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26667c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f26668d;

    final class a implements b<Object> {
        @Override // T5.h.b
        public final void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t2, @NonNull MessageDigest messageDigest);
    }

    private h(@NonNull String str, T t2, @NonNull b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f26667c = str;
        this.f26665a = t2;
        this.f26666b = bVar;
    }

    @NonNull
    public static h a(@NonNull String str, Number number, @NonNull b bVar) {
        return new h(str, number, bVar);
    }

    @NonNull
    public static h c(@NonNull Object obj, @NonNull String str) {
        return new h(str, obj, f26664e);
    }

    @NonNull
    public static <T> h<T> d(@NonNull String str) {
        return new h<>(str, null, f26664e);
    }

    public final T b() {
        return this.f26665a;
    }

    public final void e(@NonNull T t2, @NonNull MessageDigest messageDigest) {
        b<T> bVar = this.f26666b;
        if (this.f26668d == null) {
            this.f26668d = this.f26667c.getBytes(f.f26662a);
        }
        bVar.a(this.f26668d, t2, messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f26667c.equals(((h) obj).f26667c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26667c.hashCode();
    }

    public final String toString() {
        return o0.c(new StringBuilder("Option{key='"), this.f26667c, "'}");
    }
}
