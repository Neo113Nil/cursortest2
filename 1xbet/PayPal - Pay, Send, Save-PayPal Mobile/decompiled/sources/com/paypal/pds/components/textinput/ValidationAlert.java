package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \t2\u00020\u0001:\u0003\n\u000b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/pds/components/textinput/ValidationAlert;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/pds/components/textinput/ValidationAlertData;", "validate", "(Ljava/lang/String;)Lcom/paypal/pds/components/textinput/ValidationAlertData;", "Companion", "Debug", "HelpedText", "Lcom/paypal/pds/components/textinput/ValidationAlert$Debug;", "Lcom/paypal/pds/components/textinput/ValidationAlert$HelpedText;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ValidationAlert {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.components.textinput.ValidationAlert.Companion INSTANCE = new com.paypal.pds.components.textinput.ValidationAlert.Companion(null);

    public abstract com.paypal.pds.components.textinput.ValidationAlertData validate(java.lang.String value);

    private ValidationAlert() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/pds/components/textinput/ValidationAlert$Debug;", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "Lkotlin/Function1;", "", "Lcom/paypal/pds/components/textinput/ValidationAlertData;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "validate", "(Ljava/lang/String;)Lcom/paypal/pds/components/textinput/ValidationAlertData;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    static final class Debug extends com.paypal.pds.components.textinput.ValidationAlert {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<java.lang.String, com.paypal.pds.components.textinput.ValidationAlertData> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Debug(kotlin.jvm.functions.Function1<? super java.lang.String, com.paypal.pds.components.textinput.ValidationAlertData> function1) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }

        @Override // com.paypal.pds.components.textinput.ValidationAlert
        public final com.paypal.pds.components.textinput.ValidationAlertData validate(java.lang.String p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return this.getHighResolutionOutputSizeshNQ4ISI.invoke(p0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/pds/components/textinput/ValidationAlert$HelpedText;", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "", "text", "<init>", "(Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/pds/components/textinput/ValidationAlertData;", "validate", "(Ljava/lang/String;)Lcom/paypal/pds/components/textinput/ValidationAlertData;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HelpedText extends com.paypal.pds.components.textinput.ValidationAlert {
        public static final int $stable = 0;
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpedText(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        @Override // com.paypal.pds.components.textinput.ValidationAlert
        public final com.paypal.pds.components.textinput.ValidationAlertData validate(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.pds.components.textinput.ValidationAlertData(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE.invoke(null), false, null, null, 28, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/pds/components/textinput/ValidationAlert$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lcom/paypal/pds/components/textinput/ValidationAlertData;", "lambda", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/pds/components/textinput/ValidationAlert;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.pds.components.textinput.ValidationAlert invoke(kotlin.jvm.functions.Function1<? super java.lang.String, com.paypal.pds.components.textinput.ValidationAlertData> lambda) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lambda, "");
            return new com.paypal.pds.components.textinput.ValidationAlert.Debug(lambda);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ValidationAlert(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
