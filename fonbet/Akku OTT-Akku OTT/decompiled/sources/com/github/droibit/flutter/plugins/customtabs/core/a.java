package com.github.droibit.flutter.plugins.customtabs.core;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.github.droibit.flutter.plugins.customtabs.core.options.d;
import com.github.droibit.flutter.plugins.customtabs.core.options.g;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCustomTabsIntentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomTabsIntentFactory.kt\ncom/github/droibit/flutter/plugins/customtabs/core/CustomTabsIntentFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    public final e a;

    public a() {
        e resources = new e();
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.a = resources;
    }

    public static com.github.droibit.flutter.plugins.customtabs.core.options.e b(Map map) {
        Integer valueOf;
        CustomTabColorSchemeParams a;
        CustomTabColorSchemeParams a2;
        CustomTabColorSchemeParams a3;
        String str;
        Integer valueOf2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        Boolean bool2;
        Set set;
        Map map2;
        Double d;
        Integer valueOf3;
        Boolean bool3;
        Double d2;
        Double d3;
        Boolean bool4;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (map == null) {
            return null;
        }
        Map map3 = (Map) map.get("colorSchemes");
        if (map3 == null) {
            a3 = null;
            valueOf = null;
            a = null;
            a2 = null;
        } else {
            Long l = (Long) map3.get("colorScheme");
            valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
            a = d.a.a((Map) map3.get("lightParams"));
            a2 = d.a.a((Map) map3.get("darkParams"));
            a3 = d.a.a((Map) map3.get("defaultParams"));
        }
        com.github.droibit.flutter.plugins.customtabs.core.options.d dVar = new com.github.droibit.flutter.plugins.customtabs.core.options.d(valueOf, a, a2, a3);
        Boolean bool5 = (Boolean) map.get("urlBarHidingEnabled");
        Long l2 = (Long) map.get("shareState");
        Integer valueOf4 = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
        Boolean bool6 = (Boolean) map.get("showTitle");
        Boolean bool7 = (Boolean) map.get("instantAppsEnabled");
        Boolean bool8 = (Boolean) map.get("bookmarksButtonEnabled");
        Boolean bool9 = (Boolean) map.get("downloadButtonEnabled");
        Boolean bool10 = (Boolean) map.get("shareIdentityEnabled");
        Map map4 = (Map) map.get("closeButton");
        if (map4 == null) {
            valueOf2 = null;
            str = null;
        } else {
            str = (String) map4.get("icon");
            Long l3 = (Long) map4.get("position");
            valueOf2 = l3 != null ? Integer.valueOf((int) l3.longValue()) : null;
        }
        com.github.droibit.flutter.plugins.customtabs.core.options.c cVar = new com.github.droibit.flutter.plugins.customtabs.core.options.c(valueOf2, str);
        Map map5 = (Map) map.get("animations");
        if (map5 == null) {
            str5 = null;
            str2 = null;
            str3 = null;
            str4 = null;
        } else {
            str2 = (String) map5.get("startEnter");
            str3 = (String) map5.get("startExit");
            str4 = (String) map5.get("endEnter");
            str5 = (String) map5.get("endExit");
        }
        com.github.droibit.flutter.plugins.customtabs.core.options.b bVar = new com.github.droibit.flutter.plugins.customtabs.core.options.b(str2, str3, str4, str5);
        Map map6 = (Map) map.get("browser");
        if (map6 == null) {
            bool = null;
            bool2 = null;
            set = null;
            map2 = null;
            str6 = null;
        } else {
            Boolean bool11 = (Boolean) map6.get("prefersExternalBrowser");
            Boolean bool12 = (Boolean) map6.get("prefersDefaultBrowser");
            List list = (List) map6.get("fallbackCustomTabs");
            Set set2 = list != null ? CollectionsKt.toSet(list) : null;
            Map map7 = (Map) map6.get("headers");
            str6 = (String) map6.get("sessionPackageName");
            bool = bool11;
            bool2 = bool12;
            set = set2;
            map2 = map7;
        }
        com.github.droibit.flutter.plugins.customtabs.core.options.a aVar = new com.github.droibit.flutter.plugins.customtabs.core.options.a(bool, bool2, set, map2, str6);
        Map map8 = (Map) map.get("partial");
        if (map8 == null) {
            d = null;
            num = null;
            d2 = null;
            d3 = null;
            bool4 = null;
            num2 = null;
            num3 = null;
            num4 = null;
            valueOf3 = null;
            bool3 = null;
        } else {
            Double d4 = (Double) map8.get("initialHeight");
            Long l4 = (Long) map8.get("activityHeightResizeBehavior");
            Integer valueOf5 = l4 != null ? Integer.valueOf((int) l4.longValue()) : null;
            Double d5 = (Double) map8.get("initialWidth");
            Double d6 = (Double) map8.get("activitySideSheetBreakpoint");
            Boolean bool13 = (Boolean) map8.get("activitySideSheetMaximizationEnabled");
            Long l5 = (Long) map8.get("activitySideSheetPosition");
            Integer num5 = valueOf5;
            Integer valueOf6 = l5 != null ? Integer.valueOf((int) l5.longValue()) : null;
            Long l6 = (Long) map8.get("activitySideSheetDecorationType");
            Integer num6 = valueOf6;
            Integer valueOf7 = l6 != null ? Integer.valueOf((int) l6.longValue()) : null;
            Long l7 = (Long) map8.get("activitySideSheetRoundedCornersPosition");
            Integer num7 = valueOf7;
            Integer valueOf8 = l7 != null ? Integer.valueOf((int) l7.longValue()) : null;
            Boolean bool14 = (Boolean) map8.get("backgroundInteractionEnabled");
            Integer num8 = valueOf8;
            Long l8 = (Long) map8.get("cornerRadius");
            d = d4;
            valueOf3 = l8 != null ? Integer.valueOf((int) l8.longValue()) : null;
            bool3 = bool14;
            d2 = d5;
            d3 = d6;
            bool4 = bool13;
            num = num5;
            num2 = num6;
            num3 = num7;
            num4 = num8;
        }
        return new com.github.droibit.flutter.plugins.customtabs.core.options.e(dVar, bool5, valueOf4, bool6, bool7, bool8, bool9, bool10, cVar, bVar, aVar, new g(d, num, d2, d3, bool4, num2, num3, num4, valueOf3, bool3));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CustomTabsIntent a(Context context, com.github.droibit.flutter.plugins.customtabs.core.options.e options, com.github.droibit.flutter.plugins.customtabs.core.session.b sessionProvider) {
        CustomTabsSession customTabsSession;
        CustomTabsIntent.Builder builder;
        Integer num;
        CustomTabColorSchemeParams customTabColorSchemeParams;
        CustomTabColorSchemeParams customTabColorSchemeParams2;
        CustomTabColorSchemeParams customTabColorSchemeParams3;
        Boolean bool;
        Integer num2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        String str;
        Integer num3;
        int identifier;
        int identifier2;
        int identifier3;
        int identifier4;
        Double d;
        Double d2;
        Double d3;
        Boolean bool7;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Boolean bool8;
        Intent intent;
        Map<String, String> map;
        Drawable drawable;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        com.github.droibit.flutter.plugins.customtabs.core.options.a options2 = options.k;
        String str2 = options2.e;
        if (str2 != null) {
            com.github.droibit.flutter.plugins.customtabs.core.session.a aVar = (com.github.droibit.flutter.plugins.customtabs.core.session.a) sessionProvider.a.get(str2);
            if (aVar != null) {
                customTabsSession = aVar.c;
                builder = new CustomTabsIntent.Builder(customTabsSession);
                com.github.droibit.flutter.plugins.customtabs.core.options.d colorSchemes = options.a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(colorSchemes, "colorSchemes");
                num = colorSchemes.a;
                if (num != null) {
                    builder.setColorScheme(num.intValue());
                }
                customTabColorSchemeParams = colorSchemes.b;
                if (customTabColorSchemeParams != null) {
                    builder.setColorSchemeParams(1, customTabColorSchemeParams);
                }
                customTabColorSchemeParams2 = colorSchemes.c;
                if (customTabColorSchemeParams2 != null) {
                    builder.setColorSchemeParams(2, customTabColorSchemeParams2);
                }
                customTabColorSchemeParams3 = colorSchemes.d;
                if (customTabColorSchemeParams3 != null) {
                    builder.setDefaultColorSchemeParams(customTabColorSchemeParams3);
                }
                bool = options.b;
                if (bool != null) {
                    builder.setUrlBarHidingEnabled(bool.booleanValue());
                }
                num2 = options.c;
                if (num2 != null) {
                    builder.setShareState(num2.intValue());
                }
                bool2 = options.d;
                if (bool2 != null) {
                    builder.setShowTitle(bool2.booleanValue());
                }
                bool3 = options.e;
                if (bool3 != null) {
                    builder.setInstantAppsEnabled(bool3.booleanValue());
                }
                bool4 = options.f;
                if (bool4 != null) {
                    builder.setBookmarksButtonEnabled(bool4.booleanValue());
                }
                bool5 = options.g;
                if (bool5 != null) {
                    builder.setDownloadButtonEnabled(bool5.booleanValue());
                }
                bool6 = options.h;
                if (bool6 != null) {
                    builder.setShareIdentityEnabled(bool6.booleanValue());
                }
                com.github.droibit.flutter.plugins.customtabs.core.options.c closeButton = options.i;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(closeButton, "closeButton");
                str = closeButton.a;
                e eVar = this.a;
                if (str != null) {
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    Resources resources = context.getResources();
                    int identifier5 = e.a.containsMatchIn(str) ? resources.getIdentifier(str, null, null) : resources.getIdentifier(str, "drawable", context.getPackageName());
                    Bitmap bitmap$default = (identifier5 == 0 || (drawable = ContextCompat.getDrawable(context, identifier5)) == null) ? null : DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null);
                    if (bitmap$default != null) {
                        builder.setCloseButtonIcon(bitmap$default);
                    }
                }
                num3 = closeButton.b;
                if (num3 != null) {
                    builder.setCloseButtonPosition(num3.intValue());
                }
                com.github.droibit.flutter.plugins.customtabs.core.options.b animations = options.j;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(animations, "animations");
                String str3 = animations.a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Resources resources2 = context.getResources();
                identifier = str3 != null ? 0 : e.a.containsMatchIn(str3) ? resources2.getIdentifier(str3, null, null) : resources2.getIdentifier(str3, "anim", context.getPackageName());
                String str4 = animations.b;
                Intrinsics.checkNotNullParameter(context, "context");
                Resources resources3 = context.getResources();
                identifier2 = str4 != null ? 0 : e.a.containsMatchIn(str4) ? resources3.getIdentifier(str4, null, null) : resources3.getIdentifier(str4, "anim", context.getPackageName());
                if (identifier != 0 && identifier2 != 0) {
                    builder.setStartAnimations(context, identifier, identifier2);
                }
                String str5 = animations.c;
                Intrinsics.checkNotNullParameter(context, "context");
                Resources resources4 = context.getResources();
                identifier3 = str5 != null ? 0 : e.a.containsMatchIn(str5) ? resources4.getIdentifier(str5, null, null) : resources4.getIdentifier(str5, "anim", context.getPackageName());
                String str6 = animations.d;
                Intrinsics.checkNotNullParameter(context, "context");
                Resources resources5 = context.getResources();
                identifier4 = str6 != null ? 0 : e.a.containsMatchIn(str6) ? resources5.getIdentifier(str6, null, null) : resources5.getIdentifier(str6, "anim", context.getPackageName());
                if (identifier3 != 0 && identifier4 != 0) {
                    builder.setExitAnimations(context, identifier3, identifier4);
                }
                g configuration = options.l;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                d = configuration.a;
                if (d != null) {
                    double doubleValue = d.doubleValue();
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    int i = (int) ((doubleValue * context.getResources().getDisplayMetrics().density) + 0.5d);
                    Integer num8 = configuration.b;
                    if (num8 == null) {
                        builder.setInitialActivityHeightPx(i);
                    } else {
                        builder.setInitialActivityHeightPx(i, num8.intValue());
                    }
                }
                d2 = configuration.c;
                if (d2 != null) {
                    double doubleValue2 = d2.doubleValue();
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    builder.setInitialActivityWidthPx((int) ((doubleValue2 * context.getResources().getDisplayMetrics().density) + 0.5d));
                }
                d3 = configuration.d;
                if (d3 != null) {
                    builder.setActivitySideSheetBreakpointDp((int) d3.doubleValue());
                }
                bool7 = configuration.e;
                if (bool7 != null) {
                    builder.setActivitySideSheetMaximizationEnabled(bool7.booleanValue());
                }
                num4 = configuration.f;
                if (num4 != null) {
                    builder.setActivitySideSheetPosition(num4.intValue());
                }
                num5 = configuration.g;
                if (num5 != null) {
                    builder.setActivitySideSheetDecorationType(num5.intValue());
                }
                num6 = configuration.h;
                if (num6 != null) {
                    builder.setActivitySideSheetRoundedCornersPosition(num6.intValue());
                }
                num7 = configuration.i;
                if (num7 != null) {
                    builder.setToolbarCornerRadiusDp(num7.intValue());
                }
                bool8 = configuration.j;
                if (bool8 != null) {
                    builder.setBackgroundInteractionEnabled(bool8.booleanValue());
                }
                CustomTabsIntent customTabsIntent = builder.build();
                Intrinsics.checkNotNull(customTabsIntent);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(customTabsIntent, "customTabsIntent");
                Intrinsics.checkNotNullParameter(options2, "options");
                intent = customTabsIntent.intent;
                Intrinsics.checkNotNullExpressionValue(intent, "intent");
                map = options2.d;
                if (map != null) {
                    intent.putExtra("com.android.browser.headers", com.github.droibit.flutter.plugins.customtabs.core.utils.a.a(map));
                }
                if (intent.getPackage() == null) {
                    if (str2 != null) {
                        intent.setPackage(str2);
                    } else {
                        com.droibit.android.customtabs.launcher.g a = options2.a(context);
                        if (Intrinsics.areEqual(options2.b, Boolean.TRUE)) {
                            Intrinsics.checkNotNullParameter(customTabsIntent, "<this>");
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(customTabsIntent, "<this>");
                            Intrinsics.checkNotNullParameter(context, "context");
                            customTabsIntent.intent.setPackage(com.droibit.android.customtabs.launcher.a.a(context, false, a));
                        } else {
                            Intrinsics.checkNotNullParameter(customTabsIntent, "<this>");
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(customTabsIntent, "<this>");
                            Intrinsics.checkNotNullParameter(context, "context");
                            customTabsIntent.intent.setPackage(com.droibit.android.customtabs.launcher.a.a(context, true, a));
                        }
                    }
                }
                Intrinsics.checkNotNullExpressionValue(customTabsIntent, "apply(...)");
                return customTabsIntent;
            }
        } else {
            sessionProvider.getClass();
        }
        customTabsSession = null;
        builder = new CustomTabsIntent.Builder(customTabsSession);
        com.github.droibit.flutter.plugins.customtabs.core.options.d colorSchemes2 = options.a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(colorSchemes2, "colorSchemes");
        num = colorSchemes2.a;
        if (num != null) {
        }
        customTabColorSchemeParams = colorSchemes2.b;
        if (customTabColorSchemeParams != null) {
        }
        customTabColorSchemeParams2 = colorSchemes2.c;
        if (customTabColorSchemeParams2 != null) {
        }
        customTabColorSchemeParams3 = colorSchemes2.d;
        if (customTabColorSchemeParams3 != null) {
        }
        bool = options.b;
        if (bool != null) {
        }
        num2 = options.c;
        if (num2 != null) {
        }
        bool2 = options.d;
        if (bool2 != null) {
        }
        bool3 = options.e;
        if (bool3 != null) {
        }
        bool4 = options.f;
        if (bool4 != null) {
        }
        bool5 = options.g;
        if (bool5 != null) {
        }
        bool6 = options.h;
        if (bool6 != null) {
        }
        com.github.droibit.flutter.plugins.customtabs.core.options.c closeButton2 = options.i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(closeButton2, "closeButton");
        str = closeButton2.a;
        e eVar2 = this.a;
        if (str != null) {
        }
        num3 = closeButton2.b;
        if (num3 != null) {
        }
        com.github.droibit.flutter.plugins.customtabs.core.options.b animations2 = options.j;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(animations2, "animations");
        String str32 = animations2.a;
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources22 = context.getResources();
        if (str32 != null) {
        }
        String str42 = animations2.b;
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources32 = context.getResources();
        if (str42 != null) {
        }
        if (identifier != 0) {
            builder.setStartAnimations(context, identifier, identifier2);
        }
        String str52 = animations2.c;
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources42 = context.getResources();
        if (str52 != null) {
        }
        String str62 = animations2.d;
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources52 = context.getResources();
        if (str62 != null) {
        }
        if (identifier3 != 0) {
            builder.setExitAnimations(context, identifier3, identifier4);
        }
        g configuration2 = options.l;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        d = configuration2.a;
        if (d != null) {
        }
        d2 = configuration2.c;
        if (d2 != null) {
        }
        d3 = configuration2.d;
        if (d3 != null) {
        }
        bool7 = configuration2.e;
        if (bool7 != null) {
        }
        num4 = configuration2.f;
        if (num4 != null) {
        }
        num5 = configuration2.g;
        if (num5 != null) {
        }
        num6 = configuration2.h;
        if (num6 != null) {
        }
        num7 = configuration2.i;
        if (num7 != null) {
        }
        bool8 = configuration2.j;
        if (bool8 != null) {
        }
        CustomTabsIntent customTabsIntent2 = builder.build();
        Intrinsics.checkNotNull(customTabsIntent2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customTabsIntent2, "customTabsIntent");
        Intrinsics.checkNotNullParameter(options2, "options");
        intent = customTabsIntent2.intent;
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        map = options2.d;
        if (map != null) {
        }
        if (intent.getPackage() == null) {
        }
        Intrinsics.checkNotNullExpressionValue(customTabsIntent2, "apply(...)");
        return customTabsIntent2;
    }
}
