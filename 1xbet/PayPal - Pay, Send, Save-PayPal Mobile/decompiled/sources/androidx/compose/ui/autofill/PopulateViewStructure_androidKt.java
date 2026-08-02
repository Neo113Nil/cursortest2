package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroid/view/ViewStructure;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "semanticsInfo", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "", com.visa.cbp.ConsumerInfo.setSignature, "Landroidx/compose/ui/spatial/RectManager;", "rectManager", "", "populate", "(Landroid/view/ViewStructure;Landroidx/compose/ui/semantics/SemanticsInfo;Landroid/view/autofill/AutofillId;Ljava/lang/String;Landroidx/compose/ui/spatial/RectManager;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PopulateViewStructure_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void populate(final android.view.ViewStructure viewStructure, androidx.compose.ui.semantics.SemanticsInfo semanticsInfo, android.view.autofill.AutofillId autofillId, java.lang.String str, androidx.compose.ui.spatial.RectManager rectManager) {
        java.lang.String str2;
        androidx.compose.ui.state.ToggleableState toggleableState;
        androidx.compose.ui.autofill.ContentType contentType;
        androidx.compose.ui.autofill.AndroidFillableData androidFillableData;
        androidx.compose.ui.text.AnnotatedString annotatedString;
        androidx.compose.ui.autofill.ContentDataType contentDataType;
        java.lang.Integer num;
        androidx.compose.ui.semantics.Role role;
        java.lang.Boolean bool;
        boolean z;
        boolean z2;
        boolean z3;
        java.util.List list;
        boolean z4;
        boolean z5;
        java.lang.String m7775toLegacyClassNameV4PA4sw;
        java.lang.String[] contentHints;
        java.lang.String[] contentHints2;
        androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> props$ui;
        long[] jArr;
        java.lang.Object[] objArr;
        long[] jArr2;
        java.lang.Object[] objArr2;
        androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> props$ui2;
        androidx.compose.ui.state.ToggleableState toggleableState2;
        long[] jArr3;
        java.lang.String str3;
        long[] jArr4;
        char c;
        final androidx.compose.ui.autofill.AutofillApi26Helper autofillApi26Helper = androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE;
        androidx.compose.ui.semantics.SemanticsProperties semanticsProperties = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE;
        androidx.compose.ui.semantics.SemanticsActions semanticsActions = androidx.compose.ui.semantics.SemanticsActions.INSTANCE;
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        char c2 = 7;
        long j = -9187201950435737472L;
        java.lang.String str4 = "";
        java.lang.Integer num2 = null;
        if (semanticsConfiguration == null || (props$ui2 = semanticsConfiguration.getProps$ui()) == null) {
            str2 = "";
            toggleableState = null;
            contentType = null;
            androidFillableData = null;
            annotatedString = null;
            contentDataType = null;
            num = null;
            role = null;
            bool = null;
            z = true;
            z2 = false;
            z3 = false;
        } else {
            androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> mutableScatterMap = props$ui2;
            java.lang.Object[] objArr3 = mutableScatterMap.keys;
            java.lang.Object[] objArr4 = mutableScatterMap.values;
            long[] jArr5 = mutableScatterMap.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                contentType = null;
                androidFillableData = null;
                annotatedString = null;
                contentDataType = null;
                num = null;
                role = null;
                bool = null;
                toggleableState2 = null;
                int i = 0;
                z = true;
                z2 = false;
                z3 = false;
                while (true) {
                    long j2 = jArr5[i];
                    java.lang.String str5 = str4;
                    if ((((~j2) << c2) & j2 & j) != j) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j2 & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                java.lang.Object obj = objArr3[i4];
                                java.lang.Object obj2 = objArr4[i4];
                                androidx.compose.ui.semantics.SemanticsPropertyKey semanticsPropertyKey = (androidx.compose.ui.semantics.SemanticsPropertyKey) obj;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getContentDataType())) {
                                    str3 = str5;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                    contentDataType = (androidx.compose.ui.autofill.ContentDataType) obj2;
                                } else {
                                    str3 = str5;
                                    jArr4 = jArr5;
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getContentDescription())) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                        java.lang.String str6 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) obj2);
                                        if (str6 != null) {
                                            autofillApi26Helper.setContentDescription(viewStructure, str6);
                                        }
                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getContentType())) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                        contentType = (androidx.compose.ui.autofill.ContentType) obj2;
                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getFillableData())) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                        androidFillableData = (androidx.compose.ui.autofill.AndroidFillableData) obj2;
                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getEditableText())) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                        annotatedString = (androidx.compose.ui.text.AnnotatedString) obj2;
                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getFocused())) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                        autofillApi26Helper.setFocused(viewStructure, ((java.lang.Boolean) obj2).booleanValue());
                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getMaxTextLength())) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                        num = (java.lang.Integer) obj2;
                                    } else {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getPassword())) {
                                            c = '\b';
                                            z2 = true;
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getIsSensitiveData())) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                            z = ((java.lang.Boolean) obj2).booleanValue();
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getRole())) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                            role = (androidx.compose.ui.semantics.Role) obj2;
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getSelected())) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                            bool = (java.lang.Boolean) obj2;
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getToggleableState())) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str3);
                                            toggleableState2 = (androidx.compose.ui.state.ToggleableState) obj2;
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.getOnClick())) {
                                            autofillApi26Helper.setClickable(viewStructure, true);
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.getOnLongClick())) {
                                            autofillApi26Helper.setLongClickable(viewStructure, true);
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.getRequestFocus())) {
                                            autofillApi26Helper.setFocusable(viewStructure, true);
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.getSetText())) {
                                            c = '\b';
                                            z3 = true;
                                        }
                                        j2 >>= c;
                                        i3++;
                                        jArr5 = jArr4;
                                        str5 = str3;
                                    }
                                    c = '\b';
                                    j2 >>= c;
                                    i3++;
                                    jArr5 = jArr4;
                                    str5 = str3;
                                }
                            } else {
                                str3 = str5;
                            }
                            jArr4 = jArr5;
                            c = '\b';
                            j2 >>= c;
                            i3++;
                            jArr5 = jArr4;
                            str5 = str3;
                        }
                        str2 = str5;
                        jArr3 = jArr5;
                        if (i2 != 8) {
                            break;
                        }
                    } else {
                        str2 = str5;
                        jArr3 = jArr5;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    str4 = str2;
                    jArr5 = jArr3;
                    c2 = 7;
                    j = -9187201950435737472L;
                }
            } else {
                str2 = "";
                contentType = null;
                androidFillableData = null;
                annotatedString = null;
                contentDataType = null;
                num = null;
                role = null;
                bool = null;
                toggleableState2 = null;
                z = true;
                z2 = false;
                z3 = false;
            }
            toggleableState = toggleableState2;
        }
        androidx.compose.ui.semantics.SemanticsConfiguration mergedSemanticsConfiguration = androidx.compose.ui.semantics.SemanticsInfoKt.mergedSemanticsConfiguration(semanticsInfo);
        if (mergedSemanticsConfiguration != null && (props$ui = mergedSemanticsConfiguration.getProps$ui()) != null) {
            androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> mutableScatterMap2 = props$ui;
            java.lang.Object[] objArr5 = mutableScatterMap2.keys;
            java.lang.Object[] objArr6 = mutableScatterMap2.values;
            long[] jArr6 = mutableScatterMap2.metadata;
            int length2 = jArr6.length - 2;
            if (length2 >= 0) {
                list = null;
                int i5 = 0;
                while (true) {
                    long j3 = jArr6[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                java.lang.Object obj3 = objArr5[i8];
                                java.lang.Object obj4 = objArr6[i8];
                                jArr2 = jArr6;
                                androidx.compose.ui.semantics.SemanticsPropertyKey semanticsPropertyKey2 = (androidx.compose.ui.semantics.SemanticsPropertyKey) obj3;
                                objArr2 = objArr5;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey2, semanticsProperties.getDisabled())) {
                                    autofillApi26Helper.setEnabled(viewStructure, false);
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey2, semanticsProperties.getText())) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, str2);
                                    list = (java.util.List) obj4;
                                }
                            } else {
                                jArr2 = jArr6;
                                objArr2 = objArr5;
                            }
                            j3 >>= 8;
                            i7++;
                            jArr6 = jArr2;
                            objArr5 = objArr2;
                        }
                        jArr = jArr6;
                        objArr = objArr5;
                        if (i6 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr6;
                        objArr = objArr5;
                    }
                    if (i5 == length2) {
                        break;
                    }
                    i5++;
                    jArr6 = jArr;
                    objArr5 = objArr;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(semanticsInfo.getSemanticsId());
                if (semanticsInfo.getParentInfo() == null) {
                    valueOf = null;
                }
                int intValue = valueOf == null ? valueOf.intValue() : -1;
                autofillApi26Helper.setAutofillId(viewStructure, autofillId, intValue);
                java.lang.String str7 = str2;
                autofillApi26Helper.setId(viewStructure, intValue, str, null, null);
                if (contentDataType == null) {
                    num2 = java.lang.Integer.valueOf(androidx.compose.ui.autofill.ContentDataType_androidKt.getDataType(contentDataType));
                } else if (z3) {
                    num2 = 1;
                } else if (toggleableState != null) {
                    num2 = 2;
                }
                if (num2 != null) {
                    autofillApi26Helper.setAutofillType(viewStructure, num2.intValue());
                }
                if (annotatedString != null) {
                    autofillApi26Helper.setAutofillValue(viewStructure, autofillApi26Helper.getAutofillTextValue(annotatedString.getText()));
                }
                if (androidFillableData != null) {
                    autofillApi26Helper.setAutofillValue(viewStructure, androidFillableData.getAutofillValue());
                }
                if (contentType != null && (contentHints2 = androidx.compose.ui.autofill.ContentType_androidKt.getContentHints(contentType)) != null) {
                    autofillApi26Helper.setAutofillHints(viewStructure, contentHints2);
                }
                rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new kotlin.jvm.functions.Function4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$7
                    @Override // kotlin.jvm.functions.Function4
                    public final /* synthetic */ kotlin.Unit invoke(java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Integer num6) {
                        getHighSpeedVideoFpsRangesFor(num3.intValue(), num4.intValue(), num5.intValue(), num6.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor(int i9, int i10, int i11, int i12) {
                        androidx.compose.ui.autofill.AutofillApi26Helper.this.setDimens(viewStructure, i9, i10, 0, 0, i11 - i9, i12 - i10);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }
                });
                if (bool != null) {
                    autofillApi26Helper.setSelected(viewStructure, bool.booleanValue());
                }
                if (toggleableState == null) {
                    autofillApi26Helper.setCheckable(viewStructure, true);
                    autofillApi26Helper.setChecked(viewStructure, toggleableState == androidx.compose.ui.state.ToggleableState.On);
                } else if (bool != null) {
                    int m7805getTabo7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m7805getTabo7Vup1c();
                    if (role == null || !androidx.compose.ui.semantics.Role.m7794equalsimpl0(role.getGetHighSpeedVideoSizes(), m7805getTabo7Vup1c)) {
                        autofillApi26Helper.setCheckable(viewStructure, true);
                        autofillApi26Helper.setChecked(viewStructure, bool.booleanValue());
                    }
                }
                java.lang.String str8 = (java.lang.String) kotlin.collections.ArraysKt.first(androidx.compose.ui.autofill.ContentType_androidKt.getContentHints(androidx.compose.ui.autofill.ContentType.INSTANCE.getPassword()));
                if (contentType != null || (contentHints = androidx.compose.ui.autofill.ContentType_androidKt.getContentHints(contentType)) == null) {
                    z4 = true;
                } else {
                    z4 = true;
                    if (kotlin.collections.ArraysKt.contains(contentHints, str8)) {
                        z5 = true;
                        boolean z6 = (!z2 || z5) ? z4 : false;
                        autofillApi26Helper.setDataIsSensitive(viewStructure, (!z6 || z) ? z4 : false);
                        autofillApi26Helper.setVisibility(viewStructure, semanticsInfo.isTransparent() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            java.lang.String str9 = str7;
                            for (int i9 = 0; i9 < size; i9++) {
                                androidx.compose.ui.text.AnnotatedString annotatedString2 = (androidx.compose.ui.text.AnnotatedString) list.get(i9);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(str9);
                                sb.append(annotatedString2.getText());
                                sb.append('\n');
                                str9 = sb.toString();
                            }
                            autofillApi26Helper.setText(viewStructure, str9);
                            autofillApi26Helper.setClassName(viewStructure, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                        }
                        if (semanticsInfo.getChildrenInfo().isEmpty() && role != null && (m7775toLegacyClassNameV4PA4sw = androidx.compose.ui.platform.SemanticsUtils_androidKt.m7775toLegacyClassNameV4PA4sw(role.getGetHighSpeedVideoSizes())) != null) {
                            autofillApi26Helper.setClassName(viewStructure, m7775toLegacyClassNameV4PA4sw);
                        }
                        if (z3) {
                            autofillApi26Helper.setClassName(viewStructure, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                            if (android.os.Build.VERSION.SDK_INT >= 28 && num != null) {
                                androidx.compose.ui.autofill.AutofillApi28Helper.INSTANCE.setMaxTextLength(viewStructure, num.intValue());
                            }
                            if (z6) {
                                autofillApi26Helper.setInputType(viewStructure, 129);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z5 = false;
                if (z2) {
                }
                autofillApi26Helper.setDataIsSensitive(viewStructure, (!z6 || z) ? z4 : false);
                autofillApi26Helper.setVisibility(viewStructure, semanticsInfo.isTransparent() ? 4 : 0);
                if (list != null) {
                }
                if (semanticsInfo.getChildrenInfo().isEmpty()) {
                    autofillApi26Helper.setClassName(viewStructure, m7775toLegacyClassNameV4PA4sw);
                }
                if (z3) {
                }
            }
        }
        list = null;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(semanticsInfo.getSemanticsId());
        if (semanticsInfo.getParentInfo() == null) {
        }
        int intValue2 = valueOf2 == null ? valueOf2.intValue() : -1;
        autofillApi26Helper.setAutofillId(viewStructure, autofillId, intValue2);
        java.lang.String str72 = str2;
        autofillApi26Helper.setId(viewStructure, intValue2, str, null, null);
        if (contentDataType == null) {
        }
        if (num2 != null) {
        }
        if (annotatedString != null) {
        }
        if (androidFillableData != null) {
        }
        if (contentType != null) {
            autofillApi26Helper.setAutofillHints(viewStructure, contentHints2);
        }
        rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new kotlin.jvm.functions.Function4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$7
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Integer num6) {
                getHighSpeedVideoFpsRangesFor(num3.intValue(), num4.intValue(), num5.intValue(), num6.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(int i92, int i10, int i11, int i12) {
                androidx.compose.ui.autofill.AutofillApi26Helper.this.setDimens(viewStructure, i92, i10, 0, 0, i11 - i92, i12 - i10);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }
        });
        if (bool != null) {
        }
        if (toggleableState == null) {
        }
        java.lang.String str82 = (java.lang.String) kotlin.collections.ArraysKt.first(androidx.compose.ui.autofill.ContentType_androidKt.getContentHints(androidx.compose.ui.autofill.ContentType.INSTANCE.getPassword()));
        if (contentType != null) {
        }
        z4 = true;
        z5 = false;
        if (z2) {
        }
        autofillApi26Helper.setDataIsSensitive(viewStructure, (!z6 || z) ? z4 : false);
        autofillApi26Helper.setVisibility(viewStructure, semanticsInfo.isTransparent() ? 4 : 0);
        if (list != null) {
        }
        if (semanticsInfo.getChildrenInfo().isEmpty()) {
        }
        if (z3) {
        }
    }
}
