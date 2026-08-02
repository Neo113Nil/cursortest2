package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0688a;
import com.facebook.internal.DialogC0714j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/g;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Companion", "a", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.facebook.internal.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0711g extends DialogFragment {
    public Dialog a;

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.a instanceof J) && isResumed()) {
            Dialog dialog = this.a;
            Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((J) dialog).d();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity context;
        String url;
        J j;
        super.onCreate(bundle);
        if (this.a == null && (context = getActivity()) != null) {
            Intent intent = context.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Bundle i = w.i(intent);
            if (i != null ? i.getBoolean("is_fallback", false) : false) {
                url = i != null ? i.getString("url") : null;
                if (E.z(url)) {
                    com.facebook.w wVar = com.facebook.w.a;
                    context.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String expectedRedirectUrl = androidx.credentials.provider.p.a(new Object[]{com.facebook.w.b()}, 1, "fb%s://bridge/", "format(format, *args)");
                DialogC0714j.a aVar = DialogC0714j.Companion;
                Intrinsics.checkNotNull(url, "null cannot be cast to non-null type kotlin.String");
                aVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
                J.b(context);
                DialogC0714j dialogC0714j = new DialogC0714j(context, url);
                Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
                dialogC0714j.b = expectedRedirectUrl;
                dialogC0714j.c = new C0710f(this, 0);
                j = dialogC0714j;
            } else {
                String action = i != null ? i.getString("action") : null;
                Bundle bundle2 = i != null ? i.getBundle("params") : null;
                if (E.z(action)) {
                    com.facebook.w wVar2 = com.facebook.w.a;
                    context.finish();
                    return;
                }
                Intrinsics.checkNotNull(action, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(action, "action");
                C0688a.Companion.getClass();
                C0688a b = C0688a.b.b();
                url = C0688a.b.c() ? null : E.p(context);
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                String str = url;
                androidx.credentials.playservices.controllers.GetRestoreCredential.h hVar = new androidx.credentials.playservices.controllers.GetRestoreCredential.h(this);
                if (b != null) {
                    bundle2.putString("app_id", b.j);
                    bundle2.putString("access_token", b.e);
                } else {
                    bundle2.putString("app_id", str);
                }
                J.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                J.b(context);
                j = new J(context, action, bundle2, com.facebook.login.A.FACEBOOK, hVar);
            }
            this.a = j;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type android.app.Dialog");
            return dialog;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
            activity.setResult(-1, w.f(intent, null, null));
            activity.finish();
        }
        setShowsDialog(false);
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.a;
        if (dialog instanceof J) {
            Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((J) dialog).d();
        }
    }
}
