package org.betup.model.remote.api.rest.base;

import retrofit2.Call;

/* loaded from: classes2.dex */
public interface CallBuildListener<T> {
    void onCallBuilt(Call<T> call);
}
