package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class hu extends android.webkit.WebChromeClient implements com.ironsource.adqualitysdk.sdk.i.ba.d, com.ironsource.adqualitysdk.sdk.i.ch {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2425 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2426;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2427;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2428;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private android.webkit.WebChromeClient f2429;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private android.webkit.WebChromeClient f2430;

    static {
        char[] cArr = new char[1163];
        java.nio.ByteBuffer.wrap("[\u0019ÕxG\u008añôbj\u009c£\u000eÓ¿f)³[æÔ\u001cF¶ðÏa\u0017\u0093°\r×¾\u001b(®Z÷Ë\u0015ES÷õ`\u0003\u0092IÂ¸LÜÞ)hkûÃ\u0005B\u0097f&Ö°EÂ{M\u0097ß\u000eiUø£\n\u0004\u0094T'¨±\u0010ÃNR¦Ü¡n]ù±\u000bØ\u0095G$\u0089¶ôÀNS\u008cÝéo4þ³\bõ\u009a/%\u0095·ÃÁ4Sf\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ'W\u00adæxt\u000b\u0002¨\u0091b\u001f\u0002\u00adÞ<YÊ\tXÇçju<Þ\bPlÂ\u0099tÛçs\u0019ò\u008bÖ:f¬õÞËQ'Ã¾uåä\u0013\u0016´\u0088ä;\u0018\u00ad ßþN\u0016À\u0011ríå\u0001\u0017j\u0089à85ªFÜåO/ÁOs\u0093â\t\u0014N\u0086\u00919%ÑÈ_¬ÍY{\u001bè³\u00162\u0084\u00165¦£5Ñ\u000b^çÌ~z%ëÓ\u0019t\u0087$4Ø¢`Ð>AÖÏÑ}-êÁ\u0018ª\u0086 7õ¥\u0086Ó%@ïÎ\u008f|SíÔ\u001b\u0082\u0089K6è¤¼Òh@\u0011ñ°\u007fFí \u001a´\u0088\u007fXÎÖªD_ò\u001daµ\u009f4\r\u0010¼ *3X\r×áExó#bÕ\u0090r\u000e\"½Þ+fY8ÈÐF×ô+cÇ\u0091\u00ad\u000f+¾ÿ,\u0092Z\tÉêG\u009fõEdé\u0092\u0086\u0000n¿ä-·[P\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ=W¡æ\u007ft\u000b\u0002\u0082\u0091a\u001f\u0014\u00adÎ<bÊ\rXåçou<\u0003Û\u009c°\u0012Ô\u0080!6c¥Ë[JÉnxÞîM\u009cs\u0013\u009f\u0081\u00067]¦«T\fÊ\\y ï\u0018\u009dF\f®\u0082©0U§¹UÃËOz\u008bèú\u009e@\r\u0084\u0083Å1& \u0096VñÄ){\u0084\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ'W\u00adæjt\u001b\u0002¤\u0091g\u001f\u0013\u00adü<bÊ\u0003XÆçu\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ6W¤ætt\u001d\u0002¤\u0091C\u001f\u000e\u00adÔ<iÊ\u000fXÄ\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ?W»æZt\u0002\u0002¤\u0091f\u001f\u0013\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ?W»æXt\u0001\u0002¯\u0091r\u001f\u000e\u00adÈ<`\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ?W»æKt\u001c\u0002®\u0091y\u001f\u0017\u00adÎ Â®¦<S\u008a\u0011\u0019¹ç8u\u001cÄ¬R? \u0001¯í=t\u008b/\u001aÙè~v.ÅÒSj!4°Ü>Û\u008c'\u001bËé¸w<ÆÞT\u008c\" ±ü?\u0092\u008dX\u001cßê\u0089xXÇîU¿#Oß\u0002QfÃ\u0093uÑæy\u0018ø\u008aÜ;l\u00adÿßÁP-Â´tïå\u0019\u0017¾\u0089î:\u0012¬ªÞôO\u001cÁ\u001bsçä\u000b\u0016w\u0088÷9?«LÝãN7ÀEr\u0099ã\u000e\u0015F\u0087\u00808 ª|Ü\u008aNËÿpq³ãÊ\u0014c\u0086\u00ad8×9\u0010·t%\u0081\u0093Ã\u0000kþêlÎÝ~Kí9Ó¶?$¦\u0092ý\u0003\u000bñ¬oüÜ\u0000J¸8æ©\u000e'\t\u0095õ\u0002\u0019ðgnøß!MW;û¨\"&S\u0094\u009b\u00051óZa\u0088Þ\u0003Li:\u008b¨Ç\u0019n\u0097\u0083\u0005Þòw`¤ÞÊOb=\u0091«×\u0018\u0007\u0096²\u0004æõ\u0011c³ÑäN\n<£\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ2W\u00adætt\u0002\u0002®\u0091w\u001f\u0006\u00adÎ<dÊ\u000fXÝçVu<\u0003Þ\u0091\u0092 ;®Ö<\u008bË\"Yñç\u009fv7\u0004ß\u0092\u0083!Y¯õ=³ÌDZæè±w_\u0005öh\u0088æìt\u0019Â[Qó¯r=V\u008cæ\u001auhKç§u>ÃeR\u0093 4>d\u008d\u0098\u001b i~ø\u0096v\u0091ÄmS\u0081¡è?`\u008e¤\u001cÎjeùªwÙÅ\u001eT¯¢Ã0,\u008f®\u001dåk\u0014ùWHìÆ\u001cGmÉ\t[üí¾~\u0016\u0080\u0097\u0012³£\u00035\u0090G ÈwZÕì }v\u008fÌ\u0011\u0092¢84ÄF\u008c×hY3ë\u008e|d\u008e}\u0010\u008f¡]3\u0016E\u008cÖNX\"êû{V\u008d;\u001fò A2\u001fDÖÖ²g\u000béø{µ\u008c\u0010\u001eÂ\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ%W\u00adæit\u0003\u0002¨\u0091g\u001f\u0014\u00adÓ<bÊ\u000eXáçcu(\u0003Ù\u0091\u009a !®Ñ<»Ë*Yðç\u0092v!\u0004û\u0092\u008f!YÓ ]DÏ±yóê[\u0014Ú\u0086þ7N¡ÝÓí\\:Î\u0098xíé;\u001b\u0081\u0085ß6u \u0089ÒÁC%Í~\u007fÃè)\u001a0\u0084Â5\u0010§[ÑÁB\u0003Ìo~¶ï\u001b\u0019v\u008b¿4\f¦RÐ\u009bBÿóF}µïø\u0018]\u008a\u008f4×¥@×\u009cAìò=|\u0099îã\u001f7÷ïy\u008bë~]<Î\u00940\u0015¢1\u0013\u0081\u0085\u0012÷,xÀêY\\\u0002Íô?S¡\u0003\u0012ÿ\u0084Gö\u0019gñéö[\nÌæ>\u0095 \u0011\u0011å\u0083\u00adõ\u0006fÛè¢ZeËÓ\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ6W§æut\u001d\u0002®\u0091x\u001f\u0002\u00ad÷<hÊ\u0013XÀçgu>\u0003Éá¦oÂý7KuØÝ&\\´x\u0005È\u0093[áen\u0089ü\u0010JKÛ½)\u001a·J\u0004¶\u0092\u000eàPq¸ÿ¿MKÚ¤(â¶o\u0007\u009d\u0095ëãCp\u0082þèL-Ý¸+ê¹4\u0006\u0080\u0094Õâ\u001fpsÁÂO2Ý~*Ú\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬¨;GÉ\u0001W\u009eært\n\u0002¤\u0091{\u001f+\u00adÕ<lÊ\u0004XÚçhu>\u0003ü\u0091\u008d =®Â<\u008aË.Yíç\u0082v\u0012\u0004þ\u0092\u008f!J\u0084`\n\u0004\u0098ñ.³½\u001bC\u009aÑ¾`\u000eö\u009d\u0084£\u000bO\u0099Ö/\u008d¾{LÜÒ\u008cap÷È\u0085\u0096\u0014~\u009ay(\u008d¿bM$Ó»bWð8\u0086\u008d\u0015E\u009b')û¸`N,ÜåcWñ\u0013\u0087û\u0015£\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ&W ætt\u0019\u0002\u0087\u0091}\u001f\u000b\u00adß<NÊ\bXÜçiu*\u0003É\u0091\u008dé\u0085gÔõ0CLÐÜ.\u001c¼`\r×\u009b\u001fémf\u008bô\u0016BdÓ\u0096!\u0000¿M\f½\u009a\fèQy\u0088÷òEDÒ¥ ù¾^MâÃ³QWç(t«\u008aM\u0018\u0012©¢?^M\u0006ÂÉP{æ\fw×\u0085L\u001b4¨Ü>cL=ÝØZTÔ0FÅð\u0087c/\u009d®\u000f\u0094¾<(àZ\u0096ÕJG ñ\u0090`^\u0092þ\f¯¿T)æ[®ÊVD\nöþad\u0093\u0001\r»¼I.\u0017X¢ËjE\u001b÷Îf_\u0090\u001d\u0002Ë½r/&YÉËªz&ô×f\u0086\u0091(\u0003î½\u0094,:^ôÈÛ{Bõàg\u0086\u0096N\u0000î²¨-\u001e_þÉ¡xMê\u0002d°\u0097T\u0001E³ñQ\u0089".getBytes(com.google.android.exoplayer2.C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1163);
        f2426 = cArr;
        f2428 = -4975750373327794605L;
    }

    public hu(android.webkit.WebChromeClient webChromeClient, android.webkit.WebChromeClient webChromeClient2) {
        this.f2429 = webChromeClient;
        this.f2430 = webChromeClient2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private android.webkit.WebChromeClient m7855() {
        int i = 2 % 2;
        int i2 = f2425 + 121;
        int i3 = i2 % 128;
        f2427 = i3;
        int i4 = i2 % 2;
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        int i5 = i3 + 55;
        f2425 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return webChromeClient;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.Object m7853() {
        int i = 2 % 2;
        int i2 = f2427 + 113;
        f2425 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2430;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(android.webkit.WebView webView, int i) {
        int i2 = 2 % 2;
        try {
            this.f2430.onProgressChanged(webView, i);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 23 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern(), m7854((char) (49917 - android.graphics.Color.red(0)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, (android.os.Process.myTid() >> 22) + 38).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i3 = f2425 + 33;
            f2427 = i3 % 128;
            int i4 = i3 % 2;
            webChromeClient.onProgressChanged(webView, i);
            return;
        }
        super.onProgressChanged(webView, i);
        int i5 = f2425 + 95;
        f2427 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(android.webkit.WebView webView, java.lang.String str) {
        int i = 2 % 2;
        try {
            this.f2430.onReceivedTitle(webView, str);
            int i2 = f2425 + 57;
            f2427 = i2 % 128;
            int i3 = i2 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, android.view.View.combineMeasuredStates(0, 0) + 24).intern(), m7854((char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 62 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 36 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTitle(webView, str);
            return;
        }
        super.onReceivedTitle(webView, str);
        int i4 = f2427 + 57;
        f2425 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(android.webkit.WebView webView, android.graphics.Bitmap bitmap) {
        int i = 2 % 2;
        try {
            this.f2430.onReceivedIcon(webView, bitmap);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - android.graphics.Color.blue(0)), android.view.KeyEvent.getDeadChar(0, 0), 24 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m7854((char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 56909), 98 - android.view.View.MeasureSpec.getSize(0), 35 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i2 = f2425 + 53;
            f2427 = i2 % 128;
            if (i2 % 2 == 0) {
                webChromeClient.onReceivedIcon(webView, bitmap);
                return;
            }
            webChromeClient.onReceivedIcon(webView, bitmap);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        super.onReceivedIcon(webView, bitmap);
        int i3 = f2427 + 93;
        f2425 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(android.webkit.WebView webView, java.lang.String str, boolean z) {
        int i = 2 % 2;
        int i2 = f2427 + 111;
        f2425 = i2 % 128;
        java.lang.Object obj = null;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - android.text.TextUtils.getTrimmedLength("")), android.os.Process.myTid() >> 22, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 25).intern(), m7854((char) (53646 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 134, 42 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2430.onReceivedTouchIconUrl(webView, str, z);
            super.hashCode();
            throw null;
        }
        this.f2430.onReceivedTouchIconUrl(webView, str, z);
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z);
            int i3 = f2425 + 51;
            f2427 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        int i = 2 % 2;
        int i2 = f2427 + 7;
        f2425 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2430.onShowCustomView(view, customViewCallback);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 23375), (-1) - android.text.TextUtils.lastIndexOf("", '0', 0, 0), android.view.KeyEvent.keyCodeFromString("") + 24).intern(), m7854((char) (22667 - android.text.TextUtils.getCapsMode("", 0, 0)), 176 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i4 = f2425 + 107;
            f2427 = i4 % 128;
            int i5 = i4 % 2;
            webChromeClient.onShowCustomView(view, customViewCallback);
            return;
        }
        super.onShowCustomView(view, customViewCallback);
        int i6 = f2425 + 55;
        f2427 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.webkit.WebChromeClient
    @java.lang.Deprecated
    public void onShowCustomView(android.view.View view, int i, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        int i2 = 2 % 2;
        try {
            this.f2430.onShowCustomView(view, i, customViewCallback);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23374), android.text.TextUtils.lastIndexOf("", '0', 0) + 1, 24 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m7854((char) (22667 - android.view.View.getDefaultSize(0, 0)), 176 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 37 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i3 = f2427 + 97;
            f2425 = i3 % 128;
            if (i3 % 2 != 0) {
                webChromeClient.onShowCustomView(view, i, customViewCallback);
                return;
            } else {
                webChromeClient.onShowCustomView(view, i, customViewCallback);
                int i4 = 76 / 0;
                return;
            }
        }
        super.onShowCustomView(view, i, customViewCallback);
        int i5 = f2427 + 49;
        f2425 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i = 2 % 2;
        try {
            this.f2430.onHideCustomView();
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 23374), android.graphics.Color.rgb(0, 0, 0) + 16777216, 25 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m7854((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 212 - android.text.TextUtils.lastIndexOf("", '0', 0), 37 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
            int i2 = f2425 + 119;
            f2427 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        super.onHideCustomView();
        int i4 = f2427 + 7;
        f2425 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
        int i = 2 % 2;
        int i2 = f2425 + 23;
        f2427 = i2 % 128;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, 24 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m7854((char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40181), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f2430.onCreateWindow(webView, z, z2, message);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f2430.onCreateWindow(webView, z, z2, message);
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i3 = f2425 + 7;
            f2427 = i3 % 128;
            if (i3 % 2 == 0) {
                return webChromeClient.onCreateWindow(webView, z, z2, message);
            }
            boolean onCreateWindow = webChromeClient.onCreateWindow(webView, z, z2, message);
            int i4 = 41 / 0;
            return onCreateWindow;
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f2427 + 21;
        f2425 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2430.onRequestFocus(webView);
            int i4 = f2425 + 49;
            f2427 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23375 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionGroup(0L), 24 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)).intern(), m7854((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 285 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 34 - android.graphics.ImageFormat.getBitsPerPixel(0)).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient == null) {
            super.onRequestFocus(webView);
            return;
        }
        int i6 = f2425 + 83;
        f2427 = i6 % 128;
        int i7 = i6 % 2;
        webChromeClient.onRequestFocus(webView);
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(android.webkit.WebView webView) {
        int i = 2 % 2;
        try {
            this.f2430.onCloseWindow(webView);
            int i2 = f2425 + 15;
            f2427 = i2 % 128;
            int i3 = i2 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (android.view.View.MeasureSpec.getSize(0) + 23374), android.os.Process.myPid() >> 22, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23).intern(), m7854((char) android.view.View.MeasureSpec.getSize(0), 320 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 34 - android.view.View.MeasureSpec.getSize(0)).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient == null) {
            super.onCloseWindow(webView);
            return;
        }
        int i4 = f2425 + 41;
        f2427 = i4 % 128;
        int i5 = i4 % 2;
        webChromeClient.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f2427 + 9;
        f2425 = i2 % 128;
        java.lang.Object obj = null;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (android.text.TextUtils.getTrimmedLength("") + 23374), (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23).intern(), m7854((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 354 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 30 - (android.view.ViewConfiguration.getTouchSlop() >> 8)).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2430.onJsAlert(webView, str, str2, jsResult);
            super.hashCode();
            throw null;
        }
        this.f2430.onJsAlert(webView, str, str2, jsResult);
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i3 = f2425 + 57;
            f2427 = i3 % 128;
            if (i3 % 2 == 0) {
                return webChromeClient.onJsAlert(webView, str, str2, jsResult);
            }
            webChromeClient.onJsAlert(webView, str, str2, jsResult);
            throw null;
        }
        boolean onJsAlert = super.onJsAlert(webView, str, str2, jsResult);
        int i4 = f2427 + 83;
        f2425 = i4 % 128;
        int i5 = i4 % 2;
        return onJsAlert;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f2427 + 69;
        f2425 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2430.onJsConfirm(webView, str, str2, jsResult);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23373), (-1) - android.os.Process.getGidForName(""), 24 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m7854((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), android.view.MotionEvent.axisFromString("") + 385, android.text.TextUtils.getOffsetBefore("", 0) + 32).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i4 = f2425 + 123;
            f2427 = i4 % 128;
            if (i4 % 2 == 0) {
                return webChromeClient.onJsConfirm(webView, str, str2, jsResult);
            }
            boolean onJsConfirm = webChromeClient.onJsConfirm(webView, str, str2, jsResult);
            int i5 = 41 / 0;
            return onJsConfirm;
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
        int i = 2 % 2;
        int i2 = f2427 + 47;
        f2425 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2430.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                int i3 = 95 / 0;
            } else {
                this.f2430.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 24).intern(), m7854((char) android.view.KeyEvent.normalizeMetaState(0), 416 - android.graphics.Color.green(0), 31 - android.view.View.resolveSize(0, 0)).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i4 = f2425 + 123;
            f2427 = i4 % 128;
            int i5 = i4 % 2;
            return webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f2427 + 59;
        f2425 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2430.onJsBeforeUnload(webView, str, str2, jsResult);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23373), 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 24 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m7854((char) (8327 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), android.text.TextUtils.lastIndexOf("", '0', 0) + 448, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 37).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i4 = f2427 + 23;
            f2425 = i4 % 128;
            int i5 = i4 % 2;
            return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    @java.lang.Deprecated
    public void onExceededDatabaseQuota(java.lang.String str, java.lang.String str2, long j, long j2, long j3, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
        int i = 2 % 2;
        int i2 = f2427 + 47;
        f2425 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2430.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - android.view.View.MeasureSpec.getMode(0)), (-1) - android.text.TextUtils.lastIndexOf("", '0', 0), 25 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m7854((char) (57159 - android.view.View.MeasureSpec.getMode(0)), 483 - android.text.TextUtils.lastIndexOf("", '0', 0), 44 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i4 = f2425 + 21;
            f2427 = i4 % 128;
            if (i4 % 2 == 0) {
                webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                return;
            } else {
                webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                int i5 = 58 / 0;
                return;
            }
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        int i = 2 % 2;
        int i2 = f2427 + 55;
        f2425 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2430.onGeolocationPermissionsShowPrompt(str, callback);
            int i4 = f2425 + 45;
            f2427 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (android.text.TextUtils.indexOf("", "", 0, 0) + 23374), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 1, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 24).intern(), m7854((char) (14677 - android.text.TextUtils.getOffsetBefore("", 0)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 528, 55 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            return;
        }
        int i6 = f2425 + 107;
        f2427 = i6 % 128;
        int i7 = i6 % 2;
        webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        int i = 2 % 2;
        try {
            this.f2430.onGeolocationPermissionsHidePrompt();
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - android.text.TextUtils.indexOf("", "", 0)), android.text.TextUtils.getTrimmedLength(""), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 24).intern(), m7854((char) android.graphics.Color.blue(0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 584, android.text.TextUtils.getCapsMode("", 0, 0) + 55).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsHidePrompt();
            return;
        }
        int i2 = f2425 + 11;
        f2427 = i2 % 128;
        int i3 = i2 % 2;
        webChromeClient.onGeolocationPermissionsHidePrompt();
        int i4 = f2427 + 7;
        f2425 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0016, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 98) goto L10;
     */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
        int i = 2 % 2;
        int i2 = f2425 + 81;
        f2427 = i2 % 128;
        if (i2 % 2 != 0) {
            try {
            } catch (java.lang.Throwable th) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - android.view.View.MeasureSpec.getMode(0)), (-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 24).intern(), m7854((char) (android.text.TextUtils.indexOf("", "", 0, 0) + 26829), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 637, 40 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), th, false);
            }
        }
        int i3 = f2427 + 47;
        f2425 = i3 % 128;
        if (i3 % 2 == 0) {
            this.f2430.onPermissionRequest(permissionRequest);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f2430.onPermissionRequest(permissionRequest);
        try {
            if (this.f2429 != null) {
                this.f2429.onPermissionRequest(permissionRequest);
            } else {
                super.onPermissionRequest(permissionRequest);
            }
        } catch (java.lang.Throwable th2) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (android.text.TextUtils.indexOf("", "", 0, 0) + 23374), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, android.graphics.Color.green(0) + 24).intern(), m7854((char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 18216), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 678, 43 - android.widget.ExpandableListView.getPackedPositionType(0L)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(android.webkit.PermissionRequest permissionRequest) {
        int i = 2 % 2;
        int i2 = f2427 + 115;
        f2425 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2430.onPermissionRequestCanceled(permissionRequest);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), android.view.ViewConfiguration.getPressedStateDuration() >> 16, 24 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m7854((char) android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 721, (-16777168) - android.graphics.Color.rgb(0, 0, 0)).intern(), th, false);
        }
        try {
            if (this.f2429 == null) {
                super.onPermissionRequestCanceled(permissionRequest);
                int i4 = f2427 + 11;
                f2425 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int i6 = f2427 + 111;
            f2425 = i6 % 128;
            if (i6 % 2 != 0 || android.os.Build.VERSION.SDK_INT >= 49) {
                this.f2429.onPermissionRequestCanceled(permissionRequest);
            }
        } catch (java.lang.Throwable th2) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), android.view.ViewConfiguration.getFadingEdgeLength() >> 16, 23 - android.os.Process.getGidForName("")).intern(), m7854((char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 54117), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 769, android.graphics.Color.red(0) + 51).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    @java.lang.Deprecated
    public boolean onJsTimeout() {
        int i = 2 % 2;
        int i2 = f2425 + 123;
        f2427 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2430.onJsTimeout();
            int i4 = f2427 + 27;
            f2425 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (android.view.KeyEvent.keyCodeFromString("") + 23374), android.view.ViewConfiguration.getTouchSlop() >> 8, 24 - (android.view.KeyEvent.getMaxKeyCode() >> 16)).intern(), m7854((char) (63402 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 820, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 33).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            return webChromeClient.onJsTimeout();
        }
        return super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    @java.lang.Deprecated
    public void onConsoleMessage(java.lang.String str, int i, java.lang.String str2) {
        int i2 = 2 % 2;
        int i3 = f2425 + 51;
        f2427 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.f2430.onConsoleMessage(str, i, str2);
                int i4 = 66 / 0;
            } else {
                this.f2430.onConsoleMessage(str, i, str2);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 23374), (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 24).intern(), m7854((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 852 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i5 = f2425 + 13;
            f2427 = i5 % 128;
            if (i5 % 2 == 0) {
                webChromeClient.onConsoleMessage(str, i, str2);
                return;
            } else {
                webChromeClient.onConsoleMessage(str, i, str2);
                int i6 = 59 / 0;
                return;
            }
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        int i = 2 % 2;
        int i2 = f2427 + 35;
        f2425 = i2 % 128;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), 24 - android.view.View.getDefaultSize(0, 0)).intern(), m7854((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 851, android.text.TextUtils.getOffsetAfter("", 0) + 37).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2430.onConsoleMessage(consoleMessage);
            throw null;
        }
        this.f2430.onConsoleMessage(consoleMessage);
        int i3 = f2425 + 67;
        f2427 = i3 % 128;
        int i4 = i3 % 2;
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient == null) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i5 = f2427 + 35;
        f2425 = i5 % 128;
        int i6 = i5 % 2;
        return webChromeClient.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public android.graphics.Bitmap getDefaultVideoPoster() {
        int i = 2 % 2;
        int i2 = f2425 + 25;
        f2427 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2430.getDefaultVideoPoster();
                int i3 = 78 / 0;
            } else {
                this.f2430.getDefaultVideoPoster();
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - android.view.View.MeasureSpec.getSize(0)), android.view.ViewConfiguration.getWindowTouchSlop() >> 8, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 24).intern(), m7854((char) (57826 - android.widget.ExpandableListView.getPackedPositionChild(0L)), 888 - android.text.TextUtils.lastIndexOf("", '0', 0), android.view.View.resolveSize(0, 0) + 42).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            int i4 = f2425 + 111;
            f2427 = i4 % 128;
            int i5 = i4 % 2;
            return webChromeClient.getDefaultVideoPoster();
        }
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public android.view.View getVideoLoadingProgressView() {
        int i = 2 % 2;
        int i2 = f2427 + 37;
        f2425 = i2 % 128;
        java.lang.Object obj = null;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (android.view.View.getDefaultSize(0, 0) + 23374), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 23 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())).intern(), m7854((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 931 - android.text.TextUtils.getOffsetBefore("", 0), 48 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f2430.getVideoLoadingProgressView();
            int i3 = f2425 + 47;
            f2427 = i3 % 128;
            int i4 = i3 % 2;
            android.webkit.WebChromeClient webChromeClient = this.f2429;
            if (webChromeClient != null) {
                int i5 = f2427 + 23;
                f2425 = i5 % 128;
                if (i5 % 2 != 0) {
                    return webChromeClient.getVideoLoadingProgressView();
                }
                webChromeClient.getVideoLoadingProgressView();
                super.hashCode();
                throw null;
            }
            return super.getVideoLoadingProgressView();
        }
        this.f2430.getVideoLoadingProgressView();
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(android.webkit.ValueCallback<java.lang.String[]> valueCallback) {
        int i = 2 % 2;
        int i2 = f2427 + 115;
        f2425 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2430.getVisitedHistory(valueCallback);
            int i4 = f2427 + 7;
            f2425 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23375 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.text.AndroidCharacter.getMirror('0') - '0', 24 - android.text.TextUtils.getCapsMode("", 0, 0)).intern(), m7854((char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33829), 980 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 38).intern(), th, false);
        }
        android.webkit.WebChromeClient webChromeClient = this.f2429;
        if (webChromeClient != null) {
            webChromeClient.getVisitedHistory(valueCallback);
        } else {
            super.getVisitedHistory(valueCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006a  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        int i = 2 % 2;
        int i2 = f2425 + 75;
        f2427 = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                if (android.os.Build.VERSION.SDK_INT >= 35) {
                }
            } catch (java.lang.Throwable th) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7854((char) (23374 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24).intern(), m7854((char) android.view.KeyEvent.keyCodeFromString(""), 1017 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.view.View.resolveSize(0, 0) + 38).intern(), th, false);
            }
            if (this.f2429 == null) {
                return this.f2429.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
            boolean onShowFileChooser = super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            int i3 = f2425 + 119;
            f2427 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 92 / 0;
            }
            return onShowFileChooser;
        }
        this.f2430.onShowFileChooser(webView, valueCallback, fileChooserParams);
        int i5 = f2425 + 95;
        f2427 = i5 % 128;
        int i6 = i5 % 2;
        if (this.f2429 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0082, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
    
        new com.ironsource.adqualitysdk.sdk.i.ds(r10, r14, m7854((char) (23374 - android.text.TextUtils.getOffsetBefore("", 0)), android.text.TextUtils.indexOf("", ""), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 24).intern(), r11).m7590(r10.m7200());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b0, code lost:
    
        return m7853();
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo6378(com.ironsource.adqualitysdk.sdk.i.cl clVar, java.lang.String str, java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar, com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        int i = 2 % 2;
        int i2 = f2427 + 33;
        f2425 = i2 % 128;
        java.lang.Object obj = null;
        try {
            if (i2 % 2 != 0) {
                int hashCode = str.hashCode();
                char c = 65535;
                if (hashCode != 1395849045) {
                    if (hashCode == 1442029578 && str.equals(m7854((char) (android.view.View.MeasureSpec.getSize(0) + 59874), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1055, 25 - android.view.KeyEvent.normalizeMetaState(0)).intern())) {
                        int i3 = f2425 + 43;
                        f2427 = i3 % 128;
                        int i4 = i3 % 2;
                        c = 0;
                    }
                } else if (str.equals(m7854((char) (19845 - android.widget.ExpandableListView.getPackedPositionType(0L)), android.text.TextUtils.getOffsetBefore("", 0) + 1080, 20 - android.view.KeyEvent.normalizeMetaState(0)).intern())) {
                    int i5 = f2427 + 27;
                    f2425 = i5 % 128;
                    int i6 = i5 % 2;
                    c = 1;
                }
                return m7855();
            }
            str.hashCode();
            super.hashCode();
            throw null;
        } catch (java.lang.Exception e) {
            java.lang.String m7200 = clVar.m7200();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m7854((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 23058), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + com.adjust.sdk.network.ErrorCodes.THROWABLE, 62 - android.graphics.Color.red(0)).intern());
            sb.append(str);
            sb.append(m7854((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20911), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + com.ironsource.mediationsdk.demandOnly.e.a.i, android.graphics.Color.rgb(0, 0, 0) + 16777217).intern());
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(m7200, sb.toString(), e);
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7854(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2426[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2428)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
