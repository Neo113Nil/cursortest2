package com.startapp.sdk.ads.nativead;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.a2;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.nd;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class StartAppNativeAd extends Ad {
    private boolean belowMinCpm;
    private List<NativeAdDetails> listNativeAds;
    private final AtomicBoolean loading;
    private NativeAdPreferences preferences;

    public enum CampaignAction {
        LAUNCH_APP,
        OPEN_MARKET
    }

    public StartAppNativeAd(Context context) {
        this(context, com.startapp.sdk.components.a.a(context).f3345K, com.startapp.sdk.components.a.a(context).f3362j, com.startapp.sdk.components.a.a(context).f3346M, com.startapp.sdk.components.a.a(context).f3347N, com.startapp.sdk.components.a.a(context).f3355b, com.startapp.sdk.components.a.a(context).f3366n, com.startapp.sdk.components.a.a(context).f3335A, com.startapp.sdk.components.a.a(context).f3375w, com.startapp.sdk.components.a.a(context).f3356c);
    }

    private List<AdDetails> getAdDetailsList() {
        ArrayList arrayList = new ArrayList();
        Iterator<NativeAdDetails> it = this.listNativeAds.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAdDetails());
        }
        return arrayList;
    }

    private AdDetails getFirstAdDetails() {
        NativeAdDetails nativeAdDetails;
        if (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) {
            return null;
        }
        return nativeAdDetails.getAdDetails();
    }

    private NativeAdPreferences getPreferences() {
        NativeAdPreferences nativeAdPreferences = this.preferences;
        if (nativeAdPreferences != null) {
            return nativeAdPreferences;
        }
        NativeAdPreferences nativeAdPreferences2 = new NativeAdPreferences();
        this.preferences = nativeAdPreferences2;
        return nativeAdPreferences2;
    }

    public static Drawable getPrivacyIcon(Context context) {
        return AdInformationMetaData.c().a(context);
    }

    @Deprecated
    public static String getPrivacyImageUrl() {
        return AdInformationMetaData.c().d();
    }

    public static String getPrivacyURL() {
        if (AdInformationMetaData.c().b() == null) {
            return "";
        }
        String b3 = AdInformationMetaData.c().b();
        if (b3.contains("http://") || b3.contains("https://")) {
            return AdInformationMetaData.c().b();
        }
        return "https://" + AdInformationMetaData.c().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onReceiveAd(AdEventListener adEventListener) {
        setErrorMessage(null);
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f);
        ((y6) ((x6) this.eventTracer.a())).b(this, fi.f3707b);
        a0.b(this.context, adEventListener, this, false);
        this.loading.set(false);
    }

    private NativeAdPreferences prepareAdPreferences() {
        String str;
        NativeAdPreferences preferences = getPreferences();
        if (preferences.getPlacementId() == null) {
            Context context = this.context;
            String packageName = context.getPackageName();
            String name = getClass().getName();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    str = null;
                    break;
                }
                if (context instanceof Activity) {
                    str = context.getClass().getName();
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            preferences.setPlacementId(g0.a(packageName, name, str, (String) null));
        }
        return preferences;
    }

    private void reset() {
        this.belowMinCpm = false;
        this.listNativeAds = Collections.EMPTY_LIST;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public String getAdId() {
        AdDetails firstAdDetails = getFirstAdDetails();
        if (firstAdDetails != null) {
            return firstAdDetails.a();
        }
        return null;
    }

    public String getBidToken() {
        AdDetails firstAdDetails = getFirstAdDetails();
        if (firstAdDetails != null) {
            return firstAdDetails.e();
        }
        return null;
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds(null);
    }

    public int getNumberOfAds() {
        return this.listNativeAds.size();
    }

    public void initNativeAdList(nd ndVar, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        int size;
        this.belowMinCpm = ndVar.isBelowMinCPM();
        List list = ndVar.f3581a;
        if (list == null || (size = list.size()) <= 0) {
            onReceiveAd(adEventListener);
            return;
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new NativeAdDetails((AdDetails) list.get(i3)));
        }
        this.listNativeAds = Collections.unmodifiableList(arrayList);
        if (!nativeAdPreferences.isAutoBitmapDownload()) {
            onReceiveAd(adEventListener);
            return;
        }
        i iVar = new i(this, size, adEventListener);
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3728x);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((NativeAdDetails) it.next()).loadImages(this.context, iVar);
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public boolean isBelowMinCPM() {
        return this.belowMinCpm;
    }

    @Deprecated
    public boolean loadAd() {
        return loadAd((AdEventListener) null);
    }

    public void setPreferences(NativeAdPreferences nativeAdPreferences) {
        this.preferences = nativeAdPreferences != null ? new NativeAdPreferences(nativeAdPreferences) : null;
    }

    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        AdRulesResult a3 = AdaptMetaData.b().a().a(AdPreferences.Placement.INAPP_NATIVE, str);
        if (a3.b()) {
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                nativeAdDetails.setAdTag(str);
                arrayList.add(nativeAdDetails);
            }
            t.f4350d.a(new s(AdPreferences.Placement.INAPP_NATIVE, str));
            return arrayList;
        }
        List<AdDetails> adDetailsList = getAdDetailsList();
        ArrayList arrayList2 = new ArrayList();
        if (adDetailsList != null) {
            Iterator<AdDetails> it = adDetailsList.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(Arrays.asList(it.next().t()));
            }
        }
        g0.a((String[]) arrayList2.toArray(new String[0]), str, 0, a3.a());
        return arrayList;
    }

    public boolean loadAd(AdEventListener adEventListener) {
        return loadAd(adEventListener, (String) null);
    }

    public boolean loadAd(AdEventListener adEventListener, String str) {
        if (!this.loading.compareAndSet(false, true)) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        reset();
        NativeAdPreferences prepareAdPreferences = prepareAdPreferences();
        nd ndVar = new nd(this.context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, prepareAdPreferences);
        ((y6) ((x6) this.eventTracer.a())).a((Object) this, fi.f3707b);
        ((y6) ((x6) this.eventTracer.a())).a(this, ndVar);
        ndVar.load(prepareAdPreferences, new j(this, ndVar, prepareAdPreferences, adEventListener), str);
        return true;
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        setPreferences(nativeAdPreferences);
        return loadAd((AdEventListener) null);
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener, String str) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener, str);
    }

    public StartAppNativeAd(Context context, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9) {
        super(context, AdPreferences.Placement.INAPP_NATIVE, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
        this.listNativeAds = Collections.EMPTY_LIST;
        this.loading = new AtomicBoolean();
    }
}
