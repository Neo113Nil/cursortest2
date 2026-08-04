package p146u2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p151v2.t;

/* JADX INFO: renamed from: u2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0944c extends AbstractC0948g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f16773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f16774f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InputStream f16775x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f16776y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16777z;

    public C0944c(Context context) {
        super(false);
        this.f16773e = context.getAssets();
    }

    @Override // p146u2.InterfaceC0954m
    public final void close() {
        this.f16774f = null;
        try {
            try {
                InputStream inputStream = this.f16775x;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f16775x = null;
                if (this.f16777z) {
                    this.f16777z = false;
                    e();
                }
            } catch (IOException e7) {
                throw new C0943b(e7, 2000);
            }
        } catch (Throwable th) {
            this.f16775x = null;
            if (this.f16777z) {
                this.f16777z = false;
                e();
            }
            throw th;
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) throws C0943b {
        try {
            Uri uri = c0958q.f16814a;
            long j = c0958q.f16818e;
            this.f16774f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f();
            InputStream inputStreamOpen = this.f16773e.open(path, 1);
            this.f16775x = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C0943b(null, 2008);
            }
            long j3 = c0958q.f16819f;
            if (j3 != -1) {
                this.f16776y = j3;
            } else {
                long jAvailable = this.f16775x.available();
                this.f16776y = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f16776y = -1L;
                }
            }
            this.f16777z = true;
            g(c0958q);
            return this.f16776y;
        } catch (C0943b e7) {
            throw e7;
        } catch (IOException e8) {
            throw new C0943b(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) throws C0943b {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f16776y;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new C0943b(e7, 2000);
            }
        }
        InputStream inputStream = this.f16775x;
        int i9 = t.f17159a;
        int i10 = inputStream.read(bArr, i7, i8);
        if (i10 == -1) {
            return -1;
        }
        long j3 = this.f16776y;
        if (j3 != -1) {
            this.f16776y = j3 - ((long) i10);
        }
        b(i10);
        return i10;
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        return this.f16774f;
    }
}
