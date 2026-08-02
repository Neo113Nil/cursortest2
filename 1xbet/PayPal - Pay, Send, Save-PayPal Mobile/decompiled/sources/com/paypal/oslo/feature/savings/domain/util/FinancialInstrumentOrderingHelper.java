package com.paypal.oslo.feature.savings.domain.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/util/FinancialInstrumentOrderingHelper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "payPalBalanceFi", "", "otherFis", "orderFinancialInstruments", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Ljava/util/List;)Ljava/util/List;", "fiList", "", "fiType", "preSelectedFiId", "selectFiBasedOnType", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "fis", "selectedFiId", "getOrganisedFis", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FinancialInstrumentOrderingHelper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.domain.util.FinancialInstrumentOrderingHelper INSTANCE = new com.paypal.oslo.feature.savings.domain.util.FinancialInstrumentOrderingHelper();

    private FinancialInstrumentOrderingHelper() {
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> orderFinancialInstruments(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO payPalBalanceFi, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> otherFis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalBalanceFi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherFis, "");
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(payPalBalanceFi);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : otherFis) {
            if (((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj).getSource().getInstrumentType() != com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.PAYPAL_BALANCE) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) listOf, (java.lang.Iterable) arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectFiBasedOnType$default(com.paypal.oslo.feature.savings.domain.util.FinancialInstrumentOrderingHelper financialInstrumentOrderingHelper, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return financialInstrumentOrderingHelper.selectFiBasedOnType(list, str, str2);
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> getOrganisedFis(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> fis, java.lang.String selectedFiId) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fis, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(fis.size());
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = null;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO2 = null;
        for (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO3 : fis) {
            if (moneyMovementFiDTO3.getSource().getInstrumentType() == com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.PAYPAL_BALANCE) {
                moneyMovementFiDTO2 = moneyMovementFiDTO3;
            } else {
                if (moneyMovementFiDTO == null && (str = selectedFiId) != null && str.length() != 0) {
                    com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto = moneyMovementFiDTO3.getSource().getFiDto();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(fiDto != null ? fiDto.getInstrumentId() : null, selectedFiId)) {
                        moneyMovementFiDTO = moneyMovementFiDTO3;
                    }
                }
                arrayList.add(moneyMovementFiDTO3);
            }
        }
        if (moneyMovementFiDTO != null) {
            arrayList.add(0, moneyMovementFiDTO);
        }
        if (moneyMovementFiDTO2 != null) {
            arrayList.add(0, moneyMovementFiDTO2);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r6.equals("card") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r6 = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.CARD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x004e, code lost:
    
        if (r6.equals("debitcard") != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectFiBasedOnType(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> fiList, java.lang.String fiType, java.lang.String preSelectedFiId) {
        java.lang.String str;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType instrumentType;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String obj4;
        java.lang.Object obj5 = null;
        if (fiList == null) {
            return null;
        }
        if (fiType == null || (obj4 = kotlin.text.StringsKt.trim(fiType).toString()) == null) {
            str = null;
        } else {
            str = obj4.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -529352196:
                    break;
                case -339185956:
                    if (str.equals("balance")) {
                        instrumentType = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.PAYPAL_BALANCE;
                        break;
                    }
                    break;
                case 3016252:
                    if (str.equals("bank")) {
                        instrumentType = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.BANK;
                        break;
                    }
                    break;
                case 3046160:
                    break;
            }
            if (preSelectedFiId == null) {
                java.util.Iterator<T> it = fiList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto = ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj3).getSource().getFiDto();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(fiDto != null ? fiDto.getInstrumentId() : null, preSelectedFiId)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                moneyMovementFiDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj3;
            } else {
                moneyMovementFiDTO = null;
            }
            if (moneyMovementFiDTO == null) {
                return moneyMovementFiDTO;
            }
            if (instrumentType != null) {
                java.util.Iterator<T> it2 = fiList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj2).getSource().getInstrumentType() == instrumentType) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                moneyMovementFiDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj2;
            } else {
                moneyMovementFiDTO2 = null;
            }
            if (moneyMovementFiDTO2 != null) {
                return moneyMovementFiDTO2;
            }
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list = fiList;
            java.util.Iterator<T> it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj).isPreSelected()) {
                    }
                } else {
                    obj = null;
                }
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj;
            if (moneyMovementFiDTO3 != null) {
                return moneyMovementFiDTO3;
            }
            java.util.Iterator<T> it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    java.lang.Object next = it4.next();
                    if (((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) next).getSource().getInstrumentType() == com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.PAYPAL_BALANCE) {
                        obj5 = next;
                    }
                }
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO4 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj5;
            return moneyMovementFiDTO4 == null ? (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fiList) : moneyMovementFiDTO4;
        }
        instrumentType = null;
        if (preSelectedFiId == null) {
        }
        if (moneyMovementFiDTO == null) {
        }
    }
}
