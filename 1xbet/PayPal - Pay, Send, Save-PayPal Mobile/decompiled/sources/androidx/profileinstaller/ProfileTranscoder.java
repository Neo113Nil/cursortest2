package androidx.profileinstaller;

/* loaded from: classes7.dex */
class ProfileTranscoder {
    static final byte[] getHighSpeedVideoFpsRangesFor = {com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 114, 111, 0};
    static final byte[] getHighSpeedVideoSizes = {com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 114, 109, 0};

    private ProfileTranscoder() {
    }

    static byte[] getHighSpeedVideoSizes(java.io.InputStream inputStream, byte[] bArr) throws java.io.IOException {
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(inputStream, bArr.length))) {
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Invalid magic");
        }
        return androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(inputStream, androidx.profileinstaller.ProfileVersion.getInputFormats.length);
    }

    static void getHighSpeedVideoSizes(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        outputStream.write(getHighSpeedVideoFpsRangesFor);
        outputStream.write(bArr);
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(java.io.OutputStream outputStream, byte[] bArr, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        int length;
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.getOutputFormats)) {
            if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.getInputFormats)) {
                if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.getHighSpeedVideoFpsRangesFor)) {
                    if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.Camera2StreamConfigurationMap)) {
                        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.getHighSpeedVideoFpsRanges)) {
                            return false;
                        }
                        androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, dexProfileDataArr.length);
                        for (androidx.profileinstaller.DexProfileData dexProfileData : dexProfileDataArr) {
                            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(dexProfileData.getHighSpeedVideoSizes, dexProfileData.getHighResolutionOutputSizeshNQ4ISI, androidx.profileinstaller.ProfileVersion.getHighSpeedVideoFpsRanges);
                            androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges));
                            androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, dexProfileData.getInputFormats.size());
                            androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, dexProfileData.getHighSpeedVideoFpsRanges.length);
                            androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, dexProfileData.Camera2StreamConfigurationMap);
                            androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, highSpeedVideoFpsRanges);
                            java.util.Iterator<java.lang.Integer> it = dexProfileData.getInputFormats.keySet().iterator();
                            while (it.hasNext()) {
                                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, it.next().intValue());
                            }
                            for (int i : dexProfileData.getHighSpeedVideoFpsRanges) {
                                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, i);
                            }
                        }
                        return true;
                    }
                    byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(dexProfileDataArr, androidx.profileinstaller.ProfileVersion.Camera2StreamConfigurationMap);
                    androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(outputStream, dexProfileDataArr.length);
                    androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(outputStream, Camera2StreamConfigurationMap);
                    return true;
                }
                androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(outputStream, dexProfileDataArr.length);
                for (androidx.profileinstaller.DexProfileData dexProfileData2 : dexProfileDataArr) {
                    int size = dexProfileData2.getInputFormats.size();
                    java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(dexProfileData2.getHighSpeedVideoSizes, dexProfileData2.getHighResolutionOutputSizeshNQ4ISI, androidx.profileinstaller.ProfileVersion.getHighSpeedVideoFpsRangesFor);
                    androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges2));
                    androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, dexProfileData2.getHighSpeedVideoFpsRanges.length);
                    androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, size * 4);
                    androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, dexProfileData2.Camera2StreamConfigurationMap);
                    androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, highSpeedVideoFpsRanges2);
                    java.util.Iterator<java.lang.Integer> it2 = dexProfileData2.getInputFormats.keySet().iterator();
                    while (it2.hasNext()) {
                        androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, it2.next().intValue());
                        androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, 0);
                    }
                    for (int i2 : dexProfileData2.getHighSpeedVideoFpsRanges) {
                        androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, i2);
                    }
                }
                return true;
            }
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(dexProfileDataArr, androidx.profileinstaller.ProfileVersion.getInputFormats);
            androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(outputStream, dexProfileDataArr.length);
            androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(outputStream, Camera2StreamConfigurationMap2);
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        arrayList.add(getHighSpeedVideoFpsRangesFor(dexProfileDataArr));
        arrayList.add(getHighSpeedVideoSizes(dexProfileDataArr));
        arrayList.add(getHighSpeedVideoFpsRanges(dexProfileDataArr));
        long length2 = androidx.profileinstaller.ProfileVersion.getOutputFormats.length + getHighSpeedVideoFpsRangesFor.length + 4 + (arrayList.size() * 16);
        androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            androidx.profileinstaller.WritableFileSection writableFileSection = (androidx.profileinstaller.WritableFileSection) arrayList.get(i3);
            androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, writableFileSection.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI);
            androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, length2);
            if (writableFileSection.getHighSpeedVideoSizes) {
                long length3 = writableFileSection.getHighResolutionOutputSizeshNQ4ISI.length;
                byte[] highSpeedVideoFpsRangesFor = androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(writableFileSection.getHighResolutionOutputSizeshNQ4ISI);
                arrayList2.add(highSpeedVideoFpsRangesFor);
                androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, highSpeedVideoFpsRangesFor.length);
                androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, length3);
                length = highSpeedVideoFpsRangesFor.length;
            } else {
                arrayList2.add(writableFileSection.getHighResolutionOutputSizeshNQ4ISI);
                androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, writableFileSection.getHighResolutionOutputSizeshNQ4ISI.length);
                androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, 0L);
                length = writableFileSection.getHighResolutionOutputSizeshNQ4ISI.length;
            }
            length2 += length;
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            outputStream.write((byte[]) arrayList2.get(i4));
        }
        return true;
    }

    private static androidx.profileinstaller.WritableFileSection getHighSpeedVideoFpsRangesFor(androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayOutputStream, dexProfileDataArr.length);
            int i = 2;
            for (androidx.profileinstaller.DexProfileData dexProfileData : dexProfileDataArr) {
                androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(byteArrayOutputStream, dexProfileData.Camera2StreamConfigurationMap);
                androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(byteArrayOutputStream, dexProfileData.getOutputFormats);
                androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(byteArrayOutputStream, dexProfileData.getOutputMinFrameDuration);
                java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(dexProfileData.getHighSpeedVideoSizes, dexProfileData.getHighResolutionOutputSizeshNQ4ISI, androidx.profileinstaller.ProfileVersion.getOutputFormats);
                int Camera2StreamConfigurationMap = androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges);
                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayOutputStream, Camera2StreamConfigurationMap);
                i = i + 14 + Camera2StreamConfigurationMap;
                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayOutputStream, highSpeedVideoFpsRanges);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i != byteArray.length) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Expected size ");
                sb.append(i);
                sb.append(", does not match actual size ");
                sb.append(byteArray.length);
                throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI(sb.toString());
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

    private static androidx.profileinstaller.WritableFileSection getHighSpeedVideoSizes(androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < dexProfileDataArr.length; i2++) {
            try {
                androidx.profileinstaller.DexProfileData dexProfileData = dexProfileDataArr[i2];
                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayOutputStream, i2);
                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayOutputStream, dexProfileData.getHighSpeedVideoFpsRangesFor);
                i = i + 4 + (dexProfileData.getHighSpeedVideoFpsRangesFor * 2);
                getHighSpeedVideoSizes(byteArrayOutputStream, dexProfileData);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Expected size ");
            sb.append(i);
            sb.append(", does not match actual size ");
            sb.append(byteArray.length);
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI(sb.toString());
        }
        androidx.profileinstaller.WritableFileSection writableFileSection = new androidx.profileinstaller.WritableFileSection(androidx.profileinstaller.FileSectionType.CLASSES, i, byteArray, true);
        byteArrayOutputStream.close();
        return writableFileSection;
    }

    private static androidx.profileinstaller.WritableFileSection getHighSpeedVideoFpsRanges(androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < dexProfileDataArr.length; i2++) {
            try {
                androidx.profileinstaller.DexProfileData dexProfileData = dexProfileDataArr[i2];
                java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.lang.Integer>> it = dexProfileData.getInputFormats.entrySet().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    i3 |= it.next().getValue().intValue();
                }
                byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i3, dexProfileData);
                byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(dexProfileData);
                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayOutputStream, i2);
                int length = highSpeedVideoFpsRanges.length + 2 + highResolutionOutputSizeshNQ4ISI.length;
                androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(byteArrayOutputStream, length);
                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayOutputStream, i3);
                byteArrayOutputStream.write(highSpeedVideoFpsRanges);
                byteArrayOutputStream.write(highResolutionOutputSizeshNQ4ISI);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Expected size ");
            sb.append(i);
            sb.append(", does not match actual size ");
            sb.append(byteArray.length);
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI(sb.toString());
        }
        androidx.profileinstaller.WritableFileSection writableFileSection = new androidx.profileinstaller.WritableFileSection(androidx.profileinstaller.FileSectionType.METHODS, i, byteArray, true);
        byteArrayOutputStream.close();
        return writableFileSection;
    }

    private static byte[] getHighSpeedVideoFpsRanges(int i, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[(((java.lang.Integer.bitCount(i & (-2)) * dexProfileData.getOutputMinFrameDuration) + 7) & (-8)) / 8];
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : dexProfileData.getInputFormats.entrySet()) {
                int intValue = entry.getKey().intValue();
                int intValue2 = entry.getValue().intValue();
                int i2 = 0;
                for (int i3 = 1; i3 <= 4; i3 <<= 1) {
                    if (i3 != 1 && (i3 & i) != 0) {
                        if ((i3 & intValue2) == i3) {
                            int i4 = (dexProfileData.getOutputMinFrameDuration * i2) + intValue;
                            int i5 = i4 / 8;
                            bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
                        }
                        i2++;
                    }
                }
            }
            byteArrayOutputStream.write(bArr);
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

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, dexProfileData);
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

    private static byte[] Camera2StreamConfigurationMap(androidx.profileinstaller.DexProfileData[] dexProfileDataArr, byte[] bArr) throws java.io.IOException {
        int i = 0;
        int i2 = 0;
        for (androidx.profileinstaller.DexProfileData dexProfileData : dexProfileDataArr) {
            i2 += androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges(dexProfileData.getHighSpeedVideoSizes, dexProfileData.getHighResolutionOutputSizeshNQ4ISI, bArr)) + 16 + (dexProfileData.getHighSpeedVideoFpsRangesFor * 2) + dexProfileData.getInputSizeshNQ4ISI + ((((dexProfileData.getOutputMinFrameDuration * 2) + 7) & (-8)) / 8);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i2);
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.Camera2StreamConfigurationMap)) {
            int length = dexProfileDataArr.length;
            while (i < length) {
                androidx.profileinstaller.DexProfileData dexProfileData2 = dexProfileDataArr[i];
                getHighSpeedVideoFpsRanges(byteArrayOutputStream, dexProfileData2, getHighSpeedVideoFpsRanges(dexProfileData2.getHighSpeedVideoSizes, dexProfileData2.getHighResolutionOutputSizeshNQ4ISI, bArr));
                getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, dexProfileData2);
                getHighSpeedVideoSizes(byteArrayOutputStream, dexProfileData2);
                getHighSpeedVideoFpsRanges(byteArrayOutputStream, dexProfileData2);
                i++;
            }
        } else {
            for (androidx.profileinstaller.DexProfileData dexProfileData3 : dexProfileDataArr) {
                getHighSpeedVideoFpsRanges(byteArrayOutputStream, dexProfileData3, getHighSpeedVideoFpsRanges(dexProfileData3.getHighSpeedVideoSizes, dexProfileData3.getHighResolutionOutputSizeshNQ4ISI, bArr));
            }
            int length2 = dexProfileDataArr.length;
            while (i < length2) {
                androidx.profileinstaller.DexProfileData dexProfileData4 = dexProfileDataArr[i];
                getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, dexProfileData4);
                getHighSpeedVideoSizes(byteArrayOutputStream, dexProfileData4);
                getHighSpeedVideoFpsRanges(byteArrayOutputStream, dexProfileData4);
                i++;
            }
        }
        if (byteArrayOutputStream.size() != i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The bytes saved do not match expectation. actual=");
            sb.append(byteArrayOutputStream.size());
            sb.append(" expected=");
            sb.append(i2);
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI(sb.toString());
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static void getHighSpeedVideoSizes(byte[] bArr, int i, int i2, androidx.profileinstaller.DexProfileData dexProfileData) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i, i2, dexProfileData.getOutputMinFrameDuration);
        int i3 = highSpeedVideoFpsRanges / 8;
        bArr[i3] = (byte) ((1 << (highSpeedVideoFpsRanges % 8)) | bArr[i3]);
    }

    private static void getHighSpeedVideoFpsRanges(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData dexProfileData, java.lang.String str) throws java.io.IOException {
        androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(str));
        androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, dexProfileData.getHighSpeedVideoFpsRangesFor);
        androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, dexProfileData.getInputSizeshNQ4ISI);
        androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, dexProfileData.Camera2StreamConfigurationMap);
        androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(outputStream, dexProfileData.getOutputMinFrameDuration);
        androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, str);
    }

    private static void getHighSpeedVideoFpsRangesFor(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        int i = 0;
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : dexProfileData.getInputFormats.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, intValue - i);
                androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, 0);
                i = intValue;
            }
        }
    }

    private static void getHighSpeedVideoSizes(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        int i = 0;
        for (int i2 : dexProfileData.getHighSpeedVideoFpsRanges) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
            androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(outputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.io.OutputStream outputStream, androidx.profileinstaller.DexProfileData dexProfileData) throws java.io.IOException {
        byte[] bArr = new byte[(((dexProfileData.getOutputMinFrameDuration * 2) + 7) & (-8)) / 8];
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : dexProfileData.getInputFormats.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                getHighSpeedVideoSizes(bArr, 2, intValue, dexProfileData);
            }
            if ((intValue2 & 4) != 0) {
                getHighSpeedVideoSizes(bArr, 4, intValue, dexProfileData);
            }
        }
        outputStream.write(bArr);
    }

    static androidx.profileinstaller.DexProfileData[] getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream, byte[] bArr, java.lang.String str) throws java.io.IOException {
        androidx.profileinstaller.DexProfileData[] dexProfileDataArr;
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.getInputFormats)) {
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Unsupported version");
        }
        int Camera2StreamConfigurationMap = androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(inputStream);
        byte[] highSpeedVideoFpsRanges = androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRanges(inputStream, (int) androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(inputStream), (int) androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(inputStream));
        if (inputStream.read() > 0) {
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(highSpeedVideoFpsRanges);
        try {
            if (byteArrayInputStream.available() == 0) {
                dexProfileDataArr = new androidx.profileinstaller.DexProfileData[0];
            } else {
                androidx.profileinstaller.DexProfileData[] dexProfileDataArr2 = new androidx.profileinstaller.DexProfileData[Camera2StreamConfigurationMap];
                for (int i = 0; i < Camera2StreamConfigurationMap; i++) {
                    int highSpeedVideoSizes = androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream);
                    int highSpeedVideoSizes2 = androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream);
                    dexProfileDataArr2[i] = new androidx.profileinstaller.DexProfileData(str, androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream, highSpeedVideoSizes), androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(byteArrayInputStream), highSpeedVideoSizes2, (int) androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(byteArrayInputStream), (int) androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(byteArrayInputStream), new int[highSpeedVideoSizes2], new java.util.TreeMap());
                }
                for (int i2 = 0; i2 < Camera2StreamConfigurationMap; i2++) {
                    androidx.profileinstaller.DexProfileData dexProfileData = dexProfileDataArr2[i2];
                    int available = byteArrayInputStream.available() - dexProfileData.getInputSizeshNQ4ISI;
                    int i3 = 0;
                    while (byteArrayInputStream.available() > available) {
                        i3 += androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream);
                        dexProfileData.getInputFormats.put(java.lang.Integer.valueOf(i3), 1);
                        for (int highSpeedVideoSizes3 = androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream); highSpeedVideoSizes3 > 0; highSpeedVideoSizes3--) {
                            androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream);
                            int Camera2StreamConfigurationMap2 = androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(byteArrayInputStream);
                            if (Camera2StreamConfigurationMap2 != 6 && Camera2StreamConfigurationMap2 != 7) {
                                while (Camera2StreamConfigurationMap2 > 0) {
                                    androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(byteArrayInputStream);
                                    for (int Camera2StreamConfigurationMap3 = androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(byteArrayInputStream); Camera2StreamConfigurationMap3 > 0; Camera2StreamConfigurationMap3--) {
                                        androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream);
                                    }
                                    Camera2StreamConfigurationMap2--;
                                }
                            }
                        }
                    }
                    if (byteArrayInputStream.available() == available) {
                        dexProfileData.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(byteArrayInputStream, dexProfileData.getHighSpeedVideoFpsRangesFor);
                        java.util.BitSet valueOf = java.util.BitSet.valueOf(androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(byteArrayInputStream, androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI(dexProfileData.getOutputMinFrameDuration * 2)));
                        for (int i4 = 0; i4 < dexProfileData.getOutputMinFrameDuration; i4++) {
                            int i5 = dexProfileData.getOutputMinFrameDuration;
                            int i6 = !valueOf.get(getHighSpeedVideoFpsRanges(2, i4, i5)) ? 0 : 2;
                            if (valueOf.get(getHighSpeedVideoFpsRanges(4, i4, i5))) {
                                i6 |= 4;
                            }
                            if (i6 != 0) {
                                java.lang.Integer num = dexProfileData.getInputFormats.get(java.lang.Integer.valueOf(i4));
                                if (num == null) {
                                    num = 0;
                                }
                                dexProfileData.getInputFormats.put(java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(num.intValue() | i6));
                            }
                        }
                    } else {
                        throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Read too much data during profile line parse");
                    }
                }
                dexProfileDataArr = dexProfileDataArr2;
            }
            byteArrayInputStream.close();
            return dexProfileDataArr;
        } finally {
        }
    }

    static androidx.profileinstaller.DexProfileData[] getHighSpeedVideoSizes(java.io.InputStream inputStream, byte[] bArr, byte[] bArr2, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.getHighResolutionOutputSizeshNQ4ISI)) {
            if (java.util.Arrays.equals(androidx.profileinstaller.ProfileVersion.getOutputFormats, bArr2)) {
                throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return getHighSpeedVideoFpsRangesFor(inputStream, bArr, dexProfileDataArr);
        }
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.getHighSpeedVideoSizes)) {
            return getHighResolutionOutputSizeshNQ4ISI(inputStream, bArr2, dexProfileDataArr);
        }
        throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Unsupported meta version");
    }

    private static androidx.profileinstaller.DexProfileData[] getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream, byte[] bArr, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.getHighResolutionOutputSizeshNQ4ISI)) {
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Unsupported meta version");
        }
        int Camera2StreamConfigurationMap = androidx.profileinstaller.Encoding.Camera2StreamConfigurationMap(inputStream);
        byte[] highSpeedVideoFpsRanges = androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRanges(inputStream, (int) androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(inputStream), (int) androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(inputStream));
        if (inputStream.read() > 0) {
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(highSpeedVideoFpsRanges);
        try {
            if (byteArrayInputStream.available() == 0) {
                dexProfileDataArr = new androidx.profileinstaller.DexProfileData[0];
            } else {
                if (Camera2StreamConfigurationMap != dexProfileDataArr.length) {
                    throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Mismatched number of dex files found in metadata");
                }
                java.lang.String[] strArr = new java.lang.String[Camera2StreamConfigurationMap];
                int[] iArr = new int[Camera2StreamConfigurationMap];
                for (int i = 0; i < Camera2StreamConfigurationMap; i++) {
                    int highSpeedVideoSizes = androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream);
                    iArr[i] = androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream);
                    strArr[i] = androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream, highSpeedVideoSizes);
                }
                for (int i2 = 0; i2 < Camera2StreamConfigurationMap; i2++) {
                    androidx.profileinstaller.DexProfileData dexProfileData = dexProfileDataArr[i2];
                    if (!dexProfileData.getHighResolutionOutputSizeshNQ4ISI.equals(strArr[i2])) {
                        throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Order of dexfiles in metadata did not match baseline");
                    }
                    dexProfileData.getHighSpeedVideoFpsRangesFor = iArr[i2];
                    dexProfileData.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(byteArrayInputStream, dexProfileData.getHighSpeedVideoFpsRangesFor);
                }
            }
            byteArrayInputStream.close();
            return dexProfileDataArr;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static androidx.profileinstaller.DexProfileData[] getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream, byte[] bArr, androidx.profileinstaller.DexProfileData[] dexProfileDataArr) throws java.io.IOException {
        androidx.profileinstaller.DexProfileData dexProfileData;
        int highSpeedVideoSizes = androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(inputStream);
        byte[] highSpeedVideoFpsRanges = androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRanges(inputStream, (int) androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(inputStream), (int) androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(inputStream));
        if (inputStream.read() > 0) {
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(highSpeedVideoFpsRanges);
        try {
            if (byteArrayInputStream.available() == 0) {
                dexProfileDataArr = new androidx.profileinstaller.DexProfileData[0];
            } else {
                if (highSpeedVideoSizes != dexProfileDataArr.length) {
                    throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Mismatched number of dex files found in metadata");
                }
                for (int i = 0; i < highSpeedVideoSizes; i++) {
                    androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream);
                    java.lang.String highSpeedVideoSizes2 = androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream, androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream));
                    long highSpeedVideoFpsRangesFor = androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRangesFor(byteArrayInputStream);
                    int highSpeedVideoSizes3 = androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(byteArrayInputStream);
                    if (dexProfileDataArr.length > 0) {
                        int indexOf = highSpeedVideoSizes2.indexOf("!");
                        if (indexOf < 0) {
                            indexOf = highSpeedVideoSizes2.indexOf(io.ktor.sse.ServerSentEventKt.COLON);
                        }
                        java.lang.String substring = indexOf > 0 ? highSpeedVideoSizes2.substring(indexOf + 1) : highSpeedVideoSizes2;
                        for (int i2 = 0; i2 < dexProfileDataArr.length; i2++) {
                            if (dexProfileDataArr[i2].getHighResolutionOutputSizeshNQ4ISI.equals(substring)) {
                                dexProfileData = dexProfileDataArr[i2];
                                break;
                            }
                        }
                    }
                    dexProfileData = null;
                    if (dexProfileData == null) {
                        throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Missing profile key: ".concat(java.lang.String.valueOf(highSpeedVideoSizes2)));
                    }
                    dexProfileData.getOutputFormats = highSpeedVideoFpsRangesFor;
                    int[] highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(byteArrayInputStream, highSpeedVideoSizes3);
                    if (java.util.Arrays.equals(bArr, androidx.profileinstaller.ProfileVersion.getHighSpeedVideoFpsRanges)) {
                        dexProfileData.getHighSpeedVideoFpsRangesFor = highSpeedVideoSizes3;
                        dexProfileData.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges2;
                    }
                }
            }
            byteArrayInputStream.close();
            return dexProfileDataArr;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, byte[] bArr) {
        java.lang.String Camera2StreamConfigurationMap = androidx.profileinstaller.ProfileVersion.Camera2StreamConfigurationMap(bArr);
        if (str.length() <= 0) {
            return getHighSpeedVideoFpsRanges(str2, Camera2StreamConfigurationMap);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(io.ktor.sse.ServerSentEventKt.COLON)) {
            return getHighSpeedVideoFpsRanges(str2, Camera2StreamConfigurationMap);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(androidx.profileinstaller.ProfileVersion.Camera2StreamConfigurationMap(bArr));
        sb.append(str2);
        return sb.toString();
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        if ("!".equals(str2)) {
            return str.replace(io.ktor.sse.ServerSentEventKt.COLON, "!");
        }
        return io.ktor.sse.ServerSentEventKt.COLON.equals(str2) ? str.replace("!", io.ktor.sse.ServerSentEventKt.COLON) : str;
    }

    private static int[] getHighSpeedVideoFpsRanges(java.io.InputStream inputStream, int i) throws java.io.IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += androidx.profileinstaller.Encoding.getHighSpeedVideoSizes(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    private static int getHighSpeedVideoFpsRanges(int i, int i2, int i3) {
        if (i == 1) {
            throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw androidx.profileinstaller.Encoding.getHighResolutionOutputSizeshNQ4ISI("Unexpected flag: ".concat(java.lang.String.valueOf(i)));
    }
}
