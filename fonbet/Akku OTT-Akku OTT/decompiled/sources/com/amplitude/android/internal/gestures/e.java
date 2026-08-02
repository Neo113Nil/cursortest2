package com.amplitude.android.internal.gestures;

import android.app.Activity;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.amplitude.android.internal.c;
import com.amplitude.android.n;
import com.amplitude.android.p;
import com.amplitude.android.utilities.k;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Q0;

/* loaded from: classes3.dex */
public final class e extends d {
    public final n j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Window.Callback delegate, Activity activity, k track, List viewTargetLocators, com.amplitude.common.a logger, com.amplitude.android.g autocaptureState, n nVar) {
        super(delegate, activity, track, viewTargetLocators, logger, autocaptureState);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(autocaptureState, "autocaptureState");
        this.j = nVar;
    }

    @Override // com.amplitude.android.internal.gestures.d, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n nVar;
        boolean z;
        String str;
        n nVar2;
        boolean z2;
        com.amplitude.android.g gVar;
        String str2;
        int collectionSizeOrDefault;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent == null || (nVar = this.j) == null || motionEvent.getAction() != 1) {
            return dispatchTouchEvent;
        }
        Activity activity = this.b;
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        com.amplitude.common.a aVar = this.d;
        if (decorView == null) {
            aVar.b("DecorView is null in handleFrustrationInteraction()");
            return dispatchTouchEvent;
        }
        com.amplitude.android.internal.c target = this.i;
        if (target != null) {
            this.i = null;
        } else {
            Pair pair = new Pair(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
            c.a aVar2 = c.a.a;
            target = com.amplitude.android.internal.b.b(decorView, pair, this.c, aVar);
            if (target == null) {
                aVar.c("Unable to find click target for frustration interaction");
                return dispatchTouchEvent;
            }
        }
        boolean z3 = target.i;
        boolean z4 = target.h;
        if (z4 && z3) {
            aVar.c("Ignoring all frustration interactions for target: " + target.b);
            return dispatchTouchEvent;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        n.a clickInfo = new n.a(x, y, System.currentTimeMillis());
        String str3 = target.b;
        n.d targetInfo = new n.d(str3, target.c, target.d, target.e, target.f, target.g);
        com.amplitude.android.g gVar2 = nVar.c;
        com.amplitude.common.a aVar3 = nVar.b;
        Intrinsics.checkNotNullParameter(clickInfo, "clickInfo");
        Intrinsics.checkNotNullParameter(targetInfo, "targetInfo");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(activity, "activity");
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        if (str3 == null) {
            z = dispatchTouchEvent;
            str = "null";
        } else {
            z = dispatchTouchEvent;
            str = str3;
        }
        sb.append(str);
        sb.append('_');
        sb.append((int) x);
        sb.append('_');
        sb.append((int) y);
        sb.append('_');
        sb.append(System.currentTimeMillis());
        if (!gVar2.e.contains(p.c.a)) {
            nVar2 = nVar;
            z2 = z3;
        } else if (z4) {
            nVar2 = nVar;
            z2 = z3;
            aVar3.c("Skipping rage click processing for ignored target: " + str3);
            gVar2 = gVar2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append('_');
            float f = nVar.d;
            sb2.append((int) (x / f));
            sb2.append('_');
            sb2.append((int) (y / f));
            String sb3 = sb2.toString();
            ConcurrentHashMap<String, n.c> concurrentHashMap = nVar.f;
            n.c cVar = concurrentHashMap.get(sb3);
            if (cVar != null) {
                List<n.a> list = cVar.g;
                z2 = z3;
                float f2 = cVar.e;
                float f3 = cVar.d;
                gVar = gVar2;
                long j = cVar.a;
                if (currentTimeMillis - j <= 1000) {
                    PointF pointF = new PointF(x, y);
                    PointF pointF2 = new PointF(f3, f2);
                    str2 = str3;
                    if (PointF.length(pointF.x - pointF2.x, pointF.y - pointF2.y) <= f) {
                        cVar.c++;
                        cVar.b = currentTimeMillis;
                        list.add(new n.a(x, y, currentTimeMillis));
                        if (cVar.c >= 4) {
                            Map<String, Object> a = com.amplitude.android.internal.d.a(target, activity);
                            Pair pair2 = TuplesKt.to("[Amplitude] Begin Time", Long.valueOf(j));
                            Pair pair3 = TuplesKt.to("[Amplitude] End Time", Long.valueOf(cVar.b));
                            Pair pair4 = TuplesKt.to("[Amplitude] Duration", Long.valueOf(cVar.b - j));
                            Pair pair5 = TuplesKt.to("[Amplitude] X", Integer.valueOf((int) f3));
                            Pair pair6 = TuplesKt.to("[Amplitude] Y", Integer.valueOf((int) f2));
                            Pair pair7 = TuplesKt.to("[Amplitude] Click Count", Integer.valueOf(cVar.c));
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            for (n.a aVar4 : list) {
                                arrayList.add(MapsKt.mapOf(TuplesKt.to("[Amplitude] X", Integer.valueOf((int) aVar4.a)), TuplesKt.to("[Amplitude] Y", Integer.valueOf((int) aVar4.b)), TuplesKt.to(Constants.TIMESTAMP, Long.valueOf(aVar4.c))));
                            }
                            com.amplitude.core.b.m(nVar.a, "[Amplitude] Rage Click", MapsKt.plus(a, MapsKt.mapOf(pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to("[Amplitude] Clicks", arrayList))), 4);
                            aVar3.c("Rage click detected with " + cVar.c + " clicks");
                            concurrentHashMap.remove(sb3);
                        }
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        nVar2.a(sb3, clickInfo, targetInfo, currentTimeMillis);
                    }
                } else {
                    nVar2 = nVar;
                    str2 = str3;
                    nVar2.a(sb3, clickInfo, targetInfo, currentTimeMillis);
                }
            } else {
                gVar = gVar2;
                nVar2 = nVar;
                z2 = z3;
                str2 = str3;
                nVar2.a(sb3, clickInfo, targetInfo, currentTimeMillis);
            }
            gVar2 = gVar;
            str3 = str2;
        }
        if (!gVar2.e.contains(p.a.a)) {
            return z;
        }
        if (z2) {
            aVar3.c("Skipping dead click processing for ignored target: " + str3);
            return z;
        }
        Q0 q0 = nVar2.e;
        if (q0 == null || !q0.isActive()) {
            aVar3.b("Dead click detection is disabled - call start() to enable.");
            return z;
        }
        aVar3.b("Dead click detection is disabled - no UI change signals observed yet. Ensure SessionReplay plugin is active.");
        return z;
    }
}
