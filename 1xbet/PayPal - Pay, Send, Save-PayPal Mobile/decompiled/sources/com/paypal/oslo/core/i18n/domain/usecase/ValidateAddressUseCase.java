package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/ValidateAddressUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;", "addressRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lcom/paypal/oslo/core/i18n/domain/util/MetadataUtil;", "metadataUtil", "Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;", "fieldExtractionUtil", "Lcom/paypal/oslo/core/i18n/domain/util/AddressValidationUtil;", "validationUtil", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lcom/paypal/oslo/core/i18n/domain/util/MetadataUtil;Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;Lcom/paypal/oslo/core/i18n/domain/util/AddressValidationUtil;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;", "addressConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/util/MetadataUtil;", "Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/i18n/domain/util/AddressValidationUtil;", "getHighSpeedVideoFpsRangesFor", "", "", "Ljava/util/Set;", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ValidateAddressUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.AddressRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.MetadataUtil Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ValidateAddressUseCase(com.paypal.oslo.core.i18n.domain.repository.AddressRepository addressRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.MetadataUtil metadataUtil, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil, com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil addressValidationUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataUtil, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldExtractionUtil, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressValidationUtil, "");
        this.getHighSpeedVideoFpsRanges = addressRepository;
        this.getHighSpeedVideoSizes = localeResolverCache;
        this.Camera2StreamConfigurationMap = metadataUtil;
        this.getHighResolutionOutputSizeshNQ4ISI = fieldExtractionUtil;
        this.getHighSpeedVideoFpsRangesFor = addressValidationUtil;
        this.getInputFormats = kotlin.collections.SetsKt.setOf("validScript");
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase validateAddressUseCase, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            addressConfiguration = null;
        }
        return validateAddressUseCase.invoke(address, addressConfiguration, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(63:0|1|(2:3|(56:5|6|7|(1:(2:10|11)(2:329|330))(6:331|332|(1:344)|(1:343)|339|(1:341)(1:342))|12|13|14|(2:323|324)(1:16)|17|18|(2:20|21)(14:280|(3:283|284|281)|285|286|(4:289|(2:291|292)(1:294)|293|287)|295|296|(6:299|(1:304)|312|(2:308|309)(1:311)|310|297)|313|314|315|(1:317)|(1:319)(1:322)|(1:321))|22|(1:24)(1:279)|25|(1:27)|(1:278)|(1:32)(1:277)|(1:34)(1:276)|35|(1:275)(1:39)|40|(2:43|41)|44|45|(4:48|(3:50|51|52)(1:54)|53|46)|55|56|(6:59|(1:64)|72|(2:68|69)(1:71)|70|57)|73|74|(1:76)|(1:78)(1:274)|(1:80)|81|(1:83)|84|(7:87|(2:89|(1:91))|121|(4:94|95|96|97)(1:115)|(2:99|100)(1:102)|101|85)|122|123|(1:125)(1:272)|126|(7:129|(1:131)(1:146)|132|(1:145)(1:134)|(3:136|137|138)(1:140)|139|127)|147|148|(1:150)(1:271)|151|(1:270)(4:155|(7:158|(2:162|(3:167|(3:170|(6:173|174|(4:176|(1:178)(2:184|(1:186))|(2:180|181)(1:183)|182)|187|(0)(0)|182)(1:172)|168)|188)(1:166))|189|187|(0)(0)|182|156)|190|191)|(1:193)|194|(1:196)(1:269)|197|(5:199|(6:202|(1:204)(1:216)|205|(3:210|211|212)|213|200)|217|218|(10:222|(4:225|(3:227|228|229)(1:231)|230|223)|232|233|(11:236|(1:238)(1:263)|239|(1:241)(1:262)|(2:(1:258)(1:261)|(5:260|247|(1:249)(1:256)|(3:251|252|253)(1:255)|254))(1:245)|246|247|(0)(0)|(0)(0)|254|234)|264|265|266|107|108))|268|266|107|108))|349|6|7|(0)(0)|12|13|14|(0)(0)|17|18|(0)(0)|22|(0)(0)|25|(0)|(1:29)|278|(0)(0)|(0)(0)|35|(1:37)|275|40|(1:41)|44|45|(1:46)|55|56|(1:57)|73|74|(0)|(0)(0)|(0)|81|(0)|84|(1:85)|122|123|(0)(0)|126|(1:127)|147|148|(0)(0)|151|(1:153)|270|(0)|194|(0)(0)|197|(0)|268|266|107|108|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0212, code lost:
    
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Required field is missing in the address", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(r8, r10)), null, 4, null);
        r10 = r13.getAddressField();
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0704, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0705, code lost:
    
        r31 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x06fe, code lost:
    
        r31 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0716, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0060, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x070b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x005d, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0343, code lost:
    
        r14 = com.paypal.oslo.core.i18n.LoggerKt.log;
        r30 = r6;
        r15 = new java.lang.StringBuilder("Required field '");
        r15.append(r10);
        r15.append("' is missing in the address");
        com.paypal.android.logger.Logger.i$default(r14, r15.toString(), null, null, 6, null);
        r6 = r13.getAddressField();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x040e, code lost:
    
        if (new kotlin.text.Regex(r10).matches(r13.getValue()) == false) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0462 A[Catch: all -> 0x06f9, RaiseCancellationException -> 0x06fb, TryCatch #8 {RaiseCancellationException -> 0x06fb, all -> 0x06f9, blocks: (B:97:0x0419, B:99:0x044c, B:123:0x0455, B:125:0x0462, B:126:0x0470, B:127:0x048c, B:129:0x0492, B:131:0x04ac, B:132:0x04b3, B:137:0x04d8, B:141:0x04c0, B:143:0x04c8, B:145:0x04d1, B:148:0x04dc, B:150:0x04e5, B:151:0x04ec, B:153:0x04f2, B:155:0x04f8, B:156:0x0507, B:158:0x050d, B:160:0x0521, B:162:0x0527, B:164:0x0531, B:167:0x053b, B:168:0x053f, B:170:0x0545, B:174:0x0554, B:176:0x0575, B:178:0x057e, B:180:0x05a0, B:184:0x0586, B:186:0x058f, B:191:0x05a7, B:193:0x05ae, B:194:0x05b2, B:196:0x05b9, B:197:0x05c0, B:199:0x05e0, B:200:0x05ed, B:202:0x05f3, B:204:0x0601, B:205:0x0608, B:208:0x060f, B:211:0x0617, B:218:0x0623, B:220:0x062b, B:222:0x0633, B:223:0x0640, B:225:0x0646, B:228:0x0655, B:233:0x0659, B:234:0x0668, B:236:0x066e, B:238:0x067c, B:239:0x0686, B:241:0x068e, B:243:0x069c, B:247:0x06bc, B:252:0x06de, B:256:0x06d7, B:258:0x06a7, B:260:0x06b3, B:265:0x06e2, B:266:0x06e9, B:268:0x06e5, B:272:0x046c), top: B:96:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0492 A[Catch: all -> 0x06f9, RaiseCancellationException -> 0x06fb, TryCatch #8 {RaiseCancellationException -> 0x06fb, all -> 0x06f9, blocks: (B:97:0x0419, B:99:0x044c, B:123:0x0455, B:125:0x0462, B:126:0x0470, B:127:0x048c, B:129:0x0492, B:131:0x04ac, B:132:0x04b3, B:137:0x04d8, B:141:0x04c0, B:143:0x04c8, B:145:0x04d1, B:148:0x04dc, B:150:0x04e5, B:151:0x04ec, B:153:0x04f2, B:155:0x04f8, B:156:0x0507, B:158:0x050d, B:160:0x0521, B:162:0x0527, B:164:0x0531, B:167:0x053b, B:168:0x053f, B:170:0x0545, B:174:0x0554, B:176:0x0575, B:178:0x057e, B:180:0x05a0, B:184:0x0586, B:186:0x058f, B:191:0x05a7, B:193:0x05ae, B:194:0x05b2, B:196:0x05b9, B:197:0x05c0, B:199:0x05e0, B:200:0x05ed, B:202:0x05f3, B:204:0x0601, B:205:0x0608, B:208:0x060f, B:211:0x0617, B:218:0x0623, B:220:0x062b, B:222:0x0633, B:223:0x0640, B:225:0x0646, B:228:0x0655, B:233:0x0659, B:234:0x0668, B:236:0x066e, B:238:0x067c, B:239:0x0686, B:241:0x068e, B:243:0x069c, B:247:0x06bc, B:252:0x06de, B:256:0x06d7, B:258:0x06a7, B:260:0x06b3, B:265:0x06e2, B:266:0x06e9, B:268:0x06e5, B:272:0x046c), top: B:96:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04e5 A[Catch: all -> 0x06f9, RaiseCancellationException -> 0x06fb, TryCatch #8 {RaiseCancellationException -> 0x06fb, all -> 0x06f9, blocks: (B:97:0x0419, B:99:0x044c, B:123:0x0455, B:125:0x0462, B:126:0x0470, B:127:0x048c, B:129:0x0492, B:131:0x04ac, B:132:0x04b3, B:137:0x04d8, B:141:0x04c0, B:143:0x04c8, B:145:0x04d1, B:148:0x04dc, B:150:0x04e5, B:151:0x04ec, B:153:0x04f2, B:155:0x04f8, B:156:0x0507, B:158:0x050d, B:160:0x0521, B:162:0x0527, B:164:0x0531, B:167:0x053b, B:168:0x053f, B:170:0x0545, B:174:0x0554, B:176:0x0575, B:178:0x057e, B:180:0x05a0, B:184:0x0586, B:186:0x058f, B:191:0x05a7, B:193:0x05ae, B:194:0x05b2, B:196:0x05b9, B:197:0x05c0, B:199:0x05e0, B:200:0x05ed, B:202:0x05f3, B:204:0x0601, B:205:0x0608, B:208:0x060f, B:211:0x0617, B:218:0x0623, B:220:0x062b, B:222:0x0633, B:223:0x0640, B:225:0x0646, B:228:0x0655, B:233:0x0659, B:234:0x0668, B:236:0x066e, B:238:0x067c, B:239:0x0686, B:241:0x068e, B:243:0x069c, B:247:0x06bc, B:252:0x06de, B:256:0x06d7, B:258:0x06a7, B:260:0x06b3, B:265:0x06e2, B:266:0x06e9, B:268:0x06e5, B:272:0x046c), top: B:96:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05a0 A[Catch: all -> 0x06f9, RaiseCancellationException -> 0x06fb, TryCatch #8 {RaiseCancellationException -> 0x06fb, all -> 0x06f9, blocks: (B:97:0x0419, B:99:0x044c, B:123:0x0455, B:125:0x0462, B:126:0x0470, B:127:0x048c, B:129:0x0492, B:131:0x04ac, B:132:0x04b3, B:137:0x04d8, B:141:0x04c0, B:143:0x04c8, B:145:0x04d1, B:148:0x04dc, B:150:0x04e5, B:151:0x04ec, B:153:0x04f2, B:155:0x04f8, B:156:0x0507, B:158:0x050d, B:160:0x0521, B:162:0x0527, B:164:0x0531, B:167:0x053b, B:168:0x053f, B:170:0x0545, B:174:0x0554, B:176:0x0575, B:178:0x057e, B:180:0x05a0, B:184:0x0586, B:186:0x058f, B:191:0x05a7, B:193:0x05ae, B:194:0x05b2, B:196:0x05b9, B:197:0x05c0, B:199:0x05e0, B:200:0x05ed, B:202:0x05f3, B:204:0x0601, B:205:0x0608, B:208:0x060f, B:211:0x0617, B:218:0x0623, B:220:0x062b, B:222:0x0633, B:223:0x0640, B:225:0x0646, B:228:0x0655, B:233:0x0659, B:234:0x0668, B:236:0x066e, B:238:0x067c, B:239:0x0686, B:241:0x068e, B:243:0x069c, B:247:0x06bc, B:252:0x06de, B:256:0x06d7, B:258:0x06a7, B:260:0x06b3, B:265:0x06e2, B:266:0x06e9, B:268:0x06e5, B:272:0x046c), top: B:96:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05ae A[Catch: all -> 0x06f9, RaiseCancellationException -> 0x06fb, TryCatch #8 {RaiseCancellationException -> 0x06fb, all -> 0x06f9, blocks: (B:97:0x0419, B:99:0x044c, B:123:0x0455, B:125:0x0462, B:126:0x0470, B:127:0x048c, B:129:0x0492, B:131:0x04ac, B:132:0x04b3, B:137:0x04d8, B:141:0x04c0, B:143:0x04c8, B:145:0x04d1, B:148:0x04dc, B:150:0x04e5, B:151:0x04ec, B:153:0x04f2, B:155:0x04f8, B:156:0x0507, B:158:0x050d, B:160:0x0521, B:162:0x0527, B:164:0x0531, B:167:0x053b, B:168:0x053f, B:170:0x0545, B:174:0x0554, B:176:0x0575, B:178:0x057e, B:180:0x05a0, B:184:0x0586, B:186:0x058f, B:191:0x05a7, B:193:0x05ae, B:194:0x05b2, B:196:0x05b9, B:197:0x05c0, B:199:0x05e0, B:200:0x05ed, B:202:0x05f3, B:204:0x0601, B:205:0x0608, B:208:0x060f, B:211:0x0617, B:218:0x0623, B:220:0x062b, B:222:0x0633, B:223:0x0640, B:225:0x0646, B:228:0x0655, B:233:0x0659, B:234:0x0668, B:236:0x066e, B:238:0x067c, B:239:0x0686, B:241:0x068e, B:243:0x069c, B:247:0x06bc, B:252:0x06de, B:256:0x06d7, B:258:0x06a7, B:260:0x06b3, B:265:0x06e2, B:266:0x06e9, B:268:0x06e5, B:272:0x046c), top: B:96:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05b9 A[Catch: all -> 0x06f9, RaiseCancellationException -> 0x06fb, TryCatch #8 {RaiseCancellationException -> 0x06fb, all -> 0x06f9, blocks: (B:97:0x0419, B:99:0x044c, B:123:0x0455, B:125:0x0462, B:126:0x0470, B:127:0x048c, B:129:0x0492, B:131:0x04ac, B:132:0x04b3, B:137:0x04d8, B:141:0x04c0, B:143:0x04c8, B:145:0x04d1, B:148:0x04dc, B:150:0x04e5, B:151:0x04ec, B:153:0x04f2, B:155:0x04f8, B:156:0x0507, B:158:0x050d, B:160:0x0521, B:162:0x0527, B:164:0x0531, B:167:0x053b, B:168:0x053f, B:170:0x0545, B:174:0x0554, B:176:0x0575, B:178:0x057e, B:180:0x05a0, B:184:0x0586, B:186:0x058f, B:191:0x05a7, B:193:0x05ae, B:194:0x05b2, B:196:0x05b9, B:197:0x05c0, B:199:0x05e0, B:200:0x05ed, B:202:0x05f3, B:204:0x0601, B:205:0x0608, B:208:0x060f, B:211:0x0617, B:218:0x0623, B:220:0x062b, B:222:0x0633, B:223:0x0640, B:225:0x0646, B:228:0x0655, B:233:0x0659, B:234:0x0668, B:236:0x066e, B:238:0x067c, B:239:0x0686, B:241:0x068e, B:243:0x069c, B:247:0x06bc, B:252:0x06de, B:256:0x06d7, B:258:0x06a7, B:260:0x06b3, B:265:0x06e2, B:266:0x06e9, B:268:0x06e5, B:272:0x046c), top: B:96:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05e0 A[Catch: all -> 0x06f9, RaiseCancellationException -> 0x06fb, TryCatch #8 {RaiseCancellationException -> 0x06fb, all -> 0x06f9, blocks: (B:97:0x0419, B:99:0x044c, B:123:0x0455, B:125:0x0462, B:126:0x0470, B:127:0x048c, B:129:0x0492, B:131:0x04ac, B:132:0x04b3, B:137:0x04d8, B:141:0x04c0, B:143:0x04c8, B:145:0x04d1, B:148:0x04dc, B:150:0x04e5, B:151:0x04ec, B:153:0x04f2, B:155:0x04f8, B:156:0x0507, B:158:0x050d, B:160:0x0521, B:162:0x0527, B:164:0x0531, B:167:0x053b, B:168:0x053f, B:170:0x0545, B:174:0x0554, B:176:0x0575, B:178:0x057e, B:180:0x05a0, B:184:0x0586, B:186:0x058f, B:191:0x05a7, B:193:0x05ae, B:194:0x05b2, B:196:0x05b9, B:197:0x05c0, B:199:0x05e0, B:200:0x05ed, B:202:0x05f3, B:204:0x0601, B:205:0x0608, B:208:0x060f, B:211:0x0617, B:218:0x0623, B:220:0x062b, B:222:0x0633, B:223:0x0640, B:225:0x0646, B:228:0x0655, B:233:0x0659, B:234:0x0668, B:236:0x066e, B:238:0x067c, B:239:0x0686, B:241:0x068e, B:243:0x069c, B:247:0x06bc, B:252:0x06de, B:256:0x06d7, B:258:0x06a7, B:260:0x06b3, B:265:0x06e2, B:266:0x06e9, B:268:0x06e5, B:272:0x046c), top: B:96:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0158 A[Catch: all -> 0x0106, RaiseCancellationException -> 0x010c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {RaiseCancellationException -> 0x010c, all -> 0x0106, blocks: (B:324:0x0101, B:20:0x0158, B:24:0x0265, B:29:0x0274, B:32:0x0281, B:43:0x02c5, B:48:0x02ec, B:51:0x02ff, B:59:0x0318, B:61:0x0338, B:66:0x0343, B:68:0x0370, B:78:0x0385, B:80:0x0393, B:83:0x03b0, B:89:0x03f7, B:91:0x03ff, B:283:0x0189, B:289:0x01b4, B:291:0x01c9, B:299:0x01e4, B:301:0x0207, B:306:0x0212, B:308:0x0230, B:319:0x0247, B:321:0x0256), top: B:323:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0265 A[Catch: all -> 0x0106, RaiseCancellationException -> 0x010c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {RaiseCancellationException -> 0x010c, all -> 0x0106, blocks: (B:324:0x0101, B:20:0x0158, B:24:0x0265, B:29:0x0274, B:32:0x0281, B:43:0x02c5, B:48:0x02ec, B:51:0x02ff, B:59:0x0318, B:61:0x0338, B:66:0x0343, B:68:0x0370, B:78:0x0385, B:80:0x0393, B:83:0x03b0, B:89:0x03f7, B:91:0x03ff, B:283:0x0189, B:289:0x01b4, B:291:0x01c9, B:299:0x01e4, B:301:0x0207, B:306:0x0212, B:308:0x0230, B:319:0x0247, B:321:0x0256), top: B:323:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0668 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06d7 A[Catch: all -> 0x06f9, RaiseCancellationException -> 0x06fb, TryCatch #8 {RaiseCancellationException -> 0x06fb, all -> 0x06f9, blocks: (B:97:0x0419, B:99:0x044c, B:123:0x0455, B:125:0x0462, B:126:0x0470, B:127:0x048c, B:129:0x0492, B:131:0x04ac, B:132:0x04b3, B:137:0x04d8, B:141:0x04c0, B:143:0x04c8, B:145:0x04d1, B:148:0x04dc, B:150:0x04e5, B:151:0x04ec, B:153:0x04f2, B:155:0x04f8, B:156:0x0507, B:158:0x050d, B:160:0x0521, B:162:0x0527, B:164:0x0531, B:167:0x053b, B:168:0x053f, B:170:0x0545, B:174:0x0554, B:176:0x0575, B:178:0x057e, B:180:0x05a0, B:184:0x0586, B:186:0x058f, B:191:0x05a7, B:193:0x05ae, B:194:0x05b2, B:196:0x05b9, B:197:0x05c0, B:199:0x05e0, B:200:0x05ed, B:202:0x05f3, B:204:0x0601, B:205:0x0608, B:208:0x060f, B:211:0x0617, B:218:0x0623, B:220:0x062b, B:222:0x0633, B:223:0x0640, B:225:0x0646, B:228:0x0655, B:233:0x0659, B:234:0x0668, B:236:0x066e, B:238:0x067c, B:239:0x0686, B:241:0x068e, B:243:0x069c, B:247:0x06bc, B:252:0x06de, B:256:0x06d7, B:258:0x06a7, B:260:0x06b3, B:265:0x06e2, B:266:0x06e9, B:268:0x06e5, B:272:0x046c), top: B:96:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x046c A[Catch: all -> 0x06f9, RaiseCancellationException -> 0x06fb, TryCatch #8 {RaiseCancellationException -> 0x06fb, all -> 0x06f9, blocks: (B:97:0x0419, B:99:0x044c, B:123:0x0455, B:125:0x0462, B:126:0x0470, B:127:0x048c, B:129:0x0492, B:131:0x04ac, B:132:0x04b3, B:137:0x04d8, B:141:0x04c0, B:143:0x04c8, B:145:0x04d1, B:148:0x04dc, B:150:0x04e5, B:151:0x04ec, B:153:0x04f2, B:155:0x04f8, B:156:0x0507, B:158:0x050d, B:160:0x0521, B:162:0x0527, B:164:0x0531, B:167:0x053b, B:168:0x053f, B:170:0x0545, B:174:0x0554, B:176:0x0575, B:178:0x057e, B:180:0x05a0, B:184:0x0586, B:186:0x058f, B:191:0x05a7, B:193:0x05ae, B:194:0x05b2, B:196:0x05b9, B:197:0x05c0, B:199:0x05e0, B:200:0x05ed, B:202:0x05f3, B:204:0x0601, B:205:0x0608, B:208:0x060f, B:211:0x0617, B:218:0x0623, B:220:0x062b, B:222:0x0633, B:223:0x0640, B:225:0x0646, B:228:0x0655, B:233:0x0659, B:234:0x0668, B:236:0x066e, B:238:0x067c, B:239:0x0686, B:241:0x068e, B:243:0x069c, B:247:0x06bc, B:252:0x06de, B:256:0x06d7, B:258:0x06a7, B:260:0x06b3, B:265:0x06e2, B:266:0x06e9, B:268:0x06e5, B:272:0x046c), top: B:96:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x028d A[Catch: all -> 0x06fd, RaiseCancellationException -> 0x0704, TRY_ENTER, TRY_LEAVE, TryCatch #5 {RaiseCancellationException -> 0x0704, all -> 0x06fd, blocks: (B:13:0x00f0, B:17:0x0114, B:22:0x025a, B:25:0x026c, B:40:0x02a0, B:41:0x02bf, B:45:0x02d7, B:46:0x02e6, B:56:0x0303, B:57:0x0312, B:74:0x0376, B:81:0x0397, B:84:0x03b4, B:85:0x03c3, B:87:0x03c9, B:94:0x0414, B:276:0x028d, B:278:0x027b, B:280:0x015f, B:281:0x0183, B:286:0x019f, B:287:0x01ae, B:296:0x01cf, B:297:0x01de, B:315:0x0238), top: B:12:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x015f A[Catch: all -> 0x06fd, RaiseCancellationException -> 0x0704, TRY_ENTER, TryCatch #5 {RaiseCancellationException -> 0x0704, all -> 0x06fd, blocks: (B:13:0x00f0, B:17:0x0114, B:22:0x025a, B:25:0x026c, B:40:0x02a0, B:41:0x02bf, B:45:0x02d7, B:46:0x02e6, B:56:0x0303, B:57:0x0312, B:74:0x0376, B:81:0x0397, B:84:0x03b4, B:85:0x03c3, B:87:0x03c9, B:94:0x0414, B:276:0x028d, B:278:0x027b, B:280:0x015f, B:281:0x0183, B:286:0x019f, B:287:0x01ae, B:296:0x01cf, B:297:0x01de, B:315:0x0238), top: B:12:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0281 A[Catch: all -> 0x0106, RaiseCancellationException -> 0x010c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {RaiseCancellationException -> 0x010c, all -> 0x0106, blocks: (B:324:0x0101, B:20:0x0158, B:24:0x0265, B:29:0x0274, B:32:0x0281, B:43:0x02c5, B:48:0x02ec, B:51:0x02ff, B:59:0x0318, B:61:0x0338, B:66:0x0343, B:68:0x0370, B:78:0x0385, B:80:0x0393, B:83:0x03b0, B:89:0x03f7, B:91:0x03ff, B:283:0x0189, B:289:0x01b4, B:291:0x01c9, B:299:0x01e4, B:301:0x0207, B:306:0x0212, B:308:0x0230, B:319:0x0247, B:321:0x0256), top: B:323:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c5 A[Catch: all -> 0x0106, RaiseCancellationException -> 0x010c, LOOP:0: B:41:0x02bf->B:43:0x02c5, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #7 {RaiseCancellationException -> 0x010c, all -> 0x0106, blocks: (B:324:0x0101, B:20:0x0158, B:24:0x0265, B:29:0x0274, B:32:0x0281, B:43:0x02c5, B:48:0x02ec, B:51:0x02ff, B:59:0x0318, B:61:0x0338, B:66:0x0343, B:68:0x0370, B:78:0x0385, B:80:0x0393, B:83:0x03b0, B:89:0x03f7, B:91:0x03ff, B:283:0x0189, B:289:0x01b4, B:291:0x01c9, B:299:0x01e4, B:301:0x0207, B:306:0x0212, B:308:0x0230, B:319:0x0247, B:321:0x0256), top: B:323:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ec A[Catch: all -> 0x0106, RaiseCancellationException -> 0x010c, TRY_ENTER, TryCatch #7 {RaiseCancellationException -> 0x010c, all -> 0x0106, blocks: (B:324:0x0101, B:20:0x0158, B:24:0x0265, B:29:0x0274, B:32:0x0281, B:43:0x02c5, B:48:0x02ec, B:51:0x02ff, B:59:0x0318, B:61:0x0338, B:66:0x0343, B:68:0x0370, B:78:0x0385, B:80:0x0393, B:83:0x03b0, B:89:0x03f7, B:91:0x03ff, B:283:0x0189, B:289:0x01b4, B:291:0x01c9, B:299:0x01e4, B:301:0x0207, B:306:0x0212, B:308:0x0230, B:319:0x0247, B:321:0x0256), top: B:323:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0318 A[Catch: all -> 0x0106, RaiseCancellationException -> 0x010c, TRY_ENTER, TryCatch #7 {RaiseCancellationException -> 0x010c, all -> 0x0106, blocks: (B:324:0x0101, B:20:0x0158, B:24:0x0265, B:29:0x0274, B:32:0x0281, B:43:0x02c5, B:48:0x02ec, B:51:0x02ff, B:59:0x0318, B:61:0x0338, B:66:0x0343, B:68:0x0370, B:78:0x0385, B:80:0x0393, B:83:0x03b0, B:89:0x03f7, B:91:0x03ff, B:283:0x0189, B:289:0x01b4, B:291:0x01c9, B:299:0x01e4, B:301:0x0207, B:306:0x0212, B:308:0x0230, B:319:0x0247, B:321:0x0256), top: B:323:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0385 A[Catch: all -> 0x0106, RaiseCancellationException -> 0x010c, TRY_ENTER, TryCatch #7 {RaiseCancellationException -> 0x010c, all -> 0x0106, blocks: (B:324:0x0101, B:20:0x0158, B:24:0x0265, B:29:0x0274, B:32:0x0281, B:43:0x02c5, B:48:0x02ec, B:51:0x02ff, B:59:0x0318, B:61:0x0338, B:66:0x0343, B:68:0x0370, B:78:0x0385, B:80:0x0393, B:83:0x03b0, B:89:0x03f7, B:91:0x03ff, B:283:0x0189, B:289:0x01b4, B:291:0x01c9, B:299:0x01e4, B:301:0x0207, B:306:0x0212, B:308:0x0230, B:319:0x0247, B:321:0x0256), top: B:323:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0393 A[Catch: all -> 0x0106, RaiseCancellationException -> 0x010c, TRY_LEAVE, TryCatch #7 {RaiseCancellationException -> 0x010c, all -> 0x0106, blocks: (B:324:0x0101, B:20:0x0158, B:24:0x0265, B:29:0x0274, B:32:0x0281, B:43:0x02c5, B:48:0x02ec, B:51:0x02ff, B:59:0x0318, B:61:0x0338, B:66:0x0343, B:68:0x0370, B:78:0x0385, B:80:0x0393, B:83:0x03b0, B:89:0x03f7, B:91:0x03ff, B:283:0x0189, B:289:0x01b4, B:291:0x01c9, B:299:0x01e4, B:301:0x0207, B:306:0x0212, B:308:0x0230, B:319:0x0247, B:321:0x0256), top: B:323:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b0 A[Catch: all -> 0x0106, RaiseCancellationException -> 0x010c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {RaiseCancellationException -> 0x010c, all -> 0x0106, blocks: (B:324:0x0101, B:20:0x0158, B:24:0x0265, B:29:0x0274, B:32:0x0281, B:43:0x02c5, B:48:0x02ec, B:51:0x02ff, B:59:0x0318, B:61:0x0338, B:66:0x0343, B:68:0x0370, B:78:0x0385, B:80:0x0393, B:83:0x03b0, B:89:0x03f7, B:91:0x03ff, B:283:0x0189, B:289:0x01b4, B:291:0x01c9, B:299:0x01e4, B:301:0x0207, B:306:0x0212, B:308:0x0230, B:319:0x0247, B:321:0x0256), top: B:323:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c9 A[Catch: all -> 0x06fd, RaiseCancellationException -> 0x0704, TRY_LEAVE, TryCatch #5 {RaiseCancellationException -> 0x0704, all -> 0x06fd, blocks: (B:13:0x00f0, B:17:0x0114, B:22:0x025a, B:25:0x026c, B:40:0x02a0, B:41:0x02bf, B:45:0x02d7, B:46:0x02e6, B:56:0x0303, B:57:0x0312, B:74:0x0376, B:81:0x0397, B:84:0x03b4, B:85:0x03c3, B:87:0x03c9, B:94:0x0414, B:276:0x028d, B:278:0x027b, B:280:0x015f, B:281:0x0183, B:286:0x019f, B:287:0x01ae, B:296:0x01cf, B:297:0x01de, B:315:0x0238), top: B:12:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, ? extends java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError>>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase$invoke$1 validateAddressUseCase$invoke$1;
        int i;
        java.lang.Throwable th;
        arrow.core.raise.RaiseCancellationException raiseCancellationException;
        arrow.core.Either.Right right;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.Locale locale;
        java.lang.String country;
        arrow.core.raise.Raise raise;
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration2;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.core.i18n.domain.model.Address address2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        com.paypal.oslo.core.i18n.domain.model.Address.Style style;
        com.paypal.oslo.core.i18n.domain.model.LayoutMetadata layoutMetadata;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List listOf;
        com.paypal.oslo.core.i18n.domain.model.Address.Resolution resolution;
        int i2;
        java.lang.String str4;
        java.util.Iterator it;
        java.util.Iterator it2;
        java.util.ArrayList arrayList;
        java.util.List listOf2;
        java.util.Map<java.lang.String, java.lang.String> regex;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it3;
        java.util.ArrayList arrayList2;
        java.util.List emptyList;
        com.paypal.oslo.core.i18n.domain.model.CountryValidationMetadata countryValidation;
        java.util.ArrayList arrayList3;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map;
        java.util.ArrayList emptyList2;
        java.util.List flatten;
        java.util.List<java.lang.String> list;
        java.util.List<java.lang.String> emptyList3;
        com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter addressContainsInvalidCharacter;
        java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.CountryValidation> countryValidation2;
        com.paypal.oslo.core.i18n.domain.model.Address.Type type;
        com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute addressContainsRuralRoute;
        java.lang.String name2;
        com.paypal.oslo.core.i18n.domain.model.Field field;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase$invoke$1) {
            validateAddressUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase$invoke$1) continuation;
            if ((validateAddressUseCase$invoke$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                validateAddressUseCase$invoke$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                java.lang.Object obj = validateAddressUseCase$invoke$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = validateAddressUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                    if (addressConfiguration == null || (locale = addressConfiguration.getLocale()) == null) {
                        locale = (java.util.Locale) defaultRaise3.bind(this.getHighSpeedVideoSizes.getUserLocale());
                    }
                    if (addressConfiguration == null || (country = addressConfiguration.getRegion()) == null) {
                        country = locale.getCountry();
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "ValidateAddress UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("locale", locale), kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, country)), null, 4, null);
                    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, com.paypal.oslo.core.i18n.domain.model.AddressMetadata>> addressMetadata = this.getHighSpeedVideoFpsRanges.getAddressMetadata(country, locale);
                    validateAddressUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = address;
                    validateAddressUseCase$invoke$1.getOutputMinFrameDuration = addressConfiguration;
                    validateAddressUseCase$invoke$1.getInputFormats = defaultRaise;
                    validateAddressUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                    validateAddressUseCase$invoke$1.getHighSpeedVideoSizesFor = country;
                    validateAddressUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    validateAddressUseCase$invoke$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressMetadata);
                    validateAddressUseCase$invoke$1.getOutputSizeshNQ4ISI = defaultRaise3;
                    validateAddressUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    validateAddressUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                    validateAddressUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    validateAddressUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    validateAddressUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = 1;
                    java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(addressMetadata, validateAddressUseCase$invoke$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    raise = defaultRaise3;
                    str = country;
                    addressConfiguration2 = addressConfiguration;
                    raise2 = raise;
                    obj = first;
                    address2 = address;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = validateAddressUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i4 = validateAddressUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = validateAddressUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i6 = validateAddressUseCase$invoke$1.getHighSpeedVideoSizes;
                    raise2 = (arrow.core.raise.Raise) validateAddressUseCase$invoke$1.getOutputSizeshNQ4ISI;
                    str = (java.lang.String) validateAddressUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    raise = (arrow.core.raise.Raise) validateAddressUseCase$invoke$1.getInputSizeshNQ4ISI;
                    defaultRaise = (arrow.core.raise.DefaultRaise) validateAddressUseCase$invoke$1.getInputFormats;
                    addressConfiguration2 = (com.paypal.oslo.core.i18n.domain.model.AddressConfiguration) validateAddressUseCase$invoke$1.getOutputMinFrameDuration;
                    address2 = (com.paypal.oslo.core.i18n.domain.model.Address) validateAddressUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.core.i18n.domain.model.AddressMetadata addressMetadata2 = (com.paypal.oslo.core.i18n.domain.model.AddressMetadata) raise2.bind((arrow.core.Either) obj);
                com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                if (addressConfiguration2 == null) {
                    try {
                        style = addressConfiguration2.getStyle();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        raiseCancellationException = e;
                        defaultRaise2 = defaultRaise;
                        arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise2;
                        defaultRaise4.complete();
                        right = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise4));
                        return com.paypal.oslo.core.i18n.domain.usecase.AddressUseCaseExtensionsKt.mapAddressError(right, "ValidateAddressUseCase");
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise2 = defaultRaise;
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise2;
                        defaultRaise5.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    style = null;
                }
                kotlin.Pair pair = (kotlin.Pair) raise.bind(fieldExtractionUtil.getLayoutAndLabel(addressMetadata2, str, style));
                layoutMetadata = (com.paypal.oslo.core.i18n.domain.model.LayoutMetadata) pair.component1();
                com.paypal.oslo.core.i18n.domain.model.Label label = (com.paypal.oslo.core.i18n.domain.model.Label) pair.component2();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                com.paypal.oslo.core.i18n.domain.model.CountryMetadata countryMetadata = addressMetadata2.getCountryMetadata();
                java.util.Map<java.lang.String, java.lang.Boolean> required = countryMetadata.getRequired();
                java.lang.String conditionalRequired = countryMetadata.getConditionalRequired();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Validating missing one of required fields", null, null, 6, null);
                str2 = conditionalRequired;
                java.lang.String str5 = "field";
                if (str2.length() != 0) {
                    listOf = kotlin.collections.CollectionsKt.emptyList();
                    str3 = "field";
                } else {
                    java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{"||"}, false, 0, 6, (java.lang.Object) null);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.util.Iterator it4 = split$default.iterator();
                    while (it4.hasNext()) {
                        kotlin.collections.CollectionsKt.addAll(arrayList5, this.Camera2StreamConfigurationMap.getFieldList((java.lang.String) it4.next()));
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.util.Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        java.lang.Object next = it5.next();
                        java.util.Iterator it6 = it5;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(required.get((java.lang.String) next), java.lang.Boolean.TRUE)) {
                            arrayList6.add(next);
                        }
                        it5 = it6;
                    }
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.util.Iterator it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        java.lang.String str6 = (java.lang.String) it7.next();
                        java.util.Iterator it8 = it7;
                        java.lang.String str7 = str5;
                        com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo fieldDetail$default = com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.getFieldDetail$default(this.getHighResolutionOutputSizeshNQ4ISI, str6, address2, false, label, "", 4, null);
                        java.lang.String value = fieldDetail$default.getValue();
                        if (value != null && value.length() != 0) {
                            fieldDetail$default = null;
                        }
                        com.paypal.oslo.core.i18n.domain.model.Field field2 = null;
                        if (field2 != null) {
                            arrayList7.add(field2);
                        }
                        str5 = str7;
                        it7 = it8;
                    }
                    str3 = str5;
                    java.util.ArrayList arrayList8 = arrayList7;
                    if (arrayList8.isEmpty()) {
                        arrayList8 = null;
                    }
                    listOf = arrayList8 != null ? kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf(arrayList8)) : null;
                    if (listOf == null) {
                        listOf = kotlin.collections.CollectionsKt.emptyList();
                    }
                }
                arrayList4.addAll(listOf);
                java.util.Map<java.lang.String, java.lang.Boolean> required2 = countryMetadata.getRequired();
                resolution = addressConfiguration2 == null ? addressConfiguration2.getResolution() : null;
                if (resolution != com.paypal.oslo.core.i18n.domain.model.Address.Resolution.HIGH) {
                    resolution = null;
                }
                if (resolution != null || (r10 = layoutMetadata.getHighResolution()) == null) {
                    java.lang.String lowResolution = layoutMetadata.getLowResolution();
                }
                com.paypal.oslo.core.i18n.domain.model.Address.Style style2 = addressConfiguration2 == null ? addressConfiguration2.getStyle() : null;
                i2 = style2 != null ? -1 : com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase.WhenMappings.$EnumSwitchMapping$0[style2.ordinal()];
                if (i2 != 1 || i2 == 2) {
                    str4 = ",";
                } else {
                    str4 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE;
                }
                java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) lowResolution, new java.lang.String[]{str4}, false, 0, 6, (java.lang.Object) null);
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                it = split$default2.iterator();
                while (it.hasNext()) {
                    kotlin.collections.CollectionsKt.addAll(arrayList9, this.Camera2StreamConfigurationMap.getFieldList((java.lang.String) it.next()));
                }
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList9) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(required2.get((java.lang.String) obj2), java.lang.Boolean.TRUE)) {
                        arrayList10.add(obj2);
                    }
                }
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                it2 = arrayList10.iterator();
                while (it2.hasNext()) {
                    java.lang.String str8 = (java.lang.String) it2.next();
                    com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo fieldDetail$default2 = com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.getFieldDetail$default(this.getHighResolutionOutputSizeshNQ4ISI, str8, address2, false, label, "", 4, null);
                    java.lang.String value2 = fieldDetail$default2.getValue();
                    if (value2 != null && value2.length() != 0) {
                        fieldDetail$default2 = null;
                    }
                    java.util.Iterator it9 = it2;
                    com.paypal.oslo.core.i18n.domain.model.Field field3 = null;
                    if (field3 != null) {
                        arrayList11.add(field3);
                    }
                    it2 = it9;
                }
                arrayList = arrayList11;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                listOf2 = arrayList == null ? kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired(arrayList)) : null;
                if (listOf2 == null) {
                    listOf2 = kotlin.collections.CollectionsKt.emptyList();
                }
                arrayList4.addAll(listOf2);
                regex = countryMetadata.getRegex();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Validating regex patterns for address fields", null, null, 6, null);
                if (regex == null) {
                    regex = kotlin.collections.MapsKt.emptyMap();
                }
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                it3 = regex.entrySet().iterator();
                while (it3.hasNext()) {
                    java.util.Map.Entry<java.lang.String, java.lang.String> next2 = it3.next();
                    java.lang.String key = next2.getKey();
                    java.lang.String value3 = next2.getValue();
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it10 = it3;
                    com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo fieldDetail$default3 = com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.getFieldDetail$default(this.getHighResolutionOutputSizeshNQ4ISI, key, address2, false, label, "", 4, null);
                    java.lang.String value4 = fieldDetail$default3.getValue();
                    if (value4 != null) {
                        if (value4.length() > 0) {
                        }
                    }
                    fieldDetail$default3 = null;
                    if (fieldDetail$default3 != null) {
                        defaultRaise2 = defaultRaise;
                        try {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Field does not match pattern", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(str3, key), kotlin.TuplesKt.to("pattern", value3)), null, 4, null);
                            field = fieldDetail$default3.getAddressField();
                        } catch (arrow.core.raise.RaiseCancellationException e2) {
                            e = e2;
                            raiseCancellationException = e;
                            arrow.core.raise.DefaultRaise defaultRaise42 = defaultRaise2;
                            defaultRaise42.complete();
                            right = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise42));
                            return com.paypal.oslo.core.i18n.domain.usecase.AddressUseCaseExtensionsKt.mapAddressError(right, "ValidateAddressUseCase");
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            th = th;
                            arrow.core.raise.DefaultRaise defaultRaise52 = defaultRaise2;
                            defaultRaise52.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else {
                        defaultRaise2 = defaultRaise;
                        field = null;
                    }
                    if (field != null) {
                        arrayList12.add(field);
                    }
                    it3 = it10;
                    defaultRaise = defaultRaise2;
                }
                defaultRaise2 = defaultRaise;
                arrayList2 = arrayList12;
                if (arrayList2.isEmpty()) {
                    emptyList = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern(arrayList2));
                } else {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                arrayList4.addAll(emptyList);
                java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.ValidationMetadata> defaultValidation = addressMetadata2.getDefaultValidation().getDefaultValidation();
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                for (java.util.Map.Entry<java.lang.String, com.paypal.oslo.core.i18n.domain.model.ValidationMetadata> entry : defaultValidation.entrySet()) {
                    java.lang.String key2 = entry.getKey();
                    com.paypal.oslo.core.i18n.domain.model.ValidationMetadata value5 = entry.getValue();
                    com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil addressValidationUtil = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.i18n.domain.model.Pattern pattern = value5.getPattern();
                    java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> validateOffensiveFieldsAgainstPatterns = addressValidationUtil.validateOffensiveFieldsAgainstPatterns(address2, pattern != null ? pattern.getPattern() : null, label);
                    com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive invalidAllOffensive = (!validateOffensiveFieldsAgainstPatterns.isEmpty() && (kotlin.jvm.internal.Intrinsics.areEqual(key2, "offensive") || kotlin.jvm.internal.Intrinsics.areEqual(key2, "validList"))) ? new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive(validateOffensiveFieldsAgainstPatterns) : null;
                    if (invalidAllOffensive != null) {
                        arrayList13.add(invalidAllOffensive);
                    }
                }
                arrayList4.addAll(arrayList13);
                com.paypal.oslo.core.i18n.domain.model.Address.Type type2 = addressConfiguration2 == null ? addressConfiguration2.getType() : null;
                countryValidation = addressMetadata2.getCountryValidation();
                if (countryValidation != null || (countryValidation2 = countryValidation.getCountryValidation()) == null) {
                    arrayList3 = null;
                } else {
                    java.util.ArrayList arrayList14 = new java.util.ArrayList();
                    for (java.util.Map.Entry<java.lang.String, com.paypal.oslo.core.i18n.domain.model.CountryValidation> entry2 : countryValidation2.entrySet()) {
                        java.lang.String key3 = entry2.getKey();
                        com.paypal.oslo.core.i18n.domain.model.CountryValidation value6 = entry2.getValue();
                        if (type2 != null && (name2 = type2.name()) != null) {
                            java.util.List<java.lang.String> addressType = value6.getAddressType();
                            if (!(addressType instanceof java.util.Collection) || !addressType.isEmpty()) {
                                java.util.Iterator<T> it11 = addressType.iterator();
                                while (it11.hasNext()) {
                                    type = type2;
                                    if (kotlin.text.StringsKt.equals((java.lang.String) it11.next(), name2, true)) {
                                        java.util.List validateFieldsAgainstPatterns$default = com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil.validateFieldsAgainstPatterns$default(this.getHighSpeedVideoFpsRangesFor, address2, value6.getPattern().getPattern(), kotlin.collections.CollectionsKt.emptyList(), label, false, 16, null);
                                        if (!validateFieldsAgainstPatterns$default.isEmpty()) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(key3, "poBox")) {
                                                addressContainsRuralRoute = new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox(validateFieldsAgainstPatterns$default);
                                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(key3, "ruralRoute")) {
                                                addressContainsRuralRoute = new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute(validateFieldsAgainstPatterns$default);
                                            }
                                            if (addressContainsRuralRoute != null) {
                                                arrayList14.add(addressContainsRuralRoute);
                                            }
                                            type2 = type;
                                        }
                                        addressContainsRuralRoute = null;
                                        if (addressContainsRuralRoute != null) {
                                        }
                                        type2 = type;
                                    } else {
                                        type2 = type;
                                    }
                                }
                            }
                        }
                        type = type2;
                        addressContainsRuralRoute = null;
                        if (addressContainsRuralRoute != null) {
                        }
                        type2 = type;
                    }
                    arrayList3 = arrayList14;
                }
                if (arrayList3 == null) {
                    arrayList3 = kotlin.collections.CollectionsKt.emptyList();
                }
                arrayList4.addAll(arrayList3);
                com.paypal.oslo.core.i18n.domain.model.Address.Type type3 = addressConfiguration2 == null ? addressConfiguration2.getType() : null;
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> regexConfig = addressMetadata2.getValidationConfig().getRegexConfig();
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> countryConfig = addressMetadata2.getValidationConfig().getCountryConfig();
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>>> validationByField = addressMetadata2.getValidationConfig().getValidationByField();
                map = countryConfig.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
                if (map != null) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry3 : map.entrySet()) {
                        java.lang.String key4 = entry3.getKey();
                        if (kotlin.text.StringsKt.equals(key4, type3 != null ? type3.name() : null, true) && !this.getInputFormats.contains(key4)) {
                            linkedHashMap.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    java.util.Collection values = linkedHashMap.values();
                    if (values != null && (flatten = kotlin.collections.CollectionsKt.flatten(values)) != null) {
                        java.util.ArrayList<java.lang.String> arrayList15 = new java.util.ArrayList();
                        for (java.lang.Object obj3 : flatten) {
                            if (!this.getInputFormats.contains((java.lang.String) obj3)) {
                                arrayList15.add(obj3);
                            }
                        }
                        java.util.ArrayList arrayList16 = new java.util.ArrayList();
                        for (java.lang.String str9 : arrayList15) {
                            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map2 = regexConfig.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
                            java.util.Map<java.lang.String, java.lang.String> map3 = map2 != null ? map2.get(str9) : null;
                            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> map4 = validationByField.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
                            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map5 = map4 != null ? map4.get("portable") : null;
                            if (map5 == null || (list = map5.get(str9)) == null) {
                                list = map5 != null ? map5.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT) : null;
                                if (list == null) {
                                    emptyList3 = kotlin.collections.CollectionsKt.emptyList();
                                    java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> validateFieldsAgainstPatterns = this.getHighSpeedVideoFpsRangesFor.validateFieldsAgainstPatterns(address2, map3, emptyList3, label, !this.getInputFormats.contains(str9));
                                    addressContainsInvalidCharacter = !validateFieldsAgainstPatterns.isEmpty() ? null : new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter(validateFieldsAgainstPatterns);
                                    if (addressContainsInvalidCharacter == null) {
                                        arrayList16.add(addressContainsInvalidCharacter);
                                    }
                                }
                            }
                            emptyList3 = list;
                            java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> validateFieldsAgainstPatterns2 = this.getHighSpeedVideoFpsRangesFor.validateFieldsAgainstPatterns(address2, map3, emptyList3, label, !this.getInputFormats.contains(str9));
                            if (!validateFieldsAgainstPatterns2.isEmpty()) {
                            }
                            if (addressContainsInvalidCharacter == null) {
                            }
                        }
                        emptyList2 = arrayList16;
                        arrayList4.addAll(emptyList2);
                        defaultRaise2.complete();
                        right = new arrow.core.Either.Right(arrayList4);
                        return com.paypal.oslo.core.i18n.domain.usecase.AddressUseCaseExtensionsKt.mapAddressError(right, "ValidateAddressUseCase");
                    }
                }
                emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                arrayList4.addAll(emptyList2);
                defaultRaise2.complete();
                right = new arrow.core.Either.Right(arrayList4);
                return com.paypal.oslo.core.i18n.domain.usecase.AddressUseCaseExtensionsKt.mapAddressError(right, "ValidateAddressUseCase");
            }
        }
        validateAddressUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase$invoke$1(this, continuation);
        java.lang.Object obj4 = validateAddressUseCase$invoke$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = validateAddressUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        com.paypal.oslo.core.i18n.domain.model.AddressMetadata addressMetadata22 = (com.paypal.oslo.core.i18n.domain.model.AddressMetadata) raise2.bind((arrow.core.Either) obj4);
        com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        if (addressConfiguration2 == null) {
        }
        kotlin.Pair pair2 = (kotlin.Pair) raise.bind(fieldExtractionUtil2.getLayoutAndLabel(addressMetadata22, str, style));
        layoutMetadata = (com.paypal.oslo.core.i18n.domain.model.LayoutMetadata) pair2.component1();
        com.paypal.oslo.core.i18n.domain.model.Label label2 = (com.paypal.oslo.core.i18n.domain.model.Label) pair2.component2();
        java.util.ArrayList arrayList42 = new java.util.ArrayList();
        com.paypal.oslo.core.i18n.domain.model.CountryMetadata countryMetadata2 = addressMetadata22.getCountryMetadata();
        java.util.Map<java.lang.String, java.lang.Boolean> required3 = countryMetadata2.getRequired();
        java.lang.String conditionalRequired2 = countryMetadata2.getConditionalRequired();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Validating missing one of required fields", null, null, 6, null);
        str2 = conditionalRequired2;
        java.lang.String str52 = "field";
        if (str2.length() != 0) {
        }
        arrayList42.addAll(listOf);
        java.util.Map<java.lang.String, java.lang.Boolean> required22 = countryMetadata2.getRequired();
        if (addressConfiguration2 == null) {
        }
        if (resolution != com.paypal.oslo.core.i18n.domain.model.Address.Resolution.HIGH) {
        }
        if (resolution != null) {
        }
        java.lang.String lowResolution2 = layoutMetadata.getLowResolution();
        if (addressConfiguration2 == null) {
        }
        if (style2 != null) {
        }
        if (i2 != 1) {
        }
        str4 = ",";
        java.util.List split$default22 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) lowResolution2, new java.lang.String[]{str4}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList92 = new java.util.ArrayList();
        it = split$default22.iterator();
        while (it.hasNext()) {
        }
        java.util.ArrayList arrayList102 = new java.util.ArrayList();
        while (r10.hasNext()) {
        }
        java.util.ArrayList arrayList112 = new java.util.ArrayList();
        it2 = arrayList102.iterator();
        while (it2.hasNext()) {
        }
        arrayList = arrayList112;
        if (arrayList.isEmpty()) {
        }
        if (arrayList == null) {
        }
        if (listOf2 == null) {
        }
        arrayList42.addAll(listOf2);
        regex = countryMetadata2.getRegex();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Validating regex patterns for address fields", null, null, 6, null);
        if (regex == null) {
        }
        java.util.ArrayList arrayList122 = new java.util.ArrayList();
        it3 = regex.entrySet().iterator();
        while (it3.hasNext()) {
        }
        defaultRaise2 = defaultRaise;
        arrayList2 = arrayList122;
        if (arrayList2.isEmpty()) {
        }
        arrayList42.addAll(emptyList);
        java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.ValidationMetadata> defaultValidation2 = addressMetadata22.getDefaultValidation().getDefaultValidation();
        java.util.ArrayList arrayList132 = new java.util.ArrayList();
        while (r6.hasNext()) {
        }
        arrayList42.addAll(arrayList132);
        if (addressConfiguration2 == null) {
        }
        countryValidation = addressMetadata22.getCountryValidation();
        if (countryValidation != null) {
        }
        arrayList3 = null;
        if (arrayList3 == null) {
        }
        arrayList42.addAll(arrayList3);
        if (addressConfiguration2 == null) {
        }
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> regexConfig2 = addressMetadata22.getValidationConfig().getRegexConfig();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> countryConfig2 = addressMetadata22.getValidationConfig().getCountryConfig();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>>> validationByField2 = addressMetadata22.getValidationConfig().getValidationByField();
        map = countryConfig2.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
        if (map != null) {
        }
        emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        arrayList42.addAll(emptyList2);
        defaultRaise2.complete();
        right = new arrow.core.Either.Right(arrayList42);
        return com.paypal.oslo.core.i18n.domain.usecase.AddressUseCaseExtensionsKt.mapAddressError(right, "ValidateAddressUseCase");
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.Address.Style.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Address.Style.SINGLELINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Address.Style.INTERNATIONAL_SINGLELINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
