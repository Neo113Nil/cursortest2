package A1;

import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w2.C1767b;

/* loaded from: classes.dex */
public final class X implements InterfaceC0027k {

    /* renamed from: X, reason: collision with root package name */
    public static final X f279X = new X(new Format$Builder());

    /* renamed from: Y, reason: collision with root package name */
    public static final C0046u f280Y = new C0046u(5);

    /* renamed from: A, reason: collision with root package name */
    public final Metadata f281A;

    /* renamed from: B, reason: collision with root package name */
    public final String f282B;

    /* renamed from: C, reason: collision with root package name */
    public final String f283C;

    /* renamed from: D, reason: collision with root package name */
    public final int f284D;

    /* renamed from: E, reason: collision with root package name */
    public final List f285E;

    /* renamed from: F, reason: collision with root package name */
    public final DrmInitData f286F;

    /* renamed from: G, reason: collision with root package name */
    public final long f287G;

    /* renamed from: H, reason: collision with root package name */
    public final int f288H;

    /* renamed from: I, reason: collision with root package name */
    public final int f289I;

    /* renamed from: J, reason: collision with root package name */
    public final float f290J;

    /* renamed from: K, reason: collision with root package name */
    public final int f291K;

    /* renamed from: L, reason: collision with root package name */
    public final float f292L;

    /* renamed from: M, reason: collision with root package name */
    public final byte[] f293M;

    /* renamed from: N, reason: collision with root package name */
    public final int f294N;

    /* renamed from: O, reason: collision with root package name */
    public final C1767b f295O;

    /* renamed from: P, reason: collision with root package name */
    public final int f296P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f297Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f298R;

    /* renamed from: S, reason: collision with root package name */
    public final int f299S;

    /* renamed from: T, reason: collision with root package name */
    public final int f300T;

    /* renamed from: U, reason: collision with root package name */
    public final int f301U;

    /* renamed from: V, reason: collision with root package name */
    public final int f302V;

    /* renamed from: W, reason: collision with root package name */
    public int f303W;

    /* renamed from: a, reason: collision with root package name */
    public final String f304a;

    /* renamed from: b, reason: collision with root package name */
    public final String f305b;

    /* renamed from: c, reason: collision with root package name */
    public final String f306c;

    /* renamed from: d, reason: collision with root package name */
    public final int f307d;

    /* renamed from: e, reason: collision with root package name */
    public final int f308e;

    /* renamed from: f, reason: collision with root package name */
    public final int f309f;

    /* renamed from: x, reason: collision with root package name */
    public final int f310x;

    /* renamed from: y, reason: collision with root package name */
    public final int f311y;

    /* renamed from: z, reason: collision with root package name */
    public final String f312z;

    public X(Format$Builder format$Builder) {
        this.f304a = format$Builder.f10528a;
        this.f305b = format$Builder.f10529b;
        this.f306c = v2.t.F(format$Builder.f10530c);
        this.f307d = format$Builder.f10531d;
        this.f308e = format$Builder.f10532e;
        int i7 = format$Builder.f10533f;
        this.f309f = i7;
        int i8 = format$Builder.f10534g;
        this.f310x = i8;
        this.f311y = i8 != -1 ? i8 : i7;
        this.f312z = format$Builder.f10535h;
        this.f281A = format$Builder.f10536i;
        this.f282B = format$Builder.j;
        this.f283C = format$Builder.f10537k;
        this.f284D = format$Builder.f10538l;
        List list = format$Builder.f10539m;
        this.f285E = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = format$Builder.f10540n;
        this.f286F = drmInitData;
        this.f287G = format$Builder.f10541o;
        this.f288H = format$Builder.f10542p;
        this.f289I = format$Builder.f10543q;
        this.f290J = format$Builder.f10544r;
        int i9 = format$Builder.f10545s;
        this.f291K = i9 == -1 ? 0 : i9;
        float f7 = format$Builder.f10546t;
        this.f292L = f7 == -1.0f ? 1.0f : f7;
        this.f293M = format$Builder.f10547u;
        this.f294N = format$Builder.f10548v;
        this.f295O = format$Builder.f10549w;
        this.f296P = format$Builder.f10550x;
        this.f297Q = format$Builder.f10551y;
        this.f298R = format$Builder.f10552z;
        int i10 = format$Builder.f10524A;
        this.f299S = i10 == -1 ? 0 : i10;
        int i11 = format$Builder.f10525B;
        this.f300T = i11 != -1 ? i11 : 0;
        this.f301U = format$Builder.f10526C;
        int i12 = format$Builder.f10527D;
        if (i12 != 0 || drmInitData == null) {
            this.f302V = i12;
        } else {
            this.f302V = 1;
        }
    }

