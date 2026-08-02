package androidx.core.view.autofill;

/* loaded from: classes7.dex */
public class AutofillIdCompat {
    private final java.lang.Object getHighSpeedVideoSizes;

    private AutofillIdCompat(android.view.autofill.AutofillId autofillId) {
        this.getHighSpeedVideoSizes = autofillId;
    }

    public static androidx.core.view.autofill.AutofillIdCompat toAutofillIdCompat(android.view.autofill.AutofillId autofillId) {
        return new androidx.core.view.autofill.AutofillIdCompat(autofillId);
    }

    public android.view.autofill.AutofillId toAutofillId() {
        return (android.view.autofill.AutofillId) this.getHighSpeedVideoSizes;
    }
}
