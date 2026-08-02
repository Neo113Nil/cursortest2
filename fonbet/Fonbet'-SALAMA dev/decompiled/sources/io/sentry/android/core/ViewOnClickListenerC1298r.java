package io.sentry.android.core;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: io.sentry.android.core.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1298r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f14414b;

    public /* synthetic */ ViewOnClickListenerC1298r(KeyEvent.Callback callback, int i7) {
        this.f14413a = i7;
        this.f14414b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14413a) {
            case 0:
                ((SentryUserFeedbackButton) this.f14414b).lambda$setOnClickListener$0(view);
                break;
            default:
                ((SentryUserFeedbackDialog) this.f14414b).lambda$onCreate$1(view);
                break;
        }
    }
}
