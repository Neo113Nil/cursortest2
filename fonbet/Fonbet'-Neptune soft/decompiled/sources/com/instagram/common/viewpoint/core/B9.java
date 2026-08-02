package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: assets/audience_network.dex */
public class B9<K> extends C1652lv<K, V>.Itr<K> {
    public final /* synthetic */ C1652lv A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B9(final C1652lv this$0) {
        super(this$0, null);
        this.A00 = this$0;
    }

    @ParametricNullness
    public final K A03(int i) {
        Object A0E;
        A0E = this.A00.A0E(i);
        return (K) A0E;
    }
}
