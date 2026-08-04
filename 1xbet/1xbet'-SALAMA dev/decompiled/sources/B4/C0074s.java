package B4;

import W5.AbstractC0486a1;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: B4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0074s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f1190b = Pattern.compile("[~*/\\[\\]]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0074s f1191c = new C0074s(H4.j.f3321b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H4.j f1192a;

    public C0074s(List list) {
        this.f1192a = list.isEmpty() ? H4.j.f3322c : new H4.j(list);
    }

    public static C0074s a(String str) {
        p003a.a.f(str, "Provided field path must not be null.");
        p003a.a.e("Use FieldPath.of() for field names containing '~*/[]'.", !f1190b.matcher(str).find(), new Object[0]);
        try {
            return b(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
    }

    public static C0074s b(String... strArr) {
        p003a.a.e("Invalid field path. Provided path must not be empty.", strArr.length > 0, new Object[0]);
        int i7 = 0;
        while (i7 < strArr.length) {
            String str = strArr[i7];
            boolean z4 = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder("Invalid field name at argument ");
            i7++;
            sb.append(i7);
            sb.append(". Field names must not be null or empty.");
            p003a.a.e(sb.toString(), z4, new Object[0]);
        }
        return new C0074s(Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0074s.class != obj.getClass()) {
            return false;
        }
        return this.f1192a.equals(((C0074s) obj).f1192a);
    }

    public final int hashCode() {
        return this.f1192a.hashCode();
    }

    public final String toString() {
        return this.f1192a.c();
    }

    public C0074s(H4.j jVar) {
        this.f1192a = jVar;
    }
}
