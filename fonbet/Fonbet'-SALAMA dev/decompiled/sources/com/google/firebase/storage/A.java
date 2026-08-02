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
import d4.InterfaceC0965b;
import f4.InterfaceC1090b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class A extends s {

    /* renamed from: D, reason: collision with root package name */
    public static final Random f11976D = new Random();

    /* renamed from: E, reason: collision with root package name */
    public static final M4.e f11977E = new M4.e();

    /* renamed from: F, reason: collision with root package name */
    public static final m3.b f11978F = m3.b.f15248a;

    /* renamed from: A, reason: collision with root package name */
    public volatile String f11979A;

    /* renamed from: B, reason: collision with root package name */
    public volatile long f11980B;

    /* renamed from: C, reason: collision with root package name */
    public int f11981C;

    /* renamed from: l, reason: collision with root package name */
    public final m f11982l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f11983m;

    /* renamed from: n, reason: collision with root package name */
    public final long f11984n;

    /* renamed from: o, reason: collision with root package name */
    public final S4.d f11985o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicLong f11986p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1090b f11987q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0965b f11988r;

    /* renamed from: s, reason: collision with root package name */
    public int f11989s;

    /* renamed from: t, reason: collision with root package name */
    public final S4.e f11990t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f11991u;

    /* renamed from: v, reason: collision with root package name */
    public volatile j f11992v;

    /* renamed from: w, reason: collision with root package name */
    public volatile Uri f11993w;

    /* renamed from: x, reason: collision with root package name */
    public volatile Exception f11994x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Exception f11995y;

    /* renamed from: z, reason: collision with root package name */
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
        InterfaceC1090b b7 = fVar.b();
        this.f11987q = b7;
        InterfaceC0965b a2 = fVar.a();
        this.f11988r = a2;
        this.f11983m = null;
        this.f11985o = new S4.d(new ByteArrayInputStream(bArr));
        this.f11991u = true;
        this.f11980B = 60000L;
        Y3.i iVar = fVar.f12012a;
        iVar.b();
        this.f11990t = new S4.e(iVar.f7663a, b7, a2, fVar.f12016e);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    @Override // com.google.firebase.storage.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        if (!TextUtils.isEmpty(path)) {
            if (!path.equals("/")) {
                int lastIndexOf = path.lastIndexOf(47);
                mVar = new m(uri.buildUpon().path(lastIndexOf != -1 ? path.substring(0, lastIndexOf) : "/").build(), mVar2.f12045b);
                if (mVar == null) {
                    this.f11994x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
                }
                if (this.f11994x == null) {
                    return;
                }
                if (this.f11993w == null) {
                    String str = this.f11992v != null ? (String) this.f11992v.f12032d.f1064c : null;
                    if (this.f11983m != null && TextUtils.isEmpty(str)) {
                        Y3.i iVar = this.f11982l.f12045b.f12012a;
                        iVar.b();
                        str = iVar.f7663a.getContentResolver().getType(this.f11983m);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = "application/octet-stream";
                    }
                    T4.f fVar = new T4.f(this.f11982l.b(), this.f11982l.f12045b.f12012a, this.f11992v != null ? this.f11992v.a() : null, str);
                    this.f11990t.b(fVar, true);
                    if (r(fVar)) {
                        String j = fVar.j("X-Goog-Upload-URL");
                        if (!TextUtils.isEmpty(j)) {
                            this.f11993w = Uri.parse(j);
                        }
                    }
                } else {
                    s(false);
                }
                boolean u4 = u();
                while (u4) {
                    try {
                        this.f11985o.b(this.f11989s);
                        int min = Math.min(this.f11989s, this.f11985o.f6328c);
                        T4.e eVar = new T4.e(this.f11982l.b(), this.f11982l.f12045b.f12012a, this.f11993w, this.f11985o.f6327b, this.f11986p.get(), min, this.f11985o.f6329d);
                        if (q(eVar)) {
                            this.f11986p.getAndAdd(min);
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
                                dVar.a(min);
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
                    u4 = u();
                    if (u4) {
                        o(4, false);
                    }
                }
                if (!this.f11991u || this.f12066h == 16) {
                    return;
                }
                try {
                    this.f11985o.f6326a.close();
                    return;
                } catch (IOException e9) {
                    Log.e("UploadTask", "Unable to close stream.", e9);
                    return;
                }
            }
        }
        mVar = null;
        if (mVar == null) {
        }
        if (this.f11994x == null) {
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
            int nextInt = this.f11981C + f11976D.nextInt(250);
            eVar2.getClass();
            Thread.sleep(nextInt);
            String B7 = Q0.a.B(this.f11987q);
            String A7 = Q0.a.A(this.f11988r);
            Y3.i iVar = this.f11982l.f12045b.f12012a;
            iVar.b();
            eVar.n(iVar.f7663a, B7, A7);
            boolean r7 = r(eVar);
            if (r7) {
                this.f11981C = 0;
            }
            return r7;
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
            String B7 = Q0.a.B(this.f11987q);
            String A7 = Q0.a.A(this.f11988r);
            Y3.i iVar = this.f11982l.f12045b.f12012a;
            iVar.b();
            fVar.n(iVar.f7663a, B7, A7);
            if (!r(fVar)) {
                return false;
            }
        }
        if ("final".equals(fVar.j("X-Goog-Upload-Status"))) {
            this.f11994x = new IOException("The server has terminated the upload session");
            return false;
        }
        String j = fVar.j("X-Goog-Upload-Size-Received");
        long parseLong = !TextUtils.isEmpty(j) ? Long.parseLong(j) : 0L;
        long j3 = this.f11986p.get();
        if (j3 > parseLong) {
            this.f11994x = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        }
        if (j3 < parseLong) {
            try {
                if (this.f11985o.a((int) r9) != parseLong - j3) {
                    this.f11994x = new IOException("Unexpected end of stream encountered.");
                    return false;
                }
                if (!this.f11986p.compareAndSet(j3, parseLong)) {
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
        m3.b bVar = f11978F;
        bVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.f11980B;
        bVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() + this.f11981C;
        if (z4) {
            if (elapsedRealtime2 > elapsedRealtime || !s(true)) {
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
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A(m mVar, j jVar, Uri uri) {
        InputStream inputStream;
        InputStream inputStream2;
        ContentResolver contentResolver;
        long j;
        ParcelFileDescriptor openFileDescriptor;
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
        InterfaceC1090b b7 = fVar.b();
        this.f11987q = b7;
        InterfaceC0965b a2 = fVar.a();
        this.f11988r = a2;
        this.f11983m = uri;
        this.f11980B = 60000L;
        Y3.i iVar = mVar.f12045b.f12012a;
        iVar.b();
        ?? r52 = iVar.f7663a;
        this.f11990t = new S4.e(r52, b7, a2, fVar.f12016e);
        long j3 = -1;
        try {
            try {
                Y3.i iVar2 = mVar.f12045b.f12012a;
                iVar2.b();
                contentResolver = iVar2.f7663a.getContentResolver();
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                } catch (IOException e7) {
                    e = e7;
                    j = -1;
                } catch (NullPointerException e8) {
                    e = e8;
                }
            } catch (FileNotFoundException e9) {
                e = e9;
                inputStream = null;
                j3 = r52;
            }
        } catch (FileNotFoundException e10) {
            e = e10;
            inputStream = null;
        }
        if (openFileDescriptor != null) {
            j = openFileDescriptor.getStatSize();
            try {
                openFileDescriptor.close();
                r52 = j;
            } catch (IOException e11) {
                e = e11;
                Log.w("UploadTask", "could not retrieve file size for upload " + this.f11983m.toString(), e);
                r52 = j;
                inputStream2 = contentResolver.openInputStream(this.f11983m);
                long j7 = r52;
                if (inputStream2 != null) {
                }
                this.f11984n = j7;
                this.f11985o = new S4.d(inputStream2);
                this.f11991u = true;
                this.f11993w = null;
            } catch (NullPointerException e12) {
                e = e12;
                Log.w("UploadTask", "NullPointerException during file size calculation.", e);
                r52 = -1;
                inputStream2 = contentResolver.openInputStream(this.f11983m);
                long j72 = r52;
                if (inputStream2 != null) {
                }
                this.f11984n = j72;
                this.f11985o = new S4.d(inputStream2);
                this.f11991u = true;
                this.f11993w = null;
            }
            inputStream2 = contentResolver.openInputStream(this.f11983m);
            long j722 = r52;
            if (inputStream2 != null) {
                if (r52 == -1) {
                    try {
                        int available = inputStream2.available();
                        if (available >= 0) {
                            r52 = available;
                        }
                    } catch (IOException unused) {
                    }
                }
                j3 = r52;
                try {
                    inputStream = new BufferedInputStream(inputStream2);
                } catch (FileNotFoundException e13) {
                    inputStream = inputStream2;
                    e = e13;
                    Log.e("UploadTask", "could not locate file for uploading:" + this.f11983m.toString());
                    this.f11994x = e;
                    inputStream2 = inputStream;
                    j722 = j3;
                    this.f11984n = j722;
                    this.f11985o = new S4.d(inputStream2);
                    this.f11991u = true;
                    this.f11993w = null;
                }
                inputStream2 = inputStream;
                j722 = j3;
            }
            this.f11984n = j722;
            this.f11985o = new S4.d(inputStream2);
            this.f11991u = true;
            this.f11993w = null;
        }
        r52 = -1;
        inputStream2 = contentResolver.openInputStream(this.f11983m);
        long j7222 = r52;
        if (inputStream2 != null) {
        }
        this.f11984n = j7222;
        this.f11985o = new S4.d(inputStream2);
        this.f11991u = true;
        this.f11993w = null;
    }
}
