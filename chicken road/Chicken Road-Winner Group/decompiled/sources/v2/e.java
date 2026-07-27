package v2;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f10430a;

    public e() {
        Pattern compile = Pattern.compile("^.+:.+/");
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        this.f10430a = compile;
    }

    public final String toString() {
        String pattern = this.f10430a.toString();
        kotlin.jvm.internal.j.d(pattern, "toString(...)");
        return pattern;
    }
}
