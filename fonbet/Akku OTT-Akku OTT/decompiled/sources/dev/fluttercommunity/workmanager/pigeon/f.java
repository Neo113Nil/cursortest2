package dev.fluttercommunity.workmanager.pigeon;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends Throwable {
    public final String a;
    public final String b;
    public final Object c;

    public f(String code, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.a = code;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
