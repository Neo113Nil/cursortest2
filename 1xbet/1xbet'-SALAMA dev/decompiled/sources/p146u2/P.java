package p146u2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p031e1.k;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class P extends AbstractC0948g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f16740A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f16741B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f16742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16743f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Uri f16744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AssetFileDescriptor f16745y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FileInputStream f16746z;

    public P(Context context) {
        super(false);
        this.f16742e = context.getResources();
        this.f16743f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p146u2.InterfaceC0954m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f16744x = null;
        try {
            FileInputStream fileInputStream = this.f16746z;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f16746z = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f16745y;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f16745y = null;
                    if (this.f16741B) {
                        this.f16741B = false;
                        e();
                    }
                } catch (IOException e7) {
                    throw new O(null, e7, 2000);
                }
            } catch (Throwable th) {
                this.f16745y = null;
                if (this.f16741B) {
                    this.f16741B = false;
                    e();
                }
                throw th;
            }
        } catch (IOException e8) {
            throw new O(null, e8, 2000);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) throws O {
        int identifier;
        Uri uri = c0958q.f16814a;
        this.f16744x = uri;
        boolean zEquals = TextUtils.equals("rawresource", uri.getScheme());
        Resources resources = this.f16742e;
        if (zEquals) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new O("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new O("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            identifier = resources.getIdentifier(k.i(new StringBuilder(), TextUtils.isEmpty(host) ? "" : k.e(host, ":"), path), "raw", this.f16743f);
            if (identifier == 0) {
                throw new O("Resource not found.", null, 2005);
            }
        }
        f();
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.f16745y = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new O("Resource is compressed: " + uri, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f16746z = fileInputStream;
            long j = c0958q.f16818e;
            try {
                if (length != -1 && j > length) {
                    throw new O(null, null, 2008);
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new O(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f16740A = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f16740A = size;
                        if (size < 0) {
                            throw new O(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f16740A = j3;
                    if (j3 < 0) {
                        throw new C0955n(2008);
                    }
                }
                long j7 = c0958q.f16819f;
                if (j7 != -1) {
                    long j8 = this.f16740A;
                    this.f16740A = j8 == -1 ? j7 : Math.min(j8, j7);
                }
                this.f16741B = true;
                g(c0958q);
                return j7 != -1 ? j7 : this.f16740A;
            } catch (O e7) {
                throw e7;
            } catch (IOException e8) {
                throw new O(null, e8, 2000);
            }
        } catch (Resources.NotFoundException e9) {
            throw new O(null, e9, 2005);
        }
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) throws O {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f16740A;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new O(null, e7, 2000);
            }
        }
        FileInputStream fileInputStream = this.f16746z;
        int i9 = t.f17159a;
        int i10 = fileInputStream.read(bArr, i7, i8);
        if (i10 == -1) {
            if (this.f16740A == -1) {
                return -1;
            }
            throw new O("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j3 = this.f16740A;
        if (j3 != -1) {
            this.f16740A = j3 - ((long) i10);
        }
        b(i10);
        return i10;
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        return this.f16744x;
    }
}
