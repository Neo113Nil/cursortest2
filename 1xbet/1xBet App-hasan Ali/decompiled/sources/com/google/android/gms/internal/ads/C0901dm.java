package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901dm implements Iz {

    /* renamed from: e, reason: collision with root package name */
    public static C0901dm f13163e;

    /* renamed from: a, reason: collision with root package name */
    public int f13164a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13165b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13166c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13167d;

    public C0901dm() {
        this.f13167d = new Object();
        this.f13165b = null;
        this.f13166c = null;
        this.f13164a = 0;
    }

    public static synchronized C0901dm f(Context context) {
        C0901dm c0901dm;
        synchronized (C0901dm.class) {
            try {
                if (f13163e == null) {
                    f13163e = new C0901dm(context);
                }
                c0901dm = f13163e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0901dm;
    }

    public static /* synthetic */ void h(C0901dm c0901dm, int i) {
        synchronized (c0901dm.f13167d) {
            try {
                if (c0901dm.f13164a == i) {
                    return;
                }
                c0901dm.f13164a = i;
                Iterator it = ((CopyOnWriteArrayList) c0901dm.f13166c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C1470qH c1470qH = (C1470qH) weakReference.get();
                    if (c1470qH != null) {
                        C1514rH.b(c1470qH.f15121a, i);
                    } else {
                        ((CopyOnWriteArrayList) c0901dm.f13166c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Iz
    public byte[] a(int i, byte[] bArr) {
        if (i > this.f13164a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        C1329nB c1329nB = (C1329nB) this.f13165b;
        ((Mac) c1329nB.get()).update(bArr);
        return Arrays.copyOf(((Mac) c1329nB.get()).doFinal(), i);
    }

    public int b() {
        int i;
        synchronized (this.f13167d) {
            i = this.f13164a;
        }
        return i;
    }

    public Looper c() {
        Looper looper;
        synchronized (this.f13167d) {
            try {
                if (((Looper) this.f13165b) == null) {
                    boolean z3 = false;
                    if (this.f13164a == 0 && ((HandlerThread) this.f13166c) == null) {
                        z3 = true;
                    }
                    AbstractC1668us.a0(z3);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f13166c = handlerThread;
                    handlerThread.start();
                    this.f13165b = ((HandlerThread) this.f13166c).getLooper();
                }
                this.f13164a++;
                looper = (Looper) this.f13165b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r10 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(C1862z5 c1862z5, C1543s1 c1543s1) {
        boolean z3;
        B5 e3;
        B5 e5;
        boolean z5;
        String E5 = c1862z5.x().E();
        byte[] c5 = c1862z5.z().c();
        byte[] c6 = c1862z5.y().c();
        if (!TextUtils.isEmpty(E5) && c6 != null && c6.length != 0) {
            File file = (File) this.f13166c;
            AbstractC0952et.T(file);
            file.mkdirs();
            AbstractC0952et.M(file, E5).mkdirs();
            File D5 = AbstractC0952et.D(E5, "pcam.jar", file);
            if ((c5 == null || c5.length <= 0 || AbstractC0952et.Z(D5, c5)) && AbstractC0952et.Z(AbstractC0952et.D(E5, "pcbc", file), c6)) {
                File D6 = AbstractC0952et.D(c1862z5.x().E(), "pcam.jar", file);
                if (D6.exists() && c1543s1 != null) {
                    try {
                        z5 = C1543s1.t(D6);
                    } catch (GeneralSecurityException unused) {
                        z5 = false;
                    }
                }
                String E6 = c1862z5.x().E();
                if (!TextUtils.isEmpty(E6)) {
                    File D7 = AbstractC0952et.D(E6, "pcam.jar", file);
                    File D8 = AbstractC0952et.D(E6, "pcbc", file);
                    File D9 = AbstractC0952et.D(E6, "pcam.jar", i());
                    File D10 = AbstractC0952et.D(E6, "pcbc", i());
                    if ((!D7.exists() || D7.renameTo(D9)) && D8.exists() && D8.renameTo(D10)) {
                        A5 z6 = B5.z();
                        String E7 = c1862z5.x().E();
                        z6.e();
                        B5.J((B5) z6.f10141l, E7);
                        String D11 = c1862z5.x().D();
                        z6.e();
                        B5.F((B5) z6.f10141l, D11);
                        long w5 = c1862z5.x().w();
                        z6.e();
                        B5.G((B5) z6.f10141l, w5);
                        long y5 = c1862z5.x().y();
                        z6.e();
                        B5.I((B5) z6.f10141l, y5);
                        long x5 = c1862z5.x().x();
                        z6.e();
                        B5.H((B5) z6.f10141l, x5);
                        B5 b5 = (B5) z6.b();
                        B5 e6 = e(1);
                        SharedPreferences.Editor edit = ((SharedPreferences) this.f13167d).edit();
                        int i = this.f13164a;
                        if (e6 != null && !b5.E().equals(e6.E())) {
                            StringBuilder sb = new StringBuilder("FBAMTD");
                            sb.append(i - 1);
                            edit.putString(sb.toString(), AbstractC2309b.b(e6.d()));
                        }
                        StringBuilder sb2 = new StringBuilder("LATMTD");
                        sb2.append(i - 1);
                        edit.putString(sb2.toString(), AbstractC2309b.b(b5.d()));
                        if (edit.commit()) {
                            z3 = true;
                            HashSet hashSet = new HashSet();
                            e3 = e(1);
                            if (e3 != null) {
                                hashSet.add(e3.E());
                            }
                            e5 = e(2);
                            if (e5 != null) {
                                hashSet.add(e5.E());
                            }
                            for (File file2 : i().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    AbstractC0952et.T(AbstractC0952et.M(i(), name));
                                }
                            }
                            return z3;
                        }
                    }
                }
                z3 = false;
                HashSet hashSet2 = new HashSet();
                e3 = e(1);
                if (e3 != null) {
                }
                e5 = e(2);
                if (e5 != null) {
                }
                while (r4 < r1) {
                }
                return z3;
            }
        }
        return false;
    }

    public B5 e(int i) {
        String string;
        int i5 = this.f13164a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f13167d;
        if (i == 1) {
            StringBuilder sb = new StringBuilder("LATMTD");
            sb.append(i5 - 1);
            string = sharedPreferences.getString(sb.toString(), null);
        } else {
            StringBuilder sb2 = new StringBuilder("FBAMTD");
            sb2.append(i5 - 1);
            string = sharedPreferences.getString(sb2.toString(), null);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] i6 = AbstractC2309b.i(string);
                B5 B5 = B5.B(AbstractC1823yB.r(i6, 0, i6.length));
                String E5 = B5.E();
                File D5 = AbstractC0952et.D(E5, "pcam.jar", i());
                if (!D5.exists()) {
                    D5 = AbstractC0952et.D(E5, "pcam", i());
                }
                File D6 = AbstractC0952et.D(E5, "pcbc", i());
                if (D5.exists()) {
                    if (D6.exists()) {
                        return B5;
                    }
                }
            } catch (XB unused) {
            }
        }
        return null;
    }

    public void g() {
        HandlerThread handlerThread;
        synchronized (this.f13167d) {
            try {
                AbstractC1668us.a0(this.f13164a > 0);
                int i = this.f13164a - 1;
                this.f13164a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f13166c) != null) {
                    handlerThread.quit();
                    this.f13166c = null;
                    this.f13165b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public File i() {
        File file = new File((File) this.f13165b, Integer.toString(this.f13164a - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public C0901dm(Xu xu, Ps ps) {
        RE re = new RE(14);
        this.f13165b = xu;
        this.f13166c = ps;
        this.f13167d = re;
        this.f13164a = 1048576;
    }

    public C0901dm(Context context) {
        this.f13165b = new Handler(Looper.getMainLooper());
        this.f13166c = new CopyOnWriteArrayList();
        this.f13167d = new Object();
        this.f13164a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new T2.E(4, this), intentFilter);
    }

    public C0901dm(Context context, int i) {
        this.f13167d = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        AbstractC0952et.p(dir, false);
        this.f13165b = dir;
        File dir2 = context.getDir("tmppccache", 0);
        AbstractC0952et.p(dir2, true);
        this.f13166c = dir2;
        this.f13164a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C0901dm(String str, SecretKeySpec secretKeySpec) {
        char c5;
        int i;
        C1329nB c1329nB = new C1329nB(this);
        this.f13165b = c1329nB;
        if (AbstractC0952et.s(2)) {
            this.f13166c = str;
            this.f13167d = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                if (c5 == 0) {
                    i = 20;
                } else if (c5 == 1) {
                    i = 28;
                } else if (c5 == 2) {
                    i = 32;
                } else if (c5 == 3) {
                    i = 48;
                } else {
                    if (c5 != 4) {
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                    }
                    i = 64;
                }
                this.f13164a = i;
                c1329nB.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
