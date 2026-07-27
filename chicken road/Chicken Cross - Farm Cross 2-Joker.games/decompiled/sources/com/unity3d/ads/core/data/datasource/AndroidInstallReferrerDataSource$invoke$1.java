package com.unity3d.ads.core.data.datasource;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidInstallReferrerDataSource.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource", f = "AndroidInstallReferrerDataSource.kt", i = {}, l = {35}, m = "invoke", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidInstallReferrerDataSource$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidInstallReferrerDataSource$invoke$1(AndroidInstallReferrerDataSource androidInstallReferrerDataSource, Continuation<? super AndroidInstallReferrerDataSource$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidInstallReferrerDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
