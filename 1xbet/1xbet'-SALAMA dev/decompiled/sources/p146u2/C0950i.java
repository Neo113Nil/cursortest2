package p146u2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p151v2.t;

/* JADX INFO: renamed from: u2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0950i extends AbstractC0948g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f16789A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f16790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f16791f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AssetFileDescriptor f16792x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FileInputStream f16793y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f16794z;

    public C0950i(Context context) {
        super(false);
        this.f16790e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p146u2.InterfaceC0954m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f16791f = null;
        try {
            FileInputStream fileInputStream = this.f16793y;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f16793y = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f16792x;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f16792x = null;
                    if (this.f16789A) {
                        this.f16789A = false;
                        e();
                    }
                } catch (IOException e7) {
                    throw new C0949h(e7, 2000);
                }
            } catch (Throwable th) {
                this.f16792x = null;
                if (this.f16789A) {
                    this.f16789A = false;
                    e();
                }
                throw th;
            }
        } catch (IOException e8) {
            throw new C0949h(e8, 2000);
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) throws C0949h {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = c0958q.f16814a;
            this.f16791f = uri;
            f();
            boolean zEquals = "content".equals(c0958q.f16814a.getScheme());
            ContentResolver contentResolver = this.f16790e;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.f16792x = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C0949h(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f16793y = fileInputStream;
            long j = c0958q.f16818e;
            if (length != -1 && j > length) {
                throw new C0949h(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
            if (jSkip != j) {
                throw new C0949h(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f16794z = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f16794z = jPosition;
                    if (jPosition < 0) {
                        throw new C0949h(null, 2008);
                    }
                }
            } else {
                long j3 = length - jSkip;
                this.f16794z = j3;
                if (j3 < 0) {
                    throw new C0949h(null, 2008);
                }
            }
            long j7 = c0958q.f16819f;
            if (j7 != -1) {
                long j8 = this.f16794z;
                this.f16794z = j8 == -1 ? j7 : Math.min(j8, j7);
            }
            this.f16789A = true;
            g(c0958q);
            return j7 != -1 ? j7 : this.f16794z;
        } catch (C0949h e7) {
            throw e7;
        } catch (IOException e8) {
            throw new C0949h(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) throws C0949h {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f16794z;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new C0949h(e7, 2000);
            }
        }
        FileInputStream fileInputStream = this.f16793y;
        int i9 = t.f17159a;
        int i10 = fileInputStream.read(bArr, i7, i8);
        if (i10 == -1) {
            return -1;
        }
        long j3 = this.f16794z;
        if (j3 != -1) {
            this.f16794z = j3 - ((long) i10);
        }
        b(i10);
        return i10;
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        return this.f16791f;
    }
}
