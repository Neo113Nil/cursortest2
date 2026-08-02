package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class o implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.progressindicator.CircularProgressIndicator b;
    public final com.google.android.material.textview.MaterialTextView c;
    private final androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoFpsRanges;

    public static com.miteksystems.misnap.workflow.a.o a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.progressIndicator;
        com.google.android.material.progressindicator.CircularProgressIndicator circularProgressIndicator = (com.google.android.material.progressindicator.CircularProgressIndicator) view.findViewById(i);
        if (circularProgressIndicator != null) {
            i = com.miteksystems.misnap.workflow.R.id.progressIndicatorLabel;
            com.google.android.material.textview.MaterialTextView materialTextView = (com.google.android.material.textview.MaterialTextView) view.findViewById(i);
            if (materialTextView != null) {
                return new com.miteksystems.misnap.workflow.a.o((androidx.constraintlayout.widget.ConstraintLayout) view, circularProgressIndicator, materialTextView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private o(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, com.google.android.material.progressindicator.CircularProgressIndicator circularProgressIndicator, com.google.android.material.textview.MaterialTextView materialTextView) {
        this.getHighSpeedVideoFpsRanges = constraintLayout;
        this.b = circularProgressIndicator;
        this.c = materialTextView;
    }
}
