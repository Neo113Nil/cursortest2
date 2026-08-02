package com.google.android.gms.dynamic;

/* loaded from: classes8.dex */
final class zae implements android.view.View.OnClickListener {
    final /* synthetic */ android.content.Context zaa;
    final /* synthetic */ android.content.Intent zab;

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        try {
            this.zaa.startActivity(this.zab);
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }

    zae(android.content.Context context, android.content.Intent intent) {
        this.zaa = context;
        this.zab = intent;
    }
}
