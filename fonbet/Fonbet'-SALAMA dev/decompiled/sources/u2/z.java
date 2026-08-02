package u2;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class z extends AbstractC1630g {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f16866e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f16867f;

    /* renamed from: x, reason: collision with root package name */
    public long f16868x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16869y;

    @Override // u2.InterfaceC1636m
    public final void close() {
        this.f16867f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f16866e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new y(e7, 2000);
            }
        } finally {
            this.f16866e = null;
            if (this.f16869y) {
                this.f16869y = false;
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // u2.InterfaceC1636m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(C1640q c1640q) {
        boolean b7;
        Uri uri = c1640q.f16808a;
        long j = c1640q.f16812e;
        this.f16867f = uri;
        f();
        int i7 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f16866e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j3 = c1640q.f16813f;
                if (j3 == -1) {
                    j3 = this.f16866e.length() - j;
                }
                this.f16868x = j3;
                if (j3 < 0) {
                    throw new y(null, null, 2008);
                }
                this.f16869y = true;
                g(c1640q);
                return this.f16868x;
            } catch (IOException e7) {
                throw new y(e7, 2000);
            }
        } catch (FileNotFoundException e8) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (v2.t.f17153a >= 21) {
                    b7 = x.b(e8.getCause());
                }
                i7 = 2005;
                throw new y(e8, i7);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder l7 = e1.k.l("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            l7.append(fragment);
            throw new y(l7.toString(), e8, 1004);
        } catch (SecurityException e9) {
            throw new y(e9, 2006);
        } catch (RuntimeException e10) {
            throw new y(e10, 2000);
        }
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f16868x;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f16866e;
            int i9 = v2.t.f17153a;
            int read = randomAccessFile.read(bArr, i7, (int) Math.min(j, i8));
            if (read > 0) {
                this.f16868x -= read;
                b(read);
            }
            return read;
        } catch (IOException e7) {
            throw new y(e7, 2000);
        }
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        return this.f16867f;
    }
}
