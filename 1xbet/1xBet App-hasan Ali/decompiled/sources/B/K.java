package B;

import A.C0008h;
import A0.q1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import c1.AbstractC0535a;
import f1.AbstractC1940b;
import f1.AbstractC1941c;
import h.AbstractC1986a;
import java.util.ArrayList;
import java.util.Arrays;
import l4.C2062d;
import n.AbstractC2107A;
import n.AbstractC2119M;
import n.C2146p;
import n.t0;
import org.xmlpull.v1.XmlPullParserException;
import r.C2315A;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class K implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f636a;

    /* renamed from: b, reason: collision with root package name */
    public int f637b;

    /* renamed from: c, reason: collision with root package name */
    public Object f638c;

    /* renamed from: d, reason: collision with root package name */
    public Object f639d;

    public /* synthetic */ K(int i) {
        this.f636a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static K e(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int i5;
        float f5;
        float f6;
        Shader radialGradient;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b3 = AbstractC1941c.b(resources, xml, asAttributeSet, theme);
                return new K((Shader) null, b3, b3.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f7 = AbstractC1940b.f(resources, theme, asAttributeSet, AbstractC0535a.f7396e);
        float f8 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : f7.getFloat(8, 0.0f);
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f7.getFloat(9, 0.0f) : 0.0f;
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f7.getFloat(10, 0.0f) : 0.0f;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f7.getFloat(11, 0.0f) : 0.0f;
        float f12 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : f7.getFloat(3, 0.0f);
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f7.getFloat(4, 0.0f) : 0.0f;
        int i6 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : f7.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f7.getColor(0, 0) : 0;
        boolean z3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f7.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? f7.getColor(1, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f = f8;
            i5 = f7.getInt(6, 0);
        } else {
            f = f8;
            i5 = 0;
        }
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f7.getFloat(5, 0.0f) : 0.0f;
        f7.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f15 = f14;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f9;
            if (next2 == 1) {
                f6 = f10;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f10;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f16 = AbstractC1940b.f(resources, theme, asAttributeSet, AbstractC0535a.f);
                boolean hasValue = f16.hasValue(0);
                boolean hasValue2 = f16.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = f16.getColor(0, 0);
                float f17 = f16.getFloat(1, 0.0f);
                f16.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f17));
            }
            f9 = f5;
            f10 = f6;
        }
        G.v vVar = arrayList2.size() > 0 ? new G.v(arrayList2, arrayList) : null;
        if (vVar == null) {
            vVar = z3 ? new G.v(color, color2, color3) : new G.v(color, color3);
        }
        if (i6 != 1) {
            if (i6 != 2) {
                radialGradient = new LinearGradient(f, f5, f6, f11, (int[]) vVar.f1749l, (float[]) vVar.f1750m, i5 != 1 ? i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f12, f13, (int[]) vVar.f1749l, (float[]) vVar.f1750m);
            }
        } else {
            if (f15 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f12, f13, f15, (int[]) vVar.f1749l, (float[]) vVar.f1750m, i5 != 1 ? i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new K(radialGradient, (ColorStateList) null, 0);
    }

    public void a(int i, v3.e eVar) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("size should be >=0, but was ", i).toString());
        }
        if (i == 0) {
            return;
        }
        C0079h c0079h = new C0079h(this.f637b, i, eVar);
        this.f637b += i;
        ((R.e) this.f638c).c(c0079h);
    }

    @Override // B.s
    public int b(Object obj) {
        C2315A c2315a = (C2315A) this.f638c;
        int d5 = c2315a.d(obj);
        if (d5 >= 0) {
            return c2315a.f18901c[d5];
        }
        return -1;
    }

    public void c() {
        t0 t0Var;
        ImageView imageView = (ImageView) this.f638c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC2119M.a(drawable);
        }
        if (drawable == null || (t0Var = (t0) this.f639d) == null) {
            return;
        }
        C2146p.c(drawable, t0Var, imageView.getDrawableState());
    }

    public void d(int i) {
        if (i < 0 || i >= this.f637b) {
            StringBuilder v4 = AbstractC2107A.v(i, "Index ", ", size ");
            v4.append(this.f637b);
            throw new IndexOutOfBoundsException(v4.toString());
        }
    }

    public C0079h f(int i) {
        d(i);
        C0079h c0079h = (C0079h) this.f639d;
        if (c0079h != null) {
            int i5 = c0079h.f676b;
            int i6 = c0079h.f675a;
            if (i < i5 + i6 && i6 <= i) {
                return c0079h;
            }
        }
        R.e eVar = (R.e) this.f638c;
        C0079h c0079h2 = (C0079h) eVar.f5106k[N4.b.f(i, eVar)];
        this.f639d = c0079h2;
        return c0079h2;
    }

    public void g(int i, int i5, int i6, int i7, int i8, int i9, boolean z3, boolean z5) {
        long[] jArr = (long[]) this.f638c;
        int i10 = this.f637b;
        int i11 = i10 + 3;
        this.f637b = i11;
        int length = jArr.length;
        if (length <= i11) {
            int max = Math.max(length * 2, i11);
            long[] copyOf = Arrays.copyOf(jArr, max);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f638c = copyOf;
            long[] copyOf2 = Arrays.copyOf((long[]) this.f639d, max);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
            this.f639d = copyOf2;
        }
        long[] jArr2 = (long[]) this.f638c;
        jArr2[i10] = (i5 << 32) | (i6 & 4294967295L);
        jArr2[i10 + 1] = (i7 << 32) | (i8 & 4294967295L);
        int i12 = i9 & 67108863;
        jArr2[i10 + 2] = ((z5 ? 1L : 0L) << 63) | ((z3 ? 1L : 0L) << 62) | (1 << 61) | (0 << 52) | (i12 << 26) | (i & 67108863);
        if (i9 < 0) {
            return;
        }
        for (int i13 = i10 - 3; i13 >= 0; i13 -= 3) {
            int i14 = i13 + 2;
            long j5 = jArr2[i14];
            if ((((int) j5) & 67108863) == i12) {
                jArr2[i14] = (j5 & (-2301339409586323457L)) | (((i10 - i13) & 511) << 52);
                return;
            }
        }
    }

    public boolean h() {
        ColorStateList colorStateList;
        return ((Shader) this.f638c) == null && (colorStateList = (ColorStateList) this.f639d) != null && colorStateList.isStateful();
    }

    public void i(int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f638c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1986a.f17173e;
        v3.e G5 = v3.e.G(context, null, iArr, i);
        n1.C.c(imageView, imageView.getContext(), iArr, null, (TypedArray) G5.f20433m, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) G5.f20433m;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC2346c.p(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC2119M.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(G5.w(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC2119M.b(typedArray.getInt(3, -1), null));
            }
            G5.J();
        } catch (Throwable th) {
            G5.J();
            throw th;
        }
    }

    public void j(int i, i4.g gVar) {
        int i5 = i & 67108863;
        long[] jArr = (long[]) this.f638c;
        int i6 = this.f637b;
        for (int i7 = 0; i7 < jArr.length - 2 && i7 < i6; i7 += 3) {
            if ((((int) jArr[i7 + 2]) & 67108863) == i5) {
                long j5 = jArr[i7];
                long j6 = jArr[i7 + 1];
                gVar.e(Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) j5), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) j6));
                return;
            }
        }
    }

    public String toString() {
        switch (this.f636a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((y4.v) this.f638c) == y4.v.f21427l) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f637b);
                sb.append(' ');
                sb.append((String) this.f639d);
                String sb2 = sb.toString();
                kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", sb2);
                return sb2;
            default:
                return super.toString();
        }
    }

    public K(y4.v vVar, int i, String str) {
        this.f636a = 2;
        this.f638c = vVar;
        this.f637b = i;
        this.f639d = str;
    }

    public K(ImageView imageView) {
        this.f636a = 7;
        this.f637b = 0;
        this.f638c = imageView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r9 == null) goto L16;
     */
    /* JADX WARN: Type inference failed for: r5v2, types: [i4.c, kotlin.jvm.internal.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public K(C2062d c2062d, C0008h c0008h) {
        Object c0077f;
        this.f636a = 1;
        K k5 = c0008h.f51a;
        int i = c2062d.f17851k;
        if (i >= 0) {
            int min = Math.min(c2062d.f17852l, k5.f637b - 1);
            if (min < i) {
                C2315A c2315a = r.K.f18952a;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>", c2315a);
                this.f638c = c2315a;
                this.f639d = new Object[0];
                this.f637b = 0;
                return;
            }
            int i5 = (min - i) + 1;
            this.f639d = new Object[i5];
            this.f637b = i;
            C2315A c2315a2 = new C2315A(i5);
            k5.d(i);
            k5.d(min);
            if (min >= i) {
                R.e eVar = (R.e) k5.f638c;
                int f = N4.b.f(i, eVar);
                int i6 = ((C0079h) eVar.f5106k[f]).f675a;
                while (i6 <= min) {
                    C0079h c0079h = (C0079h) eVar.f5106k[f];
                    ?? r5 = (kotlin.jvm.internal.m) c0079h.f677c.f20432l;
                    int i7 = c0079h.f675a;
                    int max = Math.max(i, i7);
                    int min2 = Math.min(min, (c0079h.f676b + i7) - 1);
                    if (max <= min2) {
                        while (true) {
                            if (r5 != 0) {
                                c0077f = r5.c(Integer.valueOf(max - i7));
                            }
                            c0077f = new C0077f(max);
                            c2315a2.h(max, c0077f);
                            ((Object[]) this.f639d)[max - this.f637b] = c0077f;
                            max = max != min2 ? max + 1 : max;
                        }
                    }
                    i6 += c0079h.f676b;
                    f++;
                }
                this.f638c = c2315a2;
                return;
            }
            throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')').toString());
        }
        throw new IllegalStateException("negative nearestRange.first");
    }

    public K(Shader shader, ColorStateList colorStateList, int i) {
        this.f636a = 6;
        this.f638c = shader;
        this.f639d = colorStateList;
        this.f637b = i;
    }

    public K() {
        this.f636a = 0;
        this.f638c = new R.e(new C0079h[16]);
    }

    public K(q1 q1Var) {
        this.f636a = 3;
        this.f638c = q1Var;
    }
}
