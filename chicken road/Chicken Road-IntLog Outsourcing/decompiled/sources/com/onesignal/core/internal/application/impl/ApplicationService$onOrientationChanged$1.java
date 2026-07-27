package com.onesignal.core.internal.application.impl;

import android.app.Activity;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ApplicationService$onOrientationChanged$1 extends j implements InterfaceC1441l {
    final /* synthetic */ Activity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationService$onOrientationChanged$1(Activity activity) {
        super(1);
        this.$activity = activity;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IActivityLifecycleHandler) obj);
        return v.f5689a;
    }

    public final void invoke(IActivityLifecycleHandler it) {
        i.e(it, "it");
        it.onActivityStopped(this.$activity);
    }
}
