package H;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3157a = new ThreadLocal();

    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        int depth;
        int color;
        int i7;
        int[] iArr;
        boolean z4;
        int iC;
        float f7;
        float f8;
        TypedValue typedValue;
        resources = resources;
        theme = theme;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
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
        ?? r7 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == r7 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = E.a.f1895a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr3) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, i8, i8);
                int resourceId = ObtainAttributes.getResourceId(i8, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f3157a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r7);
                    int i10 = typedValue.type;
                    if (i10 < 28 || i10 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i8, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i8, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i8, -65281);
                }
                float f9 = ObtainAttributes.hasValue(r7) ? ObtainAttributes.getFloat(r7, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f10 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i11 = i8;
                for (int i12 = i11; i12 < attributeCount; i12++) {
                    int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i13 = i11 + 1;
                        if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i11] = attributeNameResource;
                        i11 = i13;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i11);
                float f11 = 0.0f;
                float f12 = 100.0f;
                boolean z7 = f10 >= 0.0f && f10 <= 100.0f;
                if (f9 != 1.0f || z7) {
                    int iAlpha = (int) ((Color.alpha(color) * f9) + 0.5f);
                    if (iAlpha < 0) {
                        i7 = 0;
                    } else {
                        i7 = 255;
                        if (iAlpha <= 255) {
                            i7 = iAlpha;
                        }
                    }
                    if (z7) {
                        a aVarB = a.b(color);
                        n nVar = n.f3177k;
                        float f13 = aVarB.f3145b;
                        if (f13 >= 1.0d && Math.round(f10) > 0.0d && Math.round(f10) < 100.0d) {
                            float f14 = aVarB.f3144a;
                            float fMin = f14 < 0.0f ? 0.0f : Math.min(360.0f, f14);
                            float f15 = 0.0f;
                            float f16 = f13;
                            a aVar = null;
                            boolean z8 = true;
                            while (true) {
                                if (Math.abs(f15 - f13) < 0.4f) {
                                    iArr = iArrTrimStateSet;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth2 = depth2;
                                    z4 = true;
                                    if (aVar != null) {
                                        iC = aVar.d(nVar);
                                        break;
                                    }
                                    iC = b.c(f10);
                                    break;
                                }
                                float f17 = 1000.0f;
                                float f18 = f11;
                                float f19 = f12;
                                float f20 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f18 - f19) <= 0.01f) {
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        depth2 = depth2;
                                        fMin = fMin;
                                        f12 = f12;
                                        z4 = true;
                                        float f21 = f11;
                                        iArr = iArrTrimStateSet;
                                        f7 = f21;
                                        break;
                                    }
                                    float f22 = ((f19 - f18) / 2.0f) + f18;
                                    int iD = a.c(f22, f16, fMin).d(n.f3177k);
                                    float fD = b.d(Color.red(iD));
                                    float fD2 = b.d(Color.green(iD));
                                    float fD3 = b.d(Color.blue(iD));
                                    z4 = true;
                                    float[] fArr = b.f3153d[1];
                                    f12 = 100.0f;
                                    float f23 = ((fD3 * fArr[2]) + ((fD2 * fArr[1]) + (fD * fArr[0]))) / 100.0f;
                                    float fCbrt = f23 <= 0.008856452f ? f23 * 903.2963f : (((float) Math.cbrt(f23)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f10 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarB2 = a.b(iD);
                                        a aVarC = a.c(aVarB2.f3146c, aVarB2.f3145b, fMin);
                                        f8 = f22;
                                        float f24 = aVarB2.f3147d - aVarC.f3147d;
                                        fMin = fMin;
                                        float f25 = aVarB2.f3148e - aVarC.f3148e;
                                        float f26 = aVarB2.f3149f - aVarC.f3149f;
                                        double dSqrt = Math.sqrt((f26 * f26) + (f25 * f25) + (f24 * f24));
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f20 = fPow;
                                            aVar2 = aVarB2;
                                            f17 = fAbs;
                                        }
                                    } else {
                                        f8 = f22;
                                        fMin = fMin;
                                        iArr = iArrTrimStateSet;
                                    }
                                    f7 = 0.0f;
                                    if (f17 == 0.0f && f20 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f10) {
                                        f18 = f8;
                                    } else {
                                        f19 = f8;
                                    }
                                    f12 = 100.0f;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth2 = depth2;
                                    fMin = fMin;
                                    int[] iArr5 = iArr;
                                    f11 = 0.0f;
                                    iArrTrimStateSet = iArr5;
                                }
                                a aVar3 = aVar2;
                                if (!z8) {
                                    if (aVar3 == null) {
                                        f13 = f16;
                                    } else {
                                        aVar = aVar3;
                                        f15 = f16;
                                    }
                                    f16 = ((f13 - f15) / 2.0f) + f15;
                                } else {
                                    if (aVar3 != null) {
                                        iC = aVar3.d(nVar);
                                        break;
                                    }
                                    f16 = ((f13 - f15) / 2.0f) + f15;
                                    z8 = false;
                                }
                                int[] iArr6 = iArr;
                                f11 = f7;
                                iArrTrimStateSet = iArr6;
                            }
                        } else {
                            iArr = iArrTrimStateSet;
                            attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                            depth2 = depth2;
                            z4 = true;
                            iC = b.c(f10);
                        }
                        color = iC;
                    } else {
                        iArr = iArrTrimStateSet;
                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                        depth2 = depth2;
                        z4 = true;
                    }
                    color = (16777215 & color) | (i7 << 24);
                } else {
                    iArr = iArrTrimStateSet;
                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                    depth2 = depth2;
                    z4 = true;
                }
                int i14 = i9 + 1;
                if (i14 > iArr2.length) {
                    int[] iArr7 = new int[i9 <= 4 ? 8 : i9 * 2];
                    System.arraycopy(iArr2, 0, iArr7, 0, i9);
                    iArr2 = iArr7;
                }
                iArr2[i9] = color;
                if (i14 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9 > 4 ? i9 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i9);
                    objArr = objArr2;
                }
                objArr[i9] = iArr;
                objArr = (int[][]) objArr;
                i9 = i14;
                r7 = z4;
                attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                depth2 = depth2;
                i8 = 0;
            } else {
                AttributeSet attributeSet = attributeSetAsAttributeSet;
                int i15 = depth2;
                r7 = r7 == true ? 1 : 0;
                attributeSetAsAttributeSet = attributeSet;
                depth2 = i15;
                i8 = 0;
            }
        }
        int[] iArr8 = new int[i9];
        int[][] iArr9 = new int[i9][];
        System.arraycopy(iArr2, 0, iArr8, 0, i9);
        System.arraycopy(objArr, 0, iArr9, 0, i9);
        return new ColorStateList(iArr9, iArr8);
    }
}
