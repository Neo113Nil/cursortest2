package io.flutter.plugin.platform;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class g {
    private final A5.n createArgsCodec = A5.x.f685a;

    public abstract f create(Context context, int i7, Object obj);

    public final A5.n getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
