package com.microblink.blinkid.licence.exception;

/* loaded from: classes10.dex */
public class LicenceLockedException extends com.microblink.blinkid.licence.exception.LicenceKeyException {
    public LicenceLockedException() {
        super("Active licence has been remotely locked");
    }
}
