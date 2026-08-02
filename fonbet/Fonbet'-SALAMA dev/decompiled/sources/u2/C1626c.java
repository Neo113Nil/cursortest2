package u2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1626c extends AbstractC1630g {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f16767e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f16768f;

    /* renamed from: x, reason: collision with root package name */
    public InputStream f16769x;

    /* renamed from: y, reason: collision with root package name */
    public long f16770y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16771z;

    public C1626c(Context context) {
        super(false);
        this.f16767e = context.getAssets();
    }

    @Override // u2.InterfaceC1636m
    public final void close() {
        this.f16768f = null;
        try {
            try {
                InputStream inputStream = this.f16769x;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new C1625b(e7, 2000);
            }
        } finally {
            this.f16769x = null;
            if (this.f16771z) {
                this.f16771z = false;
                e();
            }
        }
    }

    @Override // u2.InterfaceC1636m
    public final long o(C1640q c1640q) {
        try {
            Uri uri = c1640q.f16808a;
            long j = c1640q.f16812e;
            this.f16768f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f();
            InputStream open = this.f16767e.open(path, 1);
            this.f16769x = open;
            if (open.skip(j) < j) {
                throw new C1625b(null, 2008);
            }
            long j3 = c1640q.f16813f;
            if (j3 != -1) {
                this.f16770y = j3;
            } else {
                long available = this.f16769x.available();
                this.f16770y = available;
                if (available == 2147483647L) {
                    this.f16770y = -1L;
                }
            }
            this.f16771z = true;
            g(c1640q);
            return this.f16770y;
        } catch (C1625b e7) {
            throw e7;
        } catch (IOException e8) {
            throw new C1625b(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f16770y;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new C1625b(e7, 2000);
            }
        }
        InputStream inputStream = this.f16769x;
        int i9 = v2.t.f17153a;
        int read = inputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j3 = this.f16770y;
        if (j3 != -1) {
            this.f16770y = j3 - read;
        }
        b(read);
        return read;
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        return this.f16768f;
    }
}
