package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gg extends com.facetec.sdk.fd<java.lang.Number> {
    private static final com.facetec.sdk.fb c = a((com.facetec.sdk.fa) com.facetec.sdk.fc.LAZILY_PARSED_NUMBER);

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.fa f3596a;

    @Override // com.facetec.sdk.fd
    public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
        guVar.e(number);
    }

    private gg(com.facetec.sdk.fa faVar) {
        this.f3596a = faVar;
    }

    private static com.facetec.sdk.fb a(com.facetec.sdk.fa faVar) {
        return new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gg.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;

            /* renamed from: a, reason: collision with root package name */
            private static char[] f3597a;
            private static int b;
            private static long d;
            private static int e;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
            /* JADX WARN: Type inference failed for: r5v2, types: [int] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(short s, short s2, short s3) {
                int i;
                int i2;
                ?? r5 = 4 - (s * 2);
                int i3 = 1 - (s2 * 3);
                int i4 = s3 + 102;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i3];
                if (bArr == null) {
                    byte b2 = r5;
                    i = 0;
                    int i5 = r5;
                    i4 += b2;
                    i2 = i5 + 1;
                    bArr2[i] = (byte) i4;
                    i++;
                    if (i == i3) {
                        return new java.lang.String(bArr2, 0);
                    }
                    b2 = bArr[i2];
                    i5 = i2;
                    i4 += b2;
                    i2 = i5 + 1;
                    bArr2[i] = (byte) i4;
                    i++;
                    if (i == i3) {
                    }
                } else {
                    i = 0;
                    i2 = r5;
                    bArr2[i] = (byte) i4;
                    i++;
                    if (i == i3) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void g(short s, short s2, int i, java.lang.Object[] objArr) {
                int i2;
                int i3 = s2 + 4;
                byte[] bArr = $$a;
                int i4 = 101 - s;
                int i5 = i * 2;
                byte[] bArr2 = new byte[1 - i5];
                if (bArr == null) {
                    int i6 = i3;
                    int i7 = 0;
                    i4 += i3;
                    i3 = i6;
                    i2 = i7;
                    bArr2[i2] = (byte) i4;
                    if (i2 == 0 - i5) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i8 = i3 + 1;
                    int i9 = i2 + 1;
                    i6 = i8;
                    i3 = bArr[i8];
                    i7 = i9;
                    i4 += i3;
                    i3 = i6;
                    i2 = i7;
                    bArr2[i2] = (byte) i4;
                    if (i2 == 0 - i5) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i4;
                    if (i2 == 0 - i5) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{5, 107, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 106};
                $$b = 15;
            }

            static void init$1() {
                $$c = new byte[]{80, 103, -1, -67};
                $$d = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
            }

            @Override // com.facetec.sdk.fb
            public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
                e = (b + 79) % 128;
                if (gwVar.a() != java.lang.Number.class) {
                    return null;
                }
                com.facetec.sdk.gg ggVar = com.facetec.sdk.gg.this;
                e = (b + 125) % 128;
                return ggVar;
            }

            private static void f(char c2, int i, int i2, java.lang.Object[] objArr) {
                com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
                long[] jArr = new long[i2];
                hhVar.e = 0;
                while (hhVar.e < i2) {
                    int i3 = hhVar.e;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(f3597a[i + i3])};
                        java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                        if (d2 == null) {
                            char normalizeMetaState = (char) (android.view.KeyEvent.normalizeMetaState(0) + 45150);
                            int indexOf = android.text.TextUtils.indexOf("", "");
                            int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                            byte b2 = (byte) ($$c[2] + 1);
                            byte b3 = b2;
                            d2 = com.facetec.sdk.al.c(normalizeMetaState, 2150 - indexOf, packedPositionType + 24, 1926116241, false, $$e(b2, b3, (byte) (b3 + 3)), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i3), java.lang.Long.valueOf(d), java.lang.Integer.valueOf(c2)};
                        java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                        if (d3 == null) {
                            char mirror = (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                            int green = android.graphics.Color.green(0);
                            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                            byte[] bArr = $$c;
                            byte b4 = (byte) (bArr[2] + 1);
                            d3 = com.facetec.sdk.al.c(mirror, 1834 - green, (maximumFlingVelocity >> 16) + 24, -1880730373, false, $$e(b4, b4, (byte) bArr.length), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                        }
                        jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                        java.lang.Object[] objArr4 = {hhVar, hhVar};
                        java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                        if (d4 == null) {
                            char scrollBarFadeDuration = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            char mirror2 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int gidForName = android.os.Process.getGidForName("");
                            byte b5 = (byte) ($$c[2] + 1);
                            byte b6 = b5;
                            d4 = com.facetec.sdk.al.c(scrollBarFadeDuration, mirror2 + 2293, 23 - gidForName, -1839099840, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                        int i4 = $11 + 63;
                        $10 = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i2];
                hhVar.e = 0;
                while (hhVar.e < i2) {
                    $11 = ($10 + 41) % 128;
                    cArr[hhVar.e] = (char) jArr[hhVar.e];
                    java.lang.Object[] objArr5 = {hhVar, hhVar};
                    java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
                    if (d5 == null) {
                        char maxKeyCode = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                        byte b7 = (byte) ($$c[2] + 1);
                        byte b8 = b7;
                        d5 = com.facetec.sdk.al.c(maxKeyCode, (maximumDrawingCacheSize >> 24) + 2341, (doubleTapTimeout >> 16) + 24, -1839099840, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                    $10 = ($11 + 19) % 128;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                e = 0;
                b = 1;
                char[] cArr = new char[2156];
                java.nio.ByteBuffer.wrap("ô\u0099Ùç®¹s_@M\u0016ØûçÈ©\u009dzb\r0Í\u0005\u0082ê¢¿X\u008c1RÉ'\u0082ôAÙi®*|áA°\u0016Kû\u0005È/\u009eøc±¥\u0004\u0088zÿ$\"Â\u0011ÐGEªz\u00994Ìç3\u0090aPT\u001f»?îÅÝ½\u0003Yv\u000b¥Ë\u0088Îÿ -\u007f\u0010\u0000GÆª\u009c\u0099·l5AK6\u0015ëóØá\u008etcKP\u0005\u0005Öú¡¨a\u009d.r\u000e'ô\u0014\u008fÊx¿$lül5A\\6\tëöØá\u008e~cKP\r\u0005Çú«¨m\u009drr\u0001'Ä\u0014\u0090Êe¿,löAÓ6\u009däaÙ!\u008eõc\u00adP\u0096\u0006Rû\n¨ôl5AJ6\u0004ëæØá\u008ewcCPG\u0005Âúµ¨g\u009d-l5AJ6\u0004ëæØá\u008e`cMP\u0004\u0005\u009cú·¨z\u009d2r\u0016l5A\\6\u0014ëæØ¯\u008eac@PF\u0005àú\u0081¨E\u009d2r\u0010'Î\u0014¸Ê`¿>lþU\u0098xæ\u000f¼Ò\\á\u0002·\u0091Z§i§<oÃ\u001f\u0091Ì¤\u009eK\u00ad\u001eilhA@6^ëçØ¡\u008e|cPPG\u0005Àú¢¨l\u009d/r\t'Â\u0014\u0098Ê^¿$lúAÔ6ªäZÙ-\u008eçcèÿuÒ]¥CxúK¼\u001daðMÃZ\u0096Ýi¿;q\u000e2á\u0014´ß\u0087\u0085YC,9ÿçÒÉ¥·wGJ0\u001dúðöl5A\\6\tëöØº\u008evcIPF\u0005Þú®¨j\u009drr\n'Â\u0014\u009eÊo¿(l±AÓ6\u009a7a\u001a_m\u000e°ò\u0083¸Õrl5A\\6\tëöØº\u008evcIPF\u0005Ðú®¨f\u009drr\b'Î\u0014\u0091Êt¿\u001clÒA\u008d6\u009bä[Ù.\u008eácôP\u0081\u0006Xû\u0016¨ù\u009d¤st @ßyò\u0010\u0085EXºkö=:Ð\u0005ã\n¶\u009cIâ\u001b*.>ÁD\u0094\u0082§Ýy8\fPß\u009eòÁ\u0085ÉW\u0000j`=¨l5A\\6\tëöØº\u008evcIPF\u0005Þú®¨j\u009drr\n'Â\u0014\u009eÊo¿/lòAÕ6£äsÙ3\u008eæc¶P\u0092\u0006\u0019û\u000b¨âl5AK6\u0015ëóØá\u008e}cAP\u0004\u0005Çú ¨}\u009d8r\u0015'ßlhA@6^ëçØ»\u008ezcHP\r\u0005\u009cú¯¨g\u009d.r\u0012ltAJ6\u0011ëöØ«\u008e=cJP\f\u0005Æl5A_6\u0002ëêØ\u00ad\u008e<cBP\u0000\u0005Þú¢¨{\u009d$r\u0015'ß\u0014\u0099Êl¿9ltAJ6\u001dëðØ½\u008eulFAnlhA@6^ëõØ¼\u008e|c@P\u001c\u0005Ñú³¨&\u009d0r\u0007'Å\u0014\u0089Êg¿+lüAÔ6\u0080äLÙ&\u008eæ\u0007O*x],\u0080ÎljAJ6\u0002ëöØ§\u008e`cPPG\u0005Áú¾¨{\u009dsr\u0004'Ï\u0014ÒÊe¿/lýAÕ6\u0092ä\u0010Ù$\u008eäc¬PÌ\u0006Qû\u0019¨æ\u009d³sD K\u0015\u0001ÊÏ¿\u0090mbB@7\u0000ä×Ù¡\u008f{|7Q\u0015iDDd3,îØÝ\u0089\u008bNf~Ui\u0000ïÿ\u0090\u00adU\u0098]w*\"á\u0011üÏKº\u0001iÓDû3¼á>Ü\n\u008bÊf\u0082Uâ\u0003\u007fþ7\u00adÈ\u0098\u009dvj%e\u0010/Ïáº¾hHGn2.áùÜ\u0085\u008aUljAJ6\u0002ëöØ§\u008e`cPPG\u0005Áú¾¨{\u009dsr\u0004'Ï\u0014ÒÊe¿/lýAÕ6\u0092ä\u0010Ù1\u008eûc÷P\u0081\u0006Fû\u0011¦U\u008buü=!É\u0012\u0098D_©o\u009axÏþ0\u0081bDWL¸;íðÞí\u0000Zu\u0010¦Â\u008bêü\u00ad./\u0013\u000eDÄ©È\u009a±Ìi1$\"ý\u000fÝx\u0095¥a\u00960À÷-Ç\u001eÐKV´)æìÓä<\u0093iXZE\u0084òñ¸\"j\u000fBx\u0005ª\u0087\u0097¦Àl-`\u001e\u0018HÃµ\u008cljAJ6\u0002ëöØ§\u008e`cPPG\u0005Áú¾¨{\u009dsr\u0004'Ï\u0014ÒÊe¿/lýAÕ6\u0092ä\u0010Ù1\u008eûc÷P\u008f\u0006Yû\u001b½y\u0090Xç\n:è\t¨_`\\sq\u0019\u0006DÛ¬èë¾zS\u000f`@5\u0090Êô\u0098\"\u00ad~BSllAM6\u001fëýØ©\u008efcAP\u001a\u0005Æà\u008eÍçº²gMT\u0001\u0002ÍïòÜý\u0089ov\u000e$Ò\u0011\u008bþ¸«g\u0098(FÈ3\u009aà\u000bÍlº'hëU\u009c\u0002@ï\u0015Ü*\u008a¡w°$O\u0011\u001eÿÔ¬ò\u0099§F^3\u0007áÎÎì»£hmU\r\u0003\u009cð\u0083Ý½\u008aal5AY6\u0015ëëØª\u008e|cVPF\u0005Þú®¨j\u009dkrR'\u0084\u0014\u0094Êv¿elþAÕ6\u0091äWÙ,\u008eºc©P\u0090\u0006^û\u0015¨ì\u009d¤sb \u0002\u0015\u0006ÊÓ¿¡mtBJ7\u0019äÀÙê\u008fz|=l5AY6\u0015ëëØª\u008e|cVPF\u0005Þú®¨j\u009dkrR'\u0084\u0014\u0094Êv¿el÷A×6\u0096äQÙ.\u008eäc¶P\u0091\u0006Rû\n¨£\u009d¡sr B\u0015\u0015ÊÕ¿¸mcB\u000b7\u001däÜl5A\\6\tëöØº\u008evcIPF\u0005Þú®¨j\u009dkrR'\u0084\u0014\u009fÊm¿%lêAÄ6ªä_Ù*\u008eðcµP½\u0006^û\u0016¨ù\u009d³si J\u0015\u0010ÊÙ¿ªm=BF7\u001eäÃÙê\u008fz|=ãûÎ\u0084¹Êd(W/\u0001´ì\u0084ßÎ\u008a\bu&'¯\u0012ýýÁ¨\u0011\u009b\u001cE¬0èã>Î\u001b¹_k\u0083Vè\u0001(ìaßE\u0089\u009atÓ'm\u0012jü¶\u0096+»<Ìh\u0011\u008a\"Õt\n\u0099&ªvÿ«\u0000ßµÜ\u0098òï¨2X\u0001\u0012W×ºùÂ\u001fï!\u0098dE\u008cvÅ \u001cÍ7þblhA@6^ëõØ¼\u008e|c@P\u001c\u0005Ñú³¨&\u009d9r\u0003'Ý\u0014\u0095Êb¿/\u0094\r¹,Î~\u0013\u009c \u0097vD\u009b5áäÌÓ»\u0087fyU%\u0003ãîÞl}AJ6\u001eëàØ¼\u008ezcGP6\u0005Êúÿ¨>l}AJ6\u001eëàØ¼\u008ezcGP6\u0005Êúÿ¨>\u009d\u0002rP'\u009f#\u008c\u000e¤yº¤\u0011\u0097XÁ\u0098,¤\u001føJ5µWçÂÒÔ=íh+[}\u0085\u0089]8p\u001a\u0007Jl\u007fAB6\u0005ëéØ¯\u008egcKP\u001bl[A_6\u0000ë¥Ø\u009c\u008efcJP\u001d\u0005Ûúª¨m\u009d}r\u0000'Ä\u0014\u008eÊ!¿\tl÷AÒ6\u009aäSÙ&mÓ@É7\u009cê\u007fÙ)\u008fòbÈQÁ\u0004iû\u000b©Ë\u009cõs\u008c&V\u0015\u001dËå¾¶m7@N7\u0012åÄØë\u008fdbiQ\\l[AA6\u0014ë÷Ø¡\u008ezc@PI\u0005áú\u0083¨C\u009d}r\u0004'Þ\u0014\u0095Êm¿>l¿AÆ6\u009aäLÙc\u008eìcáPÔ\u0006hûN¨¹\u0003À.èYö\u0084E·\u0007áÉ\fè?¶j{\u0095\u001dÇÅl}A@6\u001cëáØ¨\u008ezcWP\u0001Q\u0082|£\u000bñÖ\u0013å\u0018³Ë4Û\u0019ýn\u00ad³U\u0080\u0015ÖÕo\u001dB55+è\u0080ÛÉ\u008d\t`5Si\u0006¤ùÆ«S\u009eJqa$¿\u0017çÉ\u0010k\u000bF#1=ì\u008dßÈ\u0089\u0002d)Wo\u0002½ý\u008a¯\u001a\u009a[uh ½FçlhA@6^ëöØ«\u008epcQP\u001b\u0005×l*£g\u008eOùQ$è\u0017´Au¬G\u009f\u0002Ê\u00935¸guR=½\rèÑÛ\u0090\u0005zl|AZ6\u001cëéØ\u0091\u008ekc\u001cP_\u0097QºyÍg\u0010Þ#\u0082uC\u0098q«4þ¥\u0001\u0098SXf\n\u00898Ü÷ï·1HD\u0001\u0097Ïº÷Í¸l}AJ6\u001eëàØ¼\u008ezcGPF\u0005Áú£¨c\u009drr\u0001'Î\u0014\u0092Êd¿8löAÃ¿¾\u0092\u0089åÝ8#\u000b\u007f]¹°\u0084\u0083õÖ\t)<{ýN±¡Öô\fÇT\u0019\u009dlñ¿d\u0092Uå\u00197\u009a\nå]9°\u007f\u0083SÕ\u009d(Ø{\u0011Nm àóÙl}AJ6\u001eëàØ¼\u008ezcGPF\u0005Õú¨¨g\u009d:r\n'Î\u0014£Êr¿.lôA\u008f6\u0092ä[Ù-\u008eñc«P\u008b\u0006T¾ñ\u0093Æä\u00929l\n0\\ö±Ë\u0082Ê×H()zëO© Òõ\u0011Æ\u0000\u0018¢m°¾q\u0093Cä\u00016\u008a\u000bù\\hl}A@6\u001fëâØ¢\u008evc\u000bP\u001a\u0005Öú¬¨W\u009d:r\u0016'Ã\u0014\u0093Êo¿/lÀAØ6Íä\bÙl\u008eóc¼P\u008c\u0006Rû\n¨ä\u009dµsD T\u0015IÊ\u008c±4\u009c\u001cë\u00026»\u0005ýS ¾\f\u008dYØ\u0081'úu0@d¯HlhA@6^ëçØ¡\u008e|cPP\u0000\u0005ßú¦¨o\u009d8rH'É\u0014\u0089Êh¿&lûA\u008e6\u0093äWÙ-\u008eóc¼P\u0090\u0006Gû\n¨ä\u009d¸sol[AA6\u0014ë÷Ø¡\u008ezc@PD\u0005Êúÿ¨>lhA@6^ëçØ»\u008ezcHP\r\u0005\u009cú£¨a\u009d.r\u0016'Ç\u0014\u009dÊx¿dlöAÄlnAJ6\u0003ëñØãlsAA6\u0019ëñØà\u008e`cRP\n\u0005\u009cú¶¨m\u009d0r\u0013'\u0086\u0014\u008cÊs¿%lïAÓ\u0089|¤]Ó\n\u000eç=÷kl\u0086DµPàÈ\u001f±Mvx$\u0097\u001aÂÙñ\u0092/eé\u0003Ä\"³un\u0098]\u0088\u000b\bæ*Õ/\u0080¼\u007fÎ-\u000b\u0018P÷Q¢ \u0091õO\u0004:Gé\u0085Ä©lkAJ6\u001dëðØà\u008e`cBPG\u0005Þú¤¨l\u009d\u0002r\u0002'Î\u0014\u0092Êr¿#lëAÙ\u0014ì9ÄNÚ\u0093j /öå\u001bÎ(\u0088}Z\u0082mÐíå·\n\u0086_]l\u0017²ìÇª\u001459UN\u0014\u009c×¡²ötlhA@6^ëçØ¡\u008e|cPPG\u0005Ãú¢¨e\u009d(rH'Ê\u0014\u008aÊe¿\u0015lñAÁ6\u0098ä[\u009cc±KÆU\u001bá(¡~u\u0093\u0001 \u0000õÌ\n¥Xom2\u0082C×Æä\u009e:dO&\u009cñ±ÙÆ\u008e\u0014G)!~ñ\u0093¦7¨\u001a\u0080m\u009e°5\u0083|Õ¼8\u0080\u000bÜ^\u0011¡sóæÆÿ)Ó|\u0002OP\u0091¥ä¤79\u001a\tm[¿\u0099\u0082æÕ&8i\u000bP]\u009e Öó9lhA@6^ëöØ·\u008e`cPP\f\u0005ßúé¨j\u009d(r\u000f'Ç\u0014\u0098Ê/¿,löAÎ6\u0092ä[Ù1\u008eäc«P\u008b\u0006Yû\fµ\u009e\u0098¶ï¨2\u0000\u0001AW\u0096º¦\u0089úÜ)#nq\u009bDÓ«äþsÍh\u0013\u0082fÕµ\u0005\u00982ï-=®\u0000ÜW\fºH\u0089qß³\"þq\tDIª\u0083ù®lhA@6^ëóØ«\u008e}c@P\u0006\u0005Àúé¨j\u009d(r\u000f'Ç\u0014\u0098Ê/¿,löAÎ6\u0092ä[Ù1\u008eäc«P\u008b\u0006Yû\f=Í\u0010ågûºV\u0089\u000eßØ2å\u0001£Te«=ùÉÌ\u0094#¨vcEw\u009bÆî\u009a=S\u0010ig4µµ\u0088\u0080ßX2\u0012\u0001 W÷ª¯ùXÌ\u0001\"×qçD yGl6A\u000fo\u0085l3l5AK6\u0015ëóØá\u008ebcAP\u0004\u0005Çú\u0098¨x\u009d4r\u0016'ÎÿUÒ+¥ux\u0093K\u0081\u001d\u0000ð+Ãj\u0096¹iÂ;\u001c\u000e\u0012ád´ª\u0087ïY\u0004,Hÿ\u009eÒ®¥ñw\u0001JD\u001d\u0091ð×Ãû\u00953Y\u0013tm\u00033ÞÕíÇ»FVme,0ÿÏ\u0084\u009dZ¨TG'\u0012è!´ÿ^\u008a\b½Þ\u0090 çþ:\u0018\t\n_\u008b² \u0081áÔ2+Iy\u0097L\u0099£üö%Åz\u001b\u009fnÅ\u0096Q»8Ìm\u0011\u0092\"\u0085t\u0006\u0099%ª`ÿ£\u0000üR\u0018gK\u0088cÝ¬îýl5A\\6\tëöØº\u008evcIPF\u0005Þú®¨j\u009drr\n'Â\u0014\u009eÊb¿\u0015lòAÁ6\u0099äRÙ,\u008e÷c\u0086P\u0086\u0006Rû\u001a¨ø\u009d±sD ]\u0015\u0014Ê×¿ºm>BV7\u0001QB|<\u000bbÖ\u0084å\u0096³\u0006^ mj8\u009aÇ×\u0095\u000f Yl5AK6\u0015ëóØá\u008eqcWP\u001d\u0005íú³¨a\u009d0r\u0003d6IH>\u0016ãðÐâ\u0086ckHX\t\rÚò¡ \u007f\u0095qz\u0007/Û\u001c\u008bÂd·&dðIÇ>\u0093ìOÑ$à\bÍaº4gËT\u0087\u0002KïtÜ{\u0089ãv\u0093$W\u0011Oþ7«ÿ\u0098£F^3\u0004àÖÍûº§hoU\u001a\u0002Ìï\u0096Ü\u0080\u008a`w+$Ù\u0011ÅÿU¬~l5AK6\u0015ëóØá\u008eqcWP\u001d\u0005Óú¤¨k\u009d8N\"c\\\u0014\u0002Éäúö¬fA@r\n'ÂØ©\u008am¿%:\u001c\u0017b`<½Ú\u008eÈØX5~\u00064Sö¬\u008bþFË\u001al5AK6\u0015ëóØá\u008eqcWP\u001d\u0005Ýúµ¨a\u009d8Ó+þU\u0089\u000bTígÿ1oÜIï\u0003ºÚE´\u0017e\"$U½xÃ\u000f\u009dÒ{ái·ùZßi\u0095<JÃ(\u0091á¤¼K\u009e\u001e@¼Î\u0091°æî;\b\b\u001a^\u008a³¬\u0080æÕ\u0016*Ux\u009eMÃò;ßE¨\u001fuÿF¡\u00102ýNÎ\b\u009bËd§6j\u0003<ì\t¹Á\u008a\u0081T !jòéßÌ¨ÔzRG>\u0010îý¼àCÍ4ºhg\u0087T\u0097\u0002\u0012ï;Üq\u0089 vÞ$\t\u0011Xþ?«\u009f\u0098ùF\u00033oà\u0081Í·ºñh-UQ\u0002¤ïÀÜø\u008a%wk$\u0089¿\u0005\u0092oå28Ú\u000b\u009d]\f°}\u00836Öò)\u0098{JN\u0019¡%¤Õ\u0089¶þé#Z\u0010\u000bl5A_6\u0002ëêØ\u00ad\u008e<cWP\f\u0005Þú¡¨'\u009d0r\u0007'Û\u0014\u008fl}A]6\u0011ëéØ¢\u008e|cGPG\u0005Õú¨¨d\u009d9r\u0000'Â\u0014\u008fÊi¿dlìAÏ\u0092Ê¿úÈ®\u0015~&>pê\u009dË®\u008aûl\u0004\bVÀcÏ\u008c©Ùxl5AJ6\u0004ëæØá\u008e~cAP\r\u0005Ûú¦¨W\u009d>r\t'Ï\u0014\u0099Êb¿9l±AØ6\u0098äRlxAC6\u0005ëàØ½\u008egcEP\n\u0005Ùú´Ýæð\u0099\u0087×Z5i2?\u00adÒ\u0098áÏ´\u000fK`\u0019¨°M\u009d3êi7\u0089\u0004×RD¿8\u008c~Ù½&Ñt\u001cAJ®\u007fû·È÷\u0016Vc\u001c°\u0083\u009d¨ê¢8'\u0005KR\u009c¿Ò\u008c´Ú7'mt\u0099l5A_6\u0002ëêØ\u00ad\u008e<cGP\u0019\u0005Çú®¨f\u009d;r\t\u009f\u0012²\u000fÅS\u0018®+ç}5\u0090\u0018£Nl5AK6\u0011ëñØ¯\u008e<cIP\u0000\u0005Áú¤¨'\u009d-r\u0014'Ä\u0014\u009aÊh¿&lúAÓ6Úä]Ù6\u008eæcöPÒ\u0006\u0018û\u001b¨â\u009d»s5 A\u0015\u0018ÊÙ¿½m\u007fBS7\u0007äÁÙ°\u008f'|?Q\u0002\u0006Åû\u0088©o\u009e&sù".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
                f3597a = cArr;
                d = 1876879112512749871L;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(29:159|(1:161)|162|163|(1:165)(1:356)|166|167|(1:169)|170|(14:(5:172|(1:174)|175|176|(2:178|(27:180|181|182|(1:184)(1:316)|185|(1:187)(4:311|(1:313)|314|315)|188|(2:190|(2:192|(23:194|(8:197|198|(1:200)(1:305)|201|202|(3:299|300|(1:302)(2:303|304))(3:204|(5:206|(1:208)|209|210|(2:212|213)(1:295))(2:297|298)|296)|214|195)|306|307|215|216|(2:217|(6:219|(1:221)(1:292)|222|(6:224|(2:226|(11:228|229|230|231|232|233|234|235|(1:237)(1:280)|238|(2:240|241)(2:278|279)))|289|285|286|279)|290|291)(2:293|294))|242|243|244|245|246|(1:248)|249|250|251|252|(1:254)(1:265)|255|256|(1:258)|259|260))(2:308|309))|310|216|(3:217|(0)(0)|291)|242|243|244|245|246|(0)|249|250|251|252|(0)(0)|255|256|(0)|259|260)))(1:355)|245|246|(0)|249|250|251|252|(0)(0)|255|256|(0)|259|260)|317|(10:320|321|(1:323)(1:348)|324|325|(7:329|(4:331|(1:333)(1:344)|334|335)(1:345)|337|(1:339)(1:343)|340|341|342)|346|347|342|318)|349|350|(1:352)(1:354)|353|181|182|(0)(0)|185|(0)(0)|188|(0)|310|216|(3:217|(0)(0)|291)|242|243|244) */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x116d, code lost:
            
                if (r1.isFile() != false) goto L405;
             */
            /* JADX WARN: Code restructure failed: missing block: B:277:0x3882, code lost:
            
                r30 = r5;
                r2 = r37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:336:0x2852, code lost:
            
                if (((r0 ^ r1) | (r0 & r1)) != 0) goto L267;
             */
            /* JADX WARN: Code restructure failed: missing block: B:374:0x1174, code lost:
            
                if (r1.isFile() != false) goto L405;
             */
            /* JADX WARN: Removed duplicated region for block: B:109:0x1159  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x1358  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x1616  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x1715 A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:159:0x17fa A[Catch: all -> 0x0229, TRY_ENTER, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:184:0x29d0 A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:187:0x2a23  */
            /* JADX WARN: Removed duplicated region for block: B:190:0x2b2e  */
            /* JADX WARN: Removed duplicated region for block: B:219:0x35f3  */
            /* JADX WARN: Removed duplicated region for block: B:248:0x376b A[Catch: all -> 0x3875, TryCatch #7 {all -> 0x3875, blocks: (B:246:0x375e, B:248:0x376b, B:249:0x37ac), top: B:245:0x375e }] */
            /* JADX WARN: Removed duplicated region for block: B:254:0x3869  */
            /* JADX WARN: Removed duplicated region for block: B:258:0x38d1 A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:265:0x3871  */
            /* JADX WARN: Removed duplicated region for block: B:293:0x36b8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:311:0x2a27 A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:316:0x2a18  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x04bb  */
            /* JADX WARN: Removed duplicated region for block: B:357:0x39e5  */
            /* JADX WARN: Removed duplicated region for block: B:358:0x16f7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:362:0x1569  */
            /* JADX WARN: Removed duplicated region for block: B:378:0x124c A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x052d A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:382:0x133a  */
            /* JADX WARN: Removed duplicated region for block: B:383:0x1340  */
            /* JADX WARN: Removed duplicated region for block: B:387:0x10db A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:389:0x0f26  */
            /* JADX WARN: Removed duplicated region for block: B:397:0x0d86  */
            /* JADX WARN: Removed duplicated region for block: B:398:0x0c95 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:400:0x0632  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0626  */
            /* JADX WARN: Removed duplicated region for block: B:423:0x04c5  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0869 A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x09c3 A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0b6f  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0cdf A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0d2a  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0dfa  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0ea3 A[Catch: all -> 0x0229, TryCatch #9 {all -> 0x0229, blocks: (B:6:0x00e5, B:8:0x00f2, B:9:0x0135, B:21:0x02bf, B:23:0x02cc, B:24:0x030c, B:35:0x0520, B:37:0x052d, B:38:0x056a, B:43:0x0863, B:45:0x0869, B:46:0x08a1, B:48:0x09b6, B:50:0x09c3, B:51:0x0a0e, B:55:0x0b71, B:57:0x0b7e, B:58:0x0bbf, B:65:0x0cd2, B:67:0x0cdf, B:68:0x0d1f, B:88:0x0e96, B:90:0x0ea3, B:91:0x0edf, B:98:0x105c, B:100:0x1069, B:101:0x10ab, B:129:0x1431, B:131:0x143e, B:132:0x147c, B:143:0x1618, B:145:0x1625, B:146:0x165f, B:153:0x170f, B:155:0x1715, B:156:0x1754, B:159:0x17fa, B:161:0x180c, B:162:0x1846, B:167:0x193e, B:169:0x194b, B:170:0x1986, B:172:0x198f, B:174:0x19a7, B:175:0x19ea, B:182:0x29c3, B:184:0x29d0, B:185:0x2a1a, B:198:0x3038, B:200:0x3045, B:201:0x3091, B:256:0x38c4, B:258:0x38d1, B:259:0x3912, B:206:0x3242, B:208:0x324f, B:209:0x328a, B:311:0x2a27, B:313:0x2a3f, B:314:0x2a83, B:321:0x26da, B:323:0x26e7, B:324:0x2738, B:331:0x2754, B:333:0x2761, B:334:0x27ae, B:376:0x123f, B:378:0x124c, B:379:0x1291, B:401:0x0694, B:403:0x06a1, B:404:0x06d8, B:414:0x07e7, B:416:0x07f4, B:417:0x082b, B:425:0x03a9, B:427:0x03b6, B:428:0x03f9), top: B:5:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0f20  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x104d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] c(android.content.Context context, int i, int i2, int i3) {
                java.lang.String str;
                int i4;
                char c2;
                int i5;
                java.lang.Object d2;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                java.lang.Object d3;
                long j;
                java.lang.Object d4;
                int i12;
                java.lang.String str2;
                java.lang.String[] strArr;
                int i13;
                int i14;
                long j2;
                java.lang.String str3;
                int i15;
                int i16;
                java.lang.Object d5;
                java.lang.String str4;
                int i17;
                java.lang.String str5;
                int i18;
                java.io.File file;
                int i19;
                java.lang.Object d6;
                int i20;
                int i21;
                int i22;
                java.io.File file2;
                java.lang.Object d7;
                java.lang.String str6;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                java.lang.String str7;
                int i28;
                int i29;
                java.lang.Object d8;
                long j3;
                int myUid;
                int i30;
                int i31;
                int i32;
                int i33;
                java.lang.String[] strArr2;
                int i34;
                int i35;
                long j4;
                java.lang.String[] strArr3;
                java.lang.String[][] strArr4;
                java.lang.String str8;
                java.lang.StringBuilder sb;
                int i36;
                java.lang.String str9;
                java.lang.String[] strArr5;
                char c3;
                java.lang.Object d9;
                java.lang.String[] strArr6;
                java.lang.Object invoke;
                int i37;
                int i38;
                int i39;
                java.lang.String str10;
                int i40;
                java.lang.String str11;
                int i41;
                int i42;
                java.lang.String str12;
                int i43;
                int i44;
                java.lang.Object d10;
                java.lang.Object d11;
                int i45;
                int i46;
                java.lang.String[] strArr7;
                int length;
                java.lang.String str13;
                java.lang.String[][] strArr8;
                java.lang.String[] strArr9;
                java.lang.String next;
                int i47;
                java.lang.String[] strArr10;
                int i48;
                int i49;
                java.lang.String str14;
                java.lang.String str15;
                java.lang.String[] strArr11;
                int i50;
                int i51;
                int i52;
                java.lang.String[] strArr12;
                int i53;
                int i54 = i;
                int i55 = e;
                int i56 = 1;
                b = (((i55 | 121) << 1) - (i55 ^ 121)) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                long j5 = 0;
                f((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 911 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 7 - (~(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr);
                int i57 = 0;
                java.lang.String str16 = (java.lang.String) objArr[0];
                char c4 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                int i58 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int i59 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                f((char) ((39083 & i58) + (i58 | 39083)), (indexOf & 1) + (indexOf | 1), ((i59 | 27) << 1) - (i59 ^ 27), objArr2);
                java.lang.String str17 = (java.lang.String) objArr2[0];
                int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                f((char) ((51505 ^ combineMeasuredStates) + ((combineMeasuredStates & 51505) << 1)), (longPressTimeout & 27) + (longPressTimeout | 27), 23 - (~(-(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr3);
                java.lang.String str18 = (java.lang.String) objArr3[0];
                char resolveSize = (char) android.view.View.resolveSize(0, 0);
                int i60 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int i61 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                f(resolveSize, 50 - (~i60), (i61 ^ 18) + ((i61 & 18) << 1), objArr4);
                java.lang.String str19 = (java.lang.String) objArr4[0];
                char mode = (char) android.view.View.MeasureSpec.getMode(0);
                int i62 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                f(mode, ((i62 | 69) << 1) - (i62 ^ 69), 27 - (~android.graphics.Color.blue(0)), objArr5);
                java.lang.String[] strArr13 = {str17, str18, str19, (java.lang.String) objArr5[0]};
                int i63 = 0;
                while (true) {
                    if (i63 >= 4) {
                        str = str16;
                        i4 = i54;
                        c2 = c4;
                        break;
                    }
                    try {
                        java.lang.Object[] objArr6 = {strArr13[i63]};
                        java.lang.Object d12 = com.facetec.sdk.al.d(1873189073);
                        if (d12 == null) {
                            char c5 = (char) (6935 - (android.util.TypedValue.complexToFloat(i57) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i57) == 0.0f ? 0 : -1)));
                            long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                            int myTid = android.os.Process.myTid();
                            byte b2 = (byte) ($$b & 1);
                            byte b3 = (byte) (-b2);
                            java.lang.Object[] objArr7 = new java.lang.Object[i56];
                            g(b2, b3, (byte) (b3 + 1), objArr7);
                            java.lang.String str20 = (java.lang.String) objArr7[i57];
                            java.lang.Class[] clsArr = new java.lang.Class[i56];
                            clsArr[i57] = java.lang.String.class;
                            d12 = com.facetec.sdk.al.c(c5, (elapsedCpuTime > j5 ? 1 : (elapsedCpuTime == j5 ? 0 : -1)) + 2388, (myTid >> 22) + 23, -934682071, false, str20, clsArr);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d12).invoke(null, objArr6)).longValue();
                        long j6 = 398791175;
                        long j7 = -375;
                        long j8 = 376;
                        long elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                        str = str16;
                        long j9 = -1;
                        long j10 = j6 ^ j9;
                        long j11 = (j6 | longValue) ^ j9;
                        long j12 = (j7 * j6) + (j7 * longValue) + ((((j10 | (longValue ^ j9)) ^ j9) | elapsedRealtime | j11) * j8) + ((-376) * ((((elapsedRealtime ^ j9) | j6) ^ j9) | j11)) + (j8 * ((j9 ^ (j10 | elapsedRealtime)) | longValue)) + 538288468;
                        int myTid2 = android.os.Process.myTid();
                        int i64 = ~myTid2;
                        int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                        if (((((int) j12) & (((((~(1212368702 | r6)) | (~(224857707 | r6))) * (-867)) - 1972008908) + (((~(1212368702 | freeMemory)) | (-1298616192) | (~(224857707 | freeMemory))) * (-1734)) + (((~(freeMemory | (-86247490))) | (~((~freeMemory) | 1298616191)) | (~((-1073758485) | freeMemory))) * 867))) | (((int) (j12 >> 32)) & (((((-1492768643) | i64) * (-757)) - 815367878) + ((~((-144704769) | myTid2)) * 1514) + (((~(myTid2 | (-1348063875))) | (~(i64 | 1364972242)) | (-1509677011)) * 757)))) != 0) {
                            int i65 = b;
                            e = (((i65 | 9) << 1) - (i65 ^ 9)) % 128;
                            i54 = i;
                            i4 = (((i63 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) << 1) - (i63 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE)) ^ i54;
                            c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                            break;
                        }
                        i54 = i;
                        int i66 = i63 + 70;
                        i63 = ((i66 | (-69)) << 1) - (i66 ^ (-69));
                        str16 = str;
                        i57 = 0;
                        i56 = 1;
                        c4 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                        j5 = 0;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                char indexOf2 = (char) (android.text.TextUtils.indexOf("", c2) + 1);
                int i67 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i68 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                f(indexOf2, (i67 ^ 98) + ((i67 & 98) << 1), (i68 ^ 12) + ((i68 & 12) << 1), objArr8);
                java.lang.String str21 = (java.lang.String) objArr8[0];
                char edgeSlop = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                f(edgeSlop, (tapTimeout >> 16) + 110, (maximumDrawingCacheSize ^ 13) + ((maximumDrawingCacheSize & 13) << 1), objArr9);
                java.lang.String str22 = (java.lang.String) objArr9[0];
                char normalizeMetaState = (char) android.view.KeyEvent.normalizeMetaState(0);
                int i69 = -(-(android.os.Process.myTid() >> 22));
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                f(normalizeMetaState, (i69 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i69 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1), 18 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr10);
                java.lang.String[] strArr14 = {str21, str22, (java.lang.String) objArr10[0]};
                int i70 = 0;
                while (i70 < 3) {
                    int i71 = b + 29;
                    e = i71 % 128;
                    if (i71 % 2 != 0) {
                        java.lang.Object[] objArr11 = {strArr14[i70]};
                        java.lang.Object d13 = com.facetec.sdk.al.d(2084539986);
                        if (d13 == null) {
                            char c6 = (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6934);
                            int myPid = android.os.Process.myPid();
                            long uptimeMillis = android.os.SystemClock.uptimeMillis();
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            g(b4, b5, (byte) (b5 + 1), objArr12);
                            d13 = com.facetec.sdk.al.c(c6, (myPid >> 22) + 2389, 24 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), -607062870, false, (java.lang.String) objArr12[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d13).invoke(null, objArr11)).longValue();
                        long j13 = 615980171;
                        long j14 = -964;
                        java.lang.String[] strArr15 = strArr14;
                        i52 = i70;
                        long j15 = -1;
                        long j16 = longValue2 ^ j15;
                        long j17 = i54;
                        long j18 = ((-963) * j13) + j14 + (965 * longValue2) + (((j13 ^ j15) | ((j16 | j17) ^ j15)) * j14) + (j14 * (((j16 | (j17 ^ j15)) ^ j15) | ((j16 | j13) ^ j15))) + 356169171;
                        int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                        int i72 = ((int) (j18 << 16)) & ((((~((-454621738) | freeMemory2)) | 562667944) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 53957828 + (((~((~freeMemory2) | (-454621738))) | 562667944) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                        int i73 = ((int) j18) & ((((((~(2128660575 | i54)) | 18231968) * 1504) + 1320243365) + ((~(2146892543 | i54)) * (-1504))) - 113578576);
                        if (((i72 ^ i73) | (i73 & i72)) != 0) {
                            i53 = e + 73;
                            b = i53 % 128;
                            if (i53 % 2 != 0) {
                                int i74 = i52 << 29211;
                                i5 = (~(i74 & i54)) & (i74 | i54);
                            } else {
                                int i75 = i52 + 270;
                                i5 = (~(i54 & i75)) & (i75 | i54);
                            }
                        } else {
                            strArr12 = strArr15;
                            i70 = i52 + 1;
                            e = (b + 7) % 128;
                            strArr14 = strArr12;
                        }
                    } else {
                        java.lang.String[] strArr16 = strArr14;
                        i52 = i70;
                        java.lang.Object[] objArr13 = {strArr16[i52]};
                        java.lang.Object d14 = com.facetec.sdk.al.d(2084539986);
                        if (d14 == null) {
                            char c7 = (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6935);
                            int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                            int indexOf3 = android.text.TextUtils.indexOf("", "", 0, 0);
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 - 1);
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            g(b6, b7, (byte) (b7 + 1), objArr14);
                            d14 = com.facetec.sdk.al.c(c7, (fadingEdgeLength >> 16) + 2389, indexOf3 + 23, -607062870, false, (java.lang.String) objArr14[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d14).invoke(null, objArr13)).longValue();
                        long j19 = 360269070;
                        long j20 = 85;
                        long j21 = -84;
                        long j22 = -1;
                        long j23 = j19 ^ j22;
                        long j24 = longValue3 ^ j22;
                        strArr12 = strArr16;
                        long j25 = i54;
                        long j26 = j25 ^ j22;
                        long j27 = j19 | longValue3;
                        long j28 = (j26 | longValue3) ^ j22;
                        long j29 = (j20 * j19) + (j20 * longValue3) + ((((j23 | j24) ^ j22) | ((j23 | j26) ^ j22) | ((j24 | j26) ^ j22) | ((j27 | j25) ^ j22)) * j21) + (j21 * (((j24 | j25) ^ j22) | j19 | j28)) + (84 * ((j27 ^ j22) | j28)) + 611880272;
                        int i76 = ~i54;
                        if (((((int) j29) & ((((((~(473262947 | i54)) | 1640661004) | (~((-1910489358) | i54))) * (-744)) - 1587633331) + ((i76 | 203434594) * 744) + (((-1640661005) | i54) * 744))) | (((int) (j29 >> 32)) & ((((~(1733270974 | i54)) | (~((-541593641) | i76))) * 920) + 2038856378 + (((~(1666063550 | i76)) | (-1733270975)) * 920) + (((~(1733270974 | i76)) | (~((-67207425) | i54)) | (~((-541593641) | i54))) * 920)))) != 0) {
                            i53 = e + 73;
                            b = i53 % 128;
                            if (i53 % 2 != 0) {
                            }
                        } else {
                            i70 = i52 + 1;
                            e = (b + 7) % 128;
                            strArr14 = strArr12;
                        }
                    }
                    int i77 = i54 ^ i4;
                    int i78 = -i77;
                    int i79 = ((i77 ^ i78) | (i77 & i78)) >> 31;
                    int i80 = (i4 & i79) | (i5 & (~i79));
                    int i81 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i82 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i83 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    f((char) (((i81 | 14765) << 1) - (i81 ^ 14765)), (i82 ^ 141) + ((i82 & 141) << 1), (i83 ^ 13) + ((i83 & 13) << 1), objArr15);
                    java.lang.Object[] objArr16 = {(java.lang.String) objArr15[0]};
                    d2 = com.facetec.sdk.al.d(2084539986);
                    if (d2 == null) {
                        char longPressTimeout2 = (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6935);
                        int argb = android.graphics.Color.argb(0, 0, 0, 0);
                        int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength();
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        g(b8, b9, (byte) (b9 + 1), objArr17);
                        d2 = com.facetec.sdk.al.c(longPressTimeout2, argb + 2389, 23 - (fadingEdgeLength2 >> 16), -607062870, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr16)).longValue();
                    long j30 = -269156041;
                    long j31 = -754;
                    long j32 = -1;
                    long j33 = j30 ^ j32;
                    long j34 = j33 | longValue4;
                    long elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
                    long j35 = elapsedCpuTime2 ^ j32;
                    long j36 = (755 * j30) + ((-753) * longValue4) + (((j34 ^ j32) | ((j33 | elapsedCpuTime2) ^ j32) | ((longValue4 | elapsedCpuTime2) ^ j32)) * j31) + (j31 * (((j34 | elapsedCpuTime2) ^ j32) | ((longValue4 | (j30 | j35)) ^ j32))) + (754 * (j33 | j35)) + 1241305383;
                    i6 = i;
                    int i84 = ~((-2020889137) | i6);
                    int i85 = ~i6;
                    i7 = ((int) (j36 >> 32)) & (((1209270800 | i84) * (-814)) + 172264101 + ((i84 | (~(836851748 | i85)) | 25233412) * 407) + (((~(2020889136 | i6)) | 25233412 | (~((-836851749) | i6))) * 407));
                    int i86 = (~((-1555061013) | i85)) | 269486100 | (~(1302679873 | i85));
                    i8 = ((int) j36) & ((((~((-17104962) | i6)) | i86) * 590) + 1438757535 + (i86 * (-1180)) + (((~((-1302679874) | i85)) | (~(1555061012 | i85))) * 590));
                    if (((i7 ^ i8) | (i7 & i8)) == 0) {
                        e = (b + 5) % 128;
                        i9 = i6 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
                    } else {
                        char mode2 = (char) android.view.View.MeasureSpec.getMode(0);
                        int i87 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i88 = (i87 * 375) - 115038;
                        int i89 = ~i87;
                        int i90 = ~((i89 ^ 154) | (i89 & 154));
                        int i91 = ~(i85 | i87);
                        int i92 = -(-(((i90 ^ i91) | (i90 & i91)) * (-374)));
                        int i93 = ~(i89 | (-155));
                        int i94 = ~((i87 & i85) | (i85 ^ i87));
                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        f(mode2, ((((i88 & i92) + (i88 | i92)) + ((~((i87 ^ (-155)) | (i87 & (-155)))) * 748)) - (~(((i94 & i93) | (i93 ^ i94)) * 374))) - 1, ((maxKeyCode | 24) << 1) - (maxKeyCode ^ 24), objArr18);
                        java.lang.Object[] objArr19 = {(java.lang.String) objArr18[0]};
                        java.lang.Object d15 = com.facetec.sdk.al.d(1590238701);
                        if (d15 == null) {
                            char trimmedLength = (char) android.text.TextUtils.getTrimmedLength("");
                            int argb2 = android.graphics.Color.argb(0, 0, 0, 0);
                            int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 - 1);
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            g(b10, b11, (byte) (b11 + 1), objArr20);
                            d15 = com.facetec.sdk.al.c(trimmedLength, 2078 - argb2, 23 - packedPositionChild, -114923755, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.String str23 = (java.lang.String) ((java.lang.reflect.Method) d15).invoke(null, objArr19);
                        if (str23 == null || str23.length() == 0) {
                            int i95 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                            int i96 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i97 = -android.graphics.Color.blue(0);
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            f((char) ((37661 ^ i95) + ((i95 & 37661) << 1)), ((i96 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE) << 1) - (i96 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE), ((i97 | 24) << 1) - (i97 ^ 24), objArr21);
                            java.lang.Object[] objArr22 = {(java.lang.String) objArr21[0]};
                            java.lang.Object d16 = com.facetec.sdk.al.d(1590238701);
                            if (d16 == null) {
                                char mode3 = (char) android.view.View.MeasureSpec.getMode(0);
                                int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                byte b12 = (byte) 0;
                                byte b13 = (byte) (b12 - 1);
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                g(b12, b13, (byte) (b13 + 1), objArr23);
                                d16 = com.facetec.sdk.al.c(mode3, (keyRepeatDelay >> 16) + 2078, lastIndexOf + 25, -114923755, false, (java.lang.String) objArr23[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            java.lang.String str24 = (java.lang.String) ((java.lang.reflect.Method) d16).invoke(null, objArr22);
                            if (str24 == null || str24.length() == 0) {
                                i9 = i6;
                            } else {
                                b = (e + 57) % 128;
                                i9 = (i6 & (-268)) | (i85 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
                            }
                        } else {
                            int b14 = com.facetec.sdk.aw.a.b();
                            int i98 = ~b14;
                            int i99 = ((~((172863561 ^ b14) | (172863561 & b14))) | (~(((-874422670) ^ i98) | ((-874422670) & i98) | (-172863562)))) * (-406);
                            int i100 = ~((b14 ^ 874422669) | (874422669 & b14));
                            int i101 = ~(((-172863562) ^ i98) | ((-172863562) & i98));
                            int i102 = ~(((-629071083) ^ i85) | ((-629071083) & i85));
                            int i103 = ~((1411493624 ^ i6) | (1411493624 & i6));
                            int i104 = (i102 ^ i103) | (i102 & i103);
                            int i105 = ~(((-1411493625) & i85) | ((-1411493625) ^ i85));
                            int i106 = (-2058480607) - (~(((i104 ^ i105) | (i104 & i105)) * 959));
                            int i107 = ((1270965776 | i106) << 1) - (i106 ^ 1270965776);
                            int i108 = (~(((-629071083) & i6) | ((-629071083) ^ i6))) | (~((1411493624 ^ i85) | (1411493624 & i85)));
                            int i109 = ~((-1411493625) | i6);
                            int i110 = -(-(((i108 ^ i109) | (i108 & i109)) * 959));
                            if ((317870080 & i99) + (i99 | 317870080) + ((~((i98 ^ 172863561) | (172863561 & i98) | (-874422670))) * (-406)) + (((i100 ^ i101) | (i100 & i101)) * 406) > (i107 ^ i110) + ((i110 & i107) << 1)) {
                                i10 = ~(i6 & 7428);
                                i11 = i6 | 7428;
                            } else {
                                i10 = ~(i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
                                i11 = i6 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE;
                            }
                            i9 = i10 & i11;
                        }
                    }
                    int i111 = (~(i6 & i80)) & (i6 | i80);
                    int i112 = -i111;
                    int i113 = ((i111 ^ i112) | (i111 & i112)) >> 31;
                    int i114 = i9 & (~i113);
                    int i115 = i113 & i80;
                    int i116 = (i114 ^ i115) | (i114 & i115);
                    d3 = com.facetec.sdk.al.d(-318294282);
                    if (d3 == null) {
                        char keyRepeatTimeout = (char) (28045 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int mode4 = android.view.View.MeasureSpec.getMode(0);
                        int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode();
                        byte b15 = (byte) ($$b & 1);
                        byte b16 = (byte) (-b15);
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        g(b15, b16, (byte) (b16 + 1), objArr24);
                        d3 = com.facetec.sdk.al.c(keyRepeatTimeout, mode4 + 2318, (maxKeyCode2 >> 16) + 23, 1256737806, false, (java.lang.String) objArr24[0], new java.lang.Class[0]);
                    }
                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, null)).longValue();
                    long j37 = 31938918;
                    long j38 = j37 ^ j32;
                    long j39 = longValue5 ^ j32;
                    j = i6;
                    long j40 = j ^ j32;
                    long j41 = 490;
                    long j42 = (491 * j37) + ((-489) * longValue5) + ((-490) * (j38 | j39 | j40)) + ((((j39 | j) ^ j32) | ((j37 | j39) ^ j32)) * j41) + (j41 * j38) + 399879183;
                    int i117 = ((int) (j42 >> 32)) & ((((~(i85 | (-2061440945))) | 1523258800) * 446) + 384374654 + (((~((-538182145) | i6)) | (-2147473334)) * 446) + 768592032);
                    int i118 = ((int) j42) & ((((~(1639035752 | i6)) | (-1218705134)) * (-668)) + 1193087273 + (((~((-1218705134) | i6)) | 1639035752) * 1336) + (((-134366342) | i6) * 668));
                    int i119 = (i117 ^ i118) | (i117 & i118);
                    int i120 = (~i119) + (i119 << 1);
                    int i121 = -i119;
                    int i122 = ((i119 ^ i121) | (i119 & i121)) >> 31;
                    int i123 = (~i122) & i6;
                    int i124 = i122 & (i6 ^ ((i120 & 200) + (i120 | 200)));
                    int i125 = ((~i116) & i6) | (i116 & i85);
                    int i126 = -i125;
                    int i127 = ((i125 ^ i126) | (i125 & i126)) >> 31;
                    int i128 = ((i124 ^ i123) | (i124 & i123)) & (~i127);
                    int i129 = i116 & i127;
                    int i130 = (i128 ^ i129) | (i129 & i128);
                    char deadChar = (char) android.view.KeyEvent.getDeadChar(0, 0);
                    int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                    f(deadChar, ((offsetBefore | 203) << 1) - (offsetBefore ^ 203), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19, objArr25);
                    java.lang.String str25 = (java.lang.String) objArr25[0];
                    char c8 = (char) (23320 - (~(-(-android.graphics.Color.argb(0, 0, 0, 0)))));
                    int i131 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    f(c8, 222 - (~i131), (scrollBarFadeDuration & 6) + (scrollBarFadeDuration | 6), objArr26);
                    java.lang.Object[] objArr27 = {str25, (java.lang.String) objArr26[0]};
                    d4 = com.facetec.sdk.al.d(-100890377);
                    if (d4 == null) {
                        char c9 = (char) (23780 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                        int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                        byte b17 = (byte) ($$b >>> 2);
                        byte b18 = (byte) (b17 - 4);
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        g(b17, b18, (byte) (b18 + 1), objArr28);
                        d4 = com.facetec.sdk.al.c(c9, (pressedStateDuration >> 16) + 1364, (maximumDrawingCacheSize2 >> 24) + 24, 1578365455, false, (java.lang.String) objArr28[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                    }
                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr27)).longValue();
                    long j43 = -1858890050;
                    long j44 = -245;
                    long j45 = longValue6 ^ j32;
                    long j46 = (j45 | j) ^ j32;
                    long j47 = ((((((-244) * j43) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE * longValue6)) + ((((j45 | j40) ^ j32) | ((j45 | j43) ^ j32)) * j44)) + (j44 * j46)) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE * (j46 | j43))) - 161174097;
                    int i132 = ((int) (j47 >> 32)) & ((((i85 | 1480886453) * 1324) - 818884594) + (((~((-666579787) | i6)) | (~(2103806197 | i6))) * (-1324)) + 67534208);
                    int i133 = ~(523353448 | i6);
                    int i134 = ((int) j47) & (((((1960579858 | i133) * (-220)) + 1212497711) + ((i133 | 1623982610) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1612773594);
                    int i135 = (i132 ^ i134) | (i132 & i134);
                    int i136 = -i135;
                    int i137 = ((i135 ^ i136) | (i135 & i136)) >> 31;
                    int i138 = (~i137) & i6;
                    int i139 = i137 & (~(i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)) & (i6 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
                    int i140 = ((~i130) & i6) | (i130 & i85);
                    int i141 = -i140;
                    int i142 = ((i140 ^ i141) | (i140 & i141)) >> 31;
                    int i143 = ((i139 ^ i138) | (i139 & i138)) & (~i142);
                    int i144 = i130 & i142;
                    i12 = (i144 ^ i143) | (i144 & i143);
                    str2 = "";
                    char offsetAfter = (char) android.text.TextUtils.getOffsetAfter(str2, 0);
                    int i145 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    f(offsetAfter, (i145 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE) + ((i145 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE) << 1), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 31, objArr29);
                    java.lang.String str26 = (java.lang.String) objArr29[0];
                    int i146 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    float maxVolume = android.media.AudioTrack.getMaxVolume();
                    int i147 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    f((char) ((45899 & i146) + (i146 | 45899)), (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 259, (i147 & 23) + (i147 | 23), objArr30);
                    java.lang.String str27 = (java.lang.String) objArr30[0];
                    char c10 = (char) ((-android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)) - 1);
                    int i148 = -android.text.TextUtils.indexOf(str2, str2, 0, 0);
                    int i149 = -android.os.Process.getGidForName(str2);
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    f(c10, (i148 & 283) + (i148 | 283), ((i149 | 27) << 1) - (i149 ^ 27), objArr31);
                    java.lang.String str28 = (java.lang.String) objArr31[0];
                    char scrollBarFadeDuration2 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i150 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    f(scrollBarFadeDuration2, (i150 & 312) + (i150 | 312), 12 - (~(-android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr32);
                    strArr = new java.lang.String[]{str26, str27, str28, (java.lang.String) objArr32[0]};
                    i13 = 0;
                    i14 = 4;
                    while (true) {
                        if (i13 < i14) {
                            j2 = j;
                            str3 = str2;
                            i15 = i12;
                            i16 = i6;
                            break;
                        }
                        java.lang.Object[] objArr33 = {strArr[i13]};
                        java.lang.Object d17 = com.facetec.sdk.al.d(1450487247);
                        if (d17 == null) {
                            char red = (char) (6935 - android.graphics.Color.red(0));
                            int indexOf4 = android.text.TextUtils.indexOf(str2, str2, 0, 0);
                            int keyCodeFromString = android.view.KeyEvent.keyCodeFromString(str2);
                            byte b19 = (byte) ($$b >>> 2);
                            byte b20 = (byte) (b19 - 4);
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            g(b19, b20, (byte) (b20 + 1), objArr34);
                            d17 = com.facetec.sdk.al.c(red, 2389 - indexOf4, keyCodeFromString + 23, -241445065, false, (java.lang.String) objArr34[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d17).invoke(null, objArr33)).longValue();
                        long j48 = 879071951;
                        strArr11 = strArr;
                        j2 = j;
                        long j49 = 140;
                        i50 = i12;
                        long freeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                        str3 = str2;
                        i51 = i13;
                        long j50 = (j48 ^ j32) | longValue7;
                        long j51 = freeMemory3 ^ j32;
                        long j52 = (141 * j48) + ((-279) * longValue7) + ((longValue7 | freeMemory3) * j49) + ((-280) * ((j50 ^ j32) | ((j51 | longValue7) ^ j32))) + ((((j50 | freeMemory3) ^ j32) | (((longValue7 ^ j32) | j48) ^ j32) | ((j51 | j48) ^ j32)) * j49) + 972104690;
                        int myUid2 = android.os.Process.myUid();
                        int i151 = (~((-1019305867) | myUid2)) | 415258112;
                        int i152 = ((int) (j52 >> 32)) & ((i151 * 992) + 1537498186 + ((i151 | (~((~myUid2) | 1021968298))) * (-496)) + ((myUid2 | 417920544) * 496));
                        int elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
                        int i153 = ~elapsedCpuTime3;
                        int i154 = ((int) j52) & (((((~((-120005056) | i153)) | (-1557231466)) * (-602)) - 825915228) + (((~(elapsedCpuTime3 | (-120005056))) | 52822166 | (~((-1490048577) | i153))) * (-301)) + ((~((-1557231466) | i153)) * 301));
                        if (((i152 ^ i154) | (i152 & i154)) != 0) {
                            i16 = i6 ^ (i51 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                            i15 = i50;
                            break;
                        }
                        i13 = i51 + 1;
                        strArr = strArr11;
                        j = j2;
                        i12 = i50;
                        str2 = str3;
                        i14 = 4;
                    }
                    int i155 = ((~i15) & i6) | (i15 & i85);
                    int i156 = -i155;
                    int i157 = ((i155 ^ i156) | (i155 & i156)) >> 31;
                    int i158 = i16 & (~i157);
                    int i159 = i15 & i157;
                    int i160 = (i158 ^ i159) | (i158 & i159);
                    char resolveSizeAndState = (char) android.view.View.resolveSizeAndState(0, 0, 0);
                    int resolveSize2 = android.view.View.resolveSize(0, 0);
                    int i161 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    f(resolveSizeAndState, resolveSize2 + 325, (i161 & 13) + (i161 | 13), objArr35);
                    java.lang.Object[] objArr36 = {(java.lang.String) objArr35[0]};
                    d5 = com.facetec.sdk.al.d(1590238701);
                    if (d5 == null) {
                        char packedPositionChild2 = (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L));
                        int rgb = android.graphics.Color.rgb(0, 0, 0);
                        int scrollBarFadeDuration3 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                        byte b21 = (byte) 0;
                        byte b22 = (byte) (b21 - 1);
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        g(b21, b22, (byte) (b22 + 1), objArr37);
                        d5 = com.facetec.sdk.al.c(packedPositionChild2, (-16775138) - rgb, (scrollBarFadeDuration3 >> 16) + 24, -114923755, false, (java.lang.String) objArr37[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    str4 = (java.lang.String) ((java.lang.reflect.Method) d5).invoke(null, objArr36);
                    if (str4 == null) {
                        com.facetec.sdk.aw.a.b();
                        char c11 = (char) (0 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))));
                        str5 = str3;
                        int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int i162 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        f(c11, 337 - lastIndexOf2, (i162 ^ 9) + ((i162 & 9) << 1), objArr38);
                        if (str4.contains((java.lang.String) objArr38[0])) {
                            int i163 = e;
                            int i164 = ((i163 | 49) << 1) - (i163 ^ 49);
                            b = i164 % 128;
                            if (i164 % 2 == 0) {
                                i17 = i85;
                                i18 = (i6 & (-24227)) | (i17 & 24226);
                            } else {
                                i17 = i85;
                                i18 = i6 ^ 250;
                            }
                            int i165 = ((~i160) & i6) | (i160 & i17);
                            int i166 = -i165;
                            int i167 = ((i165 ^ i166) | (i165 & i166)) >> 31;
                            int i168 = (i160 & i167) | (i18 & (~i167));
                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                            f((char) android.text.TextUtils.indexOf(str5, str5, 0), 347 - (~android.view.MotionEvent.axisFromString(str5)), 16 - (~(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr39);
                            java.lang.String str29 = (java.lang.String) objArr39[0];
                            int i169 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int i170 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                            int i171 = -android.text.TextUtils.getTrimmedLength(str5);
                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                            f((char) (((i169 | 1) << 1) - (i169 ^ 1)), (i170 & 364) + (i170 | 364), (i171 & 6) + (i171 | 6), objArr40);
                            java.lang.String str30 = (java.lang.String) objArr40[0];
                            file = new java.io.File(str29);
                            if (file.exists()) {
                                int i172 = e;
                                b = ((i172 & 37) + (i172 | 37)) % 128;
                                if (file.isFile()) {
                                    try {
                                        java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                                        f((char) android.view.View.MeasureSpec.getSize(0), 370 - android.view.KeyEvent.keyCodeFromString(str5), android.view.View.resolveSizeAndState(0, 0, 0) + 2, objArr41);
                                        java.util.Scanner useDelimiter = scanner.useDelimiter((java.lang.String) objArr41[0]);
                                        if (useDelimiter.hasNext()) {
                                            e = (b + 49) % 128;
                                            str15 = useDelimiter.next();
                                        } else {
                                            str15 = str5;
                                        }
                                        useDelimiter.close();
                                    } catch (java.io.IOException unused) {
                                    }
                                    if (str15.contains(str30)) {
                                        i19 = (i6 & (-252)) | (i17 & 251);
                                        int i173 = ((~i168) & i6) | (i168 & i17);
                                        int i174 = (i173 | (-i173)) >> 31;
                                        int i175 = i19 & (~i174);
                                        int i176 = i168 & i174;
                                        int i177 = (i176 ^ i175) | (i176 & i175);
                                        char keyRepeatTimeout2 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        int i178 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int i179 = -android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                        f(keyRepeatTimeout2, (i178 ^ 372) + ((i178 & 372) << 1), (i179 & 22) + (i179 | 22), objArr42);
                                        java.lang.Object[] objArr43 = {(java.lang.String) objArr42[0]};
                                        d6 = com.facetec.sdk.al.d(1590238701);
                                        if (d6 == null) {
                                            char c12 = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                                            int offsetAfter2 = android.text.TextUtils.getOffsetAfter(str5, 0);
                                            int deadChar2 = android.view.KeyEvent.getDeadChar(0, 0);
                                            byte b23 = (byte) 0;
                                            byte b24 = (byte) (b23 - 1);
                                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                                            g(b23, b24, (byte) (b24 + 1), objArr44);
                                            d6 = com.facetec.sdk.al.c(c12, offsetAfter2 + 2078, deadChar2 + 24, -114923755, false, (java.lang.String) objArr44[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) d6).invoke(null, objArr43)).toLowerCase();
                                        int i180 = -android.os.Process.getGidForName(str5);
                                        int indexOf5 = android.text.TextUtils.indexOf(str5, str5, 0, 0);
                                        int i181 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                                        f((char) ((i180 & 27441) + (i180 | 27441)), ((indexOf5 | 395) << 1) - (indexOf5 ^ 395), ((i181 | 4) << 1) - (i181 ^ 4), objArr45);
                                        int i182 = !lowerCase.contains((java.lang.String) objArr45[0]) ? (i6 & (-265)) | (i17 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) : i6;
                                        int i183 = (~(i6 & i177)) & (i6 | i177);
                                        int i184 = -i183;
                                        int i185 = ((i183 ^ i184) | (i183 & i184)) >> 31;
                                        int i186 = i182 & (~i185);
                                        int i187 = i177 & i185;
                                        int i188 = (i187 ^ i186) | (i187 & i186);
                                        int i189 = -android.graphics.Color.rgb(0, 0, 0);
                                        int resolveSize3 = android.view.View.resolveSize(0, 0);
                                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                                        f((char) (((-16777216) ^ i189) + ((i189 & (-16777216)) << 1)), ((resolveSize3 | 399) << 1) - (resolveSize3 ^ 399), android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 43, objArr46);
                                        java.lang.String str31 = (java.lang.String) objArr46[0];
                                        char trimmedLength2 = (char) (1326 - android.text.TextUtils.getTrimmedLength(str5));
                                        int i190 = -android.graphics.Color.argb(0, 0, 0, 0);
                                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                                        f(trimmedLength2, ((i190 | 441) << 1) - (i190 ^ 441), (-16777176) - android.graphics.Color.rgb(0, 0, 0), objArr47);
                                        java.lang.String str32 = (java.lang.String) objArr47[0];
                                        char tapTimeout2 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                                        int i191 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                        int i192 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                                        f(tapTimeout2, 480 - (~i191), (i192 & 27) + (i192 | 27), objArr48);
                                        java.lang.String str33 = (java.lang.String) objArr48[0];
                                        int i193 = -(-android.text.TextUtils.getOffsetAfter(str5, 0));
                                        int i194 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                        int i195 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                                        f((char) ((51775 ^ i193) + ((i193 & 51775) << 1)), (i194 ^ androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT) + ((i194 & androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT) << 1), ((i195 | 27) << 1) - (i195 ^ 27), objArr49);
                                        java.lang.String str34 = (java.lang.String) objArr49[0];
                                        char threadPriority = (char) (20119 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                        int i196 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                        int i197 = -android.view.KeyEvent.getDeadChar(0, 0);
                                        java.lang.Object[] objArr50 = new java.lang.Object[1];
                                        f(threadPriority, ((i196 | 535) << 1) - (i196 ^ 535), ((i197 | 27) << 1) - (i197 ^ 27), objArr50);
                                        java.lang.String str35 = (java.lang.String) objArr50[0];
                                        char scrollBarFadeDuration4 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int i198 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                        int i199 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                                        f(scrollBarFadeDuration4, (i198 & 562) + (i198 | 562), (i199 & 27) + (i199 | 27), objArr51);
                                        java.lang.String[] strArr17 = {str31, str32, str33, str34, str35, (java.lang.String) objArr51[0]};
                                        i20 = 0;
                                        i21 = 6;
                                        while (true) {
                                            if (i20 < i21) {
                                                i22 = i6;
                                                break;
                                            }
                                            int i200 = e;
                                            b = (((i200 | 111) << 1) - (i200 ^ 111)) % 128;
                                            java.lang.Object[] objArr52 = {strArr17[i20]};
                                            java.lang.Object d18 = com.facetec.sdk.al.d(1590238701);
                                            if (d18 == null) {
                                                char size = (char) android.view.View.MeasureSpec.getSize(0);
                                                int fadingEdgeLength3 = android.view.ViewConfiguration.getFadingEdgeLength();
                                                long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                                                byte b25 = (byte) 0;
                                                byte b26 = (byte) (b25 - 1);
                                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                g(b25, b26, (byte) (b26 + 1), objArr53);
                                                d18 = com.facetec.sdk.al.c(size, (fadingEdgeLength3 >> 16) + 2078, 25 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), -114923755, false, (java.lang.String) objArr53[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            java.lang.String str36 = (java.lang.String) ((java.lang.reflect.Method) d18).invoke(null, objArr52);
                                            if (str36 != null && str36.length() != 0) {
                                                int i201 = b;
                                                e = ((i201 ^ 35) + ((i201 & 35) << 1)) % 128;
                                                i22 = (~(i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE)) & (i6 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE);
                                                break;
                                            }
                                            i20 = (i20 ^ 1) + ((i20 & 1) << 1);
                                            i21 = 6;
                                        }
                                        int i202 = (~(i6 & i188)) & (i6 | i188);
                                        int i203 = -i202;
                                        int i204 = ((i202 ^ i203) | (i202 & i203)) >> 31;
                                        int i205 = i22 & (~i204);
                                        int i206 = i188 & i204;
                                        int i207 = (i206 ^ i205) | (i206 & i205);
                                        char maximumFlingVelocity = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                        int myPid2 = android.os.Process.myPid() >> 22;
                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                        f(maximumFlingVelocity, (scrollBarSize ^ 347) + ((scrollBarSize & 347) << 1), (myPid2 & 17) + (myPid2 | 17), objArr54);
                                        java.lang.String str37 = (java.lang.String) objArr54[0];
                                        int myTid3 = android.os.Process.myTid() >> 22;
                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                        f((char) ((53525 & myTid3) + (myTid3 | 53525)), 588 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), 6 - (~(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr55);
                                        java.lang.String str38 = (java.lang.String) objArr55[0];
                                        file2 = new java.io.File(str37);
                                        if (file2.exists()) {
                                            int i208 = e + 83;
                                            b = i208 % 128;
                                            if (i208 % 2 == 0) {
                                                int i209 = 72 / 0;
                                            }
                                            try {
                                                java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                                char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
                                                int i210 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                int i211 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                f(touchSlop, (i210 ^ 369) + ((i210 & 369) << 1), ((i211 | 2) << 1) - (i211 ^ 2), objArr56);
                                                java.util.Scanner useDelimiter2 = scanner2.useDelimiter((java.lang.String) objArr56[0]);
                                                if (useDelimiter2.hasNext()) {
                                                    int i212 = e + 17;
                                                    b = i212 % 128;
                                                    if (i212 % 2 == 0) {
                                                        useDelimiter2.next();
                                                        java.lang.Object obj = null;
                                                        obj.hashCode();
                                                        throw null;
                                                    }
                                                    str14 = useDelimiter2.next();
                                                } else {
                                                    str14 = str5;
                                                }
                                                useDelimiter2.close();
                                            } catch (java.io.IOException unused2) {
                                            }
                                            if (str14.contains(str38)) {
                                                i26 = i6 & (-261);
                                                i27 = i17 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                                str6 = str5;
                                                i25 = i26 | i27;
                                                int i213 = ((~i207) & i6) | (i207 & i17);
                                                int i214 = -i213;
                                                int i215 = ((i213 ^ i214) | (i213 & i214)) >> 31;
                                                int i216 = i25 & (~i215);
                                                int i217 = i207 & i215;
                                                int i218 = (i217 ^ i216) | (i217 & i216);
                                                if ((i2 & 8) == 0) {
                                                    int i219 = e;
                                                    b = ((i219 & 69) + (i219 | 69)) % 128;
                                                    char c13 = (char) (36027 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                    int combineMeasuredStates2 = android.view.View.combineMeasuredStates(0, 0);
                                                    int i220 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                    f(c13, 616 - (~combineMeasuredStates2), (i220 ^ 44) + ((i220 & 44) << 1), objArr57);
                                                    java.lang.String str39 = (java.lang.String) objArr57[0];
                                                    char maxKeyCode3 = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                                                    int i221 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i222 = -(-android.view.KeyEvent.keyCodeFromString(str6));
                                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                    f(maxKeyCode3, (i221 ^ 660) + ((i221 & 660) << 1), ((i222 | 41) << 1) - (i222 ^ 41), objArr58);
                                                    java.lang.String str40 = (java.lang.String) objArr58[0];
                                                    java.lang.String str41 = str6;
                                                    char indexOf6 = (char) android.text.TextUtils.indexOf(str41, str41);
                                                    int argb3 = android.graphics.Color.argb(0, 0, 0, 0);
                                                    int b27 = com.facetec.sdk.aw.a.b();
                                                    int i223 = argb3 * (-433);
                                                    int i224 = ~argb3;
                                                    int i225 = ~b27;
                                                    int i226 = ~((i224 & i225) | (i224 ^ i225));
                                                    int i227 = ~((b27 ^ (-702)) | (b27 & (-702)));
                                                    int i228 = ~(i224 | (-702));
                                                    int i229 = ~(b27 | i224);
                                                    int i230 = ~((i225 ^ (-702)) | (i225 & (-702)));
                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                    f(indexOf6, ((((((i223 ^ (-151416)) + ((i223 & (-151416)) << 1)) + (((i226 ^ i227) | (i226 & i227)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE)) - (~(((i229 ^ i228) | (i229 & i228)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE))) - 1) - (~(-(-(((argb3 ^ i230) | (i230 & argb3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE))))) - 1, 37 - android.text.TextUtils.indexOf(str41, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr59);
                                                    java.lang.String[] strArr18 = {str39, str40, (java.lang.String) objArr59[0]};
                                                    int i231 = 0;
                                                    while (true) {
                                                        if (i231 >= 3) {
                                                            i48 = i218;
                                                            str7 = str41;
                                                            i49 = i6;
                                                            break;
                                                        }
                                                        java.lang.Object[] objArr60 = {strArr18[i231]};
                                                        java.lang.Object d19 = com.facetec.sdk.al.d(1873189073);
                                                        if (d19 == null) {
                                                            char maxKeyCode4 = (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 6935);
                                                            int pressedStateDuration2 = android.view.ViewConfiguration.getPressedStateDuration();
                                                            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                            byte b28 = (byte) ($$b & 1);
                                                            byte b29 = (byte) (-b28);
                                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                            g(b28, b29, (byte) (b29 + 1), objArr61);
                                                            d19 = com.facetec.sdk.al.c(maxKeyCode4, (pressedStateDuration2 >> 16) + 2389, 'G' - mirror, -934682071, false, (java.lang.String) objArr61[0], new java.lang.Class[]{java.lang.String.class});
                                                        }
                                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d19).invoke(null, objArr60)).longValue();
                                                        long j53 = -95367727;
                                                        i48 = i218;
                                                        java.lang.String[] strArr19 = strArr18;
                                                        long j54 = -301;
                                                        str7 = str41;
                                                        long nextInt = new java.util.Random().nextInt();
                                                        long j55 = longValue8 ^ j32;
                                                        long j56 = ((-300) * j53) + (302 * longValue8) + ((((longValue8 | j53) | nextInt) ^ j32) * j54) + ((((j55 | nextInt) ^ j32) | (((nextInt ^ j32) | j53) ^ j32)) * j54) + (301 * (j55 | ((nextInt | (j53 ^ j32)) ^ j32))) + 1032447370;
                                                        int i232 = ~(1329565868 | i17);
                                                        int i233 = ((int) (j56 >> 32)) & (((((69828612 | i232) | (~((-1329565869) | i6))) * (-338)) - 730506510) + ((i232 | (~((-1259737257) | i6))) * 338));
                                                        int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                                                        int i234 = ~uptimeMillis2;
                                                        int i235 = ((int) j56) & ((((~((-1320725835) | uptimeMillis2)) | (~(1606221131 | i234))) * (-406)) + 943664703 + ((~((-69206081) | i234)) * (-406)) + (((~(uptimeMillis2 | (-1537015052))) | (~(i234 | 1320725834))) * 406));
                                                        if (((i233 ^ i235) | (i233 & i235)) != 0) {
                                                            int i236 = b;
                                                            e = ((i236 ^ 93) + ((i236 & 93) << 1)) % 128;
                                                            int i237 = (i231 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE) + ((i231 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE) << 1);
                                                            i49 = ((~i237) & i6) | (i237 & i17);
                                                            break;
                                                        }
                                                        i231 = ((i231 | 1) << 1) - (i231 ^ 1);
                                                        strArr18 = strArr19;
                                                        i218 = i48;
                                                        str41 = str7;
                                                    }
                                                    int i238 = (~(i6 & i48)) & (i6 | i48);
                                                    int i239 = -i238;
                                                    int i240 = ((i238 ^ i239) | (i238 & i239)) >> 31;
                                                    int i241 = i49 & (~i240);
                                                    int i242 = i48 & i240;
                                                    i218 = (i241 ^ i242) | (i242 & i241);
                                                } else {
                                                    str7 = str6;
                                                }
                                                char blue = (char) android.graphics.Color.blue(0);
                                                java.lang.String str42 = str7;
                                                int i243 = -(-android.text.TextUtils.indexOf(str42, str42, 0, 0));
                                                int i244 = -android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                f(blue, 738 - (~i243), ((i244 | 40) << 1) - (i244 ^ 40), objArr62);
                                                java.lang.String str43 = (java.lang.String) objArr62[0];
                                                int i245 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                int i246 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                int i247 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                                int b30 = com.facetec.sdk.aw.a.b();
                                                int i248 = i247 * com.knotapi.knot.utilities.Constants.ID_KROGER;
                                                int i249 = (i247 ^ 30) | (i247 & 30);
                                                int i250 = ~b30;
                                                int i251 = (((i248 | 11100) << 1) - (i248 ^ 11100)) + (((i249 & i250) | (i249 ^ i250)) * (-369));
                                                int i252 = ~i247;
                                                int i253 = ~(i252 | i250);
                                                int i254 = ((i253 ^ 30) | (i253 & 30)) * (-369);
                                                int i255 = ~(i247 | (-31));
                                                int i256 = ~(i247 | b30);
                                                int i257 = (i256 ^ i255) | (i256 & i255);
                                                int i258 = ~((i252 & i250) | (i252 ^ i250) | 30);
                                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                f((char) (((36815 | i245) << 1) - (i245 ^ 36815)), (i246 ^ 780) + ((i246 & 780) << 1), (i251 & i254) + (i254 | i251) + (((i257 ^ i258) | (i258 & i257)) * 369), objArr63);
                                                java.lang.String[] strArr20 = {str43, (java.lang.String) objArr63[0]};
                                                i28 = 0;
                                                while (true) {
                                                    if (i28 >= 2) {
                                                        i29 = i6;
                                                        break;
                                                    }
                                                    java.lang.Object[] objArr64 = {strArr20[i28]};
                                                    java.lang.Object d20 = com.facetec.sdk.al.d(2084539986);
                                                    if (d20 == null) {
                                                        char jumpTapTimeout = (char) (6935 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                        int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                        int offsetBefore2 = android.text.TextUtils.getOffsetBefore(str42, 0);
                                                        byte b31 = (byte) 0;
                                                        byte b32 = (byte) (b31 - 1);
                                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                        g(b31, b32, (byte) (b32 + 1), objArr65);
                                                        d20 = com.facetec.sdk.al.c(jumpTapTimeout, resolveOpacity + 2389, offsetBefore2 + 23, -607062870, false, (java.lang.String) objArr65[0], new java.lang.Class[]{java.lang.String.class});
                                                    }
                                                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d20).invoke(null, objArr64)).longValue();
                                                    long j57 = 154945407;
                                                    long j58 = 306;
                                                    long j59 = 305;
                                                    long j60 = androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS + (j58 * j57) + (j58 * longValue9) + ((((j57 | longValue9) ^ j32) | ((j57 | j2) ^ j32)) * j59) + (j59 * ((longValue9 ^ j32) | ((j40 | j57) ^ j32))) + 817203935;
                                                    int i259 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                    int i260 = ~i259;
                                                    int i261 = ~(i259 | (-274116906));
                                                    if (((((int) (j60 >> 32)) & ((((((~((-1728136917) | i260)) | 1711343316) | i261) * (-252)) - 1095954854) + ((i261 | (~(i260 | (-16793601)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))) | (((int) j60) & (((((~((-1442842643) | i17)) | 5616232) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 1150161911) + (((~(696121325 | i17)) | (-2133347736)) * (-440)) + (((-1442842643) | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)))) != 0) {
                                                        int i262 = i28 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE;
                                                        i29 = ((~i262) & i6) | (i262 & i17);
                                                        break;
                                                    }
                                                    i28++;
                                                }
                                                int i263 = (~(i6 & i218)) & (i6 | i218);
                                                int i264 = -i263;
                                                int i265 = ((i263 ^ i264) | (i263 & i264)) >> 31;
                                                int i266 = i29 & (~i265);
                                                int i267 = i218 & i265;
                                                int i268 = (i267 ^ i266) | (i267 & i266);
                                                d8 = com.facetec.sdk.al.d(-1270134912);
                                                if (d8 == null) {
                                                    char scrollBarFadeDuration5 = (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45150);
                                                    float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                                                    int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                    byte length2 = (byte) $$a.length;
                                                    byte b33 = (byte) (length2 - 5);
                                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                    g(length2, b33, (byte) (b33 + 1), objArr66);
                                                    d8 = com.facetec.sdk.al.c(scrollBarFadeDuration5, (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 2149, packedPositionGroup + 24, 329530744, false, (java.lang.String) objArr66[0], new java.lang.Class[0]);
                                                }
                                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d8).invoke(null, null)).longValue();
                                                long j61 = 279004390;
                                                long j62 = -494;
                                                long j63 = 495;
                                                long nextInt2 = (new java.util.Random().nextInt(2028894808) ^ j32) | j61;
                                                j3 = (((((j62 * j61) + (j62 * longValue10)) + ((-495) * ((j61 | longValue10) ^ j32))) + (j63 * nextInt2)) + (j63 * ((nextInt2 ^ j32) | (((longValue10 ^ j32) | (j61 ^ j32)) ^ j32)))) - 2103926883;
                                                myUid = android.os.Process.myUid();
                                                i30 = ~myUid;
                                                if (((((int) j3) & ((((~(1138086490 | i6)) | 606733729) * (-140)) + 617821275 + ((~(1744820219 | i6)) * 70) + (((~(1719654395 | i6)) | 631899553) * 70))) | (((int) (j3 >> 32)) & ((((~((-1443673294) | myUid)) | (~((-6441763) | i30))) * (-406)) + 1775498314 + ((~(i30 | (-5121))) * (-406)) + (((~(myUid | 6446882)) | (~(i30 | 1443673293))) * 406)))) != 1) {
                                                    java.lang.Object[] objArr67 = {1};
                                                    java.lang.Object d21 = com.facetec.sdk.al.d(-1836228463);
                                                    if (d21 == null) {
                                                        char packedPositionGroup2 = (char) android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                        int indexOf7 = android.text.TextUtils.indexOf(str42, str42, 0);
                                                        byte b34 = (byte) ($$b & 1);
                                                        byte b35 = (byte) (-b34);
                                                        java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                        g(b34, b35, (byte) (b35 + 1), objArr68);
                                                        d21 = com.facetec.sdk.al.c(packedPositionGroup2, modifierMetaStateMask + 456, indexOf7 + 24, 895621737, false, (java.lang.String) objArr68[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                                    }
                                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d21).invoke(null, objArr67)).longValue();
                                                    long j64 = 427977372;
                                                    long j65 = -397;
                                                    long j66 = j64 ^ j32;
                                                    java.lang.String str44 = str42;
                                                    long elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                                                    long j67 = elapsedRealtime2 ^ j32;
                                                    long j68 = (j66 | longValue11) ^ j32;
                                                    long j69 = (((((398 * j64) + ((-396) * longValue11)) + (((((j66 | j67) ^ j32) | j68) | ((j67 | longValue11) ^ j32)) * j65)) + (j65 * j68)) + (397 * ((((longValue11 ^ j32) | j64) ^ j32) | (elapsedRealtime2 | j68)))) - 1798504977;
                                                    int elapsedCpuTime4 = (int) android.os.Process.getElapsedCpuTime();
                                                    int i269 = ~elapsedCpuTime4;
                                                    if (((((int) (j69 >> 32)) & ((((~(600733335 | i269)) | (~((-2037959747) | elapsedCpuTime4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + 306855784 + (((~(elapsedCpuTime4 | 600733335)) | 1479575616) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (((~((-2037959747) | i269)) | (-600733336)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE))) | (((int) j69) & ((((~(2078998122 | i6)) | 289440768) * 449) + 2100222976 + (((~(2078998122 | i17)) | 289440768) * 449)))) != 0) {
                                                        i35 = (i6 & (-221)) | (i17 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                                                        int i270 = e;
                                                        b = ((i270 & 51) + (i270 | 51)) % 128;
                                                        i34 = i268;
                                                    } else {
                                                        i34 = i268;
                                                        i35 = i6;
                                                    }
                                                    int i271 = ((~i34) & i6) | (i34 & i17);
                                                    int i272 = (i271 | (-i271)) >> 31;
                                                    int i273 = i35 & (~i272);
                                                    int i274 = i34 & i272;
                                                    int i275 = (i273 ^ i274) | (i274 & i273);
                                                    char c14 = (char) ((-2) - (~(-android.graphics.ImageFormat.getBitsPerPixel(0))));
                                                    int i276 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                    f(c14, ((i276 | 371) << 1) - (i276 ^ 371), 22 - (~(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr69);
                                                    java.lang.Object[] objArr70 = {(java.lang.String) objArr69[0]};
                                                    java.lang.Object d22 = com.facetec.sdk.al.d(1590238701);
                                                    if (d22 == null) {
                                                        char c15 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int blue2 = android.graphics.Color.blue(0);
                                                        int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay();
                                                        byte b36 = (byte) 0;
                                                        byte b37 = (byte) (b36 - 1);
                                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                        g(b36, b37, (byte) (b37 + 1), objArr71);
                                                        d22 = com.facetec.sdk.al.c(c15, blue2 + 2078, 24 - (keyRepeatDelay2 >> 16), -114923755, false, (java.lang.String) objArr71[0], new java.lang.Class[]{java.lang.String.class});
                                                    }
                                                    java.lang.Object invoke2 = ((java.lang.reflect.Method) d22).invoke(null, objArr70);
                                                    try {
                                                        if (invoke2 != null) {
                                                            java.lang.Object[] objArr72 = {invoke2, 42};
                                                            java.lang.Object d23 = com.facetec.sdk.al.d(-582857820);
                                                            if (d23 == null) {
                                                                char myPid3 = (char) (android.os.Process.myPid() >> 22);
                                                                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                                                                int maximumDrawingCacheSize3 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                                                                byte b38 = (byte) ($$b & 1);
                                                                byte b39 = (byte) (-b38);
                                                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                                g(b38, b39, (byte) (b39 + 1), objArr73);
                                                                d23 = com.facetec.sdk.al.c(myPid3, 2366 - (elapsedRealtime3 > 0L ? 1 : (elapsedRealtime3 == 0L ? 0 : -1)), (maximumDrawingCacheSize3 >> 24) + 24, 2058170716, false, (java.lang.String) objArr73[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                            }
                                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d23).invoke(null, objArr72)).longValue();
                                                            long j70 = -719445115;
                                                            long j71 = 449;
                                                            long j72 = ((j70 ^ j32) | longValue12) ^ j32;
                                                            long j73 = longValue12 ^ j32;
                                                            long j74 = (450 * j70) + ((-448) * longValue12) + (((((j73 | j70) | j2) ^ j32) | j72) * j71) + ((-1347) * j72) + (j71 * ((((j73 | j40) | j70) ^ j32) | j72)) + 1878642513;
                                                            int i277 = ((int) (j74 >> 32)) & ((((((~((-396270745) | i17)) | 26477704) | (~(1040955666 | i17))) * 464) - 76680502) + (((-369793041) | i6) * (-464)) + (((~(1040955666 | i6)) | 26477704) * 464));
                                                            int i278 = ~((int) android.os.Process.getElapsedCpuTime());
                                                            int i279 = ((int) j74) & ((((-537468933) | i278) * 494) + 96789175 + (((~(i278 | (-1976153551))) | 1440142826) * 494));
                                                            if (((i277 ^ i279) | (i277 & i279)) == 1986687685) {
                                                                int i280 = e + 55;
                                                                b = i280 % 128;
                                                                if (i280 % 2 != 0) {
                                                                    strArr3 = null;
                                                                    j4 = j32;
                                                                    int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                                    int b40 = com.facetec.sdk.aw.a.b();
                                                                    int i281 = minimumFlingVelocity * (-381);
                                                                    int i282 = ((3926784 | i281) << 1) - (i281 ^ 3926784);
                                                                    int i283 = ~minimumFlingVelocity;
                                                                    int i284 = i283 * (-191);
                                                                    int i285 = (i282 ^ i284) + ((i282 & i284) << 1);
                                                                    int i286 = ~((b40 ^ 20452) | (b40 & 20452));
                                                                    int i287 = ((minimumFlingVelocity ^ i286) | (minimumFlingVelocity & i286)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                                                                    int i288 = ((i285 | i287) << 1) - (i287 ^ i285);
                                                                    int i289 = ~((i283 ^ 20452) | (i283 & 20452));
                                                                    int i290 = ~b40;
                                                                    int i291 = ~((i290 ^ 20452) | (i290 & 20452));
                                                                    int i292 = -(-(((i289 ^ i291) | (i289 & i291)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                                                    char c16 = (char) ((i288 & i292) + (i292 | i288));
                                                                    int i293 = -android.view.MotionEvent.axisFromString(str44);
                                                                    java.lang.String str45 = str44;
                                                                    int i294 = -android.text.TextUtils.lastIndexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                                    f(c16, (i293 ^ 890) + ((i293 & 890) << 1), ((i294 | 15) << 1) - (i294 ^ 15), objArr74);
                                                                    java.lang.Object[] objArr75 = {(java.lang.String) objArr74[0]};
                                                                    d9 = com.facetec.sdk.al.d(1590238701);
                                                                    if (d9 != null) {
                                                                        char maximumDrawingCacheSize4 = (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                        int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity();
                                                                        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                                                                        byte b41 = (byte) 0;
                                                                        byte b42 = (byte) (b41 - 1);
                                                                        strArr6 = strArr3;
                                                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                                        g(b41, b42, (byte) (b42 + 1), objArr76);
                                                                        d9 = com.facetec.sdk.al.c(maximumDrawingCacheSize4, (minimumFlingVelocity2 >> 16) + 2078, (elapsedRealtime4 > 0L ? 1 : (elapsedRealtime4 == 0L ? 0 : -1)) + 23, -114923755, false, (java.lang.String) objArr76[0], new java.lang.Class[]{java.lang.String.class});
                                                                    } else {
                                                                        strArr6 = strArr3;
                                                                    }
                                                                    invoke = ((java.lang.reflect.Method) d9).invoke(null, objArr75);
                                                                    if (invoke != null) {
                                                                        i37 = i275;
                                                                        i38 = 0;
                                                                    } else {
                                                                        java.lang.Object[] objArr77 = {invoke, 42};
                                                                        java.lang.Object d24 = com.facetec.sdk.al.d(-582857820);
                                                                        if (d24 == null) {
                                                                            char bitsPerPixel = (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1);
                                                                            float maxVolume2 = android.media.AudioTrack.getMaxVolume();
                                                                            int offsetBefore3 = android.text.TextUtils.getOffsetBefore(str45, 0);
                                                                            byte b43 = (byte) ($$b & 1);
                                                                            byte b44 = (byte) (-b43);
                                                                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                                            g(b43, b44, (byte) (b44 + 1), objArr78);
                                                                            d24 = com.facetec.sdk.al.c(bitsPerPixel, (maxVolume2 > 0.0f ? 1 : (maxVolume2 == 0.0f ? 0 : -1)) + 2364, 24 - offsetBefore3, 2058170716, false, (java.lang.String) objArr78[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                                        }
                                                                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d24).invoke(null, objArr77)).longValue();
                                                                        long j75 = -398574232;
                                                                        i37 = i275;
                                                                        long j76 = 614;
                                                                        long j77 = j75 ^ j4;
                                                                        long j78 = (j77 | longValue13) ^ j4;
                                                                        long j79 = longValue13 ^ j4;
                                                                        long j80 = (615 * j75) + ((-613) * longValue13) + ((j2 | j78 | ((j79 | j75) ^ j4)) * j76) + ((-1228) * (((j77 | j40) ^ j4) | j78 | ((j40 | longValue13) ^ j4))) + (j76 * (((longValue13 | (j40 | j75)) ^ j4) | (((j77 | j79) | j40) ^ j4))) + 1557771630;
                                                                        i38 = (((int) (j80 >> 32)) & (((((~((-1265079646) | i17)) | 1248203861) * (-160)) - 164338294) + (((~(1592661239 | i17)) | (-1265079646)) * 160))) | (((int) j80) & (((((~(1031353765 | i6)) | (~((-537396354) | i17))) * 920) - 2038855459) + (((~(943268997 | i17)) | (-1031353766)) * 920) + (((~(1031353765 | i17)) | (~((-88084769) | i6)) | (~((-537396354) | i6))) * 920)));
                                                                    }
                                                                    if (i38 != 1986687685) {
                                                                        int i295 = (-744744726) - (~(-(-(((~(((-290152582) ^ i6) | ((-290152582) & i6))) | (-560548202)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))));
                                                                        int i296 = ~(((-290152582) & i17) | ((-290152582) ^ i17));
                                                                        int i297 = -(-(((i296 ^ 268574852) | (268574852 & i296)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                                                        int b45 = com.facetec.sdk.aw.a.b();
                                                                        int i298 = ((~(((-1815085589) ^ b45) | ((-1815085589) & b45))) | (-2130509693)) * (-756);
                                                                        int i299 = ~b45;
                                                                        if ((i295 & i297) + (i297 | i295) > ((-1888049330) & i298) + ((-1888049330) | i298) + ((((-1815085589) & i299) | (i299 ^ (-1815085589))) * 756)) {
                                                                            throw null;
                                                                        }
                                                                        if (i38 != -1514516938) {
                                                                            char mode5 = (char) android.view.View.MeasureSpec.getMode(0);
                                                                            int resolveSize4 = android.view.View.resolveSize(0, 0);
                                                                            int threadPriority2 = android.os.Process.getThreadPriority(0);
                                                                            int i300 = -(((threadPriority2 ^ 20) + ((threadPriority2 & 20) << 1)) >> 6);
                                                                            java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                                            f(mode5, 1610 - resolveSize4, (i300 ^ 14) + ((i300 & 14) << 1), objArr79);
                                                                            java.lang.String str46 = (java.lang.String) objArr79[0];
                                                                            int i301 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                            int i302 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                            int i303 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                                            f((char) ((37728 ^ i301) + ((i301 & 37728) << 1)), (i302 ^ 1625) + ((i302 & 1625) << 1), (i303 ^ 27) + ((i303 & 27) << 1), objArr80);
                                                                            java.lang.String str47 = (java.lang.String) objArr80[0];
                                                                            char c17 = (char) (13605 - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                                                                            int i304 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                                            int indexOf8 = android.text.TextUtils.indexOf(str45, str45, 0, 0);
                                                                            java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                                            f(c17, 1649 - (~i304), (indexOf8 & 17) + (indexOf8 | 17), objArr81);
                                                                            java.lang.String str48 = (java.lang.String) objArr81[0];
                                                                            char rgb2 = (char) (android.graphics.Color.rgb(0, 0, 0) + 16830955);
                                                                            int indexOf9 = android.text.TextUtils.indexOf(str45, str45, 0);
                                                                            int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                                            f(rgb2, 1667 - indexOf9, (windowTouchSlop ^ 17) + ((windowTouchSlop & 17) << 1), objArr82);
                                                                            java.lang.String str49 = (java.lang.String) objArr82[0];
                                                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                                            f((char) (64100 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 1683 - (~android.text.TextUtils.getOffsetAfter(str45, 0)), 15 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr83);
                                                                            java.lang.String str50 = (java.lang.String) objArr83[0];
                                                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                                            f((char) (android.os.Process.myPid() >> 22), 1699 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 35 - (~(-android.view.MotionEvent.axisFromString(str45))), objArr84);
                                                                            java.lang.String str51 = (java.lang.String) objArr84[0];
                                                                            int i305 = -android.view.MotionEvent.axisFromString(str45);
                                                                            int rgb3 = android.graphics.Color.rgb(0, 0, 0);
                                                                            int i306 = -(-(android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                                            f((char) ((i305 ^ 15734) + ((i305 & 15734) << 1)), rgb3 + 16778952, (i306 & 12) + (i306 | 12), objArr85);
                                                                            java.lang.String str52 = (java.lang.String) objArr85[0];
                                                                            char edgeSlop2 = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                                            int i307 = -android.graphics.Color.rgb(0, 0, 0);
                                                                            int i308 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                            f(edgeSlop2, ((-16775468) ^ i307) + ((i307 & (-16775468)) << 1), ((i308 | 13) << 1) - (i308 ^ 13), objArr86);
                                                                            java.lang.String str53 = (java.lang.String) objArr86[0];
                                                                            int i309 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                            int tapTimeout3 = android.view.ViewConfiguration.getTapTimeout();
                                                                            int i310 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                                            f((char) ((i309 & 2051) + (i309 | 2051)), 1761 - (tapTimeout3 >> 16), (i310 & 70) + (i310 | 70), objArr87);
                                                                            java.lang.String str54 = (java.lang.String) objArr87[0];
                                                                            int indexOf10 = android.text.TextUtils.indexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                            int b46 = com.facetec.sdk.aw.a.b();
                                                                            int i311 = indexOf10 * (-574);
                                                                            int i312 = ((-20607748) ^ i311) + ((i311 & (-20607748)) << 1);
                                                                            int i313 = ~b46;
                                                                            int i314 = ~indexOf10;
                                                                            int i315 = ~(i314 | i313);
                                                                            int i316 = ~(((-35903) ^ b46) | ((-35903) & b46));
                                                                            int i317 = -(-(((i315 ^ i316) | (i315 & i316)) * 1150));
                                                                            int i318 = (i312 & i317) + (i312 | i317);
                                                                            int i319 = ~((35902 ^ i313) | (35902 & i313));
                                                                            int i320 = -(-(((i319 ^ i316) | (i316 & i319)) * (-575)));
                                                                            int i321 = ~((b46 ^ i314) | (b46 & i314));
                                                                            int i322 = ~((indexOf10 ^ i313) | (indexOf10 & i313));
                                                                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                            f((char) ((((i318 ^ i320) + ((i320 & i318) << 1)) - (~(-(-(((i321 ^ i322) | (i322 & i321)) * 575))))) - 1), 1783 - android.graphics.Color.blue(0), android.graphics.Color.argb(0, 0, 0, 0) + 31, objArr88);
                                                                            java.lang.String str55 = (java.lang.String) objArr88[0];
                                                                            char maxKeyCode5 = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                                                                            int i323 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                                            int i324 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                            f(maxKeyCode5, 1813 - (~i323), (i324 ^ 13) + ((i324 & 13) << 1), objArr89);
                                                                            java.lang.String str56 = (java.lang.String) objArr89[0];
                                                                            int i325 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                            f((char) ((i325 ^ 8727) + ((i325 & 8727) << 1)), 1825 - (~(-android.text.TextUtils.indexOf(str45, str45, 0, 0))), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 12, objArr90);
                                                                            java.lang.String str57 = (java.lang.String) objArr90[0];
                                                                            int i326 = -(-android.text.TextUtils.indexOf(str45, str45, 0, 0));
                                                                            int i327 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                            int maxKeyCode6 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                            f((char) (((i326 | 22057) << 1) - (i326 ^ 22057)), (i327 ^ 1838) + ((i327 & 1838) << 1), ((maxKeyCode6 | 12) << 1) - (maxKeyCode6 ^ 12), objArr91);
                                                                            java.lang.String str58 = (java.lang.String) objArr91[0];
                                                                            int i328 = -android.graphics.Color.rgb(0, 0, 0);
                                                                            int b47 = com.facetec.sdk.aw.a.b();
                                                                            int i329 = ~((16777215 ^ i328) | (16777215 & i328));
                                                                            int i330 = ~i328;
                                                                            int i331 = (-16777216) | i330;
                                                                            int i332 = ~((i331 ^ b47) | (i331 & b47));
                                                                            int i333 = ((i328 * (-500)) - 201326592) + (((i329 ^ i332) | (i329 & i332)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING);
                                                                            int i334 = -(-((~((16777215 ^ i330) | (16777215 & i330))) * 1002));
                                                                            int i335 = (i333 ^ i334) + ((i333 & i334) << 1);
                                                                            int i336 = ~b47;
                                                                            int i337 = -(-((~((i336 ^ i330) | (i330 & i336) | (-16777216))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                            f((char) ((i335 ^ i337) + ((i337 & i335) << 1)), 1850 - (~(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 11 - (~(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))), objArr92);
                                                                            java.lang.String str59 = (java.lang.String) objArr92[0];
                                                                            int indexOf11 = android.text.TextUtils.indexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                            char c18 = (char) (((48927 | indexOf11) << 1) - (indexOf11 ^ 48927));
                                                                            int mode6 = android.view.View.MeasureSpec.getMode(0);
                                                                            int i338 = -(android.os.Process.myTid() >> 22);
                                                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                            f(c18, 1862 - mode6, (i338 & 12) + (i338 | 12), objArr93);
                                                                            java.lang.String str60 = (java.lang.String) objArr93[0];
                                                                            int i339 = -android.view.KeyEvent.keyCodeFromString(str45);
                                                                            int i340 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                                            int tapTimeout4 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                                                            java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                                            f((char) ((i339 ^ 14728) + ((i339 & 14728) << 1)), (i340 & 1874) + (i340 | 1874), ((tapTimeout4 | 14) << 1) - (tapTimeout4 ^ 14), objArr94);
                                                                            java.lang.String str61 = (java.lang.String) objArr94[0];
                                                                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                            f((char) (android.graphics.Color.blue(0) + 53499), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1887, 12 - android.graphics.Color.red(0), objArr95);
                                                                            java.lang.String str62 = (java.lang.String) objArr95[0];
                                                                            char defaultSize = (char) (android.view.View.getDefaultSize(0, 0) + 40462);
                                                                            int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                                            int i341 = scrollDefaultDelay * 491;
                                                                            int i342 = ((-929100) & i341) + (i341 | (-929100));
                                                                            int i343 = ~scrollDefaultDelay;
                                                                            int i344 = (i343 & (-1901)) | (i343 ^ (-1901));
                                                                            int i345 = ((i344 ^ i17) | (i344 & i17)) * (-490);
                                                                            int i346 = (i342 ^ i345) + ((i342 & i345) << 1);
                                                                            int i347 = ~((scrollDefaultDelay & (-1901)) | (scrollDefaultDelay ^ (-1901)));
                                                                            int i348 = ~((i6 ^ (-1901)) | (i6 & (-1901)));
                                                                            int i349 = ((i347 ^ i348) | (i347 & i348)) * 490;
                                                                            int i350 = (i346 ^ i349) + ((i349 & i346) << 1);
                                                                            int i351 = -(-(i343 * 490));
                                                                            int i352 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                                            int i353 = i352 * 375;
                                                                            int i354 = ~i352;
                                                                            int i355 = ~((i354 ^ 24) | (i354 & 24));
                                                                            int i356 = ~(i17 | i352);
                                                                            int i357 = ~(i354 | (-25));
                                                                            int i358 = ~((i352 & i17) | (i17 ^ i352));
                                                                            int i359 = i37;
                                                                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                            f(defaultSize, (i350 ^ i351) + ((i351 & i350) << 1), (((i353 | (-17928)) << 1) - (i353 ^ (-17928))) + (((i355 ^ i356) | (i355 & i356)) * (-374)) + ((~((i352 & (-25)) | (i352 ^ (-25)))) * 748) + (((i358 & i357) | (i357 ^ i358)) * 374), objArr96);
                                                                            java.lang.String str63 = (java.lang.String) objArr96[0];
                                                                            int threadPriority3 = (android.os.Process.getThreadPriority(0) + 20) >> 6;
                                                                            int i360 = -android.view.KeyEvent.keyCodeFromString(str45);
                                                                            int i361 = i360 * 398;
                                                                            int i362 = ~i360;
                                                                            int i363 = ~((i362 & i17) | (i362 ^ i17));
                                                                            int i364 = ~((i362 ^ 1924) | (i362 & 1924));
                                                                            int i365 = (((((-761904) & i361) + (i361 | (-761904))) + ((((i363 & i364) | (i363 ^ i364)) | (~((i17 ^ 1924) | (i17 & 1924)))) * (-397))) - (~(i364 * (-397)))) - 1;
                                                                            int i366 = (~(i362 | 1924)) | i6;
                                                                            int i367 = ~((i360 ^ (-1925)) | (i360 & (-1925)));
                                                                            int i368 = -(-(((i367 ^ i366) | (i367 & i366)) * 397));
                                                                            java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                            f((char) (((35958 | threadPriority3) << 1) - (threadPriority3 ^ 35958)), (i365 ^ i368) + ((i368 & i365) << 1), 27 - (~(-android.view.View.getDefaultSize(0, 0))), objArr97);
                                                                            java.lang.String[] strArr21 = {str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, (java.lang.String) objArr97[0]};
                                                                            int i369 = 0;
                                                                            while (i369 < 19) {
                                                                                java.lang.String str64 = strArr21[i369];
                                                                                java.lang.Object[] objArr98 = {str64};
                                                                                java.lang.Object d25 = com.facetec.sdk.al.d(1450487247);
                                                                                if (d25 == null) {
                                                                                    char c19 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6936);
                                                                                    int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                                    int alpha = android.graphics.Color.alpha(0);
                                                                                    byte b48 = (byte) ($$b >>> 2);
                                                                                    byte b49 = (byte) (b48 - 4);
                                                                                    strArr10 = strArr21;
                                                                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                                    g(b48, b49, (byte) (b49 + 1), objArr99);
                                                                                    d25 = com.facetec.sdk.al.c(c19, lastIndexOf3 + 2390, 23 - alpha, -241445065, false, (java.lang.String) objArr99[0], new java.lang.Class[]{java.lang.String.class});
                                                                                } else {
                                                                                    strArr10 = strArr21;
                                                                                }
                                                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) d25).invoke(null, objArr98)).longValue();
                                                                                long j81 = 408944993;
                                                                                long j82 = 569;
                                                                                long j83 = j81 ^ j4;
                                                                                long j84 = longValue14 ^ j4;
                                                                                long j85 = j83 | j84;
                                                                                int i370 = i369;
                                                                                long j86 = j40 | j81;
                                                                                long j87 = (j81 * j82) + (j82 * longValue14) + ((-1136) * ((j85 ^ j4) | ((j83 | j40) ^ j4) | ((j84 | j40) ^ j4))) + ((-568) * (((j83 | j2) ^ j4) | ((j84 | j2) ^ j4) | ((j86 | longValue14) ^ j4))) + (com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION * (((j40 | longValue14) ^ j4) | (j86 ^ j4) | ((j85 | j2) ^ j4))) + 1442231648;
                                                                                int i371 = (int) (j87 >> 32);
                                                                                int elapsedRealtime5 = (int) android.os.SystemClock.elapsedRealtime();
                                                                                int i372 = ~elapsedRealtime5;
                                                                                int i373 = (int) j87;
                                                                                int myPid4 = android.os.Process.myPid();
                                                                                if (((i371 & ((((((~((-1551327279) | elapsedRealtime5)) | 71630850) | (~((-114100868) | elapsedRealtime5))) * (-754)) - 1255369234) + (((~(elapsedRealtime5 | (-71630851))) | (~((-42470018) | i372))) * (-754)) + (((-1551327279) | i372) * 754))) | ((((((~((~myPid4) | (-413985895))) | (-1851212305)) * (-235)) - 1126211391) + (((~((-413985895) | myPid4)) | (-1851212305)) * (-470)) + (((~((-134496257) | myPid4)) | (-2130701943)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)) & i373)) != 0) {
                                                                                    int b50 = com.facetec.sdk.aw.a.b();
                                                                                    int i374 = ((~((2019666881 & b50) | (2019666881 ^ b50))) | 898382646) * 672;
                                                                                    int i375 = ((-1910905321) ^ i374) + ((i374 & (-1910905321)) << 1);
                                                                                    int i376 = ~b50;
                                                                                    int i377 = ((~((b50 ^ 898382646) | (898382646 & b50))) | (~(((-2019666882) & i376) | ((-2019666882) ^ i376)))) * (-672);
                                                                                    int i378 = (i375 ^ i377) + ((i377 & i375) << 1);
                                                                                    int i379 = ((~(((-898382647) & i376) | (i376 ^ (-898382647)))) | 93065270) * 672;
                                                                                    int i380 = ~(1391495954 | i6);
                                                                                    int i381 = (i380 ^ 604467404) | (604467404 & i380);
                                                                                    int i382 = ~(((-1982331597) ^ i6) | ((-1982331597) & i6));
                                                                                    int i383 = -(-(((i381 ^ i382) | (i381 & i382)) * (-754)));
                                                                                    int i384 = ~(((-604467405) & i6) | ((-604467405) ^ i6));
                                                                                    int i385 = ~(((-1391495955) & i17) | ((-1391495955) ^ i17) | (-1982331597));
                                                                                    int i386 = ((-265384972) ^ i383) + ((i383 & (-265384972)) << 1) + (((i384 & i385) | (i384 ^ i385)) * (-754));
                                                                                    int i387 = ((1391495954 & i17) | (1391495954 ^ i17)) * 754;
                                                                                    if ((i378 ^ i379) + ((i379 & i378) << 1) > (i386 & i387) + (i387 | i386)) {
                                                                                        java.lang.Object obj2 = null;
                                                                                        obj2.hashCode();
                                                                                        throw null;
                                                                                    }
                                                                                    i39 = i17;
                                                                                    str10 = str45;
                                                                                } else {
                                                                                    int i388 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                                                    int i389 = -android.text.TextUtils.indexOf(str45, str45, 0);
                                                                                    int i390 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                                    f((char) ((i388 & 14727) + (i388 | 14727)), (i389 ^ 1874) + ((i389 & 1874) << 1), (i390 ^ 14) + ((i390 & 14) << 1), objArr100);
                                                                                    if (str64.equals((java.lang.String) objArr100[0])) {
                                                                                        java.lang.Object[] objArr101 = {str64};
                                                                                        java.lang.Object d26 = com.facetec.sdk.al.d(1873189073);
                                                                                        if (d26 == null) {
                                                                                            char argb4 = (char) (android.graphics.Color.argb(0, 0, 0, 0) + 6935);
                                                                                            int defaultSize2 = android.view.View.getDefaultSize(0, 0);
                                                                                            long elapsedRealtime6 = android.os.SystemClock.elapsedRealtime();
                                                                                            byte b51 = (byte) ($$b & 1);
                                                                                            byte b52 = (byte) (-b51);
                                                                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                                                            g(b51, b52, (byte) (b52 + 1), objArr102);
                                                                                            d26 = com.facetec.sdk.al.c(argb4, 2389 - defaultSize2, (elapsedRealtime6 > 0L ? 1 : (elapsedRealtime6 == 0L ? 0 : -1)) + 22, -934682071, false, (java.lang.String) objArr102[0], new java.lang.Class[]{java.lang.String.class});
                                                                                        }
                                                                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) d26).invoke(null, objArr101)).longValue();
                                                                                        long j88 = 589454405;
                                                                                        int nextInt3 = new java.util.Random().nextInt();
                                                                                        long j89 = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION;
                                                                                        long j90 = j88 ^ j4;
                                                                                        str10 = str45;
                                                                                        long j91 = nextInt3;
                                                                                        long j92 = j91 ^ j4;
                                                                                        i39 = i17;
                                                                                        long j93 = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
                                                                                        long j94 = longValue15 ^ j4;
                                                                                        long j95 = j92 | j88;
                                                                                        long j96 = (j89 * j88) + ((-903) * longValue15) + ((-1808) * (((j90 | j91) ^ j4) | ((j92 | longValue15) ^ j4))) + (((((j90 | j94) | j91) ^ j4) | ((j95 | longValue15) ^ j4)) * j93) + (j93 * (((j90 | longValue15) ^ j4) | ((j94 | j91) ^ j4) | (j95 ^ j4))) + 347625238;
                                                                                        int i391 = ((int) (j96 >> 32)) & ((((~(i39 | (-847393799))) * 52) - 1347887350) + (((~(i39 | (-1938961415))) | (~(i39 | 918779470)) | 1091567616) * (-52)) + (((~(i39 | 1938961414)) | 71385672) * 52));
                                                                                        int uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
                                                                                        int i392 = ((int) j96) & ((((~(220556993 | uptimeMillis3)) | (-1302720234)) * 576) + 1771465493 + (((~((~uptimeMillis3) | (-1082163241))) | 86050817) * 576) + 1252422016);
                                                                                        if (((i391 ^ i392) | (i391 & i392)) != 0) {
                                                                                            int i393 = b;
                                                                                            e = ((i393 ^ 91) + ((i393 & 91) << 1)) % 128;
                                                                                        }
                                                                                    } else {
                                                                                        i39 = i17;
                                                                                        str10 = str45;
                                                                                    }
                                                                                    i369 = (i370 ^ 1) + ((i370 & 1) << 1);
                                                                                    i6 = i;
                                                                                    strArr21 = strArr10;
                                                                                    str45 = str10;
                                                                                    i17 = i39;
                                                                                }
                                                                                i47 = i370;
                                                                            }
                                                                            i39 = i17;
                                                                            str10 = str45;
                                                                            i47 = -1;
                                                                            int i394 = (i47 & 130) + (i47 | 130);
                                                                            int i395 = ~i47;
                                                                            int i396 = -i395;
                                                                            int i397 = ((i395 ^ i396) | (i395 & i396)) >> 31;
                                                                            i32 = i;
                                                                            int i398 = (~i397) & i32;
                                                                            int i399 = (((~i394) & i32) | (i394 & i39)) & i397;
                                                                            int i400 = ((~i359) & i32) | (i359 & i39);
                                                                            int i401 = -i400;
                                                                            int i402 = ((i400 ^ i401) | (i400 & i401)) >> 31;
                                                                            int i403 = ((i399 ^ i398) | (i399 & i398)) & (~i402);
                                                                            int i404 = i359 & i402;
                                                                            i40 = (i403 ^ i404) | (i404 & i403);
                                                                            int i405 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                                            int i406 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                            int i407 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                            java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                            f((char) (((54064 | i405) << 1) - (i405 ^ 54064)), (i406 ^ 1952) + ((i406 & 1952) << 1), (i407 ^ 12) + ((i407 & 12) << 1), objArr103);
                                                                            java.lang.String str65 = (java.lang.String) objArr103[0];
                                                                            int i408 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                                            int i409 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                            int i410 = -android.view.MotionEvent.axisFromString(str10);
                                                                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                            f((char) ((51455 ^ i408) + ((i408 & 51455) << 1)), (i409 ^ 1965) + ((i409 & 1965) << 1), ((i410 | 4) << 1) - (4 ^ i410), objArr104);
                                                                            java.lang.String[] strArr22 = {str65, (java.lang.String) objArr104[0]};
                                                                            char longPressTimeout3 = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                                                            int i411 = -(-android.os.Process.getGidForName(str10));
                                                                            str11 = str10;
                                                                            java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                            f(longPressTimeout3, ((i411 | 1971) << 1) - (i411 ^ 1971), 14 - (~(-android.text.TextUtils.indexOf(str11, str11))), objArr105);
                                                                            java.lang.String str66 = (java.lang.String) objArr105[0];
                                                                            char c20 = (char) ((-2) - (~(-((byte) android.view.KeyEvent.getModifierMetaStateMask()))));
                                                                            int i412 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                                            int i413 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                                            java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                            f(c20, (i412 ^ 1985) + ((i412 & 1985) << 1), (i413 ^ 19) + ((i413 & 19) << 1), objArr106);
                                                                            java.lang.String str67 = (java.lang.String) objArr106[0];
                                                                            int i414 = -android.graphics.Color.rgb(0, 0, 0);
                                                                            java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                            f((char) (((-16712004) ^ i414) + ((i414 & (-16712004)) << 1)), 2003 - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), android.view.View.MeasureSpec.getSize(0) + 14, objArr107);
                                                                            java.lang.String[] strArr23 = {str66, str67, (java.lang.String) objArr107[0]};
                                                                            char maximumDrawingCacheSize5 = (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                            int i415 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                                            java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                            f(maximumDrawingCacheSize5, (i415 ^ 2018) + ((i415 & 2018) << 1), 21 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr108);
                                                                            java.lang.String str68 = (java.lang.String) objArr108[0];
                                                                            char keyRepeatTimeout3 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                            int i416 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                                            int i417 = -android.graphics.Color.green(0);
                                                                            int b53 = com.facetec.sdk.aw.a.b();
                                                                            int i418 = (i417 * (-574)) - 5740;
                                                                            int i419 = ~i417;
                                                                            int i420 = ~b53;
                                                                            int i421 = ~(b53 | (-11));
                                                                            long j97 = j4;
                                                                            int i422 = -(-(((~(i419 | i420)) | i421) * 1150));
                                                                            int i423 = ~((i420 ^ 10) | (i420 & 10));
                                                                            int i424 = (((i418 & i422) + (i422 | i418)) - (~(-(-(((i421 ^ i423) | (i423 & i421)) * (-575)))))) - 1;
                                                                            int i425 = ~((i419 ^ b53) | (b53 & i419));
                                                                            int i426 = ~((i417 ^ i420) | (i417 & i420));
                                                                            int i427 = -(-(((i426 ^ i425) | (i426 & i425)) * 575));
                                                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                            f(keyRepeatTimeout3, ((i416 | 2039) << 1) - (i416 ^ 2039), (i424 ^ i427) + ((i427 & i424) << 1), objArr109);
                                                                            java.lang.String[] strArr24 = {str68, (java.lang.String) objArr109[0]};
                                                                            int i428 = -(android.os.Process.myTid() >> 22);
                                                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                            f((char) ((45523 ^ i428) + ((i428 & 45523) << 1)), 2047 - (~(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 16777226 - (~(-(-android.graphics.Color.rgb(0, 0, 0)))), objArr110);
                                                                            java.lang.String str69 = (java.lang.String) objArr110[0];
                                                                            char myPid5 = (char) ((android.os.Process.myPid() >> 22) + 53525);
                                                                            int i429 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                            f(myPid5, ((i429 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED) << 1) - (i429 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6, objArr111);
                                                                            java.lang.String[] strArr25 = {str69, (java.lang.String) objArr111[0]};
                                                                            int i430 = -android.graphics.Color.rgb(0, 0, 0);
                                                                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                            f((char) ((((-16720776) | i430) << 1) - (i430 ^ (-16720776))), 2060 - (~android.os.Process.getGidForName(str11)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 28, objArr112);
                                                                            java.lang.String str70 = (java.lang.String) objArr112[0];
                                                                            char doubleTapTimeout = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                            int trimmedLength3 = android.text.TextUtils.getTrimmedLength(str11);
                                                                            int i431 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                            f(doubleTapTimeout, ((trimmedLength3 | 2039) << 1) - (trimmedLength3 ^ 2039), (i431 ^ 10) + ((i431 & 10) << 1), objArr113);
                                                                            java.lang.String[][] strArr26 = {strArr22, strArr23, strArr24, strArr25, new java.lang.String[]{str70, (java.lang.String) objArr113[0]}};
                                                                            int i432 = -1;
                                                                            i41 = 0;
                                                                            loop7: while (true) {
                                                                                if (i41 >= 5) {
                                                                                    i42 = i32;
                                                                                    break;
                                                                                }
                                                                                int i433 = b;
                                                                                int i434 = 1;
                                                                                int i435 = (i433 ^ 43) + ((i433 & 43) << 1);
                                                                                e = i435 % 128;
                                                                                if (i435 % 2 != 0) {
                                                                                    java.lang.String[] strArr27 = strArr26[i41];
                                                                                    str13 = strArr27[1];
                                                                                    strArr7 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr27, 1, strArr27.length);
                                                                                    length = strArr7.length;
                                                                                } else {
                                                                                    java.lang.String[] strArr28 = strArr26[i41];
                                                                                    java.lang.String str71 = strArr28[0];
                                                                                    strArr7 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr28, 1, strArr28.length);
                                                                                    i434 = 0;
                                                                                    length = strArr7.length;
                                                                                    str13 = str71;
                                                                                }
                                                                                while (i434 < length) {
                                                                                    java.lang.String str72 = strArr7[i434];
                                                                                    i432 = (i432 & 1) + (i432 | 1);
                                                                                    java.io.File file3 = new java.io.File(str13);
                                                                                    if (file3.exists()) {
                                                                                        int i436 = b;
                                                                                        e = ((i436 ^ 105) + ((i436 & 105) << 1)) % 128;
                                                                                        if (file3.isFile()) {
                                                                                            try {
                                                                                                java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                                                                                char trimmedLength4 = (char) android.text.TextUtils.getTrimmedLength(str11);
                                                                                                int i437 = -android.text.TextUtils.getOffsetAfter(str11, 0);
                                                                                                int i438 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                                strArr8 = strArr26;
                                                                                                try {
                                                                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                                    strArr9 = strArr7;
                                                                                                    try {
                                                                                                        f(trimmedLength4, ((i437 | com.knotapi.knot.utilities.Constants.ID_KROGER) << 1) - (i437 ^ com.knotapi.knot.utilities.Constants.ID_KROGER), (i438 ^ 2) + ((i438 & 2) << 1), objArr114);
                                                                                                        java.util.Scanner useDelimiter3 = scanner3.useDelimiter((java.lang.String) objArr114[0]);
                                                                                                        next = useDelimiter3.hasNext() ? useDelimiter3.next() : str11;
                                                                                                        useDelimiter3.close();
                                                                                                    } catch (java.io.IOException unused3) {
                                                                                                        continue;
                                                                                                    }
                                                                                                } catch (java.io.IOException unused4) {
                                                                                                }
                                                                                            } catch (java.io.IOException unused5) {
                                                                                            }
                                                                                            if (next.contains(str72)) {
                                                                                                int i439 = i432 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                                                                i42 = ((~i439) & i32) | (i439 & i39);
                                                                                                break loop7;
                                                                                            }
                                                                                            i434++;
                                                                                            strArr26 = strArr8;
                                                                                            strArr7 = strArr9;
                                                                                        }
                                                                                    }
                                                                                    strArr8 = strArr26;
                                                                                    strArr9 = strArr7;
                                                                                    i434++;
                                                                                    strArr26 = strArr8;
                                                                                    strArr7 = strArr9;
                                                                                }
                                                                                i41++;
                                                                            }
                                                                            int i440 = ((~i40) & i32) | (i40 & i39);
                                                                            int i441 = (i440 | (-i440)) >> 31;
                                                                            int i442 = i42 & (~i441);
                                                                            int i443 = i40 & i441;
                                                                            int i444 = (i442 ^ i443) | (i443 & i442);
                                                                            char edgeSlop3 = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                                            int i445 = -(android.os.Process.myPid() >> 22);
                                                                            int mode7 = android.view.View.MeasureSpec.getMode(0);
                                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                            f(edgeSlop3, 2087 - (~i445), (mode7 & 13) + (mode7 | 13), objArr115);
                                                                            java.lang.String str73 = (java.lang.String) objArr115[0];
                                                                            int indexOf12 = android.text.TextUtils.indexOf(str11, str11, 0, 0);
                                                                            int combineMeasuredStates3 = android.view.View.combineMeasuredStates(0, 0);
                                                                            int b54 = com.facetec.sdk.aw.a.b();
                                                                            int i446 = combineMeasuredStates3 * (-464);
                                                                            int i447 = ~combineMeasuredStates3;
                                                                            int i448 = ~((b54 ^ 2101) | (b54 & 2101));
                                                                            int i449 = ((((-1951829) & i446) + (i446 | (-1951829))) - (~(-(-(((i447 & i448) | (i448 ^ i447)) * (-465)))))) - 1;
                                                                            int i450 = ~((i447 ^ b54) | (i447 & b54));
                                                                            int i451 = -(-(((i450 ^ 2101) | (i450 & 2101)) * 930));
                                                                            int i452 = ((i449 | i451) << 1) - (i451 ^ i449);
                                                                            int i453 = b54 | 2101;
                                                                            int i454 = -(-(((i453 ^ i447) | (i453 & i447)) * 465));
                                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                            f((char) ((62287 & indexOf12) + (indexOf12 | 62287)), (i452 ^ i454) + ((i454 & i452) << 1), 8 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr116);
                                                                            java.lang.Object[] objArr117 = {str73, (java.lang.String) objArr116[0]};
                                                                            d11 = com.facetec.sdk.al.d(-100890377);
                                                                            if (d11 == null) {
                                                                                char absoluteGravity = (char) (23780 - android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                                int defaultSize3 = android.view.View.getDefaultSize(0, 0);
                                                                                int lastIndexOf4 = android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                                byte b55 = (byte) ($$b >>> 2);
                                                                                byte b56 = (byte) (b55 - 4);
                                                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                g(b55, b56, (byte) (b56 + 1), objArr118);
                                                                                d11 = com.facetec.sdk.al.c(absoluteGravity, 1364 - defaultSize3, 23 - lastIndexOf4, 1578365455, false, (java.lang.String) objArr118[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                                                                            }
                                                                            long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) d11).invoke(null, objArr117)).longValue();
                                                                            long j98 = -553423530;
                                                                            long j99 = 765;
                                                                            long j100 = j98 ^ j97;
                                                                            long j101 = longValue16 ^ j97;
                                                                            long j102 = j100 | j101;
                                                                            str12 = str11;
                                                                            long myUid3 = android.os.Process.myUid();
                                                                            long j103 = myUid3 ^ j97;
                                                                            long j104 = ((((((-1529) * j98) + ((-764) * longValue16)) + ((((((j100 | longValue16) | myUid3) ^ j97) | ((j102 | j103) ^ j97)) | (((j101 | j98) | myUid3) ^ j97)) * j99)) + (1530 * ((j102 ^ j97) | ((j100 | j103) ^ j97)))) + (j99 * (((j100 | myUid3) ^ j97) | (((j101 | j103) | j98) ^ j97)))) - 1466640617;
                                                                            i45 = ((int) (j104 >> 32)) & (((~(i39 | 896133879)) * 52) + 216293850 + (((~(i39 | 895543991)) | (~(i39 | (-541682420))) | 589888) * (-52)) + (((~(i39 | (-895543992))) | 354451460) * 52));
                                                                            i46 = ((int) j104) & (((((~(i39 | (-314941606))) | 1752168015) * (-865)) - 93799382) + ((~(314941605 | i32)) * 865) + (((~(i39 | 314941605)) | (~(i39 | 1752168015))) * 865));
                                                                            if (((i45 ^ i46) | (i45 & i46)) != 0) {
                                                                                i43 = i39;
                                                                                i44 = (i32 & (-151)) | (i43 & 150);
                                                                            } else {
                                                                                i43 = i39;
                                                                                i44 = i32;
                                                                            }
                                                                            int i455 = ((~i444) & i32) | (i444 & i43);
                                                                            int i456 = (i455 | (-i455)) >> 31;
                                                                            int i457 = i44 & (~i456);
                                                                            int i458 = i444 & i456;
                                                                            int i459 = (i457 ^ i458) | (i457 & i458);
                                                                            char combineMeasuredStates4 = (char) android.view.View.combineMeasuredStates(0, 0);
                                                                            int i460 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                            int i461 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                            f(combineMeasuredStates4, (i460 & 2109) + (i460 | 2109), ((i461 | 47) << 1) - (i461 ^ 47), objArr119);
                                                                            java.lang.Object[] objArr120 = {(java.lang.String) objArr119[0]};
                                                                            d10 = com.facetec.sdk.al.d(1450487247);
                                                                            if (d10 == null) {
                                                                                char tapTimeout5 = (char) (6935 - (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                                                int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString(str12);
                                                                                double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                                                                byte b57 = (byte) ($$b >>> 2);
                                                                                byte b58 = (byte) (b57 - 4);
                                                                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                g(b57, b58, (byte) (b58 + 1), objArr121);
                                                                                d10 = com.facetec.sdk.al.c(tapTimeout5, 2389 - keyCodeFromString2, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 23, -241445065, false, (java.lang.String) objArr121[0], new java.lang.Class[]{java.lang.String.class});
                                                                            }
                                                                            long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr120)).longValue();
                                                                            long j105 = 945901318;
                                                                            long j106 = longValue17 ^ j97;
                                                                            i31 = i43;
                                                                            long elapsedRealtime7 = (int) android.os.SystemClock.elapsedRealtime();
                                                                            long j107 = elapsedRealtime7 ^ j97;
                                                                            long j108 = ((-830) * j105) + (832 * longValue17) + ((-831) * (((j106 | j107) ^ j97) | (((j105 | longValue17) | elapsedRealtime7) ^ j97))) + ((-1662) * (((j106 | j105) | elapsedRealtime7) ^ j97)) + (831 * (((elapsedRealtime7 | j105) ^ j97) | (((j105 ^ j97) | j107) ^ j97) | ((longValue17 | elapsedRealtime7) ^ j97))) + 905275323;
                                                                            int elapsedCpuTime5 = (int) android.os.Process.getElapsedCpuTime();
                                                                            int i462 = ~(1821812392 | (~elapsedCpuTime5));
                                                                            int i463 = ((int) (j108 >> 32)) & (((((1073783808 | i462) | (~((-1821812393) | elapsedCpuTime5))) * (-338)) - 696066646) + (((~(elapsedCpuTime5 | (-748028585))) | i462) * 338));
                                                                            int nextInt4 = new java.util.Random().nextInt();
                                                                            int i464 = ((int) j108) & (((~((-34636169) | nextInt4)) * 623) + 519134380 + (((~nextInt4) | 134292513) * (-623)) + (((~(nextInt4 | (-1379042271))) | 34636168 | (~(1478698615 | nextInt4))) * 623));
                                                                            int i465 = ((i463 ^ i464) | (i463 & i464)) * 263;
                                                                            int i466 = (~(i32 & i459)) & (i32 | i459);
                                                                            int i467 = -i466;
                                                                            int i468 = ((i466 ^ i467) | (i466 & i467)) >> 31;
                                                                            int i469 = (~(i465 & i32)) & (i465 | i32) & (~i468);
                                                                            int i470 = i459 & i468;
                                                                            i33 = (i470 ^ i469) | (i470 & i469);
                                                                            strArr2 = strArr6;
                                                                        }
                                                                    }
                                                                    i39 = i17;
                                                                    str10 = str45;
                                                                    i32 = i6;
                                                                    i40 = i37;
                                                                    int i4052 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                                    int i4062 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                    int i4072 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                    java.lang.Object[] objArr1032 = new java.lang.Object[1];
                                                                    f((char) (((54064 | i4052) << 1) - (i4052 ^ 54064)), (i4062 ^ 1952) + ((i4062 & 1952) << 1), (i4072 ^ 12) + ((i4072 & 12) << 1), objArr1032);
                                                                    java.lang.String str652 = (java.lang.String) objArr1032[0];
                                                                    int i4082 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                                    int i4092 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                    int i4102 = -android.view.MotionEvent.axisFromString(str10);
                                                                    java.lang.Object[] objArr1042 = new java.lang.Object[1];
                                                                    f((char) ((51455 ^ i4082) + ((i4082 & 51455) << 1)), (i4092 ^ 1965) + ((i4092 & 1965) << 1), ((i4102 | 4) << 1) - (4 ^ i4102), objArr1042);
                                                                    java.lang.String[] strArr222 = {str652, (java.lang.String) objArr1042[0]};
                                                                    char longPressTimeout32 = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                                                    int i4112 = -(-android.os.Process.getGidForName(str10));
                                                                    str11 = str10;
                                                                    java.lang.Object[] objArr1052 = new java.lang.Object[1];
                                                                    f(longPressTimeout32, ((i4112 | 1971) << 1) - (i4112 ^ 1971), 14 - (~(-android.text.TextUtils.indexOf(str11, str11))), objArr1052);
                                                                    java.lang.String str662 = (java.lang.String) objArr1052[0];
                                                                    char c202 = (char) ((-2) - (~(-((byte) android.view.KeyEvent.getModifierMetaStateMask()))));
                                                                    int i4122 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                                    int i4132 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                                    java.lang.Object[] objArr1062 = new java.lang.Object[1];
                                                                    f(c202, (i4122 ^ 1985) + ((i4122 & 1985) << 1), (i4132 ^ 19) + ((i4132 & 19) << 1), objArr1062);
                                                                    java.lang.String str672 = (java.lang.String) objArr1062[0];
                                                                    int i4142 = -android.graphics.Color.rgb(0, 0, 0);
                                                                    java.lang.Object[] objArr1072 = new java.lang.Object[1];
                                                                    f((char) (((-16712004) ^ i4142) + ((i4142 & (-16712004)) << 1)), 2003 - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), android.view.View.MeasureSpec.getSize(0) + 14, objArr1072);
                                                                    java.lang.String[] strArr232 = {str662, str672, (java.lang.String) objArr1072[0]};
                                                                    char maximumDrawingCacheSize52 = (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                    int i4152 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                                    java.lang.Object[] objArr1082 = new java.lang.Object[1];
                                                                    f(maximumDrawingCacheSize52, (i4152 ^ 2018) + ((i4152 & 2018) << 1), 21 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr1082);
                                                                    java.lang.String str682 = (java.lang.String) objArr1082[0];
                                                                    char keyRepeatTimeout32 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                    int i4162 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                                    int i4172 = -android.graphics.Color.green(0);
                                                                    int b532 = com.facetec.sdk.aw.a.b();
                                                                    int i4182 = (i4172 * (-574)) - 5740;
                                                                    int i4192 = ~i4172;
                                                                    int i4202 = ~b532;
                                                                    int i4212 = ~(b532 | (-11));
                                                                    long j972 = j4;
                                                                    int i4222 = -(-(((~(i4192 | i4202)) | i4212) * 1150));
                                                                    int i4232 = ~((i4202 ^ 10) | (i4202 & 10));
                                                                    int i4242 = (((i4182 & i4222) + (i4222 | i4182)) - (~(-(-(((i4212 ^ i4232) | (i4232 & i4212)) * (-575)))))) - 1;
                                                                    int i4252 = ~((i4192 ^ b532) | (b532 & i4192));
                                                                    int i4262 = ~((i4172 ^ i4202) | (i4172 & i4202));
                                                                    int i4272 = -(-(((i4262 ^ i4252) | (i4262 & i4252)) * 575));
                                                                    java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                                                    f(keyRepeatTimeout32, ((i4162 | 2039) << 1) - (i4162 ^ 2039), (i4242 ^ i4272) + ((i4272 & i4242) << 1), objArr1092);
                                                                    java.lang.String[] strArr242 = {str682, (java.lang.String) objArr1092[0]};
                                                                    int i4282 = -(android.os.Process.myTid() >> 22);
                                                                    java.lang.Object[] objArr1102 = new java.lang.Object[1];
                                                                    f((char) ((45523 ^ i4282) + ((i4282 & 45523) << 1)), 2047 - (~(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 16777226 - (~(-(-android.graphics.Color.rgb(0, 0, 0)))), objArr1102);
                                                                    java.lang.String str692 = (java.lang.String) objArr1102[0];
                                                                    char myPid52 = (char) ((android.os.Process.myPid() >> 22) + 53525);
                                                                    int i4292 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                    java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                                                    f(myPid52, ((i4292 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED) << 1) - (i4292 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6, objArr1112);
                                                                    java.lang.String[] strArr252 = {str692, (java.lang.String) objArr1112[0]};
                                                                    int i4302 = -android.graphics.Color.rgb(0, 0, 0);
                                                                    java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                                                    f((char) ((((-16720776) | i4302) << 1) - (i4302 ^ (-16720776))), 2060 - (~android.os.Process.getGidForName(str11)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 28, objArr1122);
                                                                    java.lang.String str702 = (java.lang.String) objArr1122[0];
                                                                    char doubleTapTimeout2 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                    int trimmedLength32 = android.text.TextUtils.getTrimmedLength(str11);
                                                                    int i4312 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                                    java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                                                    f(doubleTapTimeout2, ((trimmedLength32 | 2039) << 1) - (trimmedLength32 ^ 2039), (i4312 ^ 10) + ((i4312 & 10) << 1), objArr1132);
                                                                    java.lang.String[][] strArr262 = {strArr222, strArr232, strArr242, strArr252, new java.lang.String[]{str702, (java.lang.String) objArr1132[0]}};
                                                                    int i4322 = -1;
                                                                    i41 = 0;
                                                                    loop7: while (true) {
                                                                        if (i41 >= 5) {
                                                                        }
                                                                        i41++;
                                                                    }
                                                                    int i4402 = ((~i40) & i32) | (i40 & i39);
                                                                    int i4412 = (i4402 | (-i4402)) >> 31;
                                                                    int i4422 = i42 & (~i4412);
                                                                    int i4432 = i40 & i4412;
                                                                    int i4442 = (i4422 ^ i4432) | (i4432 & i4422);
                                                                    char edgeSlop32 = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                                    int i4452 = -(android.os.Process.myPid() >> 22);
                                                                    int mode72 = android.view.View.MeasureSpec.getMode(0);
                                                                    java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                                    f(edgeSlop32, 2087 - (~i4452), (mode72 & 13) + (mode72 | 13), objArr1152);
                                                                    java.lang.String str732 = (java.lang.String) objArr1152[0];
                                                                    int indexOf122 = android.text.TextUtils.indexOf(str11, str11, 0, 0);
                                                                    int combineMeasuredStates32 = android.view.View.combineMeasuredStates(0, 0);
                                                                    int b542 = com.facetec.sdk.aw.a.b();
                                                                    int i4462 = combineMeasuredStates32 * (-464);
                                                                    int i4472 = ~combineMeasuredStates32;
                                                                    int i4482 = ~((b542 ^ 2101) | (b542 & 2101));
                                                                    int i4492 = ((((-1951829) & i4462) + (i4462 | (-1951829))) - (~(-(-(((i4472 & i4482) | (i4482 ^ i4472)) * (-465)))))) - 1;
                                                                    int i4502 = ~((i4472 ^ b542) | (i4472 & b542));
                                                                    int i4512 = -(-(((i4502 ^ 2101) | (i4502 & 2101)) * 930));
                                                                    int i4522 = ((i4492 | i4512) << 1) - (i4512 ^ i4492);
                                                                    int i4532 = b542 | 2101;
                                                                    int i4542 = -(-(((i4532 ^ i4472) | (i4532 & i4472)) * 465));
                                                                    java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                                    f((char) ((62287 & indexOf122) + (indexOf122 | 62287)), (i4522 ^ i4542) + ((i4542 & i4522) << 1), 8 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr1162);
                                                                    java.lang.Object[] objArr1172 = {str732, (java.lang.String) objArr1162[0]};
                                                                    d11 = com.facetec.sdk.al.d(-100890377);
                                                                    if (d11 == null) {
                                                                    }
                                                                    long longValue162 = ((java.lang.Long) ((java.lang.reflect.Method) d11).invoke(null, objArr1172)).longValue();
                                                                    long j982 = -553423530;
                                                                    long j992 = 765;
                                                                    long j1002 = j982 ^ j972;
                                                                    long j1012 = longValue162 ^ j972;
                                                                    long j1022 = j1002 | j1012;
                                                                    str12 = str11;
                                                                    long myUid32 = android.os.Process.myUid();
                                                                    long j1032 = myUid32 ^ j972;
                                                                    long j1042 = ((((((-1529) * j982) + ((-764) * longValue162)) + ((((((j1002 | longValue162) | myUid32) ^ j972) | ((j1022 | j1032) ^ j972)) | (((j1012 | j982) | myUid32) ^ j972)) * j992)) + (1530 * ((j1022 ^ j972) | ((j1002 | j1032) ^ j972)))) + (j992 * (((j1002 | myUid32) ^ j972) | (((j1012 | j1032) | j982) ^ j972)))) - 1466640617;
                                                                    i45 = ((int) (j1042 >> 32)) & (((~(i39 | 896133879)) * 52) + 216293850 + (((~(i39 | 895543991)) | (~(i39 | (-541682420))) | 589888) * (-52)) + (((~(i39 | (-895543992))) | 354451460) * 52));
                                                                    i46 = ((int) j1042) & (((((~(i39 | (-314941606))) | 1752168015) * (-865)) - 93799382) + ((~(314941605 | i32)) * 865) + (((~(i39 | 314941605)) | (~(i39 | 1752168015))) * 865));
                                                                    if (((i45 ^ i46) | (i45 & i46)) != 0) {
                                                                    }
                                                                    int i4552 = ((~i4442) & i32) | (i4442 & i43);
                                                                    int i4562 = (i4552 | (-i4552)) >> 31;
                                                                    int i4572 = i44 & (~i4562);
                                                                    int i4582 = i4442 & i4562;
                                                                    int i4592 = (i4572 ^ i4582) | (i4572 & i4582);
                                                                    char combineMeasuredStates42 = (char) android.view.View.combineMeasuredStates(0, 0);
                                                                    int i4602 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                    int i4612 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                    java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                                                    f(combineMeasuredStates42, (i4602 & 2109) + (i4602 | 2109), ((i4612 | 47) << 1) - (i4612 ^ 47), objArr1192);
                                                                    java.lang.Object[] objArr1202 = {(java.lang.String) objArr1192[0]};
                                                                    d10 = com.facetec.sdk.al.d(1450487247);
                                                                    if (d10 == null) {
                                                                    }
                                                                    long longValue172 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr1202)).longValue();
                                                                    long j1052 = 945901318;
                                                                    long j1062 = longValue172 ^ j972;
                                                                    i31 = i43;
                                                                    long elapsedRealtime72 = (int) android.os.SystemClock.elapsedRealtime();
                                                                    long j1072 = elapsedRealtime72 ^ j972;
                                                                    long j1082 = ((-830) * j1052) + (832 * longValue172) + ((-831) * (((j1062 | j1072) ^ j972) | (((j1052 | longValue172) | elapsedRealtime72) ^ j972))) + ((-1662) * (((j1062 | j1052) | elapsedRealtime72) ^ j972)) + (831 * (((elapsedRealtime72 | j1052) ^ j972) | (((j1052 ^ j972) | j1072) ^ j972) | ((longValue172 | elapsedRealtime72) ^ j972))) + 905275323;
                                                                    int elapsedCpuTime52 = (int) android.os.Process.getElapsedCpuTime();
                                                                    int i4622 = ~(1821812392 | (~elapsedCpuTime52));
                                                                    int i4632 = ((int) (j1082 >> 32)) & (((((1073783808 | i4622) | (~((-1821812393) | elapsedCpuTime52))) * (-338)) - 696066646) + (((~(elapsedCpuTime52 | (-748028585))) | i4622) * 338));
                                                                    int nextInt42 = new java.util.Random().nextInt();
                                                                    int i4642 = ((int) j1082) & (((~((-34636169) | nextInt42)) * 623) + 519134380 + (((~nextInt42) | 134292513) * (-623)) + (((~(nextInt42 | (-1379042271))) | 34636168 | (~(1478698615 | nextInt42))) * 623));
                                                                    int i4652 = ((i4632 ^ i4642) | (i4632 & i4642)) * 263;
                                                                    int i4662 = (~(i32 & i4592)) & (i32 | i4592);
                                                                    int i4672 = -i4662;
                                                                    int i4682 = ((i4662 ^ i4672) | (i4662 & i4672)) >> 31;
                                                                    int i4692 = (~(i4652 & i32)) & (i4652 | i32) & (~i4682);
                                                                    int i4702 = i4592 & i4682;
                                                                    i33 = (i4702 ^ i4692) | (i4702 & i4692);
                                                                    strArr2 = strArr6;
                                                                }
                                                            }
                                                        }
                                                        java.lang.Object[] objArr11722 = {str732, (java.lang.String) objArr1162[0]};
                                                        d11 = com.facetec.sdk.al.d(-100890377);
                                                        if (d11 == null) {
                                                        }
                                                        long longValue1622 = ((java.lang.Long) ((java.lang.reflect.Method) d11).invoke(null, objArr11722)).longValue();
                                                        long j9822 = -553423530;
                                                        long j9922 = 765;
                                                        long j10022 = j9822 ^ j972;
                                                        long j10122 = longValue1622 ^ j972;
                                                        long j10222 = j10022 | j10122;
                                                        str12 = str11;
                                                        long myUid322 = android.os.Process.myUid();
                                                        long j10322 = myUid322 ^ j972;
                                                        long j10422 = ((((((-1529) * j9822) + ((-764) * longValue1622)) + ((((((j10022 | longValue1622) | myUid322) ^ j972) | ((j10222 | j10322) ^ j972)) | (((j10122 | j9822) | myUid322) ^ j972)) * j9922)) + (1530 * ((j10222 ^ j972) | ((j10022 | j10322) ^ j972)))) + (j9922 * (((j10022 | myUid322) ^ j972) | (((j10122 | j10322) | j9822) ^ j972)))) - 1466640617;
                                                        i45 = ((int) (j10422 >> 32)) & (((~(i39 | 896133879)) * 52) + 216293850 + (((~(i39 | 895543991)) | (~(i39 | (-541682420))) | 589888) * (-52)) + (((~(i39 | (-895543992))) | 354451460) * 52));
                                                        i46 = ((int) j10422) & (((((~(i39 | (-314941606))) | 1752168015) * (-865)) - 93799382) + ((~(314941605 | i32)) * 865) + (((~(i39 | 314941605)) | (~(i39 | 1752168015))) * 865));
                                                        if (((i45 ^ i46) | (i45 & i46)) != 0) {
                                                        }
                                                        int i45522 = ((~i4442) & i32) | (i4442 & i43);
                                                        int i45622 = (i45522 | (-i45522)) >> 31;
                                                        int i45722 = i44 & (~i45622);
                                                        int i45822 = i4442 & i45622;
                                                        int i45922 = (i45722 ^ i45822) | (i45722 & i45822);
                                                        char combineMeasuredStates422 = (char) android.view.View.combineMeasuredStates(0, 0);
                                                        int i46022 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i46122 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                        java.lang.Object[] objArr11922 = new java.lang.Object[1];
                                                        f(combineMeasuredStates422, (i46022 & 2109) + (i46022 | 2109), ((i46122 | 47) << 1) - (i46122 ^ 47), objArr11922);
                                                        java.lang.Object[] objArr12022 = {(java.lang.String) objArr11922[0]};
                                                        d10 = com.facetec.sdk.al.d(1450487247);
                                                        if (d10 == null) {
                                                        }
                                                        long longValue1722 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr12022)).longValue();
                                                        long j10522 = 945901318;
                                                        long j10622 = longValue1722 ^ j972;
                                                        i31 = i43;
                                                        long elapsedRealtime722 = (int) android.os.SystemClock.elapsedRealtime();
                                                        long j10722 = elapsedRealtime722 ^ j972;
                                                        long j10822 = ((-830) * j10522) + (832 * longValue1722) + ((-831) * (((j10622 | j10722) ^ j972) | (((j10522 | longValue1722) | elapsedRealtime722) ^ j972))) + ((-1662) * (((j10622 | j10522) | elapsedRealtime722) ^ j972)) + (831 * (((elapsedRealtime722 | j10522) ^ j972) | (((j10522 ^ j972) | j10722) ^ j972) | ((longValue1722 | elapsedRealtime722) ^ j972))) + 905275323;
                                                        int elapsedCpuTime522 = (int) android.os.Process.getElapsedCpuTime();
                                                        int i46222 = ~(1821812392 | (~elapsedCpuTime522));
                                                        int i46322 = ((int) (j10822 >> 32)) & (((((1073783808 | i46222) | (~((-1821812393) | elapsedCpuTime522))) * (-338)) - 696066646) + (((~(elapsedCpuTime522 | (-748028585))) | i46222) * 338));
                                                        int nextInt422 = new java.util.Random().nextInt();
                                                        int i46422 = ((int) j10822) & (((~((-34636169) | nextInt422)) * 623) + 519134380 + (((~nextInt422) | 134292513) * (-623)) + (((~(nextInt422 | (-1379042271))) | 34636168 | (~(1478698615 | nextInt422))) * 623));
                                                        int i46522 = ((i46322 ^ i46422) | (i46322 & i46422)) * 263;
                                                        int i46622 = (~(i32 & i45922)) & (i32 | i45922);
                                                        int i46722 = -i46622;
                                                        int i46822 = ((i46622 ^ i46722) | (i46622 & i46722)) >> 31;
                                                        int i46922 = (~(i46522 & i32)) & (i46522 | i32) & (~i46822);
                                                        int i47022 = i45922 & i46822;
                                                        i33 = (i47022 ^ i46922) | (i47022 & i46922);
                                                        strArr2 = strArr6;
                                                    } catch (java.lang.Throwable th2) {
                                                        str12 = str11;
                                                        i43 = i39;
                                                        try {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        } catch (java.lang.Exception unused6) {
                                                            i44 = i32 ^ 151;
                                                            int i455222 = ((~i4442) & i32) | (i4442 & i43);
                                                            int i456222 = (i455222 | (-i455222)) >> 31;
                                                            int i457222 = i44 & (~i456222);
                                                            int i458222 = i4442 & i456222;
                                                            int i459222 = (i457222 ^ i458222) | (i457222 & i458222);
                                                            char combineMeasuredStates4222 = (char) android.view.View.combineMeasuredStates(0, 0);
                                                            int i460222 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int i461222 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            java.lang.Object[] objArr119222 = new java.lang.Object[1];
                                                            f(combineMeasuredStates4222, (i460222 & 2109) + (i460222 | 2109), ((i461222 | 47) << 1) - (i461222 ^ 47), objArr119222);
                                                            java.lang.Object[] objArr120222 = {(java.lang.String) objArr119222[0]};
                                                            d10 = com.facetec.sdk.al.d(1450487247);
                                                            if (d10 == null) {
                                                            }
                                                            long longValue17222 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr120222)).longValue();
                                                            long j105222 = 945901318;
                                                            long j106222 = longValue17222 ^ j972;
                                                            i31 = i43;
                                                            long elapsedRealtime7222 = (int) android.os.SystemClock.elapsedRealtime();
                                                            long j107222 = elapsedRealtime7222 ^ j972;
                                                            long j108222 = ((-830) * j105222) + (832 * longValue17222) + ((-831) * (((j106222 | j107222) ^ j972) | (((j105222 | longValue17222) | elapsedRealtime7222) ^ j972))) + ((-1662) * (((j106222 | j105222) | elapsedRealtime7222) ^ j972)) + (831 * (((elapsedRealtime7222 | j105222) ^ j972) | (((j105222 ^ j972) | j107222) ^ j972) | ((longValue17222 | elapsedRealtime7222) ^ j972))) + 905275323;
                                                            int elapsedCpuTime5222 = (int) android.os.Process.getElapsedCpuTime();
                                                            int i462222 = ~(1821812392 | (~elapsedCpuTime5222));
                                                            int i463222 = ((int) (j108222 >> 32)) & (((((1073783808 | i462222) | (~((-1821812393) | elapsedCpuTime5222))) * (-338)) - 696066646) + (((~(elapsedCpuTime5222 | (-748028585))) | i462222) * 338));
                                                            int nextInt4222 = new java.util.Random().nextInt();
                                                            int i464222 = ((int) j108222) & (((~((-34636169) | nextInt4222)) * 623) + 519134380 + (((~nextInt4222) | 134292513) * (-623)) + (((~(nextInt4222 | (-1379042271))) | 34636168 | (~(1478698615 | nextInt4222))) * 623));
                                                            int i465222 = ((i463222 ^ i464222) | (i463222 & i464222)) * 263;
                                                            int i466222 = (~(i32 & i459222)) & (i32 | i459222);
                                                            int i467222 = -i466222;
                                                            int i468222 = ((i466222 ^ i467222) | (i466222 & i467222)) >> 31;
                                                            int i469222 = (~(i465222 & i32)) & (i465222 | i32) & (~i468222);
                                                            int i470222 = i459222 & i468222;
                                                            i33 = (i470222 ^ i469222) | (i470222 & i469222);
                                                            strArr2 = strArr6;
                                                            int i471 = i32 ^ i33;
                                                            int i472 = -i471;
                                                            int i473 = (((i471 ^ i472) | (i471 & i472)) >> 31) & 16;
                                                            java.lang.Object[] objArr122 = {new int[]{(r1 & (~r3)) | r4}, strArr2, new int[]{i33}, new int[]{i32}};
                                                            int i474 = ~(863289411 | i32);
                                                            int i475 = ((1140990480 | i474) * (-814)) + 1256594921 + ((i474 | (~(i31 | (-1165386323))) | 838893569) * 407) + (((~(i32 | 1165386322)) | (~((-863289412) | i32)) | 838893569) * 407);
                                                            int i476 = ((i475 | i473) << 1) - (i473 ^ i475);
                                                            int i477 = (i3 ^ i476) + ((i3 & i476) << 1);
                                                            int i478 = i477 << 13;
                                                            int i479 = (~(i477 & i478)) & (i478 | i477);
                                                            int i480 = i479 ^ (i479 >>> 17);
                                                            int i481 = i480 << 5;
                                                            int i482 = (~i480) & i481;
                                                            return objArr122;
                                                        }
                                                    }
                                                    char keyCodeFromString3 = (char) android.view.KeyEvent.keyCodeFromString(str44);
                                                    int keyRepeatDelay3 = android.view.ViewConfiguration.getKeyRepeatDelay();
                                                    int i483 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                    f(keyCodeFromString3, 371 - (~(keyRepeatDelay3 >> 16)), (i483 & 23) + (i483 | 23), objArr123);
                                                    java.lang.String str74 = (java.lang.String) objArr123[0];
                                                    int i484 = -(-android.graphics.Color.blue(0));
                                                    int defaultSize4 = android.view.View.getDefaultSize(0, 0);
                                                    java.lang.String str75 = str44;
                                                    int i485 = -(-android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                    f((char) ((64118 ^ i484) + ((i484 & 64118) << 1)), defaultSize4 + 810, ((i485 | 11) << 1) - (i485 ^ 11), objArr124);
                                                    java.lang.String str76 = (java.lang.String) objArr124[0];
                                                    int i486 = -(-android.view.View.MeasureSpec.getMode(0));
                                                    int i487 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                    f((char) ((55731 & i486) + (i486 | 55731)), ((i487 | 821) << 1) - (i487 ^ 821), android.text.TextUtils.getOffsetBefore(str75, 0) + 7, objArr125);
                                                    java.lang.String str77 = (java.lang.String) objArr125[0];
                                                    int i488 = -android.graphics.Color.alpha(0);
                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                    f((char) ((44646 & i488) + (i488 | 44646)), 826 - (~(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))), android.view.View.resolveSizeAndState(0, 0, 0) + 8, objArr126);
                                                    java.lang.String[] strArr29 = {str74, str76, str77, (java.lang.String) objArr126[0]};
                                                    int i489 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    int i490 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                    f((char) (((i489 | 1) << 1) - (i489 ^ 1)), (i490 & 836) + (i490 | 836), 17 - android.graphics.Color.blue(0), objArr127);
                                                    java.lang.String str78 = (java.lang.String) objArr127[0];
                                                    char indexOf13 = (char) (android.text.TextUtils.indexOf(str75, str75, 0, 0) + 63585);
                                                    int i491 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                    f(indexOf13, (i491 ^ 852) + ((i491 & 852) << 1), 6 - (~(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr128);
                                                    java.lang.String str79 = (java.lang.String) objArr128[0];
                                                    char lastIndexOf5 = (char) (android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 36250);
                                                    int green = android.graphics.Color.green(0);
                                                    int i492 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                    f(lastIndexOf5, green + 859, ((i492 | 7) << 1) - (i492 ^ 7), objArr129);
                                                    java.lang.String str80 = (java.lang.String) objArr129[0];
                                                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                    f((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 865 - (~(-(-android.view.KeyEvent.normalizeMetaState(0)))), android.view.View.getDefaultSize(0, 0) + 11, objArr130);
                                                    java.lang.String str81 = (java.lang.String) objArr130[0];
                                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                    f((char) android.text.TextUtils.getCapsMode(str75, 0, 0), 877 - (~android.text.TextUtils.indexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 14, objArr131);
                                                    java.lang.String[] strArr30 = {str78, str79, str80, str81, (java.lang.String) objArr131[0]};
                                                    int i493 = -(-android.view.View.resolveSize(0, 0));
                                                    int i494 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int i495 = -android.view.MotionEvent.axisFromString(str75);
                                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                    f((char) ((i493 & 20452) + (i493 | 20452)), (i494 & 892) + (i494 | 892), (i495 & 15) + (i495 | 15), objArr132);
                                                    java.lang.String str82 = (java.lang.String) objArr132[0];
                                                    int i496 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                    f((char) ((i496 ^ 12625) + ((i496 & 12625) << 1)), 907 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 3 - (android.os.Process.myPid() >> 22), objArr133);
                                                    java.lang.String str83 = (java.lang.String) objArr133[0];
                                                    char c21 = (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                    int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                    int i497 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                    f(c21, resolveOpacity2 + 918, (i497 & 22) + (i497 | 22), objArr134);
                                                    java.lang.String str84 = (java.lang.String) objArr134[0];
                                                    char c22 = (char) (391 - (~(-(android.view.ViewConfiguration.getTouchSlop() >> 8))));
                                                    int gidForName = android.os.Process.getGidForName(str75);
                                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                    f(c22, (gidForName ^ 941) + ((gidForName & 941) << 1), 25 - android.graphics.Color.blue(0), objArr135);
                                                    java.lang.String str85 = (java.lang.String) objArr135[0];
                                                    char c23 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    int i498 = -android.text.TextUtils.indexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    int i499 = -android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                    f(c23, 963 - (~i498), ((i499 | 27) << 1) - (i499 ^ 27), objArr136);
                                                    j4 = j32;
                                                    java.lang.String[] strArr31 = {str82, str83, str, str84, str85, (java.lang.String) objArr136[0]};
                                                    int i500 = -android.view.MotionEvent.axisFromString(str75);
                                                    int i501 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                    f((char) ((i500 & 28583) + (i500 | 28583)), (i501 & 994) + (i501 | 994), 10 - (~(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))), objArr137);
                                                    java.lang.String str86 = (java.lang.String) objArr137[0];
                                                    java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                    f((char) ((-1) - android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.text.TextUtils.indexOf(str75, str75, 0) + 1004, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr138);
                                                    java.lang.String str87 = (java.lang.String) objArr138[0];
                                                    int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0);
                                                    int i502 = -(android.os.Process.myTid() >> 22);
                                                    int i503 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                    f((char) ((bitsPerPixel2 & 15855) + (bitsPerPixel2 | 15855)), 1011 - (~i502), (i503 ^ 6) + ((i503 & 6) << 1), objArr139);
                                                    java.lang.String str88 = (java.lang.String) objArr139[0];
                                                    int i504 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                    f((char) ((i504 ^ 22706) + ((i504 & 22706) << 1)), 1017 - (~(-android.graphics.Color.red(0))), 5 - (~android.view.KeyEvent.normalizeMetaState(0)), objArr140);
                                                    java.lang.String[] strArr32 = {str86, str87, str88, (java.lang.String) objArr140[0]};
                                                    int i505 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                    int i506 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                    int i507 = -android.graphics.Color.blue(0);
                                                    java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                    f((char) ((i505 ^ 885) + ((i505 & 885) << 1)), (i506 ^ 1023) + ((i506 & 1023) << 1), (i507 ^ 16) + ((i507 & 16) << 1), objArr141);
                                                    java.lang.String str89 = (java.lang.String) objArr141[0];
                                                    int i508 = -android.graphics.Color.red(0);
                                                    long uptimeMillis4 = android.os.SystemClock.uptimeMillis();
                                                    int i509 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                    f((char) ((36249 ^ i508) + ((i508 & 36249) << 1)), 857 - (~(uptimeMillis4 > 0L ? 1 : (uptimeMillis4 == 0L ? 0 : -1))), (i509 ^ 8) + ((i509 & 8) << 1), objArr142);
                                                    java.lang.String str90 = (java.lang.String) objArr142[0];
                                                    int i510 = -android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                    int i511 = -android.view.View.resolveSize(0, 0);
                                                    int gidForName2 = android.os.Process.getGidForName(str75);
                                                    java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                    f((char) ((44645 & i510) + (i510 | 44645)), ((i511 | 827) << 1) - (i511 ^ 827), (gidForName2 ^ 9) + ((gidForName2 & 9) << 1), objArr143);
                                                    java.lang.String[] strArr33 = {str89, str90, (java.lang.String) objArr143[0]};
                                                    char c24 = (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1891);
                                                    int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                                                    int pressedStateDuration3 = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                                                    java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                    f(c24, 1040 - (scrollBarSize2 >> 8), (pressedStateDuration3 ^ 14) + ((pressedStateDuration3 & 14) << 1), objArr144);
                                                    java.lang.String str91 = (java.lang.String) objArr144[0];
                                                    int i512 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    int i513 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int myPid6 = android.os.Process.myPid() >> 22;
                                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                    f((char) ((i512 & 10956) + (i512 | 10956)), (i513 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_URL_LIST) + (i513 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_URL_LIST), (myPid6 ^ 1) + ((myPid6 & 1) << 1), objArr145);
                                                    java.lang.String[] strArr34 = {str91, (java.lang.String) objArr145[0]};
                                                    char c25 = (char) ((-2) - (~(-android.text.TextUtils.indexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))));
                                                    int i514 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    int i515 = i514 * (-661);
                                                    int i516 = (((-696694) | i515) << 1) - (i515 ^ (-696694));
                                                    int i517 = ~i514;
                                                    int i518 = ~((i517 & (-1055)) | (i517 ^ (-1055)));
                                                    int i519 = -(-(((i518 ^ i17) | (i518 & i17)) * 1324));
                                                    int i520 = (i516 & i519) + (i516 | i519);
                                                    int i521 = ((~((i514 ^ i6) | (i514 & i6))) | (~((i6 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_URL_LIST) | (i6 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_URL_LIST)))) * (-1324);
                                                    int i522 = ((i520 | i521) << 1) - (i521 ^ i520);
                                                    int i523 = ~(i517 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_URL_LIST);
                                                    int i524 = ~((i514 ^ (-1055)) | (i514 & (-1055)));
                                                    int i525 = ((i524 ^ i523) | (i524 & i523)) * 662;
                                                    java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                    f(c25, (i522 ^ i525) + ((i525 & i522) << 1), 8 - (~(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr146);
                                                    java.lang.String str92 = (java.lang.String) objArr146[0];
                                                    char defaultSize5 = (char) android.view.View.getDefaultSize(0, 0);
                                                    int i526 = -(-android.text.TextUtils.getTrimmedLength(str75));
                                                    java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                    f(defaultSize5, ((i526 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PIXEL_ASPECT_RATIO) << 1) - (i526 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PIXEL_ASPECT_RATIO), -android.os.Process.getGidForName(str75), objArr147);
                                                    java.lang.String[] strArr35 = {str92, (java.lang.String) objArr147[0]};
                                                    java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                    f((char) (com.google.android.gms.auth.api.phone.IncomingCallRetrieverStatusCodes.TELEPHONY_FEATURE_UNAVAILABLE - (~(-android.text.TextUtils.indexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))), 1065 - android.graphics.Color.green(0), 15 - (~(android.os.Process.myTid() >> 22)), objArr148);
                                                    java.lang.String str93 = (java.lang.String) objArr148[0];
                                                    char c26 = (char) (12624 - (~(android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                                                    int i527 = -(-(android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                    int i528 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                    f(c26, 906 - (~i527), ((i528 | 4) << 1) - (i528 ^ 4), objArr149);
                                                    java.lang.String str94 = (java.lang.String) objArr149[0];
                                                    char c27 = (char) (63584 - (~android.text.TextUtils.indexOf(str75, str75, 0, 0)));
                                                    int i529 = -android.text.TextUtils.indexOf(str75, str75, 0);
                                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                    f(c27, (i529 & 852) + (i529 | 852), 7 - android.view.KeyEvent.getDeadChar(0, 0), objArr150);
                                                    java.lang.String str95 = (java.lang.String) objArr150[0];
                                                    char c28 = (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    int i530 = -(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                    int lastIndexOf6 = android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                    f(c28, 1080 - (~i530), (lastIndexOf6 ^ 9) + ((lastIndexOf6 & 9) << 1), objArr151);
                                                    java.lang.String str96 = (java.lang.String) objArr151[0];
                                                    char defaultSize6 = (char) android.view.View.getDefaultSize(0, 0);
                                                    int i531 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    int i532 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                    java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                    f(defaultSize6, (i531 ^ 914) + ((i531 & 914) << 1), ((i532 | 11) << 1) - (i532 ^ 11), objArr152);
                                                    java.lang.String str97 = (java.lang.String) objArr152[0];
                                                    char indexOf14 = (char) android.text.TextUtils.indexOf(str75, str75);
                                                    int i533 = -(-android.text.TextUtils.getTrimmedLength(str75));
                                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                    f(indexOf14, ((i533 | 877) << 1) - (i533 ^ 877), 14 - android.view.View.combineMeasuredStates(0, 0), objArr153);
                                                    java.lang.String[] strArr36 = {str93, str94, str95, str96, str97, (java.lang.String) objArr153[0]};
                                                    int i534 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    int i535 = -android.text.TextUtils.indexOf(str75, str75);
                                                    int i536 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int b59 = com.facetec.sdk.aw.a.b();
                                                    int i537 = i536 * (-501);
                                                    int i538 = ((i537 | 10060) << 1) - (i537 ^ 10060);
                                                    int i539 = ~((b59 ^ (-21)) | (b59 & (-21)));
                                                    int i540 = ~((i536 ^ 20) | (i536 & 20));
                                                    int i541 = ((i539 & i540) | (i539 ^ i540)) * (-502);
                                                    int i542 = (~b59) | (-21);
                                                    int i543 = ((((i538 | i541) << 1) - (i541 ^ i538)) - (~(-(-((~((i542 & i536) | (i542 ^ i536))) * (-502)))))) - 1;
                                                    int i544 = ~i536;
                                                    int i545 = -(-(((~((i544 ^ b59) | (i544 & b59))) | (-21)) * 502));
                                                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                    f((char) (((64313 | i534) << 1) - (i534 ^ 64313)), (i535 ^ 1089) + ((i535 & 1089) << 1), (i543 ^ i545) + ((i545 & i543) << 1), objArr154);
                                                    java.lang.String str98 = (java.lang.String) objArr154[0];
                                                    int threadPriority4 = android.os.Process.getThreadPriority(0);
                                                    int i546 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                    int i547 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                    f((char) ((((threadPriority4 | 20) << 1) - (threadPriority4 ^ 20)) >> 6), ((i546 | 1109) << 1) - (i546 ^ 1109), ((i547 | 19) << 1) - (i547 ^ 19), objArr155);
                                                    java.lang.String str99 = (java.lang.String) objArr155[0];
                                                    int threadPriority5 = android.os.Process.getThreadPriority(0);
                                                    int i548 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                    f((char) (((((threadPriority5 | 20) << 1) - (threadPriority5 ^ 20)) >> 6) + 54211), ((i548 | 1128) << 1) - (i548 ^ 1128), 29 - (~(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr156);
                                                    java.lang.String str100 = (java.lang.String) objArr156[0];
                                                    char pressedStateDuration4 = (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int i549 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                    f(pressedStateDuration4, (i549 & 1159) + (i549 | 1159), 26 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr157);
                                                    java.lang.String str101 = (java.lang.String) objArr157[0];
                                                    int lastIndexOf7 = android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                    int b60 = com.facetec.sdk.aw.a.b();
                                                    int i550 = lastIndexOf7 * 50;
                                                    int i551 = ~b60;
                                                    int i552 = ~(((-53902) & i551) | ((-53902) ^ i551));
                                                    int i553 = ~(((-53902) ^ lastIndexOf7) | ((-53902) & lastIndexOf7));
                                                    int i554 = ((((-5228397) & i550) + (i550 | (-5228397))) - (~(((i552 & i553) | (i552 ^ i553)) * 98))) - 1;
                                                    int i555 = ~lastIndexOf7;
                                                    int i556 = (~((i555 ^ i551) | (i555 & i551))) | (-53902);
                                                    int i557 = ~((lastIndexOf7 ^ b60) | (lastIndexOf7 & b60));
                                                    int i558 = -(-(((i556 ^ i557) | (i556 & i557)) * (-49)));
                                                    int i559 = (i554 & i558) + (i558 | i554);
                                                    int i560 = ((~((b60 ^ (-53902)) | ((-53902) & b60))) | (~(53901 | lastIndexOf7))) * 49;
                                                    int i561 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                    f((char) ((i559 & i560) + (i560 | i559)), (i561 & 1185) + (i561 | 1185), 23 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr158);
                                                    java.lang.String str102 = (java.lang.String) objArr158[0];
                                                    char c29 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i562 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    int i563 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                                    java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                    f(c29, ((i562 | 1256) << 1) - (i562 ^ 1256), (i563 & 32) + (i563 | 32), objArr159);
                                                    java.lang.String[] strArr37 = {str98, str99, str100, str101, str102, (java.lang.String) objArr159[0], str};
                                                    int i564 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    int i565 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    int i566 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                                                    java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                    f((char) (((56668 | i564) << 1) - (i564 ^ 56668)), (i565 ^ 1242) + ((i565 & 1242) << 1), (i566 & 13) + (i566 | 13), objArr160);
                                                    java.lang.String str103 = (java.lang.String) objArr160[0];
                                                    int i567 = -android.text.TextUtils.indexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                    int i568 = i567 * 677;
                                                    int i569 = (i567 ^ i6) | (i567 & i6);
                                                    int i570 = (((((-37617750) | i568) << 1) - (i568 ^ (-37617750))) - (~(-(-((((-55731) & i569) | (i569 ^ (-55731))) * (-676)))))) - 1;
                                                    int i571 = ~(((-55731) ^ i567) | ((-55731) & i567));
                                                    int i572 = ~((i17 ^ i567) | (i17 & i567));
                                                    int i573 = -(-(((i571 ^ i572) | (i571 & i572)) * 676));
                                                    int i574 = ((i570 | i573) << 1) - (i573 ^ i570);
                                                    int i575 = ~((~i567) | (-55731));
                                                    int i576 = ~(((-55731) ^ i17) | ((-55731) & i17));
                                                    int i577 = (i575 ^ i576) | (i575 & i576);
                                                    int i578 = (i567 ^ 55730) | (55730 & i567);
                                                    int i579 = ~((i578 ^ i6) | (i578 & i6));
                                                    int i580 = -(-(((i579 ^ i577) | (i579 & i577)) * 676));
                                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                    f((char) ((i574 ^ i580) + ((i580 & i574) << 1)), 820 - android.graphics.Color.red(0), 5 - (~(-android.widget.ExpandableListView.getPackedPositionChild(0L))), objArr161);
                                                    java.lang.String[] strArr38 = {str103, (java.lang.String) objArr161[0]};
                                                    char edgeSlop4 = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                    int i581 = -android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                    int i582 = -(-android.text.TextUtils.indexOf(str75, str75, 0));
                                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                    f(edgeSlop4, 1252 - (~i581), ((i582 | 30) << 1) - (i582 ^ 30), objArr162);
                                                    java.lang.String str104 = (java.lang.String) objArr162[0];
                                                    char c30 = (char) ((-(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))) - 1);
                                                    int i583 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                    int trimmedLength5 = android.text.TextUtils.getTrimmedLength(str75);
                                                    java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                    f(c30, (i583 ^ 1284) + ((i583 & 1284) << 1), (trimmedLength5 ^ 11) + ((trimmedLength5 & 11) << 1), objArr163);
                                                    java.lang.String[] strArr39 = {str104, (java.lang.String) objArr163[0]};
                                                    char c31 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int doubleTapTimeout3 = android.view.ViewConfiguration.getDoubleTapTimeout();
                                                    int i584 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                    f(c31, 1294 - (~(doubleTapTimeout3 >> 16)), (i584 & 19) + (i584 | 19), objArr164);
                                                    java.lang.String str105 = (java.lang.String) objArr164[0];
                                                    java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                    f((char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1315 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 5 - (~android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr165);
                                                    java.lang.String[] strArr40 = {str105, (java.lang.String) objArr165[0]};
                                                    int i585 = -android.view.MotionEvent.axisFromString(str75);
                                                    char c32 = (char) ((~i585) + (i585 << 1));
                                                    int i586 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                    f(c32, (i586 & 1319) + (i586 | 1319), 18 - (~(-android.text.TextUtils.getTrimmedLength(str75))), objArr166);
                                                    java.lang.String[] strArr41 = {(java.lang.String) objArr166[0]};
                                                    int i587 = -(-android.view.View.combineMeasuredStates(0, 0));
                                                    int i588 = -android.view.View.MeasureSpec.getMode(0);
                                                    int red2 = android.graphics.Color.red(0);
                                                    java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                    f((char) (((58647 | i587) << 1) - (i587 ^ 58647)), (i588 ^ 1338) + ((i588 & 1338) << 1), (red2 & 16) + (red2 | 16), objArr167);
                                                    java.lang.String[] strArr42 = {(java.lang.String) objArr167[0]};
                                                    int i589 = -android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    int i590 = -(-android.view.View.resolveSize(0, 0));
                                                    java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                    f((char) ((34151 ^ i589) + ((i589 & 34151) << 1)), (i590 ^ 1354) + ((i590 & 1354) << 1), 17 - (~(-android.os.Process.getGidForName(str75))), objArr168);
                                                    java.lang.String[] strArr43 = {(java.lang.String) objArr168[0]};
                                                    char longPressTimeout4 = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                                    int i591 = -android.text.TextUtils.getOffsetBefore(str75, 0);
                                                    int i592 = -android.text.TextUtils.indexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                    f(longPressTimeout4, 1372 - (~i591), (i592 ^ 18) + ((i592 & 18) << 1), objArr169);
                                                    java.lang.String[] strArr44 = {(java.lang.String) objArr169[0]};
                                                    char c33 = (char) (30851 - (~android.view.View.getDefaultSize(0, 0)));
                                                    int i593 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int i594 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                    java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                    f(c33, (i593 & 1393) + (i593 | 1393), (i594 ^ (-25)) + ((i594 & (-25)) << 1), objArr170);
                                                    java.lang.String[] strArr45 = {(java.lang.String) objArr170[0]};
                                                    char indexOf15 = (char) android.text.TextUtils.indexOf(str75, str75);
                                                    int i595 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                    java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                    f(indexOf15, (i595 & 1415) + (i595 | 1415), 21 - android.view.View.combineMeasuredStates(0, 0), objArr171);
                                                    java.lang.String[] strArr46 = {(java.lang.String) objArr171[0]};
                                                    char edgeSlop5 = (char) (61451 - (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                    int i596 = -(-android.widget.ExpandableListView.getPackedPositionChild(0L));
                                                    int i597 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                    f(edgeSlop5, (i596 ^ 1437) + ((i596 & 1437) << 1), (i597 ^ 24) + ((i597 & 24) << 1), objArr172);
                                                    java.lang.String str106 = str;
                                                    java.lang.String[] strArr47 = {(java.lang.String) objArr172[0], str106};
                                                    int lastIndexOf8 = android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    int i598 = -android.view.View.combineMeasuredStates(0, 0);
                                                    java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                    f((char) ((lastIndexOf8 & 23489) + (lastIndexOf8 | 23489)), (i598 & 1460) + (i598 | 1460), 28 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr173);
                                                    java.lang.String[] strArr48 = {(java.lang.String) objArr173[0], str106};
                                                    char indexOf16 = (char) android.text.TextUtils.indexOf(str75, str75, 0);
                                                    int longPressTimeout5 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                                    int b61 = com.facetec.sdk.aw.a.b();
                                                    int i599 = (longPressTimeout5 * 829) + 1233552;
                                                    int i600 = ~longPressTimeout5;
                                                    int i601 = ~((i600 ^ (-1489)) | (i600 & (-1489)));
                                                    int i602 = ~b61;
                                                    int i603 = (i602 ^ longPressTimeout5) | (i602 & longPressTimeout5);
                                                    int i604 = ~((i603 ^ 1488) | (i603 & 1488));
                                                    int i605 = -(-(((i601 ^ i604) | (i601 & i604)) * (-828)));
                                                    int i606 = (i599 ^ i605) + ((i599 & i605) << 1);
                                                    int i607 = (longPressTimeout5 ^ 1488) | (longPressTimeout5 & 1488);
                                                    int i608 = -(-(((i602 ^ i607) | (i602 & i607)) * (-828)));
                                                    int i609 = -(-((~i607) * 828));
                                                    int i610 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                    f(indexOf16, (((i606 ^ i608) + ((i608 & i606) << 1)) - (~i609)) - 1, (i610 & 27) + (i610 | 27), objArr174);
                                                    java.lang.String[] strArr49 = {(java.lang.String) objArr174[0], str106};
                                                    int i611 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int i612 = (i611 * 868) + 48431796;
                                                    int i613 = ~i611;
                                                    int i614 = -(-(((~((i613 ^ i17) | (i613 & i17))) | (~(((-55798) ^ i17) | ((-55798) & i17)))) * (-867)));
                                                    int i615 = ((i612 | i614) << 1) - (i612 ^ i614);
                                                    int i616 = (-55798) | i613;
                                                    int i617 = ~i616;
                                                    int i618 = ~((i613 & i6) | (i613 ^ i6));
                                                    int i619 = -(-(((i617 ^ i618) | (i617 & i618) | (~(((-55798) ^ i6) | ((-55798) & i6)))) * (-1734)));
                                                    int i620 = ((i615 | i619) << 1) - (i619 ^ i615);
                                                    int i621 = (i613 ^ 55797) | (55797 & i613);
                                                    int i622 = (~((i616 ^ i17) | (i616 & i17))) | (~((i621 ^ i6) | (i621 & i6)));
                                                    int i623 = (i611 ^ (-55798)) | ((-55798) & i611);
                                                    int i624 = ~((i623 ^ i6) | (i623 & i6));
                                                    int i625 = ((i624 ^ i622) | (i624 & i622)) * 867;
                                                    char c34 = (char) ((i620 & i625) + (i625 | i620));
                                                    int axisFromString = android.view.MotionEvent.axisFromString(str75);
                                                    int i626 = axisFromString * 881;
                                                    int i627 = ((1335596 | i626) << 1) - (i626 ^ 1335596);
                                                    int i628 = ~axisFromString;
                                                    int i629 = ~((i628 ^ (-1517)) | (i628 & (-1517)));
                                                    int i630 = ~((i628 & i6) | (i628 ^ i6));
                                                    int i631 = (i629 ^ i630) | (i629 & i630);
                                                    int i632 = ~((i6 ^ (-1517)) | (i6 & (-1517)));
                                                    int i633 = ((i631 ^ i632) | (i631 & i632)) * (-880);
                                                    int i634 = (i627 ^ i633) + ((i627 & i633) << 1);
                                                    int i635 = ~((i628 ^ i17) | (i628 & i17));
                                                    int i636 = ((i635 ^ 1516) | (i635 & 1516) | (~(axisFromString | i6))) * (-880);
                                                    int i637 = (i634 ^ i636) + ((i636 & i634) << 1);
                                                    int i638 = -(-((~((axisFromString ^ i6) | (axisFromString & i6))) * 880));
                                                    int i639 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                    f(c34, (i637 ^ i638) + ((i638 & i637) << 1), ((i639 | 31) << 1) - (i639 ^ 31), objArr175);
                                                    java.lang.String[] strArr50 = {(java.lang.String) objArr175[0], str106};
                                                    char size2 = (char) android.view.View.MeasureSpec.getSize(0);
                                                    int i640 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    int i641 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                    java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                    f(size2, ((i640 | 1546) << 1) - (i640 ^ 1546), (i641 & 26) + (i641 | 26), objArr176);
                                                    java.lang.String[] strArr51 = {(java.lang.String) objArr176[0], str106};
                                                    char offsetBefore4 = (char) (android.text.TextUtils.getOffsetBefore(str75, 0) + 20901);
                                                    int i642 = -(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                    java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                    f(offsetBefore4, (i642 & 1573) + (i642 | 1573), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 32, objArr177);
                                                    java.lang.String[][] strArr52 = {strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, strArr47, strArr48, strArr49, strArr50, strArr51, new java.lang.String[]{(java.lang.String) objArr177[0], str106}};
                                                    int i643 = -(-android.text.TextUtils.lastIndexOf(str75, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                    int i644 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
                                                    int i645 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                    f((char) ((i643 ^ 5494) + ((i643 & 5494) << 1)), (i644 ^ 1605) + ((i644 & 1605) << 1), (i645 ^ 1) + ((i645 & 1) << 1), objArr178);
                                                    int i646 = 0;
                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder((java.lang.String) objArr178[0]);
                                                    int i647 = i6;
                                                    int i648 = 0;
                                                    int i649 = 0;
                                                    while (i648 < 24) {
                                                        java.lang.String[] strArr53 = strArr52[i648];
                                                        java.lang.Object[] objArr179 = {strArr53[i646]};
                                                        java.lang.Object d27 = com.facetec.sdk.al.d(1590238701);
                                                        if (d27 == null) {
                                                            char defaultSize7 = (char) android.view.View.getDefaultSize(i646, i646);
                                                            int edgeSlop6 = android.view.ViewConfiguration.getEdgeSlop();
                                                            int defaultSize8 = android.view.View.getDefaultSize(i646, i646);
                                                            strArr4 = strArr52;
                                                            byte b62 = (byte) i646;
                                                            byte b63 = (byte) (b62 - 1);
                                                            str8 = str75;
                                                            sb = sb2;
                                                            i36 = i647;
                                                            java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                            g(b62, b63, (byte) (b63 + 1), objArr180);
                                                            d27 = com.facetec.sdk.al.c(defaultSize7, (edgeSlop6 >> 16) + 2078, 24 - defaultSize8, -114923755, false, (java.lang.String) objArr180[0], new java.lang.Class[]{java.lang.String.class});
                                                        } else {
                                                            strArr4 = strArr52;
                                                            str8 = str75;
                                                            sb = sb2;
                                                            i36 = i647;
                                                        }
                                                        java.lang.String str107 = (java.lang.String) ((java.lang.reflect.Method) d27).invoke(null, objArr179);
                                                        java.lang.String[] strArr54 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr53, 1, strArr53.length);
                                                        if (str107 != null && str107.length() != 0) {
                                                            if (strArr53.length != 1) {
                                                                java.lang.Object[] objArr181 = {str107, strArr54};
                                                                java.lang.Object d28 = com.facetec.sdk.al.d(-1033567267);
                                                                if (d28 == null) {
                                                                    char packedPositionType = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                                                                    float scrollFriction2 = android.view.ViewConfiguration.getScrollFriction();
                                                                    int argb5 = android.graphics.Color.argb(0, 0, 0, 0);
                                                                    byte b64 = (byte) ($$b & 1);
                                                                    byte b65 = (byte) (-b64);
                                                                    str9 = str107;
                                                                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                                    g(b64, b65, (byte) (b65 + 1), objArr182);
                                                                    d28 = com.facetec.sdk.al.c(packedPositionType, (scrollFriction2 > 0.0f ? 1 : (scrollFriction2 == 0.0f ? 0 : -1)) + 661, 23 - argb5, 1703573797, false, (java.lang.String) objArr182[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                                                } else {
                                                                    str9 = str107;
                                                                }
                                                                long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) d28).invoke(null, objArr181)).longValue();
                                                                long j109 = 533440789;
                                                                strArr5 = strArr53;
                                                                long j110 = -406;
                                                                long j111 = longValue18 ^ j4;
                                                                long j112 = (lib.android.paypal.com.magnessdk.g.e * j109) + (407 * longValue18) + ((((j111 | j2) ^ j4) | (((j40 | j109) | longValue18) ^ j4)) * j110) + (j110 * (((j111 | j40) | j109) ^ j4)) + (406 * (((j40 | longValue18) ^ j4) | (((j109 ^ j4) | j2) ^ j4))) + 89488469;
                                                                int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                                int i650 = ((int) (j112 >> 32)) & ((((~((-425116411) | maxMemory)) | 621105226) * 398) + 1759347186 + (((~((~maxMemory) | (-425116411))) | 621105226) * 398));
                                                                int i651 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                                int i652 = ((int) j112) & (((~(1783617101 | i651)) * (-301)) + 592813852 + (((~((~i651) | 1610995209)) | (~((-1246745677) | i651))) * (-301)) + (((~(i651 | (-1610995210))) | (-1246745677)) * 301));
                                                            } else {
                                                                str9 = str107;
                                                                strArr5 = strArr53;
                                                            }
                                                            int i653 = i648 + 10;
                                                            i647 = ((~i653) & i6) | (i653 & i17);
                                                            i649++;
                                                            if (i649 > 1) {
                                                                char c35 = (char) ((-((byte) android.view.KeyEvent.getModifierMetaStateMask())) - 1);
                                                                float scrollFriction3 = android.view.ViewConfiguration.getScrollFriction();
                                                                int i654 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                                f(c35, (scrollFriction3 > 0.0f ? 1 : (scrollFriction3 == 0.0f ? 0 : -1)) + 1605, ((i654 | 2) << 1) - (i654 ^ 2), objArr183);
                                                                c3 = 0;
                                                                sb2 = sb;
                                                                sb2.append((java.lang.String) objArr183[0]);
                                                            } else {
                                                                sb2 = sb;
                                                                c3 = 0;
                                                            }
                                                            sb2.append(strArr5[c3]);
                                                            int i655 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                            int i656 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                                            java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                            f((char) ((i655 & 933) + (i655 | 933)), (i656 & 1609) + (i656 | 1609), -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr184);
                                                            sb2.append((java.lang.String) objArr184[0]);
                                                            sb2.append(str9);
                                                            i648 = ((i648 ^ 48) + ((i648 & 48) << 1)) - 47;
                                                            strArr52 = strArr4;
                                                            str75 = str8;
                                                            i646 = 0;
                                                        }
                                                        sb2 = sb;
                                                        i647 = i36;
                                                        i648 = ((i648 ^ 48) + ((i648 & 48) << 1)) - 47;
                                                        strArr52 = strArr4;
                                                        str75 = str8;
                                                        i646 = 0;
                                                    }
                                                    str44 = str75;
                                                    int i657 = i646;
                                                    int i658 = i647;
                                                    char green2 = (char) android.graphics.Color.green(i657);
                                                    int resolveOpacity3 = android.graphics.drawable.Drawable.resolveOpacity(i657, i657);
                                                    java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                    f(green2, (resolveOpacity3 & 1609) + (resolveOpacity3 | 1609), 1 - (android.os.Process.myTid() >> 22), objArr185);
                                                    sb2.append((java.lang.String) objArr185[i657]);
                                                    java.lang.Object[] objArr186 = new java.lang.Object[2];
                                                    if (i649 > 2) {
                                                        objArr186[1] = new int[1];
                                                        java.lang.String[] strArr55 = {sb2.toString()};
                                                        ((int[]) objArr186[1])[i657] = i658;
                                                        objArr186[i657] = strArr55;
                                                    } else {
                                                        int[] iArr = new int[1];
                                                        objArr186[1] = iArr;
                                                        iArr[i657] = i6;
                                                        objArr186[i657] = null;
                                                    }
                                                    int i659 = ((int[]) objArr186[1])[i657];
                                                    int i660 = i6 ^ i275;
                                                    int i661 = -i660;
                                                    int i662 = ((i660 ^ i661) | (i660 & i661)) >> 31;
                                                    int i663 = i659 & (~i662);
                                                    int i664 = i275 & i662;
                                                    strArr3 = (java.lang.String[]) objArr186[0];
                                                    i275 = (i664 ^ i663) | (i663 & i664);
                                                    int minimumFlingVelocity3 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                    int b402 = com.facetec.sdk.aw.a.b();
                                                    int i2812 = minimumFlingVelocity3 * (-381);
                                                    int i2822 = ((3926784 | i2812) << 1) - (i2812 ^ 3926784);
                                                    int i2832 = ~minimumFlingVelocity3;
                                                    int i2842 = i2832 * (-191);
                                                    int i2852 = (i2822 ^ i2842) + ((i2822 & i2842) << 1);
                                                    int i2862 = ~((b402 ^ 20452) | (b402 & 20452));
                                                    int i2872 = ((minimumFlingVelocity3 ^ i2862) | (minimumFlingVelocity3 & i2862)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                                                    int i2882 = ((i2852 | i2872) << 1) - (i2872 ^ i2852);
                                                    int i2892 = ~((i2832 ^ 20452) | (i2832 & 20452));
                                                    int i2902 = ~b402;
                                                    int i2912 = ~((i2902 ^ 20452) | (i2902 & 20452));
                                                    int i2922 = -(-(((i2892 ^ i2912) | (i2892 & i2912)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                                    char c162 = (char) ((i2882 & i2922) + (i2922 | i2882));
                                                    int i2932 = -android.view.MotionEvent.axisFromString(str44);
                                                    java.lang.String str452 = str44;
                                                    int i2942 = -android.text.TextUtils.lastIndexOf(str452, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    java.lang.Object[] objArr742 = new java.lang.Object[1];
                                                    f(c162, (i2932 ^ 890) + ((i2932 & 890) << 1), ((i2942 | 15) << 1) - (i2942 ^ 15), objArr742);
                                                    java.lang.Object[] objArr752 = {(java.lang.String) objArr742[0]};
                                                    d9 = com.facetec.sdk.al.d(1590238701);
                                                    if (d9 != null) {
                                                    }
                                                    invoke = ((java.lang.reflect.Method) d9).invoke(null, objArr752);
                                                    if (invoke != null) {
                                                    }
                                                    if (i38 != 1986687685) {
                                                    }
                                                    i39 = i17;
                                                    str10 = str452;
                                                    i32 = i6;
                                                    i40 = i37;
                                                    int i40522 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                    int i40622 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                    int i40722 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr10322 = new java.lang.Object[1];
                                                    f((char) (((54064 | i40522) << 1) - (i40522 ^ 54064)), (i40622 ^ 1952) + ((i40622 & 1952) << 1), (i40722 ^ 12) + ((i40722 & 12) << 1), objArr10322);
                                                    java.lang.String str6522 = (java.lang.String) objArr10322[0];
                                                    int i40822 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                    int i40922 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                    int i41022 = -android.view.MotionEvent.axisFromString(str10);
                                                    java.lang.Object[] objArr10422 = new java.lang.Object[1];
                                                    f((char) ((51455 ^ i40822) + ((i40822 & 51455) << 1)), (i40922 ^ 1965) + ((i40922 & 1965) << 1), ((i41022 | 4) << 1) - (4 ^ i41022), objArr10422);
                                                    java.lang.String[] strArr2222 = {str6522, (java.lang.String) objArr10422[0]};
                                                    char longPressTimeout322 = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                                    int i41122 = -(-android.os.Process.getGidForName(str10));
                                                    str11 = str10;
                                                    java.lang.Object[] objArr10522 = new java.lang.Object[1];
                                                    f(longPressTimeout322, ((i41122 | 1971) << 1) - (i41122 ^ 1971), 14 - (~(-android.text.TextUtils.indexOf(str11, str11))), objArr10522);
                                                    java.lang.String str6622 = (java.lang.String) objArr10522[0];
                                                    char c2022 = (char) ((-2) - (~(-((byte) android.view.KeyEvent.getModifierMetaStateMask()))));
                                                    int i41222 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                    int i41322 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                    java.lang.Object[] objArr10622 = new java.lang.Object[1];
                                                    f(c2022, (i41222 ^ 1985) + ((i41222 & 1985) << 1), (i41322 ^ 19) + ((i41322 & 19) << 1), objArr10622);
                                                    java.lang.String str6722 = (java.lang.String) objArr10622[0];
                                                    int i41422 = -android.graphics.Color.rgb(0, 0, 0);
                                                    java.lang.Object[] objArr10722 = new java.lang.Object[1];
                                                    f((char) (((-16712004) ^ i41422) + ((i41422 & (-16712004)) << 1)), 2003 - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), android.view.View.MeasureSpec.getSize(0) + 14, objArr10722);
                                                    java.lang.String[] strArr2322 = {str6622, str6722, (java.lang.String) objArr10722[0]};
                                                    char maximumDrawingCacheSize522 = (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int i41522 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                    java.lang.Object[] objArr10822 = new java.lang.Object[1];
                                                    f(maximumDrawingCacheSize522, (i41522 ^ 2018) + ((i41522 & 2018) << 1), 21 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr10822);
                                                    java.lang.String str6822 = (java.lang.String) objArr10822[0];
                                                    char keyRepeatTimeout322 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int i41622 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                    int i41722 = -android.graphics.Color.green(0);
                                                    int b5322 = com.facetec.sdk.aw.a.b();
                                                    int i41822 = (i41722 * (-574)) - 5740;
                                                    int i41922 = ~i41722;
                                                    int i42022 = ~b5322;
                                                    int i42122 = ~(b5322 | (-11));
                                                    long j9722 = j4;
                                                    int i42222 = -(-(((~(i41922 | i42022)) | i42122) * 1150));
                                                    int i42322 = ~((i42022 ^ 10) | (i42022 & 10));
                                                    int i42422 = (((i41822 & i42222) + (i42222 | i41822)) - (~(-(-(((i42122 ^ i42322) | (i42322 & i42122)) * (-575)))))) - 1;
                                                    int i42522 = ~((i41922 ^ b5322) | (b5322 & i41922));
                                                    int i42622 = ~((i41722 ^ i42022) | (i41722 & i42022));
                                                    int i42722 = -(-(((i42622 ^ i42522) | (i42622 & i42522)) * 575));
                                                    java.lang.Object[] objArr10922 = new java.lang.Object[1];
                                                    f(keyRepeatTimeout322, ((i41622 | 2039) << 1) - (i41622 ^ 2039), (i42422 ^ i42722) + ((i42722 & i42422) << 1), objArr10922);
                                                    java.lang.String[] strArr2422 = {str6822, (java.lang.String) objArr10922[0]};
                                                    int i42822 = -(android.os.Process.myTid() >> 22);
                                                    java.lang.Object[] objArr11022 = new java.lang.Object[1];
                                                    f((char) ((45523 ^ i42822) + ((i42822 & 45523) << 1)), 2047 - (~(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 16777226 - (~(-(-android.graphics.Color.rgb(0, 0, 0)))), objArr11022);
                                                    java.lang.String str6922 = (java.lang.String) objArr11022[0];
                                                    char myPid522 = (char) ((android.os.Process.myPid() >> 22) + 53525);
                                                    int i42922 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    java.lang.Object[] objArr11122 = new java.lang.Object[1];
                                                    f(myPid522, ((i42922 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED) << 1) - (i42922 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6, objArr11122);
                                                    java.lang.String[] strArr2522 = {str6922, (java.lang.String) objArr11122[0]};
                                                    int i43022 = -android.graphics.Color.rgb(0, 0, 0);
                                                    java.lang.Object[] objArr11222 = new java.lang.Object[1];
                                                    f((char) ((((-16720776) | i43022) << 1) - (i43022 ^ (-16720776))), 2060 - (~android.os.Process.getGidForName(str11)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 28, objArr11222);
                                                    java.lang.String str7022 = (java.lang.String) objArr11222[0];
                                                    char doubleTapTimeout22 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int trimmedLength322 = android.text.TextUtils.getTrimmedLength(str11);
                                                    int i43122 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                    java.lang.Object[] objArr11322 = new java.lang.Object[1];
                                                    f(doubleTapTimeout22, ((trimmedLength322 | 2039) << 1) - (trimmedLength322 ^ 2039), (i43122 ^ 10) + ((i43122 & 10) << 1), objArr11322);
                                                    java.lang.String[][] strArr2622 = {strArr2222, strArr2322, strArr2422, strArr2522, new java.lang.String[]{str7022, (java.lang.String) objArr11322[0]}};
                                                    int i43222 = -1;
                                                    i41 = 0;
                                                    loop7: while (true) {
                                                        if (i41 >= 5) {
                                                        }
                                                        i41++;
                                                    }
                                                    int i44022 = ((~i40) & i32) | (i40 & i39);
                                                    int i44122 = (i44022 | (-i44022)) >> 31;
                                                    int i44222 = i42 & (~i44122);
                                                    int i44322 = i40 & i44122;
                                                    int i44422 = (i44222 ^ i44322) | (i44322 & i44222);
                                                    char edgeSlop322 = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                    int i44522 = -(android.os.Process.myPid() >> 22);
                                                    int mode722 = android.view.View.MeasureSpec.getMode(0);
                                                    java.lang.Object[] objArr11522 = new java.lang.Object[1];
                                                    f(edgeSlop322, 2087 - (~i44522), (mode722 & 13) + (mode722 | 13), objArr11522);
                                                    java.lang.String str7322 = (java.lang.String) objArr11522[0];
                                                    int indexOf1222 = android.text.TextUtils.indexOf(str11, str11, 0, 0);
                                                    int combineMeasuredStates322 = android.view.View.combineMeasuredStates(0, 0);
                                                    int b5422 = com.facetec.sdk.aw.a.b();
                                                    int i44622 = combineMeasuredStates322 * (-464);
                                                    int i44722 = ~combineMeasuredStates322;
                                                    int i44822 = ~((b5422 ^ 2101) | (b5422 & 2101));
                                                    int i44922 = ((((-1951829) & i44622) + (i44622 | (-1951829))) - (~(-(-(((i44722 & i44822) | (i44822 ^ i44722)) * (-465)))))) - 1;
                                                    int i45022 = ~((i44722 ^ b5422) | (i44722 & b5422));
                                                    int i45122 = -(-(((i45022 ^ 2101) | (i45022 & 2101)) * 930));
                                                    int i45222 = ((i44922 | i45122) << 1) - (i45122 ^ i44922);
                                                    int i45322 = b5422 | 2101;
                                                    int i45422 = -(-(((i45322 ^ i44722) | (i45322 & i44722)) * 465));
                                                    java.lang.Object[] objArr11622 = new java.lang.Object[1];
                                                    f((char) ((62287 & indexOf1222) + (indexOf1222 | 62287)), (i45222 ^ i45422) + ((i45422 & i45222) << 1), 8 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11622);
                                                } else {
                                                    i31 = i17;
                                                    i32 = i6;
                                                    i33 = i268;
                                                    strArr2 = null;
                                                }
                                                int i4712 = i32 ^ i33;
                                                int i4722 = -i4712;
                                                int i4732 = (((i4712 ^ i4722) | (i4712 & i4722)) >> 31) & 16;
                                                java.lang.Object[] objArr1222 = {new int[]{(i480 & (~i481)) | i482}, strArr2, new int[]{i33}, new int[]{i32}};
                                                int i4742 = ~(863289411 | i32);
                                                int i4752 = ((1140990480 | i4742) * (-814)) + 1256594921 + ((i4742 | (~(i31 | (-1165386323))) | 838893569) * 407) + (((~(i32 | 1165386322)) | (~((-863289412) | i32)) | 838893569) * 407);
                                                int i4762 = ((i4752 | i4732) << 1) - (i4732 ^ i4752);
                                                int i4772 = (i3 ^ i4762) + ((i3 & i4762) << 1);
                                                int i4782 = i4772 << 13;
                                                int i4792 = (~(i4772 & i4782)) & (i4782 | i4772);
                                                int i4802 = i4792 ^ (i4792 >>> 17);
                                                int i4812 = i4802 << 5;
                                                int i4822 = (~i4802) & i4812;
                                                return objArr1222;
                                            }
                                        }
                                        int i665 = -android.graphics.Color.argb(0, 0, 0, 0);
                                        int capsMode = android.text.TextUtils.getCapsMode(str5, 0, 0);
                                        int i666 = -android.os.Process.getGidForName(str5);
                                        java.lang.Object[] objArr187 = new java.lang.Object[1];
                                        f((char) ((i665 ^ 12358) + ((i665 & 12358) << 1)), 595 - capsMode, ((i666 | 12) << 1) - (i666 ^ 12), objArr187);
                                        java.lang.String str108 = (java.lang.String) objArr187[0];
                                        int i667 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i668 = -(android.os.Process.myTid() >> 22);
                                        java.lang.Object[] objArr188 = new java.lang.Object[1];
                                        f((char) ((i667 ^ 1) + ((i667 & 1) << 1)), ((i668 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH) << 1) - (i668 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH), 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr188);
                                        java.lang.Object[] objArr189 = {str108, (java.lang.String) objArr188[0]};
                                        d7 = com.facetec.sdk.al.d(-100890377);
                                        if (d7 == null) {
                                            char combineMeasuredStates5 = (char) (android.view.View.combineMeasuredStates(0, 0) + 23780);
                                            long uptimeMillis5 = android.os.SystemClock.uptimeMillis();
                                            int rgb4 = android.graphics.Color.rgb(0, 0, 0);
                                            byte b66 = (byte) ($$b >>> 2);
                                            byte b67 = (byte) (b66 - 4);
                                            java.lang.Object[] objArr190 = new java.lang.Object[1];
                                            g(b66, b67, (byte) (b67 + 1), objArr190);
                                            d7 = com.facetec.sdk.al.c(combineMeasuredStates5, 1365 - (uptimeMillis5 > 0L ? 1 : (uptimeMillis5 == 0L ? 0 : -1)), rgb4 + 16777240, 1578365455, false, (java.lang.String) objArr190[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                                        }
                                        long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr189)).longValue();
                                        long j113 = -633018571;
                                        long j114 = -712;
                                        long j115 = longValue19 ^ j32;
                                        str6 = str5;
                                        long elapsedRealtime8 = (int) android.os.SystemClock.elapsedRealtime();
                                        long j116 = elapsedRealtime8 ^ j32;
                                        long j117 = (j116 | j113) ^ j32;
                                        long j118 = ((((((-711) * j113) + (713 * longValue19)) + ((((j115 | j113) ^ j32) | j117) * j114)) + (j114 * (((elapsedRealtime8 | (longValue19 | j113)) ^ j32) | (((j115 | j116) | j113) ^ j32)))) + (712 * (j115 | j117))) - 1387045576;
                                        i23 = ((int) (j118 >> 32)) & (((~(1298027518 | i17)) * 52) + 1455957074 + (((~(140264428 | i17)) | (~((-1296961983) | i17)) | 1157763090) * (-52)) + (((~((-140264429) | i17)) | 1065536) * 52));
                                        int myTid4 = android.os.Process.myTid();
                                        int i669 = ~myTid4;
                                        i24 = ((int) j118) & ((((~((-216674089) | i669)) | 1653900498) * (-865)) + 1702088048 + ((~(myTid4 | 216674088)) * 865) + (((~(1653900498 | i669)) | (~(i669 | 216674088))) * 865));
                                        if (((i23 ^ i24) | (i23 & i24)) != 0) {
                                            i25 = i6;
                                            int i2132 = ((~i207) & i6) | (i207 & i17);
                                            int i2142 = -i2132;
                                            int i2152 = ((i2132 ^ i2142) | (i2132 & i2142)) >> 31;
                                            int i2162 = i25 & (~i2152);
                                            int i2172 = i207 & i2152;
                                            int i2182 = (i2172 ^ i2162) | (i2172 & i2162);
                                            if ((i2 & 8) == 0) {
                                            }
                                            char blue3 = (char) android.graphics.Color.blue(0);
                                            java.lang.String str422 = str7;
                                            int i2432 = -(-android.text.TextUtils.indexOf(str422, str422, 0, 0));
                                            int i2442 = -android.text.TextUtils.lastIndexOf(str422, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            java.lang.Object[] objArr622 = new java.lang.Object[1];
                                            f(blue3, 738 - (~i2432), ((i2442 | 40) << 1) - (i2442 ^ 40), objArr622);
                                            java.lang.String str432 = (java.lang.String) objArr622[0];
                                            int i2452 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            int i2462 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                            int i2472 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                            int b302 = com.facetec.sdk.aw.a.b();
                                            int i2482 = i2472 * com.knotapi.knot.utilities.Constants.ID_KROGER;
                                            int i2492 = (i2472 ^ 30) | (i2472 & 30);
                                            int i2502 = ~b302;
                                            int i2512 = (((i2482 | 11100) << 1) - (i2482 ^ 11100)) + (((i2492 & i2502) | (i2492 ^ i2502)) * (-369));
                                            int i2522 = ~i2472;
                                            int i2532 = ~(i2522 | i2502);
                                            int i2542 = ((i2532 ^ 30) | (i2532 & 30)) * (-369);
                                            int i2552 = ~(i2472 | (-31));
                                            int i2562 = ~(i2472 | b302);
                                            int i2572 = (i2562 ^ i2552) | (i2562 & i2552);
                                            int i2582 = ~((i2522 & i2502) | (i2522 ^ i2502) | 30);
                                            java.lang.Object[] objArr632 = new java.lang.Object[1];
                                            f((char) (((36815 | i2452) << 1) - (i2452 ^ 36815)), (i2462 ^ 780) + ((i2462 & 780) << 1), (i2512 & i2542) + (i2542 | i2512) + (((i2572 ^ i2582) | (i2582 & i2572)) * 369), objArr632);
                                            java.lang.String[] strArr202 = {str432, (java.lang.String) objArr632[0]};
                                            i28 = 0;
                                            while (true) {
                                                if (i28 >= 2) {
                                                }
                                                i28++;
                                            }
                                            int i2632 = (~(i6 & i2182)) & (i6 | i2182);
                                            int i2642 = -i2632;
                                            int i2652 = ((i2632 ^ i2642) | (i2632 & i2642)) >> 31;
                                            int i2662 = i29 & (~i2652);
                                            int i2672 = i2182 & i2652;
                                            int i2682 = (i2672 ^ i2662) | (i2672 & i2662);
                                            d8 = com.facetec.sdk.al.d(-1270134912);
                                            if (d8 == null) {
                                            }
                                            long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) d8).invoke(null, null)).longValue();
                                            long j612 = 279004390;
                                            long j622 = -494;
                                            long j632 = 495;
                                            long nextInt22 = (new java.util.Random().nextInt(2028894808) ^ j32) | j612;
                                            j3 = (((((j622 * j612) + (j622 * longValue102)) + ((-495) * ((j612 | longValue102) ^ j32))) + (j632 * nextInt22)) + (j632 * ((nextInt22 ^ j32) | (((longValue102 ^ j32) | (j612 ^ j32)) ^ j32)))) - 2103926883;
                                            myUid = android.os.Process.myUid();
                                            i30 = ~myUid;
                                            if (((((int) j3) & ((((~(1138086490 | i6)) | 606733729) * (-140)) + 617821275 + ((~(1744820219 | i6)) * 70) + (((~(1719654395 | i6)) | 631899553) * 70))) | (((int) (j3 >> 32)) & ((((~((-1443673294) | myUid)) | (~((-6441763) | i30))) * (-406)) + 1775498314 + ((~(i30 | (-5121))) * (-406)) + (((~(myUid | 6446882)) | (~(i30 | 1443673293))) * 406)))) != 1) {
                                            }
                                            int i47122 = i32 ^ i33;
                                            int i47222 = -i47122;
                                            int i47322 = (((i47122 ^ i47222) | (i47122 & i47222)) >> 31) & 16;
                                            java.lang.Object[] objArr12222 = {new int[]{(i4802 & (~i4812)) | i4822}, strArr2, new int[]{i33}, new int[]{i32}};
                                            int i47422 = ~(863289411 | i32);
                                            int i47522 = ((1140990480 | i47422) * (-814)) + 1256594921 + ((i47422 | (~(i31 | (-1165386323))) | 838893569) * 407) + (((~(i32 | 1165386322)) | (~((-863289412) | i32)) | 838893569) * 407);
                                            int i47622 = ((i47522 | i47322) << 1) - (i47322 ^ i47522);
                                            int i47722 = (i3 ^ i47622) + ((i3 & i47622) << 1);
                                            int i47822 = i47722 << 13;
                                            int i47922 = (~(i47722 & i47822)) & (i47822 | i47722);
                                            int i48022 = i47922 ^ (i47922 >>> 17);
                                            int i48122 = i48022 << 5;
                                            int i48222 = (~i48022) & i48122;
                                            return objArr12222;
                                        }
                                        i26 = i6 & (-262);
                                        i27 = i17 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                        i25 = i26 | i27;
                                        int i21322 = ((~i207) & i6) | (i207 & i17);
                                        int i21422 = -i21322;
                                        int i21522 = ((i21322 ^ i21422) | (i21322 & i21422)) >> 31;
                                        int i21622 = i25 & (~i21522);
                                        int i21722 = i207 & i21522;
                                        int i21822 = (i21722 ^ i21622) | (i21722 & i21622);
                                        if ((i2 & 8) == 0) {
                                        }
                                        char blue32 = (char) android.graphics.Color.blue(0);
                                        java.lang.String str4222 = str7;
                                        int i24322 = -(-android.text.TextUtils.indexOf(str4222, str4222, 0, 0));
                                        int i24422 = -android.text.TextUtils.lastIndexOf(str4222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        java.lang.Object[] objArr6222 = new java.lang.Object[1];
                                        f(blue32, 738 - (~i24322), ((i24422 | 40) << 1) - (i24422 ^ 40), objArr6222);
                                        java.lang.String str4322 = (java.lang.String) objArr6222[0];
                                        int i24522 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        int i24622 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                        int i24722 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                        int b3022 = com.facetec.sdk.aw.a.b();
                                        int i24822 = i24722 * com.knotapi.knot.utilities.Constants.ID_KROGER;
                                        int i24922 = (i24722 ^ 30) | (i24722 & 30);
                                        int i25022 = ~b3022;
                                        int i25122 = (((i24822 | 11100) << 1) - (i24822 ^ 11100)) + (((i24922 & i25022) | (i24922 ^ i25022)) * (-369));
                                        int i25222 = ~i24722;
                                        int i25322 = ~(i25222 | i25022);
                                        int i25422 = ((i25322 ^ 30) | (i25322 & 30)) * (-369);
                                        int i25522 = ~(i24722 | (-31));
                                        int i25622 = ~(i24722 | b3022);
                                        int i25722 = (i25622 ^ i25522) | (i25622 & i25522);
                                        int i25822 = ~((i25222 & i25022) | (i25222 ^ i25022) | 30);
                                        java.lang.Object[] objArr6322 = new java.lang.Object[1];
                                        f((char) (((36815 | i24522) << 1) - (i24522 ^ 36815)), (i24622 ^ 780) + ((i24622 & 780) << 1), (i25122 & i25422) + (i25422 | i25122) + (((i25722 ^ i25822) | (i25822 & i25722)) * 369), objArr6322);
                                        java.lang.String[] strArr2022 = {str4322, (java.lang.String) objArr6322[0]};
                                        i28 = 0;
                                        while (true) {
                                            if (i28 >= 2) {
                                            }
                                            i28++;
                                        }
                                        int i26322 = (~(i6 & i21822)) & (i6 | i21822);
                                        int i26422 = -i26322;
                                        int i26522 = ((i26322 ^ i26422) | (i26322 & i26422)) >> 31;
                                        int i26622 = i29 & (~i26522);
                                        int i26722 = i21822 & i26522;
                                        int i26822 = (i26722 ^ i26622) | (i26722 & i26622);
                                        d8 = com.facetec.sdk.al.d(-1270134912);
                                        if (d8 == null) {
                                        }
                                        long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) d8).invoke(null, null)).longValue();
                                        long j6122 = 279004390;
                                        long j6222 = -494;
                                        long j6322 = 495;
                                        long nextInt222 = (new java.util.Random().nextInt(2028894808) ^ j32) | j6122;
                                        j3 = (((((j6222 * j6122) + (j6222 * longValue1022)) + ((-495) * ((j6122 | longValue1022) ^ j32))) + (j6322 * nextInt222)) + (j6322 * ((nextInt222 ^ j32) | (((longValue1022 ^ j32) | (j6122 ^ j32)) ^ j32)))) - 2103926883;
                                        myUid = android.os.Process.myUid();
                                        i30 = ~myUid;
                                        if (((((int) j3) & ((((~(1138086490 | i6)) | 606733729) * (-140)) + 617821275 + ((~(1744820219 | i6)) * 70) + (((~(1719654395 | i6)) | 631899553) * 70))) | (((int) (j3 >> 32)) & ((((~((-1443673294) | myUid)) | (~((-6441763) | i30))) * (-406)) + 1775498314 + ((~(i30 | (-5121))) * (-406)) + (((~(myUid | 6446882)) | (~(i30 | 1443673293))) * 406)))) != 1) {
                                        }
                                        int i471222 = i32 ^ i33;
                                        int i472222 = -i471222;
                                        int i473222 = (((i471222 ^ i472222) | (i471222 & i472222)) >> 31) & 16;
                                        java.lang.Object[] objArr122222 = {new int[]{(i48022 & (~i48122)) | i48222}, strArr2, new int[]{i33}, new int[]{i32}};
                                        int i474222 = ~(863289411 | i32);
                                        int i475222 = ((1140990480 | i474222) * (-814)) + 1256594921 + ((i474222 | (~(i31 | (-1165386323))) | 838893569) * 407) + (((~(i32 | 1165386322)) | (~((-863289412) | i32)) | 838893569) * 407);
                                        int i476222 = ((i475222 | i473222) << 1) - (i473222 ^ i475222);
                                        int i477222 = (i3 ^ i476222) + ((i3 & i476222) << 1);
                                        int i478222 = i477222 << 13;
                                        int i479222 = (~(i477222 & i478222)) & (i478222 | i477222);
                                        int i480222 = i479222 ^ (i479222 >>> 17);
                                        int i481222 = i480222 << 5;
                                        int i482222 = (~i480222) & i481222;
                                        return objArr122222;
                                    }
                                }
                            }
                            i19 = i6;
                            int i1732 = ((~i168) & i6) | (i168 & i17);
                            int i1742 = (i1732 | (-i1732)) >> 31;
                            int i1752 = i19 & (~i1742);
                            int i1762 = i168 & i1742;
                            int i1772 = (i1762 ^ i1752) | (i1762 & i1752);
                            char keyRepeatTimeout22 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int i1782 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i1792 = -android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            java.lang.Object[] objArr422 = new java.lang.Object[1];
                            f(keyRepeatTimeout22, (i1782 ^ 372) + ((i1782 & 372) << 1), (i1792 & 22) + (i1792 | 22), objArr422);
                            java.lang.Object[] objArr432 = {(java.lang.String) objArr422[0]};
                            d6 = com.facetec.sdk.al.d(1590238701);
                            if (d6 == null) {
                            }
                            java.lang.String lowerCase2 = ((java.lang.String) ((java.lang.reflect.Method) d6).invoke(null, objArr432)).toLowerCase();
                            int i1802 = -android.os.Process.getGidForName(str5);
                            int indexOf52 = android.text.TextUtils.indexOf(str5, str5, 0, 0);
                            int i1812 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                            java.lang.Object[] objArr452 = new java.lang.Object[1];
                            f((char) ((i1802 & 27441) + (i1802 | 27441)), ((indexOf52 | 395) << 1) - (indexOf52 ^ 395), ((i1812 | 4) << 1) - (i1812 ^ 4), objArr452);
                            if (!lowerCase2.contains((java.lang.String) objArr452[0])) {
                            }
                            int i1832 = (~(i6 & i1772)) & (i6 | i1772);
                            int i1842 = -i1832;
                            int i1852 = ((i1832 ^ i1842) | (i1832 & i1842)) >> 31;
                            int i1862 = i182 & (~i1852);
                            int i1872 = i1772 & i1852;
                            int i1882 = (i1872 ^ i1862) | (i1872 & i1862);
                            int i1892 = -android.graphics.Color.rgb(0, 0, 0);
                            int resolveSize32 = android.view.View.resolveSize(0, 0);
                            java.lang.Object[] objArr462 = new java.lang.Object[1];
                            f((char) (((-16777216) ^ i1892) + ((i1892 & (-16777216)) << 1)), ((resolveSize32 | 399) << 1) - (resolveSize32 ^ 399), android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 43, objArr462);
                            java.lang.String str312 = (java.lang.String) objArr462[0];
                            char trimmedLength22 = (char) (1326 - android.text.TextUtils.getTrimmedLength(str5));
                            int i1902 = -android.graphics.Color.argb(0, 0, 0, 0);
                            java.lang.Object[] objArr472 = new java.lang.Object[1];
                            f(trimmedLength22, ((i1902 | 441) << 1) - (i1902 ^ 441), (-16777176) - android.graphics.Color.rgb(0, 0, 0), objArr472);
                            java.lang.String str322 = (java.lang.String) objArr472[0];
                            char tapTimeout22 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                            int i1912 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            int i1922 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            java.lang.Object[] objArr482 = new java.lang.Object[1];
                            f(tapTimeout22, 480 - (~i1912), (i1922 & 27) + (i1922 | 27), objArr482);
                            java.lang.String str332 = (java.lang.String) objArr482[0];
                            int i1932 = -(-android.text.TextUtils.getOffsetAfter(str5, 0));
                            int i1942 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                            int i1952 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                            java.lang.Object[] objArr492 = new java.lang.Object[1];
                            f((char) ((51775 ^ i1932) + ((i1932 & 51775) << 1)), (i1942 ^ androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT) + ((i1942 & androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT) << 1), ((i1952 | 27) << 1) - (i1952 ^ 27), objArr492);
                            java.lang.String str342 = (java.lang.String) objArr492[0];
                            char threadPriority6 = (char) (20119 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                            int i1962 = -android.view.View.resolveSizeAndState(0, 0, 0);
                            int i1972 = -android.view.KeyEvent.getDeadChar(0, 0);
                            java.lang.Object[] objArr502 = new java.lang.Object[1];
                            f(threadPriority6, ((i1962 | 535) << 1) - (i1962 ^ 535), ((i1972 | 27) << 1) - (i1972 ^ 27), objArr502);
                            java.lang.String str352 = (java.lang.String) objArr502[0];
                            char scrollBarFadeDuration42 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i1982 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                            int i1992 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                            java.lang.Object[] objArr512 = new java.lang.Object[1];
                            f(scrollBarFadeDuration42, (i1982 & 562) + (i1982 | 562), (i1992 & 27) + (i1992 | 27), objArr512);
                            java.lang.String[] strArr172 = {str312, str322, str332, str342, str352, (java.lang.String) objArr512[0]};
                            i20 = 0;
                            i21 = 6;
                            while (true) {
                                if (i20 < i21) {
                                }
                                i20 = (i20 ^ 1) + ((i20 & 1) << 1);
                                i21 = 6;
                            }
                            int i2022 = (~(i6 & i1882)) & (i6 | i1882);
                            int i2032 = -i2022;
                            int i2042 = ((i2022 ^ i2032) | (i2022 & i2032)) >> 31;
                            int i2052 = i22 & (~i2042);
                            int i2062 = i1882 & i2042;
                            int i2072 = (i2062 ^ i2052) | (i2062 & i2052);
                            char maximumFlingVelocity2 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int scrollBarSize3 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                            int myPid22 = android.os.Process.myPid() >> 22;
                            java.lang.Object[] objArr542 = new java.lang.Object[1];
                            f(maximumFlingVelocity2, (scrollBarSize3 ^ 347) + ((scrollBarSize3 & 347) << 1), (myPid22 & 17) + (myPid22 | 17), objArr542);
                            java.lang.String str372 = (java.lang.String) objArr542[0];
                            int myTid32 = android.os.Process.myTid() >> 22;
                            java.lang.Object[] objArr552 = new java.lang.Object[1];
                            f((char) ((53525 & myTid32) + (myTid32 | 53525)), 588 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), 6 - (~(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr552);
                            java.lang.String str382 = (java.lang.String) objArr552[0];
                            file2 = new java.io.File(str372);
                            if (file2.exists()) {
                            }
                            int i6652 = -android.graphics.Color.argb(0, 0, 0, 0);
                            int capsMode2 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                            int i6662 = -android.os.Process.getGidForName(str5);
                            java.lang.Object[] objArr1872 = new java.lang.Object[1];
                            f((char) ((i6652 ^ 12358) + ((i6652 & 12358) << 1)), 595 - capsMode2, ((i6662 | 12) << 1) - (i6662 ^ 12), objArr1872);
                            java.lang.String str1082 = (java.lang.String) objArr1872[0];
                            int i6672 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i6682 = -(android.os.Process.myTid() >> 22);
                            java.lang.Object[] objArr1882 = new java.lang.Object[1];
                            f((char) ((i6672 ^ 1) + ((i6672 & 1) << 1)), ((i6682 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH) << 1) - (i6682 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH), 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr1882);
                            java.lang.Object[] objArr1892 = {str1082, (java.lang.String) objArr1882[0]};
                            d7 = com.facetec.sdk.al.d(-100890377);
                            if (d7 == null) {
                            }
                            long longValue192 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr1892)).longValue();
                            long j1132 = -633018571;
                            long j1142 = -712;
                            long j1152 = longValue192 ^ j32;
                            str6 = str5;
                            long elapsedRealtime82 = (int) android.os.SystemClock.elapsedRealtime();
                            long j1162 = elapsedRealtime82 ^ j32;
                            long j1172 = (j1162 | j1132) ^ j32;
                            long j1182 = ((((((-711) * j1132) + (713 * longValue192)) + ((((j1152 | j1132) ^ j32) | j1172) * j1142)) + (j1142 * (((elapsedRealtime82 | (longValue192 | j1132)) ^ j32) | (((j1152 | j1162) | j1132) ^ j32)))) + (712 * (j1152 | j1172))) - 1387045576;
                            i23 = ((int) (j1182 >> 32)) & (((~(1298027518 | i17)) * 52) + 1455957074 + (((~(140264428 | i17)) | (~((-1296961983) | i17)) | 1157763090) * (-52)) + (((~((-140264429) | i17)) | 1065536) * 52));
                            int myTid42 = android.os.Process.myTid();
                            int i6692 = ~myTid42;
                            i24 = ((int) j1182) & ((((~((-216674089) | i6692)) | 1653900498) * (-865)) + 1702088048 + ((~(myTid42 | 216674088)) * 865) + (((~(1653900498 | i6692)) | (~(i6692 | 216674088))) * 865));
                            if (((i23 ^ i24) | (i23 & i24)) != 0) {
                            }
                        } else {
                            i17 = i85;
                        }
                    } else {
                        i17 = i85;
                        str5 = str3;
                    }
                    i18 = i6;
                    int i1652 = ((~i160) & i6) | (i160 & i17);
                    int i1662 = -i1652;
                    int i1672 = ((i1652 ^ i1662) | (i1652 & i1662)) >> 31;
                    int i1682 = (i160 & i1672) | (i18 & (~i1672));
                    java.lang.Object[] objArr392 = new java.lang.Object[1];
                    f((char) android.text.TextUtils.indexOf(str5, str5, 0), 347 - (~android.view.MotionEvent.axisFromString(str5)), 16 - (~(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr392);
                    java.lang.String str292 = (java.lang.String) objArr392[0];
                    int i1692 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i1702 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                    int i1712 = -android.text.TextUtils.getTrimmedLength(str5);
                    java.lang.Object[] objArr402 = new java.lang.Object[1];
                    f((char) (((i1692 | 1) << 1) - (i1692 ^ 1)), (i1702 & 364) + (i1702 | 364), (i1712 & 6) + (i1712 | 6), objArr402);
                    java.lang.String str302 = (java.lang.String) objArr402[0];
                    file = new java.io.File(str292);
                    if (file.exists()) {
                    }
                    i19 = i6;
                    int i17322 = ((~i1682) & i6) | (i1682 & i17);
                    int i17422 = (i17322 | (-i17322)) >> 31;
                    int i17522 = i19 & (~i17422);
                    int i17622 = i1682 & i17422;
                    int i17722 = (i17622 ^ i17522) | (i17622 & i17522);
                    char keyRepeatTimeout222 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i17822 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i17922 = -android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    java.lang.Object[] objArr4222 = new java.lang.Object[1];
                    f(keyRepeatTimeout222, (i17822 ^ 372) + ((i17822 & 372) << 1), (i17922 & 22) + (i17922 | 22), objArr4222);
                    java.lang.Object[] objArr4322 = {(java.lang.String) objArr4222[0]};
                    d6 = com.facetec.sdk.al.d(1590238701);
                    if (d6 == null) {
                    }
                    java.lang.String lowerCase22 = ((java.lang.String) ((java.lang.reflect.Method) d6).invoke(null, objArr4322)).toLowerCase();
                    int i18022 = -android.os.Process.getGidForName(str5);
                    int indexOf522 = android.text.TextUtils.indexOf(str5, str5, 0, 0);
                    int i18122 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                    java.lang.Object[] objArr4522 = new java.lang.Object[1];
                    f((char) ((i18022 & 27441) + (i18022 | 27441)), ((indexOf522 | 395) << 1) - (indexOf522 ^ 395), ((i18122 | 4) << 1) - (i18122 ^ 4), objArr4522);
                    if (!lowerCase22.contains((java.lang.String) objArr4522[0])) {
                    }
                    int i18322 = (~(i6 & i17722)) & (i6 | i17722);
                    int i18422 = -i18322;
                    int i18522 = ((i18322 ^ i18422) | (i18322 & i18422)) >> 31;
                    int i18622 = i182 & (~i18522);
                    int i18722 = i17722 & i18522;
                    int i18822 = (i18722 ^ i18622) | (i18722 & i18622);
                    int i18922 = -android.graphics.Color.rgb(0, 0, 0);
                    int resolveSize322 = android.view.View.resolveSize(0, 0);
                    java.lang.Object[] objArr4622 = new java.lang.Object[1];
                    f((char) (((-16777216) ^ i18922) + ((i18922 & (-16777216)) << 1)), ((resolveSize322 | 399) << 1) - (resolveSize322 ^ 399), android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 43, objArr4622);
                    java.lang.String str3122 = (java.lang.String) objArr4622[0];
                    char trimmedLength222 = (char) (1326 - android.text.TextUtils.getTrimmedLength(str5));
                    int i19022 = -android.graphics.Color.argb(0, 0, 0, 0);
                    java.lang.Object[] objArr4722 = new java.lang.Object[1];
                    f(trimmedLength222, ((i19022 | 441) << 1) - (i19022 ^ 441), (-16777176) - android.graphics.Color.rgb(0, 0, 0), objArr4722);
                    java.lang.String str3222 = (java.lang.String) objArr4722[0];
                    char tapTimeout222 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                    int i19122 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int i19222 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    java.lang.Object[] objArr4822 = new java.lang.Object[1];
                    f(tapTimeout222, 480 - (~i19122), (i19222 & 27) + (i19222 | 27), objArr4822);
                    java.lang.String str3322 = (java.lang.String) objArr4822[0];
                    int i19322 = -(-android.text.TextUtils.getOffsetAfter(str5, 0));
                    int i19422 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                    int i19522 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                    java.lang.Object[] objArr4922 = new java.lang.Object[1];
                    f((char) ((51775 ^ i19322) + ((i19322 & 51775) << 1)), (i19422 ^ androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT) + ((i19422 & androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT) << 1), ((i19522 | 27) << 1) - (i19522 ^ 27), objArr4922);
                    java.lang.String str3422 = (java.lang.String) objArr4922[0];
                    char threadPriority62 = (char) (20119 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                    int i19622 = -android.view.View.resolveSizeAndState(0, 0, 0);
                    int i19722 = -android.view.KeyEvent.getDeadChar(0, 0);
                    java.lang.Object[] objArr5022 = new java.lang.Object[1];
                    f(threadPriority62, ((i19622 | 535) << 1) - (i19622 ^ 535), ((i19722 | 27) << 1) - (i19722 ^ 27), objArr5022);
                    java.lang.String str3522 = (java.lang.String) objArr5022[0];
                    char scrollBarFadeDuration422 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i19822 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    int i19922 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                    java.lang.Object[] objArr5122 = new java.lang.Object[1];
                    f(scrollBarFadeDuration422, (i19822 & 562) + (i19822 | 562), (i19922 & 27) + (i19922 | 27), objArr5122);
                    java.lang.String[] strArr1722 = {str3122, str3222, str3322, str3422, str3522, (java.lang.String) objArr5122[0]};
                    i20 = 0;
                    i21 = 6;
                    while (true) {
                        if (i20 < i21) {
                        }
                        i20 = (i20 ^ 1) + ((i20 & 1) << 1);
                        i21 = 6;
                    }
                    int i20222 = (~(i6 & i18822)) & (i6 | i18822);
                    int i20322 = -i20222;
                    int i20422 = ((i20222 ^ i20322) | (i20222 & i20322)) >> 31;
                    int i20522 = i22 & (~i20422);
                    int i20622 = i18822 & i20422;
                    int i20722 = (i20622 ^ i20522) | (i20622 & i20522);
                    char maximumFlingVelocity22 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int scrollBarSize32 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                    int myPid222 = android.os.Process.myPid() >> 22;
                    java.lang.Object[] objArr5422 = new java.lang.Object[1];
                    f(maximumFlingVelocity22, (scrollBarSize32 ^ 347) + ((scrollBarSize32 & 347) << 1), (myPid222 & 17) + (myPid222 | 17), objArr5422);
                    java.lang.String str3722 = (java.lang.String) objArr5422[0];
                    int myTid322 = android.os.Process.myTid() >> 22;
                    java.lang.Object[] objArr5522 = new java.lang.Object[1];
                    f((char) ((53525 & myTid322) + (myTid322 | 53525)), 588 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), 6 - (~(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr5522);
                    java.lang.String str3822 = (java.lang.String) objArr5522[0];
                    file2 = new java.io.File(str3722);
                    if (file2.exists()) {
                    }
                    int i66522 = -android.graphics.Color.argb(0, 0, 0, 0);
                    int capsMode22 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                    int i66622 = -android.os.Process.getGidForName(str5);
                    java.lang.Object[] objArr18722 = new java.lang.Object[1];
                    f((char) ((i66522 ^ 12358) + ((i66522 & 12358) << 1)), 595 - capsMode22, ((i66622 | 12) << 1) - (i66622 ^ 12), objArr18722);
                    java.lang.String str10822 = (java.lang.String) objArr18722[0];
                    int i66722 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i66822 = -(android.os.Process.myTid() >> 22);
                    java.lang.Object[] objArr18822 = new java.lang.Object[1];
                    f((char) ((i66722 ^ 1) + ((i66722 & 1) << 1)), ((i66822 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH) << 1) - (i66822 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH), 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr18822);
                    java.lang.Object[] objArr18922 = {str10822, (java.lang.String) objArr18822[0]};
                    d7 = com.facetec.sdk.al.d(-100890377);
                    if (d7 == null) {
                    }
                    long longValue1922 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr18922)).longValue();
                    long j11322 = -633018571;
                    long j11422 = -712;
                    long j11522 = longValue1922 ^ j32;
                    str6 = str5;
                    long elapsedRealtime822 = (int) android.os.SystemClock.elapsedRealtime();
                    long j11622 = elapsedRealtime822 ^ j32;
                    long j11722 = (j11622 | j11322) ^ j32;
                    long j11822 = ((((((-711) * j11322) + (713 * longValue1922)) + ((((j11522 | j11322) ^ j32) | j11722) * j11422)) + (j11422 * (((elapsedRealtime822 | (longValue1922 | j11322)) ^ j32) | (((j11522 | j11622) | j11322) ^ j32)))) + (712 * (j11522 | j11722))) - 1387045576;
                    i23 = ((int) (j11822 >> 32)) & (((~(1298027518 | i17)) * 52) + 1455957074 + (((~(140264428 | i17)) | (~((-1296961983) | i17)) | 1157763090) * (-52)) + (((~((-140264429) | i17)) | 1065536) * 52));
                    int myTid422 = android.os.Process.myTid();
                    int i66922 = ~myTid422;
                    i24 = ((int) j11822) & ((((~((-216674089) | i66922)) | 1653900498) * (-865)) + 1702088048 + ((~(myTid422 | 216674088)) * 865) + (((~(1653900498 | i66922)) | (~(i66922 | 216674088))) * 865));
                    if (((i23 ^ i24) | (i23 & i24)) != 0) {
                    }
                }
                i5 = i54;
                int i772 = i54 ^ i4;
                int i782 = -i772;
                int i792 = ((i772 ^ i782) | (i772 & i782)) >> 31;
                int i802 = (i4 & i792) | (i5 & (~i792));
                int i812 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i822 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                int i832 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                java.lang.Object[] objArr1510 = new java.lang.Object[1];
                f((char) (((i812 | 14765) << 1) - (i812 ^ 14765)), (i822 ^ 141) + ((i822 & 141) << 1), (i832 ^ 13) + ((i832 & 13) << 1), objArr1510);
                java.lang.Object[] objArr1610 = {(java.lang.String) objArr1510[0]};
                d2 = com.facetec.sdk.al.d(2084539986);
                if (d2 == null) {
                }
                long longValue42 = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr1610)).longValue();
                long j302 = -269156041;
                long j312 = -754;
                long j322 = -1;
                long j332 = j302 ^ j322;
                long j342 = j332 | longValue42;
                long elapsedCpuTime22 = (int) android.os.Process.getElapsedCpuTime();
                long j352 = elapsedCpuTime22 ^ j322;
                long j362 = (755 * j302) + ((-753) * longValue42) + (((j342 ^ j322) | ((j332 | elapsedCpuTime22) ^ j322) | ((longValue42 | elapsedCpuTime22) ^ j322)) * j312) + (j312 * (((j342 | elapsedCpuTime22) ^ j322) | ((longValue42 | (j302 | j352)) ^ j322))) + (754 * (j332 | j352)) + 1241305383;
                i6 = i;
                int i842 = ~((-2020889137) | i6);
                int i852 = ~i6;
                i7 = ((int) (j362 >> 32)) & (((1209270800 | i842) * (-814)) + 172264101 + ((i842 | (~(836851748 | i852)) | 25233412) * 407) + (((~(2020889136 | i6)) | 25233412 | (~((-836851749) | i6))) * 407));
                int i862 = (~((-1555061013) | i852)) | 269486100 | (~(1302679873 | i852));
                i8 = ((int) j362) & ((((~((-17104962) | i6)) | i862) * 590) + 1438757535 + (i862 * (-1180)) + (((~((-1302679874) | i852)) | (~(1555061012 | i852))) * 590));
                if (((i7 ^ i8) | (i7 & i8)) == 0) {
                }
                int i1112 = (~(i6 & i802)) & (i6 | i802);
                int i1122 = -i1112;
                int i1132 = ((i1112 ^ i1122) | (i1112 & i1122)) >> 31;
                int i1142 = i9 & (~i1132);
                int i1152 = i1132 & i802;
                int i1162 = (i1142 ^ i1152) | (i1142 & i1152);
                d3 = com.facetec.sdk.al.d(-318294282);
                if (d3 == null) {
                }
                long longValue52 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, null)).longValue();
                long j372 = 31938918;
                long j382 = j372 ^ j322;
                long j392 = longValue52 ^ j322;
                j = i6;
                long j402 = j ^ j322;
                long j412 = 490;
                long j422 = (491 * j372) + ((-489) * longValue52) + ((-490) * (j382 | j392 | j402)) + ((((j392 | j) ^ j322) | ((j372 | j392) ^ j322)) * j412) + (j412 * j382) + 399879183;
                int i1172 = ((int) (j422 >> 32)) & ((((~(i852 | (-2061440945))) | 1523258800) * 446) + 384374654 + (((~((-538182145) | i6)) | (-2147473334)) * 446) + 768592032);
                int i1182 = ((int) j422) & ((((~(1639035752 | i6)) | (-1218705134)) * (-668)) + 1193087273 + (((~((-1218705134) | i6)) | 1639035752) * 1336) + (((-134366342) | i6) * 668));
                int i1192 = (i1172 ^ i1182) | (i1172 & i1182);
                int i1202 = (~i1192) + (i1192 << 1);
                int i1212 = -i1192;
                int i1222 = ((i1192 ^ i1212) | (i1192 & i1212)) >> 31;
                int i1232 = (~i1222) & i6;
                int i1242 = i1222 & (i6 ^ ((i1202 & 200) + (i1202 | 200)));
                int i1252 = ((~i1162) & i6) | (i1162 & i852);
                int i1262 = -i1252;
                int i1272 = ((i1252 ^ i1262) | (i1252 & i1262)) >> 31;
                int i1282 = ((i1242 ^ i1232) | (i1242 & i1232)) & (~i1272);
                int i1292 = i1162 & i1272;
                int i1302 = (i1282 ^ i1292) | (i1292 & i1282);
                char deadChar3 = (char) android.view.KeyEvent.getDeadChar(0, 0);
                int offsetBefore5 = android.text.TextUtils.getOffsetBefore("", 0);
                java.lang.Object[] objArr252 = new java.lang.Object[1];
                f(deadChar3, ((offsetBefore5 | 203) << 1) - (offsetBefore5 ^ 203), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19, objArr252);
                java.lang.String str252 = (java.lang.String) objArr252[0];
                char c82 = (char) (23320 - (~(-(-android.graphics.Color.argb(0, 0, 0, 0)))));
                int i1312 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                int scrollBarFadeDuration6 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                java.lang.Object[] objArr262 = new java.lang.Object[1];
                f(c82, 222 - (~i1312), (scrollBarFadeDuration6 & 6) + (scrollBarFadeDuration6 | 6), objArr262);
                java.lang.Object[] objArr272 = {str252, (java.lang.String) objArr262[0]};
                d4 = com.facetec.sdk.al.d(-100890377);
                if (d4 == null) {
                }
                long longValue62 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr272)).longValue();
                long j432 = -1858890050;
                long j442 = -245;
                long j452 = longValue62 ^ j322;
                long j462 = (j452 | j) ^ j322;
                long j472 = ((((((-244) * j432) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE * longValue62)) + ((((j452 | j402) ^ j322) | ((j452 | j432) ^ j322)) * j442)) + (j442 * j462)) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE * (j462 | j432))) - 161174097;
                int i1322 = ((int) (j472 >> 32)) & ((((i852 | 1480886453) * 1324) - 818884594) + (((~((-666579787) | i6)) | (~(2103806197 | i6))) * (-1324)) + 67534208);
                int i1332 = ~(523353448 | i6);
                int i1342 = ((int) j472) & (((((1960579858 | i1332) * (-220)) + 1212497711) + ((i1332 | 1623982610) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1612773594);
                int i1352 = (i1322 ^ i1342) | (i1322 & i1342);
                int i1362 = -i1352;
                int i1372 = ((i1352 ^ i1362) | (i1352 & i1362)) >> 31;
                int i1382 = (~i1372) & i6;
                int i1392 = i1372 & (~(i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)) & (i6 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
                int i1402 = ((~i1302) & i6) | (i1302 & i852);
                int i1412 = -i1402;
                int i1422 = ((i1402 ^ i1412) | (i1402 & i1412)) >> 31;
                int i1432 = ((i1392 ^ i1382) | (i1392 & i1382)) & (~i1422);
                int i1442 = i1302 & i1422;
                i12 = (i1442 ^ i1432) | (i1442 & i1432);
                str2 = "";
                char offsetAfter3 = (char) android.text.TextUtils.getOffsetAfter(str2, 0);
                int i1452 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                java.lang.Object[] objArr292 = new java.lang.Object[1];
                f(offsetAfter3, (i1452 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE) + ((i1452 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE) << 1), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 31, objArr292);
                java.lang.String str262 = (java.lang.String) objArr292[0];
                int i1462 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                float maxVolume3 = android.media.AudioTrack.getMaxVolume();
                int i1472 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                java.lang.Object[] objArr302 = new java.lang.Object[1];
                f((char) ((45899 & i1462) + (i1462 | 45899)), (maxVolume3 > 0.0f ? 1 : (maxVolume3 == 0.0f ? 0 : -1)) + 259, (i1472 & 23) + (i1472 | 23), objArr302);
                java.lang.String str272 = (java.lang.String) objArr302[0];
                char c102 = (char) ((-android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)) - 1);
                int i1482 = -android.text.TextUtils.indexOf(str2, str2, 0, 0);
                int i1492 = -android.os.Process.getGidForName(str2);
                java.lang.Object[] objArr312 = new java.lang.Object[1];
                f(c102, (i1482 & 283) + (i1482 | 283), ((i1492 | 27) << 1) - (i1492 ^ 27), objArr312);
                java.lang.String str282 = (java.lang.String) objArr312[0];
                char scrollBarFadeDuration22 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i1502 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                java.lang.Object[] objArr322 = new java.lang.Object[1];
                f(scrollBarFadeDuration22, (i1502 & 312) + (i1502 | 312), 12 - (~(-android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr322);
                strArr = new java.lang.String[]{str262, str272, str282, (java.lang.String) objArr322[0]};
                i13 = 0;
                i14 = 4;
                while (true) {
                    if (i13 < i14) {
                    }
                    i13 = i51 + 1;
                    strArr = strArr11;
                    j = j2;
                    i12 = i50;
                    str2 = str3;
                    i14 = 4;
                }
                int i1552 = ((~i15) & i6) | (i15 & i852);
                int i1562 = -i1552;
                int i1572 = ((i1552 ^ i1562) | (i1552 & i1562)) >> 31;
                int i1582 = i16 & (~i1572);
                int i1592 = i15 & i1572;
                int i1602 = (i1582 ^ i1592) | (i1582 & i1592);
                char resolveSizeAndState2 = (char) android.view.View.resolveSizeAndState(0, 0, 0);
                int resolveSize22 = android.view.View.resolveSize(0, 0);
                int i1612 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                java.lang.Object[] objArr352 = new java.lang.Object[1];
                f(resolveSizeAndState2, resolveSize22 + 325, (i1612 & 13) + (i1612 | 13), objArr352);
                java.lang.Object[] objArr362 = {(java.lang.String) objArr352[0]};
                d5 = com.facetec.sdk.al.d(1590238701);
                if (d5 == null) {
                }
                str4 = (java.lang.String) ((java.lang.reflect.Method) d5).invoke(null, objArr362);
                if (str4 == null) {
                }
                i18 = i6;
                int i16522 = ((~i1602) & i6) | (i1602 & i17);
                int i16622 = -i16522;
                int i16722 = ((i16522 ^ i16622) | (i16522 & i16622)) >> 31;
                int i16822 = (i1602 & i16722) | (i18 & (~i16722));
                java.lang.Object[] objArr3922 = new java.lang.Object[1];
                f((char) android.text.TextUtils.indexOf(str5, str5, 0), 347 - (~android.view.MotionEvent.axisFromString(str5)), 16 - (~(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr3922);
                java.lang.String str2922 = (java.lang.String) objArr3922[0];
                int i16922 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i17022 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                int i17122 = -android.text.TextUtils.getTrimmedLength(str5);
                java.lang.Object[] objArr4022 = new java.lang.Object[1];
                f((char) (((i16922 | 1) << 1) - (i16922 ^ 1)), (i17022 & 364) + (i17022 | 364), (i17122 & 6) + (i17122 | 6), objArr4022);
                java.lang.String str3022 = (java.lang.String) objArr4022[0];
                file = new java.io.File(str2922);
                if (file.exists()) {
                }
                i19 = i6;
                int i173222 = ((~i16822) & i6) | (i16822 & i17);
                int i174222 = (i173222 | (-i173222)) >> 31;
                int i175222 = i19 & (~i174222);
                int i176222 = i16822 & i174222;
                int i177222 = (i176222 ^ i175222) | (i176222 & i175222);
                char keyRepeatTimeout2222 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i178222 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i179222 = -android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                java.lang.Object[] objArr42222 = new java.lang.Object[1];
                f(keyRepeatTimeout2222, (i178222 ^ 372) + ((i178222 & 372) << 1), (i179222 & 22) + (i179222 | 22), objArr42222);
                java.lang.Object[] objArr43222 = {(java.lang.String) objArr42222[0]};
                d6 = com.facetec.sdk.al.d(1590238701);
                if (d6 == null) {
                }
                java.lang.String lowerCase222 = ((java.lang.String) ((java.lang.reflect.Method) d6).invoke(null, objArr43222)).toLowerCase();
                int i180222 = -android.os.Process.getGidForName(str5);
                int indexOf5222 = android.text.TextUtils.indexOf(str5, str5, 0, 0);
                int i181222 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                java.lang.Object[] objArr45222 = new java.lang.Object[1];
                f((char) ((i180222 & 27441) + (i180222 | 27441)), ((indexOf5222 | 395) << 1) - (indexOf5222 ^ 395), ((i181222 | 4) << 1) - (i181222 ^ 4), objArr45222);
                if (!lowerCase222.contains((java.lang.String) objArr45222[0])) {
                }
                int i183222 = (~(i6 & i177222)) & (i6 | i177222);
                int i184222 = -i183222;
                int i185222 = ((i183222 ^ i184222) | (i183222 & i184222)) >> 31;
                int i186222 = i182 & (~i185222);
                int i187222 = i177222 & i185222;
                int i188222 = (i187222 ^ i186222) | (i187222 & i186222);
                int i189222 = -android.graphics.Color.rgb(0, 0, 0);
                int resolveSize3222 = android.view.View.resolveSize(0, 0);
                java.lang.Object[] objArr46222 = new java.lang.Object[1];
                f((char) (((-16777216) ^ i189222) + ((i189222 & (-16777216)) << 1)), ((resolveSize3222 | 399) << 1) - (resolveSize3222 ^ 399), android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 43, objArr46222);
                java.lang.String str31222 = (java.lang.String) objArr46222[0];
                char trimmedLength2222 = (char) (1326 - android.text.TextUtils.getTrimmedLength(str5));
                int i190222 = -android.graphics.Color.argb(0, 0, 0, 0);
                java.lang.Object[] objArr47222 = new java.lang.Object[1];
                f(trimmedLength2222, ((i190222 | 441) << 1) - (i190222 ^ 441), (-16777176) - android.graphics.Color.rgb(0, 0, 0), objArr47222);
                java.lang.String str32222 = (java.lang.String) objArr47222[0];
                char tapTimeout2222 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                int i191222 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                int i192222 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                java.lang.Object[] objArr48222 = new java.lang.Object[1];
                f(tapTimeout2222, 480 - (~i191222), (i192222 & 27) + (i192222 | 27), objArr48222);
                java.lang.String str33222 = (java.lang.String) objArr48222[0];
                int i193222 = -(-android.text.TextUtils.getOffsetAfter(str5, 0));
                int i194222 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                int i195222 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                java.lang.Object[] objArr49222 = new java.lang.Object[1];
                f((char) ((51775 ^ i193222) + ((i193222 & 51775) << 1)), (i194222 ^ androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT) + ((i194222 & androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT) << 1), ((i195222 | 27) << 1) - (i195222 ^ 27), objArr49222);
                java.lang.String str34222 = (java.lang.String) objArr49222[0];
                char threadPriority622 = (char) (20119 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                int i196222 = -android.view.View.resolveSizeAndState(0, 0, 0);
                int i197222 = -android.view.KeyEvent.getDeadChar(0, 0);
                java.lang.Object[] objArr50222 = new java.lang.Object[1];
                f(threadPriority622, ((i196222 | 535) << 1) - (i196222 ^ 535), ((i197222 | 27) << 1) - (i197222 ^ 27), objArr50222);
                java.lang.String str35222 = (java.lang.String) objArr50222[0];
                char scrollBarFadeDuration4222 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i198222 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                int i199222 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                java.lang.Object[] objArr51222 = new java.lang.Object[1];
                f(scrollBarFadeDuration4222, (i198222 & 562) + (i198222 | 562), (i199222 & 27) + (i199222 | 27), objArr51222);
                java.lang.String[] strArr17222 = {str31222, str32222, str33222, str34222, str35222, (java.lang.String) objArr51222[0]};
                i20 = 0;
                i21 = 6;
                while (true) {
                    if (i20 < i21) {
                    }
                    i20 = (i20 ^ 1) + ((i20 & 1) << 1);
                    i21 = 6;
                }
                int i202222 = (~(i6 & i188222)) & (i6 | i188222);
                int i203222 = -i202222;
                int i204222 = ((i202222 ^ i203222) | (i202222 & i203222)) >> 31;
                int i205222 = i22 & (~i204222);
                int i206222 = i188222 & i204222;
                int i207222 = (i206222 ^ i205222) | (i206222 & i205222);
                char maximumFlingVelocity222 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int scrollBarSize322 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                int myPid2222 = android.os.Process.myPid() >> 22;
                java.lang.Object[] objArr54222 = new java.lang.Object[1];
                f(maximumFlingVelocity222, (scrollBarSize322 ^ 347) + ((scrollBarSize322 & 347) << 1), (myPid2222 & 17) + (myPid2222 | 17), objArr54222);
                java.lang.String str37222 = (java.lang.String) objArr54222[0];
                int myTid3222 = android.os.Process.myTid() >> 22;
                java.lang.Object[] objArr55222 = new java.lang.Object[1];
                f((char) ((53525 & myTid3222) + (myTid3222 | 53525)), 588 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), 6 - (~(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr55222);
                java.lang.String str38222 = (java.lang.String) objArr55222[0];
                file2 = new java.io.File(str37222);
                if (file2.exists()) {
                }
                int i665222 = -android.graphics.Color.argb(0, 0, 0, 0);
                int capsMode222 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                int i666222 = -android.os.Process.getGidForName(str5);
                java.lang.Object[] objArr187222 = new java.lang.Object[1];
                f((char) ((i665222 ^ 12358) + ((i665222 & 12358) << 1)), 595 - capsMode222, ((i666222 | 12) << 1) - (i666222 ^ 12), objArr187222);
                java.lang.String str108222 = (java.lang.String) objArr187222[0];
                int i667222 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i668222 = -(android.os.Process.myTid() >> 22);
                java.lang.Object[] objArr188222 = new java.lang.Object[1];
                f((char) ((i667222 ^ 1) + ((i667222 & 1) << 1)), ((i668222 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH) << 1) - (i668222 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH), 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr188222);
                java.lang.Object[] objArr189222 = {str108222, (java.lang.String) objArr188222[0]};
                d7 = com.facetec.sdk.al.d(-100890377);
                if (d7 == null) {
                }
                long longValue19222 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr189222)).longValue();
                long j113222 = -633018571;
                long j114222 = -712;
                long j115222 = longValue19222 ^ j322;
                str6 = str5;
                long elapsedRealtime8222 = (int) android.os.SystemClock.elapsedRealtime();
                long j116222 = elapsedRealtime8222 ^ j322;
                long j117222 = (j116222 | j113222) ^ j322;
                long j118222 = ((((((-711) * j113222) + (713 * longValue19222)) + ((((j115222 | j113222) ^ j322) | j117222) * j114222)) + (j114222 * (((elapsedRealtime8222 | (longValue19222 | j113222)) ^ j322) | (((j115222 | j116222) | j113222) ^ j322)))) + (712 * (j115222 | j117222))) - 1387045576;
                i23 = ((int) (j118222 >> 32)) & (((~(1298027518 | i17)) * 52) + 1455957074 + (((~(140264428 | i17)) | (~((-1296961983) | i17)) | 1157763090) * (-52)) + (((~((-140264429) | i17)) | 1065536) * 52));
                int myTid4222 = android.os.Process.myTid();
                int i669222 = ~myTid4222;
                i24 = ((int) j118222) & ((((~((-216674089) | i669222)) | 1653900498) * (-865)) + 1702088048 + ((~(myTid4222 | 216674088)) * 865) + (((~(1653900498 | i669222)) | (~(i669222 | 216674088))) * 865));
                if (((i23 ^ i24) | (i23 & i24)) != 0) {
                }
            }
        };
    }

    public static com.facetec.sdk.fb e(com.facetec.sdk.fa faVar) {
        if (faVar == com.facetec.sdk.fc.LAZILY_PARSED_NUMBER) {
            return c;
        }
        return a(faVar);
    }

    /* renamed from: com.facetec.sdk.gg$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.facetec.sdk.gs.values().length];
            e = iArr;
            try {
                iArr[com.facetec.sdk.gs.NULL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                e[com.facetec.sdk.gs.NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                e[com.facetec.sdk.gs.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.facetec.sdk.fd
    public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        com.facetec.sdk.gs f = gtVar.f();
        int i = com.facetec.sdk.gg.AnonymousClass2.e[f.ordinal()];
        if (i == 1) {
            gtVar.k();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f3596a.c(gtVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expecting number, got: ");
        sb.append(f);
        sb.append("; at path ");
        sb.append(gtVar.t());
        throw new com.facetec.sdk.ev(sb.toString());
    }
}
