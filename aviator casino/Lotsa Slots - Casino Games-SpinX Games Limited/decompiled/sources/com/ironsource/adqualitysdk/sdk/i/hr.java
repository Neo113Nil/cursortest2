package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class hr extends android.webkit.WebViewClient implements com.ironsource.adqualitysdk.sdk.i.ba.d, com.ironsource.adqualitysdk.sdk.i.ch {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2400 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2401;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2402;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2403;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private android.webkit.WebViewClient f2404;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private android.webkit.WebViewClient f2405;

    static {
        char[] cArr = new char[1092];
        java.nio.ByteBuffer.wrap("\u0000WÁ3\u0082ÎDT\u00051ÆË\u0088sI\u0019\nÜÌo\u008d9NÜ\u0010|Ñ\u001a\u0092ÑTi\u0015\u000fÖÄ\u0098mY\u0016\u001a×Ü|\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Ü}\u009d\f^Õ eá\n¢Ød]%\u001eæÛ¨fi\u0018*©ìr\u00ad\tn\u00970jñ\u0002²\u0088tu5\u0011ö¢¸uy\u001c:¯ü6½\u0001~¸@L\u0001_\u0004.ÅO\u0086µ@\u0006\u0001AÂå\u008c\u0006M_\u000eûÈ\u0000\u0089xJ«\u0014\nÕR\u0096¶P\u000f\u0011HÒ±\u009c\u000e]l\u001e½Ø\u0011\u0099/Z¢$\u0013åb¦¢`\u0015!gâ\u009a¬\tmd.Ùè\u000f©njÍ4\u0016õP¶Ýp\u001d1WòÂ¼\u0016}}>Êø\u001b¹xz\u0089D>\u0005oÆË\u0080`z\u0094»õø\u000f>¼\u007fû¼_ò¼3åpA¶º÷Ù4\u0001j\u0095«æè\u0016.¯oÔ¬\tâ¸#Á`I¦¬çÝ$\u0004Z´\u009bÛØ\t\u001e\u008c_Ï\u009c\nÒ·\u0013ÉPx\u0096£×Ø\u0014FJ»\u008bÓÈY\u000e¤OÀ\u008csÂ¤\u0003Í@~\u0086çÇ×\u0004~:\u0080{Ò¸xþ\u0080?Ý|6\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\u0013NÀ\u0010aÑ9\u0092ÝTd\u0015#ÖÚ\u0098eY\u0007\u001aÖÜz\u009dD^É xá\t¢Éd~%\fæñ¨bi\u000f*²ìd\u00ad\u0005n¦0}ñ;²¶tv5<ö©¸}y\u0016:¡üp½\u0013~â@R\u0001\u0013Â½\u0084WE\u001d\u0006½ÈP\u0089S\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^ê qá\u0001¢ÙdA%\u001cæß¨fi\u001e*¥ìr\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^ê qá\u0001¢ÙdT%\u0001æÐ¨}i\u0019*¨ìs\u00ad\b\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^ö \u007fá\u0007¢Ød@%\ræÍ¨{i\u001f*²ìu\u00ad\t\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Ü}\u009d\f^Õ eá\n¢Ød[%\u0006æÊ¨qi\u0018*£ìs\u00ad\u001cn¶0Jñ\u000b²µto5\u0015öµ¸h\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^î \u007fá\t¢ñds%\u0006æÇ¨Fi\u000f*¤ì\u007f\u00ad\u001en§0{ñ\u001a²·\u0093=R\\\u0011¦×\u0015\u0096RUö\u001b\u0015ÚL\u0099è_\u0013\u001epÝ¨\u0083<BO\u0001¿Ç\u0006\u0086}E \u000b\u0011Êh\u0089àO\u0019\u000erÍ\u0090³\rr}1¡÷\u0003¶fu£;\búW¹Ê\u007f\u001c>{ýÈ\u00adsl\u0012/èé[¨\u001ck¸%[ä\u0002§¦a] >ãæ½r|\u0001?ñùH¸3{î5_ô&·®qW0<óÊ\u008dIL\"\u000fçÉv\u0088;Kû\u0005WÄ>\u0087\u009bAI\u0000)Ã\u0087\u009dG\\7\u001f\u009c\u0012ºÓÛ\u0090!V\u0092\u0017ÕÔq\u009a\u0092[Ë\u0018oÞ\u0096\u009fÍ\\\u000b\u0002\u0098ÃÓ\u0080&F§\u0007úÄ:\u008a\u0086Kÿ\b*Î\u0098\u008fèL62\u0086óö°-\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üj\u009d\u000b^ï `á\u0002¢Ýdf%\ræè¨}i\u0019*©ìb\u00ad\tn¦0Pñ\u0007²·tn5\u001fö´¸e0Wñ6²Ìt\u007f58ö\u009c¸\u007fy&:\u0082üy½\u001a~Â Vá%¢Õdl%\u0017æÊ¨{i\u0002*\u008aìs\u00ad\u0018nú\u0010gÑ\u0017\u0092ËTi\u0015\fÖÉ\u0098bY+\u001a¡Üh\u009d;^¢\u0000xÁ\u0013\u0082¤n(¯Iì³*\u0000kG¨ãæ\u0000'Ydý¢\u0006ãe ½~)¿Züª:\u0013{h¸µö\u00047}tõ²\fóg0\u0085N\u0018\u008fhÌ´\n\u0016Ks\u0088¶Æ\u001d\u0007DDÁ\u0082\u0012Ãd\u0000Á^\u0001\u009f@ÜÌ\u001a\u0005[i\u0098ùÖ\u0014\u0017nTÐ\u0092\u0016Ój\u0010ÓìZ-;nÁ¨ré5*\u0091dr¥+æ\u008f za\"¢Áü{=(~Å¸rù_:Ætaµ\u0014öÀ0xq\u0015²\u0085Ì`\r\u0017Nñ\u0088hÉ\u0014\nÄDb\u0085\u0003Æº\u0000mA0\u0082±Ün\u001d\u0014^µ\u0098qÙ,\u001a¼Tq\u0095\u0019Ö\u0085\u0010dQ\u001a\u0092 ¬Zí\u001a.§\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^è uá\u0005¢Ùd{%\u001eæÛ¨pi\"*´ìb\u00ad\u001cn\u00830mñ\u001a²¬tH5\u0015ö·¸iy\u0017:»üj\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Ü}\u009d\f^Õ eá\n¢Ød]%\u001eæÛ¨fi\u0018*©ìr\u00ad\tn\u00890}ñ\u0017²\u0081tl5\u0015ö¨¸h\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^ï ~á\u000e¢Ýd|%\fæÒ¨qi\u000e*\u008bìs\u00ad\u0015n\u00870nñ\u000b²ªtn\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^é sá\u0007¢Ðdw%+æÖ¨ui\u0004*§ìs\u00ad\bEb\u0084\u0003Çù\u0001J@\r\u0083©ÍJ\f\u0013O·\u0089LÈ/\u000b÷Uc\u0094\u0010×à\u0011YP\"\u0093ÿÝN\u001c7_¿\u0099FØ-\u001bÏeR¤\"çþ!\\`9£üíW,\u0001o\u0088©Vè\"+\u008bum´,÷\u00921Hp2³\u0092ýO\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^è uá\u0005¢Ùd{%\u001eæÛ¨pi\"*´ìb\u00ad\u001cn\u00870jñ\u001c²«th1\u0018ðy³\u0083u04w÷Ó¹0xi;Íý6¼U\u007f\u008d!\u0019àj£\u009ae#$Xç\u0085©4hM+Åí<¬Woµ\u0011(ÐU\u0093\u0085U*\u0014G×³\u0099;XX\u001bþÝ.\u009cB_ì\u0001\u0002À\\\u0083÷E\"·ïv»5PóÝ²¢qG?üþ¢½]{ê:\u0083ù_§âf\u0080%Uãç¢\u009fa}/èî\u0083\u00adUkè*\u0098\u0092\u000bS_\u0010´Ö:\u0097VT\u0095\u001a\rÛT\u0098\u008a^\u0003\u001fUÜ©\u0082'C^\u0000±Æ\u0003\u0087bD®võ·\u0094ôn2Ýs\u009a°>þÃ?\u0082|iºÚû\u00898\"fÝ§\u0096äa\"Ùc¥ rîÕ/¼loª\u009eë\u0083(oVÂ\u0097\u0080Ôe\u0012ÇS¯\u0090MÞÈ\u001f³\\\u0015\u009aÈÛ¨\u00186FÍ\u0087½Ä\u001b\u0002ØC¡\u0080\u0002ÎÃ\u000f°LX\u008aÀË¥\b\u000e6ùw°´\u0019ò²3¥p\u001b¾àÿ¢<\u000fzò»ìøE\u0000'".getBytes(com.google.android.exoplayer2.C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1092);
        f2401 = cArr;
        f2402 = -419483357365288618L;
    }

    public hr(android.webkit.WebViewClient webViewClient, android.webkit.WebViewClient webViewClient2) {
        this.f2404 = webViewClient;
        this.f2405 = webViewClient2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private android.webkit.WebViewClient m7842() {
        int i = 2 % 2;
        int i2 = f2403;
        int i3 = i2 + 45;
        f2400 = i3 % 128;
        int i4 = i3 % 2;
        android.webkit.WebViewClient webViewClient = this.f2404;
        int i5 = i2 + 11;
        f2400 = i5 % 128;
        int i6 = i5 % 2;
        return webViewClient;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.lang.Object m7845() {
        android.webkit.WebViewClient webViewClient;
        int i = 2 % 2;
        int i2 = f2403;
        int i3 = i2 + 51;
        f2400 = i3 % 128;
        if (i3 % 2 == 0) {
            webViewClient = this.f2405;
            int i4 = 75 / 0;
        } else {
            webViewClient = this.f2405;
        }
        int i5 = i2 + 9;
        f2400 = i5 % 128;
        if (i5 % 2 != 0) {
            return webViewClient;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean m7847() {
        int i = 2 % 2;
        int i2 = f2400 + 7;
        int i3 = i2 % 128;
        f2403 = i3;
        int i4 = i2 % 2;
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient == null) {
            return false;
        }
        int i5 = i3 + 21;
        f2400 = i5 % 128;
        int i6 = i5 % 2;
        return !webViewClient.getClass().equals(android.webkit.WebViewClient.class);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2400 + 125;
        f2403 = i2 % 128;
        int i3 = i2 % 2;
        boolean m7846 = m7846(webView, str, false);
        int i4 = f2403 + 65;
        f2400 = i4 % 128;
        int i5 = i4 % 2;
        return m7846;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m7846(android.webkit.WebView webView, java.lang.String str, boolean z) {
        int i = 2 % 2;
        try {
            if (!(!this.f2405.shouldOverrideUrlLoading(webView, str)) || z) {
                android.webkit.WebViewClient webViewClient = this.f2404;
                if (webViewClient instanceof com.ironsource.adqualitysdk.sdk.i.hr) {
                    int i2 = f2400 + 117;
                    f2403 = i2 % 128;
                    if (i2 % 2 != 0) {
                        ((com.ironsource.adqualitysdk.sdk.i.hr) webViewClient).m7846(webView, str, false);
                    } else {
                        ((com.ironsource.adqualitysdk.sdk.i.hr) webViewClient).m7846(webView, str, true);
                    }
                }
                return true;
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) android.text.TextUtils.getTrimmedLength(""), android.view.ViewConfiguration.getTapTimeout() >> 16, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21).intern(), m7843((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, 51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), th, false);
        }
        if (!(!m7847())) {
            int i3 = f2400 + 123;
            f2403 = i3 % 128;
            int i4 = i3 % 2;
            try {
                boolean shouldOverrideUrlLoading = this.f2404.shouldOverrideUrlLoading(webView, str);
                int i5 = f2403 + 31;
                f2400 = i5 % 128;
                int i6 = i5 % 2;
                return shouldOverrideUrlLoading;
            } catch (java.lang.Throwable th2) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.text.TextUtils.lastIndexOf("", '0', 0) + 1), 1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 21 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)).intern(), m7843((char) (1132 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 72 - android.graphics.Color.alpha(0), 52 - (android.os.Process.myPid() >> 22)).intern(), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        int i = 2 % 2;
        int i2 = f2403 + 65;
        f2400 = i2 % 128;
        int i3 = i2 % 2;
        boolean m7844 = m7844(webView, webResourceRequest, false);
        int i4 = f2400 + 19;
        f2403 = i4 % 128;
        if (i4 % 2 == 0) {
            return m7844;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m7844(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, boolean z) {
        int i = 2 % 2;
        int i2 = f2400 + 85;
        f2403 = i2 % 128;
        int i3 = i2 % 2;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) android.graphics.Color.green(0), android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21).intern(), m7843((char) (31441 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), 124 - android.graphics.Color.blue(0), 53 - android.os.Process.getGidForName("")).intern(), th, false);
        }
        if (this.f2405.shouldOverrideUrlLoading(webView, webResourceRequest) || z) {
            android.webkit.WebViewClient webViewClient = this.f2404;
            if (webViewClient instanceof com.ironsource.adqualitysdk.sdk.i.hr) {
                int i4 = f2403 + 117;
                f2400 = i4 % 128;
                (i4 % 2 == 0 ? (com.ironsource.adqualitysdk.sdk.i.hr) webViewClient : (com.ironsource.adqualitysdk.sdk.i.hr) webViewClient).m7844(webView, webResourceRequest, true);
            }
            return true;
        }
        int i5 = f2403 + 1;
        f2400 = i5 % 128;
        int i6 = i5 % 2;
        android.webkit.WebViewClient webViewClient2 = this.f2404;
        if (webViewClient2 != null) {
            try {
                return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (java.lang.Throwable th2) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.text.AndroidCharacter.getMirror('0') - '0'), android.view.KeyEvent.normalizeMetaState(0), 22 - android.text.TextUtils.indexOf("", "", 0, 0)).intern(), m7843((char) android.graphics.Color.alpha(0), 178 - android.text.TextUtils.indexOf("", "", 0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 57).intern(), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = f2400 + 27;
        f2403 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2405.onPageStarted(webView, str, bitmap);
            int i4 = f2400 + 67;
            f2403 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, android.text.TextUtils.getCapsMode("", 0, 0) + 22).intern(), m7843((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 234 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i6 = f2403 + 73;
            f2400 = i6 % 128;
            if (i6 % 2 != 0) {
                webViewClient.onPageStarted(webView, str, bitmap);
                return;
            } else {
                webViewClient.onPageStarted(webView, str, bitmap);
                int i7 = 1 / 0;
                return;
            }
        }
        super.onPageStarted(webView, str, bitmap);
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2403 + 123;
        f2400 = i2 % 128;
        ?? r2 = 0;
        try {
            if (i2 % 2 == 0) {
                this.f2405.onPageFinished(webView, str);
                int i3 = 4 / 0;
            } else {
                this.f2405.onPageFinished(webView, str);
            }
            int i4 = f2400 + 21;
            r2 = i4 % 128;
            f2403 = r2;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.widget.ExpandableListView.getPackedPositionForGroup(r2) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(r2) == 0L ? 0 : -1)), (-1) - (android.widget.ExpandableListView.getPackedPositionForChild(r2, r2) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(r2, r2) == 0L ? 0 : -1)), 22 - android.view.KeyEvent.normalizeMetaState(r2)).intern(), m7843((char) ('0' - android.text.AndroidCharacter.getMirror('0')), 268 - android.text.TextUtils.indexOf("", "", (int) r2), 35 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th, (boolean) r2);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i6 = f2403 + 65;
            f2400 = i6 % 128;
            int i7 = i6 % 2;
            webViewClient.onPageFinished(webView, str);
            return;
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2403 + 95;
        f2400 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2405.onLoadResource(webView, str);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.ViewConfiguration.getWindowTouchSlop() >> 8, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22).intern(), m7843((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 303, android.graphics.Color.alpha(0) + 35).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
            return;
        }
        super.onLoadResource(webView, str);
        int i4 = f2400 + 15;
        f2403 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2403 + 31;
        f2400 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2405.shouldInterceptRequest(webView, str);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1) - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.green(0) + 22).intern(), m7843((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 339, 43 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i4 = f2400 + 123;
            f2403 = i4 % 128;
            int i5 = i4 % 2;
            return webViewClient.shouldInterceptRequest(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        int i = 2 % 2;
        int i2 = f2400 + 77;
        f2403 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2405.shouldInterceptRequest(webView, webResourceRequest);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), android.text.TextUtils.getOffsetBefore("", 0), 22 - android.view.View.getDefaultSize(0, 0)).intern(), m7843((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 338, android.view.Gravity.getAbsoluteGravity(0, 0) + 43).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i4 = f2403 + 63;
            f2400 = i4 % 128;
            if (i4 % 2 != 0) {
                return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            }
            webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            throw null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(android.webkit.WebView webView, android.os.Message message, android.os.Message message2) {
        int i = 2 % 2;
        int i2 = f2403 + 7;
        f2400 = i2 % 128;
        java.lang.Object obj = null;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, 22 - android.view.KeyEvent.normalizeMetaState(0)).intern(), m7843((char) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0, 0)), (android.os.Process.myTid() >> 22) + 381, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 39).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2405.onTooManyRedirects(webView, message, message2);
            super.hashCode();
            throw null;
        }
        this.f2405.onTooManyRedirects(webView, message, message2);
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i3 = f2403 + 17;
            f2400 = i3 % 128;
            if (i3 % 2 != 0) {
                webViewClient.onTooManyRedirects(webView, message, message2);
                return;
            } else {
                webViewClient.onTooManyRedirects(webView, message, message2);
                super.hashCode();
                throw null;
            }
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        int i2 = 2 % 2;
        try {
            this.f2405.onReceivedError(webView, i, str, str2);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 23).intern(), m7843((char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 37752), android.view.View.getDefaultSize(0, 0) + 420, 36 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient == null) {
            super.onReceivedError(webView, i, str, str2);
            return;
        }
        int i3 = f2403 + 77;
        f2400 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 == 0) {
            webViewClient.onReceivedError(webView, i, str, str2);
            super.hashCode();
            throw null;
        }
        webViewClient.onReceivedError(webView, i, str, str2);
        int i4 = f2400 + 9;
        f2403 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(android.webkit.WebView webView, android.os.Message message, android.os.Message message2) {
        int i = 2 % 2;
        int i2 = f2403 + 85;
        f2400 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2405.onFormResubmission(webView, message, message2);
            int i4 = f2400 + 15;
            f2403 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, android.graphics.Color.alpha(0) + 22).intern(), m7843((char) ((android.os.Process.myPid() >> 22) + 44342), 456 - android.graphics.Color.green(0), 39 - android.graphics.Color.red(0)).intern(), th, false);
        }
        try {
            android.webkit.WebViewClient webViewClient = this.f2404;
            if (webViewClient == null) {
                super.onFormResubmission(webView, message, message2);
                return;
            }
            int i6 = f2403 + 103;
            f2400 = i6 % 128;
            int i7 = i6 % 2;
            webViewClient.onFormResubmission(webView, message, message2);
        } catch (java.lang.Error e) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.KeyEvent.keyCodeFromString(""), 22 - android.text.TextUtils.getCapsMode("", 0, 0)).intern(), m7843((char) (android.view.KeyEvent.keyCodeFromString("") + 4863), android.view.View.MeasureSpec.getSize(0) + 495, 27 - android.view.View.resolveSize(0, 0)).intern(), (java.lang.Throwable) e, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z) {
        int i = 2 % 2;
        try {
            this.f2405.doUpdateVisitedHistory(webView, str, z);
            int i2 = f2400 + 47;
            f2403 = i2 % 128;
            int i3 = i2 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), android.graphics.Color.alpha(0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23).intern(), m7843((char) android.text.TextUtils.indexOf("", "", 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 522, android.graphics.ImageFormat.getBitsPerPixel(0) + 44).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i4 = f2400 + 13;
            f2403 = i4 % 128;
            if (i4 % 2 == 0) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
                return;
            }
            webViewClient.doUpdateVisitedHistory(webView, str, z);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        int i = 2 % 2;
        int i2 = f2403 + 55;
        f2400 = i2 % 128;
        java.lang.Object obj = null;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) android.view.View.MeasureSpec.getMode(0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), m7843((char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12306), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 565, 39 - android.view.View.combineMeasuredStates(0, 0)).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2405.onReceivedSslError(webView, sslErrorHandler, sslError);
            super.hashCode();
            throw null;
        }
        this.f2405.onReceivedSslError(webView, sslErrorHandler, sslError);
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i3 = f2400 + 33;
            f2403 = i3 % 128;
            if (i3 % 2 == 0) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            } else {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
                throw null;
            }
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(android.webkit.WebView webView, android.webkit.ClientCertRequest clientCertRequest) {
        int i = 2 % 2;
        int i2 = f2400 + 35;
        f2403 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2405.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), android.view.View.resolveSize(0, 0), 22 - android.graphics.Color.blue(0)).intern(), m7843((char) (android.text.TextUtils.getCapsMode("", 0, 0) + 28269), 604 - android.text.TextUtils.indexOf("", ""), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 49).intern(), th, false);
        }
        try {
            android.webkit.WebViewClient webViewClient = this.f2404;
            if (webViewClient == null) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                return;
            }
            int i4 = f2400 + 121;
            f2403 = i4 % 128;
            if (i4 % 2 != 0) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            int i5 = f2403 + 57;
            f2400 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 38 / 0;
            }
        } catch (java.lang.Throwable th2) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (-1) - android.text.TextUtils.lastIndexOf("", '0'), 21 - android.os.Process.getGidForName("")).intern(), m7843((char) (android.os.Process.getGidForName("") + 60448), 652 - android.view.KeyEvent.normalizeMetaState(0), 52 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f2403 + 61;
        f2400 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2405.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                int i3 = 16 / 0;
            } else {
                this.f2405.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) android.view.View.resolveSize(0, 0), android.view.ViewConfiguration.getTapTimeout() >> 16, 23 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m7843((char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.Color.red(0) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_WHILE_LONG_INITIATION, 46 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i4 = f2403 + 101;
            f2400 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = f2403 + 71;
        f2400 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2405.shouldOverrideKeyEvent(webView, keyEvent);
                int i3 = 12 / 0;
            } else {
                this.f2405.shouldOverrideKeyEvent(webView, keyEvent);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.ViewConfiguration.getTouchSlop() >> 8, 21 - android.view.MotionEvent.axisFromString("")).intern(), m7843((char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), android.view.View.combineMeasuredStates(0, 0) + 749, 44 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient == null) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        int i4 = f2403 + 99;
        f2400 = i4 % 128;
        int i5 = i4 % 2;
        boolean shouldOverrideKeyEvent = webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        int i6 = f2403 + 59;
        f2400 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
        return shouldOverrideKeyEvent;
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = f2400 + 85;
        f2403 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2405.onUnhandledKeyEvent(webView, keyEvent);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.indexOf("", ""), 22 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m7843((char) (android.os.Process.myPid() >> 22), 792 - android.text.TextUtils.getOffsetBefore("", 0), 39 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient == null) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            return;
        }
        int i4 = f2400 + 19;
        f2403 = i4 % 128;
        int i5 = i4 % 2;
        webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        int i6 = f2403 + 125;
        f2400 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(android.webkit.WebView webView, float f, float f2) {
        int i = 2 % 2;
        int i2 = f2403 + 59;
        f2400 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2405.onScaleChanged(webView, f, f2);
            int i4 = f2400 + 97;
            f2403 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.ViewConfiguration.getEdgeSlop() >> 16, 21 - android.graphics.ImageFormat.getBitsPerPixel(0)).intern(), m7843((char) android.text.TextUtils.indexOf("", "", 0), 832 - android.view.KeyEvent.normalizeMetaState(0), 35 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i = 2 % 2;
        try {
            this.f2405.onReceivedLoginRequest(webView, str, str2, str3);
            int i2 = f2403 + 35;
            f2400 = i2 % 128;
            int i3 = i2 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), android.view.View.getDefaultSize(0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 22).intern(), m7843((char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 17703), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 867, android.view.KeyEvent.getDeadChar(0, 0) + 43).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i4 = f2403 + 27;
            f2400 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
        int i6 = f2403 + 3;
        f2400 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2400 + 115;
        f2403 = i2 % 128;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) ((-1) - android.text.TextUtils.lastIndexOf("", '0')), android.view.KeyEvent.getDeadChar(0, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), m7843((char) android.view.View.resolveSizeAndState(0, 0, 0), 234 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.View.combineMeasuredStates(0, 0) + 34).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f2405.onPageCommitVisible(webView, str);
            throw null;
        }
        this.f2405.onPageCommitVisible(webView, str);
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i3 = f2400 + 93;
            f2403 = i3 % 128;
            int i4 = i3 % 2;
            webViewClient.onPageCommitVisible(webView, str);
            return;
        }
        super.onPageCommitVisible(webView, str);
        int i5 = f2403 + 33;
        f2400 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        int i = 2 % 2;
        int i2 = f2403 + 51;
        f2400 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2405.onReceivedError(webView, webResourceRequest, webResourceError);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1) - android.graphics.ImageFormat.getBitsPerPixel(0), 21 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)).intern(), m7843((char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 37752), android.widget.ExpandableListView.getPackedPositionChild(0L) + okhttp3.internal.http.StatusLine.HTTP_MISDIRECTED_REQUEST, 36 - (android.os.Process.myTid() >> 22)).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i4 = f2403 + 73;
            f2400 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        int i = 2 % 2;
        try {
            this.f2405.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0, 0)), android.widget.ExpandableListView.getPackedPositionType(0L), 22 - android.text.TextUtils.getCapsMode("", 0, 0)).intern(), m7843((char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 911, android.text.TextUtils.indexOf("", "", 0, 0) + 40).intern(), th, false);
        }
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient != null) {
            int i2 = f2403 + 95;
            f2400 = i2 % 128;
            int i3 = i2 % 2;
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        int i4 = f2400 + 65;
        f2403 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = 2 % 2;
        int i2 = f2403 + 89;
        f2400 = i2 % 128;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7843((char) (android.os.Process.getGidForName("") + 1), android.graphics.drawable.Drawable.resolveOpacity(0, 0), 21 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern(), m7843((char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 12637), 950 - (android.os.Process.myTid() >> 22), 'X' - android.text.AndroidCharacter.getMirror('0')).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2405.onRenderProcessGone(webView, renderProcessGoneDetail);
            throw null;
        }
        this.f2405.onRenderProcessGone(webView, renderProcessGoneDetail);
        android.webkit.WebViewClient webViewClient = this.f2404;
        if (webViewClient == null) {
            return true;
        }
        int i3 = f2400 + 109;
        f2403 = i3 % 128;
        if (i3 % 2 == 0) {
            return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        boolean onRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        int i4 = 4 / 0;
        return onRenderProcessGone;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        if (r5 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        new com.ironsource.adqualitysdk.sdk.i.ds(r8, r12, m7843((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21).intern(), r9).m7590(r8.m7200());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        return m7845();
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo6378(com.ironsource.adqualitysdk.sdk.i.cl clVar, java.lang.String str, java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar, com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        int i = 2 % 2;
        int i2 = f2400 + 69;
        f2403 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                int hashCode = str.hashCode();
                char c = 65535;
                if (hashCode != 368095040) {
                    if (hashCode == 381550901 && str.equals(m7843((char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 46985), 990 - android.view.View.combineMeasuredStates(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 23).intern())) {
                        int i3 = f2400 + 39;
                        int i4 = i3 % 128;
                        f2403 = i4;
                        int i5 = i3 % 2;
                        int i6 = i4 + 101;
                        f2400 = i6 % 128;
                        int i7 = i6 % 2;
                        c = 0;
                    }
                } else if (str.equals(m7843((char) (37484 - android.view.View.resolveSizeAndState(0, 0, 0)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1013, 18 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    int i8 = f2403 + 71;
                    f2400 = i8 % 128;
                    int i9 = i8 % 2;
                    c = 1;
                }
                return m7842();
            }
            str.hashCode();
            throw null;
        } catch (java.lang.Exception e) {
            java.lang.String m7200 = clVar.m7200();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m7843((char) (30384 - android.view.View.combineMeasuredStates(0, 0)), android.text.AndroidCharacter.getMirror('0') + 983, 59 - android.text.TextUtils.lastIndexOf("", '0', 0)).intern());
            sb.append(str);
            sb.append(m7843((char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1090 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 1 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(m7200, sb.toString(), e);
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7843(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2401[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2402)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
