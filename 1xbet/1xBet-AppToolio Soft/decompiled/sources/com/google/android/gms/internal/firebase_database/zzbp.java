package com.google.android.gms.internal.firebase_database;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbp extends Reader {
    private List<String> zzgn;
    private boolean closed = false;
    private int zzgo;
    private int zzgq = this.zzgo;
    private int zzgp;
    private int zzgr = this.zzgp;
    private boolean zzgs = false;

    public zzbp() {
        this.zzgn = null;
        this.zzgn = new ArrayList();
    }

    private final String zzbb() {
        if (this.zzgp < this.zzgn.size()) {
            return this.zzgn.get(this.zzgp);
        }
        return null;
    }

    private final int zzbc() {
        String zzbb = zzbb();
        if (zzbb == null) {
            return 0;
        }
        return zzbb.length() - this.zzgo;
    }

    private final void zzbd() throws IOException {
        if (this.closed) {
            throw new IOException("Stream already closed");
        }
        if (!this.zzgs) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    private final long zzj(long j) {
        long j2 = 0;
        while (this.zzgp < this.zzgn.size() && j2 < j) {
            long j3 = j - j2;
            long zzbc = zzbc();
            if (j3 < zzbc) {
                this.zzgo = (int) (this.zzgo + j3);
                j2 += j3;
            } else {
                j2 += zzbc;
                this.zzgo = 0;
                this.zzgp++;
            }
        }
        return j2;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zzbd();
        this.closed = true;
    }

    @Override // java.io.Reader
    public final void mark(int i) throws IOException {
        zzbd();
        this.zzgq = this.zzgo;
        this.zzgr = this.zzgp;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        zzbd();
        String zzbb = zzbb();
        if (zzbb == null) {
            return -1;
        }
        char charAt = zzbb.charAt(this.zzgo);
        zzj(1L);
        return charAt;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) throws IOException {
        zzbd();
        int remaining = charBuffer.remaining();
        String zzbb = zzbb();
        int i = 0;
        while (remaining > 0 && zzbb != null) {
            int min = Math.min(zzbb.length() - this.zzgo, remaining);
            String str = this.zzgn.get(this.zzgp);
            int i2 = this.zzgo;
            charBuffer.put(str, i2, i2 + min);
            remaining -= min;
            i += min;
            zzj(min);
            zzbb = zzbb();
        }
        if (i > 0 || zzbb != null) {
            return i;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        zzbd();
        String zzbb = zzbb();
        int i3 = 0;
        while (zzbb != null && i3 < i2) {
            int min = Math.min(zzbc(), i2 - i3);
            int i4 = this.zzgo;
            zzbb.getChars(i4, i4 + min, cArr, i + i3);
            i3 += min;
            zzj(min);
            zzbb = zzbb();
        }
        if (i3 > 0 || zzbb != null) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        zzbd();
        return true;
    }

    @Override // java.io.Reader
    public final void reset() throws IOException {
        this.zzgo = this.zzgq;
        this.zzgp = this.zzgr;
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        zzbd();
        return zzj(j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.zzgn.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public final void zzba() {
        if (this.zzgs) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.zzgs = true;
    }

    public final void zzn(String str) {
        if (this.zzgs) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            this.zzgn.add(str);
        }
    }
}
