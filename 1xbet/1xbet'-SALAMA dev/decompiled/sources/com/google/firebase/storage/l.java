package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12043a;

    public l(TaskCompletionSource taskCompletionSource) {
        this.f12043a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        TaskCompletionSource taskCompletionSource = this.f12043a;
        if (taskCompletionSource.getTask().isComplete()) {
            return;
        }
        Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
        taskCompletionSource.setException(i.a(Status.f11079x));
    }
}
