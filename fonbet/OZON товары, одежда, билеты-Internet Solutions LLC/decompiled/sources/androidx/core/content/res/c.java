package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import r2.C9163a;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f42079a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f42080b = 0;

    @NonNull
    public static ColorStateList a(@NonNull Resources resources, @NonNull XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
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
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009f  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(@NonNull Resources resources, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        Resources resources2;
        int color;
        float f7;
        int attributeCount;
        int i11;
        boolean z11;
        int i12;
        TypedValue typedValue;
        ?? r02 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r42 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r42 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = C9163a.f82853a;
                ?? obtainAttributes = theme == null ? r02.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i13, i13);
                int resourceId = obtainAttributes.getResourceId(i13, -1);
                if (resourceId != -1) {
                    ThreadLocal<TypedValue> threadLocal = f42079a;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, r42);
                    int i15 = typedValue.type;
                    if (i15 < 28 || i15 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i13, -65281);
                        }
                        f7 = !obtainAttributes.hasValue(r42) ? obtainAttributes.getFloat(r42, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f11 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr4 = new int[attributeCount];
                        i11 = i13;
                        int i16 = i11;
                        while (i11 < attributeCount) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i17 = i16 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr4[i16] = attributeNameResource;
                                i16 = i17;
                            }
                            i11++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr4, i16);
                        z11 = f11 < 0.0f && f11 <= 100.0f;
                        if (f7 == 1.0f || z11) {
                            int b11 = com.google.common.primitives.e.b((int) ((Color.alpha(color) * f7) + 0.5f), 0, 255);
                            if (z11) {
                                a a11 = a.a(color);
                                color = a.e(a11.d(), a11.c(), f11);
                            }
                            color = (16777215 & color) | (b11 << 24);
                        }
                        i12 = i14 + 1;
                        if (i12 > iArr2.length) {
                            int[] iArr5 = new int[i14 <= 4 ? 8 : i14 * 2];
                            System.arraycopy(iArr2, 0, iArr5, 0, i14);
                            iArr2 = iArr5;
                        }
                        iArr2[i14] = color;
                        if (i12 > iArr.length) {
                            ?? r72 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), i14 > 4 ? i14 * 2 : 8);
                            System.arraycopy(iArr, 0, r72, 0, i14);
                            iArr = r72;
                        }
                        iArr[i14] = trimStateSet;
                        iArr = iArr;
                        resources2 = resources;
                        i14 = i12;
                    }
                }
                color = obtainAttributes.getColor(i13, -65281);
                if (!obtainAttributes.hasValue(r42)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr42 = new int[attributeCount];
                i11 = i13;
                int i162 = i11;
                while (i11 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr42, i162);
                if (f11 < 0.0f) {
                }
                if (f7 == 1.0f) {
                }
                int b112 = com.google.common.primitives.e.b((int) ((Color.alpha(color) * f7) + 0.5f), 0, 255);
                if (z11) {
                }
                color = (16777215 & color) | (b112 << 24);
                i12 = i14 + 1;
                if (i12 > iArr2.length) {
                }
                iArr2[i14] = color;
                if (i12 > iArr.length) {
                }
                iArr[i14] = trimStateSet2;
                iArr = iArr;
                resources2 = resources;
                i14 = i12;
            } else {
                resources2 = resources;
            }
            r42 = 1;
            i13 = 0;
            r02 = resources2;
        }
        int[] iArr6 = new int[i14];
        int[][] iArr7 = new int[i14][];
        System.arraycopy(iArr2, 0, iArr6, 0, i14);
        System.arraycopy(iArr, 0, iArr7, 0, i14);
        return new ColorStateList(iArr7, iArr6);
    }
}
