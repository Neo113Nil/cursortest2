package u2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class P extends AbstractC1630g {

    /* renamed from: A, reason: collision with root package name */
    public long f16734A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16735B;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f16736e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16737f;

    /* renamed from: x, reason: collision with root package name */
    public Uri f16738x;

    /* renamed from: y, reason: collision with root package name */
    public AssetFileDescriptor f16739y;

    /* renamed from: z, reason: collision with root package name */
    public FileInputStream f16740z;

    public P(Context context) {
        super(false);
        this.f16736e = context.getResources();
        this.f16737f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    @Override // u2.InterfaceC1636m
    public final void close() {
        this.f16738x = null;
        try {
            try {
                FileInputStream fileInputStream = this.f16740z;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f16740z = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f16739y;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new O(null, e7, 2000);
                    }
                } finally {
                    this.f16739y = null;
                    if (this.f16735B) {
                        this.f16735B = false;
                        e();
                    }
                }
            } catch (IOException e8) {
                throw new O(null, e8, 2000);
            }
        } catch (Throwable th) {
            this.f16740z = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f16739y;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f16739y = null;
                    if (this.f16735B) {
                        this.f16735B = false;
                        e();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new O(null, e9, 2000);
                }
            } finally {
                this.f16739y = null;
                if (this.f16735B) {
                    this.f16735B = false;
                    e();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r3.matches("\\d+") != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    @Override // u2.InterfaceC1636m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(C1640q c1640q) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        Uri uri = c1640q.f16808a;
        this.f16738x = uri;
        boolean equals = TextUtils.equals("rawresource", uri.getScheme());
        Resources resources = this.f16736e;
        try {
            try {
                if (!equals) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
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
                    parseInt = resources.getIdentifier(e1.k.i(new StringBuilder(), TextUtils.isEmpty(host) ? "" : e1.k.e(host, ":"), path), "raw", this.f16737f);
                    if (parseInt == 0) {
                        throw new O("Resource not found.", null, 2005);
                    }
                    f();
                    openRawResourceFd = resources.openRawResourceFd(parseInt);
                    this.f16739y = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new O("Resource is compressed: " + uri, null, 2000);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.f16740z = fileInputStream;
                    long j = c1640q.f16812e;
                    try {
                        if (length != -1 && j > length) {
                            throw new O(null, null, 2008);
                        }
                        long startOffset = openRawResourceFd.getStartOffset();
                        long skip = fileInputStream.skip(startOffset + j) - startOffset;
                        if (skip != j) {
                            throw new O(null, null, 2008);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.f16734A = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.f16734A = size;
                                if (size < 0) {
                                    throw new O(null, null, 2008);
                                }
                            }
                        } else {
                            long j3 = length - skip;
                            this.f16734A = j3;
                            if (j3 < 0) {
                                throw new C1637n(2008);
                            }
                        }
                        long j7 = c1640q.f16813f;
                        if (j7 != -1) {
                            long j8 = this.f16734A;
                            this.f16734A = j8 == -1 ? j7 : Math.min(j8, j7);
                        }
                        this.f16735B = true;
                        g(c1640q);
                        return j7 != -1 ? j7 : this.f16734A;
                    } catch (O e7) {
                        throw e7;
                    } catch (IOException e8) {
                        throw new O(null, e8, 2000);
                    }
                }
                openRawResourceFd = resources.openRawResourceFd(parseInt);
                this.f16739y = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e9) {
                throw new O(null, e9, 2005);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            f();
        } catch (NumberFormatException unused) {
            throw new O("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f16734A;
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
        FileInputStream fileInputStream = this.f16740z;
        int i9 = v2.t.f17153a;
        int read = fileInputStream.read(bArr, i7, i8);
        if (read == -1) {
            if (this.f16734A == -1) {
                return -1;
            }
            throw new O("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j3 = this.f16734A;
        if (j3 != -1) {
            this.f16734A = j3 - read;
        }
        b(read);
        return read;
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        return this.f16738x;
    }
}
