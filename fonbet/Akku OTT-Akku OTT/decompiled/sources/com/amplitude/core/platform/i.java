package com.amplitude.core.platform;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMediator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mediator.kt\ncom/amplitude/core/platform/Mediator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1855#2,2:69\n1855#2,2:71\n*S KotlinDebug\n*F\n+ 1 Mediator.kt\ncom/amplitude/core/platform/Mediator\n*L\n21#1:69,2\n58#1:71,2\n*E\n"})
/* loaded from: classes3.dex */
public final class i {
    public final CopyOnWriteArrayList<k> a;

    public i() {
        this(null);
    }

    public i(Object obj) {
        CopyOnWriteArrayList<k> plugins = new CopyOnWriteArrayList<>();
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        this.a = plugins;
    }
}
