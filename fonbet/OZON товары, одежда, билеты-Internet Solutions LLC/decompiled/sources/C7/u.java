package C7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
final class u {

    /* renamed from: e, reason: collision with root package name */
    private static final D7.n f4457e = new D7.n("AppUpdateService");

    /* renamed from: f, reason: collision with root package name */
    private static final Intent f4458f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    D7.x f4459a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4460b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4461c;

    /* renamed from: d, reason: collision with root package name */
    private final w f4462d;

    u(Context context, w wVar) {
        this.f4460b = context.getPackageName();
        this.f4461c = context;
        this.f4462d = wVar;
        if (D7.a.a(context)) {
            Context applicationContext = context.getApplicationContext();
            this.f4459a = new D7.x(applicationContext != null ? applicationContext : context, f4457e, f4458f);
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(u uVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(h());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(uVar.f4461c.getPackageManager().getPackageInfo(uVar.f4461c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f4457e.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    static C2731a e(u uVar, Bundle bundle) {
        bundle.getInt("version.code", -1);
        int i11 = bundle.getInt("update.availability");
        bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        long j11 = bundle.getLong("additional.size.required");
        long a11 = uVar.f4462d.a();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap hashMap = new HashMap();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet = new HashSet();
        if (integerArrayList != null) {
            hashSet.addAll(integerArrayList);
        }
        hashMap.put("blocking.destructive.intent", hashSet);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet2 = new HashSet();
        if (integerArrayList2 != null) {
            hashSet2.addAll(integerArrayList2);
        }
        hashMap.put("nonblocking.destructive.intent", hashSet2);
        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet3 = new HashSet();
        if (integerArrayList3 != null) {
            hashSet3.addAll(integerArrayList3);
        }
        hashMap.put("blocking.intent", hashSet3);
        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet4 = new HashSet();
        if (integerArrayList4 != null) {
            hashSet4.addAll(integerArrayList4);
        }
        hashMap.put("nonblocking.intent", hashSet4);
        return C2731a.e(i11, j11, a11, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle h() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map a11 = D7.k.a();
        bundle2.putInt("playcore_version_code", ((Integer) a11.get("java")).intValue());
        if (a11.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) a11.get("native")).intValue());
        }
        if (a11.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) a11.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    public final Task c(String str) {
        D7.x xVar = this.f4459a;
        D7.n nVar = f4457e;
        if (xVar == null) {
            nVar.b("onError(%d)", -9);
            return Tasks.forException(new E7.a(-9));
        }
        nVar.d("completeUpdate(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        xVar.s(new q(this, taskCompletionSource, taskCompletionSource, str), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str) {
        D7.x xVar = this.f4459a;
        D7.n nVar = f4457e;
        if (xVar == null) {
            nVar.b("onError(%d)", -9);
            return Tasks.forException(new E7.a(-9));
        }
        nVar.d("requestUpdateInfo(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        xVar.s(new p(this, taskCompletionSource, taskCompletionSource, str), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
