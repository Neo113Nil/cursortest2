package com.plaid.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/plaid/internal/U0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class U0 extends androidx.fragment.app.Fragment {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0596n5 f5931a;
    public com.plaid.internal.V0 b;

    public static final class a {
        public static com.plaid.internal.U0 a(com.plaid.internal.N2.i iVar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "");
            com.plaid.internal.U0 u0 = new com.plaid.internal.U0();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("error_state", iVar);
            u0.setArguments(bundle);
            return u0;
        }
    }

    public static final class b implements androidx.lifecycle.ViewModelProvider.Factory {
        public b() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            android.content.res.Resources resources = com.plaid.internal.U0.this.getResources();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
            return new com.plaid.internal.V0(resources);
        }
    }

    public static final androidx.core.view.WindowInsetsCompat a(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return androidx.core.view.WindowInsetsCompat.CONSUMED;
    }

    public static final void b(com.plaid.internal.U0 u0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0, "");
        u0.requireActivity().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.b = (com.plaid.internal.V0) new androidx.view.ViewModelProvider(this, new com.plaid.internal.U0.b()).get(com.plaid.internal.V0.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View inflate = layoutInflater.inflate(com.plaid.link.R.layout.plaid_error_fragment, viewGroup, false);
        int i = com.plaid.link.R.id.error_content;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
        if (textView != null) {
            i = com.plaid.link.R.id.error_header;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
            if (textView2 != null) {
                i = com.plaid.link.R.id.error_image;
                if (((android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i)) != null) {
                    i = com.plaid.link.R.id.exit_button;
                    androidx.appcompat.widget.AppCompatButton appCompatButton = (androidx.appcompat.widget.AppCompatButton) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i);
                    if (appCompatButton != null) {
                        i = com.plaid.link.R.id.plaid_close_icon;
                        if (((android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i)) != null) {
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                            int i2 = com.plaid.link.R.id.plaid_navigation;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(inflate, i2);
                            if (linearLayout2 != null) {
                                com.plaid.internal.C0596n5 c0596n5 = new com.plaid.internal.C0596n5(linearLayout, textView, textView2, appCompatButton, linearLayout, linearLayout2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c0596n5, "");
                                this.f5931a = c0596n5;
                                androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(linearLayout, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.plaid.internal.U0$$ExternalSyntheticLambda2
                                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                                    public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                                        return com.plaid.internal.U0.a(view, windowInsetsCompat);
                                    }
                                });
                                com.plaid.internal.C0596n5 c0596n52 = this.f5931a;
                                if (c0596n52 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                                    c0596n52 = null;
                                }
                                android.widget.LinearLayout linearLayout3 = c0596n52.f6508a;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                                return linearLayout3;
                            }
                            i = i2;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        com.plaid.internal.N2.i iVar;
        com.plaid.internal.V0.a aVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        com.plaid.internal.C0596n5 c0596n5 = this.f5931a;
        com.plaid.internal.C0596n5 c0596n52 = null;
        if (c0596n5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            c0596n5 = null;
        }
        c0596n5.e.findViewById(com.plaid.link.R.id.plaid_close_icon).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.plaid.internal.U0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.plaid.internal.U0.a(com.plaid.internal.U0.this, view2);
            }
        });
        com.plaid.internal.C0596n5 c0596n53 = this.f5931a;
        if (c0596n53 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            c0596n53 = null;
        }
        c0596n53.d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.plaid.internal.U0$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.plaid.internal.U0.b(com.plaid.internal.U0.this, view2);
            }
        });
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (iVar = (com.plaid.internal.N2.i) arguments.getParcelable("error_state")) == null) {
            com.plaid.internal.r8.c cVar = com.plaid.internal.r8.CREATOR;
            iVar = new com.plaid.internal.N2.i("", com.plaid.internal.r8.e, "", "", "", kotlin.collections.CollectionsKt.emptyList(), "", com.plaid.internal.H3.UNKNOWN_ERROR);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(iVar);
        com.plaid.internal.V0 v0 = this.b;
        if (v0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            v0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "");
        int i = com.plaid.internal.V0.b.f5948a[iVar.i.ordinal()];
        if (i == 1) {
            java.lang.String string = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_no_network_connection_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_no_network_connection_content);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            java.lang.String string3 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_no_network_connection_exit);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            aVar = new com.plaid.internal.V0.a(string, string2, string3);
        } else if (i == 2) {
            java.lang.String string4 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_session_expired_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
            java.lang.String string5 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_session_expired_content);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
            java.lang.String string6 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_session_expired_exit);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
            aVar = new com.plaid.internal.V0.a(string4, string5, string6);
        } else if (i == 3) {
            java.lang.String string7 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_initialization_header);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "");
            java.lang.String string8 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_initialization_content);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "");
            java.lang.String string9 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_initialization_button_text);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "");
            aVar = new com.plaid.internal.V0.a(string7, string8, string9);
        } else if (i == 4) {
            java.lang.String string10 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_internal_server_error_something_went_wrong);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "");
            java.lang.String string11 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_internal_server_error_try_again_later);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "");
            java.lang.String string12 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_internal_error_exit);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "");
            aVar = new com.plaid.internal.V0.a(string10, string11, string12);
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String string13 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_fallback_header);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "");
            java.lang.String string14 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_fallback_content);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string14, "");
            java.lang.String string15 = v0.f5946a.getString(com.plaid.link.R.string.plaid_error_fallback_button_text);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string15, "");
            aVar = new com.plaid.internal.V0.a(string13, string14, string15);
        }
        com.plaid.internal.C0596n5 c0596n54 = this.f5931a;
        if (c0596n54 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            c0596n54 = null;
        }
        c0596n54.c.setText(aVar.f5947a);
        com.plaid.internal.C0596n5 c0596n55 = this.f5931a;
        if (c0596n55 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            c0596n55 = null;
        }
        c0596n55.b.setText(aVar.b);
        com.plaid.internal.C0596n5 c0596n56 = this.f5931a;
        if (c0596n56 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            c0596n52 = c0596n56;
        }
        c0596n52.d.setText(aVar.c);
    }

    public static final void a(com.plaid.internal.U0 u0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0, "");
        u0.requireActivity().onBackPressed();
    }
}
