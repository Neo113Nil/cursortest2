package com.paypal.oslo.feature.moneymovement.api.shared.components.header;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks;", "", "Lkotlin/Function0;", "", "getOnAmountClicked", "()Lkotlin/jvm/functions/Function0;", "onAmountClicked", "getOnDestinationClicked", "onDestinationClicked", "getOnNoteClicked", "onNoteClicked", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface HeaderCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks.Companion INSTANCE = com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks.Companion.getHighSpeedVideoFpsRanges;

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnAmountClicked();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnDestinationClicked();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnNoteClicked();

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onAmountClicked", "onDestinationClicked", "onNoteClicked", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks;", "invoke", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks.Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks invoke$default(com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks.Companion companion, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 2) != 0) {
                function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 4) != 0) {
                function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            return companion.invoke(function0, function02, function03);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks invoke(final kotlin.jvm.functions.Function0<kotlin.Unit> onAmountClicked, final kotlin.jvm.functions.Function0<kotlin.Unit> onDestinationClicked, final kotlin.jvm.functions.Function0<kotlin.Unit> onNoteClicked) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAmountClicked, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDestinationClicked, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNoteClicked, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks(onAmountClicked, onDestinationClicked, onNoteClicked) { // from class: com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks$Companion$invoke$4
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onAmountClicked;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onDestinationClicked;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onNoteClicked;

                {
                    this.onAmountClicked = onAmountClicked;
                    this.onDestinationClicked = onDestinationClicked;
                    this.onNoteClicked = onNoteClicked;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAmountClicked() {
                    return this.onAmountClicked;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDestinationClicked() {
                    return this.onDestinationClicked;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNoteClicked() {
                    return this.onNoteClicked;
                }
            };
        }
    }
}
