package com.google.android.exoplayer2;

import com.google.android.exoplayer2.SimpleBasePlayer;

/* loaded from: classes4.dex */
public final /* synthetic */ class Z implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    public final Object get() {
        Boolean lambda$release$0;
        SimpleBasePlayer.State lambda$stop$12;
        switch (this.a) {
            case 0:
                lambda$release$0 = ((ExoPlayerImplInternal) this.b).lambda$release$0();
                return lambda$release$0;
            default:
                lambda$stop$12 = SimpleBasePlayer.lambda$stop$12((SimpleBasePlayer.State) this.b);
                return lambda$stop$12;
        }
    }
}
