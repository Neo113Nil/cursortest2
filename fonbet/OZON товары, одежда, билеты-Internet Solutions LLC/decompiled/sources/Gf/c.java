package Gf;

import androidx.activity.ActivityC5043j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.functions.Function0;

/* loaded from: classes10.dex */
public final class c {
    public static final int a(LogRecord logRecord) {
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    public static final boolean b(ActivityC5043j activityC5043j, Set set, Function0 function0) {
        if (function0 == null) {
            return false;
        }
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (androidx.core.app.b.h(activityC5043j, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i11, CharSequence charSequence) {
        char charAt;
        if (i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i11) == '<') {
            while (true) {
                i11++;
                if (i11 >= charSequence.length() || (charAt = charSequence.charAt(i11)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt == '>') {
                    return i11 + 1;
                }
                if (charAt == '\\') {
                    int i12 = i11 + 1;
                    if (d.f(i12, charSequence)) {
                        i11 = i12;
                    }
                }
            }
            return -1;
        }
        int i13 = 0;
        int i14 = i11;
        while (i14 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i14);
            if (charAt2 == 0 || charAt2 == ' ') {
                if (i14 != i11) {
                    return i14;
                }
                return -1;
            }
            if (charAt2 == '\\') {
                int i15 = i14 + 1;
                if (d.f(i15, charSequence)) {
                    i14 = i15;
                }
            } else if (charAt2 == '(') {
                i13++;
                if (i13 > 32) {
                    return -1;
                }
            } else if (charAt2 != ')') {
                if (Character.isISOControl(charAt2)) {
                    if (i14 != i11) {
                    }
                }
            } else {
                if (i13 == 0) {
                    return i14;
                }
                i13--;
            }
            i14++;
        }
        return charSequence.length();
    }

    public static int d(int i11, CharSequence charSequence) {
        while (i11 < charSequence.length()) {
            switch (charSequence.charAt(i11)) {
                case '[':
                    return -1;
                case '\\':
                    int i12 = i11 + 1;
                    if (!d.f(i12, charSequence)) {
                        break;
                    } else {
                        i11 = i12;
                        break;
                    }
                case ']':
                    return i11;
            }
            i11++;
        }
        return charSequence.length();
    }

    public static int e(int i11, CharSequence charSequence) {
        if (i11 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i11);
        char c11 = '\"';
        if (charAt != '\"') {
            c11 = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c11 = ')';
            }
        }
        int f7 = f(charSequence, i11 + 1, c11);
        if (f7 != -1 && f7 < charSequence.length() && charSequence.charAt(f7) == c11) {
            return f7 + 1;
        }
        return -1;
    }

    public static int f(CharSequence charSequence, int i11, char c11) {
        while (i11 < charSequence.length()) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '\\') {
                int i12 = i11 + 1;
                if (d.f(i12, charSequence)) {
                    i11 = i12;
                    i11++;
                }
            }
            if (charAt == c11) {
                return i11;
            }
            if (c11 == ')' && charAt == '(') {
                return -1;
            }
            i11++;
        }
        return charSequence.length();
    }
}
