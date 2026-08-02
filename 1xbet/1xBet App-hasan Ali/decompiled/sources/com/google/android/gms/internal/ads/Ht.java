package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class Ht extends Lt {

    /* renamed from: o, reason: collision with root package name */
    public final AssetManager f9495o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f9496p;

    /* renamed from: q, reason: collision with root package name */
    public InputStream f9497q;

    /* renamed from: r, reason: collision with root package name */
    public long f9498r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9499s;

    public Ht(Context context) {
        super(false);
        this.f9495o = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        try {
            Uri uri = ww.f12125a;
            long j5 = ww.f12127c;
            this.f9496p = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            g(ww);
            InputStream open = this.f9495o.open(path, 1);
            this.f9497q = open;
            if (open.skip(j5) < j5) {
                throw new C1804xt(2008, null);
            }
            long j6 = ww.f12128d;
            if (j6 != -1) {
                this.f9498r = j6;
            } else {
                long available = this.f9497q.available();
                this.f9498r = available;
                if (available == 2147483647L) {
                    this.f9498r = -1L;
                }
            }
            this.f9499s = true;
            k(ww);
            return this.f9498r;
        } catch (C1804xt e3) {
            throw e3;
        } catch (IOException e5) {
            throw new C1804xt(true != (e5 instanceof FileNotFoundException) ? 2000 : 2005, e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j5 = this.f9498r;
        if (j5 != 0) {
            if (j5 != -1) {
                try {
                    i5 = (int) Math.min(j5, i5);
                } catch (IOException e3) {
                    throw new C1804xt(2000, e3);
                }
            }
            InputStream inputStream = this.f9497q;
            int i6 = AbstractC1260lo.f14419a;
            int read = inputStream.read(bArr, i, i5);
            if (read != -1) {
                long j6 = this.f9498r;
                if (j6 != -1) {
                    this.f9498r = j6 - read;
                }
                B(read);
                return read;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        return this.f9496p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        this.f9496p = null;
        try {
            try {
                InputStream inputStream = this.f9497q;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9497q = null;
                if (this.f9499s) {
                    this.f9499s = false;
                    f();
                }
            } catch (IOException e3) {
                throw new C1804xt(2000, e3);
            }
        } catch (Throwable th) {
            this.f9497q = null;
            if (this.f9499s) {
                this.f9499s = false;
                f();
            }
            throw th;
        }
    }
}
