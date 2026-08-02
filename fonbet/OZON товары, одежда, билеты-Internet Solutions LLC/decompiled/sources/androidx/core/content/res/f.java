package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import r2.C9163a;

/* loaded from: classes8.dex */
final class f {
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0195, code lost:
    
        if (r12.size() <= 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0197, code lost:
    
        r0 = new androidx.core.content.res.f.a(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019e, code lost:
    
        if (r0 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b0, code lost:
    
        if (r10 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b3, code lost:
    
        if (r10 == 2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b7, code lost:
    
        if (r7 == 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b9, code lost:
    
        if (r7 == 2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bb, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d7, code lost:
    
        return new android.graphics.LinearGradient(r22, r23, r25, r26, r0.f42095a, r0.f42096b, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c0, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c3, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e1, code lost:
    
        return new android.graphics.SweepGradient(r6, r15, r0.f42095a, r0.f42096b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e6, code lost:
    
        if (r24 <= 0.0f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e8, code lost:
    
        r17 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ed, code lost:
    
        if (r7 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f0, code lost:
    
        if (r7 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f2, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020c, code lost:
    
        return new android.graphics.RadialGradient(r6, r17, r24, r0.f42095a, r0.f42096b, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f7, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01fa, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0214, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
    
        if (r20 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a4, code lost:
    
        r0 = new androidx.core.content.res.f.a(r9, r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01aa, code lost:
    
        r0 = new androidx.core.content.res.f.a(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Shader a(@NonNull Resources resources, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        float f7;
        int i11;
        float f11;
        int i12;
        float f12;
        String name = xmlResourceParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray e11 = k.e(resources, theme, attributeSet, C9163a.f82856d);
        float f13 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : e11.getFloat(8, 0.0f);
        float f14 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? e11.getFloat(9, 0.0f) : 0.0f;
        float f15 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? e11.getFloat(10, 0.0f) : 0.0f;
        float f16 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? e11.getFloat(11, 0.0f) : 0.0f;
        float f17 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : e11.getFloat(3, 0.0f);
        float f18 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? e11.getFloat(4, 0.0f) : 0.0f;
        int i13 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : e11.getInt(2, 0);
        int color = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? e11.getColor(0, 0) : 0;
        boolean z11 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? e11.getColor(7, 0) : 0;
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f7 = f13;
            i11 = e11.getColor(1, 0);
        } else {
            f7 = f13;
            i11 = 0;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f11 = f14;
            i12 = e11.getInt(6, 0);
        } else {
            f11 = f14;
            i12 = 0;
        }
        float f19 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? e11.getFloat(5, 0.0f) : 0.0f;
        e11.recycle();
        int depth = xmlResourceParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f21 = f19;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlResourceParser.next();
            float f22 = f15;
            if (next == 1) {
                f12 = f16;
                break;
            }
            int depth2 = xmlResourceParser.getDepth();
            f12 = f16;
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray e12 = k.e(resources, theme, attributeSet, C9163a.f82857e);
                boolean hasValue = e12.hasValue(0);
                boolean hasValue2 = e12.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = e12.getColor(0, 0);
                float f23 = e12.getFloat(1, 0.0f);
                e12.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f23));
            }
            f15 = f22;
            f16 = f12;
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f42095a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f42096b;

        a(@NonNull ArrayList arrayList, @NonNull ArrayList arrayList2) {
            int size = arrayList.size();
            this.f42095a = new int[size];
            this.f42096b = new float[size];
            for (int i11 = 0; i11 < size; i11++) {
                this.f42095a[i11] = ((Integer) arrayList.get(i11)).intValue();
                this.f42096b[i11] = ((Float) arrayList2.get(i11)).floatValue();
            }
        }

        a(int i11, int i12) {
            this.f42095a = new int[]{i11, i12};
            this.f42096b = new float[]{0.0f, 1.0f};
        }

        a(int i11, int i12, int i13) {
            this.f42095a = new int[]{i11, i12, i13};
            this.f42096b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
