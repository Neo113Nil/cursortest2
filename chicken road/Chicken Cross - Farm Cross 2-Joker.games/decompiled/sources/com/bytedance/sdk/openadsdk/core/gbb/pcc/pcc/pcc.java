package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.gbb.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class pcc {
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x0120. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.sdk.openadsdk.core.gbb.gm pcc(Context context, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        com.bytedance.sdk.openadsdk.core.gbb.gm gmVar;
        vj.pcc pccVar;
        int i;
        pcc.EnumC0147pcc enumC0147pcc;
        int i2;
        int i3;
        char c;
        if (context == null) {
            vj.pcc(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        int i6 = (int) (i4 / displayMetrics.density);
        int i7 = (int) (i5 / displayMetrics.density);
        float f = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.gbb.gm gmVar2 = null;
        while (true) {
            int i8 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(k.L)) {
                return gmVar2;
            }
            xmlPullParser.next();
            int i9 = 2;
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                String str = k.M;
                if (name.equals(k.M)) {
                    int sf = vj.sf(xmlPullParser.getAttributeValue(vj.qf, "width"));
                    int sf2 = vj.sf(xmlPullParser.getAttributeValue(vj.qf, "height"));
                    if (sf < 300 || sf2 < 250) {
                        gmVar = gmVar2;
                        vj.pcc(xmlPullParser);
                        gmVar2 = gmVar;
                    } else {
                        vj.pcc pccVar2 = new vj.pcc();
                        while (true) {
                            if (xmlPullParser.getEventType() != i8 || !xmlPullParser.getName().equals(str)) {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == i9) {
                                    String name2 = xmlPullParser.getName();
                                    name2.hashCode();
                                    com.bytedance.sdk.openadsdk.core.gbb.gm gmVar3 = gmVar2;
                                    String str2 = str;
                                    char c2 = 65535;
                                    switch (name2.hashCode()) {
                                        case -375340334:
                                            if (name2.equals(k.E)) {
                                                c = 0;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                        case -348198615:
                                            if (name2.equals(k.N)) {
                                                c = 1;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name2.equals(k.v)) {
                                                c2 = 2;
                                                break;
                                            }
                                            break;
                                        case 676623548:
                                            if (name2.equals(k.D)) {
                                                c2 = 3;
                                                break;
                                            }
                                            break;
                                        case 1877773523:
                                            if (name2.equals(k.O)) {
                                                c = 4;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                        case 1928285401:
                                            if (name2.equals(k.F)) {
                                                c = 5;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            vj.pcc pccVar3 = pccVar2;
                                            int i10 = sf2;
                                            int i11 = sf;
                                            Point pcc = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc(context, i11, i10, pcc.sf.HTML_RESOURCE);
                                            float pcc2 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc(i6, i7, pcc.x, pcc.y, pcc.sf.IFRAME_RESOURCE, pcc.EnumC0147pcc.NONE);
                                            String sf3 = vj.sf(xmlPullParser, k.E);
                                            if (TextUtils.isEmpty(sf3) || pcc2 <= pccVar3.qf || pcc2 <= f) {
                                                i2 = 3;
                                                vj.pcc(xmlPullParser, k.E, 3);
                                                pccVar2 = pccVar3;
                                                sf2 = i10;
                                                sf = i11;
                                                i9 = 2;
                                                gmVar2 = gmVar3;
                                                str = str2;
                                                i8 = i2;
                                                break;
                                            } else {
                                                pccVar3.qf = pcc2;
                                                pccVar3.pcc(sf3, pcc.EnumC0147pcc.NONE, pcc.sf.IFRAME_RESOURCE);
                                                pccVar2 = pccVar3;
                                                sf2 = i10;
                                                sf = i11;
                                                i9 = 2;
                                                gmVar2 = gmVar3;
                                                str = str2;
                                                i8 = 3;
                                                break;
                                            }
                                        case 1:
                                            pccVar2.oo = vj.sf(xmlPullParser, k.N);
                                            i9 = 2;
                                            sf = sf;
                                            gmVar2 = gmVar3;
                                            str = str2;
                                            i8 = 3;
                                            break;
                                        case 2:
                                            pccVar = pccVar2;
                                            i3 = sf2;
                                            i = sf;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(k.v)) {
                                                    sf2 = i3;
                                                    sf = i;
                                                    pccVar2 = pccVar;
                                                    gmVar2 = gmVar3;
                                                    str = str2;
                                                    i8 = 3;
                                                    i9 = 2;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(k.w)) {
                                                    pccVar.sf(vj.sf(xmlPullParser, k.w));
                                                }
                                            }
                                            break;
                                        case 3:
                                            pccVar = pccVar2;
                                            int i12 = sf2;
                                            i = sf;
                                            pcc.EnumC0147pcc enumC0147pcc2 = pcc.EnumC0147pcc.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(vj.qf, "creativeType").toLowerCase();
                                            if (com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc.contains(lowerCase)) {
                                                enumC0147pcc = pcc.EnumC0147pcc.IMAGE;
                                            } else {
                                                enumC0147pcc = pcc.EnumC0147pcc.JAVASCRIPT;
                                            }
                                            pcc.EnumC0147pcc enumC0147pcc3 = enumC0147pcc;
                                            Point pcc3 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc(context, i, i12, pcc.sf.STATIC_RESOURCE);
                                            float pcc4 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc(i6, i7, pcc3.x, pcc3.y, pcc.sf.STATIC_RESOURCE, enumC0147pcc3);
                                            String sf4 = (com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.sf.contains(lowerCase)) ? vj.sf(xmlPullParser, k.D) : null;
                                            if (pcc4 < pccVar.qf || pcc4 <= f || TextUtils.isEmpty(sf4)) {
                                                i2 = 3;
                                                vj.pcc(xmlPullParser, k.D, 3);
                                                sf2 = i12;
                                                sf = i;
                                                pccVar2 = pccVar;
                                                gmVar2 = gmVar3;
                                                str = str2;
                                                i9 = 2;
                                                i8 = i2;
                                                break;
                                            } else {
                                                pccVar.qf = pcc4;
                                                pccVar.pcc(sf4, enumC0147pcc3, pcc.sf.STATIC_RESOURCE);
                                                sf2 = i12;
                                                sf = i;
                                                pccVar2 = pccVar;
                                                gmVar2 = gmVar3;
                                                str = str2;
                                                i8 = 3;
                                                i9 = 2;
                                                break;
                                            }
                                            break;
                                        case 4:
                                            pccVar2.pcc(vj.sf(xmlPullParser, k.O));
                                            gmVar2 = gmVar3;
                                            str = str2;
                                            i8 = 3;
                                            i9 = 2;
                                            break;
                                        case 5:
                                            Point pcc5 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc(context, sf, sf2, pcc.sf.HTML_RESOURCE);
                                            pccVar = pccVar2;
                                            int i13 = sf2;
                                            int i14 = sf;
                                            float pcc6 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc(i6, i7, pcc5.x, pcc5.y, pcc.sf.HTML_RESOURCE, pcc.EnumC0147pcc.NONE);
                                            String sf5 = vj.sf(xmlPullParser, k.F);
                                            if (TextUtils.isEmpty(sf5) || pcc6 <= pccVar.qf || pcc6 <= f) {
                                                vj.pcc(xmlPullParser, k.F, 3);
                                                sf2 = i13;
                                                i8 = 3;
                                                sf = i14;
                                                pccVar2 = pccVar;
                                                gmVar2 = gmVar3;
                                                str = str2;
                                                i9 = 2;
                                                break;
                                            } else {
                                                pccVar.qf = pcc6;
                                                pccVar.pcc(sf5, pcc.EnumC0147pcc.NONE, pcc.sf.HTML_RESOURCE);
                                                sf2 = i13;
                                                sf = i14;
                                                pccVar2 = pccVar;
                                                gmVar2 = gmVar3;
                                                str = str2;
                                                i8 = 3;
                                                i9 = 2;
                                            }
                                            break;
                                        default:
                                            vj.pcc(xmlPullParser);
                                            pccVar = pccVar2;
                                            i3 = sf2;
                                            i = sf;
                                            sf2 = i3;
                                            sf = i;
                                            pccVar2 = pccVar;
                                            gmVar2 = gmVar3;
                                            str = str2;
                                            i8 = 3;
                                            i9 = 2;
                                            break;
                                    }
                                }
                            } else if (!TextUtils.isEmpty(pccVar2.pcc) && pccVar2.qf >= f) {
                                gmVar2 = new com.bytedance.sdk.openadsdk.core.gbb.gm(sf, sf2, pccVar2.sf, pccVar2.gm, pccVar2.pcc, pccVar2.vj, pccVar2.wh, pccVar2.oo);
                                f = pccVar2.qf;
                            }
                        }
                    }
                }
            }
            gmVar = gmVar2;
            gmVar2 = gmVar;
        }
    }
}
