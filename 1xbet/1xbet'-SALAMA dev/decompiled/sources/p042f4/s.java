package p042f4;

import Y3.i;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzal f12969c = zzal.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f12970d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Task f12971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12972b;

    static {
        s sVar = new s();
        sVar.f12972b = 0L;
        f12970d = sVar;
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.f11082a);
        editorEdit.putString("statusMessage", status.f11083b);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    public static void b(Context context, FirebaseAuth firebaseAuth) {
        D.i(context);
        D.i(firebaseAuth);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        i iVar = firebaseAuth.f11849a;
        iVar.b();
        editorEdit.putString("firebaseAppName", iVar.f7664b);
        editorEdit.commit();
    }

    public static void c(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        D.i(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        i iVar = firebaseAuth.f11849a;
        iVar.b();
        editorEdit.putString("firebaseAppName", iVar.f7664b);
        editorEdit.putString("firebaseUserUid", ((zzad) firebaseUser).f11909b.f11939a);
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzal zzalVar = f12969c;
        int size = zzalVar.size();
        int i7 = 0;
        while (i7 < size) {
            E e7 = zzalVar.get(i7);
            i7++;
            editorEdit.remove((String) e7);
        }
        editorEdit.commit();
    }
}
