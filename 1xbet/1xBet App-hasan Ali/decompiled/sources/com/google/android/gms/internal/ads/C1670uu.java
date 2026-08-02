package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.uu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1670uu extends Lt {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15924o;

    /* renamed from: p, reason: collision with root package name */
    public AssetFileDescriptor f15925p;

    /* renamed from: q, reason: collision with root package name */
    public FileInputStream f15926q;

    /* renamed from: r, reason: collision with root package name */
    public long f15927r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15928s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f15929t;

    /* renamed from: u, reason: collision with root package name */
    public Object f15930u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670uu(Context context, int i) {
        super(false);
        this.f15924o = i;
        switch (i) {
            case 1:
                super(false);
                this.f15929t = context.getApplicationContext();
                break;
            default:
                this.f15929t = context.getContentResolver();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j5;
        Resources resourcesForApplication;
        int parseInt;
        Resources resources;
        long j6;
        switch (this.f15924o) {
            case 0:
                try {
                    try {
                        Uri normalizeScheme = ww.f12125a.normalizeScheme();
                        this.f15930u = normalizeScheme;
                        g(ww);
                        boolean equals = "content".equals(normalizeScheme.getScheme());
                        ContentResolver contentResolver = (ContentResolver) this.f15929t;
                        if (equals) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                        } else {
                            openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                        }
                        this.f15925p = openAssetFileDescriptor;
                        if (openAssetFileDescriptor == null) {
                            i = 2000;
                            try {
                                throw new C1266lu(2000, new IOException("Could not open file descriptor for: ".concat(String.valueOf(normalizeScheme))));
                            } catch (IOException e3) {
                                e = e3;
                                throw new C1266lu(true != (e instanceof FileNotFoundException) ? i : 2005, e);
                            }
                        }
                        long length = openAssetFileDescriptor.getLength();
                        FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                        this.f15926q = fileInputStream;
                        long j7 = ww.f12127c;
                        if (length != -1 && j7 > length) {
                            throw new C1266lu(2008, null);
                        }
                        long startOffset = openAssetFileDescriptor.getStartOffset();
                        long skip = fileInputStream.skip(startOffset + j7) - startOffset;
                        if (skip != j7) {
                            throw new C1266lu(2008, null);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f15927r = -1L;
                                j5 = -1;
                            } else {
                                j5 = size - channel.position();
                                this.f15927r = j5;
                                if (j5 < 0) {
                                    throw new C1266lu(2008, null);
                                }
                            }
                        } else {
                            j5 = length - skip;
                            this.f15927r = j5;
                            if (j5 < 0) {
                                throw new C1266lu(2008, null);
                            }
                        }
                        long j8 = ww.f12128d;
                        if (j8 != -1) {
                            this.f15927r = j5 == -1 ? j8 : Math.min(j5, j8);
                        }
                        this.f15928s = true;
                        k(ww);
                        return j8 != -1 ? j8 : this.f15927r;
                    } catch (IOException e5) {
                        e = e5;
                        i = 2000;
                    }
                } catch (C1266lu e6) {
                    throw e6;
                }
                break;
            default:
                this.f15930u = ww;
                g(ww);
                Uri normalizeScheme2 = ww.f12125a.normalizeScheme();
                boolean equals2 = TextUtils.equals("rawresource", normalizeScheme2.getScheme());
                Context context = (Context) this.f15929t;
                if (equals2) {
                    resources = context.getResources();
                    List<String> pathSegments = normalizeScheme2.getPathSegments();
                    if (pathSegments.size() != 1) {
                        throw new C1239lB(AbstractC2107A.q("rawresource:// URI must have exactly one path element, found ", pathSegments.size()), null, 2000);
                    }
                    try {
                        parseInt = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new C1239lB("Resource identifier must be an integer.", null, 1004);
                    }
                } else {
                    if (!TextUtils.equals("android.resource", normalizeScheme2.getScheme())) {
                        throw new C1239lB(L1.a.n("Unsupported URI scheme (", normalizeScheme2.getScheme(), "). Only android.resource is supported."), null, 1004);
                    }
                    String path = normalizeScheme2.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String packageName = TextUtils.isEmpty(normalizeScheme2.getHost()) ? context.getPackageName() : normalizeScheme2.getHost();
                    if (packageName.equals(context.getPackageName())) {
                        resourcesForApplication = context.getResources();
                    } else {
                        try {
                            resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                        } catch (PackageManager.NameNotFoundException e7) {
                            throw new C1239lB("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e7, 2005);
                        }
                    }
                    if (path.matches("\\d+")) {
                        try {
                            parseInt = Integer.parseInt(path);
                        } catch (NumberFormatException unused2) {
                            throw new C1239lB("Resource identifier must be an integer.", null, 1004);
                        }
                    } else {
                        parseInt = resourcesForApplication.getIdentifier(AbstractC0467k.v(packageName, ":", path), "raw", null);
                        if (parseInt == 0) {
                            throw new C1239lB("Resource not found.", null, 2005);
                        }
                    }
                    resources = resourcesForApplication;
                }
                try {
                    AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(parseInt);
                    if (openRawResourceFd == null) {
                        throw new C1239lB("Resource is compressed: ".concat(String.valueOf(normalizeScheme2)), null, 2000);
                    }
                    this.f15925p = openRawResourceFd;
                    long length2 = openRawResourceFd.getLength();
                    FileInputStream fileInputStream2 = new FileInputStream(this.f15925p.getFileDescriptor());
                    this.f15926q = fileInputStream2;
                    long j9 = ww.f12127c;
                    try {
                        if (length2 != -1 && j9 > length2) {
                            throw new C1239lB(null, null, 2008);
                        }
                        long startOffset2 = this.f15925p.getStartOffset();
                        long skip2 = fileInputStream2.skip(startOffset2 + j9) - startOffset2;
                        if (skip2 != j9) {
                            throw new C1239lB(null, null, 2008);
                        }
                        if (length2 == -1) {
                            FileChannel channel2 = fileInputStream2.getChannel();
                            if (channel2.size() == 0) {
                                this.f15927r = -1L;
                                j6 = -1;
                            } else {
                                j6 = channel2.size() - channel2.position();
                                this.f15927r = j6;
                                if (j6 < 0) {
                                    throw new C1239lB(null, null, 2008);
                                }
                            }
                        } else {
                            long j10 = length2 - skip2;
                            this.f15927r = j10;
                            if (j10 < 0) {
                                throw new C1806xv();
                            }
                            j6 = j10;
                        }
                        long j11 = ww.f12128d;
                        if (j11 != -1) {
                            this.f15927r = j6 == -1 ? j11 : Math.min(j6, j11);
                        }
                        this.f15928s = true;
                        k(ww);
                        return j11 != -1 ? j11 : this.f15927r;
                    } catch (C1239lB e8) {
                        throw e8;
                    } catch (IOException e9) {
                        throw new C1239lB(null, e9, 2000);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw new C1239lB(null, e10, 2005);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        switch (this.f15924o) {
            case 0:
                if (i5 == 0) {
                    return 0;
                }
                long j5 = this.f15927r;
                if (j5 == 0) {
                    return -1;
                }
                if (j5 != -1) {
                    try {
                        i5 = (int) Math.min(j5, i5);
                    } catch (IOException e3) {
                        throw new C1266lu(2000, e3);
                    }
                }
                FileInputStream fileInputStream = this.f15926q;
                int i6 = AbstractC1260lo.f14419a;
                int read = fileInputStream.read(bArr, i, i5);
                if (read == -1) {
                    return -1;
                }
                long j6 = this.f15927r;
                if (j6 != -1) {
                    this.f15927r = j6 - read;
                }
                B(read);
                return read;
            default:
                if (i5 == 0) {
                    return 0;
                }
                long j7 = this.f15927r;
                if (j7 == 0) {
                    return -1;
                }
                if (j7 != -1) {
                    try {
                        i5 = (int) Math.min(j7, i5);
                    } catch (IOException e5) {
                        throw new C1239lB(null, e5, 2000);
                    }
                }
                FileInputStream fileInputStream2 = this.f15926q;
                int i7 = AbstractC1260lo.f14419a;
                int read2 = fileInputStream2.read(bArr, i, i5);
                if (read2 == -1) {
                    if (this.f15927r == -1) {
                        return -1;
                    }
                    throw new C1239lB("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
                long j8 = this.f15927r;
                if (j8 != -1) {
                    this.f15927r = j8 - read2;
                }
                B(read2);
                return read2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        switch (this.f15924o) {
            case 0:
                return (Uri) this.f15930u;
            default:
                Ww ww = (Ww) this.f15930u;
                if (ww != null) {
                    return ww.f12125a;
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        switch (this.f15924o) {
            case 0:
                this.f15930u = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = this.f15926q;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            this.f15926q = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor = this.f15925p;
                                if (assetFileDescriptor != null) {
                                    assetFileDescriptor.close();
                                }
                                this.f15925p = null;
                                if (this.f15928s) {
                                    this.f15928s = false;
                                    f();
                                    return;
                                }
                                return;
                            } catch (IOException e3) {
                                throw new C1266lu(2000, e3);
                            }
                        } catch (IOException e5) {
                            throw new C1266lu(2000, e5);
                        }
                    } catch (Throwable th) {
                        this.f15926q = null;
                        try {
                            AssetFileDescriptor assetFileDescriptor2 = this.f15925p;
                            if (assetFileDescriptor2 != null) {
                                assetFileDescriptor2.close();
                            }
                            this.f15925p = null;
                            if (this.f15928s) {
                                this.f15928s = false;
                                f();
                            }
                            throw th;
                        } catch (IOException e6) {
                            throw new C1266lu(2000, e6);
                        }
                    }
                } catch (Throwable th2) {
                    this.f15925p = null;
                    if (this.f15928s) {
                        this.f15928s = false;
                        f();
                    }
                    throw th2;
                }
            default:
                this.f15930u = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream2 = this.f15926q;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            this.f15926q = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor3 = this.f15925p;
                                if (assetFileDescriptor3 != null) {
                                    assetFileDescriptor3.close();
                                }
                                this.f15925p = null;
                                if (this.f15928s) {
                                    this.f15928s = false;
                                    f();
                                    return;
                                }
                                return;
                            } catch (IOException e7) {
                                throw new C1239lB(null, e7, 2000);
                            }
                        } catch (IOException e8) {
                            throw new C1239lB(null, e8, 2000);
                        }
                    } catch (Throwable th3) {
                        this.f15926q = null;
                        try {
                            AssetFileDescriptor assetFileDescriptor4 = this.f15925p;
                            if (assetFileDescriptor4 != null) {
                                assetFileDescriptor4.close();
                            }
                            this.f15925p = null;
                            if (this.f15928s) {
                                this.f15928s = false;
                                f();
                            }
                            throw th3;
                        } catch (IOException e9) {
                            throw new C1239lB(null, e9, 2000);
                        }
                    }
                } catch (Throwable th4) {
                    this.f15925p = null;
                    if (this.f15928s) {
                        this.f15928s = false;
                        f();
                    }
                    throw th4;
                }
        }
    }
}
