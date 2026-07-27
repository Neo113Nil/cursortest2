package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import com.inmobi.adquality.models.AdQualityResult;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes6.dex */
public final class Hi implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdQualityResult f6606a;

    public Hi(AdQualityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f6606a = result;
    }

    @Override // com.inmobi.media.O0
    public final Object a() {
        boolean z;
        try {
            z = true;
            BuildersKt__BuildersKt.runBlocking$default(null, new Gi(this, null), 1, null);
        } catch (SQLiteException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
