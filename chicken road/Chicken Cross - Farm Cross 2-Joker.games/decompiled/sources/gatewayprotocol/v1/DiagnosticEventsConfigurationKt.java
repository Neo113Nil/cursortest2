package gatewayprotocol.v1;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiagnosticEventsConfigurationKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiagnosticEventsConfigurationKt {
    public static final DiagnosticEventsConfigurationKt INSTANCE = new DiagnosticEventsConfigurationKt();

    private DiagnosticEventsConfigurationKt() {
    }

    /* compiled from: DiagnosticEventsConfigurationKt.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 G2\u00020\u0001:\u0003GHIB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0010J%\u00100\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\u0006\u0010\b\u001a\u00020,H\u0007¢\u0006\u0002\b1J&\u00102\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\u0006\u0010\b\u001a\u00020,H\u0087\n¢\u0006\u0002\b3J+\u00104\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\f\u00105\u001a\b\u0012\u0004\u0012\u00020,06H\u0007¢\u0006\u0002\b7J,\u00102\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\f\u00105\u001a\b\u0012\u0004\u0012\u00020,06H\u0087\n¢\u0006\u0002\b8J.\u00109\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\u0006\u0010:\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020,H\u0087\u0002¢\u0006\u0002\b;J\u001d\u0010<\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0007¢\u0006\u0002\b=J%\u00100\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020?0+2\u0006\u0010\b\u001a\u00020,H\u0007¢\u0006\u0002\bAJ&\u00102\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020?0+2\u0006\u0010\b\u001a\u00020,H\u0087\n¢\u0006\u0002\bBJ+\u00104\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020?0+2\f\u00105\u001a\b\u0012\u0004\u0012\u00020,06H\u0007¢\u0006\u0002\bCJ,\u00102\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020?0+2\f\u00105\u001a\b\u0012\u0004\u0012\u00020,06H\u0087\n¢\u0006\u0002\bDJ.\u00109\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020?0+2\u0006\u0010:\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020,H\u0087\u0002¢\u0006\u0002\bEJ\u001d\u0010<\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020?0+H\u0007¢\u0006\u0002\bFR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001d\u0010>\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020?0+8F¢\u0006\u0006\u001a\u0004\b@\u0010/¨\u0006J"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;)V", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "value", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "clearEnabled", "", "", "maxBatchSize", "getMaxBatchSize", "()I", "setMaxBatchSize", "(I)V", "clearMaxBatchSize", "maxBatchIntervalMs", "getMaxBatchIntervalMs", "setMaxBatchIntervalMs", "clearMaxBatchIntervalMs", "ttmEnabled", "getTtmEnabled", "setTtmEnabled", "clearTtmEnabled", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity;", SDKConstants.PARAM_DEBUG_MESSAGE_SEVERITY, "getSeverity", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity;", "setSeverity", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity;)V", "severityValue", "getSeverityValue", "setSeverityValue", "clearSeverity", "allowedEvents", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$AllowedEventsProxy;", "getAllowedEvents", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addAllowedEvents", "plusAssign", "plusAssignAllowedEvents", "addAll", "values", "", "addAllAllowedEvents", "plusAssignAllAllowedEvents", "set", "index", "setAllowedEvents", "clear", "clearAllowedEvents", "blockedEvents", "Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$BlockedEventsProxy;", "getBlockedEvents", "addBlockedEvents", "plusAssignBlockedEvents", "addAllBlockedEvents", "plusAssignAllBlockedEvents", "setBlockedEvents", "clearBlockedEvents", k.M, "AllowedEventsProxy", "BlockedEventsProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: DiagnosticEventsConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DiagnosticEventsConfiguration _build() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final boolean getEnabled() {
            return this._builder.getEnabled();
        }

        public final void setEnabled(boolean z) {
            this._builder.setEnabled(z);
        }

        public final void clearEnabled() {
            this._builder.clearEnabled();
        }

        public final int getMaxBatchSize() {
            return this._builder.getMaxBatchSize();
        }

        public final void setMaxBatchSize(int i) {
            this._builder.setMaxBatchSize(i);
        }

        public final void clearMaxBatchSize() {
            this._builder.clearMaxBatchSize();
        }

        public final int getMaxBatchIntervalMs() {
            return this._builder.getMaxBatchIntervalMs();
        }

        public final void setMaxBatchIntervalMs(int i) {
            this._builder.setMaxBatchIntervalMs(i);
        }

        public final void clearMaxBatchIntervalMs() {
            this._builder.clearMaxBatchIntervalMs();
        }

        public final boolean getTtmEnabled() {
            return this._builder.getTtmEnabled();
        }

        public final void setTtmEnabled(boolean z) {
            this._builder.setTtmEnabled(z);
        }

        public final void clearTtmEnabled() {
            this._builder.clearTtmEnabled();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity severity = this._builder.getSeverity();
            Intrinsics.checkNotNullExpressionValue(severity, "getSeverity(...)");
            return severity;
        }

        public final void setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSeverity(value);
        }

        public final int getSeverityValue() {
            return this._builder.getSeverityValue();
        }

        public final void setSeverityValue(int i) {
            this._builder.setSeverityValue(i);
        }

        public final void clearSeverity() {
            this._builder.clearSeverity();
        }

        /* compiled from: DiagnosticEventsConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$AllowedEventsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AllowedEventsProxy extends DslProxy {
            private AllowedEventsProxy() {
            }
        }

        public final /* synthetic */ DslList getAllowedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = this._builder.getAllowedEventsList();
            Intrinsics.checkNotNullExpressionValue(allowedEventsList, "getAllowedEventsList(...)");
            return new DslList(allowedEventsList);
        }

        public final /* synthetic */ void addAllowedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addAllowedEvents(value);
        }

        public final /* synthetic */ void plusAssignAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addAllowedEvents(dslList, value);
        }

        public final /* synthetic */ void addAllAllowedEvents(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllAllowedEvents(values);
        }

        public final /* synthetic */ void plusAssignAllAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllAllowedEvents(dslList, values);
        }

        public final /* synthetic */ void setAllowedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAllowedEvents(i, value);
        }

        public final /* synthetic */ void clearAllowedEvents(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearAllowedEvents();
        }

        /* compiled from: DiagnosticEventsConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$BlockedEventsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BlockedEventsProxy extends DslProxy {
            private BlockedEventsProxy() {
            }
        }

        public final /* synthetic */ DslList getBlockedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = this._builder.getBlockedEventsList();
            Intrinsics.checkNotNullExpressionValue(blockedEventsList, "getBlockedEventsList(...)");
            return new DslList(blockedEventsList);
        }

        public final /* synthetic */ void addBlockedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addBlockedEvents(value);
        }

        public final /* synthetic */ void plusAssignBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addBlockedEvents(dslList, value);
        }

        public final /* synthetic */ void addAllBlockedEvents(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllBlockedEvents(values);
        }

        public final /* synthetic */ void plusAssignAllBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllBlockedEvents(dslList, values);
        }

        public final /* synthetic */ void setBlockedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBlockedEvents(i, value);
        }

        public final /* synthetic */ void clearBlockedEvents(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearBlockedEvents();
        }
    }
}
