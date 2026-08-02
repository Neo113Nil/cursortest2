package v2;

import A1.L0;
import B4.InterfaceC0073q;
import E4.C0175h;
import E4.D;
import E4.O;
import I2.J;
import X5.v;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzfpq;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import u2.C1641s;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class n implements U3.a {

    /* renamed from: e, reason: collision with root package name */
    public static n f17133e;

    /* renamed from: f, reason: collision with root package name */
    public static HandlerThread f17134f;

    /* renamed from: x, reason: collision with root package name */
    public static Handler f17135x;

    /* renamed from: a, reason: collision with root package name */
    public int f17136a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17137b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17138c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17139d;

    public n(zzceb zzcebVar) {
        this.f17137b = zzcebVar.getLayoutParams();
        ViewParent parent = zzcebVar.getParent();
        this.f17139d = zzcebVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new H2.f("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f17138c = viewGroup;
        this.f17136a = viewGroup.indexOfChild(zzcebVar.zzF());
        viewGroup.removeView(zzcebVar.zzF());
        zzcebVar.zzaq(true);
    }

    public static void a(n nVar, int i7) {
        synchronized (nVar.f17139d) {
            try {
                if (nVar.f17136a == i7) {
                    return;
                }
                nVar.f17136a = i7;
                Iterator it = ((CopyOnWriteArrayList) nVar.f17138c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C1641s c1641s = (C1641s) weakReference.get();
                    if (c1641s != null) {
                        c1641s.a(i7);
                    } else {
                        ((CopyOnWriteArrayList) nVar.f17138c).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    public static void b(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i7 = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i7, sparseIntArray.get(i7) + 1);
            }
        }
    }

    public static synchronized n e(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (f17133e == null) {
                    f17133e = new n(context);
                }
                nVar = f17133e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public String c(int i7, String str, long j, long j3) {
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (true) {
            String[] strArr = (String[]) this.f17137b;
            int i9 = this.f17136a;
            if (i8 >= i9) {
                sb.append(strArr[i9]);
                return sb.toString();
            }
            sb.append(strArr[i8]);
            int i10 = ((int[]) this.f17138c)[i8];
            if (i10 == 1) {
                sb.append(str);
            } else {
                String[] strArr2 = (String[]) this.f17139d;
                if (i10 == 2) {
                    sb.append(String.format(Locale.US, strArr2[i8], Long.valueOf(j)));
                } else if (i10 == 3) {
                    sb.append(String.format(Locale.US, strArr2[i8], Integer.valueOf(i7)));
                } else if (i10 == 4) {
                    sb.append(String.format(Locale.US, strArr2[i8], Long.valueOf(j3)));
                }
            }
            i8++;
        }
    }

    public void d(boolean z4, v vVar, N6.d dVar, boolean z7) {
        p3.f.k(dVar, "source");
        int min = Math.min(vVar.f7629c, ((v) vVar.f7633g.f17139d).f7629c);
        N6.d dVar2 = vVar.f7627a;
        boolean z8 = dVar2.f4797b > 0;
        int i7 = (int) dVar.f4797b;
        if (z8 || min < i7) {
            if (!z8 && min > 0) {
                vVar.b(min, dVar, false);
            }
            dVar2.m(dVar, (int) dVar.f4797b);
            vVar.f7632f = z4 | vVar.f7632f;
        } else {
            vVar.b(i7, dVar, z4);
        }
        if (z7) {
            try {
                ((X5.d) this.f17138c).flush();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public int f() {
        int i7;
        synchronized (this.f17139d) {
            i7 = this.f17136a;
        }
        return i7;
    }

    public void g(List list) {
        Iterator it = list.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            O o7 = (O) it.next();
            C0175h c0175h = (C0175h) ((HashMap) this.f17138c).get(o7.f2156a);
            if (c0175h != null) {
                Iterator it2 = c0175h.f2185a.iterator();
                while (it2.hasNext()) {
                    if (((D) it2.next()).b(o7)) {
                        z4 = true;
                    }
                }
                c0175h.f2186b = o7;
            }
        }
        if (z4) {
            h();
        }
    }

    public void h() {
        Iterator it = ((HashSet) this.f17139d).iterator();
        while (it.hasNext()) {
            ((InterfaceC0073q) it.next()).a(null, null);
        }
    }

    public void i(v vVar, int i7) {
        if (vVar == null) {
            ((v) this.f17139d).a(i7);
            j();
            return;
        }
        vVar.a(i7);
        d1.n nVar = new d1.n();
        vVar.c(Math.min(vVar.f7629c, ((v) vVar.f7633g.f17139d).f7629c), nVar);
        if (nVar.f12365a > 0) {
            try {
                ((X5.d) this.f17138c).flush();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void j() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f17137b
            X5.m r0 = (X5.m) r0
            X5.v[] r1 = r0.k()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f17139d
            X5.v r2 = (X5.v) r2
            int r2 = r2.f7629c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f7629c
            N6.d r10 = r8.f7627a
            long r11 = r10.f4797b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f7630d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.f7630d
            int r11 = r11 + r9
            r8.f7630d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.f7629c
            long r10 = r10.f4797b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f7630d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            d1.n r1 = new d1.n
            r1.<init>()
            X5.v[] r0 = r0.k()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.f7630d
            r5.c(r6, r1)
            r5.f7630d = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f12365a
            if (r0 <= 0) goto L96
            java.lang.Object r0 = r13.f17138c     // Catch: java.io.IOException -> L8f
            X5.d r0 = (X5.d) r0     // Catch: java.io.IOException -> L8f
            r0.flush()     // Catch: java.io.IOException -> L8f
            goto L96
        L8f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.n.j():void");
    }

    @Override // U3.a
    public byte[] k(int i7, byte[] bArr) {
        if (i7 > this.f17136a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        W3.l lVar = (W3.l) this.f17137b;
        ((Mac) lVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) lVar.get()).doFinal(), i7);
    }

    public Looper l() {
        Looper looper;
        synchronized (this.f17139d) {
            try {
                if (this.f17136a != 0) {
                    com.google.android.gms.common.internal.D.j((HandlerThread) this.f17137b, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f17137b) == null) {
                    J.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f17137b = handlerThread;
                    handlerThread.start();
                    this.f17138c = new zzfpq(((HandlerThread) this.f17137b).getLooper());
                    J.k("Looper thread started.");
                } else {
                    J.k("Resuming the looper thread");
                    this.f17139d.notifyAll();
                }
                this.f17136a++;
                looper = ((HandlerThread) this.f17137b).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r4.equals("HMACSHA256") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(String str, SecretKeySpec secretKeySpec) {
        W3.l lVar = new W3.l(this);
        this.f17137b = lVar;
        char c3 = 2;
        if (AbstractC1663a.b(2)) {
            this.f17138c = str;
            this.f17139d = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 392315118:
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        this.f17136a = 20;
                        break;
                    case 1:
                        this.f17136a = 28;
                        break;
                    case 2:
                        this.f17136a = 32;
                        break;
                    case 3:
                        this.f17136a = 48;
                        break;
                    case 4:
                        this.f17136a = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                lVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public n(Context context) {
        this.f17137b = new Handler(Looper.getMainLooper());
        this.f17138c = new CopyOnWriteArrayList();
        this.f17139d = new Object();
        this.f17136a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new L0(this, 6), intentFilter);
    }
}
