package com.digitalturbine.ignite.authenticator.decorator;

/* loaded from: classes2.dex */
public final class h extends com.digitalturbine.ignite.authenticator.decorator.f {
    public com.digitalturbine.ignite.authenticator.c c;
    public com.digitalturbine.ignite.authenticator.IgniteManager d;
    public final com.digitalturbine.ignite.encryption.storage.a e;
    public final com.digitalturbine.ignite.authenticator.parsers.b f;
    public com.digitalturbine.ignite.authenticator.b g;
    public com.digitalturbine.ignite.authenticator.handlers.a h;
    public final boolean i;
    public final boolean j;
    public final java.util.concurrent.atomic.AtomicBoolean k;

    public h(com.digitalturbine.ignite.authenticator.decorator.a aVar, boolean z, boolean z2, com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener authenticationServiceListener, com.digitalturbine.ignite.authenticator.IgniteManager igniteManager) {
        super(aVar, authenticationServiceListener);
        this.i = false;
        this.j = false;
        this.k = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.d = igniteManager;
        this.i = z;
        this.f = new com.digitalturbine.ignite.authenticator.parsers.b();
        this.e = new com.digitalturbine.ignite.encryption.storage.a(aVar.g());
        this.j = z2;
        if (z2) {
            this.c = new com.digitalturbine.ignite.authenticator.c(aVar.g(), this, this);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.f, com.digitalturbine.ignite.authenticator.decorator.a
    public final void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener authenticationServiceListener;
        boolean j = this.f3506a.j();
        if (!j && (authenticationServiceListener = this.b) != null) {
            authenticationServiceListener.onOdtUnsupported();
        }
        if (this.c != null && this.f3506a.j() && this.j) {
            this.c.a();
        }
        if (j || this.i) {
            super.a(componentName, iBinder);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.f, com.digitalturbine.ignite.authenticator.decorator.a
    public final void b() {
        if (this.g == null) {
            java.lang.Object[] objArr = {"OneDTAuthenticator"};
            com.digitalturbine.ignite.authenticator.logger.ILogger iLogger = com.digitalturbine.ignite.authenticator.logger.a.b.f3510a;
            if (iLogger != null) {
                iLogger.i("%s : initializing new Ignite authentication session", objArr);
            }
            com.digitalturbine.ignite.encryption.storage.a aVar = this.e;
            aVar.getClass();
            try {
                aVar.b.a();
            } catch (java.io.IOException e) {
                e = e;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (java.security.InvalidAlgorithmParameterException e2) {
                e = e2;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (java.security.InvalidKeyException e3) {
                e = e3;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (java.security.KeyStoreException e4) {
                e = e4;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (java.security.NoSuchAlgorithmException e5) {
                e = e5;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (java.security.NoSuchProviderException e6) {
                e = e6;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (java.security.UnrecoverableEntryException e7) {
                e = e7;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (java.security.cert.CertificateException e8) {
                e = e8;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (javax.crypto.NoSuchPaddingException e9) {
                e = e9;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (java.lang.Exception e10) {
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e10, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            }
            java.lang.String a2 = this.e.a();
            this.f.getClass();
            com.digitalturbine.ignite.authenticator.b a3 = com.digitalturbine.ignite.authenticator.parsers.b.a(a2);
            this.g = a3;
            if (a3.b > java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis())) {
                com.digitalturbine.ignite.authenticator.logger.a.a("%s : One DT resolved from cache", "OneDTAuthenticator");
                com.digitalturbine.ignite.authenticator.b bVar = this.g;
                com.digitalturbine.ignite.authenticator.IgniteManager igniteManager = this.d;
                if (igniteManager != null) {
                    com.digitalturbine.ignite.authenticator.logger.a.a("%s : setting one dt entity", "IgniteManager");
                    igniteManager.b = bVar;
                }
            } else {
                this.k.set(true);
            }
        }
        if (this.j && this.c == null) {
            com.digitalturbine.ignite.authenticator.logger.a.b("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (!this.i && !this.k.get()) {
            if (this.j) {
                this.c.a();
            }
        } else {
            java.lang.Object[] objArr2 = {"OneDTAuthenticator"};
            com.digitalturbine.ignite.authenticator.logger.ILogger iLogger2 = com.digitalturbine.ignite.authenticator.logger.a.b.f3510a;
            if (iLogger2 != null) {
                iLogger2.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.f3506a.b();
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.f, com.digitalturbine.ignite.authenticator.decorator.a
    public final void c(java.lang.String str) {
        super.c(str);
        if (this.f3506a.h() && this.k.get() && this.f3506a.j()) {
            this.k.set(false);
            m();
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.f, com.digitalturbine.ignite.authenticator.decorator.a
    public final java.lang.String d() {
        com.digitalturbine.ignite.authenticator.decorator.a aVar = this.f3506a;
        if (aVar instanceof com.digitalturbine.ignite.authenticator.decorator.f) {
            return aVar.d();
        }
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.f, com.digitalturbine.ignite.authenticator.decorator.a
    public final void destroy() {
        this.d = null;
        com.digitalturbine.ignite.authenticator.c cVar = this.c;
        if (cVar != null) {
            com.digitalturbine.ignite.authenticator.receiver.a aVar = cVar.f3499a;
            if (aVar != null && aVar.b) {
                cVar.b.unregisterReceiver(aVar);
                cVar.f3499a.b = false;
            }
            com.digitalturbine.ignite.authenticator.receiver.a aVar2 = cVar.f3499a;
            if (aVar2 != null) {
                aVar2.f3511a = null;
                cVar.f3499a = null;
            }
            cVar.c = null;
            cVar.b = null;
            cVar.d = null;
            this.c = null;
        }
        com.digitalturbine.ignite.authenticator.handlers.a aVar3 = this.h;
        if (aVar3 != null) {
            com.digitalturbine.ignite.authenticator.callbacks.b bVar = aVar3.b;
            if (bVar != null) {
                bVar.f3501a.clear();
                aVar3.b = null;
            }
            aVar3.c = null;
            aVar3.f3509a = null;
            this.h = null;
        }
        this.b = null;
        this.f3506a.destroy();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.f, com.digitalturbine.ignite.authenticator.decorator.a
    public final java.lang.String i() {
        com.digitalturbine.ignite.authenticator.decorator.a aVar = this.f3506a;
        if (aVar instanceof com.digitalturbine.ignite.authenticator.decorator.f) {
            return aVar.i();
        }
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.f, com.digitalturbine.ignite.authenticator.decorator.a
    public final boolean j() {
        return this.f3506a.j();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.f, com.digitalturbine.ignite.authenticator.decorator.a
    public final void l() {
        b();
    }

    public final void m() {
        com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI k = this.f3506a.k();
        if (k == null) {
            com.digitalturbine.ignite.authenticator.logger.a.b("%s : service is unavailable", "OneDTAuthenticator");
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_UNAVAILABLE.a());
            return;
        }
        if (this.h == null) {
            this.h = new com.digitalturbine.ignite.authenticator.handlers.a(k, this);
        }
        if (android.text.TextUtils.isEmpty(this.f3506a.e())) {
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_INVALID_SESSION.a());
            com.digitalturbine.ignite.authenticator.logger.a.b("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        com.digitalturbine.ignite.authenticator.handlers.a aVar = this.h;
        java.lang.String e = this.f3506a.e();
        aVar.getClass();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("clientToken", e);
            aVar.c.getProperty("onedtid", bundle, new android.os.Bundle(), aVar.b);
        } catch (android.os.RemoteException e2) {
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, e2);
            com.digitalturbine.ignite.authenticator.logger.a.b("%s : request failed : %s", "OneDTPropertyHandler", e2.toString());
        }
    }
}
