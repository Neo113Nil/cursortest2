package com.onesignal.core.internal.background.impl;

import f4.v;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class BackgroundManager$onFocus$1 extends j implements InterfaceC1430a {
    final /* synthetic */ BackgroundManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundManager$onFocus$1(BackgroundManager backgroundManager) {
        super(0);
        this.this$0 = backgroundManager;
    }

    @Override // t4.InterfaceC1430a
    public /* bridge */ /* synthetic */ Object invoke() {
        m6invoke();
        return v.f5689a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6invoke() {
        this.this$0.cancelSyncTask();
    }
}
