package Vd;

import Gd.C3085o;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import je.H0;
import je.K0;
import je.N;
import je.S;
import je.s0;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9815F;
import td.InterfaceC9820K;
import td.InterfaceC9827S;
import td.InterfaceC9833Y;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9843i;
import td.InterfaceC9845k;
import td.InterfaceC9848n;
import td.InterfaceC9849o;
import td.e0;
import td.q0;

/* loaded from: classes.dex */
public final class i {
    static {
        new Sd.c("kotlin.jvm.JvmName");
    }

    public static boolean A(InterfaceC9843i interfaceC9843i) {
        return (x(interfaceC9843i, EnumC9840f.CLASS) || x(interfaceC9843i, EnumC9840f.INTERFACE)) && ((InterfaceC9839e) interfaceC9843i).h() == EnumC9812C.SEALED;
    }

    public static boolean B(@NotNull InterfaceC9839e interfaceC9839e, @NotNull InterfaceC9839e interfaceC9839e2) {
        return C(interfaceC9839e.q(), interfaceC9839e2.n0());
    }

    public static boolean C(@NotNull N n11, @NotNull InterfaceC9839e interfaceC9839e) {
        if (n11 == null) {
            a(32);
            throw null;
        }
        if (interfaceC9839e == null) {
            a(33);
            throw null;
        }
        if (z(n11, interfaceC9839e)) {
            return true;
        }
        Iterator<N> it = n11.H0().o().iterator();
        while (it.hasNext()) {
            if (C(it.next(), interfaceC9839e)) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(InterfaceC9845k interfaceC9845k) {
        return interfaceC9845k != null && (interfaceC9845k.d() instanceof InterfaceC9820K);
    }

    public static boolean E(@NotNull q0 q0Var, @NotNull N n11) {
        if (q0Var == null) {
            a(66);
            throw null;
        }
        if (n11 == null) {
            a(67);
            throw null;
        }
        if (q0Var.B() || S.a(n11)) {
            return false;
        }
        if (H0.b(n11)) {
            return true;
        }
        qd.m e11 = Zd.e.e(q0Var);
        if (qd.m.g0(n11)) {
            return true;
        }
        ke.r rVar = ke.e.f71486a;
        return rVar.c(e11.N(), n11) || rVar.c(e11.E().q(), n11) || rVar.c(e11.i(), n11) || qd.w.c(n11);
    }

    @NotNull
    public static <D extends InterfaceC9836b> D F(@NotNull D d11) {
        if (d11 == null) {
            a(59);
            throw null;
        }
        while (d11.getKind() == InterfaceC9836b.a.FAKE_OVERRIDE) {
            Collection<? extends InterfaceC9836b> o11 = d11.o();
            if (o11.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d11);
            }
            d11 = (D) o11.iterator().next();
        }
        return d11;
    }

    @NotNull
    public static <D extends InterfaceC9849o> D G(@NotNull D d11) {
        return d11 instanceof InterfaceC9836b ? F((InterfaceC9836b) d11) : d11;
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case 57:
            case 58:
            case 59:
            case 61:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[0] = "declarationDescriptor";
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case 28:
                objArr[0] = "subClass";
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case 32:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 67:
                objArr[0] = "type";
                break;
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[0] = "other";
                break;
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                objArr[0] = "classKind";
                break;
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 41:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 73 */:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i11) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[2] = "isAncestor";
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                objArr[2] = "isAnonymousFunction";
                break;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                objArr[2] = "isEnumEntry";
                break;
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 73 */:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private static void b(@NotNull InterfaceC9835a interfaceC9835a, @NotNull LinkedHashSet linkedHashSet) {
        if (interfaceC9835a == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC9835a)) {
            return;
        }
        Iterator<? extends InterfaceC9835a> it = interfaceC9835a.n0().o().iterator();
        while (it.hasNext()) {
            InterfaceC9835a n02 = it.next().n0();
            b(n02, linkedHashSet);
            linkedHashSet.add(n02);
        }
    }

