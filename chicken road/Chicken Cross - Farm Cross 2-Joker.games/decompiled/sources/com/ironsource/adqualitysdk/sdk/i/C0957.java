package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C4761z5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.UserDataManager;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.auction.AdSourceConfig;
import net.pubnative.lite.sdk.auction.Auction;
import net.pubnative.lite.sdk.auction.HyBidAdSource;
import net.pubnative.lite.sdk.auction.VastTagAdSource;
import net.pubnative.lite.sdk.banner.presenter.BannerPresenterFactory;
import net.pubnative.lite.sdk.banner.presenter.MraidAdPresenter;
import net.pubnative.lite.sdk.banner.presenter.VastAdPresenter;
import net.pubnative.lite.sdk.browser.BrowserManager;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastSender;
import net.pubnative.lite.sdk.interstitial.PNInterstitialAd;
import net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.MraidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.VastInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterDecorator;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterFactory;
import net.pubnative.lite.sdk.interstitial.presenter.MraidInterstitialPresenter;
import net.pubnative.lite.sdk.interstitial.presenter.VastInterstitialPresenter;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.models.AdExt;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.AdvertisingInfo;
import net.pubnative.lite.sdk.models.RemoteConfigAppInfo;
import net.pubnative.lite.sdk.models.VASTtag;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDInterstitial;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.presenter.AdPresenterDecorator;
import net.pubnative.lite.sdk.presenter.PresenterFactory;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedAd;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastSender;
import net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity;
import net.pubnative.lite.sdk.rewarded.activity.VastRewardedActivity;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterDecorator;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterFactory;
import net.pubnative.lite.sdk.rewarded.presenter.VastRewardedPresenter;
import net.pubnative.lite.sdk.views.HyBidAdView;
import net.pubnative.lite.sdk.views.HyBidBannerAdView;
import net.pubnative.lite.sdk.views.HyBidLeaderboardAdView;
import net.pubnative.lite.sdk.views.HyBidMRectAdView;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.PNAdView;
import net.pubnative.lite.sdk.views.PNBannerAdView;
import net.pubnative.lite.sdk.views.PNMRectAdView;
import net.pubnative.lite.sdk.views.PNWebView;
import net.pubnative.lite.sdk.visibility.ImpressionManager;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFiles;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.Vast;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.response.VastProcessor;
import net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵃ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0957 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2773 = StringFog.decrypt("64NJ9uRu8Ijng1M=\n", "jOY9t5QepOc=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2772 = StringFog.decrypt("X9b6HzntuQJTwf4TKumkJ1I=\n", "NqWoek6My2Y=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2771 = StringFog.decrypt("ChRdAv6hbqU4FWU95LFupBwD\n", "eXEpVJfFC8o=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2770 = StringFog.decrypt("ll7I2CQqIkSf\n", "8Tu8mUBgUSs=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2769 = StringFog.decrypt("o64dye0QLoGlvwD+7Bo4\n", "xMtpiIlTXOQ=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2768 = StringFog.decrypt("6BGG5a0lr3X7\n", "j3TypMlzzgY=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2767 = StringFog.decrypt("CgN6vKMChKAIL2o=\n", "bWYO/cdY684=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2766 = StringFog.decrypt("1nMQs8LQPfjQ\n", "sRZk8qadWIw=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2765 = StringFog.decrypt("1tyjxEfbMHvUzQ==\n", "sbnXhSOaQwg=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2764 = StringFog.decrypt("oypgmsOP04CnIHqo\n", "xE8U26fNtuE=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2763 = StringFog.decrypt("0bGcsRKzOJDToL2CGg==\n", "ttTo8HbyS+M=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2762 = StringFog.decrypt("LdJGnoBwiDcr/0ayiA==\n", "Srcy3+Q06UM=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2761 = StringFog.decrypt("DH/wLSAMx7wKUPc=\n", "axqEbERIpsg=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2760 = StringFog.decrypt("ntjyebqwspOY6PRU\n", "+b2GON700+c=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2759 = StringFog.decrypt("ppddthzrjAmgoV2FEcGKO6iXRZM=\n", "wfIp93iv7X0=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2758 = StringFog.decrypt("shguaqtMv7+HAy9usGiPsbgZP26xTJk=\n", "0WpLC98p6/0=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2757 = StringFog.decrypt("N0/GgP9vpgcxR8GS702uGzc=\n", "UCqywZs/x3U=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2756 = StringFog.decrypt("y17fK4lWS/jNVtgjiQ==\n", "rDurau0GKoo=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2755 = StringFog.decrypt("0kGfhfJiWu/USZiS/1Ze8udBj63kV1jp4FaH\n", "tSTrxJYyO50=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2754 = StringFog.decrypt("iV6IIUD92VWPVo8lSsn7RpxfrgVAxMpCjU+pEkg=\n", "7jv8YCStuCc=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2753 = StringFog.decrypt("EVEDH9d1SO8XWQQI2kFM8jVYHj3YVg==\n", "djR3XrMlKZ0=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2752 = StringFog.decrypt("u7attg28Rzq9vqqyB4hlKa63mpsAj007\n", "3NPZ92nsJkg=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2751 = StringFog.decrypt("bC7bzLe9R5lqJtzbuolDhE0iw+iGn0qYRyLc+Q==\n", "C0uvjdPtJus=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2750 = StringFog.decrypt("vIXoN8Vg/FK6je8zz1TeQamEyQTNfPRTrw==\n", "2+CcdqEwnSA=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2749 = StringFog.decrypt("nhfA0Th2Jn2YH8c=\n", "+XK0kFwmRw8=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2748 = StringFog.decrypt("TiyaZhiC8b5qJYdTGpXXvUAqhWQZlPukTiE=\n", "KUnuMHHmlNE=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2747 = StringFog.decrypt("iYgQN2WqLV+tgQ0CZ70LXIeODzV+rytbh4MDLWW9PA==\n", "7u1kYQzOSDA=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2746 = StringFog.decrypt("o9a/SNYZlzKq2qRl+hiOMK/no3nWAYA7\n", "xLPLC7l051M=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2745 = StringFog.decrypt("LKPvH+9UpKQisP4f8ly1sSWv9DLcVbY=\n", "S8abXJ0xxdA=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2744 = StringFog.decrypt("XBOwJgh4YS9eNbYKB2BhN14F\n", "O3bEb2YUCEE=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2743 = StringFog.decrypt("vLpHkAqQHsS/jFyzGYAPxqm6UrIClQ/2\n", "298zxmvjaoU=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2742 = StringFog.decrypt("zzIeD7T2Ap3uPgYnhfcTiA==\n", "qFdqQtGSa/w=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2741 = StringFog.decrypt("gkxEK3yYmlSGe1ULZ4ycXoB9VQB8\n", "5SkweAj57j0=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2740 = StringFog.decrypt("gFRZjI1AYzWEY0isllRlP4JyX7qYVX4qgmVUr5w=\n", "5zEt3/khF1w=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2739 = StringFog.decrypt("cex3SFJzUhxz+0BtRXNWBWDscA==\n", "FokDHyASImw=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2738 = StringFog.decrypt("/GtjaMX0SU3+fEF+5MF4Wc9vcGrl3A==\n", "mw4XP7eVOT0=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2737 = StringFog.decrypt("7Grfi7pnW8Liec6YqXBb2/hM2a2pdlPA7kvKvKk=\n", "iw+ryMgCOrY=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2736 = StringFog.decrypt("fvkeZRxfQHNw6g92D0hAamrZBFAHSE5pdPkEUjhbU3Q=\n", "GZxqJm46IQc=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2735 = StringFog.decrypt("SeocJRM=\n", "AZNeTHdNdpg=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2734 = StringFog.decrypt("su/hnX95DA==\n", "84ui/BwRaRc=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2733 = StringFog.decrypt("U231rmxmIvJLf/69T2Ik\n", "Bh6Q3CgHVpM=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f2732 = StringFog.decrypt("Ne8Ny60caEoT7DDYpg58Rg4=\n", "fIJ9uchvGyM=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f2731 = StringFog.decrypt("9F5ZijhIuunHVUmYOEk=\n", "pjso/107zqQ=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f2730 = StringFog.decrypt("263Z6pJu6kfZpuTjjns=\n", "msmKhecciSI=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f2729 = StringFog.decrypt("8bxg27hBuc/WsFDRuQ==\n", "ucUistwA3Zw=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f2728 = StringFog.decrypt("ZHDoaHiI7uZWQvRpXors\n", "MhGbHCzpiac=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f2727 = StringFog.decrypt("jf9+jzpSUQ==\n", "zIod+1M9P4E=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f2726 = StringFog.decrypt("ROshqKWfqD9j+SqotIiKC2fpO6mylA==\n", "BopPxsDt+E0=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f2725 = StringFog.decrypt("veKQXedmtvGC9YJR7VO30w==\n", "8JDxNIMn0qE=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f2724 = StringFog.decrypt("OUhsvI2315oKWnqmuLb1\n", "bykfyMzTh+g=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f2723 = StringFog.decrypt("Upoc07pTes1xhhLDrEQ=\n", "EOhzpMk2CIA=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f2722 = StringFog.decrypt("rVmR1R3IWeWAUqDIEPVe8Ilhtw==\n", "5SDTvHmBN5E=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f2721 = StringFog.decrypt("1qFJcy1bcDn7qnhuIGZ3LPKaeXUodn0s7axZfyp3dzv7qg==\n", "ntgLGkkSHk0=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f2720 = StringFog.decrypt("rjABgdSoa7ODOzCc2ZVspooLMYfRhWamlT0Qjd6FYLU=\n", "5klD6LDhBcc=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f2719 = StringFog.decrypt("kwuoDvYDuKS3LJUJ4wqLsw==\n", "w0XhYIJmytc=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f2718 = StringFog.decrypt("PoE5Ct+qSVwDhiwD/atYRhKBOQrfnVhWGJ0sG8Kr\n", "d+9Nb63ZPTU=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f2717 = StringFog.decrypt("8u9OnCKVVJLP6FuVAJRFiN7vTpwioEGYz+5IgA==\n", "u4E6+VDmIPs=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f2716 = StringFog.decrypt("WeoSfALfUo1x6gBhD+JVmHjIAXAV81KNceo=\n", "FJhzFWaWPPk=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f2715 = StringFog.decrypt("pi5sXnlsq9iCPGtDRGu+0aA9ellVbKvYgg==\n", "8E8fKjAC370=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f2714 = StringFog.decrypt("QWkbR2KPcdROeAYfd9R/01tpQRp2kT3TQXgKG2GOes5GbQNHc5ln01llGxA8smr4RmgmB2afYclb\nZRsAc5ZS2VtlGQBmgw==\n", "LwxvaRL6E7o=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f2713 = StringFog.decrypt("IopdQ54N+p0PgWxekzD9iAayfF6TMv2dEw==\n", "avMfKvpElOk=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f2712 = StringFog.decrypt("/4gz7jUDWs3wmS62IFhUyuWIabMhHRbK/5kisjYCUdf4jCvuJBVMyueEM7lrO0rC+IkOrjETStDl\nhDOpJBp5wOWEMakxDw==\n", "ke1HwEV2OKM=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f2711 = StringFog.decrypt("f7p4Cnk6pItXumoXdAejnl6Jehd0BaOLSw==\n", "MsgZYx1zyv8=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f2710 = StringFog.decrypt("dCQ/gYLoACB7NSLZl7MOJ24kZdyW9kwndDUu3YHpCzpzICeBk/4WJ2woP9bcywM9bggl25fvETpz\nNSLOntwBOnM3ItuL\n", "GkFLr/KdYk4=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f2709 = StringFog.decrypt("lKYBfGeu7biwtAZhWqn4sYOkBmFYqe2k\n", "wsdyCC7Amd0=\n");

    /* renamed from: ۉ, reason: contains not printable characters */
    public static final String f2708 = StringFog.decrypt("B8o=\n", "Rq54t9sQw48=\n");

    /* renamed from: ۅ, reason: contains not printable characters */
    public static final String f2707 = StringFog.decrypt("ADhM+9uF\n", "QVwImq/k9F8=\n");

    /* renamed from: ڑ, reason: contains not printable characters */
    public static final String f2706 = StringFog.decrypt("08zns/Y=\n", "kqiiy4I9oko=\n");

    /* renamed from: پ, reason: contains not printable characters */
    public static final String f2705 = StringFog.decrypt("QNNjWnX7eQ9y0g==\n", "AbcxPwaLFmE=\n");

    /* renamed from: ٽ, reason: contains not printable characters */
    public static final String f2704 = StringFog.decrypt("3h+7oOxAi4n2FaqM8FKN\n", "n3vNxZ404vo=\n");

    /* renamed from: ث, reason: contains not printable characters */
    public static final String f2703 = StringFog.decrypt("OF1C43pXDPMEXkbrT0I/1QReQA==\n", "ajgvjA4yT5w=\n");

    /* renamed from: ת, reason: contains not printable characters */
    public static final String f2702 = StringFog.decrypt("buzBnDL7EQ==\n", "OK2SyEaadpU=\n");

    /* renamed from: ק, reason: contains not printable characters */
    public static final String f2701 = StringFog.decrypt("ey+1VRqikhFB\n", "Nn30HF70+3Q=\n");

    /* renamed from: פ, reason: contains not printable characters */
    public static final String f2700 = StringFog.decrypt("Et9quZo3gvo6/1iEtwqF7zM=\n", "X40r8N5+7I4=\n");

    /* renamed from: ս, reason: contains not printable characters */
    public static final String f2699 = StringFog.decrypt("5xSbH4efXQ/EI6g=\n", "qkbaVsPdPGE=\n");

    /* renamed from: ո, reason: contains not printable characters */
    public static final String f2698 = StringFog.decrypt("2pzghSfKecPvncKzJ9pz3/qM34U=\n", "m/iw90K5HK0=\n");

    /* renamed from: յ, reason: contains not printable characters */
    public static final String f2697 = StringFog.decrypt("YW1iNf8okFJDWWYl7imWTg==\n", "MR8HRppG5Dc=\n");

    /* renamed from: Ն, reason: contains not printable characters */
    public static final String f2696 = StringFog.decrypt("iAN/l67sJXyhCFmbrv8k\n", "wHo9/sq+QAs=\n");

    /* renamed from: Ԇ, reason: contains not printable characters */
    public static final String f2695 = StringFog.decrypt("t4461GtFsqWehRzYa1WlvZ6TG9x8Y4W3nJIRy2pl\n", "//d4vQ8X19I=\n");

    /* renamed from: Ӵ, reason: contains not printable characters */
    public static final String f2694 = StringFog.decrypt("detEAsl5ugFc4GIOyWmtGVz2ZQreX4wTU/ZjGQ==\n", "PZIGa60r33Y=\n");

    /* renamed from: ӟ, reason: contains not printable characters */
    public static final String f2693 = StringFog.decrypt("LH3x85H5+yIuauPhhvPqIwxc4/GM7/8yEWo=\n", "fhiGkuOdnkY=\n");

    /* renamed from: Ҭ, reason: contains not printable characters */
    public static final String f2692 = StringFog.decrypt("yZPIoni8dIDLhNqwb7Zlgemw3qB+t2Od\n", "m/a/wwrYEeQ=\n");

    /* renamed from: Ғ, reason: contains not printable characters */
    public static final String f2691 = StringFog.decrypt("a5Wzcb++Bw5PkKVhvakVHFiatGCf\n", "PfTABe3bcG8=\n");

    /* renamed from: ѵ, reason: contains not printable characters */
    public static final String f2690 = StringFog.decrypt("BtlMyb33OaEJyFGRqKw3phzZFpSp6XW9DctZlannP+EJ30yOu+svtkb0QaWk5gmqH91Kg6jmGqwc\n1U6Oufs=\n", "aLw4582CW88=\n");

    /* renamed from: п, reason: contains not printable characters */
    public static final String f2689 = StringFog.decrypt("72wZMVw9dPDGZz89XC5y885jMixB\n", "pxVbWDhvEYc=\n");

    /* renamed from: н, reason: contains not printable characters */
    public static final String f2688 = StringFog.decrypt("bB7g1IN/nHRjD/2MliSSc3YeuomXYdBoZwz1iJdvmjRjGOCThWOKYywt9YmHWJttYwnwn5dLnW5r\nDf2Oig==\n", "AnuU+vMK/ho=\n");

    /* renamed from: У, reason: contains not printable characters */
    public static final String f2687 = StringFog.decrypt("ELqCxFeXTN80v5TURJFP1zCyhck=\n", "RtvxsAXyO74=\n");

    /* renamed from: С, reason: contains not printable characters */
    public static final String f2686 = StringFog.decrypt("kHbB9nbhjGU=\n", "wDiAkiCI6RI=\n");

    /* renamed from: Ϲ, reason: contains not printable characters */
    public static final String f2685 = StringFog.decrypt("27TXv3S/7B/6qOI=\n", "k82V1hD+iEk=\n");

    /* renamed from: ϵ, reason: contains not printable characters */
    public static final String f2684 = StringFog.decrypt("TLGLLXlg/dtqrbsFeXT10HM=\n", "BMjJRB0inLU=\n");

    /* renamed from: ϯ, reason: contains not printable characters */
    public static final String f2683 = StringFog.decrypt("TWejvDzEN7Bhe5O3N+kgtUR6t7w9/w==\n", "BR7h1ViIUtE=\n");

    /* renamed from: Ϯ, reason: contains not printable characters */
    public static final String f2682 = StringFog.decrypt("CHiaAzJSS5cjdZkOAHZ8hQ==\n", "QAHYalYfGfI=\n");

    /* renamed from: ϝ, reason: contains not printable characters */
    public static final String f2681 = StringFog.decrypt("Ya7+z+Kora1FhdHr4oWkrGeJ2ug=\n", "MeC/n6vrwsM=\n");

    /* renamed from: ϙ, reason: contains not printable characters */
    public static final String f2680 = StringFog.decrypt("MkroEtxARMUjYPwa11k=\n", "YgSqc7IuIbc=\n");

    /* renamed from: Λ, reason: contains not printable characters */
    public static final String f2679 = StringFog.decrypt("ZxmhG4aULO5TAYUslA==\n", "N1fsSeP3WK8=\n");

    /* renamed from: Κ, reason: contains not printable characters */
    public static final String f2678 = StringFog.decrypt("tjttPGdSW72R\n", "5nU6WQUEMtg=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2677 = StringFog.decrypt("TVH2RFAgGA==\n", "GziSIT9hfH0=\n");

    /* renamed from: ʜ, reason: contains not printable characters */
    public static final String f2676 = StringFog.decrypt("em72G9fIZf9FdOYb1uxz\n", "LAeSfriJAbM=\n");

    /* renamed from: Ȳ, reason: contains not printable characters */
    public static final String f2675 = StringFog.decrypt("2L/RwqaylsLns8I=\n", "jta1p8nz8pQ=\n");

    /* renamed from: ȝ, reason: contains not printable characters */
    public static final String f2674 = StringFog.decrypt("2acLqodOkmTqtQuxpQ==\n", "j8Z43tc8/Qc=\n");

    /* renamed from: ƈ, reason: contains not printable characters */
    public static final String f2673 = StringFog.decrypt("fc3gJbj/0zpLzg==\n", "LaGBXN2NmlQ=\n");

    /* renamed from: Ɔ, reason: contains not printable characters */
    public static final String f2672 = StringFog.decrypt("xUhYbsyZh5roQ2lzwaSAj+FwfkvBo52L41Ro\n", "jTEaB6jQ6e4=\n");

    /* renamed from: Ť, reason: contains not printable characters */
    public static final String f2671 = StringFog.decrypt("9+x9Dm41xc7e51sCbibE9dbmSwJkAtI=\n", "v5U/ZwpnoLk=\n");

    /* renamed from: ţ, reason: contains not printable characters */
    public static final String f2670 = StringFog.decrypt("W4ZY276onw96mm3+s5qPPH2aaA==\n", "E/8astrp+1k=\n");

    /* renamed from: ō, reason: contains not printable characters */
    public static final String f2669 = StringFog.decrypt("w8Te6+r9cxHzyuHx+v1yNeU=\n", "l4aIgo6YHFA=\n");

    /* renamed from: Ł, reason: contains not printable characters */
    public static final String f2668 = StringFog.decrypt("VAJa4YtBvNM=\n", "FWYKgPkg0aA=\n");

    /* renamed from: Ĵ, reason: contains not printable characters */
    public static final String f2667 = StringFog.decrypt("ZDOOO01tA4lANYcga3A7nEEu\n", "MlrrTA4Cbf0=\n");

    /* renamed from: ﾓ, reason: contains not printable characters */
    public static final String f2792 = StringFog.decrypt("XJnWYlC3erdlnsZ1UJpykXg=\n", "CvCyBz/2HvQ=\n");

    /* renamed from: ﾊ, reason: contains not printable characters */
    public static final String f2791 = StringFog.decrypt("xas4UcOytHzwqS8=\n", "k8JcNKzx2BU=\n");

    /* renamed from: ﾁ, reason: contains not printable characters */
    public static final String f2790 = StringFog.decrypt("e6J3tTBwpOFXu3m+\n", "OM4e1lskzJM=\n");

    /* renamed from: ｽ, reason: contains not printable characters */
    public static final String f2789 = StringFog.decrypt("TVUMRocF6KJtUgxLiw==\n", "DjllJexRmsM=\n");

    /* renamed from: ｹ, reason: contains not printable characters */
    public static final String f2788 = StringFog.decrypt("a1NWn4jb6O9G\n", "KDw77+m1gYA=\n");

    /* renamed from: ｸ, reason: contains not printable characters */
    public static final String f2787 = StringFog.decrypt("myVf7vMiufu2C1bt\n", "2EoynpJM0JQ=\n");

    /* renamed from: ｷ, reason: contains not printable characters */
    public static final String f2786 = StringFog.decrypt("C7tSQ/TFnU4ml1Na9sCgSTq7SlT9\n", "SNQ/M5Wr9CE=\n");

    /* renamed from: ｳ, reason: contains not printable characters */
    public static final String f2785 = StringFog.decrypt("3RY636fXp8nwOjvGpdKa1P8aPMao3g==\n", "nnlXr8a5zqY=\n");

    /* renamed from: ｦ, reason: contains not printable characters */
    public static final String f2784 = StringFog.decrypt("aiIjvvU+ni8=\n", "KVBG34FX6Eo=\n");

    /* renamed from: ｓ, reason: contains not printable characters */
    public static final String f2783 = StringFog.decrypt("7jKJxiZgrSHe\n", "rUDsp1IJ20Q=\n");

    /* renamed from: ｒ, reason: contains not printable characters */
    public static final String f2782 = StringFog.decrypt("N/eQJMmO\n", "fpncTafrCG0=\n");

    /* renamed from: ｎ, reason: contains not printable characters */
    public static final String f2781 = StringFog.decrypt("aNHWUFY3ys5LwsZB\n", "PrClJBdTmaE=\n");

    /* renamed from: ｌ, reason: contains not printable characters */
    public static final String f2780 = StringFog.decrypt("iYGsMsbYQmOh\n", "xOTIW6eeKw8=\n");

    /* renamed from: Ｉ, reason: contains not printable characters */
    public static final String f2779 = StringFog.decrypt("QrMZo7Hj5hxqpQ==\n", "D9Z9ytClj3A=\n");

    /* renamed from: Ｆ, reason: contains not printable characters */
    public static final String f2778 = StringFog.decrypt("minv8kxF65u6Mvv0RkM=\n", "yV2OhiUmuf4=\n");

    /* renamed from: ﻢ, reason: contains not printable characters */
    public static final String f2777 = StringFog.decrypt("kLbVoA==\n", "xtem1JozBN0=\n");

    /* renamed from: ﻌ, reason: contains not printable characters */
    public static final String f2776 = StringFog.decrypt("feErEbI51g==\n", "KpNKYcJcpGI=\n");

    /* renamed from: ﻋ, reason: contains not printable characters */
    public static final String f2775 = StringFog.decrypt("wzcjd4G4fTryIyJq\n", "lXZwI8DcKVs=\n");

    /* renamed from: ﺧ, reason: contains not printable characters */
    public static final String f2774 = StringFog.decrypt("732A3fRMwhj8bpfd7VY=\n", "rA/lvIAltH0=\n");

    public C0957(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        return HyBid.getHyBidVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2773, new C0331(this));
        hashMap.put(f2772, new C1163(this));
        hashMap.put(f2771, new C1031(this));
        hashMap.put(f2770, new C1030(this));
        hashMap.put(f2769, new C1001(this));
        hashMap.put(f2768, new C0995(this));
        hashMap.put(f2767, new C0986(this));
        hashMap.put(f2766, new C0964(this));
        hashMap.put(f2765, new C0963(this));
        hashMap.put(f2764, new C0375(this));
        hashMap.put(f2763, new C0374(this));
        hashMap.put(f2762, new C0366(this));
        hashMap.put(f2761, new C0365(this));
        hashMap.put(f2760, new C0360(this));
        hashMap.put(f2759, new C0351(this));
        hashMap.put(f2758, new C0348(this));
        hashMap.put(f2757, new C0346(this));
        hashMap.put(f2756, new C0342(this));
        hashMap.put(f2755, new C0340(this));
        hashMap.put(f2754, new C0329(this));
        hashMap.put(f2753, new C1256(this));
        hashMap.put(f2752, new C1233(this));
        hashMap.put(f2751, new C1224(this));
        hashMap.put(f2750, new C1213(this));
        hashMap.put(f2749, new C1207(this));
        hashMap.put(f2748, new C1194(this));
        hashMap.put(f2747, new C1190(this));
        hashMap.put(f2746, new C1168(this));
        hashMap.put(f2745, new C1167(this));
        hashMap.put(f2744, new C1159(this));
        hashMap.put(f2743, new C1153(this));
        hashMap.put(f2742, new C1149(this));
        hashMap.put(f2741, new C1143(this));
        hashMap.put(f2740, new C1139(this));
        hashMap.put(f2739, new C1116(this));
        hashMap.put(f2738, new C1114(this));
        hashMap.put(f2737, new C1113(this));
        hashMap.put(f2736, new C1101(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2115104349:
                if (str.equals(f2675)) {
                    c = Typography.less;
                    break;
                }
                c = 65535;
                break;
            case -2101083431:
                if (str.equals(f2782)) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case -2095699225:
                if (str.equals(f2709)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -2049897434:
                if (str.equals(f2791)) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case -2030915791:
                if (str.equals(f2688)) {
                    c = FileSystemKt.UnixPathSeparator;
                    break;
                }
                c = 65535;
                break;
            case -2022878658:
                if (str.equals(f2731)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1973009238:
                if (str.equals(f2781)) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case -1867123455:
                if (str.equals(f2690)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1758764491:
                if (str.equals(f2774)) {
                    c = 'W';
                    break;
                }
                c = 65535;
                break;
            case -1741983831:
                if (str.equals(f2668)) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case -1692490108:
                if (str.equals(f2783)) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case -1668741680:
                if (str.equals(f2715)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1474059205:
                if (str.equals(f2678)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -1454339106:
                if (str.equals(f2720)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1305745411:
                if (str.equals(f2696)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1042733280:
                if (str.equals(f2730)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1040143378:
                if (str.equals(f2725)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1034806157:
                if (str.equals(f2776)) {
                    c = 'U';
                    break;
                }
                c = 65535;
                break;
            case -1007287447:
                if (str.equals(f2689)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case -917597044:
                if (str.equals(f2712)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -889171374:
                if (str.equals(f2711)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -844922724:
                if (str.equals(f2701)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -801627293:
                if (str.equals(f2699)) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case -747024196:
                if (str.equals(f2694)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -729230458:
                if (str.equals(f2674)) {
                    c = C4761z5.U;
                    break;
                }
                c = 65535;
                break;
            case -709708726:
                if (str.equals(f2729)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -617879491:
                if (str.equals(f2790)) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case -594285390:
                if (str.equals(f2676)) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -589715152:
                if (str.equals(f2681)) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case -587420703:
                if (str.equals(f2775)) {
                    c = 'V';
                    break;
                }
                c = 65535;
                break;
            case -567645543:
                if (str.equals(f2683)) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -520974940:
                if (str.equals(f2705)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -514201671:
                if (str.equals(f2724)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -385055469:
                if (str.equals(f2779)) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case -348198615:
                if (str.equals(f2786)) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case -242952691:
                if (str.equals(f2719)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -232966702:
                if (str.equals(f2704)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -217201711:
                if (str.equals(f2671)) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case -205981873:
                if (str.equals(f2673)) {
                    c = Typography.greater;
                    break;
                }
                c = 65535;
                break;
            case -150968480:
                if (str.equals(f2780)) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case -133293208:
                if (str.equals(f2670)) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case -114588646:
                if (str.equals(f2792)) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f2708)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 2658924:
                if (str.equals(f2777)) {
                    c = 'T';
                    break;
                }
                c = 65535;
                break;
            case 22955995:
                if (str.equals(f2679)) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 63078110:
                if (str.equals(f2706)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 70165004:
                if (str.equals(f2735)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 152629510:
                if (str.equals(f2686)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 254077974:
                if (str.equals(f2698)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 271735736:
                if (str.equals(f2733)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 282218207:
                if (str.equals(f2718)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 287435653:
                if (str.equals(f2723)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 353872196:
                if (str.equals(f2732)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 378666444:
                if (str.equals(f2728)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 424904237:
                if (str.equals(f2667)) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case 441957133:
                if (str.equals(f2682)) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 476474561:
                if (str.equals(f2714)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 482776408:
                if (str.equals(f2721)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 485976319:
                if (str.equals(f2734)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 504900231:
                if (str.equals(f2713)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 591135468:
                if (str.equals(f2788)) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case 606183598:
                if (str.equals(f2717)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 676623548:
                if (str.equals(f2778)) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case 767767497:
                if (str.equals(f2687)) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 789926062:
                if (str.equals(f2726)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 862687632:
                if (str.equals(f2692)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 956069326:
                if (str.equals(f2702)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1002796579:
                if (str.equals(f2727)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1044987291:
                if (str.equals(f2722)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1150879268:
                if (str.equals(f2787)) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case 1164559907:
                if (str.equals(f2700)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1199380782:
                if (str.equals(f2691)) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                c = 65535;
                break;
            case 1228519789:
                if (str.equals(f2710)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1241891335:
                if (str.equals(f2703)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1250739860:
                if (str.equals(f2685)) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 1296210799:
                if (str.equals(f2672)) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case 1373883333:
                if (str.equals(f2716)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1402445010:
                if (str.equals(f2680)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 1506578400:
                if (str.equals(f2684)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1521679714:
                if (str.equals(f2697)) {
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case 1607572150:
                if (str.equals(f2695)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 1877773523:
                if (str.equals(f2785)) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case 1885066191:
                if (str.equals(f2784)) {
                    c = GMTDateParser.MONTH;
                    break;
                }
                c = 65535;
                break;
            case 1955369613:
                if (str.equals(f2707)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1969459009:
                if (str.equals(f2693)) {
                    c = GMTDateParser.ANY;
                    break;
                }
                c = 65535;
                break;
            case 2079062148:
                if (str.equals(f2669)) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 2107600959:
                if (str.equals(f2789)) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case 2117435870:
                if (str.equals(f2677)) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return HyBid.class;
            case 1:
                return AdCache.class;
            case 2:
                return UserDataManager.class;
            case 3:
                return ImpressionManager.class;
            case 4:
                return RequestManager.class;
            case 5:
                return AdSourceConfig.class;
            case 6:
                return HyBidAdSource.class;
            case 7:
                return VastTagAdSource.class;
            case '\b':
                return Auction.class;
            case '\t':
                return BannerPresenterFactory.class;
            case '\n':
                return MraidAdPresenter.class;
            case 11:
                return VastAdPresenter.class;
            case '\f':
                return BrowserManager.class;
            case '\r':
                return HyBidInterstitialAd.class;
            case 14:
                return HyBidInterstitialBroadcastReceiver.class;
            case 15:
                return HyBidInterstitialBroadcastSender.class;
            case 16:
                return PNInterstitialAd.class;
            case 17:
                return InterstitialPresenterDecorator.class;
            case 18:
                return InterstitialPresenterFactory.class;
            case 19:
                return MraidInterstitialPresenter.class;
            case 20:
                return VastInterstitialPresenter.class;
            case 21:
            case 22:
                return HyBidInterstitialActivity.class;
            case 23:
            case 24:
                return MraidInterstitialActivity.class;
            case 25:
            case 26:
                return VastInterstitialActivity.class;
            case 27:
                return Ad.class;
            case 28:
                return AdData.class;
            case 29:
                return AdExt.class;
            case 30:
                return AdResponse.class;
            case 31:
                return AdvertisingInfo.class;
            case ' ':
                return RemoteConfigAppInfo.class;
            case '!':
                return VASTtag.class;
            case '\"':
                return MRAIDView.class;
            case '#':
                return MRAIDInterstitial.class;
            case '$':
                return MRAIDBanner.class;
            case '%':
                return AdPresenterDecorator.class;
            case '&':
                return PresenterFactory.class;
            case '\'':
                return HyBidRewardedAd.class;
            case '(':
                return HyBidRewardedBroadcastReceiver.class;
            case ')':
                return HyBidRewardedBroadcastSender.class;
            case '*':
                return RewardedPresenterDecorator.class;
            case '+':
                return RewardedPresenterFactory.class;
            case ',':
                return VastRewardedPresenter.class;
            case '-':
            case '.':
                return HyBidRewardedActivity.class;
            case '/':
            case '0':
                return VastRewardedActivity.class;
            case '1':
                return PNAdView.class;
            case '2':
                return HyBidAdView.class;
            case '3':
                return HyBidBannerAdView.class;
            case '4':
                return HyBidLeaderboardAdView.class;
            case '5':
                return HyBidMRectAdView.class;
            case '6':
                return PNAPIContentInfoView.class;
            case '7':
                return PNBannerAdView.class;
            case '8':
                return PNMRectAdView.class;
            case '9':
                return PNWebView.class;
            case ':':
                return VideoAd.class;
            case ';':
                return VideoAdListener.class;
            case '<':
                return VideoAdView.class;
            case '=':
                return VastProcessor.class;
            case '>':
                return PlayerInfo.class;
            case '?':
                return HyBidInterstitialAd.Listener.class;
            case '@':
                return HyBidRewardedAd.Listener.class;
            case 'A':
                return HyBidAdView.Listener.class;
            case 'B':
                return C0959.class;
            case 'C':
                return AdParams.class;
            case 'D':
                return ViewControllerVast.class;
            case 'E':
                return VideoAdController.class;
            case 'F':
                return VideoClicks.class;
            case 'G':
                return ClickThrough.class;
            case 'H':
                return ClickTracking.class;
            case 'I':
                return Companion.class;
            case 'J':
                return CompanionAds.class;
            case 'K':
                return CompanionClickThrough.class;
            case 'L':
                return CompanionClickTracking.class;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                return Creative.class;
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                return Creatives.class;
            case 'O':
                return InLine.class;
            case 'P':
                return VastAdSource.class;
            case 'Q':
                return MediaFile.class;
            case 'R':
                return MediaFiles.class;
            case 'S':
                return StaticResource.class;
            case 'T':
                return Vast.class;
            case 'U':
                return Wrapper.class;
            case 'V':
                return VASTAdTagURI.class;
            case 'W':
                return CreativeParams.class;
            default:
                return null;
        }
    }
}
