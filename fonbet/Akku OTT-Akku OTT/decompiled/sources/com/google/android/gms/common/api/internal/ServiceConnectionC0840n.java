package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0861c;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.InterfaceC0869k;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ServiceConnectionC0840n implements a.f, ServiceConnection {
    @Override // com.google.android.gms.common.api.a.f
    @WorkerThread
    public final void connect(@NonNull AbstractC0861c.InterfaceC0112c interfaceC0112c) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @WorkerThread
    public final void disconnect() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @WorkerThread
    public final void disconnect(@NonNull String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final C0854d[] getAvailableFeatures() {
        return new C0854d[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final String getEndpointPackageName() {
        C0875q.g(null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @Nullable
    public final String getLastDisconnectMessage() {
        return null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void getRemoteService(@Nullable InterfaceC0869k interfaceC0869k, @Nullable Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.a.f
    @WorkerThread
    public final boolean isConnected() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @WorkerThread
    public final boolean isConnecting() {
        Thread.currentThread();
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void onUserSignOut(@NonNull AbstractC0861c.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return false;
    }
}
