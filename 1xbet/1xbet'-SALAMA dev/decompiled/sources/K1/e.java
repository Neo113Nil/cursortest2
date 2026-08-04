package K1;

import A1.C0045t0;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E3.L;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f3898a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f3899b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f3900c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) throws XmlPullParserException, IOException {
        long j;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!p151v2.a.v(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C0045t0.a(null, "Couldn't find xmp metadata");
        }
        C0165x c0165x = AbstractC0167z.f2083b;
        L lB = L.f2000e;
        long j3 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (p151v2.a.v(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f3898a;
                int i7 = 0;
                for (int i8 = 0; i8 < 4; i8++) {
                    String strP = p151v2.a.p(xmlPullParserNewPullParser, strArr[i8]);
                    if (strP != null) {
                        if (Integer.parseInt(strP) != 1) {
                            break loop0;
                        }
                        String[] strArr2 = f3899b;
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                String strP2 = p151v2.a.p(xmlPullParserNewPullParser, strArr2[i9]);
                                if (strP2 != null) {
                                    j = Long.parseLong(strP2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i9++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        String[] strArr3 = f3900c;
                        while (true) {
                            if (i7 >= 2) {
                                C0165x c0165x2 = AbstractC0167z.f2083b;
                                lB = L.f2000e;
                                break;
                            }
                            String strP3 = p151v2.a.p(xmlPullParserNewPullParser, strArr3[i7]);
                            if (strP3 != null) {
                                lB = AbstractC0167z.D(new b("image/jpeg", 0L, 0L), new b("video/mp4", Long.parseLong(strP3), 0L));
                                break;
                            }
                            i7++;
                        }
                        j3 = j;
                    }
                }
                return null;
            }
            if (p151v2.a.v(xmlPullParserNewPullParser, "Container:Directory")) {
                lB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (p151v2.a.v(xmlPullParserNewPullParser, "GContainer:Directory")) {
                lB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!p151v2.a.t(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (lB.isEmpty()) {
            return null;
        }
        return new c(j3, lB);
    }

    public static L b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C0165x c0165x = AbstractC0167z.f2083b;
        AbstractC0158p.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (p151v2.a.v(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strP = p151v2.a.p(xmlPullParser, strConcat3);
                String strP2 = p151v2.a.p(xmlPullParser, strConcat4);
                String strP3 = p151v2.a.p(xmlPullParser, strConcat5);
                String strP4 = p151v2.a.p(xmlPullParser, strConcat6);
                if (strP == null || strP2 == null) {
                    return L.f2000e;
                }
                b bVar = new b(strP, strP3 != null ? Long.parseLong(strP3) : 0L, strP4 != null ? Long.parseLong(strP4) : 0L);
                int i8 = i7 + 1;
                if (objArrCopyOf.length < i8) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, C0164w.e(objArrCopyOf.length, i8));
                }
                objArrCopyOf[i7] = bVar;
                i7 = i8;
            }
        } while (!p151v2.a.t(xmlPullParser, strConcat2));
        return AbstractC0167z.B(i7, objArrCopyOf);
    }
}
