package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0835l {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback b(Class cls, String str);

    Activity c();

    void startActivityForResult(Intent intent, int i7);
}
