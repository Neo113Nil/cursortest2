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

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f14264A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14267D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14268E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f14269F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f14270G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f14271H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f14272I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f14273J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f14274K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f14275L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f14276M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f14277N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float[] f14278O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public g f14279P;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ArrayList f14282S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public e f14283T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public e f14284U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float[] f14286W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float[] f14288Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Rect f14289Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f14290a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14298i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f14301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f14303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f14304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f14305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f14306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f14307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f14308t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f14309u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f14310v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f14311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f14312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f14313y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f14314z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14291b = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f14265B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f14266C = false;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f14280Q = new ArrayList();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final ArrayList f14281R = new ArrayList();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f14285V = true;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f14287X = true;

    public g(k kVar) {
        this.f14290a = kVar;
    }

    public static boolean a(g gVar, d dVar) {
        return (gVar.f14293d & dVar.f14257a) != 0;
    }

    public static CharSequence b(g gVar) {
        CharSequence[] charSequenceArr = {e(gVar.f14306r, gVar.f14307s), gVar.f(), e(gVar.f14312x, gVar.f14313y)};
        CharSequence charSequenceConcat = null;
        for (int i7 = 0; i7 < 3; i7++) {
            CharSequence charSequence = charSequenceArr[i7];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static boolean c(g gVar, d dVar) {
        return (gVar.f14268E & dVar.f14257a) != 0;
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
                int iE = p136t.e.e(iVar.f14317c);
                if (iE == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), iVar.f14315a, iVar.f14316b, 0);
                } else if (iE == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((f) iVar).f14263d)), iVar.f14315a, iVar.f14316b, 0);
                } else if (iE == 2) {
                    spannableString.setSpan(new URLSpan(((j) iVar).f14318d), iVar.f14315a, iVar.f14316b, 0);
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
            int i11 = p136t.e.f(3)[byteBuffer.getInt()];
            int iE = p136t.e.e(i11);
            if (iE == 0) {
                byteBuffer.getInt();
                h hVar = new h();
                hVar.f14315a = i9;
                hVar.f14316b = i10;
                hVar.f14317c = i11;
                arrayList.add(hVar);
            } else if (iE == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                f fVar = new f();
                fVar.f14315a = i9;
                fVar.f14316b = i10;
                fVar.f14317c = i11;
                fVar.f14263d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
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
        Iterator it = this.f14280Q.iterator();
        while (it.hasNext()) {
            ((g) it.next()).d(arrayList);
        }
    }

    public final SpannableString f() {
        ArrayList arrayList = this.f14305q;
        String str = this.f14264A;
        if (str != null && str.length() > 0) {
            arrayList = arrayList == null ? new ArrayList() : new ArrayList(arrayList);
            j jVar = new j();
            jVar.f14315a = 0;
            jVar.f14316b = this.f14304p.length();
            jVar.f14318d = this.f14264A;
            jVar.f14317c = 3;
            arrayList.add(jVar);
        }
        return e(this.f14304p, arrayList);
    }

    public final String g() {
        String str;
        if (i(13) && (str = this.f14304p) != null && !str.isEmpty()) {
            return this.f14304p;
        }
        Iterator it = this.f14280Q.iterator();
        while (it.hasNext()) {
            String strG = ((g) it.next()).g();
            if (strG != null && !strG.isEmpty()) {
                return strG;
            }
        }
        return null;
    }

    public final boolean i(int i7) {
        return (p031e1.k.b(i7) & this.f14292c) != 0;
    }

    public final g j(float[] fArr, boolean z4) {
        float f7 = fArr[3];
        boolean z7 = false;
        float f8 = fArr[0] / f7;
        float f9 = fArr[1] / f7;
        if (f8 < this.f14274K || f8 >= this.f14276M || f9 < this.f14275L || f9 >= this.f14277N) {
            return null;
        }
        float[] fArr2 = new float[4];
        for (g gVar : this.f14281R) {
            if (!gVar.i(14)) {
                if (gVar.f14285V) {
                    gVar.f14285V = false;
                    if (gVar.f14286W == null) {
                        gVar.f14286W = new float[16];
                    }
                    if (!Matrix.invertM(gVar.f14286W, 0, gVar.f14278O, 0)) {
                        Arrays.fill(gVar.f14286W, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, gVar.f14286W, 0, fArr, 0);
                g gVarJ = gVar.j(fArr2, z4);
                if (gVarJ != null) {
                    return gVarJ;
                }
            }
        }
        if (z4 && this.f14298i != -1) {
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
        int i7 = this.f14293d;
        int i8 = k.f14319z;
        return ((i7 & (-61)) == 0 && (this.f14292c & 10682871) == 0 && ((str = this.f14304p) == null || str.isEmpty()) && (((str2 = this.f14306r) == null || str2.isEmpty()) && ((str3 = this.f14312x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void m(float[] fArr, HashSet hashSet, boolean z4) {
        hashSet.add(this);
        if (this.f14287X) {
            z4 = true;
        }
        if (z4) {
            if (this.f14288Y == null) {
                this.f14288Y = new float[16];
            }
            if (this.f14278O == null) {
                this.f14278O = new float[16];
            }
            Matrix.multiplyMM(this.f14288Y, 0, fArr, 0, this.f14278O, 0);
            float[] fArr2 = {this.f14274K, this.f14275L, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            l(fArr3, this.f14288Y, fArr2);
            fArr2[0] = this.f14276M;
            fArr2[1] = this.f14275L;
            l(fArr4, this.f14288Y, fArr2);
            fArr2[0] = this.f14276M;
            fArr2[1] = this.f14277N;
            l(fArr5, this.f14288Y, fArr2);
            fArr2[0] = this.f14274K;
            fArr2[1] = this.f14277N;
            l(fArr6, this.f14288Y, fArr2);
            if (this.f14289Z == null) {
                this.f14289Z = new Rect();
            }
            this.f14289Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f14287X = false;
        }
        int i7 = -1;
        for (g gVar : this.f14280Q) {
            gVar.f14265B = i7;
            i7 = gVar.f14291b;
            gVar.m(this.f14288Y, hashSet, z4);
        }
    }
}
