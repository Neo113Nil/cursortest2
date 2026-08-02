package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class SchemaUtil {
    private static final java.lang.Class<?> getHighSpeedVideoSizes = Camera2StreamConfigurationMap();
    private static final androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
    private static final androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> getHighSpeedVideoFpsRangesFor = new androidx.content.preferences.protobuf.UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    public static void getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls) {
        java.lang.Class<?> cls2;
        if (!androidx.content.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls) && !androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges && (cls2 = getHighSpeedVideoSizes) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void getHighSpeedVideoSizes(int i, java.util.List<java.lang.Double> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.Camera2StreamConfigurationMap(i, list, z);
    }

    public static void getInputFormats(int i, java.util.List<java.lang.Float> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getOutputFormats(i, list, z);
    }

    public static void getInputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getInputFormats(i, list, z);
    }

    public static void getOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getOutputSizeshNQ4ISI(i, list, z);
    }

    public static void getOutputMinFrameDurationlomOqCM(int i, java.util.List<java.lang.Long> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getOutputSizes(i, list, z);
    }

    public static void getHighSpeedVideoFpsRanges(int i, java.util.List<java.lang.Long> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getHighResolutionOutputSizeshNQ4ISI(i, list, z);
    }

    public static void getHighSpeedVideoSizesFor(int i, java.util.List<java.lang.Long> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getInputSizeshNQ4ISI(i, list, z);
    }

    public static void getOutputMinFrameDuration(int i, java.util.List<java.lang.Integer> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getOutputMinFrameDuration(i, list, z);
    }

    public static void getOutputSizes(int i, java.util.List<java.lang.Integer> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getOutputMinFrameDurationlomOqCM(i, list, z);
    }

    public static void getOutputStallDuration(int i, java.util.List<java.lang.Integer> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getOutputStallDuration(i, list, z);
    }

    public static void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Integer> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getHighSpeedVideoSizes(i, list, z);
    }

    public static void getOutputFormats(int i, java.util.List<java.lang.Integer> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getHighSpeedVideoSizesFor(i, list, z);
    }

    public static void Camera2StreamConfigurationMap(int i, java.util.List<java.lang.Integer> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getHighSpeedVideoFpsRanges(i, list, z);
    }

    public static void getHighSpeedVideoFpsRangesFor(int i, java.util.List<java.lang.Boolean> list, androidx.content.preferences.protobuf.Writer writer, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getHighSpeedVideoFpsRangesFor(i, list, z);
    }

    public static void Camera2StreamConfigurationMap(int i, java.util.List<java.lang.String> list, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getHighResolutionOutputSizeshNQ4ISI(i, list);
    }

    public static void getHighSpeedVideoSizes(int i, java.util.List<androidx.content.preferences.protobuf.ByteString> list, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.Camera2StreamConfigurationMap(i, list);
    }

    public static void getHighSpeedVideoFpsRangesFor(int i, java.util.List<?> list, androidx.content.preferences.protobuf.Writer writer, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getHighResolutionOutputSizeshNQ4ISI(i, list, schema);
    }

    public static void Camera2StreamConfigurationMap(int i, java.util.List<?> list, androidx.content.preferences.protobuf.Writer writer, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.getHighSpeedVideoSizes(i, list, schema);
    }

    static int getInputSizeshNQ4ISI(java.util.List<java.lang.Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += androidx.content.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i));
            i++;
        }
        return i3;
    }

    static int getOutputFormats(int i, java.util.List<java.lang.Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return getInputSizeshNQ4ISI(list) + (list.size() * androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i));
    }

    static int getHighSpeedVideoSizesFor(java.util.List<java.lang.Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += androidx.content.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i));
            i++;
        }
        return i3;
    }

    static int getOutputMinFrameDurationlomOqCM(int i, java.util.List<java.lang.Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return getHighSpeedVideoSizesFor(list) + (size * androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i));
    }

    static int getOutputMinFrameDuration(java.util.List<java.lang.Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += androidx.content.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i));
            i++;
        }
        return i3;
    }

    static int getInputFormats(int i, java.util.List<java.lang.Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return getOutputMinFrameDuration(list) + (size * androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i));
    }

    static int getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += androidx.content.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i));
            i++;
        }
        return i3;
    }

    static int getHighSpeedVideoFpsRanges(int i, java.util.List<java.lang.Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return getHighResolutionOutputSizeshNQ4ISI(list) + (size * androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i));
    }

    static int getHighSpeedVideoSizes(java.util.List<java.lang.Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += androidx.content.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i));
            i++;
        }
        return i3;
    }

    static int getHighSpeedVideoSizesFor(int i, java.util.List<java.lang.Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return getHighSpeedVideoSizes(list) + (size * androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i));
    }

    static int getOutputFormats(java.util.List<java.lang.Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i));
            i++;
        }
        return i3;
    }

    static int getOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return getOutputFormats(list) + (size * androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i));
    }

    static int getInputFormats(java.util.List<java.lang.Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += androidx.content.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += androidx.content.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i));
            i++;
        }
        return i3;
    }

    static int getInputSizeshNQ4ISI(int i, java.util.List<java.lang.Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return getInputFormats(list) + (size * androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i));
    }

    static int Camera2StreamConfigurationMap(java.util.List<?> list) {
        return list.size() * 4;
    }

    static int getHighSpeedVideoFpsRangesFor(int i, java.util.List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * androidx.content.preferences.protobuf.CodedOutputStream.computeFixed32Size(i, 0);
    }

    static int getHighSpeedVideoFpsRangesFor(java.util.List<?> list) {
        return list.size() * 8;
    }

    static int Camera2StreamConfigurationMap(int i, java.util.List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * androidx.content.preferences.protobuf.CodedOutputStream.computeFixed64Size(i, 0L);
    }

    static int getHighSpeedVideoFpsRanges(java.util.List<?> list) {
        return list.size();
    }

    static int getHighSpeedVideoSizes(int i, java.util.List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * androidx.content.preferences.protobuf.CodedOutputStream.computeBoolSize(i, true);
    }

    static int getOutputMinFrameDuration(int i, java.util.List<?> list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i) * size;
        if (!(list instanceof androidx.content.preferences.protobuf.LazyStringList)) {
            while (i2 < size) {
                java.lang.Object obj = list.get(i2);
                if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
                    computeStringSizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.content.preferences.protobuf.ByteString) obj);
                } else {
                    computeStringSizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) obj);
                }
                computeTagSize += computeStringSizeNoTag;
                i2++;
            }
            return computeTagSize;
        }
        androidx.content.preferences.protobuf.LazyStringList lazyStringList = (androidx.content.preferences.protobuf.LazyStringList) list;
        while (i2 < size) {
            java.lang.Object raw = lazyStringList.getRaw(i2);
            if (raw instanceof androidx.content.preferences.protobuf.ByteString) {
                computeStringSizeNoTag2 = androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.content.preferences.protobuf.ByteString) raw);
            } else {
                computeStringSizeNoTag2 = androidx.content.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) raw);
            }
            computeTagSize += computeStringSizeNoTag2;
            i2++;
        }
        return computeTagSize;
    }

    static int getHighSpeedVideoFpsRangesFor(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) {
        if (obj instanceof androidx.content.preferences.protobuf.LazyFieldLite) {
            return androidx.content.preferences.protobuf.CodedOutputStream.computeLazyFieldSize(i, (androidx.content.preferences.protobuf.LazyFieldLite) obj);
        }
        return androidx.content.preferences.protobuf.CodedOutputStream.getHighSpeedVideoFpsRanges(i, (androidx.content.preferences.protobuf.MessageLite) obj, schema);
    }

    static int getHighSpeedVideoFpsRanges(int i, java.util.List<?> list, androidx.content.preferences.protobuf.Schema schema) {
        int highSpeedVideoFpsRanges;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            if (obj instanceof androidx.content.preferences.protobuf.LazyFieldLite) {
                highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((androidx.content.preferences.protobuf.LazyFieldLite) obj);
            } else {
                highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.CodedOutputStream.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageLite) obj, schema);
            }
            computeTagSize += highSpeedVideoFpsRanges;
        }
        return computeTagSize;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<androidx.content.preferences.protobuf.ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = size * androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            computeTagSize += androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag(list.get(i2));
        }
        return computeTagSize;
    }

    static int getHighSpeedVideoSizes(int i, java.util.List<androidx.content.preferences.protobuf.MessageLite> list, androidx.content.preferences.protobuf.Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += androidx.content.preferences.protobuf.CodedOutputStream.getHighResolutionOutputSizeshNQ4ISI(i, list.get(i3), schema);
        }
        return i2;
    }

    public static androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> getHighSpeedVideoFpsRangesFor() {
        return getHighSpeedVideoFpsRanges;
    }

    public static androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoFpsRangesFor;
    }

    private static androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> getHighSpeedVideoFpsRanges() {
        try {
            java.lang.Class<?> highSpeedVideoSizes = getHighSpeedVideoSizes();
            if (highSpeedVideoSizes == null) {
                return null;
            }
            return (androidx.content.preferences.protobuf.UnknownFieldSchema) highSpeedVideoSizes.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> Camera2StreamConfigurationMap() {
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges) {
            return null;
        }
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> getHighSpeedVideoSizes() {
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges) {
            return null;
        }
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static boolean getHighSpeedVideoSizes(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.MapFieldSchema mapFieldSchema, T t, T t2, long j) {
        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t, j, mapFieldSchema.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j), androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j)));
    }

    static <T, FT extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<FT>> void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ExtensionSchema<FT> extensionSchema, T t, T t2) {
        androidx.content.preferences.protobuf.FieldSet<FT> highResolutionOutputSizeshNQ4ISI = extensionSchema.getHighResolutionOutputSizeshNQ4ISI(t2);
        if (highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            return;
        }
        extensionSchema.getHighSpeedVideoFpsRangesFor(t).Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
    }

    static <T, UT, UB> void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, T t2) {
        unknownFieldSchema.getHighSpeedVideoSizes(t, unknownFieldSchema.Camera2StreamConfigurationMap(unknownFieldSchema.getHighSpeedVideoSizes(t), unknownFieldSchema.getHighSpeedVideoSizes(t2)));
    }

    static <UT, UB> UB Camera2StreamConfigurationMap(java.lang.Object obj, int i, java.util.List<java.lang.Integer> list, androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumLiteMap, UB ub, androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (enumLiteMap.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, java.lang.Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    if (ub == null) {
                        ub = unknownFieldSchema.getHighSpeedVideoFpsRangesFor(obj);
                    }
                    unknownFieldSchema.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB>) ub, i, intValue);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return ub;
        }
        java.util.Iterator<java.lang.Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (enumLiteMap.findValueByNumber(intValue2) == null) {
                if (ub == null) {
                    ub = unknownFieldSchema.getHighSpeedVideoFpsRangesFor(obj);
                }
                unknownFieldSchema.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB>) ub, i, intValue2);
                it.remove();
            }
        }
        return ub;
    }

    static <UT, UB> UB getHighSpeedVideoFpsRanges(java.lang.Object obj, int i, java.util.List<java.lang.Integer> list, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier, UB ub, androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, java.lang.Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    if (ub == null) {
                        ub = unknownFieldSchema.getHighSpeedVideoFpsRangesFor(obj);
                    }
                    unknownFieldSchema.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB>) ub, i, intValue);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return ub;
        }
        java.util.Iterator<java.lang.Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (!enumVerifier.isInRange(intValue2)) {
                if (ub == null) {
                    ub = unknownFieldSchema.getHighSpeedVideoFpsRangesFor(obj);
                }
                unknownFieldSchema.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB>) ub, i, intValue2);
                it.remove();
            }
        }
        return ub;
    }

    static <UT, UB> UB Camera2StreamConfigurationMap(java.lang.Object obj, int i, int i2, UB ub, androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.getHighSpeedVideoFpsRangesFor(obj);
        }
        unknownFieldSchema.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB>) ub, i, i2);
        return ub;
    }
}
