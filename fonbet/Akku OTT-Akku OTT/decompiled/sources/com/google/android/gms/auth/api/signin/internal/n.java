package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class n {

    @Nullable
    public static n b;

    @VisibleForTesting
    public final b a;

    public n(Context context) {
        String d;
        b a = b.a(context);
        this.a = a;
        a.b();
        String d2 = a.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d2) || (d = a.d(b.f("googleSignInOptions", d2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.l(d);
        } catch (JSONException unused) {
        }
    }

    public static synchronized n a(@NonNull Context context) {
        n nVar;
        synchronized (n.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (n.class) {
                nVar = b;
                if (nVar == null) {
                    nVar = new n(applicationContext);
                    b = nVar;
                }
            }
            return nVar;
        }
        return nVar;
    }

    public final synchronized void b() {
        b bVar = this.a;
        ReentrantLock reentrantLock = bVar.a;
        reentrantLock.lock();
        try {
            bVar.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
