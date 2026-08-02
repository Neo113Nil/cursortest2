package com.google.android.material.datepicker;

/* loaded from: classes8.dex */
abstract class DateFormatTextWatcher extends com.google.android.material.internal.TextWatcherAdapter {
    private final com.google.android.material.datepicker.CalendarConstraints constraints;
    private final java.text.DateFormat dateFormat;
    private final java.lang.String formatHint;
    private int lastLength = 0;
    private final java.lang.String outOfRange;
    private final java.lang.Runnable setErrorCallback;
    private java.lang.Runnable setRangeErrorCallback;
    private final com.google.android.material.textfield.TextInputLayout textInputLayout;

    void onInvalidDate() {
    }

    abstract void onValidDate(java.lang.Long l);

    DateFormatTextWatcher(final java.lang.String str, java.text.DateFormat dateFormat, com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.datepicker.CalendarConstraints calendarConstraints) {
        this.formatHint = str;
        this.dateFormat = dateFormat;
        this.textInputLayout = textInputLayout;
        this.constraints = calendarConstraints;
        this.outOfRange = textInputLayout.getContext().getString(com.google.android.material.R.string.mtrl_picker_out_of_range);
        this.setErrorCallback = new java.lang.Runnable() { // from class: com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.datepicker.DateFormatTextWatcher.this.m10265x5657fb8e(str);
            }
        };
    }

    /* renamed from: lambda$new$0$com-google-android-material-datepicker-DateFormatTextWatcher, reason: not valid java name */
    /* synthetic */ void m10265x5657fb8e(java.lang.String str) {
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.textInputLayout;
        java.text.DateFormat dateFormat = this.dateFormat;
        android.content.Context context = textInputLayout.getContext();
        java.lang.String string = context.getString(com.google.android.material.R.string.mtrl_picker_invalid_format);
        java.lang.String format = java.lang.String.format(context.getString(com.google.android.material.R.string.mtrl_picker_invalid_format_use), sanitizeDateString(str));
        java.lang.String format2 = java.lang.String.format(context.getString(com.google.android.material.R.string.mtrl_picker_invalid_format_example), sanitizeDateString(dateFormat.format(new java.util.Date(com.google.android.material.datepicker.UtcDates.getTodayCalendar().getTimeInMillis()))));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(string);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        sb.append(format);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        sb.append(format2);
        textInputLayout.setError(sb.toString());
        onInvalidDate();
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.textInputLayout.removeCallbacks(this.setErrorCallback);
        this.textInputLayout.removeCallbacks(this.setRangeErrorCallback);
        this.textInputLayout.setError(null);
        onValidDate(null);
        if (android.text.TextUtils.isEmpty(charSequence) || charSequence.length() < this.formatHint.length()) {
            return;
        }
        try {
            java.util.Date parse = this.dateFormat.parse(charSequence.toString());
            this.textInputLayout.setError(null);
            long time = parse.getTime();
            if (this.constraints.getDateValidator().isValid(time) && this.constraints.isWithinBounds(time)) {
                onValidDate(java.lang.Long.valueOf(parse.getTime()));
                return;
            }
            java.lang.Runnable createRangeErrorCallback = createRangeErrorCallback(time);
            this.setRangeErrorCallback = createRangeErrorCallback;
            runValidation(this.textInputLayout, createRangeErrorCallback);
        } catch (java.text.ParseException unused) {
            runValidation(this.textInputLayout, this.setErrorCallback);
        }
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.lastLength = charSequence.length();
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (java.util.Locale.getDefault().getLanguage().equals(java.util.Locale.KOREAN.getLanguage()) || editable.length() == 0 || editable.length() >= this.formatHint.length() || editable.length() < this.lastLength) {
            return;
        }
        char charAt = this.formatHint.charAt(editable.length());
        if (java.lang.Character.isLetterOrDigit(charAt)) {
            return;
        }
        editable.append(charAt);
    }

    private java.lang.Runnable createRangeErrorCallback(final long j) {
        return new java.lang.Runnable() { // from class: com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.datepicker.DateFormatTextWatcher.this.m10264x14d77527(j);
            }
        };
    }

    /* renamed from: lambda$createRangeErrorCallback$1$com-google-android-material-datepicker-DateFormatTextWatcher, reason: not valid java name */
    /* synthetic */ void m10264x14d77527(long j) {
        this.textInputLayout.setError(java.lang.String.format(this.outOfRange, sanitizeDateString(com.google.android.material.datepicker.DateStrings.getDateString(j))));
        onInvalidDate();
    }

    private java.lang.String sanitizeDateString(java.lang.String str) {
        return str.replace(' ', kotlin.text.Typography.nbsp);
    }

    public void runValidation(android.view.View view, java.lang.Runnable runnable) {
        view.post(runnable);
    }
}
