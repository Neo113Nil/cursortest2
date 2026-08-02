package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzpb extends android.app.Dialog {
    private final int zza;
    private final com.google.android.libraries.places.api.model.ConsumerAlert zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpb(android.content.Context context, int i, com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert) {
        super(context, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAlert, "");
        this.zza = i;
        this.zzb = consumerAlert;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzb(android.widget.TextView textView, com.google.android.libraries.places.internal.zzpb zzpbVar, android.view.View view) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        com.google.android.libraries.places.api.model.ConsumerAlertDetails details = zzpbVar.zzb.getDetails();
        intent.setData(details != null ? details.getAboutLinkUri() : null);
        try {
            textView.getContext().startActivity(intent);
        } catch (android.content.ActivityNotFoundException unused) {
            android.content.Context context = textView.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
            new com.google.android.libraries.places.internal.zzpl(context, zzpbVar.zza).show();
        }
    }

    private static final void zzc(android.view.View view, java.lang.CharSequence charSequence) {
        if (charSequence == null || kotlin.text.StringsKt.isBlank(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    @Override // android.app.Dialog
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.google.android.libraries.places.R.layout.cma_dialog);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        android.view.View findViewById = findViewById(com.google.android.libraries.places.R.id.cma_details_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert = this.zzb;
        com.google.android.libraries.places.api.model.ConsumerAlertDetails details = consumerAlert.getDetails();
        zzc(findViewById, details != null ? details.getTitle() : null);
        android.view.View findViewById2 = findViewById(com.google.android.libraries.places.R.id.cma_details_description);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        com.google.android.libraries.places.api.model.ConsumerAlertDetails details2 = consumerAlert.getDetails();
        zzc(findViewById2, details2 != null ? details2.getDescription() : null);
        final android.widget.TextView textView = (android.widget.TextView) findViewById(com.google.android.libraries.places.R.id.cma_details_link);
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        android.widget.TextView textView2 = textView;
        com.google.android.libraries.places.api.model.ConsumerAlertDetails details3 = consumerAlert.getDetails();
        zzc(textView2, details3 != null ? details3.getAboutLinkTitle() : null);
        android.graphics.drawable.Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable != null) {
            drawable.setBounds(0, 0, textView.getLineHeight(), textView.getLineHeight());
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
        }
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzpa
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view) {
                com.google.android.libraries.places.internal.zzpb.zzb(textView, this, view);
            }
        });
        android.widget.Button button = (android.widget.Button) findViewById(com.google.android.libraries.places.R.id.cma_alert_ok);
        kotlin.jvm.internal.Intrinsics.checkNotNull(button);
        java.lang.Object parent = button.getParent();
        kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "");
        android.content.Context context = button.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        com.google.android.libraries.places.internal.zzop.zza(button, (android.view.View) parent, context, 48, 48);
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzoz
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view) {
                com.google.android.libraries.places.internal.zzpb.this.dismiss();
            }
        });
    }
}
