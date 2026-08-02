package retrofit2.converter.protobuf;

/* loaded from: classes18.dex */
final class ProtoResponseBodyConverter<T extends com.google.protobuf.MessageLite> implements retrofit2.Converter<okhttp3.ResponseBody, T> {
    private final com.google.protobuf.Parser<T> getHighSpeedVideoFpsRangesFor;

    @javax.annotation.Nullable
    private final com.google.protobuf.ExtensionRegistryLite getHighSpeedVideoSizes;

    ProtoResponseBodyConverter(com.google.protobuf.Parser<T> parser, @javax.annotation.Nullable com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        this.getHighSpeedVideoFpsRangesFor = parser;
        this.getHighSpeedVideoSizes = extensionRegistryLite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // retrofit2.Converter
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public T convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
        T parseFrom;
        try {
            try {
                if (this.getHighSpeedVideoSizes == null) {
                    parseFrom = this.getHighSpeedVideoFpsRangesFor.parseFrom(responseBody.byteStream());
                } else {
                    parseFrom = this.getHighSpeedVideoFpsRangesFor.parseFrom(responseBody.byteStream(), this.getHighSpeedVideoSizes);
                }
                return parseFrom;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw new java.lang.RuntimeException(e);
            }
        } finally {
            responseBody.close();
        }
    }
}
