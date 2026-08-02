package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public abstract class StaticParamsAbstraction {
    private java.lang.String cardHolderNameVCPCS;
    private java.lang.String countrycode5F55;
    private java.lang.String issuerIdentificationNumber;
    private java.lang.String kernelIdentifier;
    private com.visa.cbp.external.common.MsdData msdData;
    private java.lang.String pdol;
    private com.visa.cbp.external.common.QVSDCData qVSDCData;
    private com.visa.cbp.external.common.QRConsumerDeviceData qrConsumerDeviceData;
    private com.visa.cbp.external.common.Track2DataDec track2DataDec;
    private com.visa.cbp.external.common.Track2DataNotDec track2DataNotDec;

    public java.lang.String getKernelIdentifier() {
        return this.kernelIdentifier;
    }

    public void setKernelIdentifier(java.lang.String str) {
        this.kernelIdentifier = str;
    }

    public java.lang.String getCardHolderNameVCPCS() {
        return this.cardHolderNameVCPCS;
    }

    public void setCardHolderNameVCPCS(java.lang.String str) {
        this.cardHolderNameVCPCS = str;
    }

    public java.lang.String getPdol() {
        return this.pdol;
    }

    public void setPdol(java.lang.String str) {
        this.pdol = str;
    }

    public java.lang.String getCountrycode5F55() {
        return this.countrycode5F55;
    }

    public void setCountrycode5F55(java.lang.String str) {
        this.countrycode5F55 = str;
    }

    public java.lang.String getIssuerIdentificationNumber() {
        return this.issuerIdentificationNumber;
    }

    public void setIssuerIdentificationNumber(java.lang.String str) {
        this.issuerIdentificationNumber = str;
    }

    public com.visa.cbp.external.common.MsdData getMsdData() {
        return this.msdData;
    }

    public void setMsdData(com.visa.cbp.external.common.MsdData msdData) {
        this.msdData = msdData;
    }

    public com.visa.cbp.external.common.Track2DataDec getTrack2DataDec() {
        return this.track2DataDec;
    }

    public void setTrack2DataDec(com.visa.cbp.external.common.Track2DataDec track2DataDec) {
        this.track2DataDec = track2DataDec;
    }

    public com.visa.cbp.external.common.Track2DataNotDec getTrack2DataNotDec() {
        return this.track2DataNotDec;
    }

    public void setTrack2DataNotDec(com.visa.cbp.external.common.Track2DataNotDec track2DataNotDec) {
        this.track2DataNotDec = track2DataNotDec;
    }

    public com.visa.cbp.external.common.QVSDCData getQVSDCData() {
        return this.qVSDCData;
    }

    public void setQVSDCData(com.visa.cbp.external.common.QVSDCData qVSDCData) {
        this.qVSDCData = qVSDCData;
    }

    public com.visa.cbp.external.common.QRConsumerDeviceData getQrConsumerDeviceData() {
        return this.qrConsumerDeviceData;
    }

    public void setQrConsumerDeviceData(com.visa.cbp.external.common.QRConsumerDeviceData qRConsumerDeviceData) {
        this.qrConsumerDeviceData = qRConsumerDeviceData;
    }

    protected final /* synthetic */ void getHighSpeedVideoSizes(com.google.gson.Gson gson, com.google.gson.stream.JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
        if (i == 30) {
            if (!z) {
                this.countrycode5F55 = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN) {
                this.countrycode5F55 = jsonReader.nextString();
                return;
            } else {
                this.countrycode5F55 = java.lang.Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 60) {
            if (!z) {
                this.cardHolderNameVCPCS = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN) {
                this.cardHolderNameVCPCS = jsonReader.nextString();
                return;
            } else {
                this.cardHolderNameVCPCS = java.lang.Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 101) {
            if (z) {
                this.msdData = (com.visa.cbp.external.common.MsdData) gson.getAdapter(com.visa.cbp.external.common.MsdData.class).read2(jsonReader);
                return;
            } else {
                this.msdData = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 223) {
            if (!z) {
                this.issuerIdentificationNumber = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN) {
                this.issuerIdentificationNumber = jsonReader.nextString();
                return;
            } else {
                this.issuerIdentificationNumber = java.lang.Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 233) {
            if (!z) {
                this.kernelIdentifier = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN) {
                this.kernelIdentifier = jsonReader.nextString();
                return;
            } else {
                this.kernelIdentifier = java.lang.Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 278) {
            if (z) {
                this.qrConsumerDeviceData = (com.visa.cbp.external.common.QRConsumerDeviceData) gson.getAdapter(com.visa.cbp.external.common.QRConsumerDeviceData.class).read2(jsonReader);
                return;
            } else {
                this.qrConsumerDeviceData = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 281) {
            if (z) {
                this.qVSDCData = (com.visa.cbp.external.common.QVSDCData) gson.getAdapter(com.visa.cbp.external.common.QVSDCData.class).read2(jsonReader);
                return;
            } else {
                this.qVSDCData = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 347) {
            if (!z) {
                this.pdol = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN) {
                this.pdol = jsonReader.nextString();
                return;
            } else {
                this.pdol = java.lang.Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 408) {
            if (z) {
                this.track2DataDec = (com.visa.cbp.external.common.Track2DataDec) gson.getAdapter(com.visa.cbp.external.common.Track2DataDec.class).read2(jsonReader);
                return;
            } else {
                this.track2DataDec = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 421) {
            jsonReader.skipValue();
        } else if (z) {
            this.track2DataNotDec = (com.visa.cbp.external.common.Track2DataNotDec) gson.getAdapter(com.visa.cbp.external.common.Track2DataNotDec.class).read2(jsonReader);
        } else {
            this.track2DataNotDec = null;
            jsonReader.nextNull();
        }
    }

    protected final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.google.gson.Gson gson, com.google.gson.stream.JsonWriter jsonWriter, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        if (this != this.cardHolderNameVCPCS) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 203);
            jsonWriter.value(this.cardHolderNameVCPCS);
        }
        if (this != this.countrycode5F55) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
            jsonWriter.value(this.countrycode5F55);
        }
        if (this != this.issuerIdentificationNumber) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 348);
            jsonWriter.value(this.issuerIdentificationNumber);
        }
        if (this != this.kernelIdentifier) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 41);
            jsonWriter.value(this.kernelIdentifier);
        }
        if (this != this.msdData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
            com.visa.cbp.external.common.MsdData msdData = this.msdData;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.MsdData.class, msdData).write(jsonWriter, msdData);
        }
        if (this != this.pdol) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 5);
            jsonWriter.value(this.pdol);
        }
        if (this != this.qVSDCData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 174);
            com.visa.cbp.external.common.QVSDCData qVSDCData = this.qVSDCData;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.QVSDCData.class, qVSDCData).write(jsonWriter, qVSDCData);
        }
        if (this != this.qrConsumerDeviceData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 12);
            com.visa.cbp.external.common.QRConsumerDeviceData qRConsumerDeviceData = this.qrConsumerDeviceData;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.QRConsumerDeviceData.class, qRConsumerDeviceData).write(jsonWriter, qRConsumerDeviceData);
        }
        if (this != this.track2DataDec) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            com.visa.cbp.external.common.Track2DataDec track2DataDec = this.track2DataDec;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.Track2DataDec.class, track2DataDec).write(jsonWriter, track2DataDec);
        }
        if (this != this.track2DataNotDec) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 324);
            com.visa.cbp.external.common.Track2DataNotDec track2DataNotDec = this.track2DataNotDec;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.Track2DataNotDec.class, track2DataNotDec).write(jsonWriter, track2DataNotDec);
        }
    }
}
