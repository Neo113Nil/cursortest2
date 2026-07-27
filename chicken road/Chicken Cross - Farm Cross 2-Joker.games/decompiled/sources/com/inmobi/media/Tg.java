package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class Tg implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:11:0x004a, B:13:0x004e, B:15:0x0057, B:19:0x006b, B:21:0x0078, B:22:0x0081, B:24:0x0091, B:25:0x0094, B:17:0x0072), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Activity activity, ContinuationImpl continuationImpl) {
        Rg rg;
        int i;
        Mutex mutex;
        WeakReference weakReference;
        try {
            if (continuationImpl instanceof Rg) {
                rg = (Rg) continuationImpl;
                int i2 = rg.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rg.e = i2 - Integer.MIN_VALUE;
                    Object obj = rg.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = rg.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = Ug.b;
                        rg.f6828a = activity;
                        rg.b = mutex;
                        rg.e = 1;
                        if (mutex.lock(null, rg) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = rg.b;
                        Activity activity2 = rg.f6828a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        activity = activity2;
                    }
                    if (Ug.f6893a != null) {
                        int size = Ug.c.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                weakReference = null;
                                break;
                            }
                            ArrayList arrayList = Ug.c;
                            if (Intrinsics.areEqual((Context) ((WeakReference) arrayList.get(i3)).get(), activity)) {
                                weakReference = (WeakReference) arrayList.get(i3);
                                break;
                            }
                            i3++;
                        }
                        if (weakReference != null) {
                            Boxing.boxBoolean(Ug.c.remove(weakReference));
                        }
                        ArrayList arrayList2 = Ug.c;
                        CollectionsKt.removeAll((List) arrayList2, new Function1() { // from class: com.inmobi.media.Tg$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(Tg.a((WeakReference) obj2));
                            }
                        });
                        if (arrayList2.isEmpty()) {
                            a(activity);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (Ug.f6893a != null) {
            }
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        rg = new Rg(this, continuationImpl);
        Object obj2 = rg.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rg.e;
        if (i != 0) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Sg(this, activity, null), 3, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public static final boolean a(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    public final void a(Activity activity) {
        Picasso picasso = Ug.f6893a;
        Intrinsics.checkNotNullExpressionValue("Ug", "access$getTAG$p(...)");
        String str = "Picasso instance " + Ug.f6893a + " shutdown";
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        Picasso picasso2 = Ug.f6893a;
        if (picasso2 != null) {
            picasso2.shutdown();
        }
        Ug.f6893a = null;
    }
}
