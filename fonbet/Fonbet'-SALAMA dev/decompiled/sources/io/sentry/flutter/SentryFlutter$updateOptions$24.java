package io.sentry.flutter;

import f6.C1116i;
import io.sentry.protocol.SdkVersion;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;
import t6.p;

/* loaded from: classes2.dex */
public final class SentryFlutter$updateOptions$24 extends i implements Function1 {
    final /* synthetic */ p $sdkVersion;

    /* renamed from: io.sentry.flutter.SentryFlutter$updateOptions$24$1, reason: invalid class name */
    public static final class AnonymousClass1 extends i implements Function1 {
        final /* synthetic */ p $sdkVersion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar) {
            super(1);
            this.$sdkVersion = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<String>) obj);
            return C1116i.f13008a;
        }

        public final void invoke(List<String> list) {
            h.e(list, "it");
            p pVar = this.$sdkVersion;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((SdkVersion) pVar.f16472a).addIntegration((String) it.next());
            }
        }
    }

    /* renamed from: io.sentry.flutter.SentryFlutter$updateOptions$24$2, reason: invalid class name */
    public static final class AnonymousClass2 extends i implements Function1 {
        final /* synthetic */ p $sdkVersion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(p pVar) {
            super(1);
            this.$sdkVersion = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends Map<String, String>>) obj);
            return C1116i.f13008a;
        }

        public final void invoke(List<? extends Map<String, String>> list) {
            h.e(list, "it");
            p pVar = this.$sdkVersion;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                SdkVersion sdkVersion = (SdkVersion) pVar.f16472a;
                Object obj = map.get("name");
                h.c(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = map.get("version");
                h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                sdkVersion.addPackage((String) obj, (String) obj2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentryFlutter$updateOptions$24(p pVar) {
        super(1);
        this.$sdkVersion = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, ? extends Object>) obj);
        return C1116i.f13008a;
    }

    public final void invoke(Map<String, ? extends Object> map) {
        h.e(map, "flutterSdk");
        SentryFlutterKt.getIfNotNull(map, SdkVersion.JsonKeys.INTEGRATIONS, new AnonymousClass1(this.$sdkVersion));
        SentryFlutterKt.getIfNotNull(map, SdkVersion.JsonKeys.PACKAGES, new AnonymousClass2(this.$sdkVersion));
    }
}
