package util.h.xy.dd;

/* loaded from: classes5.dex */
public class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static final int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static long getInputFormats = 0;
    private static char[] getInputSizeshNQ4ISI = null;
    private static java.lang.Object getOutputFormats = null;
    private static int getOutputMinFrameDuration = 0;
    private static int getOutputMinFrameDurationlomOqCM = 1;
    private static java.lang.Object getOutputSizes;
    private static long getOutputSizeshNQ4ISI;
    private static byte getOutputStallDuration;
    private static long getOutputStallDurationlomOqCM;
    private static long isOutputSupportedForhNQ4ISI;

    /* renamed from: ˑ, reason: contains not printable characters */
    public static final java.util.Map f1175;

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static final java.util.Map f1176;

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getInputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputFormats))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i4 = getHighSpeedVideoSizesFor + 113;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 >>> 1;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 33) % 128;
        objArr[0] = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:10|11|(1:13)(1:1054)|14|(5:15|16|17|18|19)|(32:21|(31:1041|1042|24|(30:26|27|(1:29)(1:1038)|30|(25:1033|1034|(1:(1:35)(3:1022|1023|1024))(1:1032)|(1:37)(5:996|997|998|999|1000)|38|(6:41|42|43|44|45|46)|54|55|56|57|58|(1:60)(1:993)|61|(1:63)|64|(1:66)(1:992)|67|68|(1:70)(1:990)|71|(1:73)(1:989)|74|75|(5:79|(46:85|86|(7:(2:89|(3:91|92|93)(4:127|128|129|131))|134|135|136|137|138|140)|(11:821|822|823|824|825|826|827|828|(18:830|(1:832)(2:956|(1:958)(1:(1:960)(1:961)))|833|834|835|836|837|838|839|840|841|(3:(7:844|845|(1:847)(4:858|859|860|861)|848|849|850|851)(2:865|866)|852|854)|867|868|(2:938|939)(1:(2:929|930)(13:(2:918|919)(12:872|873|874|875|876|877|878|879|880|881|882|883)|979|980|105|106|107|(2:109|(2:112|113)(1:111))|114|115|116|117|118|119))|920|921|883)|962|963)(1:148)|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|(16:190|191|192|(3:194|195|196)|214|215|216|217|218|219|220|221|(10:712|713|714|715|716|717|718|719|720|721)(10:223|224|225|226|227|228|229|230|231|232)|233|(33:552|553|(1:555)(1:697)|(1:557)(1:696)|558|559|560|561|(3:563|564|(3:566|567|568)(3:576|577|578))|621|(1:623)(1:690)|624|625|626|(4:628|629|630|(2:632|633)(1:634))|689|635|636|637|638|639|640|641|642|643|644|645|646|647|648|649|(4:651|652|653|654)|661)(70:235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|(2:267|(8:269|(4:271|272|273|(3:275|276|277)(1:278))(4:522|(1:524)|276|277)|201|202|203|204|206|207)(1:525))|279|280|281|282|284|285|286|287|288|289|290|291|292|293|294|295|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|(3:312|313|314)|342|343|344|(2:346|(1:348)(4:349|350|351|353))|354)|(13:451|452|453|454|455|456|457|458|459|460|(1:462)|463|(22:364|365|366|367|368|369|370|371|372|373|374|375|376|377|378|379|380|381|382|383|384|385)(1:427))(8:356|357|358|359|360|361|362|(0)(0))))(1:81)|82|83|84)|985)|32|(0)(0)|(0)(0)|38|(6:41|42|43|44|45|46)|54|55|56|57|58|(0)(0)|61|(0)|64|(0)(0)|67|68|(0)(0)|71|(0)(0)|74|75|(6:77|79|(0)(0)|82|83|84)|986|987)|1040|(0)|32|(0)(0)|(0)(0)|38|(0)|54|55|56|57|58|(0)(0)|61|(0)|64|(0)(0)|67|68|(0)(0)|71|(0)(0)|74|75|(0)|986|987)|23|24|(0)|1040|(0)|32|(0)(0)|(0)(0)|38|(0)|54|55|56|57|58|(0)(0)|61|(0)|64|(0)(0)|67|68|(0)(0)|71|(0)(0)|74|75|(0)|986|987)|1045|1046|(0)|23|24|(0)|1040|(0)|32|(0)(0)|(0)(0)|38|(0)|54|55|56|57|58|(0)(0)|61|(0)|64|(0)(0)|67|68|(0)(0)|71|(0)(0)|74|75|(0)|986|987) */
    /* JADX WARN: Can't wrap try/catch for region: R(44:9|10|11|(1:13)(1:1054)|14|15|16|17|18|19|(32:21|(31:1041|1042|24|(30:26|27|(1:29)(1:1038)|30|(25:1033|1034|(1:(1:35)(3:1022|1023|1024))(1:1032)|(1:37)(5:996|997|998|999|1000)|38|(6:41|42|43|44|45|46)|54|55|56|57|58|(1:60)(1:993)|61|(1:63)|64|(1:66)(1:992)|67|68|(1:70)(1:990)|71|(1:73)(1:989)|74|75|(5:79|(46:85|86|(7:(2:89|(3:91|92|93)(4:127|128|129|131))|134|135|136|137|138|140)|(11:821|822|823|824|825|826|827|828|(18:830|(1:832)(2:956|(1:958)(1:(1:960)(1:961)))|833|834|835|836|837|838|839|840|841|(3:(7:844|845|(1:847)(4:858|859|860|861)|848|849|850|851)(2:865|866)|852|854)|867|868|(2:938|939)(1:(2:929|930)(13:(2:918|919)(12:872|873|874|875|876|877|878|879|880|881|882|883)|979|980|105|106|107|(2:109|(2:112|113)(1:111))|114|115|116|117|118|119))|920|921|883)|962|963)(1:148)|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|(16:190|191|192|(3:194|195|196)|214|215|216|217|218|219|220|221|(10:712|713|714|715|716|717|718|719|720|721)(10:223|224|225|226|227|228|229|230|231|232)|233|(33:552|553|(1:555)(1:697)|(1:557)(1:696)|558|559|560|561|(3:563|564|(3:566|567|568)(3:576|577|578))|621|(1:623)(1:690)|624|625|626|(4:628|629|630|(2:632|633)(1:634))|689|635|636|637|638|639|640|641|642|643|644|645|646|647|648|649|(4:651|652|653|654)|661)(70:235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|(2:267|(8:269|(4:271|272|273|(3:275|276|277)(1:278))(4:522|(1:524)|276|277)|201|202|203|204|206|207)(1:525))|279|280|281|282|284|285|286|287|288|289|290|291|292|293|294|295|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|(3:312|313|314)|342|343|344|(2:346|(1:348)(4:349|350|351|353))|354)|(13:451|452|453|454|455|456|457|458|459|460|(1:462)|463|(22:364|365|366|367|368|369|370|371|372|373|374|375|376|377|378|379|380|381|382|383|384|385)(1:427))(8:356|357|358|359|360|361|362|(0)(0))))(1:81)|82|83|84)|985)|32|(0)(0)|(0)(0)|38|(6:41|42|43|44|45|46)|54|55|56|57|58|(0)(0)|61|(0)|64|(0)(0)|67|68|(0)(0)|71|(0)(0)|74|75|(6:77|79|(0)(0)|82|83|84)|986|987)|1040|(0)|32|(0)(0)|(0)(0)|38|(0)|54|55|56|57|58|(0)(0)|61|(0)|64|(0)(0)|67|68|(0)(0)|71|(0)(0)|74|75|(0)|986|987)|23|24|(0)|1040|(0)|32|(0)(0)|(0)(0)|38|(0)|54|55|56|57|58|(0)(0)|61|(0)|64|(0)(0)|67|68|(0)(0)|71|(0)(0)|74|75|(0)|986|987)|1045|1046|(0)|23|24|(0)|1040|(0)|32|(0)(0)|(0)(0)|38|(0)|54|55|56|57|58|(0)(0)|61|(0)|64|(0)(0)|67|68|(0)(0)|71|(0)(0)|74|75|(0)|986|987) */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x1de1, code lost:
    
        util.h.xy.dd.b.getOutputMinFrameDurationlomOqCM = (util.h.xy.dd.b.getOutputMinFrameDuration + 81) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x1df0, code lost:
    
        r1 = r42.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
        util.h.xy.dd.b.getOutputSizes = r1.newInstance(r3, java.lang.Boolean.valueOf(!r46));
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x1e19, code lost:
    
        r45.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x1e1c, code lost:
    
        r1 = true;
        r3 = 3;
        r7 = 'S';
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x1e28, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x1e29, code lost:
    
        r8 = r0;
        r3 = 3;
        r7 = 'S';
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x06c1, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) (util.h.xy.dd.b.getHighSpeedVideoSizes | 10), r9[488(0x1e8, float:6.84E-43)], (short) (-util.h.xy.dd.b.getHighResolutionOutputSizeshNQ4ISI[209(0xd1, float:2.93E-43)]))).getMethod(getHighSpeedVideoFpsRangesFor(274, r9[163(0xa3, float:2.28E-43)], r9[19]), null).invoke(r14, null)).booleanValue() != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:995:0x065d, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1032:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:1033:0x0365 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1041:0x02cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x20ad A[Catch: Exception -> 0x2172, TRY_ENTER, TryCatch #78 {Exception -> 0x2172, blocks: (B:11:0x01cd, B:13:0x01e1, B:42:0x0521, B:50:0x058c, B:52:0x0592, B:53:0x0593, B:54:0x0594, B:57:0x05e6, B:68:0x0644, B:71:0x0651, B:74:0x065a, B:79:0x0666, B:109:0x20ad, B:113:0x20b1, B:84:0x2136, B:111:0x20bc, B:115:0x20c0, B:123:0x2110, B:125:0x2116, B:126:0x2117, B:996:0x048f, B:1003:0x214a, B:1009:0x215d, B:1010:0x2162, B:1007:0x2166, B:1015:0x2167, B:1018:0x2169, B:1020:0x2170, B:1021:0x2171, B:1022:0x03d1, B:1028:0x0471, B:1030:0x0477, B:1031:0x0478, B:1000:0x04df, B:998:0x04a2, B:1024:0x0441, B:45:0x053a, B:118:0x20dd, B:119:0x210d), top: B:10:0x01cd, inners: #16, #29, #32, #49, #114 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1c50 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0512 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1de1 A[EDGE_INSN: B:427:0x1de1->B:428:0x1de1 BREAK  A[LOOP:2: B:190:0x0dad->B:385:0x1d91], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x1e5d A[Catch: all -> 0x1e5f, Exception -> 0x1e62, TryCatch #24 {all -> 0x1e5f, blocks: (B:385:0x1d91, B:389:0x1dab, B:391:0x1db2, B:392:0x1db3, B:398:0x1db5, B:400:0x1dbe, B:401:0x1dbf, B:404:0x1dc1, B:406:0x1dca, B:407:0x1dcb, B:410:0x1dcd, B:412:0x1dd6, B:413:0x1dd7, B:429:0x1df0, B:484:0x1e57, B:486:0x1e5d, B:487:0x1e5e, B:377:0x1d27, B:375:0x1ced, B:373:0x1cab), top: B:384:0x1d91, inners: #80, #85, #90 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1e5e A[Catch: all -> 0x1e5f, Exception -> 0x1e62, TRY_LEAVE, TryCatch #24 {all -> 0x1e5f, blocks: (B:385:0x1d91, B:389:0x1dab, B:391:0x1db2, B:392:0x1db3, B:398:0x1db5, B:400:0x1dbe, B:401:0x1dbf, B:404:0x1dc1, B:406:0x1dca, B:407:0x1dcb, B:410:0x1dcd, B:412:0x1dd6, B:413:0x1dd7, B:429:0x1df0, B:484:0x1e57, B:486:0x1e5d, B:487:0x1e5e, B:377:0x1d27, B:375:0x1ced, B:373:0x1cab), top: B:384:0x1d91, inners: #80, #85, #90 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x1fc2 A[Catch: all -> 0x1fee, TryCatch #105 {all -> 0x1fee, blocks: (B:322:0x1e88, B:330:0x1ee3, B:332:0x1ee9, B:333:0x1eea, B:503:0x1ef0, B:505:0x1f01, B:506:0x1f02, B:510:0x1f15, B:512:0x1f1e, B:513:0x1f1f, B:540:0x1f46, B:542:0x1f59, B:543:0x1f5a, B:705:0x1f7b, B:707:0x1f81, B:708:0x1f82, B:741:0x1f84, B:743:0x1f95, B:744:0x1f96, B:751:0x1fbb, B:753:0x1fc2, B:754:0x1fc3, B:764:0x1fc5, B:766:0x1fd7, B:767:0x1fd8, B:770:0x1fda, B:772:0x1fec, B:773:0x1fed, B:248:0x1756, B:219:0x0f0d, B:177:0x0d42, B:175:0x0d02, B:324:0x1eb0, B:325:0x1ee0, B:294:0x19d0), top: B:321:0x1e88, inners: #13, #44, #87, #97, #102, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x1fc3 A[Catch: all -> 0x1fee, TryCatch #105 {all -> 0x1fee, blocks: (B:322:0x1e88, B:330:0x1ee3, B:332:0x1ee9, B:333:0x1eea, B:503:0x1ef0, B:505:0x1f01, B:506:0x1f02, B:510:0x1f15, B:512:0x1f1e, B:513:0x1f1f, B:540:0x1f46, B:542:0x1f59, B:543:0x1f5a, B:705:0x1f7b, B:707:0x1f81, B:708:0x1f82, B:741:0x1f84, B:743:0x1f95, B:744:0x1f96, B:751:0x1fbb, B:753:0x1fc2, B:754:0x1fc3, B:764:0x1fc5, B:766:0x1fd7, B:767:0x1fd8, B:770:0x1fda, B:772:0x1fec, B:773:0x1fed, B:248:0x1756, B:219:0x0f0d, B:177:0x0d42, B:175:0x0d02, B:324:0x1eb0, B:325:0x1ee0, B:294:0x19d0), top: B:321:0x1e88, inners: #13, #44, #87, #97, #102, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x2118  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x066a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:989:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:990:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:992:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:993:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:996:0x048f A[Catch: Exception -> 0x2172, TRY_ENTER, TRY_LEAVE, TryCatch #78 {Exception -> 0x2172, blocks: (B:11:0x01cd, B:13:0x01e1, B:42:0x0521, B:50:0x058c, B:52:0x0592, B:53:0x0593, B:54:0x0594, B:57:0x05e6, B:68:0x0644, B:71:0x0651, B:74:0x065a, B:79:0x0666, B:109:0x20ad, B:113:0x20b1, B:84:0x2136, B:111:0x20bc, B:115:0x20c0, B:123:0x2110, B:125:0x2116, B:126:0x2117, B:996:0x048f, B:1003:0x214a, B:1009:0x215d, B:1010:0x2162, B:1007:0x2166, B:1015:0x2167, B:1018:0x2169, B:1020:0x2170, B:1021:0x2171, B:1022:0x03d1, B:1028:0x0471, B:1030:0x0477, B:1031:0x0478, B:1000:0x04df, B:998:0x04a2, B:1024:0x0441, B:45:0x053a, B:118:0x20dd, B:119:0x210d), top: B:10:0x01cd, inners: #16, #29, #32, #49, #114 }] */
    /* JADX WARN: Type inference failed for: r10v110, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r10v111 */
    /* JADX WARN: Type inference failed for: r10v113 */
    /* JADX WARN: Type inference failed for: r10v118, types: [int, short] */
    /* JADX WARN: Type inference failed for: r10v123, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r10v127 */
    /* JADX WARN: Type inference failed for: r10v130 */
    /* JADX WARN: Type inference failed for: r10v169 */
    /* JADX WARN: Type inference failed for: r10v170 */
    /* JADX WARN: Type inference failed for: r10v173 */
    /* JADX WARN: Type inference failed for: r10v174 */
    /* JADX WARN: Type inference failed for: r10v175 */
    /* JADX WARN: Type inference failed for: r10v188 */
    /* JADX WARN: Type inference failed for: r10v194 */
    /* JADX WARN: Type inference failed for: r10v203, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v206 */
    /* JADX WARN: Type inference failed for: r10v240 */
    /* JADX WARN: Type inference failed for: r10v241 */
    /* JADX WARN: Type inference failed for: r10v253 */
    /* JADX WARN: Type inference failed for: r10v254, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v261 */
    /* JADX WARN: Type inference failed for: r10v273 */
    /* JADX WARN: Type inference failed for: r10v311 */
    /* JADX WARN: Type inference failed for: r10v312 */
    /* JADX WARN: Type inference failed for: r10v313 */
    /* JADX WARN: Type inference failed for: r10v319 */
    /* JADX WARN: Type inference failed for: r10v322 */
    /* JADX WARN: Type inference failed for: r1v260, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v188, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v113 */
    /* JADX WARN: Type inference failed for: r3v115 */
    /* JADX WARN: Type inference failed for: r3v116 */
    /* JADX WARN: Type inference failed for: r3v124, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r3v130, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v248 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r7v121, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v122 */
    /* JADX WARN: Type inference failed for: r7v124 */
    /* JADX WARN: Type inference failed for: r7v134, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v140, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v141, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v153 */
    /* JADX WARN: Type inference failed for: r7v155, types: [int] */
    /* JADX WARN: Type inference failed for: r7v158 */
    /* JADX WARN: Type inference failed for: r7v228 */
    /* JADX WARN: Type inference failed for: r7v236, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v241 */
    /* JADX WARN: Type inference failed for: r7v252 */
    /* JADX WARN: Type inference failed for: r7v258 */
    /* JADX WARN: Type inference failed for: r7v259 */
    /* JADX WARN: Type inference failed for: r7v260 */
    /* JADX WARN: Type inference failed for: r7v318 */
    /* JADX WARN: Type inference failed for: r7v319 */
    /* JADX WARN: Type inference failed for: r7v329 */
    /* JADX WARN: Type inference failed for: r9v76, types: [java.lang.Class[]] */
    static {
        java.lang.Integer num;
        java.lang.Object obj;
        java.lang.Object invoke;
        java.lang.Object obj2;
        java.lang.Object invoke2;
        java.lang.Class<?> cls;
        java.lang.String str;
        java.lang.Object obj3;
        char c;
        java.lang.Object[] objArr;
        char c2;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean[] zArr4;
        boolean z4;
        java.lang.Object[] objArr2;
        boolean[] zArr5;
        int i2;
        boolean[] zArr6;
        char c3;
        char c4;
        java.lang.Object obj4;
        char c5;
        char c6;
        int i3;
        boolean z5;
        java.lang.Object obj5;
        boolean z6;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        ?? r3;
        int i4;
        java.lang.Object obj13;
        java.util.Random random;
        boolean z7;
        java.lang.String obj14;
        int i5;
        boolean z8;
        java.util.Random random2;
        int i6;
        int i7;
        char c7;
        char c8;
        java.util.zip.ZipFile zipFile;
        char c9;
        java.lang.Throwable th;
        java.util.zip.ZipFile zipFile2;
        byte[] bArr;
        java.lang.Object[] objArr3;
        ?? cls2;
        ?? r10;
        int i8;
        java.lang.Object obj15;
        java.util.zip.ZipFile zipFile3;
        char c10;
        java.lang.Throwable cause;
        java.util.zip.ZipFile zipFile4;
        char c11;
        java.util.zip.ZipFile zipFile5;
        java.lang.Object obj16;
        java.lang.Object obj17;
        int i9;
        java.util.zip.ZipFile zipFile6;
        java.lang.String str2;
        byte[] bArr2;
        java.lang.Object newInstance;
        int i10;
        short s;
        java.lang.Integer num2;
        ?? r102;
        java.lang.Exception exc;
        java.lang.Throwable th2;
        int i11;
        java.lang.Object invoke3;
        int i12;
        boolean z9;
        java.util.zip.ZipFile zipFile7;
        java.lang.Throwable th3;
        java.lang.Object obj18;
        char c12;
        char c13;
        java.lang.Class cls3;
        byte[] bArr3;
        java.util.zip.ZipFile zipFile8;
        char c14;
        java.lang.Object invoke4;
        java.lang.reflect.Method method;
        java.lang.Object newInstance2;
        char c15;
        java.lang.reflect.Method method2;
        java.lang.Object obj19;
        ?? method3;
        ?? method4;
        byte[] bArr4;
        int i13;
        java.util.zip.ZipFile zipFile9;
        java.lang.Exception exc2;
        java.util.zip.ZipFile zipFile10;
        java.lang.Throwable th4;
        java.lang.Throwable cause2;
        java.lang.Object[] objArr4;
        char c16;
        char c17;
        int i14;
        char c18;
        boolean z10;
        char c19;
        boolean z11;
        java.lang.Object[] objArr5;
        java.lang.reflect.Method method5;
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRanges = 0;
        Camera2StreamConfigurationMap = 1;
        getHighSpeedVideoFpsRangesFor();
        try {
            byte[] bArr5 = getHighResolutionOutputSizeshNQ4ISI;
            int intValue = ((java.lang.Integer) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(bArr5[7], bArr5[576], (short) (bArr5[360] - 1))).getMethod(getHighSpeedVideoFpsRangesFor(bArr5[317], bArr5[697], bArr5[360]), java.lang.Integer.TYPE).invoke(null, 148)).intValue();
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i15 = ((-1400366080) ^ currentTimeMillis) | ((-1400366080) & currentTimeMillis);
            int i16 = ((i15 ^ 1688222383) | (1688222383 & i15)) * (-676);
            int i17 = ((-1771255280) & i16) + (i16 | (-1771255280));
            int i18 = ~currentTimeMillis;
            int i19 = ~(((-1400366080) & i18) | ((-1400366080) ^ i18));
            int i20 = -(-(((i19 ^ 324518224) | (324518224 & i19)) * 676));
            int i21 = ~((i18 ^ 1688222383) | (1688222383 & i18));
            int i22 = (i21 ^ (-2012740608)) | ((-2012740608) & i21);
            int i23 = ~((currentTimeMillis ^ (-1075847856)) | ((-1075847856) & currentTimeMillis));
            int i24 = (((i17 | i20) << 1) - (i17 ^ i20)) + (((i23 ^ i22) | (i23 & i22)) * 676);
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i25 = -(-(i24 * (-69)));
            int i26 = ~((121566015 & i24) | (121566015 ^ i24));
            int i27 = ~((i24 ^ currentTimeMillis2) | (i24 & currentTimeMillis2));
            int i28 = ~i24;
            int i29 = ~((i28 ^ (-121566016)) | ((-121566016) & i28));
            int i30 = (i29 ^ i26) | (i29 & i26);
            int i31 = ~(((-121566016) & currentTimeMillis2) | (currentTimeMillis2 ^ (-121566016)));
            int i32 = (i25 ^ (-41252544)) + ((i25 & (-41252544)) << 1) + (((i26 & i27) | (i26 ^ i27)) * (-140)) + ((~(currentTimeMillis2 | ((-121566016) ^ i24) | ((-121566016) & i24))) * 70) + (((i31 & i30) | (i30 ^ i31)) * 70);
            int i33 = ~((1063184191 & intValue) | (1063184191 ^ intValue));
            int i34 = ~intValue;
            int i35 = ~((1027622463 & i34) | (1027622463 ^ i34) | (-438215947));
            int i36 = (i33 ^ i35) | (i33 & i35);
            int i37 = i36 * 497;
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i38 = i36 * (-246015);
            int i39 = i32 * (-495);
            int i40 = ~i37;
            int i41 = ~i32;
            int i42 = ~((i41 & i40) | (i41 ^ i40));
            int i43 = ~((i40 ^ currentTimeMillis3) | (i40 & currentTimeMillis3));
            int i44 = (i42 ^ i43) | (i42 & i43);
            int i45 = ~currentTimeMillis3;
            int i46 = (i37 & i45) | (i45 ^ i37);
            int i47 = ~((i46 ^ i32) | (i46 & i32));
            int i48 = (((((i38 | i39) << 1) - (i38 ^ i39)) - (~(-(-(i44 * 992))))) - 1) + (((i44 ^ i47) | (i44 & i47)) * (-496));
            int i49 = (i32 | currentTimeMillis3) * 496;
            int i50 = ~((438215946 & i34) | (438215946 ^ i34));
            int i51 = (i50 ^ 624968245) | (624968245 & i50);
            int i52 = ~((intValue ^ (-35561729)) | ((-35561729) & intValue));
            if ((i48 ^ i49) + ((i49 & i48) << 1) + (((i52 ^ i51) | (i52 & i51)) * 497) == 0) {
                getOutputMinFrameDurationlomOqCM = (getOutputMinFrameDuration + 5) % 128;
                return;
            }
            getOutputStallDurationlomOqCM = 6724254199175570134L;
            getOutputStallDuration = (byte) -30;
            f1175 = new java.util.HashMap();
            f1176 = new java.util.HashMap();
            try {
                java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr5[434], bArr5[906], 84);
                java.lang.String highSpeedVideoFpsRangesFor2 = getOutputSizes == null ? getHighSpeedVideoFpsRangesFor(bArr5[129], bArr5[193], bArr5[19]) : null;
                try {
                    short s2 = bArr5[46];
                    byte b = bArr5[27];
                    byte b2 = bArr5[360];
                    num = 0;
                    try {
                        int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                        int i53 = -(-(b2 * (-209)));
                        int i54 = ~b2;
                        int i55 = (((i53 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE) + ((i53 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE) << 1)) - (~((~i54) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) - 1;
                        int i56 = ~currentTimeMillis4;
                        int i57 = ~(i54 | i56);
                        int i58 = ((i57 ^ i56) | (i57 & i56)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                        obj = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s2, b, (short) ((i55 ^ i58) + ((i58 & i55) << 1) + (((~(currentTimeMillis4 | (currentTimeMillis4 ^ (-1)))) | (~((i56 & b2) | (i56 ^ b2)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)))).getMethod(getHighSpeedVideoFpsRangesFor((short) 85, bArr5[317], bArr5[19]), new java.lang.Class[0]).invoke(null, null);
                    } catch (java.lang.Exception unused) {
                        obj = null;
                        byte[] bArr6 = getHighResolutionOutputSizeshNQ4ISI;
                        byte b3 = bArr6[576];
                        byte b4 = bArr6[360];
                        int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                        int i59 = 558 - (~(b4 * org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE));
                        int i60 = ~currentTimeMillis5;
                        int i61 = (~((~i60) | i60)) * (-560);
                        int i62 = ~b4;
                        int i63 = ~((b4 & i60) | (b4 ^ i60));
                        obj = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 102, b3, (short) ((((((i59 | i61) << 1) - (i59 ^ i61)) + ((~(currentTimeMillis5 | (currentTimeMillis5 ^ (-1)))) * (-560))) - (~(((i63 ^ i62) | (i62 & i63)) * 560))) - 1))).getMethod(getHighSpeedVideoFpsRangesFor((short) 123, bArr6[193], (short) (-bArr6[40])), new java.lang.Class[0]).invoke(null, null);
                        if (obj != null) {
                        }
                        invoke = null;
                        if (obj != null) {
                        }
                        obj2 = null;
                        if (obj != null) {
                        }
                        invoke2 = null;
                        if (invoke == null) {
                        }
                        if (invoke2 == null) {
                        }
                        c = 'S';
                        if (obj2 == null) {
                        }
                        int i64 = getHighSpeedVideoSizes;
                        byte[] bArr7 = getHighResolutionOutputSizeshNQ4ISI;
                        objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i64 ^ 10) | (i64 & 10)), bArr7[488], (short) (-bArr7[209]))), 7);
                        objArr[0] = null;
                        objArr[1] = obj2;
                        objArr[2] = obj3;
                        c2 = 3;
                        objArr[3] = invoke2;
                        objArr[4] = obj2;
                        objArr[5] = obj3;
                        objArr[6] = invoke2;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                        java.lang.Class<?> cls4 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i64 & 68) | (i64 ^ 68)), (byte) (-bArr7[44]), (short) (bArr7[360] - 1)));
                        i14 = cls4.getDeclaredField(getHighSpeedVideoFpsRangesFor((short) 268, bArr7[834], bArr7[39])).getInt(cls4);
                        if (i14 < 34) {
                        }
                        if (i14 == 29) {
                        }
                        if (i14 < 26) {
                        }
                        zArr3[c18] = z10;
                        if (i14 < 21) {
                        }
                        zArr3[c19] = z11;
                        zArr3[4] = i14 < 21;
                        z2 = false;
                        i = 0;
                        while (!z2) {
                        }
                    }
                } catch (java.lang.Exception unused2) {
                    num = 0;
                }
                if (obj != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 91) % 128;
                    if (obj != null) {
                        try {
                            java.lang.Class<?> cls5 = obj.getClass();
                            byte[] bArr8 = getHighResolutionOutputSizeshNQ4ISI;
                            byte b5 = bArr8[313];
                            int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                            int i65 = b5 * com.google.common.base.Ascii.ETB;
                            int i66 = ((i65 | (-491)) << 1) - (i65 ^ (-491));
                            int i67 = ~b5;
                            int i68 = ~currentTimeMillis6;
                            int i69 = -(-(((i68 & i67) | (i67 ^ i68)) * (-490)));
                            int i70 = (i66 ^ i69) + ((i69 & i66) << 1);
                            int i71 = (~((i67 ^ currentTimeMillis6) | (i67 & currentTimeMillis6))) * 490;
                            invoke = cls5.getMethod(getHighSpeedVideoFpsRangesFor(com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, (byte) (((i70 | i71) << 1) - (i71 ^ i70)), (short) (-bArr8[40])), null).invoke(obj, null);
                        } catch (java.lang.Exception unused3) {
                        }
                        if (obj != null) {
                            int i72 = Camera2StreamConfigurationMap;
                            int i73 = (i72 ^ 53) + ((i72 & 53) << 1);
                            getHighSpeedVideoFpsRanges = i73 % 128;
                            try {
                                if (i73 % 2 != 0) {
                                    method5 = obj.getClass().getMethod(getHighSpeedVideoFpsRangesFor((short) 1518, r9[23286], (short) (-getHighResolutionOutputSizeshNQ4ISI[14])), null);
                                    objArr5 = null;
                                } else {
                                    objArr5 = null;
                                    method5 = obj.getClass().getMethod(getHighSpeedVideoFpsRangesFor((short) 153, r9[434], (short) (-getHighResolutionOutputSizeshNQ4ISI[40])), null);
                                }
                                obj2 = method5.invoke(obj, objArr5);
                            } catch (java.lang.Exception unused4) {
                            }
                            if (obj != null) {
                                try {
                                    java.lang.Class<?> cls6 = obj.getClass();
                                    byte[] bArr9 = getHighResolutionOutputSizeshNQ4ISI;
                                    byte b6 = bArr9[313];
                                    int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                                    int i74 = (b6 * (-1187)) - 595;
                                    int i75 = ~b6;
                                    int i76 = ~currentTimeMillis7;
                                    int i77 = ~(b6 | i76);
                                    int i78 = -(-(((i75 ^ i77) | (i77 & i75)) * (-1188)));
                                    int i79 = (i74 & i78) + (i78 | i74);
                                    int i80 = ~(i75 | currentTimeMillis7);
                                    int i81 = -(-(((i80 & i75) | (i75 ^ i80) | (~((~i76) | i76))) * 594));
                                    int i82 = ~((i76 ^ i75) | (i75 & i76));
                                    int i83 = ~(i75 | (~i75));
                                    invoke2 = cls6.getMethod(getHighSpeedVideoFpsRangesFor((short) 167, (byte) ((((i79 ^ i81) + ((i81 & i79) << 1)) - (~(((i83 ^ i82) | (i82 & i83)) * 594))) - 1), (short) (-bArr9[40])), null).invoke(obj, null);
                                } catch (java.lang.Exception unused5) {
                                }
                                if (invoke == null) {
                                    cls = byte[].class;
                                    str = highSpeedVideoFpsRangesFor;
                                    obj3 = invoke;
                                } else if (highSpeedVideoFpsRangesFor2 == null) {
                                    cls = byte[].class;
                                    str = highSpeedVideoFpsRangesFor;
                                    obj3 = null;
                                } else {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    int i84 = getHighSpeedVideoSizes;
                                    byte[] bArr10 = getHighResolutionOutputSizeshNQ4ISI;
                                    byte b7 = bArr10[313];
                                    int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                                    int i85 = ~currentTimeMillis8;
                                    int i86 = ~(i85 | b7);
                                    int i87 = ~((b7 ^ (-1)) | b7);
                                    str = highSpeedVideoFpsRangesFor;
                                    int i88 = ~b7;
                                    cls = byte[].class;
                                    int i89 = (((715 - (~(-(-(b7 * 1435))))) - (~(b7 * (-1434)))) - 1) + (((~((i88 ^ currentTimeMillis8) | (i88 & currentTimeMillis8))) | (i86 & i87) | (i86 ^ i87)) * 717);
                                    int i90 = ~((i85 & i88) | (i88 ^ i85));
                                    int i91 = (i90 ^ i87) | (i90 & i87);
                                    int i92 = ~((b7 & currentTimeMillis8) | (b7 ^ currentTimeMillis8));
                                    int i93 = -(-(((i91 ^ i92) | (i91 & i92)) * 717));
                                    sb.append(getHighSpeedVideoFpsRangesFor((short) i84, (byte) (((i89 | i93) << 1) - (i93 ^ i89)), bArr10[13]));
                                    sb.append(highSpeedVideoFpsRangesFor2);
                                    try {
                                        obj3 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i84 ^ 10) | (i84 & 10)), bArr10[488], (short) (-bArr10[209]))).getDeclaredConstructor(java.lang.String.class).newInstance(sb.toString());
                                    } catch (java.lang.Throwable th5) {
                                        java.lang.Throwable cause3 = th5.getCause();
                                        if (cause3 == null) {
                                            throw th5;
                                        }
                                        throw cause3;
                                    }
                                }
                                if (invoke2 == null) {
                                    int i94 = getHighSpeedVideoFpsRanges;
                                    Camera2StreamConfigurationMap = ((i94 ^ 65) + ((i94 & 65) << 1)) % 128;
                                } else {
                                    byte[] bArr11 = getHighResolutionOutputSizeshNQ4ISI;
                                    try {
                                        try {
                                            java.lang.Object[] objArr6 = {java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 211, (byte) (-bArr11[84]), (short) (-bArr11[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 226, (byte) (bArr11[313] - 1), (short) (-bArr11[40])), java.lang.String.class).invoke(null, getHighSpeedVideoFpsRangesFor((short) 198, bArr11[897], (short) (-bArr11[209])))};
                                            int i95 = getHighSpeedVideoSizes;
                                            invoke2 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i95 ^ 10) | (i95 & 10)), bArr11[488], (short) (-bArr11[209]))).getDeclaredConstructor(java.lang.String.class).newInstance(objArr6);
                                        } catch (java.lang.Throwable th6) {
                                            java.lang.Throwable cause4 = th6.getCause();
                                            if (cause4 == null) {
                                                throw th6;
                                            }
                                            int i96 = getOutputMinFrameDuration + 67;
                                            getOutputMinFrameDurationlomOqCM = i96 % 128;
                                            if (i96 % 2 != 0) {
                                                throw cause4;
                                            }
                                            throw new java.lang.ArithmeticException();
                                        }
                                    } catch (java.lang.Throwable th7) {
                                        java.lang.Throwable cause5 = th7.getCause();
                                        if (cause5 == null) {
                                            throw th7;
                                        }
                                        throw cause5;
                                    }
                                }
                                c = 'S';
                                if (obj2 == null && obj3 != null) {
                                    int i97 = getHighSpeedVideoFpsRanges;
                                    Camera2StreamConfigurationMap = (((i97 | 85) << 1) - (i97 ^ 85)) % 128;
                                    byte[] bArr12 = getHighResolutionOutputSizeshNQ4ISI;
                                    java.lang.String highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor((short) 236, bArr12[313], bArr12[19]);
                                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 83) % 128;
                                    try {
                                        int i98 = getHighSpeedVideoSizes;
                                        short s3 = (short) ((i98 & 10) | (i98 ^ 10));
                                        obj2 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s3, bArr12[488], (short) (-bArr12[209]))).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s3, bArr12[488], (short) (-bArr12[209]))), java.lang.String.class).newInstance(obj3, highSpeedVideoFpsRangesFor3);
                                        int i99 = getHighSpeedVideoFpsRanges + 57;
                                        Camera2StreamConfigurationMap = i99 % 128;
                                        int i100 = i99 % 2;
                                    } catch (java.lang.Throwable th8) {
                                        java.lang.Throwable cause6 = th8.getCause();
                                        if (cause6 == null) {
                                            throw th8;
                                        }
                                        throw cause6;
                                    }
                                }
                                int i642 = getHighSpeedVideoSizes;
                                byte[] bArr72 = getHighResolutionOutputSizeshNQ4ISI;
                                objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i642 ^ 10) | (i642 & 10)), bArr72[488], (short) (-bArr72[209]))), 7);
                                objArr[0] = null;
                                objArr[1] = obj2;
                                objArr[2] = obj3;
                                c2 = 3;
                                objArr[3] = invoke2;
                                objArr[4] = obj2;
                                objArr[5] = obj3;
                                objArr[6] = invoke2;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                java.lang.Class<?> cls42 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i642 & 68) | (i642 ^ 68)), (byte) (-bArr72[44]), (short) (bArr72[360] - 1)));
                                i14 = cls42.getDeclaredField(getHighSpeedVideoFpsRangesFor((short) 268, bArr72[834], bArr72[39])).getInt(cls42);
                                if (i14 < 34) {
                                    int i101 = Camera2StreamConfigurationMap;
                                    getHighSpeedVideoFpsRanges = (((i101 | 21) << 1) - (i101 ^ 21)) % 128;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (i14 == 29) {
                                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 51) % 128;
                                }
                                if (i14 < 26) {
                                    getOutputMinFrameDuration = (getOutputMinFrameDurationlomOqCM + 29) % 128;
                                    c18 = 0;
                                    z10 = true;
                                } else {
                                    c18 = 0;
                                    z10 = false;
                                }
                                zArr3[c18] = z10;
                                if (i14 < 21) {
                                    c19 = 1;
                                    z11 = true;
                                } else {
                                    c19 = 1;
                                    z11 = false;
                                }
                                zArr3[c19] = z11;
                                zArr3[4] = i14 < 21;
                                z2 = false;
                                i = 0;
                                while (!z2 && i < 9) {
                                    if (zArr3[i]) {
                                        z3 = z2;
                                        zArr4 = zArr;
                                        z4 = z;
                                        objArr2 = objArr;
                                        zArr5 = zArr2;
                                        i2 = i;
                                        zArr6 = zArr3;
                                        c13 = c;
                                        c12 = c2;
                                    } else {
                                        try {
                                            z5 = zArr[i];
                                            obj5 = objArr[i];
                                            z6 = zArr2[i];
                                            if (z5) {
                                                if (obj5 != null) {
                                                    int i102 = Camera2StreamConfigurationMap + 115;
                                                    int i103 = i102 % 128;
                                                    getHighSpeedVideoFpsRanges = i103;
                                                    if (i102 % 2 == 0) {
                                                        Camera2StreamConfigurationMap = (i103 + 33) % 128;
                                                        try {
                                                        } catch (java.lang.Throwable th9) {
                                                            java.lang.Throwable cause7 = th9.getCause();
                                                            if (cause7 == null) {
                                                                throw th9;
                                                            }
                                                            throw cause7;
                                                        }
                                                    } else {
                                                        try {
                                                            throw new java.lang.ArithmeticException();
                                                        } catch (java.lang.Throwable th10) {
                                                            obj4 = th10;
                                                            z3 = z2;
                                                            zArr4 = zArr;
                                                            z4 = z;
                                                            objArr2 = objArr;
                                                            zArr5 = zArr2;
                                                            i2 = i;
                                                            zArr6 = zArr3;
                                                            c5 = c;
                                                            c6 = 3;
                                                        }
                                                    }
                                                }
                                                try {
                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                    byte[] bArr13 = getHighResolutionOutputSizeshNQ4ISI;
                                                    sb2.append(getHighSpeedVideoFpsRangesFor((short) 281, bArr13[c], bArr13[662]));
                                                    sb2.append(obj5);
                                                    sb2.append(getHighSpeedVideoFpsRangesFor((short) 285, bArr13[0], bArr13[29]));
                                                    try {
                                                        throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr13[280], (short) (-bArr13[209]))).getDeclaredConstructor(java.lang.String.class).newInstance(sb2.toString()));
                                                    } catch (java.lang.Throwable th11) {
                                                        java.lang.Throwable cause8 = th11.getCause();
                                                        if (cause8 == null) {
                                                            throw th11;
                                                        }
                                                        throw cause8;
                                                    }
                                                } catch (java.lang.Throwable th12) {
                                                    obj7 = th12;
                                                    z3 = z2;
                                                    zArr4 = zArr;
                                                    objArr2 = objArr;
                                                    zArr5 = zArr2;
                                                    i2 = i;
                                                    zArr6 = zArr3;
                                                    obj6 = obj7;
                                                    z4 = z;
                                                    c17 = 3;
                                                    c16 = 'S';
                                                    obj4 = obj6;
                                                    c6 = c17;
                                                    c5 = c16;
                                                    while (i3 < 7) {
                                                    }
                                                    byte[] bArr14 = getHighResolutionOutputSizeshNQ4ISI;
                                                    java.lang.String highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor((short) 1024, bArr14[184], bArr14[662]);
                                                    int i104 = getHighSpeedVideoFpsRanges;
                                                    Camera2StreamConfigurationMap = ((i104 & 45) + (i104 | 45)) % 128;
                                                    try {
                                                        throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr14[280], (short) (-bArr14[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(highSpeedVideoFpsRangesFor4, obj4));
                                                    } catch (java.lang.Throwable th13) {
                                                        java.lang.Throwable cause9 = th13.getCause();
                                                        if (cause9 == null) {
                                                            throw th13;
                                                        }
                                                        throw cause9;
                                                    }
                                                }
                                            }
                                        } catch (java.lang.Throwable th14) {
                                            th = th14;
                                            z3 = z2;
                                            zArr4 = zArr;
                                            z4 = z;
                                            objArr2 = objArr;
                                            zArr5 = zArr2;
                                            i2 = i;
                                            zArr6 = zArr3;
                                            c3 = c;
                                            c4 = c2;
                                        }
                                        if (z5) {
                                            try {
                                                java.util.Random random3 = (java.util.Random) java.util.Random.class.getDeclaredConstructor(null).newInstance(null);
                                                try {
                                                    byte[] bArr15 = getHighResolutionOutputSizeshNQ4ISI;
                                                    try {
                                                        random3.setSeed(((java.lang.Long) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 211, (byte) (-bArr15[84]), (short) (-bArr15[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 303, bArr15[906], bArr15[19]), null).invoke(null, null)).longValue() ^ 182443117);
                                                        obj8 = null;
                                                        obj9 = null;
                                                        obj10 = null;
                                                        obj11 = null;
                                                    } catch (java.lang.Throwable th15) {
                                                        th = th15;
                                                        z3 = z2;
                                                        zArr4 = zArr;
                                                    }
                                                    while (obj8 == null) {
                                                        z3 = z2;
                                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 85) % 128;
                                                        if (obj9 == null) {
                                                            i4 = 6;
                                                            zArr4 = zArr;
                                                        } else {
                                                            zArr4 = zArr;
                                                            i4 = obj11 == null ? 5 : obj10 == null ? 4 : 3;
                                                        }
                                                        try {
                                                            objArr2 = objArr;
                                                            zArr5 = zArr2;
                                                            try {
                                                                int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                                                                int i105 = (i4 * (-932)) + 934;
                                                                obj13 = obj8;
                                                                int i106 = ~i4;
                                                                int i107 = ~currentTimeMillis9;
                                                                zArr6 = zArr3;
                                                                int i108 = ~((i107 ^ (-2)) | (i107 & (-2)));
                                                                int i109 = ((i106 ^ i108) | (i108 & i106)) * (-933);
                                                                int i110 = ((((i105 | i109) << 1) - (i105 ^ i109)) - (~(-(-(((~((i106 & 1) | (i106 ^ 1))) | (~((i107 & i106) | (i106 ^ i107)))) * 933))))) - 1;
                                                                int i111 = (~((i4 ^ 1) | (i4 & 1))) * 933;
                                                                try {
                                                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder((i110 ^ i111) + ((i110 & i111) << 1));
                                                                    sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                                                                    int i112 = 0;
                                                                    while (i112 < i4) {
                                                                        if (z6) {
                                                                            getOutputMinFrameDurationlomOqCM = (getOutputMinFrameDuration + 103) % 128;
                                                                            int nextInt = random3.nextInt(26);
                                                                            if (random3.nextBoolean()) {
                                                                                int i113 = -(-nextInt);
                                                                                i7 = (i113 ^ 65) + ((i113 & 65) << 1);
                                                                                i5 = i4;
                                                                                i2 = i;
                                                                                z8 = z6;
                                                                            } else {
                                                                                int i114 = i;
                                                                                try {
                                                                                    int currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                                                                                    int i115 = (nextInt * (-445)) - 42720;
                                                                                    i5 = i4;
                                                                                    int i116 = ~nextInt;
                                                                                    z8 = z6;
                                                                                    int i117 = ~((i116 ^ (-97)) | (i116 & (-97)));
                                                                                    i2 = i114;
                                                                                    int i118 = ~((~currentTimeMillis10) | (-97));
                                                                                    int i119 = -(-(((i117 ^ i118) | (i118 & i117)) * 446));
                                                                                    int i120 = (i115 ^ i119) + ((i115 & i119) << 1);
                                                                                    int i121 = nextInt | (-97);
                                                                                    int i122 = ((~((i121 & currentTimeMillis10) | (i121 ^ currentTimeMillis10))) | (~((i116 ^ 96) | (i116 & 96)))) * 446;
                                                                                    i7 = (i120 & i122) + (i122 | i120) + ((~(i116 | (-97))) * 446);
                                                                                } catch (java.lang.Throwable th16) {
                                                                                    th = th16;
                                                                                    i2 = i114;
                                                                                    obj7 = th;
                                                                                    obj6 = obj7;
                                                                                    z4 = z;
                                                                                    c17 = 3;
                                                                                    c16 = 'S';
                                                                                    obj4 = obj6;
                                                                                    c6 = c17;
                                                                                    c5 = c16;
                                                                                    while (i3 < 7) {
                                                                                    }
                                                                                    byte[] bArr142 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                    java.lang.String highSpeedVideoFpsRangesFor42 = getHighSpeedVideoFpsRangesFor((short) 1024, bArr142[184], bArr142[662]);
                                                                                    int i1042 = getHighSpeedVideoFpsRanges;
                                                                                    Camera2StreamConfigurationMap = ((i1042 & 45) + (i1042 | 45)) % 128;
                                                                                    throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr142[280], (short) (-bArr142[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(highSpeedVideoFpsRangesFor42, obj4));
                                                                                }
                                                                            }
                                                                            try {
                                                                                sb3.append((char) i7);
                                                                                random2 = random3;
                                                                                i6 = 1;
                                                                            } catch (java.lang.Throwable th17) {
                                                                                th = th17;
                                                                                obj7 = th;
                                                                                obj6 = obj7;
                                                                                z4 = z;
                                                                                c17 = 3;
                                                                                c16 = 'S';
                                                                                obj4 = obj6;
                                                                                c6 = c17;
                                                                                c5 = c16;
                                                                                while (i3 < 7) {
                                                                                }
                                                                                byte[] bArr1422 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                java.lang.String highSpeedVideoFpsRangesFor422 = getHighSpeedVideoFpsRangesFor((short) 1024, bArr1422[184], bArr1422[662]);
                                                                                int i10422 = getHighSpeedVideoFpsRanges;
                                                                                Camera2StreamConfigurationMap = ((i10422 & 45) + (i10422 | 45)) % 128;
                                                                                throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr1422[280], (short) (-bArr1422[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(highSpeedVideoFpsRangesFor422, obj4));
                                                                            }
                                                                        } else {
                                                                            i5 = i4;
                                                                            i2 = i;
                                                                            z8 = z6;
                                                                            int nextInt2 = random3.nextInt(12);
                                                                            int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                                                                            int i123 = nextInt2 * 860;
                                                                            int i124 = (((((-7028736) | i123) << 1) - (i123 ^ (-7028736))) - (~(-(-((nextInt2 | currentTimeMillis11) * (-859)))))) - 1;
                                                                            int i125 = ~currentTimeMillis11;
                                                                            int i126 = ~((i125 ^ nextInt2) | (i125 & nextInt2));
                                                                            int i127 = ~nextInt2;
                                                                            random2 = random3;
                                                                            int i128 = ~(currentTimeMillis11 | (i127 ^ (-8193)) | (i127 & (-8193)));
                                                                            int i129 = ((i128 ^ i126) | (i128 & i126)) * 859;
                                                                            int i130 = ((i124 | i129) << 1) - (i129 ^ i124);
                                                                            int i131 = ~((i125 & (-8193)) | (i125 ^ (-8193)));
                                                                            int i132 = ~((nextInt2 ^ (-8193)) | (nextInt2 & (-8193)));
                                                                            int i133 = ((i132 ^ i131) | (i131 & i132)) * 859;
                                                                            i6 = 1;
                                                                            sb3.append((char) (((i130 | i133) << 1) - (i133 ^ i130)));
                                                                        }
                                                                        int i134 = (i112 ^ (-23)) + ((i112 & (-23)) << i6);
                                                                        i112 = (i134 ^ 24) + ((i134 & 24) << i6);
                                                                        i4 = i5;
                                                                        i = i2;
                                                                        random3 = random2;
                                                                        z6 = z8;
                                                                    }
                                                                    i2 = i;
                                                                    random = random3;
                                                                    z7 = z6;
                                                                    obj14 = sb3.toString();
                                                                } catch (java.lang.Throwable th18) {
                                                                    th = th18;
                                                                    i2 = i;
                                                                }
                                                            } catch (java.lang.Throwable th19) {
                                                                th = th19;
                                                                i2 = i;
                                                                zArr6 = zArr3;
                                                                obj7 = th;
                                                                obj6 = obj7;
                                                                z4 = z;
                                                                c17 = 3;
                                                                c16 = 'S';
                                                                obj4 = obj6;
                                                                c6 = c17;
                                                                c5 = c16;
                                                                while (i3 < 7) {
                                                                }
                                                                byte[] bArr14222 = getHighResolutionOutputSizeshNQ4ISI;
                                                                java.lang.String highSpeedVideoFpsRangesFor4222 = getHighSpeedVideoFpsRangesFor((short) 1024, bArr14222[184], bArr14222[662]);
                                                                int i104222 = getHighSpeedVideoFpsRanges;
                                                                Camera2StreamConfigurationMap = ((i104222 & 45) + (i104222 | 45)) % 128;
                                                                throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr14222[280], (short) (-bArr14222[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(highSpeedVideoFpsRangesFor4222, obj4));
                                                            }
                                                        } catch (java.lang.Throwable th20) {
                                                            th = th20;
                                                            objArr2 = objArr;
                                                            zArr5 = zArr2;
                                                            i2 = i;
                                                            zArr6 = zArr3;
                                                            obj7 = th;
                                                            obj6 = obj7;
                                                            z4 = z;
                                                            c17 = 3;
                                                            c16 = 'S';
                                                            obj4 = obj6;
                                                            c6 = c17;
                                                            c5 = c16;
                                                            while (i3 < 7) {
                                                            }
                                                            byte[] bArr142222 = getHighResolutionOutputSizeshNQ4ISI;
                                                            java.lang.String highSpeedVideoFpsRangesFor42222 = getHighSpeedVideoFpsRangesFor((short) 1024, bArr142222[184], bArr142222[662]);
                                                            int i1042222 = getHighSpeedVideoFpsRanges;
                                                            Camera2StreamConfigurationMap = ((i1042222 & 45) + (i1042222 | 45)) % 128;
                                                            throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr142222[280], (short) (-bArr142222[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(highSpeedVideoFpsRangesFor42222, obj4));
                                                        }
                                                        if (obj9 == null) {
                                                            try {
                                                                int i135 = getHighSpeedVideoSizes;
                                                                byte[] bArr16 = getHighResolutionOutputSizeshNQ4ISI;
                                                                obj9 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i135 ^ 10) | (i135 & 10)), bArr16[488], (short) (-bArr16[209]))).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) (i135 | 10), bArr16[488], (short) (-bArr16[209]))), java.lang.String.class).newInstance(obj5, obj14);
                                                            } catch (java.lang.Throwable th21) {
                                                                java.lang.Throwable cause10 = th21.getCause();
                                                                if (cause10 == null) {
                                                                    throw th21;
                                                                }
                                                                throw cause10;
                                                            }
                                                        } else {
                                                            if (obj11 != null) {
                                                                if (obj10 == null) {
                                                                    try {
                                                                        int i136 = getHighSpeedVideoSizes;
                                                                        short s4 = (short) ((i136 & 10) | (i136 ^ 10));
                                                                        byte[] bArr17 = getHighResolutionOutputSizeshNQ4ISI;
                                                                        obj10 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s4, bArr17[488], (short) (-bArr17[209]))).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s4, bArr17[488], (short) (-bArr17[209]))), java.lang.String.class).newInstance(obj5, obj14);
                                                                    } catch (java.lang.Throwable th22) {
                                                                        java.lang.Throwable cause11 = th22.getCause();
                                                                        if (cause11 == null) {
                                                                            throw th22;
                                                                        }
                                                                        throw cause11;
                                                                    }
                                                                } else {
                                                                    getOutputMinFrameDuration = (getOutputMinFrameDurationlomOqCM + 61) % 128;
                                                                    try {
                                                                        short s5 = (short) (getHighSpeedVideoSizes | 10);
                                                                        byte[] bArr18 = getHighResolutionOutputSizeshNQ4ISI;
                                                                        java.lang.Object newInstance3 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s5, bArr18[488], (short) (-bArr18[209]))).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s5, bArr18[488], (short) (-bArr18[209]))), java.lang.String.class).newInstance(obj5, obj14);
                                                                        int i137 = Camera2StreamConfigurationMap;
                                                                        getHighSpeedVideoFpsRanges = ((i137 & 81) + (i137 | 81)) % 128;
                                                                        try {
                                                                            try {
                                                                                java.lang.Object newInstance4 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 319, (byte) (-bArr18[44]), (short) (-bArr18[209]))).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s5, bArr18[488], (short) (-bArr18[209])))).newInstance(newInstance3);
                                                                                int i138 = Camera2StreamConfigurationMap;
                                                                                getHighSpeedVideoFpsRanges = (((i138 | 5) << 1) - (i138 ^ 5)) % 128;
                                                                                try {
                                                                                    java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 319, (byte) (-bArr18[44]), (short) (-bArr18[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 342, bArr18[83], bArr18[19]), null).invoke(newInstance4, null);
                                                                                    obj8 = newInstance3;
                                                                                    zArr = zArr4;
                                                                                    z2 = z3;
                                                                                    objArr = objArr2;
                                                                                    zArr2 = zArr5;
                                                                                    i = i2;
                                                                                    zArr3 = zArr6;
                                                                                    random3 = random;
                                                                                    z6 = z7;
                                                                                } catch (java.lang.Throwable th23) {
                                                                                    java.lang.Throwable cause12 = th23.getCause();
                                                                                    if (cause12 == null) {
                                                                                        throw th23;
                                                                                    }
                                                                                    throw cause12;
                                                                                }
                                                                            } catch (java.lang.Exception e) {
                                                                                try {
                                                                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                                                                    byte[] bArr19 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                    sb4.append(getHighSpeedVideoFpsRangesFor((short) 346, bArr19[83], bArr19[662]));
                                                                                    sb4.append(newInstance3);
                                                                                    sb4.append(getHighSpeedVideoFpsRangesFor((short) 285, bArr19[0], bArr19[29]));
                                                                                    try {
                                                                                        throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr19[280], (short) (-bArr19[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb4.toString(), e));
                                                                                    } catch (java.lang.Throwable th24) {
                                                                                        java.lang.Throwable cause13 = th24.getCause();
                                                                                        if (cause13 == null) {
                                                                                            throw th24;
                                                                                        }
                                                                                        throw cause13;
                                                                                    }
                                                                                } catch (java.lang.Throwable th25) {
                                                                                    obj6 = th25;
                                                                                }
                                                                            }
                                                                        } catch (java.lang.Throwable th26) {
                                                                            java.lang.Throwable cause14 = th26.getCause();
                                                                            if (cause14 == null) {
                                                                                throw th26;
                                                                            }
                                                                            throw cause14;
                                                                        }
                                                                    } catch (java.lang.Throwable th27) {
                                                                        java.lang.Throwable cause15 = th27.getCause();
                                                                        if (cause15 == null) {
                                                                            throw th27;
                                                                        }
                                                                        throw cause15;
                                                                    }
                                                                }
                                                                obj6 = th25;
                                                                z4 = z;
                                                                c17 = 3;
                                                                c16 = 'S';
                                                                obj4 = obj6;
                                                                c6 = c17;
                                                                c5 = c16;
                                                                for (i3 = (i2 & 1) + (i2 | 1); i3 < 7; i3++) {
                                                                    if (zArr6[i3]) {
                                                                        getOutputSizes = null;
                                                                        getOutputFormats = null;
                                                                        c12 = c6;
                                                                        c13 = c5;
                                                                    }
                                                                }
                                                                byte[] bArr1422222 = getHighResolutionOutputSizeshNQ4ISI;
                                                                java.lang.String highSpeedVideoFpsRangesFor422222 = getHighSpeedVideoFpsRangesFor((short) 1024, bArr1422222[184], bArr1422222[662]);
                                                                int i10422222 = getHighSpeedVideoFpsRanges;
                                                                Camera2StreamConfigurationMap = ((i10422222 & 45) + (i10422222 | 45)) % 128;
                                                                throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr1422222[280], (short) (-bArr1422222[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(highSpeedVideoFpsRangesFor422222, obj4));
                                                            }
                                                            try {
                                                                short s6 = (short) (getHighSpeedVideoSizes | 10);
                                                                byte[] bArr20 = getHighResolutionOutputSizeshNQ4ISI;
                                                                obj11 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s6, bArr20[488], (short) (-bArr20[209]))).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s6, bArr20[488], (short) (-bArr20[209]))), java.lang.String.class).newInstance(obj5, obj14);
                                                            } catch (java.lang.Throwable th28) {
                                                                java.lang.Throwable cause16 = th28.getCause();
                                                                if (cause16 == null) {
                                                                    throw th28;
                                                                }
                                                                throw cause16;
                                                            }
                                                        }
                                                        zArr = zArr4;
                                                        z2 = z3;
                                                        objArr = objArr2;
                                                        zArr2 = zArr5;
                                                        obj8 = obj13;
                                                        i = i2;
                                                        zArr3 = zArr6;
                                                        random3 = random;
                                                        z6 = z7;
                                                    }
                                                    z3 = z2;
                                                    zArr4 = zArr;
                                                    obj12 = obj8;
                                                    objArr2 = objArr;
                                                    zArr5 = zArr2;
                                                    i2 = i;
                                                    zArr6 = zArr3;
                                                    r3 = obj9;
                                                } catch (java.lang.Throwable th29) {
                                                    java.lang.Throwable cause17 = th29.getCause();
                                                    if (cause17 == null) {
                                                        throw th29;
                                                    }
                                                    throw cause17;
                                                }
                                            } catch (java.lang.Throwable th30) {
                                                java.lang.Throwable cause18 = th30.getCause();
                                                if (cause18 == null) {
                                                    throw th30;
                                                }
                                                throw cause18;
                                            }
                                        } else {
                                            z3 = z2;
                                            zArr4 = zArr;
                                            objArr2 = objArr;
                                            zArr5 = zArr2;
                                            i2 = i;
                                            zArr6 = zArr3;
                                            r3 = 0;
                                            obj10 = null;
                                            obj11 = null;
                                            obj12 = null;
                                        }
                                        try {
                                            byte[] bArr21 = getHighResolutionOutputSizeshNQ4ISI;
                                            java.lang.String highSpeedVideoFpsRangesFor5 = getHighSpeedVideoFpsRangesFor((short) 350, bArr21[7], bArr21[13]);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            java.lang.String str3 = (java.lang.String) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 398, bArr21[488], (short) (-bArr21[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 409, bArr21[834], (short) (-bArr21[40])), null).invoke(java.lang.Class.class.getMethod(getHighSpeedVideoFpsRangesFor((short) 388, (byte) ((-2) - (~bArr21[313])), (short) (-bArr21[40])), java.lang.String.class).invoke(util.h.xy.dd.b.class, highSpeedVideoFpsRangesFor5), null);
                                                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                                            sb5.append(getHighSpeedVideoFpsRangesFor((short) 415, bArr21[0], bArr21[7]));
                                                            sb5.append(highSpeedVideoFpsRangesFor5);
                                                            try {
                                                                java.util.zip.ZipFile zipFile11 = new java.util.zip.ZipFile(str3.substring(5, str3.lastIndexOf(sb5.toString())));
                                                                try {
                                                                    bArr = new byte[7569];
                                                                    try {
                                                                        objArr3 = new java.lang.Object[]{zipFile11.getInputStream(zipFile11.getEntry(highSpeedVideoFpsRangesFor5.substring(1)))};
                                                                        cls2 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 415, bArr21[62], (short) (-bArr21[209])));
                                                                        i8 = getHighSpeedVideoSizes;
                                                                        obj15 = r3;
                                                                        r10 = new java.lang.Class[]{java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) (i8 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE), bArr21[280], (short) (-bArr21[209])))};
                                                                        r3 = cls2.getDeclaredConstructor(r10);
                                                                    } catch (java.lang.Throwable th31) {
                                                                        z4 = z;
                                                                        zipFile = zipFile11;
                                                                        c9 = 'S';
                                                                        c9 = 'S';
                                                                        try {
                                                                            java.lang.Throwable cause19 = th31.getCause();
                                                                            try {
                                                                                if (cause19 != null) {
                                                                                    throw cause19;
                                                                                }
                                                                                getOutputMinFrameDurationlomOqCM = (getOutputMinFrameDuration + 3) % 128;
                                                                                throw th31;
                                                                            } catch (java.lang.Throwable th32) {
                                                                                th = th32;
                                                                                th = th;
                                                                                c4 = r3;
                                                                                c3 = c9;
                                                                                zipFile2 = zipFile;
                                                                                try {
                                                                                    try {
                                                                                        zipFile2.close();
                                                                                        throw th;
                                                                                    } catch (java.lang.Throwable th33) {
                                                                                        th.addSuppressed(th33);
                                                                                        throw th;
                                                                                    }
                                                                                } catch (java.lang.Throwable th34) {
                                                                                    th = th34;
                                                                                    obj4 = th;
                                                                                    c6 = c4;
                                                                                    c5 = c3;
                                                                                    while (i3 < 7) {
                                                                                    }
                                                                                    byte[] bArr14222222 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                    java.lang.String highSpeedVideoFpsRangesFor4222222 = getHighSpeedVideoFpsRangesFor((short) 1024, bArr14222222[184], bArr14222222[662]);
                                                                                    int i104222222 = getHighSpeedVideoFpsRanges;
                                                                                    Camera2StreamConfigurationMap = ((i104222222 & 45) + (i104222222 | 45)) % 128;
                                                                                    throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr14222222[280], (short) (-bArr14222222[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(highSpeedVideoFpsRangesFor4222222, obj4));
                                                                                }
                                                                            }
                                                                        } catch (java.lang.Throwable th35) {
                                                                            th = th35;
                                                                            r3 = 3;
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th36) {
                                                                    th = th36;
                                                                    z4 = z;
                                                                    zipFile = zipFile11;
                                                                    r3 = 3;
                                                                    c9 = 'S';
                                                                }
                                                                try {
                                                                    java.lang.Object[] objArr7 = {r3.newInstance(objArr3)};
                                                                    ?? cls7 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 459, bArr21[184], (short) (-bArr21[209])));
                                                                    short s7 = (short) ((i8 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) | (i8 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE));
                                                                    byte b8 = bArr21[280];
                                                                    r10 = (short) (-bArr21[209]);
                                                                    cls2 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s7, b8, r10));
                                                                    java.lang.Object newInstance5 = cls7.getDeclaredConstructor(new java.lang.Class[]{cls2}).newInstance(objArr7);
                                                                    try {
                                                                        ?? cls8 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 459, bArr21[184], (short) (-bArr21[209])));
                                                                        byte b9 = bArr21[168];
                                                                        byte b10 = bArr21[1];
                                                                        java.lang.String highSpeedVideoFpsRangesFor6 = getHighSpeedVideoFpsRangesFor((short) 481, b9, (short) ((~b10) + (b10 << 1)));
                                                                        r10 = new java.lang.Class[]{cls};
                                                                        cls2 = cls8.getMethod(highSpeedVideoFpsRangesFor6, r10);
                                                                        cls2.invoke(newInstance5, bArr);
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 459, bArr21[184], (short) (-bArr21[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 342, bArr21[83], bArr21[19]), null).invoke(newInstance5, null);
                                                                                    int i139 = 7530;
                                                                                    int i140 = 17;
                                                                                    java.lang.String str4 = str;
                                                                                    java.lang.Class cls9 = null;
                                                                                    r10 = r10;
                                                                                    while (true) {
                                                                                        try {
                                                                                            long j = 1;
                                                                                            int i141 = 0;
                                                                                            while (i141 < bArr.length) {
                                                                                                try {
                                                                                                    j = ((bArr[i141] + (j << 6)) + (j << 16)) - j;
                                                                                                    i141 = (i141 | 1) + (i141 & 1);
                                                                                                    obj11 = obj11;
                                                                                                    obj10 = obj10;
                                                                                                } catch (java.lang.Throwable th37) {
                                                                                                    th = th37;
                                                                                                    z4 = z;
                                                                                                    zipFile6 = zipFile11;
                                                                                                    zipFile8 = zipFile6;
                                                                                                    c14 = 'S';
                                                                                                    c10 = c14;
                                                                                                    zipFile3 = zipFile8;
                                                                                                    c4 = 3;
                                                                                                    c3 = c10;
                                                                                                    zipFile2 = zipFile3;
                                                                                                    zipFile2.close();
                                                                                                    throw th;
                                                                                                }
                                                                                            }
                                                                                            obj16 = obj10;
                                                                                            obj17 = obj11;
                                                                                            int currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
                                                                                            int i142 = i140 * (-107);
                                                                                            int i143 = ~currentTimeMillis12;
                                                                                            i9 = i139;
                                                                                            int i144 = (415305 ^ i142) + ((i142 & 415305) << 1) + (((~((i140 & (-7552)) | (i140 ^ (-7552)))) | (~((i143 ^ i140) | (i143 & i140)))) * (-108));
                                                                                            int i145 = ~((currentTimeMillis12 ^ (-7552)) | (currentTimeMillis12 & (-7552)));
                                                                                            int i146 = ~((~i140) | 7551);
                                                                                            int i147 = i145 | i146;
                                                                                            int i148 = ~((i143 & 7551) | (i143 ^ 7551));
                                                                                            int i149 = ((i147 ^ i148) | (i148 & i147)) * 54;
                                                                                            int i150 = (i144 ^ i149) + ((i149 & i144) << 1);
                                                                                            int i151 = -(-(((i146 & currentTimeMillis12) | (currentTimeMillis12 ^ i146)) * 54));
                                                                                            byte b11 = bArr[(i150 ^ i151) + ((i151 & i150) << 1)];
                                                                                            int currentTimeMillis13 = (int) java.lang.System.currentTimeMillis();
                                                                                            int i152 = -(-(b11 * org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT));
                                                                                            int i153 = (i152 & 4130) + (i152 | 4130);
                                                                                            int i154 = ~b11;
                                                                                            int i155 = ((~(b11 | 59 | currentTimeMillis13)) | (~((i154 ^ (-60)) | (i154 & (-60)) | currentTimeMillis13))) * 69;
                                                                                            int i156 = ((i153 | i155) << 1) - (i153 ^ i155);
                                                                                            int i157 = ~((b11 ^ (-60)) | (b11 & (-60)));
                                                                                            int i158 = ~((currentTimeMillis13 ^ (-60)) | (currentTimeMillis13 & (-60)));
                                                                                            int i159 = (i157 ^ i158) | (i157 & i158);
                                                                                            int i160 = ~((b11 & currentTimeMillis13) | (b11 ^ currentTimeMillis13));
                                                                                            int i161 = ((i160 & i159) | (i159 ^ i160)) * (-69);
                                                                                            bArr[i140 + com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED] = (byte) ((((i156 ^ i161) + ((i161 & i156) << 1)) - (~((~((i154 ^ 59) | (i154 & 59))) * 69))) - 1);
                                                                                            int length = bArr.length;
                                                                                            int i162 = -i140;
                                                                                            int currentTimeMillis14 = (int) java.lang.System.currentTimeMillis();
                                                                                            int i163 = i162 * 868;
                                                                                            int i164 = -(-(length * 868));
                                                                                            int i165 = ~i162;
                                                                                            java.lang.Class cls10 = cls9;
                                                                                            int i166 = ~currentTimeMillis14;
                                                                                            zipFile6 = zipFile11;
                                                                                            int i167 = ~((i165 ^ i166) | (i166 & i165));
                                                                                            str2 = str4;
                                                                                            cls2 = ~length;
                                                                                            z4 = z;
                                                                                            int i168 = ~((cls2 ^ i166) | (cls2 & i166));
                                                                                            int i169 = ((((i163 | i164) << 1) - (i163 ^ i164)) - (~(-(-(((i168 & i167) | (i167 ^ i168)) * (-867)))))) - 1;
                                                                                            int i170 = (i165 ^ cls2) | (i165 & cls2);
                                                                                            int i171 = ~i170;
                                                                                            int i172 = ~((i165 ^ currentTimeMillis14) | (i165 & currentTimeMillis14));
                                                                                            int i173 = (i171 & i172) | (i171 ^ i172);
                                                                                            int i174 = ~((cls2 ^ currentTimeMillis14) | (cls2 & currentTimeMillis14));
                                                                                            int i175 = ((i173 & i174) | (i173 ^ i174)) * (-1734);
                                                                                            int i176 = (i169 & i175) + (i169 | i175);
                                                                                            int i177 = ~((i166 & i170) | (i170 ^ i166));
                                                                                            int i178 = (length & i165) | (i165 ^ length);
                                                                                            int i179 = ~((i178 ^ currentTimeMillis14) | (i178 & currentTimeMillis14));
                                                                                            int i180 = (i179 ^ i177) | (i177 & i179);
                                                                                            int i181 = (cls2 ^ i162) | (cls2 & i162);
                                                                                            int i182 = ~((i181 ^ currentTimeMillis14) | (i181 & currentTimeMillis14));
                                                                                            int i183 = -(-(((i180 ^ i182) | (i180 & i182)) * 867));
                                                                                            try {
                                                                                                java.lang.Object[] objArr8 = {bArr, java.lang.Integer.valueOf(i140), java.lang.Integer.valueOf((i176 & i183) + (i183 | i176))};
                                                                                                bArr2 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                cls2 = 2;
                                                                                                java.lang.Object newInstance6 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 489, bArr2[42], (short) (-bArr2[209]))).getDeclaredConstructor(cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE).newInstance(objArr8);
                                                                                                try {
                                                                                                    java.lang.Object obj20 = getOutputSizes;
                                                                                                    if (obj20 == null) {
                                                                                                        try {
                                                                                                            getOutputSizeshNQ4ISI = j;
                                                                                                            int elapsedRealtimeNanos = (int) (((android.os.SystemClock.elapsedRealtimeNanos() >> 60) - 1225682320600446851L) ^ j);
                                                                                                            int i184 = -(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                                                            byte[] bArr22 = new byte[16];
                                                                                                            try {
                                                                                                                java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 211, (byte) (-bArr2[84]), (short) (-bArr2[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 516, bArr2[168], (short) (bArr2[360] - 1)), java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, new byte[]{59, -31, 116, 62, -3, 47, 62, 6, -127, -45, -91, -33, 1, -12, -113, -13}, java.lang.Integer.valueOf((int) (getOutputSizeshNQ4ISI ^ ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() >> 32) - 1225682320600446855L))), bArr22, java.lang.Integer.valueOf((int) (getOutputSizeshNQ4ISI ^ ((-1225682320600446855L) - (android.os.SystemClock.currentThreadTimeMillis() >> 48)))), 16);
                                                                                                                util.h.xy.dc.a.m26265(bArr22, getOutputStallDuration, getOutputStallDurationlomOqCM);
                                                                                                                try {
                                                                                                                    java.lang.Object[] objArr9 = {newInstance6, java.lang.Integer.valueOf(elapsedRealtimeNanos), bArr22, util.h.xy.dc.b.m26266(((664564425 | i184) << 1) - (i184 ^ 664564425))};
                                                                                                                    java.lang.Class<?> cls11 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 524, bArr2[434], 84));
                                                                                                                    int i185 = getHighSpeedVideoSizes;
                                                                                                                    newInstance = cls11.getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i185 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) | (i185 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)), bArr2[280], (short) (-bArr2[209]))), java.lang.Integer.TYPE, cls, byte[][].class).newInstance(objArr9);
                                                                                                                } catch (java.lang.Throwable th38) {
                                                                                                                    java.lang.Throwable cause20 = th38.getCause();
                                                                                                                    if (cause20 == null) {
                                                                                                                        throw th38;
                                                                                                                    }
                                                                                                                    throw cause20;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th39) {
                                                                                                                java.lang.Throwable cause21 = th39.getCause();
                                                                                                                if (cause21 == null) {
                                                                                                                    throw th39;
                                                                                                                }
                                                                                                                throw cause21;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th40) {
                                                                                                            th = th40;
                                                                                                            zipFile8 = zipFile6;
                                                                                                            c14 = 'S';
                                                                                                            c10 = c14;
                                                                                                            zipFile3 = zipFile8;
                                                                                                            c4 = 3;
                                                                                                            c3 = c10;
                                                                                                            zipFile2 = zipFile3;
                                                                                                            zipFile2.close();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } else {
                                                                                                        isOutputSupportedForhNQ4ISI = j;
                                                                                                        try {
                                                                                                            objArr4 = new java.lang.Object[]{newInstance6, new byte[]{2, -42, 76, com.google.common.base.Ascii.FF, -6, com.google.common.base.Ascii.SI, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 70, -126, -12, 35, 101, 72, -61, -61, 88}, java.lang.Integer.valueOf((int) (((android.view.ViewConfiguration.getGlobalActionKeyTimeout() >> 32) - 7374707101992134936L) ^ j)), java.lang.Integer.valueOf((int) (isOutputSupportedForhNQ4ISI ^ ((android.os.SystemClock.uptimeMillis() >> 48) + 7374707102638825569L)))};
                                                                                                        } catch (java.lang.Throwable th41) {
                                                                                                            th = th41;
                                                                                                        }
                                                                                                        try {
                                                                                                            java.lang.Class<?> cls12 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 538, bArr2[906], 84), true, (java.lang.ClassLoader) getOutputFormats);
                                                                                                            java.lang.String highSpeedVideoFpsRangesFor7 = getHighSpeedVideoFpsRangesFor((short) 554, bArr2[0], 682);
                                                                                                            int i186 = getHighSpeedVideoSizes;
                                                                                                            newInstance = cls12.getMethod(highSpeedVideoFpsRangesFor7, java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i186 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) | (i186 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)), bArr2[280], (short) (-bArr2[209]))), cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(obj20, objArr4);
                                                                                                        } catch (java.lang.Throwable th42) {
                                                                                                            th = th42;
                                                                                                            java.lang.Throwable th43 = th;
                                                                                                            java.lang.Throwable cause22 = th43.getCause();
                                                                                                            if (cause22 == null) {
                                                                                                                throw th43;
                                                                                                            }
                                                                                                            throw cause22;
                                                                                                        }
                                                                                                    }
                                                                                                    i10 = getHighSpeedVideoSizes;
                                                                                                    s = (short) ((i10 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) | (i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE));
                                                                                                    java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s, bArr2[280], (short) (-bArr2[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 554, bArr2[697], bArr2[1]), java.lang.Long.TYPE).invoke(newInstance, 16);
                                                                                                } catch (java.lang.Throwable th44) {
                                                                                                    th = th44;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th45) {
                                                                                                java.lang.Throwable cause23 = th45.getCause();
                                                                                                if (cause23 == null) {
                                                                                                    throw th45;
                                                                                                }
                                                                                                throw cause23;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th46) {
                                                                                            th = th46;
                                                                                            z4 = z;
                                                                                            zipFile4 = zipFile11;
                                                                                        }
                                                                                        if (z5) {
                                                                                            try {
                                                                                                java.lang.Object obj21 = getOutputSizes;
                                                                                                java.lang.Object obj22 = obj21 == null ? obj15 : obj17;
                                                                                                java.lang.Object obj23 = obj21 == null ? obj16 : obj12;
                                                                                                java.lang.Class<?> cls13 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) (i10 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE), bArr2[280], (short) (-bArr2[209])));
                                                                                                byte b12 = bArr2[697];
                                                                                                byte b13 = bArr2[1];
                                                                                                int currentTimeMillis15 = (int) java.lang.System.currentTimeMillis();
                                                                                                int i187 = -(-(b13 * (-978)));
                                                                                                int i188 = ~b13;
                                                                                                int i189 = ~currentTimeMillis15;
                                                                                                int i190 = (((-981) - (~i187)) - (~(-(-((~((i189 & i188) | (i188 ^ i189))) * 979))))) - 1;
                                                                                                int i191 = -(-(((currentTimeMillis15 ^ (-1)) | currentTimeMillis15) * (-979)));
                                                                                                int i192 = ((i190 | i191) << 1) - (i190 ^ i191);
                                                                                                int i193 = (~((currentTimeMillis15 & i188) | (i188 ^ currentTimeMillis15))) * 979;
                                                                                                java.lang.reflect.Method method6 = cls13.getMethod(getHighSpeedVideoFpsRangesFor((short) 557, b12, (short) (((i192 | i193) << 1) - (i193 ^ i192))), cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                java.lang.Class<?> cls14 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 319, (byte) (-bArr2[44]), (short) (-bArr2[209])));
                                                                                                try {
                                                                                                    try {
                                                                                                        short s8 = (short) ((i10 & 10) | (i10 ^ 10));
                                                                                                        java.lang.Object newInstance7 = cls14.getConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s8, bArr2[488], (short) (-bArr2[209])))).newInstance(obj22);
                                                                                                        if (z4) {
                                                                                                            int i194 = getHighSpeedVideoFpsRanges + 91;
                                                                                                            Camera2StreamConfigurationMap = i194 % 128;
                                                                                                            try {
                                                                                                                if (i194 % 2 == 0) {
                                                                                                                    throw new java.lang.ArithmeticException();
                                                                                                                }
                                                                                                                try {
                                                                                                                    java.lang.Class<?> cls15 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s8, bArr2[488], (short) (-bArr2[209])));
                                                                                                                    byte b14 = bArr2[313];
                                                                                                                } catch (java.lang.Throwable th47) {
                                                                                                                    java.lang.Throwable cause24 = th47.getCause();
                                                                                                                    if (cause24 == null) {
                                                                                                                        throw th47;
                                                                                                                    }
                                                                                                                    throw cause24;
                                                                                                                }
                                                                                                            } catch (java.lang.Exception e2) {
                                                                                                                exc = e2;
                                                                                                                r102 = num;
                                                                                                                try {
                                                                                                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                                                                                                    byte[] bArr23 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                                    sb6.append(getHighSpeedVideoFpsRangesFor((short) 570, bArr23[83], bArr23[662]));
                                                                                                                    sb6.append(obj22);
                                                                                                                    sb6.append(getHighSpeedVideoFpsRangesFor((short) 285, bArr23[0], bArr23[29]));
                                                                                                                    try {
                                                                                                                        throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr23[280], (short) (-bArr23[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb6.toString(), exc));
                                                                                                                    } catch (java.lang.Throwable th48) {
                                                                                                                        java.lang.Throwable cause25 = th48.getCause();
                                                                                                                        if (cause25 == null) {
                                                                                                                            throw th48;
                                                                                                                        }
                                                                                                                        throw cause25;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th49) {
                                                                                                                    th = th49;
                                                                                                                    th2 = th;
                                                                                                                    num2 = r102;
                                                                                                                    try {
                                                                                                                        int i195 = getHighSpeedVideoSizes;
                                                                                                                        byte[] bArr24 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                                        int i196 = Camera2StreamConfigurationMap;
                                                                                                                        getHighSpeedVideoFpsRanges = ((i196 & 89) + (i196 | 89)) % 128;
                                                                                                                        try {
                                                                                                                            throw th2;
                                                                                                                        } catch (java.lang.Throwable th50) {
                                                                                                                            java.lang.Throwable cause26 = th50.getCause();
                                                                                                                            if (cause26 == null) {
                                                                                                                                throw th50;
                                                                                                                            }
                                                                                                                            throw cause26;
                                                                                                                        }
                                                                                                                    } catch (java.lang.Throwable th51) {
                                                                                                                        java.lang.Throwable cause27 = th51.getCause();
                                                                                                                        if (cause27 != null) {
                                                                                                                            throw cause27;
                                                                                                                        }
                                                                                                                        int i197 = getOutputMinFrameDuration + 29;
                                                                                                                        getOutputMinFrameDurationlomOqCM = i197 % 128;
                                                                                                                        if (i197 % 2 != 0) {
                                                                                                                            throw th51;
                                                                                                                        }
                                                                                                                        throw new java.lang.NullPointerException();
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        int i198 = getOutputMinFrameDurationlomOqCM + 101;
                                                                                                        getOutputMinFrameDuration = i198 % 128;
                                                                                                        if (i198 % 2 != 0) {
                                                                                                            int i199 = getHighSpeedVideoFpsRanges;
                                                                                                            i11 = (((i199 | 111) << 1) * (i199 ^ 111)) / 15337;
                                                                                                        } else {
                                                                                                            int i200 = getHighSpeedVideoFpsRanges;
                                                                                                            i11 = (((i200 | 27) << 1) - (i200 ^ 27)) % 128;
                                                                                                        }
                                                                                                        Camera2StreamConfigurationMap = i11;
                                                                                                        byte[] bArr25 = new byte[1024];
                                                                                                        java.lang.reflect.Method method7 = cls14.getMethod(getHighSpeedVideoFpsRangesFor((short) 574, bArr2[83], 86), cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        int i201 = i9;
                                                                                                        while (i201 > 0) {
                                                                                                            try {
                                                                                                                int intValue2 = ((java.lang.Integer) method6.invoke(newInstance, bArr25, num, java.lang.Integer.valueOf(java.lang.Math.min(1024, i201)))).intValue();
                                                                                                                if (intValue2 == -1) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                method7.invoke(newInstance7, bArr25, num, java.lang.Integer.valueOf(intValue2));
                                                                                                                int i202 = -intValue2;
                                                                                                                int currentTimeMillis16 = (int) java.lang.System.currentTimeMillis();
                                                                                                                int i203 = i202 * 236;
                                                                                                                int i204 = i201 * 471;
                                                                                                                java.lang.reflect.Method method8 = method7;
                                                                                                                int i205 = ~i202;
                                                                                                                int i206 = (((((i203 | i204) << 1) - (i204 ^ i203)) - (~(-(-(((~((~currentTimeMillis16) | i205)) | i201) * (-235)))))) - 1) + (((~(i205 | currentTimeMillis16)) | i201) * (-470));
                                                                                                                int i207 = ~i201;
                                                                                                                int i208 = ~((i207 & i202) | (i207 ^ i202));
                                                                                                                int i209 = (i205 & i201) | (i205 ^ i201);
                                                                                                                int i210 = ~((i209 ^ currentTimeMillis16) | (i209 & currentTimeMillis16));
                                                                                                                int i211 = ((i210 ^ i208) | (i210 & i208)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
                                                                                                                i201 = (i206 | i211) + (i206 & i211);
                                                                                                                method7 = method8;
                                                                                                            } catch (java.lang.Throwable th52) {
                                                                                                                th2 = th52;
                                                                                                                num2 = num;
                                                                                                                int i1952 = getHighSpeedVideoSizes;
                                                                                                                byte[] bArr242 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                                int i1962 = Camera2StreamConfigurationMap;
                                                                                                                getHighSpeedVideoFpsRanges = ((i1962 & 89) + (i1962 | 89)) % 128;
                                                                                                                throw th2;
                                                                                                            }
                                                                                                        }
                                                                                                        byte[] bArr26 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                        java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 582, bArr26[576], (short) (-bArr26[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 603, bArr26[697], bArr26[1]), new java.lang.Class[0]).invoke(cls14.getMethod(getHighSpeedVideoFpsRangesFor((short) 578, bArr26[83], (short) (-bArr26[40])), new java.lang.Class[0]).invoke(newInstance7, new java.lang.Object[0]), new java.lang.Object[0]);
                                                                                                        cls14.getMethod(getHighSpeedVideoFpsRangesFor((short) 342, bArr26[83], bArr26[19]), new java.lang.Class[0]).invoke(newInstance7, new java.lang.Object[0]);
                                                                                                        java.lang.Class<?> cls16 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 606, bArr26[193], bArr26[409]));
                                                                                                        byte b15 = bArr26[834];
                                                                                                        byte b16 = bArr26[1034];
                                                                                                        int currentTimeMillis17 = (int) java.lang.System.currentTimeMillis();
                                                                                                        int i212 = (-570) - (~(b16 * 569));
                                                                                                        int i213 = ~b16;
                                                                                                        int i214 = ~i213;
                                                                                                        int i215 = ~currentTimeMillis17;
                                                                                                        int i216 = ~i215;
                                                                                                        int i217 = ((i214 & i216) | (i214 ^ i216) | (~((i213 ^ i215) | (i213 & i215)))) * (-1136);
                                                                                                        int i218 = i216 | i215;
                                                                                                        int i219 = ~((currentTimeMillis17 & i213) | (i213 ^ currentTimeMillis17));
                                                                                                        int i220 = (((i212 | i217) << 1) - (i212 ^ i217)) + ((i219 | i215 | (~((i218 ^ b16) | (i218 & b16)))) * (-568));
                                                                                                        int i221 = ~i218;
                                                                                                        int i222 = ~((b16 ^ i215) | (i215 & b16));
                                                                                                        r102 = i221 & i222;
                                                                                                        int i223 = (i222 ^ i221) | r102;
                                                                                                        int i224 = ((i223 ^ i219) | (i223 & i219)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION;
                                                                                                        java.lang.reflect.Method declaredMethod = cls16.getDeclaredMethod(getHighSpeedVideoFpsRangesFor((short) 626, b15, (short) ((i220 ^ i224) + ((i224 & i220) << 1))), java.lang.String.class, java.lang.String.class, java.lang.Integer.TYPE);
                                                                                                        try {
                                                                                                            int i225 = getHighSpeedVideoSizes;
                                                                                                            short s9 = (short) ((i225 ^ 10) | (i225 & 10));
                                                                                                            r102 = 0;
                                                                                                            r102 = 0;
                                                                                                            java.lang.Object invoke5 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s9, bArr26[488], (short) (-bArr26[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 632, bArr26[434], (short) (-bArr26[40])), null).invoke(obj22, null);
                                                                                                            try {
                                                                                                                java.lang.Class<?> cls17 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s9, bArr26[488], (short) (-bArr26[209])));
                                                                                                                r102 = getHighSpeedVideoFpsRangesFor((short) 632, bArr26[434], (short) (-bArr26[40]));
                                                                                                                java.lang.Object invoke6 = cls17.getMethod(r102, null).invoke(obj23, null);
                                                                                                                num2 = num;
                                                                                                                invoke3 = declaredMethod.invoke(null, invoke5, invoke6, num2);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (getOutputFormats == null) {
                                                                                                                            int i226 = Camera2StreamConfigurationMap;
                                                                                                                            getHighSpeedVideoFpsRanges = (((i226 | 17) << 1) - (i226 ^ 17)) % 128;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    getOutputFormats = java.lang.Class.class.getMethod(getHighSpeedVideoFpsRangesFor((short) 651, bArr26[897], (short) (-bArr26[40])), null).invoke(util.h.xy.dd.b.class, null);
                                                                                                                                } catch (java.lang.Throwable th53) {
                                                                                                                                    java.lang.Throwable cause28 = th53.getCause();
                                                                                                                                    if (cause28 == null) {
                                                                                                                                        throw th53;
                                                                                                                                    }
                                                                                                                                    throw cause28;
                                                                                                                                }
                                                                                                                            } catch (java.lang.Throwable th54) {
                                                                                                                                th = th54;
                                                                                                                                th = th;
                                                                                                                                num = num2;
                                                                                                                                zipFile8 = zipFile6;
                                                                                                                                c14 = 'S';
                                                                                                                                c10 = c14;
                                                                                                                                zipFile3 = zipFile8;
                                                                                                                                c4 = 3;
                                                                                                                                c3 = c10;
                                                                                                                                zipFile2 = zipFile3;
                                                                                                                                zipFile2.close();
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i12 = i140;
                                                                                                                        num = num2;
                                                                                                                        z9 = z5;
                                                                                                                    } catch (java.lang.Throwable th55) {
                                                                                                                        java.lang.Throwable cause29 = th55.getCause();
                                                                                                                        if (cause29 == null) {
                                                                                                                            throw th55;
                                                                                                                        }
                                                                                                                        throw cause29;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th56) {
                                                                                                                    java.lang.Throwable cause30 = th56.getCause();
                                                                                                                    if (cause30 == null) {
                                                                                                                        throw th56;
                                                                                                                    }
                                                                                                                    throw cause30;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th57) {
                                                                                                                java.lang.Throwable cause31 = th57.getCause();
                                                                                                                if (cause31 == null) {
                                                                                                                    throw th57;
                                                                                                                }
                                                                                                                throw cause31;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th58) {
                                                                                                            java.lang.Throwable cause32 = th58.getCause();
                                                                                                            if (cause32 == null) {
                                                                                                                throw th58;
                                                                                                            }
                                                                                                            throw cause32;
                                                                                                        }
                                                                                                    } catch (java.lang.Exception e3) {
                                                                                                        r102 = num;
                                                                                                        exc = e3;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th59) {
                                                                                                    th = th59;
                                                                                                    r102 = num;
                                                                                                    th2 = th;
                                                                                                    num2 = r102;
                                                                                                    int i19522 = getHighSpeedVideoSizes;
                                                                                                    byte[] bArr2422 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                    int i19622 = Camera2StreamConfigurationMap;
                                                                                                    getHighSpeedVideoFpsRanges = ((i19622 & 89) + (i19622 | 89)) % 128;
                                                                                                    throw th2;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th60) {
                                                                                                th = th60;
                                                                                                num2 = num;
                                                                                            }
                                                                                        } else {
                                                                                            r10 = num;
                                                                                            try {
                                                                                                java.lang.Class<?> cls18 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 664, bArr2[42], (short) (-bArr2[209])));
                                                                                                java.lang.Class<?> cls19 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s, bArr2[280], (short) (-bArr2[209])));
                                                                                                java.lang.Object newInstance8 = cls18.getConstructor(cls19).newInstance(newInstance);
                                                                                                try {
                                                                                                    invoke4 = cls18.getMethod(getHighSpeedVideoFpsRangesFor((short) ((i10 ^ my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID) | (i10 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID)), bArr2[488], (short) (-bArr2[40])), new java.lang.Class[0]).invoke(newInstance8, new java.lang.Object[0]);
                                                                                                    cls2 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 702, bArr2[576], (short) (-bArr2[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 723, bArr2[834], (short) (-bArr2[40])), new java.lang.Class[0]);
                                                                                                    method = cls19.getMethod(getHighSpeedVideoFpsRangesFor((short) 557, bArr2[697], (short) (bArr2[1] - 1)), cls);
                                                                                                    try {
                                                                                                        newInstance2 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 415, bArr2[62], (short) (-bArr2[209]))).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) (i10 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE), bArr2[280], (short) (-bArr2[209])))).newInstance(newInstance8);
                                                                                                        java.lang.Class<?> cls20 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 729, bArr2[80], (short) (-bArr2[209])));
                                                                                                        java.lang.Object newInstance9 = cls20.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                                                                                                        try {
                                                                                                            java.lang.reflect.Method method9 = cls20.getMethod(getHighSpeedVideoFpsRangesFor((short) 574, bArr2[83], 86), cls, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                            short s10 = (short) ((i10 ^ 580) | (i10 & 580));
                                                                                                            byte b17 = bArr2[313];
                                                                                                            num = r10;
                                                                                                            int currentTimeMillis18 = (int) java.lang.System.currentTimeMillis();
                                                                                                            int i227 = -(-(b17 * (-565)));
                                                                                                            i12 = i140;
                                                                                                            int i228 = (i227 & (-567)) + (i227 | (-567));
                                                                                                            int i229 = ~b17;
                                                                                                            int i230 = ~currentTimeMillis18;
                                                                                                            int i231 = -(-(((i229 ^ i230) | (i230 & i229)) * (-566)));
                                                                                                            byte b18 = (byte) (((((((i228 | i231) << 1) - (i228 ^ i231)) - (~(-(-((~((~i229) | i229)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))))) - 1) - (~((~(currentTimeMillis18 | i229)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) - 1);
                                                                                                            byte b19 = bArr2[1];
                                                                                                            boolean z12 = z5;
                                                                                                            int currentTimeMillis19 = (int) java.lang.System.currentTimeMillis();
                                                                                                            int i232 = ~b19;
                                                                                                            int i233 = (i232 ^ (-2)) | (i232 & (-2));
                                                                                                            z9 = z12;
                                                                                                            int i234 = ~currentTimeMillis19;
                                                                                                            method2 = method9;
                                                                                                            int i235 = ~((i233 ^ i234) | (i233 & i234));
                                                                                                            obj19 = newInstance9;
                                                                                                            int i236 = ~(b19 | 1);
                                                                                                            int i237 = (i235 ^ i236) | (i235 & i236);
                                                                                                            int i238 = ~(currentTimeMillis19 | b19);
                                                                                                            int i239 = ~((i232 ^ i234) | (i234 & i232));
                                                                                                            method3 = cls20.getMethod(getHighSpeedVideoFpsRangesFor(s10, b18, (short) ((b19 * (-67)) + 69 + (((i237 ^ i238) | (i237 & i238)) * (-68)) + ((~((i234 & (-2)) | (i234 ^ (-2)) | b19)) * (-68)) + (((i239 & (-2)) | (i239 ^ (-2))) * 68))), new java.lang.Class[0]);
                                                                                                            try {
                                                                                                                try {
                                                                                                                    method4 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i10 ^ 590) | (i10 & 590)), bArr2[906], (short) (-bArr2[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 342, bArr2[83], bArr2[19]), new java.lang.Class[0]);
                                                                                                                    bArr4 = new byte[1024];
                                                                                                                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 47) % 128;
                                                                                                                    i13 = 0;
                                                                                                                } catch (java.lang.Throwable th61) {
                                                                                                                    th = th61;
                                                                                                                    r10 = zipFile6;
                                                                                                                    cls2 = 83;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th62) {
                                                                                                                th = th62;
                                                                                                                c15 = 'S';
                                                                                                                zipFile5 = zipFile6;
                                                                                                                c11 = c15;
                                                                                                                cls2 = c11;
                                                                                                                r10 = zipFile5;
                                                                                                                th = th;
                                                                                                                c10 = cls2;
                                                                                                                zipFile3 = r10;
                                                                                                                c4 = 3;
                                                                                                                c3 = c10;
                                                                                                                zipFile2 = zipFile3;
                                                                                                                zipFile2.close();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th63) {
                                                                                                            th = th63;
                                                                                                            num = r10;
                                                                                                            c15 = 'S';
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th64) {
                                                                                                        java.lang.Throwable cause33 = th64.getCause();
                                                                                                        if (cause33 == null) {
                                                                                                            throw th64;
                                                                                                        }
                                                                                                        throw cause33;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th65) {
                                                                                                    th = th65;
                                                                                                    num = r10;
                                                                                                    r10 = zipFile6;
                                                                                                    cls2 = 83;
                                                                                                    th = th;
                                                                                                    c10 = cls2;
                                                                                                    zipFile3 = r10;
                                                                                                    c4 = 3;
                                                                                                    c3 = c10;
                                                                                                    zipFile2 = zipFile3;
                                                                                                    zipFile2.close();
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th66) {
                                                                                                th = th66;
                                                                                                num = r10;
                                                                                                zipFile4 = zipFile6;
                                                                                                c11 = 'S';
                                                                                                zipFile5 = zipFile4;
                                                                                                cls2 = c11;
                                                                                                r10 = zipFile5;
                                                                                                th = th;
                                                                                                c10 = cls2;
                                                                                                zipFile3 = r10;
                                                                                                c4 = 3;
                                                                                                c3 = c10;
                                                                                                zipFile2 = zipFile3;
                                                                                                zipFile2.close();
                                                                                                throw th;
                                                                                            }
                                                                                            while (true) {
                                                                                                int intValue3 = ((java.lang.Integer) method.invoke(newInstance2, bArr4)).intValue();
                                                                                                if (intValue3 <= 0) {
                                                                                                    break;
                                                                                                }
                                                                                                int i240 = Camera2StreamConfigurationMap + 67;
                                                                                                getHighSpeedVideoFpsRanges = i240 % 128;
                                                                                                if (i240 % 2 != 0) {
                                                                                                    try {
                                                                                                        if (i13 >= ((java.lang.Long) cls2.invoke(invoke4, new java.lang.Object[1])).longValue()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        java.lang.Object obj24 = obj19;
                                                                                                        java.lang.reflect.Method method10 = method2;
                                                                                                        method10.invoke(obj24, bArr4, num, java.lang.Integer.valueOf(intValue3));
                                                                                                        int currentTimeMillis20 = (int) java.lang.System.currentTimeMillis();
                                                                                                        int i241 = intValue3 * (-419);
                                                                                                        int i242 = i13 * 421;
                                                                                                        int i243 = (((i241 | i242) << 1) - (i241 ^ i242)) + ((~((i13 ^ currentTimeMillis20) | (i13 & currentTimeMillis20))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                                                                                                        int i244 = ~intValue3;
                                                                                                        int i245 = (i244 | i13) * (-420);
                                                                                                        int i246 = (i243 ^ i245) + ((i245 & i243) << 1);
                                                                                                        int i247 = ~(i244 | (~i13));
                                                                                                        int i248 = ~(i13 | (~currentTimeMillis20));
                                                                                                        int i249 = -(-(((i248 ^ i247) | (i248 & i247)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                                                                        i13 = (i249 & i246) + (i249 | i246);
                                                                                                        obj19 = obj24;
                                                                                                        method2 = method10;
                                                                                                    } catch (java.lang.Throwable th67) {
                                                                                                        th = th67;
                                                                                                        zipFile8 = zipFile6;
                                                                                                        c14 = 'S';
                                                                                                        c10 = c14;
                                                                                                        zipFile3 = zipFile8;
                                                                                                        c4 = 3;
                                                                                                        c3 = c10;
                                                                                                        zipFile2 = zipFile3;
                                                                                                        zipFile2.close();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } else {
                                                                                                    if (i13 >= ((java.lang.Long) cls2.invoke(invoke4, new java.lang.Object[0])).longValue()) {
                                                                                                        break;
                                                                                                    }
                                                                                                    java.lang.Object obj242 = obj19;
                                                                                                    java.lang.reflect.Method method102 = method2;
                                                                                                    method102.invoke(obj242, bArr4, num, java.lang.Integer.valueOf(intValue3));
                                                                                                    int currentTimeMillis202 = (int) java.lang.System.currentTimeMillis();
                                                                                                    int i2412 = intValue3 * (-419);
                                                                                                    int i2422 = i13 * 421;
                                                                                                    int i2432 = (((i2412 | i2422) << 1) - (i2412 ^ i2422)) + ((~((i13 ^ currentTimeMillis202) | (i13 & currentTimeMillis202))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                                                                                                    int i2442 = ~intValue3;
                                                                                                    int i2452 = (i2442 | i13) * (-420);
                                                                                                    int i2462 = (i2432 ^ i2452) + ((i2452 & i2432) << 1);
                                                                                                    int i2472 = ~(i2442 | (~i13));
                                                                                                    int i2482 = ~(i13 | (~currentTimeMillis202));
                                                                                                    int i2492 = -(-(((i2482 ^ i2472) | (i2482 & i2472)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                                                                    i13 = (i2492 & i2462) + (i2492 | i2462);
                                                                                                    obj19 = obj242;
                                                                                                    method2 = method102;
                                                                                                }
                                                                                                c10 = c14;
                                                                                                zipFile3 = zipFile8;
                                                                                                c4 = 3;
                                                                                                c3 = c10;
                                                                                                zipFile2 = zipFile3;
                                                                                                zipFile2.close();
                                                                                                throw th;
                                                                                            }
                                                                                            r10 = obj19;
                                                                                            byte[] bArr27 = (byte[]) method3.invoke(r10, new java.lang.Object[0]);
                                                                                            try {
                                                                                                method4.invoke(newInstance2, new java.lang.Object[0]);
                                                                                                method4.invoke(r10, new java.lang.Object[0]);
                                                                                            } catch (java.lang.Exception unused6) {
                                                                                            }
                                                                                            try {
                                                                                                byte[] bArr28 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                try {
                                                                                                    java.lang.Object invoke7 = java.lang.Class.class.getMethod(getHighSpeedVideoFpsRangesFor((short) 651, bArr28[897], (short) (-bArr28[40])), null).invoke(util.h.xy.dd.b.class, null);
                                                                                                    cls2 = 1;
                                                                                                    try {
                                                                                                        cls2 = 0;
                                                                                                        java.lang.Object newInstance10 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 783, bArr28[8], bArr28[409])).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 818, bArr28[280], (short) (-bArr28[209]))), java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 836, bArr28[193], (short) (-bArr28[209])))).newInstance(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 818, bArr28[280], (short) (-bArr28[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 856, bArr28[697], 86), cls).invoke(null, bArr27), invoke7);
                                                                                                        try {
                                                                                                            try {
                                                                                                                java.lang.reflect.Field declaredField = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 859, bArr28[5], bArr28[409])).getDeclaredField(getHighSpeedVideoFpsRangesFor((short) 890, bArr28[163], (short) (-bArr28[677])));
                                                                                                                declaredField.setAccessible(true);
                                                                                                                java.lang.Object obj25 = declaredField.get(invoke7);
                                                                                                                java.lang.Class<?> cls21 = obj25.getClass();
                                                                                                                java.lang.reflect.Field declaredField2 = cls21.getDeclaredField(getHighSpeedVideoFpsRangesFor((short) 897, (byte) (-bArr28[44]), (short) (-bArr28[534])));
                                                                                                                declaredField2.setAccessible(true);
                                                                                                                java.lang.reflect.Field declaredField3 = cls21.getDeclaredField(getHighSpeedVideoFpsRangesFor((short) 920, bArr28[13], (short) (-bArr28[534])));
                                                                                                                declaredField3.setAccessible(true);
                                                                                                                java.lang.Object obj26 = declaredField2.get(obj25);
                                                                                                                java.lang.Object obj27 = declaredField3.get(obj25);
                                                                                                                java.lang.Object obj28 = declaredField.get(newInstance10);
                                                                                                                java.util.ArrayList arrayList = new java.util.ArrayList((java.util.List) obj26);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                    } catch (java.lang.Throwable th68) {
                                                                                                                        th = th68;
                                                                                                                        zipFile9 = zipFile6;
                                                                                                                        th4 = th;
                                                                                                                        try {
                                                                                                                            cause2 = th4.getCause();
                                                                                                                            if (cause2 != null) {
                                                                                                                                throw th4;
                                                                                                                            }
                                                                                                                            throw cause2;
                                                                                                                        } catch (java.lang.Exception e4) {
                                                                                                                            e = e4;
                                                                                                                            exc2 = e;
                                                                                                                            r10 = zipFile9;
                                                                                                                            try {
                                                                                                                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                                                                                                                int i250 = getHighSpeedVideoSizes;
                                                                                                                                short s11 = (short) ((i250 ^ 782) | (i250 & 782));
                                                                                                                                byte[] bArr29 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                                                cls2 = 83;
                                                                                                                                cls2 = 83;
                                                                                                                                cls2 = 83;
                                                                                                                                try {
                                                                                                                                    sb7.append(getHighSpeedVideoFpsRangesFor(s11, bArr29[83], bArr29[662]));
                                                                                                                                    sb7.append(invoke7);
                                                                                                                                    sb7.append(getHighSpeedVideoFpsRangesFor((short) 285, bArr29[0], bArr29[29]));
                                                                                                                                    try {
                                                                                                                                        throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr29[280], (short) (-bArr29[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb7.toString(), exc2));
                                                                                                                                    } catch (java.lang.Throwable th69) {
                                                                                                                                        java.lang.Throwable cause34 = th69.getCause();
                                                                                                                                        if (cause34 == null) {
                                                                                                                                            throw th69;
                                                                                                                                        }
                                                                                                                                        throw cause34;
                                                                                                                                    }
                                                                                                                                } catch (java.lang.Throwable th70) {
                                                                                                                                    th = th70;
                                                                                                                                }
                                                                                                                            } catch (java.lang.Throwable th71) {
                                                                                                                                th = th71;
                                                                                                                                cls2 = 83;
                                                                                                                                th = th;
                                                                                                                                c10 = cls2;
                                                                                                                                zipFile3 = r10;
                                                                                                                                c4 = 3;
                                                                                                                                c3 = c10;
                                                                                                                                zipFile2 = zipFile3;
                                                                                                                                zipFile2.close();
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th72) {
                                                                                                                    th = th72;
                                                                                                                    zipFile10 = zipFile6;
                                                                                                                }
                                                                                                                try {
                                                                                                                    java.lang.Class cls22 = (java.lang.Class) java.lang.Class.class.getMethod(getHighSpeedVideoFpsRangesFor((short) 944, (byte) (-bArr28[84]), (short) (-bArr28[40])), null).invoke(obj27.getClass(), null);
                                                                                                                    int length2 = java.lang.reflect.Array.getLength(obj27);
                                                                                                                    java.lang.Object newInstance11 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls22, length2);
                                                                                                                    for (int i251 = 0; i251 < length2; i251++) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                java.lang.reflect.Array.set(newInstance11, i251, java.lang.reflect.Array.get(obj27, i251));
                                                                                                                            } catch (java.lang.Exception e5) {
                                                                                                                                exc2 = e5;
                                                                                                                                r10 = zipFile6;
                                                                                                                                java.lang.StringBuilder sb72 = new java.lang.StringBuilder();
                                                                                                                                int i2502 = getHighSpeedVideoSizes;
                                                                                                                                short s112 = (short) ((i2502 ^ 782) | (i2502 & 782));
                                                                                                                                byte[] bArr292 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                                                cls2 = 83;
                                                                                                                                cls2 = 83;
                                                                                                                                cls2 = 83;
                                                                                                                                sb72.append(getHighSpeedVideoFpsRangesFor(s112, bArr292[83], bArr292[662]));
                                                                                                                                sb72.append(invoke7);
                                                                                                                                sb72.append(getHighSpeedVideoFpsRangesFor((short) 285, bArr292[0], bArr292[29]));
                                                                                                                                throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr292[280], (short) (-bArr292[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb72.toString(), exc2));
                                                                                                                            }
                                                                                                                        } catch (java.lang.Throwable th73) {
                                                                                                                            th = th73;
                                                                                                                            zipFile8 = zipFile6;
                                                                                                                            c14 = 'S';
                                                                                                                            c10 = c14;
                                                                                                                            zipFile3 = zipFile8;
                                                                                                                            c4 = 3;
                                                                                                                            c3 = c10;
                                                                                                                            zipFile2 = zipFile3;
                                                                                                                            zipFile2.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    declaredField2.set(obj28, arrayList);
                                                                                                                    declaredField3.set(obj28, newInstance11);
                                                                                                                    if (getOutputFormats == null) {
                                                                                                                        int i252 = Camera2StreamConfigurationMap;
                                                                                                                        int i253 = (i252 & 3) + (i252 | 3);
                                                                                                                        getHighSpeedVideoFpsRanges = i253 % 128;
                                                                                                                        if (i253 % 2 != 0) {
                                                                                                                            getOutputFormats = newInstance10;
                                                                                                                            throw new java.lang.ArithmeticException();
                                                                                                                        }
                                                                                                                        getOutputFormats = newInstance10;
                                                                                                                    }
                                                                                                                    invoke3 = newInstance10;
                                                                                                                } catch (java.lang.Throwable th74) {
                                                                                                                    th = th74;
                                                                                                                    zipFile10 = zipFile6;
                                                                                                                    zipFile9 = zipFile10;
                                                                                                                    th4 = th;
                                                                                                                    cause2 = th4.getCause();
                                                                                                                    if (cause2 != null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th75) {
                                                                                                                th3 = th75;
                                                                                                                zipFile7 = zipFile6;
                                                                                                                th = th3;
                                                                                                                c10 = 'S';
                                                                                                                zipFile3 = zipFile7;
                                                                                                                c4 = 3;
                                                                                                                c3 = c10;
                                                                                                                zipFile2 = zipFile3;
                                                                                                                zipFile2.close();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (java.lang.Exception e6) {
                                                                                                            e = e6;
                                                                                                            zipFile9 = zipFile6;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th76) {
                                                                                                        java.lang.Throwable cause35 = th76.getCause();
                                                                                                        if (cause35 == null) {
                                                                                                            throw th76;
                                                                                                        }
                                                                                                        throw cause35;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th77) {
                                                                                                    th = th77;
                                                                                                    java.lang.Throwable th78 = th;
                                                                                                    java.lang.Throwable cause36 = th78.getCause();
                                                                                                    if (cause36 == null) {
                                                                                                        throw th78;
                                                                                                    }
                                                                                                    throw cause36;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th79) {
                                                                                                th = th79;
                                                                                            }
                                                                                        }
                                                                                        if (z9) {
                                                                                            try {
                                                                                                byte[] bArr30 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                java.lang.Class<?> cls23 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 606, bArr30[193], bArr30[409]));
                                                                                                byte b20 = bArr30[168];
                                                                                                byte b21 = bArr30[1034];
                                                                                                java.lang.reflect.Method declaredMethod2 = cls23.getDeclaredMethod(getHighSpeedVideoFpsRangesFor((short) 963, b20, (short) ((~b21) + (b21 << 1))), java.lang.String.class, java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 836, bArr30[193], (short) (-bArr30[209]))));
                                                                                                declaredMethod2.setAccessible(true);
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            java.lang.Object invoke8 = declaredMethod2.invoke(invoke3, str2, java.lang.Class.class.getMethod(getHighSpeedVideoFpsRangesFor((short) 651, bArr30[897], (short) (-bArr30[40])), null).invoke(util.h.xy.dd.b.class, null));
                                                                                                            if (invoke8 != null) {
                                                                                                                cls23.getDeclaredMethod(getHighSpeedVideoFpsRangesFor((short) 342, bArr30[83], bArr30[19]), new java.lang.Class[0]).invoke(invoke3, new java.lang.Object[0]);
                                                                                                            }
                                                                                                            obj18 = invoke8;
                                                                                                            if (obj18 != null) {
                                                                                                                break;
                                                                                                            }
                                                                                                            try {
                                                                                                                cls3 = (java.lang.Class) obj18;
                                                                                                                bArr3 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                            } catch (java.lang.Throwable th80) {
                                                                                                                th3 = th80;
                                                                                                                zipFile7 = zipFile6;
                                                                                                            }
                                                                                                            try {
                                                                                                                str4 = getHighSpeedVideoFpsRangesFor((short) 971, (byte) (-bArr3[84]), 84);
                                                                                                                java.lang.reflect.Constructor declaredConstructor = cls3.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
                                                                                                                declaredConstructor.setAccessible(true);
                                                                                                                getOutputSizes = declaredConstructor.newInstance(invoke3, java.lang.Boolean.valueOf(!z9));
                                                                                                                byte[] bArr31 = new byte[34481];
                                                                                                                zipFile7 = zipFile6;
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        java.lang.Object[] objArr10 = {zipFile7.getInputStream(zipFile7.getEntry(getHighSpeedVideoFpsRangesFor((short) 986, bArr3[7], bArr3[13]).substring(1)))};
                                                                                                                        java.lang.Class<?> cls24 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 415, bArr3[62], (short) (-bArr3[209])));
                                                                                                                        int i254 = getHighSpeedVideoSizes;
                                                                                                                        short s12 = (short) ((i254 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) | (i254 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE));
                                                                                                                        try {
                                                                                                                            java.lang.Object newInstance12 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 459, bArr3[184], (short) (-bArr3[209]))).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s12, bArr3[280], (short) (-bArr3[209])))).newInstance(cls24.getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s12, bArr3[280], (short) (-bArr3[209])))).newInstance(objArr10));
                                                                                                                            try {
                                                                                                                                java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 459, bArr3[184], (short) (-bArr3[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 481, bArr3[168], (short) (bArr3[1] - 1)), cls).invoke(newInstance12, bArr31);
                                                                                                                                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 97) % 128;
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 459, bArr3[184], (short) (-bArr3[209]))).getMethod(getHighSpeedVideoFpsRangesFor((short) 342, bArr3[83], bArr3[19]), null).invoke(newInstance12, null);
                                                                                                                                        try {
                                                                                                                                            i140 = java.lang.Math.abs(i12);
                                                                                                                                            bArr = bArr31;
                                                                                                                                            zipFile11 = zipFile7;
                                                                                                                                            obj11 = obj17;
                                                                                                                                            obj10 = obj16;
                                                                                                                                            z5 = z9;
                                                                                                                                            cls9 = cls3;
                                                                                                                                            i139 = 34432;
                                                                                                                                            z = z4;
                                                                                                                                            r10 = zipFile7;
                                                                                                                                        } catch (java.lang.Throwable th81) {
                                                                                                                                            th3 = th81;
                                                                                                                                            th = th3;
                                                                                                                                            c10 = 'S';
                                                                                                                                            zipFile3 = zipFile7;
                                                                                                                                            c4 = 3;
                                                                                                                                            c3 = c10;
                                                                                                                                            zipFile2 = zipFile3;
                                                                                                                                            zipFile2.close();
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    } catch (java.lang.Throwable th82) {
                                                                                                                                        th = th82;
                                                                                                                                        java.lang.Throwable th83 = th;
                                                                                                                                        java.lang.Throwable cause37 = th83.getCause();
                                                                                                                                        if (cause37 == null) {
                                                                                                                                            throw th83;
                                                                                                                                        }
                                                                                                                                        throw cause37;
                                                                                                                                    }
                                                                                                                                } catch (java.lang.Throwable th84) {
                                                                                                                                    th = th84;
                                                                                                                                }
                                                                                                                            } catch (java.lang.Throwable th85) {
                                                                                                                                java.lang.Throwable cause38 = th85.getCause();
                                                                                                                                if (cause38 == null) {
                                                                                                                                    throw th85;
                                                                                                                                }
                                                                                                                                throw cause38;
                                                                                                                            }
                                                                                                                        } catch (java.lang.Throwable th86) {
                                                                                                                            java.lang.Throwable cause39 = th86.getCause();
                                                                                                                            if (cause39 == null) {
                                                                                                                                throw th86;
                                                                                                                            }
                                                                                                                            throw cause39;
                                                                                                                        }
                                                                                                                    } catch (java.lang.Throwable th87) {
                                                                                                                        java.lang.Throwable cause40 = th87.getCause();
                                                                                                                        if (cause40 == null) {
                                                                                                                            throw th87;
                                                                                                                        }
                                                                                                                        throw cause40;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th88) {
                                                                                                                    th3 = th88;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th89) {
                                                                                                                th3 = th89;
                                                                                                                zipFile7 = zipFile6;
                                                                                                                th = th3;
                                                                                                                c10 = 'S';
                                                                                                                zipFile3 = zipFile7;
                                                                                                                c4 = 3;
                                                                                                                c3 = c10;
                                                                                                                zipFile2 = zipFile3;
                                                                                                                zipFile2.close();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th90) {
                                                                                                            th = th90;
                                                                                                            th = th;
                                                                                                            zipFile8 = zipFile6;
                                                                                                            c14 = 'S';
                                                                                                            c10 = c14;
                                                                                                            zipFile3 = zipFile8;
                                                                                                            c4 = 3;
                                                                                                            c3 = c10;
                                                                                                            zipFile2 = zipFile3;
                                                                                                            zipFile2.close();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th91) {
                                                                                                        th = th91;
                                                                                                        java.lang.Throwable th92 = th;
                                                                                                        java.lang.Throwable cause41 = th92.getCause();
                                                                                                        if (cause41 == null) {
                                                                                                            throw th92;
                                                                                                        }
                                                                                                        throw cause41;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th93) {
                                                                                                    th = th93;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th94) {
                                                                                                th = th94;
                                                                                            }
                                                                                        } else {
                                                                                            try {
                                                                                                byte[] bArr32 = getHighResolutionOutputSizeshNQ4ISI;
                                                                                                java.lang.Class<?> cls25 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 836, bArr32[193], (short) (-bArr32[209])));
                                                                                                byte b22 = bArr32[168];
                                                                                                byte b23 = bArr32[1034];
                                                                                                int currentTimeMillis21 = (int) java.lang.System.currentTimeMillis();
                                                                                                int i255 = b23 * 193;
                                                                                                int i256 = (i255 & (-193)) + (i255 | (-193));
                                                                                                int i257 = ~currentTimeMillis21;
                                                                                                int i258 = ~b23;
                                                                                                int i259 = (i257 & i258) | (i257 ^ i258);
                                                                                                int i260 = -(-(i259 * (-192)));
                                                                                                int i261 = ~i258;
                                                                                                int i262 = ~i259;
                                                                                                int i263 = ((((i256 | i260) << 1) - (i256 ^ i260)) - (~(((i261 ^ i262) | (i262 & i261)) * (-384)))) - 1;
                                                                                                int i264 = ~((i258 & currentTimeMillis21) | (i258 ^ currentTimeMillis21));
                                                                                                int i265 = i257 | i258;
                                                                                                int i266 = ~(i265 | (~i265));
                                                                                                int i267 = (i266 ^ i264) | (i266 & i264);
                                                                                                int i268 = b23 | (b23 ^ (-1));
                                                                                                int i269 = ~((i268 ^ currentTimeMillis21) | (i268 & currentTimeMillis21));
                                                                                                int i270 = -(-(((i269 ^ i267) | (i269 & i267)) * 192));
                                                                                                java.lang.reflect.Method declaredMethod3 = cls25.getDeclaredMethod(getHighSpeedVideoFpsRangesFor((short) 963, b22, (short) ((i263 & i270) + (i270 | i263))), java.lang.String.class);
                                                                                                try {
                                                                                                    try {
                                                                                                        declaredMethod3.setAccessible(true);
                                                                                                        obj18 = declaredMethod3.invoke(invoke3, str2);
                                                                                                        if (obj18 != null) {
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th95) {
                                                                                                        th = th95;
                                                                                                        th = th;
                                                                                                        zipFile8 = zipFile6;
                                                                                                        c14 = 'S';
                                                                                                        c10 = c14;
                                                                                                        zipFile3 = zipFile8;
                                                                                                        c4 = 3;
                                                                                                        c3 = c10;
                                                                                                        zipFile2 = zipFile3;
                                                                                                        zipFile2.close();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (java.lang.reflect.InvocationTargetException e7) {
                                                                                                    try {
                                                                                                        throw ((java.lang.Exception) e7.getCause());
                                                                                                    } catch (java.lang.ClassNotFoundException unused7) {
                                                                                                        obj18 = null;
                                                                                                    }
                                                                                                }
                                                                                            } catch (java.lang.Throwable th96) {
                                                                                                th3 = th96;
                                                                                                zipFile7 = zipFile6;
                                                                                                th = th3;
                                                                                                c10 = 'S';
                                                                                                zipFile3 = zipFile7;
                                                                                                c4 = 3;
                                                                                                c3 = c10;
                                                                                                zipFile2 = zipFile3;
                                                                                                zipFile2.close();
                                                                                                throw th;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (java.lang.Throwable th97) {
                                                                                    th = th97;
                                                                                    java.lang.Throwable th98 = th;
                                                                                    cause = th98.getCause();
                                                                                    if (cause != null) {
                                                                                        throw th98;
                                                                                    }
                                                                                    throw cause;
                                                                                }
                                                                            } catch (java.lang.Throwable th99) {
                                                                                th = th99;
                                                                                java.lang.Throwable th982 = th;
                                                                                cause = th982.getCause();
                                                                                if (cause != null) {
                                                                                }
                                                                            }
                                                                        } catch (java.lang.Throwable th100) {
                                                                            th = th100;
                                                                        }
                                                                    } catch (java.lang.Throwable th101) {
                                                                        java.lang.Throwable cause42 = th101.getCause();
                                                                        if (cause42 == null) {
                                                                            throw th101;
                                                                        }
                                                                        throw cause42;
                                                                    }
                                                                } catch (java.lang.Throwable th102) {
                                                                    java.lang.Throwable cause43 = th102.getCause();
                                                                    if (cause43 == null) {
                                                                        throw th102;
                                                                    }
                                                                    throw cause43;
                                                                }
                                                            } catch (java.lang.Throwable th103) {
                                                                th = th103;
                                                                z4 = z;
                                                                c7 = 3;
                                                                c8 = 'S';
                                                                obj6 = th;
                                                                c17 = c7;
                                                                c16 = c8;
                                                                obj4 = obj6;
                                                                c6 = c17;
                                                                c5 = c16;
                                                                while (i3 < 7) {
                                                                }
                                                                byte[] bArr142222222 = getHighResolutionOutputSizeshNQ4ISI;
                                                                java.lang.String highSpeedVideoFpsRangesFor42222222 = getHighSpeedVideoFpsRangesFor((short) 1024, bArr142222222[184], bArr142222222[662]);
                                                                int i1042222222 = getHighSpeedVideoFpsRanges;
                                                                Camera2StreamConfigurationMap = ((i1042222222 & 45) + (i1042222222 | 45)) % 128;
                                                                throw ((java.lang.Throwable) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 285, bArr142222222[280], (short) (-bArr142222222[209]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(highSpeedVideoFpsRangesFor42222222, obj4));
                                                            }
                                                        } catch (java.lang.Throwable th104) {
                                                            th = th104;
                                                            java.lang.Throwable th105 = th;
                                                            java.lang.Throwable cause44 = th105.getCause();
                                                            if (cause44 == null) {
                                                                throw th105;
                                                            }
                                                            throw cause44;
                                                        }
                                                    } catch (java.lang.Throwable th106) {
                                                        th = th106;
                                                    }
                                                } catch (java.lang.Throwable th107) {
                                                    th = th107;
                                                    java.lang.Throwable th108 = th;
                                                    java.lang.Throwable cause45 = th108.getCause();
                                                    if (cause45 == null) {
                                                        throw th108;
                                                    }
                                                    throw cause45;
                                                }
                                            } catch (java.lang.Throwable th109) {
                                                th = th109;
                                            }
                                        } catch (java.lang.Throwable th110) {
                                            th = th110;
                                            z4 = z;
                                            c7 = 3;
                                            c8 = 'S';
                                        }
                                    }
                                    z2 = z3;
                                    c2 = c12;
                                    c = c13;
                                    i = i2 + 1;
                                    zArr = zArr4;
                                    objArr = objArr2;
                                    zArr2 = zArr5;
                                    zArr3 = zArr6;
                                    z = z4;
                                }
                                return;
                            }
                            invoke2 = null;
                            if (invoke == null) {
                            }
                            if (invoke2 == null) {
                            }
                            c = 'S';
                            if (obj2 == null) {
                                int i972 = getHighSpeedVideoFpsRanges;
                                Camera2StreamConfigurationMap = (((i972 | 85) << 1) - (i972 ^ 85)) % 128;
                                byte[] bArr122 = getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.String highSpeedVideoFpsRangesFor32 = getHighSpeedVideoFpsRangesFor((short) 236, bArr122[313], bArr122[19]);
                                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 83) % 128;
                                int i982 = getHighSpeedVideoSizes;
                                short s32 = (short) ((i982 & 10) | (i982 ^ 10));
                                obj2 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s32, bArr122[488], (short) (-bArr122[209]))).getDeclaredConstructor(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(s32, bArr122[488], (short) (-bArr122[209]))), java.lang.String.class).newInstance(obj3, highSpeedVideoFpsRangesFor32);
                                int i992 = getHighSpeedVideoFpsRanges + 57;
                                Camera2StreamConfigurationMap = i992 % 128;
                                int i1002 = i992 % 2;
                            }
                            int i6422 = getHighSpeedVideoSizes;
                            byte[] bArr722 = getHighResolutionOutputSizeshNQ4ISI;
                            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i6422 ^ 10) | (i6422 & 10)), bArr722[488], (short) (-bArr722[209]))), 7);
                            objArr[0] = null;
                            objArr[1] = obj2;
                            objArr[2] = obj3;
                            c2 = 3;
                            objArr[3] = invoke2;
                            objArr[4] = obj2;
                            objArr[5] = obj3;
                            objArr[6] = invoke2;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[]{false, false, true, true, false, true, true};
                            java.lang.Class<?> cls422 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i6422 & 68) | (i6422 ^ 68)), (byte) (-bArr722[44]), (short) (bArr722[360] - 1)));
                            i14 = cls422.getDeclaredField(getHighSpeedVideoFpsRangesFor((short) 268, bArr722[834], bArr722[39])).getInt(cls422);
                            if (i14 < 34) {
                            }
                            if (i14 == 29) {
                            }
                            if (i14 < 26) {
                            }
                            zArr3[c18] = z10;
                            if (i14 < 21) {
                            }
                            zArr3[c19] = z11;
                            zArr3[4] = i14 < 21;
                            z2 = false;
                            i = 0;
                            while (!z2) {
                                if (zArr3[i]) {
                                }
                                z2 = z3;
                                c2 = c12;
                                c = c13;
                                i = i2 + 1;
                                zArr = zArr4;
                                objArr = objArr2;
                                zArr2 = zArr5;
                                zArr3 = zArr6;
                                z = z4;
                            }
                        }
                        obj2 = null;
                        if (obj != null) {
                        }
                        invoke2 = null;
                        if (invoke == null) {
                        }
                        if (invoke2 == null) {
                        }
                        c = 'S';
                        if (obj2 == null) {
                        }
                        int i64222 = getHighSpeedVideoSizes;
                        byte[] bArr7222 = getHighResolutionOutputSizeshNQ4ISI;
                        objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i64222 ^ 10) | (i64222 & 10)), bArr7222[488], (short) (-bArr7222[209]))), 7);
                        objArr[0] = null;
                        objArr[1] = obj2;
                        objArr[2] = obj3;
                        c2 = 3;
                        objArr[3] = invoke2;
                        objArr[4] = obj2;
                        objArr[5] = obj3;
                        objArr[6] = invoke2;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                        java.lang.Class<?> cls4222 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i64222 & 68) | (i64222 ^ 68)), (byte) (-bArr7222[44]), (short) (bArr7222[360] - 1)));
                        i14 = cls4222.getDeclaredField(getHighSpeedVideoFpsRangesFor((short) 268, bArr7222[834], bArr7222[39])).getInt(cls4222);
                        if (i14 < 34) {
                        }
                        if (i14 == 29) {
                        }
                        if (i14 < 26) {
                        }
                        zArr3[c18] = z10;
                        if (i14 < 21) {
                        }
                        zArr3[c19] = z11;
                        zArr3[4] = i14 < 21;
                        z2 = false;
                        i = 0;
                        while (!z2) {
                        }
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    obj2 = null;
                    if (obj != null) {
                    }
                    invoke2 = null;
                    if (invoke == null) {
                    }
                    if (invoke2 == null) {
                    }
                    c = 'S';
                    if (obj2 == null) {
                    }
                    int i642222 = getHighSpeedVideoSizes;
                    byte[] bArr72222 = getHighResolutionOutputSizeshNQ4ISI;
                    objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i642222 ^ 10) | (i642222 & 10)), bArr72222[488], (short) (-bArr72222[209]))), 7);
                    objArr[0] = null;
                    objArr[1] = obj2;
                    objArr[2] = obj3;
                    c2 = 3;
                    objArr[3] = invoke2;
                    objArr[4] = obj2;
                    objArr[5] = obj3;
                    objArr[6] = invoke2;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[]{false, false, true, true, false, true, true};
                    java.lang.Class<?> cls42222 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i642222 & 68) | (i642222 ^ 68)), (byte) (-bArr72222[44]), (short) (bArr72222[360] - 1)));
                    i14 = cls42222.getDeclaredField(getHighSpeedVideoFpsRangesFor((short) 268, bArr72222[834], bArr72222[39])).getInt(cls42222);
                    if (i14 < 34) {
                    }
                    if (i14 == 29) {
                    }
                    if (i14 < 26) {
                    }
                    zArr3[c18] = z10;
                    if (i14 < 21) {
                    }
                    zArr3[c19] = z11;
                    zArr3[4] = i14 < 21;
                    z2 = false;
                    i = 0;
                    while (!z2) {
                    }
                }
                byte[] bArr62 = getHighResolutionOutputSizeshNQ4ISI;
                byte b32 = bArr62[576];
                byte b42 = bArr62[360];
                int currentTimeMillis52 = (int) java.lang.System.currentTimeMillis();
                int i592 = 558 - (~(b42 * org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE));
                int i602 = ~currentTimeMillis52;
                int i612 = (~((~i602) | i602)) * (-560);
                int i622 = ~b42;
                int i632 = ~((b42 & i602) | (b42 ^ i602));
                obj = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 102, b32, (short) ((((((i592 | i612) << 1) - (i592 ^ i612)) + ((~(currentTimeMillis52 | (currentTimeMillis52 ^ (-1)))) * (-560))) - (~(((i632 ^ i622) | (i622 & i632)) * 560))) - 1))).getMethod(getHighSpeedVideoFpsRangesFor((short) 123, bArr62[193], (short) (-bArr62[40])), new java.lang.Class[0]).invoke(null, null);
                if (obj != null) {
                }
                invoke = null;
                if (obj != null) {
                }
                obj2 = null;
                if (obj != null) {
                }
                invoke2 = null;
                if (invoke == null) {
                }
                if (invoke2 == null) {
                }
                c = 'S';
                if (obj2 == null) {
                }
                int i6422222 = getHighSpeedVideoSizes;
                byte[] bArr722222 = getHighResolutionOutputSizeshNQ4ISI;
                objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i6422222 ^ 10) | (i6422222 & 10)), bArr722222[488], (short) (-bArr722222[209]))), 7);
                objArr[0] = null;
                objArr[1] = obj2;
                objArr[2] = obj3;
                c2 = 3;
                objArr[3] = invoke2;
                objArr[4] = obj2;
                objArr[5] = obj3;
                objArr[6] = invoke2;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                java.lang.Class<?> cls422222 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) ((i6422222 & 68) | (i6422222 ^ 68)), (byte) (-bArr722222[44]), (short) (bArr722222[360] - 1)));
                i14 = cls422222.getDeclaredField(getHighSpeedVideoFpsRangesFor((short) 268, bArr722222[834], bArr722222[39])).getInt(cls422222);
                if (i14 < 34) {
                }
                if (i14 == 29) {
                }
                if (i14 < 26) {
                }
                zArr3[c18] = z10;
                if (i14 < 21) {
                }
                zArr3[c19] = z11;
                zArr3[4] = i14 < 21;
                z2 = false;
                i = 0;
                while (!z2) {
                }
            } catch (java.lang.Exception e8) {
                throw new java.lang.RuntimeException(e8);
            }
        } catch (java.lang.Throwable th111) {
            java.lang.Throwable cause46 = th111.getCause();
            if (cause46 == null) {
                throw th111;
            }
            throw cause46;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static int m26273(int i) {
        int i2 = (getOutputMinFrameDuration + 53) % 128;
        getOutputMinFrameDurationlomOqCM = i2;
        int i3 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i3 + 125) % 128;
        java.lang.Object obj = getOutputSizes;
        getOutputMinFrameDuration = (i2 + 117) % 128;
        int i4 = (i3 ^ 47) + ((i3 & 47) << 1);
        int i5 = i4 % 128;
        Camera2StreamConfigurationMap = i5;
        if (i4 % 2 == 0) {
            getOutputMinFrameDuration = (i2 + 105) % 128;
        }
        getOutputMinFrameDuration = (i2 + 7) % 128;
        getHighSpeedVideoFpsRanges = (i5 + 69) % 128;
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i)};
            byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
            int intValue = ((java.lang.Integer) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 538, bArr[906], 84), true, (java.lang.ClassLoader) getOutputFormats).getMethod(getHighSpeedVideoFpsRangesFor((short) 1046, bArr[0], 685), java.lang.Integer.TYPE).invoke(obj, objArr)).intValue();
            int i6 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = (((i6 | 19) << 1) - (i6 ^ 19)) % 128;
            return intValue;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            int i7 = getOutputMinFrameDuration + 1;
            getOutputMinFrameDurationlomOqCM = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            throw cause;
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        char[] cArr = new char[1060];
        java.nio.ByteBuffer.wrap("\u008d(øcg³ÒëY\u0002Ç22\u009b¹·$õ\u0092;\u0019K\u0084\u007fó\by3ä\u0092SºÞ\u0002D\"³\u008d>á¥\n\u0013ô\u009ed\u0005]p\u001cþÚe\u009cÐ¦_\u0014Å%0\u0096¿\u0095**\u0090'\u001fä\u008aoñ\u0095\u007fÝê©Q¥ÜlJ\u0017±S<f«+\u0011â\u009c`\u000b[v!üôkIÖq]7Ë\u00076z½9(Â\u0096ù\u001d\n\u00885÷9}\fè@WyÂ>Iö·ß\"s©±\u0014÷\u0082\u0007\t½tXã\u0004i\u0007Ô\u0091CaÎ\u001144£\u008f.´\u0095\u0013\u0003Ø\u008eAõK`\u0016î.UfÀ\\O\u0002µ( \u0096¯ \u001a\u0019\u0080Û\u000f_z`á,o\u0011ÚSA\u0091Ì*:þ¡_,a\u009b'\u0001è\u008c\\ûufÝì\u001f[]Æ\u00adM\u000b»î&¾\u00ad½\u0018/\u0086Ê\rºx ç\u0011mòØAGt²?8ú§°\u0012`\u0099\u0099\u0004(r1ù\u0080d½ÓñYÅÄ^3w¾\u0005$:\u0093z\u001e¾\u0085\u0003óÕ~våVP\u001eÞÜE\u008c°\u008e?>¥Ý\u0010b\u009fF\nÄpóÿ\u009ejRÑ\u0002_\u0001Ê¿1\u0099¼,*\f\u0091\u008d\u001cn\u008b,ñ\u0017|HëAV,ÜäK´¶³=\u0003«ä\u0016¦\u009d\u0081\bÞvÛý¶hM×Ä]íÈV7¦¢\u0000(\u000b\u0097 \u0002\u009d\u0089ã÷\tb¦écT\u0080Ã1IÅ´K#Q®-\u0014Ì\u0083}\u000e¾u\u0013ã(nMÕ~@\bÎ\u00005Ö ¤/\u0019\u0095+\u0000\u009d\u008fPúá`Îï{Z\u0098ÁTO\"º\u009d!¨¬Ù\u001aö\u0081\u0086\f\u0093{/á\u001el ÛkF9Ì7;\u0082¦\u0098-'\u009b\u0012\u0006\u00ad\u008dgø'fïíIX|ÇÀMû¸º'\u007f\u0092?\u0018\u0006\u0087¹ò\u008fy$ç\nRNÙ\u008eDü²²9È¤2\u0013Z\u009e8\u0004<s\u008eþ²eËÓò^vÅK0\u0006¾:%\u008b\u0090A\u001fò\u0085×ð\u0089\u007f°ê\u001aPÒß\u009bJW±ò?Ëªn\u0011Y\u009cæ\n?q\u009bü¼k\u001bÑ\u0017\\¸Ë\u00816â¼×+£\u0096©\u001d4\u008bîö_}QèÈVæÝ®Hf·Ö=ö¨¾\u0017h\u0082Â\bøwNâsi1×\u0014B Ér4Ï¢\u0018)\u00ad\u0094u\u00033\u008eñôÃcuîZUçÃ\u0004NµµA Ç®Ý\u0015¡\u0080@\u000fùu/à¨o@Úà@ØÏ\u009d:¼¡9/Û\u009am\u0001§\u008c\u0018úÜa\u0091ìS[æÁ>L\u0095»¾&$¬Û\u001b¸\u0086o\rÞ{úæ©m×ØnFæÍS8`§ç-Ø\u0098i\u0007*r=øGg\u008bÒ\u007fY÷Çð2B¹r$4\u0092\b\u0019\u0084\u0084¥ó6yñä·S\u0088ÞDEõ³È>»¥\u009a\u0010$\u009e\u0006\u0005\u0089pWÿçeÑÐ\u0095_¼Ê\u000b0?¿r*Z\u0091æ\u001fË\u008apñ\u0095|Yê!Q\u0088ÜêK>±+<i«R\u0016\u0002\u009c\u000e\u000b\u0082v{ýÙk\u0015Öº]\u0087Èä6Õ½¡(§\u00971\u001dÑ\u0088V÷`b\"èïWTÂ\u007fIØ·Û\"¹©}\u0014:\u0082\u0019\t\u009atvãÂi\nÔ»C\u008bÎ$4\u001d£~.³\u0095G\u0000Í\u008eÐõ\u00ad`Oï\u000fUÈÀgOdº\u0004 0¯|\u001aM\u0081ù\u000fÖzsá\u0090l!ÚÕA[ÌC;\u0007¡Ì,y\u009b½\u00063\u008cÑû\u0095fRíñ[òÆ®M\u009a¸Ò&ã\u00ad_\u0018\u0095\u0087-\r\rx\u0097ç\u009eR&ØêG[²t9Í§.\u0012\u0083\u0099w\u0004ýrëù\u0083d\u0086ÓËY'Ä\u00853u¾Å$ï\u0093`\u001eT\u00854óö~ÏånPoß\rE?°u?Fª\u001a\u0010Ä\u009fv\n^qéÿÌj\u0080ÑK\\\u0000Ê)1\u009a¼\u0098+!\u0091\u0012\u001c×\u008b[ö®|îë\u0096V\u0099ÝTK$¶\u0092=§¨\u0014\u0016*\u009d\u0093\b¤waýéh\u001c×PB+È*7á¢\u0095)Ñ\u0097à\u0002Y\u0089`ô(b\u000béATyÃÉIë´[#m®Ç\u0014ó\u0083Z\u000eUu5ãýn^Õv@ßÏ\u000452 u/@\u009aù\u0000Ë\u008f\u0099ú\u009da\u0006ï>Z\u0093Á¨LÍºþ!\u0088¬\u0080\u001b\u0004\u0081ú\f\u0099{¦æûløÛ\u0088F«Í\u0007;.¦\u009d-S\u0098ï\u0006Ö\u008d\u0098ø¦gÙí\u0010X¡Ça2ß¸ï'm\u0092.\u0019.\u0087\u001bò§y\u0096ä(R Ù¸DB³+9/¤\u0099\u0013x\u009eÁ\u0004þsLþ|eÔÓÔ^¡Åu0#¾<%\u0093\u0090b\u001f°\u008aððÇ\u007f\u008cê¹QæßÛJ\u009c±°<\u0004ªÍ\u0011~\u009cS\u000bðqÀü\u0090k\u008fÖ4\\+Ë\u00896X½À+ý\u0096m\u001dS\u0088\u0014öÛ}lèEWþÝ\u001fHØ·o\"Ø¨é\u0017i\u0082$\tÚwáâiiHÔ6BíÉ~4E£')ç\u0094 \u0003\u009f\u008e\u001côücHî\u0084U5ÃøN¨µª .®á\u0015K\u0080¡\u000f\u0018uøà±o\u0087Ú¶A\u001bÏ :E¡\u0002,\t\u009a>\u0001\u0083\u008c\u0083ûJa4ì\u008b[\u0083Æ.LÐ»\u0097&\u0088\u00ad7\u001bÕ\u0086\u009a\rRx\u0018æÈmwØOG\u0007Í88k§D\u0012ý\u0098\u001e\u0007\u0093rgùígûÒ\u0093Y\u0096ÄÛ27¹\u0095$e\u0093Õ\u0019ÿ\u0084zóK~!ä\u001fS¹Þ~EÝ³Þ>º¥\u008e\u0010Æ\u009e÷\u0005Kp¢ÿ\re\bÐA_\u00adÊ\u00030ó¿?*\u0095\u0091µ\u001c\u001a\u008a'ñD|uë\u0001Q\u0007Ü\u0090Ko¶\u0000<Ä«w\u0016¾\u009d\u0002\u000bÒvdý£h\u0010ÖÖ]nÈ\\7Ü½\u0091(\u009f\u0097¨\u0002\u0016\u0088!÷\u0099b\u0093é\fWÉÂNIv´'\"î©®\u0014a\u0083ä\tÅt²ã©n\u000eÔ\u0015C·Îb5ú£Û.K\u0095y\u0000>\u008eõõB`oïÔU9ÀõO\u0089º= 3¯¥\u001aI\u0081Ì\fýz\u0010á¹l¾Û\bAÊÌ\u0087;°¦\u0011,*\u009bK\u0006\u0005\u008dõûÌf{í\u0088X\tÆôMk¸I'\u0018\u00ad\u0000\u0018½\u0087\u00adò\u0013xÔç\u009bR¨ÙãGÂ²o9\\¤\"\u0012\u001a\u0099¨\u0004¨smùãdTÓj^ÕÄí3g¾s%\u0003\u0093÷\u001eT\u0085\u0080ð\u001d~êåqPVßÍEï°º?¢ª\u0013\u0010\u0003\u009f±\nvq=ÿ\u0000j¥Ñ\u0087\\¨Ë\u00101À¼\u008e+¿\u0096\u001e\u001c?\u008b\u0086ö·}îëÛV~ÝPHò¶Ó=\u0088¨\u0093\u00178\u009d×\bhwZâ\bh%×\u009cB¯Éé7Ä¢`)G\u0094ä\u0002ß\u0089`ô\u0087c0é\u0017T¿Ã\u009bN8´á#p®u\u00152\u0083\u0012\u000ezuKàØnêÕ[@uÏ75ý ½/k\u009aê\u0000Ö\u008f¹úsa6ïõZLÁyL;º\u0012!\u0096¬w\u001b¸\u0086á\fÇ{`æAm\rÛ=F\u0083Í¦8/¦2-\u0096\u0098A\u0007\u0001\u008d6ø\u009bg\u009aÒ'X\u0014ÇÑ2X¹ 'î\u0092\u0094\u0019\u009a\u0084!ò\u0011yÑägS\u0004ÙÓDZ³~>-¤S\u0013â\u009ej\u0005ßsìþce\\Ðí^®Å¡0Û¿\u0017%ã\u0090s\u001fF\u008aððÈ\u007fiê\u0085Q?ßûJ\u0099±§<7ªó\u0011\u0083\u009c\u008c\u000béq\u000büÇk¢Ö\u0081]àËÃ6`½B(A\u0096Å\u001d4\u0088\f÷ø}Ïè\u0081W¸Â\u0000HÚ·\u0095\"V©²\u0017\u0094\u0082`\t[t\tâa=\u001eH;×fbÇé\u0093wT\u0082\u0018\t×\u0094\u0082\"Q".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1060);
        getInputSizeshNQ4ISI = cArr;
        getInputFormats = -3113948691634722498L;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m26272(java.lang.Object obj) {
        int i = getOutputMinFrameDuration;
        getOutputMinFrameDurationlomOqCM = (i + 105) % 128;
        int i2 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i2 & 125) + (i2 | 125)) % 128;
        java.lang.Object obj2 = getOutputSizes;
        int i3 = (i + 11) % 128;
        getOutputMinFrameDurationlomOqCM = i3;
        Camera2StreamConfigurationMap = (i2 + 7) % 128;
        int i4 = i3 + 25;
        getOutputMinFrameDuration = i4 % 128;
        if (i4 % 2 != 0) {
            Camera2StreamConfigurationMap = (i2 * (-46)) << 13262;
        } else {
            Camera2StreamConfigurationMap = (i2 + 63) % 128;
        }
        try {
            byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
            int intValue = ((java.lang.Integer) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 538, bArr[906], 84), true, (java.lang.ClassLoader) getOutputFormats).getMethod(getHighSpeedVideoFpsRangesFor((short) 554, bArr[0], 682), java.lang.Object.class).invoke(obj2, obj)).intValue();
            int i5 = Camera2StreamConfigurationMap;
            int i6 = ((i5 | 59) << 1) - (i5 ^ 59);
            getHighSpeedVideoFpsRanges = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            getOutputMinFrameDurationlomOqCM = (getOutputMinFrameDuration + 105) % 128;
            return intValue;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            int i7 = getOutputMinFrameDurationlomOqCM + 113;
            getOutputMinFrameDuration = i7 % 128;
            if (i7 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0058 -> B:6:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String getHighSpeedVideoFpsRangesFor(short s, short s2, int i) {
        int i2;
        int i3 = getOutputMinFrameDurationlomOqCM;
        int i4 = (i3 + 57) % 128;
        getOutputMinFrameDuration = i4;
        int i5 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i5 + 39) % 128;
        int i6 = ((i | 33) << 1) - (i ^ 33);
        int i7 = s + 4;
        int i8 = 39 - s2;
        byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
        char[] cArr = new char[i8];
        int i9 = 0;
        if (bArr == null) {
            int i10 = i5 + 93;
            Camera2StreamConfigurationMap = i10 % 128;
            if (i10 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i11 = (i3 + 103) % 128;
            getOutputMinFrameDuration = i11;
            getOutputMinFrameDurationlomOqCM = (i11 + 91) % 128;
            int i12 = i7;
            int i13 = -i6;
            int i14 = i13 * (-381);
            int i15 = -(-(i7 * 192));
            int i16 = (i14 & i15) + (i14 | i15);
            int i17 = ~i13;
            int i18 = -(-(i17 * (-191)));
            int i19 = ((i16 | i18) << 1) - (i18 ^ i16);
            int i20 = -(-((i13 | (~((i7 ^ i) | (i7 & i)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            int i22 = ~((i17 ^ i7) | (i17 & i7));
            int i23 = ~i;
            int i24 = ~((i7 ^ i23) | (i7 & i23));
            int i25 = -(-(((i24 ^ i22) | (i24 & i22)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
            int i26 = (i21 ^ i25) + ((i25 & i21) << 1);
            i6 = (i26 & (-3)) + (i26 | (-3));
            i7 = ((i12 | 1) << 1) - (i12 ^ 1);
            int i27 = getOutputMinFrameDuration + 39;
            getOutputMinFrameDurationlomOqCM = i27 % 128;
            getHighSpeedVideoFpsRanges = i27 % 2 != 0 ? ((Camera2StreamConfigurationMap - 84) >> 1) >>> 31422 : (Camera2StreamConfigurationMap + 39) % 128;
            i2 = ((i9 | 1) << 1) - (i9 ^ 1);
            cArr[i9] = (char) i6;
            if (i2 == i8) {
                return new java.lang.String(cArr);
            }
            byte b = bArr[i7];
            i9 = i2;
            i12 = i7;
            i7 = i6;
            i6 = b;
            int i132 = -i6;
            int i142 = i132 * (-381);
            int i152 = -(-(i7 * 192));
            int i162 = (i142 & i152) + (i142 | i152);
            int i172 = ~i132;
            int i182 = -(-(i172 * (-191)));
            int i192 = ((i162 | i182) << 1) - (i182 ^ i162);
            int i202 = -(-((i132 | (~((i7 ^ i) | (i7 & i)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
            int i212 = ((i192 | i202) << 1) - (i202 ^ i192);
            int i222 = ~((i172 ^ i7) | (i172 & i7));
            int i232 = ~i;
            int i242 = ~((i7 ^ i232) | (i7 & i232));
            int i252 = -(-(((i242 ^ i222) | (i242 & i222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
            int i262 = (i212 ^ i252) + ((i252 & i212) << 1);
            i6 = (i262 & (-3)) + (i262 | (-3));
            i7 = ((i12 | 1) << 1) - (i12 ^ 1);
            int i272 = getOutputMinFrameDuration + 39;
            getOutputMinFrameDurationlomOqCM = i272 % 128;
            getHighSpeedVideoFpsRanges = i272 % 2 != 0 ? ((Camera2StreamConfigurationMap - 84) >> 1) >>> 31422 : (Camera2StreamConfigurationMap + 39) % 128;
            i2 = ((i9 | 1) << 1) - (i9 ^ 1);
            cArr[i9] = (char) i6;
            if (i2 == i8) {
            }
        } else {
            getOutputMinFrameDurationlomOqCM = (i4 + 63) % 128;
            i2 = ((i9 | 1) << 1) - (i9 ^ 1);
            cArr[i9] = (char) i6;
            if (i2 == i8) {
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.Object m26271(int i, char c, int i2) {
        int i3 = getOutputMinFrameDurationlomOqCM;
        getOutputMinFrameDuration = (i3 + 47) % 128;
        int i4 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i4 ^ 103) + ((i4 & 103) << 1)) % 128;
        java.lang.Object obj = getOutputSizes;
        getOutputMinFrameDuration = (i3 + 105) % 128;
        getHighSpeedVideoFpsRanges = ((i4 ^ 31) + ((i4 & 31) << 1)) % 128;
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i2)};
            byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object invoke = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor((short) 538, bArr[906], 84), true, (java.lang.ClassLoader) getOutputFormats).getMethod(getHighSpeedVideoFpsRangesFor((short) 1046, bArr[0], 5116), java.lang.Integer.TYPE, java.lang.Character.TYPE, java.lang.Integer.TYPE).invoke(obj, objArr);
            int i5 = getHighSpeedVideoFpsRanges;
            int i6 = (i5 ^ 71) + ((i5 & 71) << 1);
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 == 0) {
                getOutputMinFrameDurationlomOqCM = (getOutputMinFrameDuration + 31) % 128;
            }
            getOutputMinFrameDuration = (getOutputMinFrameDurationlomOqCM + 51) % 128;
            return invoke;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            getOutputMinFrameDuration = (getOutputMinFrameDurationlomOqCM + 67) % 128;
            throw th;
        }
    }

    private b() {
    }

    private static void getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 83) + ((i & 83) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = getOutputMinFrameDuration;
        getOutputMinFrameDurationlomOqCM = (i2 % 2 == 0 ? i3 + 91 : i3 + 99) % 128;
        byte[] bArr = new byte[org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SLICES];
        int axisFromString = android.view.MotionEvent.axisFromString("");
        long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
        getOutputMinFrameDuration = (getOutputMinFrameDurationlomOqCM + 17) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(1049 - axisFromString, (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) - 1, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 4367), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(10 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 1049 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 41303), objArr2);
            java.lang.System.arraycopy(intern.getBytes(((java.lang.String) objArr2[0]).intern()), 0, bArr, 0, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SLICES);
            getHighResolutionOutputSizeshNQ4ISI = bArr;
            getHighSpeedVideoSizes = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
            int i4 = Camera2StreamConfigurationMap + 107;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            getOutputMinFrameDurationlomOqCM = (getOutputMinFrameDuration + 91) % 128;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
