package com.visa.cbp.encryptionutils.common;

/* loaded from: classes5.dex */
public final class DPM {
    public java.lang.String Camera2StreamConfigurationMap;
    public java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    public java.lang.String getHighSpeedVideoFpsRanges;
    public java.lang.String getHighSpeedVideoFpsRangesFor;
    public java.lang.String getHighSpeedVideoSizes;
    public java.lang.String getOutputFormats;

    public final java.lang.String getMapSalt() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setMapSalt(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public final java.lang.String getDeviceSalt() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setDeviceSalt(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public final java.lang.String getDeviceID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setDeviceID(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public final java.lang.String getWalletAccountID() {
        return this.getOutputFormats;
    }

    public final void setWalletAccountID(java.lang.String str) {
        this.getOutputFormats = str;
    }

    public final java.lang.String getIat() {
        return this.getHighSpeedVideoSizes;
    }

    public final void setIat(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public final java.lang.String getVServerNonce() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setVServerNonce(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public final java.lang.String toString() {
        return new com.google.gson.Gson().toJson(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.visa.cbp.encryptionutils.common.DPM)) {
            return false;
        }
        com.visa.cbp.encryptionutils.common.DPM dpm = (com.visa.cbp.encryptionutils.common.DPM) obj;
        if (getMapSalt() == null ? dpm.getMapSalt() != null : !getMapSalt().equals(dpm.getMapSalt())) {
            return false;
        }
        if (getDeviceSalt() == null ? dpm.getDeviceSalt() != null : !getDeviceSalt().equals(dpm.getDeviceSalt())) {
            return false;
        }
        if (getDeviceID() == null ? dpm.getDeviceID() != null : !getDeviceID().equals(dpm.getDeviceID())) {
            return false;
        }
        if (getWalletAccountID() == null ? dpm.getWalletAccountID() == null : getWalletAccountID().equals(dpm.getWalletAccountID())) {
            return getVServerNonce() != null ? getVServerNonce().equals(dpm.getVServerNonce()) : dpm.getVServerNonce() == null;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getMapSalt() != null ? getMapSalt().hashCode() : 0;
        int hashCode2 = getDeviceSalt() != null ? getDeviceSalt().hashCode() : 0;
        int hashCode3 = getDeviceID() != null ? getDeviceID().hashCode() : 0;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (getWalletAccountID() != null ? getWalletAccountID().hashCode() : 0)) * 31) + (getVServerNonce() != null ? getVServerNonce().hashCode() : 0);
    }
}
