package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
class KernelConfigurationHelper {
    final boolean Camera2StreamConfigurationMap;
    private java.util.Map<java.lang.String, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> getHighSpeedVideoFpsRangesFor;
    private final byte[] getOutputMinFrameDuration;
    byte[] getHighSpeedVideoSizes = null;
    private byte[] getOutputFormats = null;
    byte[] getHighResolutionOutputSizeshNQ4ISI = null;
    byte[] getHighSpeedVideoFpsRanges = null;
    private boolean getInputFormats = false;

    public KernelConfigurationHelper(boolean z, byte[] bArr) {
        this.Camera2StreamConfigurationMap = z;
        this.getOutputMinFrameDuration = bArr;
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap;
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap2;
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap3;
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap4;
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap5;
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> createList = my.com.softspace.reader.internal.kernelconfig.BerTlv.createList(this.getOutputMinFrameDuration);
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(createList, 224);
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(createList, 225);
            Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(createList, 226);
            Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(createList, 227);
            Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(createList, 138);
            Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(createList, 145);
            z = true;
            z2 = Camera2StreamConfigurationMap.size() == 1;
            z3 = Camera2StreamConfigurationMap2.size() > 0;
            z4 = Camera2StreamConfigurationMap4.size() == 1;
            z5 = Camera2StreamConfigurationMap5.size() == 1;
        } catch (java.lang.Exception e) {
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().e("sskernel-config", "error", e);
            this.getInputFormats = false;
        }
        if (!z2 || !z3 || !z4 || !z5 || Camera2StreamConfigurationMap.get(0).getValue().length == 0 || Camera2StreamConfigurationMap4.get(0).getValue().length == 0 || Camera2StreamConfigurationMap5.get(0).getValue().length < 2) {
            return false;
        }
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap.get(0).toByteArray();
        this.getOutputFormats = Camera2StreamConfigurationMap4.get(0).toByteArray();
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap5.get(0).getValue();
        this.getHighSpeedVideoFpsRanges = null;
        if (Camera2StreamConfigurationMap6.size() > 0) {
            this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap6.get(0).getValue();
        }
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i("sskernel-config", "[init]");
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv : Camera2StreamConfigurationMap2) {
            my.com.softspace.reader.internal.kernelconfig.BerTlv find = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(berTlv.getValue(), my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F06_TERM_AID);
            if (find != null) {
                this.getHighSpeedVideoFpsRangesFor.put(find.getValueAsHexString().toUpperCase(), my.com.softspace.reader.internal.kernel.ApplicationConfiguration.getHighSpeedVideoSizes(find.getValue(), berTlv.toByteArray(), Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3, find.getValue())));
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor.size() <= 0) {
            z = false;
        }
        this.getInputFormats = z;
        return this.getInputFormats;
    }

    final boolean getHighSpeedVideoFpsRangesFor() {
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap;
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap2;
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap3;
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        try {
            java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> createList = my.com.softspace.reader.internal.kernelconfig.BerTlv.createList(this.getOutputMinFrameDuration);
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(createList, 224);
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(createList, 225);
            Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(createList, 226);
            Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(createList, 227);
            z = true;
            z2 = Camera2StreamConfigurationMap.size() == 1;
            z3 = Camera2StreamConfigurationMap2.size() > 0;
            z4 = Camera2StreamConfigurationMap4.size() == 1;
        } catch (java.lang.Exception e) {
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().e("sskernel-config", "error", e);
            this.getInputFormats = false;
        }
        if (!z2 || !z3 || !z4 || Camera2StreamConfigurationMap.get(0).getValue().length == 0 || Camera2StreamConfigurationMap4.get(0).getValue().length == 0) {
            return false;
        }
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap.get(0).toByteArray();
        this.getOutputFormats = Camera2StreamConfigurationMap4.get(0).toByteArray();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = null;
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i("sskernel-config", "[init]");
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv : Camera2StreamConfigurationMap2) {
            my.com.softspace.reader.internal.kernelconfig.BerTlv find = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(berTlv.getValue(), my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F06_TERM_AID);
            if (find != null) {
                this.getHighSpeedVideoFpsRangesFor.put(find.getValueAsHexString().toUpperCase(), my.com.softspace.reader.internal.kernel.ApplicationConfiguration.getHighSpeedVideoSizes(find.getValue(), berTlv.toByteArray(), Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3, find.getValue())));
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor.size() <= 0) {
            z = false;
        }
        this.getInputFormats = z;
        return this.getInputFormats;
    }

    private static byte[] Camera2StreamConfigurationMap(java.util.List<byte[]> list) {
        if (list == null || list.size() == 0) {
            return new byte[0];
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.util.Iterator<byte[]> it = list.iterator();
                while (it.hasNext()) {
                    byteArrayOutputStream.write(it.next());
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return new byte[0];
        }
    }

    public final byte[] getHighSpeedVideoFpsRanges(byte[] bArr) {
        if (!this.getInputFormats) {
            throw new java.lang.IllegalStateException();
        }
        my.com.softspace.reader.internal.kernel.ApplicationConfiguration highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(bArr, true).toUpperCase());
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges);
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.getHighSpeedVideoSizes);
                byteArrayOutputStream.write(highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap);
                byteArrayOutputStream.write(Camera2StreamConfigurationMap);
                byteArrayOutputStream.write(this.getOutputFormats);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return bArr;
        }
    }

    public final my.com.softspace.reader.internal.kernel.ApplicationConfiguration getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        while (str != null && str.length() >= 10 && str.length() <= 32) {
            java.lang.String upperCase = str.toUpperCase();
            my.com.softspace.reader.internal.kernel.ApplicationConfiguration applicationConfiguration = this.getHighSpeedVideoFpsRangesFor.get(upperCase);
            if (applicationConfiguration != null) {
                return applicationConfiguration;
            }
            str = upperCase.substring(0, upperCase.length() - 2);
        }
        return null;
    }

    private static java.util.List<byte[]> Camera2StreamConfigurationMap(java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> list, byte[] bArr) {
        int length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null && list.size() != 0) {
            for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv : list) {
                my.com.softspace.reader.internal.kernelconfig.BerTlv find = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(berTlv.getValue(), 193);
                if (find != null && find.getValue().length != 0 && bArr.length >= (length = find.getValue().length) && java.util.Arrays.equals(java.util.Arrays.copyOf(bArr, length), find.getValue())) {
                    arrayList.add(berTlv.toByteArray());
                }
            }
        }
        return arrayList;
    }

    private static java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> Camera2StreamConfigurationMap(java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv : list) {
            if (berTlv.getTag().toIntValue() == i) {
                arrayList.add(berTlv);
            }
        }
        return arrayList;
    }
}
