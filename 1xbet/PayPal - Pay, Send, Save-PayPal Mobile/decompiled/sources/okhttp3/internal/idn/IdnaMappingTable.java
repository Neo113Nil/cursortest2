package okhttp3.internal.idn;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Lokhttp3/internal/idn/IdnaMappingTable;", "", "", "sections", "ranges", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "codePoint", "Lokio/BufferedSink;", "sink", "", "map", "(ILokio/BufferedSink;)Z", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "getRanges", "getMappings"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdnaMappingTable {
    private final java.lang.String mappings;
    private final java.lang.String ranges;
    private final java.lang.String sections;

    public IdnaMappingTable(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.sections = str;
        this.ranges = str2;
        this.mappings = str3;
    }

    public final java.lang.String getSections() {
        return this.sections;
    }

    public final java.lang.String getRanges() {
        return this.ranges;
    }

    public final java.lang.String getMappings() {
        return this.mappings;
    }

    public final boolean map(int codePoint, okio.BufferedSink sink) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        int length = (this.sections.length() / 4) - 1;
        int i3 = 0;
        while (true) {
            if (i3 > length) {
                i = (-i3) - 1;
                break;
            }
            i = (i3 + length) / 2;
            int compare = kotlin.jvm.internal.Intrinsics.compare((2097024 & codePoint) >> 7, okhttp3.internal.idn.IdnaMappingTableKt.read14BitInt(this.sections, i * 4));
            if (compare >= 0) {
                if (compare <= 0) {
                    break;
                }
                i3 = i + 1;
            } else {
                length = i - 1;
            }
        }
        int i4 = i >= 0 ? i * 4 : ((-i) - 2) * 4;
        int read14BitInt = okhttp3.internal.idn.IdnaMappingTableKt.read14BitInt(this.sections, i4 + 2);
        int read14BitInt2 = (i4 + 4 < this.sections.length() ? okhttp3.internal.idn.IdnaMappingTableKt.read14BitInt(this.sections, i4 + 6) : this.ranges.length() / 4) - 1;
        while (true) {
            if (read14BitInt > read14BitInt2) {
                i2 = (-read14BitInt) - 1;
                break;
            }
            i2 = (read14BitInt + read14BitInt2) / 2;
            int compare2 = kotlin.jvm.internal.Intrinsics.compare(codePoint & 127, (int) this.ranges.charAt(i2 * 4));
            if (compare2 >= 0) {
                if (compare2 <= 0) {
                    break;
                }
                read14BitInt = i2 + 1;
            } else {
                read14BitInt2 = i2 - 1;
            }
        }
        int i5 = i2 >= 0 ? i2 * 4 : ((-i2) - 2) * 4;
        char charAt = this.ranges.charAt(i5 + 1);
        if (charAt >= 0 && charAt < '@') {
            int read14BitInt3 = okhttp3.internal.idn.IdnaMappingTableKt.read14BitInt(this.ranges, i5 + 2);
            sink.writeUtf8(this.mappings, read14BitInt3, charAt + read14BitInt3);
        } else if ('@' <= charAt && charAt < 'P') {
            sink.writeUtf8CodePoint(codePoint - ((((charAt & 15) << 14) | (this.ranges.charAt(i5 + 2) << 7)) | this.ranges.charAt(i5 + 3)));
        } else if ('P' <= charAt && charAt < '`') {
            sink.writeUtf8CodePoint(codePoint + (((charAt & 15) << 14) | (this.ranges.charAt(i5 + 2) << 7) | this.ranges.charAt(i5 + 3)));
        } else if (charAt == 'w') {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } else if (charAt == 'x') {
            sink.writeUtf8CodePoint(codePoint);
        } else {
            if (charAt == 'y') {
                sink.writeUtf8CodePoint(codePoint);
                return false;
            }
            if (charAt == 'z') {
                sink.writeByte(this.ranges.charAt(i5 + 2));
            } else if (charAt == '{') {
                sink.writeByte(this.ranges.charAt(i5 + 2) | 128);
            } else if (charAt == '|') {
                sink.writeByte(this.ranges.charAt(i5 + 2));
                sink.writeByte(this.ranges.charAt(i5 + 3));
            } else if (charAt == '}') {
                sink.writeByte(this.ranges.charAt(i5 + 2) | 128);
                sink.writeByte(this.ranges.charAt(i5 + 3));
            } else if (charAt == '~') {
                sink.writeByte(this.ranges.charAt(i5 + 2));
                sink.writeByte(this.ranges.charAt(i5 + 3) | 128);
            } else if (charAt == 127) {
                sink.writeByte(this.ranges.charAt(i5 + 2) | 128);
                sink.writeByte(this.ranges.charAt(i5 + 3) | 128);
            } else {
                throw new java.lang.IllegalStateException("unexpected rangesIndex for ".concat(java.lang.String.valueOf(codePoint)).toString());
            }
        }
        return true;
    }
}
