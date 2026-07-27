package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.gbb.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class gm {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0050, code lost:
    
        if (r2.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar, int i, double d) throws IOException, XmlPullParserException {
        boolean z = false;
        while (true) {
            char c = 3;
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals(k.q)) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z && TextUtils.isEmpty(pccVar.qf())) {
                        vj.pcc(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name.hashCode()) {
                        case -2049897434:
                            if (name.equals(k.x)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1927368268:
                            if (name.equals(k.s)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -385055469:
                            if (name.equals(k.t)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 70476538:
                            break;
                        case 611554000:
                            if (name.equals(k.v)) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            pcc(xmlPullParser, pccVar);
                            break;
                        case 1:
                            pccVar.pcc(sf(xmlPullParser));
                            break;
                        case 2:
                            pcc(xmlPullParser, i, d, pccVar);
                            z = true;
                            break;
                        case 3:
                            com.bytedance.sdk.openadsdk.core.gbb.sf pcc = pcc(xmlPullParser);
                            if (pcc != null && pccVar.sf() == null) {
                                pccVar.pcc(pcc);
                                break;
                            }
                            break;
                        case 4:
                            pcc(xmlPullParser, pccVar.pcc());
                            break;
                        default:
                            vj.pcc(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static String pcc(XmlPullParser xmlPullParser, int i, double d, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar) throws IOException, XmlPullParserException {
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(k.t)) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(k.u)) {
                String attributeValue = xmlPullParser.getAttributeValue(vj.qf, "type");
                int sf = vj.sf(xmlPullParser.getAttributeValue(vj.qf, "width"));
                int sf2 = vj.sf(xmlPullParser.getAttributeValue(vj.qf, "height"));
                int sf3 = vj.sf(xmlPullParser.getAttributeValue(vj.qf, "bitrate"));
                String sf4 = vj.sf(xmlPullParser, k.u);
                if (sf > 0 && sf2 > 0 && com.bytedance.sdk.openadsdk.core.gbb.gm.oo.pcc.contains(attributeValue) && !TextUtils.isEmpty(sf4)) {
                    double pcc = com.bytedance.sdk.openadsdk.core.gbb.gm.oo.pcc(i, d, sf, sf2, sf3, attributeValue);
                    if (pcc > d2) {
                        str = sf4;
                        i2 = sf;
                        d2 = pcc;
                        i3 = sf2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            pccVar.oo(str);
            pccVar.pcc(i2);
            pccVar.sf(i3);
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.sdk.openadsdk.core.gbb.sf pcc(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        com.bytedance.sdk.openadsdk.core.gbb.sf sfVar;
        com.bytedance.sdk.openadsdk.core.gbb.sf sfVar2;
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        pcc.EnumC0147pcc enumC0147pcc;
        char c;
        com.bytedance.sdk.openadsdk.core.gbb.sf sfVar3 = null;
        while (true) {
            int i5 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(k.B)) {
                return sfVar3;
            }
            xmlPullParser.next();
            int i6 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(k.C)) {
                int sf = vj.sf(xmlPullParser.getAttributeValue(vj.qf, "width"));
                int sf2 = vj.sf(xmlPullParser.getAttributeValue(vj.qf, "height"));
                if (sf <= 0 || sf > 300 || sf2 <= 0 || sf2 > 300) {
                    sfVar = sfVar3;
                    vj.pcc(xmlPullParser);
                } else {
                    int pcc = com.bytedance.sdk.openadsdk.core.gbb.sf.pcc.pcc(xmlPullParser.getAttributeValue(vj.qf, "offset"));
                    int pcc2 = com.bytedance.sdk.openadsdk.core.gbb.sf.pcc.pcc(xmlPullParser.getAttributeValue(vj.qf, IronSourceConstants.EVENTS_DURATION));
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    vj.pcc pccVar = null;
                    String str = null;
                    while (true) {
                        if (xmlPullParser.next() != i5 || !xmlPullParser.getName().equals(k.C)) {
                            ArrayList arrayList4 = arrayList3;
                            ArrayList arrayList5 = arrayList2;
                            if (xmlPullParser.getEventType() == i6) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                sfVar2 = sfVar3;
                                char c2 = 65535;
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        if (name.equals(k.J)) {
                                            c = 0;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                    case -375340334:
                                        if (name.equals(k.E)) {
                                            c = 1;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals(k.D)) {
                                            c2 = 2;
                                            break;
                                        }
                                        break;
                                    case 1030746596:
                                        if (name.equals(k.G)) {
                                            c2 = 3;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals(k.F)) {
                                            c = 4;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        i2 = 3;
                                        i = 2;
                                        arrayList = arrayList4;
                                        arrayList.add(new gm.pcc(vj.sf(xmlPullParser, k.J)).pcc());
                                        break;
                                    case 1:
                                        i3 = 3;
                                        i4 = 2;
                                        if (pccVar == null) {
                                            pccVar = new vj.pcc(vj.sf(xmlPullParser, k.E), pcc.EnumC0147pcc.NONE, pcc.sf.IFRAME_RESOURCE);
                                            arrayList2 = arrayList5;
                                            i5 = i3;
                                            i6 = i4;
                                            sfVar3 = sfVar2;
                                            arrayList3 = arrayList4;
                                            break;
                                        }
                                        vj.pcc(xmlPullParser);
                                        arrayList2 = arrayList5;
                                        i5 = i3;
                                        i6 = i4;
                                        sfVar3 = sfVar2;
                                        arrayList3 = arrayList4;
                                    case 2:
                                        i3 = 3;
                                        i4 = 2;
                                        pcc.EnumC0147pcc enumC0147pcc2 = pcc.EnumC0147pcc.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(vj.qf, "creativeType").toLowerCase();
                                        String sf3 = (com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.sf.contains(lowerCase)) ? vj.sf(xmlPullParser, k.D) : null;
                                        if (com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc.contains(lowerCase)) {
                                            enumC0147pcc = pcc.EnumC0147pcc.IMAGE;
                                        } else {
                                            enumC0147pcc = pcc.EnumC0147pcc.JAVASCRIPT;
                                        }
                                        pccVar = new vj.pcc(sf3, enumC0147pcc, pcc.sf.STATIC_RESOURCE);
                                        arrayList2 = arrayList5;
                                        i5 = i3;
                                        i6 = i4;
                                        sfVar3 = sfVar2;
                                        arrayList3 = arrayList4;
                                        break;
                                    case 3:
                                        while (true) {
                                            i3 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(k.G)) {
                                                i4 = 2;
                                                arrayList2 = arrayList5;
                                                i5 = i3;
                                                i6 = i4;
                                                sfVar3 = sfVar2;
                                                arrayList3 = arrayList4;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals(k.H)) {
                                                    str = vj.sf(xmlPullParser, k.H);
                                                } else if (xmlPullParser.getName().equals(k.I)) {
                                                    arrayList5.add(new gm.pcc(vj.sf(xmlPullParser, k.I)).pcc());
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (pccVar == null || pccVar.gm == pcc.sf.IFRAME_RESOURCE) {
                                            pccVar = new vj.pcc(vj.sf(xmlPullParser, k.F), pcc.EnumC0147pcc.NONE, pcc.sf.HTML_RESOURCE);
                                            arrayList2 = arrayList5;
                                            sfVar3 = sfVar2;
                                            arrayList3 = arrayList4;
                                            i5 = 3;
                                            i6 = 2;
                                            break;
                                        } else {
                                            i3 = 3;
                                            i4 = 2;
                                            vj.pcc(xmlPullParser);
                                            arrayList2 = arrayList5;
                                            i5 = i3;
                                            i6 = i4;
                                            sfVar3 = sfVar2;
                                            arrayList3 = arrayList4;
                                            break;
                                        }
                                        break;
                                    default:
                                        i3 = 3;
                                        i4 = 2;
                                        vj.pcc(xmlPullParser);
                                        arrayList2 = arrayList5;
                                        i5 = i3;
                                        i6 = i4;
                                        sfVar3 = sfVar2;
                                        arrayList3 = arrayList4;
                                        break;
                                }
                            } else {
                                sfVar2 = sfVar3;
                                i = i6;
                                arrayList = arrayList4;
                                i2 = 3;
                            }
                            arrayList2 = arrayList5;
                            i5 = i2;
                            i6 = i;
                            arrayList3 = arrayList;
                            sfVar3 = sfVar2;
                        } else if (pccVar != null && (sfVar3 == null || TextUtils.isEmpty(sfVar3.vj()))) {
                            sfVar3 = new com.bytedance.sdk.openadsdk.core.gbb.sf(sf, sf2, pcc, pcc2, pccVar.sf, pccVar.gm, pccVar.pcc, arrayList2, arrayList3, str);
                            vj.pcc(xmlPullParser, k.B, 3);
                        }
                    }
                }
            } else {
                sfVar = sfVar3;
            }
            sfVar3 = sfVar;
        }
    }

    public static double sf(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (vj.sf(xmlPullParser, k.s).split(ServerSentEventKt.COLON).length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(r2[0].trim()) * 3600) + (Integer.parseInt(r2[1].trim()) * 60) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b0, code lost:
    
        if (r0.equals(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_UNMUTE) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.gbb.oo ooVar) throws IOException, XmlPullParserException {
        while (true) {
            char c = 3;
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(k.v)) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (k.w.equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(vj.qf, NotificationCompat.CATEGORY_EVENT);
                    if (TextUtils.isEmpty(attributeValue)) {
                        vj.pcc(xmlPullParser, k.w, 3);
                    } else {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -1638835128:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1337830390:
                                if (attributeValue.equals("thirdQuartile")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -934426579:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -840405966:
                                break;
                            case -599445191:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3363353:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3532159:
                                if (attributeValue.equals("skip")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 94756344:
                                if (attributeValue.equals("close")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 106440182:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 109757538:
                                if (attributeValue.equals("start")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 560220243:
                                if (attributeValue.equals("firstQuartile")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1778167540:
                                if (attributeValue.equals("creativeView")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                ooVar.pcc(vj.sf(xmlPullParser, k.w), 0.5f);
                                break;
                            case 1:
                                ooVar.pcc(vj.sf(xmlPullParser, k.w), 0.75f);
                                break;
                            case 2:
                                ooVar.gm(pcc(xmlPullParser, true));
                                break;
                            case 3:
                                ooVar.tmg(pcc(xmlPullParser, true));
                                break;
                            case 4:
                                ooVar.oo(gm(xmlPullParser));
                                break;
                            case 5:
                                ooVar.vh(pcc(xmlPullParser, true));
                                break;
                            case 6:
                                ooVar.wh(gm(xmlPullParser));
                                break;
                            case 7:
                                ooVar.vj(gm(xmlPullParser));
                                break;
                            case '\b':
                                ooVar.sf(pcc(xmlPullParser, true));
                                break;
                            case '\t':
                            case 11:
                                ooVar.pcc(vj.sf(xmlPullParser, k.w), 0L);
                                break;
                            case '\n':
                                ooVar.pcc(vj.sf(xmlPullParser, k.w), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    vj.pcc(xmlPullParser);
                }
            }
        }
    }

    private static void pcc(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(k.x)) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals(k.y)) {
                    pccVar.gm(vj.sf(xmlPullParser, k.y));
                } else if (name.equals(k.z)) {
                    pccVar.pcc().qf(vj.pcc(xmlPullParser, k.z));
                } else {
                    vj.pcc(xmlPullParser);
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> gm(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return pcc(xmlPullParser, false);
    }

    private static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc(XmlPullParser xmlPullParser, boolean z) throws IOException, XmlPullParserException {
        return vj.pcc(xmlPullParser, k.w, z);
    }
}
