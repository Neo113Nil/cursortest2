package com.onesignal.core.internal.features;

import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class FeatureManager$enabledFeatureKeys$2 extends j implements InterfaceC1441l {
    public static final FeatureManager$enabledFeatureKeys$2 INSTANCE = new FeatureManager$enabledFeatureKeys$2();

    public FeatureManager$enabledFeatureKeys$2() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final String invoke(Map.Entry<? extends FeatureFlag, Boolean> it) {
        i.e(it, "it");
        return it.getKey().getKey();
    }
}
