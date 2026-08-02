package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public final class IlIlIlIIIl extends java.lang.Thread implements com.microblink.blinkid.secured.IllllIlIIl {
    public android.os.Looper IlIllIlIIl;
    public final java.lang.String llIIIlllll;
    public com.microblink.blinkid.secured.lIIIllllIl llIIlIlIIl;
    public final java.util.concurrent.atomic.AtomicBoolean IllIIIllII = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean IllIIIIllI = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.CountDownLatch lIlIIIIlIl = new java.util.concurrent.CountDownLatch(1);
    public final java.util.concurrent.CountDownLatch llIIlIIlll = new java.util.concurrent.CountDownLatch(1);

    public IlIlIlIIIl(java.lang.String str) {
        this.llIIIlllll = "";
        this.llIIIlllll = str;
        setName(str);
    }

    public final /* synthetic */ void IlIllIlIIl() {
        this.IlIllIlIIl.quitSafely();
    }

    public final void IllIIIllII() {
        if (this.IllIIIIllI.getAndSet(true)) {
            return;
        }
        this.llIIlIlIIl.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IlIlIlIIIl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.IlIlIlIIIl.this.IlIllIlIIl();
            }
        });
        this.llIIlIlIIl = null;
    }

    public final void llIIIlllll() {
        try {
            this.lIlIIIIlIl.await();
        } catch (java.lang.InterruptedException e) {
            com.microblink.blinkid.util.Log.e(this, e, "Interrupted while waiting for processing queue {} to start", this.llIIIlllll);
        }
    }

    public final /* synthetic */ void llIIlIlIIl(java.lang.Throwable th) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing queue ");
        sb.append(this.llIIIlllll);
        sb.append(" halted due to an error. ");
        sb.append(th.getMessage());
        throw new java.lang.RuntimeException(sb.toString(), th);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            android.os.Looper.prepare();
            com.microblink.blinkid.util.Log.v(this, "Booting processing queue {}", this.llIIIlllll);
            this.IlIllIlIIl = android.os.Looper.myLooper();
            this.llIIlIlIIl = new com.microblink.blinkid.secured.lIIIllllIl(this.IlIllIlIIl);
            this.lIlIIIIlIl.countDown();
            android.os.Looper.loop();
            this.IllIIIllII.set(true);
            this.llIIlIIlll.countDown();
            com.microblink.blinkid.util.Log.d(this, "Processing queue {} terminated gracefully", this.llIIIlllll);
        } catch (java.lang.Throwable th) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IlIlIlIIIl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.IlIlIlIIIl.this.llIIlIlIIl(th);
                }
            });
        }
    }

    @Override // com.microblink.blinkid.secured.IllllIlIIl
    public final void llIIlIlIIl(java.lang.Runnable runnable) {
        llIIIlllll();
        if (this.IllIIIIllI.get()) {
            com.microblink.blinkid.util.Log.w(this, "Processing queue {} is exiting, unable to post job to it", this.llIIIlllll);
        } else {
            this.llIIlIlIIl.post(runnable);
        }
    }

    @Override // com.microblink.blinkid.secured.IllllIlIIl
    public final android.os.Handler llIIlIlIIl() {
        llIIIlllll();
        return this.llIIlIlIIl;
    }
}
