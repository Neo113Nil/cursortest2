package p042f4;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrityManager f12920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0894c f12921c;

    public D(C0894c c0894c, String str, IntegrityManager integrityManager) {
        this.f12919a = str;
        this.f12920b = integrityManager;
        this.f12921c = c0894c;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            this.f12921c.f12939b = ((zzagh) task.getResult()).zza();
            return this.f12920b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzagh) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f12919a.getBytes("UTF-8")), 11))).build());
        }
        Log.e("c", "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
