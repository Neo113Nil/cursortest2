package com.onesignal.internal;

import com.onesignal.debug.LogLevel;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class OtelLifecycleManager$disableFeatures$1 extends j implements InterfaceC1441l {
    public static final OtelLifecycleManager$disableFeatures$1 INSTANCE = new OtelLifecycleManager$disableFeatures$1();

    public OtelLifecycleManager$disableFeatures$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final Boolean invoke(LogLevel it) {
        i.e(it, "it");
        return Boolean.FALSE;
    }
}
