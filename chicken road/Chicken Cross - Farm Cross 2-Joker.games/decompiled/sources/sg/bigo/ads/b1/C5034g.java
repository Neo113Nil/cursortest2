package sg.bigo.ads.b1;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;
import sg.bigo.ads.K0.F;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.c1.C5054a;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.b1.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5034g implements m {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.U.h f12698a;
    public final sg.bigo.ads.N.d b;
    public final sg.bigo.ads.T0.p c;
    public final sg.bigo.ads.P0.d d;
    public final int e;

    public C5034g(u uVar, sg.bigo.ads.N.d dVar, sg.bigo.ads.T0.p pVar, sg.bigo.ads.P0.d dVar2) {
        this.f12698a = uVar;
        this.b = dVar;
        this.c = pVar;
        this.d = dVar2;
        uVar.getClass();
        String f = uVar.f();
        String g = uVar.g();
        sg.bigo.ads.N.c cVar = dVar.h;
        cVar.c = "";
        cVar.d = f;
        cVar.e = g;
        this.e = sg.bigo.ads.G0.a.f12309a.incrementAndGet();
    }

    @Override // sg.bigo.ads.b1.m
    public final int a() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
    
        if (r3 != null) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // sg.bigo.ads.b1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        sg.bigo.ads.P0.d dVar;
        String str;
        byte[] a2;
        String str2;
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        BufferedReader bufferedReader;
        StringBuilder sb;
        String sb2;
        String str3 = this.b.b;
        if (TextUtils.isEmpty(str3)) {
            sg.bigo.ads.P0.d dVar2 = this.d;
            if (dVar2 != null) {
                dVar2.a(this.e, 1018, 10200, "An adm show be passed when constructing an ad request if using a server bidding slot.", this.c);
                return;
            }
            return;
        }
        int b = sg.bigo.ads.a0.o.b();
        sg.bigo.ads.N.d dVar3 = this.b;
        dVar3.h.g = b;
        if (this.f12698a != null) {
            String e = sg.bigo.ads.F0.a.e();
            sg.bigo.ads.N.c cVar = dVar3.h;
            if (cVar != null) {
                cVar.h = e;
            }
        }
        int[] iArr = new int[1];
        C5054a c5054a = null;
        c5054a = null;
        r6 = null;
        r6 = null;
        BufferedReader bufferedReader2 = null;
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str3)) {
                str2 = "cip error with empty.";
            } else if (TextUtils.isEmpty("FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F")) {
                str2 = "string error with empty.";
            } else {
                a2 = F.a(str3, (sg.bigo.ads.Q0.a) null);
                if (a2 == null) {
                    str2 = "cip error with empty content.";
                }
                if (a2 != null) {
                    iArr[0] = 1;
                } else {
                    try {
                        byteArrayInputStream = new ByteArrayInputStream(a2);
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        } catch (Exception unused) {
                            gZIPInputStream = null;
                            bufferedReader = null;
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPInputStream = null;
                        }
                    } catch (Exception unused2) {
                        gZIPInputStream = null;
                        byteArrayInputStream = null;
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                        gZIPInputStream = null;
                        byteArrayInputStream = null;
                    }
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                        try {
                            try {
                                sb = new StringBuilder();
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine != null) {
                                            sb.append(readLine);
                                        } else {
                                            try {
                                                break;
                                            } catch (IOException unused3) {
                                            }
                                        }
                                    } catch (Exception unused4) {
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                        if (gZIPInputStream != null) {
                                            try {
                                                gZIPInputStream.close();
                                            } catch (IOException unused6) {
                                            }
                                        }
                                    }
                                }
                                bufferedReader.close();
                                try {
                                    gZIPInputStream.close();
                                } catch (IOException unused7) {
                                }
                            } catch (Exception unused8) {
                                sb = 0;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused9) {
                                }
                            }
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (IOException unused10) {
                                }
                            }
                            if (byteArrayInputStream == null) {
                                throw th;
                            }
                            try {
                                byteArrayInputStream.close();
                                throw th;
                            } catch (IOException unused11) {
                                throw th;
                            }
                        }
                    } catch (Exception unused12) {
                        bufferedReader = null;
                        sb = bufferedReader;
                        if (bufferedReader != null) {
                        }
                        if (gZIPInputStream != null) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused13) {
                    }
                    sb2 = sb == 0 ? null : sb.toString();
                    if (TextUtils.isEmpty(sb2)) {
                        iArr[0] = 2;
                    }
                    if (!TextUtils.isEmpty(sb2)) {
                        c5054a = new C5054a(sb2);
                    }
                }
                sb2 = null;
                if (!TextUtils.isEmpty(sb2)) {
                }
            }
            AbstractC5496a.a("a", str2);
            a2 = null;
            if (a2 != null) {
            }
            sb2 = null;
            if (!TextUtils.isEmpty(sb2)) {
            }
        }
        if (c5054a == null || c5054a.f12705a != 1) {
            if (c5054a == null) {
                int i = iArr[0];
                String str4 = i == 1 ? "Invalid payload response." : i == 2 ? "Invalid payload data." : "Unknown payload error.";
                sg.bigo.ads.P0.d dVar4 = this.d;
                if (dVar4 != null) {
                    dVar4.a(this.e, 1005, 10201, str4, this.c);
                    return;
                }
                return;
            }
            if (c5054a.f12705a == -14) {
                sg.bigo.ads.F0.b.b("sp_ads", "sp_gzip_server_fail", Long.valueOf(System.currentTimeMillis()), 1);
            }
            int i2 = c5054a.f12705a;
            String str5 = c5054a.b;
            sg.bigo.ads.P0.d dVar5 = this.d;
            if (dVar5 != null) {
                dVar5.a(this.e, 1005, i2, str5, this.c);
                return;
            }
            return;
        }
        String str6 = c5054a.c;
        HashMap hashMap = c5054a.d;
        if (this.d != null) {
            Object obj = hashMap.get("logid");
            sg.bigo.ads.U0.b a3 = sg.bigo.ads.U0.b.a(obj instanceof Long ? ((Long) obj).longValue() : 0L, this.b.h, this.c, str6);
            if (a3 == null) {
                dVar = this.d;
                if (dVar == null) {
                    return;
                } else {
                    str = "Empty ad data.";
                }
            } else {
                if (TextUtils.equals(a3.c.l, a3.R)) {
                    this.d.a(this.e, this.b, a3);
                    return;
                }
                dVar = this.d;
                if (dVar == null) {
                    return;
                } else {
                    str = "Unmatched slot of ad data.";
                }
            }
            dVar.a(this.e, 1005, 0, str, this.c);
        }
    }

    @Override // sg.bigo.ads.b1.m
    public final sg.bigo.ads.N.d c() {
        return this.b;
    }

    @Override // sg.bigo.ads.b1.m
    public final sg.bigo.ads.T0.p d() {
        return this.c;
    }
}
