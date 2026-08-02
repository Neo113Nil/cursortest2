package com.microblink.blinkid.activity.edit;

/* loaded from: classes9.dex */
public class BlinkCardEditActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final int RESULT_RETRY = 99;
    com.microblink.blinkid.view.blinkcard.LabeledEditText Camera2StreamConfigurationMap;
    final java.util.ArrayList getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    com.microblink.blinkid.view.blinkcard.LabeledEditText getHighSpeedVideoFpsRanges;
    com.microblink.blinkid.activity.edit.BlinkCardEditStrings getHighSpeedVideoFpsRangesFor;
    com.microblink.blinkid.view.blinkcard.LabeledEditText getHighSpeedVideoSizes;
    com.microblink.blinkid.view.blinkcard.LabeledEditText getHighSpeedVideoSizesFor;
    com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration getInputFormats;
    com.microblink.blinkid.view.blinkcard.LabeledEditText getInputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getOutputFormats;
    private com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer getOutputMinFrameDuration;

    public static android.content.Intent buildIntent(android.content.Context context, com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration blinkCardEditFieldConfiguration, com.microblink.blinkid.activity.edit.BlinkCardEditStrings blinkCardEditStrings, int i, boolean z, boolean z2) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.microblink.blinkid.activity.edit.BlinkCardEditActivity.class);
        intent.putExtra("MB_FieldConfig", blinkCardEditFieldConfiguration);
        intent.putExtra("MB_Theme", i);
        intent.putExtra("MB_Strings", blinkCardEditStrings);
        intent.putExtra("MB_Secure", z);
        intent.putExtra("MB_FilterTouchesWhenObscured", z2);
        return intent;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText, com.microblink.blinkid.view.blinkcard.FieldValidation fieldValidation, boolean z, int i, java.lang.String str, java.lang.String str2) {
        if (!z) {
            labeledEditText.setVisibility(8);
            return;
        }
        labeledEditText.setStrings(this.getHighSpeedVideoFpsRangesFor);
        labeledEditText.setHint(this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI);
        labeledEditText.setupValidation(fieldValidation);
        this.getHighResolutionOutputSizeshNQ4ISI.add(labeledEditText);
        labeledEditText.setImeOptions(5);
        labeledEditText.setInputType(i);
        labeledEditText.setLabel(str);
        labeledEditText.setValue(str2);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.getOutputFormats.saveState();
        setResult(99);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("MB_Theme", 0);
        if (intExtra != 0) {
            setTheme(intExtra);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getTheme().resolveAttribute(com.microblink.blinkid.library.R.attr.mb_blinkcardEditLabelTextColor, typedValue, true);
        if (typedValue.data == 0) {
            setTheme(com.microblink.blinkid.library.R.style.MB_theme_blinkcard_edit_screen);
        }
        if (getIntent().getBooleanExtra("MB_Secure", false)) {
            getWindow().setFlags(8192, 8192);
        }
        findViewById(android.R.id.content).getRootView().setFilterTouchesWhenObscured(getIntent().getBooleanExtra("MB_FilterTouchesWhenObscured", false));
        setContentView(com.microblink.blinkid.resources.Layouts.IllIIIIllI);
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
        this.getOutputFormats = recognizerBundle;
        recognizerBundle.loadFromIntent(getIntent());
        com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration blinkCardEditFieldConfiguration = (com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration) getIntent().getParcelableExtra("MB_FieldConfig");
        this.getInputFormats = blinkCardEditFieldConfiguration;
        if (blinkCardEditFieldConfiguration == null) {
            this.getInputFormats = new com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration();
        }
        com.microblink.blinkid.activity.edit.BlinkCardEditStrings blinkCardEditStrings = (com.microblink.blinkid.activity.edit.BlinkCardEditStrings) getIntent().getParcelableExtra("MB_Strings");
        this.getHighSpeedVideoFpsRangesFor = blinkCardEditStrings;
        if (blinkCardEditStrings == null) {
            this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.activity.edit.BlinkCardEditStrings.createDefault(this);
        }
        this.getOutputMinFrameDuration = null;
        for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : this.getOutputFormats.getRecognizers()) {
            if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer) {
                this.getOutputMinFrameDuration = (com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer) recognizer;
            }
            if (recognizer instanceof com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer) {
                com.microblink.blinkid.entities.recognizers.Recognizer<?> slaveRecognizer = ((com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer) recognizer).getSlaveRecognizer();
                if (slaveRecognizer instanceof com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer) {
                    this.getOutputMinFrameDuration = (com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer) slaveRecognizer;
                }
            }
        }
        com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer blinkCardRecognizer = this.getOutputMinFrameDuration;
        if (blinkCardRecognizer == null) {
            throw new java.lang.IllegalArgumentException("Edit screen can only be used with BlinkCardRecognizer");
        }
        com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result result = (com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result) blinkCardRecognizer.getResult();
        com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText = (com.microblink.blinkid.view.blinkcard.LabeledEditText) findViewById(com.microblink.blinkid.library.R.id.card_number_layout);
        this.getInputSizeshNQ4ISI = labeledEditText;
        getHighResolutionOutputSizeshNQ4ISI(labeledEditText, com.microblink.blinkid.view.blinkcard.FieldValidation.CARD_NUMBER, this.getInputFormats.shouldDisplayCardNumber, 4, this.getHighSpeedVideoFpsRangesFor.getInputFormats, result.getCardNumber());
        this.getHighSpeedVideoSizes = (com.microblink.blinkid.view.blinkcard.LabeledEditText) findViewById(com.microblink.blinkid.library.R.id.expiry_layout);
        com.microblink.blinkid.results.date.SimpleDate date = result.getExpiryDate().getDate();
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, com.microblink.blinkid.view.blinkcard.FieldValidation.EXPIRY_DATE, this.getInputFormats.shouldDisplayExpiryDate, 20, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes, date == null ? "" : java.lang.String.format(java.util.Locale.ROOT, "%02d/%02d", java.lang.Integer.valueOf(date.getMonth()), java.lang.Integer.valueOf(date.getYear() % 100)));
        com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText2 = (com.microblink.blinkid.view.blinkcard.LabeledEditText) findViewById(com.microblink.blinkid.library.R.id.owner_layout);
        this.Camera2StreamConfigurationMap = labeledEditText2;
        getHighResolutionOutputSizeshNQ4ISI(labeledEditText2, com.microblink.blinkid.view.blinkcard.FieldValidation.OWNER, this.getInputFormats.shouldDisplayOwner, 1, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges, result.getOwner());
        com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText3 = (com.microblink.blinkid.view.blinkcard.LabeledEditText) findViewById(com.microblink.blinkid.library.R.id.cvv_layout);
        this.getHighSpeedVideoSizesFor = labeledEditText3;
        getHighResolutionOutputSizeshNQ4ISI(labeledEditText3, com.microblink.blinkid.view.blinkcard.FieldValidation.CVV, this.getInputFormats.shouldDisplayCvv, 2, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor, result.getCvv());
        com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText4 = (com.microblink.blinkid.view.blinkcard.LabeledEditText) findViewById(com.microblink.blinkid.library.R.id.iban_layout);
        this.getHighSpeedVideoFpsRanges = labeledEditText4;
        getHighResolutionOutputSizeshNQ4ISI(labeledEditText4, com.microblink.blinkid.view.blinkcard.FieldValidation.IBAN, this.getInputFormats.shouldDisplayIban, 1, this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration, result.getIban());
        android.widget.Button button = (android.widget.Button) findViewById(com.microblink.blinkid.library.R.id.done_btn);
        button.setText(this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap);
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.activity.edit.BlinkCardEditActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.microblink.blinkid.activity.edit.BlinkCardEditActivity.getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.activity.edit.BlinkCardEditActivity.this);
            }
        });
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(com.microblink.blinkid.library.R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(this.getHighSpeedVideoFpsRangesFor.getOutputFormats);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        android.graphics.drawable.Drawable llIIlIlIIl = com.microblink.blinkid.secured.IIIIIIIllI.llIIlIlIIl(this, com.microblink.blinkid.library.R.attr.mb_blinkcardEditToolbarNavigationIcon);
        if (llIIlIlIIl != null) {
            toolbar.setNavigationIcon(llIIlIlIIl);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.getOutputFormats.saveState();
        setResult(99);
        finish();
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        android.view.View rootView = findViewById(android.R.id.content).getRootView();
        ((android.view.inputmethod.InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(rootView.getWindowToken(), 0);
        rootView.clearFocus();
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((com.microblink.blinkid.view.blinkcard.LabeledEditText) this.getHighResolutionOutputSizeshNQ4ISI.get(r0.size() - 1)).setImeOptions(6);
        java.util.Iterator it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText = (com.microblink.blinkid.view.blinkcard.LabeledEditText) it.next();
            if (labeledEditText.getValue().isEmpty()) {
                labeledEditText.requestFocus();
                return;
            }
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        this.getOutputFormats.saveState();
        super.onSaveInstanceState(bundle);
    }

    static void getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.activity.edit.BlinkCardEditActivity blinkCardEditActivity) {
        if (!blinkCardEditActivity.getInputFormats.allowCardsWithInvalidFields) {
            java.util.Iterator it = blinkCardEditActivity.getHighResolutionOutputSizeshNQ4ISI.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!((com.microblink.blinkid.view.blinkcard.LabeledEditText) it.next()).llIIIlllll()) {
                    z = true;
                }
            }
            if (z) {
                androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(blinkCardEditActivity);
                android.widget.TextView textView = (android.widget.TextView) blinkCardEditActivity.getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.lIIIIIlIlI, (android.view.ViewGroup) null, false);
                textView.setTextDirection(5);
                textView.setText(blinkCardEditActivity.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor);
                builder.setView(textView);
                builder.setPositiveButton(blinkCardEditActivity.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI, (android.content.DialogInterface.OnClickListener) null);
                builder.create().show();
                return;
            }
        }
        android.content.Intent intent = blinkCardEditActivity.getIntent();
        new com.microblink.blinkid.activity.edit.BlinkCardEditResultBundle(blinkCardEditActivity.getInputSizeshNQ4ISI.getValue(), blinkCardEditActivity.Camera2StreamConfigurationMap.getValue(), blinkCardEditActivity.getHighSpeedVideoSizesFor.getValue(), blinkCardEditActivity.getHighSpeedVideoSizes.getValue(), blinkCardEditActivity.getHighSpeedVideoFpsRanges.getValue()).saveToIntent(intent);
        blinkCardEditActivity.setResult(-1, intent);
        blinkCardEditActivity.finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
