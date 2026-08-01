package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.adcom.Ad;
import com.ironsource.adqualitysdk.sdk.StringFog;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ף, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0582 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1405 = StringFog.decrypt("qITPugrSo7OumPqaDg==\n", "z+G7/mOh098=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1404 = StringFog.decrypt("LUzXYUb9ZgQLTc4=\n", "SimjNy+ZA2s=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1403 = StringFog.decrypt("dPtvR3gdMh168A==\n", "E54bBhxyX3w=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1402 = StringFog.decrypt("UM+mFEYwhz9e3LceUA==\n", "N6rSVzRV5ks=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1401 = StringFog.decrypt("FAHIOOBeCLUW\n", "c2S8epUwbNk=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1400 = StringFog.decrypt("r/WuARhFoiyp6Q==\n", "yJDaRXE20kA=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1399 = StringFog.decrypt("IqFHHz51fvMkvXE6OWhr7Q==\n", "RcQzW1cGDp8=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1398 = StringFog.decrypt("9s41+9n7EOvj7jnN6OcR+v7nKMrM\n", "katBubiVfo4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1397 = StringFog.decrypt("njUDVYBIc40=\n", "+VB3A+ksFuI=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f1396 = StringFog.decrypt("bvekJx2PTEhm5r8uDIho\n", "CZLQYmX7HDo=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f1395 = StringFog.decrypt("/L8uClqszh/vqDMmRA==\n", "m9paSCPYq0w=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f1394 = StringFog.decrypt("jvAMsjhN31qC7iy4OE3fWoLu\n", "7Il412s5rTM=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f1393 = StringFog.decrypt("ROCwIe+8fi9O4KoFyrk=\n", "I4XEcYPdHUo=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f1392 = StringFog.decrypt("kKqz7I8oefCS\n", "98/Hret8AIA=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1391 = StringFog.decrypt("rlP7oiyAi7C7f+s=\n", "yTaP8Uns59U=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1390 = StringFog.decrypt("JWCwLNn7jJ0lca0R3u6Foz92sADZ6ps=\n", "VgXEZbeP6e8=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f1389 = StringFog.decrypt("E3gTExTce7kEeAMNGNhurg54FQ==\n", "YB1nQXGrGss=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f1388 = StringFog.decrypt("+EB7m8cLUKv5aWaq0gBQq/k=\n", "iyUP2aZlPs4=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1387 = StringFog.decrypt("BA2qF6IVbaIxPZAIqQ==\n", "RWnpeMxhCMw=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1386 = StringFog.decrypt("/sPCRcP7DazG\n", "v6eGLLCLYc0=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1385 = StringFog.decrypt("pkmMAMEMkA==\n", "5y3aaaVp/yE=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1384 = StringFog.decrypt("eg8TV1yhD8VJDjBMfKQv0l4FMFA=\n", "O2tVIjDNXKY=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1383 = StringFog.decrypt("uIBo0tFqLKOclg==\n", "+eQku6IeSc0=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1382 = StringFog.decrypt("1czbvEhV5n7g\n", "lKiJ2Tkggw0=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1381 = StringFog.decrypt("LxvBrUEAWY0aL/K6URhZigsN4A==\n", "bn+TyDB1PP4=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1380 = StringFog.decrypt("BUNDySWxLQ==\n", "RCcwnVzBSOg=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1379 = StringFog.decrypt("jNdZ9lqQ\n", "zbMPnz/n54Y=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1378 = StringFog.decrypt("EBHKA3C4rfAhBMEDcLg=\n", "UnCkbRXK4Zk=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1377 = StringFog.decrypt("aOLz2Fu4Qg5P9A==\n", "KoOdtj7KFGc=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1376 = StringFog.decrypt("brZ6mbZIrB5ksT2VugKjHmm3MYnxbqARabwmrbZJtg==\n", "B9lU+98swX8=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1375 = StringFog.decrypt("1tSWRRIsMKP62A==\n", "lL3yCHNPWMo=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1374 = StringFog.decrypt("AbLV4qyLw3gtvvDL\n", "Q9uxr83oqxE=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1373 = StringFog.decrypt("fPS0mRCly0Z56aOVBbg=\n", "P4bR+GTMvSM=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1372 = StringFog.decrypt("ktaR4BxYIYu6\n", "27vwh3kcQP8=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1371 = StringFog.decrypt("EzAxIQ6Q6O0uNyQoPYc=\n", "Wl5FRHzjnIQ=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1370 = StringFog.decrypt("dBjcJLM4cYtJH8ktjSJ2llgYzTM=\n", "PXaoQcFLBeI=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1369 = StringFog.decrypt("SmbvNtku7PxpfcI+\n", "DBODWopNnpk=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1368 = StringFog.decrypt("SHSYRa5XHIFgZahVv3M=\n", "BRH8LM8Wb/I=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f1367 = StringFog.decrypt("HSQ5uGeA5NUn\n", "UEFd0QbWjbA=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f1366 = StringFog.decrypt("x+RyD66SpSXN4zUDotimJdriKgimkuYyx+4rQ4qTrC3P3TUIsA==\n", "rotcbcf2yEQ=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f1365 = StringFog.decrypt("X4AK0/W9XlI=\n", "EeF+uoPYHzY=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f1364 = StringFog.decrypt("mxlQ+GENTXCmDEH/cho=\n", "1XgkkRdoARk=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f1363 = StringFog.decrypt("3Fr35xsM0p/2UuLYBAzo\n", "kjuDjm1pn/o=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f1362 = StringFog.decrypt("zJLI8NsSY3ffkw==\n", "nve/kal2BhM=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f1361 = StringFog.decrypt("J3ZqW4Og/FQ5em5OlKr8Qg==\n", "dRMdOvHEmTA=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f1360 = StringFog.decrypt("tguwowFO/jCFLrq4OE70PJY=\n", "5GLTy0wrmlk=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f1359 = StringFog.decrypt("vAWy9UQTfLqPOrj4fg==\n", "7mzRnQl2GNM=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f1358 = StringFog.decrypt("0d7e5nuQRWvb2Znqd9paY9vZneF2nUkk6tiT7F+RTGPZ55nhZQ==\n", "uLHwhBL0KAo=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f1357 = StringFog.decrypt("cRCL159FBQleHJ3zk2EAHk4Nlg==\n", "J3nvsvAVaWg=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f1356 = StringFog.decrypt("jT+vQy+4FB6HOOhPI/IXHpA590QnuFcJjTX2DxC1HRqLAO1AP7kLPock6FcvqAA=\n", "5FCBIUbceX8=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f1355 = StringFog.decrypt("ktRQkDZ6AIe4xUSLIGAbrA==\n", "wLEh5VMJdMI=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f1354 = StringFog.decrypt("d3s=\n", "Nh8re5/D4GI=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f1353 = StringFog.decrypt("v5jY6FyZ366bnND1QQ==\n", "8uq5gTjYvNo=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f1352 = StringFog.decrypt("ByVpzEuekNcLOGGRWoeD0EojZYAAi5LaDS4qr1yHid8lKXCLWI+Uwg==\n", "ZEoE4i7m4Ls=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f1351 = StringFog.decrypt("TI8TIwwBxUNtkhULCzHFVGiJCw==\n", "Af1ySmhFrCI=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f1350 = StringFog.decrypt("8PSDBhbIPKH86YtbB9Evpr3yj0pd3T6s+v/AZQHRJanX8o9EHNcNrufymEEHyQ==\n", "k5vuKHOwTM0=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f1349 = StringFog.decrypt("k4PeauuZR5q7g8x35qRAj7I=\n", "3vG/A4/QKe4=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f1348 = StringFog.decrypt("fkM4a11cUb5WQyp2UGFWq199MHFNcFGvQQ==\n", "MzFZAjkVP8o=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f1347 = StringFog.decrypt("cxldmjc127NJ\n", "Pms881NjstY=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f1346 = StringFog.decrypt("bHSyA8qFQIJgabpe25xThSFyvk+BkEKPZn/xYN2cWYpZcrpa\n", "DxvfLa/9MO4=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f1345 = StringFog.decrypt("iiqrldckH52wFKOPxxcYnbU=\n", "x1jK/LNydvg=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f1344 = StringFog.decrypt("rM5YSrKmEUeMxl9H\n", "+q8rPvPFZS4=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f1343 = StringFog.decrypt("X0aDV7HK2H1TW4sKoNPLehJAjxv6xMliSAePGqDb3nhIUMAvtcHcUF9dhw+9xtE=\n", "PCnuedSyqBE=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f1342 = StringFog.decrypt("CCsXoU38wzU=\n", "Xkpk1RuVpkI=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f1341 = StringFog.decrypt("NWoYaBxy+go5dxA1DWvpDXhsFCRXfOsVIisUJQ1j/A8ifFsQGHn+MD9gAg==\n", "VgV1RnkKimY=\n");

    /* renamed from: ۉ, reason: contains not printable characters */
    public static final String f1340 = StringFog.decrypt("iDt1aQxbybCsLGM=\n", "xUkUAGgareY=\n");

    /* renamed from: ۅ, reason: contains not printable characters */
    public static final String f1339 = StringFog.decrypt("qQ2KcB6TgvWlEIItD4qR8uQLhjxVhoD4owbJEwmKm/2LBrE3Hpw=\n", "ymLnXnvr8pk=\n");

    /* renamed from: ڑ, reason: contains not printable characters */
    public static final String f1338 = StringFog.decrypt("lWSIuz9W4AaPbIi7DFHgAw==\n", "wwX7z2k/hXE=\n");

    public C0582(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        try {
            C1174 c1174 = C0391.m5393().f502;
            String decrypt = StringFog.decrypt("D5M6e9fYIMF6kzoE\n", "Uc9eIIu8Dpw=\n");
            c1174.getClass();
            return C1174.m5899((Object) null, BidMachine.class, decrypt);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1405, new C0665(this));
        hashMap.put(f1404, new C0659(this));
        hashMap.put(f1401, new C0657(this));
        hashMap.put(f1400, new C0646(this));
        hashMap.put(f1399, new C0635(this));
        hashMap.put(f1398, new C0626(this));
        hashMap.put(f1397, new C0612(this));
        hashMap.put(f1403, new C0611(this));
        hashMap.put(f1402, new C0595(this));
        hashMap.put(f1393, new C0689(this));
        hashMap.put(f1392, new C0684(this));
        hashMap.put(f1391, new C0681(this));
        hashMap.put(f1390, new C0678(this));
        hashMap.put(f1389, new C0677(this));
        hashMap.put(f1388, new C0675(this));
        hashMap.put(f1396, new C0674(this));
        hashMap.put(f1395, new C0672(this));
        hashMap.put(f1394, new C0669(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2127904484:
                if (str.equals(f1360)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -2032115546:
                if (str.equals(f1373)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1921270373:
                if (str.equals(f1344)) {
                    c = GMTDateParser.ANY;
                    break;
                }
                c = 65535;
                break;
            case -1798479256:
                if (str.equals(f1343)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -1683121555:
                if (str.equals(f1374)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1628534628:
                if (str.equals(f1347)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1627944928:
                if (str.equals(f1378)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1518365947:
                if (str.equals(f1338)) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -1507727624:
                if (str.equals(f1366)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1371195010:
                if (str.equals(f1369)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1246480821:
                if (str.equals(f1357)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1146475727:
                if (str.equals(f1342)) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                c = 65535;
                break;
            case -1087582685:
                if (str.equals(f1349)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1011229113:
                if (str.equals(f1350)) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case -838844802:
                if (str.equals(f1341)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -642689680:
                if (str.equals(f1345)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f1362)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -589219056:
                if (str.equals(f1387)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -572702516:
                if (str.equals(f1382)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -475472046:
                if (str.equals(f1384)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -211807062:
                if (str.equals(f1375)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -150492023:
                if (str.equals(f1367)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f1354)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1282165:
                if (str.equals(f1346)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 3368703:
                if (str.equals(f1386)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 141091039:
                if (str.equals(f1352)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f1371)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 503762424:
                if (str.equals(f1385)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 529939434:
                if (str.equals(f1380)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 625873720:
                if (str.equals(f1339)) {
                    c = FileSystemKt.UnixPathSeparator;
                    break;
                }
                c = 65535;
                break;
            case 713768498:
                if (str.equals(f1363)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 737636858:
                if (str.equals(f1356)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 742497451:
                if (str.equals(f1358)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 745946635:
                if (str.equals(f1364)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f1377)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1125320581:
                if (str.equals(f1372)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1165508119:
                if (str.equals(f1383)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1212533506:
                if (str.equals(f1361)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(f1370)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1387614166:
                if (str.equals(f1381)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1395486086:
                if (str.equals(f1353)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1444286894:
                if (str.equals(f1351)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1461955341:
                if (str.equals(f1359)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1494941328:
                if (str.equals(f1355)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1917129446:
                if (str.equals(f1368)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1955913096:
                if (str.equals(f1379)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2034998687:
                if (str.equals(f1340)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 2110329530:
                if (str.equals(f1365)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2112955383:
                if (str.equals(f1348)) {
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case 2136410007:
                if (str.equals(f1376)) {
                    c = 11;
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
                return AdContentType.class;
            case 1:
                return Ad.Display.class;
            case 2:
                return Ad.Video.class;
            case 3:
                return AdFullScreenListener.class;
            case 4:
                return AdListener.class;
            case 5:
                return AdRequest.class;
            case 6:
                return AdRequestParameters.class;
            case 7:
                return AdsType.class;
            case '\b':
                return AdView.class;
            case '\t':
                return BannerListener.class;
            case '\n':
            case 11:
                return BannerView.class;
            case '\f':
                return BidMachine.class;
            case '\r':
                return BidMachineAd.class;
            case 14:
                return CreativeFormat.class;
            case 15:
                return ImageData.class;
            case 16:
                return InterstitialAd.class;
            case 17:
                return InterstitialListener.class;
            case 18:
                return FullScreenAd.class;
            case 19:
                return MediaAssetType.class;
            case 20:
            case 21:
                return MediaView.class;
            case 22:
                return NativeAd.class;
            case 23:
                return NativeListener.class;
            case 24:
                return NativeMediaView.class;
            case 25:
                return RewardedAd.class;
            case 26:
                return RewardedListener.class;
            case 27:
                return RichMediaListener.class;
            case 28:
            case 29:
                return RichMediaView.class;
            case 30:
            case 31:
                return VideoPlayerActivity.class;
            case ' ':
                return Ad.class;
            case '!':
            case '\"':
                return MraidActivity.class;
            case '#':
            case '$':
                return MraidDialogActivity.class;
            case '%':
                return MraidInterstitial.class;
            case '&':
                return MraidInterstitialListener.class;
            case '\'':
            case '(':
                return MraidView.class;
            case ')':
                return MraidViewListener.class;
            case '*':
            case '+':
                return VastActivity.class;
            case ',':
            case '-':
                return VastView.class;
            case '.':
            case '/':
                return MraidAdView.class;
            case '0':
                return VastViewListener.class;
            case '1':
                return RequestExtension.class;
            default:
                return null;
        }
    }
}
