package Vd;

import Vd.j;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import je.C7363H;
import je.C7382h;
import je.K0;
import je.N;
import je.S;
import je.r0;
import je.s0;
import ke.e;
import ke.f;
import ke.h;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.InterfaceC9815F;
import td.InterfaceC9830V;
import td.InterfaceC9831W;
import td.InterfaceC9833Y;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.i0;
import td.p0;
import wd.AbstractC10539z;
import wd.P;
import wd.Q;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    private static final List<j> f28545d = C7714v.U0(ServiceLoader.load(j.class, j.class.getClassLoader()));

    /* renamed from: e, reason: collision with root package name */
    public static final n f28546e;

    /* renamed from: f, reason: collision with root package name */
    private static final e.a f28547f;

    /* renamed from: a, reason: collision with root package name */
    private final h.a f28548a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f28549b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a f28550c;

    static class a implements e.a {
        private static /* synthetic */ void b(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ke.e.a
        public final boolean a(@NotNull s0 s0Var, @NotNull s0 s0Var2) {
            if (s0Var == null) {
                b(0);
                throw null;
            }
            if (s0Var2 != null) {
                return s0Var.equals(s0Var2);
            }
            b(1);
            throw null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28551a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28552b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f28553c;

        static {
            int[] iArr = new int[EnumC9812C.values().length];
            f28553c = iArr;
            try {
                iArr[EnumC9812C.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28553c[EnumC9812C.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28553c[EnumC9812C.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28553c[EnumC9812C.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[c.a.values().length];
            f28552b = iArr2;
            try {
                iArr2[c.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28552b[c.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28552b[c.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[j.b.values().length];
            f28551a = iArr3;
            try {
                iArr3[j.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28551a[j.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28551a[j.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* renamed from: c, reason: collision with root package name */
        private static final c f28554c = new c(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a, reason: collision with root package name */
        private final a f28555a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28556b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ a[] $VALUES;
            public static final a CONFLICT;
            public static final a INCOMPATIBLE;
            public static final a OVERRIDABLE;

            static {
                a aVar = new a("OVERRIDABLE", 0);
                OVERRIDABLE = aVar;
                a aVar2 = new a("INCOMPATIBLE", 1);
                INCOMPATIBLE = aVar2;
                a aVar3 = new a("CONFLICT", 2);
                CONFLICT = aVar3;
                $VALUES = new a[]{aVar, aVar2, aVar3};
            }

            private a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public c(@NotNull a aVar, @NotNull String str) {
            if (aVar == null) {
                a(3);
                throw null;
            }
            this.f28555a = aVar;
            this.f28556b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void a(int i11) {
            String format;
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? 3 : 2];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    objArr[0] = "success";
                } else if (i11 != 4) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
                switch (i11) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                        break;
                    case 5:
                        objArr[1] = "getResult";
                        break;
                    case 6:
                        objArr[1] = "getDebugMessage";
                        break;
                    default:
                        objArr[1] = "success";
                        break;
                }
                if (i11 != 1) {
                    objArr[2] = "incompatible";
                } else if (i11 == 2) {
                    objArr[2] = "conflict";
                } else if (i11 == 3 || i11 == 4) {
                    objArr[2] = "<init>";
                }
                format = String.format(str, objArr);
                if (i11 == 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new IllegalStateException(format);
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "debugMessage";
            switch (i11) {
            }
            if (i11 != 1) {
            }
            format = String.format(str, objArr);
            if (i11 == 1) {
            }
            throw new IllegalArgumentException(format);
        }

        @NotNull
        public static c b(@NotNull String str) {
            return new c(a.CONFLICT, str);
        }

        @NotNull
        public static c d(@NotNull String str) {
            return new c(a.INCOMPATIBLE, str);
        }

        @NotNull
        public static c e() {
            c cVar = f28554c;
            if (cVar != null) {
                return cVar;
            }
            a(0);
            throw null;
        }

        @NotNull
        public final a c() {
            a aVar = this.f28555a;
            if (aVar != null) {
                return aVar;
            }
            a(5);
            throw null;
        }

        public final String toString() {
            return this.f28555a + ": " + this.f28556b;
        }
    }

    static {
        a aVar = new a();
        f28547f = aVar;
        f28546e = new n(aVar, h.a.f71488a, f.a.f71487a);
    }

    private n(@NotNull e.a aVar, @NotNull h.a aVar2, @NotNull f.a aVar3) {
        if (aVar == null) {
            a(5);
            throw null;
        }
        if (aVar2 == null) {
            a(6);
            throw null;
        }
        if (aVar3 == null) {
            a(7);
            throw null;
        }
        this.f28550c = aVar;
        this.f28548a = aVar2;
        this.f28549b = aVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        Object[] objArr;
        if (i11 != 11 && i11 != 12 && i11 != 16 && i11 != 21 && i11 != 93 && i11 != 96 && i11 != 101 && i11 != 42 && i11 != 43) {
            switch (i11) {
                default:
                    switch (i11) {
                        default:
                            switch (i11) {
                                default:
                                    switch (i11) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            break;
                    }
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    break;
            }
            if (i11 != 11 && i11 != 12 && i11 != 16 && i11 != 21 && i11 != 93 && i11 != 96 && i11 != 101 && i11 != 42 && i11 != 43) {
                switch (i11) {
                    default:
                        switch (i11) {
                            default:
                                switch (i11) {
                                    default:
                                        switch (i11) {
                                            case 88:
                                            case 89:
                                            case 90:
                                                break;
                                            default:
                                                i12 = 3;
                                                break;
                                        }
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                        i12 = 2;
                                        break;
                                }
                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                break;
                        }
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        break;
                }
                objArr = new Object[i12];
                switch (i11) {
                    case 1:
                    case 7:
                        objArr[0] = "kotlinTypePreparator";
                        break;
                    case 2:
                        objArr[0] = "customSubtype";
                        break;
                    case 3:
                    case 6:
                    default:
                        objArr[0] = "kotlinTypeRefiner";
                        break;
                    case 4:
                        objArr[0] = "equalityAxioms";
                        break;
                    case 5:
                        objArr[0] = "axioms";
                        break;
                    case 8:
                    case 9:
                        objArr[0] = "candidateSet";
                        break;
                    case 10:
                        objArr[0] = "transformFirst";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case 42:
                    case 43:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                    case 90:
                    case 93:
                    case 96:
                    case 101:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                        break;
                    case 13:
                        objArr[0] = "f";
                        break;
                    case 14:
                        objArr[0] = "g";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "descriptor";
                        break;
                    case 18:
                        objArr[0] = "result";
                        break;
                    case 19:
                    case 22:
                    case 28:
                    case 38:
                        objArr[0] = "superDescriptor";
                        break;
                    case 20:
                    case 23:
                    case 29:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        objArr[0] = "subDescriptor";
                        break;
                    case 40:
                        objArr[0] = "firstParameters";
                        break;
                    case 41:
                        objArr[0] = "secondParameters";
                        break;
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        objArr[0] = "typeInSuper";
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        objArr[0] = "typeInSub";
                        break;
                    case 46:
                    case 49:
                    case 75:
                        objArr[0] = "typeCheckerState";
                        break;
                    case 47:
                        objArr[0] = "superTypeParameter";
                        break;
                    case 48:
                        objArr[0] = "subTypeParameter";
                        break;
                    case 50:
                        objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                        break;
                    case 51:
                        objArr[0] = "membersFromSupertypes";
                        break;
                    case 52:
                        objArr[0] = "membersFromCurrent";
                        break;
                    case 53:
                    case 59:
                    case 62:
                    case 84:
                    case 87:
                    case 94:
                        objArr[0] = "current";
                        break;
                    case 54:
                    case 60:
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    case 85:
                    case 104:
                        objArr[0] = "strategy";
                        break;
                    case 55:
                        objArr[0] = "overriding";
                        break;
                    case 56:
                        objArr[0] = "fromSuper";
                        break;
                    case 57:
                        objArr[0] = "fromCurrent";
                        break;
                    case 58:
                        objArr[0] = "descriptorsFromSuper";
                        break;
                    case 61:
                    case 63:
                        objArr[0] = "notOverridden";
                        break;
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    case 67:
                    case 71:
                        objArr[0] = "a";
                        break;
                    case 66:
                    case 68:
                    case ModuleDescriptor.MODULE_VERSION /* 73 */:
                        objArr[0] = "b";
                        break;
                    case 69:
                        objArr[0] = "candidate";
                        break;
                    case 70:
                    case 86:
                    case 91:
                    case 107:
                        objArr[0] = "descriptors";
                        break;
                    case 72:
                        objArr[0] = "aReturnType";
                        break;
                    case 74:
                        objArr[0] = "bReturnType";
                        break;
                    case 76:
                    case 83:
                        objArr[0] = "overridables";
                        break;
                    case 77:
                    case Logger.NONE /* 99 */:
                        objArr[0] = "descriptorByHandle";
                        break;
                    case 92:
                        objArr[0] = "classModality";
                        break;
                    case 95:
                        objArr[0] = "toFilter";
                        break;
                    case 97:
                    case 102:
                        objArr[0] = "overrider";
                        break;
                    case 98:
                    case 103:
                        objArr[0] = "extractFrom";
                        break;
                    case 100:
                        objArr[0] = "onConflict";
                        break;
                    case 105:
                    case 106:
                        objArr[0] = "memberDescriptor";
                        break;
                }
                if (i11 != 11 || i11 == 12) {
                    objArr[1] = "filterOverrides";
                } else if (i11 != 16) {
                    if (i11 != 21) {
                        if (i11 == 93) {
                            objArr[1] = "getMinimalModality";
                        } else if (i11 == 96) {
                            objArr[1] = "filterVisibleFakeOverrides";
                        } else if (i11 == 101) {
                            objArr[1] = "extractMembersOverridableInBothWays";
                        } else if (i11 != 42 && i11 != 43) {
                            switch (i11) {
                                case 24:
                                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                    break;
                                default:
                                    switch (i11) {
                                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                            objArr[1] = "isOverridableByWithoutExternalConditions";
                                            break;
                                        default:
                                            switch (i11) {
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                    objArr[1] = "selectMostSpecificMember";
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 88:
                                                        case 89:
                                                        case 90:
                                                            objArr[1] = "determineModalityForFakeOverride";
                                                            break;
                                                        default:
                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                            break;
                                                    }
                                            }
                                    }
                            }
                        } else {
                            objArr[1] = "createTypeCheckerState";
                        }
                    }
                    objArr[1] = "isOverridableBy";
                } else {
                    objArr[1] = "getOverriddenDeclarations";
                }
                switch (i11) {
                    case 1:
                    case 2:
                        objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "create";
                        break;
                    case 5:
                    case 6:
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 8:
                        objArr[2] = "filterOutOverridden";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "filterOverrides";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case 42:
                    case 43:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                    case 90:
                    case 93:
                    case 96:
                    case 101:
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "overrides";
                        break;
                    case 15:
                        objArr[2] = "getOverriddenDeclarations";
                        break;
                    case 17:
                    case 18:
                        objArr[2] = "collectOverriddenDeclarations";
                        break;
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        objArr[2] = "isOverridableBy";
                        break;
                    case 28:
                    case 29:
                        objArr[2] = "isOverridableByWithoutExternalConditions";
                        break;
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        objArr[2] = "getBasicOverridabilityProblem";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "createTypeCheckerState";
                        break;
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                        objArr[2] = "areTypesEquivalent";
                        break;
                    case 47:
                    case 48:
                    case 49:
                        objArr[2] = "areTypeParametersEquivalent";
                        break;
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                        objArr[2] = "generateOverridesInFunctionGroup";
                        break;
                    case 55:
                    case 56:
                        objArr[2] = "isVisibleForOverride";
                        break;
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        objArr[2] = "extractAndBindOverridesForMember";
                        break;
                    case 61:
                        objArr[2] = "allHasSameContainingDeclaration";
                        break;
                    case 62:
                    case 63:
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        objArr[2] = "createAndBindFakeOverrides";
                        break;
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    case 66:
                        objArr[2] = "isMoreSpecific";
                        break;
                    case 67:
                    case 68:
                        objArr[2] = "isVisibilityMoreSpecific";
                        break;
                    case 69:
                    case 70:
                        objArr[2] = "isMoreSpecificThenAllOf";
                        break;
                    case 71:
                    case 72:
                    case ModuleDescriptor.MODULE_VERSION /* 73 */:
                    case 74:
                    case 75:
                        objArr[2] = "isReturnTypeMoreSpecific";
                        break;
                    case 76:
                    case 77:
                        objArr[2] = "selectMostSpecificMember";
                        break;
                    case 83:
                    case 84:
                    case 85:
                        objArr[2] = "createAndBindFakeOverride";
                        break;
                    case 86:
                    case 87:
                        objArr[2] = "determineModalityForFakeOverride";
                        break;
                    case 91:
                    case 92:
                        objArr[2] = "getMinimalModality";
                        break;
                    case 94:
                    case 95:
                        objArr[2] = "filterVisibleFakeOverrides";
                        break;
                    case 97:
                    case 98:
                    case Logger.NONE /* 99 */:
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                        objArr[2] = "extractMembersOverridableInBothWays";
                        break;
                    case 105:
                        objArr[2] = "resolveUnknownVisibilityForMember";
                        break;
                    case 106:
                        objArr[2] = "computeVisibilityToInherit";
                        break;
                    case 107:
                        objArr[2] = "findMaxVisibility";
                        break;
                    default:
                        objArr[2] = "createWithTypeRefiner";
                        break;
                }
                String format = String.format(str, objArr);
                if (i11 != 11 && i11 != 12 && i11 != 16 && i11 != 21 && i11 != 93 && i11 != 96 && i11 != 101 && i11 != 42 && i11 != 43) {
                    switch (i11) {
                        case 24:
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            break;
                        default:
                            switch (i11) {
                                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                case 32:
                                case 33:
                                case 34:
                                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                    break;
                                default:
                                    switch (i11) {
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                            break;
                                        default:
                                            switch (i11) {
                                                case 88:
                                                case 89:
                                                case 90:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i12 = 2;
            objArr = new Object[i12];
            switch (i11) {
            }
            if (i11 != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i11) {
            }
            String format2 = String.format(str, objArr);
            if (i11 != 11) {
                switch (i11) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i11 != 11) {
            switch (i11) {
            }
            objArr = new Object[i12];
            switch (i11) {
            }
            if (i11 != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i11) {
            }
            String format22 = String.format(str, objArr);
            if (i11 != 11) {
            }
            throw new IllegalStateException(format22);
        }
        i12 = 2;
        objArr = new Object[i12];
        switch (i11) {
        }
        if (i11 != 11) {
        }
        objArr[1] = "filterOverrides";
        switch (i11) {
        }
        String format222 = String.format(str, objArr);
        if (i11 != 11) {
        }
        throw new IllegalStateException(format222);
    }

    private static boolean b(@NotNull N n11, @NotNull N n12, @NotNull r0 r0Var) {
        if (n11 == null) {
            a(44);
            throw null;
        }
        if (n12 == null) {
            a(45);
            throw null;
        }
        if (S.a(n11) && S.a(n12)) {
            return true;
        }
        return C7382h.e(r0Var, n11.K0(), n12.K0());
    }

    private static void c(@NotNull InterfaceC9836b interfaceC9836b, @NotNull LinkedHashSet linkedHashSet) {
        if (interfaceC9836b == null) {
            a(17);
            throw null;
        }
        InterfaceC9836b.a kind = interfaceC9836b.getKind();
        kind.getClass();
        if (kind != InterfaceC9836b.a.FAKE_OVERRIDE) {
            linkedHashSet.add(interfaceC9836b);
            return;
        }
        if (interfaceC9836b.o().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC9836b);
        }
        Iterator<? extends InterfaceC9836b> it = interfaceC9836b.o().iterator();
        while (it.hasNext()) {
            c(it.next(), linkedHashSet);
        }
    }

    private static ArrayList d(InterfaceC9835a interfaceC9835a) {
        InterfaceC9834Z d02 = interfaceC9835a.d0();
        ArrayList arrayList = new ArrayList();
        if (d02 != null) {
            arrayList.add(d02.getType());
        }
        Iterator<p0> it = interfaceC9835a.f().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    @NotNull
    public static n e(@NotNull h.a aVar, @NotNull e.a aVar2) {
        if (aVar != null) {
            return new n(aVar2, aVar, f.a.f71487a);
        }
        a(3);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
    
        if (r2 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017d, code lost:
    
        r0 = td.C9852r.f99406h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0182, code lost:
    
        r12 = ((td.InterfaceC9836b) u(r11, new Vd.q())).u(r12, r1, (td.AbstractC9850p) r0, td.InterfaceC9836b.a.FAKE_OVERRIDE);
        r13.c(r12, r11);
        r13.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x019b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0180, code lost:
    
        r0 = td.C9852r.f99405g;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(@NotNull Collection collection, @NotNull InterfaceC9839e interfaceC9839e, @NotNull m mVar) {
        EnumC9812C enumC9812C;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (interfaceC9839e == null) {
            a(84);
            throw null;
        }
        ArrayList G11 = C7714v.G(collection, new r(interfaceC9839e));
        boolean isEmpty = G11.isEmpty();
        if (!isEmpty) {
            collection = G11;
        }
        Iterator it = collection.iterator();
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            if (it.hasNext()) {
                InterfaceC9836b interfaceC9836b = (InterfaceC9836b) it.next();
                int i11 = b.f28553c[interfaceC9836b.h().ordinal()];
                if (i11 == 1) {
                    enumC9812C = EnumC9812C.FINAL;
                    if (enumC9812C == null) {
                        a(88);
                        throw null;
                    }
                } else {
                    if (i11 == 2) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC9836b);
                    }
                    if (i11 == 3) {
                        z12 = true;
                    } else if (i11 == 4) {
                        z13 = true;
                    }
                }
            } else {
                if (interfaceC9839e.p0() && interfaceC9839e.h() != EnumC9812C.ABSTRACT && interfaceC9839e.h() != EnumC9812C.SEALED) {
                    z11 = true;
                }
                if (z12 && !z13) {
                    enumC9812C = EnumC9812C.OPEN;
                    if (enumC9812C == null) {
                        a(89);
                        throw null;
                    }
                } else if (z12 || !z13) {
                    HashSet<InterfaceC9836b> hashSet = new HashSet();
                    for (InterfaceC9836b interfaceC9836b2 : collection) {
                        if (interfaceC9836b2 == null) {
                            a(15);
                            throw null;
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        c(interfaceC9836b2, linkedHashSet);
                        hashSet.addAll(linkedHashSet);
                    }
                    if (!hashSet.isEmpty()) {
                        InterfaceC9815F j11 = Zd.e.j((InterfaceC9845k) hashSet.iterator().next());
                        Intrinsics.checkNotNullParameter(j11, "<this>");
                    }
                    o oVar = new o();
                    if (hashSet.size() > 1) {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            Iterator it3 = linkedHashSet2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    linkedHashSet2.add(next);
                                    break;
                                }
                                Pair<InterfaceC9835a, InterfaceC9835a> invoke = oVar.invoke(next, it3.next());
                                InterfaceC9835a a11 = invoke.a();
                                InterfaceC9835a b11 = invoke.b();
                                if (!s(a11, b11)) {
                                    if (s(b11, a11)) {
                                        break;
                                    }
                                } else {
                                    it3.remove();
                                }
                            }
                        }
                        hashSet = linkedHashSet2;
                    }
                    EnumC9812C h11 = interfaceC9839e.h();
                    if (h11 == null) {
                        a(92);
                        throw null;
                    }
                    EnumC9812C enumC9812C2 = EnumC9812C.ABSTRACT;
                    for (InterfaceC9836b interfaceC9836b3 : hashSet) {
                        EnumC9812C h12 = (z11 && interfaceC9836b3.h() == EnumC9812C.ABSTRACT) ? h11 : interfaceC9836b3.h();
                        if (h12.compareTo(enumC9812C2) < 0) {
                            enumC9812C2 = h12;
                        }
                    }
                    if (enumC9812C2 == null) {
                        a(93);
                        throw null;
                    }
                    enumC9812C = enumC9812C2;
                } else {
                    enumC9812C = z11 ? interfaceC9839e.h() : EnumC9812C.ABSTRACT;
                    if (enumC9812C == null) {
                        a(90);
                        throw null;
                    }
                }
            }
        }
    }

    @NotNull
    private r0 g(@NotNull List<i0> list, @NotNull List<i0> list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean isEmpty = list.isEmpty();
        h.a aVar = this.f28548a;
        e.a aVar2 = this.f28550c;
        f.a aVar3 = this.f28549b;
        if (isEmpty) {
            return new u(null, aVar2, aVar, aVar3).n0();
        }
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < list.size(); i11++) {
            hashMap.put(list.get(i11).k(), list2.get(i11).k());
        }
        return new u(hashMap, aVar2, aVar, aVar3).n0();
    }

    @NotNull
    public static n h(@NotNull h.a aVar) {
        if (aVar != null) {
            return new n(f28547f, aVar, f.a.f71487a);
        }
        a(0);
        throw null;
    }

    @NotNull
    public static ArrayList i(@NotNull Object obj, @NotNull LinkedList linkedList, @NotNull Function1 function1, @NotNull Function1 function12) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC9835a interfaceC9835a = (InterfaceC9835a) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC9835a interfaceC9835a2 = (InterfaceC9835a) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                c.a l11 = l(interfaceC9835a, interfaceC9835a2);
                if (l11 == c.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (l11 == c.a.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static c k(@NotNull InterfaceC9835a interfaceC9835a, @NotNull InterfaceC9835a interfaceC9835a2) {
        boolean z11;
        if (interfaceC9835a == null) {
            a(38);
            throw null;
        }
        if (interfaceC9835a2 == null) {
            a(39);
            throw null;
        }
        boolean z12 = interfaceC9835a instanceof InterfaceC9857w;
        if ((z12 && !(interfaceC9835a2 instanceof InterfaceC9857w)) || (((z11 = interfaceC9835a instanceof InterfaceC9831W)) && !(interfaceC9835a2 instanceof InterfaceC9831W))) {
            return c.d("Member kind mismatch");
        }
        if (!z12 && !z11) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC9835a);
        }
        if (!interfaceC9835a.getName().equals(interfaceC9835a2.getName())) {
            return c.d("Name mismatch");
        }
        c d11 = (interfaceC9835a.d0() == null) != (interfaceC9835a2.d0() == null) ? c.d("Receiver presence mismatch") : interfaceC9835a.f().size() != interfaceC9835a2.f().size() ? c.d("Value parameter number mismatch") : null;
        if (d11 != null) {
            return d11;
        }
        return null;
    }

    public static c.a l(InterfaceC9835a interfaceC9835a, InterfaceC9835a interfaceC9835a2) {
        n nVar = f28546e;
        c.a c11 = nVar.n(interfaceC9835a2, interfaceC9835a, null).c();
        c.a c12 = nVar.o(interfaceC9835a, interfaceC9835a2, null, false).c();
        c.a aVar = c.a.OVERRIDABLE;
        if (c11 == aVar && c12 == aVar) {
            return aVar;
        }
        c.a aVar2 = c.a.CONFLICT;
        return (c11 == aVar2 || c12 == aVar2) ? aVar2 : c.a.INCOMPATIBLE;
    }

    public static boolean m(@NotNull InterfaceC9835a interfaceC9835a, @NotNull InterfaceC9835a interfaceC9835a2) {
        if (interfaceC9835a == null) {
            a(65);
            throw null;
        }
        if (interfaceC9835a2 == null) {
            a(66);
            throw null;
        }
        N returnType = interfaceC9835a.getReturnType();
        N returnType2 = interfaceC9835a2.getReturnType();
        if (!r(interfaceC9835a, interfaceC9835a2)) {
            return false;
        }
        r0 g10 = f28546e.g(interfaceC9835a.getTypeParameters(), interfaceC9835a2.getTypeParameters());
        if (interfaceC9835a instanceof InterfaceC9857w) {
            return q(interfaceC9835a, returnType, interfaceC9835a2, returnType2, g10);
        }
        if (!(interfaceC9835a instanceof InterfaceC9831W)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC9835a.getClass());
        }
        InterfaceC9831W interfaceC9831W = (InterfaceC9831W) interfaceC9835a;
        InterfaceC9831W interfaceC9831W2 = (InterfaceC9831W) interfaceC9835a2;
        InterfaceC9833Y setter = interfaceC9831W.getSetter();
        InterfaceC9833Y setter2 = interfaceC9831W2.getSetter();
        if ((setter == null || setter2 == null) ? true : r(setter, setter2)) {
            return (interfaceC9831W.B() && interfaceC9831W2.B()) ? C7382h.e(g10, returnType.K0(), returnType2.K0()) : (interfaceC9831W.B() || !interfaceC9831W2.B()) && q(interfaceC9835a, returnType, interfaceC9835a2, returnType2, g10);
        }
        return false;
    }

    private static boolean q(@NotNull InterfaceC9835a interfaceC9835a, @NotNull N n11, @NotNull InterfaceC9835a interfaceC9835a2, @NotNull N n12, @NotNull r0 state) {
        if (interfaceC9835a == null) {
            a(71);
            throw null;
        }
        if (n11 == null) {
            a(72);
            throw null;
        }
        if (interfaceC9835a2 == null) {
            a(73);
            throw null;
        }
        if (n12 == null) {
            a(74);
            throw null;
        }
        C7382h c7382h = C7382h.f69890a;
        K0 subType = n11.K0();
        K0 superType = n12.K0();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return C7382h.i(c7382h, state, subType, superType);
    }

    private static boolean r(@NotNull InterfaceC9835a interfaceC9835a, @NotNull InterfaceC9835a interfaceC9835a2) {
        if (interfaceC9835a == null) {
            a(67);
            throw null;
        }
        if (interfaceC9835a2 != null) {
            Integer d11 = C9852r.d(interfaceC9835a.getVisibility(), interfaceC9835a2.getVisibility());
            return d11 == null || d11.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean s(@NotNull InterfaceC9835a interfaceC9835a, @NotNull InterfaceC9835a interfaceC9835a2) {
        if (interfaceC9835a == null) {
            a(13);
            throw null;
        }
        if (interfaceC9835a2 == null) {
            a(14);
            throw null;
        }
        boolean equals = interfaceC9835a.equals(interfaceC9835a2);
        g gVar = g.f28542a;
        if (!equals && gVar.a(interfaceC9835a.n0(), interfaceC9835a2.n0(), false)) {
            return true;
        }
        InterfaceC9835a n02 = interfaceC9835a2.n0();
        Iterator it = i.c(interfaceC9835a).iterator();
        while (it.hasNext()) {
            if (gVar.a(n02, (InterfaceC9835a) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(@NotNull InterfaceC9836b interfaceC9836b, Function1<InterfaceC9836b, Unit> function1) {
        AbstractC9853s abstractC9853s;
        AbstractC9853s abstractC9853s2;
        AbstractC9853s abstractC9853s3;
        if (interfaceC9836b == null) {
            a(105);
            throw null;
        }
        for (InterfaceC9836b interfaceC9836b2 : interfaceC9836b.o()) {
            if (interfaceC9836b2.getVisibility() == C9852r.f99405g) {
                t(interfaceC9836b2, function1);
            }
        }
        if (interfaceC9836b.getVisibility() != C9852r.f99405g) {
            return;
        }
        Collection<? extends InterfaceC9836b> o11 = interfaceC9836b.o();
        if (o11 == null) {
            a(107);
            throw null;
        }
        if (!o11.isEmpty()) {
            Iterator<? extends InterfaceC9836b> it = o11.iterator();
            loop3: while (true) {
                abstractC9853s = null;
                while (it.hasNext()) {
                    AbstractC9853s visibility = it.next().getVisibility();
                    if (abstractC9853s != null) {
                        Integer d11 = C9852r.d(visibility, abstractC9853s);
                        if (d11 == null) {
                            break;
                        } else if (d11.intValue() > 0) {
                        }
                    }
                    abstractC9853s = visibility;
                }
            }
            if (abstractC9853s != null) {
                Iterator<? extends InterfaceC9836b> it2 = o11.iterator();
                while (it2.hasNext()) {
                    Integer d12 = C9852r.d(abstractC9853s, it2.next().getVisibility());
                    if (d12 != null && d12.intValue() >= 0) {
                    }
                }
                abstractC9853s2 = abstractC9853s;
            }
            abstractC9853s2 = null;
            break;
        }
        abstractC9853s2 = C9852r.f99410l;
        if (abstractC9853s2 != null) {
            if (interfaceC9836b.getKind() == InterfaceC9836b.a.FAKE_OVERRIDE) {
                for (InterfaceC9836b interfaceC9836b3 : o11) {
                    if (interfaceC9836b3.h() == EnumC9812C.ABSTRACT || interfaceC9836b3.getVisibility().equals(abstractC9853s2)) {
                    }
                }
            } else {
                abstractC9853s2 = abstractC9853s2.d();
            }
            if (abstractC9853s2 != null) {
                if (function1 != null) {
                    function1.invoke(interfaceC9836b);
                }
                abstractC9853s3 = C9852r.f99403e;
            } else {
                abstractC9853s3 = abstractC9853s2;
            }
            if (!(interfaceC9836b instanceof Q)) {
                ((Q) interfaceC9836b).Q0(abstractC9853s3);
                Iterator it3 = ((InterfaceC9831W) interfaceC9836b).t().iterator();
                while (it3.hasNext()) {
                    t((InterfaceC9830V) it3.next(), abstractC9853s2 == null ? null : function1);
                }
                return;
            }
            if (interfaceC9836b instanceof AbstractC10539z) {
                ((AbstractC10539z) interfaceC9836b).Z0(abstractC9853s3);
                return;
            }
            P p11 = (P) interfaceC9836b;
            p11.J0(abstractC9853s3);
            if (abstractC9853s3 != p11.f0().getVisibility()) {
                p11.H0();
                return;
            }
            return;
        }
        abstractC9853s2 = null;
        if (abstractC9853s2 != null) {
        }
        if (!(interfaceC9836b instanceof Q)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <H> H u(@NotNull Collection<H> collection, @NotNull Function1<H, InterfaceC9835a> transform) {
        H h11;
        if (collection.size() == 1) {
            H h12 = (H) C7714v.J(collection);
            if (h12 != null) {
                return h12;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList2 = new ArrayList(C7714v.z(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(transform.invoke(it.next()));
        }
        H h13 = (H) C7714v.J(collection);
        InterfaceC9835a interfaceC9835a = (InterfaceC9835a) transform.invoke(h13);
        for (H h14 : collection) {
            InterfaceC9835a interfaceC9835a2 = (InterfaceC9835a) transform.invoke(h14);
            if (interfaceC9835a2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(h14);
                    break;
                }
                if (!m(interfaceC9835a2, (InterfaceC9835a) it2.next())) {
                    break;
                }
            }
            if (m(interfaceC9835a2, interfaceC9835a) && !m(interfaceC9835a, interfaceC9835a2)) {
                h13 = h14;
            }
        }
        if (arrayList.isEmpty()) {
            if (h13 != null) {
                return h13;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h15 = (H) C7714v.J(arrayList);
            if (h15 != null) {
                return h15;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                h11 = null;
                break;
            }
            h11 = (H) it3.next();
            if (!C7363H.a(((InterfaceC9835a) transform.invoke(h11)).getReturnType())) {
                break;
            }
        }
        if (h11 != null) {
            return h11;
        }
        H h16 = (H) C7714v.J(arrayList);
        if (h16 != null) {
            return h16;
        }
        a(82);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(@NotNull Sd.f fVar, @NotNull Collection collection, @NotNull Collection collection2, @NotNull InterfaceC9839e interfaceC9839e, @NotNull m mVar) {
        if (fVar == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (interfaceC9839e == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC9836b fromCurrent = (InterfaceC9836b) it.next();
            if (fromCurrent == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            te.i iVar = new te.i();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC9836b fromSuper = (InterfaceC9836b) it2.next();
                c.a c11 = n(fromSuper, fromCurrent, interfaceC9839e).c();
                boolean z11 = !C9852r.g(fromSuper.getVisibility()) && C9852r.h(fromSuper, fromCurrent);
                int i11 = b.f28552b[c11.ordinal()];
                if (i11 == 1) {
                    if (z11) {
                        iVar.add(fromSuper);
                    }
                    arrayList.add(fromSuper);
                } else if (i11 == 2) {
                    if (z11) {
                        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                        mVar.b(fromSuper, fromCurrent);
                    }
                    arrayList.add(fromSuper);
                }
            }
            mVar.c(fromCurrent, iVar);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            p predicate = new p(((InterfaceC9836b) linkedHashSet.iterator().next()).d());
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (!((Boolean) predicate.invoke(it3.next())).booleanValue()) {
                        LinkedList linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            InterfaceC9836b a11 = B.a(linkedList);
                            f(i(a11, linkedList, new s(), new t(mVar, a11)), interfaceC9839e, mVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            f(Collections.singleton((InterfaceC9836b) it4.next()), interfaceC9839e, mVar);
        }
    }

    @NotNull
    public final c n(@NotNull InterfaceC9835a interfaceC9835a, @NotNull InterfaceC9835a interfaceC9835a2, InterfaceC9839e interfaceC9839e) {
        if (interfaceC9835a == null) {
            a(19);
            throw null;
        }
        if (interfaceC9835a2 != null) {
            return o(interfaceC9835a, interfaceC9835a2, interfaceC9839e, false);
        }
        a(20);
        throw null;
    }

    @NotNull
    public final c o(@NotNull InterfaceC9835a interfaceC9835a, @NotNull InterfaceC9835a interfaceC9835a2, InterfaceC9839e interfaceC9839e, boolean z11) {
        if (interfaceC9835a == null) {
            a(22);
            throw null;
        }
        if (interfaceC9835a2 == null) {
            a(23);
            throw null;
        }
        c p11 = p(interfaceC9835a, interfaceC9835a2, z11);
        boolean z12 = p11.c() == c.a.OVERRIDABLE;
        List<j> list = f28545d;
        for (j jVar : list) {
            if (jVar.b() != j.a.CONFLICTS_ONLY && (!z12 || jVar.b() != j.a.SUCCESS_ONLY)) {
                int i11 = b.f28551a[jVar.a(interfaceC9835a, interfaceC9835a2, interfaceC9839e).ordinal()];
                if (i11 == 1) {
                    z12 = true;
                } else if (i11 == 2) {
                    return c.d("External condition");
                }
            }
        }
        if (!z12) {
            return p11;
        }
        for (j jVar2 : list) {
            if (jVar2.b() == j.a.CONFLICTS_ONLY) {
                int i12 = b.f28551a[jVar2.a(interfaceC9835a, interfaceC9835a2, interfaceC9839e).ordinal()];
                if (i12 == 1) {
                    throw new IllegalStateException("Contract violation in " + jVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i12 == 2) {
                    return c.d("External condition");
                }
            }
        }
        c e11 = c.e();
        if (e11 != null) {
            return e11;
        }
        a(27);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        r14.remove();
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c p(@NotNull InterfaceC9835a interfaceC9835a, @NotNull InterfaceC9835a interfaceC9835a2, boolean z11) {
        if (interfaceC9835a == null) {
            a(28);
            throw null;
        }
        if (interfaceC9835a2 == null) {
            a(29);
            throw null;
        }
        c k11 = k(interfaceC9835a, interfaceC9835a2);
        if (k11 != null) {
            return k11;
        }
        ArrayList d11 = d(interfaceC9835a);
        ArrayList d12 = d(interfaceC9835a2);
        List<i0> typeParameters = interfaceC9835a.getTypeParameters();
        List<i0> typeParameters2 = interfaceC9835a2.getTypeParameters();
        int i11 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i11 < d11.size()) {
                if (!ke.e.f71486a.c((N) d11.get(i11), (N) d12.get(i11))) {
                    return c.d("Type parameter number mismatch");
                }
                i11++;
            }
            return c.b("Type parameter number mismatch");
        }
        r0 state = g(typeParameters, typeParameters2);
        for (int i12 = 0; i12 < typeParameters.size(); i12++) {
            i0 i0Var = typeParameters.get(i12);
            i0 i0Var2 = typeParameters2.get(i12);
            if (i0Var == null) {
                a(47);
                throw null;
            }
            if (i0Var2 == null) {
                a(48);
                throw null;
            }
            List<N> upperBounds = i0Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(i0Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (N n11 : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (b(n11, (N) listIterator.next(), state)) {
                            break;
                        }
                    }
                }
            }
            return c.d("Type parameter bounds mismatch");
        }
        while (i11 < d11.size()) {
            if (!b((N) d11.get(i11), (N) d12.get(i11), state)) {
                return c.d("Value parameter type mismatch");
            }
            i11++;
        }
        if ((interfaceC9835a instanceof InterfaceC9857w) && (interfaceC9835a2 instanceof InterfaceC9857w) && ((InterfaceC9857w) interfaceC9835a).isSuspend() != ((InterfaceC9857w) interfaceC9835a2).isSuspend()) {
            return c.b("Incompatible suspendability");
        }
        if (z11) {
            N returnType = interfaceC9835a.getReturnType();
            N returnType2 = interfaceC9835a2.getReturnType();
            if (returnType != null && returnType2 != null && (!S.a(returnType2) || !S.a(returnType))) {
                C7382h c7382h = C7382h.f69890a;
                K0 subType = returnType2.K0();
                K0 superType = returnType.K0();
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(subType, "subType");
                Intrinsics.checkNotNullParameter(superType, "superType");
                if (!C7382h.i(c7382h, state, subType, superType)) {
                    return c.b("Return type mismatch");
                }
            }
        }
        c e11 = c.e();
        if (e11 != null) {
            return e11;
        }
        a(37);
        throw null;
    }
}
