package com.github.droibit.flutter.plugins.customtabs.core.options;

import android.graphics.Color;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d {
    public final Integer a;
    public final CustomTabColorSchemeParams b;
    public final CustomTabColorSchemeParams c;
    public final CustomTabColorSchemeParams d;

    public static final class a {
        public static CustomTabColorSchemeParams a(Map map) {
            if (map == null) {
                return null;
            }
            CustomTabColorSchemeParams.Builder builder = new CustomTabColorSchemeParams.Builder();
            String str = (String) map.get("toolbarColor");
            if (str != null) {
                builder.setToolbarColor(Color.parseColor(str));
            }
            String str2 = (String) map.get("navigationBarColor");
            if (str2 != null) {
                builder.setNavigationBarColor(Color.parseColor(str2));
            }
            String str3 = (String) map.get("navigationBarDividerColor");
            if (str3 != null) {
                builder.setNavigationBarDividerColor(Color.parseColor(str3));
            }
            return builder.build();
        }
    }

    public d(Integer num, CustomTabColorSchemeParams customTabColorSchemeParams, CustomTabColorSchemeParams customTabColorSchemeParams2, CustomTabColorSchemeParams customTabColorSchemeParams3) {
        this.a = num;
        this.b = customTabColorSchemeParams;
        this.c = customTabColorSchemeParams2;
        this.d = customTabColorSchemeParams3;
    }
}
