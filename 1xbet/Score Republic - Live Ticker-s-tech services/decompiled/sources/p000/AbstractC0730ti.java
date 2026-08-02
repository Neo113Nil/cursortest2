package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import live.football.scorerepublic.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ti */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0730ti {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f7451a = new ThreadLocal();

    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: a */
    public static ColorStateList m4789a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        ?? r4;
        int i;
        int depth;
        int color;
        float f;
        int i2;
        int i3;
        int iM5982k;
        TypedValue typedValue;
        resources = resources;
        theme = theme;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            r4 = 1;
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == i && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = jz0.f4233a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr2) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, i4, i4);
                int resourceId = ObtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f7451a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = m4789a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i4, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i4, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i4, -65281);
                }
                if (ObtainAttributes.hasValue(r4)) {
                    f = ObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r4;
                float f2 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i7 = i4;
                int i8 = i7;
                while (i7 < attributeCount) {
                    int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i7);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i9 = i8 + 1;
                        if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i7, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i8] = attributeNameResource;
                        i8 = i9;
                    }
                    i7++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i8);
                float f3 = 100.0f;
                boolean z = (f2 < 0.0f || f2 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f != 1.0f || z) {
                    int iAlpha = (int) ((Color.alpha(color) * f) + 0.5f);
                    if (iAlpha < 0) {
                        i2 = 0;
                    } else {
                        i2 = 255;
                        if (iAlpha <= 255) {
                            i2 = iAlpha;
                        }
                    }
                    if (z) {
                        C0430le c0430leM3213a = C0430le.m3213a(color);
                        float f4 = c0430leM3213a.f4766a;
                        float f5 = c0430leM3213a.f4767b;
                        oi1 oi1Var = oi1.f5739k;
                        if (f5 >= 1.0d && Math.round(f2) > 0.0d && Math.round(f2) < 100.0d) {
                            float fMin = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
                            float f6 = f5;
                            float f7 = 0.0f;
                            boolean z2 = r16 == true ? 1 : 0;
                            C0430le c0430le = null;
                            while (true) {
                                if (Math.abs(f7 - f5) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth2 = depth2;
                                    i3 = 2;
                                    if (c0430le != null) {
                                        iM5982k = c0430le.m3215c(oi1Var);
                                        break;
                                    }
                                    iM5982k = AbstractC0959zp.m5982k(f2);
                                    break;
                                }
                                float f8 = 1000.0f;
                                float f9 = f3;
                                float f10 = 0.0f;
                                float f11 = 1000.0f;
                                C0430le c0430le2 = null;
                                while (true) {
                                    if (Math.abs(f10 - f9) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        depth2 = depth2;
                                        f3 = f3;
                                        i3 = 2;
                                        break;
                                    }
                                    f3 = f3;
                                    float f12 = ((f9 - f10) / 2.0f) + f10;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iM3215c = C0430le.m3214b(f12, f6, fMin).m3215c(oi1.f5739k);
                                    float fM5984m = AbstractC0959zp.m5984m(Color.red(iM3215c));
                                    float fM5984m2 = AbstractC0959zp.m5984m(Color.green(iM3215c));
                                    float fM5984m3 = AbstractC0959zp.m5984m(Color.blue(iM3215c));
                                    float[] fArr = AbstractC0959zp.f9882m[r16 == true ? 1 : 0];
                                    i3 = 2;
                                    float f13 = ((fM5984m3 * fArr[2]) + ((fM5984m2 * fArr[r16 == true ? 1 : 0]) + (fM5984m * fArr[0]))) / f3;
                                    float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f2 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        C0430le c0430leM3213a2 = C0430le.m3213a(iM3215c);
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        C0430le c0430leM3214b = C0430le.m3214b(c0430leM3213a2.f4768c, c0430leM3213a2.f4767b, fMin);
                                        float f14 = c0430leM3213a2.f4769d - c0430leM3214b.f4769d;
                                        float f15 = c0430leM3213a2.f4770e - c0430leM3214b.f4770e;
                                        float f16 = c0430leM3213a2.f4771f - c0430leM3214b.f4771f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f16 * f16) + (f15 * f15) + (f14 * f14)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f11 = fPow;
                                            f8 = fAbs;
                                            c0430le2 = c0430leM3213a2;
                                        }
                                    } else {
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        depth2 = depth2;
                                    }
                                    if (f8 == 0.0f && f11 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f2) {
                                        f10 = f12;
                                    } else {
                                        f9 = f12;
                                    }
                                    f3 = f3;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth2 = depth2;
                                }
                                C0430le c0430le3 = c0430le2;
                                if (!z2) {
                                    if (c0430le3 == null) {
                                        f5 = f6;
                                    } else {
                                        c0430le = c0430le3;
                                        f7 = f6;
                                    }
                                    f6 = ((f5 - f7) / 2.0f) + f7;
                                } else {
                                    if (c0430le3 != null) {
                                        iM5982k = c0430le3.m3215c(oi1Var);
                                        break;
                                    }
                                    f6 = ((f5 - f7) / 2.0f) + f7;
                                    z2 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                            depth2 = depth2;
                            i3 = 2;
                            iM5982k = AbstractC0959zp.m5982k(f2);
                        }
                        color = iM5982k;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                        depth2 = depth2;
                        i3 = 2;
                    }
                    color = (16777215 & color) | (i2 << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                    depth2 = depth2;
                    i3 = 2;
                }
                int i10 = i5 + 1;
                if (i10 > iArr.length) {
                    int[] iArr4 = new int[i5 <= 4 ? 8 : i5 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i5);
                    iArr = iArr4;
                }
                iArr[i5] = color;
                if (i10 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i5);
                    objArr = objArr2;
                }
                objArr[i5] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i5 = i10;
                r4 = r16 == true ? 1 : 0;
                i = i3;
                attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                depth2 = depth2;
                i4 = 0;
            } else {
                AttributeSet attributeSet = attributeSetAsAttributeSet;
                int i11 = depth2;
                int i12 = i;
                r4 = r4 == true ? 1 : 0;
                i = i12;
                attributeSetAsAttributeSet = attributeSet;
                depth2 = i11;
                i4 = 0;
            }
        }
        int[] iArr5 = new int[i5];
        int[][] iArr6 = new int[i5][];
        System.arraycopy(iArr, 0, iArr5, 0, i5);
        System.arraycopy(objArr, 0, iArr6, 0, i5);
        return new ColorStateList(iArr6, iArr5);
    }
}
