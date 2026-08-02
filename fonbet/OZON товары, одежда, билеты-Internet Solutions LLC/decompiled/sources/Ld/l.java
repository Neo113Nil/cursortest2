package Ld;

import Ld.u;
import Ld.v;
import ae.C5002d;
import ae.EnumC5003e;
import fd.InterfaceC6511n;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import je.C7359D;
import je.L0;
import je.M;
import je.N;
import je.s0;
import je.y0;
import ke.InterfaceC7670b;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import sd.C9661c;
import td.EnumC9840f;
import td.InterfaceC9820K;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.h0;
import td.i0;

/* loaded from: classes10.dex */
public final class l {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r2.g() == false) goto L8;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String a(@NotNull InterfaceC9839e classDescriptor, @NotNull H typeMappingConfiguration) {
        Intrinsics.checkNotNullParameter(classDescriptor, "klass");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        typeMappingConfiguration.getClass();
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        InterfaceC9845k d11 = classDescriptor.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
        Sd.f name = classDescriptor.getName();
        if (name != null) {
            Sd.f fVar = Sd.h.f26144a;
        }
        name = Sd.h.f26146c;
        String d12 = name.d();
        Intrinsics.checkNotNullExpressionValue(d12, "getIdentifier(...)");
        if (d11 instanceof InterfaceC9820K) {
            Sd.c c11 = ((InterfaceC9820K) d11).c();
            if (c11.d()) {
                return d12;
            }
            StringBuilder sb2 = new StringBuilder();
            String b11 = c11.b();
            Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
            sb2.append(kotlin.text.h.Y(b11, '.', '/'));
            sb2.append('/');
            sb2.append(d12);
            return sb2.toString();
        }
        InterfaceC9839e classDescriptor2 = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
        if (classDescriptor2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + d11 + " for " + classDescriptor);
        }
        Intrinsics.checkNotNullParameter(classDescriptor2, "classDescriptor");
        return a(classDescriptor2, typeMappingConfiguration) + '$' + d12;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ea  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(@NotNull N type, @NotNull I mode, @NotNull InterfaceC6511n writeGenericType) {
        Sd.b bVar;
        u.c possiblyPrimitiveType;
        boolean z11;
        u.b b11;
        N n11;
        Object b12;
        v typeFactory = v.f16824a;
        H typeMappingConfiguration = H.f16742a;
        Intrinsics.checkNotNullParameter(type, "kotlinType");
        Intrinsics.checkNotNullParameter(typeFactory, "factory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.checkNotNullParameter(writeGenericType, "writeGenericType");
        Intrinsics.checkNotNullParameter(type, "kotlinType");
        if (qd.i.l(type)) {
            return b(qd.t.a(type), mode, writeGenericType);
        }
        ke.u uVar = ke.u.f71512a;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeFactory, "typeFactory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        s0 receiver = uVar.C(type);
        Object obj = null;
        if (InterfaceC7670b.a.x(receiver)) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof s0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
            }
            InterfaceC9842h p11 = receiver.p();
            Intrinsics.g(p11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            qd.p primitiveType = qd.m.K((InterfaceC9839e) p11);
            if (primitiveType != null) {
                Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
                switch (v.a.f16825a[primitiveType.ordinal()]) {
                    case 1:
                        possiblyPrimitiveType = u.f16813a;
                        break;
                    case 2:
                        possiblyPrimitiveType = u.f16814b;
                        break;
                    case 3:
                        possiblyPrimitiveType = u.f16815c;
                        break;
                    case 4:
                        possiblyPrimitiveType = u.f16816d;
                        break;
                    case 5:
                        possiblyPrimitiveType = u.f16817e;
                        break;
                    case 6:
                        possiblyPrimitiveType = u.f16818f;
                        break;
                    case 7:
                        possiblyPrimitiveType = u.f16819g;
                        break;
                    case 8:
                        possiblyPrimitiveType = u.f16820h;
                        break;
                    default:
                        throw new Sc.o();
                }
                if (!InterfaceC7670b.a.G(type)) {
                    Intrinsics.checkNotNullParameter(uVar, "<this>");
                    Intrinsics.checkNotNullParameter(type, "type");
                    Sd.c ENHANCED_NULLABILITY_ANNOTATION = Cd.F.f4705p;
                    Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (!InterfaceC7670b.a.t(type, ENHANCED_NULLABILITY_ANNOTATION)) {
                        z11 = false;
                        Intrinsics.checkNotNullParameter(typeFactory, "<this>");
                        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
                        if (z11) {
                            Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
                            if (possiblyPrimitiveType != null && possiblyPrimitiveType.i() != null) {
                                String internalName = C5002d.c(possiblyPrimitiveType.i().h()).f();
                                Intrinsics.checkNotNullExpressionValue(internalName, "getInternalName(...)");
                                Intrinsics.checkNotNullParameter(internalName, "internalName");
                                obj = new u.b(internalName);
                            }
                        }
                        obj = possiblyPrimitiveType;
                    }
                }
                z11 = true;
                Intrinsics.checkNotNullParameter(typeFactory, "<this>");
                Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
                if (z11) {
                }
                obj = possiblyPrimitiveType;
            } else {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                if (!(receiver instanceof s0)) {
                    throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
                }
                InterfaceC9842h p12 = receiver.p();
                Intrinsics.g(p12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                qd.p I11 = qd.m.I((InterfaceC9839e) p12);
                if (I11 != null) {
                    obj = v.a("[" + EnumC5003e.d(I11).e());
                } else {
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    if (!(receiver instanceof s0)) {
                        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
                    }
                    InterfaceC9842h p13 = receiver.p();
                    if (p13 != null && qd.m.k0(p13)) {
                        Intrinsics.checkNotNullParameter(receiver, "$receiver");
                        if (!(receiver instanceof s0)) {
                            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
                        }
                        InterfaceC9842h p14 = receiver.p();
                        Intrinsics.g(p14, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Sd.d h11 = Zd.e.h((InterfaceC9839e) p14);
                        if (h11 != null) {
                            int i11 = C9661c.f98575o;
                            bVar = C9661c.k(h11);
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            if (!mode.a()) {
                                int i12 = C9661c.f98575o;
                                List f7 = C9661c.f();
                                if (!(f7 instanceof Collection) || !f7.isEmpty()) {
                                    Iterator it = f7.iterator();
                                    while (it.hasNext()) {
                                        if (Intrinsics.d(((C9661c.a) it.next()).d(), bVar)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            String h12 = C5002d.h(bVar);
                            Intrinsics.checkNotNullExpressionValue(h12, "internalNameByClassId(...)");
                            obj = typeFactory.b(h12);
                        }
                    }
                }
            }
        }
        Object possiblyPrimitiveType2 = obj;
        if (possiblyPrimitiveType2 != null) {
            boolean d11 = mode.d();
            Intrinsics.checkNotNullParameter(typeFactory, "<this>");
            Intrinsics.checkNotNullParameter(possiblyPrimitiveType2, "possiblyPrimitiveType");
            if (d11) {
                Intrinsics.checkNotNullParameter(possiblyPrimitiveType2, "possiblyPrimitiveType");
                if (possiblyPrimitiveType2 instanceof u.c) {
                    u.c cVar = (u.c) possiblyPrimitiveType2;
                    if (cVar.i() != null) {
                        String internalName2 = C5002d.c(cVar.i().h()).f();
                        Intrinsics.checkNotNullExpressionValue(internalName2, "getInternalName(...)");
                        Intrinsics.checkNotNullParameter(internalName2, "internalName");
                        possiblyPrimitiveType2 = new u.b(internalName2);
                    }
                }
            }
            writeGenericType.invoke(type, possiblyPrimitiveType2, mode);
            return possiblyPrimitiveType2;
        }
        s0 H02 = type.H0();
        if (H02 instanceof M) {
            M m11 = (M) H02;
            N d12 = m11.d();
            if (d12 != null) {
                return b(C8701c.r(d12), mode, writeGenericType);
            }
            LinkedHashSet types = (LinkedHashSet) m11.o();
            Intrinsics.checkNotNullParameter(types, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + C7714v.V(types, null, null, null, null, 63));
        }
        InterfaceC9842h p15 = H02.p();
        if (p15 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + type);
        }
        if (le.l.k(p15)) {
            u.b b13 = typeFactory.b("error/NonExistentClass");
            InterfaceC9839e descriptor = (InterfaceC9839e) p15;
            Intrinsics.checkNotNullParameter(type, "kotlinType");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return b13;
        }
        boolean z12 = p15 instanceof InterfaceC9839e;
        if (z12 && qd.m.S(type)) {
            if (type.F0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            y0 y0Var = type.F0().get(0);
            N type2 = y0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            if (y0Var.b() == L0.IN_VARIANCE) {
                b12 = typeFactory.b("java/lang/Object");
            } else {
                L0 b14 = y0Var.b();
                Intrinsics.checkNotNullExpressionValue(b14, "getProjectionKind(...)");
                b12 = b(type2, mode.f(b14), writeGenericType);
            }
            return v.a("[" + v.c((u) b12));
        }
        if (!z12) {
            if (p15 instanceof i0) {
                N i13 = C8701c.i((i0) p15);
                if (type.I0()) {
                    i13 = C8701c.p(i13);
                }
                return b(i13, mode, te.g.b());
            }
            if ((p15 instanceof h0) && mode.b()) {
                return b(((h0) p15).Z(), mode, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + type);
        }
        if (Vd.k.b(p15) && !mode.c() && (n11 = (N) C7359D.a(type)) != null) {
            return b(n11, mode.g(), writeGenericType);
        }
        if (mode.e() && qd.m.a0((InterfaceC9839e) p15)) {
            Intrinsics.checkNotNullParameter("java/lang/Class", "internalName");
            b11 = new u.b("java/lang/Class");
        } else {
            InterfaceC9839e interfaceC9839e = (InterfaceC9839e) p15;
            InterfaceC9839e classDescriptor = interfaceC9839e.n0();
            Intrinsics.checkNotNullExpressionValue(classDescriptor, "getOriginal(...)");
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            if (interfaceC9839e.getKind() == EnumC9840f.ENUM_ENTRY) {
                InterfaceC9845k d13 = interfaceC9839e.d();
                Intrinsics.g(d13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                interfaceC9839e = (InterfaceC9839e) d13;
            }
            InterfaceC9839e n02 = interfaceC9839e.n0();
            Intrinsics.checkNotNullExpressionValue(n02, "getOriginal(...)");
            b11 = typeFactory.b(a(n02, typeMappingConfiguration));
        }
        writeGenericType.invoke(type, b11, mode);
        return b11;
    }
}
