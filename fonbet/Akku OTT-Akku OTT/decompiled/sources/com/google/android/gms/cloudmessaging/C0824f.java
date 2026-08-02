package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.cloudmessaging.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0824f implements Continuation {
    public static final /* synthetic */ C0824f a = new C0824f();

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new C0819a(intent);
        }
        return null;
    }
}
