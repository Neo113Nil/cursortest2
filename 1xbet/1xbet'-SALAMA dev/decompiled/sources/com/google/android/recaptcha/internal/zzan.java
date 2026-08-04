package com.google.android.recaptcha.internal;

import D6.C;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
final class zzan extends i implements Function2 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzap zzd;
    final /* synthetic */ zzdf zze;
    final /* synthetic */ p zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzap zzapVar, zzdf zzdfVar, p pVar, d dVar) {
        super(2, dVar);
        this.zzd = zzapVar;
        this.zze = zzdfVar;
        this.zzf = pVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzan(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026 A[Catch: Exception -> 0x001c, TRY_ENTER, TryCatch #0 {Exception -> 0x001c, blocks: (B:14:0x0026, B:16:0x0032, B:8:0x0018), top: B:48:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x004d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:13:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p077k6.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            j6.a r0 = j6.a.f14648a
            int r1 = r9.zzc
            f6.i r2 = p044f6.i.f13014a
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L16
            boolean r1 = r9.zzb
            long r5 = r9.zza
            p003a.a.p0(r10)
        L13:
            r10 = r1
            goto Lad
        L16:
            long r5 = r9.zza
            p003a.a.p0(r10)     // Catch: java.lang.Exception -> L1c
            goto L32
        L1c:
            r10 = move-exception
            goto L4e
        L1e:
            p003a.a.p0(r10)
            r5 = 1000(0x3e8, double:4.94E-321)
            r10 = r4
        L24:
            if (r10 == 0) goto Lb2
            com.google.android.recaptcha.internal.zzap r10 = r9.zzd     // Catch: java.lang.Exception -> L1c
            r9.zza = r5     // Catch: java.lang.Exception -> L1c
            r9.zzc = r4     // Catch: java.lang.Exception -> L1c
            java.lang.Object r10 = com.google.android.recaptcha.internal.zzap.zza(r10, r9)     // Catch: java.lang.Exception -> L1c
            if (r10 == r0) goto L4d
        L32:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r10 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r10     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzap r1 = r9.zzd     // Catch: java.lang.Exception -> L1c
            D6.s r1 = r1.zzf()     // Catch: java.lang.Exception -> L1c
            D6.t r1 = (D6.C0136t) r1     // Catch: java.lang.Exception -> L1c
            r1.C(r10)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzap r10 = r9.zzd     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzat r1 = com.google.android.recaptcha.internal.zzat.zzc     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzap.zzh(r10, r1)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzdf r10 = r9.zze     // Catch: java.lang.Exception -> L1c
            r10.zza()     // Catch: java.lang.Exception -> L1c
            r10 = r3
            goto L24
        L4d:
            return r0
        L4e:
            t6.p r1 = r9.zzf
            r1.f16478a = r10
            boolean r1 = r10 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r1 == 0) goto L6f
            r1 = r10
            com.google.android.play.core.integrity.StandardIntegrityException r1 = (com.google.android.play.core.integrity.StandardIntegrityException) r1
            int r1 = r1.getErrorCode()
            r7 = -100
            if (r1 == r7) goto L71
            r7 = -18
            if (r1 == r7) goto L71
            r7 = -12
            if (r1 == r7) goto L71
            r7 = -8
            if (r1 == r7) goto L71
            r7 = -3
            if (r1 == r7) goto L71
        L6f:
            r1 = r3
            goto L72
        L71:
            r1 = r4
        L72:
            if (r1 == 0) goto Lb1
            r9.zza = r5
            r9.zzb = r4
            r10 = 2
            r9.zzc = r10
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L83
        L81:
            r10 = r2
            goto La9
        L83:
            D6.m r10 = new D6.m
            i6.d r7 = P6.b.v(r9)
            r10.<init>(r4, r7)
            r10.s()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto La1
            i6.i r7 = r10.f1858e
            D6.J r7 = D6.E.h(r7)
            r7.c(r5, r10)
        La1:
            java.lang.Object r10 = r10.r()
            j6.a r7 = j6.a.f14648a
            if (r10 != r7) goto L81
        La9:
            if (r10 == r0) goto Lb0
            goto L13
        Lad:
            long r5 = r5 + r5
            goto L24
        Lb0:
            return r0
        Lb1:
            throw r10
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
