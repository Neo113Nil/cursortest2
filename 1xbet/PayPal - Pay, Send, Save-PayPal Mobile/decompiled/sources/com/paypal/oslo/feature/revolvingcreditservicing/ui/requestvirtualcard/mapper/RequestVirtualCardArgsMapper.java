package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/mapper/RequestVirtualCardArgsMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/uimodel/RequestVirtualCardUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/uimodel/RequestVirtualCardUiModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequestVirtualCardArgsMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RequestVirtualCardArgsMapper() {
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel toUiModel(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel(args.getCardArtUrl(), args.getCardHolderTermsUrl());
    }
}
