package com.google.firebase.storage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f12071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f12072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E2.l f12073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IOException f12074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12076f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12077x;

    public final void a() throws C0846a {
        w wVar = this.f12071a;
        if (wVar != null && wVar.f12066h == 32) {
            throw new C0846a("The operation was canceled.");
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        while (b()) {
            try {
                return this.f12072b.available();
            } catch (IOException e7) {
                this.f12074d = e7;
            }
        }
        throw this.f12074d;
    }

    public final boolean b() throws IOException {
        a();
        if (this.f12074d != null) {
            try {
                InputStream inputStream = this.f12072b;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException unused) {
            }
            this.f12072b = null;
            if (this.f12076f == this.f12075e) {
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f12074d);
                return false;
            }
            Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f12075e, this.f12074d);
            this.f12076f = this.f12075e;
            this.f12074d = null;
        }
        if (this.f12077x) {
            throw new IOException("Can't perform operation on closed stream");
        }
        if (this.f12072b != null) {
            return true;
        }
        try {
            this.f12072b = (InputStream) this.f12073c.call();
            return true;
        } catch (Exception e7) {
            if (e7 instanceof IOException) {
                throw ((IOException) e7);
            }
            throw new IOException("Unable to open stream", e7);
        }
    }

    public final void c(long j) {
        w wVar = this.f12071a;
        if (wVar != null) {
            long j3 = wVar.f12083q + j;
            wVar.f12083q = j3;
            if (wVar.f12084r + 262144 <= j3) {
                if (wVar.f12066h == 4) {
                    wVar.o(4, false);
                } else {
                    wVar.f12084r = wVar.f12083q;
                }
            }
        }
        this.f12075e += j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        T4.a aVar;
        InputStream inputStream = this.f12072b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f12077x = true;
        w wVar = this.f12071a;
        if (wVar != null && (aVar = wVar.f12086t) != null) {
            aVar.o();
            wVar.f12086t = null;
        }
        a();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (b()) {
            try {
                int i7 = this.f12072b.read();
                if (i7 != -1) {
                    c(1L);
                }
                return i7;
            } catch (IOException e7) {
                this.f12074d = e7;
            }
        }
        throw this.f12074d;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j3 = 0;
        while (b()) {
            while (j > 262144) {
                try {
                    long jSkip = this.f12072b.skip(262144L);
                    if (jSkip < 0) {
                        if (j3 == 0) {
                            return -1L;
                        }
                        return j3;
                    }
                    j3 += jSkip;
                    j -= jSkip;
                    c(jSkip);
                    a();
                } catch (IOException e7) {
                    this.f12074d = e7;
                }
            }
            if (j > 0) {
                long jSkip2 = this.f12072b.skip(j);
                if (jSkip2 < 0) {
                    if (j3 == 0) {
                        return -1L;
                    }
                    return j3;
                }
                j3 += jSkip2;
                j -= jSkip2;
                c(jSkip2);
            }
            if (j == 0) {
                return j3;
            }
        }
        throw this.f12074d;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = 0;
        while (b()) {
            while (i8 > 262144) {
                try {
                    int i10 = this.f12072b.read(bArr, i7, 262144);
                    if (i10 == -1) {
                        if (i9 == 0) {
                            return -1;
                        }
                        return i9;
                    }
                    i9 += i10;
                    i7 += i10;
                    i8 -= i10;
                    c(i10);
                    a();
                } catch (IOException e7) {
                    this.f12074d = e7;
                }
            }
            if (i8 > 0) {
                int i11 = this.f12072b.read(bArr, i7, i8);
                if (i11 == -1) {
                    if (i9 == 0) {
                        return -1;
                    }
                    return i9;
                }
                i7 += i11;
                i9 += i11;
                i8 -= i11;
                c(i11);
            }
            if (i8 == 0) {
                return i9;
            }
        }
        throw this.f12074d;
    }
}
