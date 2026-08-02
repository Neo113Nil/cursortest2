package com.odehbros.flutter_file_downloader.downloadDestination;

import android.app.Activity;
import io.flutter.util.PathUtils;
import java.io.File;

/* loaded from: classes4.dex */
public final class a extends b {
    public final Activity b;

    public a(Activity activity, String str) {
        super(str);
        this.b = activity;
    }

    @Override // com.odehbros.flutter_file_downloader.downloadDestination.b
    public final File a() {
        return new File(PathUtils.getFilesDir(this.b));
    }
}
