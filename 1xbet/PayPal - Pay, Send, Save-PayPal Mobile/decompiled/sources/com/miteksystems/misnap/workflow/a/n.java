package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class n implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout Camera2StreamConfigurationMap;
    public final androidx.constraintlayout.widget.Group b;
    public final androidx.constraintlayout.widget.ConstraintLayout c;
    public final androidx.constraintlayout.widget.Guideline d;
    public final androidx.constraintlayout.widget.Group e;
    public final androidx.appcompat.widget.LinearLayoutCompat f;
    public final com.google.android.material.textview.MaterialTextView g;
    public final androidx.constraintlayout.widget.Guideline h;
    public final androidx.constraintlayout.widget.Guideline i;
    public final androidx.constraintlayout.widget.Guideline j;
    public final androidx.constraintlayout.widget.Guideline k;
    public final androidx.appcompat.widget.AppCompatImageView l;
    public final android.widget.TextView m;
    public final com.google.android.material.button.MaterialButton n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f4157o;
    public final com.miteksystems.misnap.workflow.view.ProgressTrackerView p;
    public final androidx.constraintlayout.widget.Guideline q;
    public final androidx.constraintlayout.widget.Guideline r;
    public final com.google.android.material.button.MaterialButton s;
    public final androidx.constraintlayout.widget.Guideline t;
    public final com.google.android.material.button.MaterialButton u;
    public final com.miteksystems.misnap.workflow.view.VisualizerView v;

    public static com.miteksystems.misnap.workflow.a.n a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.captureGroup;
        androidx.constraintlayout.widget.Group group = (androidx.constraintlayout.widget.Group) view.findViewById(i);
        if (group != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view;
            i = com.miteksystems.misnap.workflow.R.id.centerContentUpperBound;
            androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
            if (guideline != null) {
                i = com.miteksystems.misnap.workflow.R.id.failoverGroup;
                androidx.constraintlayout.widget.Group group2 = (androidx.constraintlayout.widget.Group) view.findViewById(i);
                if (group2 != null) {
                    i = com.miteksystems.misnap.workflow.R.id.failoverLayout;
                    androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat = (androidx.appcompat.widget.LinearLayoutCompat) view.findViewById(i);
                    if (linearLayoutCompat != null) {
                        i = com.miteksystems.misnap.workflow.R.id.failoverTextView;
                        com.google.android.material.textview.MaterialTextView materialTextView = (com.google.android.material.textview.MaterialTextView) view.findViewById(i);
                        if (materialTextView != null) {
                            i = com.miteksystems.misnap.workflow.R.id.guidelineBottomContent;
                            androidx.constraintlayout.widget.Guideline guideline2 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                            if (guideline2 != null) {
                                i = com.miteksystems.misnap.workflow.R.id.guidelineEndContent;
                                androidx.constraintlayout.widget.Guideline guideline3 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                                if (guideline3 != null) {
                                    i = com.miteksystems.misnap.workflow.R.id.guidelineStartContent;
                                    androidx.constraintlayout.widget.Guideline guideline4 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                                    if (guideline4 != null) {
                                        i = com.miteksystems.misnap.workflow.R.id.guidelineTopContent;
                                        androidx.constraintlayout.widget.Guideline guideline5 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                                        if (guideline5 != null) {
                                            i = com.miteksystems.misnap.workflow.R.id.helpButton;
                                            androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                                            if (appCompatImageView != null) {
                                                i = com.miteksystems.misnap.workflow.R.id.messageAboutPhraseTextView;
                                                android.widget.TextView textView = (android.widget.TextView) view.findViewById(i);
                                                if (textView != null) {
                                                    i = com.miteksystems.misnap.workflow.R.id.needHelpButton;
                                                    com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                                                    if (materialButton != null) {
                                                        i = com.miteksystems.misnap.workflow.R.id.phraseForPronouncingTextView;
                                                        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(i);
                                                        if (textView2 != null) {
                                                            i = com.miteksystems.misnap.workflow.R.id.progressTrackerView;
                                                            com.miteksystems.misnap.workflow.view.ProgressTrackerView progressTrackerView = (com.miteksystems.misnap.workflow.view.ProgressTrackerView) view.findViewById(i);
                                                            if (progressTrackerView != null) {
                                                                i = com.miteksystems.misnap.workflow.R.id.progressTrackerViewLowerBound;
                                                                androidx.constraintlayout.widget.Guideline guideline6 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                                                                if (guideline6 != null) {
                                                                    androidx.constraintlayout.widget.Guideline guideline7 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.progressTrackerViewUpperBound);
                                                                    i = com.miteksystems.misnap.workflow.R.id.skipButton;
                                                                    com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                                                                    if (materialButton2 != null) {
                                                                        androidx.constraintlayout.widget.Guideline guideline8 = (androidx.constraintlayout.widget.Guideline) view.findViewById(com.miteksystems.misnap.workflow.R.id.textUpperBound);
                                                                        i = com.miteksystems.misnap.workflow.R.id.tryAgainButton;
                                                                        com.google.android.material.button.MaterialButton materialButton3 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                                                                        if (materialButton3 != null) {
                                                                            i = com.miteksystems.misnap.workflow.R.id.visualizer;
                                                                            com.miteksystems.misnap.workflow.view.VisualizerView visualizerView = (com.miteksystems.misnap.workflow.view.VisualizerView) view.findViewById(i);
                                                                            if (visualizerView != null) {
                                                                                return new com.miteksystems.misnap.workflow.a.n(constraintLayout, group, constraintLayout, guideline, group2, linearLayoutCompat, materialTextView, guideline2, guideline3, guideline4, guideline5, appCompatImageView, textView, materialButton, textView2, progressTrackerView, guideline6, guideline7, materialButton2, guideline8, materialButton3, visualizerView);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.Camera2StreamConfigurationMap;
    }

    private n(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.Group group, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Group group2, androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat, com.google.android.material.textview.MaterialTextView materialTextView, androidx.constraintlayout.widget.Guideline guideline2, androidx.constraintlayout.widget.Guideline guideline3, androidx.constraintlayout.widget.Guideline guideline4, androidx.constraintlayout.widget.Guideline guideline5, androidx.appcompat.widget.AppCompatImageView appCompatImageView, android.widget.TextView textView, com.google.android.material.button.MaterialButton materialButton, android.widget.TextView textView2, com.miteksystems.misnap.workflow.view.ProgressTrackerView progressTrackerView, androidx.constraintlayout.widget.Guideline guideline6, androidx.constraintlayout.widget.Guideline guideline7, com.google.android.material.button.MaterialButton materialButton2, androidx.constraintlayout.widget.Guideline guideline8, com.google.android.material.button.MaterialButton materialButton3, com.miteksystems.misnap.workflow.view.VisualizerView visualizerView) {
        this.Camera2StreamConfigurationMap = constraintLayout;
        this.b = group;
        this.c = constraintLayout2;
        this.d = guideline;
        this.e = group2;
        this.f = linearLayoutCompat;
        this.g = materialTextView;
        this.h = guideline2;
        this.i = guideline3;
        this.j = guideline4;
        this.k = guideline5;
        this.l = appCompatImageView;
        this.m = textView;
        this.n = materialButton;
        this.f4157o = textView2;
        this.p = progressTrackerView;
        this.q = guideline6;
        this.r = guideline7;
        this.s = materialButton2;
        this.t = guideline8;
        this.u = materialButton3;
        this.v = visualizerView;
    }
}
