package O4;

import Q2.C0375o;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;
import o0.C2202f;
import v.AbstractC2527w;
import v.AbstractC2528x;
import y4.InterfaceC2676d;

/* renamed from: O4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0272s {

    /* renamed from: a, reason: collision with root package name */
    public final Q f4226a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2676d f4227b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0267m f4228c;

    public AbstractC0272s(Q q5, InterfaceC2676d interfaceC2676d, InterfaceC0267m interfaceC0267m) {
        this.f4226a = q5;
        this.f4227b = interfaceC2676d;
        this.f4228c = interfaceC0267m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:445:0x08c1, code lost:
    
        throw O4.Z.o(r10, r8, "@Body parameters cannot be used with form or multi-part encoding.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        r0 = new java.lang.Object[r17];
        r0[0] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011e, code lost:
    
        throw O4.Z.n(r10, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0923  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC0272s b(C0375o c0375o, Method method) {
        Method method2;
        Type genericReturnType;
        boolean z3;
        boolean z5;
        boolean m5;
        Z z6;
        Annotation[][] annotationArr;
        int i;
        Z[] zArr;
        int i5;
        String str;
        int i6;
        Z z7;
        Z k5;
        Z g5;
        B b3;
        char c5;
        int i7;
        int i8;
        int i9;
        int i10 = -1;
        int i11 = 0;
        boolean z8 = 1;
        P p5 = new P(c0375o, method);
        Annotation[] annotationArr2 = p5.f4160c;
        int length = annotationArr2.length;
        int i12 = 0;
        loop0: while (true) {
            Method method3 = p5.f4159b;
            String str2 = "HEAD";
            if (i12 >= length) {
                if (p5.f4169n == null) {
                    throw Z.n(method3, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!p5.f4170o) {
                    if (p5.f4172q) {
                        throw Z.n(method3, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (p5.f4171p) {
                        throw Z.n(method3, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = p5.f4161d;
                int length2 = annotationArr3.length;
                p5.f4177v = new Z[length2];
                int i13 = length2 - 1;
                int i14 = 0;
                loop2: while (i14 < length2) {
                    Z[] zArr2 = p5.f4177v;
                    Type type = p5.f4162e[i14];
                    Annotation[] annotationArr4 = annotationArr3[i14];
                    int i15 = i14 == i13 ? 1 : i11;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        z6 = null;
                        while (true) {
                            annotationArr = annotationArr3;
                            if (i11 >= length3) {
                                break;
                            }
                            Annotation annotation = annotationArr4[i11];
                            int i16 = length2;
                            int i17 = i11;
                            if (annotation instanceof Q4.y) {
                                p5.c(i14, type);
                                if (p5.f4168m) {
                                    throw Z.o(method3, i14, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (p5.i) {
                                    throw Z.o(method3, i14, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (p5.f4165j) {
                                    throw Z.o(method3, i14, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (p5.f4166k) {
                                    throw Z.o(method3, i14, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (p5.f4167l) {
                                    throw Z.o(method3, i14, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (p5.f4173r != null) {
                                    throw Z.o(method3, i14, "@Url cannot be used with @%s URL", p5.f4169n);
                                }
                                p5.f4168m = true;
                                if (type == y4.n.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                                    z7 = new F(method3, i14, 1);
                                    i = i13;
                                }
                            } else {
                                i = i13;
                                boolean z9 = annotation instanceof Q4.s;
                                C0375o c0375o2 = p5.f4158a;
                                if (z9) {
                                    p5.c(i14, type);
                                    if (p5.f4165j) {
                                        throw Z.o(method3, i14, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (p5.f4166k) {
                                        throw Z.o(method3, i14, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (p5.f4167l) {
                                        throw Z.o(method3, i14, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (p5.f4168m) {
                                        throw Z.o(method3, i14, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (p5.f4173r == null) {
                                        throw Z.o(method3, i14, "@Path can only be used with relative url on @%s", p5.f4169n);
                                    }
                                    p5.i = true;
                                    Q4.s sVar = (Q4.s) annotation;
                                    String value = sVar.value();
                                    if (!P.f4157y.matcher(value).matches()) {
                                        throw Z.o(method3, i14, "@Path parameter name must match %s. Found: %s", P.f4156x.pattern(), value);
                                    }
                                    if (!p5.f4176u.contains(value)) {
                                        throw Z.o(method3, i14, "URL \"%s\" does not contain \"{%s}\".", p5.f4173r, value);
                                    }
                                    c0375o2.C(type, annotationArr4);
                                    z7 = new H(method3, i14, value, sVar.encoded());
                                } else {
                                    zArr = zArr2;
                                    i5 = i15;
                                    if (annotation instanceof Q4.t) {
                                        p5.c(i14, type);
                                        Q4.t tVar = (Q4.t) annotation;
                                        String value2 = tVar.value();
                                        boolean encoded = tVar.encoded();
                                        i6 = length3;
                                        Class h3 = Z.h(type);
                                        str = str2;
                                        p5.f4165j = true;
                                        if (!Iterable.class.isAssignableFrom(h3)) {
                                            if (h3.isArray()) {
                                                c0375o2.C(P.a(h3.getComponentType()), annotationArr4);
                                                c5 = 2;
                                                z7 = new B(new D(2, value2, encoded), 1);
                                            } else {
                                                c5 = 2;
                                                c0375o2.C(type, annotationArr4);
                                                z7 = new D(2, value2, encoded);
                                            }
                                            if (z7 != null) {
                                                if (z6 != null) {
                                                    throw Z.o(method3, i14, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                                }
                                                z6 = z7;
                                            }
                                            i11 = i17 + 1;
                                            annotationArr3 = annotationArr;
                                            length2 = i16;
                                            i13 = i;
                                            length3 = i6;
                                            zArr2 = zArr;
                                            i15 = i5;
                                            str2 = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw Z.o(method3, i14, h3.getSimpleName() + " must include generic type (e.g., " + h3.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c0375o2.C(Z.g(0, (ParameterizedType) type), annotationArr4);
                                            b3 = new B(new D(2, value2, encoded), 0);
                                            z7 = b3;
                                        }
                                    } else {
                                        str = str2;
                                        i6 = length3;
                                        if (annotation instanceof Q4.v) {
                                            p5.c(i14, type);
                                            boolean encoded2 = ((Q4.v) annotation).encoded();
                                            Class h4 = Z.h(type);
                                            p5.f4166k = true;
                                            if (Iterable.class.isAssignableFrom(h4)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw Z.o(method3, i14, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c0375o2.C(Z.g(0, (ParameterizedType) type), annotationArr4);
                                                b3 = new B(new I(encoded2), 0);
                                            } else if (h4.isArray()) {
                                                c0375o2.C(P.a(h4.getComponentType()), annotationArr4);
                                                b3 = new B(new I(encoded2), 1);
                                            } else {
                                                c0375o2.C(type, annotationArr4);
                                                z7 = new I(encoded2);
                                            }
                                            z7 = b3;
                                        } else {
                                            if (annotation instanceof Q4.u) {
                                                p5.c(i14, type);
                                                Class h5 = Z.h(type);
                                                p5.f4167l = true;
                                                if (!Map.class.isAssignableFrom(h5)) {
                                                    throw Z.o(method3, i14, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type i18 = Z.i(type, h5);
                                                if (!(i18 instanceof ParameterizedType)) {
                                                    throw Z.o(method3, i14, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) i18;
                                                Type g6 = Z.g(0, parameterizedType);
                                                if (String.class != g6) {
                                                    throw Z.o(method3, i14, "@QueryMap keys must be of type String: " + g6, new Object[0]);
                                                }
                                                c0375o2.C(Z.g(1, parameterizedType), annotationArr4);
                                                z7 = new E(method3, i14, ((Q4.u) annotation).encoded(), 2);
                                            } else if (annotation instanceof Q4.i) {
                                                p5.c(i14, type);
                                                Q4.i iVar = (Q4.i) annotation;
                                                String value3 = iVar.value();
                                                Class h6 = Z.h(type);
                                                if (Iterable.class.isAssignableFrom(h6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw Z.o(method3, i14, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c0375o2.C(Z.g(0, (ParameterizedType) type), annotationArr4);
                                                    z7 = new B(new D(1, value3, iVar.allowUnsafeNonAsciiValues()), 0);
                                                } else if (h6.isArray()) {
                                                    c0375o2.C(P.a(h6.getComponentType()), annotationArr4);
                                                    z7 = new B(new D(1, value3, iVar.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    c0375o2.C(type, annotationArr4);
                                                    g5 = new D(1, value3, iVar.allowUnsafeNonAsciiValues());
                                                    z7 = g5;
                                                }
                                            } else if (annotation instanceof Q4.j) {
                                                if (type == y4.m.class) {
                                                    z7 = new F(method3, i14, 0);
                                                } else {
                                                    p5.c(i14, type);
                                                    Class h7 = Z.h(type);
                                                    if (!Map.class.isAssignableFrom(h7)) {
                                                        throw Z.o(method3, i14, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type i19 = Z.i(type, h7);
                                                    if (!(i19 instanceof ParameterizedType)) {
                                                        throw Z.o(method3, i14, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) i19;
                                                    Type g7 = Z.g(0, parameterizedType2);
                                                    if (String.class != g7) {
                                                        throw Z.o(method3, i14, "@HeaderMap keys must be of type String: " + g7, new Object[0]);
                                                    }
                                                    c0375o2.C(Z.g(1, parameterizedType2), annotationArr4);
                                                    z7 = new E(method3, i14, ((Q4.j) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof Q4.c) {
                                                p5.c(i14, type);
                                                if (!p5.f4171p) {
                                                    throw Z.o(method3, i14, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Q4.c cVar = (Q4.c) annotation;
                                                String value4 = cVar.value();
                                                boolean encoded3 = cVar.encoded();
                                                p5.f = true;
                                                Class h8 = Z.h(type);
                                                if (Iterable.class.isAssignableFrom(h8)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw Z.o(method3, i14, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c0375o2.C(Z.g(0, (ParameterizedType) type), annotationArr4);
                                                    z7 = new B(new D(0, value4, encoded3), 0);
                                                } else if (h8.isArray()) {
                                                    c0375o2.C(P.a(h8.getComponentType()), annotationArr4);
                                                    z7 = new B(new D(0, value4, encoded3), 1);
                                                } else {
                                                    c0375o2.C(type, annotationArr4);
                                                    g5 = new D(0, value4, encoded3);
                                                    z7 = g5;
                                                }
                                            } else if (annotation instanceof Q4.d) {
                                                p5.c(i14, type);
                                                if (!p5.f4171p) {
                                                    throw Z.o(method3, i14, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class h9 = Z.h(type);
                                                if (!Map.class.isAssignableFrom(h9)) {
                                                    throw Z.o(method3, i14, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type i20 = Z.i(type, h9);
                                                if (!(i20 instanceof ParameterizedType)) {
                                                    throw Z.o(method3, i14, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) i20;
                                                Type g8 = Z.g(0, parameterizedType3);
                                                if (String.class != g8) {
                                                    throw Z.o(method3, i14, "@FieldMap keys must be of type String: " + g8, new Object[0]);
                                                }
                                                c0375o2.C(Z.g(1, parameterizedType3), annotationArr4);
                                                p5.f = true;
                                                z7 = new E(method3, i14, ((Q4.d) annotation).encoded(), 0);
                                            } else if (annotation instanceof Q4.q) {
                                                p5.c(i14, type);
                                                if (!p5.f4172q) {
                                                    throw Z.o(method3, i14, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                Q4.q qVar = (Q4.q) annotation;
                                                p5.f4163g = true;
                                                String value5 = qVar.value();
                                                Class h10 = Z.h(type);
                                                if (value5.isEmpty()) {
                                                    boolean isAssignableFrom = Iterable.class.isAssignableFrom(h10);
                                                    J j5 = J.f4136d;
                                                    if (isAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw Z.o(method3, i14, h10.getSimpleName() + " must include generic type (e.g., " + h10.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!y4.r.class.isAssignableFrom(Z.h(Z.g(0, (ParameterizedType) type)))) {
                                                            throw Z.o(method3, i14, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        z7 = new B(j5, 0);
                                                    } else if (h10.isArray()) {
                                                        if (!y4.r.class.isAssignableFrom(h10.getComponentType())) {
                                                            throw Z.o(method3, i14, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        z7 = new B(j5, 1);
                                                    } else {
                                                        if (!y4.r.class.isAssignableFrom(h10)) {
                                                            throw Z.o(method3, i14, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        z7 = j5;
                                                    }
                                                } else {
                                                    y4.m e3 = AbstractC2527w.e("Content-Disposition", L1.a.n("form-data; name=\"", value5, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                    if (Iterable.class.isAssignableFrom(h10)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw Z.o(method3, i14, h10.getSimpleName() + " must include generic type (e.g., " + h10.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type g9 = Z.g(0, (ParameterizedType) type);
                                                        if (y4.r.class.isAssignableFrom(Z.h(g9))) {
                                                            throw Z.o(method3, i14, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        z7 = new B(new G(method3, i14, e3, c0375o2.y(g9, annotationArr4, annotationArr2)), 0);
                                                    } else if (h10.isArray()) {
                                                        Class a5 = P.a(h10.getComponentType());
                                                        if (y4.r.class.isAssignableFrom(a5)) {
                                                            throw Z.o(method3, i14, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        z7 = new B(new G(method3, i14, e3, c0375o2.y(a5, annotationArr4, annotationArr2)), 1);
                                                    } else {
                                                        if (y4.r.class.isAssignableFrom(h10)) {
                                                            throw Z.o(method3, i14, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        g5 = new G(method3, i14, e3, c0375o2.y(type, annotationArr4, annotationArr2));
                                                        z7 = g5;
                                                    }
                                                }
                                            } else {
                                                if (annotation instanceof Q4.r) {
                                                    p5.c(i14, type);
                                                    if (!p5.f4172q) {
                                                        throw Z.o(method3, i14, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    p5.f4163g = true;
                                                    Class h11 = Z.h(type);
                                                    if (!Map.class.isAssignableFrom(h11)) {
                                                        throw Z.o(method3, i14, "@PartMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type i21 = Z.i(type, h11);
                                                    if (!(i21 instanceof ParameterizedType)) {
                                                        throw Z.o(method3, i14, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType4 = (ParameterizedType) i21;
                                                    Type g10 = Z.g(0, parameterizedType4);
                                                    if (String.class != g10) {
                                                        throw Z.o(method3, i14, "@PartMap keys must be of type String: " + g10, new Object[0]);
                                                    }
                                                    Type g11 = Z.g(1, parameterizedType4);
                                                    if (y4.r.class.isAssignableFrom(Z.h(g11))) {
                                                        throw Z.o(method3, i14, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                    }
                                                    k5 = new G(method3, i14, c0375o2.y(g11, annotationArr4, annotationArr2), ((Q4.r) annotation).encoding());
                                                } else if (annotation instanceof Q4.a) {
                                                    p5.c(i14, type);
                                                    if (p5.f4171p || p5.f4172q) {
                                                        break loop2;
                                                    }
                                                    if (p5.f4164h) {
                                                        throw Z.o(method3, i14, "Multiple @Body method annotations found.", new Object[0]);
                                                    }
                                                    try {
                                                        InterfaceC0267m y5 = c0375o2.y(type, annotationArr4, annotationArr2);
                                                        p5.f4164h = true;
                                                        k5 = new C(method3, i14, y5);
                                                    } catch (RuntimeException e5) {
                                                        throw Z.p(method3, e5, i14, "Unable to create @Body converter for %s", type);
                                                    }
                                                } else if (annotation instanceof Q4.x) {
                                                    p5.c(i14, type);
                                                    Class h12 = Z.h(type);
                                                    for (int i22 = i14 - 1; i22 >= 0; i22--) {
                                                        Z z10 = p5.f4177v[i22];
                                                        if ((z10 instanceof K) && ((K) z10).f4137d.equals(h12)) {
                                                            throw Z.o(method3, i14, "@Tag type " + h12.getName() + " is duplicate of " + L.f4139b.c(method3, i22) + " and would always overwrite its value.", new Object[0]);
                                                        }
                                                    }
                                                    k5 = new K(h12);
                                                } else {
                                                    z7 = null;
                                                }
                                                z7 = k5;
                                            }
                                            if (z7 != null) {
                                            }
                                            i11 = i17 + 1;
                                            annotationArr3 = annotationArr;
                                            length2 = i16;
                                            i13 = i;
                                            length3 = i6;
                                            zArr2 = zArr;
                                            i15 = i5;
                                            str2 = str;
                                        }
                                    }
                                    if (z7 != null) {
                                    }
                                    i11 = i17 + 1;
                                    annotationArr3 = annotationArr;
                                    length2 = i16;
                                    i13 = i;
                                    length3 = i6;
                                    zArr2 = zArr;
                                    i15 = i5;
                                    str2 = str;
                                }
                            }
                            zArr = zArr2;
                            str = str2;
                            i5 = i15;
                            i6 = length3;
                            if (z7 != null) {
                            }
                            i11 = i17 + 1;
                            annotationArr3 = annotationArr;
                            length2 = i16;
                            i13 = i;
                            length3 = i6;
                            zArr2 = zArr;
                            i15 = i5;
                            str2 = str;
                        }
                        throw Z.o(method3, i14, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                    }
                    z6 = null;
                    annotationArr = annotationArr3;
                    int i23 = length2;
                    int i24 = i13;
                    Z[] zArr3 = zArr2;
                    String str3 = str2;
                    int i25 = i15;
                    if (z6 == null) {
                        if (i25 != 0) {
                            try {
                                if (Z.h(type) == a4.c.class) {
                                    p5.f4178w = true;
                                    z6 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw Z.o(method3, i14, "No Retrofit annotation found.", new Object[0]);
                    }
                    zArr3[i14] = z6;
                    i14++;
                    annotationArr3 = annotationArr;
                    length2 = i23;
                    i13 = i24;
                    str2 = str3;
                    i11 = 0;
                }
                String str4 = str2;
                if (p5.f4173r == null && !p5.f4168m) {
                    throw Z.n(method3, null, "Missing either @%s URL or @Url parameter.", p5.f4169n);
                }
                boolean z11 = p5.f4171p;
                if (!z11 && !p5.f4172q && !p5.f4170o && p5.f4164h) {
                    throw Z.n(method3, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z11 && !p5.f) {
                    throw Z.n(method3, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (p5.f4172q && !p5.f4163g) {
                    throw Z.n(method3, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                Q q5 = new Q(p5);
                Type genericReturnType2 = method.getGenericReturnType();
                if (Z.j(genericReturnType2)) {
                    throw Z.n(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw Z.n(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z12 = q5.f4187k;
                if (z12) {
                    Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[r4.length - 1]).getActualTypeArguments()[0];
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                    }
                    if (Z.h(type2) == S.class && (type2 instanceof ParameterizedType)) {
                        type2 = Z.g(0, (ParameterizedType) type2);
                        m5 = false;
                        z3 = true;
                    } else {
                        if (Z.h(type2) == InterfaceC0259e.class) {
                            throw Z.n(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", Z.g(0, (ParameterizedType) type2));
                        }
                        m5 = Z.m(type2);
                        z3 = false;
                    }
                    genericReturnType = new X(null, InterfaceC0259e.class, type2);
                    if (!Z.l(annotations, U.class)) {
                        Annotation[] annotationArr5 = new Annotation[annotations.length + 1];
                        annotationArr5[0] = V.f4192a;
                        System.arraycopy(annotations, 0, annotationArr5, 1, annotations.length);
                        annotations = annotationArr5;
                    }
                    method2 = method;
                    z5 = m5;
                } else {
                    method2 = method;
                    genericReturnType = method2.getGenericReturnType();
                    z3 = false;
                    z5 = false;
                }
                try {
                    InterfaceC0261g p6 = c0375o.p(genericReturnType, annotations);
                    Type j6 = p6.j();
                    if (j6 == y4.z.class) {
                        throw Z.n(method2, null, "'" + Z.h(j6).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (j6 == S.class) {
                        throw Z.n(method2, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (q5.f4181c.equals(str4) && !Void.class.equals(j6) && !Z.m(j6)) {
                        throw Z.n(method2, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC0267m A3 = c0375o.A(j6, method2.getAnnotations());
                        InterfaceC2676d interfaceC2676d = (InterfaceC2676d) c0375o.f5043m;
                        return !z12 ? new C0271q(q5, interfaceC2676d, A3, p6, 0) : z3 ? new C0271q(q5, interfaceC2676d, A3, p6, 1) : new r(q5, interfaceC2676d, A3, p6, z5);
                    } catch (RuntimeException e6) {
                        throw Z.n(method2, e6, "Unable to create converter for %s", j6);
                    }
                } catch (RuntimeException e7) {
                    throw Z.n(method2, e7, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i12];
            if (annotation2 instanceof Q4.b) {
                p5.b("DELETE", ((Q4.b) annotation2).value(), false);
            } else if (annotation2 instanceof Q4.f) {
                p5.b("GET", ((Q4.f) annotation2).value(), false);
            } else if (annotation2 instanceof Q4.g) {
                p5.b("HEAD", ((Q4.g) annotation2).value(), false);
            } else if (annotation2 instanceof Q4.n) {
                p5.b("PATCH", ((Q4.n) annotation2).value(), z8);
            } else if (annotation2 instanceof Q4.o) {
                p5.b("POST", ((Q4.o) annotation2).value(), z8);
            } else if (annotation2 instanceof Q4.p) {
                p5.b("PUT", ((Q4.p) annotation2).value(), z8);
            } else if (annotation2 instanceof Q4.m) {
                p5.b("OPTIONS", ((Q4.m) annotation2).value(), false);
            } else if (annotation2 instanceof Q4.h) {
                Q4.h hVar = (Q4.h) annotation2;
                p5.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else {
                if (annotation2 instanceof Q4.k) {
                    Q4.k kVar = (Q4.k) annotation2;
                    String[] value6 = kVar.value();
                    if (value6.length == 0) {
                        throw Z.n(method3, null, "@Headers annotation is empty.", new Object[0]);
                    }
                    boolean allowUnsafeNonAsciiValues = kVar.allowUnsafeNonAsciiValues();
                    C2202f c2202f = new C2202f(z8 ? 1 : 0);
                    int length4 = value6.length;
                    int i26 = 0;
                    int i27 = z8;
                    while (i26 < length4) {
                        String str5 = value6[i26];
                        int i28 = i27;
                        int indexOf = str5.indexOf(58);
                        if (indexOf == i10 || indexOf == 0) {
                            break loop0;
                        }
                        int i29 = i10;
                        if (indexOf == str5.length() - 1) {
                            break loop0;
                        }
                        String substring = str5.substring(0, indexOf);
                        String trim = str5.substring(indexOf + 1).trim();
                        if ("Content-Type".equalsIgnoreCase(substring)) {
                            try {
                                Pattern pattern = y4.q.f21370d;
                                p5.f4175t = AbstractC2528x.d(trim);
                                i9 = i28;
                            } catch (IllegalArgumentException e8) {
                                Object[] objArr = new Object[i28];
                                objArr[0] = trim;
                                throw Z.n(method3, e8, "Malformed content type: %s", objArr);
                            }
                        } else {
                            i9 = i28;
                            if (allowUnsafeNonAsciiValues) {
                                c2202f.c(substring, trim);
                            } else {
                                c2202f.a(substring, trim);
                            }
                        }
                        i26 += i9;
                        i27 = i9;
                        i10 = i29;
                    }
                    i7 = i10;
                    p5.f4174s = c2202f.d();
                    i8 = 1;
                } else {
                    i7 = i10;
                    if (!(annotation2 instanceof Q4.l)) {
                        i8 = 1;
                        if (!(annotation2 instanceof Q4.e)) {
                            continue;
                        } else {
                            if (p5.f4172q) {
                                throw Z.n(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                            p5.f4171p = true;
                        }
                    } else {
                        if (p5.f4171p) {
                            throw Z.n(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        i8 = 1;
                        p5.f4172q = true;
                    }
                }
                i12 += i8;
                z8 = i8;
                i10 = i7;
            }
            i7 = i10;
            i8 = z8 ? 1 : 0;
            i12 += i8;
            z8 = i8;
            i10 = i7;
        }
    }

    public abstract Object a(A a5, Object[] objArr);
}
