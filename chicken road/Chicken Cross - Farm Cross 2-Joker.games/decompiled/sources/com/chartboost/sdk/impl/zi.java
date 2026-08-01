package com.chartboost.sdk.impl;

import androidx.webkit.ProxyConfig;
import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public abstract class zi {
    public static final boolean c(String str) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null);
        if (indexOf$default <= 0) {
            return false;
        }
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, FileSystemKt.UnixPathSeparator, 0, false, 6, (Object) null);
        if ((indexOf$default2 >= 0 && indexOf$default2 < indexOf$default) || !Character.isLetter(str.charAt(0))) {
            return false;
        }
        String substring = str.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        for (int i = 0; i < substring.length(); i++) {
            char charAt = substring.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '+' && charAt != '-' && charAt != '.') {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(String str) {
        return b(str, ProxyConfig.MATCH_HTTP) || b(str, "https");
    }

    public static final boolean b(String str, String str2) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ServerSentEventKt.COLON, 0, false, 6, (Object) null);
        if (indexOf$default <= 0) {
            return false;
        }
        String substring = str.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return StringsKt.equals(substring, str2, true);
    }
}
