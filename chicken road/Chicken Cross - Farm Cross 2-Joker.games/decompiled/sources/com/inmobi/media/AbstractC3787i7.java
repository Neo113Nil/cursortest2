package com.inmobi.media;

import android.os.HandlerThread;
import com.tiktok.util.UrlConst;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.i7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3787i7 {
    public static final boolean a(String str) {
        return str == null || StringsKt.trim((CharSequence) str).toString().length() == 0 || !(StringsKt.startsWith$default(str, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(str, UrlConst.HTTPS, false, 2, (Object) null));
    }

    public static final void a(HandlerThread handlerThread, String name) {
        Intrinsics.checkNotNullParameter(handlerThread, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            handlerThread.start();
        } catch (InternalError e) {
            String str = "Error occurred initialising " + name + " - " + e;
        }
    }

    public static final void a(Job job) {
        if (job == null || !job.isActive()) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }
}
