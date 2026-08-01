package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C0 extends C5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4577p0 f7579a;
    private final C4434h0 b;
    private final String c;

    public /* synthetic */ C0(C4577p0 c4577p0, C4434h0 c4434h0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4577p0, c4434h0, (i & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 b0) {
        Map<String, Object> a2 = a(this.b);
        a2.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        a2.put("sessionDepth", Integer.valueOf(this.f7579a.g()));
        String str = this.c;
        if (str != null) {
            a2.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return a2;
    }

    public C0(C4577p0 adTools, C4434h0 adProperties, String str) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f7579a = adTools;
        this.b = adProperties;
        this.c = str;
    }
}
