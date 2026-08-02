package y4;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f21370d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f21371e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f21372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21373b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f21374c;

    public q(String str, String str2, String[] strArr) {
        this.f21372a = str;
        this.f21373b = str2;
        this.f21374c = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && kotlin.jvm.internal.l.a(((q) obj).f21372a, this.f21372a);
    }

    public final int hashCode() {
        return this.f21372a.hashCode();
    }

    public final String toString() {
        return this.f21372a;
    }
}
