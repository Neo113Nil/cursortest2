package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.wj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4193wj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ej f7462a;

    public C4193wj(Ej ej) {
        this.f7462a = ej;
    }

    public final void a(H8 obj) {
        Intrinsics.checkNotNullParameter(obj, "error");
        Y9 y9 = this.f7462a.i;
        if (y9 != null) {
            ((Z9) y9).b("HtmlVideoPlayer", "onVideoLoadFailed " + ((int) obj.b));
        }
        Ej ej = this.f7462a;
        Intrinsics.checkNotNullParameter(obj, "obj");
        JSONObject a2 = AbstractC3875lb.a(obj, obj.getClass());
        if (a2 == null) {
            a2 = new JSONObject();
        }
        V8 v8 = V8.b;
        ej.a("VideoPlaybackError", a2);
    }
}
