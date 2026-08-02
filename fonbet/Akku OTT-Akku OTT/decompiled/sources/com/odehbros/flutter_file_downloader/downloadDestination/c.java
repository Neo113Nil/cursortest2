package com.odehbros.flutter_file_downloader.downloadDestination;

import android.os.Environment;
import java.io.File;

/* loaded from: classes4.dex */
public final class c extends b {
    @Override // com.odehbros.flutter_file_downloader.downloadDestination.b
    public final File a() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }
}
