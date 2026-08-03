package com.ironsource;

/* renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2992cd {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6190a;

    public C2992cd(java.lang.String baseControllerUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.f6190a = baseControllerUrl;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f6190a;
        java.lang.String substring = str.substring(0, kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, 0, false, 6, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
