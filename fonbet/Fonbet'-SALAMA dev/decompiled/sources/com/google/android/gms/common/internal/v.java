package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class v implements DialogInterface.OnClickListener {
    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            a();
        } catch (ActivityNotFoundException e7) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e7);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
