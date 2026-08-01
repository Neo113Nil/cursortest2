package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class ig {
    public final String a(File htmlFile, String params, String adm) {
        Intrinsics.checkNotNullParameter(htmlFile, "htmlFile");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(adm, "adm");
        try {
            return StringsKt.replace$default(StringsKt.replace$default(FilesKt.readText(htmlFile, Charsets.UTF_8), "\"{% params %}\"", params, false, 4, (Object) null), "{% adm %}", adm, false, 4, (Object) null);
        } catch (Exception e) {
            mb.b("Parse sdk bidding template exception", e);
            return null;
        }
    }
}
