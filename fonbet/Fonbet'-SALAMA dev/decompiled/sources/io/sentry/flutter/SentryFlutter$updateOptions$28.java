package io.sentry.flutter;

import f6.C1116i;
import io.sentry.SentryReplayOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.SdkVersion;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class SentryFlutter$updateOptions$28 extends i implements Function1 {
    final /* synthetic */ Map<String, Object> $data;
    final /* synthetic */ SentryAndroidOptions $options;
    final /* synthetic */ SentryFlutter this$0;

    /* renamed from: io.sentry.flutter.SentryFlutter$updateOptions$28$1, reason: invalid class name */
    public static final class AnonymousClass1 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, ? extends Object>) obj);
            return C1116i.f13008a;
        }

        public final void invoke(Map<String, ? extends Object> map) {
            h.e(map, "it");
            SentryReplayOptions sessionReplay = this.$options.getSessionReplay();
            Object obj = map.get("name");
            h.c(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = map.get("version");
            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
            sessionReplay.setSdkVersion(new SdkVersion((String) obj, (String) obj2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentryFlutter$updateOptions$28(SentryFlutter sentryFlutter, SentryAndroidOptions sentryAndroidOptions, Map<String, ? extends Object> map) {
        super(1);
        this.this$0 = sentryFlutter;
        this.$options = sentryAndroidOptions;
        this.$data = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, ? extends Object>) obj);
        return C1116i.f13008a;
    }

    public final void invoke(Map<String, ? extends Object> map) {
        h.e(map, "replayArgs");
        this.this$0.updateReplayOptions(this.$options, map);
        SentryFlutterKt.getIfNotNull(this.$data, "sdk", new AnonymousClass1(this.$options));
    }
}
