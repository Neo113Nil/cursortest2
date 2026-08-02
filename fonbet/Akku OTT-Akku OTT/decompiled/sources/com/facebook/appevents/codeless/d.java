package com.facebook.appevents.codeless;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public static final /* synthetic */ int a = 0;

    public static final class a implements View.OnTouchListener {
        public final com.facebook.appevents.codeless.internal.a a;
        public final WeakReference<View> b;
        public final WeakReference<View> c;
        public final View.OnTouchListener d;
        public final boolean e;

        public a(com.facebook.appevents.codeless.internal.a mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.a = mapping;
            this.b = new WeakReference<>(hostView);
            this.c = new WeakReference<>(rootView);
            this.d = com.facebook.appevents.codeless.internal.e.g(hostView);
            this.e = true;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            View view2 = this.c.get();
            View view3 = this.b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                com.facebook.appevents.codeless.a.a(this.a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    static {
        new d();
    }
}
