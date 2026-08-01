package com.inmobi.media;

import com.squareup.picasso.Callback;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: com.inmobi.media.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4146v implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4200x f7424a;
    public final /* synthetic */ CancellableContinuationImpl b;

    public C4146v(C4200x c4200x, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f7424a = c4200x;
        this.b = cancellableContinuationImpl;
    }

    @Override // com.squareup.picasso.Callback
    public final void onError(Exception exc) {
        Z9 z9 = this.f7424a.d;
        if (z9 != null) {
            z9.a("AdChoiceViewManager", "onError Called " + exc);
        }
        AbstractC4012q5.a(this.b, Boolean.FALSE);
    }

    @Override // com.squareup.picasso.Callback
    public final void onSuccess() {
        Z9 z9 = this.f7424a.d;
        if (z9 != null) {
            z9.a("AdChoiceViewManager", "onSuccess Called");
        }
        AbstractC4012q5.a(this.b, Boolean.TRUE);
    }
}
