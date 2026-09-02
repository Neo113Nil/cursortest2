package G;

import android.app.Activity;
import android.content.Intent;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f173a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f174b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f175c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f176d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f177e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f178f;

    public d(Activity activity, androidx.lifecycle.f fVar) {
        new HashSet();
        this.f178f = new HashSet();
        this.f173a = activity;
        new HiddenLifecycleReference(fVar);
    }

    public final boolean a(int i2, int i3, Intent intent) {
        Iterator it = new HashSet(this.f175c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((S.a) it.next()).f377d;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((O.l) hashMap.remove(Integer.valueOf(i2))).d(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }
}
