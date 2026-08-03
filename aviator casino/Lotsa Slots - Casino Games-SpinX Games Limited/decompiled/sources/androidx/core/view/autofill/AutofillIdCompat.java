package androidx.core.view.autofill;

/* loaded from: classes2.dex */
public class AutofillIdCompat {
    private final java.lang.Object mWrappedObj;

    private AutofillIdCompat(android.view.autofill.AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    public static androidx.core.view.autofill.AutofillIdCompat toAutofillIdCompat(android.view.autofill.AutofillId autofillId) {
        return new androidx.core.view.autofill.AutofillIdCompat(autofillId);
    }

    public android.view.autofill.AutofillId toAutofillId() {
        return (android.view.autofill.AutofillId) this.mWrappedObj;
    }
}
