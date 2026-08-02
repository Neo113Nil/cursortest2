package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class CodedOutputStreamWriter implements androidx.content.preferences.protobuf.Writer {
    private final androidx.content.preferences.protobuf.CodedOutputStream getHighSpeedVideoSizes;

    public static androidx.content.preferences.protobuf.CodedOutputStreamWriter getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) {
        if (codedOutputStream.getHighSpeedVideoFpsRanges != null) {
            return codedOutputStream.getHighSpeedVideoFpsRanges;
        }
        return new androidx.content.preferences.protobuf.CodedOutputStreamWriter(codedOutputStream);
    }

    private CodedOutputStreamWriter(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) {
        androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream2 = (androidx.content.preferences.protobuf.CodedOutputStream) androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(codedOutputStream, "output");
        this.getHighSpeedVideoSizes = codedOutputStream2;
        codedOutputStream2.getHighSpeedVideoFpsRanges = this;
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final androidx.datastore.preferences.protobuf.Writer.FieldOrder getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.datastore.preferences.protobuf.Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizes(int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeSFixed32(i, i2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, long j) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeInt64(i, j);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRanges(int i, long j) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeSFixed64(i, j);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizes(int i, float f) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeFloat(i, f);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRangesFor(int i, double d) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeDouble(i, d);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeEnum(i, i2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizes(int i, long j) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeUInt64(i, j);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void Camera2StreamConfigurationMap(int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeInt32(i, i2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void Camera2StreamConfigurationMap(int i, long j) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeFixed64(i, j);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRangesFor(int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeFixed32(i, i2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void Camera2StreamConfigurationMap(int i, boolean z) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeBool(i, z);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRanges(int i, java.lang.String str) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeString(i, str);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRanges(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeBytes(i, byteString);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputFormats(int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeUInt32(i, i2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputMinFrameDuration(int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeSInt32(i, i2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRangesFor(int i, long j) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeSInt64(i, j);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeMessage(i, (androidx.content.preferences.protobuf.MessageLite) obj);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(i, (androidx.content.preferences.protobuf.MessageLite) obj, schema);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizes(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
        androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream = this.getHighSpeedVideoSizes;
        codedOutputStream.writeTag(i, 3);
        schema.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.MessageLite) obj, codedOutputStream.getHighSpeedVideoFpsRanges);
        codedOutputStream.writeTag(i, 4);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    @java.lang.Deprecated
    public final void getInputFormats(int i) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeTag(i, 3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    @java.lang.Deprecated
    public final void getOutputMinFrameDuration(int i) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeTag(i, 4);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRangesFor(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
            this.getHighSpeedVideoSizes.writeRawMessageSetExtension(i, (androidx.content.preferences.protobuf.ByteString) obj);
        } else {
            this.getHighSpeedVideoSizes.writeMessageSetExtension(i, (androidx.content.preferences.protobuf.MessageLite) obj);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputMinFrameDuration(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(list.get(i4).intValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeInt32NoTag(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeInt32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < intArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < intArrayList.size()) {
                this.getHighSpeedVideoSizes.writeInt32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.getHighSpeedVideoSizes.writeInt32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizes(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeFixed32SizeNoTag(list.get(i4).intValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeFixed32NoTag(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeFixed32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < intArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeFixed32SizeNoTag(intArrayList.getInt(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < intArrayList.size()) {
                this.getHighSpeedVideoSizes.writeFixed32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.getHighSpeedVideoSizes.writeFixed32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getInputFormats(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(list.get(i4).longValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeInt64NoTag(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeInt64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < longArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < longArrayList.size()) {
                this.getHighSpeedVideoSizes.writeInt64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.getHighSpeedVideoSizes.writeInt64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(list.get(i4).longValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeUInt64NoTag(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeUInt64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < longArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < longArrayList.size()) {
                this.getHighSpeedVideoSizes.writeUInt64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.getHighSpeedVideoSizes.writeUInt64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeFixed64SizeNoTag(list.get(i4).longValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeFixed64NoTag(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeFixed64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < longArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeFixed64SizeNoTag(longArrayList.getLong(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < longArrayList.size()) {
                this.getHighSpeedVideoSizes.writeFixed64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.getHighSpeedVideoSizes.writeFixed64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputFormats(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.FloatArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeFloatSizeNoTag(list.get(i4).floatValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeFloatNoTag(list.get(i2).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeFloat(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.FloatArrayList floatArrayList = (androidx.content.preferences.protobuf.FloatArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < floatArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeFloatSizeNoTag(floatArrayList.getFloat(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < floatArrayList.size()) {
                this.getHighSpeedVideoSizes.writeFloatNoTag(floatArrayList.getFloat(i2));
                i2++;
            }
            return;
        }
        while (i2 < floatArrayList.size()) {
            this.getHighSpeedVideoSizes.writeFloat(i, floatArrayList.getFloat(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void Camera2StreamConfigurationMap(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.DoubleArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeDoubleSizeNoTag(list.get(i4).doubleValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeDoubleNoTag(list.get(i2).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeDouble(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.content.preferences.protobuf.DoubleArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < doubleArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeDoubleSizeNoTag(doubleArrayList.getDouble(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < doubleArrayList.size()) {
                this.getHighSpeedVideoSizes.writeDoubleNoTag(doubleArrayList.getDouble(i2));
                i2++;
            }
            return;
        }
        while (i2 < doubleArrayList.size()) {
            this.getHighSpeedVideoSizes.writeDouble(i, doubleArrayList.getDouble(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRanges(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(list.get(i4).intValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeEnumNoTag(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeEnum(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < intArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < intArrayList.size()) {
                this.getHighSpeedVideoSizes.writeEnumNoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.getHighSpeedVideoSizes.writeEnum(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRangesFor(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.BooleanArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeBoolSizeNoTag(list.get(i4).booleanValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeBoolNoTag(list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeBool(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.content.preferences.protobuf.BooleanArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < booleanArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeBoolSizeNoTag(booleanArrayList.getBoolean(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < booleanArrayList.size()) {
                this.getHighSpeedVideoSizes.writeBoolNoTag(booleanArrayList.getBoolean(i2));
                i2++;
            }
            return;
        }
        while (i2 < booleanArrayList.size()) {
            this.getHighSpeedVideoSizes.writeBool(i, booleanArrayList.getBoolean(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        int i2 = 0;
        if (list instanceof androidx.content.preferences.protobuf.LazyStringList) {
            androidx.content.preferences.protobuf.LazyStringList lazyStringList = (androidx.content.preferences.protobuf.LazyStringList) list;
            while (i2 < list.size()) {
                java.lang.Object raw = lazyStringList.getRaw(i2);
                if (raw instanceof java.lang.String) {
                    this.getHighSpeedVideoSizes.writeString(i, (java.lang.String) raw);
                } else {
                    this.getHighSpeedVideoSizes.writeBytes(i, (androidx.content.preferences.protobuf.ByteString) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.getHighSpeedVideoSizes.writeString(i, list.get(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void Camera2StreamConfigurationMap(int i, java.util.List<androidx.content.preferences.protobuf.ByteString> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.getHighSpeedVideoSizes.writeBytes(i, list.get(i2));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputMinFrameDurationlomOqCM(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(list.get(i4).intValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeUInt32NoTag(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeUInt32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < intArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < intArrayList.size()) {
                this.getHighSpeedVideoSizes.writeUInt32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.getHighSpeedVideoSizes.writeUInt32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizesFor(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(list.get(i4).intValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeSFixed32NoTag(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeSFixed32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < intArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(intArrayList.getInt(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < intArrayList.size()) {
                this.getHighSpeedVideoSizes.writeSFixed32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.getHighSpeedVideoSizes.writeSFixed32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getInputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(list.get(i4).longValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeSFixed64NoTag(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeSFixed64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < longArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(longArrayList.getLong(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < longArrayList.size()) {
                this.getHighSpeedVideoSizes.writeSFixed64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.getHighSpeedVideoSizes.writeSFixed64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputStallDuration(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(list.get(i4).intValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeSInt32NoTag(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeSInt32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < intArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < intArrayList.size()) {
                this.getHighSpeedVideoSizes.writeSInt32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.getHighSpeedVideoSizes.writeSInt32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputSizes(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            if (z) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(list.get(i4).longValue());
                }
                this.getHighSpeedVideoSizes.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    this.getHighSpeedVideoSizes.writeSInt64NoTag(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.getHighSpeedVideoSizes.writeSInt64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        if (z) {
            this.getHighSpeedVideoSizes.writeTag(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < longArrayList.size(); i6++) {
                i5 += androidx.content.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i6));
            }
            this.getHighSpeedVideoSizes.writeUInt32NoTag(i5);
            while (i2 < longArrayList.size()) {
                this.getHighSpeedVideoSizes.writeSInt64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.getHighSpeedVideoSizes.writeSInt64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<?> list, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(i, (androidx.content.preferences.protobuf.MessageLite) list.get(i2), schema);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizes(int i, java.util.List<?> list, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            getHighSpeedVideoSizes(i, list.get(i2), schema);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final <K, V> void Camera2StreamConfigurationMap(int i, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        if (!this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor) {
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                this.getHighSpeedVideoSizes.writeTag(i, 2);
                this.getHighSpeedVideoSizes.writeUInt32NoTag(androidx.content.preferences.protobuf.MapEntryLite.getHighResolutionOutputSizeshNQ4ISI(metadata, entry.getKey(), entry.getValue()));
                androidx.content.preferences.protobuf.MapEntryLite.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, metadata, entry.getKey(), entry.getValue());
            }
            return;
        }
        int i2 = 0;
        switch (androidx.content.preferences.protobuf.CodedOutputStreamWriter.AnonymousClass1.Camera2StreamConfigurationMap[metadata.getHighSpeedVideoFpsRanges.ordinal()]) {
            case 1:
                V v = map.get(java.lang.Boolean.FALSE);
                if (v != null) {
                    getHighSpeedVideoFpsRanges(i, false, v, metadata);
                }
                V v2 = map.get(java.lang.Boolean.TRUE);
                if (v2 != null) {
                    getHighSpeedVideoFpsRanges(i, true, v2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                int size = map.size();
                int[] iArr = new int[size];
                java.util.Iterator<K> it = map.keySet().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    iArr[i3] = ((java.lang.Integer) it.next()).intValue();
                    i3++;
                }
                java.util.Arrays.sort(iArr);
                while (i2 < size) {
                    int i4 = iArr[i2];
                    V v3 = map.get(java.lang.Integer.valueOf(i4));
                    this.getHighSpeedVideoSizes.writeTag(i, 2);
                    this.getHighSpeedVideoSizes.writeUInt32NoTag(androidx.content.preferences.protobuf.MapEntryLite.getHighResolutionOutputSizeshNQ4ISI(metadata, java.lang.Integer.valueOf(i4), v3));
                    androidx.content.preferences.protobuf.MapEntryLite.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, metadata, java.lang.Integer.valueOf(i4), v3);
                    i2++;
                }
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                int size2 = map.size();
                long[] jArr = new long[size2];
                java.util.Iterator<K> it2 = map.keySet().iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    jArr[i5] = ((java.lang.Long) it2.next()).longValue();
                    i5++;
                }
                java.util.Arrays.sort(jArr);
                while (i2 < size2) {
                    long j = jArr[i2];
                    V v4 = map.get(java.lang.Long.valueOf(j));
                    this.getHighSpeedVideoSizes.writeTag(i, 2);
                    this.getHighSpeedVideoSizes.writeUInt32NoTag(androidx.content.preferences.protobuf.MapEntryLite.getHighResolutionOutputSizeshNQ4ISI(metadata, java.lang.Long.valueOf(j), v4));
                    androidx.content.preferences.protobuf.MapEntryLite.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, metadata, java.lang.Long.valueOf(j), v4);
                    i2++;
                }
                return;
            case 12:
                int size3 = map.size();
                java.lang.String[] strArr = new java.lang.String[size3];
                java.util.Iterator<K> it3 = map.keySet().iterator();
                int i6 = 0;
                while (it3.hasNext()) {
                    strArr[i6] = (java.lang.String) it3.next();
                    i6++;
                }
                java.util.Arrays.sort(strArr);
                while (i2 < size3) {
                    java.lang.String str = strArr[i2];
                    V v5 = map.get(str);
                    this.getHighSpeedVideoSizes.writeTag(i, 2);
                    this.getHighSpeedVideoSizes.writeUInt32NoTag(androidx.content.preferences.protobuf.MapEntryLite.getHighResolutionOutputSizeshNQ4ISI(metadata, str, v5));
                    androidx.content.preferences.protobuf.MapEntryLite.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, metadata, str, v5);
                    i2++;
                }
                return;
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("does not support key type: ");
                sb.append(metadata.getHighSpeedVideoFpsRanges);
                throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private <V> void getHighSpeedVideoFpsRanges(int i, boolean z, V v, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<java.lang.Boolean, V> metadata) throws java.io.IOException {
        this.getHighSpeedVideoSizes.writeTag(i, 2);
        this.getHighSpeedVideoSizes.writeUInt32NoTag(androidx.content.preferences.protobuf.MapEntryLite.getHighResolutionOutputSizeshNQ4ISI(metadata, java.lang.Boolean.valueOf(z), v));
        androidx.content.preferences.protobuf.MapEntryLite.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, metadata, java.lang.Boolean.valueOf(z), v);
    }
}
