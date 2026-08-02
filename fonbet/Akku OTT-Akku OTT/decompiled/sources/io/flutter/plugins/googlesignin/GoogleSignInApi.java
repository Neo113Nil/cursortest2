package io.flutter.plugins.googlesignin;

import androidx.activity.J;
import androidx.media3.common.e0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.auth.Constants;
import io.flutter.plugins.firebase.auth.m;
import io.flutter.plugins.googlesignin.GoogleSignInApi;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH&J\"\u0010\f\u001a\u00020\u00052\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00020\u00050\tH&J*\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00020\u00050\tH&J2\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0004\u0012\u00020\u00050\tH&J*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00152\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00020\u00050\tH&¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lio/flutter/plugins/googlesignin/GoogleSignInApi;", "", "getGoogleServicesJsonServerClientId", "", "getCredential", "", "params", "Lio/flutter/plugins/googlesignin/GetCredentialRequestParams;", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "Lio/flutter/plugins/googlesignin/GetCredentialResult;", "clearCredentialState", "clearAuthorizationToken", Constants.TOKEN, "authorize", "Lio/flutter/plugins/googlesignin/PlatformAuthorizationRequest;", "promptIfUnauthorized", "", "Lio/flutter/plugins/googlesignin/AuthorizeResult;", "revokeAccess", "Lio/flutter/plugins/googlesignin/PlatformRevokeAccessRequest;", "Companion", "google_sign_in_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GoogleSignInApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/flutter/plugins/googlesignin/GoogleSignInApi$Companion;", "", "<init>", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "setUp", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/googlesignin/GoogleSignInApi;", "messageChannelSuffix", "", "google_sign_in_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final Lazy<MessagesPigeonCodec> codec = LazyKt.lazy(new f());

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesPigeonCodec codec_delegate$lambda$0() {
            return new MessagesPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, GoogleSignInApi googleSignInApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, googleSignInApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(GoogleSignInApi googleSignInApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            try {
                wrapError = CollectionsKt.listOf(googleSignInApi.getGoogleServicesJsonServerClientId());
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
            googleSignInApi.getCredential((GetCredentialRequestParams) obj2, new Function1() { // from class: io.flutter.plugins.googlesignin.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    Unit up$lambda$1$0$0;
                    up$lambda$1$0$0 = GoogleSignInApi.Companion.setUp$lambda$1$0$0(BasicMessageChannel.Reply.this, (Result) obj3);
                    return up$lambda$1$0$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$1$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m1722isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((GetCredentialResult) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            googleSignInApi.clearCredentialState(new Function1() { // from class: io.flutter.plugins.googlesignin.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit up$lambda$2$0$0;
                    up$lambda$2$0$0 = GoogleSignInApi.Companion.setUp$lambda$2$0$0(BasicMessageChannel.Reply.this, (Result) obj2);
                    return up$lambda$2$0$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$2$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(GoogleSignInApi googleSignInApi, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            googleSignInApi.clearAuthorizationToken((String) obj2, new d(reply, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$3$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$0(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            googleSignInApi.authorize((PlatformAuthorizationRequest) obj2, ((Boolean) obj3).booleanValue(), new Function1() { // from class: io.flutter.plugins.googlesignin.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Unit up$lambda$4$0$0;
                    up$lambda$4$0$0 = GoogleSignInApi.Companion.setUp$lambda$4$0$0(BasicMessageChannel.Reply.this, (Result) obj4);
                    return up$lambda$4$0$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$4$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m1722isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((AuthorizeResult) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$5$0(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
            googleSignInApi.revokeAccess((PlatformRevokeAccessRequest) obj2, new Function1() { // from class: io.flutter.plugins.googlesignin.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    Unit up$lambda$5$0$0;
                    up$lambda$5$0$0 = GoogleSignInApi.Companion.setUp$lambda$5$0$0(BasicMessageChannel.Reply.this, (Result) obj3);
                    return up$lambda$5$0$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$5$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            if (m1719exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(m1719exceptionOrNullimpl));
            } else {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult(null));
            }
            return Unit.INSTANCE;
        }

        public final MessageCodec<Object> getCodec() {
            return codec.getValue();
        }

        @JvmOverloads
        public final void setUp(BinaryMessenger binaryMessenger, GoogleSignInApi googleSignInApi) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, googleSignInApi, null, 4, null);
        }

        @JvmOverloads
        public final void setUp(BinaryMessenger binaryMessenger, GoogleSignInApi api, String messageChannelSuffix) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
            String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getGoogleServicesJsonServerClientId", concat), getCodec());
            if (api != null) {
                basicMessageChannel.setMessageHandler(new com.google.android.datatransport.cct.b(api, 3));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getCredential", concat), getCodec());
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugins.firebase.auth.d(api, 2));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearCredentialState", concat), getCodec());
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new J(api, 3));
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthorizationToken", concat), getCodec());
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugins.firebase.auth.e(api, 2));
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.authorize", concat), getCodec());
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new m(api, 1));
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.revokeAccess", concat), getCodec());
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new e0(api, 3));
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
        }
    }

    void authorize(PlatformAuthorizationRequest params, boolean promptIfUnauthorized, Function1<? super Result<? extends AuthorizeResult>, Unit> callback);

    void clearAuthorizationToken(String token, Function1<? super Result<Unit>, Unit> callback);

    void clearCredentialState(Function1<? super Result<Unit>, Unit> callback);

    void getCredential(GetCredentialRequestParams params, Function1<? super Result<? extends GetCredentialResult>, Unit> callback);

    String getGoogleServicesJsonServerClientId();

    void revokeAccess(PlatformRevokeAccessRequest params, Function1<? super Result<Unit>, Unit> callback);
}
