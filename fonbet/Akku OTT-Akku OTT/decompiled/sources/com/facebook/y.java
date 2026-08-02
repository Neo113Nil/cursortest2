package com.facebook;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends C0728q {
    public static final a Companion = new a();
    private static final long serialVersionUID = 1;
    public final t b;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t requestError, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        this.b = requestError;
    }

    @Override // com.facebook.C0728q, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        t tVar = this.b;
        sb.append(tVar.a);
        sb.append(", facebookErrorCode: ");
        sb.append(tVar.b);
        sb.append(", facebookErrorType: ");
        sb.append(tVar.d);
        sb.append(", message: ");
        sb.append(tVar.h());
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb2;
    }
}
