package com.facetec.sdk;

/* loaded from: classes8.dex */
final class ba {
    ba() {
    }

    static void c(final android.content.Context context) {
        com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ba$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ba.a(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(android.content.Context context) {
        com.facetec.sdk.bc.a("BT");
        com.facetec.sdk.bc.c("BT");
        com.facetec.sdk.bc.a("RWT");
        try {
            java.io.FileOutputStream openFileOutput = context.openFileOutput("tmp_rw", 0);
            openFileOutput.write("abcdefghijklmnopqrstuvwxyz1234567890".getBytes());
            openFileOutput.flush();
            openFileOutput.close();
        } catch (java.lang.Exception unused) {
        }
        try {
            java.io.FileInputStream openFileInput = context.openFileInput("tmp_rw");
            while (openFileInput.read() != -1) {
            }
            openFileInput.close();
        } catch (java.lang.Exception unused2) {
        }
        com.facetec.sdk.bc.c("RWT");
    }
}
