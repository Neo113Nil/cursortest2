package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.U2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U2 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Bg f7930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7930a = new a();
    }

    public final Bg getViewBinder() {
        return this.f7930a;
    }

    public static final class a implements Bg {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(T0 adTools, long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.f().h().a(true, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final T0 adTools, final long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.a(new Runnable() { // from class: com.ironsource.U2$a$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    U2.a.d(T0.this, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(T0 adTools, long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.f().h().a(j);
        }

        @Override // com.ironsource.Bg
        public void a(View view, FrameLayout.LayoutParams layoutParams, final T0 adTools) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            final View childAt = U2.this.getChildAt(0);
            final long g = Ib.v.d().h().g();
            if (g <= 0) {
                U2.this.removeView(childAt);
                U2.this.addView(view, layoutParams);
                adTools.a(new Runnable() { // from class: com.ironsource.U2$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        U2.a.a(T0.this, g);
                    }
                });
                return;
            }
            adTools.a(new Runnable() { // from class: com.ironsource.U2$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    U2.a.b(T0.this, g);
                }
            });
            view.setAlpha(0.0f);
            U2.this.addView(view, layoutParams);
            if (childAt != null) {
                final U2 u2 = U2.this;
                childAt.animate().alpha(0.0f).setDuration(g).withStartAction(new Runnable() { // from class: com.ironsource.U2$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        U2.a.a(childAt);
                    }
                }).withEndAction(new Runnable() { // from class: com.ironsource.U2$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        U2.a.a(U2.this, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(g).withEndAction(new Runnable() { // from class: com.ironsource.U2$a$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    U2.a.c(T0.this, g);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(T0 adTools, long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.f().h().a(false, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View this_apply) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(U2 this$0, View view, View this_apply) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }
}
