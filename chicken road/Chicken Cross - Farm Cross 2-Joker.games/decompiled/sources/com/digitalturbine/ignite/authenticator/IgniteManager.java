package com.digitalturbine.ignite.authenticator;

import android.content.Context;
import com.digitalturbine.ignite.authenticator.decorator.e;
import com.digitalturbine.ignite.authenticator.decorator.f;
import com.digitalturbine.ignite.authenticator.decorator.h;
import com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener;
import com.digitalturbine.ignite.authenticator.logger.ILogger;

/* loaded from: classes4.dex */
public class IgniteManager implements com.digitalturbine.ignite.authenticator.listeners.api.a {

    /* renamed from: a, reason: collision with root package name */
    public f f5145a;
    public b b;

    public IgniteManager(ILogger iLogger, com.digitalturbine.ignite.authenticator.events.a aVar) {
        com.digitalturbine.ignite.authenticator.logger.a.b.f5159a = iLogger;
        com.digitalturbine.ignite.authenticator.events.b.b.f5157a = aVar;
    }

    public void authenticate() {
        com.digitalturbine.ignite.authenticator.utils.concurency.c.f5162a.execute(new a(this));
    }

    public void destroy() {
        this.b = null;
        this.f5145a.destroy();
    }

    public String getOdt() {
        b bVar = this.b;
        return bVar != null ? bVar.f5147a : "";
    }

    public boolean isAuthenticated() {
        return this.f5145a.h();
    }

    public boolean isConnected() {
        return this.f5145a.a();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestFailed(String str) {
        this.f5145a.onCredentialsRequestFailed(str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f5145a.onCredentialsRequestSuccess(str, str2);
    }

    public IgniteManager(Context context, ILogger iLogger, boolean z, AuthenticationServiceListener authenticationServiceListener) {
        this(iLogger, null);
        this.f5145a = new h(new e(context), false, z, authenticationServiceListener, this);
    }
}