    public final Format$Builder a() {
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10528a = this.f304a;
        format$Builder.f10529b = this.f305b;
        format$Builder.f10530c = this.f306c;
        format$Builder.f10531d = this.f307d;
        format$Builder.f10532e = this.f308e;
        format$Builder.f10533f = this.f309f;
        format$Builder.f10534g = this.f310x;
        format$Builder.f10535h = this.f312z;
        format$Builder.f10536i = this.f281A;
        format$Builder.j = this.f282B;
        format$Builder.f10537k = this.f283C;
        format$Builder.f10538l = this.f284D;
        format$Builder.f10539m = this.f285E;
        format$Builder.f10540n = this.f286F;
        format$Builder.f10541o = this.f287G;
        format$Builder.f10542p = this.f288H;
        format$Builder.f10543q = this.f289I;
        format$Builder.f10544r = this.f290J;
        format$Builder.f10545s = this.f291K;
        format$Builder.f10546t = this.f292L;
        format$Builder.f10547u = this.f293M;
        format$Builder.f10548v = this.f294N;
        format$Builder.f10549w = this.f295O;
        format$Builder.f10550x = this.f296P;
        format$Builder.f10551y = this.f297Q;
        format$Builder.f10552z = this.f298R;
        format$Builder.f10524A = this.f299S;
        format$Builder.f10525B = this.f300T;
        format$Builder.f10526C = this.f301U;
        format$Builder.f10527D = this.f302V;
        return format$Builder;
    }

    public final int b() {
        int i7;
        int i8 = this.f288H;
        if (i8 == -1 || (i7 = this.f289I) == -1) {
            return -1;
        }
        return i8 * i7;
    }

