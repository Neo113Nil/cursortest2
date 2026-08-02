package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0726Ye implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12349k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0805bf f12350l;

    public /* synthetic */ RunnableC0726Ye(ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf, int i) {
        this.f12349k = i;
        this.f12350l = viewTreeObserverOnGlobalLayoutListenerC0805bf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12349k) {
            case 0:
                this.f12350l.destroy();
                break;
            case 1:
                this.f12350l.l0();
                break;
            default:
                super/*android.webkit.WebView*/.destroy();
                break;
        }
    }
}
