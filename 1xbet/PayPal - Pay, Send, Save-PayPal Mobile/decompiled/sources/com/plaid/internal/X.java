package com.plaid.internal;

/* loaded from: classes16.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Date f5968a = new java.util.Date();

    public static com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel a(int i) {
        switch (i) {
            case 2:
                return com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.INFO;
            case 3:
                return com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.DEBUG;
            case 4:
                return com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.INFO;
            case 5:
                return com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.WARNING;
            case 6:
                return com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.ERROR;
            case 7:
                return com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.DEBUG;
            default:
                return com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.ERROR;
        }
    }
}
