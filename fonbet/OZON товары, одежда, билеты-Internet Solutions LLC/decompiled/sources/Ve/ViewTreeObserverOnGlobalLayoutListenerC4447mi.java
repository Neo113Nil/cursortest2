package Ve;

import android.view.ViewTreeObserver;
import spay.sdk.view.SpayDotsLoaderView;

/* renamed from: Ve.mi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4447mi implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SpayDotsLoaderView f31592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpayDotsLoaderView f31593b;

    public ViewTreeObserverOnGlobalLayoutListenerC4447mi(SpayDotsLoaderView spayDotsLoaderView, SpayDotsLoaderView spayDotsLoaderView2) {
        this.f31592a = spayDotsLoaderView;
        this.f31593b = spayDotsLoaderView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i11 = SpayDotsLoaderView.f98884m;
        this.f31592a.b();
        this.f31593b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
