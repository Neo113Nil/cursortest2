package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class RecipientOperator {
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    public boolean isMacBased() {
        return this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.operator.MacCalculator;
    }

    public boolean isAEADBased() {
        return this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.operator.InputAEADDecryptor;
    }

    public byte[] getMac() {
        return ((org.bouncycastle.operator.MacCalculator) this.getHighResolutionOutputSizeshNQ4ISI).getMac();
    }

    public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        return obj instanceof org.bouncycastle.operator.InputDecryptor ? ((org.bouncycastle.operator.InputDecryptor) obj).getInputStream(inputStream) : new org.bouncycastle.util.io.TeeInputStream(inputStream, ((org.bouncycastle.operator.MacCalculator) this.getHighResolutionOutputSizeshNQ4ISI).getOutputStream());
    }

    public java.io.OutputStream getAADStream() {
        return ((org.bouncycastle.operator.InputAEADDecryptor) this.getHighResolutionOutputSizeshNQ4ISI).getAADStream();
    }

    public RecipientOperator(org.bouncycastle.operator.MacCalculator macCalculator) {
        this.getHighResolutionOutputSizeshNQ4ISI = macCalculator;
    }

    public RecipientOperator(org.bouncycastle.operator.InputDecryptor inputDecryptor) {
        this.getHighResolutionOutputSizeshNQ4ISI = inputDecryptor;
    }
}
