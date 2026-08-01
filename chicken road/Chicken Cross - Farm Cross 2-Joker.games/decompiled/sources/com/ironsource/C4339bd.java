package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4339bd {

    /* renamed from: a, reason: collision with root package name */
    private final String f8101a;

    public C4339bd(String baseControllerUrl) {
        Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.f8101a = baseControllerUrl;
    }

    public final String a() {
        String str = this.f8101a;
        String substring = str.substring(0, StringsKt.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
