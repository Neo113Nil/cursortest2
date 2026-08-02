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
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3157a = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032e  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        int depth;
        int color;
        float f7;
        int attributeCount;
        int i7;
        boolean z4;
        int alpha;
        int i8;
        int[] iArr;
        AttributeSet attributeSet;
        int i9;
        boolean z7;
        int c3;
        float f8;
        float f9;
        float f10;
        float cbrt;
        float f11;
        int i10;
        TypedValue typedValue;
        ?? r02 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
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
        boolean z8 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == z8 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = E.a.f1895a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(asAttributeSet, iArr4) : theme2.obtainStyledAttributes(asAttributeSet, iArr4, i11, i11);
                int resourceId = obtainAttributes.getResourceId(i11, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f3157a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z8);
                    int i13 = typedValue.type;
                    if (i13 < 28 || i13 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i11, -65281);
                        }
                        f7 = !obtainAttributes.hasValue(z8) ? obtainAttributes.getFloat(z8, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f12 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = asAttributeSet.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        int i14 = i11;
                        for (i7 = i14; i7 < attributeCount; i7++) {
                            int attributeNameResource = asAttributeSet.getAttributeNameResource(i7);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i15 = i14 + 1;
                                if (!asAttributeSet.getAttributeBooleanValue(i7, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i14] = attributeNameResource;
                                i14 = i15;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i14);
                        float f13 = 0.0f;
                        float f14 = 100.0f;
                        z4 = f12 < 0.0f && f12 <= 100.0f;
                        if (f7 == 1.0f || z4) {
                            alpha = (int) ((Color.alpha(color) * f7) + 0.5f);
                            if (alpha >= 0) {
                                i8 = 0;
                            } else {
                                i8 = 255;
                                if (alpha <= 255) {
                                    i8 = alpha;
                                }
                            }
                            if (z4) {
                                iArr = trimStateSet;
                                attributeSet = asAttributeSet;
                                i9 = depth2;
                                z7 = true;
                            } else {
                                a b7 = a.b(color);
                                n nVar = n.f3177k;
                                float f15 = b7.f3145b;
                                if (f15 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
                                    iArr = trimStateSet;
                                    attributeSet = asAttributeSet;
                                    i9 = depth2;
                                    z7 = true;
                                    c3 = b.c(f12);
                                } else {
                                    float f16 = b7.f3144a;
                                    float min = f16 < 0.0f ? 0.0f : Math.min(360.0f, f16);
                                    float f17 = 0.0f;
                                    float f18 = f15;
                                    a aVar = null;
                                    boolean z9 = true;
                                    while (true) {
                                        if (Math.abs(f17 - f15) >= 0.4f) {
                                            float f19 = 1000.0f;
                                            float f20 = f13;
                                            float f21 = f14;
                                            float f22 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f20 - f21) <= 0.01f) {
                                                    attributeSet = asAttributeSet;
                                                    i9 = depth2;
                                                    f8 = min;
                                                    f9 = f14;
                                                    z7 = true;
                                                    float f23 = f13;
                                                    iArr = trimStateSet;
                                                    f10 = f23;
                                                    break;
                                                }
                                                float f24 = ((f21 - f20) / 2.0f) + f20;
                                                int d7 = a.c(f24, f18, min).d(n.f3177k);
                                                float d8 = b.d(Color.red(d7));
                                                float d9 = b.d(Color.green(d7));
                                                float d10 = b.d(Color.blue(d7));
                                                z7 = true;
                                                float[] fArr = b.f3153d[1];
                                                f9 = 100.0f;
                                                float f25 = ((d10 * fArr[2]) + ((d9 * fArr[1]) + (d8 * fArr[0]))) / 100.0f;
                                                if (f25 <= 0.008856452f) {
                                                    cbrt = f25 * 903.2963f;
                                                    attributeSet = asAttributeSet;
                                                    i9 = depth2;
                                                } else {
                                                    attributeSet = asAttributeSet;
                                                    i9 = depth2;
                                                    cbrt = (((float) Math.cbrt(f25)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f12 - cbrt);
                                                if (abs < 0.2f) {
                                                    a b8 = a.b(d7);
                                                    a c4 = a.c(b8.f3146c, b8.f3145b, min);
                                                    f11 = f24;
                                                    float f26 = b8.f3147d - c4.f3147d;
                                                    f8 = min;
                                                    float f27 = b8.f3148e - c4.f3148e;
                                                    float f28 = b8.f3149f - c4.f3149f;
                                                    double sqrt = Math.sqrt((f28 * f28) + (f27 * f27) + (f26 * f26));
                                                    iArr = trimStateSet;
                                                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f22 = pow;
                                                        aVar2 = b8;
                                                        f19 = abs;
                                                    }
                                                } else {
                                                    f11 = f24;
                                                    f8 = min;
                                                    iArr = trimStateSet;
                                                }
                                                f10 = 0.0f;
                                                if (f19 == 0.0f && f22 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f12) {
                                                    f20 = f11;
                                                } else {
                                                    f21 = f11;
                                                }
                                                f14 = 100.0f;
                                                asAttributeSet = attributeSet;
                                                depth2 = i9;
                                                min = f8;
                                                int[] iArr6 = iArr;
                                                f13 = 0.0f;
                                                trimStateSet = iArr6;
                                            }
                                            a aVar3 = aVar2;
                                            if (!z9) {
                                                if (aVar3 == null) {
                                                    f15 = f18;
                                                } else {
                                                    aVar = aVar3;
                                                    f17 = f18;
                                                }
                                                f18 = ((f15 - f17) / 2.0f) + f17;
                                                f14 = f9;
                                                asAttributeSet = attributeSet;
                                                depth2 = i9;
                                                min = f8;
                                            } else {
                                                if (aVar3 != null) {
                                                    c3 = aVar3.d(nVar);
                                                    break;
                                                }
                                                f18 = ((f15 - f17) / 2.0f) + f17;
                                                f14 = f9;
                                                asAttributeSet = attributeSet;
                                                depth2 = i9;
                                                min = f8;
                                                z9 = false;
                                            }
                                            int[] iArr7 = iArr;
                                            f13 = f10;
                                            trimStateSet = iArr7;
                                        } else {
                                            iArr = trimStateSet;
                                            attributeSet = asAttributeSet;
                                            i9 = depth2;
                                            z7 = true;
                                            c3 = aVar == null ? b.c(f12) : aVar.d(nVar);
                                        }
                                    }
                                }
                                color = c3;
                            }
                            color = (16777215 & color) | (i8 << 24);
                        } else {
                            iArr = trimStateSet;
                            attributeSet = asAttributeSet;
                            i9 = depth2;
                            z7 = true;
                        }
                        i10 = i12 + 1;
                        if (i10 > iArr3.length) {
                            int[] iArr8 = new int[i12 <= 4 ? 8 : i12 * 2];
                            System.arraycopy(iArr3, 0, iArr8, 0, i12);
                            iArr3 = iArr8;
                        }
                        iArr3[i12] = color;
                        if (i10 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i12 > 4 ? i12 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i12);
                            iArr2 = r12;
                        }
                        iArr2[i12] = iArr;
                        iArr2 = iArr2;
                        theme2 = theme;
                        i12 = i10;
                        z8 = z7;
                        asAttributeSet = attributeSet;
                        depth2 = i9;
                        i11 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i11, -65281);
                if (!obtainAttributes.hasValue(z8)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = asAttributeSet.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                int i142 = i11;
                while (i7 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i142);
                float f132 = 0.0f;
                float f142 = 100.0f;
                if (f12 < 0.0f) {
                }
                if (f7 == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f7) + 0.5f);
                if (alpha >= 0) {
                }
                if (z4) {
                }
                color = (16777215 & color) | (i8 << 24);
                i10 = i12 + 1;
                if (i10 > iArr3.length) {
                }
                iArr3[i12] = color;
                if (i10 > iArr2.length) {
                }
                iArr2[i12] = iArr;
                iArr2 = iArr2;
                theme2 = theme;
                i12 = i10;
                z8 = z7;
                asAttributeSet = attributeSet;
                depth2 = i9;
                i11 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                theme2 = theme;
                z8 = z8;
                asAttributeSet = asAttributeSet;
                depth2 = depth2;
                i11 = 0;
            }
        }
        int[] iArr9 = new int[i12];
        int[][] iArr10 = new int[i12][];
        System.arraycopy(iArr3, 0, iArr9, 0, i12);
        System.arraycopy(iArr2, 0, iArr10, 0, i12);
        return new ColorStateList(iArr10, iArr9);
    }
}
