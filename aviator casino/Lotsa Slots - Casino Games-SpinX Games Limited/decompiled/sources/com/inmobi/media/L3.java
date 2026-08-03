package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class L3 {
    public static final java.lang.Object a(kotlin.jvm.functions.Function0 block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(block.invoke());
        } catch (java.lang.Error e) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e));
        } catch (java.lang.Exception e2) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e2));
        }
    }

    public static final java.lang.String a(java.lang.String url, java.util.Map macros) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        java.lang.String str = url;
        for (java.util.Map.Entry entry : macros.entrySet()) {
            str = kotlin.text.StringsKt.replace$default(str, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, (java.lang.Object) null);
        }
        return str;
    }
}
