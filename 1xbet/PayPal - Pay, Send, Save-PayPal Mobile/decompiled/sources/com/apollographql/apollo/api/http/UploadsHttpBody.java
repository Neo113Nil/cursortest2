package com.apollographql.apollo.api.http;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\f*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/apollographql/apollo/api/http/UploadsHttpBody;", "Lcom/apollographql/apollo/api/http/HttpBody;", "", "", "Lcom/apollographql/apollo/api/Upload;", "uploads", "Lokio/ByteString;", "operationByteString", "<init>", "(Ljava/util/Map;Lokio/ByteString;)V", "Lokio/BufferedSink;", "bufferedSink", "", "writeTo", "(Lokio/BufferedSink;)V", "p0", "getHighSpeedVideoSizes", "(Ljava/util/Map;)Lokio/ByteString;", "", "Camera2StreamConfigurationMap", "(Lokio/BufferedSink;Z)V", "Ljava/util/Map;", "Lokio/ByteString;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "getContentType", "()Ljava/lang/String;", "", "contentLength$delegate", "Lkotlin/Lazy;", "getContentLength", "()J", "contentLength"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UploadsHttpBody implements com.apollographql.apollo.api.http.HttpBody {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okio.ByteString getHighSpeedVideoFpsRanges;

    /* renamed from: contentLength$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy contentLength;
    private final java.lang.String contentType;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.apollographql.apollo.api.Upload> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadsHttpBody(java.util.Map<java.lang.String, ? extends com.apollographql.apollo.api.Upload> map, okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoFpsRanges = byteString;
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
        java.lang.String obj = randomUUID.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.contentType = "multipart/form-data; boundary=".concat(java.lang.String.valueOf(obj));
        this.contentLength = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.api.http.UploadsHttpBody$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Long.valueOf(com.apollographql.apollo.api.http.UploadsHttpBody.$r8$lambda$5RZib8LdtEwZUiA9Pnl6HAof5O0(com.apollographql.apollo.api.http.UploadsHttpBody.this));
            }
        });
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final java.lang.String getContentType() {
        return this.contentType;
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final long getContentLength() {
        return ((java.lang.Number) this.contentLength.getValue()).longValue();
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final void writeTo(okio.BufferedSink bufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
        Camera2StreamConfigurationMap(bufferedSink, true);
    }

    private final void Camera2StreamConfigurationMap(okio.BufferedSink bufferedSink, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("--");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        bufferedSink.writeUtf8(sb.toString());
        bufferedSink.writeUtf8("Content-Disposition: form-data; name=\"operations\"\r\n");
        bufferedSink.writeUtf8("Content-Type: application/json\r\n");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Content-Length: ");
        sb2.append(this.getHighSpeedVideoFpsRanges.size());
        sb2.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        bufferedSink.writeUtf8(sb2.toString());
        bufferedSink.writeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        bufferedSink.write(this.getHighSpeedVideoFpsRanges);
        okio.ByteString highSpeedVideoSizes = getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\r\n--");
        sb3.append(this.getHighSpeedVideoFpsRangesFor);
        sb3.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        bufferedSink.writeUtf8(sb3.toString());
        bufferedSink.writeUtf8("Content-Disposition: form-data; name=\"map\"\r\n");
        bufferedSink.writeUtf8("Content-Type: application/json\r\n");
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Content-Length: ");
        sb4.append(highSpeedVideoSizes.size());
        sb4.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        bufferedSink.writeUtf8(sb4.toString());
        bufferedSink.writeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        bufferedSink.write(highSpeedVideoSizes);
        int i = 0;
        for (java.lang.Object obj : this.Camera2StreamConfigurationMap.values()) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.apollographql.apollo.api.Upload upload = (com.apollographql.apollo.api.Upload) obj;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("\r\n--");
            sb5.append(this.getHighSpeedVideoFpsRangesFor);
            sb5.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            bufferedSink.writeUtf8(sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Content-Disposition: form-data; name=\"");
            sb6.append(i);
            sb6.append('\"');
            bufferedSink.writeUtf8(sb6.toString());
            if (upload.getFileName() != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("; filename=\"");
                sb7.append(upload.getFileName());
                sb7.append('\"');
                bufferedSink.writeUtf8(sb7.toString());
            }
            bufferedSink.writeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Content-Type: ");
            sb8.append(upload.getContentType());
            sb8.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            bufferedSink.writeUtf8(sb8.toString());
            long contentLength = upload.getContentLength();
            if (contentLength != -1) {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Content-Length: ");
                sb9.append(contentLength);
                sb9.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
                bufferedSink.writeUtf8(sb9.toString());
            }
            bufferedSink.writeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            if (z) {
                upload.writeTo(bufferedSink);
            }
            i++;
        }
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("\r\n--");
        sb10.append(this.getHighSpeedVideoFpsRangesFor);
        sb10.append("--\r\n");
        bufferedSink.writeUtf8(sb10.toString());
    }

    private static okio.ByteString getHighSpeedVideoSizes(java.util.Map<java.lang.String, ? extends com.apollographql.apollo.api.Upload> p0) {
        okio.Buffer buffer = new okio.Buffer();
        com.apollographql.apollo.api.json.BufferedSinkJsonWriter bufferedSinkJsonWriter = new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null);
        java.util.Set<java.util.Map.Entry<java.lang.String, ? extends com.apollographql.apollo.api.Upload>> entrySet = p0.entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10));
        int i = 0;
        for (java.lang.Object obj : entrySet) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(kotlin.TuplesKt.to(java.lang.String.valueOf(i), kotlin.collections.CollectionsKt.listOf(((java.util.Map.Entry) obj).getKey())));
            i++;
        }
        com.apollographql.apollo.api.json.JsonWriters.writeAny(bufferedSinkJsonWriter, kotlin.collections.MapsKt.toMap(arrayList));
        return buffer.readByteString();
    }

    public static /* synthetic */ long $r8$lambda$5RZib8LdtEwZUiA9Pnl6HAof5O0(com.apollographql.apollo.api.http.UploadsHttpBody uploadsHttpBody) {
        com.apollographql.apollo.api.http.CountingSink countingSink = new com.apollographql.apollo.api.http.CountingSink(okio.Okio.blackhole());
        okio.BufferedSink buffer = okio.Okio.buffer(countingSink);
        uploadsHttpBody.Camera2StreamConfigurationMap(buffer, false);
        buffer.flush();
        long j = countingSink.Camera2StreamConfigurationMap;
        java.util.Iterator<T> it = uploadsHttpBody.Camera2StreamConfigurationMap.values().iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((com.apollographql.apollo.api.Upload) it.next()).getContentLength();
        }
        return j + j2;
    }
}
