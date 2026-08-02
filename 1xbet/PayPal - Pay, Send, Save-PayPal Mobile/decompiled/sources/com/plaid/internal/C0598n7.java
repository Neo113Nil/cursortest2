package com.plaid.internal;

/* renamed from: com.plaid.internal.n7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0598n7 {
    public static final void a(com.plaid.internal.link.LinkActivity linkActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkActivity, "");
        linkActivity.getWindow().addFlags(Integer.MIN_VALUE);
        linkActivity.getWindow().setStatusBarColor(androidx.core.content.ContextCompat.getColor(linkActivity, com.plaid.link.R.color.plaid_full_black_opacity_25));
    }

    public static final void a(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "");
        fragmentActivity.getWindow().addFlags(Integer.MIN_VALUE);
        fragmentActivity.getWindow().setStatusBarColor(-1);
        fragmentActivity.getWindow().getDecorView().setSystemUiVisibility(8192);
    }
}
