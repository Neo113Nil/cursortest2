package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class k implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.button.MaterialButton b;
    public final com.google.android.material.button.MaterialButton c;
    public final com.google.android.material.button.MaterialButton d;
    public final com.google.android.material.button.MaterialButton e;
    private final android.widget.LinearLayout getHighResolutionOutputSizeshNQ4ISI;

    public static com.miteksystems.misnap.workflow.a.k a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.driversLicense;
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view.findViewById(i);
        if (materialButton != null) {
            i = com.miteksystems.misnap.workflow.R.id.idCard;
            com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
            if (materialButton2 != null) {
                i = com.miteksystems.misnap.workflow.R.id.passport;
                com.google.android.material.button.MaterialButton materialButton3 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                if (materialButton3 != null) {
                    i = com.miteksystems.misnap.workflow.R.id.skipButton;
                    com.google.android.material.button.MaterialButton materialButton4 = (com.google.android.material.button.MaterialButton) view.findViewById(i);
                    if (materialButton4 != null) {
                        return new com.miteksystems.misnap.workflow.a.k((android.widget.LinearLayout) view, materialButton, materialButton2, materialButton3, materialButton4);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.widget.LinearLayout getRoot() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private k(android.widget.LinearLayout linearLayout, com.google.android.material.button.MaterialButton materialButton, com.google.android.material.button.MaterialButton materialButton2, com.google.android.material.button.MaterialButton materialButton3, com.google.android.material.button.MaterialButton materialButton4) {
        this.getHighResolutionOutputSizeshNQ4ISI = linearLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = materialButton3;
        this.e = materialButton4;
    }
}
