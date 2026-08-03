package com.amazon.device.iap.internal.b;

/* compiled from: FailurePrompt.java */
/* loaded from: classes2.dex */
public class b extends com.amazon.android.framework.prompt.SimplePrompt {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3468a = "b";

    @com.amazon.android.framework.resource.Resource
    private com.amazon.android.framework.context.ContextManager b;
    private final com.amazon.android.framework.prompt.PromptContent c;

    protected long getExpirationDurationInSeconds() {
        return 31536000L;
    }

    public b(com.amazon.android.framework.prompt.PromptContent promptContent) {
        super(promptContent);
        this.c = promptContent;
    }

    protected void doAction() {
        com.amazon.device.iap.internal.util.e.a(f3468a, "doAction");
        if ("Amazon Appstore required".equalsIgnoreCase(this.c.getTitle()) || "Amazon Appstore Update Required".equalsIgnoreCase(this.c.getTitle())) {
            try {
                android.app.Activity visible = this.b.getVisible();
                if (visible == null) {
                    visible = this.b.getRoot();
                }
                visible.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl")));
            } catch (java.lang.Exception e) {
                com.amazon.device.iap.internal.util.e.b(f3468a, "Exception in PurchaseItemCommandTask.OnSuccess: " + e);
            }
        }
    }

    public java.lang.String toString() {
        return f3468a;
    }
}
