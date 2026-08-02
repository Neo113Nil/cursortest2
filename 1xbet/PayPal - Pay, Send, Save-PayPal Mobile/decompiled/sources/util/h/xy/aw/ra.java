package util.h.xy.aw;

/* loaded from: classes5.dex */
public final class ra {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 1;
    private static long getInputFormats;

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = util.h.xy.aw.ra.class.getName();
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 15) % 128;
    }

    private ra() {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25248() {
        synchronized (util.h.xy.aw.ra.class) {
            if (util.h.xy.aw.mb.m25246() == null || util.h.xy.aw.mb.m25246().isEmpty()) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.rgb(0, 0, 0) + 16778752, android.graphics.Color.blue(0), (char) (1985 - android.graphics.Color.green(0)), objArr);
                byte[] m25076 = util.h.xy.ar.b.m25076(((java.lang.String) objArr[0]).intern());
                if (m25076.length % 3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 30, 1536 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                        throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i = 0;
                int i2 = 0;
                while (i < m25076.length) {
                    util.h.xy.aw.mb.d_().put(i2, new int[]{m25076[i], m25076[i + 1], m25076[i + 2]});
                    i += 3;
                    i2++;
                }
                util.h.xy.aw.mb.m25246().clear();
                util.h.xy.ar.b.m25095(util.h.xy.aw.mb.m25247());
                byte[] m25247 = util.h.xy.aw.mb.m25247();
                for (int i3 = 0; i3 < 13; i3++) {
                    int nextInt = util.h.xy.aw.mb.f882.nextInt(util.h.xy.aw.mb.d_().size());
                    util.h.xy.aw.mb.m25246().add(java.lang.Integer.valueOf(nextInt));
                    int[] iArr = util.h.xy.aw.mb.d_().get(nextInt);
                    int i4 = i3 * 3;
                    m25247[i4] = (byte) iArr[0];
                    m25247[i4 + 1] = (byte) iArr[1];
                    m25247[i4 + 2] = (byte) iArr[2];
                }
                util.h.xy.aw.mb.m25247()[39] = Byte.MIN_VALUE;
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 61) % 128;
            jArr[rbVar.f2651] = (((char) (getHighResolutionOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputFormats))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 31) % 128;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25249(byte[] bArr, util.h.xy.aw.b bVar, int i) {
        synchronized (util.h.xy.aw.ra.class) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 7) % 128;
            byte[] bArr2 = new byte[i];
            int i2 = 0;
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = new byte[i - bArr.length];
            util.h.xy.aw.mb.f882.nextBytes(bArr3);
            java.lang.System.arraycopy(bArr3, 0, bArr2, bArr.length, i - bArr.length);
            byte[] m24548 = util.h.xy.ad.a.m24548(util.h.xy.aw.mb.m25247());
            while (i2 < i) {
                int i3 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizesFor = (i3 + 91) % 128;
                int i4 = i2 % i;
                int length = m24548.length;
                bArr2[i4] = (byte) (m24548[i2 % length] ^ bArr2[i4]);
                i2++;
                int i5 = i3 + 111;
                getHighSpeedVideoSizesFor = i5 % 128;
                int i6 = i5 % 2;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                try {
                    byteArrayOutputStream.write(bArr2);
                    java.util.Iterator<java.lang.Integer> it = util.h.xy.aw.mb.m25246().iterator();
                    while (it.hasNext()) {
                        int i7 = getHighSpeedVideoFpsRangesFor + 87;
                        getHighSpeedVideoSizesFor = i7 % 128;
                        if (i7 % 2 == 0) {
                            byteArrayOutputStream.write((byte) it.next().intValue());
                            throw null;
                        }
                        byteArrayOutputStream.write((byte) it.next().intValue());
                    }
                    bVar.m25242(byteArrayOutputStream.toByteArray());
                } catch (java.io.IOException unused) {
                    byte[] bArr4 = new byte[48];
                    util.h.xy.aw.mb.f882.nextBytes(bArr4);
                    bVar.m25242(bArr4);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (java.io.IOException unused2) {
                }
            } catch (java.lang.Throwable th) {
                bVar.m25242(null);
                try {
                    byteArrayOutputStream.close();
                } catch (java.io.IOException unused3) {
                }
                throw th;
            }
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        char[] cArr = new char[1566];
        java.nio.ByteBuffer.wrap("\u009bð¦\u008aá\u0093,ìo¤ªÐõÃ0Ìs¹¾ËùÑ\u0004¯G\u0095\u0082\u009bÍ\u0080\b\u008bK\u0004\u0096\nÑ\u0014\u001c\u001a_V\u009a,¥4àH#An:©!ô)7\u0010r\u001e½\u0004øz:ðEû\u0080áÃí\u000eÔIÞ\u0094À×Ï\u0012´]Ê\u0098¥ÛÛæä!\u0099l\u0084¯\u0080ê\u00065{pd³mþU9ZD1\u00879ÂB\rIHT\u008b!Ö\u0019\u0011\u001f\\\u0005\u009f\u0000Ù\u0081äÿ'âbì\u00adØèØ+Àv»±ÆüÊ?¦z«\u0085ãÀî\u0003ñN\u008c\u0089\u0003Ô}\u0017aRo\u009dXØ-\u001b5&Ja2¬=ïT*Yu\u0017°\u001có\u0004>|xð»ùÆä\u0001ïL¡\u008fÜÊ¶\u0015ÌP²\u0093ÉÞÖ\u0019Ú$\u0095g\u0099¢\u0080í\u008a(vkp¶gñ\u0019<R\u007f-º1ÅA\u00000C9\u008eVÉ(\u0014\u0019W\u0019\u0092\u0006Ý\u0001\u001fñZùeà \u009aãØ.Ûi²´Í÷²2¾} ¸¨û\u0090\u0006\u009aAó\u008c\u008cÏs\n\fU\u0014\u0090nÓ%\u001e*YDd;§2â?-\"h-«\u0010ö\u001e1\u0005|\u000b¾õùð\u0004åG\u0099\u0082×ÍÜ\b¶K¾\u0096´Ñº\u001cÕ_¨\u009a\u0094¥\u0099àö#\u008fnr©~ôh7hrY½QøC;9FE\u0081<ÌR\u000fZJf\u0095\u0019Ð\u0003\u0013y]ø\u0098\u0089Ûáæ\u0099!×lÙ¯±ê¼5²p¹³©þ¡9åD\u009d\u0087\u0082Â\u008c\rwHy\u008b\u0014Ö\u001b\u0011W\\_\u009f3ÚAå4 8cT®,é\u00164\u001dwu²\u0001ü÷?\u008ez\u0094\u0085èÀÖ\u0003ØNÁ\u0089ÌÔµ\u0017¸R©\u009dÜØ\u0093\u001bé&\u0084a\u008b¬qïx*\u0013u\u001a°Vó]>CyO\u0084DÇN\u0002&M*\u0088aËj\u0016qQ|\u0093ôÞ\u008c\u0019\u0094$èg×¢©íÀ(Ák²¶Éñ¡<Ü\u007f\u0096ºíÅ\u0089\u0000ûCx\u008e\u000bÉ\u0011\u0014jW&\u0092XÝB\u0018<[Cf0¡)ì+/\u0017j\u0010µ\u0000ð\t2\u0084}\u008a¸\u0092ûï\u0006ÐA¬\u008c¶Ï¼\nÅUÍ\u0090©Ó¯\u001e\u0092Y\u009adó§\u0081â\u0001-ph`«\u001bö$1]|F¿@ú5\u00050@U\u0083YÎ\u0019\tkT\u0005\u0097\u0000Ñ\u0081\u001c\u008b_ä\u009aè¥Ðà®#²nÌ©°ô±7£rÚ½âø\u009d;\u0088F\u0088\u0081wÌ\r\u000f\u0011Jj\u0095&ÐX\u0013B^K\u00992¤>ç$\".m\u0017¨nëv6|pù³ÿþè9\u009aD¥\u0087ÑÂÃ\rÁH·\u008bÉÖ¥\u0011¯\\\u0094\u009fíÚ\u0089å\u0089 pc~®aék4!w,²@ýJ86{J\u0086SÁ)\f\u0013On\u008a\u0001Õ\u0000\u0017\u0085R\u008e\u009dâØë\u001bÔ&ÞaÄ¬ÁïÁ*»uÒ°¨ó\u0098>\u009ey\u0088\u0084þÇu\u0002xMb\u0088\u001eËR\u0016+QB\u009cNß3\u001aK%\"`)£\u0016î\u0011)qt\f¶ùñ\u008a<å\u007f\u009eº¦ÅÚ\u0000³Cº\u008eÆÉ±\u0014©W©\u0092äÝ\u009f\u0018ö[\u0080fv¡~ì\u0013/ojUµYð23;~3¹=Ä#\u0007-Bb\u008d\u0018Èv\u000b\bUø\u0090\u008dÓâ\u001e\u009eYÒd®§Ãâº-·h¹« öÚ1â|ì¿\u0084úù\u0005q@q\u0083\u0016Îl\tQT-\u0097AÒ9\u001d3XL\u009b'¦-á\u0019,\u0010orª\u0001ô\u00817ørä½íøÓ;ÜFÅ\u0081ÊÌ¶\u000f¾JÔ\u0095\u00adÐ\u0090\u0013\u009c^\u0084\u0099\u0080¤qç|\"\u0016mm¨RëZ66qN¼Aÿ>: E*\u0080bÃ\u001d\u000e\u0001I\u000e\u008bøÖù\u0011\u0091\\\u009b\u009f×ÚÚå´ Êc±®¹éÑ4 w\u0099²éý\u00868\u008c{p\u0086\u000bÁ\u0016\f`O!\u008aPÕH\u0010:SE\u009e>Ù%ä+'db\u001c\u00ad\u0005è\n*÷uý°äóé>ÖyÙ\u0084ÉÇ½\u0002ÅMÎ\u0088£Ë«\u0016ãQ\u0098\u009cõß\u008f\u001aq%~``£iî%).tD·HòF=Kx'»!Æ\u0018\u0001\u0010L\u0007\u008f\u000bÉø\u0014\u008dW\u0092\u0092\u009aÝÙ\u0018«[´f»¡ÆìÊ/ÑjÜµæð\u00903\u0080~\u0081¹sÄ~\u0007bB\u001d\u008d#ÈX\u000bFVJ\u00918Ü>\u001fRZ*ec kãu.}h\u0086«ûöä1ì|×¿Ùú²\u0005È@°\u0083¿Î¤\tÛTä\u0097\u009cÒõ\u001dùX\u0001\u009b\u000b¦fá\u001d,Vo+ªFõN07sM¾)ù(\u0004\u0015Gl\u0082uÍ\n\u000f\u0082Jù\u0095éÐï\u0013Ô^ß\u0099É¤Ëç¹\"ÎmÑ¨¬ëá6\u0098qó¼\u008fÿr:{Ef\u0080kÃR\u000e+I3\u0094>×9\u0012:]T\u0098]Û\u0010æ\u001f!ql}®öé\u008d4èwé²Öý©8±{º\u0086°Á¸\f¨Oª\u008aãÕ\u0099\u0010\u0088S\u0080\u009erÙxäb'\u001cbW\u00ad\\è6+MvD±Iü ?Yze\u0085\u0010À\u0002\u0003\u0001Mó\u0088ðËâ\u0016\u009bQ£\u009cÚß¶\u001aÉ%³`±£¡îª)\u0099t\u009e·\u0088ò\u0080=\u0001x\u000e»dÆ`\u0001XL^\u008f@Ê;\u00152P8\u0093'Þ]\u0019e$mgr¢\bìó/ùjæµáð×3¬~³¹ÌÄÁ\u0007»BÕ\u008dÛÈã\u000bëVô\u0091\u008dÜy\u001f|Zaen Qã-.2i:´5÷92Q} ¸fû\u0011\u0006tA\u000e\u0083ðÎù\téTè\u0097×Ò«\u001dÈX»\u009b¹¦ºá©,Úo\u0091ªêõ\u00810\u008csx¾}ù\u0011\u0004jG\"\u0082YÍ1\bHK7\u0096KÑ \u001c(_d\u009a\u001a¥\u0001à\u0001\"ôm\u008b¨\u0094ë\u00996¤q®¼Æÿ¾:ÅEÌ\u0080¨ÃÚ\u000e\u0094Iì\u0094\u0087×ý\u0012\u0006]|\u0098\u0016ÛjæS!)l1¯OêA59pV³Yþ\u00149nDr\u0087}Á\u0084\füOá\u008aìÕ¦\u0010ÑS´\u009eÌÙ¶äÉ'Ôb®\u00adâèé+\u0081v\u008f±sü\r?bzh\u0085VÀ+\u0003GNH\u0089BÔ8\u0017#R*\u009d\u0012Øm\u001bs&\t`\u0082£ùîâ)ïtÕ·ÞòÀ=ÍxÃ»»Æ¤\u0001«L\u0095\u008f\u0090Ê\u0082\u0015\u008bP\u0001\u0093}Þ\u0011\u0019l$WgP¢Fí>(9kJ¶'ñ(<b\u007f\u0010ºvÅ\u0000\u0007õBü\u008dæÈè\u000bØV©\u0091ÄÜº\u001f°ZÊeÔ Ûã\u0096.éi\u0081´\u008a÷\u00012\r}\u0014¸`û\"\u0006-AB\u008c<ÏF\n1U\"\u0090+Ó\u0013\u001e\u0018Ytd\r¦òáý,\u0094oíª¡õÚ0ÄsÏ¾ÆùË\u0004ÔG\u00ad\u0082äÍê\b\u0082Kþ\u0096\u0006Ñ}\u001c\u0011_\u001a\u009aU¥YàC#An3©1ôU7]r\u0017½\u001eø\u0007;~E\u0086\u0080ýÃå\u000e\u009dIÙ\u0094«×²\u0012À]µ\u0098°ÛÓæÞ!\u0093l\u0098¯\u0085ê\u008b5wpz³\u0014þ\u001b9YD,\u00876Â:\r8HJ\u008b\"Ö*\u0011a\\\u001f\u009f\tÚ\näù'ûbè\u00ad\u009dè¡+\u00advÃ±»üÁ?Êz¨\u0085®À\u0095\u0003\u009cNó\u0089\u0080Ô\u0003\u0017~Rg\u009d\u001cØR\u001b.&DaM¬2ïN*Ru/°\u0013ók>uy\b»öÆ\u008d\u0001\u0095Là\u008f¤ÊÚ\u0015´PÍ\u0093ÄÞ½\u0019Ñ$®g\u0099¢ëíò(\u008ckp¶\tña<\u0019\u007f&ºZÅF\u0000ACD\u008e:É#\u0014,W\u0016\u0092\u001dÝv\u0018\u000bZõeù âãê.¥i¬´Ç÷½2Ä}Ì¸¨û¬\u0006\u0092A\u0098\u008c\u0088Ï\u0080\n\u0003U|\u0090cÓ\u001d\u001eXY,dA§<âB-8h%«]ö\u00121\u0011|u¿\u000bù\u0083\u0004ðGæ\u0082\u009cÍ£\bÜKÄ\u0096ÎÑµ\u001cÊ_Õ\u009aÞ¥\u0090à\u0098#\u0081nþ©\u0001ôp7`ra½YøY;AF<\u00816Ì:\u000f)JZ\u0095\u0015Ð\u001b\u0013v^\u000b\u0098÷Ûýæ\u0091!ëlÔ¯Ðê¶5Íp±³Ìþ¤9ÜD\u0090\u0087\u009cÂ\u0086\rüHp\u008b\rÖf\u0011a\\R\u009fZÚHåO Bc:®)éZ4dw\u0011²\u0005ýy?\u0084zð\u0085æÀá\u0003ÔNÝ\u0089ÁÔÊ\u0017¹R±\u009dÒØ¨\u001b\u0095&\u0099a\u0084¬\u008cïv*zuf°ióR>*yA\u0084;ÇC\u0002=MR\u0088(Ëb\u0016\u001aQ\u0003\u009c\tÞõ\u0019û$ågë¢Òí¬(Çk½¶Âñ½<¤\u007fÞº\u0091Å\u0098\u0000\u0087C\u0080\u008e\u0004É\u000b\u0014hW\u001d\u0092PÝP\u0018H[:f5¡?ì!/)jcµ\u0010ð\u00063\u0001}ô¸ðû\u0093\u0006\u009dAÒ\u008cØÏ¶\nÍU¹\u0090»ÓÒ\u001e\u00adYåd\u0091§\u0081â\u0081-wh{«döl1X|.¿CúA\u00053@1\u0083#Î)\taTk\u0097rÒ{\u001c\u0085_\u0089\u009aç¥êàÔ#«nÁ©ÏôÃ7Îr¢½Üøä;\u0091F\u0082\u0081\u008fÌx\u000f\tJb\u0095hÐ%\u0013-^B\u0099:¤9ç;\" m-¨eë\u001e6rqz³òþü9áDë\u0087¥ÂÑ\rÄH¾\u008bÂÖÉ\u0011Ó\\\u00ad\u009fáÚéåô \u008fct®zé\u00124\u001cw$²,ýE8O{2\u0086KÁ$\fZOd\u008a\u001cÕ\u0001\u0010\bRù\u009d\u008aØ\u0094\u001b\u009a&Ðaª¬ÃïÌ*Äu¼°¢ó®>\u0095y\u009d\u0084òÇ\u008a\u0002\u0006My\u0088\u0015Ëo\u0016SQ\\\u009c4ß;\u001a5%N`#£[îa)ntv·{ñù<ù\u007fãº\u0099Å¥\u0000ÚC´\u008eÉÉ¹\u0014¹W¢\u0092ÞÝ\u0098\u0018î[ófù¡xì{/\u0015jjµRð*31~9¹9ÄJ\u0007%B]\u008d\u0019È\u001f\u000bvV\n\u0090ðÓñ\u001eèY\u009bd¦§©âÁ-¼hµ«¸öÖ1 |æ¿\u009aú\u0087\u0005\u008b@v\u0083\rÎ\u0013\t\u001bT&\u0097\\ÒF\u001dHXA\u009b<¦)á-,\u0013o\u001aª\u0003õ}7\u0086rð½\u0091øé;ÖFÝ\u0081²Ì¼\u000f¹J½\u0095 Ð¨\u0013\u0090^\u009e\u0099õ¤üçw\"\fmh¨`ëR6.qC¼=ÿD:IEU\u0080,Ã\u0017\u000e\u001dI\u0007\u0094~Öò\u0011ý\\å\u009fïÚ¦åÜ ´cÎ®µéË4¢wÝ²\u0095ý\u009e8\u0082{ù\u0086\u0006Áq\faOh\u008aQÕ^\u0010ISI\u009e5ÙKä''Zbd\u00ad\u0019è\u0004+|u\u0083°øóä>ìy×\u0084¬ÇÇ\u0002ÊM°\u0088ÉË¤\u0016 Q\u0097\u009c\u009aß\u0083\u001a\u008e%\u0003`\t£hîh)\"t-·FòN=Ax:»UÆ(\u0001\u0015L\u001d\u008fsÊ}\u0014÷Wø\u0092áÝê\u0018¤[ÚfÁ¡Ìì´/ºjÔµÞðá3ì~\u0080¹\u0080Äw\u0007\fB\u0013\u008d\u001cÈT\u000bQVH\u0091IÜ6\u001fKZ#eZ fã\u001c.ti\u0000\u009cM¡læ\u007f+~hU\u00adAò\u00117Jt)¹&þ$\u00035@\u0005\u0085IÊ\u0013\u000f\u001cL¡\u0091äÖä\u001bõXÕ\u009dÀ¢ÁçÕ$¤ié®¾ó¿0ÁuÚ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1566);
        getHighResolutionOutputSizeshNQ4ISI = cArr;
        getInputFormats = 6975842773599363337L;
    }
}
