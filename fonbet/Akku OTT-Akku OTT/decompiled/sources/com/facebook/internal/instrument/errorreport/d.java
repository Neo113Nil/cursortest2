package com.facebook.internal.instrument.errorreport;

import androidx.credentials.provider.p;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new Regex(p.a(new Object[]{"error_log_"}, 1, "^%s[0-9]+.json$", "format(format, *args)")).matches(name);
    }
}
