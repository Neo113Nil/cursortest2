package com.paypal.oslo.feature.balance.ui.autoReload.frequency;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEffect;", "", "GoBackWithResult", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEffect$GoBackWithResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FrequencyEffect {

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEffect$GoBackWithResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEffect;", "Ljava/time/LocalDate;", "startDate", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "frequency", "<init>", "(Ljava/time/LocalDate;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;)V", "component1", "()Ljava/time/LocalDate;", "component2", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "copy", "(Ljava/time/LocalDate;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;)Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEffect$GoBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "getStartDate", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "getFrequency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoBackWithResult implements com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency;
        private final java.time.LocalDate startDate;

        public GoBackWithResult(java.time.LocalDate localDate, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFrequency, "");
            this.startDate = localDate;
            this.frequency = autoReloadFrequency;
        }

        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
            return this.frequency;
        }

        public final java.lang.String toString() {
            java.time.LocalDate localDate = this.startDate;
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency = this.frequency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoBackWithResult(startDate=");
            sb.append(localDate);
            sb.append(", frequency=");
            sb.append(autoReloadFrequency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.startDate.hashCode() * 31) + this.frequency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect.GoBackWithResult)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect.GoBackWithResult goBackWithResult = (com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect.GoBackWithResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, goBackWithResult.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequency, goBackWithResult.frequency);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect.GoBackWithResult copy(java.time.LocalDate startDate, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect.GoBackWithResult(startDate, frequency);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
            return this.frequency;
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect.GoBackWithResult copy$default(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect.GoBackWithResult goBackWithResult, java.time.LocalDate localDate, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                localDate = goBackWithResult.startDate;
            }
            if ((i & 2) != 0) {
                autoReloadFrequency = goBackWithResult.frequency;
            }
            return goBackWithResult.copy(localDate, autoReloadFrequency);
        }
    }
}
