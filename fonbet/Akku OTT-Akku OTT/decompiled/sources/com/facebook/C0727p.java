package com.facebook;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0727p extends C0728q {
    public static final a Companion = new a();
    public static final long serialVersionUID = 1;
    public final int b;
    public final String c;

    /* renamed from: com.facebook.p$a */
    public static final class a {
    }

    public C0727p(String str, int i, String str2) {
        super(str);
        this.b = i;
        this.c = str2;
    }

    @Override // com.facebook.C0728q, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.b + ", message: " + getMessage() + ", url: " + this.c + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
