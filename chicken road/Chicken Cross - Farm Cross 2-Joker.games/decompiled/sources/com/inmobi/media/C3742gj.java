package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.gj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3742gj implements T4 {
    @Override // com.inmobi.media.T4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Jc jc = AbstractC3771hj.b;
        if (jc != null) {
            jc.g.set(true);
        }
        AbstractC3771hj.b = null;
        AbstractC4143un.a(new C3714fj(null));
    }
}
