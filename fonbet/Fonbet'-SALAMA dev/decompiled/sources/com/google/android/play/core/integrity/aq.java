package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final class aq extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f11604a;

    /* renamed from: b, reason: collision with root package name */
    private final y f11605b;

    public aq(String str, y yVar) {
        this.f11604a = str;
        this.f11605b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i7) {
        return this.f11605b.a(activity, i7);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f11604a;
    }
}
