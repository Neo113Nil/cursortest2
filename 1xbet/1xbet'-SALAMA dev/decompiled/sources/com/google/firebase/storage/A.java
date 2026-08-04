package com.google.firebase.storage;

import A1.K0;
import D6.y0;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import p042f4.InterfaceC0893b;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends s {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Random f11976D = new Random();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final M4.e f11977E = new M4.e();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final p090m3.b f11978F = p090m3.b.f15254a;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile String f11979A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile long f11980B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11981C;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f11982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f11983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f11984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final S4.d f11985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicLong f11986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0893b f11987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p026d4.b f11988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final S4.e f11990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f11991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile j f11992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Uri f11993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile Exception f11994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile Exception f11995y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile int f11996z;

    public A(m mVar, j jVar, byte[] bArr) {
        this.f11986p = new AtomicLong(0L);
        this.f11989s = 262144;
        this.f11993w = null;
        this.f11994x = null;
        this.f11995y = null;
        this.f11996z = 0;
        this.f11981C = 0;
        D.i(bArr);
        f fVar = mVar.f12045b;
        this.f11984n = bArr.length;
        this.f11982l = mVar;
        this.f11992v = jVar;
        InterfaceC0893b interfaceC0893bB = fVar.b();
        this.f11987q = interfaceC0893bB;
        p026d4.b bVarA = fVar.a();
        this.f11988r = bVarA;
        this.f11983m = null;
        this.f11985o = new S4.d(new ByteArrayInputStream(bArr));
        this.f11991u = true;
        this.f11980B = 60000L;
        Y3.i iVar = fVar.f12012a;
        iVar.b();
        this.f11990t = new S4.e(iVar.f7663a, interfaceC0893bB, bVarA, fVar.f12016e);
    }

    @Override // com.google.firebase.storage.s
    public final m d() {
        return this.f11982l;
    }

    @Override // com.google.firebase.storage.s
    public final void e() {
        this.f11990t.f6338e = true;
        T4.f fVar = this.f11993w != null ? new T4.f(this.f11982l.b(), this.f11982l.f12045b.f12012a, this.f11993w, 0) : null;
        if (fVar != null) {
            Y4.D.f7694f.execute(new y0(19, this, fVar, false));
        }
        this.f11994x = i.a(Status.f11081z);
    }

    @Override // com.google.firebase.storage.s
    public final void i() {
        this.f11994x = null;
        this.f11995y = null;
        this.f11996z = 0;
        this.f11979A = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    @Override // com.google.firebase.storage.s
    public final void k() {
        m mVar;
        this.f11990t.f6338e = false;
        if (!o(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        m mVar2 = this.f11982l;
        Uri uri = mVar2.f12044a;
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            mVar = null;
        } else {
            if (path.equals("/")) {
                mVar = null;
            } else {
                int iLastIndexOf = path.lastIndexOf(47);
                mVar = new m(uri.buildUpon().path(iLastIndexOf != -1 ? path.substring(0, iLastIndexOf) : "/").build(), mVar2.f12045b);
            }
        }
        if (mVar == null) {
            this.f11994x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f11994x != null) {
            return;
        }
        if (this.f11993w == null) {
            String type = this.f11992v != null ? (String) this.f11992v.f12032d.f1064c : null;
            if (this.f11983m != null && TextUtils.isEmpty(type)) {
                Y3.i iVar = this.f11982l.f12045b.f12012a;
                iVar.b();
                type = iVar.f7663a.getContentResolver().getType(this.f11983m);
            }
            if (TextUtils.isEmpty(type)) {
                type = "application/octet-stream";
            }
            T4.f fVar = new T4.f(this.f11982l.b(), this.f11982l.f12045b.f12012a, this.f11992v != null ? this.f11992v.a() : null, type);
            this.f11990t.b(fVar, true);
            if (r(fVar)) {
                String strJ = fVar.j("X-Goog-Upload-URL");
                if (!TextUtils.isEmpty(strJ)) {
                    this.f11993w = Uri.parse(strJ);
                }
            }
        } else {
            s(false);
        }
        boolean zU = u();
        while (zU) {
            try {
                this.f11985o.b(this.f11989s);
                int iMin = Math.min(this.f11989s, this.f11985o.f6328c);
                T4.e eVar = new T4.e(this.f11982l.b(), this.f11982l.f12045b.f12012a, this.f11993w, this.f11985o.f6327b, this.f11986p.get(), iMin, this.f11985o.f6329d);
                if (q(eVar)) {
                    this.f11986p.getAndAdd(iMin);
                    S4.d dVar = this.f11985o;
                    if (dVar.f6329d) {
                        try {
                            this.f11992v = new B3.g(eVar.i(), this.f11982l).d();
                            o(4, false);
                            o(128, false);
                        } catch (JSONException e7) {
                            Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + eVar.f6358f, e7);
                            this.f11994x = e7;
                        }
                    } else {
                        dVar.a(iMin);
                        int i7 = this.f11989s;
                        if (i7 < 33554432) {
                            this.f11989s = i7 * 2;
                            Log.d("UploadTask", "Increasing chunk size to " + this.f11989s);
                        }
                    }
                } else {
                    this.f11989s = 262144;
                    Log.d("UploadTask", "Resetting chunk size to " + this.f11989s);
                }
            } catch (IOException e8) {
                Log.e("UploadTask", "Unable to read bytes for uploading", e8);
                this.f11994x = e8;
            }
            zU = u();
            if (zU) {
                o(4, false);
            }
        }
        if (!this.f11991u || this.f12066h == 16) {
            return;
        }
        try {
            this.f11985o.f6326a.close();
        } catch (IOException e9) {
            Log.e("UploadTask", "Unable to close stream.", e9);
        }
    }

    @Override // com.google.firebase.storage.s
    public final void l() {
        Y4.D.f7695g.execute(new K0(this, 23));
    }

    @Override // com.google.firebase.storage.s
    public final r n() {
        return new z(this, i.b(this.f11994x != null ? this.f11994x : this.f11995y, this.f11996z), this.f11986p.get(), this.f11992v);
    }

    public final boolean q(T4.e eVar) {
        try {
            Log.d("UploadTask", "Waiting " + this.f11981C + " milliseconds");
            M4.e eVar2 = f11977E;
            int iNextInt = this.f11981C + f11976D.nextInt(250);
            eVar2.getClass();
            Thread.sleep(iNextInt);
            String strB = Q0.a.B(this.f11987q);
            String strA = Q0.a.A(this.f11988r);
            Y3.i iVar = this.f11982l.f12045b.f12012a;
            iVar.b();
            eVar.n(iVar.f7663a, strB, strA);
            boolean zR = r(eVar);
            if (zR) {
                this.f11981C = 0;
            }
            return zR;
        } catch (InterruptedException e7) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f11995y = e7;
            return false;
        }
    }

    public final boolean r(T4.d dVar) {
        int i7 = dVar.f6357e;
        this.f11990t.getClass();
        if (S4.e.a(i7)) {
            i7 = -2;
        }
        this.f11996z = i7;
        this.f11995y = dVar.f6353a;
        this.f11979A = dVar.j("X-Goog-Upload-Status");
        int i8 = this.f11996z;
        return (i8 == 308 || (i8 >= 200 && i8 < 300)) && this.f11995y == null;
    }

    public final boolean s(boolean z4) {
        T4.f fVar = new T4.f(this.f11982l.b(), this.f11982l.f12045b.f12012a, this.f11993w, 1);
        if ("final".equals(this.f11979A)) {
            return false;
        }
        if (z4) {
            this.f11990t.b(fVar, true);
            if (!r(fVar)) {
                return false;
            }
        } else {
            String strB = Q0.a.B(this.f11987q);
            String strA = Q0.a.A(this.f11988r);
            Y3.i iVar = this.f11982l.f12045b.f12012a;
            iVar.b();
            fVar.n(iVar.f7663a, strB, strA);
            if (!r(fVar)) {
                return false;
            }
        }
        if ("final".equals(fVar.j("X-Goog-Upload-Status"))) {
            this.f11994x = new IOException("The server has terminated the upload session");
            return false;
        }
        String strJ = fVar.j("X-Goog-Upload-Size-Received");
        long j = !TextUtils.isEmpty(strJ) ? Long.parseLong(strJ) : 0L;
        long j3 = this.f11986p.get();
        if (j3 > j) {
            this.f11994x = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        }
        if (j3 < j) {
            try {
                long j7 = j - j3;
                if (this.f11985o.a((int) j7) != j7) {
                    this.f11994x = new IOException("Unexpected end of stream encountered.");
                    return false;
                }
                if (!this.f11986p.compareAndSet(j3, j)) {
                    Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.f11994x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                }
            } catch (IOException e7) {
                Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e7);
                this.f11994x = e7;
                return false;
            }
        }
        return true;
    }

    public final boolean t() {
        if (!"final".equals(this.f11979A)) {
            return true;
        }
        if (this.f11994x == null) {
            this.f11994x = new IOException("The server has terminated the upload session", this.f11995y);
        }
        o(64, false);
        return false;
    }

    public final boolean u() {
        if (this.f12066h == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f11994x = new InterruptedException();
            o(64, false);
            return false;
        }
        if (this.f12066h == 32) {
            o(256, false);
            return false;
        }
        if (this.f12066h == 8) {
            o(16, false);
            return false;
        }
        if (!t()) {
            return false;
        }
        if (this.f11993w == null) {
            if (this.f11994x == null) {
                this.f11994x = new IllegalStateException("Unable to obtain an upload URL.");
            }
            o(64, false);
            return false;
        }
        if (this.f11994x != null) {
            o(64, false);
            return false;
        }
        boolean z4 = this.f11995y != null || this.f11996z < 200 || this.f11996z >= 300;
        p090m3.b bVar = f11978F;
        bVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + this.f11980B;
        bVar.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() + ((long) this.f11981C);
        if (z4) {
            if (jElapsedRealtime2 > jElapsedRealtime || !s(true)) {
                if (t()) {
                    o(64, false);
                }
                return false;
            }
            this.f11981C = Math.max(this.f11981C * 2, zzbbd.zzq.zzf);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [long] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    public A(m mVar, j jVar, Uri uri) {
        InputStream bufferedInputStream;
        InputStream inputStreamOpenInputStream;
        ?? r7;
        ?? r8;
        long statSize;
        this.f11986p = new AtomicLong(0L);
        this.f11989s = 262144;
        this.f11993w = null;
        this.f11994x = null;
        this.f11995y = null;
        this.f11996z = 0;
        this.f11981C = 0;
        D.i(uri);
        f fVar = mVar.f12045b;
        this.f11982l = mVar;
        this.f11992v = jVar;
        InterfaceC0893b interfaceC0893bB = fVar.b();
        this.f11987q = interfaceC0893bB;
        p026d4.b bVarA = fVar.a();
        this.f11988r = bVarA;
        this.f11983m = uri;
        this.f11980B = 60000L;
        Y3.i iVar = mVar.f12045b.f12012a;
        iVar.b();
        ?? r9 = iVar.f7663a;
        this.f11990t = new S4.e(r9, interfaceC0893bB, bVarA, fVar.f12016e);
        ?? r10 = -1;
        try {
            try {
                Y3.i iVar2 = mVar.f12045b.f12012a;
                iVar2.b();
                ContentResolver contentResolver = iVar2.f7663a.getContentResolver();
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            r9 = statSize;
                        } catch (IOException e7) {
                            e = e7;
                            Log.w("UploadTask", "could not retrieve file size for upload " + this.f11983m.toString(), e);
                            r9 = statSize;
                        } catch (NullPointerException e8) {
                            e = e8;
                            Log.w("UploadTask", "NullPointerException during file size calculation.", e);
                            r9 = -1;
                        }
                    } else {
                        r9 = -1;
                    }
                } catch (IOException e9) {
                    e = e9;
                    statSize = -1;
                } catch (NullPointerException e10) {
                    e = e10;
                }
                inputStreamOpenInputStream = contentResolver.openInputStream(this.f11983m);
                r7 = r9;
                if (inputStreamOpenInputStream != null) {
                    if (r9 == -1) {
                        try {
                            int iAvailable = inputStreamOpenInputStream.available();
                            if (iAvailable >= 0) {
                                r9 = iAvailable;
                            }
                        } catch (IOException unused) {
                        }
                    }
                    ?? r11 = r9;
                    try {
                        bufferedInputStream = new BufferedInputStream(inputStreamOpenInputStream);
                        r8 = r11;
                    } catch (FileNotFoundException e11) {
                        bufferedInputStream = inputStreamOpenInputStream;
                        e = e11;
                        r10 = r11;
                        Log.e("UploadTask", "could not locate file for uploading:" + this.f11983m.toString());
                        this.f11994x = e;
                        r8 = r10;
                    }
                    inputStreamOpenInputStream = bufferedInputStream;
                    r7 = r8;
                }
            } catch (FileNotFoundException e12) {
                e = e12;
                bufferedInputStream = null;
                r10 = r9;
            }
        } catch (FileNotFoundException e13) {
            e = e13;
            bufferedInputStream = null;
        }
        this.f11984n = r7;
        this.f11985o = new S4.d(inputStreamOpenInputStream);
        this.f11991u = true;
        this.f11993w = null;
    }
}