    @NotNull
    public static LinkedHashSet c(@NotNull InterfaceC9835a interfaceC9835a) {
        if (interfaceC9835a == null) {
            a(71);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b(interfaceC9835a.n0(), linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static InterfaceC9839e d(@NotNull N n11) {
        if (n11 == null) {
            a(45);
            throw null;
        }
        s0 H02 = n11.H0();
        if (H02 == null) {
            a(46);
            throw null;
        }
        InterfaceC9839e interfaceC9839e = (InterfaceC9839e) H02.p();
        if (interfaceC9839e != null) {
            return interfaceC9839e;
        }
        a(47);
        throw null;
    }

    @NotNull
    public static InterfaceC9815F e(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k == null) {
            a(21);
            throw null;
        }
        InterfaceC9815F g10 = g(interfaceC9845k);
        if (g10 != null) {
            return g10;
        }
        a(22);
        throw null;
    }

    public static InterfaceC9815F f(@NotNull K0 k02) {
        if (k02 == null) {
            a(20);
            throw null;
        }
        InterfaceC9842h p11 = k02.H0().p();
        if (p11 == null) {
            return null;
        }
        return g(p11);
    }

    public static InterfaceC9815F g(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k == null) {
            a(23);
            throw null;
        }
        while (interfaceC9845k != null) {
            if (interfaceC9845k instanceof InterfaceC9815F) {
                return (InterfaceC9815F) interfaceC9845k;
            }
            if (interfaceC9845k instanceof InterfaceC9827S) {
                return ((InterfaceC9827S) interfaceC9845k).A0();
            }
            interfaceC9845k = interfaceC9845k.d();
        }
        return null;
    }

    @NotNull
    public static e0 h(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k == null) {
            a(82);
            throw null;
        }
        if (interfaceC9845k instanceof InterfaceC9833Y) {
            interfaceC9845k = ((InterfaceC9833Y) interfaceC9845k).f0();
        }
        boolean z11 = interfaceC9845k instanceof InterfaceC9848n;
        e0 e0Var = e0.f99393a;
        if (z11) {
            ((InterfaceC9848n) interfaceC9845k).e().b();
        }
        return e0Var;
    }

    @NotNull
    public static AbstractC9850p i(@NotNull he.n nVar) {
        if (nVar == null) {
            a(48);
            throw null;
        }
        EnumC9840f kind = nVar.getKind();
        if (kind == EnumC9840f.ENUM_CLASS || kind.a()) {
            AbstractC9853s abstractC9853s = C9852r.f99399a;
            if (abstractC9853s != null) {
                return (AbstractC9850p) abstractC9853s;
            }
            a(49);
            throw null;
        }
        if (A(nVar)) {
            AbstractC9853s abstractC9853s2 = C9852r.f99399a;
            if (abstractC9853s2 != null) {
                return (AbstractC9850p) abstractC9853s2;
            }
            a(51);
            throw null;
        }
        if (q(nVar)) {
            AbstractC9853s abstractC9853s3 = C9852r.f99410l;
            if (abstractC9853s3 != null) {
                return (AbstractC9850p) abstractC9853s3;
            }
            a(52);
            throw null;
        }
        AbstractC9853s abstractC9853s4 = C9852r.f99403e;
        if (abstractC9853s4 != null) {
            return (AbstractC9850p) abstractC9853s4;
        }
        a(53);
        throw null;
    }

    public static InterfaceC9834Z j(@NotNull C3085o c3085o) {
        if (c3085o != null) {
            return c3085o.W();
        }
        a(0);
        throw null;
    }

