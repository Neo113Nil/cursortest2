package com.inmobi.media;

/* renamed from: com.inmobi.media.uh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2807uh implements com.inmobi.media.M0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.adquality.models.AdQualityResult f5489a;

    public C2807uh(com.inmobi.adquality.models.AdQualityResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        this.f5489a = result;
    }

    @Override // com.inmobi.media.M0
    public final java.lang.Object a() {
        boolean z;
        try {
            z = true;
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2780th(this, null), 1, null);
        } catch (android.database.sqlite.SQLiteException unused) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
