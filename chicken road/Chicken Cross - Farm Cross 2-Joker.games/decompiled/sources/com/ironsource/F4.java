package com.ironsource;

import com.ironsource.AbstractC4419g3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F4<Smash extends AbstractC4419g3<?>> extends Zg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F4(int i, boolean z, List<? extends Smash> waterfall) {
        super(i, z, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
    }

    @Override // com.ironsource.Zg
    public void c(Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
