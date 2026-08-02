package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class c implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.textview.MaterialTextView b;
    public final android.widget.LinearLayout c;
    public final androidx.appcompat.widget.AppCompatImageView d;
    public final com.miteksystems.misnap.workflow.view.GuideView e;
    public final androidx.constraintlayout.widget.Guideline f;
    public final androidx.constraintlayout.widget.Guideline g;
    private final androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoFpsRangesFor;
    public final androidx.appcompat.widget.AppCompatImageView h;
    public final androidx.appcompat.widget.AppCompatImageView i;
    public final com.miteksystems.misnap.workflow.a.o j;
    public final com.miteksystems.misnap.workflow.view.MiSnapView k;
    public final com.miteksystems.misnap.workflow.view.RecordingIconView l;
    public final com.miteksystems.misnap.workflow.view.SuccessView m;
    public final com.miteksystems.misnap.workflow.view.TorchView n;

    public static com.miteksystems.misnap.workflow.a.c a(android.view.View view) {
        android.view.View findViewById;
        int i = com.miteksystems.misnap.workflow.R.id.barcodeLabel;
        com.google.android.material.textview.MaterialTextView materialTextView = (com.google.android.material.textview.MaterialTextView) view.findViewById(i);
        if (materialTextView != null) {
            i = com.miteksystems.misnap.workflow.R.id.buttonsPanel;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = com.miteksystems.misnap.workflow.R.id.cancelButton;
                androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                if (appCompatImageView != null) {
                    i = com.miteksystems.misnap.workflow.R.id.guideView;
                    com.miteksystems.misnap.workflow.view.GuideView guideView = (com.miteksystems.misnap.workflow.view.GuideView) view.findViewById(i);
                    if (guideView != null) {
                        i = com.miteksystems.misnap.workflow.R.id.guidelineEndManualTriggerProgressIndicator;
                        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                        if (guideline != null) {
                            i = com.miteksystems.misnap.workflow.R.id.guidelineStartManualTriggerProgressIndicator;
                            androidx.constraintlayout.widget.Guideline guideline2 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                            if (guideline2 != null) {
                                i = com.miteksystems.misnap.workflow.R.id.helpButton;
                                androidx.appcompat.widget.AppCompatImageView appCompatImageView2 = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                                if (appCompatImageView2 != null) {
                                    i = com.miteksystems.misnap.workflow.R.id.manualButton;
                                    androidx.appcompat.widget.AppCompatImageView appCompatImageView3 = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                                    if (appCompatImageView3 != null && (findViewById = view.findViewById((i = com.miteksystems.misnap.workflow.R.id.manualButtonProgressIndicatorLayout))) != null) {
                                        com.miteksystems.misnap.workflow.a.o a2 = com.miteksystems.misnap.workflow.a.o.a(findViewById);
                                        i = com.miteksystems.misnap.workflow.R.id.misnapView;
                                        com.miteksystems.misnap.workflow.view.MiSnapView miSnapView = (com.miteksystems.misnap.workflow.view.MiSnapView) view.findViewById(i);
                                        if (miSnapView != null) {
                                            i = com.miteksystems.misnap.workflow.R.id.recordingIconView;
                                            com.miteksystems.misnap.workflow.view.RecordingIconView recordingIconView = (com.miteksystems.misnap.workflow.view.RecordingIconView) view.findViewById(i);
                                            if (recordingIconView != null) {
                                                i = com.miteksystems.misnap.workflow.R.id.successView;
                                                com.miteksystems.misnap.workflow.view.SuccessView successView = (com.miteksystems.misnap.workflow.view.SuccessView) view.findViewById(i);
                                                if (successView != null) {
                                                    i = com.miteksystems.misnap.workflow.R.id.torchView;
                                                    com.miteksystems.misnap.workflow.view.TorchView torchView = (com.miteksystems.misnap.workflow.view.TorchView) view.findViewById(i);
                                                    if (torchView != null) {
                                                        return new com.miteksystems.misnap.workflow.a.c((androidx.constraintlayout.widget.ConstraintLayout) view, materialTextView, linearLayout, appCompatImageView, guideView, guideline, guideline2, appCompatImageView2, appCompatImageView3, a2, miSnapView, recordingIconView, successView, torchView);
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
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private c(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, com.google.android.material.textview.MaterialTextView materialTextView, android.widget.LinearLayout linearLayout, androidx.appcompat.widget.AppCompatImageView appCompatImageView, com.miteksystems.misnap.workflow.view.GuideView guideView, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, androidx.appcompat.widget.AppCompatImageView appCompatImageView2, androidx.appcompat.widget.AppCompatImageView appCompatImageView3, com.miteksystems.misnap.workflow.a.o oVar, com.miteksystems.misnap.workflow.view.MiSnapView miSnapView, com.miteksystems.misnap.workflow.view.RecordingIconView recordingIconView, com.miteksystems.misnap.workflow.view.SuccessView successView, com.miteksystems.misnap.workflow.view.TorchView torchView) {
        this.getHighSpeedVideoFpsRangesFor = constraintLayout;
        this.b = materialTextView;
        this.c = linearLayout;
        this.d = appCompatImageView;
        this.e = guideView;
        this.f = guideline;
        this.g = guideline2;
        this.h = appCompatImageView2;
        this.i = appCompatImageView3;
        this.j = oVar;
        this.k = miSnapView;
        this.l = recordingIconView;
        this.m = successView;
        this.n = torchView;
    }
}
