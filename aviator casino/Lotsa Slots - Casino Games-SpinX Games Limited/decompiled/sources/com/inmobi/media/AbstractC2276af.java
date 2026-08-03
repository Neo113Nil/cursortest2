package com.inmobi.media;

/* renamed from: com.inmobi.media.af, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2276af {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.ranges.IntRange f5103a = kotlin.ranges.RangesKt.until(com.ironsource.InterfaceC3141l1.a.b.h, 600);
    public static final kotlin.ranges.IntRange b = kotlin.ranges.RangesKt.until(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, 500);

    public static final java.lang.String a(java.lang.String url, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (map == null) {
            return url;
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(map.entrySet(), com.ironsource.X3.j.c, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.af$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.AbstractC2276af.a((java.util.Map.Entry) obj);
            }
        }, 30, null);
        java.lang.StringBuilder sb = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) url, (java.lang.CharSequence) "?", false, 2, (java.lang.Object) null) ? new java.lang.StringBuilder(com.ironsource.X3.j.c) : new java.lang.StringBuilder("?");
        sb.append(joinToString$default);
        return url + sb.toString();
    }

    public static final java.lang.CharSequence a(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "<destruct>");
        java.lang.String str = (java.lang.String) entry.getKey();
        java.lang.String str2 = (java.lang.String) entry.getValue();
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        return java.net.URLEncoder.encode(str, charset.name()) + com.ironsource.X3.j.b + java.net.URLEncoder.encode(str2, charset.name());
    }
}
