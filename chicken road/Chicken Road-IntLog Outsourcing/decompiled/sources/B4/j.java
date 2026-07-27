package B4;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f314a;

    public j(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        this.f314a = compile;
    }

    public final i a(int i2, String input) {
        kotlin.jvm.internal.i.e(input, "input");
        Matcher region = this.f314a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i2, input.length());
        if (region.lookingAt()) {
            return new i(region, input);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.f314a.toString();
        kotlin.jvm.internal.i.d(pattern, "toString(...)");
        return pattern;
    }
}
