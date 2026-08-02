package io.ktor.serialization.kotlinx;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lio/ktor/serialization/kotlinx/KotlinxSerializationConverter;", "Lio/ktor/serialization/ContentConverter;", "Lkotlinx/serialization/SerialFormat;", "format", "<init>", "(Lkotlinx/serialization/SerialFormat;)V", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lio/ktor/http/content/OutgoingContent;", "serialize", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/SerialFormat;", "", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "getHighSpeedVideoSizes", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KotlinxSerializationConverter implements io.ktor.serialization.ContentConverter {
    private final kotlinx.serialization.SerialFormat getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtension> getHighSpeedVideoSizes;

    public KotlinxSerializationConverter(kotlinx.serialization.SerialFormat serialFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialFormat, "");
        this.getHighResolutionOutputSizeshNQ4ISI = serialFormat;
        this.getHighSpeedVideoSizes = io.ktor.serialization.kotlinx.ExtensionsKt.extensions(serialFormat);
        if ((serialFormat instanceof kotlinx.serialization.BinaryFormat) || (serialFormat instanceof kotlinx.serialization.StringFormat)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Only binary and string formats are supported, ");
        sb.append(serialFormat);
        sb.append(" is not supported.");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object serialize(final io.ktor.http.ContentType contentType, final java.nio.charset.Charset charset, final io.ktor.util.reflect.TypeInfo typeInfo, final java.lang.Object obj, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1 kotlinxSerializationConverter$serialize$1;
        int i;
        io.ktor.http.ContentType contentType2;
        java.nio.charset.Charset charset2;
        io.ktor.util.reflect.TypeInfo typeInfo2;
        java.lang.Object obj2;
        io.ktor.http.content.OutgoingContent outgoingContent;
        kotlinx.serialization.KSerializer<?> guessSerializer;
        if (continuation instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1) {
            kotlinxSerializationConverter$serialize$1 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1) continuation;
            if ((kotlinxSerializationConverter$serialize$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                kotlinxSerializationConverter$serialize$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj3 = kotlinxSerializationConverter$serialize$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kotlinxSerializationConverter$serialize$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    final kotlinx.coroutines.flow.Flow asFlow = kotlinx.coroutines.flow.FlowKt.asFlow(this.getHighSpeedVideoSizes);
                    kotlinx.coroutines.flow.Flow<io.ktor.http.content.OutgoingContent> flow = new kotlinx.coroutines.flow.Flow<io.ktor.http.content.OutgoingContent>() { // from class: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1

                        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ java.nio.charset.Charset Camera2StreamConfigurationMap;
                            final /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;
                            final /* synthetic */ io.ktor.http.ContentType getHighSpeedVideoFpsRangesFor;
                            final /* synthetic */ io.ktor.util.reflect.TypeInfo getHighSpeedVideoSizes;

                            /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
                            
                                if (r11.emit(r12, r0) != r7) goto L22;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                kotlinx.coroutines.flow.FlowCollector flowCollector;
                                if (continuation instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                                        java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoFpsRanges;
                                            io.ktor.serialization.kotlinx.KotlinxSerializationExtension kotlinxSerializationExtension = (io.ktor.serialization.kotlinx.KotlinxSerializationExtension) obj;
                                            io.ktor.http.ContentType contentType = this.getHighSpeedVideoFpsRangesFor;
                                            java.nio.charset.Charset charset = this.Camera2StreamConfigurationMap;
                                            io.ktor.util.reflect.TypeInfo typeInfo = this.getHighSpeedVideoSizes;
                                            java.lang.Object obj3 = this.getHighResolutionOutputSizeshNQ4ISI;
                                            anonymousClass1.Camera2StreamConfigurationMap = flowCollector2;
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                            java.lang.Object serialize = kotlinxSerializationExtension.serialize(contentType, charset, typeInfo, obj3, anonymousClass1);
                                            if (serialize != coroutine_suspended) {
                                                obj2 = serialize;
                                                flowCollector = flowCollector2;
                                            }
                                            return coroutine_suspended;
                                        }
                                        if (i != 1) {
                                            if (i != 2) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            return kotlin.Unit.INSTANCE;
                                        }
                                        kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.Camera2StreamConfigurationMap;
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        flowCollector = flowCollector3;
                                        anonymousClass1.Camera2StreamConfigurationMap = null;
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
                                    }
                                }
                                anonymousClass1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                if (i != 0) {
                                }
                                anonymousClass1.Camera2StreamConfigurationMap = null;
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {51, 50}, m = "emit", n = {}, s = {})
                            /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                java.lang.Object Camera2StreamConfigurationMap;
                                int getHighResolutionOutputSizeshNQ4ISI;
                                /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.getHighSpeedVideoSizes = obj;
                                    this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                                    return io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                }

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, io.ktor.http.ContentType contentType, java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj) {
                                this.getHighSpeedVideoFpsRanges = flowCollector;
                                this.getHighSpeedVideoFpsRangesFor = contentType;
                                this.Camera2StreamConfigurationMap = charset;
                                this.getHighSpeedVideoSizes = typeInfo;
                                this.getHighResolutionOutputSizeshNQ4ISI = obj;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super io.ktor.http.content.OutgoingContent> flowCollector, kotlin.coroutines.Continuation continuation2) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2(flowCollector, contentType, charset, typeInfo, obj), continuation2);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }
                    };
                    io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$fromExtension$2 kotlinxSerializationConverter$serialize$fromExtension$2 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$fromExtension$2(null);
                    contentType2 = contentType;
                    kotlinxSerializationConverter$serialize$1.getHighSpeedVideoFpsRangesFor = contentType2;
                    kotlinxSerializationConverter$serialize$1.getHighSpeedVideoFpsRanges = charset;
                    kotlinxSerializationConverter$serialize$1.Camera2StreamConfigurationMap = typeInfo;
                    kotlinxSerializationConverter$serialize$1.getHighSpeedVideoSizes = obj;
                    kotlinxSerializationConverter$serialize$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj3 = kotlinx.coroutines.flow.FlowKt.firstOrNull(flow, kotlinxSerializationConverter$serialize$fromExtension$2, kotlinxSerializationConverter$serialize$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    charset2 = charset;
                    typeInfo2 = typeInfo;
                    obj2 = obj;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = kotlinxSerializationConverter$serialize$1.getHighSpeedVideoSizes;
                    typeInfo2 = (io.ktor.util.reflect.TypeInfo) kotlinxSerializationConverter$serialize$1.Camera2StreamConfigurationMap;
                    charset2 = (java.nio.charset.Charset) kotlinxSerializationConverter$serialize$1.getHighSpeedVideoFpsRanges;
                    io.ktor.http.ContentType contentType3 = (io.ktor.http.ContentType) kotlinxSerializationConverter$serialize$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    contentType2 = contentType3;
                }
                outgoingContent = (io.ktor.http.content.OutgoingContent) obj3;
                if (outgoingContent == null) {
                    return outgoingContent;
                }
                try {
                    guessSerializer = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.getHighResolutionOutputSizeshNQ4ISI.getSerializersModule(), typeInfo2);
                } catch (kotlinx.serialization.SerializationException unused) {
                    guessSerializer = io.ktor.serialization.kotlinx.SerializerLookupKt.guessSerializer(obj2, this.getHighResolutionOutputSizeshNQ4ISI.getSerializersModule());
                }
                kotlinx.serialization.SerialFormat serialFormat = this.getHighResolutionOutputSizeshNQ4ISI;
                if (serialFormat instanceof kotlinx.serialization.StringFormat) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(guessSerializer, "");
                    return new io.ktor.http.content.TextContent(((kotlinx.serialization.StringFormat) serialFormat).encodeToString(guessSerializer, obj2), io.ktor.http.ContentTypesKt.withCharsetIfNeeded(contentType2, charset2), null, 4, null);
                }
                if (serialFormat instanceof kotlinx.serialization.BinaryFormat) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(guessSerializer, "");
                    return new io.ktor.http.content.ByteArrayContent(((kotlinx.serialization.BinaryFormat) serialFormat).encodeToByteArray(guessSerializer, obj2), contentType2, null, 4, null);
                }
                throw new java.lang.IllegalStateException("Unsupported format ".concat(java.lang.String.valueOf(serialFormat)).toString());
            }
        }
        kotlinxSerializationConverter$serialize$1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1(this, continuation);
        java.lang.Object obj32 = kotlinxSerializationConverter$serialize$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kotlinxSerializationConverter$serialize$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        outgoingContent = (io.ktor.http.content.OutgoingContent) obj32;
        if (outgoingContent == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:13:0x00a9, B:15:0x00af, B:18:0x00bd, B:20:0x00c1, B:22:0x00ce, B:23:0x00ec), top: B:12:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:13:0x00a9, B:15:0x00af, B:18:0x00bd, B:20:0x00c1, B:22:0x00ce, B:23:0x00ec), top: B:12:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deserialize(final java.nio.charset.Charset charset, final io.ktor.util.reflect.TypeInfo typeInfo, final io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$1 kotlinxSerializationConverter$deserialize$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        java.nio.charset.Charset charset2;
        kotlinx.serialization.KSerializer<?> kSerializer;
        kotlinx.serialization.SerialFormat serialFormat;
        if (continuation instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$1) {
            kotlinxSerializationConverter$deserialize$1 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$1) continuation;
            if ((kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                obj = kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoFpsRanges;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlinx.coroutines.flow.Flow asFlow = kotlinx.coroutines.flow.FlowKt.asFlow(this.getHighSpeedVideoSizes);
                    kotlinx.coroutines.flow.Flow<java.lang.Object> flow = new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1

                        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ io.ktor.utils.io.ByteReadChannel Camera2StreamConfigurationMap;
                            final /* synthetic */ java.nio.charset.Charset getHighSpeedVideoFpsRanges;
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;
                            final /* synthetic */ io.ktor.util.reflect.TypeInfo getHighSpeedVideoSizes;

                            /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
                            
                                if (r9.emit(r10, r0) != r1) goto L22;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                kotlinx.coroutines.flow.FlowCollector flowCollector;
                                if (continuation instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                                        java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.Camera2StreamConfigurationMap;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoFpsRangesFor;
                                            java.nio.charset.Charset charset = this.getHighSpeedVideoFpsRanges;
                                            io.ktor.util.reflect.TypeInfo typeInfo = this.getHighSpeedVideoSizes;
                                            io.ktor.utils.io.ByteReadChannel byteReadChannel = this.Camera2StreamConfigurationMap;
                                            anonymousClass1.getHighSpeedVideoFpsRanges = flowCollector2;
                                            anonymousClass1.Camera2StreamConfigurationMap = 1;
                                            java.lang.Object deserialize = ((io.ktor.serialization.kotlinx.KotlinxSerializationExtension) obj).deserialize(charset, typeInfo, byteReadChannel, anonymousClass1);
                                            if (deserialize != coroutine_suspended) {
                                                obj2 = deserialize;
                                                flowCollector = flowCollector2;
                                            }
                                            return coroutine_suspended;
                                        }
                                        if (i != 1) {
                                            if (i != 2) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            return kotlin.Unit.INSTANCE;
                                        }
                                        kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoFpsRanges;
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        flowCollector = flowCollector3;
                                        anonymousClass1.getHighSpeedVideoFpsRanges = null;
                                        anonymousClass1.Camera2StreamConfigurationMap = 2;
                                    }
                                }
                                anonymousClass1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.Camera2StreamConfigurationMap;
                                if (i != 0) {
                                }
                                anonymousClass1.getHighSpeedVideoFpsRanges = null;
                                anonymousClass1.Camera2StreamConfigurationMap = 2;
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {51, 50}, m = "emit", n = {}, s = {})
                            /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                int Camera2StreamConfigurationMap;
                                java.lang.Object getHighSpeedVideoFpsRanges;
                                /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.getHighSpeedVideoSizes = obj;
                                    this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                                    return io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                }

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.utils.io.ByteReadChannel byteReadChannel) {
                                this.getHighSpeedVideoFpsRangesFor = flowCollector;
                                this.getHighSpeedVideoFpsRanges = charset;
                                this.getHighSpeedVideoSizes = typeInfo;
                                this.Camera2StreamConfigurationMap = byteReadChannel;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation2) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2(flowCollector, charset, typeInfo, byteReadChannel), continuation2);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }
                    };
                    io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2 kotlinxSerializationConverter$deserialize$fromExtension$2 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2(byteReadChannel, null);
                    kotlinxSerializationConverter$deserialize$1.Camera2StreamConfigurationMap = charset;
                    kotlinxSerializationConverter$deserialize$1.getHighResolutionOutputSizeshNQ4ISI = typeInfo;
                    kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoSizes = byteReadChannel;
                    kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(flow, kotlinxSerializationConverter$deserialize$fromExtension$2, kotlinxSerializationConverter$deserialize$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kSerializer = (kotlinx.serialization.KSerializer) kotlinxSerializationConverter$deserialize$1.getHighResolutionOutputSizeshNQ4ISI;
                        charset2 = (java.nio.charset.Charset) kotlinxSerializationConverter$deserialize$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.io.Source source = (kotlinx.io.Source) obj;
                        try {
                            serialFormat = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (!(serialFormat instanceof kotlinx.serialization.StringFormat)) {
                                return ((kotlinx.serialization.StringFormat) serialFormat).decodeFromString(kSerializer, io.ktor.utils.io.core.StringsKt.readText$default(source, charset2, 0, 2, null));
                            }
                            if (serialFormat instanceof kotlinx.serialization.BinaryFormat) {
                                return ((kotlinx.serialization.BinaryFormat) serialFormat).decodeFromByteArray(kSerializer, kotlinx.io.SourcesKt.readByteArray(source));
                            }
                            io.ktor.utils.io.core.ByteReadPacketKt.discard$default(source, 0L, 1, null);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported format ");
                            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                            throw new java.lang.IllegalStateException(sb.toString().toString());
                        } catch (java.lang.Throwable th) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Illegal input: ");
                            sb2.append(th.getMessage());
                            throw new io.ktor.serialization.JsonConvertException(sb2.toString(), th);
                        }
                    }
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoSizes;
                    typeInfo = (io.ktor.util.reflect.TypeInfo) kotlinxSerializationConverter$deserialize$1.getHighResolutionOutputSizeshNQ4ISI;
                    charset = (java.nio.charset.Charset) kotlinxSerializationConverter$deserialize$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (this.getHighSpeedVideoSizes.isEmpty() && (obj != null || byteReadChannel.isClosedForRead())) {
                    return obj;
                }
                kotlinx.serialization.KSerializer<?> serializerForTypeInfo = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.getHighResolutionOutputSizeshNQ4ISI.getSerializersModule(), typeInfo);
                kotlinxSerializationConverter$deserialize$1.Camera2StreamConfigurationMap = charset;
                kotlinxSerializationConverter$deserialize$1.getHighResolutionOutputSizeshNQ4ISI = serializerForTypeInfo;
                kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoSizes = null;
                kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoFpsRangesFor = 2;
                obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel, kotlinxSerializationConverter$deserialize$1);
                if (obj != coroutine_suspended) {
                    charset2 = charset;
                    kSerializer = serializerForTypeInfo;
                    kotlinx.io.Source source2 = (kotlinx.io.Source) obj;
                    serialFormat = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (!(serialFormat instanceof kotlinx.serialization.StringFormat)) {
                    }
                }
                return coroutine_suspended;
            }
        }
        kotlinxSerializationConverter$deserialize$1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$1(this, continuation);
        obj = kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoFpsRanges;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (this.getHighSpeedVideoSizes.isEmpty()) {
        }
        kotlinx.serialization.KSerializer<?> serializerForTypeInfo2 = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.getHighResolutionOutputSizeshNQ4ISI.getSerializersModule(), typeInfo);
        kotlinxSerializationConverter$deserialize$1.Camera2StreamConfigurationMap = charset;
        kotlinxSerializationConverter$deserialize$1.getHighResolutionOutputSizeshNQ4ISI = serializerForTypeInfo2;
        kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoSizes = null;
        kotlinxSerializationConverter$deserialize$1.getHighSpeedVideoFpsRangesFor = 2;
        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel, kotlinxSerializationConverter$deserialize$1);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
