package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidFIdExistenceDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidFIdExistenceDataSource;", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "className", "", "(Ljava/lang/String;)V", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidFIdExistenceDataSource implements com.unity3d.ads.core.data.datasource.FIdExistenceDataSource {
    private final java.lang.String className;

    public AndroidFIdExistenceDataSource(java.lang.String className) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
        this.className = className;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource androidFIdExistenceDataSource = this;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Class.forName(this.className));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return kotlin.Result.m10805isSuccessimpl(m10798constructorimpl);
    }
}
