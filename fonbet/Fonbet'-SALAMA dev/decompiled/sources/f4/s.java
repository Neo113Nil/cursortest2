package f4;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final zzal f12963c = zzal.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: d, reason: collision with root package name */
    public static final s f12964d;

    /* renamed from: a, reason: collision with root package name */
    public Task f12965a;

    /* renamed from: b, reason: collision with root package name */
    public long f12966b;

    static {
        s sVar = new s();
        sVar.f12966b = 0L;
        f12964d = sVar;
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f11082a);
        edit.putString("statusMessage", status.f11083b);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }

    public static void b(Context context, FirebaseAuth firebaseAuth) {
        com.google.android.gms.common.internal.D.i(context);
        com.google.android.gms.common.internal.D.i(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Y3.i iVar = firebaseAuth.f11849a;
        iVar.b();
        edit.putString("firebaseAppName", iVar.f7664b);
        edit.commit();
    }

    public static void c(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        com.google.android.gms.common.internal.D.i(context);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Y3.i iVar = firebaseAuth.f11849a;
        iVar.b();
        edit.putString("firebaseAppName", iVar.f7664b);
        edit.putString("firebaseUserUid", ((zzad) firebaseUser).f11909b.f11939a);
        edit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzal zzalVar = f12963c;
        int size = zzalVar.size();
        int i7 = 0;
        while (i7 < size) {
            E e7 = zzalVar.get(i7);
            i7++;
            edit.remove((String) e7);
        }
        edit.commit();
    }
}
