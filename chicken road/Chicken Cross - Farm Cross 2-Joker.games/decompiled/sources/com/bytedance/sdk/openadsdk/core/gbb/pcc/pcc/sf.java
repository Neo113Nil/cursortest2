package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.content.Context;
import android.text.TextUtils;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class sf {
    public static com.bytedance.sdk.openadsdk.core.gbb.pcc pcc(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list, int i, double d) throws IOException, XmlPullParserException {
        String name;
        xmlPullParser.require(2, vj.qf, k.e);
        com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar = new com.bytedance.sdk.openadsdk.core.gbb.pcc();
        while (true) {
            if (xmlPullParser.next() != 3 || !k.e.equals(xmlPullParser.getName())) {
                if (xmlPullParser.getEventType() == 2) {
                    name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "AdVerifications":
                            pccVar.pcc(oo.pcc(xmlPullParser));
                            continue;
                        case "Creatives":
                            if (!TextUtils.isEmpty(pccVar.qf()) && pccVar.gm() != null) {
                                break;
                            } else {
                                while (xmlPullParser.next() != 3) {
                                    if (xmlPullParser.getEventType() == 2) {
                                        if (k.p.equals(xmlPullParser.getName())) {
                                            pcc(context, xmlPullParser, pccVar, i, d);
                                        } else {
                                            vj.pcc(xmlPullParser);
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        case "Description":
                            pccVar.sf(vj.sf(xmlPullParser, name));
                            continue;
                        case "Error":
                            list.addAll(vj.pcc(xmlPullParser, name));
                            continue;
                        case "Extensions":
                            while (true) {
                                if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                    continue;
                                } else {
                                    xmlPullParser.next();
                                    if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                        pccVar.pcc(oo.pcc(xmlPullParser));
                                    }
                                }
                            }
                            break;
                        case "AdTitle":
                            pccVar.pcc(vj.sf(xmlPullParser, name));
                            continue;
                        case "Impression":
                            pccVar.pcc().pcc(vj.pcc(xmlPullParser, name));
                            continue;
                    }
                    vj.pcc(xmlPullParser);
                }
            } else {
                pccVar.pcc().ork(list);
                return pccVar;
            }
        }
    }

    public static void pcc(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar, int i, double d) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (k.q.equals(xmlPullParser.getName()) && TextUtils.isEmpty(pccVar.qf())) {
                    gm.pcc(xmlPullParser, pccVar, i, d);
                } else if (k.L.equals(xmlPullParser.getName()) && pccVar.gm() == null) {
                    pccVar.pcc(pcc.pcc(context, xmlPullParser));
                } else {
                    vj.pcc(xmlPullParser);
                }
            }
        }
    }
}
