package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public class LabeledEditText extends android.widget.LinearLayout {
    private final android.widget.TextView Camera2StreamConfigurationMap;
    private final android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.appcompat.widget.AppCompatImageView getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.view.blinkcard.IIlIIIllIl getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private com.microblink.blinkid.view.blinkcard.FieldValidationState getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final android.view.View getInputSizeshNQ4ISI;
    private com.microblink.blinkid.activity.edit.BlinkCardEditStrings getOutputFormats;
    private final androidx.appcompat.widget.AppCompatEditText getOutputMinFrameDuration;
    private final int getOutputMinFrameDurationlomOqCM;
    private final int getOutputSizes;
    private com.microblink.blinkid.view.blinkcard.FieldValidator getOutputStallDuration;
    private final android.content.Context getOutputStallDurationlomOqCM;

    public LabeledEditText(android.content.Context context) {
        this(context, null, 0);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.view.blinkcard.FieldValidator fieldValidator) {
        this.getOutputStallDuration = fieldValidator;
        this.getOutputMinFrameDuration.addTextChangedListener(fieldValidator);
        com.microblink.blinkid.view.blinkcard.IIlIIIllIl iIlIIIllIl = new com.microblink.blinkid.view.blinkcard.IIlIIIllIl(this);
        this.getHighSpeedVideoFpsRangesFor = iIlIIIllIl;
        fieldValidator.registerListener(iIlIIIllIl);
    }

    static void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText) {
        labeledEditText.getHighSpeedVideoFpsRangesFor();
        labeledEditText.getHighResolutionOutputSizeshNQ4ISI();
        labeledEditText.llIIIlllll();
    }

    public java.lang.String getValue() {
        return this.getOutputMinFrameDuration.getText().toString();
    }

    public void setHint(java.lang.String str) {
        this.getOutputMinFrameDuration.setHint(str);
    }

    public void setImeOptions(int i) {
        this.getOutputMinFrameDuration.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.getOutputMinFrameDuration.setInputType(i);
    }

    public void setLabel(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.setText(str);
    }

    public void setStrings(com.microblink.blinkid.activity.edit.BlinkCardEditStrings blinkCardEditStrings) {
        this.getOutputFormats = blinkCardEditStrings;
    }

    public void setValue(java.lang.String str) {
        this.getOutputMinFrameDuration.setText(this.getOutputStallDuration.reformatValue(str));
    }

    public void setupValidation(com.microblink.blinkid.view.blinkcard.FieldValidation fieldValidation) {
        int i = com.microblink.blinkid.secured.llllllIlll.llIIlIlIIl[fieldValidation.ordinal()];
        if (i == 1) {
            this.getOutputMinFrameDuration.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(23)});
            getHighResolutionOutputSizeshNQ4ISI(new com.microblink.blinkid.view.blinkcard.llIIlIlIIl());
            this.getHighSpeedVideoFpsRanges.setVisibility(0);
            this.getHighSpeedVideoFpsRanges.setImageResource(com.microblink.blinkid.secured.IIIIIIllIl.llIIlIlIIl(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardUtils.determineIssuerFromCardNumberPrefix(this.getOutputMinFrameDuration.getText().toString().replaceAll(" ", ""))));
            this.getOutputMinFrameDuration.addTextChangedListener(new com.microblink.blinkid.view.blinkcard.lIIIIIllll(this));
            return;
        }
        if (i == 2) {
            getHighResolutionOutputSizeshNQ4ISI(new com.microblink.blinkid.view.blinkcard.IllIIIllII());
            this.getOutputMinFrameDuration.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(5)});
            return;
        }
        if (i == 3) {
            this.getOutputMinFrameDuration.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(4)});
            getHighResolutionOutputSizeshNQ4ISI(new com.microblink.blinkid.view.blinkcard.IlIllIlIIl());
        } else if (i == 4) {
            this.getOutputMinFrameDuration.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.AllCaps()});
        } else {
            if (i != 5) {
                return;
            }
            this.getOutputMinFrameDuration.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.AllCaps(), new android.text.InputFilter.LengthFilter(40)});
            getHighResolutionOutputSizeshNQ4ISI(new com.microblink.blinkid.view.blinkcard.llIIIlllll());
        }
    }

    public LabeledEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static java.lang.String getHighSpeedVideoFpsRanges(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText, com.microblink.blinkid.view.blinkcard.FieldValidationState fieldValidationState) {
        switch (com.microblink.blinkid.secured.llllllIlll.IlIllIlIIl[fieldValidationState.ordinal()]) {
            case 2:
                return labeledEditText.getOutputFormats.errorInvalidCardNumber;
            case 3:
                return labeledEditText.getOutputFormats.errorInvalidSecurityCode;
            case 4:
                return labeledEditText.getOutputFormats.errorInvalidIban;
            case 5:
                return labeledEditText.getOutputFormats.errorInvalidDate;
            case 6:
                return labeledEditText.getOutputFormats.errorCardExpired;
            case 7:
                return labeledEditText.getOutputFormats.errorRequiredFieldMissing;
            default:
                return null;
        }
    }

    static void getHighSpeedVideoSizes(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText) {
        labeledEditText.getHighSpeedVideoFpsRangesFor();
        labeledEditText.getHighResolutionOutputSizeshNQ4ISI();
        com.microblink.blinkid.secured.lIlIIIIIll.llIIlIlIIl(labeledEditText.getOutputStallDurationlomOqCM);
        labeledEditText.getHighSpeedVideoFpsRangesFor.onValidationStateUpdate(com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID);
    }

    public final boolean llIIIlllll() {
        com.microblink.blinkid.view.blinkcard.FieldValidationState validate = this.getOutputStallDuration.validate(this.getOutputMinFrameDuration.getText().toString());
        this.getHighSpeedVideoFpsRangesFor.onValidationStateUpdate(validate);
        return validate == com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID;
    }

    public LabeledEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoSizesFor = com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID;
        this.getOutputStallDurationlomOqCM = context;
        setOrientation(1);
        android.view.View.inflate(context, com.microblink.blinkid.resources.Layouts.IlIlllllII, this);
        this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.TextView) findViewById(com.microblink.blinkid.library.R.id.tvLabel);
        this.Camera2StreamConfigurationMap = (android.widget.TextView) findViewById(com.microblink.blinkid.library.R.id.tvError);
        androidx.appcompat.widget.AppCompatEditText appCompatEditText = (androidx.appcompat.widget.AppCompatEditText) findViewById(com.microblink.blinkid.library.R.id.etValue);
        this.getOutputMinFrameDuration = appCompatEditText;
        this.getInputSizeshNQ4ISI = findViewById(com.microblink.blinkid.library.R.id.divider);
        this.getHighSpeedVideoFpsRanges = (androidx.appcompat.widget.AppCompatImageView) findViewById(com.microblink.blinkid.library.R.id.cardTypeImg);
        this.getOutputMinFrameDurationlomOqCM = com.microblink.blinkid.secured.IIIIIIIllI.llIIlIlIIl(context, com.microblink.blinkid.library.R.attr.mb_blinkcardEditErrorColor);
        this.getInputFormats = com.microblink.blinkid.secured.IIIIIIIllI.llIIlIlIIl(context, android.R.attr.colorAccent);
        this.getOutputSizes = com.microblink.blinkid.secured.IIIIIIIllI.llIIlIlIIl(context, com.microblink.blinkid.library.R.attr.mb_blinkcardEditDividerColor);
        this.getHighSpeedVideoSizes = com.microblink.blinkid.secured.IIIIIIIllI.llIIlIlIIl(context, com.microblink.blinkid.library.R.attr.mb_blinkcardEditLabelTextColor);
        android.view.View findViewById = findViewById(com.microblink.blinkid.library.R.id.containerValue);
        findViewById.post(new com.microblink.blinkid.view.blinkcard.llIIlIIlll(this, findViewById));
        appCompatEditText.setOnFocusChangeListener(new com.microblink.blinkid.view.blinkcard.IllIIIIllI(this));
        getHighResolutionOutputSizeshNQ4ISI(new com.microblink.blinkid.view.blinkcard.lllIIIlIlI());
        appCompatEditText.setOnEditorActionListener(new com.microblink.blinkid.view.blinkcard.lIlIIIIlIl(this));
        appCompatEditText.setTextDirection(5);
        if (android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 0) {
            appCompatEditText.setGravity(3);
        } else {
            appCompatEditText.setGravity(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getOutputMinFrameDuration.hasFocus()) {
            this.getHighResolutionOutputSizeshNQ4ISI.setTextColor(this.getInputFormats);
        } else if (this.getHighSpeedVideoSizesFor != com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID) {
            this.getHighResolutionOutputSizeshNQ4ISI.setTextColor(this.getOutputMinFrameDurationlomOqCM);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.setTextColor(this.getHighSpeedVideoSizes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRangesFor() {
        if (this.getOutputMinFrameDuration.hasFocus()) {
            this.getInputSizeshNQ4ISI.setBackgroundColor(this.getInputFormats);
        } else if (this.getHighSpeedVideoSizesFor != com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID) {
            this.getInputSizeshNQ4ISI.setBackgroundColor(this.getOutputMinFrameDurationlomOqCM);
        } else {
            this.getInputSizeshNQ4ISI.setBackgroundColor(this.getOutputSizes);
        }
    }

    static boolean getInputSizeshNQ4ISI(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText) {
        android.content.Context context = labeledEditText.getOutputStallDurationlomOqCM;
        if (context instanceof android.app.Activity) {
            return ((android.app.Activity) context).isFinishing();
        }
        return false;
    }

    static void Camera2StreamConfigurationMap(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText, com.microblink.blinkid.entities.recognizers.blinkcard.Issuer issuer) {
        labeledEditText.getHighSpeedVideoFpsRanges.setImageResource(com.microblink.blinkid.secured.IIIIIIllIl.llIIlIlIIl(issuer));
    }
}
