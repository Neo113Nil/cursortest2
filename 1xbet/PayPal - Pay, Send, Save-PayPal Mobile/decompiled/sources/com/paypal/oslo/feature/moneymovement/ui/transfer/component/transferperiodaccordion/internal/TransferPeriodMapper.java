package com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/internal/TransferPeriodMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriod;", "transferPeriod", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/internal/TransferPeriodOption;", "mapToOption", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriod;)Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/internal/TransferPeriodOption;", "", "periods", "mapToOptions", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "speed", "Lcom/paypal/pds/core/Icon;", "getIconForSpeed$money_movement_prodRelease", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;)Lcom/paypal/pds/core/Icon;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferPeriodMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodMapper INSTANCE = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodMapper();

    private TransferPeriodMapper() {
    }

    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption mapToOption(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod transferPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferPeriod, "");
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption(transferPeriod.getTransferSpeed(), transferPeriod.getDisplayName(), transferPeriod.getFeeText(), getIconForSpeed$money_movement_prodRelease(transferPeriod.getTransferSpeed()));
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption> mapToOptions(java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod> periods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "");
        java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod> list = periods;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.mapToOption((com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod) it.next()));
        }
        return arrayList;
    }

    public final com.paypal.pds.core.Icon getIconForSpeed$money_movement_prodRelease(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed speed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(speed, "");
        switch (com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodMapper.WhenMappings.$EnumSwitchMapping$0[speed.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return com.paypal.pds.core.Icon.Clock.INSTANCE;
            case 5:
            case 6:
            case 7:
                return com.paypal.pds.core.Icon.Calendar.INSTANCE;
            case 8:
                return com.paypal.pds.core.Icon.Clock.INSTANCE;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.INSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.WITHIN_MINUTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.WITHIN_AN_HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.SAME_DAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.ONE_TO_THREE_DAYS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.TWO_TO_THREE_DAYS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.THREE_TO_FIVE_DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.UNKNOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
