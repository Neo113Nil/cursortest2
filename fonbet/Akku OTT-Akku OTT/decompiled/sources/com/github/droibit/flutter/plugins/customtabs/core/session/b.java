package com.github.droibit.flutter.plugins.customtabs.core.session;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCustomTabsSessionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomTabsSessionManager.kt\ncom/github/droibit/flutter/plugins/customtabs/core/session/CustomTabsSessionManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    public final LinkedHashMap a;

    public b() {
        LinkedHashMap cachedSessions = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(cachedSessions, "cachedSessions");
        this.a = cachedSessions;
    }
}
