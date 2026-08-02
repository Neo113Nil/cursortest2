package Z;

import Z.s;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Integer> f35214a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* renamed from: Z.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0654a {
        abstract a a();

        @NonNull
        public final a b() {
            a a11 = a();
            String str = a11.c() == -1 ? " audioSource" : "";
            if (a11.f() <= 0) {
                str = str.concat(" sampleRate");
            }
            if (a11.e() <= 0) {
                str = U7.d.e(str, " channelCount");
            }
            if (a11.b() == -1) {
                str = U7.d.e(str, " audioFormat");
            }
            if (str.isEmpty()) {
                return a11;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(str));
        }

        @NonNull
        public abstract AbstractC0654a c(int i11);

        @NonNull
        public abstract AbstractC0654a d(int i11);

        @NonNull
        public abstract AbstractC0654a e(int i11);

        @NonNull
        public abstract AbstractC0654a f(int i11);
    }

    a() {
    }

    @NonNull
    @SuppressLint({"Range"})
    public static AbstractC0654a a() {
        s.a aVar = new s.a();
        aVar.d(-1);
        aVar.f(-1);
        aVar.e(-1);
        aVar.c(-1);
        return aVar;
    }

    public abstract int b();

    public abstract int c();

    public final int d() {
        int b11 = b();
        int e11 = e();
        x2.i.a("Invalid channel count: " + e11, e11 > 0);
        if (b11 == 2) {
            return e11 * 2;
        }
        if (b11 == 3) {
            return e11;
        }
        if (b11 != 4) {
            if (b11 == 21) {
                return e11 * 3;
            }
            if (b11 != 22) {
                throw new IllegalArgumentException(Ej.b.a(b11, "Invalid audio encoding: "));
            }
        }
        return e11 * 4;
    }

    public abstract int e();

    public abstract int f();
}
