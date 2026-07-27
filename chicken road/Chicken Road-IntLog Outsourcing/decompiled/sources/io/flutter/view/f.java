package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import b2.AbstractC0279e;
import f2.t;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: A, reason: collision with root package name */
    public String f10300A;

    /* renamed from: B, reason: collision with root package name */
    public String f10301B;

    /* renamed from: C, reason: collision with root package name */
    public String f10302C;

    /* renamed from: D, reason: collision with root package name */
    public String f10303D;

    /* renamed from: E, reason: collision with root package name */
    public int f10304E;

    /* renamed from: F, reason: collision with root package name */
    public int f10305F;

    /* renamed from: I, reason: collision with root package name */
    public long f10308I;

    /* renamed from: J, reason: collision with root package name */
    public int f10309J;

    /* renamed from: K, reason: collision with root package name */
    public int f10310K;

    /* renamed from: L, reason: collision with root package name */
    public int f10311L;

    /* renamed from: M, reason: collision with root package name */
    public float f10312M;
    public String N;

    /* renamed from: O, reason: collision with root package name */
    public String f10313O;

    /* renamed from: P, reason: collision with root package name */
    public float f10314P;

    /* renamed from: Q, reason: collision with root package name */
    public float f10315Q;

    /* renamed from: R, reason: collision with root package name */
    public float f10316R;

    /* renamed from: S, reason: collision with root package name */
    public float f10317S;

    /* renamed from: T, reason: collision with root package name */
    public float[] f10318T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f10319U;

    /* renamed from: V, reason: collision with root package name */
    public f f10320V;

    /* renamed from: Y, reason: collision with root package name */
    public ArrayList f10323Y;

    /* renamed from: Z, reason: collision with root package name */
    public e f10324Z;

    /* renamed from: a, reason: collision with root package name */
    public final g f10325a;

    /* renamed from: a0, reason: collision with root package name */
    public e f10326a0;

    /* renamed from: c, reason: collision with root package name */
    public long f10329c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f10330c0;

    /* renamed from: d, reason: collision with root package name */
    public int f10331d;

    /* renamed from: e, reason: collision with root package name */
    public int f10333e;

    /* renamed from: e0, reason: collision with root package name */
    public float[] f10334e0;

    /* renamed from: f, reason: collision with root package name */
    public int f10335f;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f10336f0;

    /* renamed from: g, reason: collision with root package name */
    public int f10337g;

    /* renamed from: h, reason: collision with root package name */
    public int f10338h;

    /* renamed from: i, reason: collision with root package name */
    public int f10339i;

    /* renamed from: j, reason: collision with root package name */
    public int f10340j;

    /* renamed from: k, reason: collision with root package name */
    public int f10341k;

    /* renamed from: l, reason: collision with root package name */
    public float f10342l;

    /* renamed from: m, reason: collision with root package name */
    public float f10343m;

    /* renamed from: n, reason: collision with root package name */
    public float f10344n;

    /* renamed from: o, reason: collision with root package name */
    public String f10345o;

    /* renamed from: p, reason: collision with root package name */
    public String f10346p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f10347q;

    /* renamed from: r, reason: collision with root package name */
    public String f10348r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f10349s;

    /* renamed from: t, reason: collision with root package name */
    public String f10350t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f10351u;

    /* renamed from: v, reason: collision with root package name */
    public String f10352v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f10353w;

    /* renamed from: x, reason: collision with root package name */
    public String f10354x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f10355y;
    public String z;

    /* renamed from: b, reason: collision with root package name */
    public int f10327b = -1;

    /* renamed from: G, reason: collision with root package name */
    public int f10306G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f10307H = false;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f10321W = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f10322X = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f10328b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f10332d0 = true;

    public f(g gVar) {
        this.f10325a = gVar;
    }

    public static boolean C(f fVar, d dVar) {
        return (fVar.f10309J & dVar.f10294a) != 0;
    }

    public static ArrayList G(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i6 = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            int i8 = O.j.c(2)[byteBuffer.getInt()];
            int b6 = O.j.b(i8);
            if (b6 == 0) {
                byteBuffer.getInt();
                i iVar = new i();
                iVar.f10381a = i6;
                iVar.f10382b = i7;
                iVar.f10383c = i8;
                arrayList.add(iVar);
            } else if (b6 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                h hVar = new h();
                hVar.f10381a = i6;
                hVar.f10382b = i7;
                hVar.f10383c = i8;
                hVar.f10380d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static void L(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f3 = fArr[3];
        fArr[0] = fArr[0] / f3;
        fArr[1] = fArr[1] / f3;
        fArr[2] = fArr[2] / f3;
        fArr[3] = 0.0f;
    }

    public static Rect f(f fVar) {
        return fVar.f10336f0;
    }

    public static boolean k(f fVar, d dVar) {
        return (fVar.f10331d & dVar.f10294a) != 0;
    }

    public static boolean o(f fVar) {
        if (fVar.I(4)) {
            return true;
        }
        String str = fVar.f10300A;
        if (str == null || str.isEmpty()) {
            return fVar.I(23);
        }
        return false;
    }

    public static SpannableString w(f fVar) {
        t tVar = new t();
        tVar.f5636a = fVar.f10348r;
        tVar.f5637b = fVar.f10349s;
        tVar.f5638c = fVar.E();
        return tVar.a();
    }

    public static CharSequence x(f fVar) {
        t tVar = new t();
        tVar.f5636a = fVar.f10346p;
        tVar.f5637b = fVar.f10347q;
        tVar.f5639d = fVar.f10300A;
        tVar.f5638c = fVar.E();
        SpannableString a6 = tVar.a();
        t tVar2 = new t();
        tVar2.f5636a = fVar.f10354x;
        tVar2.f5637b = fVar.f10355y;
        tVar2.f5638c = fVar.E();
        CharSequence[] charSequenceArr = {a6, tVar2.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 2; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static CharSequence y(f fVar) {
        t tVar = new t();
        tVar.f5636a = fVar.f10348r;
        tVar.f5637b = fVar.f10349s;
        tVar.f5638c = fVar.E();
        SpannableString a6 = tVar.a();
        t tVar2 = new t();
        tVar2.f5636a = fVar.f10346p;
        tVar2.f5637b = fVar.f10347q;
        tVar2.f5639d = fVar.f10300A;
        tVar2.f5638c = fVar.E();
        SpannableString a7 = tVar2.a();
        t tVar3 = new t();
        tVar3.f5636a = fVar.f10354x;
        tVar3.f5637b = fVar.f10355y;
        tVar3.f5638c = fVar.E();
        CharSequence[] charSequenceArr = {a6, a7, tVar3.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public final void D(ArrayList arrayList) {
        if (I(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f10321W.iterator();
        while (it.hasNext()) {
            ((f) it.next()).D(arrayList);
        }
    }

    public final String E() {
        String str = this.f10301B;
        return (str == null || str.isEmpty()) ? this.f10325a.f10368l : this.f10301B;
    }

    public final String F() {
        String str;
        if (I(13) && (str = this.f10346p) != null && !str.isEmpty()) {
            return this.f10346p;
        }
        Iterator it = this.f10321W.iterator();
        while (it.hasNext()) {
            String F2 = ((f) it.next()).F();
            if (F2 != null && !F2.isEmpty()) {
                return F2;
            }
        }
        return null;
    }

    public final boolean H(int i2) {
        return (this.f10308I & ((long) AbstractC0279e.b(i2))) != 0;
    }

    public final boolean I(int i2) {
        return (this.f10329c & ((long) AbstractC0279e.b(i2))) != 0;
    }

    public final f J(float[] fArr, boolean z) {
        float f3 = fArr[3];
        boolean z5 = false;
        float f6 = fArr[0] / f3;
        float f7 = fArr[1] / f3;
        if (f6 < this.f10314P || f6 >= this.f10316R || f7 < this.f10315Q || f7 >= this.f10317S) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f10322X.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!fVar.I(14)) {
                if (fVar.f10328b0) {
                    fVar.f10328b0 = false;
                    if (fVar.f10330c0 == null) {
                        fVar.f10330c0 = new float[16];
                    }
                    if (!Matrix.invertM(fVar.f10330c0, 0, fVar.f10319U, 0)) {
                        Arrays.fill(fVar.f10330c0, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, fVar.f10330c0, 0, fArr, 0);
                f J4 = fVar.J(fArr2, z);
                if (J4 != null) {
                    return J4;
                }
            }
        }
        if (z && this.f10339i != -1) {
            z5 = true;
        }
        if (K() || z5) {
            return this;
        }
        return null;
    }

    public final boolean K() {
        String str;
        String str2;
        String str3;
        if (I(12)) {
            return false;
        }
        if (I(22)) {
            return true;
        }
        if (I(32)) {
            return false;
        }
        int i2 = this.f10331d;
        int i3 = g.f10356x;
        return ((i2 & (-61)) == 0 && (this.f10329c & ((long) 10682871)) == 0 && ((str = this.f10346p) == null || str.isEmpty()) && (((str2 = this.f10348r) == null || str2.isEmpty()) && ((str3 = this.f10354x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void M(float[] fArr, HashSet hashSet, boolean z) {
        hashSet.add(this);
        if (this.f10332d0) {
            z = true;
        }
        if (z) {
            if (this.f10334e0 == null) {
                this.f10334e0 = new float[16];
            }
            if (this.f10318T == null) {
                this.f10318T = new float[16];
            }
            Matrix.multiplyMM(this.f10334e0, 0, fArr, 0, this.f10318T, 0);
            float[] fArr2 = {this.f10314P, this.f10315Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            L(fArr3, this.f10334e0, fArr2);
            fArr2[0] = this.f10316R;
            fArr2[1] = this.f10315Q;
            L(fArr4, this.f10334e0, fArr2);
            fArr2[0] = this.f10316R;
            fArr2[1] = this.f10317S;
            L(fArr5, this.f10334e0, fArr2);
            fArr2[0] = this.f10314P;
            fArr2[1] = this.f10317S;
            L(fArr6, this.f10334e0, fArr2);
            if (this.f10336f0 == null) {
                this.f10336f0 = new Rect();
            }
            this.f10336f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f10332d0 = false;
        }
        Iterator it = this.f10321W.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            f fVar = (f) it.next();
            fVar.f10306G = i2;
            i2 = fVar.f10327b;
            fVar.M(this.f10334e0, hashSet, z);
        }
    }
}
