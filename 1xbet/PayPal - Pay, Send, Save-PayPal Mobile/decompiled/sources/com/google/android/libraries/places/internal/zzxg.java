package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzxg {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.common.escape.Escaper zzb = com.google.common.escape.Escapers.builder().addEscape('\"', "&quot;").addEscape('\'', "&#39;").addEscape(kotlin.text.Typography.amp, "&amp;").addEscape(kotlin.text.Typography.less, "&lt;").addEscape(kotlin.text.Typography.greater, "&gt;").build();

    static java.lang.String zza(java.lang.String str) {
        return zzb.escape(str);
    }
}
