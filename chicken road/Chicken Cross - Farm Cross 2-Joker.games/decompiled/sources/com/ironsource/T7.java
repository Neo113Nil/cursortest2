package com.ironsource;

import com.ironsource.V7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes6.dex */
public class T7 extends V7.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7906a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f7906a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.f7906a, "onInterstitialAdReady()");
            this.b.onInterstitialAdReady(this.f7906a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7907a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyInterstitialListener c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f7907a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.f7907a, "onInterstitialAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdLoadFailed(this.f7907a, this.b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7908a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f7908a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.f7908a, "onInterstitialAdOpened()");
            this.b.onInterstitialAdOpened(this.f7908a);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7909a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyInterstitialListener c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f7909a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.f7909a, "onInterstitialAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdShowFailed(this.f7909a, this.b);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7910a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f7910a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.f7910a, "onInterstitialAdClicked()");
            this.b.onInterstitialAdClicked(this.f7910a);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7911a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f7911a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.f7911a, "onInterstitialAdClosed()");
            this.b.onInterstitialAdClosed(this.f7911a);
        }
    }

    T7(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new e(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new f(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new b(str, ironSourceError, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new c(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new a(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new d(str, ironSourceError, a2), a2 != null);
    }

    T7() {
    }
}
