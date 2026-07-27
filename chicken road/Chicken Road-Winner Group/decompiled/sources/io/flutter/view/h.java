package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public String f9373A;

    /* renamed from: B, reason: collision with root package name */
    public String f9374B;

    /* renamed from: C, reason: collision with root package name */
    public String f9375C;

    /* renamed from: D, reason: collision with root package name */
    public String f9376D;

    /* renamed from: E, reason: collision with root package name */
    public int f9377E;

    /* renamed from: F, reason: collision with root package name */
    public int f9378F;

    /* renamed from: I, reason: collision with root package name */
    public long f9381I;

    /* renamed from: J, reason: collision with root package name */
    public int f9382J;

    /* renamed from: K, reason: collision with root package name */
    public int f9383K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public float f9384M;

    /* renamed from: N, reason: collision with root package name */
    public String f9385N;

    /* renamed from: O, reason: collision with root package name */
    public String f9386O;

    /* renamed from: P, reason: collision with root package name */
    public float f9387P;

    /* renamed from: Q, reason: collision with root package name */
    public float f9388Q;

    /* renamed from: R, reason: collision with root package name */
    public float f9389R;

    /* renamed from: S, reason: collision with root package name */
    public float f9390S;

    /* renamed from: T, reason: collision with root package name */
    public float[] f9391T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f9392U;

    /* renamed from: V, reason: collision with root package name */
    public h f9393V;

    /* renamed from: Y, reason: collision with root package name */
    public ArrayList f9396Y;

    /* renamed from: Z, reason: collision with root package name */
    public g f9397Z;

    /* renamed from: a, reason: collision with root package name */
    public final i f9398a;

    /* renamed from: a0, reason: collision with root package name */
    public g f9399a0;

    /* renamed from: c, reason: collision with root package name */
    public long f9402c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f9403c0;

    /* renamed from: d, reason: collision with root package name */
    public int f9404d;

    /* renamed from: e, reason: collision with root package name */
    public int f9406e;

    /* renamed from: e0, reason: collision with root package name */
    public float[] f9407e0;
    public int f;
    public Rect f0;

    /* renamed from: g, reason: collision with root package name */
    public int f9408g;

    /* renamed from: h, reason: collision with root package name */
    public int f9409h;

    /* renamed from: i, reason: collision with root package name */
    public int f9410i;

    /* renamed from: j, reason: collision with root package name */
    public int f9411j;

    /* renamed from: k, reason: collision with root package name */
    public int f9412k;

    /* renamed from: l, reason: collision with root package name */
    public float f9413l;

    /* renamed from: m, reason: collision with root package name */
    public float f9414m;

    /* renamed from: n, reason: collision with root package name */
    public float f9415n;

    /* renamed from: o, reason: collision with root package name */
    public String f9416o;

    /* renamed from: p, reason: collision with root package name */
    public String f9417p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f9418q;

    /* renamed from: r, reason: collision with root package name */
    public String f9419r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f9420s;

    /* renamed from: t, reason: collision with root package name */
    public String f9421t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f9422u;

    /* renamed from: v, reason: collision with root package name */
    public String f9423v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f9424w;

    /* renamed from: x, reason: collision with root package name */
    public String f9425x;
    public ArrayList y;

    /* renamed from: z, reason: collision with root package name */
    public String f9426z;

    /* renamed from: b, reason: collision with root package name */
    public int f9400b = -1;

    /* renamed from: G, reason: collision with root package name */
    public int f9379G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9380H = false;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f9394W = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f9395X = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f9401b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f9405d0 = true;

    public h(i iVar) {
        this.f9398a = iVar;
    }

    public static boolean a(h hVar, f fVar) {
        return (hVar.f9404d & fVar.f9367a) != 0;
    }

    public static CharSequence b(h hVar) {
        D0.a aVar = new D0.a();
        aVar.f264d = hVar.f9419r;
        aVar.f262b = hVar.f9420s;
        aVar.f261a = hVar.d();
        SpannableString a3 = aVar.a();
        D0.a aVar2 = new D0.a();
        aVar2.f264d = hVar.f9417p;
        aVar2.f262b = hVar.f9418q;
        aVar2.f263c = hVar.f9373A;
        aVar2.f261a = hVar.d();
        SpannableString a4 = aVar2.a();
        D0.a aVar3 = new D0.a();
        aVar3.f264d = hVar.f9425x;
        aVar3.f262b = hVar.y;
        aVar3.f261a = hVar.d();
        CharSequence[] charSequenceArr = {a3, a4, aVar3.a()};
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < 3; i3++) {
            CharSequence charSequence2 = charSequenceArr[i3];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = byteBuffer.getInt();
            int i6 = byteBuffer.getInt();
            int i7 = M.j.c(2)[byteBuffer.getInt()];
            int b3 = M.j.b(i7);
            if (b3 == 0) {
                byteBuffer.getInt();
                k kVar = new k();
                kVar.f9451a = i5;
                kVar.f9452b = i6;
                kVar.f9453c = i7;
                arrayList.add(kVar);
            } else if (b3 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                j jVar = new j();
                jVar.f9451a = i5;
                jVar.f9452b = i6;
                jVar.f9453c = i7;
                jVar.f9450d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f = fArr[3];
        fArr[0] = fArr[0] / f;
        fArr[1] = fArr[1] / f;
        fArr[2] = fArr[2] / f;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f9394W.iterator();
        while (it.hasNext()) {
            ((h) it.next()).c(arrayList);
        }
    }

    public final String d() {
        String str = this.f9374B;
        return (str == null || str.isEmpty()) ? this.f9398a.f9438m : this.f9374B;
    }

    public final String e() {
        String str;
        if (h(13) && (str = this.f9417p) != null && !str.isEmpty()) {
            return this.f9417p;
        }
        Iterator it = this.f9394W.iterator();
        while (it.hasNext()) {
            String e3 = ((h) it.next()).e();
            if (e3 != null && !e3.isEmpty()) {
                return e3;
            }
        }
        return null;
    }

    public final boolean g(int i3) {
        return (this.f9381I & ((long) B0.c.d(i3))) != 0;
    }

    public final boolean h(int i3) {
        return (this.f9402c & ((long) B0.c.d(i3))) != 0;
    }

    public final h i(float[] fArr, boolean z3) {
        float f = fArr[3];
        boolean z4 = false;
        float f3 = fArr[0] / f;
        float f4 = fArr[1] / f;
        if (f3 < this.f9387P || f3 >= this.f9389R || f4 < this.f9388Q || f4 >= this.f9390S) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f9395X.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!hVar.h(14)) {
                if (hVar.f9401b0) {
                    hVar.f9401b0 = false;
                    if (hVar.f9403c0 == null) {
                        hVar.f9403c0 = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f9403c0, 0, hVar.f9392U, 0)) {
                        Arrays.fill(hVar.f9403c0, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, hVar.f9403c0, 0, fArr3, 0);
                h i3 = hVar.i(fArr2, z3);
                if (i3 != null) {
                    return i3;
                }
                fArr = fArr3;
            }
        }
        if (z3 && this.f9410i != -1) {
            z4 = true;
        }
        if (j() || z4) {
            return this;
        }
        return null;
    }

    public final boolean j() {
        if (h(12)) {
            return false;
        }
        if (h(22)) {
            return true;
        }
        if (h(32)) {
            return false;
        }
        int i3 = this.f9404d;
        int i4 = i.y;
        if ((i3 & (-61)) != 0 || (this.f9402c & 10682871) != 0) {
            return true;
        }
        String str = this.f9417p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f9419r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f9425x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z3) {
        hashSet.add(this);
        if (this.f9405d0) {
            z3 = true;
        }
        if (z3) {
            if (this.f9407e0 == null) {
                this.f9407e0 = new float[16];
            }
            if (this.f9391T == null) {
                this.f9391T = new float[16];
            }
            Matrix.multiplyMM(this.f9407e0, 0, fArr, 0, this.f9391T, 0);
            float[] fArr2 = {this.f9387P, this.f9388Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.f9407e0, fArr2);
            fArr2[0] = this.f9389R;
            fArr2[1] = this.f9388Q;
            k(fArr4, this.f9407e0, fArr2);
            fArr2[0] = this.f9389R;
            fArr2[1] = this.f9390S;
            k(fArr5, this.f9407e0, fArr2);
            fArr2[0] = this.f9387P;
            fArr2[1] = this.f9390S;
            k(fArr6, this.f9407e0, fArr2);
            if (this.f0 == null) {
                this.f0 = new Rect();
            }
            this.f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f9405d0 = false;
        }
        Iterator it = this.f9394W.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            hVar.f9379G = i3;
            i3 = hVar.f9400b;
            hVar.l(this.f9407e0, hashSet, z3);
        }
    }
}
