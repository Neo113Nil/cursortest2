package com.paypal.oslo.feature.wallet.common.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "", "", "currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "useCase", "asFormatted", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCurrencyCode", "getValue", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Money {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money.Companion INSTANCE = new com.paypal.oslo.feature.wallet.common.domain.model.Money.Companion(null);
    private final java.lang.String currencyCode;
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/domain/model/Money$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.common.domain.model.Money> serializer() {
            return com.paypal.oslo.feature.wallet.common.domain.model.Money$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Money(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.common.domain.model.Money$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyCode = str;
        this.value = str2;
    }

    public Money(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.currencyCode = str;
        this.value = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.common.domain.model.Money self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.currencyCode);
        output.encodeStringElement(serialDesc, 1, self.value);
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:27|28))(3:29|30|(1:32)(1:33))|12|(1:14)(2:22|(1:24)(2:25|26))|15|16|(2:18|19)(1:21)))|36|6|7|(0)(0)|12|(0)(0)|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085 A[Catch: all -> 0x00ea, TryCatch #0 {all -> 0x00ea, blocks: (B:11:0x003a, B:12:0x007f, B:14:0x0085, B:15:0x00dd, B:22:0x00d3, B:24:0x00d7, B:25:0x00e4, B:26:0x00e9, B:30:0x0049), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3 A[Catch: all -> 0x00ea, TryCatch #0 {all -> 0x00ea, blocks: (B:11:0x003a, B:12:0x007f, B:14:0x0085, B:15:0x00dd, B:22:0x00d3, B:24:0x00d7, B:25:0x00e4, B:26:0x00e9, B:30:0x0049), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object asFormatted(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.wallet.common.domain.model.Money$asFormatted$1 money$asFormatted$1;
        int i;
        java.lang.Throwable m23439exceptionOrNullimpl;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money;
        arrow.core.Either either;
        java.lang.Object value;
        if (continuation instanceof com.paypal.oslo.feature.wallet.common.domain.model.Money$asFormatted$1) {
            money$asFormatted$1 = (com.paypal.oslo.feature.wallet.common.domain.model.Money$asFormatted$1) continuation;
            if ((money$asFormatted$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                money$asFormatted$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = money$asFormatted$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = money$asFormatted$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = this;
                    java.math.BigDecimal bigDecimal = new java.math.BigDecimal(this.value);
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(this.currencyCode), null, 0, null, null, 30, null);
                    money$asFormatted$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatCurrencyUseCase);
                    money$asFormatted$1.getHighSpeedVideoFpsRanges = this;
                    money$asFormatted$1.getHighSpeedVideoSizes = 0;
                    money$asFormatted$1.Camera2StreamConfigurationMap = 1;
                    obj = formatCurrencyUseCase.invoke(bigDecimal, currencyConfiguration, money$asFormatted$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    money = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = money$asFormatted$1.getHighSpeedVideoSizes;
                    money = (com.paypal.oslo.feature.wallet.common.domain.model.Money) money$asFormatted$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to format money with use case, using fallback.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", money.currencyCode), kotlin.TuplesKt.to("amount", money.value), kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.model.CurrencyError) ((arrow.core.Either.Left) either).getValue()).getDescription())), null, 4, null);
                    java.lang.String str = money.currencyCode;
                    java.lang.String str2 = money.value;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(" ");
                    sb.append(str2);
                    value = sb.toString();
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    value = ((arrow.core.Either.Right) either).getValue();
                }
                java.lang.Object m23436constructorimpl = kotlin.Result.m23436constructorimpl((java.lang.String) value);
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                if (m23439exceptionOrNullimpl != null) {
                    return m23436constructorimpl;
                }
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Exception occurred during formatting, using value as-is.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", this.currencyCode), kotlin.TuplesKt.to("amount", this.value)), null, m23439exceptionOrNullimpl, 4, null);
                return this.value;
            }
        }
        money$asFormatted$1 = new com.paypal.oslo.feature.wallet.common.domain.model.Money$asFormatted$1(this, continuation);
        java.lang.Object obj2 = money$asFormatted$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = money$asFormatted$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        java.lang.Object m23436constructorimpl2 = kotlin.Result.m23436constructorimpl((java.lang.String) value);
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl2);
        if (m23439exceptionOrNullimpl != null) {
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.currencyCode;
        java.lang.String str2 = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Money(currencyCode=");
        sb.append(str);
        sb.append(", value=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.common.domain.model.Money)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = (com.paypal.oslo.feature.wallet.common.domain.model.Money) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, money.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, money.value);
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money copy(java.lang.String currencyCode, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(currencyCode, value);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.common.domain.model.Money copy$default(com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = money.currencyCode;
        }
        if ((i & 2) != 0) {
            str2 = money.value;
        }
        return money.copy(str, str2);
    }
}
