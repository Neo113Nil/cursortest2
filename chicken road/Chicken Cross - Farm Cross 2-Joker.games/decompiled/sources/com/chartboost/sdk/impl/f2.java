package com.chartboost.sdk.impl;

import android.util.Base64;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public class f2 {
    public final String a(String str) {
        String replace$default = StringsKt.replace$default(str, "\n", "", false, 4, (Object) null);
        int length = replace$default.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) replace$default.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return replace$default.subSequence(i, length + 1).toString();
    }

    public String b(String encodedString) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(encodedString, "encodedString");
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] decode = Base64.decode(a(encodedString), 2);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            m8079constructorimpl = Result.m8079constructorimpl(new String(decode, Charsets.UTF_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot decode base64 string: " + m8082exceptionOrNullimpl.getLocalizedMessage(), (Throwable) null, 2, (Object) null);
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = "";
        }
        return (String) m8079constructorimpl;
    }

    public String c(String originalString) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bytes = originalString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String encodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
            m8079constructorimpl = Result.m8079constructorimpl(a(encodeToString));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot encode to base64 string: " + m8082exceptionOrNullimpl.getLocalizedMessage(), (Throwable) null, 2, (Object) null);
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = "";
        }
        return (String) m8079constructorimpl;
    }
}
