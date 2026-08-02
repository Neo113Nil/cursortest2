package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b2\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ]\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0016J/\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"R\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0006\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000b\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\"\u0010\f\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u00102\u001a\u0004\b\f\u00104\"\u0004\b9\u00106R\"\u0010\u000e\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u0012\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0014\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u00104"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/input/TransformedText;", "transformedText", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "", "readOnly", "enabled", "isPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "<init>", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "updateNodeSemantics", "p0", "", "p1", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Ljava/lang/String;ZZ)V", "Landroidx/compose/ui/text/input/TransformedText;", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "setTransformedText", "(Landroidx/compose/ui/text/input/TransformedText;)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "Z", "getReadOnly", "()Z", "setReadOnly", "(Z)V", "getEnabled", "setEnabled", "setPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "getImeOptions", "()Landroidx/compose/ui/text/input/ImeOptions;", "setImeOptions", "(Landroidx/compose/ui/text/input/ImeOptions;)V", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoreTextFieldSemanticsModifierNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean enabled;
    private androidx.compose.ui.focus.FocusRequester focusRequester;
    private androidx.compose.ui.text.input.ImeOptions imeOptions;
    private boolean isPassword;
    private androidx.compose.foundation.text.selection.TextFieldSelectionManager manager;
    private androidx.compose.ui.text.input.OffsetMapping offsetMapping;
    private boolean readOnly;
    private androidx.compose.foundation.text.LegacyTextFieldState state;
    private androidx.compose.ui.text.input.TransformedText transformedText;
    private androidx.compose.ui.text.input.TextFieldValue value;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public CoreTextFieldSemanticsModifierNode(androidx.compose.ui.text.input.TransformedText transformedText, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z;
        this.enabled = z2;
        this.isPassword = z3;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        textFieldSelectionManager.setRequestAutofillAction$foundation(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$zrFXF4vmHagjo7y5hrxWPwulXpk(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }

    public final androidx.compose.ui.text.input.TransformedText getTransformedText() {
        return this.transformedText;
    }

    public final void setTransformedText(androidx.compose.ui.text.input.TransformedText transformedText) {
        this.transformedText = transformedText;
    }

    public final androidx.compose.ui.text.input.TextFieldValue getValue() {
        return this.value;
    }

    public final void setValue(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        this.value = textFieldValue;
    }

    public final androidx.compose.foundation.text.LegacyTextFieldState getState() {
        return this.state;
    }

    public final void setState(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    /* renamed from: isPassword, reason: from getter */
    public final boolean getIsPassword() {
        return this.isPassword;
    }

    public final void setPassword(boolean z) {
        this.isPassword = z;
    }

    public final androidx.compose.ui.text.input.OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final void setOffsetMapping(androidx.compose.ui.text.input.OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager getManager() {
        return this.manager;
    }

    public final void setManager(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        this.manager = textFieldSelectionManager;
    }

    public final androidx.compose.ui.text.input.ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    public final void setImeOptions(androidx.compose.ui.text.input.ImeOptions imeOptions) {
        this.imeOptions = imeOptions;
    }

    public final androidx.compose.ui.focus.FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(final androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.value.getAnnotatedString());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.transformedText.getText());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7816setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.value.getSelection());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentDataType.INSTANCE.getText());
        androidx.compose.ui.autofill.FillableData createFromText = androidx.compose.ui.autofill.FillableData_androidKt.createFromText(androidx.compose.ui.autofill.FillableData.INSTANCE, this.value.getAnnotatedString());
        if (createFromText != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, createFromText);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$3gv9SuBqeUuRO5d0AvnBfXBKj5M(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this, (androidx.compose.ui.autofill.FillableData) obj));
            }
        }, 1, null);
        int keyboardType = this.imeOptions.getKeyboardType();
        if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8267getEmailPjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.INSTANCE.getEmailAddress());
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8270getPasswordPjHm6EE()) || androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8269getNumberPasswordPjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.INSTANCE.getPassword());
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8271getPhonePjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.INSTANCE.getPhoneNumber());
        }
        if (!this.enabled) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        boolean z = this.enabled && !this.readOnly;
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$vbrPtQOCpP_4RNBlmKZxSlbPaRA(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this, (java.util.List) obj));
            }
        }, 1, null);
        if (z) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.m2217$r8$lambda$2_G4Hz4w_vHg7VJifSjsB6cGh4(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this, (androidx.compose.ui.text.AnnotatedString) obj));
                }
            }, 1, null);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$1oCRAaLxNeVJf3ObKYXdLCkxCb8(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this, semanticsPropertyReceiver, (androidx.compose.ui.text.AnnotatedString) obj));
                }
            }, 1, null);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$23cpgN1YAZErRY6zKJuf9Vx1hnM(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), ((java.lang.Boolean) obj3).booleanValue()));
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7812onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.getImeAction(), null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$5AAfTNEw6FKbvlbEs3T2FdLCpNk(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this));
            }
        }, 2, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.m2218$r8$lambda$mzlQXb7iJdIqR0g0P97QirPqAk(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this));
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.m2216$r8$lambda$1SVA8d45DGjKHSllCuPexhToGI(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this));
            }
        }, 1, null);
        if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.value.getSelection()) && !this.isPassword) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$VeJllZoHfC_Jge5oiaqvfJntO88(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this));
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$I79JpNhUwIo_rLp2FPTLxLtUcGc(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this));
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$Lr3qyTeFDwo_3qXmTmaEhOyzp3M(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this));
            }
        }, 1, null);
    }

    public final void updateNodeSemantics(androidx.compose.ui.text.input.TransformedText transformedText, androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.foundation.text.LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextFieldSelectionManager manager, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.ui.focus.FocusRequester focusRequester) {
        boolean z = this.enabled;
        boolean z2 = false;
        boolean z3 = z && !this.readOnly;
        boolean z4 = this.isPassword;
        androidx.compose.ui.text.input.ImeOptions imeOptions2 = this.imeOptions;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.manager;
        if (enabled && !readOnly) {
            z2 = true;
        }
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (enabled != z || z2 != z3 || !kotlin.jvm.internal.Intrinsics.areEqual(imeOptions, imeOptions2) || isPassword != z4 || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(value.getSelection())) {
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(manager, textFieldSelectionManager)) {
            return;
        }
        manager.setRequestAutofillAction$foundation(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.$r8$lambda$6y3WEoiwX3NQAoRfKBkiGATkRsA(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.LegacyTextFieldState p0, java.lang.String p1, boolean p2, boolean p3) {
        if (p2 || !p3) {
            return;
        }
        androidx.compose.ui.text.input.TextInputSession inputSession = p0.getInputSession();
        if (inputSession != null) {
            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.DeleteAllCommand(), new androidx.compose.ui.text.input.CommitTextCommand(p1, 1)}), p0.getProcessor(), p0.getOnValueChange(), inputSession);
        } else {
            p0.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(p1, androidx.compose.ui.text.TextRangeKt.TextRange(p1.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
    }

    /* renamed from: $r8$lambda$1SVA8d45DGj-KHSllCuPexhToGI, reason: not valid java name */
    public static /* synthetic */ boolean m2216$r8$lambda$1SVA8d45DGjKHSllCuPexhToGI(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation$default(coreTextFieldSemanticsModifierNode.manager, false, 1, null);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$1oCRAaLxNeVJf3ObKYXdLCkxCb8(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.text.AnnotatedString annotatedString) {
        if (coreTextFieldSemanticsModifierNode.readOnly || !coreTextFieldSemanticsModifierNode.enabled) {
            return false;
        }
        androidx.compose.ui.text.input.TextInputSession inputSession = coreTextFieldSemanticsModifierNode.state.getInputSession();
        if (inputSession != null) {
            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.FinishComposingTextCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), coreTextFieldSemanticsModifierNode.state.getProcessor(), coreTextFieldSemanticsModifierNode.state.getOnValueChange(), inputSession);
        } else {
            coreTextFieldSemanticsModifierNode.state.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(kotlin.text.StringsKt.replaceRange(coreTextFieldSemanticsModifierNode.value.getText(), androidx.compose.ui.text.TextRange.m8039getStartimpl(coreTextFieldSemanticsModifierNode.value.getSelection()), androidx.compose.ui.text.TextRange.m8034getEndimpl(coreTextFieldSemanticsModifierNode.value.getSelection()), annotatedString).toString(), androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8039getStartimpl(coreTextFieldSemanticsModifierNode.value.getSelection()) + annotatedString.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$23cpgN1YAZErRY6zKJuf9Vx1hnM(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i, int i2, boolean z) {
        if (!z) {
            i = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(i);
        }
        if (!z) {
            i2 = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(i2);
        }
        if (!coreTextFieldSemanticsModifierNode.enabled) {
            return false;
        }
        if (i == androidx.compose.ui.text.TextRange.m8039getStartimpl(coreTextFieldSemanticsModifierNode.value.getSelection()) && i2 == androidx.compose.ui.text.TextRange.m8034getEndimpl(coreTextFieldSemanticsModifierNode.value.getSelection())) {
            return false;
        }
        if (java.lang.Math.min(i, i2) >= 0 && java.lang.Math.max(i, i2) <= coreTextFieldSemanticsModifierNode.value.getAnnotatedString().length()) {
            if (z || i == i2) {
                coreTextFieldSemanticsModifierNode.manager.exitSelectionMode$foundation();
            } else {
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation$default(coreTextFieldSemanticsModifierNode.manager, false, 1, null);
            }
            coreTextFieldSemanticsModifierNode.state.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(coreTextFieldSemanticsModifierNode.value.getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(i, i2), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return true;
        }
        coreTextFieldSemanticsModifierNode.manager.exitSelectionMode$foundation();
        return false;
    }

    /* renamed from: $r8$lambda$2_G4Hz4w_vHg7VJifSjs-B6cGh4, reason: not valid java name */
    public static /* synthetic */ boolean m2217$r8$lambda$2_G4Hz4w_vHg7VJifSjsB6cGh4(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, androidx.compose.ui.text.AnnotatedString annotatedString) {
        coreTextFieldSemanticsModifierNode.getHighResolutionOutputSizeshNQ4ISI(coreTextFieldSemanticsModifierNode.state, annotatedString.getText(), coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$3gv9SuBqeUuRO5d0AvnBfXBKj5M(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, androidx.compose.ui.autofill.FillableData fillableData) {
        coreTextFieldSemanticsModifierNode.state.setJustAutofilled(true);
        coreTextFieldSemanticsModifierNode.state.setAutofillHighlightOn(true);
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.state;
        java.lang.CharSequence textValue = fillableData.getTextValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(textValue, "");
        coreTextFieldSemanticsModifierNode.getHighResolutionOutputSizeshNQ4ISI(legacyTextFieldState, (java.lang.String) textValue, coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$5AAfTNEw6FKbvlbEs3T2FdLCpNk(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.state.getOnImeActionPerformed().invoke(androidx.compose.ui.text.input.ImeAction.m8198boximpl(coreTextFieldSemanticsModifierNode.imeOptions.getImeAction()));
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6y3WEoiwX3NQAoRfKBkiGATkRsA(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requestAutofill(coreTextFieldSemanticsModifierNode);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$I79JpNhUwIo_rLp2FPTLxLtUcGc(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.cut$foundation();
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$Lr3qyTeFDwo_3qXmTmaEhOyzp3M(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.paste$foundation();
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$VeJllZoHfC_Jge5oiaqvfJntO88(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager.copy$foundation$default(coreTextFieldSemanticsModifierNode.manager, false, 1, null);
        return true;
    }

    /* renamed from: $r8$lambda$mzlQX-b7iJdIqR0g0P97QirPqAk, reason: not valid java name */
    public static /* synthetic */ boolean m2218$r8$lambda$mzlQXb7iJdIqR0g0P97QirPqAk(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(coreTextFieldSemanticsModifierNode.state, coreTextFieldSemanticsModifierNode.focusRequester, !coreTextFieldSemanticsModifierNode.readOnly);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$vbrPtQOCpP_4RNBlmKZxSlbPaRA(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, java.util.List list) {
        if (coreTextFieldSemanticsModifierNode.state.getLayoutResult() == null) {
            return false;
        }
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = coreTextFieldSemanticsModifierNode.state.getLayoutResult();
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutResult);
        list.add(layoutResult.getValue());
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zrFXF4vmHagjo7y5hrxWPwulXpk(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requestAutofill(coreTextFieldSemanticsModifierNode);
        return kotlin.Unit.INSTANCE;
    }
}
