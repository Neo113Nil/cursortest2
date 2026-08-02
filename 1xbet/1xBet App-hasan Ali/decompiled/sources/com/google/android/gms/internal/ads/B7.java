package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class B7 extends IOException {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7768k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7769l;

    public B7(String str, RuntimeException runtimeException, boolean z3, int i) {
        super(str, runtimeException);
        this.f7768k = z3;
        this.f7769l = i;
    }

    public static B7 a(RuntimeException runtimeException, String str) {
        return new B7(str, runtimeException, true, 1);
    }

    public static B7 b(String str) {
        return new B7(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message);
        sb.append(" {contentIsMalformed=");
        sb.append(this.f7768k);
        sb.append(", dataType=");
        return L1.a.o(sb, this.f7769l, "}");
    }
}
