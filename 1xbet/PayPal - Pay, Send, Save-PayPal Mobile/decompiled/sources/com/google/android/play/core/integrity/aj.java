package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f3794a;
    private final com.google.android.play.integrity.internal.s b;
    private final java.lang.String c;
    private final android.content.Context d;
    private final com.google.android.play.core.integrity.at e;
    private final com.google.android.play.core.integrity.k f;

    aj(android.content.Context context, com.google.android.play.integrity.internal.s sVar, com.google.android.play.core.integrity.at atVar, com.google.android.play.core.integrity.k kVar) {
        this.c = context.getPackageName();
        this.b = sVar;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        if (com.google.android.play.integrity.internal.ai.b(context)) {
            this.f3794a = new com.google.android.play.integrity.internal.ae(context, sVar, "IntegrityService", com.google.android.play.core.integrity.ak.f3795a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.z
                public final java.lang.Object a(android.os.IBinder iBinder) {
                    return com.google.android.play.integrity.internal.m.b(iBinder);
                }
            }, null);
        } else {
            sVar.b("Phonesky is not installed.", new java.lang.Object[0]);
            this.f3794a = null;
        }
    }

    static /* synthetic */ android.os.Bundle a(com.google.android.play.core.integrity.aj ajVar, byte[] bArr, java.lang.Long l, android.os.Parcelable parcelable) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new java.util.ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    final com.google.android.gms.tasks.Task b(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f3794a == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.d("requestAndShowDialog(%s, %s)", this.c, java.lang.Integer.valueOf(i));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f3794a.t(new com.google.android.play.core.integrity.ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task c(com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest) {
        if (this.f3794a == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-2, null));
        }
        if (com.google.android.play.integrity.internal.ai.a(this.d) < 82380000) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-14, null));
        }
        try {
            byte[] decode = android.util.Base64.decode(integrityTokenRequest.nonce(), 10);
            java.lang.Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof com.google.android.play.core.integrity.ao) {
            }
            this.b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
            this.f3794a.t(new com.google.android.play.core.integrity.af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (java.lang.IllegalArgumentException e) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-13, e));
        }
    }
}
