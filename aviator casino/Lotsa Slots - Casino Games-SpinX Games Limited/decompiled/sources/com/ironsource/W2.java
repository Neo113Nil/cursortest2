package com.ironsource;

/* loaded from: classes5.dex */
public final class W2 extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3389yg f6037a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f6037a = new com.ironsource.W2.a();
    }

    public final com.ironsource.InterfaceC3389yg getViewBinder() {
        return this.f6037a;
    }

    public static final class a implements com.ironsource.InterfaceC3389yg {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(com.ironsource.V0 adTools, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(true, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final com.ironsource.V0 adTools, final long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.d(new java.lang.Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.W2.a.d(com.ironsource.V0.this, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(com.ironsource.V0 adTools, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(j);
        }

        @Override // com.ironsource.InterfaceC3389yg
        public void a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams, final com.ironsource.V0 adTools) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            final android.view.View childAt = com.ironsource.W2.this.getChildAt(0);
            final long f = com.ironsource.Jb.u.d().h().f();
            if (f <= 0) {
                com.ironsource.W2.this.removeView(childAt);
                com.ironsource.W2.this.addView(view, layoutParams);
                adTools.d(new java.lang.Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.W2.a.a(com.ironsource.V0.this, f);
                    }
                });
                return;
            }
            adTools.d(new java.lang.Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.W2.a.b(com.ironsource.V0.this, f);
                }
            });
            view.setAlpha(0.0f);
            com.ironsource.W2.this.addView(view, layoutParams);
            if (childAt != null) {
                final com.ironsource.W2 w2 = com.ironsource.W2.this;
                childAt.animate().alpha(0.0f).setDuration(f).withStartAction(new java.lang.Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.W2.a.a(childAt);
                    }
                }).withEndAction(new java.lang.Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.W2.a.a(com.ironsource.W2.this, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(f).withEndAction(new java.lang.Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.W2.a.c(com.ironsource.V0.this, f);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.V0 adTools, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(false, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(android.view.View this_apply) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.W2 this$0, android.view.View view, android.view.View this_apply) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }
}
