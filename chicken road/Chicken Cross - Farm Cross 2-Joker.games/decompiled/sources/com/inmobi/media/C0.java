package com.inmobi.media;

import android.content.Context;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6484a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final HashMap c = new HashMap();
    public final B0 d = new B0(this);

    public C0() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.C0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0.a(C0.this);
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void a(C0 c0) {
        Lazy lazy = G0.f6569a;
        J0 j0 = (J0) G0.f6569a.getValue();
        B0 listener = c0.d;
        j0.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        j0.b = new WeakReference(listener);
    }

    public static final Unit b(C0 c0) {
        c0.f6484a.set(true);
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new A0(c0, (AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class), null), 3, null);
        return Unit.INSTANCE;
    }

    public final void a() {
        AbstractC3638d.a(new Function0() { // from class: com.inmobi.media.C0$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0.b(C0.this);
            }
        });
    }

    public static void a(AdQualityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new C4255z0(result, null), 1, null);
            if (result.getImageLocation().length() == 0) {
                return;
            }
            String str = "delete file result - " + new File(result.getImageLocation()).delete();
        } catch (Exception unused) {
        }
    }
}
