package com.flurry.android.marketing;

import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import p155w1.AbstractC0997i0;

/* JADX INFO: loaded from: classes.dex */
public class FlurryMarketingUtils {

    public static class FirebaseTokenAgent implements OnCompleteListener<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TokenListener f10469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10470b;

        public interface TokenListener {
            void onComplete(String str);
        }

        public String getToken() {
            return this.f10470b;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(Task<String> task) {
            this.f10470b = task.isSuccessful() ? task.getResult() : null;
            AbstractC0997i0.o(4, "Firebase token received: " + this.f10470b);
            if (this.f10469a == null || TextUtils.isEmpty(this.f10470b)) {
                return;
            }
            this.f10469a.onComplete(this.f10470b);
        }

        public void start(TokenListener tokenListener) {
            this.f10469a = tokenListener;
            try {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(this);
            } catch (Throwable th) {
                AbstractC0997i0.t("New FirebaseMessaging.getToken() is not available, try old FirebaseInstanceId.getToken() next: ".concat(String.valueOf(th)));
                try {
                    String token = FirebaseInstanceId.getInstance().getToken();
                    this.f10470b = token;
                    tokenListener.onComplete(token);
                } catch (Throwable th2) {
                    AbstractC0997i0.t("Failed to get Firebase token: ".concat(String.valueOf(th2)));
                }
            }
        }
    }
}
