package com.unity3d.services.core.di;

import kotlin.Metadata;

/* compiled from: IServiceProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/core/di/IServiceProvider;", "", "initialize", "Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface IServiceProvider {
    IServicesRegistry getRegistry();

    IServicesRegistry initialize();
}
