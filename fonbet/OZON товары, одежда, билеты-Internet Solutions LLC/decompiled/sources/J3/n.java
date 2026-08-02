package J3;

import C.o0;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    private static final l f13823h = new l();

    /* renamed from: i, reason: collision with root package name */
    private static final m f13824i = new m();

    /* renamed from: a, reason: collision with root package name */
    private final int f13825a;

    /* renamed from: e, reason: collision with root package name */
    private int f13829e;

    /* renamed from: f, reason: collision with root package name */
    private int f13830f;

    /* renamed from: g, reason: collision with root package name */
    private int f13831g;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f13827c = new a[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f13826b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f13828d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f13832a;

        /* renamed from: b, reason: collision with root package name */
        public int f13833b;

        /* renamed from: c, reason: collision with root package name */
        public float f13834c;

        private a() {
        }

        /* synthetic */ a(int i11) {
            this();
        }
    }

    public n(int i11) {
        this.f13825a = i11;
    }

    public final void a(float f7, int i11) {
        a aVar;
        int i12 = this.f13828d;
        ArrayList<a> arrayList = this.f13826b;
        if (i12 != 1) {
            Collections.sort(arrayList, f13823h);
            this.f13828d = 1;
        }
        int i13 = this.f13831g;
        a[] aVarArr = this.f13827c;
        int i14 = 0;
        if (i13 > 0) {
            int i15 = i13 - 1;
            this.f13831g = i15;
            aVar = aVarArr[i15];
        } else {
            aVar = new a(i14);
        }
        int i16 = this.f13829e;
        this.f13829e = i16 + 1;
        aVar.f13832a = i16;
        aVar.f13833b = i11;
        aVar.f13834c = f7;
        arrayList.add(aVar);
        this.f13830f += i11;
        while (true) {
            int i17 = this.f13830f;
            int i18 = this.f13825a;
            if (i17 <= i18) {
                return;
            }
            int i19 = i17 - i18;
            a aVar2 = arrayList.get(0);
            int i21 = aVar2.f13833b;
            if (i21 <= i19) {
                this.f13830f -= i21;
                arrayList.remove(0);
                int i22 = this.f13831g;
                if (i22 < 5) {
                    this.f13831g = i22 + 1;
                    aVarArr[i22] = aVar2;
                }
            } else {
                aVar2.f13833b = i21 - i19;
                this.f13830f -= i19;
            }
        }
    }

    public final float b() {
        int i11 = this.f13828d;
        ArrayList<a> arrayList = this.f13826b;
        if (i11 != 0) {
            Collections.sort(arrayList, f13824i);
            this.f13828d = 0;
        }
        float f7 = 0.5f * this.f13830f;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            a aVar = arrayList.get(i13);
            i12 += aVar.f13833b;
            if (i12 >= f7) {
                return aVar.f13834c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((a) o0.b(1, arrayList)).f13834c;
    }

    public final void c() {
        this.f13826b.clear();
        this.f13828d = -1;
        this.f13829e = 0;
        this.f13830f = 0;
    }
}
