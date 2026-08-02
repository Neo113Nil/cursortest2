package org.bouncycastle.cms;

/* loaded from: classes17.dex */
class CMSProcessableInputStream implements org.bouncycastle.cms.CMSProcessable, org.bouncycastle.cms.CMSReadable {
    private boolean getHighSpeedVideoFpsRanges = false;
    private java.io.InputStream getHighSpeedVideoSizes;

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(java.io.OutputStream outputStream) throws java.io.IOException, org.bouncycastle.cms.CMSException {
        getHighSpeedVideoSizes();
        org.bouncycastle.util.io.Streams.pipeAll(this.getHighSpeedVideoSizes, outputStream);
        this.getHighSpeedVideoSizes.close();
    }

    @Override // org.bouncycastle.cms.CMSReadable
    public java.io.InputStream getInputStream() {
        getHighSpeedVideoSizes();
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public java.lang.Object getContent() {
        return getInputStream();
    }

    private void getHighSpeedVideoSizes() {
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalStateException("CMSProcessableInputStream can only be used once");
            }
            this.getHighSpeedVideoFpsRanges = true;
        }
    }

    public CMSProcessableInputStream(java.io.InputStream inputStream) {
        this.getHighSpeedVideoSizes = inputStream;
    }
}
