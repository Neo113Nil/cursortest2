package com.zettle.sdk.common.ui.components.totalamount;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion", "START", "END"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public enum OttoTotalAmountCurrencyPosition {
    START(0),
    END(1);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition.Companion INSTANCE = new com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition.Companion(null);
    private final int value;

    OttoTotalAmountCurrencyPosition(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;", "findByValue", "(I)Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition findByValue(int value) {
            com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition ottoTotalAmountCurrencyPosition;
            com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition[] values = com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    ottoTotalAmountCurrencyPosition = null;
                    break;
                }
                ottoTotalAmountCurrencyPosition = values[i];
                if (ottoTotalAmountCurrencyPosition.getValue() == value) {
                    break;
                }
                i++;
            }
            return ottoTotalAmountCurrencyPosition == null ? com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition.START : ottoTotalAmountCurrencyPosition;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
