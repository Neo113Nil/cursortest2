package f1;

import A0.V;
import B.K;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import c1.AbstractC0535a;
import g1.AbstractC1967a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1940b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f16941a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f16942b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f16943c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f16944d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static K a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        K k5;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i5 = typedValue.type;
            if (i5 >= 28 && i5 <= 31) {
                return new K((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                k5 = K.e(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e3) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e3);
                k5 = null;
            }
            if (k5 != null) {
                return k5;
            }
        }
        return new K((Shader) null, (ColorStateList) null, 0);
    }

    public static String b(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (c(xmlResourceParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int d(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f5 = (f + 16.0f) / 116.0f;
        float f6 = f > 8.0f ? f5 * f5 * f5 : f / 903.2963f;
        float f7 = f5 * f5 * f5;
        boolean z3 = f7 > 0.008856452f;
        float f8 = z3 ? f7 : ((f5 * 116.0f) - 16.0f) / 903.2963f;
        if (!z3) {
            f7 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f16943c;
        return AbstractC1967a.a(f8 * fArr[0], f6 * fArr[1], f7 * fArr[2]);
    }

    public static float e(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1942d g(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i5;
        int i6;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            i(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0535a.f7393b);
        int i7 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i8 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0535a.f7394c);
                        int i9 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z3 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i10 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i11 = obtainAttributes2.getInt(i10, 0);
                        int i12 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i12, 0);
                        String string7 = obtainAttributes2.getString(i12);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            i(xmlResourceParser);
                        }
                        arrayList.add(new f(i9, i11, resourceId2, string7, string6, z3));
                    } else {
                        i(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new e((f[]) arrayList.toArray(new f[0]));
        }
        List h3 = h(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i8) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0535a.f7395d);
                    try {
                        String string8 = obtainAttributes3.getString(i7);
                        String string9 = obtainAttributes3.getString(1);
                        i6 = integer;
                        String string10 = obtainAttributes3.getString(i);
                        if (string8 == null) {
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i8) {
                            i(xmlResourceParser);
                        }
                        i5 = integer2;
                        k1.e eVar = new k1.e(string, string2, string8, h3, string9, string10);
                        if (obtainAttributes3 instanceof AutoCloseable) {
                            obtainAttributes3.close();
                        } else if (obtainAttributes3 instanceof ExecutorService) {
                            V.v((ExecutorService) obtainAttributes3);
                        } else {
                            obtainAttributes3.recycle();
                        }
                        arrayList2.add(eVar);
                    } catch (Throwable th) {
                        if (obtainAttributes3 == 0) {
                            throw th;
                        }
                        try {
                            if (obtainAttributes3 instanceof AutoCloseable) {
                                obtainAttributes3.close();
                            } else if (obtainAttributes3 instanceof ExecutorService) {
                                V.v((ExecutorService) obtainAttributes3);
                            } else {
                                obtainAttributes3.recycle();
                            }
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    i5 = integer2;
                    i6 = integer;
                    i(xmlResourceParser);
                }
                integer2 = i5;
                integer = i6;
                i = 2;
                i7 = 0;
                i8 = 3;
            }
        }
        int i13 = integer2;
        int i14 = integer;
        if (!arrayList2.isEmpty()) {
            return new g(arrayList2, i14, i13, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new k1.e(string, string2, string3, h3, null, null));
        if (string4 != null) {
            arrayList2.add(new k1.e(string, string2, string4, h3, null, null));
        }
        return new g(arrayList2, i14, i13, string5);
    }

    public static List h(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void i(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static float j() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
