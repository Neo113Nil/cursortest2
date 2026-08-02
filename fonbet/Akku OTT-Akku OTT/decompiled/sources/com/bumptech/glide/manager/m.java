package com.bumptech.glide.manager;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes3.dex */
public final class m implements l {
    public final /* synthetic */ Lifecycle a;
    public final /* synthetic */ n b;

    public m(n nVar, Lifecycle lifecycle) {
        this.b = nVar;
        this.a = lifecycle;
    }

    @Override // com.bumptech.glide.manager.l
    public final void h() {
    }

    @Override // com.bumptech.glide.manager.l
    public final void onDestroy() {
        this.b.a.remove(this.a);
    }

    @Override // com.bumptech.glide.manager.l
    public final void onStart() {
    }
}
