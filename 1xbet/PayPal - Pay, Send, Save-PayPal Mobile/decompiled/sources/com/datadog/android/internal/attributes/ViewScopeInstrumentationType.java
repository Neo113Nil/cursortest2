package com.datadog.android.internal.attributes;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t"}, d2 = {"Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType;", "Lcom/datadog/android/internal/attributes/LocalAttribute$Constant;", "", "getValue", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Native", "Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType$Custom;", "Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType$Native;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ViewScopeInstrumentationType extends com.datadog.android.internal.attributes.LocalAttribute.Constant {
    java.lang.String getValue();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType$Native;", "", "Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType;", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/datadog/android/internal/attributes/LocalAttribute$Key;", "key", "Lcom/datadog/android/internal/attributes/LocalAttribute$Key;", "getKey", "()Lcom/datadog/android/internal/attributes/LocalAttribute$Key;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "MANUAL", "COMPOSE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_INVOICE_SOURCE, "FRAGMENT"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Native implements com.datadog.android.internal.attributes.ViewScopeInstrumentationType {
        MANUAL("manual"),
        COMPOSE("compose"),
        ACTIVITY("activity"),
        FRAGMENT("fragment");

        private final com.datadog.android.internal.attributes.LocalAttribute.Key key = com.datadog.android.internal.attributes.LocalAttribute.Key.VIEW_SCOPE_INSTRUMENTATION_TYPE;
        private final java.lang.String value;

        Native(java.lang.String str) {
            this.value = str;
        }

        @Override // com.datadog.android.internal.attributes.ViewScopeInstrumentationType
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override // com.datadog.android.internal.attributes.LocalAttribute.Constant
        public final com.datadog.android.internal.attributes.LocalAttribute.Key getKey() {
            return this.key;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType$Custom;", "Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType;", "", "customValue", "<init>", "(Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/internal/attributes/LocalAttribute$Key;", "getKey", "()Lcom/datadog/android/internal/attributes/LocalAttribute$Key;", "key", "getValue", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Custom implements com.datadog.android.internal.attributes.ViewScopeInstrumentationType {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Custom.Companion INSTANCE = new com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Custom.Companion(null);

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public Custom(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @Override // com.datadog.android.internal.attributes.ViewScopeInstrumentationType
        public final java.lang.String getValue() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // com.datadog.android.internal.attributes.LocalAttribute.Constant
        public final com.datadog.android.internal.attributes.LocalAttribute.Key getKey() {
            return com.datadog.android.internal.attributes.LocalAttribute.Key.VIEW_SCOPE_INSTRUMENTATION_TYPE;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType$Custom$Companion;", "", "<init>", "()V", "", "type", "Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType$Custom;", "create", "(Ljava/lang/String;)Lcom/datadog/android/internal/attributes/ViewScopeInstrumentationType$Custom;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Custom create(java.lang.String type) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                return new com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Custom(kotlin.text.StringsKt.trim(type).toString());
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
