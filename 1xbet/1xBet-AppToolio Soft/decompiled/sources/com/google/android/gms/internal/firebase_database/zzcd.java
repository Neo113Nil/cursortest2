package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.Logger;

/* loaded from: classes.dex */
final /* synthetic */ class zzcd {
    static final /* synthetic */ int[] zzhn = new int[Logger.Level.values().length];

    static {
        try {
            zzhn[Logger.Level.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzhn[Logger.Level.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzhn[Logger.Level.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzhn[Logger.Level.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzhn[Logger.Level.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
