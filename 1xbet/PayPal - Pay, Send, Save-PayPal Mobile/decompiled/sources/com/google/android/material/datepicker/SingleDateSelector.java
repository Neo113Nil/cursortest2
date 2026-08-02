package com.google.android.material.datepicker;

/* loaded from: classes8.dex */
public class SingleDateSelector implements com.google.android.material.datepicker.DateSelector<java.lang.Long> {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.SingleDateSelector> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.datepicker.SingleDateSelector>() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.SingleDateSelector createFromParcel(android.os.Parcel parcel) {
            com.google.android.material.datepicker.SingleDateSelector singleDateSelector = new com.google.android.material.datepicker.SingleDateSelector();
            singleDateSelector.selectedItem = (java.lang.Long) parcel.readValue(java.lang.Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.SingleDateSelector[] newArray(int i) {
            return new com.google.android.material.datepicker.SingleDateSelector[i];
        }
    };
    private java.lang.CharSequence error;
    private java.lang.Long selectedItem;
    private java.text.SimpleDateFormat textInputFormat;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        this.selectedItem = java.lang.Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelection() {
        this.selectedItem = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(java.lang.Long l) {
        this.selectedItem = l == null ? null : java.lang.Long.valueOf(com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.selectedItem != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges() {
        return new java.util.ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<java.lang.Long> getSelectedDays() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Long l = this.selectedItem;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.Long getSelection() {
        return this.selectedItem;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(java.text.SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (java.text.SimpleDateFormat) com.google.android.material.datepicker.UtcDates.getNormalizedFormat(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public android.view.View onCreateTextInputView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle, com.google.android.material.datepicker.CalendarConstraints calendarConstraints, final com.google.android.material.datepicker.OnSelectionChangedListener<java.lang.Long> onSelectionChangedListener) {
        java.lang.String defaultTextInputHint;
        android.view.View inflate = layoutInflater.inflate(com.google.android.material.R.layout.mtrl_picker_text_input_date, viewGroup, false);
        final com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) inflate.findViewById(com.google.android.material.R.id.mtrl_picker_text_input_date);
        android.widget.EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        java.text.SimpleDateFormat simpleDateFormat = this.textInputFormat;
        boolean z = simpleDateFormat != null;
        if (!z) {
            simpleDateFormat = com.google.android.material.datepicker.UtcDates.getDefaultTextInputFormat();
        }
        java.text.SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        if (z) {
            defaultTextInputHint = simpleDateFormat2.toPattern();
        } else {
            defaultTextInputHint = com.google.android.material.datepicker.UtcDates.getDefaultTextInputHint(inflate.getResources(), simpleDateFormat2);
        }
        java.lang.String str = defaultTextInputHint;
        textInputLayout.setPlaceholderText(str);
        java.lang.Long l = this.selectedItem;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
        }
        editText.addTextChangedListener(new com.google.android.material.datepicker.DateFormatTextWatcher(str, simpleDateFormat2, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onValidDate(java.lang.Long l2) {
                if (l2 == null) {
                    com.google.android.material.datepicker.SingleDateSelector.this.clearSelection();
                } else {
                    com.google.android.material.datepicker.SingleDateSelector.this.select(l2.longValue());
                }
                com.google.android.material.datepicker.SingleDateSelector.this.error = null;
                onSelectionChangedListener.onSelectionChanged(com.google.android.material.datepicker.SingleDateSelector.this.getSelection());
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onInvalidDate() {
                com.google.android.material.datepicker.SingleDateSelector.this.error = textInputLayout.getError();
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }
        });
        com.google.android.material.datepicker.DateSelector.showKeyboardWithAutoHideBehavior(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(android.content.Context context) {
        return com.google.android.material.resources.MaterialAttributes.resolveOrThrow(context, com.google.android.material.R.attr.materialCalendarTheme, com.google.android.material.datepicker.MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getSelectionDisplayString(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        java.lang.Long l = this.selectedItem;
        if (l == null) {
            return resources.getString(com.google.android.material.R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(com.google.android.material.R.string.mtrl_picker_date_header_selected, com.google.android.material.datepicker.DateStrings.getYearMonthDay(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getSelectionContentDescription(android.content.Context context) {
        java.lang.String yearMonthDay;
        android.content.res.Resources resources = context.getResources();
        java.lang.Long l = this.selectedItem;
        if (l == null) {
            yearMonthDay = resources.getString(com.google.android.material.R.string.mtrl_picker_announce_current_selection_none);
        } else {
            yearMonthDay = com.google.android.material.datepicker.DateStrings.getYearMonthDay(l.longValue());
        }
        return resources.getString(com.google.android.material.R.string.mtrl_picker_announce_current_selection, yearMonthDay);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getError() {
        if (android.text.TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return com.google.android.material.R.string.mtrl_picker_date_header_title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeValue(this.selectedItem);
    }
}
