package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiMapper;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddContentProvider;", "contentProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddContentProvider;)V", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "addressLayout", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "prefilledAddress", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "toUiModel", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "p0", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddContentProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressAddUiMapper {
    public static final int $stable;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddContentProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AddressAddUiMapper(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddContentProvider addressAddContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressAddContentProvider, "");
        this.getHighSpeedVideoFpsRanges = addressAddContentProvider;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel toUiModel$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper addressAddUiMapper, com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            address = null;
        }
        return addressAddUiMapper.toUiModel(addressLayout, address);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0299, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a2, code lost:
    
        if (r4.isEmpty() != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a4, code lost:
    
        r7 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a9, code lost:
    
        if (r7 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ab, code lost:
    
        r3.add(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel toUiModel(com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, com.paypal.oslo.core.i18n.domain.model.Address prefilledAddress) {
        com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo fieldInfo;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType;
        java.util.ArrayList arrayList;
        com.paypal.oslo.core.i18n.domain.model.StateList stateList;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLayout, "");
        java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> rows = addressLayout.getRows();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> components = ((com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row) it.next()).getComponents();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : components) {
                if (!((com.paypal.oslo.core.i18n.domain.model.AddressComponent) obj).getHidden()) {
                    arrayList3.add(obj);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList3.iterator();
            while (true) {
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow formFieldRow = null;
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel = null;
                if (!it2.hasNext()) {
                    break;
                }
                com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent = (com.paypal.oslo.core.i18n.domain.model.AddressComponent) it2.next();
                com.paypal.oslo.core.i18n.domain.model.Field field = addressComponent.getField();
                if (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine1) {
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.ADDRESS_LINE_1;
                    com.paypal.oslo.core.commonui.utils.RefText addressLine1Title = this.getHighSpeedVideoFpsRanges.getAddressLine1Title();
                    if (prefilledAddress == null || (str5 = prefilledAddress.m11248getAddressLine1rVKqk9c()) == null) {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    fieldInfo = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo(formFieldId, addressLine1Title, str5);
                } else if (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine2) {
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.ADDRESS_LINE_2;
                    com.paypal.oslo.core.commonui.utils.RefText addressLine2Title = this.getHighSpeedVideoFpsRanges.getAddressLine2Title();
                    if (prefilledAddress == null || (str4 = prefilledAddress.m11249getAddressLine2c7KZG_s()) == null) {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    fieldInfo = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo(formFieldId2, addressLine2Title, str4);
                } else if (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea2) {
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId3 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.CITY;
                    com.paypal.oslo.core.commonui.utils.RefText cityTitle = this.getHighSpeedVideoFpsRanges.getCityTitle();
                    if (prefilledAddress == null || (str3 = prefilledAddress.m11252getAdminArea2DR8a_90()) == null) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    fieldInfo = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo(formFieldId3, cityTitle, str3);
                } else if (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea1) {
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId4 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.STATE;
                    com.paypal.oslo.core.commonui.utils.RefText stateTitle = this.getHighSpeedVideoFpsRanges.getStateTitle();
                    if (prefilledAddress == null || (str2 = prefilledAddress.m11251getAdminArea1bsDj6rY()) == null) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    fieldInfo = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo(formFieldId4, stateTitle, str2);
                } else if (field instanceof com.paypal.oslo.core.i18n.domain.model.PostalCode) {
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId5 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.POSTAL_CODE;
                    com.paypal.oslo.core.commonui.utils.RefText postalCodeTitle = this.getHighSpeedVideoFpsRanges.getPostalCodeTitle();
                    if (prefilledAddress == null || (str = prefilledAddress.m11256getPostalCodeyjZ2Xzc()) == null) {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    fieldInfo = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo(formFieldId5, postalCodeTitle, str);
                } else {
                    fieldInfo = null;
                }
                if (fieldInfo != null) {
                    if (addressComponent.getStateList() != null && (!r8.isEmpty())) {
                        java.util.List<com.paypal.oslo.core.i18n.domain.model.StateList> stateList2 = addressComponent.getStateList();
                        if (stateList2 == null || (stateList = (com.paypal.oslo.core.i18n.domain.model.StateList) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) stateList2)) == null) {
                            arrayList = null;
                        } else {
                            if (!(stateList instanceof com.paypal.oslo.core.i18n.domain.model.StateList.MapValue)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            java.util.Map<java.lang.String, java.lang.String> value = ((com.paypal.oslo.core.i18n.domain.model.StateList.MapValue) stateList).getValue();
                            java.util.ArrayList arrayList5 = new java.util.ArrayList(value.size());
                            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it3 = value.entrySet().iterator();
                            while (it3.hasNext()) {
                                java.lang.String key = it3.next().getKey();
                                arrayList5.add(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.DropDownFormItem(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(key), key));
                            }
                            arrayList = arrayList5;
                        }
                        if (arrayList == null) {
                            arrayList = kotlin.collections.CollectionsKt.emptyList();
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.Companion companion = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.INSTANCE;
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId6 = fieldInfo.getFormFieldId();
                        java.lang.String prefilledValue = fieldInfo.getPrefilledValue();
                        com.paypal.oslo.core.commonui.utils.RefText title = fieldInfo.getTitle();
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Companion companion2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE;
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(null, 1, null);
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.m12363addImeActionZ1hltKU$default(builder, fieldInfo.getFormFieldId(), 0, 2, null);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        formFieldModel = companion.dropdown(formFieldId6, (r16 & 2) != 0 ? "" : prefilledValue, arrayList, (r16 & 8) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("") : title, (r16 & 16) != 0 ? new java.util.ArrayList() : null, (r16 & 32) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE.getEMPTY() : builder.build());
                        if (addressComponent.getRequired()) {
                            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.addressField$default(formFieldModel.getValidations(), getHighSpeedVideoFpsRangesFor(fieldInfo.getFormFieldId()), null, null, null, 14, null);
                        }
                    } else {
                        inputType = addressComponent.getField() instanceof com.paypal.oslo.core.i18n.domain.model.PostalCode ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.NUMERIC : com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.TEXT;
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.Companion companion3 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.INSTANCE;
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId7 = fieldInfo.getFormFieldId();
                        java.lang.String prefilledValue2 = fieldInfo.getPrefilledValue();
                        com.paypal.oslo.core.commonui.utils.RefText title2 = fieldInfo.getTitle();
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Companion companion4 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE;
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder2 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(null, 1, null);
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addBreakLinePasteFilter(builder2);
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.m12363addImeActionZ1hltKU$default(builder2, fieldInfo.getFormFieldId(), 0, 2, null);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        formFieldModel = companion3.textInput(formFieldId7, (r27 & 2) != 0 ? "" : prefilledValue2, (r27 & 4) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.TEXT : inputType, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("") : title2, (r27 & 64) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE.getEMPTY() : builder2.build(), (r27 & 128) != 0 ? new java.util.ArrayList() : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
                        if (addressComponent.getRequired()) {
                            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId8 = fieldInfo.getFormFieldId();
                            int i = com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper.WhenMappings.$EnumSwitchMapping$0[formFieldId8.ordinal()];
                            if (i == 1) {
                                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.addressField$default(formFieldModel.getValidations(), this.getHighSpeedVideoFpsRanges.getAddressRequiredError(), null, this.getHighSpeedVideoFpsRanges.getAddressInvalidCharError(), this.getHighSpeedVideoFpsRanges.getAddressPoBoxError(), 2, null);
                            } else if (i == 2) {
                                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.addressField$default(formFieldModel.getValidations(), this.getHighSpeedVideoFpsRanges.getCityRequiredError(), null, null, null, 14, null);
                            } else if (i == 3) {
                                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.addressField$default(formFieldModel.getValidations(), this.getHighSpeedVideoFpsRanges.getPostalCodeRequiredError(), this.getHighSpeedVideoFpsRanges.getPostalCodeInvalidError(), null, null, 12, null);
                            } else {
                                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.addressField$default(formFieldModel.getValidations(), getHighSpeedVideoFpsRangesFor(formFieldId8), null, null, null, 14, null);
                            }
                        }
                    }
                }
                if (formFieldModel != null) {
                    arrayList4.add(formFieldModel);
                }
            }
        }
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel(arrayList2, this.getHighSpeedVideoFpsRanges.getTitle(), this.getHighSpeedVideoFpsRanges.getSaveButtonText(), this.getHighSpeedVideoFpsRanges.getToolBarContent());
    }

    private final com.paypal.oslo.core.commonui.utils.RefText getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId p0) {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            return this.getHighSpeedVideoFpsRanges.getAddressRequiredError();
        }
        if (i == 2) {
            return this.getHighSpeedVideoFpsRanges.getCityRequiredError();
        }
        if (i == 3) {
            return this.getHighSpeedVideoFpsRanges.getPostalCodeRequiredError();
        }
        if (i == 4) {
            return this.getHighSpeedVideoFpsRanges.getStateRequiredError();
        }
        return this.getHighSpeedVideoFpsRanges.getAddressRequiredError();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.ADDRESS_LINE_1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.CITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.POSTAL_CODE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.STATE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
