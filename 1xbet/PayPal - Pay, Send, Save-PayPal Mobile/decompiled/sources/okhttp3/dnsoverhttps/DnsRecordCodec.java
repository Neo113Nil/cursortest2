package okhttp3.dnsoverhttps;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lokhttp3/dnsoverhttps/DnsRecordCodec;", "", "<init>", "()V", "", com.datadog.android.log.LogAttributes.HOST, "", "type", "Lokio/ByteString;", "encodeQuery", "(Ljava/lang/String;I)Lokio/ByteString;", "hostname", "byteString", "", "Ljava/net/InetAddress;", "decodeAnswers", "(Ljava/lang/String;Lokio/ByteString;)Ljava/util/List;", "Lokio/Buffer;", "p0", "", "getHighSpeedVideoSizes", "(Lokio/Buffer;)V", "TYPE_A", com.visa.cbp.getEncExpo.warmup, "TYPE_AAAA", "Ljava/nio/charset/Charset;", "Camera2StreamConfigurationMap", "Ljava/nio/charset/Charset;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DnsRecordCodec {
    public static final int TYPE_A = 1;
    public static final int TYPE_AAAA = 28;
    public static final okhttp3.dnsoverhttps.DnsRecordCodec INSTANCE = new okhttp3.dnsoverhttps.DnsRecordCodec();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.nio.charset.Charset getHighSpeedVideoSizes = kotlin.text.Charsets.US_ASCII;

    private DnsRecordCodec() {
    }

    public final okio.ByteString encodeQuery(java.lang.String host, int type) {
        java.util.List<java.lang.String> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
        okio.Buffer buffer = new okio.Buffer();
        buffer.writeShort(0);
        buffer.writeShort(256);
        buffer.writeShort(1);
        buffer.writeShort(0);
        buffer.writeShort(0);
        buffer.writeShort(0);
        okio.Buffer buffer2 = new okio.Buffer();
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) host, new char[]{com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR}, false, 0, 6, (java.lang.Object) null);
        if (!split$default.isEmpty()) {
            java.util.ListIterator listIterator = split$default.listIterator(split$default.size());
            while (listIterator.hasPrevious()) {
                if (((java.lang.String) listIterator.previous()).length() != 0) {
                    emptyList = kotlin.collections.CollectionsKt.take(split$default, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = kotlin.collections.CollectionsKt.emptyList();
        for (java.lang.String str : emptyList) {
            long size$default = okio.Utf8.size$default(str, 0, 0, 3, null);
            if (size$default != str.length()) {
                throw new java.lang.IllegalArgumentException("non-ascii hostname: ".concat(java.lang.String.valueOf(host)).toString());
            }
            buffer2.writeByte((int) size$default);
            buffer2.writeUtf8(str);
        }
        buffer2.writeByte(0);
        buffer2.copyTo(buffer, 0L, buffer2.size());
        buffer.writeShort(type);
        buffer.writeShort(1);
        return buffer.readByteString();
    }

    public final java.util.List<java.net.InetAddress> decodeAnswers(java.lang.String hostname, okio.ByteString byteString) throws java.lang.Exception {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        okio.Buffer buffer = new okio.Buffer();
        buffer.write(byteString);
        buffer.readShort();
        short readShort = buffer.readShort();
        if (((readShort & kotlin.UShort.MAX_VALUE) >> 15) == 0) {
            throw new java.lang.IllegalArgumentException("not a response".toString());
        }
        int i = readShort & 15;
        if (i == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(hostname);
            sb.append(": SERVFAIL");
            throw new java.net.UnknownHostException(sb.toString());
        }
        if (i == 3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(hostname);
            sb2.append(": NXDOMAIN");
            throw new java.net.UnknownHostException(sb2.toString());
        }
        short readShort2 = buffer.readShort();
        short readShort3 = buffer.readShort();
        buffer.readShort();
        buffer.readShort();
        for (int i2 = 0; i2 < (readShort2 & kotlin.UShort.MAX_VALUE); i2++) {
            getHighSpeedVideoSizes(buffer);
            buffer.readShort();
            buffer.readShort();
        }
        for (int i3 = 0; i3 < (readShort3 & kotlin.UShort.MAX_VALUE); i3++) {
            getHighSpeedVideoSizes(buffer);
            int readShort4 = buffer.readShort() & kotlin.UShort.MAX_VALUE;
            buffer.readShort();
            buffer.readInt();
            int readShort5 = buffer.readShort() & kotlin.UShort.MAX_VALUE;
            if (readShort4 == 1 || readShort4 == 28) {
                byte[] bArr = new byte[readShort5];
                buffer.read(bArr);
                java.net.InetAddress byAddress = java.net.InetAddress.getByAddress(bArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byAddress, "");
                arrayList.add(byAddress);
            } else {
                buffer.skip(readShort5);
            }
        }
        return arrayList;
    }

    private static void getHighSpeedVideoSizes(okio.Buffer p0) throws java.io.EOFException {
        byte readByte = p0.readByte();
        if (readByte < 0) {
            p0.skip(1L);
            return;
        }
        while (readByte > 0) {
            p0.skip(readByte);
            readByte = p0.readByte();
        }
    }
}
