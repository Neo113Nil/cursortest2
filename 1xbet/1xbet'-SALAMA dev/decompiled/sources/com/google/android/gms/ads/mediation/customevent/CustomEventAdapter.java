package com.google.android.gms.ads.mediation.customevent;

import B4.V;
import J2.j;
import L2.d;
import L2.i;
import L2.m;
import L2.o;
import L2.s;
import M4.e;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import io.sentry.SentryLockReason;
import p036e6.c;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1057a f10850d = new C1057a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CustomEventBanner f10851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CustomEventInterstitial f10852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CustomEventNative f10853c;

    public static Object a(Class cls, String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            }
            throw null;
        } catch (Throwable th) {
            j.g("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, L2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f10851a;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f10852b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f10853c;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, L2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f10851a;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f10852b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f10853c;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, L2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f10851a;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f10852b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f10853c;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, i iVar, Bundle bundle, p167y2.j jVar, d dVar, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(CustomEventBanner.class, bundle.getString(SentryLockReason.JsonKeys.CLASS_NAME));
        this.f10851a = customEventBanner;
        if (customEventBanner == null) {
            iVar.onAdFailedToLoad(this, f10850d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString(SentryLockReason.JsonKeys.CLASS_NAME));
        CustomEventBanner customEventBanner2 = this.f10851a;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new V(7), bundle.getString("parameter"), jVar, dVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, m mVar, Bundle bundle, d dVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(CustomEventInterstitial.class, bundle.getString(SentryLockReason.JsonKeys.CLASS_NAME));
        this.f10852b = customEventInterstitial;
        if (customEventInterstitial == null) {
            mVar.onAdFailedToLoad(this, f10850d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString(SentryLockReason.JsonKeys.CLASS_NAME));
        CustomEventInterstitial customEventInterstitial2 = this.f10852b;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new e(), bundle.getString("parameter"), dVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, o oVar, Bundle bundle, s sVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) a(CustomEventNative.class, bundle.getString(SentryLockReason.JsonKeys.CLASS_NAME));
        this.f10853c = customEventNative;
        if (customEventNative == null) {
            oVar.onAdFailedToLoad(this, f10850d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString(SentryLockReason.JsonKeys.CLASS_NAME));
        CustomEventNative customEventNative2 = this.f10853c;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new c(7), bundle.getString("parameter"), sVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f10852b;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
