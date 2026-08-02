package com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "", "balanceDisplayName", "getDisplayName", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/PayPalBalanceData;", "toMoneyMovementFiDTO", "(Lcom/paypal/oslo/feature/savings/domain/model/PayPalBalanceData;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsData;", "", "toMoneyMovementFiDTOList", "(Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsData;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoneyMovementFiDTOKt {
    public static /* synthetic */ java.lang.String getDisplayName$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return getDisplayName(moneyMovementFiDTO, str);
    }

    public static final java.lang.String getDisplayName(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, java.lang.String str) {
        java.lang.String nickname;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO issuer;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO> names;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO nameDTO;
        java.lang.String nickname2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyMovementFiDTO, "");
        int i = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTOKt.WhenMappings.$EnumSwitchMapping$0[moneyMovementFiDTO.getSource().getInstrumentType().ordinal()];
        if (i == 1) {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto = moneyMovementFiDTO.getSource().getFiDto();
            if (fiDto != null && (nickname = fiDto.getNickname()) != null) {
                return nickname;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto2 = moneyMovementFiDTO.getSource().getFiDto();
            r3 = fiDto2 != null ? fiDto2.getBrand() : null;
            return r3 == null ? "" : r3;
        }
        if (i != 2) {
            if (i == 3) {
                return str == null ? "" : str;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto3 = moneyMovementFiDTO.getSource().getFiDto();
        if (fiDto3 != null && (nickname2 = fiDto3.getNickname()) != null) {
            return nickname2;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto4 = moneyMovementFiDTO.getSource().getFiDto();
        if (fiDto4 != null && (issuer = fiDto4.getIssuer()) != null && (names = issuer.getNames()) != null && (nameDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) names)) != null) {
            r3 = nameDTO.getName();
        }
        return r3 == null ? "" : r3;
    }

    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO toMoneyMovementFiDTO(com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData payPalBalanceData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalBalanceData, "");
        java.lang.String instrumentId = payPalBalanceData.getInstrumentId();
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO sourceDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.PAYPAL_BALANCE, null, payPalBalanceData.getAvailableBalance().getFormattedAmount());
        java.lang.String instrumentId2 = payPalBalanceData.getInstrumentId();
        java.lang.String currencyCode = payPalBalanceData.getCurrencyCode();
        java.lang.Boolean primary = payPalBalanceData.getPrimary();
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO(instrumentId, "INSTANT", sourceDTO, new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO("STORED_VALUE", new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO(instrumentId2, currencyCode, primary != null ? primary.booleanValue() : true)), (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO) null, true, (java.util.List) null, (java.util.List) null, false, 448, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> toMoneyMovementFiDTOList(com.paypal.oslo.feature.savings.domain.model.DepositOptionsData depositOptionsData) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType instrumentType;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDTO;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositOptionsData, "");
        java.util.List<com.paypal.oslo.feature.savings.domain.model.DepositOption> options = depositOptionsData.getOptions();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.savings.domain.model.DepositOption depositOption : options) {
            com.paypal.oslo.feature.savings.domain.model.DepositFundingSource depositFundingSource = (com.paypal.oslo.feature.savings.domain.model.DepositFundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) depositOption.getFundingSources());
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = null;
            if (depositFundingSource != null) {
                java.lang.String transferSpeed = depositOption.getTransferSpeed();
                boolean isDefault = depositOption.isDefault();
                java.util.List<java.lang.String> tags = depositOption.getTags();
                java.util.List<com.paypal.oslo.feature.savings.domain.model.DepositLimit> limits = depositOption.getLimits();
                com.paypal.oslo.feature.savings.domain.model.DepositInstrument instrument = depositFundingSource.getInstrument();
                if (instrument instanceof com.paypal.oslo.feature.savings.domain.model.DepositInstrument.BankAccount) {
                    instrumentType = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.BANK;
                } else if (instrument instanceof com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Card) {
                    instrumentType = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.CARD;
                } else {
                    if (!(instrument instanceof com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Unknown)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    instrumentType = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.BANK;
                }
                com.paypal.oslo.feature.savings.domain.model.DepositInstrument instrument2 = depositFundingSource.getInstrument();
                boolean z = instrument2 instanceof com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Card;
                java.lang.String str2 = com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.FI_FALLBACK_IMAGE_URL;
                if (z) {
                    com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Card card = (com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Card) instrument2;
                    java.lang.String id = card.getId();
                    java.lang.String lastNChars = card.getLastNChars();
                    java.lang.String issuerName = card.getIssuerName();
                    com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO issuerDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO(kotlin.collections.CollectionsKt.listOfNotNull(issuerName != null ? new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO(issuerName) : null), "US");
                    java.lang.String cardArtUrl = card.getCardArtUrl();
                    java.lang.String str3 = cardArtUrl;
                    if (str3 != null && str3.length() != 0) {
                        str2 = cardArtUrl;
                    }
                    fiDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO(id, "USD", lastNChars, "", issuerDTO, new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.ImageDTO(str2, com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL), card.getBrand(), card.getNickName(), null);
                } else if (instrument2 instanceof com.paypal.oslo.feature.savings.domain.model.DepositInstrument.BankAccount) {
                    com.paypal.oslo.feature.savings.domain.model.DepositInstrument.BankAccount bankAccount = (com.paypal.oslo.feature.savings.domain.model.DepositInstrument.BankAccount) instrument2;
                    java.lang.String institutionImageUrl = bankAccount.getInstitutionImageUrl();
                    java.lang.String str4 = institutionImageUrl;
                    if (str4 != null && str4.length() != 0) {
                        str2 = institutionImageUrl;
                    }
                    fiDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO(bankAccount.getId(), "USD", bankAccount.getLastNChars(), "", new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO(bankAccount.getIssuerName())), "US"), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.ImageDTO(str2, com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL), "", bankAccount.getNickName(), bankAccount.getType());
                } else {
                    if (!(instrument2 instanceof com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Unknown)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    fiDTO = null;
                }
                com.paypal.oslo.feature.savings.domain.model.DepositInstrument instrument3 = depositFundingSource.getInstrument();
                if (instrument3 instanceof com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Card) {
                    str = ((com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Card) instrument3).getId();
                } else if (instrument3 instanceof com.paypal.oslo.feature.savings.domain.model.DepositInstrument.BankAccount) {
                    str = ((com.paypal.oslo.feature.savings.domain.model.DepositInstrument.BankAccount) instrument3).getId();
                } else {
                    if (!(instrument3 instanceof com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Unknown)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str = "";
                }
                moneyMovementFiDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO(str, transferSpeed, new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO(instrumentType, fiDTO, null), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO(depositFundingSource.getType(), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO(str, "USD", true)), null, isDefault, tags, limits, tags.contains(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.MOST_RECENTLY_USED_TAG));
            }
            if (moneyMovementFiDTO != null) {
                arrayList.add(moneyMovementFiDTO);
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.PAYPAL_BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
