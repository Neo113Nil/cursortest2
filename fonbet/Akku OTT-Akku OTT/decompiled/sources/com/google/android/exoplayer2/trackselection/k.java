package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Bundleable.Creator, Continuation {
    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        return TrackSelectionParameters.fromBundle(bundle);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Integer lambda$bindToMessagingService$3;
        lambda$bindToMessagingService$3 = FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
        return lambda$bindToMessagingService$3;
    }
}
