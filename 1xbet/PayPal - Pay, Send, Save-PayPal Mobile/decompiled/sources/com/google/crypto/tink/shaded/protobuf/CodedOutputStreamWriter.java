package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class CodedOutputStreamWriter implements com.google.crypto.tink.shaded.protobuf.Writer {
    private final com.google.crypto.tink.shaded.protobuf.CodedOutputStream output;

    public static com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter forCodedOutput(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream) {
        if (codedOutputStream.wrapper != null) {
            return codedOutputStream.wrapper;
        }
        return new com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter(codedOutputStream);
    }

    private CodedOutputStreamWriter(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream) {
        com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream2 = (com.google.crypto.tink.shaded.protobuf.CodedOutputStream) com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(codedOutputStream, "output");
        this.output = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder fieldOrder() {
        return com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.ASCENDING;
    }

    public final int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32(int i, int i2) throws java.io.IOException {
        this.output.writeSFixed32(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64(int i, long j) throws java.io.IOException {
        this.output.writeInt64(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64(int i, long j) throws java.io.IOException {
        this.output.writeSFixed64(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloat(int i, float f) throws java.io.IOException {
        this.output.writeFloat(i, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDouble(int i, double d) throws java.io.IOException {
        this.output.writeDouble(i, d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnum(int i, int i2) throws java.io.IOException {
        this.output.writeEnum(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt64(int i, long j) throws java.io.IOException {
        this.output.writeUInt64(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt32(int i, int i2) throws java.io.IOException {
        this.output.writeInt32(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed64(int i, long j) throws java.io.IOException {
        this.output.writeFixed64(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed32(int i, int i2) throws java.io.IOException {
        this.output.writeFixed32(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBool(int i, boolean z) throws java.io.IOException {
        this.output.writeBool(i, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeString(int i, java.lang.String str) throws java.io.IOException {
        this.output.writeString(i, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBytes(int i, com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.io.IOException {
        this.output.writeBytes(i, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt32(int i, int i2) throws java.io.IOException {
        this.output.writeUInt32(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt32(int i, int i2) throws java.io.IOException {
        this.output.writeSInt32(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt64(int i, long j) throws java.io.IOException {
        this.output.writeSInt64(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessage(int i, java.lang.Object obj) throws java.io.IOException {
        this.output.writeMessage(i, (com.google.crypto.tink.shaded.protobuf.MessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessage(int i, java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.Schema schema) throws java.io.IOException {
        this.output.writeMessage(i, (com.google.crypto.tink.shaded.protobuf.MessageLite) obj, schema);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroup(int i, java.lang.Object obj) throws java.io.IOException {
        this.output.writeGroup(i, (com.google.crypto.tink.shaded.protobuf.MessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeGroup(int i, java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.Schema schema) throws java.io.IOException {
        this.output.writeGroup(i, (com.google.crypto.tink.shaded.protobuf.MessageLite) obj, schema);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public final void writeStartGroup(int i) throws java.io.IOException {
        this.output.writeTag(i, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public final void writeEndGroup(int i) throws java.io.IOException {
        this.output.writeTag(i, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
            this.output.writeRawMessageSetExtension(i, (com.google.crypto.tink.shaded.protobuf.ByteString) obj);
        } else {
            this.output.writeMessageSetExtension(i, (com.google.crypto.tink.shaded.protobuf.MessageLite) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            writeInt32ListInternal(i, (com.google.crypto.tink.shaded.protobuf.IntArrayList) list, z);
        } else {
            writeInt32ListInternal(i, list, z);
        }
    }

    private void writeInt32ListInternal(int i, com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < intArrayList.size()) {
                this.output.writeInt32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.output.writeInt32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    private void writeInt32ListInternal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeInt32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeInt32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            writeFixed32ListInternal(i, (com.google.crypto.tink.shaded.protobuf.IntArrayList) list, z);
        } else {
            writeFixed32ListInternal(i, list, z);
        }
    }

    private void writeFixed32ListInternal(int i, com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32SizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < intArrayList.size()) {
                this.output.writeFixed32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.output.writeFixed32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    private void writeFixed32ListInternal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeFixed32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeFixed32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            writeInt64ListInternal(i, (com.google.crypto.tink.shaded.protobuf.LongArrayList) list, z);
        } else {
            writeInt64ListInternal(i, list, z);
        }
    }

    private void writeInt64ListInternal(int i, com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < longArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < longArrayList.size()) {
                this.output.writeInt64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.output.writeInt64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    private void writeInt64ListInternal(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeInt64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeInt64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            writeUInt64ListInternal(i, (com.google.crypto.tink.shaded.protobuf.LongArrayList) list, z);
        } else {
            writeUInt64ListInternal(i, list, z);
        }
    }

    private void writeUInt64ListInternal(int i, com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < longArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < longArrayList.size()) {
                this.output.writeUInt64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.output.writeUInt64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    private void writeUInt64ListInternal(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeUInt64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeUInt64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            writeFixed64ListInternal(i, (com.google.crypto.tink.shaded.protobuf.LongArrayList) list, z);
        } else {
            writeFixed64ListInternal(i, list, z);
        }
    }

    private void writeFixed64ListInternal(int i, com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < longArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64SizeNoTag(longArrayList.getLong(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < longArrayList.size()) {
                this.output.writeFixed64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.output.writeFixed64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    private void writeFixed64ListInternal(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeFixed64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeFixed64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloatList(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.FloatArrayList) {
            writeFloatListInternal(i, (com.google.crypto.tink.shaded.protobuf.FloatArrayList) list, z);
        } else {
            writeFloatListInternal(i, list, z);
        }
    }

    private void writeFloatListInternal(int i, com.google.crypto.tink.shaded.protobuf.FloatArrayList floatArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < floatArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSizeNoTag(floatArrayList.getFloat(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < floatArrayList.size()) {
                this.output.writeFloatNoTag(floatArrayList.getFloat(i2));
                i2++;
            }
            return;
        }
        while (i2 < floatArrayList.size()) {
            this.output.writeFloat(i, floatArrayList.getFloat(i2));
            i2++;
        }
    }

    private void writeFloatListInternal(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSizeNoTag(list.get(i4).floatValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeFloatNoTag(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeFloat(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDoubleList(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.DoubleArrayList) {
            writeDoubleListInternal(i, (com.google.crypto.tink.shaded.protobuf.DoubleArrayList) list, z);
        } else {
            writeDoubleListInternal(i, list, z);
        }
    }

    private void writeDoubleListInternal(int i, com.google.crypto.tink.shaded.protobuf.DoubleArrayList doubleArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < doubleArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSizeNoTag(doubleArrayList.getDouble(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < doubleArrayList.size()) {
                this.output.writeDoubleNoTag(doubleArrayList.getDouble(i2));
                i2++;
            }
            return;
        }
        while (i2 < doubleArrayList.size()) {
            this.output.writeDouble(i, doubleArrayList.getDouble(i2));
            i2++;
        }
    }

    private void writeDoubleListInternal(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSizeNoTag(list.get(i4).doubleValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeDoubleNoTag(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeDouble(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnumList(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            writeEnumListInternal(i, (com.google.crypto.tink.shaded.protobuf.IntArrayList) list, z);
        } else {
            writeEnumListInternal(i, list, z);
        }
    }

    private void writeEnumListInternal(int i, com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < intArrayList.size()) {
                this.output.writeEnumNoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.output.writeEnum(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    private void writeEnumListInternal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeEnumNoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeEnum(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBoolList(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.BooleanArrayList) {
            writeBoolListInternal(i, (com.google.crypto.tink.shaded.protobuf.BooleanArrayList) list, z);
        } else {
            writeBoolListInternal(i, list, z);
        }
    }

    private void writeBoolListInternal(int i, com.google.crypto.tink.shaded.protobuf.BooleanArrayList booleanArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < booleanArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSizeNoTag(booleanArrayList.getBoolean(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < booleanArrayList.size()) {
                this.output.writeBoolNoTag(booleanArrayList.getBoolean(i2));
                i2++;
            }
            return;
        }
        while (i2 < booleanArrayList.size()) {
            this.output.writeBool(i, booleanArrayList.getBoolean(i2));
            i2++;
        }
    }

    private void writeBoolListInternal(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSizeNoTag(list.get(i4).booleanValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeBoolNoTag(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeBool(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeStringList(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        int i2 = 0;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList) {
            com.google.crypto.tink.shaded.protobuf.LazyStringList lazyStringList = (com.google.crypto.tink.shaded.protobuf.LazyStringList) list;
            while (i2 < list.size()) {
                writeLazyString(i, lazyStringList.getRaw(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeString(i, list.get(i2));
            i2++;
        }
    }

    private void writeLazyString(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            this.output.writeString(i, (java.lang.String) obj);
        } else {
            this.output.writeBytes(i, (com.google.crypto.tink.shaded.protobuf.ByteString) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBytesList(int i, java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.output.writeBytes(i, list.get(i2));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            writeUInt32ListInternal(i, (com.google.crypto.tink.shaded.protobuf.IntArrayList) list, z);
        } else {
            writeUInt32ListInternal(i, list, z);
        }
    }

    private void writeUInt32ListInternal(int i, com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < intArrayList.size()) {
                this.output.writeUInt32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.output.writeUInt32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    public final void writeUInt32ListInternal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeUInt32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeUInt32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            writeSFixed32ListInternal(i, (com.google.crypto.tink.shaded.protobuf.IntArrayList) list, z);
        } else {
            writeSFixed32ListInternal(i, list, z);
        }
    }

    private void writeSFixed32ListInternal(int i, com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < intArrayList.size()) {
                this.output.writeSFixed32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.output.writeSFixed32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    private void writeSFixed32ListInternal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeSFixed32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSFixed32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            writeSFixed64ListInternal(i, (com.google.crypto.tink.shaded.protobuf.LongArrayList) list, z);
        } else {
            writeSFixed64ListInternal(i, list, z);
        }
    }

    private void writeSFixed64ListInternal(int i, com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < longArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(longArrayList.getLong(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < longArrayList.size()) {
                this.output.writeSFixed64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.output.writeSFixed64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    private void writeSFixed64ListInternal(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeSFixed64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSFixed64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            writeSInt32ListInternal(i, (com.google.crypto.tink.shaded.protobuf.IntArrayList) list, z);
        } else {
            writeSInt32ListInternal(i, list, z);
        }
    }

    private void writeSInt32ListInternal(int i, com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < intArrayList.size()) {
                this.output.writeSInt32NoTag(intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        while (i2 < intArrayList.size()) {
            this.output.writeSInt32(i, intArrayList.getInt(i2));
            i2++;
        }
    }

    public final void writeSInt32ListInternal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeSInt32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSInt32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            writeSInt64ListInternal(i, (com.google.crypto.tink.shaded.protobuf.LongArrayList) list, z);
        } else {
            writeSInt64ListInternal(i, list, z);
        }
    }

    private void writeSInt64ListInternal(int i, com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < longArrayList.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i4));
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < longArrayList.size()) {
                this.output.writeSInt64NoTag(longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        while (i2 < longArrayList.size()) {
            this.output.writeSInt64(i, longArrayList.getLong(i2));
            i2++;
        }
    }

    private void writeSInt64ListInternal(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeSInt64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSInt64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int i, java.util.List<?> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeMessage(i, list.get(i2));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int i, java.util.List<?> list, com.google.crypto.tink.shaded.protobuf.Schema schema) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeMessage(i, list.get(i2), schema);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroupList(int i, java.util.List<?> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeGroup(i, list.get(i2));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeGroupList(int i, java.util.List<?> list, com.google.crypto.tink.shaded.protobuf.Schema schema) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeGroup(i, list.get(i2), schema);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final <K, V> void writeMap(int i, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i, metadata, map);
            return;
        }
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private <K, V> void writeDeterministicMap(int i, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        switch (com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v = map.get(java.lang.Boolean.FALSE);
                if (v != null) {
                    writeDeterministicBooleanMapEntry(i, false, v, metadata);
                }
                V v2 = map.get(java.lang.Boolean.TRUE);
                if (v2 != null) {
                    writeDeterministicBooleanMapEntry(i, true, v2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(i, metadata, map);
                return;
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("does not support key type: ");
                sb.append(metadata.keyType);
                throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int i, boolean z, V v, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.Boolean, V> metadata) throws java.io.IOException {
        this.output.writeTag(i, 2);
        this.output.writeUInt32NoTag(com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Boolean.valueOf(z), v));
        com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Boolean.valueOf(z), v);
    }

    private <V> void writeDeterministicIntegerMap(int i, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.Integer, V> metadata, java.util.Map<java.lang.Integer, V> map) throws java.io.IOException {
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator<java.lang.Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        java.util.Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(java.lang.Integer.valueOf(i4));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Integer.valueOf(i4), v));
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Integer.valueOf(i4), v);
        }
    }

    private <V> void writeDeterministicLongMap(int i, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.Long, V> metadata, java.util.Map<java.lang.Long, V> map) throws java.io.IOException {
        int size = map.size();
        long[] jArr = new long[size];
        java.util.Iterator<java.lang.Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        java.util.Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(java.lang.Long.valueOf(j));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Long.valueOf(j), v));
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Long.valueOf(j), v);
        }
    }

    private <V> void writeDeterministicStringMap(int i, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.String, V> metadata, java.util.Map<java.lang.String, V> map) throws java.io.IOException {
        int size = map.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        java.util.Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.String str = strArr[i3];
            V v = map.get(str);
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(metadata, str, v));
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(this.output, metadata, str, v);
        }
    }
}
