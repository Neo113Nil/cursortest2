package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes6.dex */
public final class J3 {

    /* renamed from: a, reason: collision with root package name */
    public final M3 f6640a;

    public J3(M3 mEventHandler) {
        Intrinsics.checkNotNullParameter(mEventHandler, "mEventHandler");
        this.f6640a = mEventHandler;
    }

    public static final Unit b(C4066s3 c4066s3) {
        X3 x3 = X3.f6941a;
        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
        String str = "Pinging click (" + c4066s3.b + ") via WebView timed out!";
        return Unit.INSTANCE;
    }

    public final void a(final C4066s3 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.J3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                J3.a(C4066s3.this, this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.inmobi.media.Aq] */
    public static final void a(final C4066s3 c4066s3, J3 j3) {
        String str = c4066s3.b;
        X3 x3 = X3.f6941a;
        Kf kf = new Kf(str, X3.a(c4066s3), null, null, null, false, 60);
        int pingTimeout = X3.c().getPingTimeout();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? aq = new Aq(kf, new I3(new AtomicBoolean(false), objectRef, j3, c4066s3), pingTimeout * 1000, new Function0() { // from class: com.inmobi.media.J3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return J3.b(C4066s3.this);
            }
        });
        objectRef.element = aq;
        aq.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AtomicBoolean atomicBoolean, Ref.ObjectRef objectRef, J3 j3, C4066s3 c4066s3, boolean z) {
        if (atomicBoolean.compareAndSet(false, true)) {
            Aq aq = (Aq) objectRef.element;
            if (aq != null) {
                aq.a();
            }
            if (z) {
                j3.f6640a.a(c4066s3);
            } else {
                j3.f6640a.a(c4066s3, B6.d);
            }
        }
    }
}
