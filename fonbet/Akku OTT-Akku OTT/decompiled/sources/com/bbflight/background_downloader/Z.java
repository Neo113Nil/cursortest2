package com.bbflight.background_downloader;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notifications.kt\ncom/bbflight/background_downloader/GroupNotification\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,960:1\n567#2:961\n552#2,6:962\n567#2:968\n552#2,6:969\n567#2:975\n552#2,6:976\n*S KotlinDebug\n*F\n+ 1 Notifications.kt\ncom/bbflight/background_downloader/GroupNotification\n*L\n104#1:961\n104#1:962,6\n110#1:968\n110#1:969,6\n122#1:975\n122#1:976,6\n*E\n"})
/* loaded from: classes3.dex */
public final class Z {
    public final String a;
    public final C0654k0 b;
    public final ConcurrentHashMap<M0, EnumC0668s0> c;

    public Z(String name, C0654k0 notificationConfig) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(notificationConfig, "notificationConfig");
        this.a = name;
        this.b = notificationConfig;
        this.c = new ConcurrentHashMap<>();
    }

    public final int a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<M0, EnumC0668s0> entry : this.c.entrySet()) {
            if (entry.getValue() == EnumC0668s0.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    public final int b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<M0, EnumC0668s0> entry : this.c.entrySet()) {
            if (entry.getValue() != EnumC0668s0.a) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    public final Set<M0> c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<M0, EnumC0668s0> entry : this.c.entrySet()) {
            if (entry.getValue() == EnumC0668s0.a) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }
}
