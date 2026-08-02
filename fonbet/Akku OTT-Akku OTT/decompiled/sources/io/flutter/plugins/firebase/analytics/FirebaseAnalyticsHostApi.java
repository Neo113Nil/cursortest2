package io.flutter.plugins.firebase.analytics;

import androidx.compose.runtime.C0224r;
import androidx.core.app.NotificationCompat;
import androidx.credentials.playservices.p;
import androidx.credentials.playservices.q;
import androidx.credentials.playservices.s;
import androidx.media3.common.C0325j;
import androidx.media3.common.C0332q;
import androidx.media3.common.C0333r;
import androidx.media3.exoplayer.analytics.C0361i0;
import androidx.media3.exoplayer.analytics.O;
import dev.fluttercommunity.workmanager.pigeon.A;
import dev.fluttercommunity.workmanager.pigeon.t;
import dev.fluttercommunity.workmanager.pigeon.u;
import dev.fluttercommunity.workmanager.pigeon.w;
import dev.fluttercommunity.workmanager.pigeon.x;
import dev.fluttercommunity.workmanager.pigeon.y;
import dev.fluttercommunity.workmanager.pigeon.z;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ8\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00030\bH&J,\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00030\bH&J4\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00030\bH&J*\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00030\bH&J\"\u0010\u0012\u001a\u00020\u00032\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00030\bH&J*\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00030\bH&J8\u0010\u0016\u001a\u00020\u00032\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00052\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00030\bH&J:\u0010\u0018\u001a\u00020\u00032\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00030\bH&J$\u0010\u001a\u001a\u00020\u00032\u001a\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t\u0012\u0004\u0012\u00020\u00030\bH&J$\u0010\u001b\u001a\u00020\u00032\u001a\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\t\u0012\u0004\u0012\u00020\u00030\bH&J8\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lio/flutter/plugins/firebase/analytics/FirebaseAnalyticsHostApi;", "", "logEvent", "", NotificationCompat.CATEGORY_EVENT, "", "", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "setUserId", Constants.USER_ID, "setUserProperty", "name", "value", "setAnalyticsCollectionEnabled", "enabled", "", "resetAnalyticsData", "setSessionTimeoutDuration", "timeout", "", "setConsent", "consent", "setDefaultEventParameters", Constants.PARAMETERS, "getAppInstanceId", "getSessionId", "initiateOnDeviceConversionMeasurement", "arguments", "Companion", "firebase_analytics_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FirebaseAnalyticsHostApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/flutter/plugins/firebase/analytics/FirebaseAnalyticsHostApi$Companion;", "", "<init>", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "setUp", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/firebase/analytics/FirebaseAnalyticsHostApi;", "messageChannelSuffix", "", "firebase_analytics_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final Lazy<GeneratedAndroidFirebaseAnalyticsPigeonCodec> codec = LazyKt.lazy(new a());

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GeneratedAndroidFirebaseAnalyticsPigeonCodec codec_delegate$lambda$0() {
            return new GeneratedAndroidFirebaseAnalyticsPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, firebaseAnalyticsHostApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            firebaseAnalyticsHostApi.logEvent((Map) obj2, new w(reply, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$0$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            firebaseAnalyticsHostApi.setUserId((String) ((List) obj).get(0), new u(reply, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$1$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$10$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
            firebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement((Map) obj2, new c(reply, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$10$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseAnalyticsHostApi.setUserProperty((String) obj2, (String) list.get(1), new A(reply, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$2$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            firebaseAnalyticsHostApi.setAnalyticsCollectionEnabled(((Boolean) obj2).booleanValue(), new y(reply, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$3$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            firebaseAnalyticsHostApi.resetAnalyticsData(new Function1() { // from class: io.flutter.plugins.firebase.analytics.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit up$lambda$4$0$0;
                    up$lambda$4$0$0 = FirebaseAnalyticsHostApi.Companion.setUp$lambda$4$0$0(BasicMessageChannel.Reply.this, (Result) obj2);
                    return up$lambda$4$0$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$4$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$5$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            firebaseAnalyticsHostApi.setSessionTimeoutDuration(((Long) obj2).longValue(), new b(reply, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$5$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
            firebaseAnalyticsHostApi.setConsent((Map) obj2, new z(reply, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$6$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$7$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            firebaseAnalyticsHostApi.setDefaultEventParameters((Map) ((List) obj).get(0), new t(reply, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$7$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$8$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            firebaseAnalyticsHostApi.getAppInstanceId(new C0224r(reply, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$8$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m1722isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult((String) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$9$0(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            firebaseAnalyticsHostApi.getSessionId(new x(reply, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$9$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m1722isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult((Long) value));
            }
            return Unit.INSTANCE;
        }

        public final MessageCodec<Object> getCodec() {
            return codec.getValue();
        }

        @JvmOverloads
        public final void setUp(BinaryMessenger binaryMessenger, FirebaseAnalyticsHostApi firebaseAnalyticsHostApi) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, firebaseAnalyticsHostApi, null, 4, null);
        }

        @JvmOverloads
        public final void setUp(BinaryMessenger binaryMessenger, FirebaseAnalyticsHostApi api, String messageChannelSuffix) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
            String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logEvent", concat), getCodec());
            if (api != null) {
                basicMessageChannel.setMessageHandler(new androidx.credentials.playservices.a(api));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserId", concat), getCodec());
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new defpackage.e(api, 4));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserProperty", concat), getCodec());
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new defpackage.f(api, 5));
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setAnalyticsCollectionEnabled", concat), getCodec());
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new p(api, 4));
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.resetAnalyticsData", concat), getCodec());
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new q(api, 6));
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setSessionTimeoutDuration", concat), getCodec());
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new C0332q(api, 2));
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setConsent", concat), getCodec());
            if (api != null) {
                basicMessageChannel7.setMessageHandler(new s(api, 6));
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setDefaultEventParameters", concat), getCodec());
            if (api != null) {
                basicMessageChannel8.setMessageHandler(new C0333r(api, 3));
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getAppInstanceId", concat), getCodec());
            if (api != null) {
                basicMessageChannel9.setMessageHandler(new C0361i0(api, 3));
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getSessionId", concat), getCodec());
            if (api != null) {
                basicMessageChannel10.setMessageHandler(new O(api));
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement", concat), getCodec());
            if (api != null) {
                basicMessageChannel11.setMessageHandler(new C0325j(api, 7));
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
        }
    }

    void getAppInstanceId(Function1<? super Result<String>, Unit> callback);

    void getSessionId(Function1<? super Result<Long>, Unit> callback);

    void initiateOnDeviceConversionMeasurement(Map<String, String> arguments, Function1<? super Result<Unit>, Unit> callback);

    void logEvent(Map<String, ? extends Object> event, Function1<? super Result<Unit>, Unit> callback);

    void resetAnalyticsData(Function1<? super Result<Unit>, Unit> callback);

    void setAnalyticsCollectionEnabled(boolean enabled, Function1<? super Result<Unit>, Unit> callback);

    void setConsent(Map<String, Boolean> consent, Function1<? super Result<Unit>, Unit> callback);

    void setDefaultEventParameters(Map<String, ? extends Object> parameters, Function1<? super Result<Unit>, Unit> callback);

    void setSessionTimeoutDuration(long timeout, Function1<? super Result<Unit>, Unit> callback);

    void setUserId(String userId, Function1<? super Result<Unit>, Unit> callback);

    void setUserProperty(String name, String value, Function1<? super Result<Unit>, Unit> callback);
}
