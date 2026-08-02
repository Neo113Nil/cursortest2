package com.google.firebase.iid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzr implements Continuation<Bundle, String> {
    private final /* synthetic */ zzo zzbj;

    zzr(zzo zzoVar) {
        this.zzbj = zzoVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ String then(@NonNull Task<Bundle> task) throws Exception {
        String zza;
        Bundle result = task.getResult(IOException.class);
        zzo zzoVar = this.zzbj;
        zza = zzo.zza(result);
        return zza;
    }
}
