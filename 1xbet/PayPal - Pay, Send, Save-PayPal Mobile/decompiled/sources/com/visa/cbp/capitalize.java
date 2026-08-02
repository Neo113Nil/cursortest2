package com.visa.cbp;

/* loaded from: classes16.dex */
class capitalize {
    private static final java.lang.String getHighSpeedVideoFpsRanges = "capitalize";
    public static final byte[] getHighSpeedVideoSizes = {0, -92, 4, 0, 14, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 0};
    private java.util.Vector<com.visa.cbp.getDeviceName> Camera2StreamConfigurationMap;
    private com.visa.cbp.setPhoneNumber getHighSpeedVideoFpsRangesFor;
    private java.util.ArrayList<byte[]> getInputSizeshNQ4ISI;
    final byte[] getHighResolutionOutputSizeshNQ4ISI = {org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
    private int getOutputMinFrameDuration = 0;

    public capitalize() {
        this.getHighSpeedVideoFpsRangesFor = null;
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new java.util.ArrayList<>();
        }
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new java.util.Vector<>();
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new com.visa.cbp.setPhoneNumber();
        }
    }

    public void getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.String> list) {
        if (list != null) {
            for (java.lang.String str : list) {
                if (str.length() >= 10 && str.length() % 2 == 0) {
                    this.getInputSizeshNQ4ISI.add(this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(str));
                }
            }
        }
    }

    public byte[] Camera2StreamConfigurationMap() {
        if (this.getOutputMinFrameDuration + 1 >= this.Camera2StreamConfigurationMap.size() || this.Camera2StreamConfigurationMap.isEmpty()) {
            return null;
        }
        java.util.Vector<com.visa.cbp.getDeviceName> vector = this.Camera2StreamConfigurationMap;
        int i = this.getOutputMinFrameDuration + 1;
        this.getOutputMinFrameDuration = i;
        return vector.get(i).Camera2StreamConfigurationMap();
    }

    public byte[] getHighSpeedVideoFpsRangesFor(com.visa.cbp.setDeviceModel setdevicemodel) throws java.io.IOException {
        this.getOutputMinFrameDuration = 0;
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            this.Camera2StreamConfigurationMap.clear();
        }
        if (this.getInputSizeshNQ4ISI.size() == 0) {
            throw new java.io.IOException("List of Reader Supported AIDs is missing. Please initialize using setSupportedApps()");
        }
        java.util.Iterator<com.visa.cbp.getPhoneNumber> it = getHighSpeedVideoSizes(setdevicemodel.getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes)).getInputSizeshNQ4ISI.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.visa.cbp.getPhoneNumber next = it.next();
            com.visa.cbp.getPhoneNumber highSpeedVideoSizes = next.getHighSpeedVideoSizes((short) 79);
            byte[] highSpeedVideoFpsRangesFor = highSpeedVideoSizes == null ? null : highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
            com.visa.cbp.getPhoneNumber highSpeedVideoSizes2 = next.getHighSpeedVideoSizes((short) 80);
            byte[] highSpeedVideoFpsRangesFor2 = highSpeedVideoSizes2 == null ? null : highSpeedVideoSizes2.getHighSpeedVideoFpsRangesFor();
            com.visa.cbp.getPhoneNumber highSpeedVideoSizes3 = next.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.isOutputSupportedForhNQ4ISI);
            byte[] highSpeedVideoFpsRangesFor3 = highSpeedVideoSizes3 != null ? highSpeedVideoSizes3.getHighSpeedVideoFpsRangesFor() : null;
            com.visa.cbp.getPhoneNumber highSpeedVideoSizes4 = next.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.unwrapAs);
            byte b = highSpeedVideoSizes4 == null ? (byte) 0 : highSpeedVideoSizes4.getHighSpeedVideoFpsRangesFor()[0];
            if (highSpeedVideoFpsRangesFor != null) {
                getHighResolutionOutputSizeshNQ4ISI(new com.visa.cbp.getDeviceName(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor2, b));
            }
        }
        if (getHighSpeedVideoFpsRanges() != null) {
            return getHighSpeedVideoFpsRanges().Camera2StreamConfigurationMap();
        }
        return null;
    }

    com.visa.cbp.getPhoneNumber getHighSpeedVideoSizes(byte[] bArr) throws java.io.IOException {
        if (bArr == null || bArr.length <= 2) {
            throw new java.io.IOException("Invalid PPSE Response Data.");
        }
        com.visa.cbp.getPhoneNumber getphonenumber = new com.visa.cbp.getPhoneNumber(bArr, (short) 0, (short) (bArr.length - 2));
        if (getphonenumber.Camera2StreamConfigurationMap(com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 0) == null) {
            throw new java.io.IOException("Invalid PPSE TLV Format. Missing FCI Template (0x6F).");
        }
        com.visa.cbp.getPhoneNumber Camera2StreamConfigurationMap = getphonenumber.Camera2StreamConfigurationMap(com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 1);
        if (Camera2StreamConfigurationMap == null) {
            throw new java.io.IOException("Invalide PPSE TLV Format. Missing DF Name Template (0x84).");
        }
        if (Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI != 14) {
            throw new java.io.IOException("Invalid PPSE TLV Format. Invalid DF Name Length (0x84).");
        }
        if (Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor().length != this.getHighResolutionOutputSizeshNQ4ISI.length) {
            throw new java.io.IOException("Invalid PPSE DF Name.");
        }
        com.visa.cbp.setPhoneNumber setphonenumber = this.getHighSpeedVideoFpsRangesFor;
        byte[] highSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (!setphonenumber.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor, 0, bArr2, 0, bArr2.length)) {
            throw new java.io.IOException("Invalid PPSE DF Name.");
        }
        com.visa.cbp.getPhoneNumber Camera2StreamConfigurationMap2 = getphonenumber.Camera2StreamConfigurationMap(com.visa.cbp.setDeviceName._CREATION, 1);
        if (Camera2StreamConfigurationMap2 == null) {
            throw new java.io.IOException("Invalid PPSE TLV Format. Missing FCI Proprietary Template (0xA5).");
        }
        com.visa.cbp.getPhoneNumber Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap2.Camera2StreamConfigurationMap(com.visa.cbp.setDeviceName.getHighSpeedVideoSizes, 1);
        if (Camera2StreamConfigurationMap3 != null) {
            return Camera2StreamConfigurationMap3;
        }
        throw new java.io.IOException("Invalid PPSE TLV Format. Missing FCI Issuer Discretionary Data Template (0xBF0C)");
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getDeviceName getdevicename) {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new java.util.Vector<>();
        }
        int i = 0;
        if (getdevicename != null && getdevicename.Camera2StreamConfigurationMap() != null && getdevicename.Camera2StreamConfigurationMap().length >= 5 && getdevicename.Camera2StreamConfigurationMap().length <= 16) {
            java.util.Iterator<byte[]> it = this.getInputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                if (getHighSpeedVideoFpsRangesFor(getdevicename, it.next())) {
                    if (getdevicename.getHighSpeedVideoSizes() == 0) {
                        this.Camera2StreamConfigurationMap.add(getdevicename);
                        return true;
                    }
                    while (i < this.Camera2StreamConfigurationMap.size() && this.Camera2StreamConfigurationMap.get(i).getHighSpeedVideoSizes() != 0 && this.Camera2StreamConfigurationMap.get(i).getHighSpeedVideoSizes() <= getdevicename.getHighSpeedVideoSizes()) {
                        i++;
                    }
                    this.Camera2StreamConfigurationMap.add(i, getdevicename);
                    return true;
                }
            }
        }
        return false;
    }

    boolean getHighSpeedVideoFpsRangesFor(com.visa.cbp.getDeviceName getdevicename, byte[] bArr) {
        return getdevicename != null && getdevicename.Camera2StreamConfigurationMap() != null && getdevicename.Camera2StreamConfigurationMap().length >= bArr.length && this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(getdevicename.Camera2StreamConfigurationMap(), 0, bArr, 0, bArr.length);
    }

    com.visa.cbp.getDeviceName getHighSpeedVideoFpsRanges() {
        java.util.Vector<com.visa.cbp.getDeviceName> vector = this.Camera2StreamConfigurationMap;
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        return this.Camera2StreamConfigurationMap.get(this.getOutputMinFrameDuration);
    }

    public void getHighSpeedVideoSizes() {
        this.Camera2StreamConfigurationMap.clear();
        this.getOutputMinFrameDuration = 0;
    }
}
