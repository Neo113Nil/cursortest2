package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class m implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Guideline b;
    public final androidx.constraintlayout.widget.Guideline c;
    public final androidx.constraintlayout.widget.Guideline d;
    public final androidx.constraintlayout.widget.Guideline e;
    public final com.google.android.material.textview.MaterialTextView f;
    public final androidx.recyclerview.widget.RecyclerView g;
    private final androidx.constraintlayout.widget.ConstraintLayout getHighResolutionOutputSizeshNQ4ISI;

    public static com.miteksystems.misnap.workflow.a.m a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.guidelineBottomContent;
        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
        if (guideline != null) {
            i = com.miteksystems.misnap.workflow.R.id.guidelineEndContent;
            androidx.constraintlayout.widget.Guideline guideline2 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
            if (guideline2 != null) {
                i = com.miteksystems.misnap.workflow.R.id.guidelineStartContent;
                androidx.constraintlayout.widget.Guideline guideline3 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                if (guideline3 != null) {
                    i = com.miteksystems.misnap.workflow.R.id.guidelineTopContent;
                    androidx.constraintlayout.widget.Guideline guideline4 = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                    if (guideline4 != null) {
                        i = com.miteksystems.misnap.workflow.R.id.header;
                        com.google.android.material.textview.MaterialTextView materialTextView = (com.google.android.material.textview.MaterialTextView) view.findViewById(i);
                        if (materialTextView != null) {
                            i = com.miteksystems.misnap.workflow.R.id.phraseList;
                            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view.findViewById(i);
                            if (recyclerView != null) {
                                return new com.miteksystems.misnap.workflow.a.m((androidx.constraintlayout.widget.ConstraintLayout) view, guideline, guideline2, guideline3, guideline4, materialTextView, recyclerView);
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

    private m(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, androidx.constraintlayout.widget.Guideline guideline3, androidx.constraintlayout.widget.Guideline guideline4, com.google.android.material.textview.MaterialTextView materialTextView, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.getHighResolutionOutputSizeshNQ4ISI = constraintLayout;
        this.b = guideline;
        this.c = guideline2;
        this.d = guideline3;
        this.e = guideline4;
        this.f = materialTextView;
        this.g = recyclerView;
    }
}
