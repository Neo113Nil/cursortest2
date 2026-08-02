package G1;

import G1.d;
import S0.InterfaceC3967k;
import Z1.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.res.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7801T;
import l1.C7807Z;
import l1.C7811b0;
import l1.InterfaceC7829k0;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParserException;
import q1.AbstractC8972b;
import r1.C9156d;
import r1.m;
import r1.o;
import s1.C9580a;
import s1.C9581b;

/* loaded from: classes.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:103:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC8972b a(int i11, InterfaceC3967k interfaceC3967k, int i12) {
        long j11;
        int i13;
        int eventType;
        int i14;
        C9580a c9580a;
        int i15;
        int i16;
        androidx.core.content.res.d f7;
        C9580a c9580a2;
        AbstractC7799Q abstractC7799Q;
        AbstractC7799Q abstractC7799Q2;
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        interfaceC3967k.m(AndroidCompositionLocals_androidKt.c());
        Resources resources = context.getResources();
        TypedValue b11 = ((f) interfaceC3967k.m(AndroidCompositionLocals_androidKt.f())).b(resources, i11);
        CharSequence charSequence = b11.string;
        if (charSequence == null || !kotlin.text.h.B(charSequence, ".xml")) {
            interfaceC3967k.o(-802884675);
            boolean n11 = interfaceC3967k.n(context.getTheme()) | interfaceC3967k.n(charSequence) | ((((i12 & 14) ^ 6) > 4 && interfaceC3967k.r(i11)) || (i12 & 6) == 4);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                try {
                    int i17 = InterfaceC7829k0.f72267a;
                    C11 = c.a(resources, i11);
                    interfaceC3967k.x(C11);
                } catch (Exception e11) {
                    throw new g("Error attempting to load resource: " + ((Object) charSequence), e11);
                }
            }
            InterfaceC7829k0 interfaceC7829k0 = (InterfaceC7829k0) C11;
            BitmapPainter bitmapPainter = new BitmapPainter(interfaceC7829k0, r.a(interfaceC7829k0.getWidth(), interfaceC7829k0.getHeight()));
            interfaceC3967k.k();
            return bitmapPainter;
        }
        interfaceC3967k.o(-803040357);
        Resources.Theme theme = context.getTheme();
        int i18 = b11.changingConfigurations;
        d dVar = (d) interfaceC3967k.m(AndroidCompositionLocals_androidKt.e());
        d.b bVar = new d.b(theme, i11);
        d.a b12 = dVar.b(bVar);
        if (b12 == null) {
            XmlResourceParser xml = resources.getXml(i11);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.d(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            C9580a c9580a3 = new C9580a(xml);
            TypedArray k11 = c9580a3.k(resources, theme, asAttributeSet, C9581b.d());
            boolean d11 = c9580a3.d(k11);
            float g10 = c9580a3.g(k11, "viewportWidth", 7, 0.0f);
            float g11 = c9580a3.g(k11, "viewportHeight", 8, 0.0f);
            if (g10 <= 0.0f) {
                throw new XmlPullParserException(k11.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (g11 <= 0.0f) {
                throw new XmlPullParserException(k11.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            int i19 = 3;
            float a11 = c9580a3.a(k11, 3);
            float a12 = c9580a3.a(k11, 2);
            if (k11.hasValue(1)) {
                TypedValue typedValue = new TypedValue();
                k11.getValue(1, typedValue);
                if (typedValue.type == 2) {
                    j11 = C7807Z.f72259m;
                } else {
                    ColorStateList e12 = c9580a3.e(k11, theme);
                    j11 = e12 != null ? C7811b0.b(e12.getDefaultColor()) : C7807Z.f72259m;
                }
            } else {
                j11 = C7807Z.f72259m;
            }
            int c11 = c9580a3.c(k11);
            if (c11 != -1) {
                if (c11 == 3) {
                    i13 = 3;
                } else if (c11 != 5) {
                    if (c11 != 9) {
                        switch (c11) {
                            case 14:
                                i13 = 13;
                                break;
                            case 15:
                                i13 = 14;
                                break;
                            case 16:
                                i13 = 12;
                                break;
                        }
                    } else {
                        i13 = 9;
                    }
                }
                float f11 = a11 / resources.getDisplayMetrics().density;
                float f12 = a12 / resources.getDisplayMetrics().density;
                k11.recycle();
                C9156d.a aVar = new C9156d.a(null, f11, f12, g10, g11, j11, i13, d11, 1);
                int i21 = 0;
                for (int i22 = 1; xml.getEventType() != i22 && (xml.getDepth() >= i22 || xml.getEventType() != i19); i22 = i15) {
                    eventType = c9580a3.j().getEventType();
                    if (eventType != 2) {
                        String name = c9580a3.j().getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            r1.h hVar = c9580a3.f98120c;
                            if (hashCode != -1649314686) {
                                if (hashCode != 3433509) {
                                    if (hashCode == 98629247 && name.equals("group")) {
                                        TypedArray k12 = c9580a3.k(resources, theme, asAttributeSet, C9581b.b());
                                        float g12 = c9580a3.g(k12, "rotation", 5, 0.0f);
                                        float b13 = c9580a3.b(k12, 1);
                                        float b14 = c9580a3.b(k12, 2);
                                        float g13 = c9580a3.g(k12, "scaleX", 3, 1.0f);
                                        float g14 = c9580a3.g(k12, "scaleY", 4, 1.0f);
                                        float g15 = c9580a3.g(k12, "translateX", 6, 0.0f);
                                        float g16 = c9580a3.g(k12, "translateY", 7, 0.0f);
                                        String i23 = c9580a3.i(k12, 0);
                                        String str = i23 == null ? "" : i23;
                                        k12.recycle();
                                        aVar.a(str, g12, b13, b14, g13, g14, g15, g16, m.a());
                                    }
                                } else if (name.equals("path")) {
                                    TypedArray k13 = c9580a3.k(resources, theme, asAttributeSet, C9581b.c());
                                    if (!k.d(c9580a3.j(), "pathData")) {
                                        throw new IllegalArgumentException("No path data available");
                                    }
                                    String i24 = c9580a3.i(k13, 0);
                                    String str2 = i24 == null ? "" : i24;
                                    String i25 = c9580a3.i(k13, 2);
                                    List a13 = i25 == null ? m.a() : r1.h.a(hVar, i25);
                                    androidx.core.content.res.d f13 = c9580a3.f(k13, theme, "fillColor", 1);
                                    float g17 = c9580a3.g(k13, "fillAlpha", 12, 1.0f);
                                    int h11 = c9580a3.h(k13, "strokeLineCap", 8, -1);
                                    if (h11 != 0) {
                                        if (h11 == 1) {
                                            i16 = 1;
                                        } else if (h11 == 2) {
                                            i16 = 2;
                                        }
                                        int h12 = c9580a3.h(k13, "strokeLineJoin", 9, -1);
                                        int i26 = h12 == 0 ? h12 != 1 ? 2 : 1 : 0;
                                        float g18 = c9580a3.g(k13, "strokeMiterLimit", 10, 1.0f);
                                        f7 = c9580a3.f(k13, theme, "strokeColor", 3);
                                        float g19 = c9580a3.g(k13, "strokeAlpha", 11, 1.0f);
                                        float g21 = c9580a3.g(k13, "strokeWidth", 4, 1.0f);
                                        float g22 = c9580a3.g(k13, "trimPathEnd", 6, 1.0f);
                                        float g23 = c9580a3.g(k13, "trimPathOffset", 7, 0.0f);
                                        float g24 = c9580a3.g(k13, "trimPathStart", 5, 0.0f);
                                        int h13 = c9580a3.h(k13, "fillType", 13, 0);
                                        k13.recycle();
                                        if (f13.j()) {
                                            c9580a2 = c9580a3;
                                            abstractC7799Q = null;
                                        } else {
                                            Shader d12 = f13.d();
                                            if (d12 != null) {
                                                abstractC7799Q = C7801T.a(d12);
                                                c9580a2 = c9580a3;
                                            } else {
                                                c9580a2 = c9580a3;
                                                abstractC7799Q = new K0(C7811b0.b(f13.c()));
                                            }
                                        }
                                        if (f7.j()) {
                                            abstractC7799Q2 = null;
                                        } else {
                                            Shader d13 = f7.d();
                                            abstractC7799Q2 = d13 != null ? C7801T.a(d13) : new K0(C7811b0.b(f7.c()));
                                        }
                                        aVar.b(g17, g19, g21, g18, g24, g22, g23, h13 != 0 ? 0 : 1, i16, i26, str2, a13, abstractC7799Q, abstractC7799Q2);
                                        c9580a = c9580a2;
                                        i14 = 3;
                                    }
                                    i16 = 0;
                                    int h122 = c9580a3.h(k13, "strokeLineJoin", 9, -1);
                                    if (h122 == 0) {
                                    }
                                    float g182 = c9580a3.g(k13, "strokeMiterLimit", 10, 1.0f);
                                    f7 = c9580a3.f(k13, theme, "strokeColor", 3);
                                    float g192 = c9580a3.g(k13, "strokeAlpha", 11, 1.0f);
                                    float g212 = c9580a3.g(k13, "strokeWidth", 4, 1.0f);
                                    float g222 = c9580a3.g(k13, "trimPathEnd", 6, 1.0f);
                                    float g232 = c9580a3.g(k13, "trimPathOffset", 7, 0.0f);
                                    float g242 = c9580a3.g(k13, "trimPathStart", 5, 0.0f);
                                    int h132 = c9580a3.h(k13, "fillType", 13, 0);
                                    k13.recycle();
                                    if (f13.j()) {
                                    }
                                    if (f7.j()) {
                                    }
                                    aVar.b(g17, g192, g212, g182, g242, g222, g232, h132 != 0 ? 0 : 1, i16, i26, str2, a13, abstractC7799Q, abstractC7799Q2);
                                    c9580a = c9580a2;
                                    i14 = 3;
                                }
                                c9580a = c9580a3;
                                i14 = 3;
                            } else {
                                C9580a c9580a4 = c9580a3;
                                i14 = 3;
                                if (name.equals("clip-path")) {
                                    c9580a = c9580a4;
                                    TypedArray k14 = c9580a.k(resources, theme, asAttributeSet, C9581b.a());
                                    String i27 = c9580a.i(k14, 0);
                                    String str3 = i27 == null ? "" : i27;
                                    String i28 = c9580a.i(k14, 1);
                                    List a14 = i28 == null ? m.a() : r1.h.a(hVar, i28);
                                    k14.recycle();
                                    aVar.a(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, a14);
                                    i15 = 1;
                                    i21++;
                                    xml.next();
                                    c9580a3 = c9580a;
                                    i19 = i14;
                                } else {
                                    c9580a = c9580a4;
                                }
                            }
                            i15 = 1;
                            xml.next();
                            c9580a3 = c9580a;
                            i19 = i14;
                        }
                    } else if (eventType == i19 && "group".equals(c9580a3.j().getName())) {
                        int i29 = i21 + i22;
                        for (int i31 = 0; i31 < i29; i31 += i22) {
                            aVar.f();
                        }
                        i14 = i19;
                        i15 = i22;
                        c9580a = c9580a3;
                        i21 = 0;
                        xml.next();
                        c9580a3 = c9580a;
                        i19 = i14;
                    }
                    i14 = i19;
                    i15 = i22;
                    c9580a = c9580a3;
                    xml.next();
                    c9580a3 = c9580a;
                    i19 = i14;
                }
                b12 = new d.a(aVar.e(), i18);
                dVar.d(bVar, b12);
            }
            i13 = 5;
            float f112 = a11 / resources.getDisplayMetrics().density;
            float f122 = a12 / resources.getDisplayMetrics().density;
            k11.recycle();
            C9156d.a aVar2 = new C9156d.a(null, f112, f122, g10, g11, j11, i13, d11, 1);
            int i212 = 0;
            while (xml.getEventType() != i22) {
                eventType = c9580a3.j().getEventType();
                if (eventType != 2) {
                }
                i14 = i19;
                i15 = i22;
                c9580a = c9580a3;
                xml.next();
                c9580a3 = c9580a;
                i19 = i14;
            }
            b12 = new d.a(aVar2.e(), i18);
            dVar.d(bVar, b12);
        }
        VectorPainter b15 = o.b(b12.b(), interfaceC3967k);
        interfaceC3967k.k();
        return b15;
    }
}
