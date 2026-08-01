package com.ironsource;

import com.ironsource.V7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes6.dex */
public class W7 extends V7.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7987a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f7987a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f7987a, "onRewardedVideoAdLoadSuccess()");
            this.b.onRewardedVideoAdLoadSuccess(this.f7987a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7988a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f7988a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f7988a, "onRewardedVideoAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdLoadFailed(this.f7988a, this.b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7989a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f7989a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f7989a, "onRewardedVideoAdOpened()");
            this.b.onRewardedVideoAdOpened(this.f7989a);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7990a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f7990a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f7990a, "onRewardedVideoAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdShowFailed(this.f7990a, this.b);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7991a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f7991a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f7991a, "onRewardedVideoAdClicked()");
            this.b.onRewardedVideoAdClicked(this.f7991a);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7992a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f7992a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f7992a, "onRewardedVideoAdRewarded()");
            this.b.onRewardedVideoAdRewarded(this.f7992a);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7993a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f7993a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f7993a, "onRewardedVideoAdClosed()");
            this.b.onRewardedVideoAdClosed(this.f7993a);
        }
    }

    W7(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new e(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new g(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new b(str, ironSourceError, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new a(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new c(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new f(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new d(str, ironSourceError, a2), a2 != null);
    }

    W7() {
    }
}
