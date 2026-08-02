package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class VINParsedResult extends com.google.zxing.client.result.ParsedResult {
    private final java.lang.String countryCode;
    private final int modelYear;
    private final char plantCode;
    private final java.lang.String sequentialNumber;
    private final java.lang.String vehicleAttributes;
    private final java.lang.String vehicleDescriptorSection;
    private final java.lang.String vehicleIdentifierSection;
    private final java.lang.String vin;
    private final java.lang.String worldManufacturerID;

    public VINParsedResult(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, char c, java.lang.String str7) {
        super(com.google.zxing.client.result.ParsedResultType.VIN);
        this.vin = str;
        this.worldManufacturerID = str2;
        this.vehicleDescriptorSection = str3;
        this.vehicleIdentifierSection = str4;
        this.countryCode = str5;
        this.vehicleAttributes = str6;
        this.modelYear = i;
        this.plantCode = c;
        this.sequentialNumber = str7;
    }

    public final java.lang.String getVIN() {
        return this.vin;
    }

    public final java.lang.String getWorldManufacturerID() {
        return this.worldManufacturerID;
    }

    public final java.lang.String getVehicleDescriptorSection() {
        return this.vehicleDescriptorSection;
    }

    public final java.lang.String getVehicleIdentifierSection() {
        return this.vehicleIdentifierSection;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getVehicleAttributes() {
        return this.vehicleAttributes;
    }

    public final int getModelYear() {
        return this.modelYear;
    }

    public final char getPlantCode() {
        return this.plantCode;
    }

    public final java.lang.String getSequentialNumber() {
        return this.sequentialNumber;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final java.lang.String getDisplayResult() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(50);
        sb.append(this.worldManufacturerID);
        sb.append(' ');
        sb.append(this.vehicleDescriptorSection);
        sb.append(' ');
        sb.append(this.vehicleIdentifierSection);
        sb.append('\n');
        java.lang.String str = this.countryCode;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.modelYear);
        sb.append(' ');
        sb.append(this.plantCode);
        sb.append(' ');
        sb.append(this.sequentialNumber);
        sb.append('\n');
        return sb.toString();
    }
}
