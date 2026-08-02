package com.dogearn.dogemoney;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/* loaded from: classes.dex */
public class MymessageingInstance extends FirebaseInstanceIdService {
    private static final String REG_TOKEN = "REG_TOKEN";

    @Override // com.google.firebase.iid.FirebaseInstanceIdService
    public void onTokenRefresh() {
        Log.d(REG_TOKEN, FirebaseInstanceId.getInstance().getToken());
    }
}
