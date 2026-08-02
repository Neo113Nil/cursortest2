package K1;

import A1.C0045t0;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E3.L;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f3898a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3899b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3900c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(String str) {
        long j;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!AbstractC1664a.v(newPullParser, "x:xmpmeta")) {
            throw C0045t0.a(null, "Couldn't find xmp metadata");
        }
        C0165x c0165x = AbstractC0167z.f2083b;
        L l7 = L.f2000e;
        long j3 = -9223372036854775807L;
        loop0: do {
            newPullParser.next();
            if (AbstractC1664a.v(newPullParser, "rdf:Description")) {
                String[] strArr = f3898a;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i8 >= 4) {
                        break loop0;
                    }
                    String p5 = AbstractC1664a.p(newPullParser, strArr[i8]);
                    if (p5 == null) {
                        i8++;
                    } else if (Integer.parseInt(p5) == 1) {
                        String[] strArr2 = f3899b;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= 4) {
                                break;
                            }
                            String p7 = AbstractC1664a.p(newPullParser, strArr2[i9]);
                            if (p7 != null) {
                                j = Long.parseLong(p7);
                            } else {
                                i9++;
                            }
                        }
                        j = -9223372036854775807L;
                        String[] strArr3 = f3900c;
                        while (true) {
                            if (i7 >= 2) {
                                C0165x c0165x2 = AbstractC0167z.f2083b;
                                l7 = L.f2000e;
                                break;
                            }
                            String p8 = AbstractC1664a.p(newPullParser, strArr3[i7]);
                            if (p8 != null) {
                                l7 = AbstractC0167z.D(new b("image/jpeg", 0L, 0L), new b("video/mp4", Long.parseLong(p8), 0L));
                                break;
                            }
                            i7++;
                        }
                        j3 = j;
                    }
                }
                return null;
            }
            if (AbstractC1664a.v(newPullParser, "Container:Directory")) {
                l7 = b(newPullParser, "Container", "Item");
            } else if (AbstractC1664a.v(newPullParser, "GContainer:Directory")) {
                l7 = b(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC1664a.t(newPullParser, "x:xmpmeta"));
        if (l7.isEmpty()) {
            return null;
        }
        return new c(j3, l7);
    }

    public static L b(XmlPullParser xmlPullParser, String str, String str2) {
        C0165x c0165x = AbstractC0167z.f2083b;
        AbstractC0158p.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC1664a.v(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String p5 = AbstractC1664a.p(xmlPullParser, concat3);
                String p7 = AbstractC1664a.p(xmlPullParser, concat4);
                String p8 = AbstractC1664a.p(xmlPullParser, concat5);
                String p9 = AbstractC1664a.p(xmlPullParser, concat6);
                if (p5 == null || p7 == null) {
                    return L.f2000e;
                }
                b bVar = new b(p5, p8 != null ? Long.parseLong(p8) : 0L, p9 != null ? Long.parseLong(p9) : 0L);
                int i8 = i7 + 1;
                if (objArr.length < i8) {
                    objArr = Arrays.copyOf(objArr, C0164w.e(objArr.length, i8));
                }
                objArr[i7] = bVar;
                i7 = i8;
            }
        } while (!AbstractC1664a.t(xmlPullParser, concat2));
        return AbstractC0167z.B(i7, objArr);
    }
}
