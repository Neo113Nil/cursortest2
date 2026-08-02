package V3;

import V3.c;
import com.google.common.collect.AbstractC5880y;
import j3.v;
import java.io.IOException;
import java.io.StringReader;
import m3.O;
import m3.s;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes8.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f27980a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f27981b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f27982c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) throws IOException {
        try {
            return b(str);
        } catch (v | NumberFormatException | XmlPullParserException unused) {
            s.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static c b(String str) throws XmlPullParserException, IOException {
        long j11;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!O.c(newPullParser, "x:xmpmeta")) {
            throw v.a(null, "Couldn't find xmp metadata");
        }
        AbstractC5880y<c.a> v11 = AbstractC5880y.v();
        long j12 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (O.c(newPullParser, "rdf:Description")) {
                String[] strArr = f27980a;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 >= 4) {
                        break loop0;
                    }
                    String a11 = O.a(newPullParser, strArr[i12]);
                    if (a11 == null) {
                        i12++;
                    } else {
                        if (Integer.parseInt(a11) != 1) {
                            break;
                        }
                        String[] strArr2 = f27981b;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= 4) {
                                break;
                            }
                            String a12 = O.a(newPullParser, strArr2[i13]);
                            if (a12 != null) {
                                j11 = Long.parseLong(a12);
                            } else {
                                i13++;
                            }
                        }
                        j11 = -9223372036854775807L;
                        String[] strArr3 = f27982c;
                        while (true) {
                            if (i11 >= 2) {
                                v11 = AbstractC5880y.v();
                                break;
                            }
                            String a13 = O.a(newPullParser, strArr3[i11]);
                            if (a13 != null) {
                                v11 = AbstractC5880y.C(new c.a("image/jpeg", 0L, 0L), new c.a("video/mp4", Long.parseLong(a13), 0L));
                                break;
                            }
                            i11++;
                        }
                        j12 = j11;
                    }
                }
            } else if (O.c(newPullParser, "Container:Directory")) {
                v11 = c(newPullParser, "Container", "Item");
            } else if (O.c(newPullParser, "GContainer:Directory")) {
                v11 = c(newPullParser, "GContainer", "GContainerItem");
            }
            if (O.b(newPullParser, "x:xmpmeta")) {
                if (!v11.isEmpty()) {
                    return new c(j12, v11);
                }
            }
        }
        return null;
    }

    private static AbstractC5880y<c.a> c(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i11 = AbstractC5880y.f59142c;
        AbstractC5880y.a aVar = new AbstractC5880y.a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (O.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a11 = O.a(xmlPullParser, concat3);
                String a12 = O.a(xmlPullParser, concat4);
                String a13 = O.a(xmlPullParser, concat5);
                String a14 = O.a(xmlPullParser, concat6);
                if (a11 == null || a12 == null) {
                    return AbstractC5880y.v();
                }
                aVar.e(new c.a(a11, a13 != null ? Long.parseLong(a13) : 0L, a14 != null ? Long.parseLong(a14) : 0L));
            }
        } while (!O.b(xmlPullParser, concat2));
        return aVar.j();
    }
}
