package com.knotapi.knot.ui.dialogs;

/* loaded from: classes9.dex */
public class KnotBottomSheetDialog extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    public static final java.lang.String TAG = "Knot:KnotBottomSheetDialog";
    private android.graphics.Bitmap bitmap;
    android.widget.LinearLayout btn_primaryButton;
    android.widget.LinearLayout btn_secondButton;
    androidx.cardview.widget.CardView cardView_logo;
    com.knotapi.knot.models.DialogOptions dialogOptions;
    android.widget.EditText edit_text;
    android.widget.LinearLayout edit_text_layout;
    android.widget.ImageView img_close;
    private boolean isNonDismissible = false;
    android.widget.ImageView logo_link;
    android.widget.TextView txt_description;
    android.widget.TextView txt_primaryButton;
    android.widget.TextView txt_secondButton;
    android.widget.TextView txt_title;
    com.knotapi.knot.interfaces.MerchantWebViewDelegate webViewDelegate;

    public KnotBottomSheetDialog(com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate) {
        this.webViewDelegate = merchantWebViewDelegate;
    }

    static /* synthetic */ void lambda$onCreateDialog$0(android.content.DialogInterface dialogInterface) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((com.google.android.material.bottomsheet.BottomSheetDialog) dialogInterface).findViewById(com.google.android.material.R.id.design_bottom_sheet);
        if (frameLayout != null) {
            com.google.android.material.bottomsheet.BottomSheetBehavior from = com.google.android.material.bottomsheet.BottomSheetBehavior.from(frameLayout);
            from.setHideable(false);
            from.setState(3);
        }
    }

    public void closeSheet() {
        dismiss();
    }

    public java.lang.String getConfirmationLink() {
        return this.edit_text.getText().toString().trim();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = (com.google.android.material.bottomsheet.BottomSheetDialog) super.onCreateDialog(bundle);
        if (this.isNonDismissible) {
            bottomSheetDialog.setCanceledOnTouchOutside(false);
            bottomSheetDialog.setCancelable(false);
            bottomSheetDialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() { // from class: com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(android.content.DialogInterface dialogInterface) {
                    com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.lambda$onCreateDialog$0(dialogInterface);
                }
            });
        }
        return bottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.knotapi.knot.R.layout.bottom_sheet_layout, viewGroup, false);
        this.img_close = (android.widget.ImageView) inflate.findViewById(com.knotapi.knot.R.id.img_close);
        this.txt_title = (android.widget.TextView) inflate.findViewById(com.knotapi.knot.R.id.txt_title);
        this.txt_description = (android.widget.TextView) inflate.findViewById(com.knotapi.knot.R.id.txt_description);
        this.btn_primaryButton = (android.widget.LinearLayout) inflate.findViewById(com.knotapi.knot.R.id.btn_primaryButton);
        this.btn_secondButton = (android.widget.LinearLayout) inflate.findViewById(com.knotapi.knot.R.id.btn_secondButton);
        this.txt_primaryButton = (android.widget.TextView) inflate.findViewById(com.knotapi.knot.R.id.txt_primaryButton);
        this.txt_secondButton = (android.widget.TextView) inflate.findViewById(com.knotapi.knot.R.id.txt_secondButton);
        this.edit_text = (android.widget.EditText) inflate.findViewById(com.knotapi.knot.R.id.editText_link);
        this.edit_text_layout = (android.widget.LinearLayout) inflate.findViewById(com.knotapi.knot.R.id.editText);
        this.logo_link = (android.widget.ImageView) inflate.findViewById(com.knotapi.knot.R.id.merchant_logo);
        this.cardView_logo = (androidx.cardview.widget.CardView) inflate.findViewById(com.knotapi.knot.R.id.cardview_logo);
        com.knotapi.knot.models.DialogOptions dialogOptions = this.dialogOptions;
        if (dialogOptions == null) {
            closeSheet();
            return inflate;
        }
        this.txt_title.setText(dialogOptions.getTitle());
        if (this.dialogOptions.getDescription().isEmpty()) {
            this.txt_description.setVisibility(8);
        } else {
            this.txt_description.setText(android.text.Html.fromHtml(this.dialogOptions.getDescription()));
            this.txt_description.setVisibility(0);
        }
        this.txt_primaryButton.setText(this.dialogOptions.getPrimaryButton());
        this.txt_secondButton.setText(this.dialogOptions.getSecondaryButton());
        this.btn_primaryButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.this.dialogOptions.getPrimaryButtonListener().onClick(view);
            }
        });
        this.btn_secondButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.this.dialogOptions.getSecondaryButtonListener().onClick(view);
            }
        });
        this.img_close.setOnClickListener(this.dialogOptions.getCloseButtonListener());
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            this.logo_link.setImageBitmap(bitmap);
            this.cardView_logo.setVisibility(0);
        } else {
            this.cardView_logo.setVisibility(8);
        }
        if (this.dialogOptions.isShowEditText().isEmpty()) {
            this.edit_text_layout.setVisibility(8);
            this.btn_primaryButton.setVisibility(0);
            return inflate;
        }
        this.edit_text_layout.setVisibility(0);
        this.btn_primaryButton.setVisibility(8);
        this.edit_text.setHint(this.dialogOptions.isShowEditText().trim());
        this.edit_text.addTextChangedListener(new android.text.TextWatcher() { // from class: com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.toString().trim().isEmpty()) {
                    com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.this.btn_secondButton.setEnabled(false);
                    com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.this.btn_secondButton.setBackgroundResource(com.knotapi.knot.R.drawable.rounded_corner_button_disabled_grey);
                    com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.this.txt_secondButton.setTextColor(android.graphics.Color.parseColor("#737373"));
                } else {
                    com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.this.btn_secondButton.setEnabled(true);
                    com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.this.btn_secondButton.setBackgroundResource(com.knotapi.knot.R.drawable.rounded_corner_button_transparent);
                    com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog.this.txt_secondButton.setTextColor(android.graphics.Color.parseColor("#FFFFFF"));
                }
            }
        });
        if (!this.edit_text.getText().toString().trim().isEmpty()) {
            this.txt_secondButton.setTextColor(android.graphics.Color.parseColor("#FFFFFF"));
            return inflate;
        }
        this.btn_secondButton.setEnabled(false);
        this.btn_secondButton.setBackgroundResource(com.knotapi.knot.R.drawable.rounded_corner_button_disabled_grey);
        this.txt_secondButton.setTextColor(android.graphics.Color.parseColor("#737373"));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getDialog() == null || getDialog().getWindow() == null) {
            return;
        }
        getDialog().getWindow().setSoftInputMode(16);
    }

    public void setBitmap(android.graphics.Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setDialogOptions(com.knotapi.knot.models.DialogOptions dialogOptions) {
        this.dialogOptions = dialogOptions;
    }

    public void setNonDismissible(boolean z) {
        this.isNonDismissible = z;
    }
}
