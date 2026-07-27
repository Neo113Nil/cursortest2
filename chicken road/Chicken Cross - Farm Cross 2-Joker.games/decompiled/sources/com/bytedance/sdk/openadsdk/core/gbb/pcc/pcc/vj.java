package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.gbb.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.ork;
import com.bytedance.sdk.openadsdk.core.gbb.pcc.sf;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class vj extends com.bytedance.sdk.openadsdk.core.gbb.pcc.sf {
    public static final String qf = null;

    public vj(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.gbb.pcc.sf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.openadsdk.core.gbb.pcc pcc(String str, File file, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        InputStream inputStream;
        this.vj = 0;
        InputStream inputStream2 = null;
        if (this.sf == null) {
            this.vj = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.vj = -2;
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                inputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
            } else {
                inputStream = new FileInputStream(file);
            }
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    newPullParser.setInput(inputStream, "UTF-8");
                    newPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.gbb.pcc pcc2 = pcc(newPullParser, list);
                    pcc(pcc2);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return pcc2;
                } catch (Exception unused2) {
                    this.vj = -3;
                    pcc((com.bytedance.sdk.openadsdk.core.gbb.pcc) null);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar) {
        if (this.wh == null) {
            this.wh = new sf.pcc();
        }
        this.wh.pcc = this.vj;
        this.wh.sf = this.pcc;
        if (pccVar != null) {
            this.wh.gm = pccVar.pcc().sf.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.gbb.pcc pcc(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, qf, "VAST");
        boolean z = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (k.c.equals(name)) {
                    str = sf(xmlPullParser, name);
                } else if (k.d.equals(name)) {
                    if (pcc(xmlPullParser.getAttributeValue(qf, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && k.d.equals(xmlPullParser.getName())) {
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if (k.e.equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.gbb.pcc pcc2 = sf.pcc(this.sf, xmlPullParser, list, this.gm, this.oo);
                                    if (pcc2 != null) {
                                        if (!TextUtils.isEmpty(pcc2.qf())) {
                                            return pcc2;
                                        }
                                        this.vj = -6;
                                        return null;
                                    }
                                } else if (k.f.equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.gbb.pcc sf = sf(xmlPullParser, list);
                                    if (sf != null) {
                                        return sf;
                                    }
                                } else {
                                    pcc(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        pcc(xmlPullParser);
                    }
                    z = true;
                } else {
                    pcc(xmlPullParser);
                }
            }
        }
        if (!z) {
            this.vj = -4;
            gm(str);
        }
        if (this.vj == 0) {
            this.vj = -5;
        }
        return null;
    }

    private void gm(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc((of) null, (List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm>) Collections.singletonList(new gm.pcc(str).pcc()), this.pcc > 0 ? com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.UNDEFINED_ERROR, -1L, (String) null, (String) null), (gm.sf) null);
    }

    static class pcc {
        pcc.sf gm;
        String oo;
        String pcc;
        pcc.EnumC0147pcc sf;
        final List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> vj = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> wh = new ArrayList();
        float qf = Float.MIN_VALUE;

        public pcc() {
        }

        public pcc(String str, pcc.EnumC0147pcc enumC0147pcc, pcc.sf sfVar) {
            pcc(str, enumC0147pcc, sfVar);
        }

        public void pcc(String str, pcc.EnumC0147pcc enumC0147pcc, pcc.sf sfVar) {
            this.pcc = str;
            this.sf = enumC0147pcc;
            this.gm = sfVar;
        }

        public void pcc(String str) {
            this.vj.add(new gm.pcc(str).pcc());
        }

        public void sf(String str) {
            this.wh.add(new gm.pcc(str).pcc());
        }
    }

    public static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return pcc(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc(XmlPullParser xmlPullParser, String str, boolean z) throws IOException, XmlPullParserException {
        return pcc(sf(xmlPullParser, str), z);
    }

    public static int sf(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static String sf(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        String str3 = qf;
        xmlPullParser.require(2, str3, str);
        if (xmlPullParser.next() != 4) {
            str2 = "";
        } else {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        }
        xmlPullParser.require(3, str3, str);
        return str2;
    }

    public static void pcc(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void pcc(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private com.bytedance.sdk.openadsdk.core.gbb.pcc sf(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) throws XmlPullParserException, IOException {
        File file;
        String name;
        File file2 = null;
        if (this.pcc >= 5) {
            pcc(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.gbb.oo ooVar = new com.bytedance.sdk.openadsdk.core.gbb.oo();
        String str = null;
        com.bytedance.sdk.openadsdk.core.gbb.gm gmVar = null;
        Set<ork> set = null;
        while (true) {
            if (xmlPullParser.getEventType() != 3 || !k.f.equals(xmlPullParser.getName())) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "VASTAdTagURI":
                            String pcc2 = pcc(sf(xmlPullParser, k.g), list);
                            if (!TextUtils.isEmpty(pcc2)) {
                                file = null;
                                str = pcc2;
                                break;
                            } else {
                                pcc(xmlPullParser, k.f, 3);
                                this.vj = -2;
                                return null;
                            }
                        case "Error":
                            list.add(new gm.pcc(sf(xmlPullParser, k.c)).pcc());
                            file = null;
                            break;
                        case "Extensions":
                            while (true) {
                                if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                    file = null;
                                    break;
                                } else {
                                    xmlPullParser.next();
                                    if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                        set = oo.pcc(xmlPullParser);
                                    }
                                }
                            }
                            break;
                        case "TrackingEvents":
                            gm.pcc(xmlPullParser, ooVar);
                            file = null;
                            break;
                        case "CompanionAds":
                            gmVar = com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.pcc.pcc(this.sf, xmlPullParser);
                            file2 = null;
                        case "ClickTracking":
                            ooVar.qf(pcc(xmlPullParser, k.z));
                            file = null;
                            break;
                        case "Impression":
                            ooVar.pcc(pcc(xmlPullParser, name));
                            file = null;
                            break;
                        default:
                            file = null;
                            break;
                    }
                } else {
                    file = file2;
                }
                file2 = file;
            } else {
                com.bytedance.sdk.openadsdk.core.gbb.pcc pcc3 = pcc(str, file2, list);
                if (pcc3 != null) {
                    if (pcc3.gm() == null) {
                        pcc3.pcc(gmVar);
                    }
                    pcc3.pcc().pcc(ooVar);
                    if (set != null) {
                        pcc3.pcc(set);
                    }
                }
                return pcc3;
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new gm.pcc(str).pcc(z).pcc());
    }
}
