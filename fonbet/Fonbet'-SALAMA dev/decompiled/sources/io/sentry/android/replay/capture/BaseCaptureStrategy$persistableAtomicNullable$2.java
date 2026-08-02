package io.sentry.android.replay.capture;

import A6.d;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.ExecutorsKt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import s6.a;
import s6.o;
import t6.h;
import w6.b;

/* loaded from: classes2.dex */
public final class BaseCaptureStrategy$persistableAtomicNullable$2 implements b {
    final /* synthetic */ o $onChange;
    final /* synthetic */ String $propertyName;
    final /* synthetic */ BaseCaptureStrategy this$0;
    private final AtomicReference<T> value;

    public BaseCaptureStrategy$persistableAtomicNullable$2(T t7, BaseCaptureStrategy baseCaptureStrategy, o oVar, String str) {
        this.this$0 = baseCaptureStrategy;
        this.$onChange = oVar;
        this.$propertyName = str;
        this.value = new AtomicReference<>(t7);
    }

    private final void runInBackground(final a aVar) {
        SentryOptions sentryOptions;
        SentryOptions sentryOptions2;
        ScheduledExecutorService persistingExecutor;
        SentryOptions sentryOptions3;
        sentryOptions = this.this$0.options;
        if (sentryOptions.getThreadChecker().isMainThread()) {
            persistingExecutor = this.this$0.getPersistingExecutor();
            sentryOptions3 = this.this$0.options;
            ExecutorsKt.submitSafely(persistingExecutor, sentryOptions3, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.invoke();
                }
            });
        } else {
            try {
                aVar.invoke();
            } catch (Throwable th) {
                sentryOptions2 = this.this$0.options;
                sentryOptions2.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
    @Override // w6.a
    public T getValue(Object obj, d dVar) {
        h.e(dVar, "property");
        return this.value.get();
    }

    @Override // w6.b
    public void setValue(Object obj, d dVar, T t7) {
        h.e(dVar, "property");
        Object andSet = this.value.getAndSet(t7);
        if (h.a(andSet, t7)) {
            return;
        }
        runInBackground(new BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(this.$onChange, this.$propertyName, andSet, t7));
    }
}
