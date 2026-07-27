package com.inmobi.media;

import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3784i4 {
    public static final Object a(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(block.invoke());
        } catch (Error e) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(e));
        } catch (Exception e2) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(e2));
        }
    }

    public static final String a(String url, Map macros) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(macros, "macros");
        String str = url;
        for (Map.Entry entry : macros.entrySet()) {
            str = StringsKt.replace$default(str, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
        }
        return str;
    }
}
