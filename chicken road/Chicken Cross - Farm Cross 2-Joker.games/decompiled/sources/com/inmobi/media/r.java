package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class r {
    public static AudioManager b;
    public static C3863l c;
    public static Job f;
    public static Function1 i;

    /* renamed from: a, reason: collision with root package name */
    public static final r f7338a = new r();
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicReference e = new AtomicReference(null);
    public static final CoroutineScope g = AbstractC3904ma.e;
    public static final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public static final Unit a(long j, C3698f3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.f7098a;
        if (i2 != 101) {
            if (i2 == 102) {
                Job job = f;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                f = null;
            }
        } else if (f == null && d.get()) {
            f = AbstractC3727g4.a(g, 0L, j, new C3978p(null));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b() {
        try {
            Y5.f6965a.getClass();
            if (Y5.y()) {
                AudioManager audioManager = b;
                if (audioManager != null && audioManager.isStreamMute(3)) {
                }
                return !AbstractC3914mk.g;
            }
            AudioManager audioManager2 = b;
            if (audioManager2 != null && audioManager2.getStreamVolume(3) == 0) {
            }
            if (!AbstractC3914mk.g) {
            }
        } catch (Throwable unused) {
            return AbstractC3914mk.g;
        }
    }

    public static void a(final long j) {
        Function1 function1 = new Function1() { // from class: com.inmobi.media.r$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.a(j, (C3698f3) obj);
            }
        };
        i = function1;
        ((C4214xd) AbstractC3914mk.f.getValue()).a(new int[]{102, 101}, function1);
    }

    public static void a(final Y9 y9) {
        final Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            if (y9 != null) {
                ((Z9) y9).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        final long muteChangeInterval = ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getMraid3().getMuteChangeInterval();
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(AbstractC3784i4.a(new Function0() { // from class: com.inmobi.media.r$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.a(Y9.this, context, muteChangeInterval);
            }
        }));
        if (m8082exceptionOrNullimpl != null) {
            if (y9 != null) {
                ((Z9) y9).b("AdAudioTracker", "Error starting audio volume tracking - " + m8082exceptionOrNullimpl.getMessage());
            }
            a((Float) null);
        }
    }

    public static final Object a(Y9 y9, Context context, long j) {
        Job launch$default;
        if (d.compareAndSet(false, true)) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(g, null, null, new C4006q(y9, context, j, null), 3, null);
            return launch$default;
        }
        if (y9 == null) {
            return null;
        }
        ((Z9) y9).c("AdAudioTracker", "Audio volume tracking is already started");
        return Unit.INSTANCE;
    }

    public static void a(final Context context, Y9 y9) {
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(AbstractC3784i4.a(new Function0() { // from class: com.inmobi.media.r$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.a(context);
            }
        }));
        if (m8082exceptionOrNullimpl == null || y9 == null) {
            return;
        }
        ((Z9) y9).b("AdAudioTracker", "Error cleaning up audio volume tracker - " + m8082exceptionOrNullimpl.getMessage());
    }

    public static final Unit a(final Context context) {
        final C3863l c3863l = c;
        if (c3863l != null) {
            AbstractC3784i4.a(new Function0() { // from class: com.inmobi.media.r$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.a(context, c3863l);
                }
            });
            c = null;
        }
        Job job = f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Function1 function1 = i;
        if (function1 != null) {
            ((C4214xd) AbstractC3914mk.f.getValue()).a(function1);
        }
        i = null;
        f = null;
        return Unit.INSTANCE;
    }

    public static final Unit a(Context context, C3863l c3863l) {
        context.unregisterReceiver(c3863l);
        return Unit.INSTANCE;
    }

    public final synchronized float a() {
        try {
            boolean b2 = b();
            AudioManager audioManager = b;
            int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
            AudioManager audioManager2 = b;
            int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
            if (b2) {
                return 0.0f;
            }
            if (streamVolume < 0) {
                return 0.0f;
            }
            if (streamVolume > streamMaxVolume) {
                return 1.0f;
            }
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            return streamVolume / streamMaxVolume;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static void a(Float f2) {
        if (Intrinsics.areEqual((Float) e.getAndSet(f2), f2)) {
            return;
        }
        Iterator it = h.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC3834k interfaceC3834k = (InterfaceC3834k) ((WeakReference) it.next()).get();
            if (interfaceC3834k != null) {
                ((C3941nj) interfaceC3834k).a(f2 != null ? Float.valueOf(AbstractC3727g4.a(f2.floatValue() * 100.0f)) : null);
            }
        }
    }
}
