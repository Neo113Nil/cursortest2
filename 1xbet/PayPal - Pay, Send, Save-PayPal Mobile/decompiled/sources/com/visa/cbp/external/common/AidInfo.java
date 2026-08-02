package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class AidInfo extends com.visa.cbp.external.common.StaticParamsAbstraction {
    private java.lang.String CVMrequired;
    private com.visa.cbp.external.common.ODAData ODAData;
    private java.lang.String aid;
    private java.lang.String appPrgrmID;
    private java.lang.String appPrgrmIDAID;
    private java.lang.String applicationLabel;
    private java.lang.String asrpd;
    private java.lang.String aucAID;
    private java.lang.String cap;
    private boolean isReperso = false;
    private java.lang.String issuerApplicationDiscretionaryData;
    private java.lang.String issuerDiscretionaryData;
    private java.lang.String priority;

    public java.lang.String getIssuerApplicationDiscretionaryData() {
        return this.issuerApplicationDiscretionaryData;
    }

    public void setIssuerApplicationDiscretionaryData(java.lang.String str) {
        this.issuerApplicationDiscretionaryData = str;
    }

    public java.lang.String getIssuerDiscretionaryData() {
        return this.issuerDiscretionaryData;
    }

    public void setIssuerDiscretionaryData(java.lang.String str) {
        this.issuerDiscretionaryData = str;
    }

    public java.lang.String getApplicationLabel() {
        return this.applicationLabel;
    }

    public void setApplicationLabel(java.lang.String str) {
        this.applicationLabel = str;
    }

    public java.lang.String getAid() {
        return this.aid;
    }

    public void setAid(java.lang.String str) {
        this.aid = str;
    }

    public java.lang.String getPriority() {
        return this.priority;
    }

    public void setPriority(java.lang.String str) {
        this.priority = str;
    }

    public java.lang.String getCap() {
        return this.cap;
    }

    public void setCap(java.lang.String str) {
        this.cap = str;
    }

    public java.lang.String getCVMrequired() {
        return this.CVMrequired;
    }

    public void setCVMrequired(java.lang.String str) {
        this.CVMrequired = str;
    }

    public java.lang.String getAsrpd() {
        return this.asrpd;
    }

    public void setAsrpd(java.lang.String str) {
        this.asrpd = str;
    }

    public java.lang.String getAucAID() {
        return this.aucAID;
    }

    public void setAucAID(java.lang.String str) {
        this.aucAID = str;
    }

    public java.lang.String getAppPrgrmIDAID() {
        return this.appPrgrmIDAID;
    }

    public void setAppPrgrmIDAID(java.lang.String str) {
        this.appPrgrmIDAID = str;
    }

    public com.visa.cbp.external.common.ODAData getODAData() {
        return this.ODAData;
    }

    public void setODAData(com.visa.cbp.external.common.ODAData oDAData) {
        this.ODAData = oDAData;
    }

    public java.lang.String getAppPrgrmID() {
        return this.appPrgrmID;
    }

    public void setAppPrgrmID(java.lang.String str) {
        this.appPrgrmID = str;
    }

    public boolean isReperso() {
        return this.isReperso;
    }

    public void setReperso(boolean z) {
        this.isReperso = z;
    }

    public final /* synthetic */ void getHighSpeedVideoSizes(com.google.gson.Gson gson, com.google.gson.stream.JsonWriter jsonWriter, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        jsonWriter.beginObject();
        if (this != this.CVMrequired) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 304);
            jsonWriter.value(this.CVMrequired);
        }
        if (this != this.ODAData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
            com.visa.cbp.external.common.ODAData oDAData = this.ODAData;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.ODAData.class, oDAData).write(jsonWriter, oDAData);
        }
        if (this != this.aid) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 411);
            jsonWriter.value(this.aid);
        }
        if (this != this.appPrgrmID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY);
            jsonWriter.value(this.appPrgrmID);
        }
        if (this != this.appPrgrmIDAID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
            jsonWriter.value(this.appPrgrmIDAID);
        }
        if (this != this.applicationLabel) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 215);
            jsonWriter.value(this.applicationLabel);
        }
        if (this != this.asrpd) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            jsonWriter.value(this.asrpd);
        }
        if (this != this.aucAID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 134);
            jsonWriter.value(this.aucAID);
        }
        if (this != this.cap) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 343);
            jsonWriter.value(this.cap);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        jsonWriter.value(this.isReperso);
        if (this != this.issuerApplicationDiscretionaryData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE);
            jsonWriter.value(this.issuerApplicationDiscretionaryData);
        }
        if (this != this.issuerDiscretionaryData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 415);
            jsonWriter.value(this.issuerDiscretionaryData);
        }
        if (this != this.priority) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 76);
            jsonWriter.value(this.priority);
        }
        getHighResolutionOutputSizeshNQ4ISI(gson, jsonWriter, getinputsizeshnq4isi);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void getHighSpeedVideoFpsRanges(com.google.gson.Gson gson, com.google.gson.stream.JsonReader jsonReader, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 20:
                    if (!z) {
                        this.aucAID = null;
                        break;
                    } else {
                        this.aucAID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 24:
                    if (!z) {
                        this.CVMrequired = null;
                        break;
                    } else {
                        this.CVMrequired = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 38:
                    if (!z) {
                        this.appPrgrmIDAID = null;
                        break;
                    } else {
                        this.appPrgrmIDAID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 125:
                    if (!z) {
                        this.applicationLabel = null;
                        break;
                    } else {
                        this.applicationLabel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    if (!z) {
                        break;
                    } else {
                        this.isReperso = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case 156:
                    if (!z) {
                        this.issuerDiscretionaryData = null;
                        break;
                    } else {
                        this.issuerDiscretionaryData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 166:
                    if (!z) {
                        this.cap = null;
                        break;
                    } else {
                        this.cap = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 203:
                    if (!z) {
                        this.asrpd = null;
                        break;
                    } else {
                        this.asrpd = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                    if (!z) {
                        this.issuerApplicationDiscretionaryData = null;
                        break;
                    } else {
                        this.issuerApplicationDiscretionaryData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                    if (!z) {
                        this.appPrgrmID = null;
                        break;
                    } else {
                        this.appPrgrmID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 299:
                    if (!z) {
                        this.aid = null;
                        break;
                    } else {
                        this.aid = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 380:
                    if (!z) {
                        this.ODAData = null;
                        break;
                    } else {
                        this.ODAData = (com.visa.cbp.external.common.ODAData) gson.getAdapter(com.visa.cbp.external.common.ODAData.class).read2(jsonReader);
                        break;
                    }
                case 438:
                    if (!z) {
                        this.priority = null;
                        break;
                    } else {
                        this.priority = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    getHighSpeedVideoSizes(gson, jsonReader, highResolutionOutputSizeshNQ4ISI);
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
    }
}
