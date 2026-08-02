package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class f implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.button.MaterialButton b;
    public final android.widget.FrameLayout c;
    public final com.google.android.material.textview.MaterialTextView d;
    public final android.widget.LinearLayout e;
    public final androidx.constraintlayout.widget.Guideline f;
    public final androidx.constraintlayout.widget.Guideline g;
    private final androidx.constraintlayout.widget.ConstraintLayout getHighResolutionOutputSizeshNQ4ISI;
    public final androidx.constraintlayout.widget.Guideline h;
    public final androidx.constraintlayout.widget.Guideline i;
    public final androidx.constraintlayout.widget.Guideline j;
    public final androidx.constraintlayout.widget.Guideline k;
    public final androidx.constraintlayout.widget.Guideline l;
    public final androidx.constraintlayout.widget.Guideline m;
    public final com.google.android.material.button.MaterialButton n;

    public static com.miteksystems.misnap.workflow.a.f a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.autoButton;
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view.findViewById(i);
        if (materialButton != null) {
            i = com.miteksystems.misnap.workflow.R.id.failoverHeader;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(i);
            if (frameLayout != null) {
                i = com.miteksystems.misnap.workflow.R.id.failoverMessageRetry;
                com.google.android.material.textview.MaterialTextView materialTextView = (com.google.android.material.textview.MaterialTextView) view.findViewById(i);
                if (materialTextView != null) {
                    i = com.miteksystems.misnap.workflow.R.id.failuresListContainer;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(i);
                    if (linearLayout != null) {
                        i = com.miteksystems.misnap.workflow.R.id.guidelineBottomContent;
                        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                        if (guideline != null) {
                            i = com.miteksystems.misnap.workflow.R.id.guidelineButtonsDivider;
                            androidx.constraintlayout.widget.Guideline guideline2 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                            if (guideline2 != null) {
                                i = com.miteksystems.misnap.workflow.R.id.guidelineEndContent;
                                androidx.constraintlayout.widget.Guideline guideline3 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                                if (guideline3 != null) {
                                    i = com.miteksystems.misnap.workflow.R.id.guidelineFooterTop;
                                    androidx.constraintlayout.widget.Guideline guideline4 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                                    if (guideline4 != null) {
                                        androidx.constraintlayout.widget.Guideline guideline5 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineHeaderBottom);
                                        androidx.constraintlayout.widget.Guideline guideline6 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.guidelineMessageTop);
                                        i = com.miteksystems.misnap.workflow.R.id.guidelineStartContent;
                                        androidx.constraintlayout.widget.Guideline guideline7 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                                        if (guideline7 != null) {
                                            i = com.miteksystems.misnap.workflow.R.id.guidelineTopContent;
                                            androidx.constraintlayout.widget.Guideline guideline8 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                                            if (guideline8 != null) {
                                                i = com.miteksystems.misnap.workflow.R.id.manualButton;
                                                com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                                                if (materialButton2 != null) {
                                                    return new com.miteksystems.misnap.workflow.a.f((androidx.constraintlayout.widget.ConstraintLayout) view, materialButton, frameLayout, materialTextView, linearLayout, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, guideline7, guideline8, materialButton2);
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
    public final androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private f(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, com.google.android.material.button.MaterialButton materialButton, android.widget.FrameLayout frameLayout, com.google.android.material.textview.MaterialTextView materialTextView, android.widget.LinearLayout linearLayout, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, androidx.constraintlayout.widget.Guideline guideline3, androidx.constraintlayout.widget.Guideline guideline4, androidx.constraintlayout.widget.Guideline guideline5, androidx.constraintlayout.widget.Guideline guideline6, androidx.constraintlayout.widget.Guideline guideline7, androidx.constraintlayout.widget.Guideline guideline8, com.google.android.material.button.MaterialButton materialButton2) {
        this.getHighResolutionOutputSizeshNQ4ISI = constraintLayout;
        this.b = materialButton;
        this.c = frameLayout;
        this.d = materialTextView;
        this.e = linearLayout;
        this.f = guideline;
        this.g = guideline2;
        this.h = guideline3;
        this.i = guideline4;
        this.j = guideline5;
        this.k = guideline6;
        this.l = guideline7;
        this.m = guideline8;
        this.n = materialButton2;
    }
}
