package p146u2;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p031e1.k;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0948g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f16872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f16873f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f16874x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16875y;

    @Override // p146u2.InterfaceC0954m
    public final void close() {
        this.f16873f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f16872e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f16872e = null;
                if (this.f16875y) {
                    this.f16875y = false;
                    e();
                }
            } catch (IOException e7) {
                throw new y(e7, 2000);
            }
        } catch (Throwable th) {
            this.f16872e = null;
            if (this.f16875y) {
                this.f16875y = false;
                e();
            }
            throw th;
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) throws y {
        Uri uri = c0958q.f16814a;
        long j = c0958q.f16818e;
        this.f16873f = uri;
        f();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f16872e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c0958q.f16819f;
                if (length == -1) {
                    length = this.f16872e.length() - j;
                }
                this.f16874x = length;
                if (length < 0) {
                    throw new y(null, null, 2008);
                }
                this.f16875y = true;
                g(c0958q);
                return this.f16874x;
            } catch (IOException e7) {
                throw new y(e7, 2000);
            }
        } catch (FileNotFoundException e8) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new y(e8, (t.f17159a < 21 || !x.b(e8.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbL = k.l("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbL.append(fragment);
            throw new y(sbL.toString(), e8, 1004);
        } catch (SecurityException e9) {
            throw new y(e9, 2006);
        } catch (RuntimeException e10) {
            throw new y(e10, 2000);
        }
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) throws y {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f16874x;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f16872e;
            int i9 = t.f17159a;
            int i10 = randomAccessFile.read(bArr, i7, (int) Math.min(j, i8));
            if (i10 > 0) {
                this.f16874x -= (long) i10;
                b(i10);
            }
            return i10;
        } catch (IOException e7) {
            throw new y(e7, 2000);
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        return this.f16873f;
    }
}
