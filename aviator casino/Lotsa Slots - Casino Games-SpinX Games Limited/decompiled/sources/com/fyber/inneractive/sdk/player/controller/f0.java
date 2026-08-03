package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.controller.v f3883a;
    public final android.app.Dialog b;

    public f0(android.content.Context context, com.fyber.inneractive.sdk.config.global.features.c cVar, com.fyber.inneractive.sdk.player.controller.v vVar) {
        this.f3883a = vVar;
        android.app.Dialog dialog = new android.app.Dialog(context);
        this.b = dialog;
        dialog.requestWindowFeature(1);
        dialog.setContentView(com.fyber.inneractive.sdk.R.layout.ia_layout_skip_rewarded_dialog);
        android.widget.Button button = (android.widget.Button) dialog.findViewById(com.fyber.inneractive.sdk.R.id.ia_keep_watching_button);
        android.widget.Button button2 = (android.widget.Button) dialog.findViewById(com.fyber.inneractive.sdk.R.id.ia_close_button);
        android.widget.TextView textView = (android.widget.TextView) dialog.findViewById(com.fyber.inneractive.sdk.R.id.ia_skip_dialog_title_textview);
        android.widget.TextView textView2 = (android.widget.TextView) dialog.findViewById(com.fyber.inneractive.sdk.R.id.ia_skip_dialog_sub_title_textview);
        java.lang.String string = context.getString(com.fyber.inneractive.sdk.R.string.ia_skip_rewarded_dialog_keep_watching);
        java.lang.String string2 = context.getString(com.fyber.inneractive.sdk.R.string.ia_skip_rewarded_dialog_close_button);
        java.lang.String string3 = context.getString(com.fyber.inneractive.sdk.R.string.ia_skip_rewarded_dialog_title);
        java.lang.String string4 = context.getString(com.fyber.inneractive.sdk.R.string.ia_skip_rewarded_dialog_sub_title);
        if (cVar != null) {
            java.lang.String a2 = cVar.a("skip_reward_dialog_keep_watching_button", "KEEP WATCHING");
            java.lang.String trim = a2.trim().length() > 0 ? a2.trim() : "KEEP WATCHING";
            string = android.text.TextUtils.isEmpty(trim) ? string : trim;
            java.lang.String a3 = cVar.a("skip_reward_dialog_close_button", "CLOSE");
            java.lang.String trim2 = a3.trim().length() > 0 ? a3.trim() : "CLOSE";
            string2 = android.text.TextUtils.isEmpty(trim2) ? string2 : trim2;
            java.lang.String a4 = cVar.a("skip_reward_dialog_title", "Close Video?");
            java.lang.String trim3 = a4.trim().length() > 0 ? a4.trim() : "Close Video?";
            string3 = android.text.TextUtils.isEmpty(trim3) ? string3 : trim3;
            java.lang.String a5 = cVar.a("skip_reward_dialog_sub_title", "Reward will not be received before video completion.");
            java.lang.String trim4 = a5.trim().length() > 0 ? a5.trim() : "Reward will not be received before video completion.";
            if (!android.text.TextUtils.isEmpty(trim4)) {
                string4 = trim4;
            }
        }
        button.setText(com.fyber.inneractive.sdk.util.i1.a(string, 13));
        button2.setText(com.fyber.inneractive.sdk.util.i1.a(string2, 13));
        textView.setText(com.fyber.inneractive.sdk.util.i1.a(string3, 20));
        textView2.setText(com.fyber.inneractive.sdk.util.i1.a(string4, 100));
        button2.setOnClickListener(new com.fyber.inneractive.sdk.player.controller.d0(this));
        button.setOnClickListener(new com.fyber.inneractive.sdk.player.controller.e0(this));
    }
}
