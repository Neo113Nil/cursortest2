package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0012*\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/autofill/FillableData$Companion;", "", "textValue", "Landroidx/compose/ui/autofill/FillableData;", "createFromText", "(Landroidx/compose/ui/autofill/FillableData$Companion;Ljava/lang/CharSequence;)Landroidx/compose/ui/autofill/FillableData;", "", "booleanValue", "createFromBoolean", "(Landroidx/compose/ui/autofill/FillableData$Companion;Z)Landroidx/compose/ui/autofill/FillableData;", "", "listIndexValue", "createFromListIndex", "(Landroidx/compose/ui/autofill/FillableData$Companion;I)Landroidx/compose/ui/autofill/FillableData;", "", "dateMillisValue", "createFromDateMillis", "(Landroidx/compose/ui/autofill/FillableData$Companion;J)Landroidx/compose/ui/autofill/FillableData;", "Landroid/view/autofill/AutofillValue;", "autofillValue", "createFromAutofillValue", "(Landroidx/compose/ui/autofill/FillableData$Companion;Landroid/view/autofill/AutofillValue;)Landroidx/compose/ui/autofill/FillableData;", "toAutofillValue", "(Landroidx/compose/ui/autofill/FillableData;)Landroid/view/autofill/AutofillValue;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FillableData_androidKt {
    public static final androidx.compose.ui.autofill.FillableData createFromText(androidx.compose.ui.autofill.FillableData.Companion companion, java.lang.CharSequence charSequence) {
        return new androidx.compose.ui.autofill.AndroidFillableData(android.view.autofill.AutofillValue.forText(charSequence));
    }

    public static final androidx.compose.ui.autofill.FillableData createFromBoolean(androidx.compose.ui.autofill.FillableData.Companion companion, boolean z) {
        return new androidx.compose.ui.autofill.AndroidFillableData(android.view.autofill.AutofillValue.forToggle(z));
    }

    public static final androidx.compose.ui.autofill.FillableData createFromListIndex(androidx.compose.ui.autofill.FillableData.Companion companion, int i) {
        return new androidx.compose.ui.autofill.AndroidFillableData(android.view.autofill.AutofillValue.forList(i));
    }

    public static final androidx.compose.ui.autofill.FillableData createFromDateMillis(androidx.compose.ui.autofill.FillableData.Companion companion, long j) {
        return new androidx.compose.ui.autofill.AndroidFillableData(android.view.autofill.AutofillValue.forDate(j));
    }

    public static final androidx.compose.ui.autofill.FillableData createFromAutofillValue(androidx.compose.ui.autofill.FillableData.Companion companion, android.view.autofill.AutofillValue autofillValue) {
        return new androidx.compose.ui.autofill.AndroidFillableData(autofillValue);
    }

    public static final android.view.autofill.AutofillValue toAutofillValue(androidx.compose.ui.autofill.FillableData fillableData) {
        androidx.compose.ui.autofill.AndroidFillableData androidFillableData = fillableData instanceof androidx.compose.ui.autofill.AndroidFillableData ? (androidx.compose.ui.autofill.AndroidFillableData) fillableData : null;
        if (androidFillableData != null) {
            return androidFillableData.getAutofillValue();
        }
        return null;
    }
}
