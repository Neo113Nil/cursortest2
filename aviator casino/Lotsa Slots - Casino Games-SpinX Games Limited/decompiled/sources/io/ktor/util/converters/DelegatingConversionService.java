package io.ktor.util.converters;

/* compiled from: DataConversion.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0018Bm\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012+\u0010\u000b\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0004\u0012+\u0010\r\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u0004\u0018\u00010\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R9\u0010\u000b\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R9\u0010\r\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/ktor/util/converters/DelegatingConversionService;", "Lio/ktor/util/converters/ConversionService;", "Lkotlin/reflect/KClass;", "klass", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "name", "values", "", "decoder", "value", "encoder", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/util/reflect/TypeInfo;", "type", "fromValues", "(Ljava/util/List;Lio/ktor/util/reflect/TypeInfo;)Ljava/lang/Object;", "toValues", "(Ljava/lang/Object;)Ljava/util/List;", "Lkotlin/reflect/KClass;", "Lkotlin/jvm/functions/Function1;", "Configuration", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DelegatingConversionService implements io.ktor.util.converters.ConversionService {
    private final kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, java.lang.Object> decoder;
    private final kotlin.jvm.functions.Function1<java.lang.Object, java.util.List<java.lang.String>> encoder;
    private final kotlin.reflect.KClass<?> klass;

    /* JADX WARN: Multi-variable type inference failed */
    public DelegatingConversionService(kotlin.reflect.KClass<?> klass, kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.util.List<java.lang.String>> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        this.klass = klass;
        this.decoder = function1;
        this.encoder = function12;
    }

    @Override // io.ktor.util.converters.ConversionService
    public java.lang.Object fromValues(java.util.List<java.lang.String> values, io.ktor.util.reflect.TypeInfo type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, java.lang.Object> function1 = this.decoder;
        if (function1 == null) {
            throw new java.lang.IllegalStateException("Decoder was not specified for type '" + this.klass + '\'');
        }
        return function1.invoke(values);
    }

    @Override // io.ktor.util.converters.ConversionService
    public java.util.List<java.lang.String> toValues(java.lang.Object value) {
        kotlin.jvm.functions.Function1<java.lang.Object, java.util.List<java.lang.String>> function1 = this.encoder;
        if (function1 == null) {
            throw new java.lang.IllegalStateException("Encoder was not specified for type '" + this.klass + '\'');
        }
        return function1.invoke(value);
    }

    /* compiled from: DataConversion.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J6\u0010\u000f\u001a\u00020\u000e2'\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0012\u001a\u00020\u000e2'\u0010\r\u001a#\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u0012\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015RE\u0010\u0016\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0010RE\u0010\u001b\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/ktor/util/converters/DelegatingConversionService$Configuration;", "", "T", "Lkotlin/reflect/KClass;", "klass", "<init>", "(Lkotlin/reflect/KClass;)V", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "name", "values", "converter", "", "decode", "(Lkotlin/jvm/functions/Function1;)V", "value", "encode", "Lkotlin/reflect/KClass;", "getKlass$ktor_utils", "()Lkotlin/reflect/KClass;", "decoder", "Lkotlin/jvm/functions/Function1;", "getDecoder$ktor_utils", "()Lkotlin/jvm/functions/Function1;", "setDecoder$ktor_utils", "encoder", "getEncoder$ktor_utils", "setEncoder$ktor_utils", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Configuration<T> {
        private kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, ? extends T> decoder;
        private kotlin.jvm.functions.Function1<? super T, ? extends java.util.List<java.lang.String>> encoder;
        private final kotlin.reflect.KClass<T> klass;

        public Configuration(kotlin.reflect.KClass<T> klass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
            this.klass = klass;
        }

        public final kotlin.reflect.KClass<T> getKlass$ktor_utils() {
            return this.klass;
        }

        public final kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, T> getDecoder$ktor_utils() {
            return this.decoder;
        }

        public final void setDecoder$ktor_utils(kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, ? extends T> function1) {
            this.decoder = function1;
        }

        public final kotlin.jvm.functions.Function1<T, java.util.List<java.lang.String>> getEncoder$ktor_utils() {
            return this.encoder;
        }

        public final void setEncoder$ktor_utils(kotlin.jvm.functions.Function1<? super T, ? extends java.util.List<java.lang.String>> function1) {
            this.encoder = function1;
        }

        public final void decode(kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, ? extends T> converter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(converter, "converter");
            if (this.decoder != null) {
                throw new java.lang.IllegalStateException("Decoder has already been set for type '" + this.klass + '\'');
            }
            this.decoder = converter;
        }

        public final void encode(kotlin.jvm.functions.Function1<? super T, ? extends java.util.List<java.lang.String>> converter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(converter, "converter");
            if (this.encoder != null) {
                throw new java.lang.IllegalStateException("Encoder has already been set for type '" + this.klass + '\'');
            }
            this.encoder = converter;
        }
    }
}
