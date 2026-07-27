package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.C4761z5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.activity.DomainMBCommonActivity;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.config.activity.BaseActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.fragment.BaseFragment;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.WebViewFragment;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newout.IMBRRewardVideoHandler;
import com.mbridge.msdk.newout.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.IDownloadListener;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBInterstitialHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeH5EndCardView;
import com.mbridge.msdk.video.module.MBridgeLandingPageView;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import com.mbridge.msdk.video.module.MBridgePlayableView;
import com.mbridge.msdk.video.module.MBridgeVastEndCardView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.mbridge.msdk.widget.MBImageView;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵑ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0971 extends AbstractC0962 {

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f2819;

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f2820;

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f2821;

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f2822;

    /* renamed from: น, reason: contains not printable characters */
    public static final String f2823;

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f2824;

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f2825;

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f2826;

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f2827;

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f2828;

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2876 = StringFog.decrypt("/fsj9axDkaro+zLel1Wu\n", "mp5XsMInwsk=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2875 = StringFog.decrypt("N4A9NVeh2tQ5gicjWKXe/DQ=\n", "UOVJdjbMqrU=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2874 = StringFog.decrypt("qBsjfZhwiG+iGzlZvXU=\n", "z35XLfQR6wo=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2873 = StringFog.decrypt("9oYZNehR4rPjth8b\n", "keNtd4k/jNY=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2872 = StringFog.decrypt("1p3ABm3x9Gg=\n", "sfi0RwmrnRg=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2871 = StringFog.decrypt("IJuZnBDLtLoSjIGPF8y+sSI=\n", "R/7tynmv0dU=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2870 = StringFog.decrypt("rrv8FgOcHO+gqO0cFQ==\n", "yd6IVXH5fZs=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2869 = StringFog.decrypt("YUa7UNIEqtZq\n", "BiPPEbZM3rs=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2868 = StringFog.decrypt("d671lTdQiKRig/W6Og==\n", "EMuB11Y+5sE=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2867 = StringFog.decrypt("A2Jb+Aj2KqYRdUzN\n", "ZAcvqGOReck=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2866 = StringFog.decrypt("8P4C+kIeWs3l9w==\n", "l5t2sjZzNpg=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2865 = StringFog.decrypt("UVJL+ebBrB5pYmni4cir\n", "HBAIloinxXk=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2864 = StringFog.decrypt("1o8lOp1wwDHNpBM6hVDRIfK7HiuT\n", "m813X+oRslU=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2863 = StringFog.decrypt("abtr8xFEYvxQgA==\n", "JPkqkGUtFJU=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2862 = StringFog.decrypt("Gfew1UaiEAUV1ofTXaYLEg==\n", "VLXzuivPf2s=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2861 = StringFog.decrypt("i2iMp+Gv+R6yQ7Gg9KbKDrJDs6Dhsw==\n", "xirFyZXKi20=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2860 = StringFog.decrypt("Xlcsw63z2jtnfBHEuPrgKX1xCcir\n", "ExVlrdmWqEg=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2859 = StringFog.decrypt("JiEAC9Aou4gfCj0MxSGfkg8GJi3FI62XDhE=\n", "a2NJZaRNyfs=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2858 = StringFog.decrypt("l8bT7ELG5SG+xP3aQt7MMrT2+NtV\n", "2pKUviexhFM=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2857 = StringFog.decrypt("y630FHiQZBzQhtMC\n", "hu+2dRb+AW4=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2856 = StringFog.decrypt("as8FOc/Yugdtxw05z8msBSfPHWOM94osaM4GctDsoQt+\n", "CaBoF6K6yG4=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2855 = StringFog.decrypt("i/HdPLI6+BnX6/ochT3zCw==\n", "pbyfftNUlnw=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2854 = StringFog.decrypt("MACBK0+57hc3CIkrT6j4FX0CjmdDtfIbIUGabEessjMRLY1rTL7uKTYNumxHrA==\n", "U2/sBSLbnH4=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2853 = StringFog.decrypt("CqTZhi8Q6nIMrMbJLlfpdQ2gmsojCuEoHq7W3isc8ygrudvfMRz2UACuww==\n", "acu0qEJ5hAY=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2852 = StringFog.decrypt("fKYmifRhzf9YgRg=\n", "MeRv5JUGqKk=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2851 = StringFog.decrypt("qT4Y1zOugBCuNhDXM7+WEuQmHJ05qYZXhxM8lD+rly+jNAI=\n", "ylF1+V7M8nk=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2850 = StringFog.decrypt("1EbOZVt/XEbTTsZlW25KRJlEwThfekBO20rMJltyQAHVSNAuGF9PXNJ+xilgdEtY\n", "tymjSzYdLi8=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2849 = StringFog.decrypt("niU7LH8gE1yZLTMsfzEFXtMnNHF7JQ9UkSk5b38tDxuKIzhmZCMPUNMdP2x2FABbmB0zYEQrBEI=\n", "/UpWAhJCYTU=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2848 = StringFog.decrypt("8AXwTkc69QX3DfhORyvjB70c9ARPN6kB/A7oDE92yi7hA/kHTw7uCPYFywlPLw==\n", "k2qdYCpYh2w=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2847 = StringFog.decrypt("GRlDb4xeXuUeEUtvjE9I51QARyWEUwLhFRJbLYQSYc4IH0omhGpN/w4zQCWiXV7oLB9LNg==\n", "enYuQeE8LIw=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2846 = StringFog.decrypt("DxBCHYsapFAIGEodiwuyUkIJRleDF/hUAxtaX4NWm3seFktUgza3TQUJSnaIHJVYHht5WoMP\n", "bH8vM+Z41jk=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2845 = StringFog.decrypt("VG5HVdbQ2NIdaU9d1tDJxB8jXlGc2NWOGWJMTZTYlO02f0Fcn9j5zB1uQ3us/OzJEXo=\n", "dA0oOPi9uqA=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2844 = StringFog.decrypt("dHrw8NWKYTZzcvjw1Zt3NDlj9Lrdhz0yeHHost3GXh1lfPm53apyLHJD9LvP\n", "FxWd3rjoE18=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2843 = StringFog.decrypt("iKhCfCK83KmPoEp8Iq3Kq8WxRjYqsYCthKNaPirw44KZrks1Kp3CqYisYjsht+2hmaN5Oyqp\n", "68cvUk/ersA=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2842 = StringFog.decrypt("liyEQTT6CAWRJIxBNOseB9s1gAs891QBmiecAzy2Ny6HKo0IPNsVAoEigAE86iwFkDQ=\n", "9UPpb1mYemw=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2841 = StringFog.decrypt("E4R9ntUZnx4UjHWe1QiJHF6dedTdFMMaH49l3N1VoDUCgnTX3TPYMh6PU9HKH7seFZw=\n", "cOsQsLh77Xc=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2840 = StringFog.decrypt("m3Ifbtn2n9ecehdu2eeJ1dZrGyTR+8PTl3kHLNG6oPyKdBYn0diM0Jx0HCfk9YrbrnQXNw==\n", "+B1yQLSU7b4=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2839 = StringFog.decrypt("/EhdpuBNu4b7QFWm4FythLFRWezoQOeC8ENF5OgBhK3tTlTv6H+ljuZGUuToeaCK\n", "nycwiI0vye8=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2838 = StringFog.decrypt("3A+2e/I+f37yN5JcyBdyZOcElVzN\n", "k2H7Ob9bGxc=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2837 = StringFog.decrypt("g/pZf3fBw/OE+llzccHP8rP8Qndq1g==\n", "x5U0Hh6vjpE=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2836 = StringFog.decrypt("EDFYEV7KkV4XOVARXtuHXF0/Vkta3opDCnBxUF7Jilk+HHZQXsWMWTI9QVZFwZdO\n", "c141PzOo4zc=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f2835 = StringFog.decrypt("1qrk4/xGHjjWqsDC31cSMdSh5Ofa\n", "sc+Qrr40d1w=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f2834 = StringFog.decrypt("AhJ5fNPOWFUCElhf+Mh4VQ==\n", "ZXcNMZG8MTE=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f2833 = StringFog.decrypt("lt54oDQtNg28wke1LykwDKnET7I=\n", "/60qxUNMRGk=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f2832 = StringFog.decrypt("fz/PQnUnLH18FNp9dQ==\n", "GFq7EBBQTQ8=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f2831 = StringFog.decrypt("wXXSXvejUA3CUctj57pF\n", "phCmDJLUMX8=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f2830 = StringFog.decrypt("vGRY7Ud5Tt6VVQ==\n", "8SYqhCMeK5c=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f2829 = StringFog.decrypt("F8WDxedaUA0jzw==\n", "RaD0pJU+GWM=\n");

    static {
        StringFog.decrypt("YPJSTUZQhDlJ8Hx7RkitKkPCeXpR\n", "LaYVHyMn5Us=\n");
        f2828 = StringFog.decrypt("HzGe1MIW7RAzAbjrzyDtCBoSstnKIfo=\n", "UnPcvaZEiGc=\n");
        f2827 = StringFog.decrypt("WTTAn12b57BiHdSka5v/mXEX5qFqjA==\n", "EHmCzQ/+kNE=\n");
        f2826 = StringFog.decrypt("61xN14lIYWTBb1PhiVBMf9ZNX+uJTQ==\n", "pTk6hew/ABY=\n");
        f2825 = StringFog.decrypt("LU3wh8/0+UUCWuOc5ML5XSJL86P7z+hL\n", "YyiHyo2mnDI=\n");
        f2824 = StringFog.decrypt("H5nit6KstmYYkeq3or2gZFKV4Pepp6MhHZX78LmnsHZSuOrugoyWaguX/f2Zp6BqE7fs7aa4rXsF\n", "fPaPmc/OxA8=\n");
        f2823 = StringFog.decrypt("JJ8vkQ29/BYJjjGlBbrg\n", "avpY02zOmVc=\n");
        f2822 = StringFog.decrypt("EBDv0gR+FjwXGOfSBG8APl0c7ZIPdQN7Ehz2lR91ECxdMeeLK30XMDIc9pUfdRAs\n", "c3+C/GkcZFU=\n");
        f2821 = StringFog.decrypt("6+uXHwdOW9bD0A==\n", "pqLaUmYgOrE=\n");
        f2820 = StringFog.decrypt("wO3n66V6\n", "hoyUn+4sIRQ=\n");
        f2819 = StringFog.decrypt("3hBiyYLy5g==\n", "jXEPrM+20wM=\n");
    }

    public C0971(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(StringFog.decrypt("xcBEdfTesVLF11FUzvSO\n", "oqUwOJ2wxTc=\n"), new C1169(this));
        hashMap.put(StringFog.decrypt("bo1PcosdARhujXVDhxs=\n", "Ceg7Iup+ank=\n"), new C1065(this));
        hashMap.put(StringFog.decrypt("oMarkiQeDkWS0bM=\n", "x6Pf0Uh3bS4=\n"), new C1064(this));
        hashMap.put(StringFog.decrypt("rtZaFmsNHjiww0s=\n", "ybMuWgJjdWw=\n"), new C1063(this));
        hashMap.put(StringFog.decrypt("kH1MsgiuRpOialQ=\n", "9xg4+2XPIfY=\n"), new C1062(this));
        hashMap.put(StringFog.decrypt("hUbEZJK+8fCQTw==\n", "4iOwLfHRn6U=\n"), new C1045(this));
        hashMap.put(StringFog.decrypt("7Z0Ky3QeYQ==\n", "ivh+ihBXBSs=\n"), new C1044(this));
        hashMap.put(StringFog.decrypt("PBjVwiJpG/U9K8jlNEYR3CYO1eUtYgc=\n", "T32hgEMHdZA=\n"), new C1000(this));
        hashMap.put(StringFog.decrypt("wJzXqM3Z7lTC\n", "p/mj6amNlyQ=\n"), new C0993(this));
        hashMap.put(f2876, new C0332(this));
        hashMap.put(f2875, new C0330(this));
        hashMap.put(f2874, new C0328(this));
        hashMap.put(f2873, new C1282(this));
        hashMap.put(f2872, new C1265(this));
        hashMap.put(f2871, new C1235(this));
        hashMap.put(f2870, new C1232(this));
        hashMap.put(f2869, new C1214(this));
        hashMap.put(f2868, new C1200(this));
        hashMap.put(f2867, new C1178(this));
        hashMap.put(f2866, new C1164(this));
        hashMap.put(f2835, new C1140(this));
        hashMap.put(f2834, new C1136(this));
        hashMap.put(f2833, new C1133(this));
        hashMap.put(f2832, new C1091(this));
        hashMap.put(f2831, new C1089(this));
        hashMap.put(StringFog.decrypt("nS3S4LAEoiCfHs/KtB+fJJsrzce/F5giiCHIyQ==\n", "+kimrtFwy1Y=\n"), new C1078(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final String mo5371() {
        C1174 c1174 = C0391.m5393().f502;
        String decrypt = StringFog.decrypt("0DTqcGSnqxSaNeo6cKfhYtA0\n", "/h62FE/7hUg=\n");
        c1174.getClass();
        return C1174.m5899((Object) null, MBConfiguration.class, decrypt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x04ed, code lost:
    
        if (r15.equals(com.ironsource.adqualitysdk.sdk.i.C0971.f2824) != false) goto L345;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class mo5370(String str) {
        char c;
        char c2 = 5;
        switch (str.hashCode()) {
            case -2107186802:
                if (str.equals(StringFog.decrypt("Nca3C/9zH/A3zrAW7Hg75g==\n", "e6fDYokWXpQ=\n"))) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1980005015:
                if (str.equals(StringFog.decrypt("WbIPK2wHbkl8tgoQYAxt\n", "DtdtfQViGQ8=\n"))) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1945308362:
                if (str.equals(f2846)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1940754118:
                if (str.equals(StringFog.decrypt("PXRNOrIgK5w2RX8ttCg+gQhv\n", "fBY+TsBBSOg=\n"))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1874906197:
                if (str.equals(StringFog.decrypt("9Jqdk+8Fsm/VpZKU/ieuavqSgYPcC6V5\n", "ufPz54piwA4=\n"))) {
                    c = GMTDateParser.ANY;
                    break;
                }
                c = 65535;
                break;
            case -1850171958:
                if (str.equals(f2855)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1766796574:
                if (str.equals(StringFog.decrypt("adQ8OY3G195G1iM5lcTPxVTBLT6e0Q==\n", "J7VIUPujg6w=\n"))) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1728440643:
                if (str.equals(f2848)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -1702626105:
                if (str.equals(StringFog.decrypt("za9yAzfnzArskHUTN+/oAuWx\n", "gMYcd1KAvms=\n"))) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -1679044855:
                if (str.equals(f2838)) {
                    c = Typography.less;
                    break;
                }
                c = 65535;
                break;
            case -1656370481:
                if (str.equals(StringFog.decrypt("g/zxqNw88JeD8P2a4zjp\n", "1JWfzIpdnvI=\n"))) {
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case -1358506046:
                if (str.equals(f2856)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1355055839:
                if (str.equals(f2847)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -1346045035:
                if (str.equals(f2850)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1119480813:
                if (str.equals(f2837)) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case -1091491584:
                if (str.equals(f2854)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1058625022:
                if (str.equals(StringFog.decrypt("aylJmHEApC9LNFyXcxivHnkjWp9mBZE0\n", "OEAu9hBs5U0=\n"))) {
                    c = Typography.greater;
                    break;
                }
                c = 65535;
                break;
            case -920590771:
                if (str.equals(StringFog.decrypt("Y0laYw99++lCY1t5Hnvg5ktSYn4PbQ==\n", "LiA0F2oaiYg=\n"))) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -894298414:
                if (str.equals(StringFog.decrypt("AigwL9dloVsjDT811mu9XR8gOT7ka7ZN\n", "T0FeW7IC0zo=\n"))) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -667901878:
                if (str.equals(StringFog.decrypt("POg5lOgw/okdyWKl4zPPiQPlAYnoIA==\n", "cYFX4I1XjOg=\n"))) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case -610610019:
                if (str.equals(f2829)) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case -495785498:
                if (str.equals(f2864)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -453012127:
                if (str.equals(f2865)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -374448056:
                if (str.equals(f2840)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -323393690:
                if (str.equals(f2857)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -239039370:
                if (str.equals(f2836)) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case -156796625:
                if (str.equals(StringFog.decrypt("DSAROYxc+pMsCx4+jG3hlzc=\n", "QEl/Tek7iPI=\n"))) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -126256187:
                if (str.equals(StringFog.decrypt("Z+WFRxDnTPxK7YNDCu5N+Fw=\n", "LqHqMH6LI50=\n"))) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -121577375:
                if (str.equals(StringFog.decrypt("Tq3mUuomhs9vt8xt\n", "A+SIJo9B9K4=\n"))) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -75274960:
                if (str.equals(StringFog.decrypt("sFNVbiMr9Yo=\n", "8zI4HkJCkuQ=\n"))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -33766813:
                if (str.equals(StringFog.decrypt("gbZ25P2Cxiq8sWPt2ZjWJqeUa/L7lNwmug==\n", "yNgCgY/xskM=\n"))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 114573451:
                if (str.equals(f2852)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 154057692:
                if (str.equals(StringFog.decrypt("ZzInZpiU46ZGOCZ8jofwqVk=\n", "KntJEv3zkcc=\n"))) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 174921027:
                if (str.equals(f2842)) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 329817920:
                if (str.equals(StringFog.decrypt("BOo86LRl1gMy6iTFr3L0DzjqOQ==\n", "Vo9LicYBgGo=\n"))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 336960212:
                if (str.equals(StringFog.decrypt("dijwra5LVyBgJ/Sp\n", "NUmd3c8iME4=\n"))) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 373899945:
                if (str.equals(f2860)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 427609920:
                if (str.equals(f2841)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (str.equals(StringFog.decrypt("wsrAtjC5+/nfzdW/\n", "q6S000LKj5A=\n"))) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 675209731:
                if (str.equals(StringFog.decrypt("MKzh5FiIu0k2tQ==\n", "c82MlDnh3Cc=\n"))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 713779451:
                if (str.equals(StringFog.decrypt("GQX9mYlT/9A4L/+Ej1/A2DoF0IyeUNvYMRs=\n", "VGyT7ew0jbE=\n"))) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 745946635:
                if (str.equals(StringFog.decrypt("Ez+fkEz4ybIuKo6XX+8=\n", "XV7r+Tqdhds=\n"))) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 824636291:
                if (str.equals(StringFog.decrypt("pzo/vRbszomLOwStEPbOnpoxJb0W\n", "7lRL2GS6p+0=\n"))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 858158177:
                if (str.equals(f2839)) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 888727913:
                if (str.equals(StringFog.decrypt("w2BdhrZpFqriene5lW8Hv+FbSg==\n", "jikz8tMOZMs=\n"))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 892841421:
                if (str.equals(StringFog.decrypt("Qt3ANxig8cNpytg=\n", "AK+vQGvFg5U=\n"))) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 897829864:
                if (str.equals(StringFog.decrypt("m6WAnyLdClSwoYQ=\n", "2cTz+nW4aAI=\n"))) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case 950749305:
                if (str.equals(f2844)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 989671232:
                if (str.equals(StringFog.decrypt("Sgf3tL0Vzy5rIPi0sQTYCmkK2qGqFusmYhk=\n", "B26ZwNhyvU8=\n"))) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                c = 65535;
                break;
            case 1014009286:
                if (str.equals(StringFog.decrypt("fIgy/THDFLJdojDgN88lh3C3Newj\n", "MeFciVSkZtM=\n"))) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 1050400725:
                if (str.equals(f2849)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 1074855404:
                if (str.equals(StringFog.decrypt("TbTn6oHEUXRsjeX/ncJBeWWL4PuT\n", "AN2JnuSjIxU=\n"))) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                c = 65535;
                break;
            case 1118286493:
                if (str.equals(f2851)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1139753057:
                if (str.equals(StringFog.decrypt("AyVR65qNP1osIUz6\n", "QUQijtz/Xj0=\n"))) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(StringFog.decrypt("7oW5Px0CThvTgqw2IxhJBsKFqCg=\n", "p+vNWm9xOnI=\n"))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1331885131:
                if (str.equals(StringFog.decrypt("cbfO/h6gtl9erMbsHrqo\n", "PdivmnfO0R4=\n"))) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1342927760:
                if (str.equals(f2861)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1357502028:
                if (str.equals(StringFog.decrypt("zaYrIfWLGvjjuQoj+4E1/w==\n", "jslGTJrlUI0=\n"))) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1424096196:
                if (str.equals(f2863)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1492060322:
                if (str.equals(f2830)) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 1505622627:
                if (str.equals(StringFog.decrypt("SC1iKRr20blGJX8zGur1rw==\n", "CkwMR3+EkN0=\n"))) {
                    c = C4761z5.U;
                    break;
                }
                c = 65535;
                break;
            case 1664904176:
                if (str.equals(f2845)) {
                    c = FileSystemKt.UnixPathSeparator;
                    break;
                }
                c = 65535;
                break;
            case 1855930960:
                if (str.equals(f2859)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1884374718:
                if (str.equals(f2858)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2041991951:
                if (str.equals(f2862)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2073767153:
                if (str.equals(f2843)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 2118015322:
                if (str.equals(f2853)) {
                    c = 26;
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
                return MBConfiguration.class;
            case 1:
                return MBridgeSDKFactory.class;
            case 2:
                return MBRewardVideoActivity.class;
            case 3:
                return AbstractJSActivity.class;
            case 4:
                return MBBaseActivity.class;
            case 5:
                return MBCommonActivity.class;
            case 6:
                return Campaign.class;
            case 7:
                return CampaignEx.class;
            case '\b':
                return InterVideoOutListener.class;
            case '\t':
                return InterstitialVideoListener.class;
            case '\n':
                return RewardVideoListener.class;
            case 11:
                return MBInterstitialActivity.class;
            case '\f':
                return InterstitialListener.class;
            case '\r':
            case 14:
                return MBBannerView.class;
            case 15:
            case 16:
                return MBBannerWebView.class;
            case 17:
                return MBInterstitialHandler.class;
            case 18:
                return MBInterstitialVideoHandler.class;
            case 19:
                return MBRewardVideoHandler.class;
            case 20:
                return NativeListener.class;
            case 21:
                return NativeListener.NativeTrackingListener.class;
            case 22:
                return NativeListener.NativeAdListener.class;
            case 23:
                return CampaignUnit.class;
            case 24:
                return BaseFragment.class;
            case 25:
            case 26:
                return BrowserView.class;
            case 27:
                return WebViewFragment.class;
            case 28:
                return CommonJumpLoader.class;
            case 29:
            case 30:
                return MBImageView.class;
            case 31:
                return MBridgeSDK.class;
            case ' ':
                return MBridgeConstans.class;
            case '!':
                return LoadingActivity.class;
            case '\"':
                return IDownloadListener.class;
            case '#':
                return interstitial.class;
            case '$':
            case '%':
                return BaseWebView.class;
            case '&':
            case '\'':
                return WindVaneWebView.class;
            case '(':
            case ')':
                return MBridgeVideoView.class;
            case '*':
            case '+':
                return MBridgeVastEndCardView.class;
            case ',':
            case '-':
                return MBridgeNativeEndCardView.class;
            case '.':
            case '/':
                return MBridgeClickCTAView.class;
            case '0':
            case '1':
                return MBridgeBaseView.class;
            case '2':
            case '3':
                return MBridgeClickMiniCardView.class;
            case '4':
            case '5':
                return MBridgeContainerView.class;
            case '6':
            case '7':
                return MBridgeH5EndCardView.class;
            case '8':
            case '9':
                return MBridgeLandingPageView.class;
            case ':':
            case ';':
                return MBridgePlayableView.class;
            case '<':
                return OnMBMediaViewListener.class;
            case '=':
                return BannerAdListener.class;
            case '>':
                return AbstractJSActivity.class;
            case '?':
            case '@':
                return DomainMBCommonActivity.class;
            case 'A':
                return MBridgeIds.class;
            case 'B':
                return RewardInfo.class;
            default:
                switch (str.hashCode()) {
                    case -1789471684:
                        if (str.equals(f2821)) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1613020512:
                        if (str.equals(f2823)) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1258619456:
                        if (str.equals(f2826)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -828904331:
                        break;
                    case -765829320:
                        if (str.equals(f2819)) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 450781617:
                        if (str.equals(f2822)) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 834115686:
                        if (str.equals(f2828)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1499766450:
                        if (str.equals(f2827)) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1884374718:
                        if (str.equals(f2858)) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2024253542:
                        if (str.equals(f2825)) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2097161959:
                        if (str.equals(f2820)) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        return com.mbridge.msdk.newout.MBRewardVideoHandler.class;
                    case 1:
                        return MBBidRewardVideoHandler.class;
                    case 2:
                        return IMBRRewardVideoHandler.class;
                    case 3:
                        return com.mbridge.msdk.newout.RewardVideoListener.class;
                    case 4:
                    case 5:
                        return com.mbridge.msdk.config.activity.MBRewardVideoActivity.class;
                    case 6:
                    case 7:
                        return BaseActivity.class;
                    case '\b':
                        return MIMManager.class;
                    case '\t':
                        return FastKV.class;
                    case '\n':
                        return SameMD5.class;
                    default:
                        return null;
                }
        }
    }
}
