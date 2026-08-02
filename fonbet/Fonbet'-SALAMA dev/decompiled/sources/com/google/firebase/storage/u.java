package com.google.firebase.storage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class u extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public w f12071a;

    /* renamed from: b, reason: collision with root package name */
    public InputStream f12072b;

    /* renamed from: c, reason: collision with root package name */
    public E2.l f12073c;

    /* renamed from: d, reason: collision with root package name */
    public IOException f12074d;

    /* renamed from: e, reason: collision with root package name */
    public long f12075e;

    /* renamed from: f, reason: collision with root package name */
    public long f12076f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12077x;

    public final void a() {
        w wVar = this.f12071a;
        if (wVar != null && wVar.f12066h == 32) {
            throw new C0890a("The operation was canceled.");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        while (b()) {
            try {
                return this.f12072b.available();
            } catch (IOException e7) {
                this.f12074d = e7;
            }
        }
        throw this.f12074d;
    }

    public final boolean b() {
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
    public final void close() {
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
    public final int read() {
        while (b()) {
            try {
                int read = this.f12072b.read();
                if (read != -1) {
                    c(1L);
                }
                return read;
            } catch (IOException e7) {
                this.f12074d = e7;
            }
        }
        throw this.f12074d;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j3 = 0;
        while (b()) {
            while (j > 262144) {
                try {
                    long skip = this.f12072b.skip(262144L);
                    if (skip < 0) {
                        if (j3 == 0) {
                            return -1L;
                        }
                        return j3;
                    }
                    j3 += skip;
                    j -= skip;
                    c(skip);
                    a();
                } catch (IOException e7) {
                    this.f12074d = e7;
                }
            }
            if (j > 0) {
                long skip2 = this.f12072b.skip(j);
                if (skip2 < 0) {
                    if (j3 == 0) {
                        return -1L;
                    }
                    return j3;
                }
                j3 += skip2;
                j -= skip2;
                c(skip2);
            }
            if (j == 0) {
                return j3;
            }
        }
        throw this.f12074d;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = 0;
        while (b()) {
            while (i8 > 262144) {
                try {
                    int read = this.f12072b.read(bArr, i7, 262144);
                    if (read == -1) {
                        if (i9 == 0) {
                            return -1;
                        }
                        return i9;
                    }
                    i9 += read;
                    i7 += read;
                    i8 -= read;
                    c(read);
                    a();
                } catch (IOException e7) {
                    this.f12074d = e7;
                }
            }
            if (i8 > 0) {
                int read2 = this.f12072b.read(bArr, i7, i8);
                if (read2 == -1) {
                    if (i9 == 0) {
                        return -1;
                    }
                    return i9;
                }
                i7 += read2;
                i9 += read2;
                i8 -= read2;
                c(read2);
            }
            if (i8 == 0) {
                return i9;
            }
        }
        throw this.f12074d;
    }
}
