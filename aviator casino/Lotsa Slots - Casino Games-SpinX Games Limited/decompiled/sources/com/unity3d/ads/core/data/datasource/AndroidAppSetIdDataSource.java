package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidAppSetIdDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_appSetIdFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "appSetId", "getAppSetId", "()Ljava/lang/String;", "isCollecting", "", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidAppSetIdDataSource {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _appSetIdFlow;
    private final android.content.Context applicationContext;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isCollecting;

    public AndroidAppSetIdDataSource(android.content.Context applicationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this._appSetIdFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
    }

    public final java.lang.String getAppSetId() {
        return this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        java.lang.Boolean value;
        java.lang.Boolean bool;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.isCollecting;
        do {
            value = mutableStateFlow.getValue();
            bool = value;
            bool.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, true));
        if (bool.booleanValue()) {
            return;
        }
        try {
            com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> appSetIdInfo = com.google.android.gms.appset.AppSet.getClient(this.applicationContext).getAppSetIdInfo();
            final kotlin.jvm.functions.Function1<com.google.android.gms.appset.AppSetIdInfo, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<com.google.android.gms.appset.AppSetIdInfo, kotlin.Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource$invoke$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.google.android.gms.appset.AppSetIdInfo appSetIdInfo2) {
                    invoke2(appSetIdInfo2);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.google.android.gms.appset.AppSetIdInfo appSetIdInfo2) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
                    java.lang.String id = appSetIdInfo2.getId();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "it.id");
                    mutableStateFlow2 = com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.this._appSetIdFlow;
                    mutableStateFlow2.setValue(id);
                }
            };
            appSetIdInfo.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.invoke$lambda$1(kotlin.jvm.functions.Function1.this, obj);
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(kotlin.jvm.functions.Function1 tmp0, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
