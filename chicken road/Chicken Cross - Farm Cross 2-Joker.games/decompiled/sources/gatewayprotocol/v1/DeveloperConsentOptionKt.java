package gatewayprotocol.v1;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeveloperConsentOptionKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/DeveloperConsentOptionKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeveloperConsentOptionKt {
    public static final DeveloperConsentOptionKt INSTANCE = new DeveloperConsentOptionKt();

    private DeveloperConsentOptionKt() {
    }

    /* compiled from: DeveloperConsentOptionKt.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014¨\u0006*"}, d2 = {"Lgatewayprotocol/v1/DeveloperConsentOptionKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption$Builder;", "<init>", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption$Builder;)V", "_build", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption;", "value", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;", "type", "getType", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;", "setType", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;)V", "", "typeValue", "getTypeValue", "()I", "setTypeValue", "(I)V", "clearType", "", "", "customType", "getCustomType", "()Ljava/lang/String;", "setCustomType", "(Ljava/lang/String;)V", "clearCustomType", "hasCustomType", "", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "getValue", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "setValue", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;)V", "valueValue", "getValueValue", "setValueValue", "clearValue", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DeveloperConsentOuterClass.DeveloperConsentOption.Builder _builder;

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: DeveloperConsentOptionKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DeveloperConsentOptionKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DeveloperConsentOptionKt$Dsl;", "builder", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsentOption _build() {
            DeveloperConsentOuterClass.DeveloperConsentOption build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final DeveloperConsentOuterClass.DeveloperConsentType getType() {
            DeveloperConsentOuterClass.DeveloperConsentType type = this._builder.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return type;
        }

        public final void setType(DeveloperConsentOuterClass.DeveloperConsentType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setType(value);
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setTypeValue(int i) {
            this._builder.setTypeValue(i);
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final String getCustomType() {
            String customType = this._builder.getCustomType();
            Intrinsics.checkNotNullExpressionValue(customType, "getCustomType(...)");
            return customType;
        }

        public final void setCustomType(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomType(value);
        }

        public final void clearCustomType() {
            this._builder.clearCustomType();
        }

        public final boolean hasCustomType() {
            return this._builder.hasCustomType();
        }

        public final DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
            DeveloperConsentOuterClass.DeveloperConsentChoice value = this._builder.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return value;
        }

        public final void setValue(DeveloperConsentOuterClass.DeveloperConsentChoice value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setValue(value);
        }

        public final int getValueValue() {
            return this._builder.getValueValue();
        }

        public final void setValueValue(int i) {
            this._builder.setValueValue(i);
        }

        public final void clearValue() {
            this._builder.clearValue();
        }
    }
}
