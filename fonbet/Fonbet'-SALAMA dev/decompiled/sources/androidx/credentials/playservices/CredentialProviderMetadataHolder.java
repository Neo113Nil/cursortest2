package androidx.credentials.playservices;

import W.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import t6.h;

/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final a f9097a = new a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h.e(intent, "intent");
        return this.f9097a;
    }
}
