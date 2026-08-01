package com.inmobi.media;

import com.ironsource.U3;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class Tf {

    /* renamed from: a, reason: collision with root package name */
    public static final IntRange f6872a = RangesKt.until(408, 600);
    public static final IntRange b = RangesKt.until(300, 500);

    public static final String a(String url, Map map) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (map == null) {
            return url;
        }
        return url + (StringsKt.contains$default((CharSequence) url, (CharSequence) "?", false, 2, (Object) null) ? new StringBuilder(U3.j.c) : new StringBuilder("?")).append(CollectionsKt.joinToString$default(map.entrySet(), U3.j.c, null, null, 0, null, new Function1() { // from class: com.inmobi.media.Tf$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Tf.a((Map.Entry) obj);
            }
        }, 30, null)).toString();
    }

    public static final CharSequence a(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        Charset charset = Charsets.UTF_8;
        return URLEncoder.encode(str, charset.name()) + U3.j.b + URLEncoder.encode(str2, charset.name());
    }
}
