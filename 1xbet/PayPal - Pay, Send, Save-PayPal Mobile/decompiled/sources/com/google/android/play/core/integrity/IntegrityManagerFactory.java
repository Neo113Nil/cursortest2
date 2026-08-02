package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
public class IntegrityManagerFactory {
    public static com.google.android.play.core.integrity.IntegrityManager create(android.content.Context context) {
        return com.google.android.play.core.integrity.z.a(context).a();
    }

    public static com.google.android.play.core.integrity.StandardIntegrityManager createStandard(android.content.Context context) {
        return com.google.android.play.core.integrity.ax.a(context).a();
    }

    private IntegrityManagerFactory() {
    }
}
