package com.facebook;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends C0728q {
    public final E b;

    public r(E e, String str) {
        super(str);
        this.b = e;
    }

    @Override // com.facebook.C0728q, java.lang.Throwable
    public final String toString() {
        E e = this.b;
        t tVar = e != null ? e.c : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (tVar != null) {
            sb.append("httpResponseCode: ");
            sb.append(tVar.a);
            sb.append(", facebookErrorCode: ");
            sb.append(tVar.b);
            sb.append(", facebookErrorType: ");
            sb.append(tVar.d);
            sb.append(", message: ");
            sb.append(tVar.h());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
