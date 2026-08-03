package androidx.compose.ui.autofill;

/* compiled from: AndroidAutofill.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, d2 = {"performAutofill", "", "Landroidx/compose/ui/autofill/AndroidAutofill;", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "populateViewStructure", "root", "Landroid/view/ViewStructure;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAutofill_androidKt {
    public static final void populateViewStructure(androidx.compose.ui.autofill.AndroidAutofill androidAutofill, android.view.ViewStructure viewStructure) {
        int addChildCount = androidx.compose.ui.autofill.AutofillApi23Helper.INSTANCE.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (java.util.Map.Entry<java.lang.Integer, androidx.compose.ui.autofill.AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int intValue = entry.getKey().intValue();
            androidx.compose.ui.autofill.AutofillNode value = entry.getValue();
            android.view.ViewStructure newChild = androidx.compose.ui.autofill.AutofillApi23Helper.INSTANCE.newChild(viewStructure, addChildCount);
            if (newChild != null) {
                androidx.compose.ui.autofill.AutofillApi26Helper autofillApi26Helper = androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE;
                android.view.autofill.AutofillId autofillId = androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.getAutofillId(viewStructure);
                kotlin.jvm.internal.Intrinsics.checkNotNull(autofillId);
                autofillApi26Helper.setAutofillId(newChild, autofillId, intValue);
                androidx.compose.ui.autofill.AutofillApi23Helper.INSTANCE.setId(newChild, intValue, androidAutofill.getView().getContext().getPackageName(), null, null);
                androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.setAutofillType(newChild, 1);
                androidx.compose.ui.autofill.AutofillApi26Helper autofillApi26Helper2 = androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE;
                java.util.List<androidx.compose.ui.autofill.AutofillType> autofillTypes = value.getAutofillTypes();
                java.util.ArrayList arrayList = new java.util.ArrayList(autofillTypes.size());
                int size = autofillTypes.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(androidx.compose.ui.autofill.AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i)));
                }
                autofillApi26Helper2.setAutofillHints(newChild, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
                androidx.compose.ui.geometry.Rect boundingBox = value.getBoundingBox();
                if (boundingBox == null) {
                    android.util.Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int roundToInt = kotlin.math.MathKt.roundToInt(boundingBox.getLeft());
                    int roundToInt2 = kotlin.math.MathKt.roundToInt(boundingBox.getTop());
                    int roundToInt3 = kotlin.math.MathKt.roundToInt(boundingBox.getRight());
                    int roundToInt4 = kotlin.math.MathKt.roundToInt(boundingBox.getBottom()) - roundToInt2;
                    androidx.compose.ui.autofill.AutofillApi23Helper.INSTANCE.setDimens(newChild, roundToInt, roundToInt2, 0, 0, roundToInt3 - roundToInt, roundToInt4);
                }
            }
            addChildCount++;
        }
    }

    public static final void performAutofill(androidx.compose.ui.autofill.AndroidAutofill androidAutofill, android.util.SparseArray<android.view.autofill.AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            android.view.autofill.AutofillValue autofillValue = sparseArray.get(keyAt);
            if (androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.isText(autofillValue)) {
                androidAutofill.getAutofillTree().performAutofill(keyAt, androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.textValue(autofillValue).toString());
            } else {
                if (androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.isDate(autofillValue)) {
                    throw new kotlin.NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.isList(autofillValue)) {
                    throw new kotlin.NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.isToggle(autofillValue)) {
                    throw new kotlin.NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }
}
