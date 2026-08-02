package io.sentry.android.replay.capture;

import f6.C1116i;
import io.sentry.android.replay.ReplayCache;
import s6.o;
import t6.i;

/* loaded from: classes2.dex */
public final class BaseCaptureStrategy$persistableAtomicNullable$1 extends i implements o {
    final /* synthetic */ String $propertyName;
    final /* synthetic */ BaseCaptureStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCaptureStrategy$persistableAtomicNullable$1(BaseCaptureStrategy baseCaptureStrategy, String str) {
        super(3);
        this.this$0 = baseCaptureStrategy;
        this.$propertyName = str;
    }

    @Override // s6.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((String) obj, obj2, obj3);
        return C1116i.f13008a;
    }

    public final void invoke(String str, Object obj, Object obj2) {
        ReplayCache cache = this.this$0.getCache();
        if (cache != null) {
            cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName, String.valueOf(obj2));
        }
    }
}
