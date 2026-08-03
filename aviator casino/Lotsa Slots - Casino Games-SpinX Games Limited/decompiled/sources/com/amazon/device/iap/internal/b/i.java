package com.amazon.device.iap.internal.b;

/* compiled from: KiwiCommand.java */
/* loaded from: classes2.dex */
public abstract class i extends com.amazon.android.framework.task.command.AbstractCommandTask {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3483a = "i";
    private final com.amazon.device.iap.internal.b.e b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.util.Map<java.lang.String, java.lang.Object> f;
    private boolean h;
    private com.amazon.device.iap.internal.b.i i;
    private com.amazon.device.iap.internal.b.i j;
    private final com.amazon.android.licensing.LicenseFailurePromptContentMapper g = new com.amazon.android.licensing.LicenseFailurePromptContentMapper();
    private boolean k = false;

    protected abstract boolean a(com.amazon.venezia.command.SuccessResult successResult) throws java.lang.Exception;

    protected boolean isExecutionNeeded() {
        return true;
    }

    public i(com.amazon.device.iap.internal.b.e eVar, java.lang.String str, java.lang.String str2) {
        this.b = eVar;
        java.lang.String requestId = eVar.c().toString();
        this.c = requestId;
        this.d = str;
        this.e = str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f = hashMap;
        hashMap.put("requestId", requestId);
        hashMap.put("sdkVersion", com.amazon.device.iap.PurchasingService.SDK_VERSION);
        this.h = true;
        this.i = null;
        this.j = null;
    }

    public com.amazon.device.iap.internal.b.i a(boolean z) {
        this.k = z;
        return this;
    }

    public void a(com.amazon.device.iap.internal.b.i iVar) {
        this.i = iVar;
    }

    public void b(com.amazon.device.iap.internal.b.i iVar) {
        this.j = iVar;
    }

    protected void a(java.lang.String str, java.lang.Object obj) {
        this.f.put(str, obj);
    }

    protected com.amazon.device.iap.internal.b.e b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public java.lang.String c() {
        return this.c;
    }

    protected java.lang.String getCommandName() {
        return this.d;
    }

    protected java.lang.String getCommandVersion() {
        return this.e;
    }

    protected java.util.Map<java.lang.String, java.lang.Object> getCommandData() {
        return this.f;
    }

    protected void b(boolean z) {
        this.h = z;
    }

    private void a(com.amazon.android.framework.prompt.PromptContent promptContent) {
        if (promptContent == null) {
            return;
        }
        com.amazon.android.Kiwi.getPromptManager().present(new com.amazon.device.iap.internal.b.b(promptContent));
    }

    protected final void onSuccess(com.amazon.venezia.command.SuccessResult successResult) throws android.os.RemoteException {
        boolean z;
        com.amazon.device.iap.internal.b.i iVar;
        java.lang.String str = (java.lang.String) successResult.getData().get("errorMessage");
        com.amazon.device.iap.internal.util.e.a(f3483a, "onSuccess: result = " + successResult + ", errorMessage: " + str);
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            try {
                z = a(successResult);
            } catch (java.lang.Exception e) {
                com.amazon.device.iap.internal.util.e.b(f3483a, "Error calling onResult: " + e);
                z = false;
            }
            if (z && (iVar = this.i) != null) {
                iVar.a_();
                return;
            } else {
                if (this.k) {
                    return;
                }
                if (z) {
                    this.b.a();
                    return;
                } else {
                    this.b.b();
                    return;
                }
            }
        }
        if (this.k) {
            return;
        }
        this.b.b();
    }

    protected final void onFailure(com.amazon.venezia.command.FailureResult failureResult) throws android.os.RemoteException, com.amazon.android.framework.exception.KiwiException {
        java.lang.String str;
        com.amazon.device.iap.internal.b.i iVar;
        com.amazon.device.iap.internal.util.e.a(f3483a, "onFailure: result = " + failureResult);
        if (failureResult != null && (str = (java.lang.String) failureResult.getExtensionData().get("maxVersion")) != null && str.equalsIgnoreCase("1.0") && (iVar = this.j) != null) {
            iVar.a(this.k);
            this.j.a_();
            return;
        }
        if (this.h) {
            a(new com.amazon.android.framework.prompt.PromptContent(failureResult.getDisplayableName(), failureResult.getDisplayableMessage(), failureResult.getButtonLabel(), failureResult.show()));
        }
        if (this.k) {
            return;
        }
        this.b.b();
    }

    protected final void onException(com.amazon.android.framework.exception.KiwiException kiwiException) {
        com.amazon.device.iap.internal.b.i iVar;
        com.amazon.device.iap.internal.util.e.a(f3483a, "onException: exception = " + kiwiException.getMessage());
        if ("UNHANDLED_EXCEPTION".equals(kiwiException.getType()) && com.ironsource.M6.k0.equals(this.e) && (iVar = this.j) != null) {
            iVar.a(this.k);
            this.j.a_();
            return;
        }
        if (this.h) {
            a(this.g.map(kiwiException));
        }
        if (this.k) {
            return;
        }
        this.b.b();
    }

    public void a_() {
        com.amazon.android.Kiwi.addCommandToCommandTaskPipeline(this);
    }
}
