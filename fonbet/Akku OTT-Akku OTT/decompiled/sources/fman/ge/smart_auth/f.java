package fman.ge.smart_auth;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {
    public static final a Companion = new a();
    public final String a;

    public static final class a {
    }

    public f() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return android.support.v4.media.b.b("SmartAuthRequestCanceled(message=", this.a, ")");
    }

    public f(String str) {
        this.a = str;
    }
}
