package f1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import c1.AbstractC0535a;
import game.betting133.sports1xbet.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1941c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f16945a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0139  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        char c5;
        int alpha;
        int i5;
        int[] iArr;
        int i6;
        int d5;
        float f5;
        int i7;
        float cbrt;
        int i8;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z3 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = AbstractC0535a.f7392a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i9, i9);
                int resourceId = obtainAttributes.getResourceId(i9, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f16945a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z3);
                    int i11 = typedValue.type;
                    if (i11 < 28 || i11 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i9, -65281);
                        }
                        f = !obtainAttributes.hasValue(z3) ? obtainAttributes.getFloat(z3, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c6 = z3;
                        float f6 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i9;
                        int i12 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i13 = i12 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i12] = attributeNameResource;
                                i12 = i13;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i12);
                        float f7 = 100.0f;
                        c5 = (f6 >= 0.0f || f6 > 100.0f) ? (char) 0 : c6;
                        if (f == 1.0f || c5 != 0) {
                            alpha = (int) ((Color.alpha(color) * f) + 0.5f);
                            if (alpha >= 0) {
                                i5 = 0;
                            } else {
                                i5 = 255;
                                if (alpha <= 255) {
                                    i5 = alpha;
                                }
                            }
                            if (c5 == 0) {
                                C1939a a5 = C1939a.a(color);
                                k kVar = k.f16964k;
                                float f8 = a5.f16937b;
                                if (f8 < 1.0d || Math.round(f6) <= 0.0d || Math.round(f6) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i6 = depth2;
                                    d5 = AbstractC1940b.d(f6);
                                } else {
                                    float f9 = a5.f16936a;
                                    float min = f9 < 0.0f ? 0.0f : Math.min(360.0f, f9);
                                    float f10 = 0.0f;
                                    float f11 = f8;
                                    char c7 = c6;
                                    C1939a c1939a = null;
                                    while (true) {
                                        if (Math.abs(f10 - f8) >= 0.4f) {
                                            float f12 = 1000.0f;
                                            float f13 = f7;
                                            float f14 = 0.0f;
                                            float f15 = 1000.0f;
                                            C1939a c1939a2 = null;
                                            while (true) {
                                                if (Math.abs(f14 - f13) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i6 = depth2;
                                                    f5 = f7;
                                                    break;
                                                }
                                                f5 = f7;
                                                float f16 = ((f13 - f14) / 2.0f) + f14;
                                                iArr = trimStateSet;
                                                int c8 = C1939a.b(f16, f11, min).c(k.f16964k);
                                                float e3 = AbstractC1940b.e(Color.red(c8));
                                                float e5 = AbstractC1940b.e(Color.green(c8));
                                                float e6 = AbstractC1940b.e(Color.blue(c8));
                                                float[] fArr = AbstractC1940b.f16944d[c6];
                                                float f17 = ((e6 * fArr[2]) + ((e5 * fArr[c6]) + (e3 * fArr[0]))) / f5;
                                                if (f17 <= 0.008856452f) {
                                                    cbrt = f17 * 903.2963f;
                                                    i7 = c8;
                                                } else {
                                                    i7 = c8;
                                                    cbrt = (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f6 - cbrt);
                                                if (abs < 0.2f) {
                                                    C1939a a6 = C1939a.a(i7);
                                                    C1939a b3 = C1939a.b(a6.f16938c, a6.f16937b, min);
                                                    float f18 = a6.f16939d - b3.f16939d;
                                                    float f19 = a6.f16940e - b3.f16940e;
                                                    float f20 = a6.f - b3.f;
                                                    i6 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f15 = pow;
                                                        f12 = abs;
                                                        c1939a2 = a6;
                                                    }
                                                } else {
                                                    i6 = depth2;
                                                }
                                                if (f12 == 0.0f && f15 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f6) {
                                                    f14 = f16;
                                                } else {
                                                    f13 = f16;
                                                }
                                                f7 = f5;
                                                trimStateSet = iArr;
                                                depth2 = i6;
                                            }
                                            C1939a c1939a3 = c1939a2;
                                            if (c7 == 0) {
                                                if (c1939a3 == null) {
                                                    f8 = f11;
                                                } else {
                                                    c1939a = c1939a3;
                                                    f10 = f11;
                                                }
                                                f11 = ((f8 - f10) / 2.0f) + f10;
                                                f7 = f5;
                                                trimStateSet = iArr;
                                                depth2 = i6;
                                            } else {
                                                if (c1939a3 != null) {
                                                    d5 = c1939a3.c(kVar);
                                                    break;
                                                }
                                                f11 = ((f8 - f10) / 2.0f) + f10;
                                                f7 = f5;
                                                trimStateSet = iArr;
                                                depth2 = i6;
                                                c7 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i6 = depth2;
                                            d5 = c1939a == null ? AbstractC1940b.d(f6) : c1939a.c(kVar);
                                        }
                                    }
                                }
                                color = d5;
                            } else {
                                iArr = trimStateSet;
                                i6 = depth2;
                            }
                            color = (16777215 & color) | (i5 << 24);
                        } else {
                            iArr = trimStateSet;
                            i6 = depth2;
                        }
                        i8 = i10 + 1;
                        if (i8 > iArr3.length) {
                            int[] iArr6 = new int[i10 <= 4 ? 8 : i10 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i10);
                            iArr3 = iArr6;
                        }
                        iArr3[i10] = color;
                        if (i8 > iArr2.length) {
                            ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i10 > 4 ? i10 * 2 : 8);
                            System.arraycopy(iArr2, 0, r1, 0, i10);
                            iArr2 = r1;
                        }
                        iArr2[i10] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i10 = i8;
                        z3 = c6;
                        depth2 = i6;
                        i9 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i9, -65281);
                if (!obtainAttributes.hasValue(z3)) {
                }
                char c62 = z3;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i9;
                int i122 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i122);
                float f72 = 100.0f;
                if (f6 >= 0.0f) {
                }
                if (f == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f) + 0.5f);
                if (alpha >= 0) {
                }
                if (c5 == 0) {
                }
                color = (16777215 & color) | (i5 << 24);
                i8 = i10 + 1;
                if (i8 > iArr3.length) {
                }
                iArr3[i10] = color;
                if (i8 > iArr2.length) {
                }
                iArr2[i10] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i10 = i8;
                z3 = c62;
                depth2 = i6;
                i9 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z3 = z3;
                depth2 = depth2;
                i9 = 0;
            }
        }
        int[] iArr7 = new int[i10];
        int[][] iArr8 = new int[i10][];
        System.arraycopy(iArr3, 0, iArr7, 0, i10);
        System.arraycopy(iArr2, 0, iArr8, 0, i10);
        return new ColorStateList(iArr8, iArr7);
    }
}
