package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class i implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Guideline b;
    public final com.google.android.material.textfield.TextInputEditText c;
    public final com.google.android.material.textfield.TextInputLayout d;
    public final com.google.android.material.textfield.TextInputEditText e;
    public final com.google.android.material.textfield.TextInputLayout f;
    public final com.google.android.material.textfield.TextInputEditText g;
    private final android.widget.ScrollView getHighSpeedVideoFpsRangesFor;
    public final com.google.android.material.textfield.TextInputLayout h;
    public final com.google.android.material.textfield.TextInputEditText i;
    public final com.google.android.material.textfield.TextInputLayout j;
    public final com.google.android.material.textfield.TextInputEditText k;
    public final com.google.android.material.textfield.TextInputLayout l;
    public final android.widget.LinearLayout m;
    public final com.google.android.material.button.MaterialButton n;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.android.material.button.MaterialButton f4155o;
    public final com.google.android.material.button.MaterialButton p;
    public final android.widget.TextView q;

    public static com.miteksystems.misnap.workflow.a.i a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.buttonsGuideline;
        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
        if (guideline != null) {
            i = com.miteksystems.misnap.workflow.R.id.dateOfBirth;
            com.google.android.material.textfield.TextInputEditText textInputEditText = (com.google.android.material.textfield.TextInputEditText) view.findViewById(i);
            if (textInputEditText != null) {
                i = com.miteksystems.misnap.workflow.R.id.dateOfBirthLabel;
                com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) view.findViewById(i);
                if (textInputLayout != null) {
                    i = com.miteksystems.misnap.workflow.R.id.documentCode;
                    com.google.android.material.textfield.TextInputEditText textInputEditText2 = (com.google.android.material.textfield.TextInputEditText) view.findViewById(i);
                    if (textInputEditText2 != null) {
                        i = com.miteksystems.misnap.workflow.R.id.documentCodeLabel;
                        com.google.android.material.textfield.TextInputLayout textInputLayout2 = (com.google.android.material.textfield.TextInputLayout) view.findViewById(i);
                        if (textInputLayout2 != null) {
                            i = com.miteksystems.misnap.workflow.R.id.documentNumber;
                            com.google.android.material.textfield.TextInputEditText textInputEditText3 = (com.google.android.material.textfield.TextInputEditText) view.findViewById(i);
                            if (textInputEditText3 != null) {
                                i = com.miteksystems.misnap.workflow.R.id.documentNumberLabel;
                                com.google.android.material.textfield.TextInputLayout textInputLayout3 = (com.google.android.material.textfield.TextInputLayout) view.findViewById(i);
                                if (textInputLayout3 != null) {
                                    i = com.miteksystems.misnap.workflow.R.id.expirationDate;
                                    com.google.android.material.textfield.TextInputEditText textInputEditText4 = (com.google.android.material.textfield.TextInputEditText) view.findViewById(i);
                                    if (textInputEditText4 != null) {
                                        i = com.miteksystems.misnap.workflow.R.id.expirationDateLabel;
                                        com.google.android.material.textfield.TextInputLayout textInputLayout4 = (com.google.android.material.textfield.TextInputLayout) view.findViewById(i);
                                        if (textInputLayout4 != null) {
                                            i = com.miteksystems.misnap.workflow.R.id.issuingCountry;
                                            com.google.android.material.textfield.TextInputEditText textInputEditText5 = (com.google.android.material.textfield.TextInputEditText) view.findViewById(i);
                                            if (textInputEditText5 != null) {
                                                i = com.miteksystems.misnap.workflow.R.id.issuingCountryLabel;
                                                com.google.android.material.textfield.TextInputLayout textInputLayout5 = (com.google.android.material.textfield.TextInputLayout) view.findViewById(i);
                                                if (textInputLayout5 != null) {
                                                    i = com.miteksystems.misnap.workflow.R.id.mrzFieldsContainer;
                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(i);
                                                    if (linearLayout != null) {
                                                        i = com.miteksystems.misnap.workflow.R.id.needHelpButton;
                                                        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                                                        if (materialButton != null) {
                                                            i = com.miteksystems.misnap.workflow.R.id.skipButton;
                                                            com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                                                            if (materialButton2 != null) {
                                                                i = com.miteksystems.misnap.workflow.R.id.submitButton;
                                                                com.google.android.material.button.MaterialButton materialButton3 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                                                                if (materialButton3 != null) {
                                                                    i = com.miteksystems.misnap.workflow.R.id.title;
                                                                    android.widget.TextView textView = (android.widget.TextView) view.findViewById(i);
                                                                    if (textView != null) {
                                                                        return new com.miteksystems.misnap.workflow.a.i((android.widget.ScrollView) view, guideline, textInputEditText, textInputLayout, textInputEditText2, textInputLayout2, textInputEditText3, textInputLayout3, textInputEditText4, textInputLayout4, textInputEditText5, textInputLayout5, linearLayout, materialButton, materialButton2, materialButton3, textView);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.widget.ScrollView getRoot() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private i(android.widget.ScrollView scrollView, androidx.constraintlayout.widget.Guideline guideline, com.google.android.material.textfield.TextInputEditText textInputEditText, com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.textfield.TextInputEditText textInputEditText2, com.google.android.material.textfield.TextInputLayout textInputLayout2, com.google.android.material.textfield.TextInputEditText textInputEditText3, com.google.android.material.textfield.TextInputLayout textInputLayout3, com.google.android.material.textfield.TextInputEditText textInputEditText4, com.google.android.material.textfield.TextInputLayout textInputLayout4, com.google.android.material.textfield.TextInputEditText textInputEditText5, com.google.android.material.textfield.TextInputLayout textInputLayout5, android.widget.LinearLayout linearLayout, com.google.android.material.button.MaterialButton materialButton, com.google.android.material.button.MaterialButton materialButton2, com.google.android.material.button.MaterialButton materialButton3, android.widget.TextView textView) {
        this.getHighSpeedVideoFpsRangesFor = scrollView;
        this.b = guideline;
        this.c = textInputEditText;
        this.d = textInputLayout;
        this.e = textInputEditText2;
        this.f = textInputLayout2;
        this.g = textInputEditText3;
        this.h = textInputLayout3;
        this.i = textInputEditText4;
        this.j = textInputLayout4;
        this.k = textInputEditText5;
        this.l = textInputLayout5;
        this.m = linearLayout;
        this.n = materialButton;
        this.f4155o = materialButton2;
        this.p = materialButton3;
        this.q = textView;
    }
}
