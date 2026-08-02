package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class j implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Guideline b;
    public final androidx.constraintlayout.widget.Guideline c;
    public final androidx.constraintlayout.widget.Guideline d;
    public final androidx.constraintlayout.widget.Guideline e;
    public final androidx.constraintlayout.widget.Guideline f;
    public final androidx.constraintlayout.widget.Guideline g;
    private final androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoFpsRanges;
    public final com.google.android.material.button.MaterialButton h;
    public final com.google.android.material.progressindicator.LinearProgressIndicator i;
    public final com.google.android.material.textview.MaterialTextView j;
    public final androidx.appcompat.widget.AppCompatImageView k;
    public final com.google.android.material.textview.MaterialTextView l;
    public final com.google.android.material.button.MaterialButton m;
    public final com.google.android.material.button.MaterialButton n;

    public static com.miteksystems.misnap.workflow.a.j a(android.view.View view) {
        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineBottomContent);
        androidx.constraintlayout.widget.Guideline guideline2 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineButtonsDivider);
        androidx.constraintlayout.widget.Guideline guideline3 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineEndContent);
        androidx.constraintlayout.widget.Guideline guideline4 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineStartContent);
        androidx.constraintlayout.widget.Guideline guideline5 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineTopButton);
        androidx.constraintlayout.widget.Guideline guideline6 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineTopContent);
        int i = com.miteksystems.misnap.workflow.R.id.needHelp;
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view.findViewById(i);
        if (materialButton != null) {
            i = com.miteksystems.misnap.workflow.R.id.readProgress;
            com.google.android.material.progressindicator.LinearProgressIndicator linearProgressIndicator = (com.google.android.material.progressindicator.LinearProgressIndicator) view.findViewById(i);
            if (linearProgressIndicator != null) {
                i = com.miteksystems.misnap.workflow.R.id.readingStatus;
                com.google.android.material.textview.MaterialTextView materialTextView = (com.google.android.material.textview.MaterialTextView) view.findViewById(i);
                if (materialTextView != null) {
                    i = com.miteksystems.misnap.workflow.R.id.scanAnimation;
                    androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                    if (appCompatImageView != null) {
                        i = com.miteksystems.misnap.workflow.R.id.scanInstructions;
                        com.google.android.material.textview.MaterialTextView materialTextView2 = (com.google.android.material.textview.MaterialTextView) view.findViewById(i);
                        if (materialTextView2 != null) {
                            i = com.miteksystems.misnap.workflow.R.id.skip;
                            com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                            if (materialButton2 != null) {
                                i = com.miteksystems.misnap.workflow.R.id.tryAgain;
                                com.google.android.material.button.MaterialButton materialButton3 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                                if (materialButton3 != null) {
                                    return new com.miteksystems.misnap.workflow.a.j((androidx.constraintlayout.widget.ConstraintLayout) view, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, materialButton, linearProgressIndicator, materialTextView, appCompatImageView, materialTextView2, materialButton2, materialButton3);
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

    private j(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, androidx.constraintlayout.widget.Guideline guideline3, androidx.constraintlayout.widget.Guideline guideline4, androidx.constraintlayout.widget.Guideline guideline5, androidx.constraintlayout.widget.Guideline guideline6, com.google.android.material.button.MaterialButton materialButton, com.google.android.material.progressindicator.LinearProgressIndicator linearProgressIndicator, com.google.android.material.textview.MaterialTextView materialTextView, androidx.appcompat.widget.AppCompatImageView appCompatImageView, com.google.android.material.textview.MaterialTextView materialTextView2, com.google.android.material.button.MaterialButton materialButton2, com.google.android.material.button.MaterialButton materialButton3) {
        this.getHighSpeedVideoFpsRanges = constraintLayout;
        this.b = guideline;
        this.c = guideline2;
        this.d = guideline3;
        this.e = guideline4;
        this.f = guideline5;
        this.g = guideline6;
        this.h = materialButton;
        this.i = linearProgressIndicator;
        this.j = materialTextView;
        this.k = appCompatImageView;
        this.l = materialTextView2;
        this.m = materialButton2;
        this.n = materialButton3;
    }
}
