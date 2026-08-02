package Vd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import de.C6184c;
import de.C6185d;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Collections;
import java.util.List;
import je.A0;
import je.L0;
import je.N;
import je.Y;
import je.o0;
import je.s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.InterfaceC9815F;
import td.InterfaceC9831W;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9857w;
import td.d0;
import ud.InterfaceC10030h;
import wd.AbstractC10516b;
import wd.C10528n;
import wd.Q;
import wd.S;
import wd.T;
import wd.U;
import wd.V;
import wd.c0;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes10.dex */
    private static class a extends C10528n {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(@NotNull he.n nVar) {
            super(nVar, null, InterfaceC10030h.a.b(), true, InterfaceC9836b.a.DECLARATION, r6);
            d0 d0Var = d0.f99392a;
            if (nVar == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "containingClass", "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor", "<init>"));
            }
            d1(Collections.EMPTY_LIST, i.i(nVar));
        }
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 12 || i11 == 23 || i11 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 12 || i11 == 23 || i11 == 25) ? 2 : 3];
        switch (i11) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 33:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                objArr[0] = "enumClass";
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i11 == 12) {
            objArr[1] = "createSetter";
        } else if (i11 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i11 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 12 && i11 != 23 && i11 != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static U b(@NotNull InterfaceC9835a interfaceC9835a, N n11, Sd.f fVar, @NotNull InterfaceC10030h interfaceC10030h, int i11) {
        if (interfaceC10030h == null) {
            a(33);
            throw null;
        }
        if (n11 == null) {
            return null;
        }
        return new U(interfaceC9835a, new C6184c(interfaceC9835a, n11, fVar, null), interfaceC10030h, Sd.g.a(i11));
    }

    @NotNull
    public static S c(@NotNull InterfaceC9831W interfaceC9831W, @NotNull InterfaceC10030h interfaceC10030h) {
        if (interfaceC9831W != null) {
            return i(interfaceC9831W, interfaceC10030h, true, interfaceC9831W.e());
        }
        a(13);
        throw null;
    }

    @NotNull
    public static T d(@NotNull InterfaceC9831W interfaceC9831W, @NotNull InterfaceC10030h interfaceC10030h, @NotNull InterfaceC10030h.a.C2208a c2208a) {
        if (interfaceC9831W == null) {
            a(0);
            throw null;
        }
        d0 e11 = interfaceC9831W.e();
        if (e11 != null) {
            return k(interfaceC9831W, interfaceC10030h, c2208a, true, interfaceC9831W.getVisibility(), e11);
        }
        a(6);
        throw null;
    }

    public static Q e(@NotNull AbstractC10516b abstractC10516b) {
        if (abstractC10516b == null) {
            a(26);
            throw null;
        }
        InterfaceC9815F e11 = i.e(abstractC10516b);
        InterfaceC9839e a11 = C4079A.a(e11).a(e11);
        if (a11 == null) {
            return null;
        }
        InterfaceC10030h.a.C2208a b11 = InterfaceC10030h.a.b();
        EnumC9812C enumC9812C = EnumC9812C.FINAL;
        AbstractC9853s abstractC9853s = C9852r.f99403e;
        Sd.f fVar = qd.s.f81855b;
        InterfaceC9836b.a aVar = InterfaceC9836b.a.SYNTHESIZED;
        Q H02 = Q.H0(abstractC10516b, b11, enumC9812C, abstractC9853s, false, fVar, aVar, abstractC10516b.e());
        S s11 = new S(H02, InterfaceC10030h.a.b(), enumC9812C, abstractC9853s, false, false, false, aVar, null, abstractC10516b.e());
        H02.L0(s11, null, null, null);
        o0.f69907b.getClass();
        o0 attributes = o0.f69908c;
        s0 constructor = a11.k();
        List arguments = Collections.singletonList(new A0(abstractC10516b.q()));
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Y f7 = je.Q.f(arguments, attributes, constructor, null, false);
        List list = Collections.EMPTY_LIST;
        H02.P0(f7, list, null, null, list);
        s11.L0(H02.getReturnType());
        return H02;
    }

    @NotNull
    public static V f(@NotNull AbstractC10516b abstractC10516b) {
        if (abstractC10516b == null) {
            a(24);
            throw null;
        }
        V b12 = V.b1(abstractC10516b, InterfaceC10030h.a.b(), qd.s.f81856c, InterfaceC9836b.a.SYNTHESIZED, abstractC10516b.e());
        c0 c0Var = new c0(b12, null, 0, InterfaceC10030h.a.b(), Sd.f.f(AppMeasurementSdk.ConditionalUserProperty.VALUE), Zd.e.e(abstractC10516b).N(), false, false, false, null, abstractC10516b.e());
        List list = Collections.EMPTY_LIST;
        return b12.L0(null, null, list, list, Collections.singletonList(c0Var), abstractC10516b.q(), EnumC9812C.FINAL, C9852r.f99403e);
    }

    @NotNull
    public static V g(@NotNull AbstractC10516b abstractC10516b) {
        if (abstractC10516b == null) {
            a(22);
            throw null;
        }
        V b12 = V.b1(abstractC10516b, InterfaceC10030h.a.b(), qd.s.f81854a, InterfaceC9836b.a.SYNTHESIZED, abstractC10516b.e());
        List list = Collections.EMPTY_LIST;
        return b12.L0(null, null, list, list, list, Zd.e.e(abstractC10516b).m(L0.INVARIANT, abstractC10516b.q()), EnumC9812C.FINAL, C9852r.f99403e);
    }

    public static U h(@NotNull InterfaceC9835a interfaceC9835a, N n11, @NotNull InterfaceC10030h interfaceC10030h) {
        if (n11 == null) {
            return null;
        }
        return new U(interfaceC9835a, new C6185d(interfaceC9835a, n11, null), interfaceC10030h);
    }

    @NotNull
    public static S i(@NotNull InterfaceC9831W interfaceC9831W, @NotNull InterfaceC10030h interfaceC10030h, boolean z11, @NotNull d0 d0Var) {
        if (interfaceC9831W == null) {
            a(17);
            throw null;
        }
        if (interfaceC10030h == null) {
            a(18);
            throw null;
        }
        if (d0Var != null) {
            return new S(interfaceC9831W, interfaceC10030h, interfaceC9831W.h(), interfaceC9831W.getVisibility(), z11, false, false, InterfaceC9836b.a.DECLARATION, null, d0Var);
        }
        a(19);
        throw null;
    }

    @NotNull
    public static C10528n j(@NotNull he.n nVar) {
        if (nVar != null) {
            return new a(nVar);
        }
        a(20);
        throw null;
    }

    @NotNull
    public static T k(@NotNull InterfaceC9831W interfaceC9831W, @NotNull InterfaceC10030h interfaceC10030h, @NotNull InterfaceC10030h interfaceC10030h2, boolean z11, @NotNull AbstractC9853s abstractC9853s, @NotNull d0 d0Var) {
        if (interfaceC9831W == null) {
            a(7);
            throw null;
        }
        if (interfaceC10030h == null) {
            a(8);
            throw null;
        }
        if (interfaceC10030h2 == null) {
            a(9);
            throw null;
        }
        if (abstractC9853s == null) {
            a(10);
            throw null;
        }
        if (d0Var == null) {
            a(11);
            throw null;
        }
        T t2 = new T(interfaceC9831W, interfaceC10030h, interfaceC9831W.h(), abstractC9853s, z11, false, false, InterfaceC9836b.a.DECLARATION, null, d0Var);
        t2.M0(T.K0(t2, interfaceC9831W.getType(), interfaceC10030h2));
        return t2;
    }

    public static boolean l(@NotNull InterfaceC9857w interfaceC9857w) {
        if (interfaceC9857w != null) {
            return interfaceC9857w.getName().equals(qd.s.f81856c) && interfaceC9857w.getKind() == InterfaceC9836b.a.SYNTHESIZED && i.u(interfaceC9857w.d());
        }
        a(28);
        throw null;
    }
}
