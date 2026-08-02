package uz.shs.better_player_plus;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.webkit.ProxyConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@UnstableApi
@SourceDebugExtension({"SMAP\nDataSourceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSourceUtils.kt\nuz/shs/better_player_plus/DataSourceUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n221#2,2:56\n*S KotlinDebug\n*F\n+ 1 DataSourceUtils.kt\nuz/shs/better_player_plus/DataSourceUtils\n*L\n37#1:56,2\n*E\n"})
/* loaded from: classes5.dex */
public final class m {
    @JvmStatic
    public static final DefaultHttpDataSource.Factory a(String str, Map map) {
        DefaultHttpDataSource.Factory readTimeoutMs = new DefaultHttpDataSource.Factory().setUserAgent(str).setAllowCrossProtocolRedirects(true).setConnectTimeoutMs(8000).setReadTimeoutMs(8000);
        Intrinsics.checkNotNullExpressionValue(readTimeoutMs, "setReadTimeoutMs(...)");
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            readTimeoutMs.setDefaultRequestProperties((Map<String, String>) linkedHashMap);
        }
        return readTimeoutMs;
    }

    @JvmStatic
    public static final boolean b(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return Intrinsics.areEqual(scheme, ProxyConfig.MATCH_HTTP) || Intrinsics.areEqual(scheme, ProxyConfig.MATCH_HTTPS);
    }
}
