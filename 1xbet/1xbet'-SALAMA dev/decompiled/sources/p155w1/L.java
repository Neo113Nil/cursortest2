package p155w1;

import android.util.Log;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class L {
    public static int a(String str) throws NoSuchFieldException {
        String str2;
        for (int i7 : e.f(2)) {
            if (i7 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i7 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i7;
            }
        }
        throw new NoSuchFieldException(i("No such Brightness: ", str));
    }

    public static int b(String str) throws NoSuchFieldException {
        for (int i7 : e.f(5)) {
            String str2 = null;
            if (i7 != 1) {
                if (i7 == 2) {
                    str2 = "HapticFeedbackType.lightImpact";
                } else if (i7 == 3) {
                    str2 = "HapticFeedbackType.mediumImpact";
                } else if (i7 == 4) {
                    str2 = "HapticFeedbackType.heavyImpact";
                } else {
                    if (i7 != 5) {
                        throw null;
                    }
                    str2 = "HapticFeedbackType.selectionClick";
                }
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i7;
            }
        }
        throw new NoSuchFieldException(i("No such HapticFeedbackType: ", str));
    }

    public static int c(String str) throws NoSuchFieldException {
        String str2;
        for (int i7 : e.f(2)) {
            if (i7 == 1) {
                str2 = "SystemSoundType.click";
            } else {
                if (i7 != 2) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i7;
            }
        }
        throw new NoSuchFieldException(i("No such SoundType: ", str));
    }

    public static final String d(int i7) {
        int i8 = O0.f17487a[e.e(i7)];
        if (i8 == 1) {
            return "POST";
        }
        if (i8 == 2) {
            return "PUT";
        }
        if (i8 == 3) {
            return "DELETE";
        }
        if (i8 == 4) {
            return "HEAD";
        }
        if (i8 != 5) {
            return null;
        }
        return "GET";
    }

    public static /* synthetic */ int e(int i7) {
        if (i7 == 1) {
            return -1;
        }
        if (i7 == 2) {
            return 0;
        }
        if (i7 == 3) {
            return 1;
        }
        throw null;
    }

    public static /* synthetic */ int f(int i7) {
        if (i7 == 1) {
            return -1;
        }
        if (i7 == 2) {
            return 0;
        }
        if (i7 == 3) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ String g(int i7) {
        if (i7 == 1) {
            return "";
        }
        if (i7 == 2) {
            return "AES/CBC/PKCS7Padding";
        }
        if (i7 == 3) {
            return "AES/CBC/PKCS5Padding";
        }
        throw null;
    }

    public static /* synthetic */ int h(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 == 3) {
            return 1;
        }
        if (i7 == 4) {
            return 0;
        }
        throw null;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static void k(int i7, String str, String str2) {
        Log.e(str2, str + i7);
    }

    public static void l(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static void m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        Log.e(str2, sb.toString());
    }

    public static void n(String str, String str2, String str3) {
        Log.e(str3, str + str2);
    }

    public static /* synthetic */ String o(int i7) {
        if (i7 == 1) {
            return "UNKNOWN";
        }
        if (i7 == 2) {
            return "FOREGROUND";
        }
        if (i7 == 3) {
            return "BACKGROUND";
        }
        throw null;
    }

    public static /* synthetic */ String p(int i7) {
        if (i7 == 1) {
            return "INACTIVE";
        }
        if (i7 == 2) {
            return "FOREGROUND_RUNNING";
        }
        if (i7 == 3) {
            return "FOREGROUND_ENDING";
        }
        if (i7 == 4) {
            return "BACKGROUND_RUNNING";
        }
        if (i7 == 5) {
            return "BACKGROUND_ENDING";
        }
        throw null;
    }

    public static /* synthetic */ String q(int i7) {
        if (i7 == 1) {
            return "UNKNOWN";
        }
        if (i7 == 2) {
            return "FOREGROUND";
        }
        if (i7 == 3) {
            return "BACKGROUND";
        }
        throw null;
    }
}
