package u2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: u2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1632i extends AbstractC1630g {

    /* renamed from: A, reason: collision with root package name */
    public boolean f16783A;

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f16784e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f16785f;

    /* renamed from: x, reason: collision with root package name */
    public AssetFileDescriptor f16786x;

    /* renamed from: y, reason: collision with root package name */
    public FileInputStream f16787y;

    /* renamed from: z, reason: collision with root package name */
    public long f16788z;

    public C1632i(Context context) {
        super(false);
        this.f16784e = context.getContentResolver();
    }

    @Override // u2.InterfaceC1636m
    public final void close() {
        this.f16785f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f16787y;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f16787y = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f16786x;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new C1631h(e7, 2000);
                    }
                } finally {
                    this.f16786x = null;
                    if (this.f16783A) {
                        this.f16783A = false;
                        e();
                    }
                }
            } catch (IOException e8) {
                throw new C1631h(e8, 2000);
            }
        } catch (Throwable th) {
            this.f16787y = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f16786x;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f16786x = null;
                    if (this.f16783A) {
                        this.f16783A = false;
                        e();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new C1631h(e9, 2000);
                }
            } finally {
                this.f16786x = null;
                if (this.f16783A) {
                    this.f16783A = false;
                    e();
                }
            }
        }
    }

    @Override // u2.InterfaceC1636m
    public final long o(C1640q c1640q) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = c1640q.f16808a;
            this.f16785f = uri;
            f();
            boolean equals = "content".equals(c1640q.f16808a.getScheme());
            ContentResolver contentResolver = this.f16784e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.f16786x = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new C1631h(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f16787y = fileInputStream;
            long j = c1640q.f16812e;
            if (length != -1 && j > length) {
                throw new C1631h(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(startOffset + j) - startOffset;
            if (skip != j) {
                throw new C1631h(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f16788z = -1L;
                } else {
                    long position = size - channel.position();
                    this.f16788z = position;
                    if (position < 0) {
                        throw new C1631h(null, 2008);
                    }
                }
            } else {
                long j3 = length - skip;
                this.f16788z = j3;
                if (j3 < 0) {
                    throw new C1631h(null, 2008);
                }
            }
            long j7 = c1640q.f16813f;
            if (j7 != -1) {
                long j8 = this.f16788z;
                this.f16788z = j8 == -1 ? j7 : Math.min(j8, j7);
            }
            this.f16783A = true;
            g(c1640q);
            return j7 != -1 ? j7 : this.f16788z;
        } catch (C1631h e7) {
            throw e7;
        } catch (IOException e8) {
            throw new C1631h(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f16788z;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new C1631h(e7, 2000);
            }
        }
        FileInputStream fileInputStream = this.f16787y;
        int i9 = v2.t.f17153a;
        int read = fileInputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j3 = this.f16788z;
        if (j3 != -1) {
            this.f16788z = j3 - read;
        }
        b(read);
        return read;
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        return this.f16785f;
    }
}
