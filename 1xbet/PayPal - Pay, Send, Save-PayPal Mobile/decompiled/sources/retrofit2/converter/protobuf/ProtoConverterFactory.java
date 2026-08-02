package retrofit2.converter.protobuf;

/* loaded from: classes18.dex */
public final class ProtoConverterFactory extends retrofit2.Converter.Factory {

    @javax.annotation.Nullable
    private final com.google.protobuf.ExtensionRegistryLite getHighSpeedVideoFpsRanges;

    public static retrofit2.converter.protobuf.ProtoConverterFactory create() {
        return new retrofit2.converter.protobuf.ProtoConverterFactory(null);
    }

    public static retrofit2.converter.protobuf.ProtoConverterFactory createWithRegistry(@javax.annotation.Nullable com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return new retrofit2.converter.protobuf.ProtoConverterFactory(extensionRegistryLite);
    }

    private ProtoConverterFactory(@javax.annotation.Nullable com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        this.getHighSpeedVideoFpsRanges = extensionRegistryLite;
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public final retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        com.google.protobuf.Parser parser;
        if (!(type instanceof java.lang.Class)) {
            return null;
        }
        java.lang.Class cls = (java.lang.Class) type;
        if (!com.google.protobuf.MessageLite.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            try {
                parser = (com.google.protobuf.Parser) cls.getDeclaredMethod("parser", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Found a protobuf message but ");
                sb.append(cls.getName());
                sb.append(" had no parser() method or PARSER field.");
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException unused) {
            parser = (com.google.protobuf.Parser) cls.getDeclaredField("PARSER").get(null);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2.getCause());
        }
        return new retrofit2.converter.protobuf.ProtoResponseBodyConverter(parser, this.getHighSpeedVideoFpsRanges);
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public final retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2, retrofit2.Retrofit retrofit) {
        if ((type instanceof java.lang.Class) && com.google.protobuf.MessageLite.class.isAssignableFrom((java.lang.Class) type)) {
            return new retrofit2.converter.protobuf.ProtoRequestBodyConverter();
        }
        return null;
    }
}
