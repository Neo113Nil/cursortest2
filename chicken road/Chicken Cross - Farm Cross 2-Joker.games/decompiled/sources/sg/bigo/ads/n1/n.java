package sg.bigo.ads.n1;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.URLUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.U0.t;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.g0.C5123a;
import sg.bigo.ads.h.C5176i1;
import sg.bigo.ads.i.C5239k;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class n implements sg.bigo.ads.f0.g, e {
    public static final n n = new n();
    public Context d;
    public ArrayList e;
    public ArrayList f;
    public Hashtable g;
    public sg.bigo.ads.f0.h h;
    public f i;
    public C5123a j;
    public sg.bigo.ads.o1.e k;
    public sg.bigo.ads.U.h m;

    /* renamed from: a, reason: collision with root package name */
    public int f13214a = 1;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public long c = 0;
    public final WeakHashMap l = new WeakHashMap();

    public final void a(String str, C5176i1 c5176i1) {
        if (this.b.get()) {
            AbstractC5446j.a(1, null, new h(this, c5176i1, str), 0L);
        } else {
            c5176i1.onReceiveValue(Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, InterfaceC5087a interfaceC5087a, m mVar, boolean z) {
        sg.bigo.ads.T0.e eVar;
        boolean z2;
        C5115b c5115b;
        String sb;
        C5115b c5115b2;
        sg.bigo.ads.U0.k kVar;
        int i;
        boolean z3;
        int i2;
        int i3;
        int i4;
        sg.bigo.ads.T0.d dVar;
        int i5;
        sg.bigo.ads.T0.d dVar2;
        int i6;
        String sb2;
        boolean z4;
        String[] split;
        sg.bigo.ads.T0.g gVar;
        if (z) {
            ((sg.bigo.ads.U0.k) interfaceC5087a).R0 = 0;
        }
        sg.bigo.ads.U0.k kVar2 = (sg.bigo.ads.U0.k) interfaceC5087a;
        String k = kVar2.k();
        String d = kVar2.d();
        if (!kVar2.p() || kVar2.o() || (gVar = sg.bigo.ads.O.g.f12472a) == null || (eVar = gVar.J) == null) {
            eVar = null;
        }
        if (eVar != null) {
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) interfaceC5087a;
            String str = bVar.j;
            int i7 = bVar.l;
            int i8 = !I.a((CharSequence) eVar.b) ? 1 : 0;
            int i9 = !I.a((CharSequence) eVar.c) ? 1 : 0;
            if (i7 == 1) {
                i = eVar.g;
            } else if (i7 == 12) {
                i = eVar.f;
            } else if (i7 == 20) {
                i = eVar.h;
            } else if (i7 != 3) {
                i = i7 != 4 ? 0 : eVar.e;
            } else {
                i = eVar.d;
            }
            if (i > 0) {
                int i10 = sg.bigo.ads.T0.e.n[i8][i9];
                if (i10 != 1) {
                    if (i10 == 2) {
                        String[] split2 = eVar.c.split(",");
                        z4 = !(split2 == null ? false : Arrays.asList(split2).contains(str));
                    } else if (i10 == 3 && (split = eVar.b.split(",")) != null) {
                        z4 = Arrays.asList(split).contains(str);
                    }
                    z3 = z4;
                } else {
                    z3 = true;
                }
                i2 = bVar.l;
                boolean z5 = i2 != 1 ? eVar.l.f12550a == 1 : !(i2 == 12 ? eVar.k.f12550a != 1 : i2 == 20 ? eVar.m.f12550a != 1 : i2 == 3 ? eVar.i.f12550a != 1 : !(i2 == 4 && eVar.j.f12550a == 1));
                if (i2 != 1) {
                    i3 = eVar.g;
                } else if (i2 == 12) {
                    i3 = eVar.f;
                } else if (i2 == 20) {
                    i3 = eVar.h;
                } else if (i2 == 3) {
                    i3 = eVar.d;
                } else if (i2 == 4) {
                    i3 = eVar.e;
                } else {
                    i4 = 0;
                    if (i2 == 1) {
                        dVar = eVar.l;
                    } else if (i2 == 12) {
                        dVar = eVar.k;
                    } else if (i2 == 20) {
                        dVar = eVar.m;
                    } else if (i2 == 3) {
                        dVar = eVar.i;
                    } else if (i2 == 4) {
                        dVar = eVar.j;
                    } else {
                        i5 = 5;
                        if (i2 != 1) {
                            dVar2 = eVar.l;
                        } else if (i2 == 12) {
                            dVar2 = eVar.k;
                        } else if (i2 == 20) {
                            dVar2 = eVar.m;
                        } else if (i2 == 3) {
                            dVar2 = eVar.i;
                        } else if (i2 == 4) {
                            dVar2 = eVar.j;
                        } else {
                            i6 = 20;
                            if (kVar2.o()) {
                                StringBuilder sb3 = new StringBuilder();
                                StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                                String str2 = File.separator;
                                sb2 = sg.bigo.ads.U.p.a(append, str2, "video", sb3, str2).append("vpaid").toString();
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                StringBuilder append2 = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                                String str3 = File.separator;
                                sb2 = sg.bigo.ads.U.p.a(append2, str3, "video", sb4, str3).append("files").toString();
                            }
                            z2 = true;
                            c5115b = new C5115b(k, sb2, d, kVar2.p(), bVar.T, false, new sg.bigo.ads.f0.i(z3, z5, i4, i5, i6));
                        }
                        i6 = dVar2.b;
                        if (kVar2.o()) {
                        }
                        z2 = true;
                        c5115b = new C5115b(k, sb2, d, kVar2.p(), bVar.T, false, new sg.bigo.ads.f0.i(z3, z5, i4, i5, i6));
                    }
                    i5 = dVar.d;
                    if (i2 != 1) {
                    }
                    i6 = dVar2.b;
                    if (kVar2.o()) {
                    }
                    z2 = true;
                    c5115b = new C5115b(k, sb2, d, kVar2.p(), bVar.T, false, new sg.bigo.ads.f0.i(z3, z5, i4, i5, i6));
                }
                i4 = i3;
                if (i2 == 1) {
                }
                i5 = dVar.d;
                if (i2 != 1) {
                }
                i6 = dVar2.b;
                if (kVar2.o()) {
                }
                z2 = true;
                c5115b = new C5115b(k, sb2, d, kVar2.p(), bVar.T, false, new sg.bigo.ads.f0.i(z3, z5, i4, i5, i6));
            }
            z3 = false;
            i2 = bVar.l;
            if (i2 != 1) {
            }
            if (i2 != 1) {
            }
            i4 = i3;
            if (i2 == 1) {
            }
            i5 = dVar.d;
            if (i2 != 1) {
            }
            i6 = dVar2.b;
            if (kVar2.o()) {
            }
            z2 = true;
            c5115b = new C5115b(k, sb2, d, kVar2.p(), bVar.T, false, new sg.bigo.ads.f0.i(z3, z5, i4, i5, i6));
        } else {
            z2 = true;
            if (kVar2.o()) {
                StringBuilder sb5 = new StringBuilder();
                StringBuilder append3 = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                String str4 = File.separator;
                sb = sg.bigo.ads.U.p.a(append3, str4, "video", sb5, str4).append("vpaid").toString();
            } else {
                StringBuilder sb6 = new StringBuilder();
                StringBuilder append4 = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                String str5 = File.separator;
                sb = sg.bigo.ads.U.p.a(append4, str5, "video", sb6, str5).append("files").toString();
            }
            c5115b = new C5115b(k, sb, d, kVar2.p(), kVar2.T, kVar2.o(), null);
        }
        C5115b c5115b3 = c5115b;
        if (!z && c5115b3.b()) {
            c5115b3.p = z2;
        }
        if (c5115b3.b()) {
            c5115b3.toString();
            if (z) {
                this.f.add(interfaceC5087a);
            }
        }
        boolean z6 = (sg.bigo.ads.O.g.f12472a.B.a(9) && URLUtil.isHttpUrl(k)) ? z2 : false;
        if (z6) {
            c5115b2 = c5115b3;
            kVar = kVar2;
            sg.bigo.ads.s1.b.a(interfaceC5087a, k, "Invalid http url", 0L, 0L, 2, "", false, null, null, null, 0);
        } else {
            c5115b2 = c5115b3;
            kVar = kVar2;
        }
        if (!z6 && !I.a((CharSequence) k) && !I.a((CharSequence) d)) {
            this.e.add(interfaceC5087a);
            this.g.put(kVar.h(), mVar);
            c5115b2.toString();
            C5115b c5115b4 = c5115b2;
            this.h.a(c5115b4, false);
            if (z) {
                f fVar = this.i;
                fVar.getClass();
                if (c5115b4.b()) {
                    sg.bigo.ads.f0.i iVar = c5115b4.t;
                    if ((iVar != null ? iVar.c : 0) > 0) {
                        fVar.a(c5115b4);
                    }
                    sg.bigo.ads.f0.i iVar2 = c5115b4.t;
                    if ((iVar2 != null ? iVar2.d : 5) > 0) {
                        if (fVar.c.containsKey(c5115b4.f12782a)) {
                            AbstractC5446j.a((b) fVar.c.remove(c5115b4.f12782a));
                        }
                        b bVar2 = new b(fVar, c5115b4);
                        fVar.c.put(c5115b4.f12782a, bVar2);
                        AbstractC5446j.a(3, null, bVar2, (c5115b4.t != null ? r1.d : 5) * 1000);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C5115b c5115b5 = c5115b2;
        sg.bigo.ads.U0.k kVar3 = kVar;
        kVar3.S0 = 5;
        if (!c5115b5.b()) {
            mVar.a(z6 ? 10118 : 10103);
            return;
        }
        mVar.a();
        this.g.put(kVar3.h(), mVar);
        this.i.a(c5115b5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
    
        if (((java.lang.Boolean) r12.second).booleanValue() == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(File file, boolean z) {
        boolean z2;
        file.getAbsolutePath();
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            Context context = this.d;
            StringBuilder sb = new StringBuilder();
            StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
            String str = File.separator;
            String sb2 = sg.bigo.ads.U.p.a(append, str, "video", sb, str).append("thumb").toString();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            Arrays.sort(listFiles, new j());
            int length = listFiles.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i3 < listFiles.length) {
                File file2 = listFiles[i3];
                C5123a c5123a = this.j;
                long lastModified = file2.lastModified();
                int i4 = c5123a.b;
                if (i4 == 0) {
                    i4 = Integer.MAX_VALUE;
                }
                Pair pair = new Pair(Boolean.valueOf(lastModified + c5123a.d < currentTimeMillis), Boolean.valueOf(i3 >= i4));
                String name = file2.getName();
                boolean a2 = sg.bigo.ads.O.g.f12472a.B.a(29);
                boolean booleanValue = ((Boolean) pair.first).booleanValue();
                if (a2) {
                    if (!booleanValue) {
                        if (((Boolean) pair.second).booleanValue()) {
                            Iterator it = this.l.values().iterator();
                            z2 = false;
                            while (it.hasNext()) {
                                if (!((String) it.next()).equals(name)) {
                                    z2 = true;
                                }
                            }
                        }
                        z2 = false;
                        break;
                    }
                    z2 = true;
                } else {
                    if (!booleanValue) {
                    }
                    z2 = true;
                }
                if (z2) {
                    if (a2) {
                        if (((Boolean) pair.first).booleanValue()) {
                            i++;
                        } else {
                            i2++;
                        }
                    }
                    file2.getName();
                    File file3 = new File(sb2, file2.getName());
                    if (file3.exists()) {
                        file2.getName();
                        file3.delete();
                    }
                    file2.delete();
                    if (a2) {
                        Long l = (Long) sg.bigo.ads.F0.b.a("sp_ads", "last_stat_init_time", (Object) 0, 1);
                        l.getClass();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("res_file_name", name);
                        contentValues.put("res_delete_millis", Long.valueOf(currentTimeMillis));
                        contentValues.put("sdk_init_millis", l);
                        contentValues.put("ext", "");
                        contentValues.put("ctime", Long.valueOf(currentTimeMillis2 == 0 ? System.currentTimeMillis() : currentTimeMillis2));
                        if (currentTimeMillis2 == 0) {
                            currentTimeMillis2 = System.currentTimeMillis();
                        }
                        contentValues.put("mtime", Long.valueOf(currentTimeMillis2));
                        AbstractC5025b.b("tb_resource", contentValues);
                    }
                }
                i3++;
            }
            if (i2 > 0 || i > 0) {
                AbstractC5446j.a(1, null, new l(this, z, i, i2, length, currentTimeMillis), 0L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C5115b c5115b, String str, long j, long j2) {
        String str2;
        String str3;
        int i;
        String sb;
        String str4;
        String str5;
        InterfaceC5087a interfaceC5087a;
        m mVar;
        int i2;
        sg.bigo.ads.U0.k kVar;
        InterfaceC5087a interfaceC5087a2;
        int i3;
        sg.bigo.ads.f0.i iVar;
        sg.bigo.ads.q1.e eVar = sg.bigo.ads.q1.e.g;
        Context context = this.d;
        eVar.getClass();
        if (!sg.bigo.ads.U.q.a(context, c5115b.c, c5115b.d)) {
            c5115b.toString();
            f fVar = this.i;
            if (fVar.c.containsKey(c5115b.f12782a)) {
                AbstractC5446j.a((Runnable) fVar.c.get(c5115b.f12782a));
                fVar.c.remove(c5115b.f12782a);
            }
            Iterator it = this.e.iterator();
            boolean a2 = I.a((CharSequence) c5115b.r);
            while (true) {
                if (!it.hasNext()) {
                    i = 3;
                    break;
                }
                InterfaceC5087a interfaceC5087a3 = (InterfaceC5087a) it.next();
                Context context2 = this.d;
                sg.bigo.ads.U0.k kVar2 = (sg.bigo.ads.U0.k) interfaceC5087a3;
                StringBuilder sb2 = new StringBuilder();
                if (kVar2.o()) {
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context2));
                    String str6 = File.separator;
                    sb = sg.bigo.ads.U.p.a(append, str6, "video", sb3, str6).append("vpaid").toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder append2 = new StringBuilder().append(sg.bigo.ads.U.q.a(context2));
                    String str7 = File.separator;
                    sb = sg.bigo.ads.U.p.a(append2, str7, "video", sb4, str7).append("files").toString();
                }
                if (TextUtils.equals(sb2.append(sb).append(File.separator).append(kVar2.d()).toString(), c5115b.a())) {
                    if (!a2) {
                        kVar2.a(c5115b.r);
                    }
                    if (interfaceC5087a3 != 0) {
                        kVar2.S0 = ("Unable to download media file.".equals(str) || "internal storage is not enough".equals(str)) ? 5 : j2 == 0 ? 0 : 1;
                    }
                    if (c5115b.b() && !"internal storage is not enough".equalsIgnoreCase(str)) {
                        int i4 = ((sg.bigo.ads.U0.b) interfaceC5087a3).l;
                        if ((i4 != 3 && i4 != 4) || !this.j.e || "Unable to download media file.".equals(str) || (mVar = (m) this.g.get(kVar2.h())) == null || (i2 = kVar2.R0) >= 2) {
                            int i5 = kVar2.R0;
                            m mVar2 = (m) this.g.get(kVar2.h());
                            if (mVar2 != null) {
                                interfaceC5087a2 = interfaceC5087a3;
                                str4 = "internal storage is not enough";
                                sg.bigo.ads.s1.b.a(kVar2, c5115b.b, str, j, c5115b.g / 1024, 2, "video", c5115b.q, null, null, null, i5);
                                kVar = kVar2;
                                if (kVar.Q0 != 2 || ((iVar = c5115b.t) != null && iVar.b)) {
                                    c5115b.toString();
                                    mVar2.a();
                                } else {
                                    c5115b.toString();
                                }
                                i3 = 0;
                            } else {
                                kVar = kVar2;
                                interfaceC5087a2 = interfaceC5087a3;
                                str4 = "internal storage is not enough";
                                i3 = 0;
                            }
                            kVar.R0 = i3;
                            it.remove();
                            str5 = str;
                            interfaceC5087a = interfaceC5087a2;
                        } else {
                            str4 = "internal storage is not enough";
                            sg.bigo.ads.s1.b.a(interfaceC5087a3, c5115b.b, str, j, c5115b.g / 1024, 2, "video", c5115b.q, null, null, null, i2);
                            kVar2.R0 = i2 + 1;
                            this.e.remove(interfaceC5087a3);
                            a(this.d, interfaceC5087a3, mVar, false);
                            str5 = str;
                            interfaceC5087a = interfaceC5087a3;
                        }
                    } else {
                        str4 = "internal storage is not enough";
                        m mVar3 = (m) this.g.remove(kVar2.h());
                        if (mVar3 != null) {
                            interfaceC5087a = interfaceC5087a3;
                            sg.bigo.ads.s1.b.a(kVar2, c5115b.b, str, j, c5115b.g / 1024, 2, "video", c5115b.q, null, null, null, kVar2.R0);
                            c5115b.toString();
                            str5 = str;
                            mVar3.a(I.b(-1, str5));
                        } else {
                            str5 = str;
                            interfaceC5087a = interfaceC5087a3;
                        }
                        it.remove();
                    }
                    if (str4.equalsIgnoreCase(str5)) {
                        this.f.remove(interfaceC5087a);
                    }
                    i = 3;
                }
            }
            this.f13214a = i;
            if (System.currentTimeMillis() - this.c > 3600000) {
                this.c = System.currentTimeMillis();
                AbstractC5446j.a(1, null, new i(this), 30000L);
                return;
            }
            return;
        }
        String str8 = str;
        String name = new File(c5115b.c).getName();
        sg.bigo.ads.q1.d dVar = (sg.bigo.ads.q1.d) eVar.d.remove(name);
        File file = new File(c5115b.a());
        long length = file.isFile() ? file.length() : j2;
        long j3 = length < 0 ? 0L : length;
        if (!TextUtils.isEmpty(c5115b.b)) {
            str3 = c5115b.b;
        } else {
            if (dVar == null) {
                str2 = "";
                if (str8 == null) {
                    str8 = "";
                }
                sg.bigo.ads.s1.b.a(dVar == null ? dVar.f13261a : null, 2, str2, j3, j, str8, -1);
                AbstractC4964v.a(new File(c5115b.c));
                eVar.a(name, 3, "download failed: ".concat(str8));
                if (System.currentTimeMillis() - eVar.f13262a > 3600000 || eVar.f == null) {
                }
                eVar.f13262a = System.currentTimeMillis();
                AbstractC5446j.a(1, null, new sg.bigo.ads.q1.b(eVar), 30000L);
                return;
            }
            str3 = dVar.b;
        }
        str2 = str3;
        if (str8 == null) {
        }
        sg.bigo.ads.s1.b.a(dVar == null ? dVar.f13261a : null, 2, str2, j3, j, str8, -1);
        AbstractC4964v.a(new File(c5115b.c));
        eVar.a(name, 3, "download failed: ".concat(str8));
        if (System.currentTimeMillis() - eVar.f13262a > 3600000) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C5115b c5115b, int i, long j) {
        FileOutputStream fileOutputStream;
        boolean z;
        boolean z2;
        String sb;
        int i2;
        int i3;
        long j2;
        String str;
        int i4;
        int i5;
        String str2;
        boolean z3;
        String a2;
        String a3;
        int i6 = i;
        sg.bigo.ads.q1.e eVar = sg.bigo.ads.q1.e.g;
        Context context = this.d;
        eVar.getClass();
        String str3 = "";
        int i7 = 1;
        if (sg.bigo.ads.U.q.a(context, c5115b.c, c5115b.d)) {
            if (i6 == 2) {
                return;
            }
            String name = new File(c5115b.c).getName();
            File file = new File(c5115b.a());
            File file2 = new File(c5115b.c);
            sg.bigo.ads.q1.d dVar = (sg.bigo.ads.q1.d) eVar.d.remove(name);
            if (!TextUtils.isEmpty(c5115b.b)) {
                str3 = c5115b.b;
            } else if (dVar != null) {
                str3 = dVar.b;
            }
            String str4 = str3;
            long length = file.isFile() ? file.length() : 0L;
            StringBuilder sb2 = new StringBuilder();
            try {
            } catch (Throwable th) {
                StringBuilder sb3 = new StringBuilder("解压失败: ");
                String message = th.getMessage();
                String sb4 = sb3.append((message == null || message.length() <= 0) ? th.getClass().getSimpleName() : th.getClass().getSimpleName() + ": " + message).toString();
                if (sb2.length() > 0) {
                    sb2.append("; ");
                }
                sb2.append(sb4);
            }
            if (!file2.exists() && !file2.mkdirs()) {
                String str5 = "无法创建解压目录: " + file2.getAbsolutePath();
                if (sb2.length() > 0) {
                    sb2.append("; ");
                }
                sb2.append(str5);
                String sb5 = sb2.length() > 0 ? sb2.toString() : "unzip failed";
                AbstractC5496a.b("PlayableZip", "unzipInto failed: " + sb5);
                sg.bigo.ads.s1.b.a(dVar != null ? dVar.f13261a : null, 2, str4, length, j, sb5, -1);
                AbstractC4964v.a(file2);
                sg.bigo.ads.q1.e.g.a(name, 4, sb5);
                return;
            }
            sg.bigo.ads.q1.f.a(file, file2);
            if (!(file.exists() ? file.delete() : true)) {
                AbstractC5496a.b("PlayableZip", "delete zip after successful unzip failed: " + file.getAbsolutePath());
            }
            File file3 = new File(file2, ".bigo_playable_extract_ok");
            try {
                fileOutputStream = new FileOutputStream(file3);
                try {
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    z = file3.isFile();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        AbstractC5496a.b("PlayableZip", "writeExtractionDoneMarker close: " + e.getMessage());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        AbstractC5496a.b("PlayableZip", "writeExtractionDoneMarker: " + th.getMessage());
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                AbstractC5496a.b("PlayableZip", "writeExtractionDoneMarker close: " + e2.getMessage());
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    } finally {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
            if (z) {
                AbstractC5496a.b("PlayableZip", "writeExtractionDoneMarker failed, clearing cache: " + file2.getAbsolutePath());
                sg.bigo.ads.s1.b.a(dVar != null ? dVar.f13261a : null, 2, str4, length, j, "write extraction marker failed", -1);
                AbstractC4964v.a(file2);
                sg.bigo.ads.q1.e.g.a(name, 5, "write extraction marker failed");
                return;
            }
            sg.bigo.ads.s1.b.a(dVar != null ? dVar.f13261a : null, 1, str4, length, j, null, 1);
            sg.bigo.ads.q1.e eVar2 = sg.bigo.ads.q1.e.g;
            eVar2.c.remove(name);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) eVar2.b.remove(name);
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((C5239k) it.next()).a(file2);
                }
            }
            if (System.currentTimeMillis() - eVar.f13262a <= 3600000 || eVar.f == null) {
                return;
            }
            eVar.f13262a = System.currentTimeMillis();
            AbstractC5446j.a(1, null, new sg.bigo.ads.q1.b(eVar), 30000L);
            return;
        }
        c5115b.toString();
        boolean z4 = i6 == 2;
        sg.bigo.ads.P.r rVar = new sg.bigo.ads.P.r();
        Context context2 = this.d;
        String str6 = c5115b.c;
        String str7 = "files";
        String str8 = "video";
        if (str6 != null) {
            StringBuilder sb6 = new StringBuilder();
            StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context2));
            String str9 = File.separator;
            if (str6.equals(sg.bigo.ads.U.p.a(append, str9, "video", sb6, str9).append("files").toString()) && c5115b.e == 1 && !c5115b.f) {
                File file4 = new File(sg.bigo.ads.U.o.a(new StringBuilder().append(sg.bigo.ads.U.q.a(this.d) + str9 + "video"), str9, "thumb"), c5115b.d);
                if ((!file4.exists() || file4.length() < 0) && c5115b.a() != null && !TextUtils.isEmpty(c5115b.d)) {
                    if (z4) {
                        a2 = c5115b.a() + ".tmp";
                    } else {
                        a2 = c5115b.a();
                    }
                    Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(a2, 1);
                    if (createVideoThumbnail != null) {
                        String a4 = sg.bigo.ads.U.o.a(new StringBuilder().append(sg.bigo.ads.U.q.a(this.d) + str9 + "video"), str9, "thumb");
                        AbstractC4964v.a(a4 + str9, c5115b.d);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(a4, c5115b.d));
                            createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (Exception unused) {
                        }
                    }
                }
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    if (z4) {
                        a3 = c5115b.a() + ".tmp";
                    } else {
                        a3 = c5115b.a();
                    }
                    mediaMetadataRetriever.setDataSource(a3);
                    rVar.f12490a = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    rVar.b = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    rVar.c = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                    str3 = mediaMetadataRetriever.extractMetadata(12);
                } catch (Exception unused2) {
                } catch (Throwable th4) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused3) {
                    }
                    throw th4;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused4) {
                }
            }
        }
        String str10 = str3;
        sg.bigo.ads.o1.e eVar3 = this.k;
        if (eVar3 == null) {
            eVar3 = new sg.bigo.ads.o1.e();
            this.k = eVar3;
        }
        boolean b = eVar3.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) it2.next();
            Context context3 = this.d;
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
            StringBuilder sb7 = new StringBuilder();
            if (kVar.o()) {
                StringBuilder sb8 = new StringBuilder();
                StringBuilder append2 = new StringBuilder().append(sg.bigo.ads.U.q.a(context3));
                String str11 = File.separator;
                sb = sg.bigo.ads.U.p.a(append2, str11, str8, sb8, str11).append("vpaid").toString();
            } else {
                StringBuilder sb9 = new StringBuilder();
                StringBuilder append3 = new StringBuilder().append(sg.bigo.ads.U.q.a(context3));
                String str12 = File.separator;
                sb = sg.bigo.ads.U.p.a(append3, str12, str8, sb9, str12).append(str7).toString();
            }
            if (!TextUtils.equals(sb7.append(sb).append(File.separator).append(kVar.d()).toString(), c5115b.a())) {
                kVar.getClass();
                c5115b.toString();
            } else {
                if (i6 == 0) {
                    i2 = 4;
                    kVar.Q0 = i7;
                } else if (i6 == i7) {
                    i2 = 4;
                    kVar.Q0 = 4;
                } else if (i6 == 2) {
                    i3 = 3;
                    kVar.Q0 = 3;
                    kVar.S0 = i3;
                    if (kVar.n()) {
                    }
                    if (z4) {
                    }
                } else {
                    if (kVar.n() && z4) {
                        long j3 = c5115b.i;
                        long j4 = j3 > 0 ? (c5115b.g * 100) / j3 : 0L;
                        if (b && !kVar.G0) {
                            if (j4 >= (kVar.C0 != null ? r2.a() : 50)) {
                                c5115b.toString();
                                arrayList.add(kVar);
                                String str13 = c5115b.b;
                                j2 = c5115b.g / 1024;
                                int i8 = c5115b.k;
                                boolean z5 = c5115b.q;
                                str = c5115b.d;
                                z3 = z5;
                                i5 = i8;
                                str2 = str13;
                                i4 = kVar.R0;
                            }
                        }
                    } else if (z4) {
                        i6 = i;
                        i7 = 1;
                    } else {
                        arrayList.add(kVar);
                        arrayList2.add(kVar);
                        String str14 = c5115b.b;
                        j2 = c5115b.g / 1024;
                        int i9 = c5115b.k;
                        boolean z6 = c5115b.q;
                        str = c5115b.d;
                        i4 = kVar.R0;
                        i5 = i9;
                        str2 = str14;
                        z3 = z6;
                    }
                    sg.bigo.ads.s1.b.a(kVar, str2, i, j, j2, i5, 2, str8, z3, null, null, null, str, i4);
                    kVar.R0 = 0;
                    i6 = i;
                    arrayList = arrayList;
                    str10 = str10;
                    str8 = str8;
                    str7 = str7;
                    rVar = rVar;
                    z4 = z4;
                    arrayList2 = arrayList2;
                    i7 = 1;
                }
                i3 = i2;
                kVar.S0 = i3;
                if (kVar.n()) {
                }
                if (z4) {
                }
            }
        }
        boolean z7 = z4;
        sg.bigo.ads.P.r rVar2 = rVar;
        ArrayList arrayList3 = arrayList;
        String str15 = str10;
        this.e.removeAll(arrayList2);
        boolean a5 = I.a((CharSequence) str15);
        if (!a5) {
            c5115b.r = str15;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            InterfaceC5087a interfaceC5087a2 = (InterfaceC5087a) it3.next();
            sg.bigo.ads.U0.k kVar2 = (sg.bigo.ads.U0.k) interfaceC5087a2;
            if (!kVar2.G0) {
                if (!a5) {
                    kVar2.a(str15);
                }
                c5115b.c();
                sg.bigo.ads.P.r rVar3 = rVar2;
                kVar2.a(rVar3);
                m mVar = (m) this.g.remove(kVar2.h());
                this.f.remove(interfaceC5087a2);
                if (mVar != null) {
                    c5115b.toString();
                    t tVar = kVar2.C0;
                    z2 = z7;
                    if (tVar != null) {
                        tVar.c = z2;
                    }
                    f fVar = this.i;
                    if (fVar.b.containsKey(c5115b.f12782a)) {
                        AbstractC5446j.a((Runnable) fVar.b.get(c5115b.f12782a));
                        fVar.b.remove(c5115b.f12782a);
                    }
                    if (fVar.c.containsKey(c5115b.f12782a)) {
                        AbstractC5446j.a((Runnable) fVar.c.get(c5115b.f12782a));
                        fVar.c.remove(c5115b.f12782a);
                    }
                    mVar.b(i);
                } else {
                    z2 = z7;
                    c5115b.toString();
                }
                kVar2.G0 = true;
                rVar2 = rVar3;
                z7 = z2;
            }
        }
        if (z7) {
            return;
        }
        this.f13214a = 2;
        if (System.currentTimeMillis() - this.c > 3600000) {
            this.c = System.currentTimeMillis();
            AbstractC5446j.a(1, null, new i(this), 30000L);
        }
    }
}
