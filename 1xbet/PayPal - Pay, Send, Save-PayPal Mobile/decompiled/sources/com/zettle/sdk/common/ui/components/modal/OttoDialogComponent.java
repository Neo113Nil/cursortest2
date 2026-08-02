package com.zettle.sdk.common.ui.components.modal;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0004(')*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001d\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0016\u0010\u0019\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0016\u0010\"\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010&\u001a\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent;", "Lcom/zettle/sdk/common/ui/components/modal/AutoSizeDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getHighSpeedVideoFpsRangesFor", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Camera2StreamConfigurationMap", "Landroid/widget/ImageView;", "getHighSpeedVideoSizes", "Landroid/widget/ImageView;", "getHighSpeedVideoFpsRanges", "Landroid/widget/TextView;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/widget/TextView;", "Landroid/widget/Button;", "Landroid/widget/Button;", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "", "getMergeLayoutRes", "()I", "mergeLayoutRes", "Companion", "Builder", "DialogComponentClickListeners", "IDialogComponentClickListeners"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OttoDialogComponent extends com.zettle.sdk.common.ui.components.modal.AutoSizeDialogFragment {
    public static final java.lang.String BUNDLE_KEY_CTA_CLICKED = "BUNDLE_KEY_CTA_CLICKED";
    public static final java.lang.String BUNDLE_KEY_RESULT_PRIMARY_CTA_CLICKED = "BUNDLE_KEY_RESULT_PRIMARY_CTA_CLICKED";
    public static final java.lang.String BUNDLE_KEY_RESULT_SECONDARY_CTA_CLICKED = "BUNDLE_KEY_RESULT_SECONDARY_CTA_CLICKED";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Companion INSTANCE = new com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Companion(null);
    public static final java.lang.String DEFAULT_DIALOG_FRAGMENT_REQUEST_KEY = "REQUEST_KEY_DIALOG_COMPONENT";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.widget.Button getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.widget.TextView getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.widget.Button getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.constraintlayout.widget.ConstraintLayout Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.widget.ImageView getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private android.widget.TextView getOutputMinFrameDuration;

    @Override // com.zettle.sdk.common.ui.components.modal.AutoSizeDialogFragment
    protected final int getMergeLayoutRes() {
        return com.zettle.sdk.common.ui.R.layout.sdk_component_dialog;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Companion;", "", "<init>", "()V", "", "BUNDLE_KEY_CTA_CLICKED", "Ljava/lang/String;", "BUNDLE_KEY_RESULT_PRIMARY_CTA_CLICKED", "BUNDLE_KEY_RESULT_SECONDARY_CTA_CLICKED", "DEFAULT_DIALOG_FRAGMENT_REQUEST_KEY"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ com.zettle.sdk.common.ui.components.modal.OttoDialogComponent access$newInstance(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Companion companion, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i3, int i4, java.lang.String str5, int i5, int i6, boolean z, com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners dialogComponentClickListeners, java.lang.String str6, android.os.Bundle bundle) {
            com.zettle.sdk.common.ui.components.modal.OttoDialogComponent ottoDialogComponent = new com.zettle.sdk.common.ui.components.modal.OttoDialogComponent();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("PARAM_ICON", i);
            bundle2.putInt("PARAM_ICON_TINT", i2);
            bundle2.putString("PARAM_ICON_CONTENT_DESCRIPTION", str);
            bundle2.putString("PARAM_TITLE_TEXT", str2);
            bundle2.putString("PARAM_MESSAGE_TEXT", str3);
            bundle2.putBoolean("PARAM_PRIMARY_BTN_IS_DESTRUCTIVE", z);
            bundle2.putString("PARAM_PRIMARY_BTN_TEXT", str5);
            bundle2.putInt("PARAM_PRIMARY_BTN_ICON_START", i5);
            bundle2.putInt("PARAM_PRIMARY_BTN_ICON_END", i6);
            bundle2.putString("PARAM_SECONDARY_BTN_TEXT", str4);
            bundle2.putInt("PARAM_SECONDARY_BTN_ICON_START", i3);
            bundle2.putInt("PARAM_SECONDARY_BTN_ICON_END", i4);
            bundle2.putString("PARAM_DIALOG_FRAGMENT_REQUEST_KEY", str6);
            bundle2.putBundle("PARAM_DIALOG_FRAGMENT_RESULT_BUNDLE", bundle);
            bundle2.putParcelable("PARAM_CTA_BUTTONS_LISTENER", dialogComponentClickListeners);
            ottoDialogComponent.setArguments(bundle2);
            return ottoDialogComponent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.zettle.sdk.common.ui.components.modal.AutoSizeDialogFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.view.View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() { // from class: com.zettle.sdk.common.ui.components.modal.OttoDialogComponent$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(android.content.DialogInterface dialogInterface) {
                    com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.$r8$lambda$iatkcjZIQmPQVZ7lTqX3JaHmBiM(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.this, dialogInterface);
                }
            });
        }
        return onCreateView;
    }

    @Override // com.zettle.sdk.common.ui.components.modal.AutoSizeDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(android.os.Bundle bundle) {
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        super.onActivityCreated(bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.addFlags(Integer.MIN_VALUE);
        }
        android.app.Dialog dialog2 = getDialog();
        android.view.WindowManager.LayoutParams layoutParams = null;
        android.view.Window window4 = dialog2 != null ? dialog2.getWindow() : null;
        if (window4 != null) {
            window4.setStatusBarColor(androidx.core.content.res.ResourcesCompat.getColor(getResources(), android.R.color.transparent, null));
        }
        if (isLargeScreen()) {
            android.app.Dialog dialog3 = getDialog();
            if (dialog3 != null && (window2 = dialog3.getWindow()) != null) {
                layoutParams = window2.getAttributes();
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = com.zettle.sdk.common.ui.R.style.DialogComponent_Otto_Fade_Zoom_Animation;
                return;
            }
            return;
        }
        android.app.Dialog dialog4 = getDialog();
        if (dialog4 != null && (window = dialog4.getWindow()) != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams == null) {
            return;
        }
        layoutParams.windowAnimations = com.zettle.sdk.common.ui.R.style.DialogComponent_Otto_Slide_Bottom_Animation;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        final android.os.Bundle bundleOf;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.common.ui.R.id.dc_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighSpeedVideoFpsRanges = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.common.ui.R.id.dc_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.getOutputMinFrameDuration = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.zettle.sdk.common.ui.R.id.dc_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.getHighSpeedVideoFpsRangesFor = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.zettle.sdk.common.ui.R.id.dc_primary_btn);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.Button) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.zettle.sdk.common.ui.R.id.dc_secondary_btn);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.getHighSpeedVideoSizes = (android.widget.Button) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.zettle.sdk.common.ui.R.id.dc_cta_container);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.Camera2StreamConfigurationMap = (androidx.constraintlayout.widget.ConstraintLayout) findViewById6;
        android.os.Bundle arguments = getArguments();
        android.widget.Button button = null;
        if (arguments != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(arguments.getInt("PARAM_ICON"));
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                android.widget.ImageView imageView = this.getHighSpeedVideoFpsRanges;
                if (imageView == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    imageView = null;
                }
                imageView.setImageDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(requireContext(), intValue));
                android.widget.ImageView imageView2 = this.getHighSpeedVideoFpsRanges;
                if (imageView2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    imageView2 = null;
                }
                com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(imageView2, true);
            }
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(arguments2.getInt("PARAM_ICON_TINT"));
            if (valueOf2.intValue() == 0) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                int intValue2 = valueOf2.intValue();
                android.widget.ImageView imageView3 = this.getHighSpeedVideoFpsRanges;
                if (imageView3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    imageView3 = null;
                }
                androidx.core.widget.ImageViewCompat.setImageTintList(imageView3, android.content.res.ColorStateList.valueOf(intValue2));
            }
        }
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (string5 = arguments3.getString("PARAM_ICON_CONTENT_DESCRIPTION")) != null) {
            android.widget.ImageView imageView4 = this.getHighSpeedVideoFpsRanges;
            if (imageView4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                imageView4 = null;
            }
            imageView4.setContentDescription(string5);
        }
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 != null && (string4 = arguments4.getString("PARAM_TITLE_TEXT")) != null) {
            android.widget.TextView textView = this.getOutputMinFrameDuration;
            if (textView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textView = null;
            }
            textView.setText(string4);
            android.widget.TextView textView2 = this.getOutputMinFrameDuration;
            if (textView2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textView2 = null;
            }
            com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(textView2, true);
        }
        android.os.Bundle arguments5 = getArguments();
        if (arguments5 != null && (string3 = arguments5.getString("PARAM_MESSAGE_TEXT")) != null) {
            android.widget.TextView textView3 = this.getHighSpeedVideoFpsRangesFor;
            if (textView3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textView3 = null;
            }
            textView3.setText(string3);
            android.widget.TextView textView4 = this.getHighSpeedVideoFpsRangesFor;
            if (textView4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textView4 = null;
            }
            com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(textView4, true);
        }
        android.os.Bundle arguments6 = getArguments();
        if (arguments6 != null && (string2 = arguments6.getString("PARAM_PRIMARY_BTN_TEXT")) != null) {
            android.widget.Button button2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (button2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                button2 = null;
            }
            button2.setText(string2);
            android.widget.Button button3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (button3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                button3 = null;
            }
            com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(button3, true);
        }
        android.os.Bundle arguments7 = getArguments();
        java.lang.Integer valueOf3 = arguments7 != null ? java.lang.Integer.valueOf(arguments7.getInt("PARAM_PRIMARY_BTN_ICON_START")) : null;
        android.os.Bundle arguments8 = getArguments();
        java.lang.Integer valueOf4 = arguments8 != null ? java.lang.Integer.valueOf(arguments8.getInt("PARAM_PRIMARY_BTN_ICON_END")) : null;
        if (valueOf3 != null) {
            int intValue3 = valueOf3.intValue();
            if (valueOf4 != null) {
                int intValue4 = valueOf4.intValue();
                android.widget.Button button4 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (button4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    button4 = null;
                }
                button4.setCompoundDrawablesRelativeWithIntrinsicBounds(intValue3, 0, intValue4, 0);
            }
        }
        android.os.Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            java.lang.Boolean valueOf5 = java.lang.Boolean.valueOf(arguments9.getBoolean("PARAM_PRIMARY_BTN_IS_DESTRUCTIVE"));
            if (!valueOf5.booleanValue()) {
                valueOf5 = null;
            }
            if (valueOf5 != null) {
                android.widget.Button button5 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (button5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    button5 = null;
                }
                button5.setBackgroundResource(com.zettle.sdk.common.ui.R.drawable.button_destructive_selector);
                android.widget.Button button6 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (button6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    button6 = null;
                }
                button6.setTextColor(androidx.core.content.res.ResourcesCompat.getColorStateList(getResources(), com.zettle.sdk.common.ui.R.color.text_destructive_selector, null));
            }
        }
        android.os.Bundle arguments10 = getArguments();
        if (arguments10 != null && (string = arguments10.getString("PARAM_SECONDARY_BTN_TEXT")) != null) {
            android.widget.Button button7 = this.getHighSpeedVideoSizes;
            if (button7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                button7 = null;
            }
            button7.setText(string);
            android.widget.Button button8 = this.getHighSpeedVideoSizes;
            if (button8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                button8 = null;
            }
            com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(button8, true);
        }
        android.os.Bundle arguments11 = getArguments();
        java.lang.Integer valueOf6 = arguments11 != null ? java.lang.Integer.valueOf(arguments11.getInt("PARAM_SECONDARY_BTN_ICON_START")) : null;
        android.os.Bundle arguments12 = getArguments();
        java.lang.Integer valueOf7 = arguments12 != null ? java.lang.Integer.valueOf(arguments12.getInt("PARAM_SECONDARY_BTN_ICON_END")) : null;
        if (valueOf6 != null) {
            int intValue5 = valueOf6.intValue();
            if (valueOf7 != null) {
                int intValue6 = valueOf7.intValue();
                android.widget.Button button9 = this.getHighSpeedVideoSizes;
                if (button9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    button9 = null;
                }
                button9.setCompoundDrawablesRelativeWithIntrinsicBounds(intValue5, 0, intValue6, 0);
            }
        }
        android.os.Bundle arguments13 = getArguments();
        final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners dialogComponentClickListeners = arguments13 != null ? (com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners) arguments13.getParcelable("PARAM_CTA_BUTTONS_LISTENER") : null;
        android.os.Bundle arguments14 = getArguments();
        java.lang.String string6 = arguments14 != null ? arguments14.getString("PARAM_DIALOG_FRAGMENT_REQUEST_KEY", "REQUEST_KEY_DIALOG_COMPONENT") : null;
        final java.lang.String str = string6 != null ? string6 : "REQUEST_KEY_DIALOG_COMPONENT";
        android.os.Bundle arguments15 = getArguments();
        if (arguments15 == null || (bundleOf = arguments15.getBundle("PARAM_DIALOG_FRAGMENT_RESULT_BUNDLE")) == null) {
            bundleOf = androidx.core.os.BundleKt.bundleOf(new kotlin.Pair[0]);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bundleOf, "");
        android.widget.Button button10 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (button10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            button10 = null;
        }
        button10.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.common.ui.components.modal.OttoDialogComponent$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.$r8$lambda$2hnQTJBUtYaUgS4hTPijT2E3pBE(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.this, str, dialogComponentClickListeners, bundleOf, view2);
            }
        });
        android.widget.Button button11 = this.getHighSpeedVideoSizes;
        if (button11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            button = button11;
        }
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.common.ui.components.modal.OttoDialogComponent$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.$r8$lambda$pniBj0xL_viGo3TEBfGISbsSo0o(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.this, str, dialogComponentClickListeners, bundleOf, view2);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b4\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001e\u0010\u0014J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b!\u0010\u001cJ\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010#\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b#\u0010\u0014J\u001f\u0010'\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010(J!\u0010'\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010*J\u001d\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0019¢\u0006\u0004\b0\u0010\u001cJ\u0017\u00100\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b0\u0010\u0014J\u001d\u00102\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0019¢\u0006\u0004\b2\u0010.J\u0015\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0019¢\u0006\u0004\b4\u0010\u001cJ\u0017\u00104\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b4\u0010\u0014R\u0018\u00106\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u00108\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010;\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010C\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010DR\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010@\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010<R\u0016\u0010G\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010?R\u0016\u0010H\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010?R\u0018\u0010F\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010<R\u0016\u0010I\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010?R\u0016\u0010J\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010?R\u0018\u0010L\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010<R\u0018\u0010M\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010<"}, d2 = {"Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent;", "build", "()Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent;", "", "isCancellable", "setCancelable", "(Z)Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Builder;", "Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$DialogComponentClickListeners;", "clickListener", "setDialogComponentClickListeners", "(Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$DialogComponentClickListeners;)Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Builder;", "", "dialogFragmentRequestKey", "setDialogFragmentRequestKey", "(Ljava/lang/String;)Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Builder;", "Landroid/os/Bundle;", "bundle", "setDialogFragmentResultBundle", "(Landroid/os/Bundle;)Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Builder;", "", "icon", "setIcon", "(I)Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Builder;", "textResId", "setIconContentDescriptionText", "text", "iconTint", "setIconTint", "messageTextResId", "setMessageText", com.adobe.marketing.mobile.services.ui.alert.views.AlertTestTags.MESSAGE_TEXT, "primaryBtnTextResId", "isDestructive", "setPrimaryBtn", "(IZ)Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Builder;", "primaryBtnText", "(Ljava/lang/String;Z)Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Builder;", "iconStart", "iconEnd", "setPrimaryBtnIcons", "(II)Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$Builder;", "secondaryBtnTextResId", "setSecondaryBtn", "secondaryBtnText", "setSecondaryBtnIcons", "titleTextResId", "setTitleText", com.adobe.marketing.mobile.services.ui.alert.views.AlertTestTags.TITLE_TEXT, "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$DialogComponentClickListeners;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroid/os/Bundle;", com.visa.cbp.getEncExpo.warmup, "getInputFormats", "getHighSpeedVideoSizesFor", "getOutputFormats", "getInputSizeshNQ4ISI", "Z", "getOutputMinFrameDuration", "getOutputSizes", "getOutputMinFrameDurationlomOqCM", "getOutputStallDurationlomOqCM", "getOutputSizeshNQ4ISI", "getOutputStallDuration", "toString", "isOutputSupportedForhNQ4ISI", "isOutputSupportedFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final android.content.Context getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private android.os.Bundle Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private boolean getOutputFormats;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoSizesFor;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.lang.String getInputFormats;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private int getInputSizeshNQ4ISI;
        private boolean getOutputMinFrameDuration;

        /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
        private int getOutputStallDurationlomOqCM;

        /* renamed from: getOutputSizes, reason: from kotlin metadata */
        private int getOutputMinFrameDurationlomOqCM;

        /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.lang.String getOutputSizes;
        private int getOutputStallDuration;

        /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
        private int getOutputSizeshNQ4ISI;

        /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
        private java.lang.String isOutputSupportedFor;

        /* renamed from: toString, reason: from kotlin metadata */
        private java.lang.String isOutputSupportedForhNQ4ISI;

        public Builder(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            this.getHighSpeedVideoSizes = context;
            this.getOutputFormats = true;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setIcon(int icon) {
            this.getHighResolutionOutputSizeshNQ4ISI = icon;
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setIconTint(int iconTint) {
            this.getInputSizeshNQ4ISI = iconTint;
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setIconContentDescriptionText(java.lang.String text) {
            this.getHighSpeedVideoSizesFor = text;
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setIconContentDescriptionText(int textResId) {
            this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizes.getString(textResId);
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setTitleText(java.lang.String titleText) {
            this.isOutputSupportedFor = titleText;
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setTitleText(int titleTextResId) {
            this.isOutputSupportedFor = this.getHighSpeedVideoSizes.getString(titleTextResId);
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setMessageText(java.lang.String messageText) {
            this.getInputFormats = messageText;
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setMessageText(int messageTextResId) {
            this.getInputFormats = this.getHighSpeedVideoSizes.getString(messageTextResId);
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setSecondaryBtn(java.lang.String secondaryBtnText) {
            this.isOutputSupportedForhNQ4ISI = secondaryBtnText;
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setSecondaryBtn(int secondaryBtnTextResId) {
            setSecondaryBtn(this.getHighSpeedVideoSizes.getString(secondaryBtnTextResId));
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setSecondaryBtnIcons(int iconStart, int iconEnd) {
            this.getOutputStallDuration = iconStart;
            this.getOutputSizeshNQ4ISI = iconEnd;
            return this;
        }

        public static /* synthetic */ com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setPrimaryBtn$default(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder builder, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return builder.setPrimaryBtn(str, z);
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setPrimaryBtn(java.lang.String primaryBtnText, boolean isDestructive) {
            this.getOutputSizes = primaryBtnText;
            this.getOutputMinFrameDuration = isDestructive;
            return this;
        }

        public static /* synthetic */ com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setPrimaryBtn$default(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder builder, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return builder.setPrimaryBtn(i, z);
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setPrimaryBtn(int primaryBtnTextResId, boolean isDestructive) {
            setPrimaryBtn(this.getHighSpeedVideoSizes.getString(primaryBtnTextResId), isDestructive);
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setPrimaryBtnIcons(int iconStart, int iconEnd) {
            this.getOutputStallDurationlomOqCM = iconStart;
            this.getOutputMinFrameDurationlomOqCM = iconEnd;
            return this;
        }

        public static /* synthetic */ com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setDialogComponentClickListeners$default(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder builder, com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners dialogComponentClickListeners, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dialogComponentClickListeners = null;
            }
            return builder.setDialogComponentClickListeners(dialogComponentClickListeners);
        }

        @kotlin.Deprecated(message = "Get results using the Fragment Result API")
        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setDialogComponentClickListeners(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners clickListener) {
            this.getHighSpeedVideoFpsRanges = clickListener;
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setDialogFragmentRequestKey(java.lang.String dialogFragmentRequestKey) {
            this.getHighSpeedVideoFpsRangesFor = dialogFragmentRequestKey;
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setDialogFragmentResultBundle(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            this.Camera2StreamConfigurationMap = bundle;
            return this;
        }

        public static /* synthetic */ com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setCancelable$default(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder builder, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return builder.setCancelable(z);
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Builder setCancelable(boolean isCancellable) {
            this.getOutputFormats = isCancellable;
            return this;
        }

        public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent build() {
            com.zettle.sdk.common.ui.components.modal.OttoDialogComponent access$newInstance = com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.Companion.access$newInstance(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.INSTANCE, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.isOutputSupportedFor, this.getInputFormats, this.isOutputSupportedForhNQ4ISI, this.getOutputStallDuration, this.getOutputSizeshNQ4ISI, this.getOutputSizes, this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDurationlomOqCM, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
            access$newInstance.setCancelable(this.getOutputFormats);
            return access$newInstance;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$IDialogComponentClickListeners;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent;", androidx.view.compose.DialogNavigator.NAME, "", "onPrimaryCTAClicked", "(Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent;)V", "onSecondaryCTAClicked", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.Deprecated(message = "Get results using the Fragment Result API")
    public interface IDialogComponentClickListeners extends android.os.Parcelable {
        @Override // android.os.Parcelable
        int describeContents();

        void onPrimaryCTAClicked(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent dialog);

        void onSecondaryCTAClicked(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent dialog);

        @Override // android.os.Parcelable
        void writeToParcel(android.os.Parcel dest, int flags);

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            public static int describeContents(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners iDialogComponentClickListeners) {
                return 0;
            }

            public static void onPrimaryCTAClicked(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners iDialogComponentClickListeners, com.zettle.sdk.common.ui.components.modal.OttoDialogComponent ottoDialogComponent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoDialogComponent, "");
                ottoDialogComponent.dismiss();
            }

            public static void onSecondaryCTAClicked(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners iDialogComponentClickListeners, com.zettle.sdk.common.ui.components.modal.OttoDialogComponent ottoDialogComponent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoDialogComponent, "");
                ottoDialogComponent.dismiss();
            }

            public static void writeToParcel(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners iDialogComponentClickListeners, android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0007¢\u0006\u0004\b\u0004\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$DialogComponentClickListeners;", "Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$IDialogComponentClickListeners;", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "()V", "CREATOR"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.Deprecated(message = "Get results using the Fragment Result API")
    public static class DialogComponentClickListeners implements com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners.Companion INSTANCE = new com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners.Companion(null);

        public DialogComponentClickListeners() {
        }

        @Override // com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners, android.os.Parcelable
        public int describeContents() {
            return com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners.DefaultImpls.describeContents(this);
        }

        @Override // com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners
        public void onPrimaryCTAClicked(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent ottoDialogComponent) {
            com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners.DefaultImpls.onPrimaryCTAClicked(this, ottoDialogComponent);
        }

        @Override // com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners
        public void onSecondaryCTAClicked(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent ottoDialogComponent) {
            com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners.DefaultImpls.onSecondaryCTAClicked(this, ottoDialogComponent);
        }

        @Override // com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.IDialogComponentClickListeners.DefaultImpls.writeToParcel(this, parcel, i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DialogComponentClickListeners(android.os.Parcel parcel) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$DialogComponentClickListeners$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$DialogComponentClickListeners;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$DialogComponentClickListeners;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "newArray", "(I)[Lcom/zettle/sdk/common/ui/components/modal/OttoDialogComponent$DialogComponentClickListeners;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.zettle.sdk.common.ui.components.modal.OttoDialogComponent$DialogComponentClickListeners$CREATOR, reason: from kotlin metadata */
        public static final class Companion implements android.os.Parcelable.Creator<com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners> {
            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners[] newArray(int size) {
                return new com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners[size];
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$2hnQTJBUtYaUgS4hTPijT2E3pBE(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent ottoDialogComponent, java.lang.String str, com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners dialogComponentClickListeners, android.os.Bundle bundle, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoDialogComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf(kotlin.TuplesKt.to("BUNDLE_KEY_CTA_CLICKED", "BUNDLE_KEY_RESULT_PRIMARY_CTA_CLICKED"));
        bundleOf.putAll(bundle);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        androidx.fragment.app.FragmentKt.setFragmentResult(ottoDialogComponent, str, bundleOf);
        if (dialogComponentClickListeners != null) {
            dialogComponentClickListeners.onPrimaryCTAClicked(ottoDialogComponent);
        } else {
            ottoDialogComponent.dismiss();
        }
    }

    public static /* synthetic */ void $r8$lambda$iatkcjZIQmPQVZ7lTqX3JaHmBiM(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent ottoDialogComponent, android.content.DialogInterface dialogInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoDialogComponent, "");
        android.widget.Button button = ottoDialogComponent.getHighResolutionOutputSizeshNQ4ISI;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = null;
        if (button == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            button = null;
        }
        if (button.getLineCount() <= 1) {
            android.widget.Button button2 = ottoDialogComponent.getHighSpeedVideoSizes;
            if (button2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                button2 = null;
            }
            if (button2.getLineCount() <= 1) {
                return;
            }
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = ottoDialogComponent.Camera2StreamConfigurationMap;
        if (constraintLayout2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            constraintLayout2 = null;
        }
        constraintSet.clone(constraintLayout2);
        constraintSet.connect(com.zettle.sdk.common.ui.R.id.dc_primary_btn, 3, 0, 3);
        constraintSet.connect(com.zettle.sdk.common.ui.R.id.dc_primary_btn, 6, 0, 6, ottoDialogComponent.getResources().getDimensionPixelOffset(com.zettle.sdk.common.ui.R.dimen.grid_2x));
        constraintSet.connect(com.zettle.sdk.common.ui.R.id.dc_primary_btn, 7, 0, 7);
        android.widget.Button button3 = ottoDialogComponent.getHighSpeedVideoSizes;
        if (button3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            button3 = null;
        }
        constraintSet.connect(com.zettle.sdk.common.ui.R.id.dc_primary_btn, 4, com.zettle.sdk.common.ui.R.id.dc_secondary_btn, 3, button3.getVisibility() == 0 ? 0 : ottoDialogComponent.getResources().getDimensionPixelOffset(com.zettle.sdk.common.ui.R.dimen.grid_2x));
        android.widget.Button button4 = ottoDialogComponent.getHighSpeedVideoSizes;
        if (button4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            button4 = null;
        }
        constraintSet.connect(com.zettle.sdk.common.ui.R.id.dc_secondary_btn, 3, com.zettle.sdk.common.ui.R.id.dc_primary_btn, 4, button4.getVisibility() == 0 ? ottoDialogComponent.getResources().getDimensionPixelOffset(com.zettle.sdk.common.ui.R.dimen.grid_1x) : 0);
        constraintSet.connect(com.zettle.sdk.common.ui.R.id.dc_secondary_btn, 6, 0, 6);
        constraintSet.connect(com.zettle.sdk.common.ui.R.id.dc_secondary_btn, 7, 0, 7, ottoDialogComponent.getResources().getDimensionPixelOffset(com.zettle.sdk.common.ui.R.dimen.grid_2x));
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = ottoDialogComponent.Camera2StreamConfigurationMap;
        if (constraintLayout3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            constraintLayout = constraintLayout3;
        }
        constraintSet.applyTo(constraintLayout);
    }

    public static /* synthetic */ void $r8$lambda$pniBj0xL_viGo3TEBfGISbsSo0o(com.zettle.sdk.common.ui.components.modal.OttoDialogComponent ottoDialogComponent, java.lang.String str, com.zettle.sdk.common.ui.components.modal.OttoDialogComponent.DialogComponentClickListeners dialogComponentClickListeners, android.os.Bundle bundle, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoDialogComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf(kotlin.TuplesKt.to("BUNDLE_KEY_CTA_CLICKED", "BUNDLE_KEY_RESULT_SECONDARY_CTA_CLICKED"));
        bundleOf.putAll(bundle);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        androidx.fragment.app.FragmentKt.setFragmentResult(ottoDialogComponent, str, bundleOf);
        if (dialogComponentClickListeners != null) {
            dialogComponentClickListeners.onSecondaryCTAClicked(ottoDialogComponent);
        } else {
            ottoDialogComponent.dismiss();
        }
    }
}
