package com.miteksystems.misnap.workflow.a;

/* loaded from: classes10.dex */
public final class p implements androidx.viewbinding.ViewBinding {
    public final com.google.android.material.textview.MaterialTextView b;
    private final android.widget.FrameLayout getHighSpeedVideoSizes;

    public static com.miteksystems.misnap.workflow.a.p a(android.view.View view) {
        int i = com.miteksystems.misnap.workflow.R.id.textView;
        com.google.android.material.textview.MaterialTextView materialTextView = (com.google.android.material.textview.MaterialTextView) view.findViewById(i);
        if (materialTextView != null) {
            return new com.miteksystems.misnap.workflow.a.p((android.widget.FrameLayout) view, materialTextView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.widget.FrameLayout getRoot() {
        return this.getHighSpeedVideoSizes;
    }

    public static com.miteksystems.misnap.workflow.a.p a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z) {
        android.view.View inflate = layoutInflater.inflate(com.miteksystems.misnap.workflow.R.layout.misnap_voice_phrase_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    private p(android.widget.FrameLayout frameLayout, com.google.android.material.textview.MaterialTextView materialTextView) {
        this.getHighSpeedVideoSizes = frameLayout;
        this.b = materialTextView;
    }
}