    @NotNull
    public static Sd.d k(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k != null) {
            Sd.c m11 = m(interfaceC9845k);
            return m11 != null ? m11.j() : k(interfaceC9845k.d()).c(interfaceC9845k.getName());
        }
        a(2);
        throw null;
    }

    @NotNull
    public static Sd.c l(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k == null) {
            a(3);
            throw null;
        }
        Sd.c m11 = m(interfaceC9845k);
        if (m11 == null) {
            m11 = k(interfaceC9845k.d()).c(interfaceC9845k.getName()).l();
        }
        if (m11 != null) {
            return m11;
        }
        a(4);
        throw null;
    }

    private static Sd.c m(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k == null) {
            a(5);
            throw null;
        }
        if ((interfaceC9845k instanceof InterfaceC9815F) || le.l.k(interfaceC9845k)) {
            return Sd.c.f26129c;
        }
        if (interfaceC9845k instanceof InterfaceC9827S) {
            return ((InterfaceC9827S) interfaceC9845k).c();
        }
        if (interfaceC9845k instanceof InterfaceC9820K) {
            return ((InterfaceC9820K) interfaceC9845k).c();
        }
        return null;
    }

    public static <D extends InterfaceC9845k> D n(InterfaceC9845k interfaceC9845k, @NotNull Class<D> cls, boolean z11) {
        if (interfaceC9845k == null) {
            return null;
        }
        if (z11) {
            interfaceC9845k = (D) interfaceC9845k.d();
        }
        while (interfaceC9845k != null) {
            if (cls.isInstance(interfaceC9845k)) {
                return (D) interfaceC9845k;
            }
            interfaceC9845k = (D) interfaceC9845k.d();
        }
        return null;
    }

    public static InterfaceC9839e o(@NotNull InterfaceC9839e interfaceC9839e) {
        if (interfaceC9839e == null) {
            a(44);
            throw null;
        }
        Iterator<N> it = interfaceC9839e.k().o().iterator();
        while (it.hasNext()) {
            InterfaceC9839e d11 = d(it.next());
            if (d11.getKind() != EnumC9840f.INTERFACE) {
                return d11;
            }
        }
        return null;
    }

    public static boolean p(InterfaceC9845k interfaceC9845k) {
        return x(interfaceC9845k, EnumC9840f.ANNOTATION_CLASS);
    }

    public static boolean q(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k != null) {
            return x(interfaceC9845k, EnumC9840f.CLASS) && interfaceC9845k.getName().equals(Sd.h.f26144a);
        }
        a(34);
        throw null;
    }

    public static boolean r(InterfaceC9845k interfaceC9845k) {
        return x(interfaceC9845k, EnumC9840f.CLASS) || x(interfaceC9845k, EnumC9840f.ENUM_CLASS);
    }

    public static boolean s(InterfaceC9845k interfaceC9845k) {
        return x(interfaceC9845k, EnumC9840f.OBJECT) && ((InterfaceC9839e) interfaceC9845k).j0();
    }

    public static boolean t(@NotNull InterfaceC9839e interfaceC9839e, @NotNull he.n nVar) {
        if (nVar == null) {
            a(27);
            throw null;
        }
        Iterator<N> it = interfaceC9839e.k().o().iterator();
        while (it.hasNext()) {
            if (z(it.next(), nVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(InterfaceC9845k interfaceC9845k) {
        return x(interfaceC9845k, EnumC9840f.ENUM_CLASS);
    }

    public static boolean v(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k != null) {
            return x(interfaceC9845k, EnumC9840f.ENUM_ENTRY);
        }
        a(36);
        throw null;
    }

    public static boolean w(InterfaceC9845k interfaceC9845k) {
        return x(interfaceC9845k, EnumC9840f.INTERFACE);
    }

    private static boolean x(InterfaceC9845k interfaceC9845k, @NotNull EnumC9840f enumC9840f) {
        if (enumC9840f != null) {
            return (interfaceC9845k instanceof InterfaceC9839e) && ((InterfaceC9839e) interfaceC9845k).getKind() == enumC9840f;
        }
        a(37);
        throw null;
    }

    public static boolean y(@NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k == null) {
            a(1);
            throw null;
        }
        while (interfaceC9845k != null) {
            if (q(interfaceC9845k) || ((interfaceC9845k instanceof InterfaceC9849o) && ((InterfaceC9849o) interfaceC9845k).getVisibility() == C9852r.f99404f)) {
                return true;
            }
            interfaceC9845k = interfaceC9845k.d();
        }
        return false;
    }

    private static boolean z(@NotNull N n11, @NotNull InterfaceC9839e interfaceC9839e) {
        if (n11 == null) {
            a(30);
            throw null;
        }
        if (interfaceC9839e == null) {
            a(31);
            throw null;
        }
        InterfaceC9842h p11 = n11.H0().p();
        if (p11 == null) {
            return false;
        }
        InterfaceC9845k n02 = p11.n0();
        return (n02 instanceof InterfaceC9842h) && interfaceC9839e.k().equals(((InterfaceC9842h) n02).k());
    }
}
