package m4;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1438b extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15269a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15270b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f15271c;

    /* renamed from: e, reason: collision with root package name */
    public int f15273e = this.f15271c;

    /* renamed from: d, reason: collision with root package name */
    public int f15272d;

    /* renamed from: f, reason: collision with root package name */
    public int f15274f = this.f15272d;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15275x = false;

    public C1438b() {
        this.f15269a = null;
        this.f15269a = new ArrayList();
    }

    public final long a(long j) {
        long j3 = 0;
        while (this.f15272d < this.f15269a.size() && j3 < j) {
            String c3 = c();
            long j7 = j - j3;
            long length = c3 == null ? 0 : c3.length() - this.f15271c;
            if (j7 < length) {
                this.f15271c = (int) (this.f15271c + j7);
                j3 += j7;
            } else {
                j3 += length;
                this.f15271c = 0;
                this.f15272d++;
            }
        }
        return j3;
    }

    public final void b() {
        if (this.f15270b) {
            throw new IOException("Stream already closed");
        }
        if (!this.f15275x) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    public final String c() {
        int i7 = this.f15272d;
        ArrayList arrayList = this.f15269a;
        if (i7 < arrayList.size()) {
            return (String) arrayList.get(this.f15272d);
        }
        return null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
        this.f15270b = true;
    }

    @Override // java.io.Reader
    public final void mark(int i7) {
        b();
        this.f15273e = this.f15271c;
        this.f15274f = this.f15272d;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) {
        b();
        int remaining = charBuffer.remaining();
        String c3 = c();
        int i7 = 0;
        while (remaining > 0 && c3 != null) {
            int min = Math.min(c3.length() - this.f15271c, remaining);
            String str = (String) this.f15269a.get(this.f15272d);
            int i8 = this.f15271c;
            charBuffer.put(str, i8, i8 + min);
            remaining -= min;
            i7 += min;
            a(min);
            c3 = c();
        }
        if (i7 > 0 || c3 != null) {
            return i7;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        b();
        return true;
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f15271c = this.f15273e;
        this.f15272d = this.f15274f;
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        b();
        return a(j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f15269a.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    @Override // java.io.Reader
    public final int read() {
        b();
        String c3 = c();
        if (c3 == null) {
            return -1;
        }
        char charAt = c3.charAt(this.f15271c);
        a(1L);
        return charAt;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i7, int i8) {
        b();
        String c3 = c();
        int i9 = 0;
        while (c3 != null && i9 < i8) {
            String c4 = c();
            int min = Math.min(c4 == null ? 0 : c4.length() - this.f15271c, i8 - i9);
            int i10 = this.f15271c;
            c3.getChars(i10, i10 + min, cArr, i7 + i9);
            i9 += min;
            a(min);
            c3 = c();
        }
        if (i9 > 0 || c3 != null) {
            return i9;
        }
        return -1;
    }
}
