package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class zzeg {
    private zzeg() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        String replace$default;
        String substringBefore$default;
        replace$default = StringsKt__StringsJVMKt.replace$default("18.6.1", ".", "", false, 4, (Object) null);
        substringBefore$default = StringsKt__StringsKt.substringBefore$default(replace$default, "-", (String) null, 2, (Object) null);
        return Integer.parseInt(substringBefore$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        String substringAfter;
        substringAfter = StringsKt__StringsKt.substringAfter("18.6.1", "-", "");
        return "cesdb".concat(String.valueOf(substringAfter));
    }

    public /* synthetic */ zzeg(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
