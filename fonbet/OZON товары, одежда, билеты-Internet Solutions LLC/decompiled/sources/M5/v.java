package M5;

import K5.e;
import N5.c;
import android.graphics.Color;
import android.view.animation.Interpolator;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17447a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17448b = c.a.a("d", "a");

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f17449c = c.a.a("ty", "nm");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f17450d = 0;

    /* loaded from: classes8.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17451a;

        static {
            int[] iArr = new int[e.b.values().length];
            f17451a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17451a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static K5.e a(N5.c cVar, B5.g gVar) throws IOException {
        Float f7;
        boolean z11;
        float f11;
        String str;
        e.b bVar = e.b.NONE;
        J5.h hVar = J5.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.beginObject();
        float f12 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        J5.h hVar2 = hVar;
        e.b bVar2 = bVar;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        String str2 = null;
        I5.j jVar = null;
        I5.k kVar = null;
        I5.b bVar3 = null;
        J5.a aVar = null;
        C3614j c3614j = null;
        long j11 = 0;
        boolean z12 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z13 = false;
        long j12 = -1;
        float f18 = 1.0f;
        String str3 = "UNSET";
        String str4 = null;
        I5.l lVar = null;
        e.a aVar2 = null;
        while (cVar.hasNext()) {
            switch (cVar.p(f17447a)) {
                case 0:
                    str3 = cVar.nextString();
                    continue;
                case 1:
                    j11 = cVar.nextInt();
                    continue;
                case 2:
                    str2 = cVar.nextString();
                    continue;
                case 3:
                    f11 = f12;
                    str = str2;
                    int nextInt = cVar.nextInt();
                    aVar2 = e.a.UNKNOWN;
                    if (nextInt < aVar2.ordinal()) {
                        aVar2 = e.a.values()[nextInt];
                        break;
                    }
                    break;
                case 4:
                    j12 = cVar.nextInt();
                    continue;
                case 5:
                    i11 = (int) (O5.g.c() * cVar.nextInt());
                    continue;
                case 6:
                    i12 = (int) (O5.g.c() * cVar.nextInt());
                    continue;
                case 7:
                    i13 = Color.parseColor(cVar.nextString());
                    continue;
                case 8:
                    lVar = C3607c.a(cVar, gVar);
                    continue;
                case 9:
                    f11 = f12;
                    str = str2;
                    int nextInt2 = cVar.nextInt();
                    if (nextInt2 < e.b.values().length) {
                        bVar2 = e.b.values()[nextInt2];
                        int i14 = a.f17451a[bVar2.ordinal()];
                        if (i14 == 1) {
                            gVar.a("Unsupported matte type: Luma");
                        } else if (i14 == 2) {
                            gVar.a("Unsupported matte type: Luma Inverted");
                        }
                        gVar.r(1);
                        break;
                    } else {
                        gVar.a("Unsupported matte type: " + nextInt2);
                        break;
                    }
                case 10:
                    f11 = f12;
                    str = str2;
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        arrayList.add(x.a(cVar, gVar));
                    }
                    gVar.r(arrayList.size());
                    cVar.endArray();
                    break;
                case 11:
                    f11 = f12;
                    str = str2;
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        J5.c a11 = C3612h.a(cVar, gVar);
                        if (a11 != null) {
                            arrayList2.add(a11);
                        }
                    }
                    cVar.endArray();
                    break;
                case 12:
                    f11 = f12;
                    str = str2;
                    cVar.beginObject();
                    while (cVar.hasNext()) {
                        int p11 = cVar.p(f17448b);
                        if (p11 == 0) {
                            jVar = new I5.j(u.a(cVar, gVar, O5.g.c(), C3613i.f17416a, false));
                        } else if (p11 != 1) {
                            cVar.q();
                            cVar.skipValue();
                        } else {
                            cVar.beginArray();
                            if (cVar.hasNext()) {
                                kVar = C3606b.a(cVar, gVar);
                            }
                            while (cVar.hasNext()) {
                                cVar.skipValue();
                            }
                            cVar.endArray();
                        }
                    }
                    cVar.endObject();
                    break;
                case 13:
                    f11 = f12;
                    str = str2;
                    cVar.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (cVar.hasNext()) {
                        cVar.beginObject();
                        while (cVar.hasNext()) {
                            int p12 = cVar.p(f17449c);
                            if (p12 == 0) {
                                int nextInt3 = cVar.nextInt();
                                if (nextInt3 == 29) {
                                    aVar = C3609e.a(cVar, gVar);
                                } else if (nextInt3 == 25) {
                                    c3614j = new C3615k().a(cVar, gVar);
                                }
                            } else if (p12 != 1) {
                                cVar.q();
                                cVar.skipValue();
                            } else {
                                arrayList3.add(cVar.nextString());
                            }
                        }
                        cVar.endObject();
                    }
                    cVar.endArray();
                    gVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    f18 = (float) cVar.nextDouble();
                    continue;
                case 15:
                    f17 = (float) cVar.nextDouble();
                    continue;
                case 16:
                    f11 = f12;
                    str = str2;
                    f15 = (float) (cVar.nextDouble() * O5.g.c());
                    break;
                case 17:
                    f11 = f12;
                    str = str2;
                    f16 = (float) (cVar.nextDouble() * O5.g.c());
                    break;
                case 18:
                    f13 = (float) cVar.nextDouble();
                    continue;
                case 19:
                    f14 = (float) cVar.nextDouble();
                    continue;
                case 20:
                    bVar3 = C3608d.b(cVar, gVar, false);
                    continue;
                case 21:
                    str4 = cVar.nextString();
                    continue;
                case 22:
                    z13 = cVar.j();
                    continue;
                case 23:
                    if (cVar.nextInt() == 1) {
                        z12 = true;
                        break;
                    } else {
                        z12 = false;
                        continue;
                    }
                case 24:
                    int nextInt4 = cVar.nextInt();
                    if (nextInt4 >= J5.h.values().length) {
                        gVar.a("Unsupported Blend Mode: " + nextInt4);
                        hVar2 = J5.h.NORMAL;
                        break;
                    } else {
                        hVar2 = J5.h.values()[nextInt4];
                        continue;
                    }
                default:
                    cVar.q();
                    cVar.skipValue();
                    f11 = f12;
                    str = str2;
                    break;
            }
            f12 = f11;
            str2 = str;
        }
        float f19 = f12;
        String str5 = str2;
        cVar.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (f13 > f19) {
            z11 = z12;
            f7 = valueOf;
            arrayList4.add(new P5.a(gVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(f13)));
        } else {
            f7 = valueOf;
            z11 = z12;
        }
        if (f14 <= f19) {
            f14 = gVar.f();
        }
        arrayList4.add(new P5.a(gVar, valueOf2, valueOf2, (Interpolator) null, f13, Float.valueOf(f14)));
        arrayList4.add(new P5.a(gVar, f7, f7, (Interpolator) null, f14, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str4)) {
            gVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z11) {
            if (lVar == null) {
                lVar = new I5.l();
            }
            lVar.l(z11);
        }
        return new K5.e(arrayList2, gVar, str3, j11, aVar2, j12, str5, arrayList, lVar, i11, i12, i13, f18, f17, f15, f16, jVar, kVar, arrayList4, bVar2, bVar3, z13, aVar, c3614j, hVar2);
    }
}
