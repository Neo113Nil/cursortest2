package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class e implements l {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f11548a;
    public final Function0<Unit> b;
    public final LifecycleEventObserver c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11549a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11549a = iArr;
        }
    }

    public e(Lifecycle lifecycle, Function0<Unit> onExoResume, final Function0<Unit> onExoPause) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onExoResume, "onExoResume");
        Intrinsics.checkNotNullParameter(onExoPause, "onExoPause");
        this.f11548a = lifecycle;
        this.b = onExoResume;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                e.a(e.this, onExoPause, lifecycleOwner, event);
            }
        };
        this.c = lifecycleEventObserver;
        lifecycle.addObserver(lifecycleEventObserver);
        Lifecycle.State state = lifecycle.getState();
        if (state == Lifecycle.State.DESTROYED || state.isAtLeast(Lifecycle.State.STARTED)) {
            return;
        }
        onExoResume.invoke();
    }

    public static final void a(e eVar, Function0 function0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = a.f11549a[event.ordinal()];
        if (i == 1) {
            eVar.b.invoke();
        } else {
            if (i == 2 || i == 3 || i != 4) {
                return;
            }
            function0.invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        this.f11548a.removeObserver(this.c);
    }
}
