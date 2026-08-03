package com.unity3d.scar.adapter.common.signals;

/* loaded from: classes5.dex */
public interface ISignalCallbackListener<T> {
    void onFailure(java.lang.String str);

    void onSuccess(java.lang.String str, java.lang.String str2, T t);
}
