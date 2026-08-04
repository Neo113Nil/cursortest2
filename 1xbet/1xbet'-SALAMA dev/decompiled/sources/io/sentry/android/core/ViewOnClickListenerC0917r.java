package io.sentry.android.core;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: io.sentry.android.core.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0917r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f14420b;

    public /* synthetic */ ViewOnClickListenerC0917r(KeyEvent.Callback callback, int i7) {
        this.f14419a = i7;
        this.f14420b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14419a) {
            case 0:
                ((SentryUserFeedbackButton) this.f14420b).lambda$setOnClickListener$0(view);
                break;
            default:
                ((SentryUserFeedbackDialog) this.f14420b).lambda$onCreate$1(view);
                break;
        }
    }
}
