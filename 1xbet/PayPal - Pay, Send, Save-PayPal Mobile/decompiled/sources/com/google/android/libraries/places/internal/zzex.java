package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzex {
    private final android.content.Context zza;
    private final com.google.common.util.concurrent.ListeningExecutorService zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;

    public zzex(android.content.Context context, com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listeningExecutorService, "");
        this.zza = context;
        this.zzb = listeningExecutorService;
        com.google.common.util.concurrent.ListenableFuture submit = listeningExecutorService.submit(new java.util.concurrent.Callable() { // from class: com.google.android.libraries.places.internal.zzew
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                android.content.SharedPreferences sharedPreferences;
                sharedPreferences = com.google.android.libraries.places.internal.zzex.this.zza.getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
                return sharedPreferences;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(submit, "");
        this.zzc = submit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String zzf(android.content.SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        java.lang.String string = sharedPreferences.getString("zb", "");
        return string == null ? "" : string;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
        final com.google.android.libraries.places.internal.zzes zzesVar = com.google.android.libraries.places.internal.zzes.zza;
        com.google.common.util.concurrent.ListenableFuture transform = com.google.common.util.concurrent.Futures.transform(this.zzc, new com.google.common.base.Function() { // from class: com.google.android.libraries.places.internal.zzet
            @Override // com.google.common.base.Function
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                java.lang.String zzf;
                kotlin.jvm.functions.Function1 function1 = kotlin.jvm.functions.Function1.this;
                zzf = com.google.android.libraries.places.internal.zzex.zzf((android.content.SharedPreferences) obj);
                return zzf;
            }
        }, this.zzb);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transform, "");
        return transform;
    }

    public final void zzb(final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.internal.zzeu
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                android.content.SharedPreferences.Editor putString;
                android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
                android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                if (edit == null || (putString = edit.putString("zb", str)) == null) {
                    return null;
                }
                putString.apply();
                return kotlin.Unit.INSTANCE;
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.google.common.util.concurrent.Futures.transform(this.zzc, new com.google.common.base.Function() { // from class: com.google.android.libraries.places.internal.zzev
            @Override // com.google.common.base.Function
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return (kotlin.Unit) kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }, this.zzb), "");
    }
}
