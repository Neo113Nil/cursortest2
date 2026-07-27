package com.inmobi.media;

import com.ironsource.C4761z5;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ab extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f6453a;

    public Ab(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f6453a = jsonObject;
    }

    @Override // com.inmobi.media.Wj
    public final void a(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        String jSONObject = this.f6453a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        bufferedSink.writeUtf8(jSONObject);
    }

    @Override // com.inmobi.media.Wj
    public final String a() {
        return C4761z5.M;
    }
}
