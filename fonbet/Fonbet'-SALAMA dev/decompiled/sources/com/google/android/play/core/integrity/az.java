package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class az implements StandardIntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final bn f11620a;

    /* renamed from: b, reason: collision with root package name */
    private final bt f11621b;

    public az(bn bnVar, bt btVar) {
        this.f11620a = bnVar;
        this.f11621b = btVar;
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l7) {
        final long b7 = prepareIntegrityTokenRequest.b();
        final long longValue = l7.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f11621b;
        final int i7 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(b7, longValue, i7) { // from class: com.google.android.play.core.integrity.bs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f11666b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f11667c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return bt.this.a(this.f11666b, this.f11667c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long b7 = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f11620a.e(b7, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return az.this.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
