package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: com.google.android.gms.cloudmessaging.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0823e implements Continuation {
    public static final /* synthetic */ C0823e a = new C0823e();

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.getException()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
