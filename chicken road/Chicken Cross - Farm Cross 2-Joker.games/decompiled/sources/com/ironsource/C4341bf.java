package com.ironsource;

import com.ironsource.U3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.bf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4341bf {

    /* renamed from: a, reason: collision with root package name */
    private EnumC4359cf f8102a;

    public C4341bf(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f8102a = EnumC4359cf.b.a(config.optInt(U3.a.t, EnumC4359cf.CurrentlyLoadedAds.b()));
    }

    public final EnumC4359cf a() {
        return this.f8102a;
    }
}
