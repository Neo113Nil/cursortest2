package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.x1;
import com.ironsource.C4665u;
import com.ironsource.sdk.controller.f;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public String f5457a;
    public o e;
    public v g;
    public final ArrayList d = new ArrayList();
    public int f = 0;
    public final ArrayList h = new ArrayList(1);
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final void a(Node node) {
        w wVar;
        Node d = x1.d(node, "AdVerifications");
        if (d != null) {
            Iterator it = x1.c(d, "Verification").iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                com.fyber.inneractive.sdk.measurement.h hVar = null;
                if (node2 != null) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = new com.fyber.inneractive.sdk.measurement.h();
                    hVar2.e = x1.b(node2, "vendor");
                    Node d2 = x1.d(node2, "JavaScriptResource");
                    if (d2 != null) {
                        hVar2.g = true;
                        try {
                            hVar2.f = x1.a(d2);
                            hVar2.b = x1.b(d2, "apiFramework");
                            hVar2.f5443a = new URL(hVar2.f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node d3 = x1.d(node2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
                    if (d3 != null) {
                        Iterator it2 = x1.c(d3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w).iterator();
                        while (it2.hasNext()) {
                            Node node3 = (Node) it2.next();
                            if (node3 == null) {
                                wVar = null;
                            } else {
                                wVar = new w();
                                wVar.f5468a = x1.b(node3, NotificationCompat.CATEGORY_EVENT);
                                wVar.b = x1.a(node3);
                                wVar.c = x1.b(node3, "offset");
                            }
                            if (node3 != null && wVar.f5468a.equalsIgnoreCase("verificationNotExecuted")) {
                                hVar2.a(x.EVENT_VERIFICATION_NOT_EXECUTED, wVar.b);
                            }
                        }
                    }
                    Node d4 = x1.d(node2, "VerificationParameters");
                    if (d4 != null) {
                        hVar2.d = x1.a(d4);
                    }
                    hVar = hVar2;
                }
                if (hVar != null) {
                    IAlog.a("Verification Found - %s", hVar.toString());
                    this.d.add(hVar);
                }
            }
        }
    }

    public void b(Node node) {
        Node d;
        NodeList childNodes;
        NodeList childNodes2;
        m mVar;
        Iterator it;
        h hVar;
        Iterator it2;
        w wVar;
        w wVar2;
        Iterator it3;
        Iterator it4;
        r rVar;
        g gVar = this;
        Node d2 = x1.d(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h);
        if (d2 != null) {
            x1.b(d2, "version");
            x1.a(d2);
        }
        Node d3 = x1.d(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
        if (d3 != null) {
            String a2 = x1.a(d3);
            if (!TextUtils.isEmpty(a2)) {
                gVar.f5457a = a2;
            }
        }
        Iterator it5 = x1.c(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n).iterator();
        while (it5.hasNext()) {
            String a3 = x1.a((Node) it5.next());
            if (!TextUtils.isEmpty(a3)) {
                gVar.b.add(a3);
            }
        }
        Node d4 = x1.d(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o);
        if (d4 != null) {
            Iterator it6 = x1.c(d4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p).iterator();
            while (it6.hasNext()) {
                Node node2 = (Node) it6.next();
                if (node2 == null) {
                    it = it6;
                    mVar = null;
                } else {
                    mVar = new m();
                    if (TextUtils.isEmpty(x1.b(node2, "AdID"))) {
                        x1.b(node2, f.b.c);
                    }
                    x1.b(node2, "id");
                    x1.a(node2, "sequence");
                    Node d5 = x1.d(node2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q);
                    if (d5 != null) {
                        q qVar = new q();
                        it = it6;
                        Node d6 = x1.d(d5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t);
                        if (d6 != null) {
                            ArrayList c = x1.c(d6, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u);
                            if (!c.isEmpty()) {
                                qVar.f5464a = new ArrayList();
                                Iterator it7 = c.iterator();
                                while (it7.hasNext()) {
                                    Node node3 = (Node) it7.next();
                                    if (node3 == null) {
                                        it4 = it7;
                                        rVar = null;
                                    } else {
                                        it4 = it7;
                                        rVar = new r();
                                        rVar.f5465a = x1.b(node3, C4665u.g);
                                        rVar.b = x1.a(node3, "width");
                                        rVar.c = x1.a(node3, "height");
                                        rVar.d = x1.b(node3, "type");
                                        x1.b(node3, "id");
                                        rVar.f = x1.b(node3, "apiFramework");
                                        rVar.e = x1.a(node3, "bitrate");
                                        String b = x1.b(node3, "maintainAspectRatio");
                                        if (!TextUtils.isEmpty(b)) {
                                            try {
                                                Boolean.valueOf(b);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        String b2 = x1.b(node3, "scalable");
                                        if (!TextUtils.isEmpty(b2)) {
                                            try {
                                                Boolean.valueOf(b2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        rVar.g = x1.a(node3);
                                    }
                                    if (rVar != null) {
                                        qVar.f5464a.add(rVar);
                                    }
                                    it7 = it4;
                                }
                            }
                        }
                        Node d7 = x1.d(d5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x);
                        if (d7 != null) {
                            qVar.c = x1.a(x1.d(d7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y));
                            ArrayList c2 = x1.c(d7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z);
                            if (!c2.isEmpty()) {
                                qVar.d = new ArrayList();
                                Iterator it8 = c2.iterator();
                                while (it8.hasNext()) {
                                    String a4 = x1.a((Node) it8.next());
                                    if (!TextUtils.isEmpty(a4)) {
                                        qVar.d.add(a4);
                                    }
                                }
                            }
                        }
                        Node d8 = x1.d(d5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
                        if (d8 != null) {
                            ArrayList c3 = x1.c(d8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w);
                            if (!c3.isEmpty()) {
                                qVar.b = new ArrayList();
                                Iterator it9 = c3.iterator();
                                while (it9.hasNext()) {
                                    Node node4 = (Node) it9.next();
                                    if (node4 == null) {
                                        it3 = it9;
                                        wVar2 = null;
                                    } else {
                                        wVar2 = new w();
                                        it3 = it9;
                                        wVar2.f5468a = x1.b(node4, NotificationCompat.CATEGORY_EVENT);
                                        wVar2.b = x1.a(node4);
                                        wVar2.c = x1.b(node4, "offset");
                                    }
                                    if (wVar2 != null) {
                                        qVar.b.add(wVar2);
                                    }
                                    it9 = it3;
                                }
                            }
                        }
                        Node d9 = x1.d(d5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s);
                        if (d9 != null) {
                            qVar.e = x1.a(d9);
                        }
                        mVar.f5461a = qVar;
                    } else {
                        it = it6;
                    }
                    Node d10 = x1.d(node2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L);
                    if (d10 != null) {
                        j jVar = new j();
                        String b3 = x1.b(d10, "required");
                        if (!"all".equalsIgnoreCase(b3)) {
                            "none".equalsIgnoreCase(b3);
                        }
                        ArrayList c4 = x1.c(d10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M);
                        jVar.f5459a.clear();
                        Iterator it10 = c4.iterator();
                        while (it10.hasNext()) {
                            Node node5 = (Node) it10.next();
                            if (node5 == null) {
                                it2 = it10;
                                hVar = null;
                            } else {
                                hVar = new h();
                                hVar.f5458a = x1.a(node5, "width");
                                hVar.b = x1.a(node5, "height");
                                hVar.c = x1.b(node5, "id");
                                x1.b(node5, "apiFramework");
                                x1.a(node5, "expandedWidth");
                                x1.a(node5, "expandedHeight");
                                Node d11 = x1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D);
                                if (d11 != null) {
                                    l lVar = new l();
                                    it2 = it10;
                                    lVar.f5460a = x1.b(d11, "creativeType");
                                    lVar.b = x1.a(d11);
                                    hVar.d = lVar;
                                } else {
                                    it2 = it10;
                                }
                                Node d12 = x1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F);
                                if (d12 != null) {
                                    hVar.f = x1.a(d12);
                                }
                                Node d13 = x1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E);
                                if (d13 != null) {
                                    hVar.e = x1.a(d13);
                                }
                                Node d14 = x1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N);
                                if (d14 != null) {
                                    hVar.g = x1.a(d14);
                                }
                                hVar.h.clear();
                                ArrayList c5 = x1.c(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O);
                                if (c5.size() > 0) {
                                    Iterator it11 = c5.iterator();
                                    while (it11.hasNext()) {
                                        String a5 = x1.a((Node) it11.next());
                                        if (!TextUtils.isEmpty(a5)) {
                                            hVar.h.add(a5);
                                        }
                                    }
                                }
                                hVar.j.clear();
                                Node d15 = x1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
                                if (d15 != null) {
                                    ArrayList c6 = x1.c(d15, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w);
                                    if (!c6.isEmpty()) {
                                        Iterator it12 = c6.iterator();
                                        while (it12.hasNext()) {
                                            Node node6 = (Node) it12.next();
                                            if (node6 == null) {
                                                wVar = null;
                                            } else {
                                                wVar = new w();
                                                wVar.f5468a = x1.b(node6, NotificationCompat.CATEGORY_EVENT);
                                                wVar.b = x1.a(node6);
                                                wVar.c = x1.b(node6, "offset");
                                            }
                                            if (wVar != null) {
                                                hVar.j.add(wVar);
                                            }
                                        }
                                    }
                                }
                            }
                            if (hVar != null) {
                                jVar.f5459a.add(hVar);
                            }
                            it10 = it2;
                        }
                        mVar.b = jVar;
                    }
                }
                gVar = this;
                if (mVar != null) {
                    gVar.c.add(mVar);
                }
                it6 = it;
            }
        }
        Node d16 = x1.d(node, "Extensions");
        if (d16 != null) {
            Iterator it13 = x1.c(d16, "Extension").iterator();
            while (it13.hasNext()) {
                Node node7 = (Node) it13.next();
                if ("AdVerifications".equalsIgnoreCase(x1.b(node7, "type"))) {
                    gVar.a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(x1.b(node7, "type"))) {
                    IAlog.a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node d17 = x1.d(node7, "FMPCompanionAssets");
                    if (d17 != null) {
                        o oVar = new o();
                        String b4 = x1.b(d17, "enableMultipleCompanions");
                        if ("false".equalsIgnoreCase(b4) || "0".equals(b4)) {
                            oVar.d = false;
                        }
                        Node d18 = x1.d(d17, "Name");
                        if (d18 != null) {
                            oVar.f5463a = x1.a(d18);
                        }
                        Node d19 = x1.d(d17, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j);
                        if (d19 != null) {
                            x1.a(d19);
                        }
                        oVar.b.clear();
                        Node d20 = x1.d(d17, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B);
                        if (d20 != null) {
                            Iterator it14 = x1.c(d20, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C).iterator();
                            while (it14.hasNext()) {
                                oVar.b.add(x1.a((Node) it14.next()));
                            }
                        }
                        Node d21 = x1.d(d17, "Rating");
                        if (d21 != null) {
                            try {
                                Float.parseFloat(x1.a(d21));
                            } catch (Exception unused3) {
                            }
                        }
                        Node d22 = x1.d(d17, "Screenshots");
                        if (d22 != null) {
                            oVar.c = new ArrayList();
                            Iterator it15 = x1.c(d22, "Screenshot").iterator();
                            while (it15.hasNext()) {
                                String a6 = x1.a((Node) it15.next());
                                if (!TextUtils.isEmpty(a6)) {
                                    oVar.c.add(a6);
                                }
                            }
                        }
                        gVar.e = oVar;
                    }
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(x1.b(node7, "type"))) {
                    Node d23 = x1.d(node7, "DynamicVideoControlsURL");
                    n nVar = new n();
                    if (d23 != null) {
                        nVar.f5462a = x1.a(d23);
                    }
                    if (!TextUtils.isEmpty(nVar.f5462a)) {
                        gVar.h.add(nVar);
                    }
                }
                if ("StorePromoAssets".equalsIgnoreCase(x1.b(node7, "type")) && (d = x1.d(node7, "DTSPR")) != null) {
                    v vVar = new v();
                    Node d24 = x1.d(d, "DTSPNm");
                    if (d24 != null) {
                        vVar.b = x1.a(d24);
                    }
                    Node d25 = x1.d(d, "DTSPTUrl");
                    if (d25 != null) {
                        vVar.c = x1.a(d25);
                    }
                    Node d26 = x1.d(d, "DTSPPNm");
                    if (d26 != null) {
                        vVar.i = x1.a(d26);
                    }
                    Node d27 = x1.d(d, "DTSPIap");
                    if (d27 != null) {
                        vVar.d = x1.a(d27);
                    }
                    Node d28 = x1.d(d, "DTSPCads");
                    if (d28 != null) {
                        vVar.e = x1.a(d28);
                    }
                    Node d29 = x1.d(d, "DTSPMedia");
                    if (d29 != null && (childNodes2 = d29.getChildNodes()) != null && childNodes2.getLength() != 0) {
                        for (int i = 0; i < childNodes2.getLength(); i++) {
                            Node item = childNodes2.item(i);
                            if (item != null) {
                                String nodeName = item.getNodeName();
                                String a7 = x1.a(item);
                                if (!TextUtils.isEmpty(a7)) {
                                    if ("DTSPScrn".equalsIgnoreCase(nodeName)) {
                                        vVar.f.add(a7);
                                    } else if ("DTSPVid".equalsIgnoreCase(nodeName)) {
                                        vVar.g.add(a7);
                                    } else if ("DTSPIcon".equalsIgnoreCase(nodeName)) {
                                        vVar.f5467a = a7;
                                    }
                                }
                            }
                        }
                    }
                    Node d30 = x1.d(d, "DTSPMetadata");
                    if (d30 != null && (childNodes = d30.getChildNodes()) != null && childNodes.getLength() != 0) {
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                            Node item2 = childNodes.item(i2);
                            if (item2 != null) {
                                String nodeName2 = item2.getNodeName();
                                if ("DTSPLabel".equalsIgnoreCase(nodeName2)) {
                                    str = x1.a(item2);
                                } else if ("DTSPRating".equalsIgnoreCase(nodeName2)) {
                                    str2 = x1.a(item2);
                                } else if ("DTSPSize".equalsIgnoreCase(nodeName2)) {
                                    str3 = x1.a(item2);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                            vVar.h = new com.fyber.inneractive.sdk.flow.storepromo.model.d(str2, str, str3);
                        }
                    }
                    gVar.g = vVar;
                }
            }
        }
        a(node);
    }
}
