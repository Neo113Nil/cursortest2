package com.onesignal.core.internal.application.impl;

import android.app.Activity;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ApplicationService$current$1 extends j implements InterfaceC1441l {
    final /* synthetic */ Activity $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationService$current$1(Activity activity) {
        super(1);
        this.$value = activity;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IActivityLifecycleHandler) obj);
        return v.f5689a;
    }

    public final void invoke(IActivityLifecycleHandler it) {
        i.e(it, "it");
        it.onActivityAvailable(this.$value);
    }
}
