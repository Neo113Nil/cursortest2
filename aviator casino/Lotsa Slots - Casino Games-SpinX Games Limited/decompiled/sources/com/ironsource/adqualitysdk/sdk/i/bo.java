package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class bo extends com.ironsource.adqualitysdk.sdk.i.be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f967 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f968;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f969;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f970;

    static {
        char[] cArr = new char[1080];
        java.nio.ByteBuffer.wrap("\u0000VàüÁ ¢x\u0082\u00adcÒD\u0018%P\u0005\u0086æÀÇw§¶\u0085\u001ee¥DV'0\u0007øæ¹Á8 \u0012\u0080£c\u009dB\u001e\"\u0097\u0000HàÀÁ\u0002¢Y\u0082©cÅ*¶Ê>ëü\u0088§¨WI;në\u000f\u009e/XÌ\u000bí¶\u008db¢>C÷`\u0085\u0000[\u0000PàÕÁ\u0013¢H\u0082\u0081cðD3%a\u0005¼æÕÇC§\u0083\u0088Éäj\u0004ö\u0000DàÜÁ\u0002¢N\u0082\u008acùD3%a\u0005«æøÇr§\u009c\u0088Ài\u0001J{*¥\u0000PàËÁ\u0017¢G\u0082\u008bcüD2%j\u0005¬æ×Ç[§\u0080\u0088Øi!J\u007f*£\u000bñÅ\r%\u0085\u0004Gg\u001cGì¦\u0080\u0081Cà8Àâ#´\u0002\u001abÄM\u009d¬I\u008f>ïá\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0001%j\u0005ªæ×ÇS§\u0096\u0088Ûi2Jw*£\u000bøì\nÍn\u00adÔ\u008e\u0007oLO\u00840ó\u0011=ò_Ò«³õ\u0094~t\u0094UÜË\u001c+©\n`izIó¨\u009b\u008fYî\u0002ÎÚ-\u0086\fklíC½¢~\u0081\u0013áÇÀ\u0086'R\u0006Sf·Eo¤9\u0084·û\u0087ÚU9\u000f\u0019Åx\u0094_*¿é\u009e¢ý6Ü\u0017<ß\u0013\u009drFQ6±\u009a\u0090^÷5×õ6\u0088\u0015Lt\tTÄK\u00adª(\u008aüé§ÈU/1\u000fËn\u0098MS¬\u001b\u008c¬ãbÂ\u0000\"ô\u0001ª`aG\u000b§Ã\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0018%`\u0005\u0087æçÇ\\§\u0096\u0088Þi\u0016J_*´\u000bäì Ít\u00adÒ\u008e\u0000oT\u0000càÖÁ\u001f¢\u0005\u0082\u008ccäD&%}\u0005¥æùÇ\u0014§\u0092\u0088Âi\u0001Jl*¸\u000bùì-Í,\u00adÈ\u008e\u0010oFOÈ0þ\u0011;òeÒ£³õ\u0094Ut\u0081U×6I\u0017h÷ Øâ¹9\u009aIzå[8<@\u001c§ýÇÞ<¿v\u009f¾\u0080öa\u007fA\u0094\"Ä\u0003\u0000äTÄ²¥à\u00864\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0019%i\u0005®æäÇH§¥\u0088Åi\u0000Ji*²\u000bâì\bÍa\u00adÏ\u008e\u001do[O\u008f0ë\u0011!\u0000càÖÁ\u001f¢\u0005\u0082\u008ccäD&%}\u0005¥æùÇ\u0014§\u0092\u0088Âi\u0001Jl*¸\u000bùì-Í,\u00adÈ\u008e\u0010oFOÈ0þ\u0011;òeÒ£³õ\u0094Ut\u0081U×6I\u0017h÷ Øâ¹9\u009aIzå[9<I\u001c\u008eýÄÞ(¿E\u009f¥\u0080àaIA\u0092\"Â\u0003(äAÄ¯¥ý\u0086;goGË(\u0001¾\u009f^\u0017\u007fÕ\u001c\u008e<~Ý\u0012úÓ\u009b½»nX#y\u0084\u0019V6\u001e×Öô\u0080\u0094nµ!Rñs§\u0013\u00010ÂÑ\u008eñX\u008e'¯áL\u0087l~\r *\u0082ÊTë\u0010\u0088Ä©\u008e\u0000càÖÁ\u001f¢\u0005\u0082\u008ccäD&%}\u0005¥æùÇ\u0014§\u0092\u0088Âi\u0001Jl*¸\u000bùì-Í,\u00adÈ\u008e\u0010oFOÈ0þ\u0011;òeÒ£³õ\u0094Ut\u0081U×6I\u0017h÷ Øâ¹9\u009aIzå[$<J\u001c\u0099ýÔÞ3¿a\u009f©\u0080áawA\u0099\"Ö\u0003\u0006äPÄ¶¥õ\u00869goGÐ(\u0016\tpé\u0089Ê×«5\u008ccl§Mó.9aû\u0081s ±Ãêã\u001a\u0002v%§DÝd\b\u0087W¦ßÆ)éz\b¡+îK\u000bjM\u008d\u008e¬ÃÌgï«\u000eò.0Q^¥#E«di\u00072'ÂÆ®ák\u0080\u0005 ÐC\u009eb\u0007\u0002ñ-¢Ìyï6\u008fÓ®\u0095IVh\u001b\b¿+sÊ*êè\u0095\u0086U´µ<\u0094þ÷¥×U69\u0011ýp\u0096PV³)\u0092´ònÝ6<ÿ\u001f\u008b\u007fH^:¹Ü\u0098\u009bø0ÛË:¾\u001ate\u0017DÖ§\u0082\u0087Zæ\u0013Á¥!{\u0000OàßÁ\u0014¢N\u0082\u0096cÞD7%l\u0005 æäÇ\u007f§\u009d\u0088Øi\fJj*®\u0000WàÜÁ\u0010¢\u007f\u0082\u0096cüD0%i\u0005¡æâÇu§\u0091\u0088Æi\u0000J}*£\u0000WàÜÁ\u0010¢\u007f\u0082\u0096cüD0%i\u0005¡æâÇo§¡\u0088à\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u001a%j\u0005©æóÇT§¾\u0088Ãi\u0017J{*\u0094\u000bÿì'Ív\u00adÉ\u008e\u001boAO\u008a0ú\u0011*\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u001b%}\u0005©æèÇ^§¥\u0088Åi\u0000Ji*\u0094\u000bÿì'Ív\u00adÉ\u008e\u001boAO\u008a0ú\u0011*\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0019%i\u0005®æäÇH§¤\u0088Éi\u0007JH*¾\u000bõì>ÍA\u00adÔ\u008e\u001aoYO\u00940ð\u00114ò}Ò¯³ñ\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0001%j\u0005ªæ×ÇS§\u0096\u0088Û\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0001%j\u0005ªæ×ÇS§\u0096\u0088Ûi&Jr*¾\u000bõì'ÍvÝð=x\u001cº\u007fá_\u0011¾}\u0099¡øÑØ\u0016;\\\u001aðz\u001dU}´¸\u0097Ñ÷\nÖZ1¹\u0010ÛpmS¨²ù\u0092;íUÊ\u009a*\n\u000bÁh\u009bHC©\u001e\u008eêï¿Ïj,1\r\u009dmnB\u0018£Þ\u0080¯ànÁ &î\u0007\u009bg\u0007DÒ¥\u008c\u0085Vú$Ûè8¶Qû±s\u0090±óêÓ\u001a2v\u0015¶t×T\u0012·B\u0096Êö/Ùq8¢\u001bß{\u000bZO½\u0096\u009cÔüz>/Þ§ÿe\u009c>¼Î]¢zb\u001b\u0003;ÆØ\u0096ù\u001e\u0099û¶¥Wvt\u000b\u0014ß5\u009bÒBó\u0000\u0093®°_Q#qò\u000e\u008c/ZÌ\u0018ìÈ\u008d\u0096Æ'&¯\u0007md6DÆ¥ª\u0082{ã\u0012ÃÈ \u0099\u0001&aùN±¯K\u008c\u0012ìÌÍ\u0096*P\u000b\u0004k Hbý\u0099\u001d,<å_ÿ\u007fv\u009e\u001e¹ÜØ\u0087ø_\u001b\u0003:îZhu8\u0094û·\u0096×Bö\u0003\u0011×0ÖP2sê\u0092¼²2Í\nìÔ\u000f\u008e/BN\u0015i§\u0089v¨zËÕê£\nS%\u001aDüg¦\u0087\u0005¦þÁºáe\u0000(#ÅB\u009bbw}\u001c\u009c°¼dß<þú\u0019¬9X\u0000gàÜÁ\u0006¢|\u0082\u0081cÿD\u0002%}\u0005©æçÇ\\§\u009a\u0088Ïi*J|*½\u000bõì*Ív\u00adî\u008e\u0006oAO\u0095\u0000gàÜÁ\u0006¢d\u0082\u0082cûD3%}\u0005\u008bæàÇY§\u009b\u0088Éi&Jr*¾\u000bóì\"ÍV\u00adÓ\u008e\u0006oBO\u00930ø\u00110òDÒ¸³ï¨;H\u0080iZ\n6*ÜË\u0095ìs\u008d#\u00adñ\u0000gàÜÁ\u0006¢{\u0082\u0088cüD5%j\u0005¥æäÇT§\u0087\u0088øi\u001cJn*²\u000bÕì'Íw\u00adÖZuºÎ\u009b\u0014ø}Ø\u00939ÿ\u001e!\u007fs_¾¼ö\u009dFý\u0082ÒÇ3?\u0010cp©Qæ¶>\u0097b÷àÔ\b5L\u0015\u0080jìK$¨`\u0088½\u0000gàÜÁ\u0006¢o\u0082\u008dcîD\"%}\u0005¡æãÇO§\u0087\u0088Ãi\u0017JW*³\u0000gàÜÁ\u0006¢{\u0082\u0088cüD5%j\u0005¥æäÇT§\u0087\u0088ïi\nJp*£\u000bâì&Ín\u00ad×\u008e\u0011o_\u0000gàÜÁ\u0006¢{\u0082\u0096cøD:%`\u0005©æåÇ_§\u0097\u0088èi\u0004Jj*¶\u0000gàÜÁ\u0006¢{\u0082\u0085cïD7%b\u0005\u00adæõÇ_§\u0081\u0088ß\u0000RàüÁ%¢j\u0082¶cÙD\u0013%K\u0098¶x\bYÙ:\u0091\u001aIû1Üý½¹\u009dc~7_\u0084?@\u0000Ià÷Á$¢j\u0082¨cÔD\u0012\u0000NàöÁ&¢t\u0082\u00adcÓD\u001f%[\u0005\u0081æÀÇv§º\u0088öi JZ".getBytes(com.google.android.exoplayer2.C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1080);
        f968 = cArr;
        f969 = -4848253644317663047L;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ com.hyprmx.android.sdk.core.DependencyHolder m6583() {
        int i = 2 % 2;
        int i2 = f967 + 19;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        com.hyprmx.android.sdk.core.DependencyHolder m6581 = m6581();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return m6581;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ java.util.List m6585(com.hyprmx.android.sdk.api.data.WebTrafficObject webTrafficObject) {
        int i = 2 % 2;
        int i2 = f970 + 45;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        java.util.List<com.hyprmx.android.sdk.api.data.WebTrafficObject.WebTrafficURL> m6592 = m6592(webTrafficObject);
        int i4 = f967 + 29;
        f970 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return m6592;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ org.json.JSONObject m6586(com.hyprmx.android.sdk.model.PreloadedVastData preloadedVastData) {
        int i = 2 % 2;
        int i2 = f967 + 5;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m6593 = m6593(preloadedVastData);
        int i4 = f970 + 91;
        f967 = i4 % 128;
        int i5 = i4 % 2;
        return m6593;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ com.hyprmx.android.sdk.model.PreloadedVastData m6594(com.hyprmx.android.sdk.core.DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f970 + 75;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        com.hyprmx.android.sdk.model.PreloadedVastData m6584 = m6584(dependencyHolder);
        int i4 = f970 + 69;
        f967 = i4 % 128;
        int i5 = i4 % 2;
        return m6584;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ java.lang.String m6595(com.hyprmx.android.sdk.api.data.Ad ad) {
        int i = 2 % 2;
        int i2 = f967 + 51;
        f970 = i2 % 128;
        if (i2 % 2 != 0) {
            m6589(ad);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        java.lang.String m6589 = m6589(ad);
        int i3 = f967 + 47;
        f970 = i3 % 128;
        int i4 = i3 % 2;
        return m6589;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ com.hyprmx.android.sdk.placement.PlacementController m6596(com.hyprmx.android.sdk.core.HyprMXController hyprMXController) {
        int i = 2 % 2;
        int i2 = f967 + 49;
        f970 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6587(hyprMXController);
        }
        m6587(hyprMXController);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ java.lang.Object m6597(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f967 + 117;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object m6582 = m6582(str);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = f970 + 25;
        f967 = i5 % 128;
        int i6 = i5 % 2;
        return m6582;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ java.lang.String m6598(com.hyprmx.android.sdk.api.data.OfferCacheEntity offerCacheEntity) {
        int i = 2 % 2;
        int i2 = f967 + 73;
        f970 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6590(offerCacheEntity);
        }
        m6590(offerCacheEntity);
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ java.lang.String m6599(com.hyprmx.android.sdk.core.DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f967 + 95;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String m6591 = m6591(dependencyHolder);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return m6591;
    }

    public bo(java.lang.String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final java.lang.String mo6354() {
        int i = 2 % 2;
        int i2 = f970 + 73;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                java.lang.String str = (java.lang.String) com.hyprmx.android.BuildConfig.class.getDeclaredField(m6588((char) (android.view.MotionEvent.axisFromString("") + 1), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, 12 - android.text.TextUtils.getTrimmedLength("")).intern()).get(null);
                int i4 = f967 + 69;
                f970 = i4 % 128;
                int i5 = i4 % 2;
                return str;
            } catch (java.lang.Exception unused) {
                return null;
            }
        } catch (java.lang.Exception unused2) {
            return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936().m8043(com.hyprmx.android.BuildConfig.class, m6588((char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 34112), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 12, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 13).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cc, code lost:
    
        if (r21.equals(m6588((char) android.text.TextUtils.indexOf("", ""), android.view.View.resolveSize(0, 0) + 46, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 13).intern()) != true) goto L106;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.lang.Class mo6353(java.lang.String str) {
        char c = 2;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2118473762:
                if (str.equals(m6588((char) android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, android.text.TextUtils.indexOf("", "", 0, 0) + 6).intern())) {
                    int i2 = f970 + 49;
                    f967 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2115661176:
                if (str.equals(m6588((char) (22011 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')), 508 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -2082076211:
                if (!(!str.equals(m6588((char) (android.view.View.resolveSize(0, 0) + 15975), android.text.TextUtils.lastIndexOf("", '0') + 764, 28 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()))) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -2060981001:
                if (str.equals(m6588((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.view.View.getDefaultSize(0, 0) + 61, (-16777200) - android.graphics.Color.rgb(0, 0, 0)).intern())) {
                    int i4 = f967 + 81;
                    f970 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1783324338:
                if (str.equals(m6588((char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 226 - android.text.TextUtils.getTrimmedLength(""), 54 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1711062568:
                if (str.equals(m6588((char) android.text.TextUtils.indexOf("", ""), 110 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 31 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1632261541:
                if (str.equals(m6588((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 660 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1625751435:
                if (str.equals(m6588((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 395 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 65).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1429076201:
                if (str.equals(m6588((char) android.view.View.MeasureSpec.getSize(0), 633 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 28 - android.view.View.resolveSize(0, 0)).intern())) {
                    int i6 = f970 + 73;
                    f967 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1345825871:
                if (str.equals(m6588((char) ((android.os.Process.myPid() >> 22) + 50501), 94 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 17 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1289932600:
                if (str.equals(m6588((char) android.view.View.MeasureSpec.getSize(0), android.graphics.Color.rgb(0, 0, 0) + 16777770, 16 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1102538544:
                if (str.equals(m6588((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 51926), 717 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 26 - android.view.KeyEvent.normalizeMetaState(0)).intern())) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1056910325:
                if (str.equals(m6588((char) (52095 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 140, 63 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    int i8 = f970 + 89;
                    f967 = i8 % 128;
                    int i9 = i8 % 2;
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -793729563:
                if (str.equals(m6588((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 203, 23 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    int i10 = f967 + 67;
                    f970 = i10 % 128;
                    if (i10 % 2 == 0) {
                        c = '\t';
                        break;
                    } else {
                        c = 'U';
                        break;
                    }
                }
                c = 65535;
                break;
            case -684201479:
                if (str.equals(m6588((char) (20914 - android.text.TextUtils.lastIndexOf("", '0')), 743 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 20 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -411143178:
                if (str.equals(m6588((char) (android.os.Process.getGidForName("") + 1), android.text.TextUtils.getTrimmedLength("") + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, android.view.View.combineMeasuredStates(0, 0) + 57).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -352824194:
                if (str.equals(m6588((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 77 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 17 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -58290677:
                if (str.equals(m6588((char) (android.graphics.Color.alpha(0) + 42347), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 483, 24 - android.text.TextUtils.indexOf("", "")).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -52302939:
                if (str.equals(m6588((char) (android.text.TextUtils.lastIndexOf("", '0') + 65019), 812 - android.view.View.MeasureSpec.getMode(0), android.view.Gravity.getAbsoluteGravity(0, 0) + 52).intern())) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -48720897:
                if (str.equals(m6588((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 280 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 26 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(m6588((char) (android.view.View.MeasureSpec.getMode(0) + 58411), 59 - (android.os.Process.myPid() >> 22), 2 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    int i11 = f970 + 69;
                    f967 = i11 % 128;
                    int i12 = i11 % 2;
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 5206681:
                if (str.equals(m6588((char) (android.text.TextUtils.getOffsetBefore("", 0) + 50799), 792 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 21).intern())) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                break;
            case 217655834:
                if (str.equals(m6588((char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11006), android.graphics.Color.blue(0) + 30, 16 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 748493318:
                if (str.equals(m6588((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 674, 19 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 902272186:
                if (str.equals(m6588((char) (android.os.Process.myTid() >> 22), 608 - android.view.View.MeasureSpec.getMode(0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24).intern())) {
                    int i13 = f967 + 63;
                    f970 = i13 % 128;
                    int i14 = i13 % 2;
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1056638846:
                if (str.equals(m6588((char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 48854), 362 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.TextUtils.getTrimmedLength("") + 33).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1527993897:
                if (str.equals(m6588((char) android.text.TextUtils.indexOf("", "", 0, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 538, 16 - (android.view.KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1564846544:
                if (!(!str.equals(m6588((char) (25010 - android.view.MotionEvent.axisFromString("")), 460 - android.graphics.Color.blue(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24).intern()))) {
                    int i15 = f970 + 79;
                    f967 = i15 % 128;
                    int i16 = i15 % 2;
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1575934042:
                if (str.equals(m6588((char) (android.text.TextUtils.indexOf("", "", 0) + 56760), 692 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 24 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1775126662:
                if (str.equals(m6588((char) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 569, android.graphics.Color.rgb(0, 0, 0) + 16777229).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1872662391:
                if (str.equals(m6588((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 583 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24).intern())) {
                    c = 21;
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
                return com.hyprmx.android.sdk.core.HyprMX.class;
            case 1:
                return com.hyprmx.android.sdk.core.HyprMXController.class;
            case 2:
                return com.hyprmx.android.sdk.placement.PlacementType.class;
            case 3:
                return com.hyprmx.android.sdk.api.data.Ad.class;
            case 4:
                return com.hyprmx.android.sdk.core.DependencyHolder.class;
            case 5:
                return com.hyprmx.android.sdk.model.PreloadedVastData.class;
            case 6:
                return com.hyprmx.android.sdk.utility.HyprMXProperties.class;
            case 7:
            case '\b':
                return com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar.class;
            case '\t':
            case '\n':
                return com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity.class;
            case 11:
            case '\f':
                return com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity.class;
            case '\r':
            case 14:
                return com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity.class;
            case 15:
                return com.hyprmx.android.sdk.activity.HyprMXBaseViewController.class;
            case 16:
                return com.hyprmx.android.sdk.activity.HyprMXVastViewController.class;
            case 17:
                return com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController.class;
            case 18:
                return com.hyprmx.android.sdk.api.data.OfferCacheEntity.class;
            case 19:
                return com.hyprmx.android.sdk.api.data.WebTrafficObject.class;
            case 20:
                return com.hyprmx.android.sdk.api.data.WebTrafficObject.WebTrafficURL.class;
            case 21:
                return com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController.class;
            case 22:
                return com.hyprmx.android.sdk.activity.HyprMXMraidViewController.class;
            case 23:
                return com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController.class;
            case 24:
                return com.hyprmx.android.sdk.activity.HyprMXWebView.class;
            case 25:
                return com.hyprmx.android.sdk.activity.HyprMXWebViewClient.class;
            case 26:
                return com.hyprmx.android.sdk.activity.OfferViewerHandler.class;
            case 27:
                return com.hyprmx.android.sdk.activity.OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return com.hyprmx.android.sdk.graphics.HyprMXSkipController.class;
            case 29:
                return com.hyprmx.android.sdk.graphics.HyprMXSkipController.Listener.class;
            case 30:
            case 31:
                return com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.be.c> mo6355() {
        int i = 2 % 2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(m6588((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 863 - android.view.MotionEvent.axisFromString(""), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 23).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.bo.m6585((com.hyprmx.android.sdk.api.data.WebTrafficObject) list.get(0));
            }
        });
        hashMap.put(m6588((char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 887 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 28).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.bo.m6598((com.hyprmx.android.sdk.api.data.OfferCacheEntity) list.get(0));
            }
        });
        hashMap.put(m6588((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43099), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 915, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 9).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.bo.m6595((com.hyprmx.android.sdk.api.data.Ad) list.get(0));
            }
        });
        hashMap.put(m6588((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 924 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 20 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.bo.m6597((java.lang.String) list.get(0));
            }
        });
        hashMap.put(m6588((char) (android.text.TextUtils.indexOf("", "", 0) + 23058), android.view.MotionEvent.axisFromString("") + 945, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 27).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.bo.m6583();
            }
        });
        hashMap.put(m6588((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 970 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 17).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.bo.m6599((com.hyprmx.android.sdk.core.DependencyHolder) list.get(0));
            }
        });
        hashMap.put(m6588((char) android.text.TextUtils.getCapsMode("", 0, 0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 986, 22 - android.graphics.Color.green(0)).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.bo.m6596((com.hyprmx.android.sdk.core.HyprMXController) list.get(0));
            }
        });
        hashMap.put(m6588((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 1009 - android.view.View.getDefaultSize(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.bo.m6594((com.hyprmx.android.sdk.core.DependencyHolder) list.get(0));
            }
        });
        hashMap.put(m6588((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1024, (android.os.Process.myPid() >> 22) + 13).intern(), new com.ironsource.adqualitysdk.sdk.i.be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final java.lang.Object mo6356(java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar) {
                return com.ironsource.adqualitysdk.sdk.i.bo.m6586((com.hyprmx.android.sdk.model.PreloadedVastData) list.get(0));
            }
        });
        int i2 = f970 + 13;
        f967 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return hashMap;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.util.List<com.hyprmx.android.sdk.api.data.WebTrafficObject.WebTrafficURL> m6592(com.hyprmx.android.sdk.api.data.WebTrafficObject webTrafficObject) {
        int i = 2 % 2;
        int i2 = f970 + 55;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        java.util.List<com.hyprmx.android.sdk.api.data.WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        int i4 = f970 + 23;
        f967 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m6590(com.hyprmx.android.sdk.api.data.OfferCacheEntity offerCacheEntity) {
        int i = 2 % 2;
        int i2 = f967 + 101;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String str = offerCacheEntity.clickThroughUrl;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static com.hyprmx.android.sdk.model.PreloadedVastData m6584(com.hyprmx.android.sdk.core.DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f970 + 107;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        com.hyprmx.android.sdk.model.PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return preloadedData;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static org.json.JSONObject m6593(com.hyprmx.android.sdk.model.PreloadedVastData preloadedVastData) {
        int i = 2 % 2;
        int i2 = f970 + 75;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject parameters = preloadedVastData.getParameters();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return parameters;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m6589(com.hyprmx.android.sdk.api.data.Ad ad) {
        int i = 2 % 2;
        int i2 = f970 + 81;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String str = ad.type;
        if (i3 == 0) {
            throw null;
        }
        int i4 = f967 + 29;
        f970 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return str;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static java.lang.Object m6582(java.lang.String str) {
        int i = 2 % 2;
        char c = 65535;
        switch (str.hashCode()) {
            case -1617199657:
                if (str.equals(m6588((char) (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_EXPIRED_ADS, 7 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)).intern())) {
                    int i2 = f970 + 51;
                    f967 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 2;
                    break;
                }
                break;
            case -1372958932:
                if (!(!str.equals(m6588((char) (39167 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), 1046 - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 12).intern()))) {
                    c = 1;
                    break;
                }
                break;
            case -65580248:
                if (str.equals(m6588((char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), android.view.Gravity.getAbsoluteGravity(0, 0) + 1065, 15 - android.text.TextUtils.indexOf("", "", 0)).intern())) {
                    c = 3;
                    break;
                }
                break;
            case 543046670:
                if (str.equals(m6588((char) android.view.View.resolveSizeAndState(0, 0, 0), android.text.TextUtils.getOffsetBefore("", 0) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_SHOW_EXCEPTION, 7 - android.graphics.ImageFormat.getBitsPerPixel(0)).intern())) {
                    int i4 = f967 + 43;
                    f970 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return com.hyprmx.android.sdk.placement.PlacementType.REWARDED;
        }
        if (c == 1) {
            return com.hyprmx.android.sdk.placement.PlacementType.INTERSTITIAL;
        }
        if (c == 2) {
            return com.hyprmx.android.sdk.placement.PlacementType.INVALID;
        }
        if (c != 3) {
            return null;
        }
        return com.hyprmx.android.sdk.placement.PlacementType.NOT_INITIALIZED;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static com.hyprmx.android.sdk.core.DependencyHolder m6581() {
        int i = 2 % 2;
        int i2 = f970 + 99;
        f967 = i2 % 128;
        if (i2 % 2 == 0) {
            com.hyprmx.android.sdk.core.DependencyHolder dependencyHolder = com.hyprmx.android.sdk.core.DependencyHolder.INSTANCE;
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        com.hyprmx.android.sdk.core.DependencyHolder dependencyHolder2 = com.hyprmx.android.sdk.core.DependencyHolder.INSTANCE;
        int i3 = f967 + 123;
        f970 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return dependencyHolder2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m6591(com.hyprmx.android.sdk.core.DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f970 + 71;
        f967 = i2 % 128;
        if (i2 % 2 == 0) {
            dependencyHolder.getDistributorId();
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        java.lang.String distributorId = dependencyHolder.getDistributorId();
        int i3 = f970 + 3;
        f967 = i3 % 128;
        int i4 = i3 % 2;
        return distributorId;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static com.hyprmx.android.sdk.placement.PlacementController m6587(com.hyprmx.android.sdk.core.HyprMXController hyprMXController) {
        int i = 2 % 2;
        int i2 = f970 + 115;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        com.hyprmx.android.sdk.placement.PlacementController placementController = hyprMXController.getPlacementController();
        int i4 = f970 + 9;
        f967 = i4 % 128;
        int i5 = i4 % 2;
        return placementController;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m6588(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f968[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f969)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
