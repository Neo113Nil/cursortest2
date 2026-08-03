package io.ktor.serialization;

/* compiled from: ContentConverter.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a6\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0087@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/Headers;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "defaultCharset", "suitableCharset", "(Lio/ktor/http/Headers;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "suitableCharsetOrNull", "", "Lio/ktor/serialization/ContentConverter;", "Lio/ktor/utils/io/ByteReadChannel;", "body", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "charset", "", "deserialize", "(Ljava/util/List;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/util/reflect/TypeInfo;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-serialization"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentConverterKt {
    public static /* synthetic */ java.nio.charset.Charset suitableCharset$default(io.ktor.http.Headers headers, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return suitableCharset(headers, charset);
    }

    public static final java.nio.charset.Charset suitableCharset(io.ktor.http.Headers headers, java.nio.charset.Charset defaultCharset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultCharset, "defaultCharset");
        java.nio.charset.Charset suitableCharsetOrNull = suitableCharsetOrNull(headers, defaultCharset);
        return suitableCharsetOrNull == null ? defaultCharset : suitableCharsetOrNull;
    }

    public static /* synthetic */ java.nio.charset.Charset suitableCharsetOrNull$default(io.ktor.http.Headers headers, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return suitableCharsetOrNull(headers, charset);
    }

    public static final java.nio.charset.Charset suitableCharsetOrNull(io.ktor.http.Headers headers, java.nio.charset.Charset defaultCharset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultCharset, "defaultCharset");
        java.util.Iterator<io.ktor.http.HeaderValue> it = io.ktor.http.HttpHeaderValueParserKt.parseAndSortHeader(headers.get(io.ktor.http.HttpHeaders.INSTANCE.getAcceptCharset())).iterator();
        while (it.hasNext()) {
            java.lang.String value = it.next().getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, "*")) {
                return defaultCharset;
            }
            if (io.ktor.utils.io.charsets.CharsetJVMKt.isSupported(kotlin.text.Charsets.INSTANCE, value)) {
                return io.ktor.utils.io.charsets.CharsetJVMKt.forName(kotlin.text.Charsets.INSTANCE, value);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object deserialize(java.util.List<? extends io.ktor.serialization.ContentConverter> list, final io.ktor.utils.io.ByteReadChannel byteReadChannel, final io.ktor.util.reflect.TypeInfo typeInfo, final java.nio.charset.Charset charset, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        io.ktor.serialization.ContentConverterKt$deserialize$1 contentConverterKt$deserialize$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof io.ktor.serialization.ContentConverterKt$deserialize$1) {
            contentConverterKt$deserialize$1 = (io.ktor.serialization.ContentConverterKt$deserialize$1) continuation;
            if ((contentConverterKt$deserialize$1.label & Integer.MIN_VALUE) != 0) {
                contentConverterKt$deserialize$1.label -= Integer.MIN_VALUE;
                obj = contentConverterKt$deserialize$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contentConverterKt$deserialize$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlinx.coroutines.flow.Flow asFlow = kotlinx.coroutines.flow.FlowKt.asFlow(list);
                    kotlinx.coroutines.flow.Flow<java.lang.Object> flow = new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation2) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1.AnonymousClass2(flowCollector, charset, typeInfo, byteReadChannel), continuation2);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ io.ktor.utils.io.ByteReadChannel $body$inlined;
                            final /* synthetic */ java.nio.charset.Charset $charset$inlined;
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;
                            final /* synthetic */ io.ktor.util.reflect.TypeInfo $typeInfo$inlined;

                            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", f = "ContentConverter.kt", i = {}, l = {51, 50}, m = "emit", n = {}, s = {})
                            /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                java.lang.Object L$0;
                                int label;
                                /* synthetic */ java.lang.Object result;

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.utils.io.ByteReadChannel byteReadChannel) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$charset$inlined = charset;
                                this.$typeInfo$inlined = typeInfo;
                                this.$body$inlined = byteReadChannel;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                java.lang.Object obj2;
                                java.lang.Object coroutine_suspended;
                                int i;
                                kotlinx.coroutines.flow.FlowCollector flowCollector;
                                if (continuation instanceof io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        obj2 = anonymousClass1.result;
                                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                            java.nio.charset.Charset charset = this.$charset$inlined;
                                            io.ktor.util.reflect.TypeInfo typeInfo = this.$typeInfo$inlined;
                                            io.ktor.utils.io.ByteReadChannel byteReadChannel = this.$body$inlined;
                                            anonymousClass1.L$0 = flowCollector2;
                                            anonymousClass1.label = 1;
                                            java.lang.Object deserialize = ((io.ktor.serialization.ContentConverter) obj).deserialize(charset, typeInfo, byteReadChannel, anonymousClass1);
                                            if (deserialize == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            obj2 = deserialize;
                                            flowCollector = flowCollector2;
                                        } else {
                                            if (i != 1) {
                                                if (i != 2) {
                                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                kotlin.ResultKt.throwOnFailure(obj2);
                                                return kotlin.Unit.INSTANCE;
                                            }
                                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            flowCollector = flowCollector3;
                                        }
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.label = 2;
                                        if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                obj2 = anonymousClass1.result;
                                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    };
                    io.ktor.serialization.ContentConverterKt$deserialize$result$2 contentConverterKt$deserialize$result$2 = new io.ktor.serialization.ContentConverterKt$deserialize$result$2(byteReadChannel, null);
                    contentConverterKt$deserialize$1.L$0 = byteReadChannel;
                    contentConverterKt$deserialize$1.L$1 = typeInfo;
                    contentConverterKt$deserialize$1.label = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(flow, contentConverterKt$deserialize$result$2, contentConverterKt$deserialize$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    typeInfo = (io.ktor.util.reflect.TypeInfo) contentConverterKt$deserialize$1.L$1;
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) contentConverterKt$deserialize$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return obj;
                }
                if (!byteReadChannel.isClosedForRead()) {
                    return byteReadChannel;
                }
                kotlin.reflect.KType kotlinType = typeInfo.getKotlinType();
                if (kotlinType != null && kotlinType.isMarkedNullable()) {
                    return io.ktor.http.content.NullBody.INSTANCE;
                }
                throw new io.ktor.serialization.ContentConvertException("No suitable converter found for " + typeInfo, null, 2, null);
            }
        }
        contentConverterKt$deserialize$1 = new io.ktor.serialization.ContentConverterKt$deserialize$1(continuation);
        obj = contentConverterKt$deserialize$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contentConverterKt$deserialize$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }
}
