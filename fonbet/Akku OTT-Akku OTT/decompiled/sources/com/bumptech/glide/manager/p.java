package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.manager.n;

/* loaded from: classes3.dex */
public final class p implements Handler.Callback {
    public static final a e = new a();
    public volatile com.bumptech.glide.m a;
    public final b b;
    public final i c;
    public final n d;

    public class a implements b {
    }

    public interface b {
    }

    public p() {
        new ArrayMap();
        a aVar = e;
        this.b = aVar;
        this.d = new n(aVar);
        this.c = (com.bumptech.glide.load.resource.bitmap.p.f && com.bumptech.glide.load.resource.bitmap.p.e) ? new h() : new f();
    }

    @Nullable
    public static Activity a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @NonNull
    public final com.bumptech.glide.m b(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = com.bumptech.glide.util.m.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(fragmentActivity.getApplicationContext());
                }
                if (fragmentActivity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.c.a(fragmentActivity);
                Activity a2 = a(fragmentActivity);
                boolean z = a2 == null || !a2.isFinishing();
                com.bumptech.glide.b a3 = com.bumptech.glide.b.a(fragmentActivity.getApplicationContext());
                n nVar = this.d;
                Lifecycle lifecycle = fragmentActivity.getLifecycle();
                fragmentActivity.getSupportFragmentManager();
                nVar.getClass();
                com.bumptech.glide.util.m.a();
                com.bumptech.glide.util.m.a();
                com.bumptech.glide.m mVar = (com.bumptech.glide.m) nVar.a.get(lifecycle);
                if (mVar != null) {
                    return mVar;
                }
                k kVar = new k(lifecycle);
                b bVar = nVar.b;
                n.a aVar = new n.a();
                ((a) bVar).getClass();
                com.bumptech.glide.m mVar2 = new com.bumptech.glide.m(a3, kVar, aVar, fragmentActivity);
                nVar.a.put(lifecycle, mVar2);
                kVar.b(new m(nVar, lifecycle));
                if (z) {
                    mVar2.onStart();
                }
                return mVar2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        com.bumptech.glide.b a4 = com.bumptech.glide.b.a(context.getApplicationContext());
                        b bVar2 = this.b;
                        com.bumptech.glide.manager.a aVar2 = new com.bumptech.glide.manager.a();
                        com.amplitude.android.storage.a aVar3 = new com.amplitude.android.storage.a();
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar2).getClass();
                        this.a = new com.bumptech.glide.m(a4, aVar2, aVar3, applicationContext);
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
