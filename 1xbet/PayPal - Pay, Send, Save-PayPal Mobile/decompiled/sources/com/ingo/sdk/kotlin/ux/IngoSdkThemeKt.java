package com.ingo.sdk.kotlin.ux;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "primaryColor", "secondaryColor", "tertiaryColor", "backgroundColor", "secondaryBackgroundColor", "primaryInverseTextColor", "alertColor", "errorColor", "Lcom/ingo/sdk/kotlin/ux/IngoSdkColorTheme;", "ingoSdkDefaultDarkColorTheme", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/ux/IngoSdkColorTheme;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IngoSdkThemeKt {
    public static /* synthetic */ com.ingo.sdk.kotlin.ux.IngoSdkColorTheme ingoSdkDefaultDarkColorTheme$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "#FFFFFF";
        }
        if ((i & 2) != 0) {
            str2 = "#149841";
        }
        java.lang.String str9 = str2;
        if ((i & 4) != 0) {
            str3 = "#cccccc";
        }
        java.lang.String str10 = str3;
        java.lang.String str11 = (i & 8) != 0 ? "#1C1C1E" : str4;
        if ((i & 16) != 0) {
            str5 = "#2C2C2E";
        }
        java.lang.String str12 = str5;
        java.lang.String str13 = (i & 32) != 0 ? "#1C1C1E" : str6;
        if ((i & 64) != 0) {
            str7 = "#f1ae1d";
        }
        java.lang.String str14 = str7;
        if ((i & 128) != 0) {
            str8 = "#FF0000";
        }
        return ingoSdkDefaultDarkColorTheme(str, str9, str10, str11, str12, str13, str14, str8);
    }

    public static final com.ingo.sdk.kotlin.ux.IngoSdkColorTheme ingoSdkDefaultDarkColorTheme(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        return new com.ingo.sdk.kotlin.ux.IngoSdkColorTheme(str, str2, str3, str4, str5, str6, str7, str8);
    }
}
