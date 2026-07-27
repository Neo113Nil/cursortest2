package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Bm {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3923n1 f6481a;
    public final HashMap b;

    public Bm(AbstractC3923n1 timeOutInformer) {
        Intrinsics.checkNotNullParameter(timeOutInformer, "timeOutInformer");
        this.f6481a = timeOutInformer;
        this.b = new HashMap();
    }

    public final boolean a(byte b, long j) {
        Intrinsics.checkNotNullExpressionValue("Bm", "TAG");
        String str = "Starting timer " + ((int) b) + ServerSentEventKt.SPACE + j;
        if (this.b.containsKey(Byte.valueOf(b))) {
            a(b);
        }
        try {
            Timer timer = new Timer("Bm");
            this.b.put(Byte.valueOf(b), timer);
            timer.schedule(new Am(this, b), j);
            return true;
        } catch (InternalError e) {
            Intrinsics.checkNotNullExpressionValue("Bm", "TAG");
            String str2 = "Error occurred initialising Timer - " + e;
            return false;
        }
    }

    public final void b(final byte b) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.Bm$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Bm.a(Bm.this, b);
            }
        });
    }

    public static final void a(Bm bm, byte b) {
        bm.f6481a.a(b);
    }

    public final void a(byte b) {
        Intrinsics.checkNotNullExpressionValue("Bm", "TAG");
        String str = "Cancelling timer " + ((int) b);
        Timer timer = (Timer) this.b.get(Byte.valueOf(b));
        if (timer != null) {
            timer.cancel();
            this.b.remove(Byte.valueOf(b));
        }
    }
}
