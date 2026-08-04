package p105o3;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private final String zza;
    private Object zzb;

    public d(String str) {
        this.zza = str;
    }

    public abstract Object getRemoteCreator(IBinder iBinder);

    public final Object getRemoteCreatorInstance(Context context) throws c {
        if (this.zzb == null) {
            D.i(context);
            Context remoteContext = g.getRemoteContext(context);
            if (remoteContext == null) {
                throw new c("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e7) {
                throw new c("Could not load creator class.", e7);
            } catch (IllegalAccessException e8) {
                throw new c("Could not access creator.", e8);
            } catch (InstantiationException e9) {
                throw new c("Could not instantiate creator.", e9);
            }
        }
        return this.zzb;
    }
}
