package org.betup.services.push;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.BetUpApp;
import org.betup.model.remote.api.rest.user.V7UpdatePushTokenAndLangInteractor;
import org.betup.services.user.UserService;
import org.betup.utils.SupportedLanguagesManager;

@Singleton
/* loaded from: classes2.dex */
public class PushTokenService {
    private static final String PUSH_SERVICE_API_VERSION = "v2";
    private boolean synced;
    private final UserService userService;
    private final V7UpdatePushTokenAndLangInteractor v7UpdatePushTokenAndLangInteractor;

    @Inject
    public PushTokenService(V7UpdatePushTokenAndLangInteractor v7UpdatePushTokenAndLangInteractor, UserService userService) {
        this.v7UpdatePushTokenAndLangInteractor = v7UpdatePushTokenAndLangInteractor;
        this.userService = userService;
    }

    public void sync() {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.services.push.PushTokenService$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                PushTokenService.this.m12810lambda$sync$0$orgbetupservicespushPushTokenService(task);
            }
        });
    }

    /* renamed from: lambda$sync$0$org-betup-services-push-PushTokenService, reason: not valid java name */
    /* synthetic */ void m12810lambda$sync$0$orgbetupservicespushPushTokenService(Task task) {
        if (task.isSuccessful()) {
            String formatToken = formatToken((String) task.getResult());
            Log.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "FETCHED FROM FIREBASE " + formatToken);
            Log.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "SENDING token + lang sync");
            Bundle bundle = new Bundle();
            bundle.putString("lang", SupportedLanguagesManager.getSupportedLanguage(BetUpApp.getContext(), SupportedLanguagesManager.LangTypeGroup.BIG_9));
            this.v7UpdatePushTokenAndLangInteractor.load(null, formatToken, bundle);
        }
    }

    private String formatToken(String token) {
        if (token != null) {
            return String.format("%s:%s", "v2", token);
        }
        return null;
    }
}
