package o4;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: o4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2226d implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Pattern f18666k;

    public C2226d(Pattern pattern) {
        this.f18666k = pattern;
    }

    public final String toString() {
        String pattern = this.f18666k.toString();
        kotlin.jvm.internal.l.e("toString(...)", pattern);
        return pattern;
    }

    public C2226d(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.l.e("compile(...)", compile);
        this.f18666k = compile;
    }
}
