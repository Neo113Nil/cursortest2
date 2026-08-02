package Gf;

import android.content.Context;
import android.os.Process;
import android.text.SpannableStringBuilder;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import java.io.File;

/* loaded from: classes10.dex */
public final class d {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i11, int i12) {
        for (Object obj2 : spannableStringBuilder.getSpans(i11, i12, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i11 && spannableStringBuilder.getSpanEnd(obj2) == i12 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i11, i12, 33);
    }

    public static final void b(File file) {
        File[] listFiles;
        try {
            if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : listFiles) {
                file2.delete();
            }
        } catch (Exception e11) {
            L80.a.b("FileExt", "Error while cleaning directory " + e11);
        }
    }

    public static int c(int i11) {
        return 4 - (i11 % 4);
    }

    public static int d(int i11, String str) {
        int length = str.length();
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt == '\n' || charAt == '\r') {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static boolean e(String str) {
        int length = str.length();
        return j(' ', 0, length, str) != length;
    }

    public static boolean f(int i11, CharSequence charSequence) {
        if (i11 >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i11);
        switch (charAt) {
            case '!':
            case '\"':
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case '&':
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case '(':
            case ')':
            case '*':
            case '+':
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case '.':
            case '/':
                return true;
            default:
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        return true;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean g(int i11, CharSequence charSequence) {
        return Character.isLetter(Character.codePointAt(charSequence, i11));
    }

    public static boolean h(int i11, CharSequence charSequence) {
        if (i11 >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i11);
        return charAt == '\t' || charAt == ' ';
    }

    public static CharSequence i(String str) {
        int length = str.length();
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str, 0, i11);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(charAt);
            }
        }
        return sb2 != null ? sb2.toString() : str;
    }

    public static int j(char c11, int i11, int i12, CharSequence charSequence) {
        while (i11 < i12) {
            if (charSequence.charAt(i11) != c11) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static int k(int i11, int i12, CharSequence charSequence) {
        while (i11 < i12) {
            char charAt = charSequence.charAt(i11);
            if (charAt != '\t' && charAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static boolean l(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
