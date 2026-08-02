package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class g implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.button.MaterialButton b;
    public final android.widget.FrameLayout c;
    public final androidx.constraintlayout.widget.Guideline d;
    public final androidx.constraintlayout.widget.Guideline e;
    public final androidx.constraintlayout.widget.Guideline f;
    public final androidx.constraintlayout.widget.Guideline g;
    private final androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoFpsRanges;
    public final androidx.constraintlayout.widget.Guideline h;
    public final androidx.constraintlayout.widget.Guideline i;
    public final com.google.android.material.checkbox.MaterialCheckBox j;

    public static com.miteksystems.misnap.workflow.a.g a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.continueButton;
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view.findViewById(i);
        if (materialButton != null) {
            i = com.miteksystems.misnap.workflow.R.id.frameLayout;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(i);
            if (frameLayout != null) {
                i = com.miteksystems.misnap.workflow.R.id.guidelineBottomContent;
                androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                if (guideline != null) {
                    androidx.constraintlayout.widget.Guideline guideline2 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineButtonsDivider);
                    i = com.miteksystems.misnap.workflow.R.id.guidelineEndContent;
                    androidx.constraintlayout.widget.Guideline guideline3 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                    if (guideline3 != null) {
                        i = com.miteksystems.misnap.workflow.R.id.guidelineStartContent;
                        androidx.constraintlayout.widget.Guideline guideline4 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                        if (guideline4 != null) {
                            i = com.miteksystems.misnap.workflow.R.id.guidelineTopButton;
                            androidx.constraintlayout.widget.Guideline guideline5 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                            if (guideline5 != null) {
                                i = com.miteksystems.misnap.workflow.R.id.guidelineTopContent;
                                androidx.constraintlayout.widget.Guideline guideline6 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                                if (guideline6 != null) {
                                    i = com.miteksystems.misnap.workflow.R.id.skipCheckBox;
                                    com.google.android.material.checkbox.MaterialCheckBox materialCheckBox = (com.google.android.material.checkbox.MaterialCheckBox) view.findViewById(i);
                                    if (materialCheckBox != null) {
                                        return new com.miteksystems.misnap.workflow.a.g((androidx.constraintlayout.widget.ConstraintLayout) view, materialButton, frameLayout, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, materialCheckBox);
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
    public final androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private g(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, com.google.android.material.button.MaterialButton materialButton, android.widget.FrameLayout frameLayout, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, androidx.constraintlayout.widget.Guideline guideline3, androidx.constraintlayout.widget.Guideline guideline4, androidx.constraintlayout.widget.Guideline guideline5, androidx.constraintlayout.widget.Guideline guideline6, com.google.android.material.checkbox.MaterialCheckBox materialCheckBox) {
        this.getHighSpeedVideoFpsRanges = constraintLayout;
        this.b = materialButton;
        this.c = frameLayout;
        this.d = guideline;
        this.e = guideline2;
        this.f = guideline3;
        this.g = guideline4;
        this.h = guideline5;
        this.i = guideline6;
        this.j = materialCheckBox;
    }
}
