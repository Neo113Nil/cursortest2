package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public String f14258A;

    /* renamed from: D, reason: collision with root package name */
    public int f14261D;

    /* renamed from: E, reason: collision with root package name */
    public int f14262E;

    /* renamed from: F, reason: collision with root package name */
    public int f14263F;

    /* renamed from: G, reason: collision with root package name */
    public int f14264G;

    /* renamed from: H, reason: collision with root package name */
    public float f14265H;

    /* renamed from: I, reason: collision with root package name */
    public String f14266I;

    /* renamed from: J, reason: collision with root package name */
    public String f14267J;

    /* renamed from: K, reason: collision with root package name */
    public float f14268K;

    /* renamed from: L, reason: collision with root package name */
    public float f14269L;

    /* renamed from: M, reason: collision with root package name */
    public float f14270M;

    /* renamed from: N, reason: collision with root package name */
    public float f14271N;

    /* renamed from: O, reason: collision with root package name */
    public float[] f14272O;

    /* renamed from: P, reason: collision with root package name */
    public g f14273P;

    /* renamed from: S, reason: collision with root package name */
    public ArrayList f14276S;

    /* renamed from: T, reason: collision with root package name */
    public e f14277T;

    /* renamed from: U, reason: collision with root package name */
    public e f14278U;

    /* renamed from: W, reason: collision with root package name */
    public float[] f14280W;

    /* renamed from: Y, reason: collision with root package name */
    public float[] f14282Y;

    /* renamed from: Z, reason: collision with root package name */
    public Rect f14283Z;

    /* renamed from: a, reason: collision with root package name */
    public final k f14284a;

    /* renamed from: c, reason: collision with root package name */
    public int f14286c;

    /* renamed from: d, reason: collision with root package name */
    public int f14287d;

    /* renamed from: e, reason: collision with root package name */
    public int f14288e;

    /* renamed from: f, reason: collision with root package name */
    public int f14289f;

    /* renamed from: g, reason: collision with root package name */
    public int f14290g;

    /* renamed from: h, reason: collision with root package name */
    public int f14291h;

    /* renamed from: i, reason: collision with root package name */
    public int f14292i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f14293k;

    /* renamed from: l, reason: collision with root package name */
    public float f14294l;

    /* renamed from: m, reason: collision with root package name */
    public float f14295m;

    /* renamed from: n, reason: collision with root package name */
    public float f14296n;

    /* renamed from: o, reason: collision with root package name */
    public String f14297o;

    /* renamed from: p, reason: collision with root package name */
    public String f14298p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f14299q;

    /* renamed from: r, reason: collision with root package name */
    public String f14300r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f14301s;

    /* renamed from: t, reason: collision with root package name */
    public String f14302t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f14303u;

    /* renamed from: v, reason: collision with root package name */
    public String f14304v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f14305w;

    /* renamed from: x, reason: collision with root package name */
    public String f14306x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f14307y;

    /* renamed from: z, reason: collision with root package name */
    public String f14308z;

    /* renamed from: b, reason: collision with root package name */
    public int f14285b = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f14259B = -1;

    /* renamed from: C, reason: collision with root package name */
    public boolean f14260C = false;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f14274Q = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f14275R = new ArrayList();

    /* renamed from: V, reason: collision with root package name */
    public boolean f14279V = true;

    /* renamed from: X, reason: collision with root package name */
    public boolean f14281X = true;

    public g(k kVar) {
        this.f14284a = kVar;
    }

    public static boolean a(g gVar, d dVar) {
        return (gVar.f14287d & dVar.f14251a) != 0;
    }

    public static CharSequence b(g gVar) {
        CharSequence[] charSequenceArr = {e(gVar.f14300r, gVar.f14301s), gVar.f(), e(gVar.f14306x, gVar.f14307y)};
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < 3; i7++) {
            CharSequence charSequence2 = charSequenceArr[i7];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static boolean c(g gVar, d dVar) {
        return (gVar.f14262E & dVar.f14251a) != 0;
    }

    public static SpannableString e(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                int e7 = t.e.e(iVar.f14311c);
                if (e7 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), iVar.f14309a, iVar.f14310b, 0);
                } else if (e7 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((f) iVar).f14257d)), iVar.f14309a, iVar.f14310b, 0);
                } else if (e7 == 2) {
                    spannableString.setSpan(new URLSpan(((j) iVar).f14312d), iVar.f14309a, iVar.f14310b, 0);
                }
            }
        }
        return spannableString;
    }

    public static ArrayList h(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i7 = byteBuffer.getInt();
        if (i7 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            int i11 = t.e.f(3)[byteBuffer.getInt()];
            int e7 = t.e.e(i11);
            if (e7 == 0) {
                byteBuffer.getInt();
                h hVar = new h();
                hVar.f14309a = i9;
                hVar.f14310b = i10;
                hVar.f14311c = i11;
                arrayList.add(hVar);
            } else if (e7 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                f fVar = new f();
                fVar.f14309a = i9;
                fVar.f14310b = i10;
                fVar.f14311c = i11;
                fVar.f14257d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public static void l(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f7 = fArr[3];
        fArr[0] = fArr[0] / f7;
        fArr[1] = fArr[1] / f7;
        fArr[2] = fArr[2] / f7;
        fArr[3] = 0.0f;
    }

    public final void d(ArrayList arrayList) {
        if (i(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f14274Q.iterator();
        while (it.hasNext()) {
            ((g) it.next()).d(arrayList);
        }
    }

    public final SpannableString f() {
        ArrayList arrayList = this.f14299q;
        String str = this.f14258A;
        if (str != null && str.length() > 0) {
            arrayList = arrayList == null ? new ArrayList() : new ArrayList(arrayList);
            j jVar = new j();
            jVar.f14309a = 0;
            jVar.f14310b = this.f14298p.length();
            jVar.f14312d = this.f14258A;
            jVar.f14311c = 3;
            arrayList.add(jVar);
        }
        return e(this.f14298p, arrayList);
    }

    public final String g() {
        String str;
        if (i(13) && (str = this.f14298p) != null && !str.isEmpty()) {
            return this.f14298p;
        }
        Iterator it = this.f14274Q.iterator();
        while (it.hasNext()) {
            String g3 = ((g) it.next()).g();
            if (g3 != null && !g3.isEmpty()) {
                return g3;
            }
        }
        return null;
    }

    public final boolean i(int i7) {
        return (e1.k.b(i7) & this.f14286c) != 0;
    }

    public final g j(float[] fArr, boolean z4) {
        float f7 = fArr[3];
        boolean z7 = false;
        float f8 = fArr[0] / f7;
        float f9 = fArr[1] / f7;
        if (f8 < this.f14268K || f8 >= this.f14270M || f9 < this.f14269L || f9 >= this.f14271N) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f14275R.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (!gVar.i(14)) {
                if (gVar.f14279V) {
                    gVar.f14279V = false;
                    if (gVar.f14280W == null) {
                        gVar.f14280W = new float[16];
                    }
                    if (!Matrix.invertM(gVar.f14280W, 0, gVar.f14272O, 0)) {
                        Arrays.fill(gVar.f14280W, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, gVar.f14280W, 0, fArr, 0);
                g j = gVar.j(fArr2, z4);
                if (j != null) {
                    return j;
                }
            }
        }
        if (z4 && this.f14292i != -1) {
            z7 = true;
        }
        if (k() || z7) {
            return this;
        }
        return null;
    }

    public final boolean k() {
        String str;
        String str2;
        String str3;
        if (i(12)) {
            return false;
        }
        if (i(22)) {
            return true;
        }
        int i7 = this.f14287d;
        int i8 = k.f14313z;
        return ((i7 & (-61)) == 0 && (this.f14286c & 10682871) == 0 && ((str = this.f14298p) == null || str.isEmpty()) && (((str2 = this.f14300r) == null || str2.isEmpty()) && ((str3 = this.f14306x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void m(float[] fArr, HashSet hashSet, boolean z4) {
        hashSet.add(this);
        if (this.f14281X) {
            z4 = true;
        }
        if (z4) {
            if (this.f14282Y == null) {
                this.f14282Y = new float[16];
            }
            if (this.f14272O == null) {
                this.f14272O = new float[16];
            }
            Matrix.multiplyMM(this.f14282Y, 0, fArr, 0, this.f14272O, 0);
            float[] fArr2 = {this.f14268K, this.f14269L, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            l(fArr3, this.f14282Y, fArr2);
            fArr2[0] = this.f14270M;
            fArr2[1] = this.f14269L;
            l(fArr4, this.f14282Y, fArr2);
            fArr2[0] = this.f14270M;
            fArr2[1] = this.f14271N;
            l(fArr5, this.f14282Y, fArr2);
            fArr2[0] = this.f14268K;
            fArr2[1] = this.f14271N;
            l(fArr6, this.f14282Y, fArr2);
            if (this.f14283Z == null) {
                this.f14283Z = new Rect();
            }
            this.f14283Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f14281X = false;
        }
        Iterator it = this.f14274Q.iterator();
        int i7 = -1;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.f14259B = i7;
            i7 = gVar.f14285b;
            gVar.m(this.f14282Y, hashSet, z4);
        }
    }
}
