package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes8.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f41915a = (IconCompat) aVar.t(remoteActionCompat.f41915a);
        remoteActionCompat.f41916b = aVar.k(2, remoteActionCompat.f41916b);
        remoteActionCompat.f41917c = aVar.k(3, remoteActionCompat.f41917c);
        remoteActionCompat.f41918d = (PendingIntent) aVar.p(remoteActionCompat.f41918d, 4);
        remoteActionCompat.f41919e = aVar.g(5, remoteActionCompat.f41919e);
        remoteActionCompat.f41920f = aVar.g(6, remoteActionCompat.f41920f);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.getClass();
        aVar.H(remoteActionCompat.f41915a);
        aVar.z(2, remoteActionCompat.f41916b);
        aVar.z(3, remoteActionCompat.f41917c);
        aVar.E(remoteActionCompat.f41918d, 4);
        aVar.v(5, remoteActionCompat.f41919e);
        aVar.v(6, remoteActionCompat.f41920f);
    }
}
