package com.paypal.android.logger;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/android/logger/LoggerAlreadyInstalledException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LoggerAlreadyInstalledException extends java.lang.Exception {
    public LoggerAlreadyInstalledException() {
        super("A logger is already installed. Call Logger.uninstall() prior to installing a new logger.");
    }
}
