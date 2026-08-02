package f4;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;

/* renamed from: f4.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1087D implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrityManager f12914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1091c f12915c;

    public C1087D(C1091c c1091c, String str, IntegrityManager integrityManager) {
        this.f12913a = str;
        this.f12914b = integrityManager;
        this.f12915c = c1091c;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            this.f12915c.f12933b = ((zzagh) task.getResult()).zza();
            return this.f12914b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzagh) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f12913a.getBytes("UTF-8")), 11))).build());
        }
        Log.e("c", "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
