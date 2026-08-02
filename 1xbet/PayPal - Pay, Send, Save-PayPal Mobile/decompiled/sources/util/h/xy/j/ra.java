package util.h.xy.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᐝ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char[] getHighSpeedVideoFpsRanges = null;
    private static final int getHighSpeedVideoFpsRangesFor = 0;
    private static final byte[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static final /* synthetic */ util.h.xy.j.ra[] getInputFormats;
    private static int getInputSizeshNQ4ISI = 0;
    private static final java.lang.String getOutputFormats;
    private static int[] getOutputMinFrameDuration = null;
    private static int getOutputMinFrameDurationlomOqCM = 1;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.j.ra f2242;

    private static void Camera2StreamConfigurationMap(java.lang.Object[] objArr) {
        int i;
        char[] cArr = new char[1];
        if (getHighSpeedVideoSizes == null) {
            int i2 = getOutputMinFrameDurationlomOqCM;
            getInputSizeshNQ4ISI = (i2 + 15) % 128;
            getInputSizeshNQ4ISI = (i2 + 113) % 128;
            i = 719;
        } else {
            i = 715;
        }
        cArr[0] = (char) i;
        objArr[0] = new java.lang.String(cArr);
    }

    private ra(java.lang.String str) {
    }

    public static util.h.xy.j.ra valueOf(java.lang.String str) {
        getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 93) % 128;
        util.h.xy.j.ra raVar = (util.h.xy.j.ra) java.lang.Enum.valueOf(util.h.xy.j.ra.class, str);
        int i = getOutputMinFrameDurationlomOqCM + 121;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return raVar;
        }
        throw null;
    }

    public static util.h.xy.j.ra[] values() {
        int i = getOutputMinFrameDurationlomOqCM + 7;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.j.ra[] raVarArr = getInputFormats;
        if (i % 2 == 0) {
            return (util.h.xy.j.ra[]) raVarArr.clone();
        }
        throw null;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\t\u0004\uffff\ufffb\ufff9\u0004\ufff7\n", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, 2 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 166 - android.text.TextUtils.getCapsMode("", 0, 0), true, objArr);
        util.h.xy.j.ra raVar = new util.h.xy.j.ra(((java.lang.String) objArr[0]).intern());
        f2242 = raVar;
        int i = getInputSizeshNQ4ISI;
        getOutputMinFrameDurationlomOqCM = (i + 119) % 128;
        getOutputMinFrameDurationlomOqCM = (i + 15) % 128;
        getInputFormats = new util.h.xy.j.ra[]{raVar};
        getOutputFormats = util.h.xy.j.ra.class.toString();
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 93) % 128;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(135:7|8|9|(5:10|11|12|13|14)|(2:16|17)|(2:18|19)|20|(2:21|22)|(2:24|25)|(3:27|28|29)|(30:(5:30|31|32|33|34)|188|189|190|191|192|193|194|(2:196|(9:201|202|203|204|205|206|(1:208)|209|(1:211)(2:335|336))(2:198|199))(1:349)|212|(2:215|213)|216|217|(2:220|218)|221|222|(2:225|223)|226|227|(3:230|231|228)|232|233|234|235|(2:289|(1:(1:(13:304|305|306|307|308|309|(1:311)(1:317)|312|(2:314|315)|244|(2:246|(2:248|(2:253|254)(3:250|251|252))(4:261|262|263|264))(2:265|(2:267|(2:269|(2:273|274)(2:271|272))(2:279|280)))|255|256))(2:329|330)))|243|244|(0)(0)|255|256)|35|36|37|38|40|41|42|43|45|46|(2:48|49)|50|51|52|53|55|56|57|58|60|61|(2:63|64)|65|66|67|68|70|71|72|73|74|(2:76|77)|78|79|80|81|82|83|84|85|86|87|89|90|92|93|94|(2:95|96)|97|98|99|100|101|102|103|104|105|(2:106|107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|123|124|125|126|128|129|(2:131|132)|133|134|135|136|138|139|140|141|143|144|145|146|148|149|150|151|153|154|(2:156|157)|158|159|160|161|163|164|165|166|167|168|170|171|172|173|174|175|176|177|178|179|181|182|183|184|186|187) */
    /* JADX WARN: Can't wrap try/catch for region: R(136:7|8|9|(5:10|11|12|13|14)|(2:16|17)|(2:18|19)|20|21|22|(2:24|25)|(3:27|28|29)|(30:(5:30|31|32|33|34)|188|189|190|191|192|193|194|(2:196|(9:201|202|203|204|205|206|(1:208)|209|(1:211)(2:335|336))(2:198|199))(1:349)|212|(2:215|213)|216|217|(2:220|218)|221|222|(2:225|223)|226|227|(3:230|231|228)|232|233|234|235|(2:289|(1:(1:(13:304|305|306|307|308|309|(1:311)(1:317)|312|(2:314|315)|244|(2:246|(2:248|(2:253|254)(3:250|251|252))(4:261|262|263|264))(2:265|(2:267|(2:269|(2:273|274)(2:271|272))(2:279|280)))|255|256))(2:329|330)))|243|244|(0)(0)|255|256)|35|36|37|38|40|41|42|43|45|46|(2:48|49)|50|51|52|53|55|56|57|58|60|61|(2:63|64)|65|66|67|68|70|71|72|73|74|(2:76|77)|78|79|80|81|82|83|84|85|86|87|89|90|92|93|94|(2:95|96)|97|98|99|100|101|102|103|104|105|(2:106|107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|123|124|125|126|128|129|(2:131|132)|133|134|135|136|138|139|140|141|143|144|145|146|148|149|150|151|153|154|(2:156|157)|158|159|160|161|163|164|165|166|167|168|170|171|172|173|174|175|176|177|178|179|181|182|183|184|186|187) */
    /* JADX WARN: Can't wrap try/catch for region: R(165:7|8|9|(5:10|11|12|13|14)|(2:16|17)|(2:18|19)|20|21|22|(2:24|25)|(3:27|28|29)|(5:30|31|32|33|34)|35|36|37|38|40|41|42|43|45|46|(2:48|49)|50|51|52|53|55|56|57|58|60|61|(2:63|64)|65|66|67|68|70|71|72|73|74|(2:76|77)|78|79|80|81|82|83|84|85|86|87|89|90|92|93|94|(2:95|96)|97|98|99|100|101|102|103|104|105|(2:106|107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|123|124|125|126|128|129|(2:131|132)|133|134|135|136|138|139|140|141|143|144|145|146|148|149|150|151|153|154|(2:156|157)|158|159|160|161|163|164|165|166|167|168|170|171|172|173|174|175|176|177|178|179|181|182|183|184|186|187|188|189|190|191|192|193|194|(2:196|(9:201|202|203|204|205|206|(1:208)|209|(1:211)(2:335|336))(2:198|199))(1:349)|212|(2:215|213)|216|217|(2:220|218)|221|222|(2:225|223)|226|227|(3:230|231|228)|232|233|234|235|(2:289|(1:(1:(13:304|305|306|307|308|309|(1:311)(1:317)|312|(2:314|315)|244|(2:246|(2:248|(2:253|254)(3:250|251|252))(4:261|262|263|264))(2:265|(2:267|(2:269|(2:273|274)(2:271|272))(2:279|280)))|255|256))(2:329|330)))|243|244|(0)(0)|255|256) */
    /* JADX WARN: Can't wrap try/catch for region: R(166:7|8|9|(5:10|11|12|13|14)|(2:16|17)|(2:18|19)|20|21|22|24|25|(3:27|28|29)|(5:30|31|32|33|34)|35|36|37|38|40|41|42|43|45|46|(2:48|49)|50|51|52|53|55|56|57|58|60|61|(2:63|64)|65|66|67|68|70|71|72|73|74|(2:76|77)|78|79|80|81|82|83|84|85|86|87|89|90|92|93|94|(2:95|96)|97|98|99|100|101|102|103|104|105|(2:106|107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|123|124|125|126|128|129|(2:131|132)|133|134|135|136|138|139|140|141|143|144|145|146|148|149|150|151|153|154|(2:156|157)|158|159|160|161|163|164|165|166|167|168|170|171|172|173|174|175|176|177|178|179|181|182|183|184|186|187|188|189|190|191|192|193|194|(2:196|(9:201|202|203|204|205|206|(1:208)|209|(1:211)(2:335|336))(2:198|199))(1:349)|212|(2:215|213)|216|217|(2:220|218)|221|222|(2:225|223)|226|227|(3:230|231|228)|232|233|234|235|(2:289|(1:(1:(13:304|305|306|307|308|309|(1:311)(1:317)|312|(2:314|315)|244|(2:246|(2:248|(2:253|254)(3:250|251|252))(4:261|262|263|264))(2:265|(2:267|(2:269|(2:273|274)(2:271|272))(2:279|280)))|255|256))(2:329|330)))|243|244|(0)(0)|255|256) */
    /* JADX WARN: Can't wrap try/catch for region: R(170:7|8|9|10|11|12|13|14|(2:16|17)|(2:18|19)|20|21|22|24|25|(3:27|28|29)|(5:30|31|32|33|34)|35|36|37|38|40|41|42|43|45|46|(2:48|49)|50|51|52|53|55|56|57|58|60|61|(2:63|64)|65|66|67|68|70|71|72|73|74|(2:76|77)|78|79|80|81|82|83|84|85|86|87|89|90|92|93|94|(2:95|96)|97|98|99|100|101|102|103|104|105|(2:106|107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|123|124|125|126|128|129|(2:131|132)|133|134|135|136|138|139|140|141|143|144|145|146|148|149|150|151|153|154|(2:156|157)|158|159|160|161|163|164|165|166|167|168|170|171|172|173|174|175|176|177|178|179|181|182|183|184|186|187|188|189|190|191|192|193|194|(2:196|(9:201|202|203|204|205|206|(1:208)|209|(1:211)(2:335|336))(2:198|199))(1:349)|212|(2:215|213)|216|217|(2:220|218)|221|222|(2:225|223)|226|227|(3:230|231|228)|232|233|234|235|(2:289|(1:(1:(13:304|305|306|307|308|309|(1:311)(1:317)|312|(2:314|315)|244|(2:246|(2:248|(2:253|254)(3:250|251|252))(4:261|262|263|264))(2:265|(2:267|(2:269|(2:273|274)(2:271|272))(2:279|280)))|255|256))(2:329|330)))|243|244|(0)(0)|255|256) */
    /* JADX WARN: Can't wrap try/catch for region: R(172:7|8|9|10|11|12|13|14|16|17|18|19|20|21|22|24|25|(3:27|28|29)|(5:30|31|32|33|34)|35|36|37|38|40|41|42|43|45|46|(2:48|49)|50|51|52|53|55|56|57|58|60|61|(2:63|64)|65|66|67|68|70|71|72|73|74|(2:76|77)|78|79|80|81|82|83|84|85|86|87|89|90|92|93|94|(2:95|96)|97|98|99|100|101|102|103|104|105|(2:106|107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|123|124|125|126|128|129|(2:131|132)|133|134|135|136|138|139|140|141|143|144|145|146|148|149|150|151|153|154|(2:156|157)|158|159|160|161|163|164|165|166|167|168|170|171|172|173|174|175|176|177|178|179|181|182|183|184|186|187|188|189|190|191|192|193|194|(2:196|(9:201|202|203|204|205|206|(1:208)|209|(1:211)(2:335|336))(2:198|199))(1:349)|212|(2:215|213)|216|217|(2:220|218)|221|222|(2:225|223)|226|227|(3:230|231|228)|232|233|234|235|(2:289|(1:(1:(13:304|305|306|307|308|309|(1:311)(1:317)|312|(2:314|315)|244|(2:246|(2:248|(2:253|254)(3:250|251|252))(4:261|262|263|264))(2:265|(2:267|(2:269|(2:273|274)(2:271|272))(2:279|280)))|255|256))(2:329|330)))|243|244|(0)(0)|255|256) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:(9:(5:30|31|32|33|34)|234|235|(2:289|(1:(1:(13:304|305|306|307|308|309|(1:311)(1:317)|312|(2:314|315)|244|(2:246|(2:248|(2:253|254)(3:250|251|252))(4:261|262|263|264))(2:265|(2:267|(2:269|(2:273|274)(2:271|272))(2:279|280)))|255|256))(2:329|330)))|243|244|(0)(0)|255|256)|188|189|190|191|192|193|194|(2:196|(9:201|202|203|204|205|206|(1:208)|209|(1:211)(2:335|336))(2:198|199))(1:349)|212|(2:215|213)|216|217|(2:220|218)|221|222|(2:225|223)|226|227|(3:230|231|228)|232|233) */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0938, code lost:
    
        if (r1 == (-91)) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0c3f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x03dd, code lost:
    
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0327, code lost:
    
        r27 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0943 A[Catch: InternalComponentException -> 0x0c41, UnsupportedEncodingException -> 0x0c72, LOOP:0: B:213:0x093f->B:215:0x0943, LOOP_END, TryCatch #11 {UnsupportedEncodingException -> 0x0c72, blocks: (B:189:0x0823, B:192:0x0832, B:193:0x0834, B:203:0x084f, B:212:0x093a, B:215:0x0943, B:220:0x0950, B:225:0x0966, B:230:0x0971, B:235:0x097b, B:238:0x0980, B:240:0x0984, B:282:0x098d, B:284:0x0992, B:289:0x099d, B:306:0x09ce, B:314:0x0a72, B:315:0x0a88, B:319:0x0a8a, B:321:0x0a90, B:322:0x0a91, B:325:0x0a93, B:327:0x0a99, B:328:0x0a9a, B:329:0x0a9b, B:330:0x0ab1, B:335:0x08f2, B:336:0x090a, B:339:0x090c, B:341:0x0912, B:342:0x0913, B:198:0x091d, B:199:0x0933, B:345:0x0915, B:347:0x091b, B:348:0x091c), top: B:188:0x0823, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0950 A[Catch: InternalComponentException -> 0x0c41, UnsupportedEncodingException -> 0x0c72, LOOP:1: B:218:0x094c->B:220:0x0950, LOOP_END, TryCatch #11 {UnsupportedEncodingException -> 0x0c72, blocks: (B:189:0x0823, B:192:0x0832, B:193:0x0834, B:203:0x084f, B:212:0x093a, B:215:0x0943, B:220:0x0950, B:225:0x0966, B:230:0x0971, B:235:0x097b, B:238:0x0980, B:240:0x0984, B:282:0x098d, B:284:0x0992, B:289:0x099d, B:306:0x09ce, B:314:0x0a72, B:315:0x0a88, B:319:0x0a8a, B:321:0x0a90, B:322:0x0a91, B:325:0x0a93, B:327:0x0a99, B:328:0x0a9a, B:329:0x0a9b, B:330:0x0ab1, B:335:0x08f2, B:336:0x090a, B:339:0x090c, B:341:0x0912, B:342:0x0913, B:198:0x091d, B:199:0x0933, B:345:0x0915, B:347:0x091b, B:348:0x091c), top: B:188:0x0823, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0966 A[Catch: InternalComponentException -> 0x0c41, UnsupportedEncodingException -> 0x0c72, LOOP:2: B:223:0x0962->B:225:0x0966, LOOP_END, TryCatch #11 {UnsupportedEncodingException -> 0x0c72, blocks: (B:189:0x0823, B:192:0x0832, B:193:0x0834, B:203:0x084f, B:212:0x093a, B:215:0x0943, B:220:0x0950, B:225:0x0966, B:230:0x0971, B:235:0x097b, B:238:0x0980, B:240:0x0984, B:282:0x098d, B:284:0x0992, B:289:0x099d, B:306:0x09ce, B:314:0x0a72, B:315:0x0a88, B:319:0x0a8a, B:321:0x0a90, B:322:0x0a91, B:325:0x0a93, B:327:0x0a99, B:328:0x0a9a, B:329:0x0a9b, B:330:0x0ab1, B:335:0x08f2, B:336:0x090a, B:339:0x090c, B:341:0x0912, B:342:0x0913, B:198:0x091d, B:199:0x0933, B:345:0x0915, B:347:0x091b, B:348:0x091c), top: B:188:0x0823, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0971 A[Catch: InternalComponentException -> 0x0c41, UnsupportedEncodingException -> 0x0c72, TRY_LEAVE, TryCatch #11 {UnsupportedEncodingException -> 0x0c72, blocks: (B:189:0x0823, B:192:0x0832, B:193:0x0834, B:203:0x084f, B:212:0x093a, B:215:0x0943, B:220:0x0950, B:225:0x0966, B:230:0x0971, B:235:0x097b, B:238:0x0980, B:240:0x0984, B:282:0x098d, B:284:0x0992, B:289:0x099d, B:306:0x09ce, B:314:0x0a72, B:315:0x0a88, B:319:0x0a8a, B:321:0x0a90, B:322:0x0a91, B:325:0x0a93, B:327:0x0a99, B:328:0x0a9a, B:329:0x0a9b, B:330:0x0ab1, B:335:0x08f2, B:336:0x090a, B:339:0x090c, B:341:0x0912, B:342:0x0913, B:198:0x091d, B:199:0x0933, B:345:0x0915, B:347:0x091b, B:348:0x091c), top: B:188:0x0823, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a9b A[Catch: InternalComponentException -> 0x0c41, UnsupportedEncodingException -> 0x0c72, TryCatch #11 {UnsupportedEncodingException -> 0x0c72, blocks: (B:189:0x0823, B:192:0x0832, B:193:0x0834, B:203:0x084f, B:212:0x093a, B:215:0x0943, B:220:0x0950, B:225:0x0966, B:230:0x0971, B:235:0x097b, B:238:0x0980, B:240:0x0984, B:282:0x098d, B:284:0x0992, B:289:0x099d, B:306:0x09ce, B:314:0x0a72, B:315:0x0a88, B:319:0x0a8a, B:321:0x0a90, B:322:0x0a91, B:325:0x0a93, B:327:0x0a99, B:328:0x0a9a, B:329:0x0a9b, B:330:0x0ab1, B:335:0x08f2, B:336:0x090a, B:339:0x090c, B:341:0x0912, B:342:0x0913, B:198:0x091d, B:199:0x0933, B:345:0x0915, B:347:0x091b, B:348:0x091c), top: B:188:0x0823, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0934  */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26905(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) throws com.gemalto.mfs.mwsdk.exception.DeviceCVMException {
        java.lang.String str;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        java.lang.String str2;
        int i;
        int m24553;
        java.lang.String str3;
        java.lang.String str4;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        java.lang.Class<?> cls;
        java.lang.String str5;
        java.lang.Class<?>[] clsArr;
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 21) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(false, new int[]{45, 22, 0, 7}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr);
        java.lang.String str6 = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1240994064, -865652783, 1747552487, 1933786740, 618510115, 808321584, -1935119518, 516871301}, 19 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        java.lang.String str7 = (java.lang.String) objArr2[0];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 25, 118, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr3);
        java.lang.String str8 = (java.lang.String) objArr3[0];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, 561082527, -1809881314, 1818658149, 983739234, 1212974051, -1994345012}, android.text.TextUtils.getOffsetBefore("", 0) + 23, objArr4);
        java.lang.String str9 = (java.lang.String) objArr4[0];
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(true, new int[]{19, 26, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", objArr5);
        java.lang.String str10 = (java.lang.String) objArr5[0];
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u000f\uffc1￦\u0013\u0013\u0010\u0013￤\u0010\u0005\u0006ￛ￥\u0006\u0017\n\u0004\u0006\uffc1\u0014\u0015\u0002\u0015\u0006\uffc1\n\u0014\uffc1\u000f\u0010\u0015\uffc1\u0014\u0016\n\u0015\u0002\u0003\r\u0006\uffc1\u0007\u0010\u0013\uffc1\u0006\u0019\u0006\u0004\u0016\u0015\n\u000f\b\uffc1\u0015\t\n\u0014\uffc1\u0010\u0011\u0006\u0013\u0002\u0015\n\u0010", android.view.View.getDefaultSize(0, 0) + 68, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 13, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 187, false, objArr6);
        java.lang.String intern = ((java.lang.String) objArr6[0]).intern();
        if (!util.h.xy.ag.a.m24556().m24560()) {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0011\u0003\u0012￡\r\f\u0012\u0003\u0016\u0012ﾾ\f\r\u0012ﾾ", 15 - android.view.View.resolveSize(0, 0), 3 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, false, objArr7);
            throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(((java.lang.String) objArr7[0]).intern());
        }
        try {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-801538124, -232932835, 369318489, 1058965099, 1417171808, 2045311225, 940865126, 338567820}, 16 - android.view.KeyEvent.normalizeMetaState(0), objArr8);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(true, new int[]{0, 19, 0, 1}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", objArr9);
            if (((java.lang.Boolean) cls2.getMethod((java.lang.String) objArr9[0], null).invoke(null, null)).booleanValue()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(intern);
                sb.append(803);
                throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(sb.toString());
            }
            byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
            byte[] bArr4 = new byte[131];
            ((java.security.SecureRandom) java.lang.Class.forName(str10).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr4);
            byte[] bArr5 = new byte[128];
            byte[] bArr6 = new byte[3];
            util.h.xy.a.ra raVar = new util.h.xy.a.ra();
            try {
                str = "";
                try {
                    raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f143, new java.lang.Class[0]));
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception unused2) {
                str = "";
            }
            try {
                raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f144, java.lang.String.class));
            } catch (java.lang.Exception unused3) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f118, java.lang.String.class));
            } catch (java.lang.Exception unused4) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f99, java.lang.String.class, java.lang.Class.class));
            } catch (java.lang.Exception unused5) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f191, java.lang.String.class));
            } catch (java.lang.Exception unused6) {
            }
            try {
                cls = java.lang.Class.forName(str6);
                str5 = util.h.xy.al.b.f128;
                clsArr = new java.lang.Class[1];
                bArr = bArr6;
            } catch (java.lang.Exception unused7) {
                bArr = bArr6;
            }
            try {
                try {
                    try {
                        try {
                            bArr2 = bArr5;
                            try {
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, 1365694600, -1409223263, 280413083, 1533707178, -2018011536, -1758208937, -115432462, 168875166, 1831623893, 1894906857}, 30 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr10);
                                clsArr[0] = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                raVar.m24514(cls.getMethod(str5, clsArr));
                            } catch (java.lang.Exception unused8) {
                            }
                        } catch (java.lang.Exception unused9) {
                            bArr2 = bArr5;
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f198, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f126, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f165, new java.lang.Class[0]));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f180, java.lang.String.class, java.security.KeyStore.ProtectionParameter.class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f174, java.lang.String.class, char[].class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f130, new java.lang.Class[0]));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f195, new java.lang.Class[0]));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f95, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f185, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f197, java.io.InputStream.class, char[].class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f197, java.security.KeyStore.LoadStoreParameter.class));
                            java.lang.Class<?> cls3 = java.lang.Class.forName(str6);
                            java.lang.String str11 = util.h.xy.al.b.f193;
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[2];
                            clsArr2[0] = java.lang.String.class;
                            bArr3 = m25017;
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, 1365694600, -1409223263, 280413083, 1533707178, -2018011536, -1758208937, -115432462, 168875166, 1831623893, 1894906857}, android.view.View.resolveSize(0, 0) + 30, objArr11);
                            clsArr2[1] = java.lang.Class.forName((java.lang.String) objArr11[0]);
                            raVar.m24514(cls3.getMethod(str11, clsArr2));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f119, java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class));
                            java.lang.Class<?> cls4 = java.lang.Class.forName(str6);
                            java.lang.String str12 = util.h.xy.al.b.f108;
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{-2142919325, -1246186812, -442079802, 595894774, 1383140955, -1699283157, -841649095, 1918447967, 1144010183, 848599358, 585486707, -1514738528, -2123112209, 2097845555, 1591559707, 1959332, -502110375, 1939714273}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 34, objArr12);
                            raVar.m24514(cls4.getMethod(str12, java.lang.String.class, byte[].class, java.lang.Class.forName((java.lang.String) objArr12[0])));
                            java.lang.Class<?> cls5 = java.lang.Class.forName(str6);
                            java.lang.String str13 = util.h.xy.al.b.f108;
                            java.lang.Class<?>[] clsArr3 = new java.lang.Class[4];
                            clsArr3[0] = java.lang.String.class;
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(true, new int[]{67, 17, 77, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", objArr13);
                            clsArr3[1] = java.lang.Class.forName((java.lang.String) objArr13[0]);
                            clsArr3[2] = char[].class;
                            str2 = intern;
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{-2142919325, -1246186812, -442079802, 595894774, 1383140955, -1699283157, -841649095, 1918447967, 1144010183, 848599358, 585486707, -1514738528, -2123112209, 2097845555, 1591559707, 1959332, -502110375, 1939714273}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, objArr14);
                            clsArr3[3] = java.lang.Class.forName((java.lang.String) objArr14[0]);
                            raVar.m24514(cls5.getMethod(str13, clsArr3));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f107, java.security.KeyStore.LoadStoreParameter.class));
                            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f107, java.io.OutputStream.class, char[].class));
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{-801538124, -232932835, 369318489, 1058965099, 1417171808, 2045311225, 940865126, 338567820}, android.view.KeyEvent.normalizeMetaState(0) + 16, objArr15);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr15[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
                            raVar.m24514(java.security.KeyStore.CallbackHandlerProtection.class.getMethod(util.h.xy.al.b.f145, new java.lang.Class[0]));
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(false, new int[]{84, 38, 187, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr16);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr16[0]).getMethod(util.h.xy.al.b.f191, new java.lang.Class[0]));
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(false, new int[]{84, 38, 187, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr17);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr17[0]).getMethod(util.h.xy.al.b.f198, new java.lang.Class[0]));
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(false, new int[]{84, 38, 187, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr18);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr18[0]).getMethod(util.h.xy.al.b.f181, new java.lang.Class[0]));
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(false, new int[]{84, 38, 187, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr19);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr19[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, -1026405513, 878165985, -1640335052, -1398778410, 1125365474, -1575046168, 26356659, -963580233, 181289206, -867155482, 1000699915, 1545829821, -1392586741, 1337460750}, 36 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr20);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr20[0]).getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, -1026405513, 878165985, -1640335052, -1398778410, 1125365474, -1575046168, 26356659, -963580233, 181289206, -867155482, 1000699915, 1545829821, -1392586741, 1337460750}, android.graphics.Color.rgb(0, 0, 0) + 16777253, objArr21);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr21[0]).getMethod(util.h.xy.al.b.f158, new java.lang.Class[0]));
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, -1026405513, 878165985, -1640335052, -1398778410, 1125365474, -1575046168, 26356659, -963580233, 181289206, -867155482, 1000699915, 1545829821, -1392586741, 1337460750}, android.view.View.MeasureSpec.getSize(0) + 37, objArr22);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr22[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                            raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
                            raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f146, new java.lang.Class[0]));
                            raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                            raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                            raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                            java.lang.Class<?> cls6 = java.lang.Class.forName(str7);
                            java.lang.String str14 = util.h.xy.al.b.f121;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(true, new int[]{67, 17, 77, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", objArr23);
                            raVar.m24514(cls6.getMethod(str14, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr23[0])));
                            raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f192, byte[].class));
                            raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f192, byte[].class, java.lang.Integer.TYPE));
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f121, java.lang.Integer.TYPE, java.lang.Class.forName(str10)));
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f182, new java.lang.Class[0]));
                            raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                            raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                            java.lang.Class<?> cls7 = java.lang.Class.forName(str9);
                            java.lang.String str15 = util.h.xy.al.b.f190;
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, 763117496, -1554979307, 1078034226, 1739141775, -342278319, 309310575}, 25 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr24);
                            raVar.m24514(cls7.getMethod(str15, java.lang.Class.forName((java.lang.String) objArr24[0])));
                            java.lang.Class<?> cls8 = java.lang.Class.forName(str9);
                            java.lang.String str16 = util.h.xy.al.b.f190;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, 763117496, -1554979307, 1078034226, 1739141775, -342278319, 309310575}, 24 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr25);
                            raVar.m24514(cls8.getMethod(str16, java.lang.Class.forName((java.lang.String) objArr25[0]), java.lang.Class.forName(str10)));
                            raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f196, byte[].class));
                            raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f194, new java.lang.Class[0]));
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(false, new int[]{147, 47, 0, 44}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", objArr26);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr26[0]).getMethod(util.h.xy.al.b.f97, java.lang.Boolean.TYPE));
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(false, new int[]{147, 47, 0, 44}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", objArr27);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr27[0]).getMethod(util.h.xy.al.b.f98, java.lang.Integer.TYPE));
                            raVar.m24514(android.provider.Settings.Secure.class.getMethod(util.h.xy.al.b.f106, android.content.ContentResolver.class, java.lang.String.class));
                            raVar.m24514(java.lang.Class.forName(str10).getMethod(util.h.xy.al.b.f133, byte[].class));
                            raVar.m24514(java.lang.Class.forName(str10).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
                            raVar.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
                            byte[] m27594 = util.h.xy.v.b.f2439.m27594(bArr4, util.h.xy.a.ma.m24504(raVar));
                            m24553 = util.h.xy.af.mb.m24551().m24553(m27594[0]);
                            if (m24553 != -91) {
                            }
                            byte[] bArr7 = new byte[131];
                            i2 = 0;
                            while (i2 < 131) {
                            }
                            while (i3 < 131) {
                            }
                            while (i4 < 128) {
                            }
                            while (i5 < 3) {
                            }
                            i = 0;
                            b = bArr[0];
                            if (b == 0) {
                            }
                            b4 = bArr2[b];
                            b5 = bArr2[b2];
                            b6 = bArr2[b3];
                            if (b4 < b5) {
                                if (b6 >= b4) {
                                }
                            }
                            str4 = str;
                            if (cHVerificationMethod == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) {
                            }
                            getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 89) % 128;
                            return;
                        }
                        b = bArr[0];
                        if ((b == 0 || bArr[1] != 0 || bArr[2] != 0) && b >= 0 && (b2 = bArr[1]) >= 0 && (b3 = bArr[2]) >= 0 && b != b2 && b2 != b3 && b != b3) {
                            b4 = bArr2[b];
                            b5 = bArr2[b2];
                            b6 = bArr2[b3];
                            if (b4 < b5 && b4 >= 0 && b4 <= 100 && b5 >= 0 && b5 <= 100 && b6 >= 0 && b6 <= 100) {
                                if (b6 >= b4) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(str3);
                                    sb2.append(801);
                                    throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(sb2.toString());
                                }
                                if (b6 < b5 && b6 >= b4 && b6 < b5) {
                                    try {
                                        int nextInt = ((java.security.SecureRandom) java.lang.Class.forName(str10).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                        try {
                                            java.lang.Object[] objArr28 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt)};
                                            java.lang.Object obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                            if (obj == null) {
                                                str4 = str;
                                                java.lang.Class cls9 = (java.lang.Class) util.h.xy.dd.b.m26271(android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (char) (47456 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 21 - (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                Camera2StreamConfigurationMap(objArr29);
                                                java.lang.String str17 = (java.lang.String) objArr29[0];
                                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(new int[]{-801538124, -232932835, 369318489, 1058965099, 919939854, -1220357490, 1352423220, 30779530, -1964240559, 60529441, 199708332, 1152819278}, 23 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr30);
                                                obj = cls9.getMethod(str17, java.lang.Class.forName((java.lang.String) objArr30[0]), java.lang.Integer.TYPE);
                                                util.h.xy.dd.b.f1176.put(-1119310920, obj);
                                            } else {
                                                str4 = str;
                                            }
                                            if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr28)).intValue() != nextInt) {
                                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                                sb3.append(str3);
                                                sb3.append(com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED);
                                                throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(sb3.toString());
                                            }
                                            if (cHVerificationMethod == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) {
                                                com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24534 = util.h.xy.aa.rb.m24534(util.h.xy.ag.a.m24556().m24558());
                                                if (m24534 != com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SUPPORTED) {
                                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap("\uffc1\u0003\n\u0010\u000e\u0006\u0015\u0013\n\u0004\uffc1\u0007\n\u000f\b\u0006\u0013\u0011\u0013\n\u000f\u0015\uffc1ￛ\uffc1\ufff6\u000f\u0002\u0003\r\u0006\uffc1\u0015\u0010\uffc1\n\u000f\n\u0015\n\u0002\r\n\u001b\u0006", 46 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 25 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 188, false, objArr31);
                                                    sb4.append(((java.lang.String) objArr31[0]).intern());
                                                    sb4.append(m24534.toString());
                                                    throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(sb4.toString());
                                                }
                                                if (!util.h.xy.j.ma.f2241.m26902()) {
                                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap("\u0010\u0013\u0015\uffc1\u0015\t\n\u0014\uffc1\u0007\u0006\u0002\u0015\u0016\u0013\u0006ￏ\ufff5\t\u0006\uffc1\u0004\u0002\u0013\u0005\uffc1\u0011\u0013\u0010\u0007\n\r\u0006\uffc1\u0005\u0010\u0006\u0014\uffc1\u000f\u0010\u0015\uffc1\u0014\u0016\u0011\u0011", 47 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, 187 - android.widget.ExpandableListView.getPackedPositionGroup(0L), false, objArr32);
                                                    throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(((java.lang.String) objArr32[0]).intern());
                                                }
                                                try {
                                                    Camera2StreamConfigurationMap(cHVerificationMethod);
                                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                                    throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(e.getLocalizedMessage());
                                                }
                                            } else if (cHVerificationMethod == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
                                                com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport m24533 = util.h.xy.aa.rb.m24533(util.h.xy.ag.a.m24556().m24558());
                                                if (m24533 != com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport.SUPPORTED) {
                                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap("ￃ\u0017\u0012ￃ\f\u0011\f\u0017\f\u0004\u000f\f\u001d\bￃ\u0007\b\u0019\f\u0006\bￃ\u000e\b\u001c\n\u0018\u0004\u0015\u0007ￃ\uffddￃ\ufff8\u0011\u0004\u0005\u000f\b", android.text.TextUtils.getCapsMode(str4, 0, 0) + 39, 33 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 186, false, objArr33);
                                                    sb5.append(((java.lang.String) objArr33[0]).intern());
                                                    sb5.append(m24533.toString());
                                                    throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(sb5.toString());
                                                }
                                                if (!util.h.xy.j.ma.f2241.m26902()) {
                                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap("\u0010\u0013\u0015\uffc1\u0015\t\n\u0014\uffc1\u0007\u0006\u0002\u0015\u0016\u0013\u0006ￏ\ufff5\t\u0006\uffc1\u0004\u0002\u0013\u0005\uffc1\u0011\u0013\u0010\u0007\n\r\u0006\uffc1\u0005\u0010\u0006\u0014\uffc1\u000f\u0010\u0015\uffc1\u0014\u0016\u0011\u0011", 47 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.KeyEvent.keyCodeFromString(str4) + 17, android.text.TextUtils.getOffsetBefore(str4, 0) + 187, false, objArr34);
                                                    throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(((java.lang.String) objArr34[0]).intern());
                                                }
                                                try {
                                                    Camera2StreamConfigurationMap(cHVerificationMethod);
                                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                                                    throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(e2.getLocalizedMessage());
                                                }
                                            }
                                            getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 89) % 128;
                                            return;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 == null) {
                                            throw th2;
                                        }
                                        throw cause2;
                                    }
                                }
                            }
                        }
                        str4 = str;
                        if (cHVerificationMethod == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) {
                        }
                        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 89) % 128;
                        return;
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused10) {
                        int defaultSize = android.view.View.getDefaultSize(i, i);
                        int green = android.graphics.Color.green(i);
                        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(i);
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\u0011ﾽ\u0002\u000f\u000f\f\u000f￦\u000b\r\u0012\u0011ﾽ\t\u0006\u0010", 16 - defaultSize, green + 7, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, false, objArr35);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr35[0]).intern());
                    }
                    byte[] m275942 = util.h.xy.v.b.f2439.m27594(bArr4, util.h.xy.a.ma.m24504(raVar));
                    m24553 = util.h.xy.af.mb.m24551().m24553(m275942[0]);
                    if (m24553 != -91) {
                        str3 = str2;
                    } else {
                        if (m24553 != 111) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(str2);
                            sb6.append(m24553);
                            throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(sb6.toString());
                        }
                        try {
                            int nextInt2 = ((java.security.SecureRandom) java.lang.Class.forName(str10).getDeclaredConstructor(null).newInstance(null)).nextInt();
                            try {
                                java.lang.Object[] objArr36 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt2)};
                                java.lang.Object obj2 = util.h.xy.dd.b.f1176.get(-1119310920);
                                if (obj2 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) util.h.xy.dd.b.m26271((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47455), 22 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap(objArr37);
                                    java.lang.String str18 = (java.lang.String) objArr37[0];
                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(new int[]{-801538124, -232932835, 369318489, 1058965099, 919939854, -1220357490, 1352423220, 30779530, -1964240559, 60529441, 199708332, 1152819278}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 23, objArr38);
                                    obj2 = cls10.getMethod(str18, java.lang.Class.forName((java.lang.String) objArr38[0]), java.lang.Integer.TYPE);
                                    util.h.xy.dd.b.f1176.put(-1119310920, obj2);
                                }
                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr36)).intValue() != nextInt2) {
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    sb7.append(str2);
                                    sb7.append(com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED);
                                    throw new com.gemalto.mfs.mwsdk.exception.DeviceCVMException(sb7.toString());
                                }
                                str3 = str2;
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    }
                    byte[] bArr72 = new byte[131];
                    i2 = 0;
                    while (i2 < 131) {
                        int i6 = i2 + 1;
                        bArr72[i2] = m275942[i6];
                        i2 = i6;
                    }
                    for (i3 = 0; i3 < 131; i3++) {
                        byte b7 = (byte) (bArr72[i3] ^ bArr3[i3]);
                        bArr72[i3] = b7;
                        bArr72[i3] = (byte) (b7 ^ bArr4[i3]);
                    }
                    for (i4 = 0; i4 < 128; i4++) {
                        bArr2[i4] = bArr72[i4];
                    }
                    for (i5 = 0; i5 < 3; i5++) {
                        bArr[i5] = bArr72[i5 + 128];
                    }
                    i = 0;
                } catch (java.io.UnsupportedEncodingException unused11) {
                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\ufffe\t￠ﾻ\uffff\u0000\u000f\r\n\u000b\u000b\u0010\u000e\t\ufff0\u0002\t\u0004\uffff\n", 21 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), 15 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 193 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, objArr39);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr39[0]).intern());
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused12) {
                i = 0;
            }
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f198, java.lang.String.class));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f126, java.lang.String.class));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f165, new java.lang.Class[0]));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f180, java.lang.String.class, java.security.KeyStore.ProtectionParameter.class));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            try {
                raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused13) {
            }
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f174, java.lang.String.class, char[].class));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f130, new java.lang.Class[0]));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f195, new java.lang.Class[0]));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f95, java.lang.String.class));
            try {
                raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f185, java.lang.String.class));
            } catch (java.lang.Exception unused14) {
            }
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f197, java.io.InputStream.class, char[].class));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f197, java.security.KeyStore.LoadStoreParameter.class));
            java.lang.Class<?> cls32 = java.lang.Class.forName(str6);
            java.lang.String str112 = util.h.xy.al.b.f193;
            java.lang.Class<?>[] clsArr22 = new java.lang.Class[2];
            clsArr22[0] = java.lang.String.class;
            bArr3 = m25017;
            java.lang.Object[] objArr112 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, 1365694600, -1409223263, 280413083, 1533707178, -2018011536, -1758208937, -115432462, 168875166, 1831623893, 1894906857}, android.view.View.resolveSize(0, 0) + 30, objArr112);
            clsArr22[1] = java.lang.Class.forName((java.lang.String) objArr112[0]);
            raVar.m24514(cls32.getMethod(str112, clsArr22));
            try {
                raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f119, java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class));
            } catch (java.lang.Exception unused15) {
            }
            java.lang.Class<?> cls42 = java.lang.Class.forName(str6);
            java.lang.String str122 = util.h.xy.al.b.f108;
            java.lang.Object[] objArr122 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-2142919325, -1246186812, -442079802, 595894774, 1383140955, -1699283157, -841649095, 1918447967, 1144010183, 848599358, 585486707, -1514738528, -2123112209, 2097845555, 1591559707, 1959332, -502110375, 1939714273}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 34, objArr122);
            raVar.m24514(cls42.getMethod(str122, java.lang.String.class, byte[].class, java.lang.Class.forName((java.lang.String) objArr122[0])));
            java.lang.Class<?> cls52 = java.lang.Class.forName(str6);
            java.lang.String str132 = util.h.xy.al.b.f108;
            java.lang.Class<?>[] clsArr32 = new java.lang.Class[4];
            clsArr32[0] = java.lang.String.class;
            java.lang.Object[] objArr132 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(true, new int[]{67, 17, 77, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", objArr132);
            clsArr32[1] = java.lang.Class.forName((java.lang.String) objArr132[0]);
            clsArr32[2] = char[].class;
            str2 = intern;
            java.lang.Object[] objArr142 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-2142919325, -1246186812, -442079802, 595894774, 1383140955, -1699283157, -841649095, 1918447967, 1144010183, 848599358, 585486707, -1514738528, -2123112209, 2097845555, 1591559707, 1959332, -502110375, 1939714273}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, objArr142);
            clsArr32[3] = java.lang.Class.forName((java.lang.String) objArr142[0]);
            raVar.m24514(cls52.getMethod(str132, clsArr32));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f107, java.security.KeyStore.LoadStoreParameter.class));
            raVar.m24514(java.lang.Class.forName(str6).getMethod(util.h.xy.al.b.f107, java.io.OutputStream.class, char[].class));
            try {
                java.lang.Object[] objArr152 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{-801538124, -232932835, 369318489, 1058965099, 1417171808, 2045311225, 940865126, 338567820}, android.view.KeyEvent.normalizeMetaState(0) + 16, objArr152);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr152[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
            } catch (java.lang.Exception unused16) {
            }
            raVar.m24514(java.security.KeyStore.CallbackHandlerProtection.class.getMethod(util.h.xy.al.b.f145, new java.lang.Class[0]));
            java.lang.Object[] objArr162 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{84, 38, 187, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr162);
            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr162[0]).getMethod(util.h.xy.al.b.f191, new java.lang.Class[0]));
            java.lang.Object[] objArr172 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{84, 38, 187, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr172);
            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr172[0]).getMethod(util.h.xy.al.b.f198, new java.lang.Class[0]));
            try {
                java.lang.Object[] objArr182 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(false, new int[]{84, 38, 187, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr182);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr182[0]).getMethod(util.h.xy.al.b.f181, new java.lang.Class[0]));
            } catch (java.lang.Exception unused17) {
            }
            java.lang.Object[] objArr192 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{84, 38, 187, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr192);
            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr192[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            java.lang.Object[] objArr202 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, -1026405513, 878165985, -1640335052, -1398778410, 1125365474, -1575046168, 26356659, -963580233, 181289206, -867155482, 1000699915, 1545829821, -1392586741, 1337460750}, 36 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr202);
            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr202[0]).getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
            java.lang.Object[] objArr212 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, -1026405513, 878165985, -1640335052, -1398778410, 1125365474, -1575046168, 26356659, -963580233, 181289206, -867155482, 1000699915, 1545829821, -1392586741, 1337460750}, android.graphics.Color.rgb(0, 0, 0) + 16777253, objArr212);
            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr212[0]).getMethod(util.h.xy.al.b.f158, new java.lang.Class[0]));
            java.lang.Object[] objArr222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, -1026405513, 878165985, -1640335052, -1398778410, 1125365474, -1575046168, 26356659, -963580233, 181289206, -867155482, 1000699915, 1545829821, -1392586741, 1337460750}, android.view.View.MeasureSpec.getSize(0) + 37, objArr222);
            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr222[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
            raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f146, new java.lang.Class[0]));
            raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            try {
                raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused18) {
            }
            raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            java.lang.Class<?> cls62 = java.lang.Class.forName(str7);
            java.lang.String str142 = util.h.xy.al.b.f121;
            java.lang.Object[] objArr232 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(true, new int[]{67, 17, 77, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", objArr232);
            raVar.m24514(cls62.getMethod(str142, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr232[0])));
            raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f192, byte[].class));
            raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f192, byte[].class, java.lang.Integer.TYPE));
            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f121, java.lang.Integer.TYPE, java.lang.Class.forName(str10)));
            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f182, new java.lang.Class[0]));
            try {
                raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused19) {
            }
            raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            java.lang.Class<?> cls72 = java.lang.Class.forName(str9);
            java.lang.String str152 = util.h.xy.al.b.f190;
            java.lang.Object[] objArr242 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, 763117496, -1554979307, 1078034226, 1739141775, -342278319, 309310575}, 25 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr242);
            raVar.m24514(cls72.getMethod(str152, java.lang.Class.forName((java.lang.String) objArr242[0])));
            java.lang.Class<?> cls82 = java.lang.Class.forName(str9);
            java.lang.String str162 = util.h.xy.al.b.f190;
            java.lang.Object[] objArr252 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1729971556, -869781, -1843230376, 997649589, -1891413597, -634252738, 763117496, -1554979307, 1078034226, 1739141775, -342278319, 309310575}, 24 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr252);
            raVar.m24514(cls82.getMethod(str162, java.lang.Class.forName((java.lang.String) objArr252[0]), java.lang.Class.forName(str10)));
            raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f196, byte[].class));
            raVar.m24514(java.lang.Class.forName(str9).getMethod(util.h.xy.al.b.f194, new java.lang.Class[0]));
            java.lang.Object[] objArr262 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{147, 47, 0, 44}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", objArr262);
            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr262[0]).getMethod(util.h.xy.al.b.f97, java.lang.Boolean.TYPE));
            java.lang.Object[] objArr272 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{147, 47, 0, 44}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", objArr272);
            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr272[0]).getMethod(util.h.xy.al.b.f98, java.lang.Integer.TYPE));
            raVar.m24514(android.provider.Settings.Secure.class.getMethod(util.h.xy.al.b.f106, android.content.ContentResolver.class, java.lang.String.class));
            raVar.m24514(java.lang.Class.forName(str10).getMethod(util.h.xy.al.b.f133, byte[].class));
            raVar.m24514(java.lang.Class.forName(str10).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
            raVar.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause5 = th5.getCause();
            if (cause5 == null) {
                throw th5;
            }
            throw cause5;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26906(byte[] bArr) {
        util.h.xy.f.b bVar;
        util.h.xy.f.ma maVar;
        boolean z;
        int i = getOutputMinFrameDurationlomOqCM;
        getInputSizeshNQ4ISI = (i + 15) % 128;
        if (bArr != null && bArr.length > 0) {
            int i2 = i + 57;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                bVar = util.h.xy.f.b.f2201;
                maVar = util.h.xy.f.ma.f2205;
                z = true;
            } else {
                bVar = util.h.xy.f.b.f2201;
                maVar = util.h.xy.f.ma.f2205;
                z = false;
            }
            bVar.m26764(maVar, bArr, z);
        }
        int i3 = getInputSizeshNQ4ISI + 21;
        int i4 = i3 % 128;
        getOutputMinFrameDurationlomOqCM = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = i4 + 75;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getOutputMinFrameDuration;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getOutputMinFrameDuration;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 91) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getHighSpeedVideoSizesFor ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void Camera2StreamConfigurationMap(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getHighSpeedVideoFpsRanges;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bytes != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 19;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            util.h.xy.j.ma.f2241.m26900();
            throw new java.lang.ArithmeticException();
        }
        if (util.h.xy.j.ma.f2241.m26900() == null) {
            cHVerificationMethod.getValue();
            util.h.xy.u.a.f2431.m27486(true);
            util.h.xy.j.ma.f2241.m26903(cHVerificationMethod);
            byte[] m26758 = util.h.xy.f.b.f2201.m26758(util.h.xy.f.ma.f2205, false);
            if (m26758 != null) {
                int i2 = (getInputSizeshNQ4ISI + 71) % 128;
                getOutputMinFrameDurationlomOqCM = i2;
                if (m26758.length > 1) {
                    byte b = m26758[1];
                    getInputSizeshNQ4ISI = (i2 + 3) % 128;
                }
            }
        }
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 25) % 128;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = new int[]{630735404, 2487299, 1329227972, 2014466745, -498203882, 1466056720, 846971150, -2126649684, 485929745, -279190662, -1026862024, 1444556655, -2853218, -733178771, -76096362, -827269843, 1638203734, 880437931};
        getHighSpeedVideoFpsRanges = new char[]{42345, 42299, 42297, 42289, 42294, 42297, 42292, 42291, 42291, 42244, 42247, 42294, 42299, 42298, 42291, 42294, 42302, 42249, 42246, 42347, 42291, 42292, 42292, 42298, 42244, 42246, 42294, 42286, 42289, 42297, 42241, 42269, 42254, 42283, 42291, 42288, 42286, 42289, 42297, 42289, 42253, 42266, 42294, 42294, 42296, 42351, 42290, 42299, 42302, 42284, 42285, 42294, 42298, 42296, 42294, 42294, 42266, 42253, 42289, 42297, 42289, 42286, 42288, 42291, 42283, 42254, 42337, 42302, 42465, 42488, 42452, 42493, 42398, 42470, 42471, 42397, 42468, 42476, 42468, 42432, 42441, 42469, 42469, 42479, 42447, 42109, 42107, 42107, 42079, 42070, 42106, 42050, 42106, 42099, 42101, 42100, 42092, 42067, 42410, 42062, 42103, 42108, 42051, 42097, 42102, 42107, 42402, 42408, 42049, 42101, 42103, 42107, 42104, 42106, 42062, 42062, 42103, 42055, 42057, 42097, 42099, 42093, 42281, 42427, 42426, 42429, 42370, 42428, 42370, 42370, 42385, 42379, 42424, 42387, 42479, 42393, 42426, 42421, 42423, 42422, 42429, 42467, 42388, 42431, 42428, 42428, 42374, 42340, 42285, 42289, 42299, 42260, 42253, 42289, 42297, 42289, 42286, 42288, 42291, 42283, 42254, 42257, 42293, 42290, 42283, 42286, 42284, 42285, 42294, 42260, 42337, 42245, 42290, 42297, 42300, 42285, 42284, 42289, 42297, 42294, 42291, 42289, 42291, 42260, 42350, 42246, 42290, 42295, 42293, 42297, 42294, 42292, 42298, 42292};
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = -1231763766;
    }

    static void getHighSpeedVideoSizes() {
        int i = getOutputMinFrameDurationlomOqCM + 117;
        getInputSizeshNQ4ISI = i % 128;
        int i2 = i % 2;
        getHighSpeedVideoSizes = new byte[]{97, com.google.common.base.Ascii.SUB, -32, -102};
        getHighSpeedVideoFpsRangesFor = i2 != 0 ? 30480 : 247;
    }
}
