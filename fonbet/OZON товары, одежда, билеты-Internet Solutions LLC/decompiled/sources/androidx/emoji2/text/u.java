package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final X2.b f42747a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final char[] f42748b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final a f42749c = new a(UserVerificationMethods.USER_VERIFY_ALL);

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final Typeface f42750d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f42751a;

        /* renamed from: b, reason: collision with root package name */
        private w f42752b;

        private a() {
            this(1);
        }

        final a a(int i11) {
            SparseArray<a> sparseArray = this.f42751a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i11);
        }

        final w b() {
            return this.f42752b;
        }

        final void c(@NonNull w wVar, int i11, int i12) {
            a a11 = a(wVar.b(i11));
            if (a11 == null) {
                a11 = new a();
                this.f42751a.put(wVar.b(i11), a11);
            }
            if (i12 > i11) {
                a11.c(wVar, i11 + 1, i12);
            } else {
                a11.f42752b = wVar;
            }
        }

        a(int i11) {
            this.f42751a = new SparseArray<>(i11);
        }
    }

    private u(@NonNull Typeface typeface, @NonNull X2.b bVar) {
        this.f42750d = typeface;
        this.f42747a = bVar;
        this.f42748b = new char[bVar.e() * 2];
        int e11 = bVar.e();
        for (int i11 = 0; i11 < e11; i11++) {
            w wVar = new w(this, i11);
            Character.toChars(wVar.f(), this.f42748b, i11 * 2);
            x2.i.a("invalid metadata codepoint length", wVar.c() > 0);
            this.f42749c.c(wVar, 0, wVar.c() - 1);
        }
    }

    @NonNull
    public static u a(@NonNull Typeface typeface, @NonNull MappedByteBuffer mappedByteBuffer) throws IOException {
        long j11;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        s sVar = new s(duplicate);
        sVar.e(4);
        int d11 = sVar.d();
        if (d11 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        sVar.e(6);
        int i11 = 0;
        while (true) {
            if (i11 >= d11) {
                j11 = -1;
                break;
            }
            int b11 = sVar.b();
            sVar.e(4);
            j11 = sVar.c();
            sVar.e(4);
            if (1835365473 == b11) {
                break;
            }
            i11++;
        }
        if (j11 != -1) {
            sVar.e((int) (j11 - sVar.a()));
            sVar.e(12);
            long c11 = sVar.c();
            for (int i12 = 0; i12 < c11; i12++) {
                int b12 = sVar.b();
                long c12 = sVar.c();
                sVar.c();
                if (1164798569 == b12 || 1701669481 == b12) {
                    duplicate.position((int) new t(c12 + j11).a());
                    return new u(typeface, X2.b.c(duplicate));
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    @NonNull
    public final char[] b() {
        return this.f42748b;
    }

    @NonNull
    public final X2.b c() {
        return this.f42747a;
    }

    final int d() {
        return this.f42747a.f();
    }

    @NonNull
    final a e() {
        return this.f42749c;
    }

    @NonNull
    final Typeface f() {
        return this.f42750d;
    }
}
