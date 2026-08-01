package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.f5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3700f5 implements T4 {
    @Override // com.inmobi.media.T4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this) {
            C3869l5 c3869l5 = C3869l5.f7216a;
            Intrinsics.checkNotNullExpressionValue("l5", "access$getTAG$p(...)");
            C3869l5 c3869l52 = C3869l5.f7216a;
            String str = C3869l5.f;
            List<String> skipFields = C3869l5.c().getContextualData().getSkipFields();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C3899m5.j);
            arrayList.removeAll(skipFields);
            String joinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
            C3869l5.f = joinToString$default;
            if (!Intrinsics.areEqual(joinToString$default, str)) {
                c3869l52.f();
            }
            C3869l5.a();
            Unit unit = Unit.INSTANCE;
        }
    }
}
