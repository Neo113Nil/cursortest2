package B0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static int a(String str) {
        String str2;
        for (int i2 : O.j.c(2)) {
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
        throw new NoSuchFieldException(i("No such Brightness: ", str));
    }

    public static int b(String str) {
        for (int i2 : O.j.c(8)) {
            String str2 = null;
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
        throw new NoSuchFieldException(i("No such HapticFeedbackType: ", str));
    }

    public static int c(String str) {
        String str2;
        for (int i2 : O.j.c(3)) {
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
        throw new NoSuchFieldException(i("No such SoundType: ", str));
    }

    public static /* synthetic */ String d(int i2) {
        if (i2 == 1) {
            return "otel.sdk.exporter.span";
        }
        if (i2 == 2) {
            return "otel.sdk.exporter.metric_data_point";
        }
        if (i2 == 3) {
            return "otel.sdk.exporter.log";
        }
        if (i2 == 4) {
            return "TBD";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i2) {
        if (i2 == 1) {
            return "span";
        }
        if (i2 == 2) {
            return "data_point";
        }
        if (i2 == 3) {
            return "log_record";
        }
        if (i2 == 4) {
            return "TBD";
        }
        throw null;
    }

    public static int f(String str, int i2, int i3) {
        return (str.hashCode() + i2) * i3;
    }

    public static String g(int i2, String str, String str2) {
        return str + i2 + str2;
    }

    public static String h(String str, int i2, int i3, String str2) {
        return str + i2 + str2 + i3;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, char c2) {
        return str + str2 + c2;
    }

    public static String k(StringBuilder sb, int i2, char c2) {
        sb.append(i2);
        sb.append(c2);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, char c2) {
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    public static HashMap m(Class cls, U1.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map n(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ String o(int i2) {
        return i2 != 1 ? i2 != 2 ? "null" : "LATEST" : "LEGACY";
    }
}
