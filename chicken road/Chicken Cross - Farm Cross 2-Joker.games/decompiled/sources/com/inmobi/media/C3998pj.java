package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.pj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3998pj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ej f7308a;

    public C3998pj(Ej ej) {
        this.f7308a = ej;
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Y9 y9 = this.f7308a.i;
        if (y9 != null) {
            String str = Ej.j1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((Z9) y9).a(str, "onCCTLifeCycleEvent");
        }
        this.f7308a.c(jsonObject);
    }
}
