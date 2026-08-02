package fman.ge.smart_auth;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends Throwable {
    public final String a;
    public final String b;
    public final Object c;

    public b(String code, String str, f fVar) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.a = code;
        this.b = str;
        this.c = fVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
