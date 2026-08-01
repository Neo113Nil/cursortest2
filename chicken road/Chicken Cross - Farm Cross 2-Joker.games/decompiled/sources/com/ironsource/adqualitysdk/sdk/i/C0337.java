package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Tap;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.VideoContentListenerAdapter;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IArichMediaVideoView;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ĵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0337 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f431 = StringFog.decrypt("mfSY7u6k00OQ5bzf9LXEVY30iP/+p9RDjeU=\n", "/pHsrZvWoSY=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f430 = StringFog.decrypt("QTEZxjyGrYFC\n", "JlRtlUzp2cg=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f429 = StringFog.decrypt("XIDysQ7FTqRPgOiE\n", "O+WG8GqGIco=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f428 = StringFog.decrypt("P/vsjHqC5s4k7c+XV4o=\n", "Voiq+Rbula0=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f427 = StringFog.decrypt("JevKA47I2Hco\n", "TJicauqttzY=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f426 = StringFog.decrypt("68AFQlw/yHvYzQNuRTHDRf7J\n", "jKVxATBWqxA=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f425 = StringFog.decrypt("HqwDmAtdab4N\n", "ecl31GokBss=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f424 = StringFog.decrypt("+lKerbVFQ6zpUo6rvkBSjPJZnoy/RUqq7w==\n", "nTfq/tApJs8=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f423 = StringFog.decrypt("EiqBfwm8Ox8BKpFvA74qGRs7tkMCpCwTGSOQXg==\n", "dU/1LGzQXnw=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f422 = StringFog.decrypt("CFxM/m8DbmIcdVHIbQNucx0=\n", "bzk4uxlmABY=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f421 = StringFog.decrypt("qTUj7idt9KWpHD7YJW30tKg=\n", "2lBXq1EImtE=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f420 = StringFog.decrypt("jz89eY8SA46c\n", "6FpJOOtBc+E=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f419 = StringFog.decrypt("NmkRzYNZud04fxX0jEmZ4CFpIPaYXQ==\n", "UQxlmO0wzZk=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f418 = StringFog.decrypt("Y6/n9V5vX3JGq/3WSXxgf2G92tw=\n", "BMqTuCwONhY=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f417 = StringFog.decrypt("2Pz1orZZTKbM6uiEtW1ft97d7oa6QFA=\n", "v5mB69spPsM=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f416 = StringFog.decrypt("8JpwJhg+vqrQgnsKBCu4rNeVcgEYMKqt3IZfIB42q7fNjQ==\n", "ufQeQ2pf3d4=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f415 = StringFog.decrypt("Lm3GAn0yaM4/LMJCdS54yi52wlp+ZXnPJizKT28ifMI5a85fNQJkxShwyk9vInzOBGzfSWkla8cP\ncMRbaC546i52wlpyP3M=\n", "TQKrLBtLCqs=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f414 = StringFog.decrypt("q+6cLXRSonqL9pcOc1+tfYHyly1ocqVPgfSbPm9HuA==\n", "4oDySAYzwQ4=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f413 = StringFog.decrypt("4RBY2sYLo1nwUVyazhezXeELXILFXLJY6VFUl9Qbt1X2FlCHjjuvUucNVJfUG7dZxApZmNMRs1nn\nEXSQ4RG1VfQWQY0=\n", "gn819KBywTw=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f412 = StringFog.decrypt("s3RpJJaDXwGTbGITjYFUOJ9+biCyi1gQlUprIJ2HTjSZbm43jZZFNpVoYg==\n", "+hoHQeTiPHU=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f411 = StringFog.decrypt("rpGRRUVlJqy/0JUFTXk2qK6KlR1GMjetptCdCFd1MqC5l5kYDVUqp6iMnQhXdTKsn5efA255IKCs\nqJUPRnMUpayHmRlifzCgu5eIEmBzNqw=\n", "zf78ayMcRMk=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f410 = StringFog.decrypt("kjTDS0Fl9GuyLMhvV1fncK8=\n", "21qtLjMElx8=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f409 = StringFog.decrypt("QKNeGNx7Fy9gu1U8ykgRKnyoQwk=\n", "Cc0wfa4adFs=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f408 = StringFog.decrypt("EqwoswI4o6MytCOXFAuluT+nNLMC\n", "W8JG1nBZwNc=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f407 = StringFog.decrypt("lg0eKK+O3Yq2FRUAuIvXn6sKHyOTjtOb\n", "32NwTd3vvv4=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f406 = StringFog.decrypt("vJX36Acv8/24tdrmDizo\n", "9dS0h2lJmpo=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f405 = StringFog.decrypt("wAUFr6ZP+SngHQ6Ju0DuOOcfKKW6Wugy5QcOuA==\n", "iWtrytQuml0=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f404 = StringFog.decrypt("xKURgny8XYPkvRqyYLRKtOKlC5VhsVKS/w==\n", "jct/5w7dPvc=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f403 = StringFog.decrypt("shQ96kulDbuSDDbOXZIHqowvPeZNhwGhjwg841WhHA==\n", "+3pTjznEbs8=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f402 = StringFog.decrypt("07mVCgk6JYPqtoUqNCMz\n", "htf8fk1TVvM=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f401 = StringFog.decrypt("tCxMgHDgS/CCLkyAYeE=\n", "8Vop7gSTB5k=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f400 = StringFog.decrypt("tQ==\n", "52NrQxUIxh8=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f399 = StringFog.decrypt("CCUWJ+UbnIQoPR0E4haTgyI5HSf5LJaUJCQ7LfkOmp41CBcs4wiQnC0uCg==\n", "QUt4Qpd6//A=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f398 = StringFog.decrypt("+RiTx27xMznZAJjkafw8PtMEmMdy0TQIxhOT1m/cOT7EE5PHbg==\n", "sHb9ohyQUE0=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f397 = StringFog.decrypt("3wEvrhS5teb9DSW/N5Op/OwGLrk=\n", "iWhLy3v62og=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f396 = StringFog.decrypt("XuVPcZADJO9V+VRjkQg3z374T3GMCDc=\n", "F4s7FOJtRYM=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f395 = StringFog.decrypt("dtG1QhjicBBb5q9COcd9BkDVqEI8\n", "NLDGJ06LFHU=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f394 = StringFog.decrypt("ngHQ\n", "ymCgfqfZDOY=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f393 = StringFog.decrypt("a/MCbhNvcF5L6wlNFGJ/WUHvCW4PT3dvVPgCfxJCellW+AJuE093S1LpCXk=\n", "Ip1sC2EOEyo=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f392 = StringFog.decrypt("Q+PaG9twGPpj+9E43H0X/Wn/0RvHRBXnfs7bEN1jFOJm6MY=\n", "Co20fqkRe44=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f391 = StringFog.decrypt("KoICbLaIfkkKmglIoL90WBS6BW2hhl5SDZgJZ7CqclMXngNlqIxv\n", "Y+xsCcTpHT0=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f390 = StringFog.decrypt("p6Nagu3SPaiRoVqC/NMwpYOlS4nr\n", "4tU/7JmhccE=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f389 = StringFog.decrypt("XyIgUY81aiF9LipArB92O2wlIUahEmQ/fS42\n", "CUtENOB2BU8=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f388 = StringFog.decrypt("s2zxgzZFs9aTWQ==\n", "+i288Vcs150=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f387 = StringFog.decrypt("SR4ubNAN78VlPRV31BPI/W4rMXHdCO7g\n", "AF9DHrFki5I=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f386 = StringFog.decrypt("PZQJ+DqG13gdoQ==\n", "dNVfkV7juDM=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f385 = StringFog.decrypt("6LCe+BmNDbXOs6rrCJ8=\n", "od3uinz+ftw=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f384 = StringFog.decrypt("ECgE+ohe0989ABfFglL71Q8AE+Q=\n", "WWl2k+s2nro=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f383 = StringFog.decrypt("NrfDhfQC2LwWr8im8w/XuxyryIXoIt+NCbzDlPUv0rsLvMOF9DTSvBeQwJD0Bsi7FrbDpOcX2g==\n", "f9mt4IZju8g=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f382 = StringFog.decrypt("jymm9RSHbeevMa3RArBn9rECvvUIkn3frzS89QiDfMSvM6DZC5Z89rU0of8Iom/npw==\n", "xkfIkGbmDpM=\n");

    public C0337(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        return InneractiveAdManager.getVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f431, new C0412(this));
        hashMap.put(f430, new C0410(this));
        hashMap.put(f429, new C0397(this));
        hashMap.put(f428, new C0376(this));
        hashMap.put(f427, new C0352(this));
        hashMap.put(f426, new C0345(this));
        hashMap.put(f425, new C0341(this));
        hashMap.put(f424, new C0339(this));
        hashMap.put(f423, new C0338(this));
        hashMap.put(f422, new C0534(this));
        hashMap.put(f421, new C0531(this));
        hashMap.put(f420, new C0530(this));
        hashMap.put(f419, new C0500(this));
        hashMap.put(f418, new C0493(this));
        hashMap.put(f417, new C0471(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -1764994669:
                if (str.equals(f386)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1757761411:
                if (str.equals(f389)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1751837367:
                if (str.equals(f414)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1661930846:
                if (str.equals(f411)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1611796569:
                if (str.equals(f398)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1452673136:
                if (str.equals(f409)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1264220508:
                if (str.equals(f403)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1205203919:
                if (str.equals(f399)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1190251081:
                if (str.equals(f392)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f385)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -955341033:
                if (str.equals(f388)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -758374370:
                if (str.equals(f391)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -587023626:
                if (str.equals(f387)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -312786562:
                if (str.equals(f416)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -233888832:
                if (str.equals(f383)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -50587944:
                if (str.equals(f402)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 82:
                if (str.equals(f400)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 83843:
                if (str.equals(f394)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 114221977:
                if (str.equals(f405)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 218220615:
                if (str.equals(f407)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 294386593:
                if (str.equals(f410)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 305774826:
                if (str.equals(f382)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 334157136:
                if (str.equals(f384)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 598324252:
                if (str.equals(f404)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 652259752:
                if (str.equals(f393)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 778319234:
                if (str.equals(f390)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 809010015:
                if (str.equals(f396)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 986039922:
                if (str.equals(f397)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 996606931:
                if (str.equals(f406)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1840053850:
                if (str.equals(f415)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1945237502:
                if (str.equals(f412)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1956883725:
                if (str.equals(f401)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2019288557:
                if (str.equals(f413)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2082429859:
                if (str.equals(f395)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 2110184418:
                if (str.equals(f408)) {
                    c = '\b';
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
            case 1:
                return InneractiveInternalBrowserActivity.class;
            case 2:
            case 3:
                return InneractiveFullscreenAdActivity.class;
            case 4:
            case 5:
                return InneractiveRichMediaVideoPlayerActivityCore.class;
            case 6:
                return InneractiveAdSpot.class;
            case 7:
                return InneractiveAdRequest.class;
            case '\b':
                return InneractiveAdRenderer.class;
            case '\t':
                return InneractiveMediationName.class;
            case '\n':
                return IAConfigManager.class;
            case 11:
                return InneractiveContentController.class;
            case '\f':
                return InneractiveUnitController.class;
            case '\r':
                return InneractiveAdViewUnitController.class;
            case 14:
                return UnitDisplayType.class;
            case 15:
                return InneractiveUnitController.EventsListener.class;
            case 16:
                return R.class;
            case 17:
                return InneractiveFullscreenVideoContentController.class;
            case 18:
                return InneractiveFullscreenAdEventsListener.class;
            case 19:
                return VideoContentListener.class;
            case 20:
                return InneractiveInternalBrowserActivity.InternalBrowserListener.class;
            case 21:
                return Tap.class;
            case 22:
                return InneractiveFullscreenAdEventsListenerAdapter.class;
            case 23:
                return InneractiveFullscreenUnitController.class;
            case 24:
                return InneractiveAdViewVideoContentController.class;
            case 25:
                return InneractiveUnitController.EventsListenerAdapter.class;
            case 26:
                return VideoContentListenerAdapter.class;
            case 27:
                return IAMraidKit.class;
            case 28:
                return IAmraidWebViewController.class;
            case 29:
                return IAVideoKit.class;
            case 30:
                return ImpressionData.class;
            case 31:
                return IArichMediaVideoView.class;
            case ' ':
                return IArichMediaVideoView.BaseVideoViewListener.class;
            case '!':
                return InneractiveFullscreenAdEventsListenerWithImpressionData.class;
            case '\"':
                return InneractiveAdViewEventsListenerWithImpressionData.class;
            default:
                return null;
        }
    }
}
