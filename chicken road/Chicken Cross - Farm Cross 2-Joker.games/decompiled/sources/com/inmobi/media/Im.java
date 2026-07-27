package com.inmobi.media;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Im {

    /* renamed from: a, reason: collision with root package name */
    public final Ej f6633a;

    public Im(Ej mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.f6633a = mListener;
    }

    public final void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f6633a.a(event.getX(), event.getY());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6633a.b(event.getX(), event.getY());
        }
    }
}
