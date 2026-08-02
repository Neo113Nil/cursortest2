package C6;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f1599a;

    public g(String str) {
        Pattern compile = Pattern.compile(str);
        t6.h.d(compile, "compile(...)");
        this.f1599a = compile;
    }

    public final String toString() {
        String pattern = this.f1599a.toString();
        t6.h.d(pattern, "toString(...)");
        return pattern;
    }
}
