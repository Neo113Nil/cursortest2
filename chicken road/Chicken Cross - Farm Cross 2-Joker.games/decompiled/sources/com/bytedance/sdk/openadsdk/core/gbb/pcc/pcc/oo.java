package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.gbb.ork;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class oo {
    public static Set<ork> pcc(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ork pcc;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(vj.qf, "vendor");
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(vj.qf, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            str3 = vj.sf(xmlPullParser, k.w);
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(vj.qf, "apiFramework"))) {
                                            break;
                                        } else {
                                            str = vj.sf(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case "VerificationParameters":
                                        str2 = vj.sf(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(str) && (pcc = ork.pcc(str, attributeValue, str2, str3)) != null) {
                            hashSet.add(pcc);
                        }
                    }
                } else {
                    vj.pcc(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
