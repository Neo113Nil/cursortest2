package B4;

import B4.A;
import B4.C2578g;
import B4.S;
import B4.W;
import N3.C3660k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final ThreadLocal<TypedValue> f2548c = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f2549a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d0 f2550b;

    public static final class a {
        @NotNull
        public static W a(@NotNull TypedValue value, W w11, @NotNull W expectedNavType, String str, @NotNull String foundType) throws XmlPullParserException {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
            Intrinsics.checkNotNullParameter(foundType, "foundType");
            if (w11 == null || w11 == expectedNavType) {
                return w11 == null ? expectedNavType : w11;
            }
            StringBuilder d11 = C3660k.d("Type is ", str, " but found ", foundType, ": ");
            d11.append(value.data);
            throw new XmlPullParserException(d11.toString());
        }
    }

    public Q(@NotNull Context context, @NotNull d0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f2549a = context;
        this.f2550b = navigatorProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01de, code lost:
    
        if (r0.isEmpty() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01e0, code lost:
    
        r10.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e3, code lost:
    
        r19.u(r12, r10);
        r8.recycle();
        r4 = r19;
        r5 = r16;
        r6 = r17;
        r7 = 1;
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0108, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0240, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final H a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i11) throws XmlPullParserException, IOException {
        int depth;
        Q q11;
        int depth2;
        Q q12 = this;
        String name = xmlResourceParser.getName();
        Intrinsics.checkNotNullExpressionValue(name, "parser.name");
        H a11 = q12.f2550b.c(name).a();
        Context context = q12.f2549a;
        a11.t(context, attributeSet);
        int i12 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i12 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth3) {
                String name2 = xmlResourceParser.getName();
                boolean equals = "argument".equals(name2);
                int[] iArr = C4.a.f4392b;
                if (equals) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    Intrinsics.checkNotNullExpressionValue(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = obtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    Intrinsics.checkNotNullExpressionValue(string, "array.getString(R.stylea…uments must have a name\")");
                    a11.b(string, c(obtainAttributes, resources, i11));
                    Unit unit = Unit.f71690a;
                    obtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, C4.a.f4393c);
                    Intrinsics.checkNotNullExpressionValue(obtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(1);
                    String string4 = obtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        break;
                    }
                    A.a aVar = new A.a();
                    if (string2 != null) {
                        String packageName = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                        aVar.d(kotlin.text.h.X(string2, "${applicationId}", packageName, false));
                    }
                    if (string3 != null && string3.length() != 0) {
                        String packageName2 = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
                        aVar.b(kotlin.text.h.X(string3, "${applicationId}", packageName2, false));
                    }
                    if (string4 != null) {
                        String packageName3 = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName3, "context.packageName");
                        aVar.c(kotlin.text.h.X(string4, "${applicationId}", packageName3, false));
                    }
                    a11.c(aVar.a());
                    Unit unit2 = Unit.f71690a;
                    obtainAttributes2.recycle();
                } else if ("action".equals(name2)) {
                    int[] NavAction = C4.a.f4391a;
                    Intrinsics.checkNotNullExpressionValue(NavAction, "NavAction");
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    Context context2 = context;
                    C2577f c2577f = new C2577f(obtainStyledAttributes.getResourceId(1, 0));
                    S.a aVar2 = new S.a();
                    int i13 = depth3;
                    aVar2.d(obtainStyledAttributes.getBoolean(4, false));
                    aVar2.h(obtainStyledAttributes.getBoolean(10, false));
                    H h11 = a11;
                    aVar2.g(obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false));
                    aVar2.b(obtainStyledAttributes.getResourceId(2, -1));
                    aVar2.c(obtainStyledAttributes.getResourceId(3, -1));
                    aVar2.e(obtainStyledAttributes.getResourceId(5, -1));
                    aVar2.f(obtainStyledAttributes.getResourceId(6, -1));
                    c2577f.e(aVar2.a());
                    Bundle bundle = new Bundle();
                    int i14 = 1;
                    int depth4 = xmlResourceParser.getDepth() + 1;
                    while (true) {
                        int next2 = xmlResourceParser.next();
                        if (next2 == i14 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth4 && "argument".equals(xmlResourceParser.getName())) {
                            TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                            Intrinsics.checkNotNullExpressionValue(obtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                            String string5 = obtainAttributes3.getString(0);
                            if (string5 == null) {
                                throw new XmlPullParserException("Arguments must have a name");
                            }
                            Intrinsics.checkNotNullExpressionValue(string5, "array.getString(R.stylea…uments must have a name\")");
                            C2578g c11 = c(obtainAttributes3, resources, i11);
                            if (c11.b()) {
                                c11.d(bundle, string5);
                            }
                            Unit unit3 = Unit.f71690a;
                            obtainAttributes3.recycle();
                        }
                        i14 = 1;
                    }
                } else {
                    H h12 = a11;
                    Context context3 = context;
                    int i15 = depth3;
                    if ("include".equals(name2) && (h12 instanceof L)) {
                        TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, g0.f2634c);
                        Intrinsics.checkNotNullExpressionValue(obtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                        q11 = this;
                        ((L) h12).A(q11.b(obtainAttributes4.getResourceId(0, 0)));
                        Unit unit4 = Unit.f71690a;
                        obtainAttributes4.recycle();
                    } else {
                        q11 = this;
                        if (h12 instanceof L) {
                            ((L) h12).A(a(resources, xmlResourceParser, attributeSet, i11));
                        }
                    }
                    a11 = h12;
                    q12 = q11;
                    context = context3;
                    depth3 = i15;
                }
                i12 = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C2578g c(TypedArray typedArray, Resources resources, int i11) throws XmlPullParserException {
        C2578g.a aVar;
        W w11;
        Object obj;
        int i12;
        boolean z11;
        C2578g.a aVar2 = new C2578g.a();
        aVar2.c(typedArray.getBoolean(3, false));
        ThreadLocal<TypedValue> threadLocal = f2548c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        W w12 = W.f2576c;
        W w13 = W.f2579f;
        W.p pVar = W.f2588o;
        W.c cVar = W.f2585l;
        W.f fVar = W.f2582i;
        W.i iVar = W.f2575b;
        Object obj2 = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i11);
            if ("integer".equals(string)) {
                aVar = aVar2;
                w11 = iVar;
            } else {
                if ("integer[]".equals(string)) {
                    w11 = W.f2577d;
                } else if ("List<Int>".equals(string)) {
                    w11 = W.f2578e;
                } else if ("long".equals(string)) {
                    aVar = aVar2;
                    w11 = w13;
                } else if ("long[]".equals(string)) {
                    w11 = W.f2580g;
                } else if ("List<Long>".equals(string)) {
                    w11 = W.f2581h;
                } else if ("boolean".equals(string)) {
                    aVar = aVar2;
                    w11 = cVar;
                } else if ("boolean[]".equals(string)) {
                    w11 = W.f2586m;
                } else if ("List<Boolean>".equals(string)) {
                    w11 = W.f2587n;
                } else {
                    if (!"string".equals(string)) {
                        if ("string[]".equals(string)) {
                            w11 = W.f2589p;
                        } else if ("List<String>".equals(string)) {
                            w11 = W.f2590q;
                        } else if ("float".equals(string)) {
                            aVar = aVar2;
                            w11 = fVar;
                        } else if ("float[]".equals(string)) {
                            w11 = W.f2583j;
                        } else if ("List<Float>".equals(string)) {
                            w11 = W.f2584k;
                        } else if ("reference".equals(string)) {
                            aVar = aVar2;
                            w11 = w12;
                        } else if (string.length() != 0) {
                            try {
                                aVar = aVar2;
                                String concat = (!kotlin.text.h.e0(string, ".", false) || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                                boolean A11 = kotlin.text.h.A(string, "[]", false);
                                if (A11) {
                                    z11 = A11;
                                    concat = concat.substring(0, concat.length() - 2);
                                    Intrinsics.checkNotNullExpressionValue(concat, "substring(...)");
                                } else {
                                    z11 = A11;
                                }
                                Class<?> clazz = Class.forName(concat);
                                Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
                                Intrinsics.checkNotNullParameter(clazz, "clazz");
                                w11 = Parcelable.class.isAssignableFrom(clazz) ? z11 ? new W.r(clazz) : new W.s(clazz) : (!Enum.class.isAssignableFrom(clazz) || z11) ? Serializable.class.isAssignableFrom(clazz) ? z11 ? new W.t(clazz) : new W.u(clazz) : null : new W.q(clazz);
                                if (w11 == null) {
                                    throw new IllegalArgumentException((concat + " is not Serializable or Parcelable.").toString());
                                }
                            } catch (ClassNotFoundException e11) {
                                throw new RuntimeException(e11);
                            }
                        }
                    }
                    aVar = aVar2;
                    w11 = pVar;
                }
                aVar = aVar2;
            }
        } else {
            aVar = aVar2;
            w11 = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            if (w11 != w12) {
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    if (w11 != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + w11.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    obj2 = Integer.valueOf(i13);
                } else if (w11 == pVar) {
                    obj2 = typedArray.getString(1);
                } else {
                    int i14 = typedValue.type;
                    if (i14 == 3) {
                        String value = typedValue.string.toString();
                        if (w11 == null) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            try {
                                try {
                                    try {
                                        try {
                                            iVar.g(value);
                                            w13 = iVar;
                                        } catch (IllegalArgumentException unused) {
                                            w13 = pVar;
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        w13.g(value);
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    cVar.g(value);
                                    w13 = cVar;
                                }
                            } catch (IllegalArgumentException unused4) {
                                fVar.g(value);
                                w13 = fVar;
                            }
                            w12 = w13;
                        } else {
                            w12 = w11;
                        }
                        obj2 = w12.g(value);
                    } else if (i14 == 4) {
                        w12 = a.a(typedValue, w11, fVar, string, "float");
                        obj2 = Float.valueOf(typedValue.getFloat());
                    } else if (i14 == 5) {
                        w12 = a.a(typedValue, w11, iVar, string, "dimension");
                        obj2 = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i14 == 18) {
                        w12 = a.a(typedValue, w11, cVar, string, "boolean");
                        obj2 = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i14 < 16 || i14 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (w11 == fVar) {
                            w12 = a.a(typedValue, w11, fVar, string, "float");
                            obj2 = Float.valueOf(typedValue.data);
                        } else {
                            w12 = a.a(typedValue, w11, iVar, string, "integer");
                            obj2 = Integer.valueOf(typedValue.data);
                        }
                    }
                }
                obj = obj2;
                C2578g.a aVar3 = aVar;
                if (obj != null) {
                    aVar3.b(obj);
                }
                if (w12 != null) {
                    aVar3.d(w12);
                }
                return aVar3.a();
            }
            int i15 = typedValue.resourceId;
            if (i15 != 0) {
                i12 = i15;
            } else {
                if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + w11.b() + ". Must be a reference to a resource.");
                }
                i12 = 0;
            }
            obj2 = Integer.valueOf(i12);
        }
        w12 = w11;
        obj = obj2;
        C2578g.a aVar32 = aVar;
        if (obj != null) {
        }
        if (w12 != null) {
        }
        return aVar32.a();
    }

    @SuppressLint({"ResourceType"})
    @NotNull
    public final L b(int i11) {
        int next;
        Resources res = this.f2549a.getResources();
        XmlResourceParser xml = res.getXml(i11);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e11) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i11) + " line " + xml.getLineNumber(), e11);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNullExpressionValue(res, "res");
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        H a11 = a(res, xml, attrs, i11);
        if (a11 instanceof L) {
            return (L) a11;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
