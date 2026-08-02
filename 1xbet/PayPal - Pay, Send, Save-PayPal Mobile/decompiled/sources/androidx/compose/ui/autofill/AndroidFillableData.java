package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/ui/autofill/AndroidFillableData;", "Landroidx/compose/ui/autofill/FillableData;", "Landroid/view/autofill/AutofillValue;", "autofillValue", "<init>", "(Landroid/view/autofill/AutofillValue;)V", "", "defaultValue", "getListIndexOrDefault", "(I)I", "Landroid/view/autofill/AutofillValue;", "getAutofillValue$ui", "()Landroid/view/autofill/AutofillValue;", "", "getTextValue", "()Ljava/lang/CharSequence;", "textValue", "", "getBooleanValue", "()Ljava/lang/Boolean;", "booleanValue", "getListIndexValue", "()Ljava/lang/Integer;", "listIndexValue", "", "getDateMillisValue", "()Ljava/lang/Long;", "dateMillisValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFillableData implements androidx.compose.ui.autofill.FillableData {
    public static final int $stable = 8;
    private final android.view.autofill.AutofillValue autofillValue;

    public AndroidFillableData(android.view.autofill.AutofillValue autofillValue) {
        this.autofillValue = autofillValue;
    }

    /* renamed from: getAutofillValue$ui, reason: from getter */
    public final android.view.autofill.AutofillValue getAutofillValue() {
        return this.autofillValue;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public final java.lang.CharSequence getTextValue() {
        if (this.autofillValue.isText()) {
            return this.autofillValue.getTextValue();
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public final java.lang.Boolean getBooleanValue() {
        if (this.autofillValue.isToggle()) {
            return java.lang.Boolean.valueOf(this.autofillValue.getToggleValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public final java.lang.Integer getListIndexValue() {
        if (this.autofillValue.isList()) {
            return java.lang.Integer.valueOf(this.autofillValue.getListValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public final int getListIndexOrDefault(int defaultValue) {
        return this.autofillValue.isList() ? this.autofillValue.getListValue() : defaultValue;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public final java.lang.Long getDateMillisValue() {
        if (this.autofillValue.isDate()) {
            return java.lang.Long.valueOf(this.autofillValue.getDateValue());
        }
        return null;
    }
}
