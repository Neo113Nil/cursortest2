package sg.bigo.ads.z1;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.AbstractC4965w;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.O;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.x0.C5504d;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class l {
    public static final String[] k = {"video/mp4", "video/3gp", "video/3gpp"};

    /* renamed from: a, reason: collision with root package name */
    public int f13446a;
    public f d;
    public List e;
    public final int h;
    public final int i;
    public long b = 0;
    public String c = "";
    public final ArrayList f = new ArrayList();
    public final k g = new k(this);
    public final ArrayList j = new ArrayList();

    public l(int i, int i2) {
        this.i = 0;
        this.h = i;
        this.i = i2;
    }

    public final void a(p pVar) {
        ArrayList arrayList = this.f;
        if (A.a(arrayList)) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sg.bigo.ads.B1.b bVar = (sg.bigo.ads.B1.b) it.next();
            if (bVar.b == null) {
                bVar.b = new ArrayList();
                Iterator it2 = sg.bigo.ads.y1.a.a(bVar.f12215a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, (String) null, (List) null).iterator();
                while (it2.hasNext()) {
                    bVar.b.add(new sg.bigo.ads.B1.d((Node) it2.next()));
                }
            }
            ArrayList arrayList2 = bVar.b;
            if (!A.a(arrayList2)) {
                b bVar2 = new b();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    sg.bigo.ads.B1.d dVar = (sg.bigo.ads.B1.d) it3.next();
                    if (dVar != null) {
                        ArrayList arrayList3 = dVar.d;
                        if (!A.a(arrayList3)) {
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                sg.bigo.ads.A1.a aVar = (sg.bigo.ads.A1.a) it4.next();
                                if (aVar instanceof sg.bigo.ads.B1.g) {
                                    sg.bigo.ads.B1.g gVar = (sg.bigo.ads.B1.g) aVar;
                                    String str = gVar.f12219a;
                                    if (str != null && str.contains("image/")) {
                                        bVar2.b.add(new a(dVar.b, dVar.c, gVar.b, str, dVar.f));
                                    }
                                } else if (aVar instanceof sg.bigo.ads.B1.e) {
                                    bVar2.f13438a.add(new a(dVar.b, dVar.c, ((sg.bigo.ads.B1.e) aVar).f12218a, null, dVar.f));
                                }
                            }
                            ArrayList arrayList4 = dVar.g;
                            if (!A.a(arrayList4)) {
                                Iterator it5 = arrayList4.iterator();
                                while (it5.hasNext()) {
                                    pVar.x.add(new n(((sg.bigo.ads.B1.c) it5.next()).f12216a));
                                }
                            }
                            ArrayList arrayList5 = dVar.e;
                            if (!A.a(arrayList5)) {
                                Iterator it6 = arrayList5.iterator();
                                while (it6.hasNext()) {
                                    pVar.w.add(new n((String) it6.next()));
                                }
                            }
                        }
                    }
                }
                pVar.y.add(bVar2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x05cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x048f A[LOOP:4: B:51:0x0113->B:69:0x048f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p a(Context context, String str, k kVar, ArrayList arrayList) {
        ?? r12;
        Context context2;
        int i;
        boolean z;
        String a2;
        p pVar;
        Iterator it;
        String str2;
        c cVar;
        int c;
        i iVar;
        Iterator it2;
        sg.bigo.ads.B1.a aVar;
        ArrayList a3;
        ArrayList a4;
        this.e = arrayList;
        String str3 = "";
        Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str.replaceFirst("<\\?.*\\?>", ""))));
        ArrayList arrayList2 = new ArrayList();
        NodeList elementsByTagName = parse.getElementsByTagName(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
        int i2 = 0;
        while (true) {
            r12 = 0;
            if (i2 >= elementsByTagName.getLength() || (a4 = sg.bigo.ads.y1.a.a(elementsByTagName.item(i2), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, (String) null, (List) null)) == null) {
                break;
            }
            Iterator it3 = a4.iterator();
            while (it3.hasNext()) {
                String b = sg.bigo.ads.y1.a.b((Node) it3.next());
                if (!TextUtils.isEmpty(b)) {
                    arrayList2.add(new n(b));
                }
            }
            i2++;
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        NodeList elementsByTagName2 = parse.getElementsByTagName(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d);
        for (int i3 = 0; i3 < elementsByTagName2.getLength(); i3++) {
            arrayList3.add(new e(elementsByTagName2.item(i3)));
        }
        if (arrayList3.isEmpty()) {
            this.d = new f(10062, "not found ad node");
            return null;
        }
        e eVar = (e) arrayList3.get(0);
        Node a5 = sg.bigo.ads.y1.a.a(eVar.f13440a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e, (String) null, (ArrayList) null);
        g gVar = a5 != null ? new g(a5) : null;
        if (gVar != null) {
            ArrayList a6 = gVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L);
            String c2 = sg.bigo.ads.y1.a.c(gVar.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h);
            if (c2 == null) {
                c2 = "";
            }
            I.a((CharSequence) c2);
            ArrayList arrayList4 = new ArrayList();
            ArrayList a7 = sg.bigo.ads.y1.a.a(gVar.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, (String) null, (List) null);
            if (a7 != null) {
                Iterator it4 = a7.iterator();
                while (it4.hasNext()) {
                    String b2 = sg.bigo.ads.y1.a.b((Node) it4.next());
                    if (!TextUtils.isEmpty(b2)) {
                        arrayList4.add(new n(b2));
                    }
                }
            }
            arrayList.addAll(arrayList4);
            Iterator it5 = a6.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    pVar = null;
                    break;
                }
                h hVar = (h) it5.next();
                hVar.getClass();
                ArrayList arrayList5 = new ArrayList();
                Node a8 = sg.bigo.ads.y1.a.a(hVar.f13443a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t, (String) r12, (ArrayList) r12);
                if (a8 != null && (a3 = sg.bigo.ads.y1.a.a(a8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u, (String) r12, (List) r12)) != null) {
                    Iterator it6 = a3.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(new i((Node) it6.next()));
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                if (arrayList5.isEmpty()) {
                    this.d = new f(10065, " media file node can not found");
                    it = it5;
                } else {
                    Iterator it7 = arrayList5.iterator();
                    StringBuilder sb = null;
                    while (it7.hasNext()) {
                        String a9 = sg.bigo.ads.y1.a.a(((i) it7.next()).f13444a, "type");
                        if (I.a((CharSequence) a9)) {
                            it2 = it5;
                        } else {
                            ArrayList arrayList7 = new ArrayList(Arrays.asList(k));
                            sg.bigo.ads.T0.g gVar2 = sg.bigo.ads.O.g.f12472a;
                            if (gVar2 != null) {
                                it2 = it5;
                                if (gVar2.B.a(22)) {
                                    arrayList7.add("application/javascript");
                                }
                            } else {
                                it2 = it5;
                            }
                            if (arrayList7.contains(a9.toLowerCase())) {
                                it5 = it2;
                            }
                        }
                        it7.remove();
                        if (sb == null) {
                            sb = new StringBuilder(" media file all mimetype unsupport, types are ");
                        }
                        sb.append(a9).append(",");
                        it5 = it2;
                    }
                    it = it5;
                    if (arrayList5.isEmpty()) {
                        this.d = new f(10066, sb == null ? " media file all mimetype unsupport" : sb.toString());
                    } else {
                        Iterator it8 = arrayList5.iterator();
                        while (it8.hasNext()) {
                            if (I.a((CharSequence) sg.bigo.ads.y1.a.a(((i) it8.next()).f13444a))) {
                                it8.remove();
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            this.d = new f(10067, " though mimetype support but url is empty");
                        } else {
                            Iterator it9 = arrayList5.iterator();
                            ArrayList arrayList8 = null;
                            while (it9.hasNext()) {
                                i iVar2 = (i) it9.next();
                                String str4 = str3;
                                String a10 = sg.bigo.ads.y1.a.a(iVar2.f13444a, "type");
                                String a11 = sg.bigo.ads.y1.a.a(iVar2.f13444a);
                                if (!I.a((CharSequence) a11)) {
                                    int intValue = sg.bigo.ads.y1.a.b(iVar2.f13444a, "width").intValue();
                                    int intValue2 = sg.bigo.ads.y1.a.b(iVar2.f13444a, "height").intValue();
                                    if (intValue <= 0 || intValue2 <= 0) {
                                        it9.remove();
                                        if (arrayList8 == null) {
                                            arrayList8 = new ArrayList();
                                        }
                                        arrayList8.add(iVar2);
                                    } else {
                                        sg.bigo.ads.y1.a.b(iVar2.f13444a, "fileSize");
                                        sg.bigo.ads.y1.a.b(iVar2.f13444a, "bitrate");
                                        String a12 = sg.bigo.ads.y1.a.a(iVar2.f13444a, "md5");
                                        int i4 = this.h;
                                        if (i4 != 0) {
                                            if (i4 == 1) {
                                                if (intValue > intValue2) {
                                                }
                                            } else if (i4 == 2) {
                                                if (intValue < intValue2) {
                                                }
                                            }
                                        }
                                        arrayList6.add(new c(intValue, intValue2, a11, a10, a12));
                                    }
                                }
                                str3 = str4;
                            }
                            str2 = str3;
                            if (arrayList6.isEmpty() && arrayList8 != null && !arrayList8.isEmpty() && (iVar = (i) arrayList8.get(0)) != null) {
                                sg.bigo.ads.y1.a.b(iVar.f13444a, "fileSize");
                                sg.bigo.ads.y1.a.b(iVar.f13444a, "bitrate");
                                arrayList6.add(new c(0, 0, sg.bigo.ads.y1.a.a(iVar.f13444a), sg.bigo.ads.y1.a.a(iVar.f13444a, "type"), sg.bigo.ads.y1.a.a(iVar.f13444a, "md5")));
                            }
                            if (arrayList6.isEmpty()) {
                                AbstractC5496a.a(1, 6, "VASTParser", "Cannot find the best network media config.");
                                this.d = new f(10068, "video width to height ratio is not suitable for its direction");
                                cVar = null;
                                if (cVar == null) {
                                    pVar = new p();
                                    ArrayList a13 = sg.bigo.ads.y1.a.a(gVar.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n, (String) null, (List) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    if (a13 != null) {
                                        Iterator it10 = a13.iterator();
                                        while (it10.hasNext()) {
                                            String b3 = sg.bigo.ads.y1.a.b((Node) it10.next());
                                            if (!TextUtils.isEmpty(b3)) {
                                                arrayList9.add(new n(b3));
                                            }
                                        }
                                    }
                                    pVar.f13449a.addAll(arrayList9);
                                    a(hVar, pVar);
                                    Node a14 = sg.bigo.ads.y1.a.a(hVar.f13443a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x, (String) null, (ArrayList) null);
                                    pVar.n = a14 == null ? null : sg.bigo.ads.y1.a.b(sg.bigo.ads.y1.a.a(a14, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y, (String) null, (ArrayList) null));
                                    String c3 = sg.bigo.ads.y1.a.c(hVar.f13443a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s);
                                    long a15 = I.a((CharSequence) c3) ? -1 : o.a(c3);
                                    if (a15 > 0) {
                                        pVar.s = a15;
                                    }
                                    Node a16 = sg.bigo.ads.y1.a.a(hVar.f13443a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.r, (String) null, (ArrayList) null);
                                    if (a16 == null) {
                                        aVar = null;
                                    } else {
                                        TextUtils.equals(sg.bigo.ads.y1.a.a(a16, "xmlEncoded"), "true");
                                        aVar = new sg.bigo.ads.B1.a(sg.bigo.ads.y1.a.a(a16));
                                    }
                                    pVar.z = aVar;
                                    pVar.o = cVar;
                                    int i5 = cVar.f13439a;
                                    int i6 = cVar.b;
                                    pVar.v = i5;
                                    pVar.u = i6;
                                    String c4 = sg.bigo.ads.y1.a.c(gVar.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i);
                                    if (c4 == null) {
                                        c4 = str2;
                                    }
                                    pVar.q = c4;
                                    String c5 = sg.bigo.ads.y1.a.c(gVar.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j);
                                    pVar.r = c5 == null ? str2 : c5;
                                    pVar.t = gVar.a();
                                    O.b();
                                    String c6 = sg.bigo.ads.y1.a.c(gVar.b, HttpHeaders.EXPIRES);
                                    if (!I.a((CharSequence) c6)) {
                                        try {
                                            Integer.parseInt(c6);
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                    pVar.k.addAll(arrayList);
                                    a(gVar, pVar);
                                    ArrayList b4 = gVar.b();
                                    if (b4 != null && b4.size() > 0) {
                                        this.j.addAll(b4);
                                    }
                                    if (this.j.size() > 0) {
                                        pVar.A = this.j;
                                    }
                                } else {
                                    it5 = it;
                                    str3 = str2;
                                    r12 = 0;
                                }
                            } else {
                                if (arrayList6.size() == 1) {
                                    arrayList6.size();
                                    cVar = (c) arrayList6.get(0);
                                } else {
                                    cVar = (c) arrayList6.get(0);
                                    ArrayList arrayList10 = new ArrayList(arrayList6);
                                    if (arrayList10.size() > 1) {
                                        int i7 = this.i;
                                        if (i7 != 0) {
                                            if (i7 != 1) {
                                                if (i7 == 2) {
                                                    c = 720;
                                                } else if (i7 == 3) {
                                                    c = 1080;
                                                }
                                            }
                                            c = 0;
                                        } else {
                                            c = AbstractC4963u.c(context);
                                        }
                                        int min = Math.min(c, AbstractC4963u.c(context));
                                        Iterator it11 = arrayList10.iterator();
                                        int i8 = Integer.MAX_VALUE;
                                        c cVar2 = null;
                                        while (it11.hasNext()) {
                                            c cVar3 = (c) it11.next();
                                            int abs = Math.abs(Math.min(cVar3.f13439a, cVar3.b) - min);
                                            if (abs < i8) {
                                                cVar2 = cVar3;
                                                i8 = abs;
                                            }
                                        }
                                        cVar = cVar2;
                                        if (cVar == null) {
                                        }
                                    }
                                }
                                if (cVar == null) {
                                }
                            }
                        }
                    }
                }
                str2 = str3;
                cVar = null;
                if (cVar == null) {
                }
            }
            this.f.addAll(gVar.f13442a);
            if (pVar != null) {
                return pVar;
            }
            if (this.d != null) {
                return null;
            }
            this.d = new f(10063, "not match media file found other reason");
            return null;
        }
        Node a17 = sg.bigo.ads.y1.a.a(eVar.f13440a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f, (String) null, (ArrayList) null);
        q qVar = a17 != null ? new q(a17) : null;
        if (qVar != null) {
            String c7 = sg.bigo.ads.y1.a.c(qVar.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h);
            if (c7 == null) {
                c7 = "";
            }
            I.a((CharSequence) c7);
            ArrayList arrayList11 = new ArrayList(arrayList);
            ArrayList arrayList12 = new ArrayList();
            ArrayList a18 = sg.bigo.ads.y1.a.a(qVar.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, (String) null, (List) null);
            if (a18 != null) {
                Iterator it12 = a18.iterator();
                while (it12.hasNext()) {
                    String b5 = sg.bigo.ads.y1.a.b((Node) it12.next());
                    if (!TextUtils.isEmpty(b5)) {
                        arrayList12.add(new n(b5));
                    }
                }
            }
            arrayList11.addAll(arrayList12);
            l lVar = kVar.f13445a;
            lVar.e = arrayList11;
            String a19 = sg.bigo.ads.y1.a.a(sg.bigo.ads.y1.a.a(qVar.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g, (String) null, (ArrayList) null));
            if (I.a((CharSequence) a19)) {
                AbstractC5496a.a(1, 6, "VASTParser", "The redirect url from wrapper is invalid.");
                lVar.d = new f(10070, "The redirect url from wrapper is invalid.");
            } else {
                int i9 = lVar.f13446a;
                if (i9 >= 6) {
                    AbstractC5496a.a(1, 6, "VASTParser", "The wrapper redirects too much times.");
                    lVar.d = new f(10071, "The wrapper redirects too much times");
                } else {
                    lVar.f13446a = i9 + 1;
                    lVar.c = a19;
                    sg.bigo.ads.B0.d dVar = new sg.bigo.ads.B0.d(a19);
                    context2 = context;
                    sg.bigo.ads.B0.a aVar2 = new sg.bigo.ads.B0.a(dVar, context2);
                    sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
                    if (jVar != null) {
                        i = jVar.e;
                        z = jVar.a(12);
                    } else {
                        i = 3;
                        z = false;
                    }
                    aVar2.c = AbstractRunnableC5522h.a("VastNet", i, z);
                    C5504d a20 = AbstractC5507g.a(aVar2);
                    sg.bigo.ads.C0.c cVar4 = a20.f13382a;
                    if (cVar4 != null) {
                        a2 = AbstractC4965w.a(((sg.bigo.ads.C0.a) cVar4).b);
                        if (a2 == null) {
                            return null;
                        }
                        ArrayList b6 = qVar.b();
                        if (b6 != null && b6.size() > 0) {
                            this.j.addAll(b6);
                        }
                        p a21 = a(context2, a2, kVar, arrayList11);
                        if (a21 == null) {
                            return null;
                        }
                        ArrayList a22 = sg.bigo.ads.y1.a.a(qVar.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n, (String) null, (List) null);
                        ArrayList arrayList13 = new ArrayList();
                        if (a22 != null) {
                            Iterator it13 = a22.iterator();
                            while (it13.hasNext()) {
                                String b7 = sg.bigo.ads.y1.a.b((Node) it13.next());
                                if (!TextUtils.isEmpty(b7)) {
                                    arrayList13.add(new n(b7));
                                }
                            }
                        }
                        a21.f13449a.addAll(arrayList13);
                        ArrayList a23 = qVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L);
                        this.f.addAll(qVar.f13442a);
                        Iterator it14 = a23.iterator();
                        while (it14.hasNext()) {
                            a((h) it14.next(), a21);
                        }
                        a(qVar, a21);
                        int a24 = qVar.a();
                        if (a21.t == -1) {
                            a21.t = a24;
                        }
                        if (this.j.size() > 0) {
                            a21.A = this.j;
                        }
                        return a21;
                    }
                    AbstractC5496a.a(1, 6, "VASTParser", "The wrapper failed to redirect http request.");
                    lVar.d = new f(10072, a20.b != null ? "The wrapper failed to redirect http request., code: " + a20.b.f13385a + ", msg: " + a20.b.b : "The wrapper failed to redirect http request., response to string failed");
                    a2 = null;
                    if (a2 == null) {
                    }
                }
            }
            context2 = context;
            a2 = null;
            if (a2 == null) {
            }
        } else {
            this.d = new f(10064, "not found wrapper node");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0140 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(h hVar, p pVar) {
        ArrayList a2;
        int parseInt;
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = hVar.a("start").iterator();
        while (it.hasNext()) {
            arrayList.add(new d((String) it.next(), 0));
        }
        Node a3 = sg.bigo.ads.y1.a.a(hVar.f13443a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v, (String) null, (ArrayList) null);
        ArrayList a4 = sg.bigo.ads.y1.a.a(a3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w, NotificationCompat.CATEGORY_EVENT, Collections.singletonList(NotificationCompat.CATEGORY_PROGRESS));
        if (a4 != null) {
            Iterator it2 = a4.iterator();
            while (it2.hasNext()) {
                Node node = (Node) it2.next();
                String a5 = sg.bigo.ads.y1.a.a(node, "offset");
                if (a5 != null) {
                    String trim = a5.trim();
                    Pattern pattern = o.f13448a;
                    if (!TextUtils.isEmpty(trim) && o.b.matcher(trim).matches()) {
                        String a6 = sg.bigo.ads.y1.a.a(node);
                        if (!I.a((CharSequence) a6)) {
                            try {
                                int a7 = o.a(trim);
                                if (a7 >= 0) {
                                    arrayList.add(new d(a6, a7));
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList a8 = sg.bigo.ads.y1.a.a(a3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w, NotificationCompat.CATEGORY_EVENT, Collections.singletonList("creativeView"));
        if (a8 != null) {
            Iterator it3 = a8.iterator();
            while (it3.hasNext()) {
                String b = sg.bigo.ads.y1.a.b((Node) it3.next());
                if (b != null) {
                    arrayList.add(new d(b, 0));
                }
            }
        }
        Collections.sort(arrayList);
        pVar.c.addAll(arrayList);
        Collections.sort(pVar.c);
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = hVar.a("firstQuartile").iterator();
        while (it4.hasNext()) {
            arrayList2.add(new m((String) it4.next(), 25.0f));
        }
        Iterator it5 = hVar.a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT).iterator();
        while (it5.hasNext()) {
            arrayList2.add(new m((String) it5.next(), 50.0f));
        }
        Iterator it6 = hVar.a("thirdQuartile").iterator();
        while (it6.hasNext()) {
            arrayList2.add(new m((String) it6.next(), 75.0f));
        }
        ArrayList a9 = sg.bigo.ads.y1.a.a(sg.bigo.ads.y1.a.a(hVar.f13443a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v, (String) null, (ArrayList) null), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w, NotificationCompat.CATEGORY_EVENT, Collections.singletonList(NotificationCompat.CATEGORY_PROGRESS));
        if (a9 != null) {
            Iterator it7 = a9.iterator();
            while (it7.hasNext()) {
                Node node2 = (Node) it7.next();
                String a10 = sg.bigo.ads.y1.a.a(node2, "offset");
                if (a10 != null) {
                    String trim2 = a10.trim();
                    Pattern pattern2 = o.f13448a;
                    if (!TextUtils.isEmpty(trim2) && o.f13448a.matcher(trim2).matches()) {
                        String b2 = sg.bigo.ads.y1.a.b(node2);
                        if (trim2 != null) {
                            try {
                                parseInt = Integer.parseInt(trim2.replace("%", ""));
                            } catch (NumberFormatException unused2) {
                            }
                            if (parseInt < 0) {
                                try {
                                    if (!I.a((CharSequence) b2)) {
                                        arrayList2.add(new m(b2, parseInt));
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        }
                        parseInt = -1;
                        if (parseInt < 0) {
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList2);
        pVar.b.addAll(arrayList2);
        Collections.sort(pVar.b);
        pVar.d.addAll(hVar.b(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE));
        pVar.f.addAll(hVar.b("skip"));
        ArrayList b3 = hVar.b("close");
        b3.addAll(hVar.b("closeLinear"));
        pVar.e.addAll(b3);
        ArrayList a11 = hVar.a(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = a11.iterator();
        while (it8.hasNext()) {
            arrayList3.add(new j((String) it8.next(), true));
        }
        Iterator it9 = hVar.a(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE).iterator();
        while (it9.hasNext()) {
            arrayList3.add(new j((String) it9.next(), false));
        }
        pVar.g.addAll(arrayList3);
        ArrayList a12 = hVar.a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        ArrayList arrayList4 = new ArrayList();
        Iterator it10 = a12.iterator();
        while (it10.hasNext()) {
            n nVar = new n((String) it10.next());
            nVar.c = true;
            arrayList4.add(nVar);
        }
        pVar.i.addAll(arrayList4);
        ArrayList a13 = hVar.a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        ArrayList arrayList5 = new ArrayList();
        Iterator it11 = a13.iterator();
        while (it11.hasNext()) {
            n nVar2 = new n((String) it11.next());
            nVar2.c = true;
            arrayList5.add(nVar2);
        }
        pVar.h.addAll(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        Node a14 = sg.bigo.ads.y1.a.a(hVar.f13443a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x, (String) null, (ArrayList) null);
        if (a14 != null && (a2 = sg.bigo.ads.y1.a.a(a14, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z, (String) null, (List) null)) != null) {
            Iterator it12 = a2.iterator();
            while (it12.hasNext()) {
                String b4 = sg.bigo.ads.y1.a.b((Node) it12.next());
                if (b4 != null) {
                    arrayList6.add(new n(b4));
                }
            }
        }
        pVar.j.addAll(arrayList6);
    }

    public static void a(g gVar, p pVar) {
        ArrayList a2;
        ArrayList a3;
        Node a4 = sg.bigo.ads.y1.a.a(gVar.b, "ViewableImpression", (String) null, (ArrayList) null);
        ArrayList arrayList = new ArrayList();
        if (a4 != null && (a3 = sg.bigo.ads.y1.a.a(a4, "Viewable", (String) null, (List) null)) != null) {
            Iterator it = a3.iterator();
            while (it.hasNext()) {
                String b = sg.bigo.ads.y1.a.b((Node) it.next());
                if (!TextUtils.isEmpty(b)) {
                    arrayList.add(new n(b));
                }
            }
        }
        pVar.l.addAll(arrayList);
        Node a5 = sg.bigo.ads.y1.a.a(gVar.b, "ViewableImpression", (String) null, (ArrayList) null);
        ArrayList arrayList2 = new ArrayList();
        if (a5 != null && (a2 = sg.bigo.ads.y1.a.a(a5, "NotViewable", (String) null, (List) null)) != null) {
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                String b2 = sg.bigo.ads.y1.a.b((Node) it2.next());
                if (!TextUtils.isEmpty(b2)) {
                    arrayList2.add(new n(b2));
                }
            }
        }
        pVar.m.addAll(arrayList2);
    }
}
