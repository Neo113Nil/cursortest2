package com.google.android.gms.internal.firebase_database;

import android.content.Context;
import android.os.Handler;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes.dex */
final class zzr extends zzkh {
    private final /* synthetic */ zzhz zzbl;
    private final /* synthetic */ zzq zzbm;

    zzr(zzq zzqVar, zzhz zzhzVar) {
        this.zzbm = zzqVar;
        this.zzbl = zzhzVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzkh
    public final void zza(Throwable th) {
        String sb;
        Context context;
        if (th instanceof OutOfMemoryError) {
            sb = "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        } else if (th instanceof DatabaseException) {
            sb = "";
        } else {
            String sdkVersion = FirebaseDatabase.getSdkVersion();
            StringBuilder sb2 = new StringBuilder(String.valueOf(sdkVersion).length() + 104);
            sb2.append("Uncaught exception in Firebase Database runloop (");
            sb2.append(sdkVersion);
            sb2.append("). Please report to firebase-database-client@google.com");
            sb = sb2.toString();
        }
        this.zzbl.zza(sb, th);
        context = this.zzbm.zzbj;
        new Handler(context.getMainLooper()).post(new zzs(this, sb, th));
        zzs().shutdownNow();
    }
}
