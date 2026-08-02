package io.sentry.flutter;

import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import f6.C1116i;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.net.Proxy;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class SentryFlutter$updateOptions$27 extends i implements Function1 {
    final /* synthetic */ SentryAndroidOptions $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentryFlutter$updateOptions$27(SentryAndroidOptions sentryAndroidOptions) {
        super(1);
        this.$options = sentryAndroidOptions;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, ? extends Object>) obj);
        return C1116i.f13008a;
    }

    public final void invoke(Map<String, ? extends Object> map) {
        Proxy.Type type;
        h.e(map, "proxyJson");
        SentryAndroidOptions sentryAndroidOptions = this.$options;
        SentryOptions.Proxy proxy = new SentryOptions.Proxy();
        Object obj = map.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        proxy.setHost(obj instanceof String ? (String) obj : null);
        Object obj2 = map.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT);
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        proxy.setPort(num != null ? String.valueOf(num.intValue()) : null);
        Object obj3 = map.get("type");
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str != null) {
            try {
                Locale locale = Locale.ROOT;
                h.d(locale, "ROOT");
                String upperCase = str.toUpperCase(locale);
                h.d(upperCase, "toUpperCase(...)");
                type = Proxy.Type.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                Log.w("Sentry", "Could not parse `type` from proxy json: " + map);
                type = null;
            }
            proxy.setType(type);
        }
        Object obj4 = map.get(SentryBaseEvent.JsonKeys.USER);
        proxy.setUser(obj4 instanceof String ? (String) obj4 : null);
        Object obj5 = map.get("pass");
        proxy.setPass(obj5 instanceof String ? (String) obj5 : null);
        sentryAndroidOptions.setProxy(proxy);
    }
}
