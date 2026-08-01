package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: CookieUtils.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class CookieUtilsKt$tryParseTime$3 implements Function1<Character, Boolean> {
    public static final CookieUtilsKt$tryParseTime$3 INSTANCE = new CookieUtilsKt$tryParseTime$3();

    public final Boolean invoke(char c) {
        return Boolean.valueOf(c == ':');
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
        return invoke(ch.charValue());
    }
}
