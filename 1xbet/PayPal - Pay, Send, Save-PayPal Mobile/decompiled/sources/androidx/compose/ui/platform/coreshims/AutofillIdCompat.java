package androidx.compose.ui.platform.coreshims;

/* loaded from: classes6.dex */
public class AutofillIdCompat {
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    private AutofillIdCompat(android.view.autofill.AutofillId autofillId) {
        this.getHighSpeedVideoFpsRangesFor = autofillId;
    }

    public static androidx.compose.ui.platform.coreshims.AutofillIdCompat toAutofillIdCompat(android.view.autofill.AutofillId autofillId) {
        return new androidx.compose.ui.platform.coreshims.AutofillIdCompat(autofillId);
    }

    public android.view.autofill.AutofillId toAutofillId() {
        return (android.view.autofill.AutofillId) this.getHighSpeedVideoFpsRangesFor;
    }
}
