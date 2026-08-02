package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes4.dex */
final class u implements av {
    private Context a;

    private u() {
        throw null;
    }

    public final u a(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        com.google.android.play.integrity.internal.ba.a(this.a, Context.class);
        return new w(this.a, null);
    }

    public /* synthetic */ u(t tVar) {
    }
}
