package my.com.softspace.reader.internal.kernelconfig;

/* loaded from: classes17.dex */
public class KernelConfig {
    private java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate> Camera2StreamConfigurationMap;
    private my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate getHighResolutionOutputSizeshNQ4ISI;
    private java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate> getHighSpeedVideoFpsRanges;
    private my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate getHighSpeedVideoSizes;

    public my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate getTerminal() {
        return this.getHighSpeedVideoSizes;
    }

    public void setTerminal(my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate berTlvTemplate) {
        this.getHighSpeedVideoSizes = berTlvTemplate;
    }

    public java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate> getApplications() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setApplications(java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate> list) {
        this.getHighSpeedVideoFpsRanges = list;
    }

    public java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate> getKeys() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setKeys(java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate> list) {
        this.Camera2StreamConfigurationMap = list;
    }

    public my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate getTransaction() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setTransaction(my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate berTlvTemplate) {
        this.getHighResolutionOutputSizeshNQ4ISI = berTlvTemplate;
    }

    public byte[] toByteArray() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(500);
        try {
            byteArrayOutputStream.write(this.getHighSpeedVideoSizes.toByteArray());
            java.util.Iterator<my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(it.next().toByteArray());
            }
            java.util.Iterator<my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate> it2 = this.Camera2StreamConfigurationMap.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(it2.next().toByteArray());
            }
            byteArrayOutputStream.write(this.getHighResolutionOutputSizeshNQ4ISI.toByteArray());
        } catch (java.io.IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
