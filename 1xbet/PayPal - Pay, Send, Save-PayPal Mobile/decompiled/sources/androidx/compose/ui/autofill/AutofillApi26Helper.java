package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b4\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b'\u0010$J\u001d\u0010*\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0,¢\u0006\u0004\b.\u0010/J%\u00102\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u00020\"¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\"¢\u0006\u0004\b=\u0010;J\u001d\u0010?\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0006¢\u0006\u0004\b?\u00106J\u001d\u0010A\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u000e¢\u0006\u0004\bA\u0010BJ\u001d\u0010D\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\"¢\u0006\u0004\bD\u0010;J\u001d\u0010F\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\"¢\u0006\u0004\bF\u0010;J\u001d\u0010H\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\"¢\u0006\u0004\bH\u0010;J\u001d\u0010J\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\"¢\u0006\u0004\bJ\u0010;J\u001d\u0010L\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\"¢\u0006\u0004\bL\u0010;J\u001d\u0010M\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\bM\u00106J\u001d\u0010O\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\"¢\u0006\u0004\bO\u0010;J\u001d\u0010Q\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\"¢\u0006\u0004\bQ\u0010;J\u001d\u0010S\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\"¢\u0006\u0004\bS\u0010;J\u001d\u0010U\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010T\u001a\u00020(¢\u0006\u0004\bU\u0010+J\u001d\u0010W\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u0006¢\u0006\u0004\bW\u00106J\u0015\u0010X\u001a\u00020(2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\bZ\u0010$J\u0015\u0010[\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b[\u0010\\J\u0015\u0010]\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b]\u0010^J\u0015\u0010_\u001a\u00020 2\u0006\u0010!\u001a\u00020\"¢\u0006\u0004\b_\u0010`"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "structure", "", "index", "newChild", "(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;", "num", "addChildCount", "(Landroid/view/ViewStructure;I)I", "id", "", com.visa.cbp.ConsumerInfo.setSignature, "typeName", "entryName", "", "setId", "(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "scrollX", "scrollY", "width", "height", "setDimens", "(Landroid/view/ViewStructure;IIIIII)V", "Landroid/view/autofill/AutofillId;", "getAutofillId", "(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "isDate", "(Landroid/view/autofill/AutofillValue;)Z", "isList", "isText", "isToggle", "", "contentDescription", "setContentDescription", "(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V", "", "hints", "setAutofillHints", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "parent", "virtualId", "setAutofillId", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V", "type", "setAutofillType", "(Landroid/view/ViewStructure;I)V", "setAutofillValue", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V", com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper.CHECKABLE_KEY_NAME, "setCheckable", "(Landroid/view/ViewStructure;Z)V", "checked", "setChecked", "numChildren", "setChildCount", "classname", "setClassName", "(Landroid/view/ViewStructure;Ljava/lang/String;)V", "clickable", "setClickable", "isSensitive", "setDataIsSensitive", "enabled", "setEnabled", "focusable", "setFocusable", "focused", "setFocused", "setInputType", "longClickable", "setLongClickable", "isOpaque", "setOpaque", "isSelected", "setSelected", "text", "setText", "visibility", "setVisibility", "textValue", "(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;", "booleanValue", "listValue", "(Landroid/view/autofill/AutofillValue;)I", "getAutofillTextValue", "(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;", "getAutofillToggleValue", "(Z)Landroid/view/autofill/AutofillValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutofillApi26Helper {
    public static final int $stable = 0;
    public static final androidx.compose.ui.autofill.AutofillApi26Helper INSTANCE = new androidx.compose.ui.autofill.AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    public final android.view.ViewStructure newChild(android.view.ViewStructure structure, int index) {
        return structure.newChild(index);
    }

    public final int addChildCount(android.view.ViewStructure structure, int num) {
        return structure.addChildCount(num);
    }

    public final void setId(android.view.ViewStructure structure, int id, java.lang.String packageName, java.lang.String typeName, java.lang.String entryName) {
        structure.setId(id, packageName, typeName, entryName);
    }

    public final void setDimens(android.view.ViewStructure structure, int left, int top, int scrollX, int scrollY, int width, int height) {
        structure.setDimens(left, top, scrollX, scrollY, width, height);
    }

    public final android.view.autofill.AutofillId getAutofillId(android.view.ViewStructure structure) {
        return structure.getAutofillId();
    }

    public final boolean isDate(android.view.autofill.AutofillValue value) {
        return value.isDate();
    }

    public final boolean isList(android.view.autofill.AutofillValue value) {
        return value.isList();
    }

    public final boolean isText(android.view.autofill.AutofillValue value) {
        return value.isText();
    }

    public final boolean isToggle(android.view.autofill.AutofillValue value) {
        return value.isToggle();
    }

    public final void setContentDescription(android.view.ViewStructure structure, java.lang.CharSequence contentDescription) {
        structure.setContentDescription(contentDescription);
    }

    public final void setAutofillHints(android.view.ViewStructure structure, java.lang.String[] hints) {
        structure.setAutofillHints(hints);
    }

    public final void setAutofillId(android.view.ViewStructure structure, android.view.autofill.AutofillId parent, int virtualId) {
        structure.setAutofillId(parent, virtualId);
    }

    public final void setAutofillType(android.view.ViewStructure structure, int type) {
        structure.setAutofillType(type);
    }

    public final void setAutofillValue(android.view.ViewStructure structure, android.view.autofill.AutofillValue value) {
        structure.setAutofillValue(value);
    }

    public final void setCheckable(android.view.ViewStructure structure, boolean checkable) {
        structure.setCheckable(checkable);
    }

    public final void setChecked(android.view.ViewStructure structure, boolean checked) {
        structure.setChecked(checked);
    }

    public final void setChildCount(android.view.ViewStructure structure, int numChildren) {
        structure.setChildCount(numChildren);
    }

    public final void setClassName(android.view.ViewStructure structure, java.lang.String classname) {
        structure.setClassName(classname);
    }

    public final void setClickable(android.view.ViewStructure structure, boolean clickable) {
        structure.setClickable(clickable);
    }

    public final void setDataIsSensitive(android.view.ViewStructure structure, boolean isSensitive) {
        structure.setDataIsSensitive(isSensitive);
    }

    public final void setEnabled(android.view.ViewStructure structure, boolean enabled) {
        structure.setEnabled(enabled);
    }

    public final void setFocusable(android.view.ViewStructure structure, boolean focusable) {
        structure.setFocusable(focusable);
    }

    public final void setFocused(android.view.ViewStructure structure, boolean focused) {
        structure.setFocused(focused);
    }

    public final void setInputType(android.view.ViewStructure structure, int type) {
        structure.setInputType(type);
    }

    public final void setLongClickable(android.view.ViewStructure structure, boolean longClickable) {
        structure.setLongClickable(longClickable);
    }

    public final void setOpaque(android.view.ViewStructure structure, boolean isOpaque) {
        structure.setOpaque(isOpaque);
    }

    public final void setSelected(android.view.ViewStructure structure, boolean isSelected) {
        structure.setSelected(isSelected);
    }

    public final void setText(android.view.ViewStructure structure, java.lang.CharSequence text) {
        structure.setText(text);
    }

    public final void setVisibility(android.view.ViewStructure structure, int visibility) {
        structure.setVisibility(visibility);
    }

    public final java.lang.CharSequence textValue(android.view.autofill.AutofillValue value) {
        return value.getTextValue();
    }

    public final boolean booleanValue(android.view.autofill.AutofillValue value) {
        return value.getToggleValue();
    }

    public final int listValue(android.view.autofill.AutofillValue value) {
        return value.getListValue();
    }

    public final android.view.autofill.AutofillValue getAutofillTextValue(java.lang.String value) {
        return android.view.autofill.AutofillValue.forText(value);
    }

    public final android.view.autofill.AutofillValue getAutofillToggleValue(boolean value) {
        return android.view.autofill.AutofillValue.forToggle(value);
    }
}
