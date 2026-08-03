package com.amazon.device.iap.internal.b.b;

/* compiled from: PurchaseItemCommandBase.java */
/* loaded from: classes2.dex */
abstract class a extends com.amazon.device.iap.internal.b.i {
    private static final java.lang.String d = "a";

    /* renamed from: a, reason: collision with root package name */
    @com.amazon.android.framework.resource.Resource
    protected com.amazon.android.framework.task.TaskManager f3469a;

    @com.amazon.android.framework.resource.Resource
    protected com.amazon.android.framework.context.ContextManager b;
    protected final java.lang.String c;

    a(com.amazon.device.iap.internal.b.e eVar, java.lang.String str, java.lang.String str2) {
        super(eVar, "purchase_item", str);
        this.c = str2;
        a(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU, str2);
    }

    @Override // com.amazon.device.iap.internal.b.i
    protected boolean a(com.amazon.venezia.command.SuccessResult successResult) throws android.os.RemoteException, com.amazon.android.framework.exception.KiwiException {
        java.util.Map data = successResult.getData();
        java.lang.String str = d;
        com.amazon.device.iap.internal.util.e.a(str, "data: " + data);
        if (!data.containsKey("purchaseItemIntent")) {
            com.amazon.device.iap.internal.util.e.b(str, "did not find intent");
            return false;
        }
        com.amazon.device.iap.internal.util.e.a(str, "found intent");
        final android.content.Intent intent = (android.content.Intent) data.remove("purchaseItemIntent");
        this.f3469a.enqueueAtFront(com.amazon.android.framework.task.pipeline.TaskPipelineId.FOREGROUND, new com.amazon.android.framework.task.Task() { // from class: com.amazon.device.iap.internal.b.b.a.1
            public void execute() {
                try {
                    android.app.Activity visible = com.amazon.device.iap.internal.b.b.a.this.b.getVisible();
                    if (visible == null) {
                        visible = com.amazon.device.iap.internal.b.b.a.this.b.getRoot();
                    }
                    com.amazon.device.iap.internal.util.e.a(com.amazon.device.iap.internal.b.b.a.d, "About to fire intent with activity " + visible);
                    visible.startActivity(intent);
                } catch (java.lang.Exception e) {
                    com.amazon.device.iap.internal.util.MetricsHelper.submitExceptionMetrics(com.amazon.device.iap.internal.b.b.a.this.c(), com.amazon.device.iap.internal.b.b.a.d + ".onResult().execute()", e);
                    com.amazon.device.iap.internal.util.e.b(com.amazon.device.iap.internal.b.b.a.d, "Exception when attempting to fire intent: " + e);
                }
            }
        });
        return true;
    }
}
