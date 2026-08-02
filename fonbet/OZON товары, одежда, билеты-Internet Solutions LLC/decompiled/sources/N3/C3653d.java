package N3;

import java.util.ArrayList;
import m3.C8050C;
import m3.C8065g;
import n3.C8434g;

/* renamed from: N3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3653d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18570c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18571d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18572e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18573f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18574g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18575h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18576i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18577j;

    /* renamed from: k, reason: collision with root package name */
    public final float f18578k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18579l;

    private C3653d(ArrayList arrayList, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, String str) {
        this.f18568a = arrayList;
        this.f18569b = i11;
        this.f18570c = i12;
        this.f18571d = i13;
        this.f18572e = i14;
        this.f18573f = i15;
        this.f18574g = i16;
        this.f18575h = i17;
        this.f18576i = i18;
        this.f18577j = i19;
        this.f18578k = f7;
        this.f18579l = str;
    }

    public static C3653d a(C8050C c8050c) throws j3.v {
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        int i17;
        int i18;
        try {
            c8050c.S(4);
            int E11 = (c8050c.E() & 3) + 1;
            if (E11 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int E12 = c8050c.E() & 31;
            for (int i19 = 0; i19 < E12; i19++) {
                int L11 = c8050c.L();
                int f11 = c8050c.f();
                c8050c.S(L11);
                arrayList.add(C8065g.b(f11, L11, c8050c.e()));
            }
            int E13 = c8050c.E();
            for (int i21 = 0; i21 < E13; i21++) {
                int L12 = c8050c.L();
                int f12 = c8050c.f();
                c8050c.S(L12);
                arrayList.add(C8065g.b(f12, L12, c8050c.e()));
            }
            if (E12 > 0) {
                C8434g.m k11 = C8434g.k(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i22 = k11.f76439e;
                int i23 = k11.f76440f;
                int i24 = k11.f76442h + 8;
                int i25 = k11.f76443i + 8;
                int i26 = k11.f76450p;
                int i27 = k11.f76451q;
                int i28 = k11.f76452r;
                int i29 = k11.f76453s;
                float f13 = k11.f76441g;
                int i31 = k11.f76435a;
                int i32 = k11.f76436b;
                int i33 = k11.f76437c;
                int i34 = C8065g.f74319d;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i31), Integer.valueOf(i32), Integer.valueOf(i33));
                i14 = i27;
                i15 = i28;
                i16 = i29;
                f7 = f13;
                i12 = i23;
                i13 = i24;
                i17 = i25;
                i18 = i26;
                i11 = i22;
            } else {
                str = null;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = 16;
                f7 = 1.0f;
                i17 = -1;
                i18 = -1;
            }
            return new C3653d(arrayList, E11, i11, i12, i13, i17, i18, i14, i15, i16, f7, str);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw j3.v.a(e11, "Error parsing AVC config");
        }
    }
}
