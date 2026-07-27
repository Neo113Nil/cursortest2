package sg.bigo.ads.z1;

import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13442a = new ArrayList();
    public final Node b;

    public g(Node node) {
        this.b = node;
    }

    public final int a() {
        ArrayList a2;
        Node a3 = sg.bigo.ads.y1.a.a(this.b, "Extensions", (String) null, (ArrayList) null);
        if (a3 != null && (a2 = sg.bigo.ads.y1.a.a(a3, "Extension", (String) null, (List) null)) != null && !a2.isEmpty()) {
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                String c = sg.bigo.ads.y1.a.c((Node) it.next(), "Mute");
                if (!I.a((CharSequence) c)) {
                    return I.b(-1, c);
                }
            }
        }
        return -1;
    }

    public final ArrayList b() {
        ArrayList a2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Node a3 = sg.bigo.ads.y1.a.a(this.b, "AdVerifications", (String) null, (ArrayList) null);
        if (a3 != null) {
            Iterator it = a(a3).iterator();
            while (it.hasNext()) {
                sg.bigo.ads.m1.a aVar = (sg.bigo.ads.m1.a) it.next();
                linkedHashMap.put(aVar.b, aVar);
            }
        }
        Node a4 = sg.bigo.ads.y1.a.a(this.b, "Extensions", (String) null, (ArrayList) null);
        if (a4 != null && (a2 = sg.bigo.ads.y1.a.a(a4, "Extension", (String) null, (List) null)) != null) {
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                Node a5 = sg.bigo.ads.y1.a.a((Node) it2.next(), "AdVerifications", (String) null, (ArrayList) null);
                if (a5 != null) {
                    Iterator it3 = a(a5).iterator();
                    while (it3.hasNext()) {
                        sg.bigo.ads.m1.a aVar2 = (sg.bigo.ads.m1.a) it3.next();
                        if (linkedHashMap.containsKey(aVar2.b)) {
                            AbstractC5496a.b("VAST", "Duplicate OM vendorKey skipped (legacy path): " + aVar2.b);
                        } else {
                            linkedHashMap.put(aVar2.b, aVar2);
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return new ArrayList(linkedHashMap.values());
    }

    public final ArrayList a(String... strArr) {
        ArrayList a2;
        ArrayList arrayList = new ArrayList();
        Node a3 = sg.bigo.ads.y1.a.a(this.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o, (String) null, (ArrayList) null);
        if (a3 == null || (a2 = sg.bigo.ads.y1.a.a(a3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p, (String) null, (List) null)) == null) {
            return arrayList;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q);
        if (!A.c(strArr)) {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            Node node = (Node) it.next();
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                Node a4 = sg.bigo.ads.y1.a.a(node, str, (String) null, (ArrayList) null);
                if (a4 != null) {
                    str.getClass();
                    if (str.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q)) {
                        arrayList.add(new h(a4));
                    } else if (str.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L)) {
                        this.f13442a.add(new sg.bigo.ads.B1.b(a4));
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList a(Node node) {
        Node namedItem;
        NodeList childNodes;
        NodeList childNodes2;
        String nodeValue;
        String nodeValue2;
        ArrayList arrayList = new ArrayList();
        ArrayList a2 = sg.bigo.ads.y1.a.a(node, "Verification", (String) null, (List) null);
        if (a2 != null && !a2.isEmpty()) {
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                NamedNodeMap attributes = node2.getAttributes();
                if (attributes != null && (namedItem = attributes.getNamedItem("vendor")) != null) {
                    String str = "";
                    String nodeValue3 = namedItem.getNodeValue() != null ? namedItem.getNodeValue() : "";
                    if (!nodeValue3.isEmpty()) {
                        sg.bigo.ads.m1.a aVar = new sg.bigo.ads.m1.a();
                        aVar.b = nodeValue3;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(CampaignEx.KEY_OMID);
                        Node a3 = sg.bigo.ads.y1.a.a(node2, "JavaScriptResource", "apiFramework", arrayList2);
                        if (a3 != null && (childNodes = a3.getChildNodes()) != null) {
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= childNodes.getLength()) {
                                    break;
                                }
                                Node item = childNodes.item(i2);
                                if (item != null && (nodeValue2 = item.getNodeValue()) != null && nodeValue2.trim().startsWith(ProxyConfig.MATCH_HTTP)) {
                                    str = nodeValue2.trim();
                                    break;
                                }
                                i2++;
                            }
                            if (!str.isEmpty()) {
                                aVar.f13121a = str;
                                Node a4 = sg.bigo.ads.y1.a.a(node2, "VerificationParameters", (String) null, (ArrayList) null);
                                if (a4 != null && (childNodes2 = a4.getChildNodes()) != null) {
                                    while (true) {
                                        if (i >= childNodes2.getLength()) {
                                            break;
                                        }
                                        Node item2 = childNodes2.item(i);
                                        if (item2 != null && (nodeValue = item2.getNodeValue()) != null && nodeValue.trim().length() > 0) {
                                            aVar.c = nodeValue.trim();
                                            break;
                                        }
                                        i++;
                                    }
                                }
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
