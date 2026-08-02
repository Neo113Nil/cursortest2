package io.flutter.plugins.firebase.auth;

import android.util.Log;
import androidx.activity.J;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.C;
import androidx.media3.common.A;
import androidx.media3.common.B;
import androidx.media3.common.C0333r;
import androidx.media3.common.C0335t;
import androidx.media3.common.C0336u;
import androidx.media3.common.C0337v;
import androidx.media3.common.C0340y;
import androidx.media3.common.C0341z;
import androidx.media3.common.D;
import androidx.media3.common.F;
import androidx.media3.common.G;
import androidx.media3.common.H;
import androidx.media3.common.I;
import androidx.media3.common.K;
import androidx.media3.common.L;
import androidx.media3.common.Y;
import androidx.media3.common.e0;
import androidx.media3.exoplayer.analytics.C0348c;
import androidx.media3.exoplayer.analytics.C0361i0;
import androidx.media3.exoplayer.source.v;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.work.WorkInfo;
import com.facebook.internal.C0710f;
import com.google.android.exoplayer2.C0799v0;
import com.google.android.exoplayer2.L0;
import com.google.android.exoplayer2.V0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class GeneratedAndroidFirebaseAuth {

    public enum ActionCodeInfoOperation {
        UNKNOWN(0),
        PASSWORD_RESET(1),
        VERIFY_EMAIL(2),
        RECOVER_EMAIL(3),
        EMAIL_SIGN_IN(4),
        VERIFY_AND_CHANGE_EMAIL(5),
        REVERT_SECOND_FACTOR_ADDITION(6);

        final int index;

        ActionCodeInfoOperation(int i) {
            this.index = i;
        }
    }

    public static final class AuthPigeonFirebaseApp {

        @NonNull
        private String appName;

        @Nullable
        private String customAuthDomain;

        @Nullable
        private String tenantId;

        public static final class Builder {

            @Nullable
            private String appName;

            @Nullable
            private String customAuthDomain;

            @Nullable
            private String tenantId;

            @NonNull
            public AuthPigeonFirebaseApp build() {
                AuthPigeonFirebaseApp authPigeonFirebaseApp = new AuthPigeonFirebaseApp();
                authPigeonFirebaseApp.setAppName(this.appName);
                authPigeonFirebaseApp.setTenantId(this.tenantId);
                authPigeonFirebaseApp.setCustomAuthDomain(this.customAuthDomain);
                return authPigeonFirebaseApp;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAppName(@NonNull String str) {
                this.appName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCustomAuthDomain(@Nullable String str) {
                this.customAuthDomain = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTenantId(@Nullable String str) {
                this.tenantId = str;
                return this;
            }
        }

        @NonNull
        public static AuthPigeonFirebaseApp fromList(@NonNull ArrayList<Object> arrayList) {
            AuthPigeonFirebaseApp authPigeonFirebaseApp = new AuthPigeonFirebaseApp();
            authPigeonFirebaseApp.setAppName((String) arrayList.get(0));
            authPigeonFirebaseApp.setTenantId((String) arrayList.get(1));
            authPigeonFirebaseApp.setCustomAuthDomain((String) arrayList.get(2));
            return authPigeonFirebaseApp;
        }

        @NonNull
        public String getAppName() {
            return this.appName;
        }

        @Nullable
        public String getCustomAuthDomain() {
            return this.customAuthDomain;
        }

        @Nullable
        public String getTenantId() {
            return this.tenantId;
        }

        public void setAppName(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.appName = str;
        }

        public void setCustomAuthDomain(@Nullable String str) {
            this.customAuthDomain = str;
        }

        public void setTenantId(@Nullable String str) {
            this.tenantId = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.appName);
            arrayList.add(this.tenantId);
            arrayList.add(this.customAuthDomain);
            return arrayList;
        }
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
    }

    public interface FirebaseAuthHostApi {
        @NonNull
        static MessageCodec<Object> getCodec() {
            return FirebaseAuthHostApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$0(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            firebaseAuthHostApi.registerIdTokenListener((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.1
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$1(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            firebaseAuthHostApi.registerAuthStateListener((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.2
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$10(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.signInWithEmailAndPassword((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.11
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$11(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.signInWithEmailLink((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.12
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$12(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.signInWithProvider((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonSignInProvider) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.13
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$13(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            firebaseAuthHostApi.signOut((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.14
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$14(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.fetchSignInMethodsForEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<List<String>>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.15
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(List<String> list) {
                    arrayList.add(0, list);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$15(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.sendPasswordResetEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonActionCodeSettings) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.16
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$16(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.sendSignInLinkToEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonActionCodeSettings) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.17
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$17(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.setLanguageCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.18
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$18(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.setSettings((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonFirebaseAuthSettings) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.19
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$19(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.verifyPasswordResetCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.20
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$2(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            AuthPigeonFirebaseApp authPigeonFirebaseApp = (AuthPigeonFirebaseApp) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            Number number = (Number) arrayList2.get(2);
            firebaseAuthHostApi.useEmulator(authPigeonFirebaseApp, str, number == null ? null : Long.valueOf(number.longValue()), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.3
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$20(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.verifyPhoneNumber((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonVerifyPhoneNumberRequest) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.21
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$21(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.revokeTokenWithAuthorizationCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.22
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$22(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            firebaseAuthHostApi.initializeRecaptchaConfig((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.23
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$3(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.applyActionCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.4
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$4(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.checkActionCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonActionCodeInfo>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.5
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonActionCodeInfo pigeonActionCodeInfo) {
                    arrayList.add(0, pigeonActionCodeInfo);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$5(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.confirmPasswordReset((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.6
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$6(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.createUserWithEmailAndPassword((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.7
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$7(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            firebaseAuthHostApi.signInAnonymously((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.8
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$8(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.signInWithCredential((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.9
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$9(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthHostApi.signInWithCustomToken((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.10
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable FirebaseAuthHostApi firebaseAuthHostApi) {
            setUp(binaryMessenger, "", firebaseAuthHostApi);
        }

        void applyActionCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull VoidResult voidResult);

        void checkActionCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonActionCodeInfo> result);

        void confirmPasswordReset(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull String str2, @NonNull VoidResult voidResult);

        void createUserWithEmailAndPassword(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull String str2, @NonNull Result<PigeonUserCredential> result);

        void fetchSignInMethodsForEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<List<String>> result);

        void initializeRecaptchaConfig(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull VoidResult voidResult);

        void registerAuthStateListener(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<String> result);

        void registerIdTokenListener(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<String> result);

        void revokeTokenWithAuthorizationCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull VoidResult voidResult);

        void sendPasswordResetEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @Nullable PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull VoidResult voidResult);

        void sendSignInLinkToEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull VoidResult voidResult);

        void setLanguageCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @Nullable String str, @NonNull Result<String> result);

        void setSettings(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings, @NonNull VoidResult voidResult);

        void signInAnonymously(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<PigeonUserCredential> result);

        void signInWithCredential(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull Result<PigeonUserCredential> result);

        void signInWithCustomToken(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonUserCredential> result);

        void signInWithEmailAndPassword(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull String str2, @NonNull Result<PigeonUserCredential> result);

        void signInWithEmailLink(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull String str2, @NonNull Result<PigeonUserCredential> result);

        void signInWithProvider(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonSignInProvider pigeonSignInProvider, @NonNull Result<PigeonUserCredential> result);

        void signOut(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull VoidResult voidResult);

        void useEmulator(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Long l, @NonNull VoidResult voidResult);

        void verifyPasswordResetCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<String> result);

        void verifyPhoneNumber(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest, @NonNull Result<String> result);

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable FirebaseAuthHostApi firebaseAuthHostApi) {
            String concat = str.isEmpty() ? "" : ".".concat(str);
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerIdTokenListener", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel.setMessageHandler(new C0333r(firebaseAuthHostApi, 4));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerAuthStateListener", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel2.setMessageHandler(new C0335t(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.useEmulator", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel3.setMessageHandler(new androidx.media3.exoplayer.offline.h(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.applyActionCode", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel4.setMessageHandler(new C0799v0(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.checkActionCode", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel5.setMessageHandler(new C0340y(firebaseAuthHostApi, 2));
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.confirmPasswordReset", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel6.setMessageHandler(new C0341z(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.createUserWithEmailAndPassword", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel7.setMessageHandler(new A(firebaseAuthHostApi, 1));
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInAnonymously", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel8.setMessageHandler(new D(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCredential", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel9.setMessageHandler(new C0348c(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCustomToken", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel10.setMessageHandler(new F(firebaseAuthHostApi, 2));
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailAndPassword", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel11.setMessageHandler(new B(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailLink", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel12.setMessageHandler(new G(firebaseAuthHostApi, 5));
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithProvider", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel13.setMessageHandler(new H(firebaseAuthHostApi, 4));
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signOut", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel14.setMessageHandler(new I(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.fetchSignInMethodsForEmail", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel15.setMessageHandler(new com.github.droibit.flutter.plugins.customtabs.b(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendPasswordResetEmail", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel16.setMessageHandler(new K(firebaseAuthHostApi, 5));
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendSignInLinkToEmail", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel17.setMessageHandler(new C(firebaseAuthHostApi, 6));
            } else {
                basicMessageChannel17.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setLanguageCode", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel18.setMessageHandler(new androidx.core.view.D(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel18.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setSettings", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel19.setMessageHandler(new L(firebaseAuthHostApi, 2));
            } else {
                basicMessageChannel19.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPasswordResetCode", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel20.setMessageHandler(new C0361i0(firebaseAuthHostApi, 4));
            } else {
                basicMessageChannel20.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPhoneNumber", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel21.setMessageHandler(new C0336u(firebaseAuthHostApi, 3));
            } else {
                basicMessageChannel21.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.revokeTokenWithAuthorizationCode", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel22.setMessageHandler(new C0337v(firebaseAuthHostApi, 5));
            } else {
                basicMessageChannel22.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.initializeRecaptchaConfig", concat), getCodec());
            if (firebaseAuthHostApi != null) {
                basicMessageChannel23.setMessageHandler(new androidx.fragment.app.o(firebaseAuthHostApi, 5));
            } else {
                basicMessageChannel23.setMessageHandler(null);
            }
        }
    }

    public static class FirebaseAuthHostApiCodec extends StandardMessageCodec {
        public static final FirebaseAuthHostApiCodec INSTANCE = new FirebaseAuthHostApiCodec();

        private FirebaseAuthHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            switch (b) {
                case WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT /* -128 */:
                    return AuthPigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case ComposerKt.defaultsKey /* -127 */:
                    return PigeonActionCodeInfo.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonActionCodeInfoData.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonActionCodeSettings.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonAdditionalUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonAuthCredential.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return PigeonFirebaseAuthSettings.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return PigeonIdTokenResult.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return PigeonMultiFactorSession.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PigeonSignInProvider.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PigeonTotpSecret.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return PigeonUserCredential.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return PigeonUserDetails.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return PigeonUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return PigeonUserProfile.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return PigeonVerifyPhoneNumberRequest.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AuthPigeonFirebaseApp) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AuthPigeonFirebaseApp) obj).toList());
                return;
            }
            if (obj instanceof PigeonActionCodeInfo) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeInfo) obj).toList());
                return;
            }
            if (obj instanceof PigeonActionCodeInfoData) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeInfoData) obj).toList());
                return;
            }
            if (obj instanceof PigeonActionCodeSettings) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeSettings) obj).toList());
                return;
            }
            if (obj instanceof PigeonAdditionalUserInfo) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((PigeonAdditionalUserInfo) obj).toList());
                return;
            }
            if (obj instanceof PigeonAuthCredential) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((PigeonAuthCredential) obj).toList());
                return;
            }
            if (obj instanceof PigeonFirebaseAuthSettings) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((PigeonFirebaseAuthSettings) obj).toList());
                return;
            }
            if (obj instanceof PigeonIdTokenResult) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((PigeonIdTokenResult) obj).toList());
                return;
            }
            if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_DTS_HD);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorInfo) obj).toList());
                return;
            }
            if (obj instanceof PigeonMultiFactorSession) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorSession) obj).toList());
                return;
            }
            if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((PigeonPhoneMultiFactorAssertion) obj).toList());
                return;
            }
            if (obj instanceof PigeonSignInProvider) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_DTS_UHD);
                writeValue(byteArrayOutputStream, ((PigeonSignInProvider) obj).toList());
                return;
            }
            if (obj instanceof PigeonTotpSecret) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((PigeonTotpSecret) obj).toList());
                return;
            }
            if (obj instanceof PigeonUserCredential) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((PigeonUserCredential) obj).toList());
                return;
            }
            if (obj instanceof PigeonUserDetails) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((PigeonUserDetails) obj).toList());
                return;
            }
            if (obj instanceof PigeonUserInfo) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((PigeonUserInfo) obj).toList());
            } else if (obj instanceof PigeonUserProfile) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((PigeonUserProfile) obj).toList());
            } else if (!(obj instanceof PigeonVerifyPhoneNumberRequest)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((PigeonVerifyPhoneNumberRequest) obj).toList());
            }
        }
    }

    public interface FirebaseAuthUserHostApi {
        @NonNull
        static MessageCodec<Object> getCodec() {
            return FirebaseAuthUserHostApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$0(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            firebaseAuthUserHostApi.delete((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.1
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$1(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.getIdToken((AuthPigeonFirebaseApp) arrayList2.get(0), (Boolean) arrayList2.get(1), new Result<PigeonIdTokenResult>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.2
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonIdTokenResult pigeonIdTokenResult) {
                    arrayList.add(0, pigeonIdTokenResult);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$10(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.updatePassword((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.11
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserDetails pigeonUserDetails) {
                    arrayList.add(0, pigeonUserDetails);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$11(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.updatePhoneNumber((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.12
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserDetails pigeonUserDetails) {
                    arrayList.add(0, pigeonUserDetails);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$12(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.updateProfile((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonUserProfile) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.13
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserDetails pigeonUserDetails) {
                    arrayList.add(0, pigeonUserDetails);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$13(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.verifyBeforeUpdateEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonActionCodeSettings) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.14
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$2(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.linkWithCredential((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.3
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$3(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.linkWithProvider((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonSignInProvider) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.4
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$4(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.reauthenticateWithCredential((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.5
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$5(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.reauthenticateWithProvider((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonSignInProvider) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.6
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$6(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            firebaseAuthUserHostApi.reload((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.7
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserDetails pigeonUserDetails) {
                    arrayList.add(0, pigeonUserDetails);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$7(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.sendEmailVerification((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonActionCodeSettings) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.8
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$8(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.unlink((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.9
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$9(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseAuthUserHostApi.updateEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.10
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserDetails pigeonUserDetails) {
                    arrayList.add(0, pigeonUserDetails);
                    reply.reply(arrayList);
                }
            });
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable FirebaseAuthUserHostApi firebaseAuthUserHostApi) {
            setUp(binaryMessenger, "", firebaseAuthUserHostApi);
        }

        void delete(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull VoidResult voidResult);

        void getIdToken(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Boolean bool, @NonNull Result<PigeonIdTokenResult> result);

        void linkWithCredential(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull Result<PigeonUserCredential> result);

        void linkWithProvider(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonSignInProvider pigeonSignInProvider, @NonNull Result<PigeonUserCredential> result);

        void reauthenticateWithCredential(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull Result<PigeonUserCredential> result);

        void reauthenticateWithProvider(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonSignInProvider pigeonSignInProvider, @NonNull Result<PigeonUserCredential> result);

        void reload(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<PigeonUserDetails> result);

        void sendEmailVerification(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @Nullable PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull VoidResult voidResult);

        void unlink(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonUserCredential> result);

        void updateEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonUserDetails> result);

        void updatePassword(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonUserDetails> result);

        void updatePhoneNumber(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull Result<PigeonUserDetails> result);

        void updateProfile(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonUserProfile pigeonUserProfile, @NonNull Result<PigeonUserDetails> result);

        void verifyBeforeUpdateEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @Nullable PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull VoidResult voidResult);

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable FirebaseAuthUserHostApi firebaseAuthUserHostApi) {
            String concat = str.isEmpty() ? "" : ".".concat(str);
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.delete", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel.setMessageHandler(new androidx.window.embedding.d(firebaseAuthUserHostApi, 3));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.getIdToken", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel2.setMessageHandler(new androidx.credentials.playservices.controllers.GetRestoreCredential.h(firebaseAuthUserHostApi));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithCredential", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel3.setMessageHandler(new C0710f(firebaseAuthUserHostApi, 2));
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithProvider", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel4.setMessageHandler(new Y(firebaseAuthUserHostApi, 2));
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithCredential", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel5.setMessageHandler(new com.google.android.datatransport.cct.b(firebaseAuthUserHostApi, 2));
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithProvider", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel6.setMessageHandler(new d(firebaseAuthUserHostApi, 1));
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reload", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel7.setMessageHandler(new com.facebook.appevents.ml.e(firebaseAuthUserHostApi, 1));
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.sendEmailVerification", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel8.setMessageHandler(new androidx.credentials.playservices.controllers.GetRestoreCredential.a(firebaseAuthUserHostApi, 1));
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.unlink", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel9.setMessageHandler(new com.google.android.exoplayer2.analytics.F(firebaseAuthUserHostApi, 2));
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateEmail", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel10.setMessageHandler(new b(firebaseAuthUserHostApi, 1));
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePassword", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel11.setMessageHandler(new androidx.webkit.e(firebaseAuthUserHostApi, 2));
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePhoneNumber", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel12.setMessageHandler(new com.google.android.exoplayer2.extractor.flac.a(firebaseAuthUserHostApi, 2));
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateProfile", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel13.setMessageHandler(new c(firebaseAuthUserHostApi, 1));
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.verifyBeforeUpdateEmail", concat), getCodec());
            if (firebaseAuthUserHostApi != null) {
                basicMessageChannel14.setMessageHandler(new L0(firebaseAuthUserHostApi, 3));
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
        }
    }

    public static class FirebaseAuthUserHostApiCodec extends StandardMessageCodec {
        public static final FirebaseAuthUserHostApiCodec INSTANCE = new FirebaseAuthUserHostApiCodec();

        private FirebaseAuthUserHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            switch (b) {
                case WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT /* -128 */:
                    return AuthPigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case ComposerKt.defaultsKey /* -127 */:
                    return PigeonActionCodeInfo.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonActionCodeInfoData.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonActionCodeSettings.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonAdditionalUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonAuthCredential.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return PigeonFirebaseAuthSettings.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return PigeonIdTokenResult.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return PigeonMultiFactorSession.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PigeonSignInProvider.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PigeonTotpSecret.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return PigeonUserCredential.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return PigeonUserDetails.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return PigeonUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return PigeonUserProfile.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return PigeonVerifyPhoneNumberRequest.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AuthPigeonFirebaseApp) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AuthPigeonFirebaseApp) obj).toList());
                return;
            }
            if (obj instanceof PigeonActionCodeInfo) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeInfo) obj).toList());
                return;
            }
            if (obj instanceof PigeonActionCodeInfoData) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeInfoData) obj).toList());
                return;
            }
            if (obj instanceof PigeonActionCodeSettings) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeSettings) obj).toList());
                return;
            }
            if (obj instanceof PigeonAdditionalUserInfo) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((PigeonAdditionalUserInfo) obj).toList());
                return;
            }
            if (obj instanceof PigeonAuthCredential) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((PigeonAuthCredential) obj).toList());
                return;
            }
            if (obj instanceof PigeonFirebaseAuthSettings) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((PigeonFirebaseAuthSettings) obj).toList());
                return;
            }
            if (obj instanceof PigeonIdTokenResult) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((PigeonIdTokenResult) obj).toList());
                return;
            }
            if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_DTS_HD);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorInfo) obj).toList());
                return;
            }
            if (obj instanceof PigeonMultiFactorSession) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorSession) obj).toList());
                return;
            }
            if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((PigeonPhoneMultiFactorAssertion) obj).toList());
                return;
            }
            if (obj instanceof PigeonSignInProvider) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_DTS_UHD);
                writeValue(byteArrayOutputStream, ((PigeonSignInProvider) obj).toList());
                return;
            }
            if (obj instanceof PigeonTotpSecret) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((PigeonTotpSecret) obj).toList());
                return;
            }
            if (obj instanceof PigeonUserCredential) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((PigeonUserCredential) obj).toList());
                return;
            }
            if (obj instanceof PigeonUserDetails) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((PigeonUserDetails) obj).toList());
                return;
            }
            if (obj instanceof PigeonUserInfo) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((PigeonUserInfo) obj).toList());
            } else if (obj instanceof PigeonUserProfile) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((PigeonUserProfile) obj).toList());
            } else if (!(obj instanceof PigeonVerifyPhoneNumberRequest)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((PigeonVerifyPhoneNumberRequest) obj).toList());
            }
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, @Nullable String str2, @Nullable Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface GenerateInterfaces {
        @NonNull
        static MessageCodec<Object> getCodec() {
            return GenerateInterfacesCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$0(GenerateInterfaces generateInterfaces, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                generateInterfaces.pigeonInterface((PigeonMultiFactorInfo) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = GeneratedAndroidFirebaseAuth.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable GenerateInterfaces generateInterfaces) {
            setUp(binaryMessenger, "", generateInterfaces);
        }

        void pigeonInterface(@NonNull PigeonMultiFactorInfo pigeonMultiFactorInfo);

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable GenerateInterfaces generateInterfaces) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.GenerateInterfaces.pigeonInterface", str.isEmpty() ? "" : ".".concat(str)), getCodec());
            if (generateInterfaces != null) {
                basicMessageChannel.setMessageHandler(new J(generateInterfaces, 2));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    public static class GenerateInterfacesCodec extends StandardMessageCodec {
        public static final GenerateInterfacesCodec INSTANCE = new GenerateInterfacesCodec();

        private GenerateInterfacesCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? super.readValueOfType(b, byteBuffer) : PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof PigeonMultiFactorInfo)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorInfo) obj).toList());
            }
        }
    }

    public interface MultiFactoResolverHostApi {
        @NonNull
        static MessageCodec<Object> getCodec() {
            return MultiFactoResolverHostApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$0(MultiFactoResolverHostApi multiFactoResolverHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            multiFactoResolverHostApi.resolveSignIn((String) arrayList2.get(0), (PigeonPhoneMultiFactorAssertion) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.1
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonUserCredential pigeonUserCredential) {
                    arrayList.add(0, pigeonUserCredential);
                    reply.reply(arrayList);
                }
            });
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable MultiFactoResolverHostApi multiFactoResolverHostApi) {
            setUp(binaryMessenger, "", multiFactoResolverHostApi);
        }

        void resolveSignIn(@NonNull String str, @Nullable PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, @Nullable String str2, @NonNull Result<PigeonUserCredential> result);

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable MultiFactoResolverHostApi multiFactoResolverHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactoResolverHostApi.resolveSignIn", str.isEmpty() ? "" : ".".concat(str)), getCodec());
            if (multiFactoResolverHostApi != null) {
                basicMessageChannel.setMessageHandler(new e(multiFactoResolverHostApi, 1));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    public static class MultiFactoResolverHostApiCodec extends StandardMessageCodec {
        public static final MultiFactoResolverHostApiCodec INSTANCE = new MultiFactoResolverHostApiCodec();

        private MultiFactoResolverHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            switch (b) {
                case WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT /* -128 */:
                    return PigeonAdditionalUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case ComposerKt.defaultsKey /* -127 */:
                    return PigeonAuthCredential.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonUserCredential.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonUserDetails.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonUserInfo.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PigeonAdditionalUserInfo) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((PigeonAdditionalUserInfo) obj).toList());
                return;
            }
            if (obj instanceof PigeonAuthCredential) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((PigeonAuthCredential) obj).toList());
                return;
            }
            if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PigeonPhoneMultiFactorAssertion) obj).toList());
                return;
            }
            if (obj instanceof PigeonUserCredential) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((PigeonUserCredential) obj).toList());
            } else if (obj instanceof PigeonUserDetails) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((PigeonUserDetails) obj).toList());
            } else if (!(obj instanceof PigeonUserInfo)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((PigeonUserInfo) obj).toList());
            }
        }
    }

    public interface MultiFactorTotpHostApi {
        @NonNull
        static MessageCodec<Object> getCodec() {
            return MultiFactorTotpHostApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$0(MultiFactorTotpHostApi multiFactorTotpHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            multiFactorTotpHostApi.generateSecret((String) ((ArrayList) obj).get(0), new Result<PigeonTotpSecret>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.1
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonTotpSecret pigeonTotpSecret) {
                    arrayList.add(0, pigeonTotpSecret);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$1(MultiFactorTotpHostApi multiFactorTotpHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            multiFactorTotpHostApi.getAssertionForEnrollment((String) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.2
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$2(MultiFactorTotpHostApi multiFactorTotpHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            multiFactorTotpHostApi.getAssertionForSignIn((String) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.3
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable MultiFactorTotpHostApi multiFactorTotpHostApi) {
            setUp(binaryMessenger, "", multiFactorTotpHostApi);
        }

        void generateSecret(@NonNull String str, @NonNull Result<PigeonTotpSecret> result);

        void getAssertionForEnrollment(@NonNull String str, @NonNull String str2, @NonNull Result<String> result);

        void getAssertionForSignIn(@NonNull String str, @NonNull String str2, @NonNull Result<String> result);

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable MultiFactorTotpHostApi multiFactorTotpHostApi) {
            String concat = str.isEmpty() ? "" : ".".concat(str);
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret", concat), getCodec());
            if (multiFactorTotpHostApi != null) {
                basicMessageChannel.setMessageHandler(new m(multiFactorTotpHostApi, 0));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment", concat), getCodec());
            if (multiFactorTotpHostApi != null) {
                basicMessageChannel2.setMessageHandler(new e0(multiFactorTotpHostApi, 2));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn", concat), getCodec());
            if (multiFactorTotpHostApi != null) {
                basicMessageChannel3.setMessageHandler(new com.akku.ottapp.d(multiFactorTotpHostApi));
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
        }
    }

    public static class MultiFactorTotpHostApiCodec extends StandardMessageCodec {
        public static final MultiFactorTotpHostApiCodec INSTANCE = new MultiFactorTotpHostApiCodec();

        private MultiFactorTotpHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? super.readValueOfType(b, byteBuffer) : PigeonTotpSecret.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof PigeonTotpSecret)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((PigeonTotpSecret) obj).toList());
            }
        }
    }

    public interface MultiFactorTotpSecretHostApi {
        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$0(MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            multiFactorTotpSecretHostApi.generateQrCodeUrl((String) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.1
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$1(MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            multiFactorTotpSecretHostApi.openInOtpApp((String) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.2
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi) {
            setUp(binaryMessenger, "", multiFactorTotpSecretHostApi);
        }

        void generateQrCodeUrl(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull Result<String> result);

        void openInOtpApp(@NonNull String str, @NonNull String str2, @NonNull VoidResult voidResult);

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi) {
            String concat = str.isEmpty() ? "" : ".".concat(str);
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl", concat), getCodec());
            if (multiFactorTotpSecretHostApi != null) {
                basicMessageChannel.setMessageHandler(new v(multiFactorTotpSecretHostApi));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp", concat), getCodec());
            if (multiFactorTotpSecretHostApi != null) {
                basicMessageChannel2.setMessageHandler(new com.akku.ottapp.e(multiFactorTotpSecretHostApi));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    public interface MultiFactorUserHostApi {
        @NonNull
        static MessageCodec<Object> getCodec() {
            return MultiFactorUserHostApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$0(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            multiFactorUserHostApi.enrollPhone((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonPhoneMultiFactorAssertion) arrayList2.get(1), (String) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.1
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$1(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            multiFactorUserHostApi.enrollTotp((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.2
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$2(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            multiFactorUserHostApi.getSession((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<PigeonMultiFactorSession>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.3
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(PigeonMultiFactorSession pigeonMultiFactorSession) {
                    arrayList.add(0, pigeonMultiFactorSession);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$3(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            multiFactorUserHostApi.unenroll((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.4
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$4(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            multiFactorUserHostApi.getEnrolledFactors((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<List<PigeonMultiFactorInfo>>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.5
                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                public void success(List<PigeonMultiFactorInfo> list) {
                    arrayList.add(0, list);
                    reply.reply(arrayList);
                }
            });
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable MultiFactorUserHostApi multiFactorUserHostApi) {
            setUp(binaryMessenger, "", multiFactorUserHostApi);
        }

        void enrollPhone(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, @Nullable String str, @NonNull VoidResult voidResult);

        void enrollTotp(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @Nullable String str2, @NonNull VoidResult voidResult);

        void getEnrolledFactors(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<List<PigeonMultiFactorInfo>> result);

        void getSession(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<PigeonMultiFactorSession> result);

        void unenroll(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull VoidResult voidResult);

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable MultiFactorUserHostApi multiFactorUserHostApi) {
            String concat = str.isEmpty() ? "" : ".".concat(str);
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone", concat), getCodec());
            if (multiFactorUserHostApi != null) {
                basicMessageChannel.setMessageHandler(new androidx.activity.result.a(multiFactorUserHostApi));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp", concat), getCodec());
            if (multiFactorUserHostApi != null) {
                basicMessageChannel2.setMessageHandler(new V0(multiFactorUserHostApi));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession", concat), getCodec());
            if (multiFactorUserHostApi != null) {
                basicMessageChannel3.setMessageHandler(new n(multiFactorUserHostApi));
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll", concat), getCodec());
            if (multiFactorUserHostApi != null) {
                basicMessageChannel4.setMessageHandler(new h(multiFactorUserHostApi));
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors", concat), getCodec());
            if (multiFactorUserHostApi != null) {
                basicMessageChannel5.setMessageHandler(new o(multiFactorUserHostApi));
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
        }
    }

    public static class MultiFactorUserHostApiCodec extends StandardMessageCodec {
        public static final MultiFactorUserHostApiCodec INSTANCE = new MultiFactorUserHostApiCodec();

        private MultiFactorUserHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            switch (b) {
                case WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT /* -128 */:
                    return AuthPigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case ComposerKt.defaultsKey /* -127 */:
                    return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonMultiFactorSession.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AuthPigeonFirebaseApp) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AuthPigeonFirebaseApp) obj).toList());
                return;
            }
            if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorInfo) obj).toList());
            } else if (obj instanceof PigeonMultiFactorSession) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorSession) obj).toList());
            } else if (!(obj instanceof PigeonPhoneMultiFactorAssertion)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((PigeonPhoneMultiFactorAssertion) obj).toList());
            }
        }
    }

    public interface NullableResult<T> {
        void error(@NonNull Throwable th);

        void success(@Nullable T t);
    }

    public static final class PigeonActionCodeInfo {

        @NonNull
        private PigeonActionCodeInfoData data;

        @NonNull
        private ActionCodeInfoOperation operation;

        public static final class Builder {

            @Nullable
            private PigeonActionCodeInfoData data;

            @Nullable
            private ActionCodeInfoOperation operation;

            @NonNull
            public PigeonActionCodeInfo build() {
                PigeonActionCodeInfo pigeonActionCodeInfo = new PigeonActionCodeInfo();
                pigeonActionCodeInfo.setOperation(this.operation);
                pigeonActionCodeInfo.setData(this.data);
                return pigeonActionCodeInfo;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setData(@NonNull PigeonActionCodeInfoData pigeonActionCodeInfoData) {
                this.data = pigeonActionCodeInfoData;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOperation(@NonNull ActionCodeInfoOperation actionCodeInfoOperation) {
                this.operation = actionCodeInfoOperation;
                return this;
            }
        }

        @NonNull
        public static PigeonActionCodeInfo fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonActionCodeInfo pigeonActionCodeInfo = new PigeonActionCodeInfo();
            pigeonActionCodeInfo.setOperation(ActionCodeInfoOperation.values()[((Integer) arrayList.get(0)).intValue()]);
            pigeonActionCodeInfo.setData((PigeonActionCodeInfoData) arrayList.get(1));
            return pigeonActionCodeInfo;
        }

        @NonNull
        public PigeonActionCodeInfoData getData() {
            return this.data;
        }

        @NonNull
        public ActionCodeInfoOperation getOperation() {
            return this.operation;
        }

        public void setData(@NonNull PigeonActionCodeInfoData pigeonActionCodeInfoData) {
            if (pigeonActionCodeInfoData == null) {
                throw new IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.data = pigeonActionCodeInfoData;
        }

        public void setOperation(@NonNull ActionCodeInfoOperation actionCodeInfoOperation) {
            if (actionCodeInfoOperation == null) {
                throw new IllegalStateException("Nonnull field \"operation\" is null.");
            }
            this.operation = actionCodeInfoOperation;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            ActionCodeInfoOperation actionCodeInfoOperation = this.operation;
            arrayList.add(actionCodeInfoOperation == null ? null : Integer.valueOf(actionCodeInfoOperation.index));
            arrayList.add(this.data);
            return arrayList;
        }
    }

    public static final class PigeonActionCodeInfoData {

        @Nullable
        private String email;

        @Nullable
        private String previousEmail;

        public static final class Builder {

            @Nullable
            private String email;

            @Nullable
            private String previousEmail;

            @NonNull
            public PigeonActionCodeInfoData build() {
                PigeonActionCodeInfoData pigeonActionCodeInfoData = new PigeonActionCodeInfoData();
                pigeonActionCodeInfoData.setEmail(this.email);
                pigeonActionCodeInfoData.setPreviousEmail(this.previousEmail);
                return pigeonActionCodeInfoData;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEmail(@Nullable String str) {
                this.email = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPreviousEmail(@Nullable String str) {
                this.previousEmail = str;
                return this;
            }
        }

        @NonNull
        public static PigeonActionCodeInfoData fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonActionCodeInfoData pigeonActionCodeInfoData = new PigeonActionCodeInfoData();
            pigeonActionCodeInfoData.setEmail((String) arrayList.get(0));
            pigeonActionCodeInfoData.setPreviousEmail((String) arrayList.get(1));
            return pigeonActionCodeInfoData;
        }

        @Nullable
        public String getEmail() {
            return this.email;
        }

        @Nullable
        public String getPreviousEmail() {
            return this.previousEmail;
        }

        public void setEmail(@Nullable String str) {
            this.email = str;
        }

        public void setPreviousEmail(@Nullable String str) {
            this.previousEmail = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.email);
            arrayList.add(this.previousEmail);
            return arrayList;
        }
    }

    public static final class PigeonActionCodeSettings {

        @NonNull
        private Boolean androidInstallApp;

        @Nullable
        private String androidMinimumVersion;

        @Nullable
        private String androidPackageName;

        @Nullable
        private String dynamicLinkDomain;

        @NonNull
        private Boolean handleCodeInApp;

        @Nullable
        private String iOSBundleId;

        @Nullable
        private String linkDomain;

        @NonNull
        private String url;

        public static final class Builder {

            @Nullable
            private Boolean androidInstallApp;

            @Nullable
            private String androidMinimumVersion;

            @Nullable
            private String androidPackageName;

            @Nullable
            private String dynamicLinkDomain;

            @Nullable
            private Boolean handleCodeInApp;

            @Nullable
            private String iOSBundleId;

            @Nullable
            private String linkDomain;

            @Nullable
            private String url;

            @NonNull
            public PigeonActionCodeSettings build() {
                PigeonActionCodeSettings pigeonActionCodeSettings = new PigeonActionCodeSettings();
                pigeonActionCodeSettings.setUrl(this.url);
                pigeonActionCodeSettings.setDynamicLinkDomain(this.dynamicLinkDomain);
                pigeonActionCodeSettings.setHandleCodeInApp(this.handleCodeInApp);
                pigeonActionCodeSettings.setIOSBundleId(this.iOSBundleId);
                pigeonActionCodeSettings.setAndroidPackageName(this.androidPackageName);
                pigeonActionCodeSettings.setAndroidInstallApp(this.androidInstallApp);
                pigeonActionCodeSettings.setAndroidMinimumVersion(this.androidMinimumVersion);
                pigeonActionCodeSettings.setLinkDomain(this.linkDomain);
                return pigeonActionCodeSettings;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAndroidInstallApp(@NonNull Boolean bool) {
                this.androidInstallApp = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAndroidMinimumVersion(@Nullable String str) {
                this.androidMinimumVersion = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAndroidPackageName(@Nullable String str) {
                this.androidPackageName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDynamicLinkDomain(@Nullable String str) {
                this.dynamicLinkDomain = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHandleCodeInApp(@NonNull Boolean bool) {
                this.handleCodeInApp = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIOSBundleId(@Nullable String str) {
                this.iOSBundleId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setLinkDomain(@Nullable String str) {
                this.linkDomain = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUrl(@NonNull String str) {
                this.url = str;
                return this;
            }
        }

        @NonNull
        public static PigeonActionCodeSettings fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonActionCodeSettings pigeonActionCodeSettings = new PigeonActionCodeSettings();
            pigeonActionCodeSettings.setUrl((String) arrayList.get(0));
            pigeonActionCodeSettings.setDynamicLinkDomain((String) arrayList.get(1));
            pigeonActionCodeSettings.setHandleCodeInApp((Boolean) arrayList.get(2));
            pigeonActionCodeSettings.setIOSBundleId((String) arrayList.get(3));
            pigeonActionCodeSettings.setAndroidPackageName((String) arrayList.get(4));
            pigeonActionCodeSettings.setAndroidInstallApp((Boolean) arrayList.get(5));
            pigeonActionCodeSettings.setAndroidMinimumVersion((String) arrayList.get(6));
            pigeonActionCodeSettings.setLinkDomain((String) arrayList.get(7));
            return pigeonActionCodeSettings;
        }

        @NonNull
        public Boolean getAndroidInstallApp() {
            return this.androidInstallApp;
        }

        @Nullable
        public String getAndroidMinimumVersion() {
            return this.androidMinimumVersion;
        }

        @Nullable
        public String getAndroidPackageName() {
            return this.androidPackageName;
        }

        @Nullable
        public String getDynamicLinkDomain() {
            return this.dynamicLinkDomain;
        }

        @NonNull
        public Boolean getHandleCodeInApp() {
            return this.handleCodeInApp;
        }

        @Nullable
        public String getIOSBundleId() {
            return this.iOSBundleId;
        }

        @Nullable
        public String getLinkDomain() {
            return this.linkDomain;
        }

        @NonNull
        public String getUrl() {
            return this.url;
        }

        public void setAndroidInstallApp(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
            }
            this.androidInstallApp = bool;
        }

        public void setAndroidMinimumVersion(@Nullable String str) {
            this.androidMinimumVersion = str;
        }

        public void setAndroidPackageName(@Nullable String str) {
            this.androidPackageName = str;
        }

        public void setDynamicLinkDomain(@Nullable String str) {
            this.dynamicLinkDomain = str;
        }

        public void setHandleCodeInApp(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
            }
            this.handleCodeInApp = bool;
        }

        public void setIOSBundleId(@Nullable String str) {
            this.iOSBundleId = str;
        }

        public void setLinkDomain(@Nullable String str) {
            this.linkDomain = str;
        }

        public void setUrl(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.url = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(8);
            arrayList.add(this.url);
            arrayList.add(this.dynamicLinkDomain);
            arrayList.add(this.handleCodeInApp);
            arrayList.add(this.iOSBundleId);
            arrayList.add(this.androidPackageName);
            arrayList.add(this.androidInstallApp);
            arrayList.add(this.androidMinimumVersion);
            arrayList.add(this.linkDomain);
            return arrayList;
        }
    }

    public static final class PigeonAdditionalUserInfo {

        @Nullable
        private String authorizationCode;

        @NonNull
        private Boolean isNewUser;

        @Nullable
        private Map<String, Object> profile;

        @Nullable
        private String providerId;

        @Nullable
        private String username;

        public static final class Builder {

            @Nullable
            private String authorizationCode;

            @Nullable
            private Boolean isNewUser;

            @Nullable
            private Map<String, Object> profile;

            @Nullable
            private String providerId;

            @Nullable
            private String username;

            @NonNull
            public PigeonAdditionalUserInfo build() {
                PigeonAdditionalUserInfo pigeonAdditionalUserInfo = new PigeonAdditionalUserInfo();
                pigeonAdditionalUserInfo.setIsNewUser(this.isNewUser);
                pigeonAdditionalUserInfo.setProviderId(this.providerId);
                pigeonAdditionalUserInfo.setUsername(this.username);
                pigeonAdditionalUserInfo.setAuthorizationCode(this.authorizationCode);
                pigeonAdditionalUserInfo.setProfile(this.profile);
                return pigeonAdditionalUserInfo;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAuthorizationCode(@Nullable String str) {
                this.authorizationCode = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIsNewUser(@NonNull Boolean bool) {
                this.isNewUser = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProfile(@Nullable Map<String, Object> map) {
                this.profile = map;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProviderId(@Nullable String str) {
                this.providerId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUsername(@Nullable String str) {
                this.username = str;
                return this;
            }
        }

        @NonNull
        public static PigeonAdditionalUserInfo fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonAdditionalUserInfo pigeonAdditionalUserInfo = new PigeonAdditionalUserInfo();
            pigeonAdditionalUserInfo.setIsNewUser((Boolean) arrayList.get(0));
            pigeonAdditionalUserInfo.setProviderId((String) arrayList.get(1));
            pigeonAdditionalUserInfo.setUsername((String) arrayList.get(2));
            pigeonAdditionalUserInfo.setAuthorizationCode((String) arrayList.get(3));
            pigeonAdditionalUserInfo.setProfile((Map) arrayList.get(4));
            return pigeonAdditionalUserInfo;
        }

        @Nullable
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        @NonNull
        public Boolean getIsNewUser() {
            return this.isNewUser;
        }

        @Nullable
        public Map<String, Object> getProfile() {
            return this.profile;
        }

        @Nullable
        public String getProviderId() {
            return this.providerId;
        }

        @Nullable
        public String getUsername() {
            return this.username;
        }

        public void setAuthorizationCode(@Nullable String str) {
            this.authorizationCode = str;
        }

        public void setIsNewUser(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
            }
            this.isNewUser = bool;
        }

        public void setProfile(@Nullable Map<String, Object> map) {
            this.profile = map;
        }

        public void setProviderId(@Nullable String str) {
            this.providerId = str;
        }

        public void setUsername(@Nullable String str) {
            this.username = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.isNewUser);
            arrayList.add(this.providerId);
            arrayList.add(this.username);
            arrayList.add(this.authorizationCode);
            arrayList.add(this.profile);
            return arrayList;
        }
    }

    public static final class PigeonAuthCredential {

        @Nullable
        private String accessToken;

        @NonNull
        private Long nativeId;

        @NonNull
        private String providerId;

        @NonNull
        private String signInMethod;

        public static final class Builder {

            @Nullable
            private String accessToken;

            @Nullable
            private Long nativeId;

            @Nullable
            private String providerId;

            @Nullable
            private String signInMethod;

            @NonNull
            public PigeonAuthCredential build() {
                PigeonAuthCredential pigeonAuthCredential = new PigeonAuthCredential();
                pigeonAuthCredential.setProviderId(this.providerId);
                pigeonAuthCredential.setSignInMethod(this.signInMethod);
                pigeonAuthCredential.setNativeId(this.nativeId);
                pigeonAuthCredential.setAccessToken(this.accessToken);
                return pigeonAuthCredential;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAccessToken(@Nullable String str) {
                this.accessToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setNativeId(@NonNull Long l) {
                this.nativeId = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProviderId(@NonNull String str) {
                this.providerId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSignInMethod(@NonNull String str) {
                this.signInMethod = str;
                return this;
            }
        }

        @NonNull
        public static PigeonAuthCredential fromList(@NonNull ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonAuthCredential pigeonAuthCredential = new PigeonAuthCredential();
            pigeonAuthCredential.setProviderId((String) arrayList.get(0));
            pigeonAuthCredential.setSignInMethod((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonAuthCredential.setNativeId(valueOf);
            pigeonAuthCredential.setAccessToken((String) arrayList.get(3));
            return pigeonAuthCredential;
        }

        @Nullable
        public String getAccessToken() {
            return this.accessToken;
        }

        @NonNull
        public Long getNativeId() {
            return this.nativeId;
        }

        @NonNull
        public String getProviderId() {
            return this.providerId;
        }

        @NonNull
        public String getSignInMethod() {
            return this.signInMethod;
        }

        public void setAccessToken(@Nullable String str) {
            this.accessToken = str;
        }

        public void setNativeId(@NonNull Long l) {
            if (l == null) {
                throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
            }
            this.nativeId = l;
        }

        public void setProviderId(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.providerId = str;
        }

        public void setSignInMethod(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
            }
            this.signInMethod = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.providerId);
            arrayList.add(this.signInMethod);
            arrayList.add(this.nativeId);
            arrayList.add(this.accessToken);
            return arrayList;
        }
    }

    public static final class PigeonFirebaseAuthSettings {

        @NonNull
        private Boolean appVerificationDisabledForTesting;

        @Nullable
        private Boolean forceRecaptchaFlow;

        @Nullable
        private String phoneNumber;

        @Nullable
        private String smsCode;

        @Nullable
        private String userAccessGroup;

        public static final class Builder {

            @Nullable
            private Boolean appVerificationDisabledForTesting;

            @Nullable
            private Boolean forceRecaptchaFlow;

            @Nullable
            private String phoneNumber;

            @Nullable
            private String smsCode;

            @Nullable
            private String userAccessGroup;

            @NonNull
            public PigeonFirebaseAuthSettings build() {
                PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings = new PigeonFirebaseAuthSettings();
                pigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting(this.appVerificationDisabledForTesting);
                pigeonFirebaseAuthSettings.setUserAccessGroup(this.userAccessGroup);
                pigeonFirebaseAuthSettings.setPhoneNumber(this.phoneNumber);
                pigeonFirebaseAuthSettings.setSmsCode(this.smsCode);
                pigeonFirebaseAuthSettings.setForceRecaptchaFlow(this.forceRecaptchaFlow);
                return pigeonFirebaseAuthSettings;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAppVerificationDisabledForTesting(@NonNull Boolean bool) {
                this.appVerificationDisabledForTesting = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setForceRecaptchaFlow(@Nullable Boolean bool) {
                this.forceRecaptchaFlow = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhoneNumber(@Nullable String str) {
                this.phoneNumber = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSmsCode(@Nullable String str) {
                this.smsCode = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUserAccessGroup(@Nullable String str) {
                this.userAccessGroup = str;
                return this;
            }
        }

        @NonNull
        public static PigeonFirebaseAuthSettings fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings = new PigeonFirebaseAuthSettings();
            pigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting((Boolean) arrayList.get(0));
            pigeonFirebaseAuthSettings.setUserAccessGroup((String) arrayList.get(1));
            pigeonFirebaseAuthSettings.setPhoneNumber((String) arrayList.get(2));
            pigeonFirebaseAuthSettings.setSmsCode((String) arrayList.get(3));
            pigeonFirebaseAuthSettings.setForceRecaptchaFlow((Boolean) arrayList.get(4));
            return pigeonFirebaseAuthSettings;
        }

        @NonNull
        public Boolean getAppVerificationDisabledForTesting() {
            return this.appVerificationDisabledForTesting;
        }

        @Nullable
        public Boolean getForceRecaptchaFlow() {
            return this.forceRecaptchaFlow;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        @Nullable
        public String getSmsCode() {
            return this.smsCode;
        }

        @Nullable
        public String getUserAccessGroup() {
            return this.userAccessGroup;
        }

        public void setAppVerificationDisabledForTesting(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
            }
            this.appVerificationDisabledForTesting = bool;
        }

        public void setForceRecaptchaFlow(@Nullable Boolean bool) {
            this.forceRecaptchaFlow = bool;
        }

        public void setPhoneNumber(@Nullable String str) {
            this.phoneNumber = str;
        }

        public void setSmsCode(@Nullable String str) {
            this.smsCode = str;
        }

        public void setUserAccessGroup(@Nullable String str) {
            this.userAccessGroup = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.appVerificationDisabledForTesting);
            arrayList.add(this.userAccessGroup);
            arrayList.add(this.phoneNumber);
            arrayList.add(this.smsCode);
            arrayList.add(this.forceRecaptchaFlow);
            return arrayList;
        }
    }

    public static final class PigeonIdTokenResult {

        @Nullable
        private Long authTimestamp;

        @Nullable
        private Map<String, Object> claims;

        @Nullable
        private Long expirationTimestamp;

        @Nullable
        private Long issuedAtTimestamp;

        @Nullable
        private String signInProvider;

        @Nullable
        private String signInSecondFactor;

        @Nullable
        private String token;

        public static final class Builder {

            @Nullable
            private Long authTimestamp;

            @Nullable
            private Map<String, Object> claims;

            @Nullable
            private Long expirationTimestamp;

            @Nullable
            private Long issuedAtTimestamp;

            @Nullable
            private String signInProvider;

            @Nullable
            private String signInSecondFactor;

            @Nullable
            private String token;

            @NonNull
            public PigeonIdTokenResult build() {
                PigeonIdTokenResult pigeonIdTokenResult = new PigeonIdTokenResult();
                pigeonIdTokenResult.setToken(this.token);
                pigeonIdTokenResult.setExpirationTimestamp(this.expirationTimestamp);
                pigeonIdTokenResult.setAuthTimestamp(this.authTimestamp);
                pigeonIdTokenResult.setIssuedAtTimestamp(this.issuedAtTimestamp);
                pigeonIdTokenResult.setSignInProvider(this.signInProvider);
                pigeonIdTokenResult.setClaims(this.claims);
                pigeonIdTokenResult.setSignInSecondFactor(this.signInSecondFactor);
                return pigeonIdTokenResult;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAuthTimestamp(@Nullable Long l) {
                this.authTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setClaims(@Nullable Map<String, Object> map) {
                this.claims = map;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setExpirationTimestamp(@Nullable Long l) {
                this.expirationTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIssuedAtTimestamp(@Nullable Long l) {
                this.issuedAtTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSignInProvider(@Nullable String str) {
                this.signInProvider = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSignInSecondFactor(@Nullable String str) {
                this.signInSecondFactor = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setToken(@Nullable String str) {
                this.token = str;
                return this;
            }
        }

        @NonNull
        public static PigeonIdTokenResult fromList(@NonNull ArrayList<Object> arrayList) {
            Long valueOf;
            Long valueOf2;
            PigeonIdTokenResult pigeonIdTokenResult = new PigeonIdTokenResult();
            pigeonIdTokenResult.setToken((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonIdTokenResult.setExpirationTimestamp(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonIdTokenResult.setAuthTimestamp(valueOf2);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                l = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            pigeonIdTokenResult.setIssuedAtTimestamp(l);
            pigeonIdTokenResult.setSignInProvider((String) arrayList.get(4));
            pigeonIdTokenResult.setClaims((Map) arrayList.get(5));
            pigeonIdTokenResult.setSignInSecondFactor((String) arrayList.get(6));
            return pigeonIdTokenResult;
        }

        @Nullable
        public Long getAuthTimestamp() {
            return this.authTimestamp;
        }

        @Nullable
        public Map<String, Object> getClaims() {
            return this.claims;
        }

        @Nullable
        public Long getExpirationTimestamp() {
            return this.expirationTimestamp;
        }

        @Nullable
        public Long getIssuedAtTimestamp() {
            return this.issuedAtTimestamp;
        }

        @Nullable
        public String getSignInProvider() {
            return this.signInProvider;
        }

        @Nullable
        public String getSignInSecondFactor() {
            return this.signInSecondFactor;
        }

        @Nullable
        public String getToken() {
            return this.token;
        }

        public void setAuthTimestamp(@Nullable Long l) {
            this.authTimestamp = l;
        }

        public void setClaims(@Nullable Map<String, Object> map) {
            this.claims = map;
        }

        public void setExpirationTimestamp(@Nullable Long l) {
            this.expirationTimestamp = l;
        }

        public void setIssuedAtTimestamp(@Nullable Long l) {
            this.issuedAtTimestamp = l;
        }

        public void setSignInProvider(@Nullable String str) {
            this.signInProvider = str;
        }

        public void setSignInSecondFactor(@Nullable String str) {
            this.signInSecondFactor = str;
        }

        public void setToken(@Nullable String str) {
            this.token = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.token);
            arrayList.add(this.expirationTimestamp);
            arrayList.add(this.authTimestamp);
            arrayList.add(this.issuedAtTimestamp);
            arrayList.add(this.signInProvider);
            arrayList.add(this.claims);
            arrayList.add(this.signInSecondFactor);
            return arrayList;
        }
    }

    public static final class PigeonMultiFactorInfo {

        @Nullable
        private String displayName;

        @NonNull
        private Double enrollmentTimestamp;

        @Nullable
        private String factorId;

        @Nullable
        private String phoneNumber;

        @NonNull
        private String uid;

        public static final class Builder {

            @Nullable
            private String displayName;

            @Nullable
            private Double enrollmentTimestamp;

            @Nullable
            private String factorId;

            @Nullable
            private String phoneNumber;

            @Nullable
            private String uid;

            @NonNull
            public PigeonMultiFactorInfo build() {
                PigeonMultiFactorInfo pigeonMultiFactorInfo = new PigeonMultiFactorInfo();
                pigeonMultiFactorInfo.setDisplayName(this.displayName);
                pigeonMultiFactorInfo.setEnrollmentTimestamp(this.enrollmentTimestamp);
                pigeonMultiFactorInfo.setFactorId(this.factorId);
                pigeonMultiFactorInfo.setUid(this.uid);
                pigeonMultiFactorInfo.setPhoneNumber(this.phoneNumber);
                return pigeonMultiFactorInfo;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDisplayName(@Nullable String str) {
                this.displayName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnrollmentTimestamp(@NonNull Double d) {
                this.enrollmentTimestamp = d;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setFactorId(@Nullable String str) {
                this.factorId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhoneNumber(@Nullable String str) {
                this.phoneNumber = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUid(@NonNull String str) {
                this.uid = str;
                return this;
            }
        }

        @NonNull
        public static PigeonMultiFactorInfo fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonMultiFactorInfo pigeonMultiFactorInfo = new PigeonMultiFactorInfo();
            pigeonMultiFactorInfo.setDisplayName((String) arrayList.get(0));
            pigeonMultiFactorInfo.setEnrollmentTimestamp((Double) arrayList.get(1));
            pigeonMultiFactorInfo.setFactorId((String) arrayList.get(2));
            pigeonMultiFactorInfo.setUid((String) arrayList.get(3));
            pigeonMultiFactorInfo.setPhoneNumber((String) arrayList.get(4));
            return pigeonMultiFactorInfo;
        }

        @Nullable
        public String getDisplayName() {
            return this.displayName;
        }

        @NonNull
        public Double getEnrollmentTimestamp() {
            return this.enrollmentTimestamp;
        }

        @Nullable
        public String getFactorId() {
            return this.factorId;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        @NonNull
        public String getUid() {
            return this.uid;
        }

        public void setDisplayName(@Nullable String str) {
            this.displayName = str;
        }

        public void setEnrollmentTimestamp(@NonNull Double d) {
            if (d == null) {
                throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
            }
            this.enrollmentTimestamp = d;
        }

        public void setFactorId(@Nullable String str) {
            this.factorId = str;
        }

        public void setPhoneNumber(@Nullable String str) {
            this.phoneNumber = str;
        }

        public void setUid(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.uid = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.displayName);
            arrayList.add(this.enrollmentTimestamp);
            arrayList.add(this.factorId);
            arrayList.add(this.uid);
            arrayList.add(this.phoneNumber);
            return arrayList;
        }
    }

    public static final class PigeonMultiFactorSession {

        /* renamed from: id, reason: collision with root package name */
        @NonNull
        private String f128id;

        public static final class Builder {

            /* renamed from: id, reason: collision with root package name */
            @Nullable
            private String f129id;

            @NonNull
            public PigeonMultiFactorSession build() {
                PigeonMultiFactorSession pigeonMultiFactorSession = new PigeonMultiFactorSession();
                pigeonMultiFactorSession.setId(this.f129id);
                return pigeonMultiFactorSession;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setId(@NonNull String str) {
                this.f129id = str;
                return this;
            }
        }

        @NonNull
        public static PigeonMultiFactorSession fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonMultiFactorSession pigeonMultiFactorSession = new PigeonMultiFactorSession();
            pigeonMultiFactorSession.setId((String) arrayList.get(0));
            return pigeonMultiFactorSession;
        }

        @NonNull
        public String getId() {
            return this.f128id;
        }

        public void setId(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f128id = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f128id);
            return arrayList;
        }
    }

    public static final class PigeonPhoneMultiFactorAssertion {

        @NonNull
        private String verificationCode;

        @NonNull
        private String verificationId;

        public static final class Builder {

            @Nullable
            private String verificationCode;

            @Nullable
            private String verificationId;

            @NonNull
            public PigeonPhoneMultiFactorAssertion build() {
                PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion = new PigeonPhoneMultiFactorAssertion();
                pigeonPhoneMultiFactorAssertion.setVerificationId(this.verificationId);
                pigeonPhoneMultiFactorAssertion.setVerificationCode(this.verificationCode);
                return pigeonPhoneMultiFactorAssertion;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setVerificationCode(@NonNull String str) {
                this.verificationCode = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setVerificationId(@NonNull String str) {
                this.verificationId = str;
                return this;
            }
        }

        @NonNull
        public static PigeonPhoneMultiFactorAssertion fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion = new PigeonPhoneMultiFactorAssertion();
            pigeonPhoneMultiFactorAssertion.setVerificationId((String) arrayList.get(0));
            pigeonPhoneMultiFactorAssertion.setVerificationCode((String) arrayList.get(1));
            return pigeonPhoneMultiFactorAssertion;
        }

        @NonNull
        public String getVerificationCode() {
            return this.verificationCode;
        }

        @NonNull
        public String getVerificationId() {
            return this.verificationId;
        }

        public void setVerificationCode(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
            }
            this.verificationCode = str;
        }

        public void setVerificationId(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
            }
            this.verificationId = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.verificationId);
            arrayList.add(this.verificationCode);
            return arrayList;
        }
    }

    public static final class PigeonSignInProvider {

        @Nullable
        private Map<String, String> customParameters;

        @NonNull
        private String providerId;

        @Nullable
        private List<String> scopes;

        public static final class Builder {

            @Nullable
            private Map<String, String> customParameters;

            @Nullable
            private String providerId;

            @Nullable
            private List<String> scopes;

            @NonNull
            public PigeonSignInProvider build() {
                PigeonSignInProvider pigeonSignInProvider = new PigeonSignInProvider();
                pigeonSignInProvider.setProviderId(this.providerId);
                pigeonSignInProvider.setScopes(this.scopes);
                pigeonSignInProvider.setCustomParameters(this.customParameters);
                return pigeonSignInProvider;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCustomParameters(@Nullable Map<String, String> map) {
                this.customParameters = map;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProviderId(@NonNull String str) {
                this.providerId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setScopes(@Nullable List<String> list) {
                this.scopes = list;
                return this;
            }
        }

        @NonNull
        public static PigeonSignInProvider fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonSignInProvider pigeonSignInProvider = new PigeonSignInProvider();
            pigeonSignInProvider.setProviderId((String) arrayList.get(0));
            pigeonSignInProvider.setScopes((List) arrayList.get(1));
            pigeonSignInProvider.setCustomParameters((Map) arrayList.get(2));
            return pigeonSignInProvider;
        }

        @Nullable
        public Map<String, String> getCustomParameters() {
            return this.customParameters;
        }

        @NonNull
        public String getProviderId() {
            return this.providerId;
        }

        @Nullable
        public List<String> getScopes() {
            return this.scopes;
        }

        public void setCustomParameters(@Nullable Map<String, String> map) {
            this.customParameters = map;
        }

        public void setProviderId(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.providerId = str;
        }

        public void setScopes(@Nullable List<String> list) {
            this.scopes = list;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.providerId);
            arrayList.add(this.scopes);
            arrayList.add(this.customParameters);
            return arrayList;
        }
    }

    public static final class PigeonTotpSecret {

        @Nullable
        private Long codeIntervalSeconds;

        @Nullable
        private Long codeLength;

        @Nullable
        private Long enrollmentCompletionDeadline;

        @Nullable
        private String hashingAlgorithm;

        @NonNull
        private String secretKey;

        public static final class Builder {

            @Nullable
            private Long codeIntervalSeconds;

            @Nullable
            private Long codeLength;

            @Nullable
            private Long enrollmentCompletionDeadline;

            @Nullable
            private String hashingAlgorithm;

            @Nullable
            private String secretKey;

            @NonNull
            public PigeonTotpSecret build() {
                PigeonTotpSecret pigeonTotpSecret = new PigeonTotpSecret();
                pigeonTotpSecret.setCodeIntervalSeconds(this.codeIntervalSeconds);
                pigeonTotpSecret.setCodeLength(this.codeLength);
                pigeonTotpSecret.setEnrollmentCompletionDeadline(this.enrollmentCompletionDeadline);
                pigeonTotpSecret.setHashingAlgorithm(this.hashingAlgorithm);
                pigeonTotpSecret.setSecretKey(this.secretKey);
                return pigeonTotpSecret;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCodeIntervalSeconds(@Nullable Long l) {
                this.codeIntervalSeconds = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCodeLength(@Nullable Long l) {
                this.codeLength = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnrollmentCompletionDeadline(@Nullable Long l) {
                this.enrollmentCompletionDeadline = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHashingAlgorithm(@Nullable String str) {
                this.hashingAlgorithm = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSecretKey(@NonNull String str) {
                this.secretKey = str;
                return this;
            }
        }

        @NonNull
        public static PigeonTotpSecret fromList(@NonNull ArrayList<Object> arrayList) {
            Long valueOf;
            Long valueOf2;
            PigeonTotpSecret pigeonTotpSecret = new PigeonTotpSecret();
            Object obj = arrayList.get(0);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonTotpSecret.setCodeIntervalSeconds(valueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonTotpSecret.setCodeLength(valueOf2);
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                l = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            pigeonTotpSecret.setEnrollmentCompletionDeadline(l);
            pigeonTotpSecret.setHashingAlgorithm((String) arrayList.get(3));
            pigeonTotpSecret.setSecretKey((String) arrayList.get(4));
            return pigeonTotpSecret;
        }

        @Nullable
        public Long getCodeIntervalSeconds() {
            return this.codeIntervalSeconds;
        }

        @Nullable
        public Long getCodeLength() {
            return this.codeLength;
        }

        @Nullable
        public Long getEnrollmentCompletionDeadline() {
            return this.enrollmentCompletionDeadline;
        }

        @Nullable
        public String getHashingAlgorithm() {
            return this.hashingAlgorithm;
        }

        @NonNull
        public String getSecretKey() {
            return this.secretKey;
        }

        public void setCodeIntervalSeconds(@Nullable Long l) {
            this.codeIntervalSeconds = l;
        }

        public void setCodeLength(@Nullable Long l) {
            this.codeLength = l;
        }

        public void setEnrollmentCompletionDeadline(@Nullable Long l) {
            this.enrollmentCompletionDeadline = l;
        }

        public void setHashingAlgorithm(@Nullable String str) {
            this.hashingAlgorithm = str;
        }

        public void setSecretKey(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
            }
            this.secretKey = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.codeIntervalSeconds);
            arrayList.add(this.codeLength);
            arrayList.add(this.enrollmentCompletionDeadline);
            arrayList.add(this.hashingAlgorithm);
            arrayList.add(this.secretKey);
            return arrayList;
        }
    }

    public static final class PigeonUserCredential {

        @Nullable
        private PigeonAdditionalUserInfo additionalUserInfo;

        @Nullable
        private PigeonAuthCredential credential;

        @Nullable
        private PigeonUserDetails user;

        public static final class Builder {

            @Nullable
            private PigeonAdditionalUserInfo additionalUserInfo;

            @Nullable
            private PigeonAuthCredential credential;

            @Nullable
            private PigeonUserDetails user;

            @NonNull
            public PigeonUserCredential build() {
                PigeonUserCredential pigeonUserCredential = new PigeonUserCredential();
                pigeonUserCredential.setUser(this.user);
                pigeonUserCredential.setAdditionalUserInfo(this.additionalUserInfo);
                pigeonUserCredential.setCredential(this.credential);
                return pigeonUserCredential;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAdditionalUserInfo(@Nullable PigeonAdditionalUserInfo pigeonAdditionalUserInfo) {
                this.additionalUserInfo = pigeonAdditionalUserInfo;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCredential(@Nullable PigeonAuthCredential pigeonAuthCredential) {
                this.credential = pigeonAuthCredential;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUser(@Nullable PigeonUserDetails pigeonUserDetails) {
                this.user = pigeonUserDetails;
                return this;
            }
        }

        @NonNull
        public static PigeonUserCredential fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonUserCredential pigeonUserCredential = new PigeonUserCredential();
            pigeonUserCredential.setUser((PigeonUserDetails) arrayList.get(0));
            pigeonUserCredential.setAdditionalUserInfo((PigeonAdditionalUserInfo) arrayList.get(1));
            pigeonUserCredential.setCredential((PigeonAuthCredential) arrayList.get(2));
            return pigeonUserCredential;
        }

        @Nullable
        public PigeonAdditionalUserInfo getAdditionalUserInfo() {
            return this.additionalUserInfo;
        }

        @Nullable
        public PigeonAuthCredential getCredential() {
            return this.credential;
        }

        @Nullable
        public PigeonUserDetails getUser() {
            return this.user;
        }

        public void setAdditionalUserInfo(@Nullable PigeonAdditionalUserInfo pigeonAdditionalUserInfo) {
            this.additionalUserInfo = pigeonAdditionalUserInfo;
        }

        public void setCredential(@Nullable PigeonAuthCredential pigeonAuthCredential) {
            this.credential = pigeonAuthCredential;
        }

        public void setUser(@Nullable PigeonUserDetails pigeonUserDetails) {
            this.user = pigeonUserDetails;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.user);
            arrayList.add(this.additionalUserInfo);
            arrayList.add(this.credential);
            return arrayList;
        }
    }

    public static final class PigeonUserDetails {

        @NonNull
        private List<Map<Object, Object>> providerData;

        @NonNull
        private PigeonUserInfo userInfo;

        public static final class Builder {

            @Nullable
            private List<Map<Object, Object>> providerData;

            @Nullable
            private PigeonUserInfo userInfo;

            @NonNull
            public PigeonUserDetails build() {
                PigeonUserDetails pigeonUserDetails = new PigeonUserDetails();
                pigeonUserDetails.setUserInfo(this.userInfo);
                pigeonUserDetails.setProviderData(this.providerData);
                return pigeonUserDetails;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProviderData(@NonNull List<Map<Object, Object>> list) {
                this.providerData = list;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUserInfo(@NonNull PigeonUserInfo pigeonUserInfo) {
                this.userInfo = pigeonUserInfo;
                return this;
            }
        }

        @NonNull
        public static PigeonUserDetails fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonUserDetails pigeonUserDetails = new PigeonUserDetails();
            pigeonUserDetails.setUserInfo((PigeonUserInfo) arrayList.get(0));
            pigeonUserDetails.setProviderData((List) arrayList.get(1));
            return pigeonUserDetails;
        }

        @NonNull
        public List<Map<Object, Object>> getProviderData() {
            return this.providerData;
        }

        @NonNull
        public PigeonUserInfo getUserInfo() {
            return this.userInfo;
        }

        public void setProviderData(@NonNull List<Map<Object, Object>> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"providerData\" is null.");
            }
            this.providerData = list;
        }

        public void setUserInfo(@NonNull PigeonUserInfo pigeonUserInfo) {
            if (pigeonUserInfo == null) {
                throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
            }
            this.userInfo = pigeonUserInfo;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.userInfo);
            arrayList.add(this.providerData);
            return arrayList;
        }
    }

    public static final class PigeonUserInfo {

        @Nullable
        private Long creationTimestamp;

        @Nullable
        private String displayName;

        @Nullable
        private String email;

        @NonNull
        private Boolean isAnonymous;

        @NonNull
        private Boolean isEmailVerified;

        @Nullable
        private Long lastSignInTimestamp;

        @Nullable
        private String phoneNumber;

        @Nullable
        private String photoUrl;

        @Nullable
        private String providerId;

        @Nullable
        private String refreshToken;

        @Nullable
        private String tenantId;

        @NonNull
        private String uid;

        public static final class Builder {

            @Nullable
            private Long creationTimestamp;

            @Nullable
            private String displayName;

            @Nullable
            private String email;

            @Nullable
            private Boolean isAnonymous;

            @Nullable
            private Boolean isEmailVerified;

            @Nullable
            private Long lastSignInTimestamp;

            @Nullable
            private String phoneNumber;

            @Nullable
            private String photoUrl;

            @Nullable
            private String providerId;

            @Nullable
            private String refreshToken;

            @Nullable
            private String tenantId;

            @Nullable
            private String uid;

            @NonNull
            public PigeonUserInfo build() {
                PigeonUserInfo pigeonUserInfo = new PigeonUserInfo();
                pigeonUserInfo.setUid(this.uid);
                pigeonUserInfo.setEmail(this.email);
                pigeonUserInfo.setDisplayName(this.displayName);
                pigeonUserInfo.setPhotoUrl(this.photoUrl);
                pigeonUserInfo.setPhoneNumber(this.phoneNumber);
                pigeonUserInfo.setIsAnonymous(this.isAnonymous);
                pigeonUserInfo.setIsEmailVerified(this.isEmailVerified);
                pigeonUserInfo.setProviderId(this.providerId);
                pigeonUserInfo.setTenantId(this.tenantId);
                pigeonUserInfo.setRefreshToken(this.refreshToken);
                pigeonUserInfo.setCreationTimestamp(this.creationTimestamp);
                pigeonUserInfo.setLastSignInTimestamp(this.lastSignInTimestamp);
                return pigeonUserInfo;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCreationTimestamp(@Nullable Long l) {
                this.creationTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDisplayName(@Nullable String str) {
                this.displayName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEmail(@Nullable String str) {
                this.email = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIsAnonymous(@NonNull Boolean bool) {
                this.isAnonymous = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIsEmailVerified(@NonNull Boolean bool) {
                this.isEmailVerified = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setLastSignInTimestamp(@Nullable Long l) {
                this.lastSignInTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhoneNumber(@Nullable String str) {
                this.phoneNumber = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhotoUrl(@Nullable String str) {
                this.photoUrl = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProviderId(@Nullable String str) {
                this.providerId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setRefreshToken(@Nullable String str) {
                this.refreshToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTenantId(@Nullable String str) {
                this.tenantId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUid(@NonNull String str) {
                this.uid = str;
                return this;
            }
        }

        @NonNull
        public static PigeonUserInfo fromList(@NonNull ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonUserInfo pigeonUserInfo = new PigeonUserInfo();
            pigeonUserInfo.setUid((String) arrayList.get(0));
            pigeonUserInfo.setEmail((String) arrayList.get(1));
            pigeonUserInfo.setDisplayName((String) arrayList.get(2));
            pigeonUserInfo.setPhotoUrl((String) arrayList.get(3));
            pigeonUserInfo.setPhoneNumber((String) arrayList.get(4));
            pigeonUserInfo.setIsAnonymous((Boolean) arrayList.get(5));
            pigeonUserInfo.setIsEmailVerified((Boolean) arrayList.get(6));
            pigeonUserInfo.setProviderId((String) arrayList.get(7));
            pigeonUserInfo.setTenantId((String) arrayList.get(8));
            pigeonUserInfo.setRefreshToken((String) arrayList.get(9));
            Object obj = arrayList.get(10);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonUserInfo.setCreationTimestamp(valueOf);
            Object obj2 = arrayList.get(11);
            if (obj2 != null) {
                l = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonUserInfo.setLastSignInTimestamp(l);
            return pigeonUserInfo;
        }

        @Nullable
        public Long getCreationTimestamp() {
            return this.creationTimestamp;
        }

        @Nullable
        public String getDisplayName() {
            return this.displayName;
        }

        @Nullable
        public String getEmail() {
            return this.email;
        }

        @NonNull
        public Boolean getIsAnonymous() {
            return this.isAnonymous;
        }

        @NonNull
        public Boolean getIsEmailVerified() {
            return this.isEmailVerified;
        }

        @Nullable
        public Long getLastSignInTimestamp() {
            return this.lastSignInTimestamp;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        @Nullable
        public String getPhotoUrl() {
            return this.photoUrl;
        }

        @Nullable
        public String getProviderId() {
            return this.providerId;
        }

        @Nullable
        public String getRefreshToken() {
            return this.refreshToken;
        }

        @Nullable
        public String getTenantId() {
            return this.tenantId;
        }

        @NonNull
        public String getUid() {
            return this.uid;
        }

        public void setCreationTimestamp(@Nullable Long l) {
            this.creationTimestamp = l;
        }

        public void setDisplayName(@Nullable String str) {
            this.displayName = str;
        }

        public void setEmail(@Nullable String str) {
            this.email = str;
        }

        public void setIsAnonymous(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
            }
            this.isAnonymous = bool;
        }

        public void setIsEmailVerified(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
            }
            this.isEmailVerified = bool;
        }

        public void setLastSignInTimestamp(@Nullable Long l) {
            this.lastSignInTimestamp = l;
        }

        public void setPhoneNumber(@Nullable String str) {
            this.phoneNumber = str;
        }

        public void setPhotoUrl(@Nullable String str) {
            this.photoUrl = str;
        }

        public void setProviderId(@Nullable String str) {
            this.providerId = str;
        }

        public void setRefreshToken(@Nullable String str) {
            this.refreshToken = str;
        }

        public void setTenantId(@Nullable String str) {
            this.tenantId = str;
        }

        public void setUid(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.uid = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(12);
            arrayList.add(this.uid);
            arrayList.add(this.email);
            arrayList.add(this.displayName);
            arrayList.add(this.photoUrl);
            arrayList.add(this.phoneNumber);
            arrayList.add(this.isAnonymous);
            arrayList.add(this.isEmailVerified);
            arrayList.add(this.providerId);
            arrayList.add(this.tenantId);
            arrayList.add(this.refreshToken);
            arrayList.add(this.creationTimestamp);
            arrayList.add(this.lastSignInTimestamp);
            return arrayList;
        }
    }

    public static final class PigeonUserProfile {

        @Nullable
        private String displayName;

        @NonNull
        private Boolean displayNameChanged;

        @Nullable
        private String photoUrl;

        @NonNull
        private Boolean photoUrlChanged;

        public static final class Builder {

            @Nullable
            private String displayName;

            @Nullable
            private Boolean displayNameChanged;

            @Nullable
            private String photoUrl;

            @Nullable
            private Boolean photoUrlChanged;

            @NonNull
            public PigeonUserProfile build() {
                PigeonUserProfile pigeonUserProfile = new PigeonUserProfile();
                pigeonUserProfile.setDisplayName(this.displayName);
                pigeonUserProfile.setPhotoUrl(this.photoUrl);
                pigeonUserProfile.setDisplayNameChanged(this.displayNameChanged);
                pigeonUserProfile.setPhotoUrlChanged(this.photoUrlChanged);
                return pigeonUserProfile;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDisplayName(@Nullable String str) {
                this.displayName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDisplayNameChanged(@NonNull Boolean bool) {
                this.displayNameChanged = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhotoUrl(@Nullable String str) {
                this.photoUrl = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhotoUrlChanged(@NonNull Boolean bool) {
                this.photoUrlChanged = bool;
                return this;
            }
        }

        @NonNull
        public static PigeonUserProfile fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonUserProfile pigeonUserProfile = new PigeonUserProfile();
            pigeonUserProfile.setDisplayName((String) arrayList.get(0));
            pigeonUserProfile.setPhotoUrl((String) arrayList.get(1));
            pigeonUserProfile.setDisplayNameChanged((Boolean) arrayList.get(2));
            pigeonUserProfile.setPhotoUrlChanged((Boolean) arrayList.get(3));
            return pigeonUserProfile;
        }

        @Nullable
        public String getDisplayName() {
            return this.displayName;
        }

        @NonNull
        public Boolean getDisplayNameChanged() {
            return this.displayNameChanged;
        }

        @Nullable
        public String getPhotoUrl() {
            return this.photoUrl;
        }

        @NonNull
        public Boolean getPhotoUrlChanged() {
            return this.photoUrlChanged;
        }

        public void setDisplayName(@Nullable String str) {
            this.displayName = str;
        }

        public void setDisplayNameChanged(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
            }
            this.displayNameChanged = bool;
        }

        public void setPhotoUrl(@Nullable String str) {
            this.photoUrl = str;
        }

        public void setPhotoUrlChanged(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
            }
            this.photoUrlChanged = bool;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.displayName);
            arrayList.add(this.photoUrl);
            arrayList.add(this.displayNameChanged);
            arrayList.add(this.photoUrlChanged);
            return arrayList;
        }
    }

    public static final class PigeonVerifyPhoneNumberRequest {

        @Nullable
        private String autoRetrievedSmsCodeForTesting;

        @Nullable
        private Long forceResendingToken;

        @Nullable
        private String multiFactorInfoId;

        @Nullable
        private String multiFactorSessionId;

        @Nullable
        private String phoneNumber;

        @NonNull
        private Long timeout;

        public static final class Builder {

            @Nullable
            private String autoRetrievedSmsCodeForTesting;

            @Nullable
            private Long forceResendingToken;

            @Nullable
            private String multiFactorInfoId;

            @Nullable
            private String multiFactorSessionId;

            @Nullable
            private String phoneNumber;

            @Nullable
            private Long timeout;

            @NonNull
            public PigeonVerifyPhoneNumberRequest build() {
                PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest = new PigeonVerifyPhoneNumberRequest();
                pigeonVerifyPhoneNumberRequest.setPhoneNumber(this.phoneNumber);
                pigeonVerifyPhoneNumberRequest.setTimeout(this.timeout);
                pigeonVerifyPhoneNumberRequest.setForceResendingToken(this.forceResendingToken);
                pigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting(this.autoRetrievedSmsCodeForTesting);
                pigeonVerifyPhoneNumberRequest.setMultiFactorInfoId(this.multiFactorInfoId);
                pigeonVerifyPhoneNumberRequest.setMultiFactorSessionId(this.multiFactorSessionId);
                return pigeonVerifyPhoneNumberRequest;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAutoRetrievedSmsCodeForTesting(@Nullable String str) {
                this.autoRetrievedSmsCodeForTesting = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setForceResendingToken(@Nullable Long l) {
                this.forceResendingToken = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMultiFactorInfoId(@Nullable String str) {
                this.multiFactorInfoId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMultiFactorSessionId(@Nullable String str) {
                this.multiFactorSessionId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhoneNumber(@Nullable String str) {
                this.phoneNumber = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTimeout(@NonNull Long l) {
                this.timeout = l;
                return this;
            }
        }

        @NonNull
        public static PigeonVerifyPhoneNumberRequest fromList(@NonNull ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest = new PigeonVerifyPhoneNumberRequest();
            pigeonVerifyPhoneNumberRequest.setPhoneNumber((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonVerifyPhoneNumberRequest.setTimeout(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 != null) {
                l = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonVerifyPhoneNumberRequest.setForceResendingToken(l);
            pigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting((String) arrayList.get(3));
            pigeonVerifyPhoneNumberRequest.setMultiFactorInfoId((String) arrayList.get(4));
            pigeonVerifyPhoneNumberRequest.setMultiFactorSessionId((String) arrayList.get(5));
            return pigeonVerifyPhoneNumberRequest;
        }

        @Nullable
        public String getAutoRetrievedSmsCodeForTesting() {
            return this.autoRetrievedSmsCodeForTesting;
        }

        @Nullable
        public Long getForceResendingToken() {
            return this.forceResendingToken;
        }

        @Nullable
        public String getMultiFactorInfoId() {
            return this.multiFactorInfoId;
        }

        @Nullable
        public String getMultiFactorSessionId() {
            return this.multiFactorSessionId;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        @NonNull
        public Long getTimeout() {
            return this.timeout;
        }

        public void setAutoRetrievedSmsCodeForTesting(@Nullable String str) {
            this.autoRetrievedSmsCodeForTesting = str;
        }

        public void setForceResendingToken(@Nullable Long l) {
            this.forceResendingToken = l;
        }

        public void setMultiFactorInfoId(@Nullable String str) {
            this.multiFactorInfoId = str;
        }

        public void setMultiFactorSessionId(@Nullable String str) {
            this.multiFactorSessionId = str;
        }

        public void setPhoneNumber(@Nullable String str) {
            this.phoneNumber = str;
        }

        public void setTimeout(@NonNull Long l) {
            if (l == null) {
                throw new IllegalStateException("Nonnull field \"timeout\" is null.");
            }
            this.timeout = l;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.phoneNumber);
            arrayList.add(this.timeout);
            arrayList.add(this.forceResendingToken);
            arrayList.add(this.autoRetrievedSmsCodeForTesting);
            arrayList.add(this.multiFactorInfoId);
            arrayList.add(this.multiFactorSessionId);
            return arrayList;
        }
    }

    public interface Result<T> {
        void error(@NonNull Throwable th);

        void success(@NonNull T t);
    }

    public interface VoidResult {
        void error(@NonNull Throwable th);

        void success();
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
