package B1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int[] _values() {
        return H.j.c(33);
    }

    public static int a(java.lang.String str) {
        java.lang.String str2;
        for (int i2 : H.j.c(2)) {
            if (i2 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i2;
            }
        }
        throw new java.lang.NoSuchFieldException(i("No such Brightness: ", str));
    }

    public static int b(java.lang.String str) {
        for (int i2 : H.j.c(8)) {
            java.lang.String str2 = null;
            switch (i2) {
                case 1:
                    break;
                case 2:
                    str2 = "HapticFeedbackType.lightImpact";
                    break;
                case 3:
                    str2 = "HapticFeedbackType.mediumImpact";
                    break;
                case 4:
                    str2 = "HapticFeedbackType.heavyImpact";
                    break;
                case 5:
                    str2 = "HapticFeedbackType.selectionClick";
                    break;
                case 6:
                    str2 = "HapticFeedbackType.successNotification";
                    break;
                case 7:
                    str2 = "HapticFeedbackType.warningNotification";
                    break;
                case 8:
                    str2 = "HapticFeedbackType.errorNotification";
                    break;
                default:
                    throw null;
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i2;
            }
        }
        throw new java.lang.NoSuchFieldException(i("No such HapticFeedbackType: ", str));
    }

    public static int c(java.lang.String str) {
        java.lang.String str2;
        for (int i2 : H.j.c(3)) {
            if (i2 == 1) {
                str2 = "SystemSoundType.click";
            } else if (i2 == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i2 != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i2;
            }
        }
        throw new java.lang.NoSuchFieldException(i("No such SoundType: ", str));
    }

    public static /* synthetic */ int d(int i2) {
        switch (i2) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                return 262144;
            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                return 524288;
            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                return 16777216;
            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                return 33554432;
            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                return 67108864;
            case 28:
                return 134217728;
            case io.appmetrica.analytics.impl.C0326e9.f5796I /* 29 */:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            case 32:
                return Integer.MIN_VALUE;
            default:
                throw null;
        }
    }

    public static int e(java.lang.String str, int i2, int i3) {
        return (str.hashCode() + i2) * i3;
    }

    public static java.lang.String f(int i2, java.lang.String str) {
        return str + i2;
    }

    public static java.lang.String g(int i2, java.lang.String str, java.lang.String str2) {
        return str + i2 + str2;
    }

    public static java.lang.String h(java.lang.String str, int i2, int i3, java.lang.String str2) {
        return str + i2 + str2 + i3;
    }

    public static java.lang.String i(java.lang.String str, java.lang.String str2) {
        return str + str2;
    }

    public static java.lang.String j(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l(int i2, java.lang.String str) {
        if (i2 == 0) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.String name = kotlin.jvm.internal.i.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            java.lang.StackTraceElement stackTraceElement = stackTrace[i3];
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            kotlin.jvm.internal.i.g(nullPointerException, kotlin.jvm.internal.i.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ void m(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.ClassCastException();
        }
    }

    public static /* synthetic */ void n() {
    }
}
