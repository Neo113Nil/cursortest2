package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.AbstractComponentCallbacksC0701v;

/* JADX INFO: loaded from: classes.dex */
public final class t extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f11329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11331d;

    public /* synthetic */ t(Intent intent, Object obj, int i7, int i8) {
        this.f11328a = i8;
        this.f11329b = intent;
        this.f11331d = obj;
        this.f11330c = i7;
    }

    @Override // com.google.android.gms.common.internal.v
    public final void a() {
        switch (this.f11328a) {
            case 0:
                Intent intent = this.f11329b;
                if (intent != null) {
                    ((Activity) this.f11331d).startActivityForResult(intent, this.f11330c);
                }
                break;
            default:
                Intent intent2 = this.f11329b;
                if (intent2 != null) {
                    ((AbstractComponentCallbacksC0701v) this.f11331d).D(intent2, this.f11330c, null);
                }
                break;
        }
    }
}
