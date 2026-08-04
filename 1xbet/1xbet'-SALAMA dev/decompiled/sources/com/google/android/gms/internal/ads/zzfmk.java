package com.google.android.gms.internal.ads;

import android.content.Context;
import io.sentry.logger.LoggerBatchProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class zzfmk {
    public static zzasm zza(Context context, String str, String str2) {
        return new zzfmj(context, str, str2).zzb(LoggerBatchProcessor.FLUSH_AFTER_MS);
    }
}
