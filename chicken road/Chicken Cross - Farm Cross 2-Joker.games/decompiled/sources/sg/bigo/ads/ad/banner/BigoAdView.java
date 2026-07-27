package sg.bigo.ads.ad.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.N.a;
import sg.bigo.ads.N.d;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.d1.AbstractC5068d;
import sg.bigo.ads.d1.C5069e;
import sg.bigo.ads.f.C5095H;
import sg.bigo.ads.f.v;
import sg.bigo.ads.f.y;

/* loaded from: classes3.dex */
public class BigoAdView extends a implements Ad {
    public BannerAd b;
    public AdLoadListener c;
    public ViewGroup.LayoutParams d;
    public final y e;

    public BigoAdView(Context context) {
        super(context);
        this.e = new y(this);
    }

    @Override // sg.bigo.ads.N.a
    public final AbstractC5068d a() {
        return new C5069e(this);
    }

    @Override // sg.bigo.ads.api.Ad
    public void destroy() {
        BannerAd bannerAd = this.b;
        if (bannerAd != null) {
            bannerAd.destroy();
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public AdBid getBid() {
        BannerAd bannerAd = this.b;
        if (bannerAd != null) {
            return bannerAd.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    public String getCreativeId() {
        BannerAd bannerAd = this.b;
        if (bannerAd != null) {
            return bannerAd.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getExtraInfo(String str) {
        BannerAd bannerAd = this.b;
        if (bannerAd != null) {
            return bannerAd.getExtraInfo(str);
        }
        return null;
    }

    public int getHeightInDP() {
        BannerAd bannerAd = this.b;
        if (bannerAd != null) {
            return bannerAd.getHeight();
        }
        return 0;
    }

    public int getWidthInDP() {
        BannerAd bannerAd = this.b;
        if (bannerAd != null) {
            return bannerAd.getWidth();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        BannerAd bannerAd = this.b;
        if (bannerAd != null) {
            return bannerAd.isExpired();
        }
        return false;
    }

    public void loadAd(BannerAdRequest bannerAdRequest) {
        new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) this.e).build().loadAd((d) bannerAdRequest);
    }

    @Override // sg.bigo.ads.api.Ad
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        BannerAd bannerAd = this.b;
        if (bannerAd != null) {
            bannerAd.setAdInteractionListener(adInteractionListener);
        }
    }

    public void setAdLoadListener(AdLoadListener<BigoAdView> adLoadListener) {
        this.c = adLoadListener;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.d = layoutParams;
        a(false);
        super.setLayoutParams(layoutParams);
    }

    public BigoAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new y(this);
    }

    public final void a(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        BannerAd bannerAd = this.b;
        if (!(bannerAd instanceof InnerBannerAd) || bannerAd.adView() == null) {
            return;
        }
        View adView = this.b.adView();
        int a2 = AbstractC4963u.a(getContext(), this.b.getWidth());
        int a3 = AbstractC4963u.a(getContext(), this.b.getHeight());
        BannerAd bannerAd2 = this.b;
        if (bannerAd2 instanceof C5095H) {
            C5095H c5095h = (C5095H) bannerAd2;
            if ((c5095h.Q instanceof v) && (layoutParams = this.d) != null) {
                int i = -2 == layoutParams.width ? a2 : 1;
                int i2 = -2 == layoutParams.height ? a3 : 1;
                if (i != 1 || 1 == c5095h.getWidth()) {
                    a2 = i;
                } else {
                    int i3 = this.d.width;
                    if (-1 == i3 || i3 > 1) {
                        a2 = i3;
                    }
                }
                if (i2 != 1 || 1 == this.b.getHeight()) {
                    a3 = i2;
                } else {
                    int i4 = this.d.height;
                    if (-1 == i4 || i4 > 1) {
                        a3 = i4;
                    }
                }
            }
        }
        ViewGroup.LayoutParams layoutParams2 = adView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(a2, a3);
        } else {
            layoutParams2.width = a2;
            layoutParams2.height = a3;
        }
        if (((InnerBannerAd) this.b).getWebView() != null) {
            ViewGroup.LayoutParams layoutParams3 = ((InnerBannerAd) this.b).getWebView().getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new FrameLayout.LayoutParams(a2, a3);
            } else {
                layoutParams3.width = a2;
                layoutParams3.height = a3;
            }
            ((InnerBannerAd) this.b).getWebView().setLayoutParams(layoutParams3);
        }
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        adView.setLayoutParams(layoutParams2);
        if (z) {
            removeAllViews();
            addView(adView);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Ad ad) {
        BannerAd bannerAd = this.b;
        if (bannerAd != null) {
            return bannerAd.compareTo(ad);
        }
        return 0;
    }

    public void loadAd(BannerAdRequest bannerAdRequest, String str) {
        new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) this.e).withExt(str).build().loadAd((d) bannerAdRequest);
    }

    public BigoAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new y(this);
    }
}
