package androidx.profileinstaller;

/* loaded from: classes2.dex */
class ProfileTranscoder {
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    static final byte[] MAGIC_PROF = {112, 114, 111, 0};
    static final byte[] MAGIC_PROFM = {112, 114, 109, 0};
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    private static int roundUpToByte(int i) {
        return (i + 7) & (-8);
    }

    private ProfileTranscoder() {
    }

    static byte[] readHeader(java.io.InputStream inputStream, byte[] bArr) throws java.io.IOException {
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.Encoding.read(inputStream, bArr.length))) {
            throw androidx.profileinstaller.Encoding.error("Invalid magic");
        }
        return androidx.profileinstaller.Encoding.read(inputStream, androidx.profileinstaller.ProfileVersion.V010_P.length);
    }

    static void writeHeader(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        outputStream.write(MAGIC_PROF);
        outputStream.write(bArr);
    }

    static boolean transcodeAndWriteBody(java.io.OutputStream outputStream, byte[] bArr, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.V015_S)) {
            writeProfileForS(outputStream, dexProfileDataArr);
            return true;
        }
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.V010_P)) {
            writeProfileForP(outputStream, dexProfileDataArr);
            return true;
        }
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.V005_O)) {
            writeProfileForO(outputStream, dexProfileDataArr);
            return true;
        }
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.V009_O_MR1)) {
            writeProfileForO_MR1(outputStream, dexProfileDataArr);
            return true;
        }
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.V001_N)) {
            return false;
        }
        writeProfileForN(outputStream, dexProfileDataArr);
        return true;
    }

    private static void writeProfileForN(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        androidx.profileinstaller.Encoding.writeUInt16(outputStream, dexProfileDataArr.length);
        for (androidx.profileinstaller.DexProfileData dexProfileData : dexProfileDataArr) {
            java.lang.String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, androidx.profileinstaller.ProfileVersion.V001_N);
            androidx.profileinstaller.Encoding.writeUInt16(outputStream, androidx.profileinstaller.Encoding.utf8Length(generateDexKey));
            androidx.profileinstaller.Encoding.writeUInt16(outputStream, dexProfileData.methods.size());
            androidx.profileinstaller.Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            androidx.profileinstaller.Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            androidx.profileinstaller.Encoding.writeString(outputStream, generateDexKey);
            java.util.Iterator<java.lang.Integer> it = dexProfileData.methods.keySet().iterator();
            while (it.hasNext()) {
                androidx.profileinstaller.Encoding.writeUInt16(outputStream, it.next().intValue());
            }
            for (int i : dexProfileData.classes) {
                androidx.profileinstaller.Encoding.writeUInt16(outputStream, i);
            }
        }
    }

    private static void writeProfileForS(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        writeProfileSections(outputStream, dexProfileDataArr);
    }

    private static void writeProfileSections(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        int length;
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        arrayList.add(writeDexFileSection(dexProfileDataArr));
        arrayList.add(createCompressibleClassSection(dexProfileDataArr));
        arrayList.add(createCompressibleMethodsSection(dexProfileDataArr));
        long length2 = androidx.profileinstaller.ProfileVersion.V015_S.length + MAGIC_PROF.length + 4 + (arrayList.size() * 16);
        androidx.profileinstaller.Encoding.writeUInt32(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            androidx.profileinstaller.WritableFileSection writableFileSection = (androidx.profileinstaller.WritableFileSection) arrayList.get(i);
            androidx.profileinstaller.Encoding.writeUInt32(outputStream, writableFileSection.mType.getValue());
            androidx.profileinstaller.Encoding.writeUInt32(outputStream, length2);
            if (writableFileSection.mNeedsCompression) {
                long length3 = writableFileSection.mContents.length;
                byte[] compress = androidx.profileinstaller.Encoding.compress(writableFileSection.mContents);
                arrayList2.add(compress);
                androidx.profileinstaller.Encoding.writeUInt32(outputStream, compress.length);
                androidx.profileinstaller.Encoding.writeUInt32(outputStream, length3);
                length = compress.length;
            } else {
                arrayList2.add(writableFileSection.mContents);
                androidx.profileinstaller.Encoding.writeUInt32(outputStream, writableFileSection.mContents.length);
                androidx.profileinstaller.Encoding.writeUInt32(outputStream, 0L);
                length = writableFileSection.mContents.length;
            }
            length2 += length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    private static androidx.profileinstaller.WritableFileSection writeDexFileSection(androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            androidx.profileinstaller.Encoding.writeUInt16(byteArrayOutputStream, dexProfileDataArr.length);
            int i = 2;
            for (androidx.profileinstaller.DexProfileData dexProfileData : dexProfileDataArr) {
                androidx.profileinstaller.Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.dexChecksum);
                androidx.profileinstaller.Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.mTypeIdCount);
                androidx.profileinstaller.Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.numMethodIds);
                java.lang.String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, androidx.profileinstaller.ProfileVersion.V015_S);
                int utf8Length = androidx.profileinstaller.Encoding.utf8Length(generateDexKey);
                androidx.profileinstaller.Encoding.writeUInt16(byteArrayOutputStream, utf8Length);
                i = i + 14 + utf8Length;
                androidx.profileinstaller.Encoding.writeString(byteArrayOutputStream, generateDexKey);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i != byteArray.length) {
                throw androidx.profileinstaller.Encoding.error("Expected size " + i + ", does not match actual size " + byteArray.length);
            }
            androidx.profileinstaller.WritableFileSection writableFileSection = new androidx.profileinstaller.WritableFileSection(androidx.profileinstaller.FileSectionType.DEX_FILES, i, byteArray, false);
            byteArrayOutputStream.close();
            return writableFileSection;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static androidx.profileinstaller.WritableFileSection createCompressibleClassSection(androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < dexProfileDataArr.length; i2++) {
            try {
                androidx.profileinstaller.DexProfileData dexProfileData = dexProfileDataArr[i2];
                androidx.profileinstaller.Encoding.writeUInt16(byteArrayOutputStream, i2);
                androidx.profileinstaller.Encoding.writeUInt16(byteArrayOutputStream, dexProfileData.classSetSize);
                i = i + 4 + (dexProfileData.classSetSize * 2);
                writeClasses(byteArrayOutputStream, dexProfileData);
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i != byteArray.length) {
            throw androidx.profileinstaller.Encoding.error("Expected size " + i + ", does not match actual size " + byteArray.length);
        }
        androidx.profileinstaller.WritableFileSection writableFileSection = new androidx.profileinstaller.WritableFileSection(androidx.profileinstaller.FileSectionType.CLASSES, i, byteArray, true);
        byteArrayOutputStream.close();
        return writableFileSection;
    }

    private static androidx.profileinstaller.WritableFileSection createCompressibleMethodsSection(androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < dexProfileDataArr.length; i2++) {
            try {
                androidx.profileinstaller.DexProfileData dexProfileData = dexProfileDataArr[i2];
                int computeMethodFlags = computeMethodFlags(dexProfileData);
                byte[] createMethodBitmapRegion = createMethodBitmapRegion(dexProfileData);
                byte[] createMethodsWithInlineCaches = createMethodsWithInlineCaches(dexProfileData);
                androidx.profileinstaller.Encoding.writeUInt16(byteArrayOutputStream, i2);
                int length = createMethodBitmapRegion.length + 2 + createMethodsWithInlineCaches.length;
                androidx.profileinstaller.Encoding.writeUInt32(byteArrayOutputStream, length);
                androidx.profileinstaller.Encoding.writeUInt16(byteArrayOutputStream, computeMethodFlags);
                byteArrayOutputStream.write(createMethodBitmapRegion);
                byteArrayOutputStream.write(createMethodsWithInlineCaches);
                i = i + 6 + length;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i != byteArray.length) {
            throw androidx.profileinstaller.Encoding.error("Expected size " + i + ", does not match actual size " + byteArray.length);
        }
        androidx.profileinstaller.WritableFileSection writableFileSection = new androidx.profileinstaller.WritableFileSection(androidx.profileinstaller.FileSectionType.METHODS, i, byteArray, true);
        byteArrayOutputStream.close();
        return writableFileSection;
    }

    private static byte[] createMethodBitmapRegion(androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            writeMethodBitmap(byteArrayOutputStream, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] createMethodsWithInlineCaches(androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            writeMethodsWithInlineCaches(byteArrayOutputStream, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static int computeMethodFlags(androidx.profileinstaller.DexProfileData dexProfileData) {
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.lang.Integer>> it = dexProfileData.methods.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= it.next().getValue().intValue();
        }
        return i;
    }

    private static void writeProfileForP(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        byte[] createCompressibleBody = createCompressibleBody(dexProfileDataArr, androidx.profileinstaller.ProfileVersion.V010_P);
        androidx.profileinstaller.Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        androidx.profileinstaller.Encoding.writeCompressed(outputStream, createCompressibleBody);
    }

    private static void writeProfileForO_MR1(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        byte[] createCompressibleBody = createCompressibleBody(dexProfileDataArr, androidx.profileinstaller.ProfileVersion.V009_O_MR1);
        androidx.profileinstaller.Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        androidx.profileinstaller.Encoding.writeCompressed(outputStream, createCompressibleBody);
    }

    private static void writeProfileForO(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        androidx.profileinstaller.Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        for (androidx.profileinstaller.DexProfileData dexProfileData : dexProfileDataArr) {
            int size = dexProfileData.methods.size() * 4;
            java.lang.String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, androidx.profileinstaller.ProfileVersion.V005_O);
            androidx.profileinstaller.Encoding.writeUInt16(outputStream, androidx.profileinstaller.Encoding.utf8Length(generateDexKey));
            androidx.profileinstaller.Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            androidx.profileinstaller.Encoding.writeUInt32(outputStream, size);
            androidx.profileinstaller.Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            androidx.profileinstaller.Encoding.writeString(outputStream, generateDexKey);
            java.util.Iterator<java.lang.Integer> it = dexProfileData.methods.keySet().iterator();
            while (it.hasNext()) {
                androidx.profileinstaller.Encoding.writeUInt16(outputStream, it.next().intValue());
                androidx.profileinstaller.Encoding.writeUInt16(outputStream, 0);
            }
            for (int i : dexProfileData.classes) {
                androidx.profileinstaller.Encoding.writeUInt16(outputStream, i);
            }
        }
    }

    private static byte[] createCompressibleBody(androidx.profileinstaller.DexProfileData[] dexProfileDataArr, byte[] bArr) throws java.io.IOException {
        int i = 0;
        int i2 = 0;
        for (androidx.profileinstaller.DexProfileData dexProfileData : dexProfileDataArr) {
            i2 += androidx.profileinstaller.Encoding.utf8Length(generateDexKey(dexProfileData.apkName, dexProfileData.dexName, bArr)) + 16 + (dexProfileData.classSetSize * 2) + dexProfileData.hotMethodRegionSize + getMethodBitmapStorageSize(dexProfileData.numMethodIds);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i2);
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.V009_O_MR1)) {
            int length = dexProfileDataArr.length;
            while (i < length) {
                androidx.profileinstaller.DexProfileData dexProfileData2 = dexProfileDataArr[i];
                writeLineHeader(byteArrayOutputStream, dexProfileData2, generateDexKey(dexProfileData2.apkName, dexProfileData2.dexName, bArr));
                writeLineData(byteArrayOutputStream, dexProfileData2);
                i++;
            }
        } else {
            for (androidx.profileinstaller.DexProfileData dexProfileData3 : dexProfileDataArr) {
                writeLineHeader(byteArrayOutputStream, dexProfileData3, generateDexKey(dexProfileData3.apkName, dexProfileData3.dexName, bArr));
            }
            int length2 = dexProfileDataArr.length;
            while (i < length2) {
                writeLineData(byteArrayOutputStream, dexProfileDataArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() != i2) {
            throw androidx.profileinstaller.Encoding.error("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int getMethodBitmapStorageSize(int i) {
        return roundUpToByte(i * 2) / 8;
    }

    private static void setMethodBitmapBit(byte[] bArr, int i, int i2, androidx.profileinstaller.DexProfileData dexProfileData) {
        int methodFlagBitmapIndex = methodFlagBitmapIndex(i, i2, dexProfileData.numMethodIds);
        int i3 = methodFlagBitmapIndex / 8;
        bArr[i3] = (byte) ((1 << (methodFlagBitmapIndex % 8)) | bArr[i3]);
    }

    private static void writeLineHeader(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData dexProfileData, java.lang.String str) throws java.io.IOException {
        androidx.profileinstaller.Encoding.writeUInt16(outputStream, androidx.profileinstaller.Encoding.utf8Length(str));
        androidx.profileinstaller.Encoding.writeUInt16(outputStream, dexProfileData.classSetSize);
        androidx.profileinstaller.Encoding.writeUInt32(outputStream, dexProfileData.hotMethodRegionSize);
        androidx.profileinstaller.Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
        androidx.profileinstaller.Encoding.writeUInt32(outputStream, dexProfileData.numMethodIds);
        androidx.profileinstaller.Encoding.writeString(outputStream, str);
    }

    private static void writeLineData(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        writeMethodsWithInlineCaches(outputStream, dexProfileData);
        writeClasses(outputStream, dexProfileData);
        writeMethodBitmap(outputStream, dexProfileData);
    }

    private static void writeMethodsWithInlineCaches(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        int i = 0;
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : dexProfileData.methods.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                androidx.profileinstaller.Encoding.writeUInt16(outputStream, intValue - i);
                androidx.profileinstaller.Encoding.writeUInt16(outputStream, 0);
                i = intValue;
            }
        }
    }

    private static void writeClasses(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        int[] iArr = dexProfileData.classes;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i3);
            valueOf.getClass();
            androidx.profileinstaller.Encoding.writeUInt16(outputStream, i3 - i2);
            valueOf.getClass();
            i++;
            i2 = i3;
        }
    }

    private static void writeMethodBitmap(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        byte[] bArr = new byte[getMethodBitmapStorageSize(dexProfileData.numMethodIds)];
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : dexProfileData.methods.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                setMethodBitmapBit(bArr, 2, intValue, dexProfileData);
            }
            if ((intValue2 & 4) != 0) {
                setMethodBitmapBit(bArr, 4, intValue, dexProfileData);
            }
        }
        outputStream.write(bArr);
    }

    static androidx.profileinstaller.DexProfileData[] readProfile(java.io.InputStream inputStream, byte[] bArr, java.lang.String str) throws java.io.IOException {
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.V010_P)) {
            throw androidx.profileinstaller.Encoding.error("Unsupported version");
        }
        int readUInt8 = androidx.profileinstaller.Encoding.readUInt8(inputStream);
        byte[] readCompressed = androidx.profileinstaller.Encoding.readCompressed(inputStream, (int) androidx.profileinstaller.Encoding.readUInt32(inputStream), (int) androidx.profileinstaller.Encoding.readUInt32(inputStream));
        if (inputStream.read() > 0) {
            throw androidx.profileinstaller.Encoding.error("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(readCompressed);
        try {
            androidx.profileinstaller.DexProfileData[] readUncompressedBody = readUncompressedBody(byteArrayInputStream, str, readUInt8);
            byteArrayInputStream.close();
            return readUncompressedBody;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static androidx.profileinstaller.DexProfileData[] readMeta(java.io.InputStream inputStream, byte[] bArr, byte[] bArr2, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.METADATA_V001_N)) {
            if (java.util.Arrays.equals(androidx.profileinstaller.ProfileVersion.V015_S, bArr2)) {
                throw androidx.profileinstaller.Encoding.error("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return readMetadata001(inputStream, bArr, dexProfileDataArr);
        }
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.METADATA_V002)) {
            return readMetadataV002(inputStream, bArr2, dexProfileDataArr);
        }
        throw androidx.profileinstaller.Encoding.error("Unsupported meta version");
    }

    static androidx.profileinstaller.DexProfileData[] readMetadata001(java.io.InputStream inputStream, byte[] bArr, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.METADATA_V001_N)) {
            throw androidx.profileinstaller.Encoding.error("Unsupported meta version");
        }
        int readUInt8 = androidx.profileinstaller.Encoding.readUInt8(inputStream);
        byte[] readCompressed = androidx.profileinstaller.Encoding.readCompressed(inputStream, (int) androidx.profileinstaller.Encoding.readUInt32(inputStream), (int) androidx.profileinstaller.Encoding.readUInt32(inputStream));
        if (inputStream.read() > 0) {
            throw androidx.profileinstaller.Encoding.error("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(readCompressed);
        try {
            androidx.profileinstaller.DexProfileData[] readMetadataForNBody = readMetadataForNBody(byteArrayInputStream, readUInt8, dexProfileDataArr);
            byteArrayInputStream.close();
            return readMetadataForNBody;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static androidx.profileinstaller.DexProfileData[] readMetadataV002(java.io.InputStream inputStream, byte[] bArr, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        int readUInt16 = androidx.profileinstaller.Encoding.readUInt16(inputStream);
        byte[] readCompressed = androidx.profileinstaller.Encoding.readCompressed(inputStream, (int) androidx.profileinstaller.Encoding.readUInt32(inputStream), (int) androidx.profileinstaller.Encoding.readUInt32(inputStream));
        if (inputStream.read() > 0) {
            throw androidx.profileinstaller.Encoding.error("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(readCompressed);
        try {
            androidx.profileinstaller.DexProfileData[] readMetadataV002Body = readMetadataV002Body(byteArrayInputStream, bArr, readUInt16, dexProfileDataArr);
            byteArrayInputStream.close();
            return readMetadataV002Body;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static androidx.profileinstaller.DexProfileData[] readMetadataV002Body(java.io.InputStream inputStream, byte[] bArr, int i, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        if (inputStream.available() == 0) {
            return new androidx.profileinstaller.DexProfileData[0];
        }
        if (i != dexProfileDataArr.length) {
            throw androidx.profileinstaller.Encoding.error("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            androidx.profileinstaller.Encoding.readUInt16(inputStream);
            java.lang.String readString = androidx.profileinstaller.Encoding.readString(inputStream, androidx.profileinstaller.Encoding.readUInt16(inputStream));
            long readUInt32 = androidx.profileinstaller.Encoding.readUInt32(inputStream);
            int readUInt16 = androidx.profileinstaller.Encoding.readUInt16(inputStream);
            androidx.profileinstaller.DexProfileData findByDexName = findByDexName(dexProfileDataArr, readString);
            if (findByDexName == null) {
                throw androidx.profileinstaller.Encoding.error("Missing profile key: " + readString);
            }
            findByDexName.mTypeIdCount = readUInt32;
            int[] readClasses = readClasses(inputStream, readUInt16);
            if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.V001_N)) {
                findByDexName.classSetSize = readUInt16;
                findByDexName.classes = readClasses;
            }
        }
        return dexProfileDataArr;
    }

    private static androidx.profileinstaller.DexProfileData findByDexName(androidx.profileinstaller.DexProfileData[] dexProfileDataArr, java.lang.String str) {
        if (dexProfileDataArr.length <= 0) {
            return null;
        }
        java.lang.String extractKey = extractKey(str);
        for (int i = 0; i < dexProfileDataArr.length; i++) {
            if (dexProfileDataArr[i].dexName.equals(extractKey)) {
                return dexProfileDataArr[i];
            }
        }
        return null;
    }

    private static androidx.profileinstaller.DexProfileData[] readMetadataForNBody(java.io.InputStream inputStream, int i, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        if (inputStream.available() == 0) {
            return new androidx.profileinstaller.DexProfileData[0];
        }
        if (i != dexProfileDataArr.length) {
            throw androidx.profileinstaller.Encoding.error("Mismatched number of dex files found in metadata");
        }
        java.lang.String[] strArr = new java.lang.String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int readUInt16 = androidx.profileinstaller.Encoding.readUInt16(inputStream);
            iArr[i2] = androidx.profileinstaller.Encoding.readUInt16(inputStream);
            strArr[i2] = androidx.profileinstaller.Encoding.readString(inputStream, readUInt16);
        }
        for (int i3 = 0; i3 < i; i3++) {
            androidx.profileinstaller.DexProfileData dexProfileData = dexProfileDataArr[i3];
            if (!dexProfileData.dexName.equals(strArr[i3])) {
                throw androidx.profileinstaller.Encoding.error("Order of dexfiles in metadata did not match baseline");
            }
            dexProfileData.classSetSize = iArr[i3];
            dexProfileData.classes = readClasses(inputStream, dexProfileData.classSetSize);
        }
        return dexProfileDataArr;
    }

    private static java.lang.String generateDexKey(java.lang.String str, java.lang.String str2, byte[] bArr) {
        java.lang.String dexKeySeparator = androidx.profileinstaller.ProfileVersion.dexKeySeparator(bArr);
        if (str.length() <= 0) {
            return enforceSeparator(str2, dexKeySeparator);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return enforceSeparator(str2, dexKeySeparator);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + androidx.profileinstaller.ProfileVersion.dexKeySeparator(bArr) + str2;
    }

    private static java.lang.String enforceSeparator(java.lang.String str, java.lang.String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static java.lang.String extractKey(java.lang.String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    private static androidx.profileinstaller.DexProfileData[] readUncompressedBody(java.io.InputStream inputStream, java.lang.String str, int i) throws java.io.IOException {
        if (inputStream.available() == 0) {
            return new androidx.profileinstaller.DexProfileData[0];
        }
        androidx.profileinstaller.DexProfileData[] dexProfileDataArr = new androidx.profileinstaller.DexProfileData[i];
        for (int i2 = 0; i2 < i; i2++) {
            int readUInt16 = androidx.profileinstaller.Encoding.readUInt16(inputStream);
            int readUInt162 = androidx.profileinstaller.Encoding.readUInt16(inputStream);
            long readUInt32 = androidx.profileinstaller.Encoding.readUInt32(inputStream);
            dexProfileDataArr[i2] = new androidx.profileinstaller.DexProfileData(str, androidx.profileinstaller.Encoding.readString(inputStream, readUInt16), androidx.profileinstaller.Encoding.readUInt32(inputStream), 0L, readUInt162, (int) readUInt32, (int) androidx.profileinstaller.Encoding.readUInt32(inputStream), new int[readUInt162], new java.util.TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            androidx.profileinstaller.DexProfileData dexProfileData = dexProfileDataArr[i3];
            readHotMethodRegion(inputStream, dexProfileData);
            dexProfileData.classes = readClasses(inputStream, dexProfileData.classSetSize);
            readMethodBitmap(inputStream, dexProfileData);
        }
        return dexProfileDataArr;
    }

    private static void readHotMethodRegion(java.io.InputStream inputStream, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        int available = inputStream.available() - dexProfileData.hotMethodRegionSize;
        int i = 0;
        while (inputStream.available() > available) {
            i += androidx.profileinstaller.Encoding.readUInt16(inputStream);
            dexProfileData.methods.put(java.lang.Integer.valueOf(i), 1);
            for (int readUInt16 = androidx.profileinstaller.Encoding.readUInt16(inputStream); readUInt16 > 0; readUInt16--) {
                skipInlineCache(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw androidx.profileinstaller.Encoding.error("Read too much data during profile line parse");
        }
    }

    private static void skipInlineCache(java.io.InputStream inputStream) throws java.io.IOException {
        androidx.profileinstaller.Encoding.readUInt16(inputStream);
        int readUInt8 = androidx.profileinstaller.Encoding.readUInt8(inputStream);
        if (readUInt8 == 6 || readUInt8 == 7) {
            return;
        }
        while (readUInt8 > 0) {
            androidx.profileinstaller.Encoding.readUInt8(inputStream);
            for (int readUInt82 = androidx.profileinstaller.Encoding.readUInt8(inputStream); readUInt82 > 0; readUInt82--) {
                androidx.profileinstaller.Encoding.readUInt16(inputStream);
            }
            readUInt8--;
        }
    }

    private static int[] readClasses(java.io.InputStream inputStream, int i) throws java.io.IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += androidx.profileinstaller.Encoding.readUInt16(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    private static void readMethodBitmap(java.io.InputStream inputStream, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        java.util.BitSet valueOf = java.util.BitSet.valueOf(androidx.profileinstaller.Encoding.read(inputStream, androidx.profileinstaller.Encoding.bitsToBytes(dexProfileData.numMethodIds * 2)));
        for (int i = 0; i < dexProfileData.numMethodIds; i++) {
            int readFlagsFromBitmap = readFlagsFromBitmap(valueOf, i, dexProfileData.numMethodIds);
            if (readFlagsFromBitmap != 0) {
                java.lang.Integer num = dexProfileData.methods.get(java.lang.Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                dexProfileData.methods.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(readFlagsFromBitmap | num.intValue()));
            }
        }
    }

    private static int readFlagsFromBitmap(java.util.BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(methodFlagBitmapIndex(2, i, i2)) ? 2 : 0;
        return bitSet.get(methodFlagBitmapIndex(4, i, i2)) ? i3 | 4 : i3;
    }

    private static int methodFlagBitmapIndex(int i, int i2, int i3) {
        if (i == 1) {
            throw androidx.profileinstaller.Encoding.error("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw androidx.profileinstaller.Encoding.error("Unexpected flag: " + i);
    }
}
