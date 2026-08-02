package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1368o5 extends AbstractCallableC1817y5 {

    /* renamed from: k, reason: collision with root package name */
    public static final Mt f14765k = new Mt(6);

    /* renamed from: h, reason: collision with root package name */
    public final C0786b4 f14766h;
    public final Context i;

    /* renamed from: j, reason: collision with root package name */
    public final C0905dr f14767j;

    public C1368o5(C0965f5 c0965f5, C0919e4 c0919e4, int i, Context context, C0786b4 c0786b4, C0905dr c0905dr) {
        super(c0965f5, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", c0919e4, i, 27);
        this.i = context;
        this.f14766h = c0786b4;
        this.f14767j = c0905dr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ea, code lost:
    
        r4.f16543g.equals("E");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:4:0x0010, B:6:0x0018, B:8:0x001e, B:13:0x002a, B:15:0x0034, B:18:0x00f6, B:19:0x00fc, B:35:0x0042, B:37:0x0048, B:38:0x00f3, B:39:0x004e, B:41:0x0075, B:42:0x007b, B:44:0x0081, B:47:0x0089, B:52:0x0095, B:54:0x0097, B:56:0x009b, B:59:0x00a6, B:60:0x00ad, B:61:0x00ab, B:62:0x00b0, B:64:0x00b6, B:66:0x00bc, B:70:0x00a0, B:73:0x00c3, B:75:0x00e0, B:80:0x00ea), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #2 {all -> 0x003f, blocks: (B:4:0x0010, B:6:0x0018, B:8:0x001e, B:13:0x002a, B:15:0x0034, B:18:0x00f6, B:19:0x00fc, B:35:0x0042, B:37:0x0048, B:38:0x00f3, B:39:0x004e, B:41:0x0075, B:42:0x007b, B:44:0x0081, B:47:0x0089, B:52:0x0095, B:54:0x0097, B:56:0x009b, B:59:0x00a6, B:60:0x00ad, B:61:0x00ab, B:62:0x00b0, B:64:0x00b6, B:66:0x00bc, B:70:0x00a0, B:73:0x00c3, B:75:0x00e0, B:80:0x00ea), top: B:3:0x0010 }] */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C1861z4 c1861z4;
        boolean z3;
        C1861z4 c1861z42;
        boolean z5;
        boolean z6 = true;
        AtomicReference d5 = f14765k.d(this.i.getPackageName());
        synchronized (d5) {
            try {
                C1861z4 c1861z43 = (C1861z4) d5.get();
                if (c1861z43 != null) {
                    String str = c1861z43.f16543g;
                    char[] cArr = AbstractC1055h5.f13710a;
                    if (str != null && !str.isEmpty()) {
                        z5 = false;
                        if (!z5) {
                            if (!c1861z43.f16543g.equals("E")) {
                                if (!c1861z43.f16543g.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                                }
                                c1861z42 = (C1861z4) d5.get();
                            }
                        }
                    }
                    z5 = true;
                    if (!z5) {
                    }
                }
                char[] cArr2 = AbstractC1055h5.f13710a;
                if (this.f14767j != null) {
                    c1861z4 = d();
                } else {
                    Boolean valueOf = Boolean.valueOf(!this.f14766h.y());
                    A7 a7 = F7.s2;
                    Q2.r rVar = Q2.r.f5053d;
                    Boolean bool = (Boolean) rVar.f5056c.a(a7);
                    String c5 = ((Boolean) rVar.f5056c.a(F7.f8891r2)).booleanValue() ? c() : null;
                    if (bool.booleanValue() && this.f16391a.f13450o) {
                        if (c5 != null && !c5.isEmpty()) {
                            z3 = false;
                            if (z3) {
                                C0965f5 c0965f5 = this.f16391a;
                                try {
                                    U4 u42 = c0965f5.f13447l;
                                    if ((u42 != null ? (RunnableFutureC0823bx) u42.f11722l : c0965f5.f13446k) != null) {
                                        (u42 != null ? (RunnableFutureC0823bx) u42.f11722l : c0965f5.f13446k).get();
                                    }
                                    C1367o4 b3 = c0965f5.b();
                                    if (b3 != null && b3.g0()) {
                                        c5 = b3.u0();
                                    }
                                } catch (InterruptedException | ExecutionException unused) {
                                }
                                c5 = null;
                            }
                        }
                        z3 = true;
                        if (z3) {
                        }
                    }
                    C1861z4 c1861z44 = new C1861z4((String) this.f16395e.invoke(null, this.i, valueOf, c5));
                    String str2 = c1861z44.f16543g;
                    if (str2 != null && !str2.isEmpty()) {
                        z6 = false;
                    }
                    c1861z4 = c1861z44;
                }
                d5.set(c1861z4);
                c1861z42 = (C1861z4) d5.get();
            } finally {
            }
        }
        synchronized (this.f16394d) {
            if (c1861z42 != null) {
                try {
                    C0919e4 c0919e4 = this.f16394d;
                    String str3 = c1861z42.f16543g;
                    c0919e4.e();
                    C1367o4.B((C1367o4) c0919e4.f10141l, str3);
                    C0919e4 c0919e42 = this.f16394d;
                    long j5 = c1861z42.f16544h;
                    c0919e42.e();
                    C1367o4.c0((C1367o4) c0919e42.f10141l, j5);
                    C0919e4 c0919e43 = this.f16394d;
                    String str4 = c1861z42.i;
                    c0919e43.e();
                    C1367o4.e0((C1367o4) c0919e43.f10141l, str4);
                    C0919e4 c0919e44 = this.f16394d;
                    String str5 = c1861z42.f16545j;
                    c0919e44.e();
                    C1367o4.D0((C1367o4) c0919e44.f10141l, str5);
                    C0919e4 c0919e45 = this.f16394d;
                    String str6 = c1861z42.f16546k;
                    c0919e45.e();
                    C1367o4.A((C1367o4) c0919e45.f10141l, str6);
                } finally {
                }
            }
        }
    }

    public final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            A7 a7 = F7.f8902t2;
            Q2.r rVar = Q2.r.f5053d;
            byte[] b3 = AbstractC1055h5.b((String) rVar.f5056c.a(a7));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(b3)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(AbstractC1055h5.b((String) rVar.f5056c.a(F7.f8908u2)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            this.f16391a.getClass();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            Xw xw = new Xw();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new B4(xw));
            return (String) xw.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final C1861z4 d() {
        String str;
        RunnableFutureC0823bx runnableFutureC0823bx;
        A7 a7 = F7.f8679E2;
        Q2.r rVar = Q2.r.f5053d;
        int intValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue() ? ((Integer) rVar.f5056c.a(F7.f8708J2)).intValue() : this.f14766h.w();
        C1861z4 c1861z4 = new C1861z4((String) this.f16395e.invoke(null, this.i, Boolean.FALSE, ""));
        C0905dr c0905dr = this.f14767j;
        if (c0905dr != null && (runnableFutureC0823bx = (RunnableFutureC0823bx) c0905dr.f13186l) != null) {
            try {
                str = (String) runnableFutureC0823bx.get(intValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            c1861z4.f16543g = str;
            return c1861z4;
        }
        str = "E";
        c1861z4.f16543g = str;
        return c1861z4;
    }
}
