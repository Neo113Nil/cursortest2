package my.com.softspace.reader.internal.nfc;

/* loaded from: classes17.dex */
public class PaymentCardCommunicator implements my.com.softspace.reader.internal.nfc.NfcCommunicator, com.discover.mpos.sdk.card.connectors.CardConnector {
    private volatile android.nfc.tech.IsoDep getHighResolutionOutputSizeshNQ4ISI;
    private volatile android.nfc.NfcAdapter getHighSpeedVideoSizes;
    private final java.lang.String Camera2StreamConfigurationMap = "PaymentCardCommunicator";
    private long getHighSpeedVideoFpsRangesFor = 0;

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public long getConnectionTime() {
        return 0L;
    }

    @Override // my.com.softspace.reader.internal.nfc.NfcCommunicator
    public int getTechFlags() {
        return 3;
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public void setEnabled(boolean z) {
    }

    public PaymentCardCommunicator(android.nfc.NfcAdapter nfcAdapter) {
        this.getHighSpeedVideoSizes = nfcAdapter;
    }

    @Override // my.com.softspace.reader.internal.nfc.NfcCommunicator
    public my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus connectCard(android.nfc.Tag tag) {
        synchronized (this) {
            if (tag == null) {
                throw new java.lang.IllegalArgumentException("mTag can't be null");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = android.nfc.tech.IsoDep.get(tag);
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                return my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus.InvalidTagDetectedFail;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.setTimeout(3000);
                this.getHighResolutionOutputSizeshNQ4ISI.connect();
                return my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus.Successful;
            } catch (java.io.IOException e) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().e("PaymentCardCommunicator", e.getMessage(), e);
                return my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus.GeneralFail;
            }
        }
    }

    @Override // my.com.softspace.reader.internal.nfc.NfcCommunicator
    public java.util.List<java.lang.String> getTechList() {
        return java.util.Arrays.asList(android.nfc.tech.NfcA.class.getName(), android.nfc.tech.NfcB.class.getName());
    }

    @Override // my.com.softspace.reader.internal.nfc.NfcCommunicator
    public byte[] sendDataToCard(byte[] bArr) throws java.io.IOException {
        byte[] transceive;
        synchronized (this) {
            if (bArr != null) {
                if (bArr.length > 0) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                        throw new java.io.IOException("Either nfc listening is not registered or there's no NFC tag detected at the moment");
                    }
                    try {
                        my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("[OnCardDetect] cAPDU: ");
                        sb.append(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(bArr));
                        logger.i("PaymentCardCommunicator", sb.toString());
                        transceive = this.getHighResolutionOutputSizeshNQ4ISI.transceive(bArr);
                        if (transceive != null && transceive.length > 0) {
                            my.com.softspace.reader.ILogger logger2 = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[OnCardDetect] rAPDU: ");
                            sb2.append(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(transceive));
                            logger2.i("PaymentCardCommunicator", sb2.toString());
                        } else {
                            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i("PaymentCardCommunicator", "[OnCardDetect] rAPDU: response is empty");
                            throw new android.nfc.TagLostException("Tag was lost.");
                        }
                    } catch (java.lang.Exception e) {
                        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().e("PaymentCardCommunicator", e.getMessage(), e);
                        return null;
                    }
                }
            }
            throw new java.lang.IllegalArgumentException("raw data shouldn't be empty");
        }
        return transceive;
    }

    @Override // my.com.softspace.reader.internal.nfc.NfcCommunicator
    public boolean isCardConnected() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            return false;
        }
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.isConnected();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // my.com.softspace.reader.internal.nfc.NfcCommunicator
    public boolean removeCard(boolean z) {
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i("PaymentCardCommunicator", "removeCard close ? ".concat(java.lang.String.valueOf(z)));
        if (!z) {
            return false;
        }
        try {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                return true;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.close();
            this.getHighSpeedVideoSizes.ignore(this.getHighResolutionOutputSizeshNQ4ISI.getTag(), 1000, null, null);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            return true;
        } catch (java.io.IOException | java.lang.SecurityException e) {
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().e("PaymentCardCommunicator", "NFC card closure interrupted", e);
            return false;
        }
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public boolean getEnabled() {
        if (this.getHighSpeedVideoSizes != null) {
            return this.getHighSpeedVideoSizes.isEnabled();
        }
        return false;
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public long getExecutionTime() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public com.discover.mpos.sdk.card.apdu.base.ApduResponse<byte[], ? extends com.discover.mpos.sdk.card.apdu.error.ApduError> execute(com.discover.mpos.sdk.card.apdu.base.ApduRequest<?> apduRequest) {
        try {
            this.getHighSpeedVideoFpsRangesFor = 0L;
            long nanoTime = java.lang.System.nanoTime();
            final byte[] sendDataToCard = sendDataToCard(apduRequest.getB());
            long nanoTime2 = java.lang.System.nanoTime();
            if (sendDataToCard != null && sendDataToCard.length > 0) {
                this.getHighSpeedVideoFpsRangesFor = nanoTime2 - nanoTime;
            }
            return new com.discover.mpos.sdk.card.apdu.base.ApduResponse() { // from class: my.com.softspace.reader.internal.nfc.PaymentCardCommunicator.1
                @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
                /* renamed from: getError */
                public com.discover.mpos.sdk.card.apdu.error.ApduError getB() {
                    return null;
                }

                @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
                public boolean isExecutionFailed() {
                    return false;
                }

                @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
                public boolean isSuccessful() {
                    return true;
                }

                @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
                public void setContent(java.lang.Object obj) {
                }

                @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
                public void setError(com.discover.mpos.sdk.card.apdu.error.ApduError apduError) {
                }

                @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
                public java.lang.Object getContent() {
                    return sendDataToCard;
                }
            };
        } catch (java.lang.Exception e) {
            my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception : ");
            sb.append(e.getLocalizedMessage());
            logger.e("PaymentCardCommunicator", sb.toString());
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public void setOnConnectionEstablishedCallback(com.discover.mpos.sdk.card.connectors.CardConnector.OnConnectionEstablishedCallback onConnectionEstablishedCallback) {
        if (onConnectionEstablishedCallback != null) {
            onConnectionEstablishedCallback.onConnectionSet();
        }
    }
}
