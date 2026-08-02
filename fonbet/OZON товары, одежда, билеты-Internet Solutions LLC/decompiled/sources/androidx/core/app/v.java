package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class v implements Iterable<Intent> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Intent> f42041a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final Context f42042b;

    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private v(Context context) {
        this.f42042b = context;
    }

    @NonNull
    public static v e(@NonNull Context context) {
        return new v(context);
    }

    @NonNull
    public final void a(@NonNull Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f42042b.getPackageManager());
        }
        if (component != null) {
            b(component);
        }
        this.f42041a.add(intent);
    }

    @NonNull
    public final void b(@NonNull ComponentName componentName) {
        Context context = this.f42042b;
        ArrayList<Intent> arrayList = this.f42041a;
        int size = arrayList.size();
        try {
            for (Intent a11 = j.a(context, componentName); a11 != null; a11 = j.a(context, a11.getComponent())) {
                arrayList.add(size, a11);
            }
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e11);
        }
    }

    @NonNull
    public final void c(@NonNull androidx.appcompat.app.g gVar) {
        Intent supportParentActivityIntent = gVar.getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = j.b(gVar);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f42042b.getPackageManager());
            }
            b(component);
            this.f42041a.add(supportParentActivityIntent);
        }
    }

    public final Intent f(int i11) {
        return this.f42041a.get(i11);
    }

    public final int g() {
        return this.f42041a.size();
    }

    public final void h() {
        ArrayList<Intent> arrayList = this.f42041a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f42042b;
        if (androidx.core.content.a.startActivities(context, intentArr, null)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f42041a.iterator();
    }
}
