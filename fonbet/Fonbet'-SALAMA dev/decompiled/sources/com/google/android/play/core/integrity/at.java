package com.google.android.play.core.integrity;

import A3.C0056e;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final A3.j f11613a;

    /* renamed from: b, reason: collision with root package name */
    private final A3.j f11614b;

    public at(A3.j jVar, A3.j jVar2) {
        this.f11613a = jVar;
        this.f11614b = jVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, C0056e c0056e) {
        Object a2 = this.f11613a.a();
        a2.getClass();
        k kVar = (k) this.f11614b.a();
        kVar.getClass();
        activity.getClass();
        c0056e.getClass();
        return new as((Context) a2, kVar, activity, taskCompletionSource, c0056e);
    }
}
