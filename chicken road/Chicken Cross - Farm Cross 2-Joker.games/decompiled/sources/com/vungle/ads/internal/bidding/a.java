package com.vungle.ads.internal.bidding;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.w2;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes7.dex */
public final class a extends com.vungle.ads.internal.util.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f11889a;

    public a(e eVar) {
        this.f11889a = eVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a() {
        e eVar = this.f11889a;
        eVar.getClass();
        boolean z = u.f12190a;
        t.a("BidTokenEncoder", "BidTokenEncoder#onBackground()");
        eVar.e = System.currentTimeMillis();
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b() {
        Integer num;
        e eVar = this.f11889a;
        eVar.getClass();
        boolean z = u.f12190a;
        t.a("BidTokenEncoder", "BidTokenEncoder#onForeground()");
        long currentTimeMillis = System.currentTimeMillis();
        ConfigManager.INSTANCE.getClass();
        w2 w2Var = ConfigManager.f11882a;
        if (currentTimeMillis > eVar.e + (((w2Var == null || (num = w2Var.j) == null) ? DescriptorProtos.Edition.EDITION_LEGACY_VALUE : num.intValue()) * 1000)) {
            eVar.c = 0;
            eVar.e = 0L;
        }
    }
}
