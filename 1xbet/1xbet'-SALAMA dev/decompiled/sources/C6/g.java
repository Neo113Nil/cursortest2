package C6;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f1599a;

    public g(String str) {
        Pattern patternCompile = Pattern.compile(str);
        t6.h.d(patternCompile, "compile(...)");
        this.f1599a = patternCompile;
    }

    public final String toString() {
        String string = this.f1599a.toString();
        t6.h.d(string, "toString(...)");
        return string;
    }
}
