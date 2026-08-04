package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.t;
import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f7997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f7998b;

    public a(c cVar) {
        this.f7997a = new WeakReference(cVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f7998b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f7997a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        t.Z(data);
        c cVar = (c) weakReference2.get();
        Messenger messenger = (Messenger) this.f7998b.get();
        try {
            int i7 = message.what;
            if (i7 == 1) {
                t.Z(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                cVar.getClass();
                return;
            }
            if (i7 == 2) {
                cVar.getClass();
                return;
            }
            if (i7 != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            t.Z(data.getBundle("data_options"));
            t.Z(data.getBundle("data_notify_children_changed_options"));
            String string = data.getString("data_media_item_id");
            data.getParcelableArrayList("data_media_item_list");
            if (cVar.f8006g != messenger) {
                return;
            }
            if (cVar.f8004e.getOrDefault(string, null) != null) {
                throw new ClassCastException();
            }
            if (e.f8008b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                cVar.getClass();
            }
        }
    }
}
