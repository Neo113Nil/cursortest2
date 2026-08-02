package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzpj extends android.app.Dialog {
    private static final android.net.Uri zzd = android.net.Uri.parse("https://support.google.com/contributionpolicy/answer/7422880");
    private static final android.net.Uri zze = android.net.Uri.parse("https://support.google.com/maps/answer/3092445");
    private static final android.net.Uri zzf = android.net.Uri.parse("https://support.google.com/maps/contact/14718793");
    private static final android.net.Uri zzg = android.net.Uri.parse("https://policies.google.com/privacy");
    private static final android.net.Uri zzh = android.net.Uri.parse("https://www.google.com/help/terms_maps/");
    private final android.content.Context zza;
    private final int zzb;
    private final java.util.List zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpj(android.content.Context context, int i, java.util.List list) {
        super(context, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = context;
        this.zzb = i;
        this.zzc = list;
    }

    private final void zzf() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.google.android.libraries.places.R.id.view_terms_link_text);
        int lineHeight = textView != null ? textView.getLineHeight() : (int) this.zza.getResources().getDimension(com.google.android.libraries.places.R.dimen.gmp_sys_measurement_icon_size_small);
        for (android.widget.ImageView imageView : kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new android.widget.ImageView[]{(android.widget.ImageView) findViewById(com.google.android.libraries.places.R.id.reviews_disclosure_learn_more_link_icon), (android.widget.ImageView) findViewById(com.google.android.libraries.places.R.id.about_these_results_link_icon), (android.widget.ImageView) findViewById(com.google.android.libraries.places.R.id.view_terms_link_icon), (android.widget.ImageView) findViewById(com.google.android.libraries.places.R.id.view_privacy_link_icon), (android.widget.ImageView) findViewById(com.google.android.libraries.places.R.id.report_business_conduct_link_icon)})) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams, "");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = lineHeight;
            marginLayoutParams.width = lineHeight;
            imageView.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(android.net.Uri uri) {
        try {
            this.zza.startActivity(new android.content.Intent("android.intent.action.VIEW", uri));
        } catch (android.content.ActivityNotFoundException unused) {
            new com.google.android.libraries.places.internal.zzpl(this.zza, this.zzb).show();
        }
    }

    @Override // android.app.Dialog
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.google.android.libraries.places.R.layout.legal_disclosures_dialog);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            window.setLayout(-1, -2);
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        setTitle(com.google.android.libraries.places.R.string.place_widgets_legal_disclosures_icon_a11y_label);
        zzf();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.google.android.libraries.places.R.id.reviews_disclosure_learn_more_link);
        if (linearLayout != null) {
            com.google.android.libraries.places.internal.zzop.zzb(linearLayout);
            linearLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzph
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view) {
                    com.google.android.libraries.places.internal.zzpj.this.zzg(com.google.android.libraries.places.internal.zzpj.zzd);
                }
            });
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) findViewById(com.google.android.libraries.places.R.id.about_these_results_link);
        if (linearLayout2 != null) {
            com.google.android.libraries.places.internal.zzop.zzb(linearLayout2);
            linearLayout2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzpc
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view) {
                    com.google.android.libraries.places.internal.zzpj.this.zzg(com.google.android.libraries.places.internal.zzpj.zze);
                }
            });
        }
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) findViewById(com.google.android.libraries.places.R.id.view_terms_link);
        if (linearLayout3 != null) {
            com.google.android.libraries.places.internal.zzop.zzb(linearLayout3);
            linearLayout3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzpd
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view) {
                    com.google.android.libraries.places.internal.zzpj.this.zzg(com.google.android.libraries.places.internal.zzpj.zzh);
                }
            });
        }
        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) findViewById(com.google.android.libraries.places.R.id.view_privacy_link);
        if (linearLayout4 != null) {
            com.google.android.libraries.places.internal.zzop.zzb(linearLayout4);
            linearLayout4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzpe
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view) {
                    com.google.android.libraries.places.internal.zzpj.this.zzg(com.google.android.libraries.places.internal.zzpj.zzg);
                }
            });
        }
        android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) findViewById(com.google.android.libraries.places.R.id.report_business_conduct_link);
        if (linearLayout5 != null) {
            com.google.android.libraries.places.internal.zzop.zzb(linearLayout5);
            linearLayout5.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzpf
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view) {
                    com.google.android.libraries.places.internal.zzpj.this.zzg(com.google.android.libraries.places.internal.zzpj.zzf);
                }
            });
        }
        ((android.widget.Button) findViewById(com.google.android.libraries.places.R.id.legal_disclosures_ok)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzpg
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view) {
                com.google.android.libraries.places.internal.zzpj.this.dismiss();
            }
        });
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            int ordinal = ((com.google.android.libraries.places.internal.zzpi) it.next()).ordinal();
            if (ordinal == 0) {
                android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) findViewById(com.google.android.libraries.places.R.id.reviews_disclosure_container);
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } else if (ordinal == 1) {
                android.widget.LinearLayout linearLayout7 = (android.widget.LinearLayout) findViewById(com.google.android.libraries.places.R.id.about_these_results_container);
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(0);
                }
            } else if (ordinal == 2) {
                android.widget.LinearLayout linearLayout8 = (android.widget.LinearLayout) findViewById(com.google.android.libraries.places.R.id.review_ordering_container);
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
            } else {
                if (ordinal != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                android.widget.LinearLayout linearLayout9 = (android.widget.LinearLayout) findViewById(com.google.android.libraries.places.R.id.report_business_conduct_container);
                if (linearLayout9 != null) {
                    linearLayout9.setVisibility(0);
                }
            }
        }
    }
}
