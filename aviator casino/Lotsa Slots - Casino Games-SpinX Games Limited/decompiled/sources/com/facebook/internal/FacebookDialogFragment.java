package com.facebook.internal;

/* compiled from: FacebookDialogFragment.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u001c\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/FacebookDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "innerDialog", "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "setInnerDialog", "(Landroid/app/Dialog;)V", "initDialog", "", "initDialog$facebook_common_release", "onCompleteWebDialog", "values", "Landroid/os/Bundle;", "error", "Lcom/facebook/FacebookException;", "onCompleteWebFallbackDialog", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "onCreateDialog", "onDestroyView", com.ironsource.X3.i.u0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookDialogFragment extends androidx.fragment.app.DialogFragment {
    public static final java.lang.String TAG = "FacebookDialogFragment";
    private android.app.Dialog innerDialog;

    public final android.app.Dialog getInnerDialog() {
        return this.innerDialog;
    }

    public final void setInnerDialog(android.app.Dialog dialog) {
        this.innerDialog = dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDialog$facebook_common_release();
    }

    public final void initDialog$facebook_common_release() {
        androidx.fragment.app.FragmentActivity activity;
        com.facebook.internal.FacebookWebFallbackDialog newInstance;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            android.content.Intent intent = activity.getIntent();
            com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "intent");
            android.os.Bundle methodArgumentsFromIntent = com.facebook.internal.NativeProtocol.getMethodArgumentsFromIntent(intent);
            if (!(methodArgumentsFromIntent == null ? false : methodArgumentsFromIntent.getBoolean(com.facebook.internal.NativeProtocol.WEB_DIALOG_IS_FALLBACK, false))) {
                java.lang.String string = methodArgumentsFromIntent == null ? null : methodArgumentsFromIntent.getString("action");
                android.os.Bundle bundle = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getBundle("params") : null;
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                if (com.facebook.internal.Utility.isNullOrEmpty(string)) {
                    com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.logd(TAG, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    androidx.fragment.app.FragmentActivity fragmentActivity = activity;
                    if (string == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    newInstance = new com.facebook.internal.WebDialog.Builder(fragmentActivity, string, bundle).setOnCompleteListener(new com.facebook.internal.WebDialog.OnCompleteListener() { // from class: com.facebook.internal.FacebookDialogFragment$$ExternalSyntheticLambda0
                        @Override // com.facebook.internal.WebDialog.OnCompleteListener
                        public final void onComplete(android.os.Bundle bundle2, com.facebook.FacebookException facebookException) {
                            com.facebook.internal.FacebookDialogFragment.m5173initDialog$lambda0(com.facebook.internal.FacebookDialogFragment.this, bundle2, facebookException);
                        }
                    }).build();
                }
            } else {
                java.lang.String string2 = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getString("url") : null;
                com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                if (com.facebook.internal.Utility.isNullOrEmpty(string2)) {
                    com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.logd(TAG, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                java.lang.String format = java.lang.String.format("fb%s://bridge/", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getApplicationId()}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                com.facebook.internal.FacebookWebFallbackDialog.Companion companion = com.facebook.internal.FacebookWebFallbackDialog.INSTANCE;
                androidx.fragment.app.FragmentActivity fragmentActivity2 = activity;
                if (string2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                newInstance = companion.newInstance(fragmentActivity2, string2, format);
                newInstance.setOnCompleteListener(new com.facebook.internal.WebDialog.OnCompleteListener() { // from class: com.facebook.internal.FacebookDialogFragment$$ExternalSyntheticLambda1
                    @Override // com.facebook.internal.WebDialog.OnCompleteListener
                    public final void onComplete(android.os.Bundle bundle2, com.facebook.FacebookException facebookException) {
                        com.facebook.internal.FacebookDialogFragment.m5174initDialog$lambda1(com.facebook.internal.FacebookDialogFragment.this, bundle2, facebookException);
                    }
                });
            }
            this.innerDialog = newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initDialog$lambda-0, reason: not valid java name */
    public static final void m5173initDialog$lambda0(com.facebook.internal.FacebookDialogFragment this$0, android.os.Bundle bundle, com.facebook.FacebookException facebookException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCompleteWebDialog(bundle, facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initDialog$lambda-1, reason: not valid java name */
    public static final void m5174initDialog$lambda1(com.facebook.internal.FacebookDialogFragment this$0, android.os.Bundle bundle, com.facebook.FacebookException facebookException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCompleteWebFallbackDialog(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
        android.app.Dialog dialog = this.innerDialog;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        onCompleteWebDialog(null, null);
        setShowsDialog(false);
        android.app.Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.app.Dialog dialog = this.innerDialog;
        if (dialog instanceof com.facebook.internal.WebDialog) {
            if (dialog == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((com.facebook.internal.WebDialog) dialog).resize();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.innerDialog instanceof com.facebook.internal.WebDialog) && isResumed()) {
            android.app.Dialog dialog = this.innerDialog;
            if (dialog == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((com.facebook.internal.WebDialog) dialog).resize();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.app.Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    private final void onCompleteWebDialog(android.os.Bundle values, com.facebook.FacebookException error) {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        android.content.Intent intent = activity.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        activity.setResult(error == null ? -1 : 0, com.facebook.internal.NativeProtocol.createProtocolResultIntent(intent, values, error));
        activity.finish();
    }

    private final void onCompleteWebFallbackDialog(android.os.Bundle values) {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        if (values == null) {
            values = new android.os.Bundle();
        }
        intent.putExtras(values);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
