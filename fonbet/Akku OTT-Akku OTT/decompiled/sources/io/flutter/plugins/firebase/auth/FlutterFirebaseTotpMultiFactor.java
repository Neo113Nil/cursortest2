package io.flutter.plugins.firebase.auth;

import androidx.annotation.NonNull;
import androidx.credentials.playservices.s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import com.google.firebase.auth.TotpSecret;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class FlutterFirebaseTotpMultiFactor implements GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Map<String, TotpSecret> multiFactorSecret = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$generateSecret$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (!task.isSuccessful()) {
            androidx.collection.h.d(result, task);
            return;
        }
        TotpSecret totpSecret = (TotpSecret) task.getResult();
        multiFactorSecret.put(totpSecret.getSharedSecretKey(), totpSecret);
        result.success(new GeneratedAndroidFirebaseAuth.PigeonTotpSecret.Builder().setCodeIntervalSeconds(Long.valueOf(totpSecret.getCodeIntervalSeconds())).setCodeLength(Long.valueOf(totpSecret.getCodeLength())).setSecretKey(totpSecret.getSharedSecretKey()).setHashingAlgorithm(totpSecret.getHashAlgorithm()).setEnrollmentCompletionDeadline(Long.valueOf(totpSecret.getEnrollmentCompletionDeadline())).build());
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void generateSecret(@NonNull String str, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonTotpSecret> result) {
        TotpMultiFactorGenerator.generateSecret(FlutterFirebaseMultiFactor.multiFactorSessionMap.get(str)).addOnCompleteListener(new s(result, 7));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void getAssertionForEnrollment(@NonNull String str, @NonNull String str2, @NonNull GeneratedAndroidFirebaseAuth.Result<String> result) {
        TotpMultiFactorAssertion assertionForEnrollment = TotpMultiFactorGenerator.getAssertionForEnrollment(multiFactorSecret.get(str), str2);
        String uuid = UUID.randomUUID().toString();
        FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(uuid, assertionForEnrollment);
        result.success(uuid);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void getAssertionForSignIn(@NonNull String str, @NonNull String str2, @NonNull GeneratedAndroidFirebaseAuth.Result<String> result) {
        TotpMultiFactorAssertion assertionForSignIn = TotpMultiFactorGenerator.getAssertionForSignIn(str, str2);
        String uuid = UUID.randomUUID().toString();
        FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(uuid, assertionForSignIn);
        result.success(uuid);
    }
}