    public final boolean c(X x4) {
        List list = this.f285E;
        if (list.size() != x4.f285E.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) x4.f285E.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final X d(X x4) {
        String str;
        String str2;
        int i7;
        int i8;
        int i9;
        if (this == x4) {
            return this;
        }
        int g3 = v2.i.g(this.f283C);
        String str3 = x4.f304a;
        String str4 = x4.f305b;
        if (str4 == null) {
            str4 = this.f305b;
        }
        if ((g3 != 3 && g3 != 1) || (str = x4.f306c) == null) {
            str = this.f306c;
        }
        int i10 = this.f309f;
        if (i10 == -1) {
            i10 = x4.f309f;
        }
        int i11 = this.f310x;
        if (i11 == -1) {
            i11 = x4.f310x;
        }
        String str5 = this.f312z;
        if (str5 == null) {
            String q7 = v2.t.q(g3, x4.f312z);
            if (v2.t.M(q7).length == 1) {
                str5 = q7;
            }
        }
        Metadata metadata = x4.f281A;
        Metadata metadata2 = this.f281A;
        if (metadata2 != null) {
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f10562a;
                if (entryArr.length != 0) {
                    int i12 = v2.t.f17153a;
                    Metadata.Entry[] entryArr2 = metadata2.f10562a;
                    Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
                    metadata2 = new Metadata((Metadata.Entry[]) copyOf);
                }
            }
            metadata = metadata2;
        }
        float f7 = this.f290J;
        if (f7 == -1.0f && g3 == 2) {
            f7 = x4.f290J;
        }
        int i13 = this.f307d | x4.f307d;
        int i14 = this.f308e | x4.f308e;
        ArrayList arrayList = new ArrayList();
        DrmInitData drmInitData = x4.f286F;
        if (drmInitData != null) {
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.f10553a;
            int length = schemeDataArr.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = length;
                DrmInitData.SchemeData schemeData = schemeDataArr[i15];
                DrmInitData.SchemeData[] schemeDataArr2 = schemeDataArr;
                if (schemeData.f10561e != null) {
                    arrayList.add(schemeData);
                }
                i15++;
                length = i16;
                schemeDataArr = schemeDataArr2;
            }
            str2 = drmInitData.f10555c;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.f286F;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.f10555c;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr3 = drmInitData2.f10553a;
            int length2 = schemeDataArr3.length;
            int i17 = 0;
            while (true) {
                String str6 = str2;
                if (i17 >= length2) {
                    break;
                }
                DrmInitData.SchemeData schemeData2 = schemeDataArr3[i17];
                DrmInitData.SchemeData[] schemeDataArr4 = schemeDataArr3;
                if (schemeData2.f10561e != null) {
                    int i18 = 0;
                    while (i18 < size) {
                        i7 = size;
                        i8 = length2;
                        if (!((DrmInitData.SchemeData) arrayList.get(i18)).f10558b.equals(schemeData2.f10558b)) {
                            i18++;
                            length2 = i8;
                            size = i7;
                        }
                    }
                    i7 = size;
                    i8 = length2;
                    i9 = 1;
                    arrayList.add(schemeData2);
                    i17 += i9;
                    str2 = str6;
                    schemeDataArr3 = schemeDataArr4;
                    length2 = i8;
                    size = i7;
                } else {
                    i7 = size;
                    i8 = length2;
                }
                i9 = 1;
                i17 += i9;
                str2 = str6;
                schemeDataArr3 = schemeDataArr4;
                length2 = i8;
                size = i7;
            }
        }
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, arrayList);
        Format$Builder a2 = a();
        a2.f10528a = str3;
        a2.f10529b = str4;
        a2.f10530c = str;
        a2.f10531d = i13;
        a2.f10532e = i14;
        a2.f10533f = i10;
        a2.f10534g = i11;
        a2.f10535h = str5;
        a2.f10536i = metadata;
        a2.f10540n = drmInitData3;
        a2.f10544r = f7;
        return new X(a2);
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj == null || X.class != obj.getClass()) {
            return false;
        }
        X x4 = (X) obj;
        int i8 = this.f303W;
        if (i8 == 0 || (i7 = x4.f303W) == 0 || i8 == i7) {
            return this.f307d == x4.f307d && this.f308e == x4.f308e && this.f309f == x4.f309f && this.f310x == x4.f310x && this.f284D == x4.f284D && this.f287G == x4.f287G && this.f288H == x4.f288H && this.f289I == x4.f289I && this.f291K == x4.f291K && this.f294N == x4.f294N && this.f296P == x4.f296P && this.f297Q == x4.f297Q && this.f298R == x4.f298R && this.f299S == x4.f299S && this.f300T == x4.f300T && this.f301U == x4.f301U && this.f302V == x4.f302V && Float.compare(this.f290J, x4.f290J) == 0 && Float.compare(this.f292L, x4.f292L) == 0 && v2.t.a(this.f304a, x4.f304a) && v2.t.a(this.f305b, x4.f305b) && v2.t.a(this.f312z, x4.f312z) && v2.t.a(this.f282B, x4.f282B) && v2.t.a(this.f283C, x4.f283C) && v2.t.a(this.f306c, x4.f306c) && Arrays.equals(this.f293M, x4.f293M) && v2.t.a(this.f281A, x4.f281A) && v2.t.a(this.f295O, x4.f295O) && v2.t.a(this.f286F, x4.f286F) && c(x4);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f303W == 0) {
            String str = this.f304a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f305b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f306c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f307d) * 31) + this.f308e) * 31) + this.f309f) * 31) + this.f310x) * 31;
            String str4 = this.f312z;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f281A;
            int hashCode5 = (hashCode4 + (metadata == null ? 0 : Arrays.hashCode(metadata.f10562a))) * 31;
            String str5 = this.f282B;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f283C;
            this.f303W = ((((((((((((((((Float.floatToIntBits(this.f292L) + ((((Float.floatToIntBits(this.f290J) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f284D) * 31) + ((int) this.f287G)) * 31) + this.f288H) * 31) + this.f289I) * 31)) * 31) + this.f291K) * 31)) * 31) + this.f294N) * 31) + this.f296P) * 31) + this.f297Q) * 31) + this.f298R) * 31) + this.f299S) * 31) + this.f300T) * 31) + this.f301U) * 31) + this.f302V;
        }
        return this.f303W;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f304a);
        sb.append(", ");
        sb.append(this.f305b);
        sb.append(", ");
        sb.append(this.f282B);
        sb.append(", ");
        sb.append(this.f283C);
        sb.append(", ");
        sb.append(this.f312z);
        sb.append(", ");
        sb.append(this.f311y);
        sb.append(", ");
        sb.append(this.f306c);
        sb.append(", [");
        sb.append(this.f288H);
        sb.append(", ");
        sb.append(this.f289I);
        sb.append(", ");
        sb.append(this.f290J);
        sb.append("], [");
        sb.append(this.f296P);
        sb.append(", ");
        return e1.k.g(sb, this.f297Q, "])");
    }
}
