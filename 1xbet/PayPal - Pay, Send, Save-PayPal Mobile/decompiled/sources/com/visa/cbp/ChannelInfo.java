package com.visa.cbp;

/* loaded from: classes16.dex */
public class ChannelInfo {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "ChannelInfo";
    private static com.visa.cbp.ChannelInfo getHighSpeedVideoFpsRanges;
    private java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;

    public static com.visa.cbp.ChannelInfo ReplenishAckRequest() {
        com.visa.cbp.ChannelInfo channelInfo;
        synchronized (com.visa.cbp.ChannelInfo.class) {
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new com.visa.cbp.ChannelInfo();
            }
            channelInfo = getHighSpeedVideoFpsRanges;
        }
        return channelInfo;
    }

    public com.visa.cbp.mpqr.facade.MerchantQR[] ConfirmReplenishRequest(java.lang.String str) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException {
        if (str != null) {
            if (getHighSpeedVideoFpsRangesFor(str)) {
                return getHighSpeedVideoFpsRanges(str);
            }
            throw new com.visa.cbp.mpqr.facade.VisaPaymentMPQRException(com.visa.cbp.mpqr.facade.MpqrErrorType.INVALID_CRC);
        }
        throw new com.visa.cbp.mpqr.facade.VisaPaymentMPQRException(com.visa.cbp.mpqr.facade.MpqrErrorType.INVALID_MPQR_CODE);
    }

    public com.visa.cbp.mpqr.facade.TokenPaymentRequest ReplenishAckRequest(com.visa.cbp.mpqr.facade.MerchantQR[] merchantQRArr) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException {
        com.visa.cbp.mpqr.facade.TokenPaymentRequest tokenPaymentRequest = new com.visa.cbp.mpqr.facade.TokenPaymentRequest();
        if (merchantQRArr != null) {
            tokenPaymentRequest.initialize();
            if (values(merchantQRArr, "01").length() > 0) {
                tokenPaymentRequest.setInitiationMethod(values(merchantQRArr, "01"));
            }
            if (values(merchantQRArr, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD).length() > 0) {
                tokenPaymentRequest.getRecipientDetails().getRecipientPaymentInstrument().setPrimaryAccountNumber(values(merchantQRArr, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD));
            }
            java.lang.String values = values(merchantQRArr, "52");
            if (values.length() > 0) {
                tokenPaymentRequest.setMerchantCategoryCode(values);
            }
            java.lang.String values2 = values(merchantQRArr, "53");
            if (values2.length() > 0) {
                tokenPaymentRequest.setTransactionCurrencyCode(values2);
            }
            java.lang.String values3 = values(merchantQRArr, "54");
            if (values3.length() > 0) {
                tokenPaymentRequest.setAmount(values3.replace(".", ""));
            }
            if (values(merchantQRArr, "58").length() > 0) {
                tokenPaymentRequest.getRecipientDetails().setrecipientCountryCode(values(merchantQRArr, "58"));
            }
            java.lang.String values4 = values(merchantQRArr, "59");
            if (values4.length() > 0) {
                tokenPaymentRequest.getCardAcceptor().setName(values4);
                tokenPaymentRequest.getRecipientDetails().setRecipientName(values4);
            }
            java.lang.String values5 = values(merchantQRArr, "60");
            if (values5.length() > 0) {
                tokenPaymentRequest.getCardAcceptor().getAddress().setCity(values5);
                tokenPaymentRequest.getRecipientDetails().setrecipientCity(values5);
            }
            java.lang.String values6 = values(merchantQRArr, "61");
            if (values6.length() > 0) {
                tokenPaymentRequest.getCardAcceptor().getAddress().setzipCode(values6);
                tokenPaymentRequest.getRecipientDetails().setrecipientPostalCode(values6);
            }
            if (values(merchantQRArr, "62").length() > 0) {
                java.util.Map<java.lang.String, java.lang.String> highSpeedVideoFpsRangesFor = com.visa.cbp.init.getHighSpeedVideoFpsRangesFor(values(merchantQRArr, "62"));
                if (highSpeedVideoFpsRangesFor.get("01") != null) {
                    tokenPaymentRequest.getPushFundsTransaction().setSecondaryId(highSpeedVideoFpsRangesFor.get("01"));
                }
                if (highSpeedVideoFpsRangesFor.get(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD) != null) {
                    tokenPaymentRequest.getPushFundsTransaction().getPurchaseIdentifier().setReferenceNumber(highSpeedVideoFpsRangesFor.get(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD));
                }
                highSpeedVideoFpsRangesFor.get("03");
                highSpeedVideoFpsRangesFor.get("04");
                if (highSpeedVideoFpsRangesFor.get("05") != null) {
                    tokenPaymentRequest.getPushFundsTransaction().getPurchaseIdentifier().setReferenceNumber(highSpeedVideoFpsRangesFor.get("05"));
                }
                highSpeedVideoFpsRangesFor.get(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_DISCOVER);
                if (highSpeedVideoFpsRangesFor.get("07") != null) {
                    tokenPaymentRequest.getCardAcceptor().setTerminalId(highSpeedVideoFpsRangesFor.get("07"));
                }
                highSpeedVideoFpsRangesFor.get("08");
                highSpeedVideoFpsRangesFor.get("09");
            }
            return tokenPaymentRequest;
        }
        throw new com.visa.cbp.mpqr.facade.VisaPaymentMPQRException(com.visa.cbp.mpqr.facade.MpqrErrorType.INVALID_MPQR_CODE);
    }

    public com.visa.cbp.mpqr.facade.MpqrAmounts values(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.visa.cbp.mpqr.facade.MpqrAmounts mpqrAmounts = new com.visa.cbp.mpqr.facade.MpqrAmounts();
        if (str != null && str.length() > 0 && str2 != null && str2.length() > 0) {
            java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
            java.lang.Double valueOf2 = java.lang.Double.valueOf(str.replace(".", ""));
            java.lang.Double valueOf3 = java.lang.Double.valueOf(0.0d);
            if (str3 != null && str3.length() > 0) {
                valueOf3 = java.lang.Double.valueOf(str3.replace(".", ""));
            }
            int intValue = valueOf2.intValue();
            if (java.lang.Integer.valueOf(str2).intValue() == 1 || java.lang.Integer.valueOf(str2).intValue() == 2) {
                valueOf = valueOf3;
            } else {
                if (java.lang.Integer.valueOf(str2).intValue() == 3) {
                    valueOf = java.lang.Double.valueOf((valueOf2.doubleValue() * java.lang.Double.valueOf(str3).doubleValue()) / 100.0d);
                }
                mpqrAmounts.setAmount(java.lang.String.valueOf(intValue));
                if (str3 != null && str3.length() > 0) {
                    mpqrAmounts.setTip(java.lang.String.valueOf(valueOf.intValue()));
                }
            }
            intValue += valueOf.intValue();
            mpqrAmounts.setAmount(java.lang.String.valueOf(intValue));
            if (str3 != null) {
                mpqrAmounts.setTip(java.lang.String.valueOf(valueOf.intValue()));
            }
        }
        return mpqrAmounts;
    }

    public java.lang.String values(com.visa.cbp.mpqr.facade.MerchantQR[] merchantQRArr, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.visa.cbp.mpqr.facade.MerchantQR merchantQR : merchantQRArr) {
            hashMap.put(merchantQR.getTag(), merchantQR);
        }
        if (hashMap.get(str) != null) {
            return ((com.visa.cbp.mpqr.facade.MerchantQR) hashMap.get(str)).getValue();
        }
        return "";
    }

    private boolean getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        int length = str.length();
        int i = length - 4;
        try {
            java.lang.String substring = str.substring(i, length);
            java.lang.String hexString = java.lang.Integer.toHexString(com.visa.cbp.init.getHighSpeedVideoSizes(str.substring(0, i).getBytes()));
            if (hexString.length() % 2 != 0) {
                hexString = "0".concat(java.lang.String.valueOf(hexString));
            }
            return substring.equalsIgnoreCase(hexString);
        } catch (java.lang.RuntimeException unused) {
            throw new com.visa.cbp.mpqr.facade.VisaPaymentMPQRException(com.visa.cbp.mpqr.facade.MpqrErrorType.INVALID_MPQR_FORMAT);
        }
    }

    private com.visa.cbp.mpqr.facade.MerchantQR[] getHighSpeedVideoFpsRanges(java.lang.String str) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException {
        java.util.Map<java.lang.String, java.lang.String> highSpeedVideoFpsRangesFor = com.visa.cbp.init.getHighSpeedVideoFpsRangesFor(str);
        this.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRangesFor();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : highSpeedVideoFpsRangesFor.entrySet()) {
            java.lang.String value = entry.getValue();
            arrayList.add(new com.visa.cbp.mpqr.facade.MerchantQR(entry.getKey(), this.Camera2StreamConfigurationMap.get(entry.getKey()), java.lang.Integer.toString(value.length()), value));
        }
        return (com.visa.cbp.mpqr.facade.MerchantQR[]) arrayList.toArray(new com.visa.cbp.mpqr.facade.MerchantQR[arrayList.size()]);
    }

    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX, "Payload Format Indicator");
        hashMap.put("01", "Point of Initiation Method");
        hashMap.put(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD, "mVisa Merchant ID");
        hashMap.put("03", "Business Application ID");
        hashMap.put("52", "Merchant Category Code");
        hashMap.put("53", "Currency Code");
        hashMap.put("54", "Transaction Amount");
        hashMap.put("55", "Tip");
        hashMap.put("56", "Value of Convenience Fee – Flat");
        hashMap.put("57", "Value of Convenience Fee – Percentage");
        hashMap.put("58", com.daon.dmds.recognizers.IDMDSResultCreatorFields.CountryCode);
        hashMap.put("59", "Merchant Name");
        hashMap.put("60", "Merchant City");
        hashMap.put("61", "Postal Code");
        hashMap.put("62", "Additional Data Field");
        hashMap.put("63", "CRC");
        return hashMap;
    }
}
