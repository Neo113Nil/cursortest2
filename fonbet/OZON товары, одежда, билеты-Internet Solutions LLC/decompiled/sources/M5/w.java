package M5;

import K5.e;
import N5.c;
import android.graphics.Rect;
import androidx.collection.C5153w;
import androidx.collection.a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17452a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    static c.a f17453b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f17454c = c.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    private static final c.a f17455d = c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0046. Please report as an issue. */
    public static B5.g a(N5.c cVar) throws IOException {
        float f7;
        float f11;
        float f12;
        a0 a0Var;
        HashMap hashMap;
        ArrayList arrayList;
        int i11;
        int i12;
        float f13;
        float c11 = O5.g.c();
        C5153w c5153w = new C5153w();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        a0 a0Var2 = new a0();
        B5.g gVar = new B5.g();
        cVar.beginObject();
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        while (cVar.hasNext()) {
            float f17 = c11;
            switch (cVar.p(f17452a)) {
                case 0:
                    i13 = cVar.nextInt();
                    c11 = f17;
                    break;
                case 1:
                    i14 = cVar.nextInt();
                    c11 = f17;
                    break;
                case 2:
                    f14 = (float) cVar.nextDouble();
                    c11 = f17;
                    break;
                case 3:
                    f13 = f14;
                    f15 = ((float) cVar.nextDouble()) - 0.01f;
                    c11 = f17;
                    f14 = f13;
                    break;
                case 4:
                    f13 = f14;
                    f16 = (float) cVar.nextDouble();
                    c11 = f17;
                    f14 = f13;
                    break;
                case 5:
                    f7 = f14;
                    f11 = f15;
                    f12 = f16;
                    a0Var = a0Var2;
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i11 = i13;
                    String[] split = cVar.nextString().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        gVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    c11 = f17;
                    f15 = f11;
                    f14 = f7;
                    f16 = f12;
                    a0Var2 = a0Var;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    i13 = i11;
                    break;
                case 6:
                    f7 = f14;
                    f11 = f15;
                    f12 = f16;
                    a0Var = a0Var2;
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i11 = i13;
                    cVar.beginArray();
                    int i15 = 0;
                    while (cVar.hasNext()) {
                        K5.e a11 = v.a(cVar, gVar);
                        if (a11.g() == e.a.IMAGE) {
                            i15++;
                        }
                        arrayList2.add(a11);
                        c5153w.f(a11.e(), a11);
                        if (i15 > 4) {
                            O5.c.c("You have " + i15 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    cVar.endArray();
                    c11 = f17;
                    f15 = f11;
                    f14 = f7;
                    f16 = f12;
                    a0Var2 = a0Var;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    i13 = i11;
                    break;
                case 7:
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        C5153w c5153w2 = new C5153w();
                        cVar.beginObject();
                        float f18 = f14;
                        float f19 = f16;
                        a0 a0Var3 = a0Var2;
                        int i16 = 0;
                        int i17 = 0;
                        String str = null;
                        float f21 = f15;
                        String str2 = null;
                        while (cVar.hasNext()) {
                            HashMap hashMap5 = hashMap4;
                            int p11 = cVar.p(f17453b);
                            if (p11 != 0) {
                                ArrayList arrayList5 = arrayList3;
                                if (p11 != 1) {
                                    if (p11 == 2) {
                                        i16 = cVar.nextInt();
                                    } else if (p11 == 3) {
                                        i17 = cVar.nextInt();
                                    } else if (p11 == 4) {
                                        str = cVar.nextString();
                                    } else if (p11 != 5) {
                                        cVar.q();
                                        cVar.skipValue();
                                        i12 = i13;
                                    } else {
                                        cVar.nextString();
                                    }
                                    hashMap4 = hashMap5;
                                    arrayList3 = arrayList5;
                                } else {
                                    cVar.beginArray();
                                    while (cVar.hasNext()) {
                                        K5.e a12 = v.a(cVar, gVar);
                                        c5153w2.f(a12.e(), a12);
                                        arrayList4.add(a12);
                                        i13 = i13;
                                    }
                                    i12 = i13;
                                    cVar.endArray();
                                }
                                hashMap4 = hashMap5;
                                arrayList3 = arrayList5;
                                i13 = i12;
                            } else {
                                str2 = cVar.nextString();
                                hashMap4 = hashMap5;
                            }
                        }
                        HashMap hashMap6 = hashMap4;
                        ArrayList arrayList6 = arrayList3;
                        int i18 = i13;
                        cVar.endObject();
                        if (str != null) {
                            B5.s sVar = new B5.s(i16, i17, str2, str);
                            hashMap3.put(sVar.d(), sVar);
                        } else {
                            hashMap2.put(str2, arrayList4);
                        }
                        f15 = f21;
                        f14 = f18;
                        f16 = f19;
                        a0Var2 = a0Var3;
                        hashMap4 = hashMap6;
                        arrayList3 = arrayList6;
                        i13 = i18;
                    }
                    f7 = f14;
                    f11 = f15;
                    f12 = f16;
                    a0Var = a0Var2;
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i11 = i13;
                    cVar.endArray();
                    c11 = f17;
                    f15 = f11;
                    f14 = f7;
                    f16 = f12;
                    a0Var2 = a0Var;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    i13 = i11;
                    break;
                case 8:
                    cVar.beginObject();
                    while (cVar.hasNext()) {
                        if (cVar.p(f17454c) != 0) {
                            cVar.q();
                            cVar.skipValue();
                        } else {
                            cVar.beginArray();
                            while (cVar.hasNext()) {
                                H5.c a13 = n.a(cVar);
                                hashMap4.put(a13.b(), a13);
                            }
                            cVar.endArray();
                        }
                    }
                    cVar.endObject();
                    f7 = f14;
                    f11 = f15;
                    f12 = f16;
                    a0Var = a0Var2;
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i11 = i13;
                    c11 = f17;
                    f15 = f11;
                    f14 = f7;
                    f16 = f12;
                    a0Var2 = a0Var;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    i13 = i11;
                    break;
                case 9:
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        H5.d a14 = C3617m.a(cVar, gVar);
                        a0Var2.d(a14.hashCode(), a14);
                    }
                    cVar.endArray();
                    f7 = f14;
                    f11 = f15;
                    f12 = f16;
                    a0Var = a0Var2;
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i11 = i13;
                    c11 = f17;
                    f15 = f11;
                    f14 = f7;
                    f16 = f12;
                    a0Var2 = a0Var;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    i13 = i11;
                    break;
                case 10:
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        cVar.beginObject();
                        while (cVar.hasNext()) {
                            int p12 = cVar.p(f17455d);
                            if (p12 == 0) {
                                cVar.nextString();
                            } else if (p12 == 1) {
                                cVar.nextDouble();
                            } else if (p12 != 2) {
                                cVar.q();
                                cVar.skipValue();
                            } else {
                                cVar.nextDouble();
                            }
                        }
                        cVar.endObject();
                        arrayList3.add(new H5.h());
                    }
                    cVar.endArray();
                    f7 = f14;
                    f11 = f15;
                    f12 = f16;
                    a0Var = a0Var2;
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i11 = i13;
                    c11 = f17;
                    f15 = f11;
                    f14 = f7;
                    f16 = f12;
                    a0Var2 = a0Var;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    i13 = i11;
                    break;
                default:
                    cVar.q();
                    cVar.skipValue();
                    f7 = f14;
                    f11 = f15;
                    f12 = f16;
                    a0Var = a0Var2;
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i11 = i13;
                    c11 = f17;
                    f15 = f11;
                    f14 = f7;
                    f16 = f12;
                    a0Var2 = a0Var;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    i13 = i11;
                    break;
            }
        }
        float f22 = c11;
        gVar.s(new Rect(0, 0, (int) (i13 * f22), (int) (i14 * f22)), f14, f15, f16, arrayList2, c5153w, hashMap2, hashMap3, a0Var2, hashMap4, arrayList3);
        return gVar;
    }
}
