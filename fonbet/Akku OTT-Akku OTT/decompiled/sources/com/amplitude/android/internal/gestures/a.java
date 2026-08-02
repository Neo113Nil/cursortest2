package com.amplitude.android.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import com.amplitude.android.internal.c;
import com.amplitude.android.p;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@VisibleForTesting(otherwise = 3)
@SourceDebugExtension({"SMAP\nAutocaptureGestureListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocaptureGestureListener.kt\ncom/amplitude/android/internal/gestures/AutocaptureGestureListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements GestureDetector.OnGestureListener {
    public final AdaptedFunctionReference a;
    public final com.amplitude.common.a b;
    public final List<com.amplitude.android.internal.locators.b> c;
    public final com.amplitude.android.g d;
    public c e;
    public final WeakReference<Activity> f;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, Function2 track, com.amplitude.common.a logger, List viewTargetLocators, com.amplitude.android.g autocaptureState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        Intrinsics.checkNotNullParameter(autocaptureState, "autocaptureState");
        this.a = (AdaptedFunctionReference) track;
        this.b = logger;
        this.c = viewTargetLocators;
        this.d = autocaptureState;
        this.e = null;
        this.f = new WeakReference<>(activity);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.AdaptedFunctionReference] */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        View decorView;
        Intrinsics.checkNotNullParameter(e, "e");
        Activity activity = this.f.get();
        com.amplitude.common.a aVar = this.b;
        if (activity == null) {
            aVar.b("Activity is null in onSingleTapUp()");
            Unit unit = Unit.INSTANCE;
            return false;
        }
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            aVar.b("DecorView is null in onSingleTapUp()");
            Unit unit2 = Unit.INSTANCE;
            return false;
        }
        Pair pair = new Pair(Float.valueOf(e.getX()), Float.valueOf(e.getY()));
        c.a aVar2 = c.a.a;
        com.amplitude.android.internal.c b = com.amplitude.android.internal.b.b(decorView, pair, this.c, aVar);
        if (b == null) {
            aVar.d("Unable to find click target. No event captured.");
            Unit unit3 = Unit.INSTANCE;
            return false;
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.invoke(b);
        }
        if (this.d.e.contains(p.b.a)) {
            this.a.invoke("[Amplitude] Element Interacted", com.amplitude.android.internal.d.a(b, activity));
        }
        return false;
    }
}
