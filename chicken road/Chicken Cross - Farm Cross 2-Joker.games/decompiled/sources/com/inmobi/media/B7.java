package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* loaded from: classes6.dex */
public final class B7 extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6471a;

    public B7(HashMap payload, int i) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f6471a = payload;
    }

    @Override // com.inmobi.media.Wj
    public final void a(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        bufferedSink.writeUtf8(AbstractC3727g4.a(this.f6471a));
    }

    @Override // com.inmobi.media.Wj
    public final String a() {
        return ShareTarget.ENCODING_TYPE_URL_ENCODED;
    }

    public B7(HashMap payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f6471a = payload;
    }
}
