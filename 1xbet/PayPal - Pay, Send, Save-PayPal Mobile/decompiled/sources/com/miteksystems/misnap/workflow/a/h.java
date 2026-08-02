package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class h implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Guideline b;
    public final com.google.android.material.textfield.TextInputEditText c;
    public final com.google.android.material.textfield.TextInputLayout d;
    public final com.google.android.material.button.MaterialButton e;
    public final com.google.android.material.button.MaterialButton f;
    public final com.google.android.material.button.MaterialButton g;
    private final androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoSizes;
    public final android.widget.TextView h;

    public static com.miteksystems.misnap.workflow.a.h a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.buttonsGuideline;
        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
        if (guideline != null) {
            i = com.miteksystems.misnap.workflow.R.id.mrzString;
            com.google.android.material.textfield.TextInputEditText textInputEditText = (com.google.android.material.textfield.TextInputEditText) view.findViewById(i);
            if (textInputEditText != null) {
                i = com.miteksystems.misnap.workflow.R.id.mrzStringLabel;
                com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) view.findViewById(i);
                if (textInputLayout != null) {
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
                                    return new com.miteksystems.misnap.workflow.a.h((androidx.constraintlayout.widget.ConstraintLayout) view, guideline, textInputEditText, textInputLayout, materialButton, materialButton2, materialButton3, textView);
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
    public final androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.getHighSpeedVideoSizes;
    }

    private h(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.Guideline guideline, com.google.android.material.textfield.TextInputEditText textInputEditText, com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.button.MaterialButton materialButton, com.google.android.material.button.MaterialButton materialButton2, com.google.android.material.button.MaterialButton materialButton3, android.widget.TextView textView) {
        this.getHighSpeedVideoSizes = constraintLayout;
        this.b = guideline;
        this.c = textInputEditText;
        this.d = textInputLayout;
        this.e = materialButton;
        this.f = materialButton2;
        this.g = materialButton3;
        this.h = textView;
    }
}
