package io.ktor.client.plugins.contentnegotiation;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"$\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0007¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "exclude", "(Lio/ktor/client/request/HttpRequestBuilder;[Lio/ktor/http/ContentType;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getHighSpeedVideoSizes", "Lorg/slf4j/Logger;", "", "Lkotlin/reflect/KClass;", "DefaultCommonIgnoredTypes", "Ljava/util/Set;", "getDefaultCommonIgnoredTypes", "()Ljava/util/Set;", "Lio/ktor/util/AttributeKey;", "", "ExcludedContentTypes", "Lio/ktor/util/AttributeKey;", "getExcludedContentTypes", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/contentnegotiation/ContentNegotiationConfig;", "ContentNegotiation", "Lio/ktor/client/plugins/api/ClientPlugin;", "getContentNegotiation", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getContentNegotiation$annotations", "()V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContentNegotiationKt {
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> ContentNegotiation;
    private static final io.ktor.util.AttributeKey<java.util.List<io.ktor.http.ContentType>> ExcludedContentTypes;
    private static final org.slf4j.Logger getHighSpeedVideoSizes = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");
    private static final java.util.Set<kotlin.reflect.KClass<?>> DefaultCommonIgnoredTypes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.http.HttpStatusCode.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.utils.io.ByteReadChannel.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.http.content.OutgoingContent.class)});

    /* JADX WARN: Removed duplicated region for block: B:12:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x02b7 -> B:10:0x02be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$ContentNegotiation$lambda$16$convertRequest(java.util.List list, java.util.Set set, io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertRequest$1 contentNegotiationKt$ContentNegotiation$2$convertRequest$1;
        int i;
        java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> list2;
        java.util.Iterator it;
        java.util.List list3;
        io.ktor.http.ContentType contentType;
        java.lang.Object obj2;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2;
        if (continuation instanceof io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertRequest$1) {
            contentNegotiationKt$ContentNegotiation$2$convertRequest$1 = (io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertRequest$1) continuation;
            if ((contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj3 = contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getInputSizeshNQ4ISI;
                io.ktor.http.content.OutgoingContent outgoingContent = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    io.ktor.util.Attributes attributes = httpRequestBuilder.getAttributes();
                    io.ktor.util.AttributeKey<java.util.List<io.ktor.http.ContentType>> attributeKey = ExcludedContentTypes;
                    if (attributes.contains(attributeKey)) {
                        java.util.List list4 = (java.util.List) httpRequestBuilder.getAttributes().get(attributeKey);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj4 : list) {
                            io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration converterRegistration = (io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration) obj4;
                            java.util.List list5 = list4;
                            if (!(list5 instanceof java.util.Collection) || !list5.isEmpty()) {
                                java.util.Iterator it2 = list5.iterator();
                                while (it2.hasNext()) {
                                    if (converterRegistration.getContentTypeToSend().match((io.ktor.http.ContentType) it2.next())) {
                                        break;
                                    }
                                }
                            }
                            arrayList.add(obj4);
                        }
                        list2 = arrayList;
                    } else {
                        list2 = list;
                    }
                    java.util.List<java.lang.String> all = httpRequestBuilder.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getAccept());
                    if (all == null) {
                        all = kotlin.collections.CollectionsKt.emptyList();
                    }
                    for (io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration converterRegistration2 : list2) {
                        java.util.List<java.lang.String> list6 = all;
                        if (!(list6 instanceof java.util.Collection) || !list6.isEmpty()) {
                            java.util.Iterator<T> it3 = list6.iterator();
                            while (it3.hasNext()) {
                                if (io.ktor.http.ContentType.INSTANCE.parse((java.lang.String) it3.next()).match(converterRegistration2.getContentTypeToSend())) {
                                    break;
                                }
                            }
                        }
                        java.lang.Double defaultAcceptHeaderQValue = ((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig) clientPluginBuilder.getPluginConfig()).getDefaultAcceptHeaderQValue();
                        io.ktor.http.ContentType contentTypeToSend = defaultAcceptHeaderQValue == null ? converterRegistration2.getContentTypeToSend() : converterRegistration2.getContentTypeToSend().withParameter("q", defaultAcceptHeaderQValue.toString());
                        org.slf4j.Logger logger = getHighSpeedVideoSizes;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Adding Accept=");
                        sb.append(contentTypeToSend);
                        sb.append(" header for ");
                        sb.append(httpRequestBuilder.getUrl());
                        logger.trace(sb.toString());
                        io.ktor.client.request.UtilsKt.accept(httpRequestBuilder, contentTypeToSend);
                    }
                    if (!(obj instanceof io.ktor.http.content.OutgoingContent)) {
                        java.util.Set set2 = set;
                        if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                            java.util.Iterator it4 = set2.iterator();
                            while (it4.hasNext()) {
                                if (((kotlin.reflect.KClass) it4.next()).isInstance(obj)) {
                                }
                            }
                        }
                        io.ktor.http.ContentType contentType2 = io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder);
                        if (contentType2 == null) {
                            org.slf4j.Logger logger2 = getHighSpeedVideoSizes;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Request doesn't have Content-Type header. Skipping ContentNegotiation for ");
                            sb2.append(httpRequestBuilder.getUrl());
                            sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                            logger2.trace(sb2.toString());
                            return null;
                        }
                        if (obj instanceof kotlin.Unit) {
                            org.slf4j.Logger logger3 = getHighSpeedVideoSizes;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Sending empty body for ");
                            sb3.append(httpRequestBuilder.getUrl());
                            logger3.trace(sb3.toString());
                            httpRequestBuilder.getHeaders().remove(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
                            return io.ktor.client.utils.EmptyContent.INSTANCE;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj5 : list) {
                            if (((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration) obj5).getContentTypeMatcher().contains(contentType2)) {
                                arrayList2.add(obj5);
                            }
                        }
                        java.util.ArrayList arrayList3 = arrayList2;
                        if (arrayList3.isEmpty()) {
                            arrayList3 = null;
                        }
                        if (arrayList3 == null) {
                            org.slf4j.Logger logger4 = getHighSpeedVideoSizes;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("None of the registered converters match request Content-Type=");
                            sb4.append(contentType2);
                            sb4.append(". Skipping ContentNegotiation for ");
                            sb4.append(httpRequestBuilder.getUrl());
                            sb4.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                            logger4.trace(sb4.toString());
                            return null;
                        }
                        if (httpRequestBuilder.getBodyType() == null) {
                            org.slf4j.Logger logger5 = getHighSpeedVideoSizes;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Request has unknown body type. Skipping ContentNegotiation for ");
                            sb5.append(httpRequestBuilder.getUrl());
                            sb5.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                            logger5.trace(sb5.toString());
                            return null;
                        }
                        httpRequestBuilder.getHeaders().remove(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
                        it = arrayList3.iterator();
                        list3 = arrayList3;
                        contentType = contentType2;
                        obj2 = obj;
                        httpRequestBuilder2 = httpRequestBuilder;
                        if (it.hasNext()) {
                        }
                        if (outgoingContent != null) {
                        }
                    }
                    org.slf4j.Logger logger6 = getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Body type ");
                    sb6.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()));
                    sb6.append(" is in ignored types. Skipping ContentNegotiation for ");
                    sb6.append(httpRequestBuilder.getUrl());
                    sb6.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    logger6.trace(sb6.toString());
                    return null;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration converterRegistration3 = (io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration) contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getOutputFormats;
                it = (java.util.Iterator) contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighSpeedVideoSizes;
                list3 = (java.util.List) contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                contentType = (io.ktor.http.ContentType) contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighSpeedVideoFpsRanges;
                java.lang.Object obj6 = contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighSpeedVideoFpsRangesFor;
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder3 = (io.ktor.client.request.HttpRequestBuilder) contentNegotiationKt$ContentNegotiation$2$convertRequest$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj3);
                io.ktor.http.content.OutgoingContent outgoingContent2 = (io.ktor.http.content.OutgoingContent) obj3;
                if (outgoingContent2 != null) {
                    org.slf4j.Logger logger7 = getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Converted request body using ");
                    sb7.append(converterRegistration3.getConverter());
                    sb7.append(" for ");
                    sb7.append(httpRequestBuilder3.getUrl());
                    logger7.trace(sb7.toString());
                }
                if (outgoingContent2 == null) {
                    outgoingContent = outgoingContent2;
                    obj2 = obj6;
                    if (outgoingContent != null) {
                        return outgoingContent;
                    }
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Can't convert ");
                    sb8.append(obj2);
                    sb8.append(" with contentType ");
                    sb8.append(contentType);
                    sb8.append(" using converters ");
                    sb8.append(kotlin.collections.CollectionsKt.joinToString$default(list3, null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj7) {
                            return io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt.$r8$lambda$pVWWfO655E9lKz82TXoIQOYsbOs((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration) obj7);
                        }
                    }, 31, null));
                    throw new io.ktor.client.plugins.contentnegotiation.ContentConverterException(sb8.toString());
                }
                obj2 = obj6;
                httpRequestBuilder2 = httpRequestBuilder3;
                if (it.hasNext()) {
                    io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration converterRegistration4 = (io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration) it.next();
                    io.ktor.serialization.ContentConverter converter = converterRegistration4.getConverter();
                    java.nio.charset.Charset charset = io.ktor.http.ContentTypesKt.charset(contentType);
                    if (charset == null) {
                        charset = kotlin.text.Charsets.UTF_8;
                    }
                    io.ktor.util.reflect.TypeInfo bodyType = httpRequestBuilder2.getBodyType();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bodyType);
                    java.lang.Object obj7 = !kotlin.jvm.internal.Intrinsics.areEqual(obj2, io.ktor.http.content.NullBody.INSTANCE) ? obj2 : null;
                    contentNegotiationKt$ContentNegotiation$2$convertRequest$1.Camera2StreamConfigurationMap = httpRequestBuilder2;
                    contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighSpeedVideoFpsRangesFor = obj2;
                    contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighSpeedVideoFpsRanges = contentType;
                    contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighResolutionOutputSizeshNQ4ISI = list3;
                    contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighSpeedVideoSizes = it;
                    contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getOutputFormats = converterRegistration4;
                    contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getInputSizeshNQ4ISI = 1;
                    java.lang.Object serialize = converter.serialize(contentType, charset, bodyType, obj7, contentNegotiationKt$ContentNegotiation$2$convertRequest$1);
                    if (serialize == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpRequestBuilder3 = httpRequestBuilder2;
                    converterRegistration3 = converterRegistration4;
                    obj6 = obj2;
                    obj3 = serialize;
                    io.ktor.http.content.OutgoingContent outgoingContent22 = (io.ktor.http.content.OutgoingContent) obj3;
                    if (outgoingContent22 != null) {
                    }
                    if (outgoingContent22 == null) {
                    }
                }
                if (outgoingContent != null) {
                }
            }
        }
        contentNegotiationKt$ContentNegotiation$2$convertRequest$1 = new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertRequest$1(continuation);
        java.lang.Object obj32 = contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contentNegotiationKt$ContentNegotiation$2$convertRequest$1.getInputSizeshNQ4ISI;
        io.ktor.http.content.OutgoingContent outgoingContent3 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$ContentNegotiation$lambda$16$convertResponse(java.util.Set set, java.util.List list, io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder, io.ktor.http.Url url, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj, io.ktor.http.ContentType contentType, java.nio.charset.Charset charset, kotlin.coroutines.Continuation continuation) {
        io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertResponse$1 contentNegotiationKt$ContentNegotiation$2$convertResponse$1;
        java.lang.Object obj2;
        int i;
        if (continuation instanceof io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertResponse$1) {
            contentNegotiationKt$ContentNegotiation$2$convertResponse$1 = (io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertResponse$1) continuation;
            if ((contentNegotiationKt$ContentNegotiation$2$convertResponse$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                contentNegotiationKt$ContentNegotiation$2$convertResponse$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                obj2 = contentNegotiationKt$ContentNegotiation$2$convertResponse$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contentNegotiationKt$ContentNegotiation$2$convertResponse$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (!(obj instanceof io.ktor.utils.io.ByteReadChannel)) {
                        org.slf4j.Logger logger = getHighSpeedVideoSizes;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Response body is already transformed. Skipping ContentNegotiation for ");
                        sb.append(url);
                        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        logger.trace(sb.toString());
                        return null;
                    }
                    if (set.contains(typeInfo.getType())) {
                        org.slf4j.Logger logger2 = getHighSpeedVideoSizes;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Response body type ");
                        sb2.append(typeInfo.getType());
                        sb2.append(" is in ignored types. Skipping ContentNegotiation for ");
                        sb2.append(url);
                        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        logger2.trace(sb2.toString());
                        return null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj3 : list) {
                        if (((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration) obj3).getContentTypeMatcher().contains(contentType)) {
                            arrayList.add(obj3);
                        }
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration) it.next()).getConverter());
                    }
                    java.util.ArrayList arrayList4 = arrayList3;
                    if (arrayList4.isEmpty()) {
                        arrayList4 = null;
                    }
                    if (arrayList4 == null) {
                        org.slf4j.Logger logger3 = getHighSpeedVideoSizes;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("None of the registered converters match response with Content-Type=");
                        sb3.append(contentType);
                        sb3.append(". Skipping ContentNegotiation for ");
                        sb3.append(url);
                        sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        logger3.trace(sb3.toString());
                        return null;
                    }
                    contentNegotiationKt$ContentNegotiation$2$convertResponse$1.Camera2StreamConfigurationMap = url;
                    contentNegotiationKt$ContentNegotiation$2$convertResponse$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj2 = io.ktor.serialization.ContentConverterKt.deserialize(arrayList4, (io.ktor.utils.io.ByteReadChannel) obj, typeInfo, charset, contentNegotiationKt$ContentNegotiation$2$convertResponse$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    url = (io.ktor.http.Url) contentNegotiationKt$ContentNegotiation$2$convertResponse$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                if (!(obj2 instanceof io.ktor.utils.io.ByteReadChannel)) {
                    org.slf4j.Logger logger4 = getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Response body was converted to ");
                    sb4.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj2.getClass()));
                    sb4.append(" for ");
                    sb4.append(url);
                    sb4.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    logger4.trace(sb4.toString());
                }
                return obj2;
            }
        }
        contentNegotiationKt$ContentNegotiation$2$convertResponse$1 = new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$convertResponse$1(continuation);
        obj2 = contentNegotiationKt$ContentNegotiation$2$convertResponse$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contentNegotiationKt$ContentNegotiation$2$convertResponse$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (!(obj2 instanceof io.ktor.utils.io.ByteReadChannel)) {
        }
        return obj2;
    }

    public static /* synthetic */ void getContentNegotiation$annotations() {
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.http.ContentType.class)));
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        ExcludedContentTypes = new io.ktor.util.AttributeKey<>("ExcludedContentTypesAttr", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        ContentNegotiation = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("ContentNegotiation", io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$1.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt.$r8$lambda$LGiTa0ByOhJg6WlFcQ3RwIJOtAk((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            }
        });
    }

    public static final java.util.Set<kotlin.reflect.KClass<?>> getDefaultCommonIgnoredTypes() {
        return DefaultCommonIgnoredTypes;
    }

    public static final io.ktor.util.AttributeKey<java.util.List<io.ktor.http.ContentType>> getExcludedContentTypes() {
        return ExcludedContentTypes;
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> getContentNegotiation() {
        return ContentNegotiation;
    }

    public static final void exclude(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.ContentType... contentTypeArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentTypeArr, "");
        io.ktor.util.Attributes attributes = httpRequestBuilder.getAttributes();
        io.ktor.util.AttributeKey<java.util.List<io.ktor.http.ContentType>> attributeKey = ExcludedContentTypes;
        java.util.List list = (java.util.List) attributes.getOrNull(attributeKey);
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        httpRequestBuilder.getAttributes().put(attributeKey, kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Object[]) contentTypeArr));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LGiTa0ByOhJg6WlFcQ3RwIJOtAk(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> registrations$ktor_client_content_negotiation = ((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig) clientPluginBuilder.getPluginConfig()).getRegistrations$ktor_client_content_negotiation();
        java.util.Set<kotlin.reflect.KClass<?>> ignoredTypes$ktor_client_content_negotiation = ((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig) clientPluginBuilder.getPluginConfig()).getIgnoredTypes$ktor_client_content_negotiation();
        clientPluginBuilder.transformRequestBody(new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$1(registrations$ktor_client_content_negotiation, ignoredTypes$ktor_client_content_negotiation, clientPluginBuilder, null));
        clientPluginBuilder.transformResponseBody(new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$2(ignoredTypes$ktor_client_content_negotiation, registrations$ktor_client_content_negotiation, clientPluginBuilder, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$pVWWfO655E9lKz82TXoIQOYsbOs(io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration converterRegistration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(converterRegistration, "");
        return converterRegistration.getConverter().toString();
    }
}
