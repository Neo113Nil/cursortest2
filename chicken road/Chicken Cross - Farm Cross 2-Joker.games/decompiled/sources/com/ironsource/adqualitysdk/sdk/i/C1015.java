package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṫ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1015 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3023 = StringFog.decrypt("q8aqoDGvKlu4yrGDGaotW6vGrKQ6uDdbosC7\n", "zKPe7VTLQzo=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3022 = StringFog.decrypt("sNFyCgyUnsSy5GoqC6WK0bnAUjIYpQ==\n", "17QGS2jA57Q=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3021 = StringFog.decrypt("6LFTLStGbwv8p04LKHJ8Gu6ESwUlU3AL4aBzHTZT\n", "j9QnZEY2HW4=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3020 = StringFog.decrypt("kmppEZW5KouGfHQ3lo05mpRdeDacrCqHm2hOPJM=\n", "9Q8dWPjJWO4=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3019 = StringFog.decrypt("I2xQF7QvGOE3ek0xtxsL8CVbQTC9OhjtKm53OrIJD/Y3YEsw\n", "RAkkXtlfaoQ=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3018 = StringFog.decrypt("MiFGw/kC4AAmN1vl+jbzETQAV+f1HPY2OjFA6fE=\n", "VUQyipRykmU=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3017 = StringFog.decrypt("cRFohPWOswllB3Wi9rqgGHcifb/xn68YXxA=\n", "FnQczZj+wWw=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3016 = StringFog.decrypt("oRoclCi70EG1DAGyK4/DUKcxDakVqttLsws=\n", "xn9o3UXLoiQ=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3015 = StringFog.decrypt("u4FVn7m5Styvl0i5uo1Zzb2nU7O1vVHPua1F\n", "3OQh1tTJOLk=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3014 = StringFog.decrypt("kwLElVOS94KHFNmzUKbkk5Um1KpbkPGOhwLCmFGP5I6a\n", "9Gew3D7ihec=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3013 = StringFog.decrypt("U0nbJH/EFadHX8YCfPAGtlVvzgBi1Q6lWmXL\n", "NCyvbRK0Z8I=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3012 = StringFog.decrypt("dzIMFrv/964=\n", "EFd4V8uPvso=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3011 = StringFog.decrypt("OC9ydNu2980=\n", "X0oGJ6/Zhag=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3010 = StringFog.decrypt("xUP/egBhTD3HVMhUCmZVLtdU6k8Nb1I6\n", "oiaLO2QAPEk=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3009 = StringFog.decrypt("52LzWMFrmX/tYul87G6uY/Bi\n", "gAeHCK0K+ho=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3008 = StringFog.decrypt("0p2KgMWoLKHYnZCk56gioQ==\n", "tfj+0KnJT8Q=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f3007 = StringFog.decrypt("oIH8b+XSZD2qgeZL+vtmNqOI7U0=\n", "x+SIP4mzB1g=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3006 = StringFog.decrypt("Choq/WcjIwQIOjDJbg==\n", "bX9evAN3WnQ=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3005 = StringFog.decrypt("W72WtVTSE1BbrIuIU8cabkGrlplUwwQ=\n", "KNji/DqmdiI=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3004 = StringFog.decrypt("Wkx6nIZQbQFNTGqCilR4FkdMfA==\n", "KSkOzuMnDHM=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3003 = StringFog.decrypt("cJUI9OIOeEpwlA/09A==\n", "EeZ7kZB6Kz4=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3002 = StringFog.decrypt("1Frms/0idw==\n", "kjuPwb9LE7U=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3001 = StringFog.decrypt("Wf8AAGQntWp61wUHZDS5dw==\n", "FJpkaQVT3AU=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3000 = StringFog.decrypt("hZWd1z6h\n", "xPHJrk7E6IA=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2999 = StringFog.decrypt("xeVeRcwFgsvj\n", "hIEtBqNr5KI=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2998 = StringFog.decrypt("s9Kl2+V2EGqQ9K7c4mse\n", "/rfBsoQCeQU=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2997 = StringFog.decrypt("IKkuUHY3Og0EtgdSfT4zBgI=\n", "cMVPMxNaX2M=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2996 = StringFog.decrypt("DNZ4nBgoLrwo\n", "XLoZ/31FS9I=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2995 = StringFog.decrypt("7/EwpGRJ66zS9iWtWlPsscPxIbM=\n", "pp9EwRY6n8U=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2994 = StringFog.decrypt("5XUhN7fFijP7eSUioM+KJQ==\n", "txBWVsWh71c=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2993 = StringFog.decrypt("bzvVJoDsO1VJOOE1kf4=\n", "JlalVOWfSDw=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2992 = StringFog.decrypt("LlnEjYwKomQTXtGE\n", "Zzew6P551g0=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2991 = StringFog.decrypt("m2eogouE5ly/X7CRiw==\n", "ywvJ4e7pgzI=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2990 = StringFog.decrypt("3NGbyivnhvE=\n", "jrTsq1mD45U=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2989 = StringFog.decrypt("NK6aquiUyxcIqIY=\n", "Z8b13afkv34=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2988 = StringFog.decrypt("ZMaKS367Be8=\n", "J6fpIxvfRIs=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2987 = StringFog.decrypt("X/yLkdXOoLp1+I+S384=\n", "EZn/5rq8y/s=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2986 = StringFog.decrypt("D9sJsazFC4oh0AQ=\n", "Tr9owdigedo=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2985 = StringFog.decrypt("qL3QhAg/IdSGt9edGy8h9p2w3po=\n", "6dmx9HxaU5c=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2984 = StringFog.decrypt("9lXirqiU0j/WQuo=\n", "syOHwNzHpk0=\n");

    public C1015(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        try {
            try {
                return (String) FairBid.class.getDeclaredField(StringFog.decrypt("sEI91e8uLuOqSTg=\n", "4wZ2irlrfLA=\n")).get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            C1174 c1174 = C0391.m5393().f502;
            String decrypt = StringFog.decrypt("OzGmkOuXLHE4MaaQ65cscTgxppDrl1M=\n", "ZWr69La8d18=\n");
            c1174.getClass();
            return C1174.m5899((Object) null, FairBid.class, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3023, new C1156(this));
        hashMap.put(f3022, new C1080(this));
        hashMap.put(f3021, new C1049(this));
        hashMap.put(f3020, new C1048(this));
        hashMap.put(f3019, new C1047(this));
        hashMap.put(f3018, new C1046(this));
        hashMap.put(f3017, new C1026(this));
        hashMap.put(f3016, new C1023(this));
        hashMap.put(f3015, new C1017(this));
        hashMap.put(f3014, new C1289(this));
        hashMap.put(f3013, new C1281(this));
        hashMap.put(f3012, new C1273(this));
        hashMap.put(f3011, new C1271(this));
        hashMap.put(f3010, new C1264(this));
        hashMap.put(f3009, new C1263(this));
        hashMap.put(f3008, new C1250(this));
        hashMap.put(f3007, new C1249(this));
        hashMap.put(f3006, new C1220(this));
        hashMap.put(f3005, new C1180(this));
        hashMap.put(f3004, new C1141(this));
        hashMap.put(f3003, new C1125(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2041833493:
                if (str.equals(f2986)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1598046662:
                if (str.equals(f2998)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f2993)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -847426041:
                if (str.equals(f2985)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f2996)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -368841467:
                if (str.equals(f2988)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -174936018:
                if (str.equals(f2990)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(f2991)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 438795617:
                if (str.equals(f2987)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 578208537:
                if (str.equals(f3002)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 769047372:
                if (str.equals(f2992)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 806552769:
                if (str.equals(f2989)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1062384924:
                if (str.equals(f2997)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1212533506:
                if (str.equals(f2994)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(f2995)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1775008410:
                if (str.equals(f2984)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1884304309:
                if (str.equals(f3001)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1955869213:
                if (str.equals(f3000)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1969669106:
                if (str.equals(f2999)) {
                    c = 3;
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
                return FairBid.class;
            case 1:
                return MediationManager.class;
            case 2:
                return Constants.AdType.class;
            case 3:
                return FairBid.AdsConfig.class;
            case 4:
                return MediationConfig.class;
            case 5:
                return PlacementsHandler.class;
            case 6:
                return Placement.class;
            case 7:
                return InterstitialListener.class;
            case '\b':
                return RewardedListener.class;
            case '\t':
                return ImpressionData.class;
            case '\n':
                return Interstitial.class;
            case 11:
                return PlacementType.class;
            case '\f':
                return Rewarded.class;
            case '\r':
                return ShowOptions.class;
            case 14:
                return CachedAd.class;
            case 15:
                return NetworkAdapter.class;
            case 16:
                return AdapterPool.class;
            case 17:
                return AdapterConfiguration.class;
            case 18:
                return EventStream.class;
            default:
                return null;
        }
    }
}
