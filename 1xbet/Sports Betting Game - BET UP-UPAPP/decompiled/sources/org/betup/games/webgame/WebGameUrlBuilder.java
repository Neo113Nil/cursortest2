package org.betup.games.webgame;

import android.net.Uri;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WebGameUrlBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\f\u0010\t\u001a\u00020\n*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lorg/betup/games/webgame/WebGameUrlBuilder;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "buildPlayUrl", "", "gameUrl", "gameSessionCode", "lang", "normalizeForAndroidEmulator", "Landroid/net/Uri;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebGameUrlBuilder {
    public static final int $stable = 0;
    public static final WebGameUrlBuilder INSTANCE = new WebGameUrlBuilder();

    private WebGameUrlBuilder() {
    }

    public final String buildPlayUrl(String gameUrl, String gameSessionCode, String lang) {
        Intrinsics.checkNotNullParameter(gameUrl, "gameUrl");
        Intrinsics.checkNotNullParameter(gameSessionCode, "gameSessionCode");
        Uri parse = Uri.parse(gameUrl);
        Intrinsics.checkNotNull(parse);
        Uri.Builder buildUpon = normalizeForAndroidEmulator(parse).buildUpon();
        buildUpon.appendQueryParameter("gameSessionCode", gameSessionCode);
        buildUpon.appendQueryParameter("platform", "android");
        String str = lang;
        if (str != null && !StringsKt.isBlank(str)) {
            buildUpon.appendQueryParameter("lang", lang);
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final Uri normalizeForAndroidEmulator(Uri uri) {
        String str;
        String str2;
        String host = uri.getHost();
        if (host != null) {
            str = host.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (!Intrinsics.areEqual(str, "localhost") && !Intrinsics.areEqual(str, "127.0.0.1")) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (uri.getPort() != -1) {
            str2 = "10.0.2.2:" + uri.getPort();
        } else {
            str2 = "10.0.2.2";
        }
        Uri build = buildUpon.encodedAuthority(str2).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
