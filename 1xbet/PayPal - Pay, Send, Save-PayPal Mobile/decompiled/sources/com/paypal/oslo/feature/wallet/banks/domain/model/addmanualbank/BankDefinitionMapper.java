package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinitionMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;", "definitions", "getDefaultDefinition", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;", "sortByCountryName", "(Ljava/util/List;)Ljava/util/List;", "definition", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankInputField;", "sortInputFieldsByCountry", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankDefinitionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper();

    private BankDefinitionMapper() {
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition getDefaultDefinition(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> definitions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitions, "");
        java.lang.Object obj = null;
        if (definitions.isEmpty()) {
            return null;
        }
        java.util.Iterator<T> it = definitions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition) next).getCurrencyCode(), "USD", true)) {
                obj = next;
                break;
            }
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition bankDefinition = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition) obj;
        return bankDefinition == null ? (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition) kotlin.collections.CollectionsKt.first((java.util.List) definitions) : bankDefinition;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> sortByCountryName(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> definitions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitions, "");
        return kotlin.collections.CollectionsKt.sortedWith(definitions, new java.util.Comparator() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper$sortByCountryName$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.lang.String upperCase = com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionExtensionsKt.getIssuerCountryName((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition) t).toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                java.lang.String upperCase2 = com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionExtensionsKt.getIssuerCountryName((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition) t2).toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                return kotlin.comparisons.ComparisonsKt.compareValues(upperCase, upperCase2);
            }
        });
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField> sortInputFieldsByCountry(final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition definition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definition, "");
        return kotlin.collections.CollectionsKt.sortedWith(definition.getInputs(), new java.util.Comparator() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper$sortInputFieldsByCountry$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper bankDefinitionMapper = com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper.INSTANCE;
                java.lang.String lowerCase = ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField) t).getName().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                java.lang.String upperCase = com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition.this.getCurrencyCode().toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper.access$getFieldPriority(bankDefinitionMapper, lowerCase, upperCase));
                com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper bankDefinitionMapper2 = com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper.INSTANCE;
                java.lang.String lowerCase2 = ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField) t2).getName().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                java.lang.String upperCase2 = com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition.this.getCurrencyCode().toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper.access$getFieldPriority(bankDefinitionMapper2, lowerCase2, upperCase2)));
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ int access$getFieldPriority(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper bankDefinitionMapper, java.lang.String str, java.lang.String str2) {
        int hashCode;
        switch (str2.hashCode()) {
            case 65168:
                if (str2.equals("AUD")) {
                    switch (str.hashCode()) {
                        case -95072330:
                            return str.equals("accountnumber") ? 3 : 4;
                        case 3575610:
                            if (str.equals("type")) {
                                return 0;
                            }
                            break;
                        case 927457922:
                            if (str.equals("routingnumber1")) {
                                return 1;
                            }
                            break;
                        case 927457923:
                            if (str.equals("routingnumber2")) {
                                return 2;
                            }
                            break;
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -95072330) {
                    if (hashCode != 3575610) {
                        switch (hashCode) {
                            case 927457922:
                                if (str.equals("routingnumber1")) {
                                    return 1;
                                }
                                break;
                            case 927457923:
                                if (str.equals("routingnumber2")) {
                                    return 2;
                                }
                                break;
                            case 927457924:
                                if (str.equals("routingnumber3")) {
                                    return 3;
                                }
                                break;
                        }
                    } else if (str.equals("type")) {
                        return 0;
                    }
                } else if (str.equals("accountnumber")) {
                    return 4;
                }
                return 5;
            case 66470:
                if (str2.equals("CAD")) {
                    switch (str.hashCode()) {
                        case -95072330:
                            return str.equals("accountnumber") ? 3 : 4;
                        case 3575610:
                            if (str.equals("type")) {
                                return 0;
                            }
                            break;
                        case 927457922:
                            if (str.equals("routingnumber1")) {
                                return 1;
                            }
                            break;
                        case 927457923:
                            if (str.equals("routingnumber2")) {
                                return 2;
                            }
                            break;
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -95072330) {
                }
                return 5;
            case 69026:
                if (str2.equals(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR)) {
                    int hashCode2 = str.hashCode();
                    if (hashCode2 != -95072330) {
                        if (hashCode2 != 3225350) {
                            if (hashCode2 == 3575610 && str.equals("type")) {
                                return 0;
                            }
                        } else if (str.equals(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Iban)) {
                            return 1;
                        }
                    } else if (str.equals("accountnumber")) {
                        return 2;
                    }
                    return 3;
                }
                hashCode = str.hashCode();
                if (hashCode == -95072330) {
                }
                return 5;
            case 70357:
                if (str2.equals("GBP")) {
                    switch (str.hashCode()) {
                        case -95072330:
                            if (!str.equals("accountnumber")) {
                                return 5;
                            }
                            break;
                        case 3575610:
                            if (str.equals("type")) {
                                return 0;
                            }
                            break;
                        case 927457922:
                            if (str.equals("routingnumber1")) {
                                return 1;
                            }
                            break;
                        case 927457923:
                            if (str.equals("routingnumber2")) {
                                return 2;
                            }
                            break;
                        case 927457924:
                            if (str.equals("routingnumber3")) {
                                return 3;
                            }
                            break;
                        case 1662297227:
                            if (!str.equals("sortcode")) {
                            }
                            break;
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -95072330) {
                }
                return 5;
            case 84326:
                if (str2.equals("USD")) {
                    int hashCode3 = str.hashCode();
                    if (hashCode3 != -95072330) {
                        if (hashCode3 != 3575610) {
                            if (hashCode3 == 927457922 && str.equals("routingnumber1")) {
                                return 1;
                            }
                        } else if (str.equals("type")) {
                            return 0;
                        }
                    } else if (str.equals("accountnumber")) {
                        return 2;
                    }
                    return 3;
                }
                hashCode = str.hashCode();
                if (hashCode == -95072330) {
                }
                return 5;
            default:
                hashCode = str.hashCode();
                if (hashCode == -95072330) {
                }
                return 5;
        }
    }
}
