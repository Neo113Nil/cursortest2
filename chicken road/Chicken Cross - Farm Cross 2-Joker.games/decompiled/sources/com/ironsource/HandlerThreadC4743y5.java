package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class HandlerThreadC4743y5 extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private Handler f8771a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC4743y5(String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f8771a;
        if (handler != null) {
            handler.post(task);
        }
    }

    public final void a() {
        this.f8771a = new Handler(getLooper());
    }
}
