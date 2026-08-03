package io.flutter.view;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public java.lang.String f7830A;

    /* renamed from: B, reason: collision with root package name */
    public java.lang.String f7831B;

    /* renamed from: C, reason: collision with root package name */
    public java.lang.String f7832C;

    /* renamed from: D, reason: collision with root package name */
    public java.lang.String f7833D;

    /* renamed from: E, reason: collision with root package name */
    public int f7834E;

    /* renamed from: F, reason: collision with root package name */
    public int f7835F;

    /* renamed from: I, reason: collision with root package name */
    public long f7837I;

    /* renamed from: J, reason: collision with root package name */
    public int f7838J;

    /* renamed from: K, reason: collision with root package name */
    public int f7839K;

    /* renamed from: L, reason: collision with root package name */
    public int f7840L;

    /* renamed from: M, reason: collision with root package name */
    public float f7841M;

    /* renamed from: N, reason: collision with root package name */
    public java.lang.String f7842N;

    /* renamed from: O, reason: collision with root package name */
    public java.lang.String f7843O;

    /* renamed from: P, reason: collision with root package name */
    public float f7844P;

    /* renamed from: Q, reason: collision with root package name */
    public float f7845Q;

    /* renamed from: R, reason: collision with root package name */
    public float f7846R;

    /* renamed from: S, reason: collision with root package name */
    public float f7847S;

    /* renamed from: T, reason: collision with root package name */
    public float[] f7848T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f7849U;

    /* renamed from: V, reason: collision with root package name */
    public io.flutter.view.g f7850V;
    public java.util.ArrayList Y;

    /* renamed from: Z, reason: collision with root package name */
    public io.flutter.view.f f7853Z;

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.view.h f7854a;

    /* renamed from: a0, reason: collision with root package name */
    public io.flutter.view.f f7855a0;

    /* renamed from: c, reason: collision with root package name */
    public long f7858c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f7859c0;

    /* renamed from: d, reason: collision with root package name */
    public int f7860d;

    /* renamed from: e, reason: collision with root package name */
    public int f7862e;
    public float[] e0;

    /* renamed from: f, reason: collision with root package name */
    public int f7863f;
    public android.graphics.Rect f0;

    /* renamed from: g, reason: collision with root package name */
    public int f7864g;

    /* renamed from: h, reason: collision with root package name */
    public int f7865h;

    /* renamed from: i, reason: collision with root package name */
    public int f7866i;

    /* renamed from: j, reason: collision with root package name */
    public int f7867j;

    /* renamed from: k, reason: collision with root package name */
    public int f7868k;

    /* renamed from: l, reason: collision with root package name */
    public float f7869l;

    /* renamed from: m, reason: collision with root package name */
    public float f7870m;

    /* renamed from: n, reason: collision with root package name */
    public float f7871n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f7872o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f7873p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f7874q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f7875r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f7876s;
    public java.lang.String t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.ArrayList f7877u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f7878v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.ArrayList f7879w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f7880x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f7881y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f7882z;

    /* renamed from: b, reason: collision with root package name */
    public int f7856b = -1;
    public int G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7836H = false;

    /* renamed from: W, reason: collision with root package name */
    public final java.util.ArrayList f7851W = new java.util.ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final java.util.ArrayList f7852X = new java.util.ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f7857b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f7861d0 = true;

    public g(io.flutter.view.h hVar) {
        this.f7854a = hVar;
    }

    public static boolean C(io.flutter.view.g gVar, io.flutter.view.e eVar) {
        return (gVar.f7838J & eVar.f7824a) != 0;
    }

    public static java.util.ArrayList G(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = H.j.c(2)[byteBuffer.getInt()];
            int b2 = H.j.b(i6);
            if (b2 == 0) {
                byteBuffer.getInt();
                io.flutter.view.j jVar = new io.flutter.view.j();
                jVar.f7907a = i4;
                jVar.f7908b = i5;
                jVar.f7909c = i6;
                arrayList.add(jVar);
            } else if (b2 == 1) {
                java.nio.ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                io.flutter.view.i iVar = new io.flutter.view.i();
                iVar.f7907a = i4;
                iVar.f7908b = i5;
                iVar.f7909c = i6;
                iVar.f7906d = java.nio.charset.StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public static void L(float[] fArr, float[] fArr2, float[] fArr3) {
        android.opengl.Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public static android.graphics.Rect f(io.flutter.view.g gVar) {
        return gVar.f0;
    }

    public static boolean k(io.flutter.view.g gVar, io.flutter.view.e eVar) {
        return (gVar.f7860d & eVar.f7824a) != 0;
    }

    public static boolean o(io.flutter.view.g gVar) {
        if (gVar.I(4)) {
            return true;
        }
        java.lang.String str = gVar.f7830A;
        if (str == null || str.isEmpty()) {
            return gVar.I(23);
        }
        return false;
    }

    public static android.text.SpannableString w(io.flutter.view.g gVar) {
        F.C0014n c0014n = new F.C0014n();
        c0014n.f498a = gVar.f7875r;
        c0014n.f499b = gVar.f7876s;
        c0014n.f500c = gVar.E();
        return c0014n.a();
    }

    public static java.lang.CharSequence x(io.flutter.view.g gVar) {
        F.C0014n c0014n = new F.C0014n();
        c0014n.f498a = gVar.f7873p;
        c0014n.f499b = gVar.f7874q;
        c0014n.f501d = gVar.f7830A;
        c0014n.f500c = gVar.E();
        android.text.SpannableString a2 = c0014n.a();
        F.C0014n c0014n2 = new F.C0014n();
        c0014n2.f498a = gVar.f7880x;
        c0014n2.f499b = gVar.f7881y;
        c0014n2.f500c = gVar.E();
        java.lang.CharSequence[] charSequenceArr = {a2, c0014n2.a()};
        java.lang.CharSequence charSequence = null;
        for (int i2 = 0; i2 < 2; i2++) {
            java.lang.CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : android.text.TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static java.lang.CharSequence y(io.flutter.view.g gVar) {
        F.C0014n c0014n = new F.C0014n();
        c0014n.f498a = gVar.f7875r;
        c0014n.f499b = gVar.f7876s;
        c0014n.f500c = gVar.E();
        android.text.SpannableString a2 = c0014n.a();
        F.C0014n c0014n2 = new F.C0014n();
        c0014n2.f498a = gVar.f7873p;
        c0014n2.f499b = gVar.f7874q;
        c0014n2.f501d = gVar.f7830A;
        c0014n2.f500c = gVar.E();
        android.text.SpannableString a3 = c0014n2.a();
        F.C0014n c0014n3 = new F.C0014n();
        c0014n3.f498a = gVar.f7880x;
        c0014n3.f499b = gVar.f7881y;
        c0014n3.f500c = gVar.E();
        java.lang.CharSequence[] charSequenceArr = {a2, a3, c0014n3.a()};
        java.lang.CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            java.lang.CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : android.text.TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public final void D(java.util.ArrayList arrayList) {
        if (I(12)) {
            arrayList.add(this);
        }
        java.util.Iterator it = this.f7851W.iterator();
        while (it.hasNext()) {
            ((io.flutter.view.g) it.next()).D(arrayList);
        }
    }

    public final java.lang.String E() {
        java.lang.String str = this.f7831B;
        return (str == null || str.isEmpty()) ? this.f7854a.f7895l : this.f7831B;
    }

    public final java.lang.String F() {
        java.lang.String str;
        if (I(13) && (str = this.f7873p) != null && !str.isEmpty()) {
            return this.f7873p;
        }
        java.util.Iterator it = this.f7851W.iterator();
        while (it.hasNext()) {
            java.lang.String F2 = ((io.flutter.view.g) it.next()).F();
            if (F2 != null && !F2.isEmpty()) {
                return F2;
            }
        }
        return null;
    }

    public final boolean H(int i2) {
        return (this.f7837I & ((long) B1.a.d(i2))) != 0;
    }

    public final boolean I(int i2) {
        return (this.f7858c & ((long) B1.a.d(i2))) != 0;
    }

    public final io.flutter.view.g J(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.f7844P || f3 >= this.f7846R || f4 < this.f7845Q || f4 >= this.f7847S) {
            return null;
        }
        float[] fArr2 = new float[4];
        java.util.Iterator it = this.f7852X.iterator();
        while (it.hasNext()) {
            io.flutter.view.g gVar = (io.flutter.view.g) it.next();
            if (!gVar.I(14)) {
                if (gVar.f7857b0) {
                    gVar.f7857b0 = false;
                    if (gVar.f7859c0 == null) {
                        gVar.f7859c0 = new float[16];
                    }
                    if (!android.opengl.Matrix.invertM(gVar.f7859c0, 0, gVar.f7849U, 0)) {
                        java.util.Arrays.fill(gVar.f7859c0, 0.0f);
                    }
                }
                android.opengl.Matrix.multiplyMV(fArr2, 0, gVar.f7859c0, 0, fArr, 0);
                io.flutter.view.g J2 = gVar.J(fArr2, z2);
                if (J2 != null) {
                    return J2;
                }
            }
        }
        if (z2 && this.f7866i != -1) {
            z3 = true;
        }
        if (K() || z3) {
            return this;
        }
        return null;
    }

    public final boolean K() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (I(12)) {
            return false;
        }
        if (I(22)) {
            return true;
        }
        if (I(32)) {
            return false;
        }
        int i2 = this.f7860d;
        int i3 = io.flutter.view.h.f7883x;
        return ((i2 & (-61)) == 0 && (this.f7858c & ((long) 10682871)) == 0 && ((str = this.f7873p) == null || str.isEmpty()) && (((str2 = this.f7875r) == null || str2.isEmpty()) && ((str3 = this.f7880x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void M(float[] fArr, java.util.HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f7861d0) {
            z2 = true;
        }
        if (z2) {
            if (this.e0 == null) {
                this.e0 = new float[16];
            }
            if (this.f7848T == null) {
                this.f7848T = new float[16];
            }
            android.opengl.Matrix.multiplyMM(this.e0, 0, fArr, 0, this.f7848T, 0);
            float[] fArr2 = {this.f7844P, this.f7845Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            L(fArr3, this.e0, fArr2);
            fArr2[0] = this.f7846R;
            fArr2[1] = this.f7845Q;
            L(fArr4, this.e0, fArr2);
            fArr2[0] = this.f7846R;
            fArr2[1] = this.f7847S;
            L(fArr5, this.e0, fArr2);
            fArr2[0] = this.f7844P;
            fArr2[1] = this.f7847S;
            L(fArr6, this.e0, fArr2);
            if (this.f0 == null) {
                this.f0 = new android.graphics.Rect();
            }
            this.f0.set(java.lang.Math.round(java.lang.Math.min(fArr3[0], java.lang.Math.min(fArr4[0], java.lang.Math.min(fArr5[0], fArr6[0])))), java.lang.Math.round(java.lang.Math.min(fArr3[1], java.lang.Math.min(fArr4[1], java.lang.Math.min(fArr5[1], fArr6[1])))), java.lang.Math.round(java.lang.Math.max(fArr3[0], java.lang.Math.max(fArr4[0], java.lang.Math.max(fArr5[0], fArr6[0])))), java.lang.Math.round(java.lang.Math.max(fArr3[1], java.lang.Math.max(fArr4[1], java.lang.Math.max(fArr5[1], fArr6[1])))));
            this.f7861d0 = false;
        }
        java.util.Iterator it = this.f7851W.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            io.flutter.view.g gVar = (io.flutter.view.g) it.next();
            gVar.G = i2;
            i2 = gVar.f7856b;
            gVar.M(this.e0, hashSet, z2);
        }
    }
}
