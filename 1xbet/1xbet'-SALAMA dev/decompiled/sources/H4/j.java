package H4;

import W5.AbstractC0486a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f3321b = new j(Collections.singletonList("__name__"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f3322c = new j(Collections.emptyList());

    public static j y(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        boolean z4 = false;
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '\\') {
                i7++;
                if (i7 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i7));
            } else if (cCharAt == '.') {
                if (z4) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException(AbstractC0486a1.h("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z4 = !z4;
            } else {
                sb.append(cCharAt);
            }
            i7++;
        }
        String string2 = sb.toString();
        if (string2.isEmpty()) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
        arrayList.add(string2);
        return new j(arrayList);
    }

    @Override // H4.e
    public final String c() {
        char cCharAt;
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        while (true) {
            List list = this.f3312a;
            if (i7 >= list.size()) {
                return sb.toString();
            }
            if (i7 > 0) {
                sb.append(".");
            }
            String strReplace = ((String) list.get(i7)).replace("\\", "\\\\").replace("`", "\\`");
            if (strReplace.isEmpty() || ((cCharAt = strReplace.charAt(0)) != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')))) {
                strReplace = "`" + strReplace + '`';
                break;
                break;
            }
            for (int i8 = 1; i8 < strReplace.length(); i8++) {
                char cCharAt2 = strReplace.charAt(i8);
                if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                    strReplace = "`" + strReplace + '`';
                    break;
                }
            }
            sb.append(strReplace);
            i7++;
        }
    }

    @Override // H4.e
    public final e f(List list) {
        return new j(list);
    }
}
