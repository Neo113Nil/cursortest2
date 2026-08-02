package com.google.android.gms.internal.ads;

import B.C0072a;
import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class EG {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f8494a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f8495b;

    /* renamed from: c, reason: collision with root package name */
    public final Fx f8496c;

    /* renamed from: d, reason: collision with root package name */
    public final HG f8497d;

    /* renamed from: e, reason: collision with root package name */
    public final H2.j f8498e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f8499g;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public Ww f8501j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0737a0 f8502k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8503l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ HG f8504m;
    public final C0072a f = new C0072a();

    /* renamed from: h, reason: collision with root package name */
    public boolean f8500h = true;

    public EG(HG hg, Uri uri, InterfaceC1402ov interfaceC1402ov, Fx fx, HG hg2, H2.j jVar) {
        this.f8504m = hg;
        this.f8494a = uri;
        this.f8495b = new FB(interfaceC1402ov);
        this.f8496c = fx;
        this.f8497d = hg2;
        this.f8498e = jVar;
        C1199kG.f14238a.getAndIncrement();
        this.f8501j = b(0L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:(5:15|16|17|18|(30:20|21|22|23|(1:25)(1:134)|26|(1:28)(1:133)|29|(1:31)(1:132)|32|(1:34)(1:131)|35|(4:37|38|39|(17:41|42|(1:44)|45|(1:122)(1:49)|50|(1:57)|58|(1:60)|61|(1:(3:63|64|(6:66|67|1bd|75|(4:77|78|79|80)(1:82)|81)(2:91|92))(1:121))|(3:94|(1:96)|97)|98|99|100|102|(2:104|105)(1:107))(2:123|124))|130|(0)|45|(1:47)|122|50|(3:52|55|57)|58|(0)|61|(2:(0)(0)|81)|(0)|98|99|100|102|(0)(0))(3:138|139|140))(1:147)|22|23|(0)(0)|26|(0)(0)|29|(0)(0)|32|(0)(0)|35|(0)|130|(0)|45|(0)|122|50|(0)|58|(0)|61|(2:(0)(0)|81)|(0)|98|99|100|102|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[LOOP:0: B:2:0x0004->B:107:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020a A[EDGE_INSN: B:121:0x020a->B:93:0x020a BREAK  A[LOOP:1: B:62:0x01b5->B:81:0x01b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[Catch: all -> 0x0174, TryCatch #3 {all -> 0x0174, blocks: (B:23:0x00a6, B:25:0x00b1, B:26:0x00bd, B:28:0x00c7, B:29:0x00d3, B:31:0x00dd, B:32:0x00e9, B:34:0x00f3, B:35:0x0105, B:37:0x010f, B:39:0x0115, B:44:0x0143, B:45:0x014a, B:47:0x0154, B:49:0x0158, B:50:0x0178, B:52:0x018f, B:55:0x0198, B:57:0x019c, B:58:0x01a0, B:60:0x01a4, B:124:0x011f, B:127:0x0135, B:140:0x0079, B:144:0x0094), top: B:22:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7 A[Catch: all -> 0x0174, TryCatch #3 {all -> 0x0174, blocks: (B:23:0x00a6, B:25:0x00b1, B:26:0x00bd, B:28:0x00c7, B:29:0x00d3, B:31:0x00dd, B:32:0x00e9, B:34:0x00f3, B:35:0x0105, B:37:0x010f, B:39:0x0115, B:44:0x0143, B:45:0x014a, B:47:0x0154, B:49:0x0158, B:50:0x0178, B:52:0x018f, B:55:0x0198, B:57:0x019c, B:58:0x01a0, B:60:0x01a4, B:124:0x011f, B:127:0x0135, B:140:0x0079, B:144:0x0094), top: B:22:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd A[Catch: all -> 0x0174, TryCatch #3 {all -> 0x0174, blocks: (B:23:0x00a6, B:25:0x00b1, B:26:0x00bd, B:28:0x00c7, B:29:0x00d3, B:31:0x00dd, B:32:0x00e9, B:34:0x00f3, B:35:0x0105, B:37:0x010f, B:39:0x0115, B:44:0x0143, B:45:0x014a, B:47:0x0154, B:49:0x0158, B:50:0x0178, B:52:0x018f, B:55:0x0198, B:57:0x019c, B:58:0x01a0, B:60:0x01a4, B:124:0x011f, B:127:0x0135, B:140:0x0079, B:144:0x0094), top: B:22:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3 A[Catch: all -> 0x0174, TryCatch #3 {all -> 0x0174, blocks: (B:23:0x00a6, B:25:0x00b1, B:26:0x00bd, B:28:0x00c7, B:29:0x00d3, B:31:0x00dd, B:32:0x00e9, B:34:0x00f3, B:35:0x0105, B:37:0x010f, B:39:0x0115, B:44:0x0143, B:45:0x014a, B:47:0x0154, B:49:0x0158, B:50:0x0178, B:52:0x018f, B:55:0x0198, B:57:0x019c, B:58:0x01a0, B:60:0x01a4, B:124:0x011f, B:127:0x0135, B:140:0x0079, B:144:0x0094), top: B:22:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #3 {all -> 0x0174, blocks: (B:23:0x00a6, B:25:0x00b1, B:26:0x00bd, B:28:0x00c7, B:29:0x00d3, B:31:0x00dd, B:32:0x00e9, B:34:0x00f3, B:35:0x0105, B:37:0x010f, B:39:0x0115, B:44:0x0143, B:45:0x014a, B:47:0x0154, B:49:0x0158, B:50:0x0178, B:52:0x018f, B:55:0x0198, B:57:0x019c, B:58:0x01a0, B:60:0x01a4, B:124:0x011f, B:127:0x0135, B:140:0x0079, B:144:0x0094), top: B:22:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143 A[Catch: all -> 0x0174, TryCatch #3 {all -> 0x0174, blocks: (B:23:0x00a6, B:25:0x00b1, B:26:0x00bd, B:28:0x00c7, B:29:0x00d3, B:31:0x00dd, B:32:0x00e9, B:34:0x00f3, B:35:0x0105, B:37:0x010f, B:39:0x0115, B:44:0x0143, B:45:0x014a, B:47:0x0154, B:49:0x0158, B:50:0x0178, B:52:0x018f, B:55:0x0198, B:57:0x019c, B:58:0x01a0, B:60:0x01a4, B:124:0x011f, B:127:0x0135, B:140:0x0079, B:144:0x0094), top: B:22:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154 A[Catch: all -> 0x0174, TryCatch #3 {all -> 0x0174, blocks: (B:23:0x00a6, B:25:0x00b1, B:26:0x00bd, B:28:0x00c7, B:29:0x00d3, B:31:0x00dd, B:32:0x00e9, B:34:0x00f3, B:35:0x0105, B:37:0x010f, B:39:0x0115, B:44:0x0143, B:45:0x014a, B:47:0x0154, B:49:0x0158, B:50:0x0178, B:52:0x018f, B:55:0x0198, B:57:0x019c, B:58:0x01a0, B:60:0x01a4, B:124:0x011f, B:127:0x0135, B:140:0x0079, B:144:0x0094), top: B:22:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f A[Catch: all -> 0x0174, TryCatch #3 {all -> 0x0174, blocks: (B:23:0x00a6, B:25:0x00b1, B:26:0x00bd, B:28:0x00c7, B:29:0x00d3, B:31:0x00dd, B:32:0x00e9, B:34:0x00f3, B:35:0x0105, B:37:0x010f, B:39:0x0115, B:44:0x0143, B:45:0x014a, B:47:0x0154, B:49:0x0158, B:50:0x0178, B:52:0x018f, B:55:0x0198, B:57:0x019c, B:58:0x01a0, B:60:0x01a4, B:124:0x011f, B:127:0x0135, B:140:0x0079, B:144:0x0094), top: B:22:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4 A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #3 {all -> 0x0174, blocks: (B:23:0x00a6, B:25:0x00b1, B:26:0x00bd, B:28:0x00c7, B:29:0x00d3, B:31:0x00dd, B:32:0x00e9, B:34:0x00f3, B:35:0x0105, B:37:0x010f, B:39:0x0115, B:44:0x0143, B:45:0x014a, B:47:0x0154, B:49:0x0158, B:50:0x0178, B:52:0x018f, B:55:0x0198, B:57:0x019c, B:58:0x01a0, B:60:0x01a4, B:124:0x011f, B:127:0x0135, B:140:0x0079, B:144:0x0094), top: B:22:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j5;
        boolean z3;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z5;
        List list5;
        int i5;
        InterfaceC1402ov interfaceC1402ov;
        C0 c02;
        InterfaceC1402ov interfaceC1402ov2;
        int i6;
        F f;
        int i7;
        int i8;
        int i9;
        while (!this.f8499g) {
            int i10 = 0;
            try {
                long j6 = this.f.f658a;
                Ww b3 = b(j6);
                this.f8501j = b3;
                long a5 = this.f8495b.a(b3);
                if (this.f8499g) {
                    Fx fx = this.f8496c;
                    if (fx.c() != -1) {
                        this.f.f658a = fx.c();
                    }
                    try {
                        this.f8495b.j();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (a5 != -1) {
                    a5 += j6;
                    HG hg = this.f8504m;
                    hg.f9392x.post(new CG(hg, 0));
                }
                long j7 = a5;
                HG hg2 = this.f8504m;
                Map b5 = this.f8495b.f8941k.b();
                List list6 = (List) b5.get("icy-br");
                try {
                    if (list6 != null) {
                        String str4 = (String) list6.get(0);
                        try {
                            i9 = Integer.parseInt(str4) * 1000;
                        } catch (NumberFormatException unused2) {
                            j5 = -1;
                            i9 = -1;
                        }
                        if (i9 > 0) {
                            j5 = -1;
                            z3 = true;
                            i = i9;
                            list = (List) b5.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z3 = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) b5.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z3 = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) b5.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z3 = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) b5.get("icy-pub");
                            if (list4 != null) {
                                z5 = ((String) list4.get(0)).equals("1");
                                z3 = true;
                            } else {
                                z5 = false;
                            }
                            list5 = (List) b5.get("icy-metaint");
                            if (list5 != null) {
                                String str5 = (String) list5.get(0);
                                try {
                                    i8 = Integer.parseInt(str5);
                                } catch (NumberFormatException unused3) {
                                    i8 = -1;
                                }
                                if (i8 > 0) {
                                    z3 = true;
                                    i5 = i8;
                                    hg2.f9394z = z3 ? new C0(i, i5, str, str2, str3, z5) : null;
                                    interfaceC1402ov = this.f8495b;
                                    c02 = this.f8504m.f9394z;
                                    if (c02 != null || (i7 = c02.f7929p) == -1) {
                                        interfaceC1402ov2 = interfaceC1402ov;
                                    } else {
                                        InterfaceC1402ov c1154jG = new C1154jG(interfaceC1402ov, i7, this);
                                        HG hg3 = this.f8504m;
                                        hg3.getClass();
                                        InterfaceC0737a0 q5 = hg3.q(new GG(0, true));
                                        this.f8502k = q5;
                                        q5.e(HG.f9357Y);
                                        interfaceC1402ov2 = c1154jG;
                                    }
                                    this.f8496c.k(interfaceC1402ov2, this.f8494a, this.f8495b.f8941k.b(), j6, j7, this.f8497d);
                                    if (this.f8504m.f9394z != null && (f = (F) this.f8496c.f9143k) != null && (f instanceof C0916e1)) {
                                        ((C0916e1) f).f13228p = true;
                                    }
                                    if (this.f8500h) {
                                        Fx fx2 = this.f8496c;
                                        long j8 = this.i;
                                        F f5 = (F) fx2.f9143k;
                                        f5.getClass();
                                        f5.d(j6, j8);
                                        this.f8500h = false;
                                    }
                                    i6 = 0;
                                    while (true) {
                                        if (i6 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.f8499g) {
                                                i6 = 0;
                                                break;
                                            }
                                            try {
                                                H2.j jVar = this.f8498e;
                                                synchronized (jVar) {
                                                    while (!jVar.f2300l) {
                                                        jVar.wait();
                                                    }
                                                }
                                                Fx fx3 = this.f8496c;
                                                C0072a c0072a = this.f;
                                                F f6 = (F) fx3.f9143k;
                                                f6.getClass();
                                                B b6 = (B) fx3.f9144l;
                                                b6.getClass();
                                                i6 = f6.f(b6, c0072a);
                                                long c5 = this.f8496c.c();
                                                if (c5 > this.f8504m.f9385q + j6) {
                                                    this.f8498e.e();
                                                    HG hg4 = this.f8504m;
                                                    hg4.f9392x.post(hg4.f9391w);
                                                    j6 = c5;
                                                }
                                            } catch (InterruptedException unused4) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            i10 = i6;
                                            if (i10 != 1) {
                                                Fx fx4 = this.f8496c;
                                                if (fx4.c() != j5) {
                                                    this.f.f658a = fx4.c();
                                                }
                                            }
                                            try {
                                                this.f8495b.j();
                                            } catch (IOException unused5) {
                                            }
                                            throw th;
                                        }
                                    }
                                    if (i6 != 1) {
                                        Fx fx5 = this.f8496c;
                                        if (fx5.c() != j5) {
                                            this.f.f658a = fx5.c();
                                        }
                                        i10 = i6;
                                    }
                                    this.f8495b.j();
                                    if (i10 != 0) {
                                        return;
                                    }
                                } else {
                                    try {
                                        JB.l("IcyHeaders", "Invalid metadata interval: " + str5);
                                    } catch (NumberFormatException unused6) {
                                        JB.l("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                        i5 = i8;
                                        hg2.f9394z = z3 ? new C0(i, i5, str, str2, str3, z5) : null;
                                        interfaceC1402ov = this.f8495b;
                                        c02 = this.f8504m.f9394z;
                                        if (c02 != null) {
                                        }
                                        interfaceC1402ov2 = interfaceC1402ov;
                                        this.f8496c.k(interfaceC1402ov2, this.f8494a, this.f8495b.f8941k.b(), j6, j7, this.f8497d);
                                        if (this.f8504m.f9394z != null) {
                                        }
                                        if (this.f8500h) {
                                        }
                                        i6 = 0;
                                        while (true) {
                                            if (i6 != 0) {
                                            }
                                        }
                                        if (i6 != 1) {
                                        }
                                        this.f8495b.j();
                                        if (i10 != 0) {
                                        }
                                    }
                                }
                            }
                            i5 = -1;
                            hg2.f9394z = z3 ? new C0(i, i5, str, str2, str3, z5) : null;
                            interfaceC1402ov = this.f8495b;
                            c02 = this.f8504m.f9394z;
                            if (c02 != null) {
                            }
                            interfaceC1402ov2 = interfaceC1402ov;
                            this.f8496c.k(interfaceC1402ov2, this.f8494a, this.f8495b.f8941k.b(), j6, j7, this.f8497d);
                            if (this.f8504m.f9394z != null) {
                                ((C0916e1) f).f13228p = true;
                            }
                            if (this.f8500h) {
                            }
                            i6 = 0;
                            while (true) {
                                if (i6 != 0) {
                                }
                            }
                            if (i6 != 1) {
                            }
                            this.f8495b.j();
                            if (i10 != 0) {
                            }
                        } else {
                            j5 = -1;
                            try {
                                JB.l("IcyHeaders", "Invalid bitrate: " + str4);
                            } catch (NumberFormatException unused7) {
                                JB.l("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                z3 = false;
                                i = i9;
                                list = (List) b5.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) b5.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) b5.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) b5.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) b5.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i5 = -1;
                                hg2.f9394z = z3 ? new C0(i, i5, str, str2, str3, z5) : null;
                                interfaceC1402ov = this.f8495b;
                                c02 = this.f8504m.f9394z;
                                if (c02 != null) {
                                }
                                interfaceC1402ov2 = interfaceC1402ov;
                                this.f8496c.k(interfaceC1402ov2, this.f8494a, this.f8495b.f8941k.b(), j6, j7, this.f8497d);
                                if (this.f8504m.f9394z != null) {
                                }
                                if (this.f8500h) {
                                }
                                i6 = 0;
                                while (true) {
                                    if (i6 != 0) {
                                    }
                                }
                                if (i6 != 1) {
                                }
                                this.f8495b.j();
                                if (i10 != 0) {
                                }
                            }
                        }
                    } else {
                        j5 = -1;
                    }
                    list = (List) b5.get("icy-genre");
                    if (list != null) {
                    }
                    list2 = (List) b5.get("icy-name");
                    if (list2 != null) {
                    }
                    list3 = (List) b5.get("icy-url");
                    if (list3 != null) {
                    }
                    list4 = (List) b5.get("icy-pub");
                    if (list4 != null) {
                    }
                    list5 = (List) b5.get("icy-metaint");
                    if (list5 != null) {
                    }
                    i5 = -1;
                    hg2.f9394z = z3 ? new C0(i, i5, str, str2, str3, z5) : null;
                    interfaceC1402ov = this.f8495b;
                    c02 = this.f8504m.f9394z;
                    if (c02 != null) {
                    }
                    interfaceC1402ov2 = interfaceC1402ov;
                    this.f8496c.k(interfaceC1402ov2, this.f8494a, this.f8495b.f8941k.b(), j6, j7, this.f8497d);
                    if (this.f8504m.f9394z != null) {
                    }
                    if (this.f8500h) {
                    }
                    i6 = 0;
                    while (true) {
                        if (i6 != 0) {
                        }
                    }
                    if (i6 != 1) {
                    }
                    this.f8495b.j();
                    if (i10 != 0) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                z3 = false;
                i = -1;
            } catch (Throwable th3) {
                th = th3;
                j5 = -1;
            }
        }
    }

    public final Ww b(long j5) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = HG.f9356X;
        Uri uri = this.f8494a;
        if (uri != null) {
            return new Ww(uri, map2, j5, -1L, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
