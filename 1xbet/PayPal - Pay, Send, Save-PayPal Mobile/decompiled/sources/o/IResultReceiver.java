package o;

/* loaded from: classes5.dex */
public final class IResultReceiver extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;

    public IResultReceiver(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.enp.ProvisionRequestWithEnrollId provisionRequestWithEnrollId = (com.visa.cbp.external.enp.ProvisionRequestWithEnrollId) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.clientAppID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 118);
            jsonWriter.value(provisionRequestWithEnrollId.clientAppID);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.clientDeviceID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.visa.cbp.getCertUsage.getAppPrgrmIDAID);
            jsonWriter.value(provisionRequestWithEnrollId.clientDeviceID);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.clientWalletAccountEmailAddress) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 205);
            jsonWriter.value(provisionRequestWithEnrollId.clientWalletAccountEmailAddress);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.clientWalletAccountEmailAddressHash) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 351);
            jsonWriter.value(provisionRequestWithEnrollId.clientWalletAccountEmailAddressHash);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.clientWalletAccountID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 100);
            jsonWriter.value(provisionRequestWithEnrollId.clientWalletAccountID);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.encRiskDataInfo) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 319);
            jsonWriter.value(provisionRequestWithEnrollId.encRiskDataInfo);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.ip4address) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 299);
            jsonWriter.value(provisionRequestWithEnrollId.ip4address);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.issuerAuthCode) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 452);
            jsonWriter.value(provisionRequestWithEnrollId.issuerAuthCode);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.location) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 432);
            jsonWriter.value(provisionRequestWithEnrollId.location);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.locationSource) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
            jsonWriter.value(provisionRequestWithEnrollId.locationSource);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.presentationType) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            o.IResultReceiver2Stub iResultReceiver2Stub = new o.IResultReceiver2Stub();
            java.util.List<java.lang.String> list = provisionRequestWithEnrollId.presentationType;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iResultReceiver2Stub, list).write(jsonWriter, list);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.protectionType) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
            jsonWriter.value(provisionRequestWithEnrollId.protectionType);
        }
        if (provisionRequestWithEnrollId != provisionRequestWithEnrollId.termsAndConditions) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 312);
            com.visa.cbp.external.common.TermsAndConditions termsAndConditions = provisionRequestWithEnrollId.termsAndConditions;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.TermsAndConditions.class, termsAndConditions).write(jsonWriter, termsAndConditions);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.visa.cbp.external.enp.ProvisionRequestWithEnrollId provisionRequestWithEnrollId = new com.visa.cbp.external.enp.ProvisionRequestWithEnrollId();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 53:
                    if (!z) {
                        provisionRequestWithEnrollId.location = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.location = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 90:
                    if (!z) {
                        provisionRequestWithEnrollId.clientWalletAccountID = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.clientWalletAccountID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 108:
                    if (!z) {
                        provisionRequestWithEnrollId.clientAppID = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.clientAppID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 140:
                    if (!z) {
                        provisionRequestWithEnrollId.encRiskDataInfo = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.encRiskDataInfo = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 141:
                    if (!z) {
                        provisionRequestWithEnrollId.termsAndConditions = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.termsAndConditions = (com.visa.cbp.external.common.TermsAndConditions) gson.getAdapter(com.visa.cbp.external.common.TermsAndConditions.class).read2(jsonReader);
                        break;
                    }
                case 167:
                    if (!z) {
                        provisionRequestWithEnrollId.clientDeviceID = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.clientDeviceID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 205:
                    if (!z) {
                        provisionRequestWithEnrollId.presentationType = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.presentationType = (java.util.List) gson.getAdapter(new o.IResultReceiver2Stub()).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                    if (!z) {
                        provisionRequestWithEnrollId.ip4address = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.ip4address = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 303:
                    if (!z) {
                        provisionRequestWithEnrollId.protectionType = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.protectionType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 308:
                    if (!z) {
                        provisionRequestWithEnrollId.issuerAuthCode = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.issuerAuthCode = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 317:
                    if (!z) {
                        provisionRequestWithEnrollId.clientWalletAccountEmailAddressHash = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.clientWalletAccountEmailAddressHash = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY /* 402 */:
                    if (!z) {
                        provisionRequestWithEnrollId.locationSource = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.locationSource = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 419:
                    if (!z) {
                        provisionRequestWithEnrollId.clientWalletAccountEmailAddress = null;
                        break;
                    } else {
                        provisionRequestWithEnrollId.clientWalletAccountEmailAddress = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return provisionRequestWithEnrollId;
    }
}
