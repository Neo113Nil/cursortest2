package io.flutter.view;

import F.AbstractC0010k;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import o.AbstractC0071c;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public String f754A;
    public String B;

    /* renamed from: C, reason: collision with root package name */
    public String f755C;

    /* renamed from: D, reason: collision with root package name */
    public String f756D;

    /* renamed from: E, reason: collision with root package name */
    public int f757E;

    /* renamed from: F, reason: collision with root package name */
    public int f758F;

    /* renamed from: I, reason: collision with root package name */
    public long f761I;

    /* renamed from: J, reason: collision with root package name */
    public int f762J;

    /* renamed from: K, reason: collision with root package name */
    public int f763K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public float f764M;
    public String N;

    /* renamed from: O, reason: collision with root package name */
    public String f765O;

    /* renamed from: P, reason: collision with root package name */
    public float f766P;

    /* renamed from: Q, reason: collision with root package name */
    public float f767Q;

    /* renamed from: R, reason: collision with root package name */
    public float f768R;

    /* renamed from: S, reason: collision with root package name */
    public float f769S;

    /* renamed from: T, reason: collision with root package name */
    public float[] f770T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f771U;

    /* renamed from: V, reason: collision with root package name */
    public h f772V;

    /* renamed from: Y, reason: collision with root package name */
    public ArrayList f775Y;

    /* renamed from: Z, reason: collision with root package name */
    public g f776Z;

    /* renamed from: a, reason: collision with root package name */
    public final i f777a;

    /* renamed from: a0, reason: collision with root package name */
    public g f778a0;

    /* renamed from: c, reason: collision with root package name */
    public long f781c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f782c0;

    /* renamed from: d, reason: collision with root package name */
    public int f783d;

    /* renamed from: e, reason: collision with root package name */
    public int f785e;
    public float[] e0;

    /* renamed from: f, reason: collision with root package name */
    public int f786f;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f787f0;

    /* renamed from: g, reason: collision with root package name */
    public int f788g;

    /* renamed from: h, reason: collision with root package name */
    public int f789h;

    /* renamed from: i, reason: collision with root package name */
    public int f790i;

    /* renamed from: j, reason: collision with root package name */
    public int f791j;

    /* renamed from: k, reason: collision with root package name */
    public int f792k;

    /* renamed from: l, reason: collision with root package name */
    public float f793l;

    /* renamed from: m, reason: collision with root package name */
    public float f794m;

    /* renamed from: n, reason: collision with root package name */
    public float f795n;

    /* renamed from: o, reason: collision with root package name */
    public String f796o;

    /* renamed from: p, reason: collision with root package name */
    public String f797p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f798q;

    /* renamed from: r, reason: collision with root package name */
    public String f799r;

    /* renamed from: s, reason: collision with root package name */
    public List f800s;

    /* renamed from: t, reason: collision with root package name */
    public String f801t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f802u;
    public String v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f803w;

    /* renamed from: x, reason: collision with root package name */
    public String f804x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f805y;

    /* renamed from: z, reason: collision with root package name */
    public String f806z;

    /* renamed from: b, reason: collision with root package name */
    public int f779b = -1;

    /* renamed from: G, reason: collision with root package name */
    public int f759G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f760H = false;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f773W = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f774X = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f780b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f784d0 = true;

    public h(i iVar) {
        this.f777a = iVar;
    }

    public static boolean a(h hVar, f fVar) {
        return (hVar.f783d & fVar.f748b) != 0;
    }

    public static CharSequence b(h hVar) {
        C.e eVar = new C.e();
        eVar.f8a = hVar.f799r;
        eVar.f9b = hVar.f800s;
        eVar.f10c = hVar.d();
        SpannableString a2 = eVar.a();
        C.e eVar2 = new C.e();
        eVar2.f8a = hVar.f797p;
        eVar2.f9b = hVar.f798q;
        eVar2.f11d = hVar.f754A;
        eVar2.f10c = hVar.d();
        SpannableString a3 = eVar2.a();
        C.e eVar3 = new C.e();
        eVar3.f8a = hVar.f804x;
        eVar3.f9b = hVar.f805y;
        eVar3.f10c = hVar.d();
        CharSequence[] charSequenceArr = {a2, a3, eVar3.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = AbstractC0071c.b(2)[byteBuffer.getInt()];
            int a2 = AbstractC0071c.a(i6);
            if (a2 == 0) {
                byteBuffer.getInt();
                k kVar = new k();
                kVar.f831a = i4;
                kVar.f832b = i5;
                kVar.f833c = i6;
                arrayList.add(kVar);
            } else if (a2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                j jVar = new j();
                jVar.f831a = i4;
                jVar.f832b = i5;
                jVar.f833c = i6;
                jVar.f830d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        ArrayList arrayList2 = this.f773W;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((h) obj).c(arrayList);
        }
    }

    public final String d() {
        String str = this.B;
        return (str == null || str.isEmpty()) ? this.f777a.f819l : this.B;
    }

    public final String e() {
        String str;
        if (h(13) && (str = this.f797p) != null && !str.isEmpty()) {
            return this.f797p;
        }
        ArrayList arrayList = this.f773W;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String e2 = ((h) obj).e();
            if (e2 != null && !e2.isEmpty()) {
                return e2;
            }
        }
        return null;
    }

    public final boolean g(int i2) {
        return (this.f761I & ((long) AbstractC0010k.d(i2))) != 0;
    }

    public final boolean h(int i2) {
        return (this.f781c & ((long) AbstractC0010k.d(i2))) != 0;
    }

    public final h i(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.f766P || f3 >= this.f768R || f4 < this.f767Q || f4 >= this.f769S) {
            return null;
        }
        float[] fArr2 = new float[4];
        ArrayList arrayList = this.f774X;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            h hVar = (h) arrayList.get(i2);
            if (!hVar.h(14)) {
                if (hVar.f780b0) {
                    hVar.f780b0 = false;
                    if (hVar.f782c0 == null) {
                        hVar.f782c0 = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f782c0, 0, hVar.f771U, 0)) {
                        Arrays.fill(hVar.f782c0, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, hVar.f782c0, 0, fArr3, 0);
                h i4 = hVar.i(fArr2, z2);
                if (i4 != null) {
                    return i4;
                }
                fArr = fArr3;
            }
            i2 = i3;
        }
        if (z2 && this.f790i != -1) {
            z3 = true;
        }
        if (j() || z3) {
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
        int i2 = this.f783d;
        int i3 = i.f807x;
        if ((i2 & (-61)) != 0 || (this.f781c & 10682871) != 0) {
            return true;
        }
        String str = this.f797p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f799r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f804x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f784d0) {
            z2 = true;
        }
        int i2 = 0;
        if (z2) {
            if (this.e0 == null) {
                this.e0 = new float[16];
            }
            if (this.f770T == null) {
                this.f770T = new float[16];
            }
            Matrix.multiplyMM(this.e0, 0, fArr, 0, this.f770T, 0);
            float[] fArr2 = {this.f766P, this.f767Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.e0, fArr2);
            fArr2[0] = this.f768R;
            fArr2[1] = this.f767Q;
            k(fArr4, this.e0, fArr2);
            fArr2[0] = this.f768R;
            fArr2[1] = this.f769S;
            k(fArr5, this.e0, fArr2);
            fArr2[0] = this.f766P;
            fArr2[1] = this.f769S;
            k(fArr6, this.e0, fArr2);
            if (this.f787f0 == null) {
                this.f787f0 = new Rect();
            }
            this.f787f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f784d0 = false;
        }
        ArrayList arrayList = this.f773W;
        int size = arrayList.size();
        int i3 = -1;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            h hVar = (h) obj;
            hVar.f759G = i3;
            i3 = hVar.f779b;
            hVar.l(this.e0, hashSet, z2);
        }
    }
}
