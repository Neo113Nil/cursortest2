package io.github.sabpaisaandroid.network;

import io.github.sabpaisaandroid.models.SabPaisaFraudModel;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/github/sabpaisaandroid/network/SabPaisaFraudEndPoints;", "", "Lio/github/sabpaisaandroid/models/SabPaisaFraudModel;", "sabPaisaFraudModel", "Lretrofit2/Call;", "addRecord", "(Lio/github/sabpaisaandroid/models/SabPaisaFraudModel;)Lretrofit2/Call;", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: io.github.sabpaisaandroid.network.g, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public interface SabPaisaFraudEndPoints {
    @Headers({"Cache-control: no-cache"})
    @POST("/admin/addRecord")
    Call<SabPaisaFraudModel> a(@Body SabPaisaFraudModel sabPaisaFraudModel);
}
