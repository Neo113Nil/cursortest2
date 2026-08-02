package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class ExpandedProductParsedResult extends com.google.zxing.client.result.ParsedResult {
    public static final java.lang.String KILOGRAM = "KG";
    public static final java.lang.String POUND = "LB";
    private final java.lang.String bestBeforeDate;
    private final java.lang.String expirationDate;
    private final java.lang.String lotNumber;
    private final java.lang.String packagingDate;
    private final java.lang.String price;
    private final java.lang.String priceCurrency;
    private final java.lang.String priceIncrement;
    private final java.lang.String productID;
    private final java.lang.String productionDate;
    private final java.lang.String rawText;
    private final java.lang.String sscc;
    private final java.util.Map<java.lang.String, java.lang.String> uncommonAIs;
    private final java.lang.String weight;
    private final java.lang.String weightIncrement;
    private final java.lang.String weightType;

    public ExpandedProductParsedResult(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.util.Map<java.lang.String, java.lang.String> map) {
        super(com.google.zxing.client.result.ParsedResultType.PRODUCT);
        this.rawText = str;
        this.productID = str2;
        this.sscc = str3;
        this.lotNumber = str4;
        this.productionDate = str5;
        this.packagingDate = str6;
        this.bestBeforeDate = str7;
        this.expirationDate = str8;
        this.weight = str9;
        this.weightType = str10;
        this.weightIncrement = str11;
        this.price = str12;
        this.priceIncrement = str13;
        this.priceCurrency = str14;
        this.uncommonAIs = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.zxing.client.result.ExpandedProductParsedResult)) {
            return false;
        }
        com.google.zxing.client.result.ExpandedProductParsedResult expandedProductParsedResult = (com.google.zxing.client.result.ExpandedProductParsedResult) obj;
        return java.util.Objects.equals(this.productID, expandedProductParsedResult.productID) && java.util.Objects.equals(this.sscc, expandedProductParsedResult.sscc) && java.util.Objects.equals(this.lotNumber, expandedProductParsedResult.lotNumber) && java.util.Objects.equals(this.productionDate, expandedProductParsedResult.productionDate) && java.util.Objects.equals(this.bestBeforeDate, expandedProductParsedResult.bestBeforeDate) && java.util.Objects.equals(this.expirationDate, expandedProductParsedResult.expirationDate) && java.util.Objects.equals(this.weight, expandedProductParsedResult.weight) && java.util.Objects.equals(this.weightType, expandedProductParsedResult.weightType) && java.util.Objects.equals(this.weightIncrement, expandedProductParsedResult.weightIncrement) && java.util.Objects.equals(this.price, expandedProductParsedResult.price) && java.util.Objects.equals(this.priceIncrement, expandedProductParsedResult.priceIncrement) && java.util.Objects.equals(this.priceCurrency, expandedProductParsedResult.priceCurrency) && java.util.Objects.equals(this.uncommonAIs, expandedProductParsedResult.uncommonAIs);
    }

    public final int hashCode() {
        int hashCode = java.util.Objects.hashCode(this.productID);
        int hashCode2 = java.util.Objects.hashCode(this.sscc);
        int hashCode3 = java.util.Objects.hashCode(this.lotNumber);
        int hashCode4 = java.util.Objects.hashCode(this.productionDate);
        int hashCode5 = java.util.Objects.hashCode(this.bestBeforeDate);
        int hashCode6 = java.util.Objects.hashCode(this.expirationDate);
        int hashCode7 = java.util.Objects.hashCode(this.weight);
        int hashCode8 = java.util.Objects.hashCode(this.weightType);
        int hashCode9 = java.util.Objects.hashCode(this.weightIncrement);
        int hashCode10 = java.util.Objects.hashCode(this.price);
        return (((((((((((hashCode ^ hashCode2) ^ hashCode3) ^ hashCode4) ^ hashCode5) ^ hashCode6) ^ hashCode7) ^ hashCode8) ^ hashCode9) ^ hashCode10) ^ java.util.Objects.hashCode(this.priceIncrement)) ^ java.util.Objects.hashCode(this.priceCurrency)) ^ java.util.Objects.hashCode(this.uncommonAIs);
    }

    public final java.lang.String getRawText() {
        return this.rawText;
    }

    public final java.lang.String getProductID() {
        return this.productID;
    }

    public final java.lang.String getSscc() {
        return this.sscc;
    }

    public final java.lang.String getLotNumber() {
        return this.lotNumber;
    }

    public final java.lang.String getProductionDate() {
        return this.productionDate;
    }

    public final java.lang.String getPackagingDate() {
        return this.packagingDate;
    }

    public final java.lang.String getBestBeforeDate() {
        return this.bestBeforeDate;
    }

    public final java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    public final java.lang.String getWeight() {
        return this.weight;
    }

    public final java.lang.String getWeightType() {
        return this.weightType;
    }

    public final java.lang.String getWeightIncrement() {
        return this.weightIncrement;
    }

    public final java.lang.String getPrice() {
        return this.price;
    }

    public final java.lang.String getPriceIncrement() {
        return this.priceIncrement;
    }

    public final java.lang.String getPriceCurrency() {
        return this.priceCurrency;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getUncommonAIs() {
        return this.uncommonAIs;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final java.lang.String getDisplayResult() {
        return java.lang.String.valueOf(this.rawText);
    }
}
