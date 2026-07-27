package io.flutter.plugin.platform;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class h {
    private final T1.k createArgsCodec;

    public h(T1.r rVar) {
        this.createArgsCodec = rVar;
    }

    public abstract g create(Context context, int i3, Object obj);

    public final T1.k getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
