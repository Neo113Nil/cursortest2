package G7;

import M7.w;
import M7.y;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final M7.m f9753a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9754b;

    /* renamed from: c, reason: collision with root package name */
    final w f9755c;

    r(Context context, M7.m mVar) {
        this.f9754b = context.getPackageName();
        this.f9753a = mVar;
        if (y.a(context)) {
            this.f9755c = new w(context, mVar, s.f9756a);
        } else {
            mVar.b(new Object[0]);
            this.f9755c = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(r rVar, byte[] bArr, Long l11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", rVar.f9754b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l11 != null) {
            bundle.putLong("cloud.prj", l11.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(M7.g.b(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            M7.g gVar = (M7.g) it.next();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", gVar.a());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }

    public final Task b(d dVar) {
        w wVar = this.f9755c;
        if (wVar == null) {
            return Tasks.forException(new c(-2, null));
        }
        try {
            byte[] decode = Base64.decode(dVar.c(), 10);
            Long b11 = dVar.b();
            this.f9753a.d("requestIntegrityToken(%s)", dVar);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            wVar.p(new p(this, taskCompletionSource, decode, b11, taskCompletionSource, dVar), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e11) {
            return Tasks.forException(new c(-13, e11));
        }
    }
}
