package com.google.android.material.datepicker;

/* loaded from: classes8.dex */
public interface DateSelector<S> extends android.os.Parcelable {
    int getDefaultThemeResId(android.content.Context context);

    int getDefaultTitleResId();

    java.lang.String getError();

    java.util.Collection<java.lang.Long> getSelectedDays();

    java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges();

    S getSelection();

    java.lang.String getSelectionContentDescription(android.content.Context context);

    java.lang.String getSelectionDisplayString(android.content.Context context);

    boolean isSelectionComplete();

    android.view.View onCreateTextInputView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle, com.google.android.material.datepicker.CalendarConstraints calendarConstraints, com.google.android.material.datepicker.OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j);

    void setSelection(S s);

    void setTextInputFormat(java.text.SimpleDateFormat simpleDateFormat);

    static void showKeyboardWithAutoHideBehavior(final android.widget.EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = new android.view.View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                com.google.android.material.datepicker.DateSelector.lambda$showKeyboardWithAutoHideBehavior$0(editTextArr, view, z);
            }
        };
        for (android.widget.EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final android.widget.EditText editText2 = editTextArr[0];
        editText2.postDelayed(new java.lang.Runnable() { // from class: com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.internal.ViewUtils.requestFocusAndShowKeyboard(editText2, false);
            }
        }, 100L);
    }

    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(android.widget.EditText[] editTextArr, android.view.View view, boolean z) {
        for (android.widget.EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        com.google.android.material.internal.ViewUtils.hideKeyboard(view, false);
    }
}
