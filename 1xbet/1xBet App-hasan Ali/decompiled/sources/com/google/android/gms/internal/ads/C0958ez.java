package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.gms.internal.ads.ez, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958ez extends Lt {

    /* renamed from: o, reason: collision with root package name */
    public RandomAccessFile f13388o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f13389p;

    /* renamed from: q, reason: collision with root package name */
    public long f13390q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13391r;

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        Uri uri = ww.f12125a;
        long j5 = ww.f12127c;
        this.f13389p = uri;
        g(ww);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f13388o = randomAccessFile;
            try {
                randomAccessFile.seek(j5);
                long j6 = ww.f12128d;
                if (j6 == -1) {
                    j6 = this.f13388o.length() - j5;
                }
                this.f13390q = j6;
                if (j6 < 0) {
                    throw new Oy(null, null, 2008);
                }
                this.f13391r = true;
                k(ww);
                return this.f13390q;
            } catch (IOException e3) {
                throw new Oy(2000, e3);
            }
        } catch (FileNotFoundException e5) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new Oy(((e5.getCause() instanceof ErrnoException) && ((ErrnoException) e5.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e5);
            }
            throw new Oy("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e5, 1004);
        } catch (SecurityException e6) {
            throw new Oy(2006, e6);
        } catch (RuntimeException e7) {
            throw new Oy(2000, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j5 = this.f13390q;
        if (j5 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f13388o;
            int i6 = AbstractC1260lo.f14419a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j5, i5));
            if (read > 0) {
                this.f13390q -= read;
                B(read);
            }
            return read;
        } catch (IOException e3) {
            throw new Oy(2000, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        return this.f13389p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        this.f13389p = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f13388o;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f13388o = null;
                if (this.f13391r) {
                    this.f13391r = false;
                    f();
                }
            } catch (IOException e3) {
                throw new Oy(2000, e3);
            }
        } catch (Throwable th) {
            this.f13388o = null;
            if (this.f13391r) {
                this.f13391r = false;
                f();
            }
            throw th;
        }
    }
}
