package com.google.android.play.core.hsdp.service;

import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzae extends zzaf {
    final /* synthetic */ zzai zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzae(zzai zzaiVar) {
        super(zzaiVar, null);
        Objects.requireNonNull(zzaiVar);
        this.zza = zzaiVar;
    }

    @Override // com.google.android.play.core.hsdp.service.zzaf
    final void zzd(final String str) {
        r1.zzs().post(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzai.zzm(zzai.this, str, r3, r4);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzaf
    final void zze(String str) {
        r0.zzs().post(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzai.zzm(zzai.this, str, r3, r4);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzaf
    final void zzf(final String str, final int i, final String str2) {
        r3.zzs().post(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzai.zzm(zzai.this, str, r3, r4);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzaf
    final void zzg(final String str) {
        r1.zzs().post(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzai.zzm(zzai.this, str, r3, r4);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzaf
    final void zzh(String str) {
        r0.zzs().post(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzai.zzm(zzai.this, str, r3, r4);
            }
        });
    }
}
