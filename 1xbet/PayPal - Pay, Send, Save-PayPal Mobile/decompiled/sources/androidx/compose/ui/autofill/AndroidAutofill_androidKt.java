package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroid/view/ViewStructure;", "root", "", "populateViewStructure", "(Landroidx/compose/ui/autofill/AndroidAutofill;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "performAutofill", "(Landroidx/compose/ui/autofill/AndroidAutofill;Landroid/util/SparseArray;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAutofill_androidKt {
    public static final void populateViewStructure(androidx.compose.ui.autofill.AndroidAutofill androidAutofill, android.view.ViewStructure viewStructure) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        int addChildCount = androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (java.util.Map.Entry<java.lang.Integer, androidx.compose.ui.autofill.AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int intValue = entry.getKey().intValue();
            androidx.compose.ui.autofill.AutofillNode value = entry.getValue();
            android.view.ViewStructure newChild = androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.newChild(viewStructure, addChildCount);
            androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.setAutofillId(newChild, androidAutofill.getRootAutofillId(), intValue);
            androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.setId(newChild, intValue, androidAutofill.getView().getContext().getPackageName(), null, null);
            androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.setAutofillType(newChild, androidx.compose.ui.autofill.ContentDataType_androidKt.getDataType(androidx.compose.ui.autofill.ContentDataType.INSTANCE.getText()));
            androidx.compose.ui.autofill.AutofillApi26Helper autofillApi26Helper = androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE;
            java.util.List<androidx.compose.ui.autofill.AutofillType> autofillTypes = value.getAutofillTypes();
            java.util.ArrayList arrayList = new java.util.ArrayList(autofillTypes.size());
            int size = autofillTypes.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(androidx.compose.ui.autofill.AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i)));
            }
            autofillApi26Helper.setAutofillHints(newChild, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
            androidx.compose.ui.geometry.Rect boundingBox = value.getBoundingBox();
            if (boundingBox != null) {
                int round = java.lang.Math.round(boundingBox.getLeft());
                int round2 = java.lang.Math.round(boundingBox.getTop());
                androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.setDimens(newChild, round, round2, 0, 0, java.lang.Math.round(boundingBox.getRight()) - round, java.lang.Math.round(boundingBox.getBottom()) - round2);
            }
            addChildCount++;
        }
    }

    public static final void performAutofill(androidx.compose.ui.autofill.AndroidAutofill androidAutofill, android.util.SparseArray<android.view.autofill.AutofillValue> sparseArray) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
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
