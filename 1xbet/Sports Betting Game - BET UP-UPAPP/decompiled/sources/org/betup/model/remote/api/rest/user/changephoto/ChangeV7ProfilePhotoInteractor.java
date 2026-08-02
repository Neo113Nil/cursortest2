package org.betup.model.remote.api.rest.user.changephoto;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.api.rest.user.changephoto.model.ChangePhotoModel;
import org.betup.ui.fragment.settings.PhotoProcessor;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class ChangeV7ProfilePhotoInteractor extends BaseNewVersionBettingInteractor<ChangePhotoModel, String> {
    private static final long LIFETIME = 0;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(String id) {
    }

    @Inject
    public ChangeV7ProfilePhotoInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<ChangePhotoModel> makeCall(NewVersionBettingApi bettingApi, String photo, Bundle parameters, String token) {
        Log.d("PHOTOTEST", "V7 PHOTO PATH IS " + photo);
        return bettingApi.uploadV7Photo(token, PhotoProcessor.encodeBitmapFile(getContext(), photo, "image"));
    }
}
