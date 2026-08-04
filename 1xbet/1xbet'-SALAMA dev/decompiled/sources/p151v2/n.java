package p151v2;

import A1.L0;
import B4.InterfaceC0073q;
import E4.C0175h;
import E4.D;
import E4.O;
import H2.f;
import I2.J;
import N6.d;
import U3.a;
import W3.l;
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
import p146u2.C0959s;

/* JADX INFO: loaded from: classes.dex */
public final class n implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static n f17139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static HandlerThread f17140f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Handler f17141x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17145d;

    public n(zzceb zzcebVar) throws f {
        this.f17143b = zzcebVar.getLayoutParams();
        ViewParent parent = zzcebVar.getParent();
        this.f17145d = zzcebVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new f("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f17144c = viewGroup;
        this.f17142a = viewGroup.indexOfChild(zzcebVar.zzF());
        viewGroup.removeView(zzcebVar.zzF());
        zzcebVar.zzaq(true);
    }

    public static void a(n nVar, int i7) {
        synchronized (nVar.f17145d) {
            try {
                if (nVar.f17142a == i7) {
                    return;
                }
                nVar.f17142a = i7;
                for (WeakReference weakReference : (CopyOnWriteArrayList) nVar.f17144c) {
                    C0959s c0959s = (C0959s) weakReference.get();
                    if (c0959s != null) {
                        c0959s.a(i7);
                    } else {
                        ((CopyOnWriteArrayList) nVar.f17144c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
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
        try {
            if (f17139e == null) {
                f17139e = new n(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17139e;
    }

    public String c(int i7, String str, long j, long j3) {
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (true) {
            String[] strArr = (String[]) this.f17143b;
            int i9 = this.f17142a;
            if (i8 >= i9) {
                sb.append(strArr[i9]);
                return sb.toString();
            }
            sb.append(strArr[i8]);
            int i10 = ((int[]) this.f17144c)[i8];
            if (i10 == 1) {
                sb.append(str);
            } else {
                String[] strArr2 = (String[]) this.f17145d;
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

    public void d(boolean z4, v vVar, d dVar, boolean z7) {
        p113p3.f.k(dVar, "source");
        int iMin = Math.min(vVar.f7629c, ((v) vVar.f7633g.f17145d).f7629c);
        d dVar2 = vVar.f7627a;
        boolean z8 = dVar2.f4797b > 0;
        int i7 = (int) dVar.f4797b;
        if (z8 || iMin < i7) {
            if (!z8 && iMin > 0) {
                vVar.b(iMin, dVar, false);
            }
            dVar2.m(dVar, (int) dVar.f4797b);
            vVar.f7632f = z4 | vVar.f7632f;
        } else {
            vVar.b(i7, dVar, z4);
        }
        if (z7) {
            try {
                ((X5.d) this.f17144c).flush();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public int f() {
        int i7;
        synchronized (this.f17145d) {
            i7 = this.f17142a;
        }
        return i7;
    }

    public void g(List list) {
        Iterator it = list.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            O o7 = (O) it.next();
            C0175h c0175h = (C0175h) ((HashMap) this.f17144c).get(o7.f2156a);
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
        Iterator it = ((HashSet) this.f17145d).iterator();
        while (it.hasNext()) {
            ((InterfaceC0073q) it.next()).a(null, null);
        }
    }

    public void i(v vVar, int i7) {
        if (vVar == null) {
            ((v) this.f17145d).a(i7);
            j();
            return;
        }
        vVar.a(i7);
        p023d1.n nVar = new p023d1.n();
        vVar.c(Math.min(vVar.f7629c, ((v) vVar.f7633g.f17145d).f7629c), nVar);
        if (nVar.f12371a > 0) {
            try {
                ((X5.d) this.f17144c).flush();
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
            java.lang.Object r0 = r13.f17143b
            X5.m r0 = (X5.m) r0
            X5.v[] r1 = r0.k()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f17145d
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
            int r0 = r1.f12371a
            if (r0 <= 0) goto L96
            java.lang.Object r0 = r13.f17144c     // Catch: java.io.IOException -> L8f
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
        throw new UnsupportedOperationException("Method not decompiled: p151v2.n.j():void");
    }

    @Override // U3.a
    public byte[] k(int i7, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i7 > this.f17142a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        l lVar = (l) this.f17143b;
        ((Mac) lVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) lVar.get()).doFinal(), i7);
    }

    public Looper l() {
        Looper looper;
        synchronized (this.f17145d) {
            try {
                if (this.f17142a != 0) {
                    com.google.android.gms.common.internal.D.j((HandlerThread) this.f17143b, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f17143b) == null) {
                    J.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f17143b = handlerThread;
                    handlerThread.start();
                    this.f17144c = new zzfpq(((HandlerThread) this.f17143b).getLooper());
                    J.k("Looper thread started.");
                } else {
                    J.k("Resuming the looper thread");
                    this.f17145d.notifyAll();
                }
                this.f17142a++;
                looper = ((HandlerThread) this.f17143b).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public n(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        l lVar = new l(this);
        this.f17143b = lVar;
        if (p150v0.a.b(2)) {
            this.f17144c = str;
            this.f17145d = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str) {
                    case "HMACSHA1":
                        this.f17142a = 20;
                        break;
                    case "HMACSHA224":
                        this.f17142a = 28;
                        break;
                    case "HMACSHA256":
                        this.f17142a = 32;
                        break;
                    case "HMACSHA384":
                        this.f17142a = 48;
                        break;
                    case "HMACSHA512":
                        this.f17142a = 64;
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
        this.f17143b = new Handler(Looper.getMainLooper());
        this.f17144c = new CopyOnWriteArrayList();
        this.f17145d = new Object();
        this.f17142a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new L0(this, 6), intentFilter);
    }
}
