package gatewayprotocol.v1;

import com.facebook.share.internal.ShareConstants;
import com.google.protobuf.ByteString;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MutableDataKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/MutableDataKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MutableDataKt {
    public static final MutableDataKt INSTANCE = new MutableDataKt();

    private MutableDataKt() {
    }

    /* compiled from: MutableDataKt.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0012J\u0006\u0010.\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0012J\u0006\u00106\u001a\u00020\u0010J\u0006\u00107\u001a\u00020\u0012J\u0006\u0010;\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0017\u0010%\u001a\u0004\u0018\u00010\u001d*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00100\u001a\u0004\u0018\u00010(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b1\u00102R$\u00103\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR$\u00108\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000e¨\u0006>"}, d2 = {"Lgatewayprotocol/v1/MutableDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData$Builder;", "<init>", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableData$Builder;)V", "_build", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "value", "Lcom/google/protobuf/ByteString;", "currentState", "getCurrentState", "()Lcom/google/protobuf/ByteString;", "setCurrentState", "(Lcom/google/protobuf/ByteString;)V", "clearCurrentState", "", "hasCurrentState", "", "sessionToken", "getSessionToken", "setSessionToken", "clearSessionToken", "hasSessionToken", ShareConstants.WEB_DIALOG_PARAM_PRIVACY, "getPrivacy", "setPrivacy", "clearPrivacy", "hasPrivacy", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "clearSessionCounters", "hasSessionCounters", "sessionCountersOrNull", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/MutableDataKt$Dsl;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "allowedPii", "getAllowedPii", "()Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "setAllowedPii", "(Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;)V", "clearAllowedPii", "hasAllowedPii", "allowedPiiOrNull", "getAllowedPiiOrNull", "(Lgatewayprotocol/v1/MutableDataKt$Dsl;)Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "cache", "getCache", "setCache", "clearCache", "hasCache", "privacyFsm", "getPrivacyFsm", "setPrivacyFsm", "clearPrivacyFsm", "hasPrivacyFsm", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MutableDataOuterClass.MutableData.Builder _builder;

        public /* synthetic */ Dsl(MutableDataOuterClass.MutableData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(MutableDataOuterClass.MutableData.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: MutableDataKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/MutableDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/MutableDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MutableDataOuterClass.MutableData.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ MutableDataOuterClass.MutableData _build() {
            MutableDataOuterClass.MutableData build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final ByteString getCurrentState() {
            ByteString currentState = this._builder.getCurrentState();
            Intrinsics.checkNotNullExpressionValue(currentState, "getCurrentState(...)");
            return currentState;
        }

        public final void setCurrentState(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCurrentState(value);
        }

        public final void clearCurrentState() {
            this._builder.clearCurrentState();
        }

        public final boolean hasCurrentState() {
            return this._builder.hasCurrentState();
        }

        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            Intrinsics.checkNotNullExpressionValue(sessionToken, "getSessionToken(...)");
            return sessionToken;
        }

        public final void setSessionToken(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionToken(value);
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final boolean hasSessionToken() {
            return this._builder.hasSessionToken();
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            Intrinsics.checkNotNullExpressionValue(privacy, "getPrivacy(...)");
            return privacy;
        }

        public final void setPrivacy(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            Intrinsics.checkNotNullExpressionValue(sessionCounters, "getSessionCounters(...)");
            return sessionCounters;
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return MutableDataKtKt.getSessionCountersOrNull(dsl._builder);
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPii() {
            AllowedPiiOuterClass.AllowedPii allowedPii = this._builder.getAllowedPii();
            Intrinsics.checkNotNullExpressionValue(allowedPii, "getAllowedPii(...)");
            return allowedPii;
        }

        public final void setAllowedPii(AllowedPiiOuterClass.AllowedPii value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAllowedPii(value);
        }

        public final void clearAllowedPii() {
            this._builder.clearAllowedPii();
        }

        public final boolean hasAllowedPii() {
            return this._builder.hasAllowedPii();
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return MutableDataKtKt.getAllowedPiiOrNull(dsl._builder);
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            Intrinsics.checkNotNullExpressionValue(cache, "getCache(...)");
            return cache;
        }

        public final void setCache(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCache(value);
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final ByteString getPrivacyFsm() {
            ByteString privacyFsm = this._builder.getPrivacyFsm();
            Intrinsics.checkNotNullExpressionValue(privacyFsm, "getPrivacyFsm(...)");
            return privacyFsm;
        }

        public final void setPrivacyFsm(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPrivacyFsm(value);
        }

        public final void clearPrivacyFsm() {
            this._builder.clearPrivacyFsm();
        }

        public final boolean hasPrivacyFsm() {
            return this._builder.hasPrivacyFsm();
        }
    }
}
