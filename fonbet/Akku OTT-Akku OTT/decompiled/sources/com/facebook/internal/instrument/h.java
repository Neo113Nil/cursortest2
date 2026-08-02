package com.facebook.internal.instrument;

import androidx.credentials.provider.p;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new Regex(p.a(new Object[]{"anr_log_"}, 1, "^%s[0-9]+.json$", "format(format, *args)")).matches(name);
    }
}
