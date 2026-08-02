package com.google.firebase.storage;

import A1.K0;
import Y4.D;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class e extends s {

    /* renamed from: l, reason: collision with root package name */
    public final Uri f12003l;

    /* renamed from: m, reason: collision with root package name */
    public long f12004m;

    /* renamed from: n, reason: collision with root package name */
    public final m f12005n;

    /* renamed from: o, reason: collision with root package name */
    public final S4.e f12006o;

    /* renamed from: p, reason: collision with root package name */
    public long f12007p = -1;

    /* renamed from: q, reason: collision with root package name */
    public String f12008q = null;

    /* renamed from: r, reason: collision with root package name */
    public volatile Exception f12009r = null;

    /* renamed from: s, reason: collision with root package name */
    public long f12010s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f12011t;

    public e(m mVar, Uri uri) {
        this.f12005n = mVar;
        this.f12003l = uri;
        f fVar = mVar.f12045b;
        Y3.i iVar = fVar.f12012a;
        iVar.b();
        this.f12006o = new S4.e(iVar.f7663a, fVar.b(), fVar.a(), fVar.f12017f);
    }

    @Override // com.google.firebase.storage.s
    public final m d() {
        return this.f12005n;
    }

    @Override // com.google.firebase.storage.s
    public final void e() {
        this.f12006o.f6338e = true;
        this.f12009r = i.a(Status.f11081z);
    }

    @Override // com.google.firebase.storage.s
    public final void k() {
        String str;
        if (this.f12009r != null) {
            o(64, false);
            return;
        }
        if (o(4, false)) {
            do {
                this.f12004m = 0L;
                this.f12009r = null;
                this.f12006o.f6338e = false;
                T4.a aVar = new T4.a(this.f12005n.b(), this.f12005n.f12045b.f12012a, this.f12010s);
                this.f12006o.b(aVar, false);
                this.f12011t = aVar.f6357e;
                Exception exc = aVar.f6353a;
                if (exc == null) {
                    exc = this.f12009r;
                }
                this.f12009r = exc;
                int i7 = this.f12011t;
                boolean z4 = (i7 == 308 || (i7 >= 200 && i7 < 300)) && this.f12009r == null && this.f12066h == 4;
                if (z4) {
                    this.f12007p = aVar.f6359g + this.f12010s;
                    String j = aVar.j("ETag");
                    if (!TextUtils.isEmpty(j) && (str = this.f12008q) != null && !str.equals(j)) {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f12010s = 0L;
                        this.f12008q = null;
                        aVar.o();
                        l();
                        return;
                    }
                    this.f12008q = j;
                    try {
                        z4 = q(aVar);
                    } catch (IOException e7) {
                        Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e7);
                        this.f12009r = e7;
                    }
                }
                aVar.o();
                if (z4 && this.f12009r == null && this.f12066h == 4) {
                    o(128, false);
                    return;
                }
                File file = new File(this.f12003l.getPath());
                if (file.exists()) {
                    this.f12010s = file.length();
                } else {
                    this.f12010s = 0L;
                }
                if (this.f12066h == 8) {
                    o(16, false);
                    return;
                } else if (this.f12066h == 32) {
                    if (o(256, false)) {
                        return;
                    }
                    Log.w("FileDownloadTask", "Unable to change download task to final state from " + this.f12066h);
                    return;
                }
            } while (this.f12004m > 0);
            o(64, false);
        }
    }

    @Override // com.google.firebase.storage.s
    public final void l() {
        D.f7696h.execute(new K0(this, 23));
    }

    @Override // com.google.firebase.storage.s
    public final r n() {
        return new d(this, i.b(this.f12009r, this.f12011t), this.f12004m + this.f12010s);
    }

    public final boolean q(T4.a aVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = aVar.f6360h;
        if (inputStream == null) {
            this.f12009r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
        File file = new File(this.f12003l.getPath());
        if (!file.exists()) {
            if (this.f12010s > 0) {
                throw new IOException("The file to download to has been deleted.");
            }
            if (!file.createNewFile()) {
                Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
            }
        }
        if (this.f12010s > 0) {
            Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f12010s);
            fileOutputStream = new FileOutputStream(file, true);
        } else {
            fileOutputStream = new FileOutputStream(file);
        }
        try {
            byte[] bArr = new byte[262144];
            boolean z4 = true;
            while (z4) {
                int i7 = 0;
                boolean z7 = false;
                while (i7 != 262144) {
                    try {
                        int read = inputStream.read(bArr, i7, 262144 - i7);
                        if (read == -1) {
                            break;
                        }
                        i7 += read;
                        z7 = true;
                    } catch (IOException e7) {
                        this.f12009r = e7;
                    }
                }
                if (!z7) {
                    i7 = -1;
                }
                if (i7 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i7);
                this.f12004m += i7;
                if (this.f12009r != null) {
                    Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f12009r);
                    this.f12009r = null;
                    z4 = false;
                }
                if (!o(4, false)) {
                    z4 = false;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStream.close();
            return z4;
        } catch (Throwable th) {
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStream.close();
            throw th;
        }
    }
}
