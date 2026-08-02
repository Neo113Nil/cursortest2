package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class l implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Guideline b;
    public final androidx.constraintlayout.widget.Guideline c;
    public final androidx.constraintlayout.widget.Guideline d;
    public final androidx.constraintlayout.widget.Guideline e;
    public final androidx.constraintlayout.widget.Guideline f;
    public final androidx.constraintlayout.widget.Guideline g;
    private final androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoFpsRangesFor;
    public final androidx.constraintlayout.widget.Guideline h;
    public final androidx.constraintlayout.widget.Guideline i;
    public final androidx.constraintlayout.widget.Guideline j;
    public final androidx.constraintlayout.widget.Guideline k;
    public final androidx.appcompat.widget.AppCompatImageView l;
    public final com.google.android.material.button.MaterialButton m;
    public final com.google.android.material.textview.MaterialTextView n;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.android.material.button.MaterialButton f4156o;

    public static com.miteksystems.misnap.workflow.a.l a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.guidelineBottomContent;
        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
        if (guideline != null) {
            androidx.constraintlayout.widget.Guideline guideline2 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineBottomImageRow);
            androidx.constraintlayout.widget.Guideline guideline3 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineDivider);
            androidx.constraintlayout.widget.Guideline guideline4 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineEndButtonRetake);
            i = com.miteksystems.misnap.workflow.R.id.guidelineEndContent;
            androidx.constraintlayout.widget.Guideline guideline5 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
            if (guideline5 != null) {
                androidx.constraintlayout.widget.Guideline guideline6 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineFooterTop);
                androidx.constraintlayout.widget.Guideline guideline7 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineStartButtonSatisfied);
                i = com.miteksystems.misnap.workflow.R.id.guidelineStartContent;
                androidx.constraintlayout.widget.Guideline guideline8 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                if (guideline8 != null) {
                    i = com.miteksystems.misnap.workflow.R.id.guidelineTopContent;
                    androidx.constraintlayout.widget.Guideline guideline9 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                    if (guideline9 != null) {
                        androidx.constraintlayout.widget.Guideline guideline10 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineTopImageRow);
                        i = com.miteksystems.misnap.workflow.R.id.imagePreview;
                        androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                        if (appCompatImageView != null) {
                            i = com.miteksystems.misnap.workflow.R.id.retakeButton;
                            com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                            if (materialButton != null) {
                                i = com.miteksystems.misnap.workflow.R.id.reviewText;
                                com.google.android.material.textview.MaterialTextView materialTextView = (com.google.android.material.textview.MaterialTextView) view.findViewById(i);
                                if (materialTextView != null) {
                                    i = com.miteksystems.misnap.workflow.R.id.satisfiedButton;
                                    com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                                    if (materialButton2 != null) {
                                        return new com.miteksystems.misnap.workflow.a.l((androidx.constraintlayout.widget.ConstraintLayout) view, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, guideline7, guideline8, guideline9, guideline10, appCompatImageView, materialButton, materialTextView, materialButton2);
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
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private l(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, androidx.constraintlayout.widget.Guideline guideline3, androidx.constraintlayout.widget.Guideline guideline4, androidx.constraintlayout.widget.Guideline guideline5, androidx.constraintlayout.widget.Guideline guideline6, androidx.constraintlayout.widget.Guideline guideline7, androidx.constraintlayout.widget.Guideline guideline8, androidx.constraintlayout.widget.Guideline guideline9, androidx.constraintlayout.widget.Guideline guideline10, androidx.appcompat.widget.AppCompatImageView appCompatImageView, com.google.android.material.button.MaterialButton materialButton, com.google.android.material.textview.MaterialTextView materialTextView, com.google.android.material.button.MaterialButton materialButton2) {
        this.getHighSpeedVideoFpsRangesFor = constraintLayout;
        this.b = guideline;
        this.c = guideline2;
        this.d = guideline3;
        this.e = guideline4;
        this.f = guideline5;
        this.g = guideline6;
        this.h = guideline7;
        this.i = guideline8;
        this.j = guideline9;
        this.k = guideline10;
        this.l = appCompatImageView;
        this.m = materialButton;
        this.n = materialTextView;
        this.f4156o = materialButton2;
    }
}
