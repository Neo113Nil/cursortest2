package H4;

import W5.AbstractC0486a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class j extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final j f3321b = new j(Collections.singletonList("__name__"));

    /* renamed from: c, reason: collision with root package name */
    public static final j f3322c = new j(Collections.emptyList());

    public static j y(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        boolean z4 = false;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt == '\\') {
                i7++;
                if (i7 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i7));
            } else if (charAt == '.') {
                if (z4) {
                    sb.append(charAt);
                } else {
                    String sb2 = sb.toString();
                    if (sb2.isEmpty()) {
                        throw new IllegalArgumentException(AbstractC0486a1.h("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                    StringBuilder sb3 = new StringBuilder();
                    arrayList.add(sb2);
                    sb = sb3;
                }
            } else if (charAt == '`') {
                z4 = !z4;
            } else {
                sb.append(charAt);
            }
            i7++;
        }
        String sb4 = sb.toString();
        if (sb4.isEmpty()) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
        arrayList.add(sb4);
        return new j(arrayList);
    }

    @Override // H4.e
    public final String c() {
        char charAt;
        int i7;
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (true) {
            List list = this.f3312a;
            if (i8 >= list.size()) {
                return sb.toString();
            }
            if (i8 > 0) {
                sb.append(".");
            }
            String replace = ((String) list.get(i8)).replace("\\", "\\\\").replace("`", "\\`");
            if (!replace.isEmpty() && ((charAt = replace.charAt(0)) == '_' || ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')))) {
                while (i7 < replace.length()) {
                    char charAt2 = replace.charAt(i7);
                    i7 = (charAt2 == '_' || (charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= '0' && charAt2 <= '9'))) ? i7 + 1 : 1;
                }
                sb.append(replace);
                i8++;
            }
            replace = "`" + replace + '`';
            sb.append(replace);
            i8++;
        }
    }

    @Override // H4.e
    public final e f(List list) {
        return new j(list);
    }
}
