package L4;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class t implements I, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final C f3115k;

    /* renamed from: l, reason: collision with root package name */
    public final Inflater f3116l;

    /* renamed from: m, reason: collision with root package name */
    public int f3117m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3118n;

    public t(C c5, Inflater inflater) {
        this.f3115k = c5;
        this.f3116l = inflater;
    }

    @Override // L4.I
    public final K c() {
        return this.f3115k.f3050k.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3118n) {
            return;
        }
        this.f3116l.end();
        this.f3118n = true;
        this.f3115k.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    @Override // L4.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(C0226i c0226i, long j5) {
        long j6;
        kotlin.jvm.internal.l.f("sink", c0226i);
        while (j5 >= 0) {
            if (this.f3118n) {
                throw new IllegalStateException("closed");
            }
            C c5 = this.f3115k;
            Inflater inflater = this.f3116l;
            if (j5 != 0) {
                try {
                    D L5 = c0226i.L(1);
                    int min = (int) Math.min(j5, 8192 - L5.f3055c);
                    if (inflater.needsInput() && !c5.b()) {
                        D d5 = c5.f3051l.f3090k;
                        kotlin.jvm.internal.l.c(d5);
                        int i = d5.f3055c;
                        int i5 = d5.f3054b;
                        int i6 = i - i5;
                        this.f3117m = i6;
                        inflater.setInput(d5.f3053a, i5, i6);
                    }
                    int inflate = inflater.inflate(L5.f3053a, L5.f3055c, min);
                    int i7 = this.f3117m;
                    if (i7 != 0) {
                        int remaining = i7 - inflater.getRemaining();
                        this.f3117m -= remaining;
                        c5.t(remaining);
                    }
                    if (inflate > 0) {
                        L5.f3055c += inflate;
                        j6 = inflate;
                        c0226i.f3091l += j6;
                        if (j6 <= 0) {
                            return j6;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                        if (c5.b()) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else if (L5.f3054b == L5.f3055c) {
                        c0226i.f3090k = L5.a();
                        E.a(L5);
                    }
                } catch (DataFormatException e3) {
                    throw new IOException(e3);
                }
            }
            j6 = 0;
            if (j6 <= 0) {
            }
        }
        throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
    }
}
