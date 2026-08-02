package com.bbflight.background_downloader;

import android.app.Activity;
import android.content.Intent;
import androidx.core.content.FileProvider;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.f;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

/* renamed from: com.bbflight.background_downloader.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0670t0 implements com.google.android.datatransport.runtime.dagger.internal.b {
    public static final boolean a(Activity activity, String filePath, String mimeType) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setDataAndType(FileProvider.getUriForFile(activity, activity.getPackageName() + ".com.bbflight.background_downloader.fileprovider", new File(filePath)), mimeType);
            intent.addFlags(268435459);
            activity.startActivity(intent);
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }

    @Override // javax.inject.a
    public Object get() {
        com.baseflow.permissionhandler.a aVar = new com.baseflow.permissionhandler.a();
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(com.google.android.datatransport.e.a, new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(30000L, DurationKt.MILLIS_IN_DAY, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(com.google.android.datatransport.e.c, new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(1000L, DurationKt.MILLIS_IN_DAY, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(f.b.b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(com.google.android.datatransport.e.b, new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(DurationKt.MILLIS_IN_DAY, DurationKt.MILLIS_IN_DAY, unmodifiableSet));
        if (hashMap.keySet().size() < com.google.android.datatransport.e.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(aVar, hashMap);
    }
}
