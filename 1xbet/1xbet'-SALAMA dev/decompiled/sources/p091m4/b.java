package p091m4;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15276b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15277c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15279e = this.f15277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15278d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15280f = this.f15278d;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15281x = false;

    public b() {
        this.f15275a = null;
        this.f15275a = new ArrayList();
    }

    public final long a(long j) {
        long j3 = 0;
        while (this.f15278d < this.f15275a.size() && j3 < j) {
            String strC = c();
            long j7 = j - j3;
            long length = strC == null ? 0 : strC.length() - this.f15277c;
            if (j7 < length) {
                this.f15277c = (int) (((long) this.f15277c) + j7);
                j3 += j7;
            } else {
                j3 += length;
                this.f15277c = 0;
                this.f15278d++;
            }
        }
        return j3;
    }

    public final void b() throws IOException {
        if (this.f15276b) {
            throw new IOException("Stream already closed");
        }
        if (!this.f15281x) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    public final String c() {
        int i7 = this.f15278d;
        ArrayList arrayList = this.f15275a;
        if (i7 < arrayList.size()) {
            return (String) arrayList.get(this.f15278d);
        }
        return null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        b();
        this.f15276b = true;
    }

    @Override // java.io.Reader
    public final void mark(int i7) throws IOException {
        b();
        this.f15279e = this.f15277c;
        this.f15280f = this.f15278d;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) throws IOException {
        b();
        int iRemaining = charBuffer.remaining();
        String strC = c();
        int i7 = 0;
        while (iRemaining > 0 && strC != null) {
            int iMin = Math.min(strC.length() - this.f15277c, iRemaining);
            String str = (String) this.f15275a.get(this.f15278d);
            int i8 = this.f15277c;
            charBuffer.put(str, i8, i8 + iMin);
            iRemaining -= iMin;
            i7 += iMin;
            a(iMin);
            strC = c();
        }
        if (i7 > 0 || strC != null) {
            return i7;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        b();
        return true;
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f15277c = this.f15279e;
        this.f15278d = this.f15280f;
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        b();
        return a(j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f15275a.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        b();
        String strC = c();
        if (strC == null) {
            return -1;
        }
        char cCharAt = strC.charAt(this.f15277c);
        a(1L);
        return cCharAt;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i7, int i8) throws IOException {
        b();
        String strC = c();
        int i9 = 0;
        while (strC != null && i9 < i8) {
            String strC2 = c();
            int iMin = Math.min(strC2 == null ? 0 : strC2.length() - this.f15277c, i8 - i9);
            int i10 = this.f15277c;
            strC.getChars(i10, i10 + iMin, cArr, i7 + i9);
            i9 += iMin;
            a(iMin);
            strC = c();
        }
        if (i9 > 0 || strC != null) {
            return i9;
        }
        return -1;
    }
}
