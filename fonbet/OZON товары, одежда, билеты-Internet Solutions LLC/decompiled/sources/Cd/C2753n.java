package Cd;

import org.jetbrains.annotations.NotNull;
import td.InterfaceC9831W;
import td.InterfaceC9836b;
import td.InterfaceC9845k;
import wd.C10536w;

/* renamed from: Cd.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2753n {
    private static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "companionObject";
        } else if (i11 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i11 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i11 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i11 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (qd.e.a((td.InterfaceC9839e) r2) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(@NotNull InterfaceC9831W interfaceC9831W) {
        if (interfaceC9831W == null) {
            a(0);
            throw null;
        }
        if (interfaceC9831W.getKind() != InterfaceC9836b.a.FAKE_OVERRIDE) {
            InterfaceC9845k d11 = interfaceC9831W.d();
            if (d11 == null) {
                a(1);
                throw null;
            }
            if (Vd.i.s(d11) && Vd.i.r(d11.d())) {
                qd.d dVar = qd.d.f81829a;
            }
            if (Vd.i.s(interfaceC9831W.d())) {
                C10536w O11 = interfaceC9831W.O();
                if ((O11 == null || !O11.getAnnotations().K0(E.f4688a)) ? interfaceC9831W.getAnnotations().K0(E.f4688a) : true) {
                    return true;
                }
            }
        }
        return false;
    }
}
