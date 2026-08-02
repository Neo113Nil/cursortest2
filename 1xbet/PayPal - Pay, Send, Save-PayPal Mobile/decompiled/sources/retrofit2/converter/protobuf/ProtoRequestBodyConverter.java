package retrofit2.converter.protobuf;

/* loaded from: classes18.dex */
final class ProtoRequestBodyConverter<T extends com.google.protobuf.MessageLite> implements retrofit2.Converter<T, okhttp3.RequestBody> {
    private static final okhttp3.MediaType getHighSpeedVideoFpsRanges = okhttp3.MediaType.get("application/x-protobuf");

    ProtoRequestBodyConverter() {
    }

    @Override // retrofit2.Converter
    public final /* synthetic */ okhttp3.RequestBody convert(java.lang.Object obj) throws java.io.IOException {
        return okhttp3.RequestBody.create(getHighSpeedVideoFpsRanges, ((com.google.protobuf.MessageLite) obj).toByteArray());
    }
}
